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
 * A representation of the model object '<em><b>Rectangular Frustrum Field Of View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A field of view that has a frustrum shape. This frustrum has a
 * rectangular base and is right (its axis is perpendicular to both bases).
 * See http://en.wikipedia.org/wiki/Frustrum.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView#getRange <em>Range</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView#getHorizontalFieldOfViewAngle <em>Horizontal Field Of View Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView#getVerticalFieldOfViewAngle <em>Vertical Field Of View Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView#getVolume <em>Volume</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage#getRectangularFrustrumFieldOfView()
 * @model
 * @generated
 */
public interface RectangularFrustrumFieldOfView extends FieldOfView {
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
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage#getRectangularFrustrumFieldOfView_Range()
	 * @model containment="true"
	 * @generated
	 */
	DistanceRange getRange();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(DistanceRange value);

	/**
	 * Returns the value of the '<em><b>Horizontal Field Of View Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total horizontal field of view, in radians.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Field Of View Angle</em>' attribute.
	 * @see #setHorizontalFieldOfViewAngle(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage#getRectangularFrustrumFieldOfView_HorizontalFieldOfViewAngle()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
	double getHorizontalFieldOfViewAngle();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView#getHorizontalFieldOfViewAngle <em>Horizontal Field Of View Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Field Of View Angle</em>' attribute.
	 * @see #getHorizontalFieldOfViewAngle()
	 * @generated
	 */
	void setHorizontalFieldOfViewAngle(double value);

	/**
	 * Returns the value of the '<em><b>Vertical Field Of View Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total vertical field of view, in radians.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Field Of View Angle</em>' attribute.
	 * @see #setVerticalFieldOfViewAngle(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage#getRectangularFrustrumFieldOfView_VerticalFieldOfViewAngle()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
	double getVerticalFieldOfViewAngle();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView#getVerticalFieldOfViewAngle <em>Vertical Field Of View Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Field Of View Angle</em>' attribute.
	 * @see #getVerticalFieldOfViewAngle()
	 * @generated
	 */
	void setVerticalFieldOfViewAngle(double value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The volume of the contained within the field of view.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage#getRectangularFrustrumFieldOfView_Volume()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getVolume();

} // RectangularFrustrumFieldOfView
