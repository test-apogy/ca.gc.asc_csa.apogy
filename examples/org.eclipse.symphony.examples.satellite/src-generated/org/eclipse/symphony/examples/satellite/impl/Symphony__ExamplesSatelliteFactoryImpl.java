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
import org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatelliteFactory;
import org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage;
import org.eclipse.symphony.examples.satellite.ImageOrder;
import org.eclipse.symphony.examples.satellite.OrbitalImage;
import org.eclipse.symphony.examples.satellite.SatelliteCommand;
import org.eclipse.symphony.examples.satellite.SatelliteCommandAcquireImage;
import org.eclipse.symphony.examples.satellite.SatelliteCommandList;
import org.eclipse.symphony.examples.satellite.SatelliteCommandRoll;
import org.eclipse.symphony.examples.satellite.SatelliteConstellation;
import org.eclipse.symphony.examples.satellite.SatelliteConstellationInitializationData;
import org.eclipse.symphony.examples.satellite.SatelliteConstellationTypeApiAdapter;
import org.eclipse.symphony.examples.satellite.SatelliteImager;
import org.eclipse.symphony.examples.satellite.SatelliteInitializationData;
import org.eclipse.symphony.examples.satellite.SatelliteSimulated;
import org.eclipse.symphony.examples.satellite.SatelliteStub;
import org.eclipse.symphony.examples.satellite.SatelliteUtils;

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
			case Symphony__ExamplesSatellitePackage.SATELLITE_SIMULATED: return createSatelliteSimulated();
			case Symphony__ExamplesSatellitePackage.SATELLITE_STUB: return createSatelliteStub();
			case Symphony__ExamplesSatellitePackage.SATELLITE_COMMAND: return createSatelliteCommand();
			case Symphony__ExamplesSatellitePackage.SATELLITE_COMMAND_LIST: return createSatelliteCommandList();
			case Symphony__ExamplesSatellitePackage.SATELLITE_COMMAND_ROLL: return createSatelliteCommandRoll();
			case Symphony__ExamplesSatellitePackage.SATELLITE_COMMAND_ACQUIRE_IMAGE: return createSatelliteCommandAcquireImage();
			case Symphony__ExamplesSatellitePackage.IMAGE_ORDER: return createImageOrder();
			case Symphony__ExamplesSatellitePackage.SATELLITE_IMAGER: return createSatelliteImager();
			case Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE: return createOrbitalImage();
			case Symphony__ExamplesSatellitePackage.SATELLITE_CONSTELLATION: return createSatelliteConstellation();
			case Symphony__ExamplesSatellitePackage.SATELLITE_UTILS: return createSatelliteUtils();
			case Symphony__ExamplesSatellitePackage.SATELLITE_CONSTELLATION_TYPE_API_ADAPTER: return createSatelliteConstellationTypeApiAdapter();
			case Symphony__ExamplesSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA: return createSatelliteConstellationInitializationData();
			case Symphony__ExamplesSatellitePackage.SATELLITE_INITIALIZATION_DATA: return createSatelliteInitializationData();
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
			case Symphony__ExamplesSatellitePackage.LIST:
				return createListFromString(eDataType, initialValue);
			case Symphony__ExamplesSatellitePackage.SORTED_SET:
				return createSortedSetFromString(eDataType, initialValue);
			case Symphony__ExamplesSatellitePackage.EXCEPTION:
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
			case Symphony__ExamplesSatellitePackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case Symphony__ExamplesSatellitePackage.SORTED_SET:
				return convertSortedSetToString(eDataType, instanceValue);
			case Symphony__ExamplesSatellitePackage.EXCEPTION:
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
