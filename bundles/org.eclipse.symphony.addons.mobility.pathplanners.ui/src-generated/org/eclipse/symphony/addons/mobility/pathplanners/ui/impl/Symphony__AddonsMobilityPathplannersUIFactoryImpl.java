/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.mobility.pathplanners.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.addons.mobility.pathplanners.ui.CircularExclusionZonePresentation;
import org.eclipse.symphony.addons.mobility.pathplanners.ui.Symphony__AddonsMobilityPathplannersUIFactory;
import org.eclipse.symphony.addons.mobility.pathplanners.ui.Symphony__AddonsMobilityPathplannersUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsMobilityPathplannersUIFactoryImpl extends EFactoryImpl implements Symphony__AddonsMobilityPathplannersUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__AddonsMobilityPathplannersUIFactory init() {
		try {
			Symphony__AddonsMobilityPathplannersUIFactory theSymphony__AddonsMobilityPathplannersUIFactory = (Symphony__AddonsMobilityPathplannersUIFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__AddonsMobilityPathplannersUIPackage.eNS_URI);
			if (theSymphony__AddonsMobilityPathplannersUIFactory != null) {
				return theSymphony__AddonsMobilityPathplannersUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__AddonsMobilityPathplannersUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsMobilityPathplannersUIFactoryImpl() {
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
			case Symphony__AddonsMobilityPathplannersUIPackage.CIRCULAR_EXCLUSION_ZONE_PRESENTATION: return createCircularExclusionZonePresentation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircularExclusionZonePresentation createCircularExclusionZonePresentation() {
		CircularExclusionZonePresentationImpl circularExclusionZonePresentation = new CircularExclusionZonePresentationImpl();
		return circularExclusionZonePresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsMobilityPathplannersUIPackage getSymphony__AddonsMobilityPathplannersUIPackage() {
		return (Symphony__AddonsMobilityPathplannersUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__AddonsMobilityPathplannersUIPackage getPackage() {
		return Symphony__AddonsMobilityPathplannersUIPackage.eINSTANCE;
	}

} //Symphony__AddonsMobilityPathplannersUIFactoryImpl
