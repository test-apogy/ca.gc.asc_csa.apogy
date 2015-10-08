/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.space.mrt.geometry.data3d.util;

import ca.gc.space.mrt.common.processors.Monitorable;
import ca.gc.space.mrt.common.processors.Processor;

import ca.gc.space.mrt.geometry.data.Coordinates;
import ca.gc.space.mrt.geometry.data.CoordinatesSamplingShape;
import ca.gc.space.mrt.geometry.data.CoordinatesSet;
import ca.gc.space.mrt.geometry.data.CoordinatesSetShapesSampler;
import ca.gc.space.mrt.geometry.data.Mesh;
import ca.gc.space.mrt.geometry.data.MeshCoordinatesShapesSampler;
import ca.gc.space.mrt.geometry.data.MeshPolygonShapesSampler;
import ca.gc.space.mrt.geometry.data.Polygon;
import ca.gc.space.mrt.geometry.data.PolygonSamplingShape;
import ca.gc.space.mrt.geometry.data.SamplingShape;

import ca.gc.space.mrt.geometry.data3d.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage
 * @generated
 */
public class Data3dAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Data3dPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data3dAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Data3dPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Data3dSwitch<Adapter> modelSwitch =
		new Data3dSwitch<Adapter>() {
			@Override
			public Adapter caseCartesianPolygon(CartesianPolygon object) {
				return createCartesianPolygonAdapter();
			}
			@Override
			public Adapter caseCartesianTriangle(CartesianTriangle object) {
				return createCartesianTriangleAdapter();
			}
			@Override
			public Adapter caseSphericalPolygon(SphericalPolygon object) {
				return createSphericalPolygonAdapter();
			}
			@Override
			public Adapter caseSphericalTriangle(SphericalTriangle object) {
				return createSphericalTriangleAdapter();
			}
			@Override
			public Adapter caseCartesianPositionCoordinates(CartesianPositionCoordinates object) {
				return createCartesianPositionCoordinatesAdapter();
			}
			@Override
			public Adapter caseRGBCartesianPositionCoordinates(RGBCartesianPositionCoordinates object) {
				return createRGBCartesianPositionCoordinatesAdapter();
			}
			@Override
			public Adapter caseCartesianOrientationCoordinates(CartesianOrientationCoordinates object) {
				return createCartesianOrientationCoordinatesAdapter();
			}
			@Override
			public Adapter caseCartesianCoordinatesSet(CartesianCoordinatesSet object) {
				return createCartesianCoordinatesSetAdapter();
			}
			@Override
			public Adapter caseCartesianCoordinatesSetExtent(CartesianCoordinatesSetExtent object) {
				return createCartesianCoordinatesSetExtentAdapter();
			}
			@Override
			public Adapter caseDigitalElevationMap(DigitalElevationMap object) {
				return createDigitalElevationMapAdapter();
			}
			@Override
			public Adapter caseCartesianCoordinatesMesh(CartesianCoordinatesMesh object) {
				return createCartesianCoordinatesMeshAdapter();
			}
			@Override
			public Adapter caseCartesianTriangularMesh(CartesianTriangularMesh object) {
				return createCartesianTriangularMeshAdapter();
			}
			@Override
			public Adapter caseSphericalCoordinates(SphericalCoordinates object) {
				return createSphericalCoordinatesAdapter();
			}
			@Override
			public Adapter caseSphericalCoordinatesSet(SphericalCoordinatesSet object) {
				return createSphericalCoordinatesSetAdapter();
			}
			@Override
			public Adapter caseSphericalCoordinatesMesh(SphericalCoordinatesMesh object) {
				return createSphericalCoordinatesMeshAdapter();
			}
			@Override
			public Adapter caseSphericalTriangularMesh(SphericalTriangularMesh object) {
				return createSphericalTriangularMeshAdapter();
			}
			@Override
			public Adapter casePose(Pose object) {
				return createPoseAdapter();
			}
			@Override
			public <PolygonType extends CartesianPolygon> Adapter caseSphereSamplingShape(SphereSamplingShape<PolygonType> object) {
				return createSphereSamplingShapeAdapter();
			}
			@Override
			public <PolygonType extends CartesianPolygon> Adapter caseCubeSamplingShape(CubeSamplingShape<PolygonType> object) {
				return createCubeSamplingShapeAdapter();
			}
			@Override
			public Adapter caseCartesianCoordinatesSetShapeSampler(CartesianCoordinatesSetShapeSampler object) {
				return createCartesianCoordinatesSetShapeSamplerAdapter();
			}
			@Override
			public Adapter caseCartesianCoordinatesMeshSampler(CartesianCoordinatesMeshSampler object) {
				return createCartesianCoordinatesMeshSamplerAdapter();
			}
			@Override
			public Adapter caseCartesianCoordinatesMeshPolygonSampler(CartesianCoordinatesMeshPolygonSampler object) {
				return createCartesianCoordinatesMeshPolygonSamplerAdapter();
			}
			@Override
			public Adapter caseCartesianTriangularMeshSampler(CartesianTriangularMeshSampler object) {
				return createCartesianTriangularMeshSamplerAdapter();
			}
			@Override
			public Adapter caseCartesianTriangularMeshPolygonSampler(CartesianTriangularMeshPolygonSampler object) {
				return createCartesianTriangularMeshPolygonSamplerAdapter();
			}
			@Override
			public Adapter caseCartesianPositionCoordinatesMesher(CartesianPositionCoordinatesMesher object) {
				return createCartesianPositionCoordinatesMesherAdapter();
			}
			@Override
			public Adapter caseNormalPointCloud(NormalPointCloud object) {
				return createNormalPointCloudAdapter();
			}
			@Override
			public Adapter casePointLocator(PointLocator object) {
				return createPointLocatorAdapter();
			}
			@Override
			public Adapter caseVecmathPointLocator(VecmathPointLocator object) {
				return createVecmathPointLocatorAdapter();
			}
			@Override
			public Adapter caseVecmathKdTreePointLocator(VecmathKdTreePointLocator object) {
				return createVecmathKdTreePointLocatorAdapter();
			}
			@Override
			public Adapter caseMeshLocalizer(MeshLocalizer object) {
				return createMeshLocalizerAdapter();
			}
			@Override
			public Adapter casePointNormalLocator(PointNormalLocator object) {
				return createPointNormalLocatorAdapter();
			}
			@Override
			public Adapter caseDelaunayMesher(DelaunayMesher object) {
				return createDelaunayMesherAdapter();
			}
			@Override
			public Adapter caseDigitalElevationMapMesher(DigitalElevationMapMesher object) {
				return createDigitalElevationMapMesherAdapter();
			}
			@Override
			public Adapter caseDigitalElevationMapSampler(DigitalElevationMapSampler object) {
				return createDigitalElevationMapSamplerAdapter();
			}
			@Override
			public Adapter caseTriangularMeshNormalsCalculator(TriangularMeshNormalsCalculator object) {
				return createTriangularMeshNormalsCalculatorAdapter();
			}
			@Override
			public Adapter caseTriangularMeshToNormalPointCloud(TriangularMeshToNormalPointCloud object) {
				return createTriangularMeshToNormalPointCloudAdapter();
			}
			@Override
			public Adapter casePointsRangeGager(PointsRangeGager object) {
				return createPointsRangeGagerAdapter();
			}
			@Override
			public Adapter caseUniquePointsFilter(UniquePointsFilter object) {
				return createUniquePointsFilterAdapter();
			}
			@Override
			public Adapter caseTriangleEdgeLengthTriangularMeshFilter(TriangleEdgeLengthTriangularMeshFilter object) {
				return createTriangleEdgeLengthTriangularMeshFilterAdapter();
			}
			@Override
			public Adapter caseOutlierFilter(OutlierFilter object) {
				return createOutlierFilterAdapter();
			}
			@Override
			public Adapter caseRasterPointCloud(RasterPointCloud object) {
				return createRasterPointCloudAdapter();
			}
			@Override
			public Adapter caseRasterPointCloudToCartesianCoordinatesSet(RasterPointCloudToCartesianCoordinatesSet object) {
				return createRasterPointCloudToCartesianCoordinatesSetAdapter();
			}
			@Override
			public Adapter caseMeshSmoother(MeshSmoother object) {
				return createMeshSmootherAdapter();
			}
			@Override
			public Adapter caseVoxelBased3DPointCloudResampler(VoxelBased3DPointCloudResampler object) {
				return createVoxelBased3DPointCloudResamplerAdapter();
			}
			@Override
			public Adapter caseRigidBodyPoseTracker(RigidBodyPoseTracker object) {
				return createRigidBodyPoseTrackerAdapter();
			}
			@Override
			public Adapter casePositionMarker(PositionMarker object) {
				return createPositionMarkerAdapter();
			}
			@Override
			public Adapter caseData3dFacade(Data3dFacade object) {
				return createData3dFacadeAdapter();
			}
			@Override
			public Adapter caseData3DIO(Data3DIO object) {
				return createData3DIOAdapter();
			}
			@Override
			public Adapter caseData3DUtils(Data3DUtils object) {
				return createData3DUtilsAdapter();
			}
			@Override
			public <T extends Coordinates> Adapter casePolygon(Polygon<T> object) {
				return createPolygonAdapter();
			}
			@Override
			public Adapter caseCoordinates(Coordinates object) {
				return createCoordinatesAdapter();
			}
			@Override
			public <T extends Coordinates> Adapter caseCoordinatesSet(CoordinatesSet<T> object) {
				return createCoordinatesSetAdapter();
			}
			@Override
			public <CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> Adapter caseMesh(Mesh<CoordinatesType, PolygonType> object) {
				return createMeshAdapter();
			}
			@Override
			public Adapter caseSamplingShape(SamplingShape object) {
				return createSamplingShapeAdapter();
			}
			@Override
			public <T extends Coordinates> Adapter caseCoordinatesSamplingShape(CoordinatesSamplingShape<T> object) {
				return createCoordinatesSamplingShapeAdapter();
			}
			@Override
			public <CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> Adapter casePolygonSamplingShape(PolygonSamplingShape<CoordinatesType, PolygonType> object) {
				return createPolygonSamplingShapeAdapter();
			}
			@Override
			public Adapter caseMonitorable(Monitorable object) {
				return createMonitorableAdapter();
			}
			@Override
			public <I, O> Adapter caseProcessor(Processor<I, O> object) {
				return createProcessorAdapter();
			}
			@Override
			public <T extends Coordinates> Adapter caseCoordinatesSetShapesSampler(CoordinatesSetShapesSampler<T> object) {
				return createCoordinatesSetShapesSamplerAdapter();
			}
			@Override
			public <CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> Adapter caseMeshCoordinatesShapesSampler(MeshCoordinatesShapesSampler<CoordinatesType, PolygonType> object) {
				return createMeshCoordinatesShapesSamplerAdapter();
			}
			@Override
			public <CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> Adapter caseMeshPolygonShapesSampler(MeshPolygonShapesSampler<CoordinatesType, PolygonType> object) {
				return createMeshPolygonShapesSamplerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.CartesianPolygon <em>Cartesian Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.CartesianPolygon
	 * @generated
	 */
	public Adapter createCartesianPolygonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.CartesianTriangle <em>Cartesian Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.CartesianTriangle
	 * @generated
	 */
	public Adapter createCartesianTriangleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.SphericalPolygon <em>Spherical Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.SphericalPolygon
	 * @generated
	 */
	public Adapter createSphericalPolygonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.SphericalTriangle <em>Spherical Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.SphericalTriangle
	 * @generated
	 */
	public Adapter createSphericalTriangleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates <em>Cartesian Position Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates
	 * @generated
	 */
	public Adapter createCartesianPositionCoordinatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.RGBCartesianPositionCoordinates <em>RGB Cartesian Position Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.RGBCartesianPositionCoordinates
	 * @generated
	 */
	public Adapter createRGBCartesianPositionCoordinatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.CartesianOrientationCoordinates <em>Cartesian Orientation Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.CartesianOrientationCoordinates
	 * @generated
	 */
	public Adapter createCartesianOrientationCoordinatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet <em>Cartesian Coordinates Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet
	 * @generated
	 */
	public Adapter createCartesianCoordinatesSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSetExtent <em>Cartesian Coordinates Set Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSetExtent
	 * @generated
	 */
	public Adapter createCartesianCoordinatesSetExtentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.DigitalElevationMap <em>Digital Elevation Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.DigitalElevationMap
	 * @generated
	 */
	public Adapter createDigitalElevationMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesMesh <em>Cartesian Coordinates Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesMesh
	 * @generated
	 */
	public Adapter createCartesianCoordinatesMeshAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.CartesianTriangularMesh <em>Cartesian Triangular Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.CartesianTriangularMesh
	 * @generated
	 */
	public Adapter createCartesianTriangularMeshAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.SphericalCoordinates <em>Spherical Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.SphericalCoordinates
	 * @generated
	 */
	public Adapter createSphericalCoordinatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.SphericalCoordinatesSet <em>Spherical Coordinates Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.SphericalCoordinatesSet
	 * @generated
	 */
	public Adapter createSphericalCoordinatesSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.SphericalCoordinatesMesh <em>Spherical Coordinates Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.SphericalCoordinatesMesh
	 * @generated
	 */
	public Adapter createSphericalCoordinatesMeshAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.SphericalTriangularMesh <em>Spherical Triangular Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.SphericalTriangularMesh
	 * @generated
	 */
	public Adapter createSphericalTriangularMeshAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.Pose <em>Pose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.Pose
	 * @generated
	 */
	public Adapter createPoseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.SphereSamplingShape <em>Sphere Sampling Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.SphereSamplingShape
	 * @generated
	 */
	public Adapter createSphereSamplingShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.CubeSamplingShape <em>Cube Sampling Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.CubeSamplingShape
	 * @generated
	 */
	public Adapter createCubeSamplingShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSetShapeSampler <em>Cartesian Coordinates Set Shape Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSetShapeSampler
	 * @generated
	 */
	public Adapter createCartesianCoordinatesSetShapeSamplerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesMeshSampler <em>Cartesian Coordinates Mesh Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesMeshSampler
	 * @generated
	 */
	public Adapter createCartesianCoordinatesMeshSamplerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesMeshPolygonSampler <em>Cartesian Coordinates Mesh Polygon Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesMeshPolygonSampler
	 * @generated
	 */
	public Adapter createCartesianCoordinatesMeshPolygonSamplerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.CartesianTriangularMeshSampler <em>Cartesian Triangular Mesh Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.CartesianTriangularMeshSampler
	 * @generated
	 */
	public Adapter createCartesianTriangularMeshSamplerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.CartesianTriangularMeshPolygonSampler <em>Cartesian Triangular Mesh Polygon Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.CartesianTriangularMeshPolygonSampler
	 * @generated
	 */
	public Adapter createCartesianTriangularMeshPolygonSamplerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinatesMesher <em>Cartesian Position Coordinates Mesher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinatesMesher
	 * @generated
	 */
	public Adapter createCartesianPositionCoordinatesMesherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.NormalPointCloud <em>Normal Point Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.NormalPointCloud
	 * @generated
	 */
	public Adapter createNormalPointCloudAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.PointLocator <em>Point Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.PointLocator
	 * @generated
	 */
	public Adapter createPointLocatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.VecmathPointLocator <em>Vecmath Point Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.VecmathPointLocator
	 * @generated
	 */
	public Adapter createVecmathPointLocatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.VecmathKdTreePointLocator <em>Vecmath Kd Tree Point Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.VecmathKdTreePointLocator
	 * @generated
	 */
	public Adapter createVecmathKdTreePointLocatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.MeshLocalizer <em>Mesh Localizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.MeshLocalizer
	 * @generated
	 */
	public Adapter createMeshLocalizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.PointNormalLocator <em>Point Normal Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.PointNormalLocator
	 * @generated
	 */
	public Adapter createPointNormalLocatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.DelaunayMesher <em>Delaunay Mesher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.DelaunayMesher
	 * @generated
	 */
	public Adapter createDelaunayMesherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.DigitalElevationMapMesher <em>Digital Elevation Map Mesher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.DigitalElevationMapMesher
	 * @generated
	 */
	public Adapter createDigitalElevationMapMesherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.DigitalElevationMapSampler <em>Digital Elevation Map Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.DigitalElevationMapSampler
	 * @generated
	 */
	public Adapter createDigitalElevationMapSamplerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.TriangularMeshNormalsCalculator <em>Triangular Mesh Normals Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.TriangularMeshNormalsCalculator
	 * @generated
	 */
	public Adapter createTriangularMeshNormalsCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.TriangularMeshToNormalPointCloud <em>Triangular Mesh To Normal Point Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.TriangularMeshToNormalPointCloud
	 * @generated
	 */
	public Adapter createTriangularMeshToNormalPointCloudAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.PointsRangeGager <em>Points Range Gager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.PointsRangeGager
	 * @generated
	 */
	public Adapter createPointsRangeGagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.UniquePointsFilter <em>Unique Points Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.UniquePointsFilter
	 * @generated
	 */
	public Adapter createUniquePointsFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter <em>Triangle Edge Length Triangular Mesh Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter
	 * @generated
	 */
	public Adapter createTriangleEdgeLengthTriangularMeshFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.OutlierFilter <em>Outlier Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.OutlierFilter
	 * @generated
	 */
	public Adapter createOutlierFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.RasterPointCloud <em>Raster Point Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.RasterPointCloud
	 * @generated
	 */
	public Adapter createRasterPointCloudAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.RasterPointCloudToCartesianCoordinatesSet <em>Raster Point Cloud To Cartesian Coordinates Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.RasterPointCloudToCartesianCoordinatesSet
	 * @generated
	 */
	public Adapter createRasterPointCloudToCartesianCoordinatesSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.MeshSmoother <em>Mesh Smoother</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.MeshSmoother
	 * @generated
	 */
	public Adapter createMeshSmootherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.VoxelBased3DPointCloudResampler <em>Voxel Based3 DPoint Cloud Resampler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.VoxelBased3DPointCloudResampler
	 * @generated
	 */
	public Adapter createVoxelBased3DPointCloudResamplerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.RigidBodyPoseTracker <em>Rigid Body Pose Tracker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.RigidBodyPoseTracker
	 * @generated
	 */
	public Adapter createRigidBodyPoseTrackerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.PositionMarker <em>Position Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.PositionMarker
	 * @generated
	 */
	public Adapter createPositionMarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.Data3dFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dFacade
	 * @generated
	 */
	public Adapter createData3dFacadeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.Data3DIO <em>Data3 DIO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.Data3DIO
	 * @generated
	 */
	public Adapter createData3DIOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data3d.Data3DUtils <em>Data3 DUtils</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data3d.Data3DUtils
	 * @generated
	 */
	public Adapter createData3DUtilsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data.Polygon
	 * @generated
	 */
	public Adapter createPolygonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data.Coordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data.Coordinates
	 * @generated
	 */
	public Adapter createCoordinatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data.CoordinatesSet <em>Coordinates Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data.CoordinatesSet
	 * @generated
	 */
	public Adapter createCoordinatesSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data.Mesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data.Mesh
	 * @generated
	 */
	public Adapter createMeshAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data.SamplingShape <em>Sampling Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data.SamplingShape
	 * @generated
	 */
	public Adapter createSamplingShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data.CoordinatesSamplingShape <em>Coordinates Sampling Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data.CoordinatesSamplingShape
	 * @generated
	 */
	public Adapter createCoordinatesSamplingShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data.PolygonSamplingShape <em>Polygon Sampling Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data.PolygonSamplingShape
	 * @generated
	 */
	public Adapter createPolygonSamplingShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.common.processors.Monitorable <em>Monitorable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.common.processors.Monitorable
	 * @generated
	 */
	public Adapter createMonitorableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.common.processors.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.common.processors.Processor
	 * @generated
	 */
	public Adapter createProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data.CoordinatesSetShapesSampler <em>Coordinates Set Shapes Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data.CoordinatesSetShapesSampler
	 * @generated
	 */
	public Adapter createCoordinatesSetShapesSamplerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data.MeshCoordinatesShapesSampler <em>Mesh Coordinates Shapes Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data.MeshCoordinatesShapesSampler
	 * @generated
	 */
	public Adapter createMeshCoordinatesShapesSamplerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.geometry.data.MeshPolygonShapesSampler <em>Mesh Polygon Shapes Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.geometry.data.MeshPolygonShapesSampler
	 * @generated
	 */
	public Adapter createMeshPolygonShapesSamplerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Data3dAdapterFactory
