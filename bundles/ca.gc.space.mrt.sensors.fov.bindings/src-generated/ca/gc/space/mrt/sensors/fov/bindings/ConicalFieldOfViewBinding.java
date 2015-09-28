/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.space.mrt.sensors.fov.bindings;

import ca.gc.asc_csa.topology.bindings.AbstractTopologyBinding;
import ca.gc.space.mrt.sensors.fov.ConicalFieldOfView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conical Field Of View Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Binding that binds a ConicalFieldOfViewBinding to another ConicalFieldOfViewBinding.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.fov.bindings.ConicalFieldOfViewBinding#getFov <em>Fov</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.fov.bindings.MRTFOVBindingsPackage#getConicalFieldOfViewBinding()
 * @model
 * @generated
 */
public interface ConicalFieldOfViewBinding extends AbstractTopologyBinding
{
  /**
	 * Returns the value of the '<em><b>Fov</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fov</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Fov</em>' reference.
	 * @see #setFov(ConicalFieldOfView)
	 * @see ca.gc.space.mrt.sensors.fov.bindings.MRTFOVBindingsPackage#getConicalFieldOfViewBinding_Fov()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='DESTINATION'"
	 * @generated
	 */
  ConicalFieldOfView getFov();

  /**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.fov.bindings.ConicalFieldOfViewBinding#getFov <em>Fov</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fov</em>' reference.
	 * @see #getFov()
	 * @generated
	 */
  void setFov(ConicalFieldOfView value);

} // ConicalFieldOfViewBinding
