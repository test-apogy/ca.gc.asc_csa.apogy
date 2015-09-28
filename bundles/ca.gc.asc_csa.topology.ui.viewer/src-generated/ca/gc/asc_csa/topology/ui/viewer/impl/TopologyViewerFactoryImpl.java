/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.topology.ui.viewer.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.topology.ui.viewer.ITopologyViewer;
import ca.gc.asc_csa.topology.ui.viewer.TopologyViewerFactory;
import ca.gc.asc_csa.topology.ui.viewer.TopologyViewerPackage;
import ca.gc.asc_csa.topology.ui.viewer.TopologyViewerRegistry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopologyViewerFactoryImpl extends EFactoryImpl implements TopologyViewerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TopologyViewerFactory init() {
		try {
			TopologyViewerFactory theTopologyViewerFactory = (TopologyViewerFactory)EPackage.Registry.INSTANCE.getEFactory(TopologyViewerPackage.eNS_URI);
			if (theTopologyViewerFactory != null) {
				return theTopologyViewerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TopologyViewerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyViewerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TopologyViewerPackage.TOPOLOGY_VIEWER_REGISTRY: return createTopologyViewerRegistry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TopologyViewerPackage.ITOPOLOGY_VIEWER:
				return createITopologyViewerFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TopologyViewerPackage.ITOPOLOGY_VIEWER:
				return convertITopologyViewerToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyViewerRegistry createTopologyViewerRegistry() {
		TopologyViewerRegistryImpl topologyViewerRegistry = new TopologyViewerRegistryImpl();
		return topologyViewerRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITopologyViewer createITopologyViewerFromString(EDataType eDataType, String initialValue) {
		return (ITopologyViewer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertITopologyViewerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyViewerPackage getTopologyViewerPackage() {
		return (TopologyViewerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TopologyViewerPackage getPackage() {
		return TopologyViewerPackage.eINSTANCE;
	}

} //TopologyViewerFactoryImpl
