package ca.gc.asc_csa.apogy.examples.satellite.util;
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

import ca.gc.asc_csa.apogy.common.images.AbstractEImage;

import ca.gc.asc_csa.apogy.common.images.EImage;
import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;
import ca.gc.asc_csa.apogy.examples.satellite.*;

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
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage
 * @generated
 */
public class ApogyExamplesSatelliteSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogyExamplesSatellitePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesSatelliteSwitch() {
		if (modelPackage == null) {
			modelPackage = ApogyExamplesSatellitePackage.eINSTANCE;
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
			case ApogyExamplesSatellitePackage.UID: {
				UID uid = (UID)theEObject;
				T result = caseUID(uid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesSatellitePackage.DIGIT_UID: {
				DigitUID digitUID = (DigitUID)theEObject;
				T result = caseDigitUID(digitUID);
				if (result == null) result = caseUID(digitUID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLANS_LIST: {
				ConstellationCommandPlansList constellationCommandPlansList = (ConstellationCommandPlansList)theEObject;
				T result = caseConstellationCommandPlansList(constellationCommandPlansList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION: {
				AbstractConstellation abstractConstellation = (AbstractConstellation)theEObject;
				T result = caseAbstractConstellation(abstractConstellation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN: {
				ConstellationCommandPlan constellationCommandPlan = (ConstellationCommandPlan)theEObject;
				T result = caseConstellationCommandPlan(constellationCommandPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN_ITEM: {
				ConstellationCommandPlanItem constellationCommandPlanItem = (ConstellationCommandPlanItem)theEObject;
				T result = caseConstellationCommandPlanItem(constellationCommandPlanItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesSatellitePackage.DEFAULT_CONSTELLATION: {
				DefaultConstellation defaultConstellation = (DefaultConstellation)theEObject;
				T result = caseDefaultConstellation(defaultConstellation);
				if (result == null) result = caseAbstractConstellation(defaultConstellation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST: {
				ConstellationRequestsList constellationRequestsList = (ConstellationRequestsList)theEObject;
				T result = caseConstellationRequestsList(constellationRequestsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST: {
				AbstractConstellationRequest abstractConstellationRequest = (AbstractConstellationRequest)theEObject;
				T result = caseAbstractConstellationRequest(abstractConstellationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesSatellitePackage.DEFAULT_CONSTELLATION_REQUEST: {
				DefaultConstellationRequest defaultConstellationRequest = (DefaultConstellationRequest)theEObject;
				T result = caseDefaultConstellationRequest(defaultConstellationRequest);
				if (result == null) result = caseAbstractConstellationRequest(defaultConstellationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST: {
				ImageConstellationRequest imageConstellationRequest = (ImageConstellationRequest)theEObject;
				T result = caseImageConstellationRequest(imageConstellationRequest);
				if (result == null) result = caseDefaultConstellationRequest(imageConstellationRequest);
				if (result == null) result = caseGeographicCoordinates(imageConstellationRequest);
				if (result == null) result = caseAbstractConstellationRequest(imageConstellationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesSatellitePackage.SATELLITES_LIST: {
				SatellitesList satellitesList = (SatellitesList)theEObject;
				T result = caseSatellitesList(satellitesList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesSatellitePackage.SATELLITE: {
				Satellite satellite = (Satellite)theEObject;
				T result = caseSatellite(satellite);
				if (result == null) result = caseNamed(satellite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND: {
				AbstractSatelliteCommand abstractSatelliteCommand = (AbstractSatelliteCommand)theEObject;
				T result = caseAbstractSatelliteCommand(abstractSatelliteCommand);
				if (result == null) result = caseGeographicCoordinates(abstractSatelliteCommand);
				if (result == null) result = caseTimed(abstractSatelliteCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND: {
				AcquireImageSatelliteCommand acquireImageSatelliteCommand = (AcquireImageSatelliteCommand)theEObject;
				T result = caseAcquireImageSatelliteCommand(acquireImageSatelliteCommand);
				if (result == null) result = caseAbstractSatelliteCommand(acquireImageSatelliteCommand);
				if (result == null) result = caseGeographicCoordinates(acquireImageSatelliteCommand);
				if (result == null) result = caseTimed(acquireImageSatelliteCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesSatellitePackage.ORBITAL_IMAGE: {
				OrbitalImage orbitalImage = (OrbitalImage)theEObject;
				T result = caseOrbitalImage(orbitalImage);
				if (result == null) result = caseEImage(orbitalImage);
				if (result == null) result = caseAbstractEImage(orbitalImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesSatellitePackage.TURN_ON_SATELLITE_COMMAND: {
				TurnOnSatelliteCommand turnOnSatelliteCommand = (TurnOnSatelliteCommand)theEObject;
				T result = caseTurnOnSatelliteCommand(turnOnSatelliteCommand);
				if (result == null) result = caseAbstractSatelliteCommand(turnOnSatelliteCommand);
				if (result == null) result = caseGeographicCoordinates(turnOnSatelliteCommand);
				if (result == null) result = caseTimed(turnOnSatelliteCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesSatellitePackage.TURN_OFF_SATELLITE_COMMAND: {
				TurnOffSatelliteCommand turnOffSatelliteCommand = (TurnOffSatelliteCommand)theEObject;
				T result = caseTurnOffSatelliteCommand(turnOffSatelliteCommand);
				if (result == null) result = caseAbstractSatelliteCommand(turnOffSatelliteCommand);
				if (result == null) result = caseGeographicCoordinates(turnOffSatelliteCommand);
				if (result == null) result = caseTimed(turnOffSatelliteCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINKS_LIST: {
				ConstellationDownlinksList constellationDownlinksList = (ConstellationDownlinksList)theEObject;
				T result = caseConstellationDownlinksList(constellationDownlinksList);
				if (result == null) result = caseNamed(constellationDownlinksList);
				if (result == null) result = caseDescribed(constellationDownlinksList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINK: {
				ConstellationDownlink constellationDownlink = (ConstellationDownlink)theEObject;
				T result = caseConstellationDownlink(constellationDownlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_DOWNLINK_ITEM: {
				AbstractConstellationDownlinkItem abstractConstellationDownlinkItem = (AbstractConstellationDownlinkItem)theEObject;
				T result = caseAbstractConstellationDownlinkItem(abstractConstellationDownlinkItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesSatellitePackage.ORBITAL_IMAGE_CONSTELLATION_DOWNLINK_ITEM: {
				OrbitalImageConstellationDownlinkItem orbitalImageConstellationDownlinkItem = (OrbitalImageConstellationDownlinkItem)theEObject;
				T result = caseOrbitalImageConstellationDownlinkItem(orbitalImageConstellationDownlinkItem);
				if (result == null) result = caseAbstractConstellationDownlinkItem(orbitalImageConstellationDownlinkItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesSatellitePackage.CONSTELLATION_UTILITIES: {
				ConstellationUtilities constellationUtilities = (ConstellationUtilities)theEObject;
				T result = caseConstellationUtilities(constellationUtilities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUID(UID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digit UID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digit UID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigitUID(DigitUID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constellation Command Plans List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constellation Command Plans List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstellationCommandPlansList(ConstellationCommandPlansList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Constellation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Constellation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractConstellation(AbstractConstellation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constellation Command Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constellation Command Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstellationCommandPlan(ConstellationCommandPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constellation Command Plan Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constellation Command Plan Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstellationCommandPlanItem(ConstellationCommandPlanItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Constellation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Constellation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultConstellation(DefaultConstellation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constellation Requests List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constellation Requests List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstellationRequestsList(ConstellationRequestsList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Constellation Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Constellation Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractConstellationRequest(AbstractConstellationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Constellation Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Constellation Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultConstellationRequest(DefaultConstellationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Constellation Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Constellation Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageConstellationRequest(ImageConstellationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satellites List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satellites List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatellitesList(SatellitesList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satellite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satellite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatellite(Satellite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Satellite Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Satellite Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSatelliteCommand(AbstractSatelliteCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acquire Image Satellite Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acquire Image Satellite Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcquireImageSatelliteCommand(AcquireImageSatelliteCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orbital Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orbital Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrbitalImage(OrbitalImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn On Satellite Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn On Satellite Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnOnSatelliteCommand(TurnOnSatelliteCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Off Satellite Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Off Satellite Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnOffSatelliteCommand(TurnOffSatelliteCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constellation Downlinks List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constellation Downlinks List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstellationDownlinksList(ConstellationDownlinksList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constellation Downlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constellation Downlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstellationDownlink(ConstellationDownlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Constellation Downlink Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Constellation Downlink Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractConstellationDownlinkItem(AbstractConstellationDownlinkItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orbital Image Constellation Downlink Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orbital Image Constellation Downlink Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrbitalImageConstellationDownlinkItem(OrbitalImageConstellationDownlinkItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constellation Utilities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constellation Utilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstellationUtilities(ConstellationUtilities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geographic Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geographic Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeographicCoordinates(GeographicCoordinates object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract EImage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract EImage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEImage(AbstractEImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EImage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EImage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEImage(EImage object) {
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

} //ApogyExamplesSatelliteSwitch
