/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.vehicle;

import ca.gc.asc_csa.topology.dynamics.PhysicalBody;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lander Spherical Foot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.vehicle.LanderSphericalFoot#getRadius <em>Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.tools.vehicle.SymphonyToolsVehiclePackage#getLanderSphericalFoot()
 * @model
 * @generated
 */
public interface LanderSphericalFoot extends PhysicalBody
{
  /**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * The default value is <code>"0.01"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Radius</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see ca.gc.asc_csa.symphony.tools.vehicle.SymphonyToolsVehiclePackage#getLanderSphericalFoot_Radius()
	 * @model default="0.01" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='m'"
	 * @generated
	 */
  double getRadius();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.vehicle.LanderSphericalFoot#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
  void setRadius(double value);

} // LanderSphericalFoot
