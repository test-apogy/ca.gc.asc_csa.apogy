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
 * A representation of the model object '<em><b>Simple Rectangular Frustum Radiation Pattern</b></em>'.
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
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.SimpleRectangularFrustumRadiationPattern#getHorizontalFieldOfView <em>Horizontal Field Of View</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.SimpleRectangularFrustumRadiationPattern#getVerticalFieldOfView <em>Vertical Field Of View</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getSimpleRectangularFrustumRadiationPattern()
 * @model
 * @generated
 */
public interface SimpleRectangularFrustumRadiationPattern extends AbstractAntennaRadiationPattern {
	/**
	 * Returns the value of the '<em><b>Horizontal Field Of View</b></em>' attribute.
	 * The default value is <code>"0.79"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Field Of View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Horizontal field of view angle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Field Of View</em>' attribute.
	 * @see #setHorizontalFieldOfView(double)
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getSimpleRectangularFrustumRadiationPattern_HorizontalFieldOfView()
	 * @model default="0.79" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
	double getHorizontalFieldOfView();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.telecoms.SimpleRectangularFrustumRadiationPattern#getHorizontalFieldOfView <em>Horizontal Field Of View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Field Of View</em>' attribute.
	 * @see #getHorizontalFieldOfView()
	 * @generated
	 */
	void setHorizontalFieldOfView(double value);

	/**
	 * Returns the value of the '<em><b>Vertical Field Of View</b></em>' attribute.
	 * The default value is <code>"1.57"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Field Of View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vertical field of view angle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Field Of View</em>' attribute.
	 * @see #setVerticalFieldOfView(double)
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getSimpleRectangularFrustumRadiationPattern_VerticalFieldOfView()
	 * @model default="1.57" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
	double getVerticalFieldOfView();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.telecoms.SimpleRectangularFrustumRadiationPattern#getVerticalFieldOfView <em>Vertical Field Of View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Field Of View</em>' attribute.
	 * @see #getVerticalFieldOfView()
	 * @generated
	 */
	void setVerticalFieldOfView(double value);

} // SimpleRectangularFrustumRadiationPattern
