/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.telecoms;

import ca.gc.asc_csa.symphony.tools.core.SimpleTool;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Telecom Status Monitor Tool List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is used to keep track of the list of telecom status monitor
 * tool.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.telecoms.TelecomStatusMonitorToolList#getTelecomStatusMonitors <em>Telecom Status Monitors</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.tools.telecoms.SymphonyTelecomToolsPackage#getTelecomStatusMonitorToolList()
 * @model
 * @generated
 */
public interface TelecomStatusMonitorToolList extends SimpleTool {
	/**
	 * Returns the value of the '<em><b>Telecom Status Monitors</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.symphony.tools.telecoms.TelecomStatusMonitorTool}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.symphony.tools.telecoms.TelecomStatusMonitorTool#getStatusMonitorToolList <em>Status Monitor Tool List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to keep track of all of the telecom status monitors
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telecom Status Monitors</em>' containment reference list.
	 * @see ca.gc.asc_csa.symphony.tools.telecoms.SymphonyTelecomToolsPackage#getTelecomStatusMonitorToolList_TelecomStatusMonitors()
	 * @see ca.gc.asc_csa.symphony.tools.telecoms.TelecomStatusMonitorTool#getStatusMonitorToolList
	 * @model opposite="statusMonitorToolList" containment="true"
	 * @generated
	 */
	EList<TelecomStatusMonitorTool> getTelecomStatusMonitors();

} // TelecomStatusMonitorToolList
