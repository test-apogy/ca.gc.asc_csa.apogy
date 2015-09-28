/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersistenceSwitch.java,v 1.3.4.3 2015/09/22 19:39:38 rlarcheveque Exp $
 */
package ca.gc.space.mrt.geometry.data3d.persistence.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import ca.gc.space.mrt.geometry.data3d.persistence.CartesianCoordinatesSetSource;
import ca.gc.space.mrt.geometry.data3d.persistence.FileCartesianCoordinatesSetSource;
import ca.gc.space.mrt.geometry.data3d.persistence.MemoryCartesianCoordinatesSetSource;
import ca.gc.space.mrt.geometry.data3d.persistence.PersistenceFacade;
import ca.gc.space.mrt.geometry.data3d.persistence.PersistencePackage;

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
 * @see ca.gc.space.mrt.geometry.data3d.persistence.PersistencePackage
 * @generated
 */
public class PersistenceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PersistencePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceSwitch() {
		if (modelPackage == null) {
			modelPackage = PersistencePackage.eINSTANCE;
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
			case PersistencePackage.CARTESIAN_COORDINATES_SET_SOURCE: {
				CartesianCoordinatesSetSource cartesianCoordinatesSetSource = (CartesianCoordinatesSetSource)theEObject;
				T result = caseCartesianCoordinatesSetSource(cartesianCoordinatesSetSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.MEMORY_CARTESIAN_COORDINATES_SET_SOURCE: {
				MemoryCartesianCoordinatesSetSource memoryCartesianCoordinatesSetSource = (MemoryCartesianCoordinatesSetSource)theEObject;
				T result = caseMemoryCartesianCoordinatesSetSource(memoryCartesianCoordinatesSetSource);
				if (result == null) result = caseCartesianCoordinatesSetSource(memoryCartesianCoordinatesSetSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.FILE_CARTESIAN_COORDINATES_SET_SOURCE: {
				FileCartesianCoordinatesSetSource fileCartesianCoordinatesSetSource = (FileCartesianCoordinatesSetSource)theEObject;
				T result = caseFileCartesianCoordinatesSetSource(fileCartesianCoordinatesSetSource);
				if (result == null) result = caseCartesianCoordinatesSetSource(fileCartesianCoordinatesSetSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.PERSISTENCE_FACADE: {
				PersistenceFacade persistenceFacade = (PersistenceFacade)theEObject;
				T result = casePersistenceFacade(persistenceFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Coordinates Set Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Coordinates Set Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCartesianCoordinatesSetSource(CartesianCoordinatesSetSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Cartesian Coordinates Set Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Cartesian Coordinates Set Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryCartesianCoordinatesSetSource(MemoryCartesianCoordinatesSetSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Cartesian Coordinates Set Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Cartesian Coordinates Set Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileCartesianCoordinatesSetSource(FileCartesianCoordinatesSetSource object) {
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
	public T casePersistenceFacade(PersistenceFacade object) {
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

} //PersistenceSwitch
