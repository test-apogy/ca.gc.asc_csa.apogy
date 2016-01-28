/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.ui.viewer.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.common.topology.ui.viewer.ITopologyViewer;
import org.eclipse.symphony.common.topology.ui.viewer.Symphony__CommonTopologyUIViewerFactory;
import org.eclipse.symphony.common.topology.ui.viewer.Symphony__CommonTopologyUIViewerPackage;
import org.eclipse.symphony.common.topology.ui.viewer.TopologyViewerRegistry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonTopologyUIViewerFactoryImpl extends EFactoryImpl implements Symphony__CommonTopologyUIViewerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__CommonTopologyUIViewerFactory init() {
		try {
			Symphony__CommonTopologyUIViewerFactory theSymphony__CommonTopologyUIViewerFactory = (Symphony__CommonTopologyUIViewerFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CommonTopologyUIViewerPackage.eNS_URI);
			if (theSymphony__CommonTopologyUIViewerFactory != null) {
				return theSymphony__CommonTopologyUIViewerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CommonTopologyUIViewerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonTopologyUIViewerFactoryImpl() {
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
			case Symphony__CommonTopologyUIViewerPackage.TOPOLOGY_VIEWER_REGISTRY: return createTopologyViewerRegistry();
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
			case Symphony__CommonTopologyUIViewerPackage.ITOPOLOGY_VIEWER:
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
			case Symphony__CommonTopologyUIViewerPackage.ITOPOLOGY_VIEWER:
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
	public Symphony__CommonTopologyUIViewerPackage getSymphony__CommonTopologyUIViewerPackage() {
		return (Symphony__CommonTopologyUIViewerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__CommonTopologyUIViewerPackage getPackage() {
		return Symphony__CommonTopologyUIViewerPackage.eINSTANCE;
	}

} //Symphony__CommonTopologyUIViewerFactoryImpl
