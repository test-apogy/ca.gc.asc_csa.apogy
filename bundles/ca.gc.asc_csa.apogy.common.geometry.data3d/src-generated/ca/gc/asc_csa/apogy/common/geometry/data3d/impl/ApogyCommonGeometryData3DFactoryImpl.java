/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

import javax.vecmath.GVector;
import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector2d;
import javax.vecmath.Vector3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.common.geometry.data3d.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonGeometryData3DFactoryImpl extends EFactoryImpl implements ApogyCommonGeometryData3DFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCommonGeometryData3DFactory init() {
		try {
			ApogyCommonGeometryData3DFactory theApogyCommonGeometryData3DFactory = (ApogyCommonGeometryData3DFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonGeometryData3DPackage.eNS_URI);
			if (theApogyCommonGeometryData3DFactory != null) {
				return theApogyCommonGeometryData3DFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonGeometryData3DFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonGeometryData3DFactoryImpl() {
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
			case ApogyCommonGeometryData3DPackage.CARTESIAN_POLYGON: return createCartesianPolygon();
			case ApogyCommonGeometryData3DPackage.CARTESIAN_TRIANGLE: return createCartesianTriangle();
			case ApogyCommonGeometryData3DPackage.SPHERICAL_POLYGON: return createSphericalPolygon();
			case ApogyCommonGeometryData3DPackage.SPHERICAL_TRIANGLE: return createSphericalTriangle();
			case ApogyCommonGeometryData3DPackage.CARTESIAN_POSITION_COORDINATES: return createCartesianPositionCoordinates();
			case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES: return createColoredCartesianPositionCoordinates();
			case ApogyCommonGeometryData3DPackage.CARTESIAN_ORIENTATION_COORDINATES: return createCartesianOrientationCoordinates();
			case ApogyCommonGeometryData3DPackage.ABSTRACT_CARTESIAN_COORDINATES_SET: return createAbstractCartesianCoordinatesSet();
			case ApogyCommonGeometryData3DPackage.CARTESIAN_COORDINATES_SET: return createCartesianCoordinatesSet();
			case ApogyCommonGeometryData3DPackage.COLORED_COORDINATES_SET: return createColoredCoordinatesSet();
			case ApogyCommonGeometryData3DPackage.CARTESIAN_COORDINATES_SET_EXTENT: return createCartesianCoordinatesSetExtent();
			case ApogyCommonGeometryData3DPackage.DIGITAL_ELEVATION_MAP: return createDigitalElevationMap();
			case ApogyCommonGeometryData3DPackage.CARTESIAN_COORDINATES_MESH: return createCartesianCoordinatesMesh();
			case ApogyCommonGeometryData3DPackage.CARTESIAN_TRIANGULAR_MESH: return createCartesianTriangularMesh();
			case ApogyCommonGeometryData3DPackage.SPHERICAL_COORDINATES: return createSphericalCoordinates();
			case ApogyCommonGeometryData3DPackage.SPHERICAL_COORDINATES_SET: return createSphericalCoordinatesSet();
			case ApogyCommonGeometryData3DPackage.SPHERICAL_COORDINATES_MESH: return createSphericalCoordinatesMesh();
			case ApogyCommonGeometryData3DPackage.SPHERICAL_TRIANGULAR_MESH: return createSphericalTriangularMesh();
			case ApogyCommonGeometryData3DPackage.POSE: return createPose();
			case ApogyCommonGeometryData3DPackage.SPHERE_SAMPLING_SHAPE: return createSphereSamplingShape();
			case ApogyCommonGeometryData3DPackage.CUBE_SAMPLING_SHAPE: return createCubeSamplingShape();
			case ApogyCommonGeometryData3DPackage.CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER: return createCartesianCoordinatesSetShapeSampler();
			case ApogyCommonGeometryData3DPackage.CARTESIAN_COORDINATES_MESH_SAMPLER: return createCartesianCoordinatesMeshSampler();
			case ApogyCommonGeometryData3DPackage.CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER: return createCartesianCoordinatesMeshPolygonSampler();
			case ApogyCommonGeometryData3DPackage.CARTESIAN_TRIANGULAR_MESH_SAMPLER: return createCartesianTriangularMeshSampler();
			case ApogyCommonGeometryData3DPackage.CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER: return createCartesianTriangularMeshPolygonSampler();
			case ApogyCommonGeometryData3DPackage.CARTESIAN_POSITION_COORDINATES_MESHER: return createCartesianPositionCoordinatesMesher();
			case ApogyCommonGeometryData3DPackage.NORMAL_POINT_CLOUD: return createNormalPointCloud();
			case ApogyCommonGeometryData3DPackage.KD_TREE_BASED_POINT_LOCATOR: return createKDTreeBasedPointLocator();
			case ApogyCommonGeometryData3DPackage.MESH_LOCALIZER: return createMeshLocalizer();
			case ApogyCommonGeometryData3DPackage.DELAUNAY_MESHER: return createDelaunayMesher();
			case ApogyCommonGeometryData3DPackage.DIGITAL_ELEVATION_MAP_MESHER: return createDigitalElevationMapMesher();
			case ApogyCommonGeometryData3DPackage.DIGITAL_ELEVATION_MAP_SAMPLER: return createDigitalElevationMapSampler();
			case ApogyCommonGeometryData3DPackage.TRIANGULAR_MESH_NORMALS_CALCULATOR: return createTriangularMeshNormalsCalculator();
			case ApogyCommonGeometryData3DPackage.TRIANGULAR_MESH_TO_NORMAL_POINT_CLOUD: return createTriangularMeshToNormalPointCloud();
			case ApogyCommonGeometryData3DPackage.UNIQUE_POINTS_FILTER: return createUniquePointsFilter();
			case ApogyCommonGeometryData3DPackage.TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER: return createTriangleEdgeLengthTriangularMeshFilter();
			case ApogyCommonGeometryData3DPackage.OUTLIER_FILTER: return createOutlierFilter();
			case ApogyCommonGeometryData3DPackage.MESH_SMOOTHER: return createMeshSmoother();
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER: return createVoxelBased3DPointCloudResampler();
			case ApogyCommonGeometryData3DPackage.POSITION_MARKER: return createPositionMarker();
			case ApogyCommonGeometryData3DPackage.RIGID_BODY_POSE_TRACKER: return createRigidBodyPoseTracker();
			case ApogyCommonGeometryData3DPackage.APOGY_COMMON_GEOMETRY_DATA3_DFACADE: return createApogyCommonGeometryData3DFacade();
			case ApogyCommonGeometryData3DPackage.DATA3_DIO: return createData3DIO();
			case ApogyCommonGeometryData3DPackage.DATA3_DUTILS: return createData3DUtils();
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
			case ApogyCommonGeometryData3DPackage.CARTESIAN_AXIS:
				return createCartesianAxisFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DPackage.CARTESIAN_PLANE:
				return createCartesianPlaneFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DPackage.VECTOR2D:
				return createVector2dFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DPackage.VECTOR3D:
				return createVector3dFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DPackage.POINT3D:
				return createPoint3dFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DPackage.MATRIX4D:
				return createMatrix4dFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DPackage.GVECTOR:
				return createGVectorFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DPackage.MAP:
				return createMapFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DPackage.SET:
				return createSetFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DPackage.SORTED_SET:
				return createSortedSetFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DPackage.COLLECTION:
				return createCollectionFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DPackage.ELIST:
				return createEListFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DPackage.IPROGRESS_MONITOR:
				return createIProgressMonitorFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DPackage.OUTPUT_STREAM:
				return createOutputStreamFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DPackage.INPUT_STREAM:
				return createInputStreamFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DPackage.IO_EXCEPTION:
				return createIOExceptionFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DPackage.ILLEGAL_ARGUMENT_EXCEPTION:
				return createIllegalArgumentExceptionFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DPackage.DOUBLE_ARRAY_OF_ARRAY:
				return createDoubleArrayOfArrayFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DPackage.INT_ARRAY:
				return createIntArrayFromString(eDataType, initialValue);
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
			case ApogyCommonGeometryData3DPackage.CARTESIAN_AXIS:
				return convertCartesianAxisToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DPackage.CARTESIAN_PLANE:
				return convertCartesianPlaneToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DPackage.VECTOR2D:
				return convertVector2dToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DPackage.VECTOR3D:
				return convertVector3dToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DPackage.POINT3D:
				return convertPoint3dToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DPackage.MATRIX4D:
				return convertMatrix4dToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DPackage.GVECTOR:
				return convertGVectorToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DPackage.MAP:
				return convertMapToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DPackage.SET:
				return convertSetToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DPackage.SORTED_SET:
				return convertSortedSetToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DPackage.COLLECTION:
				return convertCollectionToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DPackage.ELIST:
				return convertEListToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DPackage.IPROGRESS_MONITOR:
				return convertIProgressMonitorToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DPackage.OUTPUT_STREAM:
				return convertOutputStreamToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DPackage.INPUT_STREAM:
				return convertInputStreamToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DPackage.IO_EXCEPTION:
				return convertIOExceptionToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DPackage.ILLEGAL_ARGUMENT_EXCEPTION:
				return convertIllegalArgumentExceptionToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DPackage.DOUBLE_ARRAY_OF_ARRAY:
				return convertDoubleArrayOfArrayToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DPackage.INT_ARRAY:
				return convertIntArrayToString(eDataType, instanceValue);
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
	public ColoredCartesianPositionCoordinates createColoredCartesianPositionCoordinates() {
		ColoredCartesianPositionCoordinatesImpl coloredCartesianPositionCoordinates = new ColoredCartesianPositionCoordinatesImpl();
		return coloredCartesianPositionCoordinates;
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
	public <T extends CartesianPositionCoordinates> AbstractCartesianCoordinatesSet<T> createAbstractCartesianCoordinatesSet() {
		AbstractCartesianCoordinatesSetImpl<T> abstractCartesianCoordinatesSet = new AbstractCartesianCoordinatesSetImpl<T>();
		return abstractCartesianCoordinatesSet;
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
	public ColoredCoordinatesSet createColoredCoordinatesSet() {
		ColoredCoordinatesSetImpl coloredCoordinatesSet = new ColoredCoordinatesSetImpl();
		return coloredCoordinatesSet;
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
	public SphericalCoordinatesMesh createSphericalCoordinatesMesh() {
		SphericalCoordinatesMeshImpl sphericalCoordinatesMesh = new SphericalCoordinatesMeshImpl();
		return sphericalCoordinatesMesh;
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
	public <PolygonType extends CartesianPolygon> CubeSamplingShape<PolygonType> createCubeSamplingShape() {
		CubeSamplingShapeImpl<PolygonType> cubeSamplingShape = new CubeSamplingShapeImpl<PolygonType>();
		return cubeSamplingShape;
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
	public NormalPointCloud createNormalPointCloud() {
		NormalPointCloudImpl normalPointCloud = new NormalPointCloudImpl();
		return normalPointCloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KDTreeBasedPointLocator createKDTreeBasedPointLocator() {
		KDTreeBasedPointLocatorImpl kdTreeBasedPointLocator = new KDTreeBasedPointLocatorImpl();
		return kdTreeBasedPointLocator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeshLocalizer createMeshLocalizer() {
		MeshLocalizerImpl meshLocalizer = new MeshLocalizerImpl();
		return meshLocalizer;
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
	public TriangularMeshToNormalPointCloud createTriangularMeshToNormalPointCloud() {
		TriangularMeshToNormalPointCloudImpl triangularMeshToNormalPointCloud = new TriangularMeshToNormalPointCloudImpl();
		return triangularMeshToNormalPointCloud;
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
	public TriangleEdgeLengthTriangularMeshFilter createTriangleEdgeLengthTriangularMeshFilter() {
		TriangleEdgeLengthTriangularMeshFilterImpl triangleEdgeLengthTriangularMeshFilter = new TriangleEdgeLengthTriangularMeshFilterImpl();
		return triangleEdgeLengthTriangularMeshFilter;
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
	public MeshSmoother createMeshSmoother() {
		MeshSmootherImpl meshSmoother = new MeshSmootherImpl();
		return meshSmoother;
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
	public ApogyCommonGeometryData3DFacade createApogyCommonGeometryData3DFacade() {
		ApogyCommonGeometryData3DFacadeImpl apogyCommonGeometryData3DFacade = new ApogyCommonGeometryData3DFacadeImpl();
		return apogyCommonGeometryData3DFacade;
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
	public Data3DUtils createData3DUtils() {
		Data3DUtilsImpl data3DUtils = new Data3DUtilsImpl();
		return data3DUtils;
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
	public Vector2d createVector2dFromString(EDataType eDataType, String initialValue) {
		return (Vector2d)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVector2dToString(EDataType eDataType, Object instanceValue) {
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
	 * @generated
	 */
	public Point3d createPoint3dFromString(EDataType eDataType, String initialValue) {
		return (Point3d)super.createFromString(eDataType, initialValue);
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
	public Map<?, ?> createMapFromString(EDataType eDataType, String initialValue) {
		return (Map<?, ?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<?> createSetFromString(EDataType eDataType, String initialValue) {
		return (Set<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSetToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortedSet<?> createSortedSetFromString(EDataType eDataType, String initialValue) {
		return (SortedSet<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortedSetToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> createCollectionFromString(EDataType eDataType, String initialValue) {
		return (Collection<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<?> createEListFromString(EDataType eDataType, String initialValue) {
		return (EList<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProgressMonitor createIProgressMonitorFromString(EDataType eDataType, String initialValue) {
		return (IProgressMonitor)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIProgressMonitorToString(EDataType eDataType, Object instanceValue) {
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
	public Exception createExceptionFromString(EDataType eDataType, String initialValue) {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IllegalArgumentException createIllegalArgumentExceptionFromString(EDataType eDataType, String initialValue) {
		return (IllegalArgumentException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIllegalArgumentExceptionToString(EDataType eDataType, Object instanceValue) {
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
	public ApogyCommonGeometryData3DPackage getApogyCommonGeometryData3DPackage() {
		return (ApogyCommonGeometryData3DPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCommonGeometryData3DPackage getPackage() {
		return ApogyCommonGeometryData3DPackage.eINSTANCE;
	}

} //ApogyCommonGeometryData3DFactoryImpl
