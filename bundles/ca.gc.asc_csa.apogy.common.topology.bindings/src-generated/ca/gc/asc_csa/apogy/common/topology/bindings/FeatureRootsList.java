package ca.gc.asc_csa.apogy.common.topology.bindings;
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
import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.emf.TreeRootNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Roots List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines Feature Roots Lists used to define all the
 * feature used by the Bindings in a BindingSet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.FeatureRootsList#getFeatureRoots <em>Feature Roots</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getFeatureRootsList()
 * @model
 * @generated
 */
public interface FeatureRootsList extends EObject
{
  /**
	 * Returns the value of the '<em><b>Feature Roots</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.common.emf.TreeRootNode}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Roots</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Roots</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getFeatureRootsList_FeatureRoots()
	 * @model containment="true"
	 * @generated
	 */
  EList<TreeRootNode> getFeatureRoots();

} // FeatureRootsList
