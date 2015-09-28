/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.impl;

import ca.gc.asc_csa.symphony.environment.orbit.*;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.symphony.environment.orbit.SymphonyOrbitEnvironmentFactory;
import ca.gc.asc_csa.symphony.environment.orbit.SymphonyOrbitEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyOrbitEnvironmentFactoryImpl extends EFactoryImpl implements SymphonyOrbitEnvironmentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SymphonyOrbitEnvironmentFactory init() {
		try {
			SymphonyOrbitEnvironmentFactory theSymphonyOrbitEnvironmentFactory = (SymphonyOrbitEnvironmentFactory)EPackage.Registry.INSTANCE.getEFactory(SymphonyOrbitEnvironmentPackage.eNS_URI);
			if (theSymphonyOrbitEnvironmentFactory != null) {
				return theSymphonyOrbitEnvironmentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SymphonyOrbitEnvironmentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyOrbitEnvironmentFactoryImpl() {
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
			case SymphonyOrbitEnvironmentPackage.PVA_COORDINATES: return createPVACoordinates();
			case SymphonyOrbitEnvironmentPackage.TIMED_STAMPED_PVA_COORDINATES: return createTimedStampedPVACoordinates();
			case SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES: return createAngularCoordinates();
			case SymphonyOrbitEnvironmentPackage.TIMED_STAMPED_ANGULAR_COORDINATES: return createTimedStampedAngularCoordinates();
			case SymphonyOrbitEnvironmentPackage.SPACECRAFT_ATTITUDE: return createSpacecraftAttitude();
			case SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE: return createSpacecraftState();
			case SymphonyOrbitEnvironmentPackage.ORBIT_MODEL: return createOrbitModel();
			case SymphonyOrbitEnvironmentPackage.ORBIT_FACADE: return createOrbitFacade();
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
			case SymphonyOrbitEnvironmentPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case SymphonyOrbitEnvironmentPackage.EXCEPTION:
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
			case SymphonyOrbitEnvironmentPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case SymphonyOrbitEnvironmentPackage.EXCEPTION:
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
	public PVACoordinates createPVACoordinates() {
		PVACoordinatesImpl pvaCoordinates = new PVACoordinatesImpl();
		return pvaCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedStampedPVACoordinates createTimedStampedPVACoordinates() {
		TimedStampedPVACoordinatesImpl timedStampedPVACoordinates = new TimedStampedPVACoordinatesImpl();
		return timedStampedPVACoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngularCoordinates createAngularCoordinates() {
		AngularCoordinatesImpl angularCoordinates = new AngularCoordinatesImpl();
		return angularCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedStampedAngularCoordinates createTimedStampedAngularCoordinates() {
		TimedStampedAngularCoordinatesImpl timedStampedAngularCoordinates = new TimedStampedAngularCoordinatesImpl();
		return timedStampedAngularCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftAttitude createSpacecraftAttitude() {
		SpacecraftAttitudeImpl spacecraftAttitude = new SpacecraftAttitudeImpl();
		return spacecraftAttitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftState createSpacecraftState() {
		SpacecraftStateImpl spacecraftState = new SpacecraftStateImpl();
		return spacecraftState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrbitModel createOrbitModel() {
		OrbitModelImpl orbitModel = new OrbitModelImpl();
		return orbitModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrbitFacade createOrbitFacade() {
		OrbitFacadeImpl orbitFacade = new OrbitFacadeImpl();
		return orbitFacade;
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
	public SymphonyOrbitEnvironmentPackage getSymphonyOrbitEnvironmentPackage() {
		return (SymphonyOrbitEnvironmentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SymphonyOrbitEnvironmentPackage getPackage() {
		return SymphonyOrbitEnvironmentPackage.eINSTANCE;
	}

} //SymphonyOrbitEnvironmentFactoryImpl
