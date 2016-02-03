package ca.gc.asc_csa.apogy.core;
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

import ca.gc.asc_csa.apogy.common.topology.TransformNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Of Interest Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.FeatureOfInterestNode#getFeatureOfInterest <em>Feature Of Interest</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getFeatureOfInterestNode()
 * @model
 * @generated
 */
public interface FeatureOfInterestNode extends TransformNode {
	/**
	 * Returns the value of the '<em><b>Feature Of Interest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Feature Of Interest represented by this node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Of Interest</em>' reference.
	 * @see #setFeatureOfInterest(FeatureOfInterest)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getFeatureOfInterestNode_FeatureOfInterest()
	 * @model transient="true"
	 * @generated
	 */
	FeatureOfInterest getFeatureOfInterest();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.FeatureOfInterestNode#getFeatureOfInterest <em>Feature Of Interest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Of Interest</em>' reference.
	 * @see #getFeatureOfInterest()
	 * @generated
	 */
	void setFeatureOfInterest(FeatureOfInterest value);

} // FeatureOfInterestNode
