package ca.gc.asc_csa.apogy.core.environment.orbit.impl;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.core.environment.orbit.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreEnvironmentOrbitFactoryImpl extends EFactoryImpl implements ApogyCoreEnvironmentOrbitFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCoreEnvironmentOrbitFactory init() {
		try {
			ApogyCoreEnvironmentOrbitFactory theApogyCoreEnvironmentOrbitFactory = (ApogyCoreEnvironmentOrbitFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCoreEnvironmentOrbitPackage.eNS_URI);
			if (theApogyCoreEnvironmentOrbitFactory != null) {
				return theApogyCoreEnvironmentOrbitFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCoreEnvironmentOrbitFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentOrbitFactoryImpl() {
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
			case ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES: return createPVACoordinates();
			case ApogyCoreEnvironmentOrbitPackage.TIMED_STAMPED_PVA_COORDINATES: return createTimedStampedPVACoordinates();
			case ApogyCoreEnvironmentOrbitPackage.ANGULAR_COORDINATES: return createAngularCoordinates();
			case ApogyCoreEnvironmentOrbitPackage.TIMED_STAMPED_ANGULAR_COORDINATES: return createTimedStampedAngularCoordinates();
			case ApogyCoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE: return createSpacecraftAttitude();
			case ApogyCoreEnvironmentOrbitPackage.SPACECRAFT_STATE: return createSpacecraftState();
			case ApogyCoreEnvironmentOrbitPackage.INITIAL_ORBIT_CONTAINER: return createInitialOrbitContainer();
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL: return createOrbitModel();
			case ApogyCoreEnvironmentOrbitPackage.APOGY_CORE_ENVIRONMENT_ORBIT_FACADE: return createApogyCoreEnvironmentOrbitFacade();
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
			case ApogyCoreEnvironmentOrbitPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitPackage.EXCEPTION:
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
			case ApogyCoreEnvironmentOrbitPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitPackage.EXCEPTION:
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
	public InitialOrbitContainer createInitialOrbitContainer() {
		InitialOrbitContainerImpl initialOrbitContainer = new InitialOrbitContainerImpl();
		return initialOrbitContainer;
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
	public ApogyCoreEnvironmentOrbitFacade createApogyCoreEnvironmentOrbitFacade() {
		ApogyCoreEnvironmentOrbitFacadeImpl apogyCoreEnvironmentOrbitFacade = new ApogyCoreEnvironmentOrbitFacadeImpl();
		return apogyCoreEnvironmentOrbitFacade;
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
	public ApogyCoreEnvironmentOrbitPackage getApogyCoreEnvironmentOrbitPackage() {
		return (ApogyCoreEnvironmentOrbitPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCoreEnvironmentOrbitPackage getPackage() {
		return ApogyCoreEnvironmentOrbitPackage.eINSTANCE;
	}

} //ApogyCoreEnvironmentOrbitFactoryImpl
