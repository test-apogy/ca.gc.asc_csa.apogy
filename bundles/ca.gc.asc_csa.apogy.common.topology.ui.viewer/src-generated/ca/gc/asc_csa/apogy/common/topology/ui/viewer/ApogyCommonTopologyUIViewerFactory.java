/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.topology.ui.viewer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.common.topology.ui.viewer.ApogyCommonTopologyUIViewerPackage
 * @generated
 */
public interface ApogyCommonTopologyUIViewerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonTopologyUIViewerFactory eINSTANCE = ca.gc.asc_csa.apogy.common.topology.ui.viewer.impl.ApogyCommonTopologyUIViewerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Topology Viewer Registry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topology Viewer Registry</em>'.
	 * @generated
	 */
	TopologyViewerRegistry createTopologyViewerRegistry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCommonTopologyUIViewerPackage getApogyCommonTopologyUIViewerPackage();

} //ApogyCommonTopologyUIViewerFactory
