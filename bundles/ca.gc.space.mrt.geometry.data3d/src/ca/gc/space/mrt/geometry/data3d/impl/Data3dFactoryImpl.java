/**
 * Canadian Space Agency 2008.
 *
 * $Id: Data3dFactoryImpl.java,v 1.8.4.4 2015/09/22 19:39:41 rlarcheveque Exp $
 */
package ca.gc.space.mrt.geometry.data3d.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.vecmath.GVector;
import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.space.mrt.geometry.data3d.CartesianAxis;
import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesMesh;
import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesMeshPolygonSampler;
import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesMeshSampler;
import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSetExtent;
import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSetShapeSampler;
import ca.gc.space.mrt.geometry.data3d.CartesianOrientationCoordinates;
import ca.gc.space.mrt.geometry.data3d.CartesianPlane;
import ca.gc.space.mrt.geometry.data3d.CartesianPolygon;
import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinatesMesher;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangle;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangularMesh;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangularMeshPolygonSampler;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangularMeshSampler;
import ca.gc.space.mrt.geometry.data3d.CubeSamplingShape;
import ca.gc.space.mrt.geometry.data3d.Data3DIO;
import ca.gc.space.mrt.geometry.data3d.Data3DUtils;
import ca.gc.space.mrt.geometry.data3d.Data3dFacade;
import ca.gc.space.mrt.geometry.data3d.Data3dFactory;
import ca.gc.space.mrt.geometry.data3d.Data3dPackage;
import ca.gc.space.mrt.geometry.data3d.DelaunayMesher;
import ca.gc.space.mrt.geometry.data3d.DigitalElevationMap;
import ca.gc.space.mrt.geometry.data3d.DigitalElevationMapMesher;
import ca.gc.space.mrt.geometry.data3d.DigitalElevationMapSampler;
import ca.gc.space.mrt.geometry.data3d.MESHING_PLANE;
import ca.gc.space.mrt.geometry.data3d.MeshLocaliser;
import ca.gc.space.mrt.geometry.data3d.NormalPointCloud;
import ca.gc.space.mrt.geometry.data3d.OutlierFilter;
import ca.gc.space.mrt.geometry.data3d.PointLocator;
import ca.gc.space.mrt.geometry.data3d.PointNormalLocator;
import ca.gc.space.mrt.geometry.data3d.PointsRangeGager;
import ca.gc.space.mrt.geometry.data3d.Pose;
import ca.gc.space.mrt.geometry.data3d.PositionMarker;
import ca.gc.space.mrt.geometry.data3d.RGBCartesianPositionCoordinates;
import ca.gc.space.mrt.geometry.data3d.RasterPointCloud;
import ca.gc.space.mrt.geometry.data3d.RasterPointCloudToCartesianCoordinatesSet;
import ca.gc.space.mrt.geometry.data3d.RigidBodyPoseTracker;
import ca.gc.space.mrt.geometry.data3d.SpericalCoordinatesMesh;
import ca.gc.space.mrt.geometry.data3d.SphereSamplingShape;
import ca.gc.space.mrt.geometry.data3d.SphericalCoordinates;
import ca.gc.space.mrt.geometry.data3d.SphericalCoordinatesSet;
import ca.gc.space.mrt.geometry.data3d.SphericalPolygon;
import ca.gc.space.mrt.geometry.data3d.SphericalTriangle;
import ca.gc.space.mrt.geometry.data3d.SphericalTriangularMesh;
import ca.gc.space.mrt.geometry.data3d.TriangleEdgeLenghtTriangularMeshFilter;
import ca.gc.space.mrt.geometry.data3d.TriangularMesh2NormalPointCloud;
import ca.gc.space.mrt.geometry.data3d.TriangularMeshNormalsCalculator;
import ca.gc.space.mrt.geometry.data3d.UniquePointsFilter;
import ca.gc.space.mrt.geometry.data3d.VecmathKdTreePointLocator;
import ca.gc.space.mrt.geometry.data3d.VoxelBased3DPointCloudResampler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Data3dFactoryImpl extends EFactoryImpl implements Data3dFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2008.";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Data3dFactory init() {
		try {
			Data3dFactory theData3dFactory = (Data3dFactory)EPackage.Registry.INSTANCE.getEFactory(Data3dPackage.eNS_URI);
			if (theData3dFactory != null) {
				return theData3dFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Data3dFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data3dFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Data3dPackage.CARTESIAN_POLYGON: return createCartesianPolygon();
			case Data3dPackage.CARTESIAN_TRIANGLE: return createCartesianTriangle();
			case Data3dPackage.SPHERICAL_POLYGON: return createSphericalPolygon();
			case Data3dPackage.SPHERICAL_TRIANGLE: return createSphericalTriangle();
			case Data3dPackage.CARTESIAN_POSITION_COORDINATES: return createCartesianPositionCoordinates();
			case Data3dPackage.RGB_CARTESIAN_POSITION_COORDINATES: return createRGBCartesianPositionCoordinates();
			case Data3dPackage.CARTESIAN_ORIENTATION_COORDINATES: return createCartesianOrientationCoordinates();
			case Data3dPackage.CARTESIAN_COORDINATES_SET: return createCartesianCoordinatesSet();
			case Data3dPackage.DIGITAL_ELEVATION_MAP: return createDigitalElevationMap();
			case Data3dPackage.CARTESIAN_COORDINATES_MESH: return createCartesianCoordinatesMesh();
			case Data3dPackage.CARTESIAN_TRIANGULAR_MESH: return createCartesianTriangularMesh();
			case Data3dPackage.SPHERICAL_COORDINATES: return createSphericalCoordinates();
			case Data3dPackage.SPHERICAL_COORDINATES_SET: return createSphericalCoordinatesSet();
			case Data3dPackage.SPERICAL_COORDINATES_MESH: return createSpericalCoordinatesMesh();
			case Data3dPackage.SPHERICAL_TRIANGULAR_MESH: return createSphericalTriangularMesh();
			case Data3dPackage.POSE: return createPose();
			case Data3dPackage.SPHERE_SAMPLING_SHAPE: return createSphereSamplingShape();
			case Data3dPackage.CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER: return createCartesianCoordinatesSetShapeSampler();
			case Data3dPackage.CARTESIAN_COORDINATES_MESH_SAMPLER: return createCartesianCoordinatesMeshSampler();
			case Data3dPackage.CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER: return createCartesianCoordinatesMeshPolygonSampler();
			case Data3dPackage.CARTESIAN_TRIANGULAR_MESH_SAMPLER: return createCartesianTriangularMeshSampler();
			case Data3dPackage.CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER: return createCartesianTriangularMeshPolygonSampler();
			case Data3dPackage.CARTESIAN_POSITION_COORDINATES_MESHER: return createCartesianPositionCoordinatesMesher();
			case Data3dPackage.DATA3D_FACADE: return createData3dFacade();
			case Data3dPackage.DATA3_DIO: return createData3DIO();
			case Data3dPackage.POINT_LOCATOR: return createPointLocator();
			case Data3dPackage.DATA3_DUTILS: return createData3DUtils();
			case Data3dPackage.NORMAL_POINT_CLOUD: return createNormalPointCloud();
			case Data3dPackage.VECMATH_KD_TREE_POINT_LOCATOR: return createVecmathKdTreePointLocator();
			case Data3dPackage.MESH_LOCALISER: return createMeshLocaliser();
			case Data3dPackage.POINT_NORMAL_LOCATOR: return createPointNormalLocator();
			case Data3dPackage.DELAUNAY_MESHER: return createDelaunayMesher();
			case Data3dPackage.DIGITAL_ELEVATION_MAP_MESHER: return createDigitalElevationMapMesher();
			case Data3dPackage.DIGITAL_ELEVATION_MAP_SAMPLER: return createDigitalElevationMapSampler();
			case Data3dPackage.TRIANGULAR_MESH_NORMALS_CALCULATOR: return createTriangularMeshNormalsCalculator();
			case Data3dPackage.TRIANGULAR_MESH2_NORMAL_POINT_CLOUD: return createTriangularMesh2NormalPointCloud();
			case Data3dPackage.POINTS_RANGE_GAGER: return createPointsRangeGager();
			case Data3dPackage.UNIQUE_POINTS_FILTER: return createUniquePointsFilter();
			case Data3dPackage.TRIANGLE_EDGE_LENGHT_TRIANGULAR_MESH_FILTER: return createTriangleEdgeLenghtTriangularMeshFilter();
			case Data3dPackage.OUTLIER_FILTER: return createOutlierFilter();
			case Data3dPackage.RASTER_POINT_CLOUD: return createRasterPointCloud();
			case Data3dPackage.RASTER_POINT_CLOUD_TO_CARTESIAN_COORDINATES_SET: return createRasterPointCloudToCartesianCoordinatesSet();
			case Data3dPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER: return createVoxelBased3DPointCloudResampler();
			case Data3dPackage.RIGID_BODY_POSE_TRACKER: return createRigidBodyPoseTracker();
			case Data3dPackage.POSITION_MARKER: return createPositionMarker();
			case Data3dPackage.CUBE_SAMPLING_SHAPE: return createCubeSamplingShape();
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT: return createCartesianCoordinatesSetExtent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Data3dPackage.CARTESIAN_AXIS:
				return createCartesianAxisFromString(eDataType, initialValue);
			case Data3dPackage.CARTESIAN_PLANE:
				return createCartesianPlaneFromString(eDataType, initialValue);
			case Data3dPackage.MESHING_PLANE:
				return createMESHING_PLANEFromString(eDataType, initialValue);
			case Data3dPackage.INPUT_STREAM:
				return createInputStreamFromString(eDataType, initialValue);
			case Data3dPackage.IO_EXCEPTION:
				return createIOExceptionFromString(eDataType, initialValue);
			case Data3dPackage.OUTPUT_STREAM:
				return createOutputStreamFromString(eDataType, initialValue);
			case Data3dPackage.MATRIX4D:
				return createMatrix4dFromString(eDataType, initialValue);
			case Data3dPackage.VECTOR3D:
				return createVector3dFromString(eDataType, initialValue);
			case Data3dPackage.POINT3D:
				return createPoint3dFromString(eDataType, initialValue);
			case Data3dPackage.DOUBLE_ARRAY_OF_ARRAY:
				return createDoubleArrayOfArrayFromString(eDataType, initialValue);
			case Data3dPackage.INT_ARRAY:
				return createIntArrayFromString(eDataType, initialValue);
			case Data3dPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case Data3dPackage.GVECTOR:
				return createGVectorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Data3dPackage.CARTESIAN_AXIS:
				return convertCartesianAxisToString(eDataType, instanceValue);
			case Data3dPackage.CARTESIAN_PLANE:
				return convertCartesianPlaneToString(eDataType, instanceValue);
			case Data3dPackage.MESHING_PLANE:
				return convertMESHING_PLANEToString(eDataType, instanceValue);
			case Data3dPackage.INPUT_STREAM:
				return convertInputStreamToString(eDataType, instanceValue);
			case Data3dPackage.IO_EXCEPTION:
				return convertIOExceptionToString(eDataType, instanceValue);
			case Data3dPackage.OUTPUT_STREAM:
				return convertOutputStreamToString(eDataType, instanceValue);
			case Data3dPackage.MATRIX4D:
				return convertMatrix4dToString(eDataType, instanceValue);
			case Data3dPackage.VECTOR3D:
				return convertVector3dToString(eDataType, instanceValue);
			case Data3dPackage.POINT3D:
				return convertPoint3dToString(eDataType, instanceValue);
			case Data3dPackage.DOUBLE_ARRAY_OF_ARRAY:
				return convertDoubleArrayOfArrayToString(eDataType, instanceValue);
			case Data3dPackage.INT_ARRAY:
				return convertIntArrayToString(eDataType, instanceValue);
			case Data3dPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case Data3dPackage.GVECTOR:
				return convertGVectorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPolygon createCartesianPolygon() {
		CartesianPolygonImpl cartesianPolygon = new CartesianPolygonImpl();
		return cartesianPolygon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangle createCartesianTriangle() {
		CartesianTriangleImpl cartesianTriangle = new CartesianTriangleImpl();
		return cartesianTriangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SphericalPolygon createSphericalPolygon() {
		SphericalPolygonImpl sphericalPolygon = new SphericalPolygonImpl();
		return sphericalPolygon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SphericalTriangle createSphericalTriangle() {
		SphericalTriangleImpl sphericalTriangle = new SphericalTriangleImpl();
		return sphericalTriangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinates createCartesianPositionCoordinates() {
		CartesianPositionCoordinatesImpl cartesianPositionCoordinates = new CartesianPositionCoordinatesImpl();
		return cartesianPositionCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGBCartesianPositionCoordinates createRGBCartesianPositionCoordinates()
	{
		RGBCartesianPositionCoordinatesImpl rgbCartesianPositionCoordinates = new RGBCartesianPositionCoordinatesImpl();
		return rgbCartesianPositionCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianOrientationCoordinates createCartesianOrientationCoordinates() {
		CartesianOrientationCoordinatesImpl cartesianOrientationCoordinates = new CartesianOrientationCoordinatesImpl();
		return cartesianOrientationCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCoordinatesSet createCartesianCoordinatesSet() {
		CartesianCoordinatesSetImpl cartesianCoordinatesSet = new CartesianCoordinatesSetImpl();
		return cartesianCoordinatesSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCoordinatesMesh createCartesianCoordinatesMesh() {
		CartesianCoordinatesMeshImpl cartesianCoordinatesMesh = new CartesianCoordinatesMeshImpl();
		return cartesianCoordinatesMesh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMesh createCartesianTriangularMesh() {
		CartesianTriangularMeshImpl cartesianTriangularMesh = new CartesianTriangularMeshImpl();
		return cartesianTriangularMesh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SphericalCoordinates createSphericalCoordinates() {
		SphericalCoordinatesImpl sphericalCoordinates = new SphericalCoordinatesImpl();
		return sphericalCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SphericalCoordinatesSet createSphericalCoordinatesSet() {
		SphericalCoordinatesSetImpl sphericalCoordinatesSet = new SphericalCoordinatesSetImpl();
		return sphericalCoordinatesSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpericalCoordinatesMesh createSpericalCoordinatesMesh() {
		SpericalCoordinatesMeshImpl spericalCoordinatesMesh = new SpericalCoordinatesMeshImpl();
		return spericalCoordinatesMesh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SphericalTriangularMesh createSphericalTriangularMesh() {
		SphericalTriangularMeshImpl sphericalTriangularMesh = new SphericalTriangularMeshImpl();
		return sphericalTriangularMesh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pose createPose() {
		PoseImpl pose = new PoseImpl();
		return pose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <PolygonType extends CartesianPolygon> SphereSamplingShape<PolygonType> createSphereSamplingShape() {
		SphereSamplingShapeImpl<PolygonType> sphereSamplingShape = new SphereSamplingShapeImpl<PolygonType>();
		return sphereSamplingShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCoordinatesSetShapeSampler createCartesianCoordinatesSetShapeSampler() {
		CartesianCoordinatesSetShapeSamplerImpl cartesianCoordinatesSetShapeSampler = new CartesianCoordinatesSetShapeSamplerImpl();
		return cartesianCoordinatesSetShapeSampler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCoordinatesMeshSampler createCartesianCoordinatesMeshSampler() {
		CartesianCoordinatesMeshSamplerImpl cartesianCoordinatesMeshSampler = new CartesianCoordinatesMeshSamplerImpl();
		return cartesianCoordinatesMeshSampler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCoordinatesMeshPolygonSampler createCartesianCoordinatesMeshPolygonSampler() {
		CartesianCoordinatesMeshPolygonSamplerImpl cartesianCoordinatesMeshPolygonSampler = new CartesianCoordinatesMeshPolygonSamplerImpl();
		return cartesianCoordinatesMeshPolygonSampler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshSampler createCartesianTriangularMeshSampler() {
		CartesianTriangularMeshSamplerImpl cartesianTriangularMeshSampler = new CartesianTriangularMeshSamplerImpl();
		return cartesianTriangularMeshSampler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshPolygonSampler createCartesianTriangularMeshPolygonSampler() {
		CartesianTriangularMeshPolygonSamplerImpl cartesianTriangularMeshPolygonSampler = new CartesianTriangularMeshPolygonSamplerImpl();
		return cartesianTriangularMeshPolygonSampler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinatesMesher createCartesianPositionCoordinatesMesher() {
		CartesianPositionCoordinatesMesherImpl cartesianPositionCoordinatesMesher = new CartesianPositionCoordinatesMesherImpl();
		return cartesianPositionCoordinatesMesher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data3dFacade createData3dFacade() {
		Data3dFacadeImpl data3dFacade = new Data3dFacadeImpl();
		return data3dFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data3DIO createData3DIO() {
		Data3DIOImpl data3DIO = new Data3DIOImpl();
		return data3DIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointLocator createPointLocator() {
		PointLocatorImpl pointLocator = new PointLocatorImpl();
		return pointLocator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data3DUtils createData3DUtils() {
		Data3DUtilsImpl data3DUtils = new Data3DUtilsImpl();
		return data3DUtils;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalPointCloud createNormalPointCloud() {
		NormalPointCloudImpl normalPointCloud = new NormalPointCloudImpl();
		return normalPointCloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VecmathKdTreePointLocator createVecmathKdTreePointLocator() {
		VecmathKdTreePointLocatorImpl vecmathKdTreePointLocator = new VecmathKdTreePointLocatorImpl();
		return vecmathKdTreePointLocator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeshLocaliser createMeshLocaliser() {
		MeshLocaliserImpl meshLocaliser = new MeshLocaliserImpl();
		return meshLocaliser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointNormalLocator createPointNormalLocator() {
		PointNormalLocatorImpl pointNormalLocator = new PointNormalLocatorImpl();
		return pointNormalLocator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelaunayMesher createDelaunayMesher() {
		DelaunayMesherImpl delaunayMesher = new DelaunayMesherImpl();
		return delaunayMesher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalElevationMapMesher createDigitalElevationMapMesher() {
		DigitalElevationMapMesherImpl digitalElevationMapMesher = new DigitalElevationMapMesherImpl();
		return digitalElevationMapMesher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalElevationMapSampler createDigitalElevationMapSampler() {
		DigitalElevationMapSamplerImpl digitalElevationMapSampler = new DigitalElevationMapSamplerImpl();
		return digitalElevationMapSampler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriangularMeshNormalsCalculator createTriangularMeshNormalsCalculator() {
		TriangularMeshNormalsCalculatorImpl triangularMeshNormalsCalculator = new TriangularMeshNormalsCalculatorImpl();
		return triangularMeshNormalsCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriangularMesh2NormalPointCloud createTriangularMesh2NormalPointCloud() {
		TriangularMesh2NormalPointCloudImpl triangularMesh2NormalPointCloud = new TriangularMesh2NormalPointCloudImpl();
		return triangularMesh2NormalPointCloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointsRangeGager createPointsRangeGager() {
		PointsRangeGagerImpl pointsRangeGager = new PointsRangeGagerImpl();
		return pointsRangeGager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniquePointsFilter createUniquePointsFilter() {
		UniquePointsFilterImpl uniquePointsFilter = new UniquePointsFilterImpl();
		return uniquePointsFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriangleEdgeLenghtTriangularMeshFilter createTriangleEdgeLenghtTriangularMeshFilter() {
		TriangleEdgeLenghtTriangularMeshFilterImpl triangleEdgeLenghtTriangularMeshFilter = new TriangleEdgeLenghtTriangularMeshFilterImpl();
		return triangleEdgeLenghtTriangularMeshFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutlierFilter createOutlierFilter() {
		OutlierFilterImpl outlierFilter = new OutlierFilterImpl();
		return outlierFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RasterPointCloud createRasterPointCloud() {
		RasterPointCloudImpl rasterPointCloud = new RasterPointCloudImpl();
		return rasterPointCloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RasterPointCloudToCartesianCoordinatesSet createRasterPointCloudToCartesianCoordinatesSet() {
		RasterPointCloudToCartesianCoordinatesSetImpl rasterPointCloudToCartesianCoordinatesSet = new RasterPointCloudToCartesianCoordinatesSetImpl();
		return rasterPointCloudToCartesianCoordinatesSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoxelBased3DPointCloudResampler createVoxelBased3DPointCloudResampler() {
		VoxelBased3DPointCloudResamplerImpl voxelBased3DPointCloudResampler = new VoxelBased3DPointCloudResamplerImpl();
		return voxelBased3DPointCloudResampler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RigidBodyPoseTracker createRigidBodyPoseTracker() {
		RigidBodyPoseTrackerImpl rigidBodyPoseTracker = new RigidBodyPoseTrackerImpl();
		return rigidBodyPoseTracker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionMarker createPositionMarker() {
		PositionMarkerImpl positionMarker = new PositionMarkerImpl();
		return positionMarker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <PolygonType extends CartesianPolygon> CubeSamplingShape<PolygonType> createCubeSamplingShape() {
		CubeSamplingShapeImpl<PolygonType> cubeSamplingShape = new CubeSamplingShapeImpl<PolygonType>();
		return cubeSamplingShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCoordinatesSetExtent createCartesianCoordinatesSetExtent() {
		CartesianCoordinatesSetExtentImpl cartesianCoordinatesSetExtent = new CartesianCoordinatesSetExtentImpl();
		return cartesianCoordinatesSetExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalElevationMap createDigitalElevationMap() {
		DigitalElevationMapImpl digitalElevationMap = new DigitalElevationMapImpl();
		return digitalElevationMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianAxis createCartesianAxisFromString(EDataType eDataType, String initialValue) {
		CartesianAxis result = CartesianAxis.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCartesianAxisToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPlane createCartesianPlaneFromString(EDataType eDataType, String initialValue) {
		CartesianPlane result = CartesianPlane.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCartesianPlaneToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MESHING_PLANE createMESHING_PLANEFromString(EDataType eDataType, String initialValue) {
		MESHING_PLANE result = MESHING_PLANE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMESHING_PLANEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputStream createInputStreamFromString(EDataType eDataType, String initialValue) {
		return (InputStream)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputStreamToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int[] createIntArrayFromString(EDataType eDataType, String initialValue) {
		return (int[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<?> createListFromString(EDataType eDataType, String initialValue) {
		return (List<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GVector createGVectorFromString(EDataType eDataType, String initialValue) {
		return (GVector)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGVectorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOException createIOExceptionFromString(EDataType eDataType, String initialValue) {
		return (IOException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIOExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputStream createOutputStreamFromString(EDataType eDataType, String initialValue) {
		return (OutputStream)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutputStreamToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix4d createMatrix4dFromString(EDataType eDataType, String initialValue) {
		return (Matrix4d)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMatrix4dToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3d createVector3dFromString(EDataType eDataType, String initialValue) {
		return (Vector3d)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVector3dToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Point3d createPoint3dFromString(EDataType eDataType, String initialValue) 
	{
		Pattern pattern = Pattern.compile("\\((.*), (.*), (.*)\\)");

		Matcher match = pattern.matcher(initialValue);

		if (match == null || !match.matches()) {
			throw new IllegalArgumentException("Value " + initialValue
					+ " is invalid");
		}

		String xStr = match.group(1);
		String yStr = match.group(2);
		String zStr = match.group(3);

		double x = Double.parseDouble(xStr);
		double y = Double.parseDouble(yStr);
		double z = Double.parseDouble(zStr);

		return new Point3d(x, y, z);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPoint3dToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double[][] createDoubleArrayOfArrayFromString(EDataType eDataType, String initialValue) {
		return (double[][])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleArrayOfArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data3dPackage getData3dPackage() {
		return (Data3dPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Data3dPackage getPackage() {
		return Data3dPackage.eINSTANCE;
	}

} //Data3dFactoryImpl
