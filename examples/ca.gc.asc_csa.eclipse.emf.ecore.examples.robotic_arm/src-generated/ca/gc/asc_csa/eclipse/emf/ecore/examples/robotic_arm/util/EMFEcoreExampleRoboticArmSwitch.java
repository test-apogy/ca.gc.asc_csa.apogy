/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.eclipse.emf.ecore.examples.robotic_arm.util;

import ca.gc.asc_csa.eclipse.emf.ecore.examples.robotic_arm.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.robotic_arm.EMFEcoreExampleRoboticArmPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.robotic_arm.RoboticArm;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.robotic_arm.EMFEcoreExampleRoboticArmPackage
 * @generated
 */
public class EMFEcoreExampleRoboticArmSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static EMFEcoreExampleRoboticArmPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreExampleRoboticArmSwitch()
  {
		if (modelPackage == null) {
			modelPackage = EMFEcoreExampleRoboticArmPackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
		return ePackage == modelPackage;
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM: {
				RoboticArm roboticArm = (RoboticArm)theEObject;
				T result = caseRoboticArm(roboticArm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM_STUB: {
				RoboticArmStub roboticArmStub = (RoboticArmStub)theEObject;
				T result = caseRoboticArmStub(roboticArmStub);
				if (result == null) result = caseRoboticArm(roboticArmStub);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM_SIMULATED: {
				RoboticArmSimulated roboticArmSimulated = (RoboticArmSimulated)theEObject;
				T result = caseRoboticArmSimulated(roboticArmSimulated);
				if (result == null) result = caseRoboticArm(roboticArmSimulated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Robotic Arm</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robotic Arm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRoboticArm(RoboticArm object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Robotic Arm Stub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robotic Arm Stub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoboticArmStub(RoboticArmStub object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Robotic Arm Simulated</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robotic Arm Simulated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRoboticArmSimulated(RoboticArmSimulated object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  @Override
  public T defaultCase(EObject object)
  {
		return null;
	}

} //EMFEcoreExampleRoboticArmSwitch
