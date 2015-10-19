/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.rover.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.common.emf.Disposable;
import org.eclipse.symphony.examples.rover.*;

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
 * @see org.eclipse.symphony.examples.rover.EMFEcoreExampleRoverPackage
 * @generated
 */
public class EMFEcoreExampleRoverSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static EMFEcoreExampleRoverPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreExampleRoverSwitch()
  {
		if (modelPackage == null) {
			modelPackage = EMFEcoreExampleRoverPackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param ePackage the package in question.
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
			case EMFEcoreExampleRoverPackage.BATTERY: {
				Battery battery = (Battery)theEObject;
				T result = caseBattery(battery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleRoverPackage.POWER_SYSTEM: {
				PowerSystem powerSystem = (PowerSystem)theEObject;
				T result = casePowerSystem(powerSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleRoverPackage.ROVER: {
				Rover rover = (Rover)theEObject;
				T result = caseRover(rover);
				if (result == null) result = caseDisposable(rover);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleRoverPackage.ROVER_STUB: {
				RoverStub roverStub = (RoverStub)theEObject;
				T result = caseRoverStub(roverStub);
				if (result == null) result = caseRover(roverStub);
				if (result == null) result = caseDisposable(roverStub);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleRoverPackage.ROVER_SIMULATED: {
				RoverSimulated roverSimulated = (RoverSimulated)theEObject;
				T result = caseRoverSimulated(roverSimulated);
				if (result == null) result = caseRover(roverSimulated);
				if (result == null) result = caseDisposable(roverSimulated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Battery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Battery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBattery(Battery object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Power System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerSystem(PowerSystem object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Rover</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rover</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRover(Rover object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Rover Stub</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rover Stub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRoverStub(RoverStub object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Rover Simulated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rover Simulated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoverSimulated(RoverSimulated object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Disposable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disposable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisposable(Disposable object) {
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

} //EMFEcoreExampleRoverSwitch
