/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.examples.mobile_platform;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.mobile_platform.PowerSystem#getCurrentVoltage <em>Current Voltage</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.mobile_platform.PowerSystem#getCurrentCurrent <em>Current Current</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.mobile_platform.EMFEcoreExampleMobilePlatformPackage#getPowerSystem()
 * @model
 * @generated
 */
public interface PowerSystem extends EObject
{
  /**
   * Returns the value of the '<em><b>Current Voltage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Current Voltage</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   *  Current output voltage.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Current Voltage</em>' attribute.
   * @see #setCurrentVoltage(double)
   * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.mobile_platform.EMFEcoreExampleMobilePlatformPackage#getPowerSystem_CurrentVoltage()
   * @model unique="false"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' csa_units='V'"
   * @generated
   */
  double getCurrentVoltage();

  /**
   * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.mobile_platform.PowerSystem#getCurrentVoltage <em>Current Voltage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Current Voltage</em>' attribute.
   * @see #getCurrentVoltage()
   * @generated
   */
  void setCurrentVoltage(double value);

  /**
   * Returns the value of the '<em><b>Current Current</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Current Current</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   *  Current output current.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Current Current</em>' attribute.
   * @see #setCurrentCurrent(double)
   * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.mobile_platform.EMFEcoreExampleMobilePlatformPackage#getPowerSystem_CurrentCurrent()
   * @model unique="false"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' csa_units='V'"
   * @generated
   */
  double getCurrentCurrent();

  /**
   * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.mobile_platform.PowerSystem#getCurrentCurrent <em>Current Current</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Current Current</em>' attribute.
   * @see #getCurrentCurrent()
   * @generated
   */
  void setCurrentCurrent(double value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Turns the Power System ON.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.System%>.out.println(\"PowerSystem.turnOn()\");\nthis.setCurrentVoltage(10.0);\nthis.setCurrentCurrent(2);'"
   * @generated
   */
  void turnOn();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Turns the Power System OFF.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.System%>.out.println(\"PowerSystem.turnOff()\");\nthis.setCurrentVoltage(0.0);\nthis.setCurrentCurrent(0);'"
   * @generated
   */
  void turnOff();

} // PowerSystem
