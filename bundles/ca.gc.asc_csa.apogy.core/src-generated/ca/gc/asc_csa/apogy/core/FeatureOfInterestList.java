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

import org.eclipse.emf.common.util.EList;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Of Interest List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * List of Feature Of Interest
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.FeatureOfInterestList#getFeaturesOfInterest <em>Features Of Interest</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getFeatureOfInterestList()
 * @model
 * @generated
 */
public interface FeatureOfInterestList extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Features Of Interest</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.FeatureOfInterest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features Of Interest</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features Of Interest</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getFeatureOfInterestList_FeaturesOfInterest()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureOfInterest> getFeaturesOfInterest();

} // FeatureOfInterestList
