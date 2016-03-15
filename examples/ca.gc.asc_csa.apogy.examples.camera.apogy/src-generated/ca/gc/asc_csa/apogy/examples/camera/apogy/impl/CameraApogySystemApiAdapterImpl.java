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
import ca.gc.asc_csa.apogy.examples.camera.Camera;
import ca.gc.asc_csa.apogy.examples.camera.ApogyExamplesCameraPackage;
import ca.gc.asc_csa.apogy.examples.camera.apogy.CameraData;
import ca.gc.asc_csa.apogy.examples.camera.apogy.CameraApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.examples.camera.apogy.ApogyExamplesCameraApogyFactory;
import ca.gc.asc_csa.apogy.examples.camera.apogy.ApogyExamplesCameraApogyPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Camera Apogy System Api Adapter</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class CameraApogySystemApiAdapterImpl extends
		ApogySystemApiAdapterImpl implements CameraApogySystemApiAdapter {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CameraApogySystemApiAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesCameraApogyPackage.Literals.CAMERA_APOGY_SYSTEM_API_ADAPTER;
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
		return ApogyExamplesCameraApogyFactory.eINSTANCE.createCameraData();
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
					this.getCamera().setFov(ApogyAddonsSensorsFOVFacade.INSTANCE.createRectangularFrustrumFieldOfView(cameraData.getFov()));
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
				cameraData.setFov(ApogyAddonsSensorsFOVFacade.INSTANCE.createRectangularFrustrumFieldOfView(this.getCamera().getFov()));
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
		if (operationCall.getEOperation().getOperationID() == ApogyExamplesCameraPackage.CAMERA___TAKE_SNAPSHOT)
		{
			// Extract the camera lens and root nodes
			Node tip = ApogyCommonTopologyFacade.INSTANCE.findNodesByID("CAMERA_SYM_SYS_BODY_TO_LENS",
															 getApogySystem().getTopologyRoot().getOriginNode()).get(0);
			Node root = ApogyCommonTopologyFacade.INSTANCE.findNodesByID("CAMERA_SYM_SYS_ROOT",
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
			if(this.getCamera().isStreamingEnabled())
			{
				this.getCamera().commandStreaming(false);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		super.dispose();
	}
} // CameraApogySystemApiAdapterImpl
