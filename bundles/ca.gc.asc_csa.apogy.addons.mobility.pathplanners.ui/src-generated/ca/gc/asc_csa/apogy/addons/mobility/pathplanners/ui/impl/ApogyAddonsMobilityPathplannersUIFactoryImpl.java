package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ui.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ui.CircularExclusionZonePresentation;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ui.ApogyAddonsMobilityPathplannersUIFactory;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ui.ApogyAddonsMobilityPathplannersUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsMobilityPathplannersUIFactoryImpl extends EFactoryImpl implements ApogyAddonsMobilityPathplannersUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyAddonsMobilityPathplannersUIFactory init() {
		try {
			ApogyAddonsMobilityPathplannersUIFactory theApogyAddonsMobilityPathplannersUIFactory = (ApogyAddonsMobilityPathplannersUIFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsMobilityPathplannersUIPackage.eNS_URI);
			if (theApogyAddonsMobilityPathplannersUIFactory != null) {
				return theApogyAddonsMobilityPathplannersUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsMobilityPathplannersUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsMobilityPathplannersUIFactoryImpl() {
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
			case ApogyAddonsMobilityPathplannersUIPackage.CIRCULAR_EXCLUSION_ZONE_PRESENTATION: return createCircularExclusionZonePresentation();
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
	public ApogyAddonsMobilityPathplannersUIPackage getApogyAddonsMobilityPathplannersUIPackage() {
		return (ApogyAddonsMobilityPathplannersUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyAddonsMobilityPathplannersUIPackage getPackage() {
		return ApogyAddonsMobilityPathplannersUIPackage.eINSTANCE;
	}

} //ApogyAddonsMobilityPathplannersUIFactoryImpl
