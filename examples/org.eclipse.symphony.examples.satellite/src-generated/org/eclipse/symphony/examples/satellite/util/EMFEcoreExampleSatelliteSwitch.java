/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.util;

import ca.gc.space.mrt.sensors.imaging.AbstractCamera;
import ca.gc.space.mrt.sensors.imaging.Zoomable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.common.emf.Named;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.core.invocator.AbstractInitializationData;
import org.eclipse.symphony.core.invocator.TypeApiAdapter;
import org.eclipse.symphony.examples.satellite.*;

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
 * @see org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage
 * @generated
 */
public class EMFEcoreExampleSatelliteSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EMFEcoreExampleSatellitePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFEcoreExampleSatelliteSwitch() {
		if (modelPackage == null) {
			modelPackage = EMFEcoreExampleSatellitePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
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
			case EMFEcoreExampleSatellitePackage.SATELLITE: {
				Satellite satellite = (Satellite)theEObject;
				T result = caseSatellite(satellite);
				if (result == null) result = caseNamed(satellite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleSatellitePackage.SATELLITE_SIMULATED: {
				SatelliteSimulated satelliteSimulated = (SatelliteSimulated)theEObject;
				T result = caseSatelliteSimulated(satelliteSimulated);
				if (result == null) result = caseSatellite(satelliteSimulated);
				if (result == null) result = caseNamed(satelliteSimulated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleSatellitePackage.SATELLITE_STUB: {
				SatelliteStub satelliteStub = (SatelliteStub)theEObject;
				T result = caseSatelliteStub(satelliteStub);
				if (result == null) result = caseSatellite(satelliteStub);
				if (result == null) result = caseNamed(satelliteStub);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND: {
				SatelliteCommand satelliteCommand = (SatelliteCommand)theEObject;
				T result = caseSatelliteCommand(satelliteCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND_LIST: {
				SatelliteCommandList satelliteCommandList = (SatelliteCommandList)theEObject;
				T result = caseSatelliteCommandList(satelliteCommandList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND_ROLL: {
				SatelliteCommandRoll satelliteCommandRoll = (SatelliteCommandRoll)theEObject;
				T result = caseSatelliteCommandRoll(satelliteCommandRoll);
				if (result == null) result = caseSatelliteCommand(satelliteCommandRoll);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND_ACQUIRE_IMAGE: {
				SatelliteCommandAcquireImage satelliteCommandAcquireImage = (SatelliteCommandAcquireImage)theEObject;
				T result = caseSatelliteCommandAcquireImage(satelliteCommandAcquireImage);
				if (result == null) result = caseSatelliteCommand(satelliteCommandAcquireImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleSatellitePackage.IMAGE_ORDER: {
				ImageOrder imageOrder = (ImageOrder)theEObject;
				T result = caseImageOrder(imageOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER: {
				SatelliteImager satelliteImager = (SatelliteImager)theEObject;
				T result = caseSatelliteImager(satelliteImager);
				if (result == null) result = caseAbstractCamera(satelliteImager);
				if (result == null) result = caseZoomable(satelliteImager);
				if (result == null) result = caseNamed(satelliteImager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE: {
				OrbitalImage orbitalImage = (OrbitalImage)theEObject;
				T result = caseOrbitalImage(orbitalImage);
				if (result == null) result = caseAbstractEImage(orbitalImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION: {
				SatelliteConstellation satelliteConstellation = (SatelliteConstellation)theEObject;
				T result = caseSatelliteConstellation(satelliteConstellation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleSatellitePackage.SATELLITE_UTILS: {
				SatelliteUtils satelliteUtils = (SatelliteUtils)theEObject;
				T result = caseSatelliteUtils(satelliteUtils);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_TYPE_API_ADAPTER: {
				SatelliteConstellationTypeApiAdapter satelliteConstellationTypeApiAdapter = (SatelliteConstellationTypeApiAdapter)theEObject;
				T result = caseSatelliteConstellationTypeApiAdapter(satelliteConstellationTypeApiAdapter);
				if (result == null) result = caseTypeApiAdapter(satelliteConstellationTypeApiAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA: {
				SatelliteConstellationInitializationData satelliteConstellationInitializationData = (SatelliteConstellationInitializationData)theEObject;
				T result = caseSatelliteConstellationInitializationData(satelliteConstellationInitializationData);
				if (result == null) result = caseAbstractInitializationData(satelliteConstellationInitializationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreExampleSatellitePackage.SATELLITE_INITIALIZATION_DATA: {
				SatelliteInitializationData satelliteInitializationData = (SatelliteInitializationData)theEObject;
				T result = caseSatelliteInitializationData(satelliteInitializationData);
				if (result == null) result = caseAbstractInitializationData(satelliteInitializationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Satellite Simulated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satellite Simulated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatelliteSimulated(SatelliteSimulated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satellite Stub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satellite Stub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatelliteStub(SatelliteStub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satellite Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satellite Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatelliteCommand(SatelliteCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satellite Command List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satellite Command List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatelliteCommandList(SatelliteCommandList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satellite Command Roll</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satellite Command Roll</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatelliteCommandRoll(SatelliteCommandRoll object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satellite Command Acquire Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satellite Command Acquire Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatelliteCommandAcquireImage(SatelliteCommandAcquireImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageOrder(ImageOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satellite Imager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satellite Imager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatelliteImager(SatelliteImager object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Satellite Constellation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satellite Constellation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatelliteConstellation(SatelliteConstellation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satellite Constellation Initialization Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satellite Constellation Initialization Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatelliteConstellationInitializationData(SatelliteConstellationInitializationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satellite Constellation Type Api Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satellite Constellation Type Api Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatelliteConstellationTypeApiAdapter(SatelliteConstellationTypeApiAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satellite Initialization Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satellite Initialization Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatelliteInitializationData(SatelliteInitializationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satellite Utils</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satellite Utils</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatelliteUtils(SatelliteUtils object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Camera</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Camera</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCamera(AbstractCamera object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zoomable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zoomable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZoomable(Zoomable object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Initialization Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Initialization Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractInitializationData(AbstractInitializationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Api Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Api Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeApiAdapter(TypeApiAdapter object) {
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

} //EMFEcoreExampleSatelliteSwitch
