package ca.gc.asc_csa.apogy.addons.sensors.motion.impl;
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
import ca.gc.asc_csa.apogy.addons.sensors.impl.SensorImpl;
import ca.gc.asc_csa.apogy.addons.sensors.motion.ApogyAddonsSensorsMotionPackage;
import ca.gc.asc_csa.apogy.addons.sensors.motion.SelfMotionSensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Self Motion Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SelfMotionSensorImpl extends SensorImpl implements SelfMotionSensor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelfMotionSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsSensorsMotionPackage.Literals.SELF_MOTION_SENSOR;
	}

} //SelfMotionSensorImpl
