package ca.gc.asc_csa.apogy.addons.telecoms;
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Conical Radiation Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A simple radiation pattern defined as a rectangular frustum. Outside the frustum, gain is null.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.SimpleConicalRadiationPattern#getApexAngle <em>Apex Angle</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getSimpleConicalRadiationPattern()
 * @model
 * @generated
 */
public interface SimpleConicalRadiationPattern extends AbstractAntennaRadiationPattern {
	/**
	 * Returns the value of the '<em><b>Apex Angle</b></em>' attribute.
	 * The default value is <code>"0.79"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apex Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The apex angle of the cone. The cone is pointing toward +Z.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Apex Angle</em>' attribute.
	 * @see #setApexAngle(double)
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getSimpleConicalRadiationPattern_ApexAngle()
	 * @model default="0.79" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
	double getApexAngle();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.telecoms.SimpleConicalRadiationPattern#getApexAngle <em>Apex Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apex Angle</em>' attribute.
	 * @see #getApexAngle()
	 * @generated
	 */
	void setApexAngle(double value);

} // SimpleConicalRadiationPattern
