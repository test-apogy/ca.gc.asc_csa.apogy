/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lander.symphony.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.core.PoseProvider;
import org.eclipse.symphony.core.SymphonyInitializationData;
import org.eclipse.symphony.core.SymphonySystemApiAdapter;
import org.eclipse.symphony.core.invocator.AbstractInitializationData;
import org.eclipse.symphony.core.invocator.InitializationData;
import org.eclipse.symphony.core.invocator.TypeApiAdapter;
import org.eclipse.symphony.examples.lander.symphony.LanderData;
import org.eclipse.symphony.examples.lander.symphony.LanderSymphonySystemApiAdapter;
import org.eclipse.symphony.examples.lander.symphony.Symphony__ExamplesLanderSymphonyPackage;

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
 * @see org.eclipse.symphony.examples.lander.symphony.Symphony__ExamplesLanderSymphonyPackage
 * @generated
 */
public class Symphony__ExamplesLanderSymphonySwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static Symphony__ExamplesLanderSymphonyPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__ExamplesLanderSymphonySwitch()
  {
		if (modelPackage == null) {
			modelPackage = Symphony__ExamplesLanderSymphonyPackage.eINSTANCE;
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
			case Symphony__ExamplesLanderSymphonyPackage.LANDER_SYMPHONY_SYSTEM_API_ADAPTER: {
				LanderSymphonySystemApiAdapter landerSymphonySystemApiAdapter = (LanderSymphonySystemApiAdapter)theEObject;
				T result = caseLanderSymphonySystemApiAdapter(landerSymphonySystemApiAdapter);
				if (result == null) result = caseSymphonySystemApiAdapter(landerSymphonySystemApiAdapter);
				if (result == null) result = caseTypeApiAdapter(landerSymphonySystemApiAdapter);
				if (result == null) result = casePoseProvider(landerSymphonySystemApiAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__ExamplesLanderSymphonyPackage.LANDER_DATA: {
				LanderData landerData = (LanderData)theEObject;
				T result = caseLanderData(landerData);
				if (result == null) result = caseSymphonyInitializationData(landerData);
				if (result == null) result = caseInitializationData(landerData);
				if (result == null) result = caseAbstractInitializationData(landerData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Lander Symphony System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lander Symphony System Api Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseLanderSymphonySystemApiAdapter(LanderSymphonySystemApiAdapter object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Lander Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lander Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanderData(LanderData object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Api Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Api Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeApiAdapter(TypeApiAdapter object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Pose Provider</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pose Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePoseProvider(PoseProvider object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Symphony System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symphony System Api Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSymphonySystemApiAdapter(SymphonySystemApiAdapter object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Initialization Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Initialization Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractInitializationData(AbstractInitializationData object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Initialization Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initialization Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitializationData(InitializationData object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Symphony Initialization Data</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symphony Initialization Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSymphonyInitializationData(SymphonyInitializationData object)
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

} //Symphony__ExamplesLanderSymphonySwitch