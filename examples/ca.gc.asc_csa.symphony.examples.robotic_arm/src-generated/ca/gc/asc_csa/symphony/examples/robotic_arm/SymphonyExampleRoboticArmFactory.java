/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.symphony.examples.robotic_arm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.symphony.examples.robotic_arm.SymphonyExampleRoboticArmPackage
 * @generated
 */
public interface SymphonyExampleRoboticArmFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  SymphonyExampleRoboticArmFactory eINSTANCE = ca.gc.asc_csa.symphony.examples.robotic_arm.impl.SymphonyExampleRoboticArmFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Robotic Arm Symphony System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robotic Arm Symphony System Api Adapter</em>'.
	 * @generated
	 */
  RoboticArmSymphonySystemApiAdapter createRoboticArmSymphonySystemApiAdapter();

  /**
	 * Returns a new object of class '<em>Robotic Arm Data</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robotic Arm Data</em>'.
	 * @generated
	 */
  RoboticArmData createRoboticArmData();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  SymphonyExampleRoboticArmPackage getSymphonyExampleRoboticArmPackage();

} //SymphonyExampleRoboticArmFactory
