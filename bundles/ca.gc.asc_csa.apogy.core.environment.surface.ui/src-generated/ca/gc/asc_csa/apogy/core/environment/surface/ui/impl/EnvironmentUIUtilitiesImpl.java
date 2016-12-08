/**
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
package ca.gc.asc_csa.apogy.core.environment.surface.ui.impl;

import ca.gc.asc_csa.apogy.core.environment.Star;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.EnvironmentUIUtilities;

import java.lang.reflect.InvocationTargetException;

import javax.vecmath.Color3f;
import javax.vecmath.Point3f;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment UI Utilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EnvironmentUIUtilitiesImpl extends MinimalEObjectImpl.Container implements EnvironmentUIUtilities {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentUIUtilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogySurfaceEnvironmentUIPackage.Literals.ENVIRONMENT_UI_UTILITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point3f toPoint3f(Star star) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPointSizeForMagnitude(float magnitude, float magnitudeRangeMinimum, float magnitudeRangeMaximum, float minimumPointSize, float maximumPointSize) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color3f getSunLightColor(double sunAltitude) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSkyTransparency(double sunAltitude) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color3f getSkyColor(double sunAltitude) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogySurfaceEnvironmentUIPackage.ENVIRONMENT_UI_UTILITIES___TO_POINT3F__STAR:
				return toPoint3f((Star)arguments.get(0));
			case ApogySurfaceEnvironmentUIPackage.ENVIRONMENT_UI_UTILITIES___GET_POINT_SIZE_FOR_MAGNITUDE__FLOAT_FLOAT_FLOAT_FLOAT_FLOAT:
				return getPointSizeForMagnitude((Float)arguments.get(0), (Float)arguments.get(1), (Float)arguments.get(2), (Float)arguments.get(3), (Float)arguments.get(4));
			case ApogySurfaceEnvironmentUIPackage.ENVIRONMENT_UI_UTILITIES___GET_SUN_LIGHT_COLOR__DOUBLE:
				return getSunLightColor((Double)arguments.get(0));
			case ApogySurfaceEnvironmentUIPackage.ENVIRONMENT_UI_UTILITIES___GET_SKY_TRANSPARENCY__DOUBLE:
				return getSkyTransparency((Double)arguments.get(0));
			case ApogySurfaceEnvironmentUIPackage.ENVIRONMENT_UI_UTILITIES___GET_SKY_COLOR__DOUBLE:
				return getSkyColor((Double)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EnvironmentUIUtilitiesImpl
