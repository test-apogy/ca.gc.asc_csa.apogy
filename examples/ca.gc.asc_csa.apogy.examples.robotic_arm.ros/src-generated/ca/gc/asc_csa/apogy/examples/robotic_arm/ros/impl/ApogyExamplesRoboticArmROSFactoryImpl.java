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
public class ApogyExamplesRoboticArmROSFactoryImpl extends EFactoryImpl implements ApogyExamplesRoboticArmROSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyExamplesRoboticArmROSFactory init() {
		try {
			ApogyExamplesRoboticArmROSFactory theApogyExamplesRoboticArmROSFactory = (ApogyExamplesRoboticArmROSFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyExamplesRoboticArmROSPackage.eNS_URI);
			if (theApogyExamplesRoboticArmROSFactory != null) {
				return theApogyExamplesRoboticArmROSFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyExamplesRoboticArmROSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesRoboticArmROSFactoryImpl() {
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
			case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS: return createRoboticArmROS();
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
	public ApogyExamplesRoboticArmROSPackage getApogyExamplesRoboticArmROSPackage() {
		return (ApogyExamplesRoboticArmROSPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyExamplesRoboticArmROSPackage getPackage() {
		return ApogyExamplesRoboticArmROSPackage.eINSTANCE;
	}

} //ApogyExamplesRoboticArmROSFactoryImpl
