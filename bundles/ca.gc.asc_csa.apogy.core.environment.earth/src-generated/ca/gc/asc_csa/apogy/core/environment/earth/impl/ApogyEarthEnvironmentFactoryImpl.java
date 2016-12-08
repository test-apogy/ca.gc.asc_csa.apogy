/**
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
package ca.gc.asc_csa.apogy.core.environment.earth.impl;

import ca.gc.asc_csa.apogy.core.environment.earth.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyEarthEnvironmentFactoryImpl extends EFactoryImpl implements ApogyEarthEnvironmentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyEarthEnvironmentFactory init() {
		try {
			ApogyEarthEnvironmentFactory theApogyEarthEnvironmentFactory = (ApogyEarthEnvironmentFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyEarthEnvironmentPackage.eNS_URI);
			if (theApogyEarthEnvironmentFactory != null) {
				return theApogyEarthEnvironmentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyEarthEnvironmentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyEarthEnvironmentFactoryImpl() {
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
			case ApogyEarthEnvironmentPackage.GEOGRAPHIC_COORDINATES: return createGeographicCoordinates();
			case ApogyEarthEnvironmentPackage.HORIZONTAL_COORDINATES: return createHorizontalCoordinates();
			case ApogyEarthEnvironmentPackage.ECLIPTIC_COORDINATES: return createEclipticCoordinates();
			case ApogyEarthEnvironmentPackage.APOGY_EARTH_FACADE: return createApogyEarthFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographicCoordinates createGeographicCoordinates() {
		GeographicCoordinatesImpl geographicCoordinates = new GeographicCoordinatesImpl();
		return geographicCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalCoordinates createHorizontalCoordinates() {
		HorizontalCoordinatesImpl horizontalCoordinates = new HorizontalCoordinatesImpl();
		return horizontalCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipticCoordinates createEclipticCoordinates() {
		EclipticCoordinatesImpl eclipticCoordinates = new EclipticCoordinatesImpl();
		return eclipticCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyEarthFacade createApogyEarthFacade() {
		ApogyEarthFacadeImpl apogyEarthFacade = new ApogyEarthFacadeImpl();
		return apogyEarthFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyEarthEnvironmentPackage getApogyEarthEnvironmentPackage() {
		return (ApogyEarthEnvironmentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyEarthEnvironmentPackage getPackage() {
		return ApogyEarthEnvironmentPackage.eINSTANCE;
	}

} //ApogyEarthEnvironmentFactoryImpl
