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
package ca.gc.asc_csa.apogy.core.environment.surface.ui;

import javax.vecmath.Point3f;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.core.environment.Star;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.EnvironmentSurfaceUIUtilitiesImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment UI Utilities</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage#getEnvironmentSurfaceUIUtilities()
 * @model
 * @generated
 */
public interface EnvironmentSurfaceUIUtilities extends EObject 
{
	public static final float POGSON_RATIO = (float) Math.pow(100, 0.2);
	
	public static EnvironmentSurfaceUIUtilities INSTANCE = EnvironmentSurfaceUIUtilitiesImpl.getInstance();

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.surface.ui.Point3f" unique="false" starUnique="false"
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

} // EnvironmentUIUtilities
