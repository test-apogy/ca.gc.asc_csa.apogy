/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.telecoms;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Telecom Status Monitor Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is used to keep track of all the relevant state for
 * a telecom status monitor tool.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorTool#getTelecomNodes <em>Telecom Nodes</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorTool#getStatusMonitorToolList <em>Status Monitor Tool List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorTool#isRunning <em>Running</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorTool#isDisposed <em>Disposed</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getTelecomStatusMonitorTool()
 * @model
 * @generated
 */
public interface TelecomStatusMonitorTool extends EObject {
	/**
	 * Returns the value of the '<em><b>Telecom Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getStatusMonitorTool <em>Status Monitor Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telecom Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All of the telecom nodes that are associated with the
	 * associated with this status monitor tool
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telecom Nodes</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getTelecomStatusMonitorTool_TelecomNodes()
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getStatusMonitorTool
	 * @model opposite="statusMonitorTool" containment="true"
	 * @generated
	 */
	EList<TelecomNode> getTelecomNodes();

	/**
	 * Returns the value of the '<em><b>Status Monitor Tool List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorToolList#getTelecomStatusMonitors <em>Telecom Status Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of telecom status monitors to which this particular monitor belongs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Monitor Tool List</em>' container reference.
	 * @see #setStatusMonitorToolList(TelecomStatusMonitorToolList)
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getTelecomStatusMonitorTool_StatusMonitorToolList()
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorToolList#getTelecomStatusMonitors
	 * @model opposite="telecomStatusMonitors" transient="false"
	 * @generated
	 */
	TelecomStatusMonitorToolList getStatusMonitorToolList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorTool#getStatusMonitorToolList <em>Status Monitor Tool List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Monitor Tool List</em>' container reference.
	 * @see #getStatusMonitorToolList()
	 * @generated
	 */
	void setStatusMonitorToolList(TelecomStatusMonitorToolList value);

	/**
	 * Returns the value of the '<em><b>Running</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the telecom status monitor is currently running
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Running</em>' attribute.
	 * @see #setRunning(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getTelecomStatusMonitorTool_Running()
	 * @model default="false" unique="false" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' children='false'"
	 * @generated
	 */
	boolean isRunning();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorTool#isRunning <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running</em>' attribute.
	 * @see #isRunning()
	 * @generated
	 */
	void setRunning(boolean value);

	/**
	 * Returns the value of the '<em><b>Disposed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the telecom status monitor is currently disposed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposed</em>' attribute.
	 * @see #setDisposed(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getTelecomStatusMonitorTool_Disposed()
	 * @model default="false" unique="false" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' children='false'"
	 * @generated
	 */
	boolean isDisposed();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorTool#isDisposed <em>Disposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposed</em>' attribute.
	 * @see #isDisposed()
	 * @generated
	 */
	void setDisposed(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Operation used to start the telecom status monitor running.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Operation used to stop the telecom status monitor.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Operation used to dispose of the telecom status monitor
	 * when it is no longer needed
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void dispose();

} // TelecomStatusMonitorTool
