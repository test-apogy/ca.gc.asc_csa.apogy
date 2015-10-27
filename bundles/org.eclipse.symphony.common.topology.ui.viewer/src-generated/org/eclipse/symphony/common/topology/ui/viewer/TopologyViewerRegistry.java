/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.ui.viewer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.topology.ui.NodeSelection;
import org.eclipse.symphony.common.topology.ui.viewer.ITopologyViewer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.viewer.TopologyViewerRegistry#isVerbose <em>Verbose</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.viewer.TopologyViewerRegistry#getITopologyViewers <em>ITopology Viewers</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.viewer.TopologyViewerRegistry#getLatestNodeSelection <em>Latest Node Selection</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.topology.ui.viewer.Symphony__CommonTopologyUIViewerPackage#getTopologyViewerRegistry()
 * @model
 * @generated
 */
public interface TopologyViewerRegistry extends EObject {
	/**
	 * Returns the value of the '<em><b>Verbose</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verbose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verbose</em>' attribute.
	 * @see #setVerbose(boolean)
	 * @see org.eclipse.symphony.common.topology.ui.viewer.Symphony__CommonTopologyUIViewerPackage#getTopologyViewerRegistry_Verbose()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isVerbose();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.ui.viewer.TopologyViewerRegistry#isVerbose <em>Verbose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verbose</em>' attribute.
	 * @see #isVerbose()
	 * @generated
	 */
	void setVerbose(boolean value);

	/**
	 * Returns the value of the '<em><b>ITopology Viewers</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.symphony.common.topology.ui.viewer.ITopologyViewer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ITopology Viewers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ITopology Viewers</em>' attribute list.
	 * @see org.eclipse.symphony.common.topology.ui.viewer.Symphony__CommonTopologyUIViewerPackage#getTopologyViewerRegistry_ITopologyViewers()
	 * @model unique="false" dataType="org.eclipse.symphony.common.topology.ui.viewer.ITopologyViewer"
	 * @generated
	 */
	EList<ITopologyViewer> getITopologyViewers();

	/**
	 * Returns the value of the '<em><b>Latest Node Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latest Node Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest Node Selection</em>' reference.
	 * @see #setLatestNodeSelection(NodeSelection)
	 * @see org.eclipse.symphony.common.topology.ui.viewer.Symphony__CommonTopologyUIViewerPackage#getTopologyViewerRegistry_LatestNodeSelection()
	 * @model transient="true"
	 * @generated
	 */
	NodeSelection getLatestNodeSelection();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.ui.viewer.TopologyViewerRegistry#getLatestNodeSelection <em>Latest Node Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Node Selection</em>' reference.
	 * @see #getLatestNodeSelection()
	 * @generated
	 */
	void setLatestNodeSelection(NodeSelection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model iTopologyViewerDataType="org.eclipse.symphony.common.topology.ui.viewer.ITopologyViewer" iTopologyViewerUnique="false"
	 * @generated
	 */
	void registerITopologyViewer(ITopologyViewer iTopologyViewer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model iTopologyViewerDataType="org.eclipse.symphony.common.topology.ui.viewer.ITopologyViewer" iTopologyViewerUnique="false"
	 * @generated
	 */
	void unRegisterITopologyViewer(ITopologyViewer iTopologyViewer);

} // TopologyViewerRegistry
