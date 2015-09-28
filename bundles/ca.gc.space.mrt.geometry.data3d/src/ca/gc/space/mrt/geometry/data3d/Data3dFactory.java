/**
 * Canadian Space Agency 2008.
 *
 * $Id: Data3dFactory.java,v 1.3.4.3 2015/08/13 14:22:47 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage
 * @generated
 */
public interface Data3dFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Data3dFactory eINSTANCE = ca.gc.space.mrt.geometry.data3d.impl.Data3dFactoryImpl.init();

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
	 * Returns a new object of class '<em>RGB Cartesian Position Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RGB Cartesian Position Coordinates</em>'.
	 * @generated
	 */
	RGBCartesianPositionCoordinates createRGBCartesianPositionCoordinates();

	/**
	 * Returns a new object of class '<em>Cartesian Orientation Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Orientation Coordinates</em>'.
	 * @generated
	 */
	CartesianOrientationCoordinates createCartesianOrientationCoordinates();

	/**
	 * Returns a new object of class '<em>Cartesian Coordinates Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Coordinates Set</em>'.
	 * @generated
	 */
	CartesianCoordinatesSet createCartesianCoordinatesSet();

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
	 * Returns a new object of class '<em>Sperical Coordinates Mesh</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sperical Coordinates Mesh</em>'.
	 * @generated
	 */
	SpericalCoordinatesMesh createSpericalCoordinatesMesh();

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
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	Data3dFacade createData3dFacade();

	/**
	 * Returns a new object of class '<em>Data3 DIO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data3 DIO</em>'.
	 * @generated
	 */
	Data3DIO createData3DIO();

	/**
	 * Returns a new object of class '<em>Point Locator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Locator</em>'.
	 * @generated
	 */
	PointLocator createPointLocator();

	/**
	 * Returns a new object of class '<em>Data3 DUtils</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data3 DUtils</em>'.
	 * @generated
	 */
	Data3DUtils createData3DUtils();

	/**
	 * Returns a new object of class '<em>Normal Point Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Point Cloud</em>'.
	 * @generated
	 */
	NormalPointCloud createNormalPointCloud();

	/**
	 * Returns a new object of class '<em>Vecmath Kd Tree Point Locator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vecmath Kd Tree Point Locator</em>'.
	 * @generated
	 */
	VecmathKdTreePointLocator createVecmathKdTreePointLocator();

	/**
	 * Returns a new object of class '<em>Mesh Localiser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mesh Localiser</em>'.
	 * @generated
	 */
	MeshLocaliser createMeshLocaliser();

	/**
	 * Returns a new object of class '<em>Point Normal Locator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Normal Locator</em>'.
	 * @generated
	 */
	PointNormalLocator createPointNormalLocator();

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
	 * Returns a new object of class '<em>Triangular Mesh2 Normal Point Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Triangular Mesh2 Normal Point Cloud</em>'.
	 * @generated
	 */
	TriangularMesh2NormalPointCloud createTriangularMesh2NormalPointCloud();

	/**
	 * Returns a new object of class '<em>Points Range Gager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Points Range Gager</em>'.
	 * @generated
	 */
	PointsRangeGager createPointsRangeGager();

	/**
	 * Returns a new object of class '<em>Unique Points Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unique Points Filter</em>'.
	 * @generated
	 */
	UniquePointsFilter createUniquePointsFilter();

	/**
	 * Returns a new object of class '<em>Triangle Edge Lenght Triangular Mesh Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Triangle Edge Lenght Triangular Mesh Filter</em>'.
	 * @generated
	 */
	TriangleEdgeLenghtTriangularMeshFilter createTriangleEdgeLenghtTriangularMeshFilter();

	/**
	 * Returns a new object of class '<em>Outlier Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outlier Filter</em>'.
	 * @generated
	 */
	OutlierFilter createOutlierFilter();

	/**
	 * Returns a new object of class '<em>Raster Point Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raster Point Cloud</em>'.
	 * @generated
	 */
	RasterPointCloud createRasterPointCloud();

	/**
	 * Returns a new object of class '<em>Raster Point Cloud To Cartesian Coordinates Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raster Point Cloud To Cartesian Coordinates Set</em>'.
	 * @generated
	 */
	RasterPointCloudToCartesianCoordinatesSet createRasterPointCloudToCartesianCoordinatesSet();

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
	 * Returns a new object of class '<em>Cube Sampling Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cube Sampling Shape</em>'.
	 * @generated
	 */
	<PolygonType extends CartesianPolygon> CubeSamplingShape<PolygonType> createCubeSamplingShape();

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
	 * Returns a new object of class '<em>Cartesian Position Coordinates Mesher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Position Coordinates Mesher</em>'.
	 * @generated
	 */
	CartesianPositionCoordinatesMesher createCartesianPositionCoordinatesMesher();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Data3dPackage getData3dPackage();

} //Data3dFactory
