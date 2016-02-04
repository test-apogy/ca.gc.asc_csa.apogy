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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circular Sector Field Of View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A field of view shaped like a circular sector;
 * for more info, see http://en.wikipedia.org/wiki/Circular_sector.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.CircularSectorFieldOfView#getRange <em>Range</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.CircularSectorFieldOfView#getAngularSpan <em>Angular Span</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.CircularSectorFieldOfView#getArea <em>Area</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage#getCircularSectorFieldOfView()
 * @model
 * @generated
 */
public interface CircularSectorFieldOfView extends FieldOfView {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(DistanceRange)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage#getCircularSectorFieldOfView_Range()
	 * @model containment="true"
	 * @generated
	 */
	DistanceRange getRange();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.CircularSectorFieldOfView#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(DistanceRange value);

	/**
	 * Returns the value of the '<em><b>Angular Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angular Span</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angular Span</em>' containment reference.
	 * @see #setAngularSpan(AngularSpan)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage#getCircularSectorFieldOfView_AngularSpan()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AngularSpan getAngularSpan();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.CircularSectorFieldOfView#getAngularSpan <em>Angular Span</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular Span</em>' containment reference.
	 * @see #getAngularSpan()
	 * @generated
	 */
	void setAngularSpan(AngularSpan value);

	/**
	 * Returns the value of the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The area of the circular sector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage#getCircularSectorFieldOfView_Area()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getArea();

} // CircularSectorFieldOfView
