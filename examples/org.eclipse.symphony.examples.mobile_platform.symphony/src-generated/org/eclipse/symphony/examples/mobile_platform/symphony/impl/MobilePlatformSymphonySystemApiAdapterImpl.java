/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.mobile_platform.symphony.impl;

import javax.vecmath.Matrix4d;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractInitializationData;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Environment;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Type;
import ca.gc.asc_csa.symphony.tools.vehicle.SymphonyToolsVehicleFactory;
import ca.gc.asc_csa.symphony.tools.vehicle.VehiclePoseCorrector;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.math.GeometricUtils;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.core.impl.SymphonySystemApiAdapterImpl;
import org.eclipse.symphony.examples.mobile_platform.EMFEcoreExampleMobilePlatformFactory;
import org.eclipse.symphony.examples.mobile_platform.EMFEcoreExampleMobilePlatformPackage;
import org.eclipse.symphony.examples.mobile_platform.MobilePlatform;
import org.eclipse.symphony.examples.mobile_platform.Position;
import org.eclipse.symphony.examples.mobile_platform.symphony.MobilePlatformData;
import org.eclipse.symphony.examples.mobile_platform.symphony.MobilePlatformSymphonySystemApiAdapter;
import org.eclipse.symphony.examples.mobile_platform.symphony.SymphonyExampleMobilePlatformFactory;
import org.eclipse.symphony.examples.mobile_platform.symphony.SymphonyExampleMobilePlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mobile Platform Symphony System Api Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MobilePlatformSymphonySystemApiAdapterImpl extends SymphonySystemApiAdapterImpl
														implements MobilePlatformSymphonySystemApiAdapter
{
	/**
	 * This is the adapter used to receive notifications to the
	 * changes in the mobile platform's position.
	 */
	private Adapter positionAdapter = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobilePlatformSymphonySystemApiAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyExampleMobilePlatformPackage.Literals.MOBILE_PLATFORM_SYMPHONY_SYSTEM_API_ADAPTER;
	}

	/**
	 * This is used to extract the mobile platform instance
	 * from this API adapter.
	 * @return This API adapter's mobile platform instance
	 */
	protected MobilePlatform getMobilePlatform()
	{
		// Just cast appropriately and return
		return (MobilePlatform) getInstance();
	}
	
	/**
	 * This is the callback method that is called by the API adapter
	 * when the mobile platform instance is being initialized by Symphony.
	 * 
	 * @param environment The environment in which Symphony and its components are operating.
	 * @param elementType The type (e.g. class) of the given instance.
	 * @param instance The instance which is being handled by this API adapter.
	 */
	@Override
	public void init(Environment environment, Type elementType, EObject instance)
	{
		// Call the superclass's version of this method
		super.init(environment, elementType, instance);

		// Create the position adapter
		this.positionAdapter = new PositionAdapter(this);
		
		// Add the position adapter to the mobile platform  
		this.getMobilePlatform().eAdapters().add(this.positionAdapter);

		// Create a vehicle pose corrector to perform the required changes
		// to update the pose of the lander
		VehiclePoseCorrector corrector = SymphonyToolsVehicleFactory.eINSTANCE.createVehiclePoseCorrector();
		
		// Indicate that the corrector is using wheels when determining contact points
		corrector.setContactProvider(SymphonyToolsVehicleFactory.eINSTANCE.createWheelContactProvider());
		
		// Set the pose corrector for the mobile platform
		setPoseCorrector(corrector);		
	}

	/**
	 * This is the callback method that is called by the API adapter
	 * when the mobile platform instance is being disposed (i.e. shutdown /
	 * destroyed) by Symphony
	 */
	@Override
	public void dispose()
	{
		// If there is a mobile platform instance being handled by the API adapter
		if (this.getMobilePlatform() != null)
		{
			// Remove the position adapter from the mobile platform
			this.getMobilePlatform().eAdapters().remove(this.positionAdapter);
			
			// If there is a position instance associated with the mobile platform
			if (this.getMobilePlatform().getPosition() != null)
			{
				// Remove the position adapter from the mobile platform's position instance
				this.getMobilePlatform().getPosition().eAdapters().remove(this.positionAdapter);
			}
			
			// Dispose of the mobile platform instance
			this.getMobilePlatform().dispose();
		}

		// Remove the pose corrector from the API adapter
		setPoseCorrector(null);
		
		// Call the superclass's version of this method 
		super.dispose();
	}

	/**
	 * This is a factory method that can be used to generate
	 * initialization data instances of an appropriate type
	 * for this adapter.
	 * 
	 * @return The newly created initialization data object
	 */
	@Override
	public AbstractInitializationData createInitializationData() 
	{
		// Use the relevant factor method to create the desired
		// initialization data object, which, in this case, is
		// an instance of MobilePlatformData
		return SymphonyExampleMobilePlatformFactory.eINSTANCE.createMobilePlatformData();
	}
	
	/**
	 * This is a method which is used to apply the given
	 * initialization data object to the API adapter's instance;
	 * this is particularly useful in conjunction with collect()
	 * as it can be used to save state and then load it back later.
	 * 
	 * @param initializationData The initialization data that is to be applied to the adapter's instance.
	 * @see #collect(AbstractInitializationData)
	 */
	@Override
	public void apply(AbstractInitializationData initializationData)
	{
		// Call the superclass's version of this method
		super.apply(initializationData);

		// If this initialization data object is relevant to the API adapter
		if (initializationData instanceof MobilePlatformData)
		{
			// Cast down appropriately
			MobilePlatformData mobilePlatformData = (MobilePlatformData) initializationData;
			
			// If the mobile platform is not supposed to be initialized but
			// it is OR if the mobile platform is not supposed to be disposed
			// but it is.
			if (((mobilePlatformData.isInitialized() == false) &&
				 (this.getMobilePlatform().isInitialized() == true)) ||
				((mobilePlatformData.isDisposed() == false) &&
				 (this.getMobilePlatform().isDisposed() == true)))
			{
				// Generate the error message
				String message = "The given initialization data cannot be applied " +
								 "to this mobile platform; the given init data says that " +
								 "the platform should not be initialized or disposed, when " +
								 "it already is in that state.";
				
				// Throw an exception to indicate that the apply() has failed; this will
				// be caught and logged by Symphony
				throw new RuntimeException(message);
			}
			
			// If the mobile platform is supposed to be initialized
			if (mobilePlatformData.isInitialized() == true)
			{
				// If the current mobile platform instance isn't initialized
				if (this.getMobilePlatform().isInitialized() == false)
				{
					// Just initialize it
					this.getMobilePlatform().init();
				}
				
				// Get the mobile platform's initial pose transform from the object
				Matrix4x4 matrix = mobilePlatformData.getInitialPoseTransform();
				
				// Extract the position and orientation from the pose matrix
				// Note: The angles in the orientation are NOT unique; 
				//       an infinite number of solutions (e.g. +- 2*Pi)
				//		 could be match the given matrix.  
				Tuple3d position = MathFacade.INSTANCE.extractPosition(matrix);
				Tuple3d orientation = MathFacade.INSTANCE.extractOrientation(matrix);

				// Create a new position object filled with that extracted information
				Position newPlatformPosition = EMFEcoreExampleMobilePlatformFactory.eINSTANCE.createPosition();
				newPlatformPosition.setX(position.getX());
				newPlatformPosition.setY(position.getY());
				newPlatformPosition.setTheta(orientation.getZ());
				
				// Reset the platform's position to the given one
				this.getMobilePlatform().resetPosition(newPlatformPosition);
				
				// Command the platform's velocities accordingly
				this.getMobilePlatform().cmdVelocities(mobilePlatformData.getLinearVelocity(),
													   mobilePlatformData.getAngularVelocity());
			}
			
			// If the mobile platform is supposed to be disposed
			if (mobilePlatformData.isDisposed() == true)
			{
				// If the mobile platform is not yet disposed
				if (this.getMobilePlatform().isDisposed() == false)
				{
					// Just dispose it
					this.getMobilePlatform().dispose();
				}
			}
		}
	}
	
	/**
	 * This is a method which is used to collect and fill the given
	 * initialization data object with relevant data from the API
	 * adapter's instance; this is particularly useful in conjunction
	 * with apply() as it can be used to save data, which can then be
	 * loaded back later.
	 * 
	 * @param initializationData The initialization data that is to store the state of the adapter's instance.
	 * @see #apply(AbstractInitializationData)
	 */
	@Override
	public void collect(AbstractInitializationData initializationData)
	{
		// Call the superclass's version of this method
		super.collect(initializationData);
		
		// If this initialization data object is relevant for this adapter
		if (initializationData instanceof MobilePlatformData)
		{
			// Cast down appropriately
			MobilePlatformData mobilePlatformData = (MobilePlatformData) initializationData;
			
			// Set the initial pose transform using the API adapter's current pose transform
			mobilePlatformData.setInitialPoseTransform(this.getPoseTransform());
			
			// Store the relevant data in the initialization data object
			mobilePlatformData.setInitialized(this.getMobilePlatform().isInitialized());
			mobilePlatformData.setDisposed(this.getMobilePlatform().isDisposed());
			mobilePlatformData.setLinearVelocity(this.getMobilePlatform().getLinearVelocity());
			mobilePlatformData.setAngularVelocity(this.getMobilePlatform().getAngularVelocity());
			
			// The collect() for the power system subcomponent
			// will be automatically be called by Symphony
		}
	}
	
} //MobilePlatformSymphonySystemApiAdapterImpl

