/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.symphony.examples.camera.impl;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.ecore.EClass;

import ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.Camera;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.EMFEcoreExampleCameraPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractInitializationData;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall;
import ca.gc.asc_csa.symphony.core.impl.SymphonySystemApiAdapterImpl;
import ca.gc.asc_csa.symphony.examples.camera.CameraData;
import ca.gc.asc_csa.symphony.examples.camera.CameraSymphonySystemApiAdapter;
import ca.gc.asc_csa.symphony.examples.camera.SymphonyExampleCameraFactory;
import ca.gc.asc_csa.symphony.examples.camera.SymphonyExampleCameraPackage;
import ca.gc.space.math.MathFacade;
import ca.gc.space.math.Matrix4x4;
import ca.gc.space.mrt.sensors.fov.FOVFacade;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.TopologyFacade;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Camera Symphony System Api Adapter</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CameraSymphonySystemApiAdapterImpl extends
		SymphonySystemApiAdapterImpl implements CameraSymphonySystemApiAdapter {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CameraSymphonySystemApiAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyExampleCameraPackage.Literals.CAMERA_SYMPHONY_SYSTEM_API_ADAPTER;
	}

	/**
	 * This is used to retrieve the API adapter's Camera instance
	 * @return The camera instance associated with this API adapter
	 */
	protected Camera getCamera()
	{
		// Just return the casted instance reference
		return (Camera) this.getInstance();
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
		// an instance of CameraData
		return SymphonyExampleCameraFactory.eINSTANCE.createCameraData();
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
		
		// If this is an initialization data object that
		// is relevant to the Camera adapter
		if (initializationData instanceof CameraData)
		{
			// Cast the reference accordingly
			CameraData cameraData = (CameraData) initializationData;
			
			// If the camera is supposed to be initialized
			if (cameraData.isInitialized() == true)
			{
				// If the camera currently isn't initialized
				if (this.getCamera().isInitialized() == false)
				{
					// Just initialize it
					this.getCamera().init();
				}
				
				// Command the camera to change its zoom
				this.getCamera().commandZoom(cameraData.getZoom());
				
				// If the initialization data object has a field of view
				if (cameraData.getFov() != null)
				{
					// Update the camera with the a copy of the given FOV
					this.getCamera().setFov(FOVFacade.INSTANCE.createRectangularFrustrumFieldOfView(cameraData.getFov()));
				}
				// Otherwise
				else
				{
					// Just set the FOV to null
					this.getCamera().setFov(null);
				}
			}
			// Otherwise, the camera is not supposed to be initialized
			else
			{
				// If the camera is currently initialized
				if (this.getCamera().isInitialized() == true)
				{
					// Generate the error message
					String message = "The given initialization data cannot be applied " +
									 "to this camera; the given init data says that " +
									 "the camera should not be initialized, when " +
									 "it already is in that state.";
					
					// Throw an exception to indicate that the apply() has failed; this will
					// be caught and logged by Symphony
					throw new RuntimeException(message);
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
		
		// If this is an initialization data object that
		// is relevant to the Camera adapter
		if (initializationData instanceof CameraData)
		{
			// Cast the reference accordingly
			CameraData cameraData = (CameraData) initializationData;
			
			// If the camera currently has a field of view
			if (this.getCamera().getFov() != null)
			{
				// Store a copy of the camera's current field of
				// view in the initialization object
				cameraData.setFov(FOVFacade.INSTANCE.createRectangularFrustrumFieldOfView(this.getCamera().getFov()));
			}
			// Otherwise
			else
			{
				// Just set it to null
				cameraData.setFov(null);
			}
			
			// Store the camera's other values in the initialization data object
			cameraData.setZoom(this.getCamera().getCurrentZoom());
			cameraData.setInitialized(this.getCamera().isInitialized());
		}
	}
	
	/**
	 * This method will return a 4x4 matrix, whose components represent
	 * the transformation (e.g. rotations, translations, etc.) from where
	 * the given operation took place to the camera's root topology node;
	 * for example, for the operation takeSnapshot(), this describes the
	 * transformation from the camera's lens to its base (e.g. root). If
	 * no transformation occurred, then the identity matrix should be
	 * returned; note that this, in fact, is what is returned by the
	 * superclass's version of this method.
	 * 
	 * @param operationCall The operation which took place
	 * @return The transformation from where the operation took place to the camera's root
	 */
	@Override
	public Matrix4x4 createResultMatrix(OperationCall operationCall)
	{
		// If the takeSnapshot() method was called
		if (operationCall.getEOperation().getOperationID() == EMFEcoreExampleCameraPackage.CAMERA___TAKE_SNAPSHOT)
		{
			// Extract the camera lens and root nodes
			Node tip = TopologyFacade.INSTANCE.findNodesByID("CAMERA_SYM_SYS_BODY_TO_LENS",
															 getSymphonySystem().getTopologyRoot().getOriginNode()).get(0);
			Node root = TopologyFacade.INSTANCE.findNodesByID("CAMERA_SYM_SYS_ROOT",
															  getSymphonySystem().getTopologyRoot().getOriginNode()).get(0);
			
			// Determine the series of transformations that have taken place
			Matrix4d matrix4d = TopologyFacade.INSTANCE.expressInFrame(tip,	root);
			
			// Create a 4x4 Matrix with the transformation and return it
			return MathFacade.INSTANCE.createMatrix4x4(matrix4d);
		}
		// Otherwise, any other operation was called
		else
		{
			// Just return the identity matrix
			return super.createResultMatrix(operationCall);
		}
	}

} // CameraSymphonySystemApiAdapterImpl
