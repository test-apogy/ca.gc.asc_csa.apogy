/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.core.environment.earth.surface.ui;

import javax.vecmath.Color3f;
import javax.vecmath.Point3f;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.core.environment.Star;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.EnvironmentUIUtilitiesImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment UI Utilities</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.ApogyCoreEnvironmentSurfaceEarthUIPackage#getEnvironmentUIUtilities()
 * @model
 * @generated
 */
public interface EnvironmentUIUtilities extends EObject 
{
	public static EnvironmentUIUtilities INSTANCE = EnvironmentUIUtilitiesImpl.getInstance();
	
	public static final float POGSON_RATIO = (float) Math.pow(100, 0.2);

	public static final double LOWER_SUN_ALTITUDE_FOR_TRANSPARENCY = Math.toRadians(-5.0);
	public static final double LOWER_SUN_ALTITUDE_TRANSPARENCY = 1.0;
	public static final double UPPER_SUN_ALTITUDE_FOR_TRANSPARENCY = Math.toRadians(0.0);
	public static final double UPPER_SUN_ALTITUDE_TRANSPARENCY = 0.0;

	public static final Color3f DAY_SKY_COLOR = new Color3f(0, 0, 1);
	public static final Color3f SUNSET_SKY_COLOR = new Color3f(((float)  201 / 255), 0 , 1);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.Point3f" unique="false" starUnique="false"
	 * @generated
	 */
	Point3f toPoint3f(Star star);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" magnitudeUnique="false" magnitudeRangeMinimumUnique="false" magnitudeRangeMaximumUnique="false" minimumPointSizeUnique="false" maximumPointSizeUnique="false"
	 * @generated
	 */
	float getPointSizeForMagnitude(float magnitude, float magnitudeRangeMinimum, float magnitudeRangeMaximum, float minimumPointSize, float maximumPointSize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the sun color for a given altitude above the horizon.
	 * @param sunAltitude The altitude above the horizon, in radians.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.Color3f" unique="false" sunAltitudeUnique="false"
	 *        sunAltitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
	Color3f getSunLightColor(double sunAltitude);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the transparency value (between no transparency 0 and full transparency 1.0)
	 * to be used for the blus sky as a function of the sun altitude angle.
	 * @param sunAltitude The altitude above the horizon, in radians.
	 * <!-- end-model-doc -->
	 * @model unique="false" sunAltitudeUnique="false"
	 *        sunAltitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
	double getSkyTransparency(double sunAltitude);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the sky color for a given altitude above the horizon.
	 * @param sunAltitude The altitude above the horizon, in radians.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.Color3f" unique="false" sunAltitudeUnique="false"
	 *        sunAltitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
	Color3f getSkyColor(double sunAltitude);

} // EnvironmentUIUtilities
