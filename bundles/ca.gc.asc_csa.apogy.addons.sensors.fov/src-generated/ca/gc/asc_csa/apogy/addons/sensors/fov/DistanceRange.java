package ca.gc.asc_csa.apogy.addons.sensors.fov;
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.DistanceRange#getMinimumDistance <em>Minimum Distance</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.DistanceRange#getMaximumDistance <em>Maximum Distance</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.DistanceRange#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage#getDistanceRange()
 * @model
 * @generated
 */
public interface DistanceRange extends EObject {
	/**
	 * Returns the value of the '<em><b>Minimum Distance</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Distance</em>' attribute.
	 * @see #setMinimumDistance(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage#getDistanceRange_MinimumDistance()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getMinimumDistance();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.DistanceRange#getMinimumDistance <em>Minimum Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Distance</em>' attribute.
	 * @see #getMinimumDistance()
	 * @generated
	 */
	void setMinimumDistance(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Distance</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Distance</em>' attribute.
	 * @see #setMaximumDistance(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage#getDistanceRange_MaximumDistance()
	 * @model default="1.0" unique="false"
	 * @generated
	 */
	double getMaximumDistance();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.DistanceRange#getMaximumDistance <em>Maximum Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Distance</em>' attribute.
	 * @see #getMaximumDistance()
	 * @generated
	 */
	void setMaximumDistance(double value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage#getDistanceRange_Distance()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getDistance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns whether or not the specified distance falls within the range.
	 * <!-- end-model-doc -->
	 * @model unique="false" distanceUnique="false"
	 * @generated
	 */
	boolean isWithinRange(double distance);

} // DistanceRange
