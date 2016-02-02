package ca.gc.asc_csa.apogy.addons.sensors.pose.ui;
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

import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orientation Sensor Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.ui.OrientationSensorPresentation#isFrameVisible <em>Frame Visible</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.pose.ui.ApogyAddonsSensorsPoseUIPackage#getOrientationSensorPresentation()
 * @model
 * @generated
 */
public interface OrientationSensorPresentation extends NodePresentation {
	/**
	 * Returns the value of the '<em><b>Frame Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Visible</em>' attribute.
	 * @see #setFrameVisible(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.pose.ui.ApogyAddonsSensorsPoseUIPackage#getOrientationSensorPresentation_FrameVisible()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isFrameVisible();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.pose.ui.OrientationSensorPresentation#isFrameVisible <em>Frame Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Visible</em>' attribute.
	 * @see #isFrameVisible()
	 * @generated
	 */
	void setFrameVisible(boolean value);

} // OrientationSensorPresentation
