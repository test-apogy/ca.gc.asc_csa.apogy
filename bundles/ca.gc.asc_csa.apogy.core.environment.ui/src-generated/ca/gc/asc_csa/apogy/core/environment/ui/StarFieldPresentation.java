/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.core.environment.ui;

import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Star Field Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.StarFieldPresentation#getCutOffMagnitude <em>Cut Off Magnitude</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getStarFieldPresentation()
 * @model
 * @generated
 */
public interface StarFieldPresentation extends NodePresentation {
	/**
	 * Returns the value of the '<em><b>Cut Off Magnitude</b></em>' attribute.
	 * The default value is <code>"6.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cut Off Magnitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cut Off Magnitude</em>' attribute.
	 * @see #setCutOffMagnitude(float)
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getStarFieldPresentation_CutOffMagnitude()
	 * @model default="6.0" unique="false"
	 * @generated
	 */
	float getCutOffMagnitude();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ui.StarFieldPresentation#getCutOffMagnitude <em>Cut Off Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Off Magnitude</em>' attribute.
	 * @see #getCutOffMagnitude()
	 * @generated
	 */
	void setCutOffMagnitude(float value);

} // StarFieldPresentation
