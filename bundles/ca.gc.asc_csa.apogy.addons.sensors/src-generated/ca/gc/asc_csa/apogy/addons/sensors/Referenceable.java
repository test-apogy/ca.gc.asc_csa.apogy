package ca.gc.asc_csa.apogy.addons.sensors;
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

import ca.gc.asc_csa.apogy.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenceable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.Referenceable#getReferenceFrame <em>Reference Frame</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.ApogyAddonsSensorsPackage#getReferenceable()
 * @model
 * @generated
 */
public interface Referenceable extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference Frame</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Frame</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Frame</em>' reference.
	 * @see #setReferenceFrame(Node)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.ApogyAddonsSensorsPackage#getReferenceable_ReferenceFrame()
	 * @model
	 * @generated
	 */
	Node getReferenceFrame();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.Referenceable#getReferenceFrame <em>Reference Frame</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Frame</em>' reference.
	 * @see #getReferenceFrame()
	 * @generated
	 */
	void setReferenceFrame(Node value);

} // Referenceable
