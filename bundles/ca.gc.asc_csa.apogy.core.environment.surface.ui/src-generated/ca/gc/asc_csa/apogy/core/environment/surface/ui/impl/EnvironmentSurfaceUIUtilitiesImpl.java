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
import ca.gc.asc_csa.apogy.core.environment.surface.ui.EnvironmentSurfaceUIUtilities;

import java.lang.reflect.InvocationTargetException;
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
public class EnvironmentSurfaceUIUtilitiesImpl extends MinimalEObjectImpl.Container implements EnvironmentSurfaceUIUtilities 
{
	private static EnvironmentSurfaceUIUtilitiesImpl instance = null;
	public static EnvironmentSurfaceUIUtilitiesImpl getInstance() {
		if (instance == null) {
			instance = new EnvironmentSurfaceUIUtilitiesImpl();
		}
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentSurfaceUIUtilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogySurfaceEnvironmentUIPackage.Literals.ENVIRONMENT_SURFACE_UI_UTILITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Point3f toPoint3f(Star star) 
	{
		float r = 1.0f;
		float x = r * (float) (Math.cos(star.getEquatorialCoordinates().getDeclination()) * Math.cos(star.getEquatorialCoordinates().getRightAscension()));
		float y = r * (float) (Math.cos(star.getEquatorialCoordinates().getDeclination()) * Math.sin(star.getEquatorialCoordinates().getRightAscension()));
		float z = r * (float) Math.sin(star.getEquatorialCoordinates().getDeclination());
		Point3f p = new Point3f(x, y, z);						
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public float getPointSizeForMagnitude(float magnitude, float magnitudeRangeMinimum, float magnitudeRangeMaximum, float minimumPointSize, float maximumPointSize) 
	{
		float radiusRange = (float) Math.sqrt(Math.pow(POGSON_RATIO, magnitudeRangeMaximum - magnitudeRangeMinimum));
		
		float luminosity = (float) Math.pow(POGSON_RATIO, magnitudeRangeMaximum - magnitude);
		
		float radius = (float) ((Math.sqrt(luminosity) / radiusRange) * (maximumPointSize - minimumPointSize) + minimumPointSize);
		
		return radius;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogySurfaceEnvironmentUIPackage.ENVIRONMENT_SURFACE_UI_UTILITIES___TO_POINT3F__STAR:
				return toPoint3f((Star)arguments.get(0));
			case ApogySurfaceEnvironmentUIPackage.ENVIRONMENT_SURFACE_UI_UTILITIES___GET_POINT_SIZE_FOR_MAGNITUDE__FLOAT_FLOAT_FLOAT_FLOAT_FLOAT:
				return getPointSizeForMagnitude((Float)arguments.get(0), (Float)arguments.get(1), (Float)arguments.get(2), (Float)arguments.get(3), (Float)arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EnvironmentUIUtilitiesImpl
