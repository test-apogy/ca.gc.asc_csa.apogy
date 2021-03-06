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
import ca.gc.asc_csa.apogy.common.topology.PositionNode;
import ca.gc.asc_csa.apogy.common.topology.RotationNode;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;
import ca.gc.asc_csa.apogy.core.AbstractWorksite;
import ca.gc.asc_csa.apogy.core.environment.AbstractMapLayer;
import ca.gc.asc_csa.apogy.core.environment.AbstractMapLayerNode;
import ca.gc.asc_csa.apogy.core.environment.AbstractShapeImageLayer;
import ca.gc.asc_csa.apogy.core.environment.AstronomyUtils;
import ca.gc.asc_csa.apogy.core.environment.Atmosphere;
import ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils;
import ca.gc.asc_csa.apogy.core.environment.BasicCartesianTriangularMeshMapLayer;
import ca.gc.asc_csa.apogy.core.environment.CartesianCoordinatesPolygonShapeImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshDerivedImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshDiscreteSlopeImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshHeightImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayerNode;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshSlopeImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshURLMapLayer;
import ca.gc.asc_csa.apogy.core.environment.Earth;
import ca.gc.asc_csa.apogy.core.environment.EarthSky;
import ca.gc.asc_csa.apogy.core.environment.EarthSkyNode;
import ca.gc.asc_csa.apogy.core.environment.EarthSurfaceEnvironment;
import ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksiteNode;
import ca.gc.asc_csa.apogy.core.environment.EclipticCoordinates;
import ca.gc.asc_csa.apogy.core.environment.EllipseShapeImageLayer;
import ca.gc.asc_csa.apogy.core.environment.Environment;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.EnvironmentUtilities;
import ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates;
import ca.gc.asc_csa.apogy.core.environment.FeaturesOfInterestMapLayer;
import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinatesPolygonShapeImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates;
import ca.gc.asc_csa.apogy.core.environment.ImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation;
import ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.Map;
import ca.gc.asc_csa.apogy.core.environment.MapLayerPresentation;
import ca.gc.asc_csa.apogy.core.environment.MapNode;
import ca.gc.asc_csa.apogy.core.environment.MapsList;
import ca.gc.asc_csa.apogy.core.environment.MapsListNode;
import ca.gc.asc_csa.apogy.core.environment.Moon;
import ca.gc.asc_csa.apogy.core.environment.PolygonShapeImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.RectangleShapeImageLayer;
import ca.gc.asc_csa.apogy.core.environment.RectangularRegion;
import ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage;
import ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider;
import ca.gc.asc_csa.apogy.core.environment.RectangularVolumeRegion;
import ca.gc.asc_csa.apogy.core.environment.Region;
import ca.gc.asc_csa.apogy.core.environment.Sky;
import ca.gc.asc_csa.apogy.core.environment.SkyNode;
import ca.gc.asc_csa.apogy.core.environment.SlopeRange;
import ca.gc.asc_csa.apogy.core.environment.Star;
import ca.gc.asc_csa.apogy.core.environment.StarField;
import ca.gc.asc_csa.apogy.core.environment.Sun;
import ca.gc.asc_csa.apogy.core.environment.SurfaceEnvironment;
import ca.gc.asc_csa.apogy.core.environment.SurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.SurfaceWorksiteNode;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayer;
import ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayerNode;
import ca.gc.asc_csa.apogy.core.environment.URLImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.URLMapLayer;
import ca.gc.asc_csa.apogy.core.environment.Worksite;
import ca.gc.asc_csa.apogy.core.environment.WorksiteNode;

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
			case ApogyCoreEnvironmentPackage.SURFACE_WORKSITE: {
				SurfaceWorksite surfaceWorksite = (SurfaceWorksite)theEObject;
				T result = caseSurfaceWorksite(surfaceWorksite);
				if (result == null) result = caseWorksite(surfaceWorksite);
				if (result == null) result = caseAbstractWorksite(surfaceWorksite);
				if (result == null) result = caseNamed(surfaceWorksite);
				if (result == null) result = caseDescribed(surfaceWorksite);
				if (result == null) result = caseTimed(surfaceWorksite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.EARTH_SURFACE_WORKSITE: {
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
			case ApogyCoreEnvironmentPackage.ENVIRONMENT: {
				Environment environment = (Environment)theEObject;
				T result = caseEnvironment(environment);
				if (result == null) result = caseNamed(environment);
				if (result == null) result = caseDescribed(environment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.SURFACE_ENVIRONMENT: {
				SurfaceEnvironment surfaceEnvironment = (SurfaceEnvironment)theEObject;
				T result = caseSurfaceEnvironment(surfaceEnvironment);
				if (result == null) result = caseEnvironment(surfaceEnvironment);
				if (result == null) result = caseNamed(surfaceEnvironment);
				if (result == null) result = caseDescribed(surfaceEnvironment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.EARTH_SURFACE_ENVIRONMENT: {
				EarthSurfaceEnvironment earthSurfaceEnvironment = (EarthSurfaceEnvironment)theEObject;
				T result = caseEarthSurfaceEnvironment(earthSurfaceEnvironment);
				if (result == null) result = caseSurfaceEnvironment(earthSurfaceEnvironment);
				if (result == null) result = caseEnvironment(earthSurfaceEnvironment);
				if (result == null) result = caseNamed(earthSurfaceEnvironment);
				if (result == null) result = caseDescribed(earthSurfaceEnvironment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.ATMOSPHERE: {
				Atmosphere atmosphere = (Atmosphere)theEObject;
				T result = caseAtmosphere(atmosphere);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.ATMOSPHERE_UTILS: {
				AtmosphereUtils atmosphereUtils = (AtmosphereUtils)theEObject;
				T result = caseAtmosphereUtils(atmosphereUtils);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.EQUATORIAL_COORDINATES: {
				EquatorialCoordinates equatorialCoordinates = (EquatorialCoordinates)theEObject;
				T result = caseEquatorialCoordinates(equatorialCoordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES: {
				GeographicCoordinates geographicCoordinates = (GeographicCoordinates)theEObject;
				T result = caseGeographicCoordinates(geographicCoordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.HORIZONTAL_COORDINATES: {
				HorizontalCoordinates horizontalCoordinates = (HorizontalCoordinates)theEObject;
				T result = caseHorizontalCoordinates(horizontalCoordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.ECLIPTIC_COORDINATES: {
				EclipticCoordinates eclipticCoordinates = (EclipticCoordinates)theEObject;
				T result = caseEclipticCoordinates(eclipticCoordinates);
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
			case ApogyCoreEnvironmentPackage.EARTH_SKY: {
				EarthSky earthSky = (EarthSky)theEObject;
				T result = caseEarthSky(earthSky);
				if (result == null) result = caseSky(earthSky);
				if (result == null) result = caseTimed(earthSky);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.SUN: {
				Sun sun = (Sun)theEObject;
				T result = caseSun(sun);
				if (result == null) result = caseGroupNode(sun);
				if (result == null) result = caseNode(sun);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.EARTH: {
				Earth earth = (Earth)theEObject;
				T result = caseEarth(earth);
				if (result == null) result = caseGroupNode(earth);
				if (result == null) result = caseNode(earth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.MOON: {
				Moon moon = (Moon)theEObject;
				T result = caseMoon(moon);
				if (result == null) result = caseGroupNode(moon);
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
			case ApogyCoreEnvironmentPackage.ASTRONOMY_UTILS: {
				AstronomyUtils astronomyUtils = (AstronomyUtils)theEObject;
				T result = caseAstronomyUtils(astronomyUtils);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.MAP: {
				Map map = (Map)theEObject;
				T result = caseMap(map);
				if (result == null) result = caseNamed(map);
				if (result == null) result = caseDescribed(map);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.MAPS_LIST: {
				MapsList mapsList = (MapsList)theEObject;
				T result = caseMapsList(mapsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER: {
				AbstractMapLayer abstractMapLayer = (AbstractMapLayer)theEObject;
				T result = caseAbstractMapLayer(abstractMapLayer);
				if (result == null) result = caseNamed(abstractMapLayer);
				if (result == null) result = caseDescribed(abstractMapLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.MAP_LAYER_PRESENTATION: {
				MapLayerPresentation mapLayerPresentation = (MapLayerPresentation)theEObject;
				T result = caseMapLayerPresentation(mapLayerPresentation);
				if (result == null) result = caseNamed(mapLayerPresentation);
				if (result == null) result = caseDescribed(mapLayerPresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.URL_MAP_LAYER: {
				URLMapLayer urlMapLayer = (URLMapLayer)theEObject;
				T result = caseURLMapLayer(urlMapLayer);
				if (result == null) result = caseAbstractMapLayer(urlMapLayer);
				if (result == null) result = caseNamed(urlMapLayer);
				if (result == null) result = caseDescribed(urlMapLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.REGION: {
				Region region = (Region)theEObject;
				T result = caseRegion(region);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.RECTANGULAR_REGION: {
				RectangularRegion rectangularRegion = (RectangularRegion)theEObject;
				T result = caseRectangularRegion(rectangularRegion);
				if (result == null) result = caseRegion(rectangularRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.RECTANGULAR_VOLUME_REGION: {
				RectangularVolumeRegion rectangularVolumeRegion = (RectangularVolumeRegion)theEObject;
				T result = caseRectangularVolumeRegion(rectangularVolumeRegion);
				if (result == null) result = caseRectangularRegion(rectangularVolumeRegion);
				if (result == null) result = caseRegion(rectangularVolumeRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.RECTANGULAR_REGION_PROVIDER: {
				RectangularRegionProvider rectangularRegionProvider = (RectangularRegionProvider)theEObject;
				T result = caseRectangularRegionProvider(rectangularRegionProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.RECTANGULAR_REGION_IMAGE: {
				RectangularRegionImage rectangularRegionImage = (RectangularRegionImage)theEObject;
				T result = caseRectangularRegionImage(rectangularRegionImage);
				if (result == null) result = caseRectangularRegionProvider(rectangularRegionImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.IMAGE_MAP_LAYER: {
				ImageMapLayer imageMapLayer = (ImageMapLayer)theEObject;
				T result = caseImageMapLayer(imageMapLayer);
				if (result == null) result = caseAbstractMapLayer(imageMapLayer);
				if (result == null) result = caseRectangularRegionImage(imageMapLayer);
				if (result == null) result = caseNamed(imageMapLayer);
				if (result == null) result = caseDescribed(imageMapLayer);
				if (result == null) result = caseRectangularRegionProvider(imageMapLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION: {
				ImageMapLayerPresentation imageMapLayerPresentation = (ImageMapLayerPresentation)theEObject;
				T result = caseImageMapLayerPresentation(imageMapLayerPresentation);
				if (result == null) result = caseMapLayerPresentation(imageMapLayerPresentation);
				if (result == null) result = caseRectangularRegionImage(imageMapLayerPresentation);
				if (result == null) result = caseNamed(imageMapLayerPresentation);
				if (result == null) result = caseDescribed(imageMapLayerPresentation);
				if (result == null) result = caseRectangularRegionProvider(imageMapLayerPresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.URL_IMAGE_MAP_LAYER: {
				URLImageMapLayer urlImageMapLayer = (URLImageMapLayer)theEObject;
				T result = caseURLImageMapLayer(urlImageMapLayer);
				if (result == null) result = caseImageMapLayer(urlImageMapLayer);
				if (result == null) result = caseURLMapLayer(urlImageMapLayer);
				if (result == null) result = caseAbstractMapLayer(urlImageMapLayer);
				if (result == null) result = caseRectangularRegionImage(urlImageMapLayer);
				if (result == null) result = caseNamed(urlImageMapLayer);
				if (result == null) result = caseDescribed(urlImageMapLayer);
				if (result == null) result = caseRectangularRegionProvider(urlImageMapLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER: {
				TopologyTreeMapLayer topologyTreeMapLayer = (TopologyTreeMapLayer)theEObject;
				T result = caseTopologyTreeMapLayer(topologyTreeMapLayer);
				if (result == null) result = caseAbstractMapLayer(topologyTreeMapLayer);
				if (result == null) result = caseNamed(topologyTreeMapLayer);
				if (result == null) result = caseDescribed(topologyTreeMapLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE: {
				TopologyTreeMapLayerNode topologyTreeMapLayerNode = (TopologyTreeMapLayerNode)theEObject;
				T result = caseTopologyTreeMapLayerNode(topologyTreeMapLayerNode);
				if (result == null) result = caseAggregateGroupNode(topologyTreeMapLayerNode);
				if (result == null) result = caseGroupNode(topologyTreeMapLayerNode);
				if (result == null) result = caseNode(topologyTreeMapLayerNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER: {
				CartesianTriangularMeshMapLayer cartesianTriangularMeshMapLayer = (CartesianTriangularMeshMapLayer)theEObject;
				T result = caseCartesianTriangularMeshMapLayer(cartesianTriangularMeshMapLayer);
				if (result == null) result = caseAbstractMapLayer(cartesianTriangularMeshMapLayer);
				if (result == null) result = caseNamed(cartesianTriangularMeshMapLayer);
				if (result == null) result = caseDescribed(cartesianTriangularMeshMapLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER: {
				CartesianTriangularMeshDerivedImageMapLayer cartesianTriangularMeshDerivedImageMapLayer = (CartesianTriangularMeshDerivedImageMapLayer)theEObject;
				T result = caseCartesianTriangularMeshDerivedImageMapLayer(cartesianTriangularMeshDerivedImageMapLayer);
				if (result == null) result = caseImageMapLayer(cartesianTriangularMeshDerivedImageMapLayer);
				if (result == null) result = caseAbstractMapLayer(cartesianTriangularMeshDerivedImageMapLayer);
				if (result == null) result = caseRectangularRegionImage(cartesianTriangularMeshDerivedImageMapLayer);
				if (result == null) result = caseNamed(cartesianTriangularMeshDerivedImageMapLayer);
				if (result == null) result = caseDescribed(cartesianTriangularMeshDerivedImageMapLayer);
				if (result == null) result = caseRectangularRegionProvider(cartesianTriangularMeshDerivedImageMapLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER: {
				CartesianTriangularMeshSlopeImageMapLayer cartesianTriangularMeshSlopeImageMapLayer = (CartesianTriangularMeshSlopeImageMapLayer)theEObject;
				T result = caseCartesianTriangularMeshSlopeImageMapLayer(cartesianTriangularMeshSlopeImageMapLayer);
				if (result == null) result = caseCartesianTriangularMeshDerivedImageMapLayer(cartesianTriangularMeshSlopeImageMapLayer);
				if (result == null) result = caseImageMapLayer(cartesianTriangularMeshSlopeImageMapLayer);
				if (result == null) result = caseAbstractMapLayer(cartesianTriangularMeshSlopeImageMapLayer);
				if (result == null) result = caseRectangularRegionImage(cartesianTriangularMeshSlopeImageMapLayer);
				if (result == null) result = caseNamed(cartesianTriangularMeshSlopeImageMapLayer);
				if (result == null) result = caseDescribed(cartesianTriangularMeshSlopeImageMapLayer);
				if (result == null) result = caseRectangularRegionProvider(cartesianTriangularMeshSlopeImageMapLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER: {
				CartesianTriangularMeshDiscreteSlopeImageMapLayer cartesianTriangularMeshDiscreteSlopeImageMapLayer = (CartesianTriangularMeshDiscreteSlopeImageMapLayer)theEObject;
				T result = caseCartesianTriangularMeshDiscreteSlopeImageMapLayer(cartesianTriangularMeshDiscreteSlopeImageMapLayer);
				if (result == null) result = caseCartesianTriangularMeshSlopeImageMapLayer(cartesianTriangularMeshDiscreteSlopeImageMapLayer);
				if (result == null) result = caseCartesianTriangularMeshDerivedImageMapLayer(cartesianTriangularMeshDiscreteSlopeImageMapLayer);
				if (result == null) result = caseImageMapLayer(cartesianTriangularMeshDiscreteSlopeImageMapLayer);
				if (result == null) result = caseAbstractMapLayer(cartesianTriangularMeshDiscreteSlopeImageMapLayer);
				if (result == null) result = caseRectangularRegionImage(cartesianTriangularMeshDiscreteSlopeImageMapLayer);
				if (result == null) result = caseNamed(cartesianTriangularMeshDiscreteSlopeImageMapLayer);
				if (result == null) result = caseDescribed(cartesianTriangularMeshDiscreteSlopeImageMapLayer);
				if (result == null) result = caseRectangularRegionProvider(cartesianTriangularMeshDiscreteSlopeImageMapLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER: {
				CartesianTriangularMeshHeightImageMapLayer cartesianTriangularMeshHeightImageMapLayer = (CartesianTriangularMeshHeightImageMapLayer)theEObject;
				T result = caseCartesianTriangularMeshHeightImageMapLayer(cartesianTriangularMeshHeightImageMapLayer);
				if (result == null) result = caseCartesianTriangularMeshDerivedImageMapLayer(cartesianTriangularMeshHeightImageMapLayer);
				if (result == null) result = caseImageMapLayer(cartesianTriangularMeshHeightImageMapLayer);
				if (result == null) result = caseAbstractMapLayer(cartesianTriangularMeshHeightImageMapLayer);
				if (result == null) result = caseRectangularRegionImage(cartesianTriangularMeshHeightImageMapLayer);
				if (result == null) result = caseNamed(cartesianTriangularMeshHeightImageMapLayer);
				if (result == null) result = caseDescribed(cartesianTriangularMeshHeightImageMapLayer);
				if (result == null) result = caseRectangularRegionProvider(cartesianTriangularMeshHeightImageMapLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.SLOPE_RANGE: {
				SlopeRange slopeRange = (SlopeRange)theEObject;
				T result = caseSlopeRange(slopeRange);
				if (result == null) result = caseNamed(slopeRange);
				if (result == null) result = caseDescribed(slopeRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER: {
				LineOfSightImageMapLayer lineOfSightImageMapLayer = (LineOfSightImageMapLayer)theEObject;
				T result = caseLineOfSightImageMapLayer(lineOfSightImageMapLayer);
				if (result == null) result = caseCartesianTriangularMeshDerivedImageMapLayer(lineOfSightImageMapLayer);
				if (result == null) result = caseImageMapLayer(lineOfSightImageMapLayer);
				if (result == null) result = caseAbstractMapLayer(lineOfSightImageMapLayer);
				if (result == null) result = caseRectangularRegionImage(lineOfSightImageMapLayer);
				if (result == null) result = caseNamed(lineOfSightImageMapLayer);
				if (result == null) result = caseDescribed(lineOfSightImageMapLayer);
				if (result == null) result = caseRectangularRegionProvider(lineOfSightImageMapLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.ABSTRACT_SHAPE_IMAGE_LAYER: {
				AbstractShapeImageLayer abstractShapeImageLayer = (AbstractShapeImageLayer)theEObject;
				T result = caseAbstractShapeImageLayer(abstractShapeImageLayer);
				if (result == null) result = caseImageMapLayer(abstractShapeImageLayer);
				if (result == null) result = caseAbstractMapLayer(abstractShapeImageLayer);
				if (result == null) result = caseRectangularRegionImage(abstractShapeImageLayer);
				if (result == null) result = caseNamed(abstractShapeImageLayer);
				if (result == null) result = caseDescribed(abstractShapeImageLayer);
				if (result == null) result = caseRectangularRegionProvider(abstractShapeImageLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.ELLIPSE_SHAPE_IMAGE_LAYER: {
				EllipseShapeImageLayer ellipseShapeImageLayer = (EllipseShapeImageLayer)theEObject;
				T result = caseEllipseShapeImageLayer(ellipseShapeImageLayer);
				if (result == null) result = caseAbstractShapeImageLayer(ellipseShapeImageLayer);
				if (result == null) result = caseImageMapLayer(ellipseShapeImageLayer);
				if (result == null) result = caseAbstractMapLayer(ellipseShapeImageLayer);
				if (result == null) result = caseRectangularRegionImage(ellipseShapeImageLayer);
				if (result == null) result = caseNamed(ellipseShapeImageLayer);
				if (result == null) result = caseDescribed(ellipseShapeImageLayer);
				if (result == null) result = caseRectangularRegionProvider(ellipseShapeImageLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.RECTANGLE_SHAPE_IMAGE_LAYER: {
				RectangleShapeImageLayer rectangleShapeImageLayer = (RectangleShapeImageLayer)theEObject;
				T result = caseRectangleShapeImageLayer(rectangleShapeImageLayer);
				if (result == null) result = caseAbstractShapeImageLayer(rectangleShapeImageLayer);
				if (result == null) result = caseImageMapLayer(rectangleShapeImageLayer);
				if (result == null) result = caseAbstractMapLayer(rectangleShapeImageLayer);
				if (result == null) result = caseRectangularRegionImage(rectangleShapeImageLayer);
				if (result == null) result = caseNamed(rectangleShapeImageLayer);
				if (result == null) result = caseDescribed(rectangleShapeImageLayer);
				if (result == null) result = caseRectangularRegionProvider(rectangleShapeImageLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.POLYGON_SHAPE_IMAGE_MAP_LAYER: {
				PolygonShapeImageMapLayer polygonShapeImageMapLayer = (PolygonShapeImageMapLayer)theEObject;
				T result = casePolygonShapeImageMapLayer(polygonShapeImageMapLayer);
				if (result == null) result = caseAbstractShapeImageLayer(polygonShapeImageMapLayer);
				if (result == null) result = caseImageMapLayer(polygonShapeImageMapLayer);
				if (result == null) result = caseAbstractMapLayer(polygonShapeImageMapLayer);
				if (result == null) result = caseRectangularRegionImage(polygonShapeImageMapLayer);
				if (result == null) result = caseNamed(polygonShapeImageMapLayer);
				if (result == null) result = caseDescribed(polygonShapeImageMapLayer);
				if (result == null) result = caseRectangularRegionProvider(polygonShapeImageMapLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER: {
				CartesianCoordinatesPolygonShapeImageMapLayer cartesianCoordinatesPolygonShapeImageMapLayer = (CartesianCoordinatesPolygonShapeImageMapLayer)theEObject;
				T result = caseCartesianCoordinatesPolygonShapeImageMapLayer(cartesianCoordinatesPolygonShapeImageMapLayer);
				if (result == null) result = casePolygonShapeImageMapLayer(cartesianCoordinatesPolygonShapeImageMapLayer);
				if (result == null) result = caseAbstractShapeImageLayer(cartesianCoordinatesPolygonShapeImageMapLayer);
				if (result == null) result = caseImageMapLayer(cartesianCoordinatesPolygonShapeImageMapLayer);
				if (result == null) result = caseAbstractMapLayer(cartesianCoordinatesPolygonShapeImageMapLayer);
				if (result == null) result = caseRectangularRegionImage(cartesianCoordinatesPolygonShapeImageMapLayer);
				if (result == null) result = caseNamed(cartesianCoordinatesPolygonShapeImageMapLayer);
				if (result == null) result = caseDescribed(cartesianCoordinatesPolygonShapeImageMapLayer);
				if (result == null) result = caseRectangularRegionProvider(cartesianCoordinatesPolygonShapeImageMapLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER: {
				GeographicCoordinatesPolygonShapeImageMapLayer geographicCoordinatesPolygonShapeImageMapLayer = (GeographicCoordinatesPolygonShapeImageMapLayer)theEObject;
				T result = caseGeographicCoordinatesPolygonShapeImageMapLayer(geographicCoordinatesPolygonShapeImageMapLayer);
				if (result == null) result = casePolygonShapeImageMapLayer(geographicCoordinatesPolygonShapeImageMapLayer);
				if (result == null) result = caseAbstractShapeImageLayer(geographicCoordinatesPolygonShapeImageMapLayer);
				if (result == null) result = caseImageMapLayer(geographicCoordinatesPolygonShapeImageMapLayer);
				if (result == null) result = caseAbstractMapLayer(geographicCoordinatesPolygonShapeImageMapLayer);
				if (result == null) result = caseRectangularRegionImage(geographicCoordinatesPolygonShapeImageMapLayer);
				if (result == null) result = caseNamed(geographicCoordinatesPolygonShapeImageMapLayer);
				if (result == null) result = caseDescribed(geographicCoordinatesPolygonShapeImageMapLayer);
				if (result == null) result = caseRectangularRegionProvider(geographicCoordinatesPolygonShapeImageMapLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER: {
				BasicCartesianTriangularMeshMapLayer basicCartesianTriangularMeshMapLayer = (BasicCartesianTriangularMeshMapLayer)theEObject;
				T result = caseBasicCartesianTriangularMeshMapLayer(basicCartesianTriangularMeshMapLayer);
				if (result == null) result = caseCartesianTriangularMeshMapLayer(basicCartesianTriangularMeshMapLayer);
				if (result == null) result = caseAbstractMapLayer(basicCartesianTriangularMeshMapLayer);
				if (result == null) result = caseNamed(basicCartesianTriangularMeshMapLayer);
				if (result == null) result = caseDescribed(basicCartesianTriangularMeshMapLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER: {
				CartesianTriangularMeshURLMapLayer cartesianTriangularMeshURLMapLayer = (CartesianTriangularMeshURLMapLayer)theEObject;
				T result = caseCartesianTriangularMeshURLMapLayer(cartesianTriangularMeshURLMapLayer);
				if (result == null) result = caseCartesianTriangularMeshMapLayer(cartesianTriangularMeshURLMapLayer);
				if (result == null) result = caseURLMapLayer(cartesianTriangularMeshURLMapLayer);
				if (result == null) result = caseAbstractMapLayer(cartesianTriangularMeshURLMapLayer);
				if (result == null) result = caseNamed(cartesianTriangularMeshURLMapLayer);
				if (result == null) result = caseDescribed(cartesianTriangularMeshURLMapLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.FEATURES_OF_INTEREST_MAP_LAYER: {
				FeaturesOfInterestMapLayer featuresOfInterestMapLayer = (FeaturesOfInterestMapLayer)theEObject;
				T result = caseFeaturesOfInterestMapLayer(featuresOfInterestMapLayer);
				if (result == null) result = caseAbstractMapLayer(featuresOfInterestMapLayer);
				if (result == null) result = caseRectangularRegionProvider(featuresOfInterestMapLayer);
				if (result == null) result = caseNamed(featuresOfInterestMapLayer);
				if (result == null) result = caseDescribed(featuresOfInterestMapLayer);
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
			case ApogyCoreEnvironmentPackage.SURFACE_WORKSITE_NODE: {
				SurfaceWorksiteNode surfaceWorksiteNode = (SurfaceWorksiteNode)theEObject;
				T result = caseSurfaceWorksiteNode(surfaceWorksiteNode);
				if (result == null) result = caseWorksiteNode(surfaceWorksiteNode);
				if (result == null) result = caseAggregateGroupNode(surfaceWorksiteNode);
				if (result == null) result = caseGroupNode(surfaceWorksiteNode);
				if (result == null) result = caseNode(surfaceWorksiteNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.EARTH_SURFACE_WORKSITE_NODE: {
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
			case ApogyCoreEnvironmentPackage.MAPS_LIST_NODE: {
				MapsListNode mapsListNode = (MapsListNode)theEObject;
				T result = caseMapsListNode(mapsListNode);
				if (result == null) result = caseAggregateGroupNode(mapsListNode);
				if (result == null) result = caseGroupNode(mapsListNode);
				if (result == null) result = caseNode(mapsListNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.MAP_NODE: {
				MapNode mapNode = (MapNode)theEObject;
				T result = caseMapNode(mapNode);
				if (result == null) result = caseTransformNode(mapNode);
				if (result == null) result = casePositionNode(mapNode);
				if (result == null) result = caseRotationNode(mapNode);
				if (result == null) result = caseAggregateGroupNode(mapNode);
				if (result == null) result = caseGroupNode(mapNode);
				if (result == null) result = caseNode(mapNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER_NODE: {
				AbstractMapLayerNode abstractMapLayerNode = (AbstractMapLayerNode)theEObject;
				T result = caseAbstractMapLayerNode(abstractMapLayerNode);
				if (result == null) result = caseAggregateGroupNode(abstractMapLayerNode);
				if (result == null) result = caseGroupNode(abstractMapLayerNode);
				if (result == null) result = caseNode(abstractMapLayerNode);
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
			case ApogyCoreEnvironmentPackage.EARTH_SKY_NODE: {
				EarthSkyNode earthSkyNode = (EarthSkyNode)theEObject;
				T result = caseEarthSkyNode(earthSkyNode);
				if (result == null) result = caseSkyNode(earthSkyNode);
				if (result == null) result = caseGroupNode(earthSkyNode);
				if (result == null) result = caseNode(earthSkyNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE: {
				CartesianTriangularMeshMapLayerNode cartesianTriangularMeshMapLayerNode = (CartesianTriangularMeshMapLayerNode)theEObject;
				T result = caseCartesianTriangularMeshMapLayerNode(cartesianTriangularMeshMapLayerNode);
				if (result == null) result = caseAbstractMapLayerNode(cartesianTriangularMeshMapLayerNode);
				if (result == null) result = caseAggregateGroupNode(cartesianTriangularMeshMapLayerNode);
				if (result == null) result = caseGroupNode(cartesianTriangularMeshMapLayerNode);
				if (result == null) result = caseNode(cartesianTriangularMeshMapLayerNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
  public T caseSurfaceWorksite(SurfaceWorksite object)
  {
		return null;
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
  public T caseEarthSurfaceWorksite(EarthSurfaceWorksite object)
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
  public T caseEnvironment(Environment object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Surface Environment</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surface Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSurfaceEnvironment(SurfaceEnvironment object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Earth Surface Environment</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earth Surface Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEarthSurfaceEnvironment(EarthSurfaceEnvironment object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Atmosphere</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atmosphere</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAtmosphere(Atmosphere object)
  {
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
  public T caseAtmosphereUtils(AtmosphereUtils object)
  {
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
  public T caseGeographicCoordinates(GeographicCoordinates object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Horizontal Coordinates</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Horizontal Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHorizontalCoordinates(HorizontalCoordinates object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Ecliptic Coordinates</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecliptic Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEclipticCoordinates(EclipticCoordinates object)
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
  public T caseEarthSky(EarthSky object)
  {
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
  public T caseAstronomyUtils(AstronomyUtils object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Map</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMap(Map object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Maps List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maps List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMapsList(MapsList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Map Layer</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Map Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractMapLayer(AbstractMapLayer object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Map Layer Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Layer Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapLayerPresentation(MapLayerPresentation object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>URL Map Layer</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URL Map Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseURLMapLayer(URLMapLayer object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRegion(Region object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangular Region</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangular Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRectangularRegion(RectangularRegion object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangular Volume Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangular Volume Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangularVolumeRegion(RectangularVolumeRegion object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangular Region Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangular Region Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangularRegionProvider(RectangularRegionProvider object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangular Region Image</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangular Region Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRectangularRegionImage(RectangularRegionImage object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Image Map Layer</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Map Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseImageMapLayer(ImageMapLayer object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Image Map Layer Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Map Layer Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageMapLayerPresentation(ImageMapLayerPresentation object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>URL Image Map Layer</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URL Image Map Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseURLImageMapLayer(URLImageMapLayer object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Topology Tree Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topology Tree Map Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopologyTreeMapLayer(TopologyTreeMapLayer object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Topology Tree Map Layer Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topology Tree Map Layer Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopologyTreeMapLayerNode(TopologyTreeMapLayerNode object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Triangular Mesh Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Triangular Mesh Map Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCartesianTriangularMeshMapLayer(CartesianTriangularMeshMapLayer object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Triangular Mesh Derived Image Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Triangular Mesh Derived Image Map Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCartesianTriangularMeshDerivedImageMapLayer(CartesianTriangularMeshDerivedImageMapLayer object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Triangular Mesh Slope Image Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Triangular Mesh Slope Image Map Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCartesianTriangularMeshSlopeImageMapLayer(CartesianTriangularMeshSlopeImageMapLayer object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Triangular Mesh Discrete Slope Image Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Triangular Mesh Discrete Slope Image Map Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCartesianTriangularMeshDiscreteSlopeImageMapLayer(CartesianTriangularMeshDiscreteSlopeImageMapLayer object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Triangular Mesh Height Image Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Triangular Mesh Height Image Map Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCartesianTriangularMeshHeightImageMapLayer(CartesianTriangularMeshHeightImageMapLayer object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Of Sight Image Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Of Sight Image Map Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineOfSightImageMapLayer(LineOfSightImageMapLayer object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Shape Image Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Shape Image Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractShapeImageLayer(AbstractShapeImageLayer object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Ellipse Shape Image Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ellipse Shape Image Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEllipseShapeImageLayer(EllipseShapeImageLayer object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangle Shape Image Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangle Shape Image Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangleShapeImageLayer(RectangleShapeImageLayer object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon Shape Image Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon Shape Image Map Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygonShapeImageMapLayer(PolygonShapeImageMapLayer object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Coordinates Polygon Shape Image Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Coordinates Polygon Shape Image Map Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCartesianCoordinatesPolygonShapeImageMapLayer(CartesianCoordinatesPolygonShapeImageMapLayer object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Geographic Coordinates Polygon Shape Image Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geographic Coordinates Polygon Shape Image Map Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeographicCoordinatesPolygonShapeImageMapLayer(GeographicCoordinatesPolygonShapeImageMapLayer object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Slope Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slope Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlopeRange(SlopeRange object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Cartesian Triangular Mesh Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Cartesian Triangular Mesh Map Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicCartesianTriangularMeshMapLayer(BasicCartesianTriangularMeshMapLayer object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Triangular Mesh URL Map Layer</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Triangular Mesh URL Map Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseCartesianTriangularMeshURLMapLayer(CartesianTriangularMeshURLMapLayer object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Features Of Interest Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Features Of Interest Map Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeaturesOfInterestMapLayer(FeaturesOfInterestMapLayer object) {
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
  public T caseSurfaceWorksiteNode(SurfaceWorksiteNode object)
  {
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
  public T caseEarthSurfaceWorksiteNode(EarthSurfaceWorksiteNode object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Maps List Node</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maps List Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMapsListNode(MapsListNode object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Map Node</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMapNode(MapNode object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Map Layer Node</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Map Layer Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractMapLayerNode(AbstractMapLayerNode object)
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
  public T caseEarthSkyNode(EarthSkyNode object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Triangular Mesh Map Layer Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Triangular Mesh Map Layer Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCartesianTriangularMeshMapLayerNode(CartesianTriangularMeshMapLayerNode object) {
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
  public T caseAbstractWorksite(AbstractWorksite object)
  {
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
	 * Returns the result of interpreting the object as an instance of '<em>Position Node</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePositionNode(PositionNode object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Rotation Node</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotation Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRotationNode(RotationNode object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Node</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTransformNode(TransformNode object)
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
