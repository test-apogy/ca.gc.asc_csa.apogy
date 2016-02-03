package ca.gc.asc_csa.apogy.addons.sensors.range.ui;
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
 * A representation of the model object '<em><b>Simple Sonar Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.range.ui.SimpleSonarPresentation#isDetectedRangeVisible <em>Detected Range Visible</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.range.ui.ApogyAddonsSensorsRangeUIPackage#getSimpleSonarPresentation()
 * @model
 * @generated
 */
public interface SimpleSonarPresentation extends NodePresentation {
	/**
	 * Returns the value of the '<em><b>Detected Range Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detected Range Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detected Range Visible</em>' attribute.
	 * @see #setDetectedRangeVisible(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.range.ui.ApogyAddonsSensorsRangeUIPackage#getSimpleSonarPresentation_DetectedRangeVisible()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isDetectedRangeVisible();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.range.ui.SimpleSonarPresentation#isDetectedRangeVisible <em>Detected Range Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detected Range Visible</em>' attribute.
	 * @see #isDetectedRangeVisible()
	 * @generated
	 */
	void setDetectedRangeVisible(boolean value);

} // SimpleSonarPresentation
