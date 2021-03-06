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
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class that defines Enumeration Case used by the EnumerationSwitchBinding.
 * Its associates a sub-topology to an enumeration literal value(s).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationCase#getEnumerationLiterals <em>Enumeration Literals</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationCase#getTopologyRoot <em>Topology Root</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getEnumerationCase()
 * @model
 * @generated
 */
public interface EnumerationCase extends EObject
{
  /**
	 * Returns the value of the '<em><b>Enumeration Literals</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EEnumLiteral}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The enumeration value(s) for this case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enumeration Literals</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getEnumerationCase_EnumerationLiterals()
	 * @model required="true"
	 * @generated
	 */
  EList<EEnumLiteral> getEnumerationLiterals();

  /**
	 * Returns the value of the '<em><b>Topology Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The root of the topology to add to the parent Node
	 * when this case is activated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topology Root</em>' containment reference.
	 * @see #setTopologyRoot(Node)
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getEnumerationCase_TopologyRoot()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true'"
	 * @generated
	 */
  Node getTopologyRoot();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationCase#getTopologyRoot <em>Topology Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology Root</em>' containment reference.
	 * @see #getTopologyRoot()
	 * @generated
	 */
  void setTopologyRoot(Node value);

} // EnumerationCase
