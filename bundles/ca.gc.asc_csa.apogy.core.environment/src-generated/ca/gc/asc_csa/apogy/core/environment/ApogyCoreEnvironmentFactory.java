package ca.gc.asc_csa.apogy.core.environment;
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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage
 * @generated
 */
public interface ApogyCoreEnvironmentFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyCoreEnvironmentFactory eINSTANCE = ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Earth Surface Worksite</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Surface Worksite</em>'.
	 * @generated
	 */
  EarthSurfaceWorksite createEarthSurfaceWorksite();

  /**
	 * Returns a new object of class '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment</em>'.
	 * @generated
	 */
  Environment createEnvironment();

  /**
	 * Returns a new object of class '<em>Surface Environment</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Surface Environment</em>'.
	 * @generated
	 */
  SurfaceEnvironment createSurfaceEnvironment();

  /**
	 * Returns a new object of class '<em>Earth Surface Environment</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Surface Environment</em>'.
	 * @generated
	 */
  EarthSurfaceEnvironment createEarthSurfaceEnvironment();

  /**
	 * Returns a new object of class '<em>Atmosphere</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atmosphere</em>'.
	 * @generated
	 */
  Atmosphere createAtmosphere();

  /**
	 * Returns a new object of class '<em>Atmosphere Utils</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atmosphere Utils</em>'.
	 * @generated
	 */
  AtmosphereUtils createAtmosphereUtils();

  /**
	 * Returns a new object of class '<em>Equatorial Coordinates</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equatorial Coordinates</em>'.
	 * @generated
	 */
  EquatorialCoordinates createEquatorialCoordinates();

  /**
	 * Returns a new object of class '<em>Geographic Coordinates</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geographic Coordinates</em>'.
	 * @generated
	 */
  GeographicCoordinates createGeographicCoordinates();

  /**
	 * Returns a new object of class '<em>Horizontal Coordinates</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Horizontal Coordinates</em>'.
	 * @generated
	 */
  HorizontalCoordinates createHorizontalCoordinates();

  /**
	 * Returns a new object of class '<em>Ecliptic Coordinates</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecliptic Coordinates</em>'.
	 * @generated
	 */
  EclipticCoordinates createEclipticCoordinates();

  /**
	 * Returns a new object of class '<em>Sky</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sky</em>'.
	 * @generated
	 */
  Sky createSky();

  /**
	 * Returns a new object of class '<em>Earth Sky</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Sky</em>'.
	 * @generated
	 */
  EarthSky createEarthSky();

  /**
	 * Returns a new object of class '<em>Sun</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sun</em>'.
	 * @generated
	 */
  Sun createSun();

  /**
	 * Returns a new object of class '<em>Earth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth</em>'.
	 * @generated
	 */
	Earth createEarth();

		/**
	 * Returns a new object of class '<em>Moon</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Moon</em>'.
	 * @generated
	 */
  Moon createMoon();

  /**
	 * Returns a new object of class '<em>Environment Utilities</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Utilities</em>'.
	 * @generated
	 */
  EnvironmentUtilities createEnvironmentUtilities();

  /**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyCoreEnvironmentFacade createApogyCoreEnvironmentFacade();

		/**
	 * Returns a new object of class '<em>Star</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Star</em>'.
	 * @generated
	 */
  Star createStar();

  /**
	 * Returns a new object of class '<em>Star Field</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Star Field</em>'.
	 * @generated
	 */
  StarField createStarField();

  /**
	 * Returns a new object of class '<em>Astronomy Utils</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Astronomy Utils</em>'.
	 * @generated
	 */
  AstronomyUtils createAstronomyUtils();

  /**
	 * Returns a new object of class '<em>Map</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map</em>'.
	 * @generated
	 */
  Map createMap();

  /**
	 * Returns a new object of class '<em>Maps List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maps List</em>'.
	 * @generated
	 */
  MapsList createMapsList();

  /**
	 * Returns a new object of class '<em>Rectangular Region</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectangular Region</em>'.
	 * @generated
	 */
  RectangularRegion createRectangularRegion();

  /**
	 * Returns a new object of class '<em>Rectangular Volume Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectangular Volume Region</em>'.
	 * @generated
	 */
	RectangularVolumeRegion createRectangularVolumeRegion();

		/**
	 * Returns a new object of class '<em>Image Map Layer</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Map Layer</em>'.
	 * @generated
	 */
  ImageMapLayer createImageMapLayer();

  /**
	 * Returns a new object of class '<em>Image Map Layer Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Map Layer Presentation</em>'.
	 * @generated
	 */
	ImageMapLayerPresentation createImageMapLayerPresentation();

		/**
	 * Returns a new object of class '<em>URL Image Map Layer</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>URL Image Map Layer</em>'.
	 * @generated
	 */
  URLImageMapLayer createURLImageMapLayer();

  /**
	 * Returns a new object of class '<em>Topology Tree Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topology Tree Map Layer</em>'.
	 * @generated
	 */
	TopologyTreeMapLayer createTopologyTreeMapLayer();

		/**
	 * Returns a new object of class '<em>Topology Tree Map Layer Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topology Tree Map Layer Node</em>'.
	 * @generated
	 */
	TopologyTreeMapLayerNode createTopologyTreeMapLayerNode();

		/**
	 * Returns a new object of class '<em>Cartesian Triangular Mesh Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Triangular Mesh Map Layer</em>'.
	 * @generated
	 */
	CartesianTriangularMeshMapLayer createCartesianTriangularMeshMapLayer();

		/**
	 * Returns a new object of class '<em>Cartesian Triangular Mesh Slope Image Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Triangular Mesh Slope Image Map Layer</em>'.
	 * @generated
	 */
	CartesianTriangularMeshSlopeImageMapLayer createCartesianTriangularMeshSlopeImageMapLayer();

		/**
	 * Returns a new object of class '<em>Cartesian Triangular Mesh Discrete Slope Image Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Triangular Mesh Discrete Slope Image Map Layer</em>'.
	 * @generated
	 */
	CartesianTriangularMeshDiscreteSlopeImageMapLayer createCartesianTriangularMeshDiscreteSlopeImageMapLayer();

		/**
	 * Returns a new object of class '<em>Cartesian Triangular Mesh Height Image Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Triangular Mesh Height Image Map Layer</em>'.
	 * @generated
	 */
	CartesianTriangularMeshHeightImageMapLayer createCartesianTriangularMeshHeightImageMapLayer();

		/**
	 * Returns a new object of class '<em>Line Of Sight Image Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Of Sight Image Map Layer</em>'.
	 * @generated
	 */
	LineOfSightImageMapLayer createLineOfSightImageMapLayer();

		/**
	 * Returns a new object of class '<em>Ellipse Shape Image Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ellipse Shape Image Layer</em>'.
	 * @generated
	 */
	EllipseShapeImageLayer createEllipseShapeImageLayer();

		/**
	 * Returns a new object of class '<em>Rectangle Shape Image Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectangle Shape Image Layer</em>'.
	 * @generated
	 */
	RectangleShapeImageLayer createRectangleShapeImageLayer();

		/**
	 * Returns a new object of class '<em>Cartesian Coordinates Polygon Shape Image Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Coordinates Polygon Shape Image Map Layer</em>'.
	 * @generated
	 */
	CartesianCoordinatesPolygonShapeImageMapLayer createCartesianCoordinatesPolygonShapeImageMapLayer();

		/**
	 * Returns a new object of class '<em>Geographic Coordinates Polygon Shape Image Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geographic Coordinates Polygon Shape Image Map Layer</em>'.
	 * @generated
	 */
	GeographicCoordinatesPolygonShapeImageMapLayer createGeographicCoordinatesPolygonShapeImageMapLayer();

		/**
	 * Returns a new object of class '<em>Slope Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slope Range</em>'.
	 * @generated
	 */
	SlopeRange createSlopeRange();

		/**
	 * Returns a new object of class '<em>Basic Cartesian Triangular Mesh Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Cartesian Triangular Mesh Map Layer</em>'.
	 * @generated
	 */
	BasicCartesianTriangularMeshMapLayer createBasicCartesianTriangularMeshMapLayer();

		/**
	 * Returns a new object of class '<em>Cartesian Triangular Mesh URL Map Layer</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Triangular Mesh URL Map Layer</em>'.
	 * @generated
	 */
  CartesianTriangularMeshURLMapLayer createCartesianTriangularMeshURLMapLayer();

  /**
	 * Returns a new object of class '<em>Features Of Interest Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Features Of Interest Map Layer</em>'.
	 * @generated
	 */
	FeaturesOfInterestMapLayer createFeaturesOfInterestMapLayer();

		/**
	 * Returns a new object of class '<em>Worksite Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Worksite Node</em>'.
	 * @generated
	 */
  WorksiteNode createWorksiteNode();

  /**
	 * Returns a new object of class '<em>Surface Worksite Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Surface Worksite Node</em>'.
	 * @generated
	 */
  SurfaceWorksiteNode createSurfaceWorksiteNode();

  /**
	 * Returns a new object of class '<em>Earth Surface Worksite Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Surface Worksite Node</em>'.
	 * @generated
	 */
  EarthSurfaceWorksiteNode createEarthSurfaceWorksiteNode();

  /**
	 * Returns a new object of class '<em>Maps List Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maps List Node</em>'.
	 * @generated
	 */
  MapsListNode createMapsListNode();

  /**
	 * Returns a new object of class '<em>Map Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Node</em>'.
	 * @generated
	 */
  MapNode createMapNode();

  /**
	 * Returns a new object of class '<em>Abstract Map Layer Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Map Layer Node</em>'.
	 * @generated
	 */
  AbstractMapLayerNode createAbstractMapLayerNode();

  /**
	 * Returns a new object of class '<em>Sky Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sky Node</em>'.
	 * @generated
	 */
  SkyNode createSkyNode();

  /**
	 * Returns a new object of class '<em>Earth Sky Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Sky Node</em>'.
	 * @generated
	 */
  EarthSkyNode createEarthSkyNode();

  /**
	 * Returns a new object of class '<em>Cartesian Triangular Mesh Map Layer Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Triangular Mesh Map Layer Node</em>'.
	 * @generated
	 */
	CartesianTriangularMeshMapLayerNode createCartesianTriangularMeshMapLayerNode();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCoreEnvironmentPackage getApogyCoreEnvironmentPackage();

} //ApogyCoreEnvironmentFactory
