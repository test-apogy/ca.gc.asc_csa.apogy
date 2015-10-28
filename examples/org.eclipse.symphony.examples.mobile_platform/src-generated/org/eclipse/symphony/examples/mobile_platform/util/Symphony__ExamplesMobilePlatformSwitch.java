/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.mobile_platform.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.common.emf.Disposable;
import org.eclipse.symphony.examples.mobile_platform.*;

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
 * @see org.eclipse.symphony.examples.mobile_platform.Symphony__ExamplesMobilePlatformPackage
 * @generated
 */
public class Symphony__ExamplesMobilePlatformSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static Symphony__ExamplesMobilePlatformPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__ExamplesMobilePlatformSwitch()
  {
		if (modelPackage == null) {
			modelPackage = Symphony__ExamplesMobilePlatformPackage.eINSTANCE;
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
			case Symphony__ExamplesMobilePlatformPackage.POSITION: {
				Position position = (Position)theEObject;
				T result = casePosition(position);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__ExamplesMobilePlatformPackage.NAMED_POSITION: {
				NamedPosition namedPosition = (NamedPosition)theEObject;
				T result = caseNamedPosition(namedPosition);
				if (result == null) result = casePosition(namedPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__ExamplesMobilePlatformPackage.MOBILE_PLATFORM: {
				MobilePlatform mobilePlatform = (MobilePlatform)theEObject;
				T result = caseMobilePlatform(mobilePlatform);
				if (result == null) result = caseDisposable(mobilePlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__ExamplesMobilePlatformPackage.MOBILE_PLATFORM_STUB: {
				MobilePlatformStub mobilePlatformStub = (MobilePlatformStub)theEObject;
				T result = caseMobilePlatformStub(mobilePlatformStub);
				if (result == null) result = caseMobilePlatform(mobilePlatformStub);
				if (result == null) result = caseDisposable(mobilePlatformStub);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__ExamplesMobilePlatformPackage.MOBILE_PLATFORM_SIMULATED: {
				MobilePlatformSimulated mobilePlatformSimulated = (MobilePlatformSimulated)theEObject;
				T result = caseMobilePlatformSimulated(mobilePlatformSimulated);
				if (result == null) result = caseMobilePlatform(mobilePlatformSimulated);
				if (result == null) result = caseDisposable(mobilePlatformSimulated);
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
	 * Returns the result of interpreting the object as an instance of '<em>Named Position</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNamedPosition(NamedPosition object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Mobile Platform</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mobile Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMobilePlatform(MobilePlatform object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Mobile Platform Stub</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mobile Platform Stub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMobilePlatformStub(MobilePlatformStub object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Mobile Platform Simulated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mobile Platform Simulated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobilePlatformSimulated(MobilePlatformSimulated object) {
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

} //Symphony__ExamplesMobilePlatformSwitch