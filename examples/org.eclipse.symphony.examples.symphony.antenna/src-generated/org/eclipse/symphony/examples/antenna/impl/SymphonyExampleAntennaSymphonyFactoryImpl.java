/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.antenna.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.symphony.examples.antenna.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyExampleAntennaSymphonyFactoryImpl extends EFactoryImpl implements SymphonyExampleAntennaSymphonyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SymphonyExampleAntennaSymphonyFactory init() {
		try {
			SymphonyExampleAntennaSymphonyFactory theSymphonyExampleAntennaSymphonyFactory = (SymphonyExampleAntennaSymphonyFactory)EPackage.Registry.INSTANCE.getEFactory(SymphonyExampleAntennaSymphonyPackage.eNS_URI);
			if (theSymphonyExampleAntennaSymphonyFactory != null) {
				return theSymphonyExampleAntennaSymphonyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SymphonyExampleAntennaSymphonyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyExampleAntennaSymphonyFactoryImpl() {
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
			case SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER: return createPTUDishAntennaSymphonySystemApiAdapter();
			case SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA: return createPTUDishAntennaData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTUDishAntennaSymphonySystemApiAdapter createPTUDishAntennaSymphonySystemApiAdapter() {
		PTUDishAntennaSymphonySystemApiAdapterImpl ptuDishAntennaSymphonySystemApiAdapter = new PTUDishAntennaSymphonySystemApiAdapterImpl();
		return ptuDishAntennaSymphonySystemApiAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTUDishAntennaData createPTUDishAntennaData() {
		PTUDishAntennaDataImpl ptuDishAntennaData = new PTUDishAntennaDataImpl();
		return ptuDishAntennaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyExampleAntennaSymphonyPackage getSymphonyExampleAntennaSymphonyPackage() {
		return (SymphonyExampleAntennaSymphonyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SymphonyExampleAntennaSymphonyPackage getPackage() {
		return SymphonyExampleAntennaSymphonyPackage.eINSTANCE;
	}

} //SymphonyExampleAntennaSymphonyFactoryImpl
