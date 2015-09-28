/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.symphony.examples.antenna.util;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractInitializationData;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InitializationData;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeApiAdapter;
import ca.gc.asc_csa.symphony.core.PoseProvider;
import ca.gc.asc_csa.symphony.core.SymphonyInitializationData;
import ca.gc.asc_csa.symphony.core.SymphonySystemApiAdapter;
import ca.gc.asc_csa.symphony.examples.antenna.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
 * @see ca.gc.asc_csa.symphony.examples.antenna.SymphonyExampleAntennaPackage
 * @generated
 */
public class SymphonyExampleAntennaSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static SymphonyExampleAntennaPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyExampleAntennaSwitch()
  {
		if (modelPackage == null) {
			modelPackage = SymphonyExampleAntennaPackage.eINSTANCE;
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
			case SymphonyExampleAntennaPackage.PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER: {
				PTUDishAntennaSymphonySystemApiAdapter ptuDishAntennaSymphonySystemApiAdapter = (PTUDishAntennaSymphonySystemApiAdapter)theEObject;
				T result = casePTUDishAntennaSymphonySystemApiAdapter(ptuDishAntennaSymphonySystemApiAdapter);
				if (result == null) result = caseSymphonySystemApiAdapter(ptuDishAntennaSymphonySystemApiAdapter);
				if (result == null) result = caseTypeApiAdapter(ptuDishAntennaSymphonySystemApiAdapter);
				if (result == null) result = casePoseProvider(ptuDishAntennaSymphonySystemApiAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyExampleAntennaPackage.PTU_DISH_ANTENNA_DATA: {
				PTUDishAntennaData ptuDishAntennaData = (PTUDishAntennaData)theEObject;
				T result = casePTUDishAntennaData(ptuDishAntennaData);
				if (result == null) result = caseSymphonyInitializationData(ptuDishAntennaData);
				if (result == null) result = caseInitializationData(ptuDishAntennaData);
				if (result == null) result = caseAbstractInitializationData(ptuDishAntennaData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>PTU Dish Antenna Symphony System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTU Dish Antenna Symphony System Api Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePTUDishAntennaSymphonySystemApiAdapter(PTUDishAntennaSymphonySystemApiAdapter object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>PTU Dish Antenna Data</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTU Dish Antenna Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePTUDishAntennaData(PTUDishAntennaData object)
  {
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

} //SymphonyExampleAntennaSwitch
