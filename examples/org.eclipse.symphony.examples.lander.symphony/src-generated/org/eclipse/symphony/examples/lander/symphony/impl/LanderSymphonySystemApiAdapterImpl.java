/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lander.symphony.impl;

import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehicleFactory;
import org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector;
import org.eclipse.symphony.common.math.GeometricUtils;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.core.impl.SymphonySystemApiAdapterImpl;
import org.eclipse.symphony.core.invocator.AbstractInitializationData;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.symphony.core.invocator.Type;
import org.eclipse.symphony.examples.lander.Symphony__ExamplesLanderPackage;
import org.eclipse.symphony.examples.lander.Lander;
import org.eclipse.symphony.examples.lander.Position;
import org.eclipse.symphony.examples.lander.symphony.LanderData;
import org.eclipse.symphony.examples.lander.symphony.LanderSymphonySystemApiAdapter;
import org.eclipse.symphony.examples.lander.symphony.Symphony__ExamplesLanderSymphonyFactory;
import org.eclipse.symphony.examples.lander.symphony.Symphony__ExamplesLanderSymphonyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lander Symphony System Api Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LanderSymphonySystemApiAdapterImpl extends SymphonySystemApiAdapterImpl
implements LanderSymphonySystemApiAdapter
{
	/**
	 * This adapter is used to intercept notifications regarding
	 * changes in the lander's position, so that the pose corrector
	 * can be appropriately invoked.
	 */
	private Adapter positionAdapter = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanderSymphonySystemApiAdapterImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return Symphony__ExamplesLanderSymphonyPackage.Literals.LANDER_SYMPHONY_SYSTEM_API_ADAPTER;
	}

	/**
	 * This is used to retrieve the API adapter's lander instance.
	 * @return The lander instance associated with this API adapter
	 */
	protected Lander getLander()
	{
		// Just return the casted instance reference 
		return (Lander) this.getInstance();
	}

	/**
	 * This is the callback method that is called by the API adapter
	 * when the lander instance is being initialized by Symphony.
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

		// Register this adapter to acquire notifications when the lander changes
		this.getLander().eAdapters().add(this.positionAdapter);

		// Create a vehicle pose corrector to perform the required changes
		// to update the pose of the lander
		VehiclePoseCorrector corrector = Symphony__AddonsVehicleFactory.eINSTANCE.createVehiclePoseCorrector();
		
		// Indicate that the corrector is using spherical feet when determining contact points 
		corrector.setContactProvider(Symphony__AddonsVehicleFactory.eINSTANCE.createLanderSphericalFootContactProvider());

		// Set the pose corrector for the lander
		this.setPoseCorrector(corrector);
	}

	/**
	 * This is the callback method that is called by the API adapter
	 * when the PTU dish antenna instance is being disposed (i.e. shutdown /
	 * destroyed) by Symphony
	 */
	@Override
	public void dispose() 
	{
		// If there is a lander instance being handled by the API adapter
		if (this.getLander() != null) 
		{
			// Remove the position adapter from the lander
			this.getLander().eAdapters().remove(this.positionAdapter);
			
			// If there is a position instance associated with the lander
			if (this.getLander().getPosition() != null) 
			{
				// Remove the position adapter from the lander's position instance
				this.getLander().getPosition().eAdapters().remove(this.positionAdapter);
			}
			
			// Dispose of the lander instance
			this.getLander().dispose();
		}

		// Remove the pose corrector from the API adapter
		this.setPoseCorrector(null);

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
		// Use the relevant factory method to create the desired
		// initialization data object, which, in this case, is
		// an instance of LanderData.
		return Symphony__ExamplesLanderSymphonyFactory.eINSTANCE.createLanderData();
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
		if(initializationData instanceof LanderData)
		{
			// Cast down appropriately
			LanderData landerData = (LanderData) initializationData;
			
			// If the lander is not supposed to be initialized but
			// it currently is OR the lander is not supposed to be
			// disposed but it is.
			if (((landerData.isInitialized() == false) &&
				 (this.getLander().isInitialized() == true)) ||
				((landerData.isDisposed() == false) &&
				 (this.getLander().isDisposed() == true)))
			{
				// Generate the error message
				String message = "The given initialization data cannot be applied " +
								 "to this lander; the given init data says that " +
								 "the lander should not be initialized or disposed, when " +
								 "it already is in that state.";
				
				// Throw an exception to indicate that the apply() has failed; this will
				// be caught and logged by Symphony
				throw new RuntimeException(message);
			}
			
			// If the lander is supposed to be initialized
			if (landerData.isInitialized() == true)
			{
				// If the lander is currently not initialized
				if (this.getLander().isInitialized() == false)
				{
					// Just initialize it
					this.getLander().init();
				}
				
				// Set the lander's leg position 
				this.getLander().commandLegPosition(landerData.getLegAExtension(), 
											   		landerData.getLegBExtension(), 
											   		landerData.getLegCExtension());
				
				// Used to keep track of the lander's 3D coordinates and orientation
				Vector3d coordinates = new Vector3d();
				Matrix3d rotationMatrix = new Matrix3d();
				
				// Extract the coordinates from the lander data's initial
				// pose transform matrix; note that the pose transform
				// is simply the standard 4x4 transformation matrix used
				// in much of computer graphics.
				landerData.getInitialPoseTransform().asMatrix4d().get(coordinates);

				// Move the lander to the given coordinates
				this.getLander().moveTo(coordinates.getX(),
										coordinates.getY(),
										coordinates.getZ());
				
				// Extract the rotation matrix from the lander data's initial
				// pose transform matrix
				landerData.getInitialPoseTransform().asMatrix4d().getRotationScale(rotationMatrix);
				
				// Extract the Euler angles from the rotation matrix
				Vector3d currAngles = GeometricUtils.extractRotationFromXYZRotMatrix(rotationMatrix);
					
				// Change the lander's attitude to the extracted angles
				this.getLander().changeAttitude(currAngles.getX(),
												currAngles.getY(),
												currAngles.getZ());
				
				// Set the lander's minimum and maximum thrust levels
				this.getLander().getThruster().setMinimumThrust(landerData.getMinThrustLevel());
				this.getLander().getThruster().setMaximumThrust(landerData.getMaxThrustLevel());
				
				// Set the lander's thrust level accordingly
				this.getLander().commandThrust(landerData.getCurrThrustLevel());
				
				// Set the lander's angular velocities accordingly
				this.getLander().commandAngularVelocities(landerData.getXAngularVelocity(),
														  landerData.getYAngularVelocity());
				
				// If the lander is supposed to be flying
				// and it's currently not flying
				if ((landerData.isFlyingEnabled() == true) &&
					(this.getLander().isFlyingEnabled() == false))
				{
					// Start the lander flying
					this.getLander().startFlying(false);
				}
				// Otherwise, if it's not supposed to be flying
				// and it's currently flying
				else if ((landerData.isFlyingEnabled() == false) &&
						 (this.getLander().isFlyingEnabled() == true))
				{
					// Stop the lander flying
					this.getLander().stopFlying();
				}
			}
			
			// If the lander is supposed to be disposed
			if (landerData.isDisposed() == true)
			{
				// If the lander is not currently disposed
				if (this.getLander().isDisposed() == false)
				{
					// Just dispose it
					this.getLander().dispose();
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
		
		// If this initialization data object is relevant to the API Adapter
		if(initializationData instanceof LanderData)
		{
			// Cast down appropriately
			LanderData landerData = (LanderData) initializationData;

			// Create a copy of the lander's current pose transform
			Matrix4x4 currPose = MathFacade.INSTANCE.createMatrix4x4(this.getPoseTransform().asMatrix4d());
			
			// Save the pose transform of the lander 
			landerData.setInitialPoseTransform(currPose);
			
			// Save the state of the lander instance to the initialization data object
			landerData.setInitialized(this.getLander().isInitialized());
			landerData.setDisposed(this.getLander().isDisposed());
			
			landerData.setFlyingEnabled(this.getLander().isFlyingEnabled());
			
			landerData.setLegAExtension(this.getLander().getLegAExtension());
			landerData.setLegBExtension(this.getLander().getLegBExtension());
			landerData.setLegCExtension(this.getLander().getLegCExtension());
			
			landerData.setMinThrustLevel(this.getLander().getThruster().getMinimumThrust());
			landerData.setMaxThrustLevel(this.getLander().getThruster().getMaximumThrust());
			landerData.setCurrThrustLevel(this.getLander().getThruster().getCurrentThrust());
			
			landerData.setXAngularVelocity(this.getLander().getXAngularVelocity());
			landerData.setYAngularVelocity(this.getLander().getYAngularVelocity());
		}
	}
}

/**
 * This class is used to as an adapter to handle the notifications
 * (i.e. updates) to the lander's position.  Essentially, this
 * adapter's notifyChanged() method is called every time the
 * lander in general or the position itself changes.  This is
 * useful as it can be used to trigger the pose corrector to
 * update correctly, in accordance with the new position value(s). 
 */
class PositionAdapter extends AdapterImpl
{
	/**
	 * This is the API adapter whose lander instance's position is
	 * being monitored by this adapter.
	 */
	LanderSymphonySystemApiAdapterImpl apiAdapter;
	
	/**
	 * This is the constructor for the PositionAdapter class;
	 * as such, it performs the required creation and
	 * initialization operations.
	 * @param apiAdapter The API adapter whose lander's position is being monitored
	 */
	public PositionAdapter(LanderSymphonySystemApiAdapterImpl apiAdapter)
	{
		// Just keep track of the API adapter
		this.apiAdapter = apiAdapter;
	}

	/**
	 * This method is what is actually called when an
	 * update to the Lander or specifically its position
	 * takes place.  The changes are monitored, and
	 * the adapter ensures that it is always observing
	 * the correct object, even if the Position instance
	 * changes.  Ultimately, the pose corrector is triggered
	 * and the lander's position is adjusted accordingly.
	 * 
	 * @param msg The specific event that notified this position adapter
	 */
	@Override
	public void notifyChanged(Notification msg) 
	{
		try 
		{
			// If the notifying object is the lander
			if (msg.getNotifier() instanceof Lander) 
			{
				// If the lander's feature being changes was the position
				if (msg.getFeatureID(Lander.class) == Symphony__ExamplesLanderPackage.LANDER__POSITION) 
				{
					// If there was a previous position object being monitored
					if (msg.getOldValue() instanceof Position) 
					{
						// Cast down accordingly
						Position oldPosition = (Position) msg.getOldValue();
						
						// Stop following the old position object
						oldPosition.eAdapters().remove(this);
					}

					// If there is a new position object that should be monitored
					if (msg.getNewValue() instanceof Position) 
					{
						// Cast down accordingly
						Position newPosition = (Position) msg.getNewValue();

						// Update the lander's position accordingly
						// using the pose corrector
						this.updatePose(newPosition);

						// Start monitoring the new position object
						newPosition.eAdapters().add(this);
					}
				}
			}
			// Else if the notifying object is the lander's position
			else if (msg.getNotifier() instanceof Position) 
			{
				// Cast down accordingly
				Position newPosition = (Position) msg.getNotifier();

				// Update the lander's position accordingly
				// using the pose corrector 
				updatePose(newPosition);
			}
		} 
		catch (Throwable t) 
		{
			// Just print the stack trace
			t.printStackTrace();
		}
	}

	/**
	 * This private helper method is used to actually facilitate the
	 * lander's pose correction.
	 * 
	 * @param position The lander's current position (as per the notification)
	 */
	private void updatePose(Position position) 
	{
		// Create a new 4x4 matrix for the lander's transformation
		Matrix4d m = new Matrix4d();
		
		// Make it initially the identity matrix
		m.setIdentity();
		
		// Add the lander's translation to the transform
		m.setTranslation(new Vector3d(position.getX(),
									  position.getY(),
									  position.getZ()));
		
		// If there is an attitude matrix
		if (position.getAttitude() != null)
		{
			// Create a separate 4x4 matrix to handle the lander's attitude (orientation)
			Matrix4d rot = new Matrix4d();
			rot.setIdentity();
			
			// Set the attitude accordingly
			rot.set(position.getAttitude());
			
			// Multiply the translation by the attitude to get the
			// complete transform for the lander
			m.mul(rot);
		}

		// Create a EObject wrapper for the complete transform
		Matrix4x4 matrix = MathFacade.INSTANCE.createMatrix4x4(m);
		
		// Set the pose transform accordingly, causing
		// the pose corrector to trigger (if it is enabled)
		this.apiAdapter.setPoseTransform(matrix);
	}
}
