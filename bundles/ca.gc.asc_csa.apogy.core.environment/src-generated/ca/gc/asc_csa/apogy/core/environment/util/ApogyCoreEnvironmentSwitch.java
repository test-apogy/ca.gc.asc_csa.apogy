package ca.gc.asc_csa.apogy.core.environment.util;
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
import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.core.environment.AbstractApogyEnvironmentItem;
import ca.gc.asc_csa.apogy.core.environment.AbstractSurfaceLocation;
import ca.gc.asc_csa.apogy.core.environment.AbstractWorksite;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.environment.CelestialBody;
import ca.gc.asc_csa.apogy.core.environment.Earth;
import ca.gc.asc_csa.apogy.core.environment.EnvironmentUtilities;
import ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates;
import ca.gc.asc_csa.apogy.core.environment.Moon;
import ca.gc.asc_csa.apogy.core.environment.Sky;
import ca.gc.asc_csa.apogy.core.environment.SkyNode;
import ca.gc.asc_csa.apogy.core.environment.Star;
import ca.gc.asc_csa.apogy.core.environment.StarField;
import ca.gc.asc_csa.apogy.core.environment.Sun;
import ca.gc.asc_csa.apogy.core.environment.SurfaceLocationsList;
import ca.gc.asc_csa.apogy.core.environment.TimeSourcesList;
import ca.gc.asc_csa.apogy.core.environment.Worksite;
import ca.gc.asc_csa.apogy.core.environment.WorksiteNode;
import ca.gc.asc_csa.apogy.core.environment.WorksitesList;
import ca.gc.asc_csa.apogy.core.invocator.Environment;

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
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage
 * @generated
 */
public class ApogyCoreEnvironmentSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ApogyCoreEnvironmentPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyCoreEnvironmentSwitch()
  {
		if (modelPackage == null) {
			modelPackage = ApogyCoreEnvironmentPackage.eINSTANCE;
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
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case ApogyCoreEnvironmentPackage.APOGY_ENVIRONMENT: {
				ApogyEnvironment apogyEnvironment = (ApogyEnvironment)theEObject;
				T result = caseApogyEnvironment(apogyEnvironment);
				if (result == null) result = caseEnvironment(apogyEnvironment);
				if (result == null) result = caseTimed(apogyEnvironment);
				if (result == null) result = caseNamed(apogyEnvironment);
				if (result == null) result = caseDescribed(apogyEnvironment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM: {
				AbstractApogyEnvironmentItem abstractApogyEnvironmentItem = (AbstractApogyEnvironmentItem)theEObject;
				T result = caseAbstractApogyEnvironmentItem(abstractApogyEnvironmentItem);
				if (result == null) result = caseNamed(abstractApogyEnvironmentItem);
				if (result == null) result = caseDescribed(abstractApogyEnvironmentItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.TIME_SOURCES_LIST: {
				TimeSourcesList timeSourcesList = (TimeSourcesList)theEObject;
				T result = caseTimeSourcesList(timeSourcesList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.WORKSITE: {
				Worksite worksite = (Worksite)theEObject;
				T result = caseWorksite(worksite);
				if (result == null) result = caseAbstractWorksite(worksite);
				if (result == null) result = caseNamed(worksite);
				if (result == null) result = caseDescribed(worksite);
				if (result == null) result = caseTimed(worksite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.WORKSITES_LIST: {
				WorksitesList worksitesList = (WorksitesList)theEObject;
				T result = caseWorksitesList(worksitesList);
				if (result == null) result = caseNamed(worksitesList);
				if (result == null) result = caseDescribed(worksitesList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.ABSTRACT_WORKSITE: {
				AbstractWorksite abstractWorksite = (AbstractWorksite)theEObject;
				T result = caseAbstractWorksite(abstractWorksite);
				if (result == null) result = caseNamed(abstractWorksite);
				if (result == null) result = caseDescribed(abstractWorksite);
				if (result == null) result = caseTimed(abstractWorksite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.ABSTRACT_SURFACE_LOCATION: {
				AbstractSurfaceLocation abstractSurfaceLocation = (AbstractSurfaceLocation)theEObject;
				T result = caseAbstractSurfaceLocation(abstractSurfaceLocation);
				if (result == null) result = caseNamed(abstractSurfaceLocation);
				if (result == null) result = caseDescribed(abstractSurfaceLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.SURFACE_LOCATIONS_LIST: {
				SurfaceLocationsList surfaceLocationsList = (SurfaceLocationsList)theEObject;
				T result = caseSurfaceLocationsList(surfaceLocationsList);
				if (result == null) result = caseAbstractApogyEnvironmentItem(surfaceLocationsList);
				if (result == null) result = caseNamed(surfaceLocationsList);
				if (result == null) result = caseDescribed(surfaceLocationsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.SKY: {
				Sky sky = (Sky)theEObject;
				T result = caseSky(sky);
				if (result == null) result = caseTimed(sky);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.CELESTIAL_BODY: {
				CelestialBody celestialBody = (CelestialBody)theEObject;
				T result = caseCelestialBody(celestialBody);
				if (result == null) result = caseGroupNode(celestialBody);
				if (result == null) result = caseNamed(celestialBody);
				if (result == null) result = caseNode(celestialBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.SUN: {
				Sun sun = (Sun)theEObject;
				T result = caseSun(sun);
				if (result == null) result = caseCelestialBody(sun);
				if (result == null) result = caseGroupNode(sun);
				if (result == null) result = caseNamed(sun);
				if (result == null) result = caseNode(sun);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.EARTH: {
				Earth earth = (Earth)theEObject;
				T result = caseEarth(earth);
				if (result == null) result = caseCelestialBody(earth);
				if (result == null) result = caseGroupNode(earth);
				if (result == null) result = caseNamed(earth);
				if (result == null) result = caseNode(earth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.MOON: {
				Moon moon = (Moon)theEObject;
				T result = caseMoon(moon);
				if (result == null) result = caseCelestialBody(moon);
				if (result == null) result = caseGroupNode(moon);
				if (result == null) result = caseNamed(moon);
				if (result == null) result = caseNode(moon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.ENVIRONMENT_UTILITIES: {
				EnvironmentUtilities environmentUtilities = (EnvironmentUtilities)theEObject;
				T result = caseEnvironmentUtilities(environmentUtilities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE: {
				ApogyCoreEnvironmentFacade apogyCoreEnvironmentFacade = (ApogyCoreEnvironmentFacade)theEObject;
				T result = caseApogyCoreEnvironmentFacade(apogyCoreEnvironmentFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.STAR: {
				Star star = (Star)theEObject;
				T result = caseStar(star);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.STAR_FIELD: {
				StarField starField = (StarField)theEObject;
				T result = caseStarField(starField);
				if (result == null) result = caseNode(starField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.EQUATORIAL_COORDINATES: {
				EquatorialCoordinates equatorialCoordinates = (EquatorialCoordinates)theEObject;
				T result = caseEquatorialCoordinates(equatorialCoordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.WORKSITE_NODE: {
				WorksiteNode worksiteNode = (WorksiteNode)theEObject;
				T result = caseWorksiteNode(worksiteNode);
				if (result == null) result = caseAggregateGroupNode(worksiteNode);
				if (result == null) result = caseGroupNode(worksiteNode);
				if (result == null) result = caseNode(worksiteNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.SKY_NODE: {
				SkyNode skyNode = (SkyNode)theEObject;
				T result = caseSkyNode(skyNode);
				if (result == null) result = caseGroupNode(skyNode);
				if (result == null) result = caseNode(skyNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Apogy Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apogy Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApogyEnvironment(ApogyEnvironment object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Apogy Environment Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Apogy Environment Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractApogyEnvironmentItem(AbstractApogyEnvironmentItem object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Sources List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Sources List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSourcesList(TimeSourcesList object) {
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
  public T caseWorksite(Worksite object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Worksites List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Worksites List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorksitesList(WorksitesList object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Surface Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Surface Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSurfaceLocation(AbstractSurfaceLocation object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Surface Locations List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surface Locations List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurfaceLocationsList(SurfaceLocationsList object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Equatorial Coordinates</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equatorial Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEquatorialCoordinates(EquatorialCoordinates object)
  {
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
  public T caseSky(Sky object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Celestial Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Celestial Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCelestialBody(CelestialBody object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Sun</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sun</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSun(Sun object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Earth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEarth(Earth object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Moon</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Moon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMoon(Moon object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Utilities</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Utilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEnvironmentUtilities(EnvironmentUtilities object)
  {
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
	public T caseApogyCoreEnvironmentFacade(ApogyCoreEnvironmentFacade object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Star</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Star</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseStar(Star object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Star Field</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Star Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseStarField(StarField object)
  {
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
  public T caseWorksiteNode(WorksiteNode object)
  {
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
  public T caseSkyNode(SkyNode object)
  {
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
  public T caseNamed(Named object)
  {
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
  public T caseDescribed(Described object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironment(Environment object) {
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
  public T caseNode(Node object)
  {
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
  public T caseGroupNode(GroupNode object)
  {
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
  public T caseAggregateGroupNode(AggregateGroupNode object)
  {
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
  public T caseTimed(Timed object)
  {
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
  public T defaultCase(EObject object)
  {
		return null;
	}

} //ApogyCoreEnvironmentSwitch
