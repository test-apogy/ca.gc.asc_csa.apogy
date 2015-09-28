/**
 */
package ca.gc.asc_csa.eclipse.emf.ecore;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Sources List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Time Sources.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.TimeSourcesList#getTimeSources <em>Time Sources</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage#getTimeSourcesList()
 * @model
 * @generated
 */
public interface TimeSourcesList extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Sources</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.eclipse.emf.ecore.TimeSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Sources</em>' containment reference list.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage#getTimeSourcesList_TimeSources()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeSource> getTimeSources();

} // TimeSourcesList
