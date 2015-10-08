/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.telecoms;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.addons.SimpleTool;

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
 *   <li>{@link org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorToolList#getTelecomStatusMonitors <em>Telecom Status Monitors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.telecoms.SymphonyTelecomToolsPackage#getTelecomStatusMonitorToolList()
 * @model
 * @generated
 */
public interface TelecomStatusMonitorToolList extends SimpleTool {
	/**
	 * Returns the value of the '<em><b>Telecom Status Monitors</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool#getStatusMonitorToolList <em>Status Monitor Tool List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to keep track of all of the telecom status monitors
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telecom Status Monitors</em>' containment reference list.
	 * @see org.eclipse.symphony.addons.telecoms.SymphonyTelecomToolsPackage#getTelecomStatusMonitorToolList_TelecomStatusMonitors()
	 * @see org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool#getStatusMonitorToolList
	 * @model opposite="statusMonitorToolList" containment="true"
	 * @generated
	 */
	EList<TelecomStatusMonitorTool> getTelecomStatusMonitors();

} // TelecomStatusMonitorToolList
