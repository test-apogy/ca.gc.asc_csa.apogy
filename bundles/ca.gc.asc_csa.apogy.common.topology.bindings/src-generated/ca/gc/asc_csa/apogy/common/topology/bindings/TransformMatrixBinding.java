/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.topology.bindings;

import ca.gc.asc_csa.apogy.common.topology.TransformNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transform Matrix Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Binding that binds a TransformNode transform to a feature value.
 * The feature value must be of type Matrix4x4.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.TransformMatrixBinding#getTransformNode <em>Transform Node</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getTransformMatrixBinding()
 * @model
 * @generated
 */
public interface TransformMatrixBinding extends AbstractTopologyBinding
{
  /**
	 * Returns the value of the '<em><b>Transform Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transform Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TransformNode that will be updated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transform Node</em>' reference.
	 * @see #setTransformNode(TransformNode)
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getTransformMatrixBinding_TransformNode()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='DESTINATION'"
	 * @generated
	 */
  TransformNode getTransformNode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.TransformMatrixBinding#getTransformNode <em>Transform Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform Node</em>' reference.
	 * @see #getTransformNode()
	 * @generated
	 */
  void setTransformNode(TransformNode value);

} // TransformMatrixBinding
