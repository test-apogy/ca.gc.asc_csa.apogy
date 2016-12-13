/**
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
package ca.gc.asc_csa.apogy.core.environment.earth.surface.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.emf.Timed;
import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.core.environment.AbstractWorksite;
import ca.gc.asc_csa.apogy.core.environment.Sky;
import ca.gc.asc_csa.apogy.core.environment.SkyNode;
import ca.gc.asc_csa.apogy.core.environment.Worksite;
import ca.gc.asc_csa.apogy.core.environment.WorksiteNode;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.AtmosphereUtils;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSky;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSkyNode;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksiteNode;
import ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksiteNode;

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
 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentPackage
 * @generated
 */
public class ApogyEarthSurfaceEnvironmentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogyEarthSurfaceEnvironmentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyEarthSurfaceEnvironmentSwitch() {
		if (modelPackage == null) {
			modelPackage = ApogyEarthSurfaceEnvironmentPackage.eINSTANCE;
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
			case ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE: {
				EarthSurfaceWorksite earthSurfaceWorksite = (EarthSurfaceWorksite)theEObject;
				T result = caseEarthSurfaceWorksite(earthSurfaceWorksite);
				if (result == null) result = caseSurfaceWorksite(earthSurfaceWorksite);
				if (result == null) result = caseWorksite(earthSurfaceWorksite);
				if (result == null) result = caseAbstractWorksite(earthSurfaceWorksite);
				if (result == null) result = caseNamed(earthSurfaceWorksite);
				if (result == null) result = caseDescribed(earthSurfaceWorksite);
				if (result == null) result = caseTimed(earthSurfaceWorksite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyEarthSurfaceEnvironmentPackage.EARTH_SKY: {
				EarthSky earthSky = (EarthSky)theEObject;
				T result = caseEarthSky(earthSky);
				if (result == null) result = caseSky(earthSky);
				if (result == null) result = caseTimed(earthSky);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE_NODE: {
				EarthSurfaceWorksiteNode earthSurfaceWorksiteNode = (EarthSurfaceWorksiteNode)theEObject;
				T result = caseEarthSurfaceWorksiteNode(earthSurfaceWorksiteNode);
				if (result == null) result = caseSurfaceWorksiteNode(earthSurfaceWorksiteNode);
				if (result == null) result = caseWorksiteNode(earthSurfaceWorksiteNode);
				if (result == null) result = caseAggregateGroupNode(earthSurfaceWorksiteNode);
				if (result == null) result = caseGroupNode(earthSurfaceWorksiteNode);
				if (result == null) result = caseNode(earthSurfaceWorksiteNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyEarthSurfaceEnvironmentPackage.EARTH_SKY_NODE: {
				EarthSkyNode earthSkyNode = (EarthSkyNode)theEObject;
				T result = caseEarthSkyNode(earthSkyNode);
				if (result == null) result = caseSkyNode(earthSkyNode);
				if (result == null) result = caseGroupNode(earthSkyNode);
				if (result == null) result = caseNode(earthSkyNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE: {
				ApogyEarthSurfaceEnvironmentFacade apogyEarthSurfaceEnvironmentFacade = (ApogyEarthSurfaceEnvironmentFacade)theEObject;
				T result = caseApogyEarthSurfaceEnvironmentFacade(apogyEarthSurfaceEnvironmentFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyEarthSurfaceEnvironmentPackage.ATMOSPHERE_UTILS: {
				AtmosphereUtils atmosphereUtils = (AtmosphereUtils)theEObject;
				T result = caseAtmosphereUtils(atmosphereUtils);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyEarthSurfaceEnvironmentPackage.ASTRONOMY_UTILS: {
				AstronomyUtils astronomyUtils = (AstronomyUtils)theEObject;
				T result = caseAstronomyUtils(astronomyUtils);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Earth Surface Worksite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earth Surface Worksite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEarthSurfaceWorksite(EarthSurfaceWorksite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Earth Sky</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earth Sky</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEarthSky(EarthSky object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Earth Surface Worksite Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earth Surface Worksite Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEarthSurfaceWorksiteNode(EarthSurfaceWorksiteNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Earth Sky Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earth Sky Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEarthSkyNode(EarthSkyNode object) {
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
	public T caseApogyEarthSurfaceEnvironmentFacade(ApogyEarthSurfaceEnvironmentFacade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atmosphere Utils</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atmosphere Utils</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtmosphereUtils(AtmosphereUtils object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Astronomy Utils</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Astronomy Utils</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAstronomyUtils(AstronomyUtils object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Surface Worksite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surface Worksite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurfaceWorksite(SurfaceWorksite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sky</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sky</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSky(Sky object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupNode(GroupNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Group Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Group Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateGroupNode(AggregateGroupNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Worksite Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Worksite Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorksiteNode(WorksiteNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Surface Worksite Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surface Worksite Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurfaceWorksiteNode(SurfaceWorksiteNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sky Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sky Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkyNode(SkyNode object) {
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

} //ApogyEarthSurfaceEnvironmentSwitch
