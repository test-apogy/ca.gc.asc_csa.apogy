package ca.gc.asc_csa.apogy.core.environment.orbit.util;
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.emf.Timed;
import ca.gc.asc_csa.apogy.core.AbstractOrbitModel;
import ca.gc.asc_csa.apogy.core.AbstractWorksite;
import ca.gc.asc_csa.apogy.core.environment.Worksite;
import ca.gc.asc_csa.apogy.core.environment.orbit.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage
 * @generated
 */
public class ApogyCoreEnvironmentOrbitSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogyCoreEnvironmentOrbitPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentOrbitSwitch() {
		if (modelPackage == null) {
			modelPackage = ApogyCoreEnvironmentOrbitPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE: {
				OrbitWorksite orbitWorksite = (OrbitWorksite)theEObject;
				T result = caseOrbitWorksite(orbitWorksite);
				if (result == null) result = caseWorksite(orbitWorksite);
				if (result == null) result = caseAbstractWorksite(orbitWorksite);
				if (result == null) result = caseNamed(orbitWorksite);
				if (result == null) result = caseDescribed(orbitWorksite);
				if (result == null) result = caseTimed(orbitWorksite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_FRAME: {
				AbstractFrame abstractFrame = (AbstractFrame)theEObject;
				T result = caseAbstractFrame(abstractFrame);
				if (result == null) result = caseNamed(abstractFrame);
				if (result == null) result = caseDescribed(abstractFrame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES: {
				PVACoordinates pvaCoordinates = (PVACoordinates)theEObject;
				T result = casePVACoordinates(pvaCoordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentOrbitPackage.TIMED_STAMPED_PVA_COORDINATES: {
				TimedStampedPVACoordinates timedStampedPVACoordinates = (TimedStampedPVACoordinates)theEObject;
				T result = caseTimedStampedPVACoordinates(timedStampedPVACoordinates);
				if (result == null) result = casePVACoordinates(timedStampedPVACoordinates);
				if (result == null) result = caseTimed(timedStampedPVACoordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentOrbitPackage.PV_COORDINATES_PROVIDER_PROVIDER: {
				PVCoordinatesProviderProvider pvCoordinatesProviderProvider = (PVCoordinatesProviderProvider)theEObject;
				T result = casePVCoordinatesProviderProvider(pvCoordinatesProviderProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentOrbitPackage.ANGULAR_COORDINATES: {
				AngularCoordinates angularCoordinates = (AngularCoordinates)theEObject;
				T result = caseAngularCoordinates(angularCoordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentOrbitPackage.TIMED_STAMPED_ANGULAR_COORDINATES: {
				TimedStampedAngularCoordinates timedStampedAngularCoordinates = (TimedStampedAngularCoordinates)theEObject;
				T result = caseTimedStampedAngularCoordinates(timedStampedAngularCoordinates);
				if (result == null) result = caseAngularCoordinates(timedStampedAngularCoordinates);
				if (result == null) result = caseTimed(timedStampedAngularCoordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE: {
				SpacecraftAttitude spacecraftAttitude = (SpacecraftAttitude)theEObject;
				T result = caseSpacecraftAttitude(spacecraftAttitude);
				if (result == null) result = caseTimed(spacecraftAttitude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentOrbitPackage.ATTITUDE_PROVIDER: {
				AttitudeProvider attitudeProvider = (AttitudeProvider)theEObject;
				T result = caseAttitudeProvider(attitudeProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentOrbitPackage.SPACECRAFT_STATE: {
				SpacecraftState spacecraftState = (SpacecraftState)theEObject;
				T result = caseSpacecraftState(spacecraftState);
				if (result == null) result = caseTimed(spacecraftState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentOrbitPackage.ORBIT: {
				Orbit orbit = (Orbit)theEObject;
				T result = caseOrbit(orbit);
				if (result == null) result = caseNamed(orbit);
				if (result == null) result = caseDescribed(orbit);
				if (result == null) result = caseTimed(orbit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR: {
				AbstractOrbitPropagator abstractOrbitPropagator = (AbstractOrbitPropagator)theEObject;
				T result = caseAbstractOrbitPropagator(abstractOrbitPropagator);
				if (result == null) result = caseNamed(abstractOrbitPropagator);
				if (result == null) result = caseDescribed(abstractOrbitPropagator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL: {
				OrbitModel orbitModel = (OrbitModel)theEObject;
				T result = caseOrbitModel(orbitModel);
				if (result == null) result = caseAbstractOrbitModel(orbitModel);
				if (result == null) result = caseNamed(orbitModel);
				if (result == null) result = caseDescribed(orbitModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentOrbitPackage.APOGY_CORE_ENVIRONMENT_ORBIT_FACADE: {
				ApogyCoreEnvironmentOrbitFacade apogyCoreEnvironmentOrbitFacade = (ApogyCoreEnvironmentOrbitFacade)theEObject;
				T result = caseApogyCoreEnvironmentOrbitFacade(apogyCoreEnvironmentOrbitFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orbit Worksite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orbit Worksite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrbitWorksite(OrbitWorksite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFrame(AbstractFrame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PVA Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PVA Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePVACoordinates(PVACoordinates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Stamped PVA Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Stamped PVA Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedStampedPVACoordinates(TimedStampedPVACoordinates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PV Coordinates Provider Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PV Coordinates Provider Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePVCoordinatesProviderProvider(PVCoordinatesProviderProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angular Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angular Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngularCoordinates(AngularCoordinates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Stamped Angular Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Stamped Angular Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedStampedAngularCoordinates(TimedStampedAngularCoordinates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spacecraft Attitude</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spacecraft Attitude</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpacecraftAttitude(SpacecraftAttitude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attitude Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attitude Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttitudeProvider(AttitudeProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spacecraft State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spacecraft State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpacecraftState(SpacecraftState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orbit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orbit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrbit(Orbit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Orbit Propagator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Orbit Propagator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractOrbitPropagator(AbstractOrbitPropagator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orbit Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orbit Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrbitModel(OrbitModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApogyCoreEnvironmentOrbitFacade(ApogyCoreEnvironmentOrbitFacade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamed(Named object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Described</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribed(Described object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimed(Timed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Worksite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Worksite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractWorksite(AbstractWorksite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Worksite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Worksite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorksite(Worksite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Orbit Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Orbit Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractOrbitModel(AbstractOrbitModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ApogyCoreEnvironmentOrbitSwitch
