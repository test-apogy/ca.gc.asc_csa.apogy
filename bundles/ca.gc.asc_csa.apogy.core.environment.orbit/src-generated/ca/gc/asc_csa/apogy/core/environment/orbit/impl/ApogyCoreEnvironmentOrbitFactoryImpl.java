/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.core.environment.orbit.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CoreEnvironmentOrbitFactoryImpl extends EFactoryImpl implements Symphony__CoreEnvironmentOrbitFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__CoreEnvironmentOrbitFactory init() {
		try {
			Symphony__CoreEnvironmentOrbitFactory theSymphony__CoreEnvironmentOrbitFactory = (Symphony__CoreEnvironmentOrbitFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CoreEnvironmentOrbitPackage.eNS_URI);
			if (theSymphony__CoreEnvironmentOrbitFactory != null) {
				return theSymphony__CoreEnvironmentOrbitFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CoreEnvironmentOrbitFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CoreEnvironmentOrbitFactoryImpl() {
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
			case Symphony__CoreEnvironmentOrbitPackage.PVA_COORDINATES: return createPVACoordinates();
			case Symphony__CoreEnvironmentOrbitPackage.TIMED_STAMPED_PVA_COORDINATES: return createTimedStampedPVACoordinates();
			case Symphony__CoreEnvironmentOrbitPackage.ANGULAR_COORDINATES: return createAngularCoordinates();
			case Symphony__CoreEnvironmentOrbitPackage.TIMED_STAMPED_ANGULAR_COORDINATES: return createTimedStampedAngularCoordinates();
			case Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE: return createSpacecraftAttitude();
			case Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_STATE: return createSpacecraftState();
			case Symphony__CoreEnvironmentOrbitPackage.ORBIT_MODEL: return createOrbitModel();
			case Symphony__CoreEnvironmentOrbitPackage.SYMPHONY_CORE_ENVIRONMENT_ORBIT_FACADE: return createSymphony__CoreEnvironmentOrbitFacade();
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
			case Symphony__CoreEnvironmentOrbitPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case Symphony__CoreEnvironmentOrbitPackage.EXCEPTION:
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
			case Symphony__CoreEnvironmentOrbitPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case Symphony__CoreEnvironmentOrbitPackage.EXCEPTION:
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
	public Symphony__CoreEnvironmentOrbitFacade createSymphony__CoreEnvironmentOrbitFacade() {
		Symphony__CoreEnvironmentOrbitFacadeImpl symphony__CoreEnvironmentOrbitFacade = new Symphony__CoreEnvironmentOrbitFacadeImpl();
		return symphony__CoreEnvironmentOrbitFacade;
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
	public Symphony__CoreEnvironmentOrbitPackage getSymphony__CoreEnvironmentOrbitPackage() {
		return (Symphony__CoreEnvironmentOrbitPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__CoreEnvironmentOrbitPackage getPackage() {
		return Symphony__CoreEnvironmentOrbitPackage.eINSTANCE;
	}

} //Symphony__CoreEnvironmentOrbitFactoryImpl
