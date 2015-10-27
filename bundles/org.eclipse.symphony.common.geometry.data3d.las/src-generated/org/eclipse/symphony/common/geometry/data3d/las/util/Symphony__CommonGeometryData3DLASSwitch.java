/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.las.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.symphony.common.geometry.data3d.las.*;

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
 * @see org.eclipse.symphony.common.geometry.data3d.las.Symphony__CommonGeometryData3DLASPackage
 * @generated
 */
public class Symphony__CommonGeometryData3DLASSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Symphony__CommonGeometryData3DLASPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonGeometryData3DLASSwitch() {
		if (modelPackage == null) {
			modelPackage = Symphony__CommonGeometryData3DLASPackage.eINSTANCE;
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
			case Symphony__CommonGeometryData3DLASPackage.LAS_HEADER: {
				LASHeader lasHeader = (LASHeader)theEObject;
				T result = caseLASHeader(lasHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD: {
				VariableLengthRecord variableLengthRecord = (VariableLengthRecord)theEObject;
				T result = caseVariableLengthRecord(variableLengthRecord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonGeometryData3DLASPackage.LAS_READER: {
				LASReader lasReader = (LASReader)theEObject;
				T result = caseLASReader(lasReader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonGeometryData3DLASPackage.LAS_POINT: {
				LASPoint lasPoint = (LASPoint)theEObject;
				T result = caseLASPoint(lasPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonGeometryData3DLASPackage.SYMPHONY_COMMON_GEOMETRY_DATA3_DLAS_FACADE: {
				Symphony__CommonGeometryData3DLASFacade symphony__CommonGeometryData3DLASFacade = (Symphony__CommonGeometryData3DLASFacade)theEObject;
				T result = caseSymphony__CommonGeometryData3DLASFacade(symphony__CommonGeometryData3DLASFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonGeometryData3DLASPackage.LAS_WRITER: {
				LASWriter lasWriter = (LASWriter)theEObject;
				T result = caseLASWriter(lasWriter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LAS Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LAS Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLASHeader(LASHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Length Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Length Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableLengthRecord(VariableLengthRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LAS Reader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LAS Reader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLASReader(LASReader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LAS Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LAS Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLASPoint(LASPoint object) {
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
	public T caseSymphony__CommonGeometryData3DLASFacade(Symphony__CommonGeometryData3DLASFacade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LAS Writer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LAS Writer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLASWriter(LASWriter object) {
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

} //Symphony__CommonGeometryData3DLASSwitch
