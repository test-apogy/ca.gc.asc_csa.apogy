/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.fov.bindings;

import org.eclipse.symphony.addons.sensors.fov.CircularSectorFieldOfView;
import org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circular Sector Field Of View Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Binding that binds a CircularSectorFieldOfView to another CircularSectorFieldOfView.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.fov.bindings.CircularSectorFieldOfViewBinding#getFov <em>Fov</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.sensors.fov.bindings.MRTFOVBindingsPackage#getCircularSectorFieldOfViewBinding()
 * @model
 * @generated
 */
public interface CircularSectorFieldOfViewBinding extends AbstractTopologyBinding
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
	 * @see #setFov(CircularSectorFieldOfView)
	 * @see org.eclipse.symphony.addons.sensors.fov.bindings.MRTFOVBindingsPackage#getCircularSectorFieldOfViewBinding_Fov()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='DESTINATION'"
	 * @generated
	 */
  CircularSectorFieldOfView getFov();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.fov.bindings.CircularSectorFieldOfViewBinding#getFov <em>Fov</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fov</em>' reference.
	 * @see #getFov()
	 * @generated
	 */
  void setFov(CircularSectorFieldOfView value);

} // CircularSectorFieldOfViewBinding
