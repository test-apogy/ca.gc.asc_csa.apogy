/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.impl;

import ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.*;

import java.util.List;
import java.util.SortedSet;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class EMFEcoreExampleSatelliteFactoryImpl extends EFactoryImpl implements EMFEcoreExampleSatelliteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EMFEcoreExampleSatelliteFactory init() {
		try {
			EMFEcoreExampleSatelliteFactory theEMFEcoreExampleSatelliteFactory = (EMFEcoreExampleSatelliteFactory)EPackage.Registry.INSTANCE.getEFactory(EMFEcoreExampleSatellitePackage.eNS_URI);
			if (theEMFEcoreExampleSatelliteFactory != null) {
				return theEMFEcoreExampleSatelliteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EMFEcoreExampleSatelliteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFEcoreExampleSatelliteFactoryImpl() {
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
			case EMFEcoreExampleSatellitePackage.SATELLITE_SIMULATED: return createSatelliteSimulated();
			case EMFEcoreExampleSatellitePackage.SATELLITE_STUB: return createSatelliteStub();
			case EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND: return createSatelliteCommand();
			case EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND_LIST: return createSatelliteCommandList();
			case EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND_ROLL: return createSatelliteCommandRoll();
			case EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND_ACQUIRE_IMAGE: return createSatelliteCommandAcquireImage();
			case EMFEcoreExampleSatellitePackage.IMAGE_ORDER: return createImageOrder();
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER: return createSatelliteImager();
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE: return createOrbitalImage();
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION: return createSatelliteConstellation();
			case EMFEcoreExampleSatellitePackage.SATELLITE_UTILS: return createSatelliteUtils();
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_TYPE_API_ADAPTER: return createSatelliteConstellationTypeApiAdapter();
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA: return createSatelliteConstellationInitializationData();
			case EMFEcoreExampleSatellitePackage.SATELLITE_INITIALIZATION_DATA: return createSatelliteInitializationData();
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
			case EMFEcoreExampleSatellitePackage.LIST:
				return createListFromString(eDataType, initialValue);
			case EMFEcoreExampleSatellitePackage.SORTED_SET:
				return createSortedSetFromString(eDataType, initialValue);
			case EMFEcoreExampleSatellitePackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
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
			case EMFEcoreExampleSatellitePackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case EMFEcoreExampleSatellitePackage.SORTED_SET:
				return convertSortedSetToString(eDataType, instanceValue);
			case EMFEcoreExampleSatellitePackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatelliteSimulated createSatelliteSimulated() {
		SatelliteSimulatedImpl satelliteSimulated = new SatelliteSimulatedImpl();
		return satelliteSimulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatelliteStub createSatelliteStub() {
		SatelliteStubImpl satelliteStub = new SatelliteStubImpl();
		return satelliteStub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatelliteCommand createSatelliteCommand() {
		SatelliteCommandImpl satelliteCommand = new SatelliteCommandImpl();
		return satelliteCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatelliteCommandList createSatelliteCommandList() {
		SatelliteCommandListImpl satelliteCommandList = new SatelliteCommandListImpl();
		return satelliteCommandList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatelliteCommandRoll createSatelliteCommandRoll() {
		SatelliteCommandRollImpl satelliteCommandRoll = new SatelliteCommandRollImpl();
		return satelliteCommandRoll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatelliteCommandAcquireImage createSatelliteCommandAcquireImage() {
		SatelliteCommandAcquireImageImpl satelliteCommandAcquireImage = new SatelliteCommandAcquireImageImpl();
		return satelliteCommandAcquireImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageOrder createImageOrder() {
		ImageOrderImpl imageOrder = new ImageOrderImpl();
		return imageOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatelliteImager createSatelliteImager() {
		SatelliteImagerImpl satelliteImager = new SatelliteImagerImpl();
		return satelliteImager;
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
	public SatelliteConstellation createSatelliteConstellation() {
		SatelliteConstellationImpl satelliteConstellation = new SatelliteConstellationImpl();
		return satelliteConstellation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatelliteConstellationInitializationData createSatelliteConstellationInitializationData() {
		SatelliteConstellationInitializationDataImpl satelliteConstellationInitializationData = new SatelliteConstellationInitializationDataImpl();
		return satelliteConstellationInitializationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatelliteConstellationTypeApiAdapter createSatelliteConstellationTypeApiAdapter() {
		SatelliteConstellationTypeApiAdapterImpl satelliteConstellationTypeApiAdapter = new SatelliteConstellationTypeApiAdapterImpl();
		return satelliteConstellationTypeApiAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatelliteInitializationData createSatelliteInitializationData() {
		SatelliteInitializationDataImpl satelliteInitializationData = new SatelliteInitializationDataImpl();
		return satelliteInitializationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatelliteUtils createSatelliteUtils() {
		SatelliteUtilsImpl satelliteUtils = new SatelliteUtilsImpl();
		return satelliteUtils;
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
	public Exception createExceptionFromString(EDataType eDataType, String initialValue) {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFEcoreExampleSatellitePackage getEMFEcoreExampleSatellitePackage() {
		return (EMFEcoreExampleSatellitePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EMFEcoreExampleSatellitePackage getPackage() {
		return EMFEcoreExampleSatellitePackage.eINSTANCE;
	}

} //EMFEcoreExampleSatelliteFactoryImpl