/**
 * This class is an adapter which is specialized to check
 * for changes to the mobile platform instance's position.
 * It will be notified when such a change occurs and will
 * update to ensure that it's always listening to the correct
 * object(s).  When an update does occur, the pose of the
 * mobile platform will be updated accordingly.
 */
class PositionAdapter extends AdapterImpl
{
	/**
	 * Used to keep track of the API adapter whose instance is
	 * being listened to by the adapter.
	 */
	private MobilePlatformSymphonySystemApiAdapterImpl apiAdapter;
	
	/**
	 * This is the constructor for the PositionAdapter class
	 * and as such, it performs the required creation and initialization
	 * operations
	 * 
	 * @param apiAdapter The API adapter whose instance is being monitored by this adapter
	 */
	public PositionAdapter(MobilePlatformSymphonySystemApiAdapterImpl apiAdapter)
	{
		// Keep track of the relevant API adapter
		this.apiAdapter = apiAdapter;
	}
	
	/**
	 * This is the workhorse of the PositionAdapter, as it
	 * is the method which is called when notifications are received.
	 * In this case, the method ensures that the adapter is always
	 * listening to the correct object and triggers the pose update.
	 * 
	 * @param msg The notification that the adapter has received. 
	 */
	@Override
	public void notifyChanged(Notification msg)
	{
		try
		{
			// If the object throwing the notification is the mobile platform
			if (msg.getNotifier() instanceof MobilePlatform)
			{
				// If the feature being changed was the position
				if (msg.getFeatureID(MobilePlatform.class) ==
						EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__POSITION)
				{
					// If there was a previous Position object
					if (msg.getOldValue() instanceof Position)
					{
						// Cast down accordingly
						Position oldPosition = (Position) msg.getOldValue();
						
						// Stop this adapter from listening to the old position object
						oldPosition.eAdapters().remove(this);
					}

					// If there is a new Position object
					if (msg.getNewValue() instanceof Position)
					{
						// Cast down accordingly
						Position newPosition = (Position) msg.getNewValue();

						// Trigger an update in the API adapter's pose
						// transform to reflect the mobile platform's new position
						updatePose(newPosition);

						// Make this adapter start listening to the new position object
						newPosition.eAdapters().add(this);
					}
				}
			}
			// If the object throwing the notification is the position object itself
			else if (msg.getNotifier() instanceof Position)
			{
				// Cast down accordingly
				Position newPosition = (Position) msg.getNotifier();

				// Trigger an update in the API adapter's pose
				// transform to reflect the mobile platform's new position
				updatePose(newPosition);
			}
		}
		catch (Throwable t)
		{
			// Print the stack trace
			t.printStackTrace();
		}
	}

	/**
	 * This private helper method is used to update the pose
	 * transform of the API adapter which is associated to the
	 * particular mobile platform instance which threw the
	 * notification 
	 * @param position The new position of the mobile platform instance
	 */
	private void updatePose(Position position) 
	{
		// Create a 4x4 matrix which has all of the given transformation
		Matrix4d m = GeometricUtils.packXYZ(position.getX(),
											position.getY(),
											0,
											0,
											0,
											position.getTheta());
		
		// Create a EObject wrapper for the matrix
		Matrix4x4 matrix = MathFacade.INSTANCE.createMatrix4x4(m);
		
		// Update the API Adapter's pose transform accordingly,
		// which is ultimately the transform at the root of the
		// instance's topology.
		this.apiAdapter.setPoseTransform(matrix);
	}
}