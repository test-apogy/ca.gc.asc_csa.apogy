/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.topology.bindings;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.eclipse.emf.ecore.TreeRootNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Roots List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Defines Feature Roots Lists used to define all the feature used by the Bindings in a BindingSet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.topology.bindings.FeatureRootsList#getFeatureRoots <em>Feature Roots</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.topology.bindings.TopologyBindingsPackage#getFeatureRootsList()
 * @model
 * @generated
 */
public interface FeatureRootsList extends EObject
{
  /**
	 * Returns the value of the '<em><b>Feature Roots</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.eclipse.emf.ecore.TreeRootNode}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Roots</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Roots</em>' containment reference list.
	 * @see ca.gc.asc_csa.topology.bindings.TopologyBindingsPackage#getFeatureRootsList_FeatureRoots()
	 * @model containment="true"
	 * @generated
	 */
  EList<TreeRootNode> getFeatureRoots();

} // FeatureRootsList
