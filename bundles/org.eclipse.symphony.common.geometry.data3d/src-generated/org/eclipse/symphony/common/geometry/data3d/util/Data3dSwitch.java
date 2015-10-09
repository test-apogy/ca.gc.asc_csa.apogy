/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.util;

import ca.gc.space.mrt.common.processors.Monitorable;
import ca.gc.space.mrt.common.processors.Processor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.common.geometry.data.Coordinates;
import org.eclipse.symphony.common.geometry.data.CoordinatesSamplingShape;
import org.eclipse.symphony.common.geometry.data.CoordinatesSet;
import org.eclipse.symphony.common.geometry.data.CoordinatesSetShapesSampler;
import org.eclipse.symphony.common.geometry.data.Mesh;
import org.eclipse.symphony.common.geometry.data.MeshCoordinatesShapesSampler;
import org.eclipse.symphony.common.geometry.data.MeshPolygonShapesSampler;
import org.eclipse.symphony.common.geometry.data.Polygon;
import org.eclipse.symphony.common.geometry.data.PolygonSamplingShape;
import org.eclipse.symphony.common.geometry.data.SamplingShape;
import org.eclipse.symphony.common.geometry.data3d.*;

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
 * @see org.eclipse.symphony.common.geometry.data3d.Data3dPackage
 * @generated
 */
