/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2016
 */
package ca.gc.asc_csa.apogy.examples.robotic_arm.ros;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.ros.ApogyExamplesRoboticArmPackage
 * @generated
 */
public interface ApogyExamplesRoboticArmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyExamplesRoboticArmFactory eINSTANCE = ca.gc.asc_csa.apogy.examples.robotic_arm.ros.impl.ApogyExamplesRoboticArmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Robotic Arm ROS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robotic Arm ROS</em>'.
	 * @generated
	 */
	RoboticArmROS createRoboticArmROS();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyExamplesRoboticArmPackage getApogyExamplesRoboticArmPackage();

} //ApogyExamplesRoboticArmFactory
