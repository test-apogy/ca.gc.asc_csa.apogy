/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.vehicle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wheel Contact Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.WheelContactProvider#getContactMode <em>Contact Mode</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getWheelContactProvider()
 * @model
 * @generated
 */
public interface WheelContactProvider extends ContactProvider
{
  /**
	 * Returns the value of the '<em><b>Contact Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.addons.vehicle.WheelContactMode}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of wheel to Mesh contact to use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Mode</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.WheelContactMode
	 * @see #setContactMode(WheelContactMode)
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getWheelContactProvider_ContactMode()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='SETTINGS_INFO'"
	 * @generated
	 */
  WheelContactMode getContactMode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.WheelContactProvider#getContactMode <em>Contact Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mode</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.WheelContactMode
	 * @see #getContactMode()
	 * @generated
	 */
  void setContactMode(WheelContactMode value);

} // WheelContactProvider
