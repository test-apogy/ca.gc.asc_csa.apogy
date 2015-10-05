/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.camera.symphony.impl;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.examples.camera.EMFEcoreExampleCameraPackage;
import org.eclipse.symphony.examples.camera.PTUCamera;
import org.eclipse.symphony.examples.camera.symphony.PTUCameraData;
import org.eclipse.symphony.examples.camera.symphony.PTUCameraSymphonySystemApiAdapter;
import org.eclipse.symphony.examples.camera.symphony.SymphonyExampleCameraFactory;
import org.eclipse.symphony.examples.camera.symphony.SymphonyExampleCameraPackage;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractInitializationData;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall;
import ca.gc.asc_csa.symphony.core.impl.SymphonySystemApiAdapterImpl;
import ca.gc.space.mrt.sensors.fov.FOVFacade;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.TopologyFacade;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>PTU Camera Symphony System Api Adapter</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class PTUCameraSymphonySystemApiAdapterImpl extends
		SymphonySystemApiAdapterImpl implements
		PTUCameraSymphonySystemApiAdapter {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PTUCameraSymphonySystemApiAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyExampleCameraPackage.Literals.PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER;
	}

	/**
	 * This is used to retrieve the API adapter's PTU Camera instance
	 * 
	 * @return The PTU camera instance associated with this API adapter
	 */
	protected PTUCamera getPTUCamera()
	{
		// Just return the casted instance reference
		return (PTUCamera) this.getInstance();
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
		// an instance of PTUCameraData.
		return SymphonyExampleCameraFactory.eINSTANCE.createPTUCameraData();
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
		// is relevant to the PTU Camera API adapter
		if (initializationData instanceof PTUCameraData)
		{
			// Cast the reference accordingly
			PTUCameraData ptuCameraData = (PTUCameraData) initializationData;

			// If the PTU camera is supposed to be initialized
			if (ptuCameraData.isInitialized() == true)
			{
				// If the PTU camera currently isn't initialized
				if (this.getPTUCamera().isInitialized() == false)
				{
					// Just initialize it
					this.getPTUCamera().init();
				}
				
				// Command the camera to change to the given zoom
				this.getPTUCamera().commandZoom(ptuCameraData.getZoom());
				
				// Command the camera to change to the given pan and tilt angles
				this.getPTUCamera().moveToPanTilt(ptuCameraData.getPanAngle(),
												  ptuCameraData.getTiltAngle());
				
				// If there is a field of view in the initialization object
				if (ptuCameraData.getFov() != null)
				{
					// Set the camera's FOV accordingly
					this.getPTUCamera().setFov(FOVFacade.INSTANCE.createRectangularFrustrumFieldOfView(ptuCameraData.getFov()));
				}
				// Otherwise
				else
				{
					// Just set it to null
					this.getPTUCamera().setFov(null);
				}
			}
			// Otherwise, the PTU camera is not supposed to be initialized
			else
			{
				// If the PTU camera is currently initialized
				if (this.getPTUCamera().isInitialized() == true)
				{
					// Generate the error message
					String message = "The given initialization data cannot be applied " +
									 "to this PTU camera; the given init data says that " +
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
		// is relevant to the PTU Camera API adapter
		if (initializationData instanceof PTUCameraData)
		{
			// Cast the reference accordingly
			PTUCameraData ptuCameraData = (PTUCameraData) initializationData;

			// If the camera has a field of view
			if (this.getPTUCamera().getFov() != null)
			{
				// Create a copy of the FOV and store it in the initialization object
				ptuCameraData.setFov(FOVFacade.INSTANCE.createRectangularFrustrumFieldOfView(this.getPTUCamera().getFov()));
			}
			// Otherwise
			else
			{
				// Just set it to null
				ptuCameraData.setFov(null);
			}
			
			// Store the camera's current state to the initialization data object
			ptuCameraData.setZoom(this.getPTUCamera().getCurrentZoom());
			ptuCameraData.setPanAngle(this.getPTUCamera().getCurrentPanAngle());
			ptuCameraData.setTiltAngle(this.getPTUCamera().getCurrentTiltAngle());
			ptuCameraData.setInitialized(this.getPTUCamera().isInitialized());
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
	 * @return The transformation from where the operation took place to the PTU camera's root
	 */
	@Override
	public Matrix4x4 createResultMatrix(OperationCall operationCall) 
	{
		// If the takeSnapshot() method was called
		if (operationCall.getEOperation().getOperationID() == EMFEcoreExampleCameraPackage.CAMERA___TAKE_SNAPSHOT)
		{
			// Extract the camera lens and root nodes
			Node tip = TopologyFacade.INSTANCE.findNodesByID("PTU_CAMERA_SYM_SYS_LENS",
															 getSymphonySystem().getTopologyRoot().getOriginNode()).get(0);
			Node root = TopologyFacade.INSTANCE.findNodesByID("PTU_CAMERA_SYM_SYS_ROOT",
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
} // PTUCameraSymphonySystemApiAdapterImpl
