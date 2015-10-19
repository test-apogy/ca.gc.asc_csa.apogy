/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.symphony.common.math.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.MathIO;
import org.eclipse.symphony.common.math.MathPackage;
import org.eclipse.symphony.common.math.Matrix3x3;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.common.math.Polynomial;
import org.eclipse.symphony.common.math.Tuple3d;

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
 * @see org.eclipse.symphony.common.math.MathPackage
 * @generated
 */
public class MathSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MathPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathSwitch() {
		if (modelPackage == null) {
			modelPackage = MathPackage.eINSTANCE;
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
  protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MathPackage.MATRIX4X4: {
				Matrix4x4 matrix4x4 = (Matrix4x4)theEObject;
				T result = caseMatrix4x4(matrix4x4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MathPackage.MATH_FACADE: {
				MathFacade mathFacade = (MathFacade)theEObject;
				T result = caseMathFacade(mathFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MathPackage.MATRIX3X3: {
				Matrix3x3 matrix3x3 = (Matrix3x3)theEObject;
				T result = caseMatrix3x3(matrix3x3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MathPackage.TUPLE3D: {
				Tuple3d tuple3d = (Tuple3d)theEObject;
				T result = caseTuple3d(tuple3d);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MathPackage.POLYNOMIAL: {
				Polynomial polynomial = (Polynomial)theEObject;
				T result = casePolynomial(polynomial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MathPackage.MATH_IO: {
				MathIO mathIO = (MathIO)theEObject;
				T result = caseMathIO(mathIO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matrix4x4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matrix4x4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatrix4x4(Matrix4x4 object) {
		return null;
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
	public T caseMathFacade(MathFacade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matrix3x3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matrix3x3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatrix3x3(Matrix3x3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple3d</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple3d</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuple3d(Tuple3d object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polynomial</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polynomial</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolynomial(Polynomial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMathIO(MathIO object)
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
  public T defaultCase(EObject object) {
		return null;
	}

} //MathSwitch
