package ca.gc.asc_csa.apogy.examples.camera.impl;
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

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.examples.camera.Activator;
import ca.gc.asc_csa.apogy.examples.camera.CameraStub;
import ca.gc.asc_csa.apogy.examples.camera.ApogyExamplesCameraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camera Stub</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CameraStubImpl extends CameraImpl implements CameraStub
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CameraStubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesCameraPackage.Literals.CAMERA_STUB;
	}

	/**
	 * This operation performs any required initialization
	 * operations for the camera.  This is typically called
	 * before any other operation.
	 * @return True if the initialization was successful, false otherwise.
	 */
	@Override
	public boolean init()
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the camera would have been initialized.
		String message = this.getClass().getSimpleName() +
							".init(): Just a stub - " +
							"the necessary initialization for the camera would have taken place.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Just return true
		return true;
	}
	
	/**
	 * Command the camera zoom, attempting to change it
	 * to the given zoom value.
	 * @param newZoom The desired level of zoom
	 * @return Whether or not the current zoom level was updated.
	 * @see #getMaximumZoom()
	 * @see #getMinimumZoom()
	 * @generated_NOT
	 */
	@Override
	public boolean commandZoom(double newZoom)
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the camera's current
		// zoom level would have changed.
		String message = this.getClass().getSimpleName() +
							".commandZoom(" + newZoom + "): Just a stub - "  +
							"the camera's zoom level would have been updated.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Just return true
		return true;
	}

	/**
	 * This operation returns the minimum zoom level permitted by this camera.
	 * @return The camera's minimum allowed zoom level
	 * @see #getMaximumZoom()
	 * @see #commandZoom(double)
	 * @generated_NOT
	 */
	@Override
	public double getMinimumZoom()
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the camera's minimum allowed
		// zoom level would have been returned.
		String message = this.getClass().getSimpleName() +
							".getMinimumZoom(): Just a stub - " +
							"the camera's minimum allowed zoom level would have been returned.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Just return the current zoom level
		return this.getCurrentZoom();
	}

	/**
	 * This operation returns the maximum zoom level permitted by this camera.
	 * @return The camera's maximum allowed zoom level
	 * @see #getMinimumZoom()
	 * @see #commandZoom(double)
	 * @generated_NOT
	 */
	@Override
	public double getMaximumZoom()
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the camera's maximum allowed
		// zoom level would have been returned.
		String message = this.getClass().getSimpleName() +
							".getMaximumZoom(): Just a stub - " +
							"the camera's maximum allowed zoom level would have been returned.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Just return the current zoom level
		return this.getCurrentZoom();
	}

	/**
	 * This operation is used to order the camera to take and return a snapshot.
	 * @return A snapshot taken by the camera.
	 * @generated_NOT
	 */
	@Override
	public ImageSnapshot takeSnapshot()
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the camera would be ordered
		// to take a snapshot and return it.
		String message = this.getClass().getSimpleName() +
							".takeSnapshot(): Just a stub - " + 
							"the camera would have taken a snapshot and returned it.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Just return null
		return null;
	}

	/**
	 * This operation is the current field of view (FOV) of the camera.
	 * @return The camera's current field of view.
	 * @generated_NOT
	 */
	@Override
	public RectangularFrustrumFieldOfView getFieldOfView()
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the camera's field of view
		// (FOV) would have been returned.
		String message = this.getClass().getSimpleName() +
							".getFieldOfView(): Just a stub - " +
							"the camera's field of view would have been returned.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Return the camera's field of view
		return getFov();
	}
} //CameraStubImpl
