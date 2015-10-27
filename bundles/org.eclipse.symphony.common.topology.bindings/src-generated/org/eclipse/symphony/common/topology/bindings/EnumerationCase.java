/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.bindings;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.topology.Node;

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
 *   <li>{@link org.eclipse.symphony.common.topology.bindings.EnumerationCase#getEnumerationLiterals <em>Enumeration Literals</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.bindings.EnumerationCase#getTopologyRoot <em>Topology Root</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.topology.bindings.Symphony__CommonTopologyBindingsPackage#getEnumerationCase()
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
	 * @see org.eclipse.symphony.common.topology.bindings.Symphony__CommonTopologyBindingsPackage#getEnumerationCase_EnumerationLiterals()
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
	 * @see org.eclipse.symphony.common.topology.bindings.Symphony__CommonTopologyBindingsPackage#getEnumerationCase_TopologyRoot()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true'"
	 * @generated
	 */
  Node getTopologyRoot();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.bindings.EnumerationCase#getTopologyRoot <em>Topology Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology Root</em>' containment reference.
	 * @see #getTopologyRoot()
	 * @generated
	 */
  void setTopologyRoot(Node value);

} // EnumerationCase
