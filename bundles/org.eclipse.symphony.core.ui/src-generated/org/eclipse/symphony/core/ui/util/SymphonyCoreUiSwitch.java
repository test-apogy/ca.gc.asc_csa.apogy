/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.ui.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.core.ui.NewSymphonyProjectSettings;
import org.eclipse.symphony.core.ui.NewSymphonySessionSettings;
import org.eclipse.symphony.core.ui.NewSymphonySystemSettings;
import org.eclipse.symphony.core.ui.ResultNodePresentation;
import org.eclipse.symphony.core.ui.SymphonyCoreUiFacade;
import org.eclipse.symphony.core.ui.SymphonyCoreUiPackage;
import org.eclipse.symphony.core.ui.SymphonyResourceSettings;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.TransformNodePresentation;

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
 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiPackage
 * @generated
 */
public class SymphonyCoreUiSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static SymphonyCoreUiPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyCoreUiSwitch()
  {
		if (modelPackage == null) {
			modelPackage = SymphonyCoreUiPackage.eINSTANCE;
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
			case SymphonyCoreUiPackage.SYMPHONY_CORE_UI_FACADE: {
				SymphonyCoreUiFacade symphonyCoreUiFacade = (SymphonyCoreUiFacade)theEObject;
				T result = caseSymphonyCoreUiFacade(symphonyCoreUiFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyCoreUiPackage.SYMPHONY_RESOURCE_SETTINGS: {
				SymphonyResourceSettings symphonyResourceSettings = (SymphonyResourceSettings)theEObject;
				T result = caseSymphonyResourceSettings(symphonyResourceSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyCoreUiPackage.NEW_SYMPHONY_PROJECT_SETTINGS: {
				NewSymphonyProjectSettings newSymphonyProjectSettings = (NewSymphonyProjectSettings)theEObject;
				T result = caseNewSymphonyProjectSettings(newSymphonyProjectSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyCoreUiPackage.NEW_SYMPHONY_SESSION_SETTINGS: {
				NewSymphonySessionSettings newSymphonySessionSettings = (NewSymphonySessionSettings)theEObject;
				T result = caseNewSymphonySessionSettings(newSymphonySessionSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyCoreUiPackage.NEW_SYMPHONY_SYSTEM_SETTINGS: {
				NewSymphonySystemSettings newSymphonySystemSettings = (NewSymphonySystemSettings)theEObject;
				T result = caseNewSymphonySystemSettings(newSymphonySystemSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyCoreUiPackage.RESULT_NODE_PRESENTATION: {
				ResultNodePresentation resultNodePresentation = (ResultNodePresentation)theEObject;
				T result = caseResultNodePresentation(resultNodePresentation);
				if (result == null) result = caseTransformNodePresentation(resultNodePresentation);
				if (result == null) result = caseNodePresentation(resultNodePresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSymphonyCoreUiFacade(SymphonyCoreUiFacade object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Symphony Resource Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symphony Resource Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymphonyResourceSettings(SymphonyResourceSettings object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>New Symphony Project Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Symphony Project Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewSymphonyProjectSettings(NewSymphonyProjectSettings object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>New Symphony Session Settings</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Symphony Session Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNewSymphonySessionSettings(NewSymphonySessionSettings object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>New Symphony System Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Symphony System Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewSymphonySystemSettings(NewSymphonySystemSettings object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Node Presentation</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Node Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseResultNodePresentation(ResultNodePresentation object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Node Presentation</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNodePresentation(NodePresentation object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Node Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformNodePresentation(TransformNodePresentation object) {
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

} //SymphonyCoreUiSwitch
