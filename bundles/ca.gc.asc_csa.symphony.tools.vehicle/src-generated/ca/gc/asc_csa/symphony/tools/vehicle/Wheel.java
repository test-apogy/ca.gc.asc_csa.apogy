/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.vehicle;

import ca.gc.asc_csa.topology.dynamics.PhysicalBody;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wheel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Class that represent a physical wheel used to model Wheel to Mesh contact.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.vehicle.Wheel#getRadius <em>Radius</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.vehicle.Wheel#getLenght <em>Lenght</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.tools.vehicle.SymphonyToolsVehiclePackage#getWheel()
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
	 * @see ca.gc.asc_csa.symphony.tools.vehicle.SymphonyToolsVehiclePackage#getWheel_Radius()
	 * @model default="0.25" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='m'"
	 * @generated
	 */
  double getRadius();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.vehicle.Wheel#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
  void setRadius(double value);

  /**
	 * Returns the value of the '<em><b>Lenght</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lenght</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Lenght</em>' attribute.
	 * @see #setLenght(double)
	 * @see ca.gc.asc_csa.symphony.tools.vehicle.SymphonyToolsVehiclePackage#getWheel_Lenght()
	 * @model default="0.1" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='m'"
	 * @generated
	 */
  double getLenght();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.vehicle.Wheel#getLenght <em>Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lenght</em>' attribute.
	 * @see #getLenght()
	 * @generated
	 */
  void setLenght(double value);

} // Wheel
