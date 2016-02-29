package ca.gc.asc_csa.apogy.examples.camera.apogy.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import javax.vecmath.Matrix4d;

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVFacade;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.core.impl.ApogySystemApiAdapterImpl;
import ca.gc.asc_csa.apogy.core.invocator.AbstractInitializationData;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.examples.camera.ApogyExamplesCameraPackage;
import ca.gc.asc_csa.apogy.examples.camera.PTUCamera;
import ca.gc.asc_csa.apogy.examples.camera.apogy.PTUCameraData;
import ca.gc.asc_csa.apogy.examples.camera.apogy.PTUCameraApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.examples.camera.apogy.ApogyExamplesCameraApogyFactory;
import ca.gc.asc_csa.apogy.examples.camera.apogy.ApogyExamplesCameraApogyPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>PTU Camera Apogy System Api Adapter</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class PTUCameraApogySystemApiAdapterImpl extends
		ApogySystemApiAdapterImpl implements
		PTUCameraApogySystemApiAdapter {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PTUCameraApogySystemApiAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesCameraApogyPackage.Literals.PTU_CAMERA_APOGY_SYSTEM_API_ADAPTER;
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
		return ApogyExamplesCameraApogyFactory.eINSTANCE.createPTUCameraData();
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
					this.getPTUCamera().setFov(ApogyAddonsSensorsFOVFacade.INSTANCE.createRectangularFrustrumFieldOfView(ptuCameraData.getFov()));
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
					// be caught and logged by Apogy
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
				ptuCameraData.setFov(ApogyAddonsSensorsFOVFacade.INSTANCE.createRectangularFrustrumFieldOfView(this.getPTUCamera().getFov()));
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
		if (operationCall.getEOperation().getOperationID() == ApogyExamplesCameraPackage.CAMERA___TAKE_SNAPSHOT)
		{
			// Extract the camera lens and root nodes
			Node tip = ApogyCommonTopologyFacade.INSTANCE.findNodesByID("PTU_CAMERA_SYM_SYS_LENS",
															 getApogySystem().getTopologyRoot().getOriginNode()).get(0);
			Node root = ApogyCommonTopologyFacade.INSTANCE.findNodesByID("PTU_CAMERA_SYM_SYS_ROOT",
															  getApogySystem().getTopologyRoot().getOriginNode()).get(0);
			
			// Determine the series of transformations that have taken place
			Matrix4d matrix4d = ApogyCommonTopologyFacade.INSTANCE.expressInFrame(tip,	root);
			
			// Create a 4x4 Matrix with the transformation and return it
			return ApogyCommonMathFacade.INSTANCE.createMatrix4x4(matrix4d);
		}
		// Otherwise, any other operation was called
		else
		{
			// Just return the identity matrix
			return super.createResultMatrix(operationCall);
		}
	}
	
	@Override
	public void dispose() 
	{
		try
		{
			// Stops streaming if it is enabled.
			if(this.getPTUCamera().isStreamingEnabled())
			{
				this.getPTUCamera().commandStreaming(false);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		super.dispose();
	}
} // PTUCameraApogySystemApiAdapterImpl
