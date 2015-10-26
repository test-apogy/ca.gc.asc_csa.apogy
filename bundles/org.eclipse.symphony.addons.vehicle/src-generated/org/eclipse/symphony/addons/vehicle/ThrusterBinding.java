/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle;

import org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thruster Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.ThrusterBinding#getThruster <em>Thruster</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage#getThrusterBinding()
 * @model
 * @generated
 */
public interface ThrusterBinding extends AbstractTopologyBinding
{
  /**
	 * Returns the value of the '<em><b>Thruster</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Thruster</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Thruster</em>' reference.
	 * @see #setThruster(Thruster)
	 * @see org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage#getThrusterBinding_Thruster()
	 * @model
	 * @generated
	 */
  Thruster getThruster();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.ThrusterBinding#getThruster <em>Thruster</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thruster</em>' reference.
	 * @see #getThruster()
	 * @generated
	 */
  void setThruster(Thruster value);

} // ThrusterBinding
