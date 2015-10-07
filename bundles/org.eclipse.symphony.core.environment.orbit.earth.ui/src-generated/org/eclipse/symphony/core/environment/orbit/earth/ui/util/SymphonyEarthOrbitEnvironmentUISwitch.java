/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.ui.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.core.Updatable;
import org.eclipse.symphony.core.environment.orbit.earth.ui.*;
import org.eclipse.symphony.core.invocator.AbstractToolsListContainer;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;

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
 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage
 * @generated
 */
public class SymphonyEarthOrbitEnvironmentUISwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SymphonyEarthOrbitEnvironmentUIPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyEarthOrbitEnvironmentUISwitch() {
		if (modelPackage == null) {
			modelPackage = SymphonyEarthOrbitEnvironmentUIPackage.eINSTANCE;
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
			case SymphonyEarthOrbitEnvironmentUIPackage.EARTH_VIEW_CONFIGURATION_LIST: {
				EarthViewConfigurationList earthViewConfigurationList = (EarthViewConfigurationList)theEObject;
				T result = caseEarthViewConfigurationList(earthViewConfigurationList);
				if (result == null) result = caseAbstractToolsListContainer(earthViewConfigurationList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentUIPackage.EARTH_VIEW_CONFIGURATION: {
				EarthViewConfiguration earthViewConfiguration = (EarthViewConfiguration)theEObject;
				T result = caseEarthViewConfiguration(earthViewConfiguration);
				if (result == null) result = caseNamed(earthViewConfiguration);
				if (result == null) result = caseDescribed(earthViewConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentUIPackage.ABSTRACT_WORLD_WIND_LAYER: {
				AbstractWorldWindLayer abstractWorldWindLayer = (AbstractWorldWindLayer)theEObject;
				T result = caseAbstractWorldWindLayer(abstractWorldWindLayer);
				if (result == null) result = caseUpdatable(abstractWorldWindLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER: {
				SpacecraftLocationWorldWindLayer spacecraftLocationWorldWindLayer = (SpacecraftLocationWorldWindLayer)theEObject;
				T result = caseSpacecraftLocationWorldWindLayer(spacecraftLocationWorldWindLayer);
				if (result == null) result = caseAbstractWorldWindLayer(spacecraftLocationWorldWindLayer);
				if (result == null) result = caseNamed(spacecraftLocationWorldWindLayer);
				if (result == null) result = caseUpdatable(spacecraftLocationWorldWindLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER: {
				OrbitModelWorldWindLayer orbitModelWorldWindLayer = (OrbitModelWorldWindLayer)theEObject;
				T result = caseOrbitModelWorldWindLayer(orbitModelWorldWindLayer);
				if (result == null) result = caseAbstractWorldWindLayer(orbitModelWorldWindLayer);
				if (result == null) result = caseUpdatable(orbitModelWorldWindLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER: {
				SpacecraftSwathWorldWindLayer spacecraftSwathWorldWindLayer = (SpacecraftSwathWorldWindLayer)theEObject;
				T result = caseSpacecraftSwathWorldWindLayer(spacecraftSwathWorldWindLayer);
				if (result == null) result = caseAbstractWorldWindLayer(spacecraftSwathWorldWindLayer);
				if (result == null) result = caseUpdatable(spacecraftSwathWorldWindLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentUIPackage.EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER: {
				EarthSurfaceLocationWorldWindLayer earthSurfaceLocationWorldWindLayer = (EarthSurfaceLocationWorldWindLayer)theEObject;
				T result = caseEarthSurfaceLocationWorldWindLayer(earthSurfaceLocationWorldWindLayer);
				if (result == null) result = caseAbstractWorldWindLayer(earthSurfaceLocationWorldWindLayer);
				if (result == null) result = caseUpdatable(earthSurfaceLocationWorldWindLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentUIPackage.GROUND_STATION_WORLD_WIND_LAYER: {
				GroundStationWorldWindLayer groundStationWorldWindLayer = (GroundStationWorldWindLayer)theEObject;
				T result = caseGroundStationWorldWindLayer(groundStationWorldWindLayer);
				if (result == null) result = caseEarthSurfaceLocationWorldWindLayer(groundStationWorldWindLayer);
				if (result == null) result = caseAbstractWorldWindLayer(groundStationWorldWindLayer);
				if (result == null) result = caseUpdatable(groundStationWorldWindLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_LIST: {
				SpacecraftVisibilityPassViewConfigurationList spacecraftVisibilityPassViewConfigurationList = (SpacecraftVisibilityPassViewConfigurationList)theEObject;
				T result = caseSpacecraftVisibilityPassViewConfigurationList(spacecraftVisibilityPassViewConfigurationList);
				if (result == null) result = caseAbstractToolsListContainer(spacecraftVisibilityPassViewConfigurationList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION: {
				SpacecraftVisibilityPassViewConfiguration spacecraftVisibilityPassViewConfiguration = (SpacecraftVisibilityPassViewConfiguration)theEObject;
				T result = caseSpacecraftVisibilityPassViewConfiguration(spacecraftVisibilityPassViewConfiguration);
				if (result == null) result = caseNamed(spacecraftVisibilityPassViewConfiguration);
				if (result == null) result = caseDescribed(spacecraftVisibilityPassViewConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Earth View Configuration List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earth View Configuration List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEarthViewConfigurationList(EarthViewConfigurationList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Earth View Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earth View Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEarthViewConfiguration(EarthViewConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract World Wind Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract World Wind Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractWorldWindLayer(AbstractWorldWindLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spacecraft Location World Wind Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spacecraft Location World Wind Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpacecraftLocationWorldWindLayer(SpacecraftLocationWorldWindLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orbit Model World Wind Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orbit Model World Wind Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrbitModelWorldWindLayer(OrbitModelWorldWindLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spacecraft Swath World Wind Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spacecraft Swath World Wind Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpacecraftSwathWorldWindLayer(SpacecraftSwathWorldWindLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Earth Surface Location World Wind Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earth Surface Location World Wind Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEarthSurfaceLocationWorldWindLayer(EarthSurfaceLocationWorldWindLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ground Station World Wind Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ground Station World Wind Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroundStationWorldWindLayer(GroundStationWorldWindLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spacecraft Visibility Pass View Configuration List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spacecraft Visibility Pass View Configuration List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpacecraftVisibilityPassViewConfigurationList(SpacecraftVisibilityPassViewConfigurationList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spacecraft Visibility Pass View Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spacecraft Visibility Pass View Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpacecraftVisibilityPassViewConfiguration(SpacecraftVisibilityPassViewConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Tools List Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Tools List Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractToolsListContainer(AbstractToolsListContainer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Updatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Updatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdatable(Updatable object) {
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

} //SymphonyEarthOrbitEnvironmentUISwitch
