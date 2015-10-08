/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wheel Contact Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.WheelContactProvider#getContactMode <em>Contact Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage#getWheelContactProvider()
 * @model
 * @generated
 */
public interface WheelContactProvider extends ContactProvider
{
  /**
	 * Returns the value of the '<em><b>Contact Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.symphony.addons.vehicle.WheelContactMode}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The type of wheel to Mesh contact to use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Mode</em>' attribute.
	 * @see org.eclipse.symphony.addons.vehicle.WheelContactMode
	 * @see #setContactMode(WheelContactMode)
	 * @see org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage#getWheelContactProvider_ContactMode()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='SETTINGS_INFO'"
	 * @generated
	 */
  WheelContactMode getContactMode();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.WheelContactProvider#getContactMode <em>Contact Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mode</em>' attribute.
	 * @see org.eclipse.symphony.addons.vehicle.WheelContactMode
	 * @see #getContactMode()
	 * @generated
	 */
  void setContactMode(WheelContactMode value);

} // WheelContactProvider
