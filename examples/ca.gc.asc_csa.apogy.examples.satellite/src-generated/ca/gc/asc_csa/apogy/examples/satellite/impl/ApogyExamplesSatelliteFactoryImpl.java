package ca.gc.asc_csa.apogy.examples.satellite.impl;
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

import java.util.List;
import java.util.SortedSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.asc_csa.apogy.examples.satellite.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesSatelliteFactoryImpl extends EFactoryImpl implements ApogyExamplesSatelliteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyExamplesSatelliteFactory init() {
		try {
			ApogyExamplesSatelliteFactory theApogyExamplesSatelliteFactory = (ApogyExamplesSatelliteFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyExamplesSatellitePackage.eNS_URI);
			if (theApogyExamplesSatelliteFactory != null) {
				return theApogyExamplesSatelliteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyExamplesSatelliteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesSatelliteFactoryImpl() {
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
			case ApogyExamplesSatellitePackage.DIGIT_UID: return createDigitUID();
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLANS_LIST: return createConstellationCommandPlansList();
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN: return createConstellationCommandPlan();
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN_ITEM: return createConstellationCommandPlanItem();
			case ApogyExamplesSatellitePackage.DEFAULT_CONSTELLATION: return createDefaultConstellation();
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST: return createConstellationRequestsList();
			case ApogyExamplesSatellitePackage.DEFAULT_CONSTELLATION_REQUEST: return createDefaultConstellationRequest();
			case ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST: return createImageConstellationRequest();
			case ApogyExamplesSatellitePackage.SATELLITES_LIST: return createSatellitesList();
			case ApogyExamplesSatellitePackage.SATELLITE: return createSatellite();
			case ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND: return createAcquireImageSatelliteCommand();
			case ApogyExamplesSatellitePackage.ORBITAL_IMAGE: return createOrbitalImage();
			case ApogyExamplesSatellitePackage.TURN_ON_SATELLITE_COMMAND: return createTurnOnSatelliteCommand();
			case ApogyExamplesSatellitePackage.TURN_OFF_SATELLITE_COMMAND: return createTurnOffSatelliteCommand();
			case ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINKS_LIST: return createConstellationDownlinksList();
			case ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINK: return createConstellationDownlink();
			case ApogyExamplesSatellitePackage.ORBITAL_IMAGE_CONSTELLATION_DOWNLINK_ITEM: return createOrbitalImageConstellationDownlinkItem();
			case ApogyExamplesSatellitePackage.CONSTELLATION_UTILITIES: return createConstellationUtilities();
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUEST_PRIORITY:
				return createConstellationRequestPriorityFromString(eDataType, initialValue);
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUEST_STATUS:
				return createConstellationRequestStatusFromString(eDataType, initialValue);
			case ApogyExamplesSatellitePackage.LIST:
				return createListFromString(eDataType, initialValue);
			case ApogyExamplesSatellitePackage.SORTED_SET:
				return createSortedSetFromString(eDataType, initialValue);
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUEST_PRIORITY:
				return convertConstellationRequestPriorityToString(eDataType, instanceValue);
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUEST_STATUS:
				return convertConstellationRequestStatusToString(eDataType, instanceValue);
			case ApogyExamplesSatellitePackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case ApogyExamplesSatellitePackage.SORTED_SET:
				return convertSortedSetToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitUID createDigitUID() {
		DigitUIDImpl digitUID = new DigitUIDImpl();
		return digitUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationCommandPlansList createConstellationCommandPlansList() {
		ConstellationCommandPlansListImpl constellationCommandPlansList = new ConstellationCommandPlansListImpl();
		return constellationCommandPlansList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationCommandPlan createConstellationCommandPlan() {
		ConstellationCommandPlanImpl constellationCommandPlan = new ConstellationCommandPlanImpl();
		return constellationCommandPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationCommandPlanItem createConstellationCommandPlanItem() {
		ConstellationCommandPlanItemImpl constellationCommandPlanItem = new ConstellationCommandPlanItemImpl();
		return constellationCommandPlanItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultConstellation createDefaultConstellation() {
		DefaultConstellationImpl defaultConstellation = new DefaultConstellationImpl();
		return defaultConstellation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationRequestsList createConstellationRequestsList() {
		ConstellationRequestsListImpl constellationRequestsList = new ConstellationRequestsListImpl();
		return constellationRequestsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultConstellationRequest createDefaultConstellationRequest() {
		DefaultConstellationRequestImpl defaultConstellationRequest = new DefaultConstellationRequestImpl();
		return defaultConstellationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageConstellationRequest createImageConstellationRequest() {
		ImageConstellationRequestImpl imageConstellationRequest = new ImageConstellationRequestImpl();
		return imageConstellationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatellitesList createSatellitesList() {
		SatellitesListImpl satellitesList = new SatellitesListImpl();
		return satellitesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Satellite createSatellite() {
		SatelliteImpl satellite = new SatelliteImpl();
		return satellite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcquireImageSatelliteCommand createAcquireImageSatelliteCommand() {
		AcquireImageSatelliteCommandImpl acquireImageSatelliteCommand = new AcquireImageSatelliteCommandImpl();
		return acquireImageSatelliteCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrbitalImage createOrbitalImage() {
		OrbitalImageImpl orbitalImage = new OrbitalImageImpl();
		return orbitalImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnOnSatelliteCommand createTurnOnSatelliteCommand() {
		TurnOnSatelliteCommandImpl turnOnSatelliteCommand = new TurnOnSatelliteCommandImpl();
		return turnOnSatelliteCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnOffSatelliteCommand createTurnOffSatelliteCommand() {
		TurnOffSatelliteCommandImpl turnOffSatelliteCommand = new TurnOffSatelliteCommandImpl();
		return turnOffSatelliteCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationDownlinksList createConstellationDownlinksList() {
		ConstellationDownlinksListImpl constellationDownlinksList = new ConstellationDownlinksListImpl();
		return constellationDownlinksList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationDownlink createConstellationDownlink() {
		ConstellationDownlinkImpl constellationDownlink = new ConstellationDownlinkImpl();
		return constellationDownlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrbitalImageConstellationDownlinkItem createOrbitalImageConstellationDownlinkItem() {
		OrbitalImageConstellationDownlinkItemImpl orbitalImageConstellationDownlinkItem = new OrbitalImageConstellationDownlinkItemImpl();
		return orbitalImageConstellationDownlinkItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationUtilities createConstellationUtilities() {
		ConstellationUtilitiesImpl constellationUtilities = new ConstellationUtilitiesImpl();
		return constellationUtilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationRequestPriority createConstellationRequestPriorityFromString(EDataType eDataType, String initialValue) {
		ConstellationRequestPriority result = ConstellationRequestPriority.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstellationRequestPriorityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationRequestStatus createConstellationRequestStatusFromString(EDataType eDataType, String initialValue) {
		ConstellationRequestStatus result = ConstellationRequestStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstellationRequestStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<?> createListFromString(EDataType eDataType, String initialValue) {
		return (List<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortedSet<?> createSortedSetFromString(EDataType eDataType, String initialValue) {
		return (SortedSet<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortedSetToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesSatellitePackage getApogyExamplesSatellitePackage() {
		return (ApogyExamplesSatellitePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyExamplesSatellitePackage getPackage() {
		return ApogyExamplesSatellitePackage.eINSTANCE;
	}

} //ApogyExamplesSatelliteFactoryImpl
