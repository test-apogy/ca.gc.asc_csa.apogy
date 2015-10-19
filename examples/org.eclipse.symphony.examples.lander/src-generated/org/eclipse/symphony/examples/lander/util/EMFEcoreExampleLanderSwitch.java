/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lander.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.common.emf.Disposable;
import org.eclipse.symphony.examples.lander.EMFEcoreExampleLanderPackage;
import org.eclipse.symphony.examples.lander.Lander;
import org.eclipse.symphony.examples.lander.LanderSimulated;
import org.eclipse.symphony.examples.lander.LanderStub;
import org.eclipse.symphony.examples.lander.Position;

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
 * @see org.eclipse.symphony.examples.lander.EMFEcoreExampleLanderPackage
 * @generated
 */
public class EMFEcoreExampleLanderSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static EMFEcoreExampleLanderPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreExampleLanderSwitch()
  {
		if (modelPackage == null) {
			modelPackage = EMFEcoreExampleLanderPackage.eINSTANCE;
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
			case EMFEcoreExampleLanderPackage.POSITION: {
				Position position = (Position)theEObject;
				T result = casePosition(position);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleLanderPackage.LANDER: {
				Lander lander = (Lander)theEObject;
				T result = caseLander(lander);
				if (result == null) result = caseDisposable(lander);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleLanderPackage.LANDER_STUB: {
				LanderStub landerStub = (LanderStub)theEObject;
				T result = caseLanderStub(landerStub);
				if (result == null) result = caseLander(landerStub);
				if (result == null) result = caseDisposable(landerStub);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleLanderPackage.LANDER_SIMULATED: {
				LanderSimulated landerSimulated = (LanderSimulated)theEObject;
				T result = caseLanderSimulated(landerSimulated);
				if (result == null) result = caseLander(landerSimulated);
				if (result == null) result = caseDisposable(landerSimulated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePosition(Position object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Lander</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lander</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseLander(Lander object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Lander Stub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lander Stub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanderStub(LanderStub object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Lander Simulated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lander Simulated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanderSimulated(LanderSimulated object) {
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

} //EMFEcoreExampleLanderSwitch
