/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.topology.bindings;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bindings List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Defines a list of Bindings.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.topology.bindings.BindingsList#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.topology.bindings.TopologyBindingsPackage#getBindingsList()
 * @model
 * @generated
 */
public interface BindingsList extends EObject
{
  /**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.topology.bindings.AbstractTopologyBinding}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see ca.gc.asc_csa.topology.bindings.TopologyBindingsPackage#getBindingsList_Bindings()
	 * @model containment="true"
	 * @generated
	 */
  EList<AbstractTopologyBinding> getBindings();

} // BindingsList
