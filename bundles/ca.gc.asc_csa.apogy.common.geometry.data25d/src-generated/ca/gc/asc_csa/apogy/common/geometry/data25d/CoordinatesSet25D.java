package ca.gc.asc_csa.apogy.common.geometry.data25d;
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

import ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinates Set25 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data25d.CoordinatesSet25D#isEnforceUniqueness <em>Enforce Uniqueness</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DPackage#getCoordinatesSet25D()
 * @model
 * @generated
 */
public interface CoordinatesSet25D extends CoordinatesSet<Coordinates25D> {
	/**
	 * Returns the value of the '<em><b>Enforce Uniqueness</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When this parameter is set to true, this parameter ensures
	 * that all points added are unique.  The drawback is that
	 * performance is significantly decreased.  This feature can
	 * be bypassed by setting this attribute to false.
	 * Default is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enforce Uniqueness</em>' attribute.
	 * @see #setEnforceUniqueness(boolean)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DPackage#getCoordinatesSet25D_EnforceUniqueness()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isEnforceUniqueness();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.CoordinatesSet25D#isEnforceUniqueness <em>Enforce Uniqueness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enforce Uniqueness</em>' attribute.
	 * @see #isEnforceUniqueness()
	 * @generated
	 */
	void setEnforceUniqueness(boolean value);

} // CoordinatesSet25D
