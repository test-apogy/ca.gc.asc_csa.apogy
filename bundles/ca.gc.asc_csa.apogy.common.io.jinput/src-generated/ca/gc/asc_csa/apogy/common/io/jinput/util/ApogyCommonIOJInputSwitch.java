/**
 * Copyrights Canadian Space Agency 2012. All rights reserved.
 */
package ca.gc.asc_csa.apogy.common.io.jinput.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import ca.gc.asc_csa.apogy.common.io.jinput.*;

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
 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage
 * @generated
 */
public class ApogyCommonIOJInputSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogyCommonIOJInputPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonIOJInputSwitch() {
		if (modelPackage == null) {
			modelPackage = ApogyCommonIOJInputPackage.eINSTANCE;
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
	protected boolean isSwitchFor(EPackage ePackage) {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ApogyCommonIOJInputPackage.ECONTROLLER: {
				EController eController = (EController)theEObject;
				T result = caseEController(eController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonIOJInputPackage.ECONTROLLER_ENVIRONMENT: {
				EControllerEnvironment eControllerEnvironment = (EControllerEnvironment)theEObject;
				T result = caseEControllerEnvironment(eControllerEnvironment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonIOJInputPackage.ECOMPONENT: {
				EComponent eComponent = (EComponent)theEObject;
				T result = caseEComponent(eComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonIOJInputPackage.ECOMPONENTS: {
				EComponents eComponents = (EComponents)theEObject;
				T result = caseEComponents(eComponents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonIOJInputPackage.EBUTTON: {
				EButton eButton = (EButton)theEObject;
				T result = caseEButton(eButton);
				if (result == null) result = caseEComponent(eButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonIOJInputPackage.EAXIS: {
				EAxis eAxis = (EAxis)theEObject;
				T result = caseEAxis(eAxis);
				if (result == null) result = caseEComponent(eAxis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonIOJInputPackage.EKEY: {
				EKey eKey = (EKey)theEObject;
				T result = caseEKey(eKey);
				if (result == null) result = caseEComponent(eKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonIOJInputPackage.ECOMPONENT_QUALIFIER: {
				EComponentQualifier eComponentQualifier = (EComponentQualifier)theEObject;
				T result = caseEComponentQualifier(eComponentQualifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonIOJInputPackage.EVIRTUAL_COMPONENT: {
				EVirtualComponent eVirtualComponent = (EVirtualComponent)theEObject;
				T result = caseEVirtualComponent(eVirtualComponent);
				if (result == null) result = caseEComponent(eVirtualComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EController</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EController</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEController(EController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EController Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EController Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEControllerEnvironment(EControllerEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EComponent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EComponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEComponent(EComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EComponents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EComponents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEComponents(EComponents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EButton</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EButton</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEButton(EButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAxis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAxis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAxis(EAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EKey</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EKey</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEKey(EKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EComponent Qualifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EComponent Qualifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEComponentQualifier(EComponentQualifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EVirtual Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EVirtual Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEVirtualComponent(EVirtualComponent object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //ApogyCommonIOJInputSwitch
