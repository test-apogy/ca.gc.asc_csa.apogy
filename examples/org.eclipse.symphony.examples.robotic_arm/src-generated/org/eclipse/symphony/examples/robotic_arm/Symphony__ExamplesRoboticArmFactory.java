/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.robotic_arm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.examples.robotic_arm.Symphony__ExamplesRoboticArmPackage
 * @generated
 */
public interface Symphony__ExamplesRoboticArmFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__ExamplesRoboticArmFactory eINSTANCE = org.eclipse.symphony.examples.robotic_arm.impl.Symphony__ExamplesRoboticArmFactoryImpl.init();

	/**
	 * Returns a new RoboticArm object, which has the same type as
	 * the given robotic arm.
	 * 
	 * @param roboticArm The robotic arm with a particular implementation. 
	 * @return The new robotic arm, which has the same type as the old one
	 * @generated_NOT
	 */
	RoboticArm makeRoboticArmSameType(RoboticArm roboticArm);
	
	/**
	 * Returns a new object of class '<em>Robotic Arm Stub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robotic Arm Stub</em>'.
	 * @generated
	 */
	RoboticArmStub createRoboticArmStub();

	/**
	 * Returns a new object of class '<em>Robotic Arm Simulated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robotic Arm Simulated</em>'.
	 * @generated
	 */
	RoboticArmSimulated createRoboticArmSimulated();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__ExamplesRoboticArmPackage getSymphony__ExamplesRoboticArmPackage();

} //Symphony__ExamplesRoboticArmFactory
