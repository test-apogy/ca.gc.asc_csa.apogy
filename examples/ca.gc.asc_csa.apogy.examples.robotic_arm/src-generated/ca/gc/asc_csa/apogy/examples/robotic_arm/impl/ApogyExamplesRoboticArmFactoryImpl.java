/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.robotic_arm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.examples.robotic_arm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesRoboticArmFactoryImpl extends EFactoryImpl implements ApogyExamplesRoboticArmFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyExamplesRoboticArmFactory init()
	{
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
	public ApogyExamplesRoboticArmFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID()) {
			case ApogyExamplesRoboticArmPackage.ROBOTIC_ARM_STUB: return createRoboticArmStub();
			case ApogyExamplesRoboticArmPackage.ROBOTIC_ARM_SIMULATED: return createRoboticArmSimulated();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyExamplesRoboticArmPackage.MOVE_SPEED_LEVEL:
				return createMoveSpeedLevelFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyExamplesRoboticArmPackage.MOVE_SPEED_LEVEL:
				return convertMoveSpeedLevelToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * Returns a new RoboticArm object, which has the same type as
	 * the given robotic arm.
	 * 
	 * @param roboticArm The robotic arm with a particular implementation. 
	 * @return The new robotic arm, which has the same type as the old one
	 * @generated_NOT
	 */
	@Override
	public RoboticArm makeRoboticArmSameType(RoboticArm roboticArm)
	{
		// Keep track of the new robotic arm instance
		RoboticArm newRoboticArm = null;
		
		// If the given robotic arm instance has a simulated implementation
		if (roboticArm instanceof RoboticArmSimulated)
		{
			// Create a simulated robotic arm instance
			newRoboticArm = eINSTANCE.createRoboticArmSimulated();
		}
		// Else if the given robotic arm instance has a stub implementation
		else if (roboticArm instanceof RoboticArmStub)
		{
			// Create a stub robotic arm instance
			newRoboticArm = eINSTANCE.createRoboticArmStub();
		}
		
		// Return the new robotic arm instance 
		return newRoboticArm;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboticArmStub createRoboticArmStub() {
		RoboticArmStubImpl roboticArmStub = new RoboticArmStubImpl();
		return roboticArmStub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboticArmSimulated createRoboticArmSimulated()
	{
		RoboticArmSimulatedImpl roboticArmSimulated = new RoboticArmSimulatedImpl();
		return roboticArmSimulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveSpeedLevel createMoveSpeedLevelFromString(EDataType eDataType, String initialValue) {
		MoveSpeedLevel result = MoveSpeedLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMoveSpeedLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public static ApogyExamplesRoboticArmPackage getPackage()
	{
		return ApogyExamplesRoboticArmPackage.eINSTANCE;
	}
} //ApogyExamplesRoboticArmFactoryImpl
