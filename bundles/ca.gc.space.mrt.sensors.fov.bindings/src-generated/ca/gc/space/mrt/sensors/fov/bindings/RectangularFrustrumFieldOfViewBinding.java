/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.space.mrt.sensors.fov.bindings;

import ca.gc.asc_csa.topology.bindings.AbstractTopologyBinding;
import ca.gc.space.mrt.sensors.fov.RectangularFrustrumFieldOfView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangular Frustrum Field Of View Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Binding that binds a RectangularFrustrumFieldOfViewBinding to another RectangularFrustrumFieldOfViewBinding.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.fov.bindings.RectangularFrustrumFieldOfViewBinding#getFov <em>Fov</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.fov.bindings.MRTFOVBindingsPackage#getRectangularFrustrumFieldOfViewBinding()
 * @model
 * @generated
 */
public interface RectangularFrustrumFieldOfViewBinding extends AbstractTopologyBinding
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
	 * @see #setFov(RectangularFrustrumFieldOfView)
	 * @see ca.gc.space.mrt.sensors.fov.bindings.MRTFOVBindingsPackage#getRectangularFrustrumFieldOfViewBinding_Fov()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='DESTINATION'"
	 * @generated
	 */
  RectangularFrustrumFieldOfView getFov();

  /**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.fov.bindings.RectangularFrustrumFieldOfViewBinding#getFov <em>Fov</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fov</em>' reference.
	 * @see #getFov()
	 * @generated
	 */
  void setFov(RectangularFrustrumFieldOfView value);

} // RectangularFrustrumFieldOfViewBinding
