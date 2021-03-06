package ca.gc.asc_csa.apogy.common.geometry.data3d;
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
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage
 * @generated
 */
public interface ApogyCommonGeometryData3DFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonGeometryData3DFactory eINSTANCE = ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cartesian Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Polygon</em>'.
	 * @generated
	 */
	CartesianPolygon createCartesianPolygon();

	/**
	 * Returns a new object of class '<em>Cartesian Triangle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Triangle</em>'.
	 * @generated
	 */
	CartesianTriangle createCartesianTriangle();

	/**
	 * Returns a new object of class '<em>Spherical Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spherical Polygon</em>'.
	 * @generated
	 */
	SphericalPolygon createSphericalPolygon();

	/**
	 * Returns a new object of class '<em>Spherical Triangle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spherical Triangle</em>'.
	 * @generated
	 */
	SphericalTriangle createSphericalTriangle();

	/**
	 * Returns a new object of class '<em>Cartesian Position Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Position Coordinates</em>'.
	 * @generated
	 */
	CartesianPositionCoordinates createCartesianPositionCoordinates();

	/**
	 * Returns a new object of class '<em>RGBA Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RGBA Color</em>'.
	 * @generated
	 */
	RGBAColor createRGBAColor();

	/**
	 * Returns a new object of class '<em>Colored Cartesian Position Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Colored Cartesian Position Coordinates</em>'.
	 * @generated
	 */
	ColoredCartesianPositionCoordinates createColoredCartesianPositionCoordinates();

	/**
	 * Returns a new object of class '<em>Colored Cartesian Triangular Mesh</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Colored Cartesian Triangular Mesh</em>'.
	 * @generated
	 */
	ColoredCartesianTriangularMesh createColoredCartesianTriangularMesh();

	/**
	 * Returns a new object of class '<em>Cartesian Triangular Mesh Colorizer By Slope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Triangular Mesh Colorizer By Slope</em>'.
	 * @generated
	 */
	CartesianTriangularMeshColorizerBySlope createCartesianTriangularMeshColorizerBySlope();

	/**
	 * Returns a new object of class '<em>Cartesian Orientation Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Orientation Coordinates</em>'.
	 * @generated
	 */
	CartesianOrientationCoordinates createCartesianOrientationCoordinates();

	/**
	 * Returns a new object of class '<em>Abstract Cartesian Coordinates Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Cartesian Coordinates Set</em>'.
	 * @generated
	 */
	<T extends CartesianPositionCoordinates> AbstractCartesianCoordinatesSet<T> createAbstractCartesianCoordinatesSet();

	/**
	 * Returns a new object of class '<em>Cartesian Coordinates Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Coordinates Set</em>'.
	 * @generated
	 */
	CartesianCoordinatesSet createCartesianCoordinatesSet();

	/**
	 * Returns a new object of class '<em>Colored Cartesian Coordinates Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Colored Cartesian Coordinates Set</em>'.
	 * @generated
	 */
	ColoredCartesianCoordinatesSet createColoredCartesianCoordinatesSet();

	/**
	 * Returns a new object of class '<em>Cartesian Coordinates Set Extent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Coordinates Set Extent</em>'.
	 * @generated
	 */
	CartesianCoordinatesSetExtent createCartesianCoordinatesSetExtent();

	/**
	 * Returns a new object of class '<em>Digital Elevation Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Elevation Map</em>'.
	 * @generated
	 */
	DigitalElevationMap createDigitalElevationMap();

	/**
	 * Returns a new object of class '<em>Cartesian Coordinates Mesh</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Coordinates Mesh</em>'.
	 * @generated
	 */
	CartesianCoordinatesMesh createCartesianCoordinatesMesh();

	/**
	 * Returns a new object of class '<em>Cartesian Triangular Mesh</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Triangular Mesh</em>'.
	 * @generated
	 */
	CartesianTriangularMesh createCartesianTriangularMesh();

	/**
	 * Returns a new object of class '<em>Spherical Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spherical Coordinates</em>'.
	 * @generated
	 */
	SphericalCoordinates createSphericalCoordinates();

	/**
	 * Returns a new object of class '<em>Spherical Coordinates Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spherical Coordinates Set</em>'.
	 * @generated
	 */
	SphericalCoordinatesSet createSphericalCoordinatesSet();

	/**
	 * Returns a new object of class '<em>Spherical Coordinates Mesh</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spherical Coordinates Mesh</em>'.
	 * @generated
	 */
	SphericalCoordinatesMesh createSphericalCoordinatesMesh();

	/**
	 * Returns a new object of class '<em>Spherical Triangular Mesh</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spherical Triangular Mesh</em>'.
	 * @generated
	 */
	SphericalTriangularMesh createSphericalTriangularMesh();

	/**
	 * Returns a new object of class '<em>Pose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pose</em>'.
	 * @generated
	 */
	Pose createPose();

	/**
	 * Returns a new object of class '<em>Sphere Sampling Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sphere Sampling Shape</em>'.
	 * @generated
	 */
	<PolygonType extends CartesianPolygon> SphereSamplingShape<PolygonType> createSphereSamplingShape();

	/**
	 * Returns a new object of class '<em>Cube Sampling Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cube Sampling Shape</em>'.
	 * @generated
	 */
	<PolygonType extends CartesianPolygon> CubeSamplingShape<PolygonType> createCubeSamplingShape();

	/**
	 * Returns a new object of class '<em>Cartesian Coordinates Set Shape Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Coordinates Set Shape Sampler</em>'.
	 * @generated
	 */
	CartesianCoordinatesSetShapeSampler createCartesianCoordinatesSetShapeSampler();

	/**
	 * Returns a new object of class '<em>Cartesian Coordinates Mesh Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Coordinates Mesh Sampler</em>'.
	 * @generated
	 */
	CartesianCoordinatesMeshSampler createCartesianCoordinatesMeshSampler();

	/**
	 * Returns a new object of class '<em>Cartesian Coordinates Mesh Polygon Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Coordinates Mesh Polygon Sampler</em>'.
	 * @generated
	 */
	CartesianCoordinatesMeshPolygonSampler createCartesianCoordinatesMeshPolygonSampler();

	/**
	 * Returns a new object of class '<em>Cartesian Triangular Mesh Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Triangular Mesh Sampler</em>'.
	 * @generated
	 */
	CartesianTriangularMeshSampler createCartesianTriangularMeshSampler();

	/**
	 * Returns a new object of class '<em>Cartesian Triangular Mesh Polygon Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Triangular Mesh Polygon Sampler</em>'.
	 * @generated
	 */
	CartesianTriangularMeshPolygonSampler createCartesianTriangularMeshPolygonSampler();

	/**
	 * Returns a new object of class '<em>Cartesian Position Coordinates Mesher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Position Coordinates Mesher</em>'.
	 * @generated
	 */
	CartesianPositionCoordinatesMesher createCartesianPositionCoordinatesMesher();

	/**
	 * Returns a new object of class '<em>Normal Point Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Point Cloud</em>'.
	 * @generated
	 */
	NormalPointCloud createNormalPointCloud();

	/**
	 * Returns a new object of class '<em>KD Tree Based Point Locator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KD Tree Based Point Locator</em>'.
	 * @generated
	 */
	KDTreeBasedPointLocator createKDTreeBasedPointLocator();

	/**
	 * Returns a new object of class '<em>Mesh Localizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mesh Localizer</em>'.
	 * @generated
	 */
	MeshLocalizer createMeshLocalizer();

	/**
	 * Returns a new object of class '<em>Delaunay Mesher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delaunay Mesher</em>'.
	 * @generated
	 */
	DelaunayMesher createDelaunayMesher();

	/**
	 * Returns a new object of class '<em>Digital Elevation Map Mesher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Elevation Map Mesher</em>'.
	 * @generated
	 */
	DigitalElevationMapMesher createDigitalElevationMapMesher();

	/**
	 * Returns a new object of class '<em>Digital Elevation Map Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Elevation Map Sampler</em>'.
	 * @generated
	 */
	DigitalElevationMapSampler createDigitalElevationMapSampler();

	/**
	 * Returns a new object of class '<em>Triangular Mesh Normals Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Triangular Mesh Normals Calculator</em>'.
	 * @generated
	 */
	TriangularMeshNormalsCalculator createTriangularMeshNormalsCalculator();

	/**
	 * Returns a new object of class '<em>Triangular Mesh To Normal Point Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Triangular Mesh To Normal Point Cloud</em>'.
	 * @generated
	 */
	TriangularMeshToNormalPointCloud createTriangularMeshToNormalPointCloud();

	/**
	 * Returns a new object of class '<em>Unique Points Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unique Points Filter</em>'.
	 * @generated
	 */
	UniquePointsFilter createUniquePointsFilter();

	/**
	 * Returns a new object of class '<em>Triangle Edge Length Triangular Mesh Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Triangle Edge Length Triangular Mesh Filter</em>'.
	 * @generated
	 */
	TriangleEdgeLengthTriangularMeshFilter createTriangleEdgeLengthTriangularMeshFilter();

	/**
	 * Returns a new object of class '<em>Outlier Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outlier Filter</em>'.
	 * @generated
	 */
	OutlierFilter createOutlierFilter();

	/**
	 * Returns a new object of class '<em>Mesh Smoother</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mesh Smoother</em>'.
	 * @generated
	 */
	MeshSmoother createMeshSmoother();

	/**
	 * Returns a new object of class '<em>Voxel Based3 DPoint Cloud Resampler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voxel Based3 DPoint Cloud Resampler</em>'.
	 * @generated
	 */
	VoxelBased3DPointCloudResampler createVoxelBased3DPointCloudResampler();

	/**
	 * Returns a new object of class '<em>Rigid Body Pose Tracker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rigid Body Pose Tracker</em>'.
	 * @generated
	 */
	RigidBodyPoseTracker createRigidBodyPoseTracker();

	/**
	 * Returns a new object of class '<em>Position Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position Marker</em>'.
	 * @generated
	 */
	PositionMarker createPositionMarker();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyCommonGeometryData3DFacade createApogyCommonGeometryData3DFacade();

	/**
	 * Returns a new object of class '<em>Data3 DIO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data3 DIO</em>'.
	 * @generated
	 */
	Data3DIO createData3DIO();

	/**
	 * Returns a new object of class '<em>Data3 DUtils</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data3 DUtils</em>'.
	 * @generated
	 */
	Data3DUtils createData3DUtils();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCommonGeometryData3DPackage getApogyCommonGeometryData3DPackage();

} //ApogyCommonGeometryData3DFactory
