package ca.gc.asc_csa.apogy.examples.lidar.impl;
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
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.examples.lidar.Activator;
import ca.gc.asc_csa.apogy.examples.lidar.ApogyExamplesLidarPackage;
import ca.gc.asc_csa.apogy.examples.lidar.LidarStub;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lidar Stub</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LidarStubImpl extends LidarImpl implements LidarStub
{
	/**
	 * This is the degree symbol, as expressed in unicode
	 */
	private static final String DEGREE_SYM = "\u00b0";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LidarStubImpl()
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
		return ApogyExamplesLidarPackage.Literals.LIDAR_STUB;
	}

	/*
	 * This operation is used to perform the steps necessary to initialize
	 * the Lidar unit.
	 * @return Whether or not the Lidar's initialization was successfully completed
	 */
	@Override
	public boolean init()
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the Lidar
		// unit would have been initialized
		String message = this.getClass().getSimpleName() +
							".init(): Just a stub - " +
							"the necessary initialization for the Lidar " +
							"unit would have taken place.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Just return true
		return true;
	}
	
	/* 
	 * This operation is used to acquire a depth scan of the field of view, with the given
	 * horizontal and vertical resolution.
	 * <p>
	 * Note: This method operates synchronously and will block until the entire scan has been
	 *       completed.  
	 * @param horizontalResolution The horizontal angular resolution of the scan (in radians.)
	 * @param verticalResolution The vertical angular resolution of the scan (in radians.)
	 * @return The resulting scan with the given horizontal and vertical angular resolution.
	 * @see #acquireScanNonBlocking(double, double)
	 */
	@Override
	public CartesianCoordinatesSet acquireScan(double horizontalResolution,
											   double verticalResolution)
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the Lidar
		// unit would have synchronously taken a depth scan.
		String message = this.getClass().getSimpleName() +
							".acquireScan(" + Math.toDegrees(horizontalResolution) +
							DEGREE_SYM + ", " +	Math.toDegrees(verticalResolution) +
							DEGREE_SYM + "): Just a stub - " +
							"the Lidar unit would have synchronously taken a depth " +
							"scan of the Lidar's field of view at the specified resolutions.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Just return null
		return null;
	}

	/* 
	 * This operation is used to acquire a depth scan of the field of view, with the given
	 * horizontal and vertical resolution.
	 * <p>
	 * Note: This method operates asynchronously and as such, will return immediately, even
	 *       if the scan is not yet completed.
	 * @param horizontalResolution The horizontal angular resolution of the scan (in radians.)
	 * @param verticalResolution The vertical angular resolution of the scan (in radians.)
	 * @return The resulting scan with the given horizontal and vertical angular resolution.
	 * @see #acquireScan(double, double)
	 */
	@Override
	public CartesianCoordinatesSet acquireScanNonBlocking(double horizontalResolution,
														  double verticalResolution)
	{
		// Generate the message and log it
		// As this is a stuv, just indicate that the Lidar
		// unit would have synchronously taken a depth scan.
		String message = this.getClass().getSimpleName() +
							"acquireScanNonBlocking(" + Math.toDegrees(horizontalResolution) +
							DEGREE_SYM + ", " +	Math.toDegrees(verticalResolution) +
							DEGREE_SYM + "): Just a stub - " +
							"the Lidar unit would have asynchronously taken a depth " +
							"scan of the Lidar's field of view at the specified resolutions.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Just return null
		return null;
	}
} //LidarStubImpl
