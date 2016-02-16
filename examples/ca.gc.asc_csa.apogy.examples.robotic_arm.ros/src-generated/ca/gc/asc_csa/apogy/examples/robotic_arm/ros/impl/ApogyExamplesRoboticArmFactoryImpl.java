/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2016
 */
package ca.gc.asc_csa.apogy.examples.robotic_arm.ros.impl;

import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesRoboticArmFactoryImpl extends EFactoryImpl implements ApogyExamplesRoboticArmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyExamplesRoboticArmFactory init() {
		try {
			ApogyExamplesRoboticArmFactory theApogyExamplesRoboticArmFactory = (ApogyExamplesRoboticArmFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyExamplesRoboticArmPackage.eNS_URI);
			if (theApogyExamplesRoboticArmFactory != null) {
				return theApogyExamplesRoboticArmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyExamplesRoboticArmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesRoboticArmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ApogyExamplesRoboticArmPackage.ROBOTIC_ARM_ROS: return createRoboticArmROS();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboticArmROS createRoboticArmROS() {
		RoboticArmROSImpl roboticArmROS = new RoboticArmROSImpl();
		return roboticArmROS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesRoboticArmPackage getApogyExamplesRoboticArmPackage() {
		return (ApogyExamplesRoboticArmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyExamplesRoboticArmPackage getPackage() {
		return ApogyExamplesRoboticArmPackage.eINSTANCE;
	}

} //ApogyExamplesRoboticArmFactoryImpl
