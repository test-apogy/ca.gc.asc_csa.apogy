package ca.gc.asc_csa.apogy.addons.sensors.range;
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
 * A representation of the model object '<em><b>Contact Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.range.ContactSensor#isContacted <em>Contacted</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage#getContactSensor()
 * @model
 * @generated
 */
public interface ContactSensor extends RangeSensor {
	/**
	 * Returns the value of the '<em><b>Contacted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contacted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contacted</em>' attribute.
	 * @see #setContacted(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage#getContactSensor_Contacted()
	 * @model unique="false"
	 * @generated
	 */
	boolean isContacted();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.range.ContactSensor#isContacted <em>Contacted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contacted</em>' attribute.
	 * @see #isContacted()
	 * @generated
	 */
	void setContacted(boolean value);

} // ContactSensor
