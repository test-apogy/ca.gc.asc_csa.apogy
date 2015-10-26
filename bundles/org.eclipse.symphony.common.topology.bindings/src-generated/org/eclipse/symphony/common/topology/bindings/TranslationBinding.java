/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.bindings;

import org.eclipse.symphony.common.topology.PositionNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Translation Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Binding that binds a PositionNode translation along one axis to the feature value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.bindings.TranslationBinding#getPositionNode <em>Position Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.bindings.TranslationBinding#getTranslationAxis <em>Translation Axis</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.topology.bindings.TopologyBindingsPackage#getTranslationBinding()
 * @model
 * @generated
 */
public interface TranslationBinding extends AbstractTopologyBinding
{
  /**
	 * Returns the value of the '<em><b>Translation Axis</b></em>' attribute.
	 * The default value is <code>"X_AXIS"</code>.
	 * The literals are from the enumeration {@link org.eclipse.symphony.common.topology.bindings.AXIS}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Translation Axis</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The axis along which the translation occurs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Translation Axis</em>' attribute.
	 * @see org.eclipse.symphony.common.topology.bindings.AXIS
	 * @see #setTranslationAxis(AXIS)
	 * @see org.eclipse.symphony.common.topology.bindings.TopologyBindingsPackage#getTranslationBinding_TranslationAxis()
	 * @model default="X_AXIS" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='DESTINATION'"
	 * @generated
	 */
  AXIS getTranslationAxis();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.bindings.TranslationBinding#getTranslationAxis <em>Translation Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation Axis</em>' attribute.
	 * @see org.eclipse.symphony.common.topology.bindings.AXIS
	 * @see #getTranslationAxis()
	 * @generated
	 */
  void setTranslationAxis(AXIS value);

  /**
	 * Returns the value of the '<em><b>Position Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Position Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PositionNode that will be updated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position Node</em>' reference.
	 * @see #setPositionNode(PositionNode)
	 * @see org.eclipse.symphony.common.topology.bindings.TopologyBindingsPackage#getTranslationBinding_PositionNode()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='DESTINATION'"
	 * @generated
	 */
  PositionNode getPositionNode();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.bindings.TranslationBinding#getPositionNode <em>Position Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Node</em>' reference.
	 * @see #getPositionNode()
	 * @generated
	 */
  void setPositionNode(PositionNode value);

} // TranslationBinding
