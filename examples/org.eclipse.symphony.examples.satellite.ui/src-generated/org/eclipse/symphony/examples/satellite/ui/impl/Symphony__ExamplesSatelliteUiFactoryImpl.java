/**
 * Canadian Space Agency / Agence spatiale canadienne 2015-2016 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.symphony.examples.satellite.ui.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__ExamplesSatelliteUiFactoryImpl extends EFactoryImpl implements Symphony__ExamplesSatelliteUiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__ExamplesSatelliteUiFactory init() {
		try {
			Symphony__ExamplesSatelliteUiFactory theSymphony__ExamplesSatelliteUiFactory = (Symphony__ExamplesSatelliteUiFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__ExamplesSatelliteUiPackage.eNS_URI);
			if (theSymphony__ExamplesSatelliteUiFactory != null) {
				return theSymphony__ExamplesSatelliteUiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__ExamplesSatelliteUiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__ExamplesSatelliteUiFactoryImpl() {
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
			case Symphony__ExamplesSatelliteUiPackage.SYMPHONY_EXAMPLES_SATELLITE_UI_FACADE: return createSymphony__ExamplesSatelliteUiFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__ExamplesSatelliteUiFacade createSymphony__ExamplesSatelliteUiFacade() {
		Symphony__ExamplesSatelliteUiFacadeImpl symphony__ExamplesSatelliteUiFacade = new Symphony__ExamplesSatelliteUiFacadeImpl();
		return symphony__ExamplesSatelliteUiFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__ExamplesSatelliteUiPackage getSymphony__ExamplesSatelliteUiPackage() {
		return (Symphony__ExamplesSatelliteUiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__ExamplesSatelliteUiPackage getPackage() {
		return Symphony__ExamplesSatelliteUiPackage.eINSTANCE;
	}

} //Symphony__ExamplesSatelliteUiFactoryImpl
