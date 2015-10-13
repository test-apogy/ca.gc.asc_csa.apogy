/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.ui.viewer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.topology.ui.viewer.TopologyViewerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='TopologyViewer' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='TopologyViewer' complianceLevel='6.0' modelDirectory='/org.eclipse.symphony.common.topology.ui.viewer/src-generated' editDirectory='/org.eclipse.symphony.common.topology.ui.viewer.edit/src-generated' basePackage='org.eclipse.symphony.common.topology.ui'"
 * @generated
 */
public interface TopologyViewerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "viewer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.symphony.common.topology.ui.viewer";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "viewer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TopologyViewerPackage eINSTANCE = org.eclipse.symphony.common.topology.ui.viewer.impl.TopologyViewerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.ui.viewer.impl.TopologyViewerRegistryImpl <em>Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.ui.viewer.impl.TopologyViewerRegistryImpl
	 * @see org.eclipse.symphony.common.topology.ui.viewer.impl.TopologyViewerPackageImpl#getTopologyViewerRegistry()
	 * @generated
	 */
	int TOPOLOGY_VIEWER_REGISTRY = 0;

	/**
	 * The feature id for the '<em><b>Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_VIEWER_REGISTRY__VERBOSE = 0;

	/**
	 * The feature id for the '<em><b>ITopology Viewers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_VIEWER_REGISTRY__ITOPOLOGY_VIEWERS = 1;

	/**
	 * The feature id for the '<em><b>Latest Node Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_VIEWER_REGISTRY__LATEST_NODE_SELECTION = 2;

	/**
	 * The number of structural features of the '<em>Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_VIEWER_REGISTRY_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Register ITopology Viewer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_VIEWER_REGISTRY___REGISTER_ITOPOLOGY_VIEWER__ITOPOLOGYVIEWER = 0;

	/**
	 * The operation id for the '<em>Un Register ITopology Viewer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_VIEWER_REGISTRY___UN_REGISTER_ITOPOLOGY_VIEWER__ITOPOLOGYVIEWER = 1;

	/**
	 * The number of operations of the '<em>Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_VIEWER_REGISTRY_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '<em>ITopology Viewer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.ui.viewer.ITopologyViewer
	 * @see org.eclipse.symphony.common.topology.ui.viewer.impl.TopologyViewerPackageImpl#getITopologyViewer()
	 * @generated
	 */
	int ITOPOLOGY_VIEWER = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.topology.ui.viewer.TopologyViewerRegistry <em>Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.viewer.TopologyViewerRegistry
	 * @generated
	 */
	EClass getTopologyViewerRegistry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.ui.viewer.TopologyViewerRegistry#isVerbose <em>Verbose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verbose</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.viewer.TopologyViewerRegistry#isVerbose()
	 * @see #getTopologyViewerRegistry()
	 * @generated
	 */
	EAttribute getTopologyViewerRegistry_Verbose();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.symphony.common.topology.ui.viewer.TopologyViewerRegistry#getITopologyViewers <em>ITopology Viewers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>ITopology Viewers</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.viewer.TopologyViewerRegistry#getITopologyViewers()
	 * @see #getTopologyViewerRegistry()
	 * @generated
	 */
	EAttribute getTopologyViewerRegistry_ITopologyViewers();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.topology.ui.viewer.TopologyViewerRegistry#getLatestNodeSelection <em>Latest Node Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Latest Node Selection</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.viewer.TopologyViewerRegistry#getLatestNodeSelection()
	 * @see #getTopologyViewerRegistry()
	 * @generated
	 */
	EReference getTopologyViewerRegistry_LatestNodeSelection();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.topology.ui.viewer.TopologyViewerRegistry#registerITopologyViewer(org.eclipse.symphony.common.topology.ui.viewer.ITopologyViewer) <em>Register ITopology Viewer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register ITopology Viewer</em>' operation.
	 * @see org.eclipse.symphony.common.topology.ui.viewer.TopologyViewerRegistry#registerITopologyViewer(org.eclipse.symphony.common.topology.ui.viewer.ITopologyViewer)
	 * @generated
	 */
	EOperation getTopologyViewerRegistry__RegisterITopologyViewer__ITopologyViewer();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.topology.ui.viewer.TopologyViewerRegistry#unRegisterITopologyViewer(org.eclipse.symphony.common.topology.ui.viewer.ITopologyViewer) <em>Un Register ITopology Viewer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Un Register ITopology Viewer</em>' operation.
	 * @see org.eclipse.symphony.common.topology.ui.viewer.TopologyViewerRegistry#unRegisterITopologyViewer(org.eclipse.symphony.common.topology.ui.viewer.ITopologyViewer)
	 * @generated
	 */
	EOperation getTopologyViewerRegistry__UnRegisterITopologyViewer__ITopologyViewer();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.symphony.common.topology.ui.viewer.ITopologyViewer <em>ITopology Viewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ITopology Viewer</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.viewer.ITopologyViewer
	 * @model instanceClass="org.eclipse.symphony.common.topology.ui.viewer.ITopologyViewer"
	 * @generated
	 */
	EDataType getITopologyViewer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TopologyViewerFactory getTopologyViewerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.ui.viewer.impl.TopologyViewerRegistryImpl <em>Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.ui.viewer.impl.TopologyViewerRegistryImpl
		 * @see org.eclipse.symphony.common.topology.ui.viewer.impl.TopologyViewerPackageImpl#getTopologyViewerRegistry()
		 * @generated
		 */
		EClass TOPOLOGY_VIEWER_REGISTRY = eINSTANCE.getTopologyViewerRegistry();

		/**
		 * The meta object literal for the '<em><b>Verbose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPOLOGY_VIEWER_REGISTRY__VERBOSE = eINSTANCE.getTopologyViewerRegistry_Verbose();

		/**
		 * The meta object literal for the '<em><b>ITopology Viewers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPOLOGY_VIEWER_REGISTRY__ITOPOLOGY_VIEWERS = eINSTANCE.getTopologyViewerRegistry_ITopologyViewers();

		/**
		 * The meta object literal for the '<em><b>Latest Node Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_VIEWER_REGISTRY__LATEST_NODE_SELECTION = eINSTANCE.getTopologyViewerRegistry_LatestNodeSelection();

		/**
		 * The meta object literal for the '<em><b>Register ITopology Viewer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_VIEWER_REGISTRY___REGISTER_ITOPOLOGY_VIEWER__ITOPOLOGYVIEWER = eINSTANCE.getTopologyViewerRegistry__RegisterITopologyViewer__ITopologyViewer();

		/**
		 * The meta object literal for the '<em><b>Un Register ITopology Viewer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_VIEWER_REGISTRY___UN_REGISTER_ITOPOLOGY_VIEWER__ITOPOLOGYVIEWER = eINSTANCE.getTopologyViewerRegistry__UnRegisterITopologyViewer__ITopologyViewer();

		/**
		 * The meta object literal for the '<em>ITopology Viewer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.ui.viewer.ITopologyViewer
		 * @see org.eclipse.symphony.common.topology.ui.viewer.impl.TopologyViewerPackageImpl#getITopologyViewer()
		 * @generated
		 */
		EDataType ITOPOLOGY_VIEWER = eINSTANCE.getITopologyViewer();

	}

} //TopologyViewerPackage
