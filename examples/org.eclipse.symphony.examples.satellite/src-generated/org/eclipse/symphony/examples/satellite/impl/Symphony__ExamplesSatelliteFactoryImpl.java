/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.impl;

import java.util.List;
import java.util.SortedSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.symphony.examples.satellite.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__ExamplesSatelliteFactoryImpl extends EFactoryImpl implements Symphony__ExamplesSatelliteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__ExamplesSatelliteFactory init() {
		try {
			Symphony__ExamplesSatelliteFactory theSymphony__ExamplesSatelliteFactory = (Symphony__ExamplesSatelliteFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__ExamplesSatellitePackage.eNS_URI);
			if (theSymphony__ExamplesSatelliteFactory != null) {
				return theSymphony__ExamplesSatelliteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__ExamplesSatelliteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__ExamplesSatelliteFactoryImpl() {
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
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN: return createConstellationCommandPlan();
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN_ITEM: return createConstellationCommandPlanItem();
			case Symphony__ExamplesSatellitePackage.DEFAULT_CONSTELLATION: return createDefaultConstellation();
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST: return createConstellationRequestsList();
			case Symphony__ExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST: return createImageConstellationRequest();
			case Symphony__ExamplesSatellitePackage.SATELLITES_LIST: return createSatellitesList();
			case Symphony__ExamplesSatellitePackage.SATELLITE: return createSatellite();
			case Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND: return createAbstractSatelliteCommand();
			case Symphony__ExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND: return createAcquireImageSatelliteCommand();
			case Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE: return createOrbitalImage();
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_DOWNLINKS_LIST: return createConstellationDownlinksList();
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_DOWNLINK: return createConstellationDownlink();
			case Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE_CONSTELLATION_DOWNLINK_ITEM: return createOrbitalImageConstellationDownlinkItem();
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_UTILITIES: return createConstellationUtilities();
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
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_REQUEST_PRIORITY:
				return createConstellationRequestPriorityFromString(eDataType, initialValue);
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_REQUEST_STATUS:
				return createConstellationRequestStatusFromString(eDataType, initialValue);
			case Symphony__ExamplesSatellitePackage.LIST:
				return createListFromString(eDataType, initialValue);
			case Symphony__ExamplesSatellitePackage.SORTED_SET:
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
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_REQUEST_PRIORITY:
				return convertConstellationRequestPriorityToString(eDataType, instanceValue);
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_REQUEST_STATUS:
				return convertConstellationRequestStatusToString(eDataType, instanceValue);
			case Symphony__ExamplesSatellitePackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case Symphony__ExamplesSatellitePackage.SORTED_SET:
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
	public AbstractSatelliteCommand createAbstractSatelliteCommand() {
		AbstractSatelliteCommandImpl abstractSatelliteCommand = new AbstractSatelliteCommandImpl();
		return abstractSatelliteCommand;
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
	public Symphony__ExamplesSatellitePackage getSymphony__ExamplesSatellitePackage() {
		return (Symphony__ExamplesSatellitePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__ExamplesSatellitePackage getPackage() {
		return Symphony__ExamplesSatellitePackage.eINSTANCE;
	}

} //Symphony__ExamplesSatelliteFactoryImpl
