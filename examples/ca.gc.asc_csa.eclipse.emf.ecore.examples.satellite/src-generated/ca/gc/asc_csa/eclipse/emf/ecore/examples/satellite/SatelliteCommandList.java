/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Satellite Command List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SatelliteCommandList#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.EMFEcoreExampleSatellitePackage#getSatelliteCommandList()
 * @model
 * @generated
 */
public interface SatelliteCommandList extends EObject {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SatelliteCommand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.EMFEcoreExampleSatellitePackage#getSatelliteCommandList_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<SatelliteCommand> getCommands();

} // SatelliteCommandList
