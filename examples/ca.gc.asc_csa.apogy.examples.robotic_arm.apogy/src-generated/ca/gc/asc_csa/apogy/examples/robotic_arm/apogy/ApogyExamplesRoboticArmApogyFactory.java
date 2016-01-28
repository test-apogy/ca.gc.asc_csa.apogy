/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.robotic_arm.apogy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.ApogyExamplesRoboticArmApogyPackage
 * @generated
 */
public interface ApogyExamplesRoboticArmApogyFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyExamplesRoboticArmApogyFactory eINSTANCE = ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.impl.ApogyExamplesRoboticArmApogyFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Robotic Arm Apogy System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robotic Arm Apogy System Api Adapter</em>'.
	 * @generated
	 */
  RoboticArmApogySystemApiAdapter createRoboticArmApogySystemApiAdapter();

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
	ApogyExamplesRoboticArmApogyPackage getApogyExamplesRoboticArmApogyPackage();

} //ApogyExamplesRoboticArmApogyFactory
