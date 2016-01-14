/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015-2016
 */
package org.eclipse.symphony.examples.satellite.symphony.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.symphony.examples.satellite.symphony.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__ExamplesSatelliteSymphonyFactoryImpl extends EFactoryImpl implements Symphony__ExamplesSatelliteSymphonyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__ExamplesSatelliteSymphonyFactory init() {
		try {
			Symphony__ExamplesSatelliteSymphonyFactory theSymphony__ExamplesSatelliteSymphonyFactory = (Symphony__ExamplesSatelliteSymphonyFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__ExamplesSatelliteSymphonyPackage.eNS_URI);
			if (theSymphony__ExamplesSatelliteSymphonyFactory != null) {
				return theSymphony__ExamplesSatelliteSymphonyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__ExamplesSatelliteSymphonyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__ExamplesSatelliteSymphonyFactoryImpl() {
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
			case Symphony__ExamplesSatelliteSymphonyPackage.CONSTELLATION_SYSTEM_API_ADAPTER: return createConstellationSystemApiAdapter();
			case Symphony__ExamplesSatelliteSymphonyPackage.CONSTELLATION_DATA: return createConstellationData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationSystemApiAdapter createConstellationSystemApiAdapter() {
		ConstellationSystemApiAdapterImpl constellationSystemApiAdapter = new ConstellationSystemApiAdapterImpl();
		return constellationSystemApiAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationData createConstellationData() {
		ConstellationDataImpl constellationData = new ConstellationDataImpl();
		return constellationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__ExamplesSatelliteSymphonyPackage getSymphony__ExamplesSatelliteSymphonyPackage() {
		return (Symphony__ExamplesSatelliteSymphonyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__ExamplesSatelliteSymphonyPackage getPackage() {
		return Symphony__ExamplesSatelliteSymphonyPackage.eINSTANCE;
	}

} //Symphony__ExamplesSatelliteSymphonyFactoryImpl
