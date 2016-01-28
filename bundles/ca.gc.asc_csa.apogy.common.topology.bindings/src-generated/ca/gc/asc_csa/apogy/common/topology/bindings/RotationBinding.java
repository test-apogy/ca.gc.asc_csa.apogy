/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.topology.bindings;

import ca.gc.asc_csa.apogy.common.topology.RotationNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotation Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Binding that binds a RotationNode rotation around one axis to the feature value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.RotationBinding#getRotationNode <em>Rotation Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.RotationBinding#getRotationAxis <em>Rotation Axis</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.RotationBinding#getRotationUnits <em>Rotation Units</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getRotationBinding()
 * @model
 * @generated
 */
public interface RotationBinding extends AbstractTopologyBinding
{
  /**
	 * Returns the value of the '<em><b>Rotation Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rotation Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The RotationNode that will be updated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rotation Node</em>' reference.
	 * @see #setRotationNode(RotationNode)
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getRotationBinding_RotationNode()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='DESTINATION'"
	 * @generated
	 */
  RotationNode getRotationNode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.RotationBinding#getRotationNode <em>Rotation Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation Node</em>' reference.
	 * @see #getRotationNode()
	 * @generated
	 */
  void setRotationNode(RotationNode value);

  /**
	 * Returns the value of the '<em><b>Rotation Axis</b></em>' attribute.
	 * The default value is <code>"X_AXIS"</code>.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.common.topology.bindings.Axis}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rotation Axis</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The axis around which to revolve.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rotation Axis</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.Axis
	 * @see #setRotationAxis(Axis)
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getRotationBinding_RotationAxis()
	 * @model default="X_AXIS" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='DESTINATION'"
	 * @generated
	 */
  Axis getRotationAxis();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.RotationBinding#getRotationAxis <em>Rotation Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation Axis</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.Axis
	 * @see #getRotationAxis()
	 * @generated
	 */
  void setRotationAxis(Axis value);

  /**
	 * Returns the value of the '<em><b>Rotation Units</b></em>' attribute.
	 * The default value is <code>"DEGREES"</code>.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.common.topology.bindings.AngleUnits}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rotation Units</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The angle unit associated with the feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rotation Units</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.AngleUnits
	 * @see #setRotationUnits(AngleUnits)
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getRotationBinding_RotationUnits()
	 * @model default="DEGREES" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='DESTINATION'"
	 * @generated
	 */
  AngleUnits getRotationUnits();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.RotationBinding#getRotationUnits <em>Rotation Units</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation Units</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.AngleUnits
	 * @see #getRotationUnits()
	 * @generated
	 */
  void setRotationUnits(AngleUnits value);

} // RotationBinding
