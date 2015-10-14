/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.antenna.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.examples.antenna.Antenna;
import org.eclipse.symphony.examples.antenna.DishAntenna;
import org.eclipse.symphony.examples.antenna.EMFEcoreExampleAntennaPackage;
import org.eclipse.symphony.examples.antenna.PTUDishAntenna;
import org.eclipse.symphony.examples.antenna.PTUDishAntennaSimulated;
import org.eclipse.symphony.examples.antenna.PTUDishAntennaStub;

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
 * @see org.eclipse.symphony.examples.antenna.EMFEcoreExampleAntennaPackage
 * @generated
 */
public class EMFEcoreExampleAntennaSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static EMFEcoreExampleAntennaPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreExampleAntennaSwitch()
  {
		if (modelPackage == null) {
			modelPackage = EMFEcoreExampleAntennaPackage.eINSTANCE;
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
			case EMFEcoreExampleAntennaPackage.ANTENNA: {
				Antenna antenna = (Antenna)theEObject;
				T result = caseAntenna(antenna);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleAntennaPackage.DISH_ANTENNA: {
				DishAntenna dishAntenna = (DishAntenna)theEObject;
				T result = caseDishAntenna(dishAntenna);
				if (result == null) result = caseAntenna(dishAntenna);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleAntennaPackage.PTU_DISH_ANTENNA: {
				PTUDishAntenna ptuDishAntenna = (PTUDishAntenna)theEObject;
				T result = casePTUDishAntenna(ptuDishAntenna);
				if (result == null) result = caseDishAntenna(ptuDishAntenna);
				if (result == null) result = caseAntenna(ptuDishAntenna);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleAntennaPackage.PTU_DISH_ANTENNA_STUB: {
				PTUDishAntennaStub ptuDishAntennaStub = (PTUDishAntennaStub)theEObject;
				T result = casePTUDishAntennaStub(ptuDishAntennaStub);
				if (result == null) result = casePTUDishAntenna(ptuDishAntennaStub);
				if (result == null) result = caseDishAntenna(ptuDishAntennaStub);
				if (result == null) result = caseAntenna(ptuDishAntennaStub);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleAntennaPackage.PTU_DISH_ANTENNA_SIMULATED: {
				PTUDishAntennaSimulated ptuDishAntennaSimulated = (PTUDishAntennaSimulated)theEObject;
				T result = casePTUDishAntennaSimulated(ptuDishAntennaSimulated);
				if (result == null) result = casePTUDishAntenna(ptuDishAntennaSimulated);
				if (result == null) result = caseDishAntenna(ptuDishAntennaSimulated);
				if (result == null) result = caseAntenna(ptuDishAntennaSimulated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Antenna</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antenna</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAntenna(Antenna object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Dish Antenna</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dish Antenna</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDishAntenna(DishAntenna object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>PTU Dish Antenna</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTU Dish Antenna</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePTUDishAntenna(PTUDishAntenna object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>PTU Dish Antenna Stub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTU Dish Antenna Stub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTUDishAntennaStub(PTUDishAntennaStub object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>PTU Dish Antenna Simulated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTU Dish Antenna Simulated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTUDishAntennaSimulated(PTUDishAntennaSimulated object) {
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

} //EMFEcoreExampleAntennaSwitch