public class Data3dSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Data3dPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data3dSwitch() {
		if (modelPackage == null) {
			modelPackage = Data3dPackage.eINSTANCE;
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
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Data3dPackage.CARTESIAN_POLYGON: {
				CartesianPolygon cartesianPolygon = (CartesianPolygon)theEObject;
				T1 result = caseCartesianPolygon(cartesianPolygon);
				if (result == null) result = casePolygon(cartesianPolygon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.CARTESIAN_TRIANGLE: {
				CartesianTriangle cartesianTriangle = (CartesianTriangle)theEObject;
				T1 result = caseCartesianTriangle(cartesianTriangle);
				if (result == null) result = caseCartesianPolygon(cartesianTriangle);
				if (result == null) result = casePolygon(cartesianTriangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.SPHERICAL_POLYGON: {
				SphericalPolygon sphericalPolygon = (SphericalPolygon)theEObject;
				T1 result = caseSphericalPolygon(sphericalPolygon);
				if (result == null) result = casePolygon(sphericalPolygon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.SPHERICAL_TRIANGLE: {
				SphericalTriangle sphericalTriangle = (SphericalTriangle)theEObject;
				T1 result = caseSphericalTriangle(sphericalTriangle);
				if (result == null) result = caseSphericalPolygon(sphericalTriangle);
				if (result == null) result = casePolygon(sphericalTriangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.CARTESIAN_POSITION_COORDINATES: {
				CartesianPositionCoordinates cartesianPositionCoordinates = (CartesianPositionCoordinates)theEObject;
				T1 result = caseCartesianPositionCoordinates(cartesianPositionCoordinates);
				if (result == null) result = caseCoordinates(cartesianPositionCoordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.RGB_CARTESIAN_POSITION_COORDINATES: {
				RGBCartesianPositionCoordinates rgbCartesianPositionCoordinates = (RGBCartesianPositionCoordinates)theEObject;
				T1 result = caseRGBCartesianPositionCoordinates(rgbCartesianPositionCoordinates);
				if (result == null) result = caseCartesianPositionCoordinates(rgbCartesianPositionCoordinates);
				if (result == null) result = caseCoordinates(rgbCartesianPositionCoordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.CARTESIAN_ORIENTATION_COORDINATES: {
				CartesianOrientationCoordinates cartesianOrientationCoordinates = (CartesianOrientationCoordinates)theEObject;
				T1 result = caseCartesianOrientationCoordinates(cartesianOrientationCoordinates);
				if (result == null) result = caseCoordinates(cartesianOrientationCoordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.CARTESIAN_COORDINATES_SET: {
				CartesianCoordinatesSet cartesianCoordinatesSet = (CartesianCoordinatesSet)theEObject;
				T1 result = caseCartesianCoordinatesSet(cartesianCoordinatesSet);
				if (result == null) result = caseCoordinatesSet(cartesianCoordinatesSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT: {
				CartesianCoordinatesSetExtent cartesianCoordinatesSetExtent = (CartesianCoordinatesSetExtent)theEObject;
				T1 result = caseCartesianCoordinatesSetExtent(cartesianCoordinatesSetExtent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.DIGITAL_ELEVATION_MAP: {
				DigitalElevationMap digitalElevationMap = (DigitalElevationMap)theEObject;
				T1 result = caseDigitalElevationMap(digitalElevationMap);
				if (result == null) result = caseCartesianCoordinatesSet(digitalElevationMap);
				if (result == null) result = caseCoordinatesSet(digitalElevationMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.CARTESIAN_COORDINATES_MESH: {
				CartesianCoordinatesMesh cartesianCoordinatesMesh = (CartesianCoordinatesMesh)theEObject;
				T1 result = caseCartesianCoordinatesMesh(cartesianCoordinatesMesh);
				if (result == null) result = caseMesh(cartesianCoordinatesMesh);
				if (result == null) result = caseCartesianCoordinatesSet(cartesianCoordinatesMesh);
				if (result == null) result = caseCoordinatesSet(cartesianCoordinatesMesh);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.CARTESIAN_TRIANGULAR_MESH: {
				CartesianTriangularMesh cartesianTriangularMesh = (CartesianTriangularMesh)theEObject;
				T1 result = caseCartesianTriangularMesh(cartesianTriangularMesh);
				if (result == null) result = caseMesh(cartesianTriangularMesh);
				if (result == null) result = caseCartesianCoordinatesSet(cartesianTriangularMesh);
				if (result == null) result = caseCoordinatesSet(cartesianTriangularMesh);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.SPHERICAL_COORDINATES: {
				SphericalCoordinates sphericalCoordinates = (SphericalCoordinates)theEObject;
				T1 result = caseSphericalCoordinates(sphericalCoordinates);
				if (result == null) result = caseCoordinates(sphericalCoordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.SPHERICAL_COORDINATES_SET: {
				SphericalCoordinatesSet sphericalCoordinatesSet = (SphericalCoordinatesSet)theEObject;
				T1 result = caseSphericalCoordinatesSet(sphericalCoordinatesSet);
				if (result == null) result = caseCoordinatesSet(sphericalCoordinatesSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.SPHERICAL_COORDINATES_MESH: {
				SphericalCoordinatesMesh sphericalCoordinatesMesh = (SphericalCoordinatesMesh)theEObject;
				T1 result = caseSphericalCoordinatesMesh(sphericalCoordinatesMesh);
				if (result == null) result = caseMesh(sphericalCoordinatesMesh);
				if (result == null) result = caseSphericalCoordinatesSet(sphericalCoordinatesMesh);
				if (result == null) result = caseCoordinatesSet(sphericalCoordinatesMesh);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.SPHERICAL_TRIANGULAR_MESH: {
				SphericalTriangularMesh sphericalTriangularMesh = (SphericalTriangularMesh)theEObject;
				T1 result = caseSphericalTriangularMesh(sphericalTriangularMesh);
				if (result == null) result = caseMesh(sphericalTriangularMesh);
				if (result == null) result = caseSphericalCoordinatesSet(sphericalTriangularMesh);
				if (result == null) result = caseCoordinatesSet(sphericalTriangularMesh);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.POSE: {
				Pose pose = (Pose)theEObject;
				T1 result = casePose(pose);
				if (result == null) result = caseCartesianPositionCoordinates(pose);
				if (result == null) result = caseCartesianOrientationCoordinates(pose);
				if (result == null) result = caseCoordinates(pose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.SPHERE_SAMPLING_SHAPE: {
				SphereSamplingShape<?> sphereSamplingShape = (SphereSamplingShape<?>)theEObject;
				T1 result = caseSphereSamplingShape(sphereSamplingShape);
				if (result == null) result = caseCoordinatesSamplingShape(sphereSamplingShape);
				if (result == null) result = casePolygonSamplingShape(sphereSamplingShape);
				if (result == null) result = caseSamplingShape(sphereSamplingShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.CUBE_SAMPLING_SHAPE: {
				CubeSamplingShape<?> cubeSamplingShape = (CubeSamplingShape<?>)theEObject;
				T1 result = caseCubeSamplingShape(cubeSamplingShape);
				if (result == null) result = caseCoordinatesSamplingShape(cubeSamplingShape);
				if (result == null) result = casePolygonSamplingShape(cubeSamplingShape);
				if (result == null) result = caseSamplingShape(cubeSamplingShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER: {
				CartesianCoordinatesSetShapeSampler cartesianCoordinatesSetShapeSampler = (CartesianCoordinatesSetShapeSampler)theEObject;
				T1 result = caseCartesianCoordinatesSetShapeSampler(cartesianCoordinatesSetShapeSampler);
				if (result == null) result = caseCoordinatesSetShapesSampler(cartesianCoordinatesSetShapeSampler);
				if (result == null) result = caseProcessor(cartesianCoordinatesSetShapeSampler);
				if (result == null) result = caseMonitorable(cartesianCoordinatesSetShapeSampler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.CARTESIAN_COORDINATES_MESH_SAMPLER: {
				CartesianCoordinatesMeshSampler cartesianCoordinatesMeshSampler = (CartesianCoordinatesMeshSampler)theEObject;
				T1 result = caseCartesianCoordinatesMeshSampler(cartesianCoordinatesMeshSampler);
				if (result == null) result = caseMeshCoordinatesShapesSampler(cartesianCoordinatesMeshSampler);
				if (result == null) result = caseProcessor(cartesianCoordinatesMeshSampler);
				if (result == null) result = caseMonitorable(cartesianCoordinatesMeshSampler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER: {
				CartesianCoordinatesMeshPolygonSampler cartesianCoordinatesMeshPolygonSampler = (CartesianCoordinatesMeshPolygonSampler)theEObject;
				T1 result = caseCartesianCoordinatesMeshPolygonSampler(cartesianCoordinatesMeshPolygonSampler);
				if (result == null) result = caseMeshPolygonShapesSampler(cartesianCoordinatesMeshPolygonSampler);
				if (result == null) result = caseProcessor(cartesianCoordinatesMeshPolygonSampler);
				if (result == null) result = caseMonitorable(cartesianCoordinatesMeshPolygonSampler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.CARTESIAN_TRIANGULAR_MESH_SAMPLER: {
				CartesianTriangularMeshSampler cartesianTriangularMeshSampler = (CartesianTriangularMeshSampler)theEObject;
				T1 result = caseCartesianTriangularMeshSampler(cartesianTriangularMeshSampler);
				if (result == null) result = caseMeshCoordinatesShapesSampler(cartesianTriangularMeshSampler);
				if (result == null) result = caseProcessor(cartesianTriangularMeshSampler);
				if (result == null) result = caseMonitorable(cartesianTriangularMeshSampler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER: {
				CartesianTriangularMeshPolygonSampler cartesianTriangularMeshPolygonSampler = (CartesianTriangularMeshPolygonSampler)theEObject;
				T1 result = caseCartesianTriangularMeshPolygonSampler(cartesianTriangularMeshPolygonSampler);
				if (result == null) result = caseMeshPolygonShapesSampler(cartesianTriangularMeshPolygonSampler);
				if (result == null) result = caseProcessor(cartesianTriangularMeshPolygonSampler);
				if (result == null) result = caseMonitorable(cartesianTriangularMeshPolygonSampler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.CARTESIAN_POSITION_COORDINATES_MESHER: {
				CartesianPositionCoordinatesMesher cartesianPositionCoordinatesMesher = (CartesianPositionCoordinatesMesher)theEObject;
				T1 result = caseCartesianPositionCoordinatesMesher(cartesianPositionCoordinatesMesher);
				if (result == null) result = caseProcessor(cartesianPositionCoordinatesMesher);
				if (result == null) result = caseMonitorable(cartesianPositionCoordinatesMesher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.NORMAL_POINT_CLOUD: {
				NormalPointCloud normalPointCloud = (NormalPointCloud)theEObject;
				T1 result = caseNormalPointCloud(normalPointCloud);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.POINT_LOCATOR: {
				PointLocator pointLocator = (PointLocator)theEObject;
				T1 result = casePointLocator(pointLocator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.VECMATH_POINT_LOCATOR: {
				VecmathPointLocator vecmathPointLocator = (VecmathPointLocator)theEObject;
				T1 result = caseVecmathPointLocator(vecmathPointLocator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.VECMATH_KD_TREE_POINT_LOCATOR: {
				VecmathKdTreePointLocator vecmathKdTreePointLocator = (VecmathKdTreePointLocator)theEObject;
				T1 result = caseVecmathKdTreePointLocator(vecmathKdTreePointLocator);
				if (result == null) result = caseVecmathPointLocator(vecmathKdTreePointLocator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.MESH_LOCALIZER: {
				MeshLocalizer meshLocalizer = (MeshLocalizer)theEObject;
				T1 result = caseMeshLocalizer(meshLocalizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.POINT_NORMAL_LOCATOR: {
				PointNormalLocator pointNormalLocator = (PointNormalLocator)theEObject;
				T1 result = casePointNormalLocator(pointNormalLocator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.DELAUNAY_MESHER: {
				DelaunayMesher delaunayMesher = (DelaunayMesher)theEObject;
				T1 result = caseDelaunayMesher(delaunayMesher);
				if (result == null) result = caseCartesianPositionCoordinatesMesher(delaunayMesher);
				if (result == null) result = caseProcessor(delaunayMesher);
				if (result == null) result = caseMonitorable(delaunayMesher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.DIGITAL_ELEVATION_MAP_MESHER: {
				DigitalElevationMapMesher digitalElevationMapMesher = (DigitalElevationMapMesher)theEObject;
				T1 result = caseDigitalElevationMapMesher(digitalElevationMapMesher);
				if (result == null) result = caseProcessor(digitalElevationMapMesher);
				if (result == null) result = caseMonitorable(digitalElevationMapMesher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.DIGITAL_ELEVATION_MAP_SAMPLER: {
				DigitalElevationMapSampler digitalElevationMapSampler = (DigitalElevationMapSampler)theEObject;
				T1 result = caseDigitalElevationMapSampler(digitalElevationMapSampler);
				if (result == null) result = caseProcessor(digitalElevationMapSampler);
				if (result == null) result = caseMonitorable(digitalElevationMapSampler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.TRIANGULAR_MESH_NORMALS_CALCULATOR: {
				TriangularMeshNormalsCalculator triangularMeshNormalsCalculator = (TriangularMeshNormalsCalculator)theEObject;
				T1 result = caseTriangularMeshNormalsCalculator(triangularMeshNormalsCalculator);
				if (result == null) result = caseProcessor(triangularMeshNormalsCalculator);
				if (result == null) result = caseMonitorable(triangularMeshNormalsCalculator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.TRIANGULAR_MESH_TO_NORMAL_POINT_CLOUD: {
				TriangularMeshToNormalPointCloud triangularMeshToNormalPointCloud = (TriangularMeshToNormalPointCloud)theEObject;
				T1 result = caseTriangularMeshToNormalPointCloud(triangularMeshToNormalPointCloud);
				if (result == null) result = caseProcessor(triangularMeshToNormalPointCloud);
				if (result == null) result = caseMonitorable(triangularMeshToNormalPointCloud);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.POINTS_RANGE_GAGER: {
				PointsRangeGager pointsRangeGager = (PointsRangeGager)theEObject;
				T1 result = casePointsRangeGager(pointsRangeGager);
				if (result == null) result = caseProcessor(pointsRangeGager);
				if (result == null) result = caseMonitorable(pointsRangeGager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.UNIQUE_POINTS_FILTER: {
				UniquePointsFilter uniquePointsFilter = (UniquePointsFilter)theEObject;
				T1 result = caseUniquePointsFilter(uniquePointsFilter);
				if (result == null) result = caseProcessor(uniquePointsFilter);
				if (result == null) result = caseMonitorable(uniquePointsFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER: {
				TriangleEdgeLengthTriangularMeshFilter triangleEdgeLengthTriangularMeshFilter = (TriangleEdgeLengthTriangularMeshFilter)theEObject;
				T1 result = caseTriangleEdgeLengthTriangularMeshFilter(triangleEdgeLengthTriangularMeshFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.OUTLIER_FILTER: {
				OutlierFilter outlierFilter = (OutlierFilter)theEObject;
				T1 result = caseOutlierFilter(outlierFilter);
				if (result == null) result = caseProcessor(outlierFilter);
				if (result == null) result = caseMonitorable(outlierFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.RASTER_POINT_CLOUD: {
				RasterPointCloud rasterPointCloud = (RasterPointCloud)theEObject;
				T1 result = caseRasterPointCloud(rasterPointCloud);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.RASTER_POINT_CLOUD_TO_CARTESIAN_COORDINATES_SET: {
				RasterPointCloudToCartesianCoordinatesSet rasterPointCloudToCartesianCoordinatesSet = (RasterPointCloudToCartesianCoordinatesSet)theEObject;
				T1 result = caseRasterPointCloudToCartesianCoordinatesSet(rasterPointCloudToCartesianCoordinatesSet);
				if (result == null) result = caseProcessor(rasterPointCloudToCartesianCoordinatesSet);
				if (result == null) result = caseMonitorable(rasterPointCloudToCartesianCoordinatesSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.MESH_SMOOTHER: {
				MeshSmoother meshSmoother = (MeshSmoother)theEObject;
				T1 result = caseMeshSmoother(meshSmoother);
				if (result == null) result = caseProcessor(meshSmoother);
				if (result == null) result = caseMonitorable(meshSmoother);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER: {
				VoxelBased3DPointCloudResampler voxelBased3DPointCloudResampler = (VoxelBased3DPointCloudResampler)theEObject;
				T1 result = caseVoxelBased3DPointCloudResampler(voxelBased3DPointCloudResampler);
				if (result == null) result = caseProcessor(voxelBased3DPointCloudResampler);
				if (result == null) result = caseMonitorable(voxelBased3DPointCloudResampler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.RIGID_BODY_POSE_TRACKER: {
				RigidBodyPoseTracker rigidBodyPoseTracker = (RigidBodyPoseTracker)theEObject;
				T1 result = caseRigidBodyPoseTracker(rigidBodyPoseTracker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.POSITION_MARKER: {
				PositionMarker positionMarker = (PositionMarker)theEObject;
				T1 result = casePositionMarker(positionMarker);
				if (result == null) result = caseCartesianPositionCoordinates(positionMarker);
				if (result == null) result = caseCoordinates(positionMarker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.DATA3D_FACADE: {
				Data3dFacade data3dFacade = (Data3dFacade)theEObject;
				T1 result = caseData3dFacade(data3dFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.DATA3_DIO: {
				Data3DIO data3DIO = (Data3DIO)theEObject;
				T1 result = caseData3DIO(data3DIO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Data3dPackage.DATA3_DUTILS: {
				Data3DUtils data3DUtils = (Data3DUtils)theEObject;
				T1 result = caseData3DUtils(data3DUtils);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Polygon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCartesianPolygon(CartesianPolygon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Triangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Triangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCartesianTriangle(CartesianTriangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spherical Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spherical Polygon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSphericalPolygon(SphericalPolygon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spherical Triangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spherical Triangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSphericalTriangle(SphericalTriangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Position Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Position Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCartesianPositionCoordinates(CartesianPositionCoordinates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RGB Cartesian Position Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RGB Cartesian Position Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRGBCartesianPositionCoordinates(RGBCartesianPositionCoordinates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Orientation Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Orientation Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCartesianOrientationCoordinates(CartesianOrientationCoordinates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Coordinates Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Coordinates Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCartesianCoordinatesSet(CartesianCoordinatesSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Coordinates Set Extent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Coordinates Set Extent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCartesianCoordinatesSetExtent(CartesianCoordinatesSetExtent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Elevation Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Elevation Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDigitalElevationMap(DigitalElevationMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Coordinates Mesh</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Coordinates Mesh</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCartesianCoordinatesMesh(CartesianCoordinatesMesh object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Triangular Mesh</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Triangular Mesh</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCartesianTriangularMesh(CartesianTriangularMesh object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spherical Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spherical Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSphericalCoordinates(SphericalCoordinates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spherical Coordinates Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spherical Coordinates Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSphericalCoordinatesSet(SphericalCoordinatesSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spherical Coordinates Mesh</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spherical Coordinates Mesh</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSphericalCoordinatesMesh(SphericalCoordinatesMesh object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spherical Triangular Mesh</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spherical Triangular Mesh</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSphericalTriangularMesh(SphericalTriangularMesh object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePose(Pose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sphere Sampling Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sphere Sampling Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <PolygonType extends CartesianPolygon> T1 caseSphereSamplingShape(SphereSamplingShape<PolygonType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cube Sampling Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cube Sampling Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <PolygonType extends CartesianPolygon> T1 caseCubeSamplingShape(CubeSamplingShape<PolygonType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Coordinates Set Shape Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Coordinates Set Shape Sampler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCartesianCoordinatesSetShapeSampler(CartesianCoordinatesSetShapeSampler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Coordinates Mesh Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Coordinates Mesh Sampler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCartesianCoordinatesMeshSampler(CartesianCoordinatesMeshSampler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Coordinates Mesh Polygon Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Coordinates Mesh Polygon Sampler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCartesianCoordinatesMeshPolygonSampler(CartesianCoordinatesMeshPolygonSampler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Triangular Mesh Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Triangular Mesh Sampler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCartesianTriangularMeshSampler(CartesianTriangularMeshSampler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Triangular Mesh Polygon Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Triangular Mesh Polygon Sampler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCartesianTriangularMeshPolygonSampler(CartesianTriangularMeshPolygonSampler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Position Coordinates Mesher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Position Coordinates Mesher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCartesianPositionCoordinatesMesher(CartesianPositionCoordinatesMesher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Point Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Point Cloud</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNormalPointCloud(NormalPointCloud object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Locator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Locator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePointLocator(PointLocator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vecmath Point Locator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vecmath Point Locator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVecmathPointLocator(VecmathPointLocator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vecmath Kd Tree Point Locator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vecmath Kd Tree Point Locator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVecmathKdTreePointLocator(VecmathKdTreePointLocator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mesh Localizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mesh Localizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMeshLocalizer(MeshLocalizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Normal Locator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Normal Locator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePointNormalLocator(PointNormalLocator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delaunay Mesher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delaunay Mesher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDelaunayMesher(DelaunayMesher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Elevation Map Mesher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Elevation Map Mesher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDigitalElevationMapMesher(DigitalElevationMapMesher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Elevation Map Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Elevation Map Sampler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDigitalElevationMapSampler(DigitalElevationMapSampler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triangular Mesh Normals Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triangular Mesh Normals Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTriangularMeshNormalsCalculator(TriangularMeshNormalsCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triangular Mesh To Normal Point Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triangular Mesh To Normal Point Cloud</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTriangularMeshToNormalPointCloud(TriangularMeshToNormalPointCloud object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Points Range Gager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Points Range Gager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePointsRangeGager(PointsRangeGager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unique Points Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unique Points Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUniquePointsFilter(UniquePointsFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triangle Edge Length Triangular Mesh Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triangle Edge Length Triangular Mesh Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTriangleEdgeLengthTriangularMeshFilter(TriangleEdgeLengthTriangularMeshFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outlier Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outlier Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOutlierFilter(OutlierFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raster Point Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raster Point Cloud</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRasterPointCloud(RasterPointCloud object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raster Point Cloud To Cartesian Coordinates Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raster Point Cloud To Cartesian Coordinates Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRasterPointCloudToCartesianCoordinatesSet(RasterPointCloudToCartesianCoordinatesSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mesh Smoother</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mesh Smoother</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMeshSmoother(MeshSmoother object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voxel Based3 DPoint Cloud Resampler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voxel Based3 DPoint Cloud Resampler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVoxelBased3DPointCloudResampler(VoxelBased3DPointCloudResampler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rigid Body Pose Tracker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rigid Body Pose Tracker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRigidBodyPoseTracker(RigidBodyPoseTracker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePositionMarker(PositionMarker object) {
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
	public T1 caseData3dFacade(Data3dFacade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data3 DIO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data3 DIO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseData3DIO(Data3DIO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data3 DUtils</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data3 DUtils</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseData3DUtils(Data3DUtils object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Coordinates> T1 casePolygon(Polygon<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCoordinates(Coordinates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinates Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinates Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Coordinates> T1 caseCoordinatesSet(CoordinatesSet<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mesh</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mesh</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> T1 caseMesh(Mesh<CoordinatesType, PolygonType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sampling Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sampling Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSamplingShape(SamplingShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinates Sampling Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinates Sampling Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Coordinates> T1 caseCoordinatesSamplingShape(CoordinatesSamplingShape<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon Sampling Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon Sampling Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> T1 casePolygonSamplingShape(PolygonSamplingShape<CoordinatesType, PolygonType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitorable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitorable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMonitorable(Monitorable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <I, O> T1 caseProcessor(Processor<I, O> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinates Set Shapes Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinates Set Shapes Sampler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Coordinates> T1 caseCoordinatesSetShapesSampler(CoordinatesSetShapesSampler<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mesh Coordinates Shapes Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mesh Coordinates Shapes Sampler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> T1 caseMeshCoordinatesShapesSampler(MeshCoordinatesShapesSampler<CoordinatesType, PolygonType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mesh Polygon Shapes Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mesh Polygon Shapes Sampler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> T1 caseMeshPolygonShapesSampler(MeshPolygonShapesSampler<CoordinatesType, PolygonType> object) {
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
	public T1 defaultCase(EObject object) {
		return null;
	}

} //Data3dSwitch
