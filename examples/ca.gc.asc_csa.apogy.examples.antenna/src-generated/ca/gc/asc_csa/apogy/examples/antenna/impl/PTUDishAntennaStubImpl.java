package ca.gc.asc_csa.apogy.examples.antenna.impl;
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
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.examples.antenna.Activator;
import ca.gc.asc_csa.apogy.examples.antenna.ApogyExamplesAntennaPackage;
import ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntennaStub;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PTU Dish Antenna Stub</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PTUDishAntennaStubImpl extends PTUDishAntennaImpl implements PTUDishAntennaStub {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PTUDishAntennaStubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesAntennaPackage.Literals.PTU_DISH_ANTENNA_STUB;
	}

	/**
	 * This operation is used to perform the operations
	 * (if any) required to initialize the antenna
	 * @return Whether or not the antenna was successfully initialized
	 * @generated_NOT
	 */
	@Override
	public boolean init()
	{
		// Generate a message and log it
		// As this is a stub, just indicate that the PTU
		// dish antenna would have been initialized
		String message = this.getClass().getSimpleName() +
							".init(): Just a stub - the PTU dish "
							+ "antenna would have been initialized.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Just return true
		return true;
	}

	/**
	 * Command the PTU (and implicitly the camera) to move to the
	 * specified pan and tilt angles.
	 * @param panAngle The target pan angle for the PTU (given in radians.)
	 * @param tiltAngle The target tilt angle for the PTU (given in radians.)
	 * @generated_NOT
	 */
	@Override
	public void moveTo(double panAngle, double tiltAngle)
	{
		/**
		 * This is the degree symbol, as expressed in unicode
		 */
		final String DEGREE_SYM = "\u00b0";
		
		// Generate a message and log it
		// As this is a stub, just indicate that the PTU unit
		// of the dish antenna would have been moved
		String message = this.getClass().getSimpleName() +
							".moveTo(" + Math.toDegrees(panAngle) + DEGREE_SYM +
							", " + Math.toDegrees(tiltAngle) + DEGREE_SYM +
							"): Just a stub - the dish antenna's PTU unit would " +
							"have moved to the given pan and tilt angles.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
	}
	
	/**
	 * This is used to toggle whether the PTU (and implicitly the
	 * antenna mounted on it) should be following the sun.  If
	 * true, then the antenna will continue tracking the sun until
	 * it is told otherwise.
	 *
	 * @param track Whether or not the PTU antenna should be following the sun.
	 * @generated_NOT
	 */
	@Override
	public void trackSun(boolean track)
	{
		// Generate a message and log it
		// As this is a stub, just indicate that the PTU unit of
		// the dish antenna would have either started or stopped
		// tracking the sun.
		String message = this.getClass().getSimpleName() +
							".trackSun(" + track + "): Just a stub - " +
							"the dish antenna's PTU unit would have " +
							(track == true ? "started" : "stopped") + 
							" tracking the sun.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
	}
} //PTUDishAntennaStubImpl
