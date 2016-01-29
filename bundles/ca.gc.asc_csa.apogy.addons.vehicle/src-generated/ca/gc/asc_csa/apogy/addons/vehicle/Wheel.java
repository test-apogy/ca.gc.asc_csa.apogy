/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.vehicle;

import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wheel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class that represent a physical wheel used to model Wheel to Mesh contact.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.Wheel#getRadius <em>Radius</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.Wheel#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getWheel()
 * @model
 * @generated
 */
public interface Wheel extends PhysicalBody
{
  /**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * The default value is <code>"0.25"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Radius</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getWheel_Radius()
	 * @model default="0.25" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='m'"
	 * @generated
	 */
  double getRadius();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.Wheel#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
  void setRadius(double value);

  /**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(double)
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getWheel_Length()
	 * @model default="0.1" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='m'"
	 * @generated
	 */
	double getLength();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.Wheel#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(double value);

} // Wheel