/**
 * Canadian Space Agency 2008.
 *
 * $Id: Data3dPackageImpl.java,v 1.6.4.4 2015/08/13 19:12:08 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.vecmath.GVector;
import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.gc.space.mrt.common.processors.ProcessorsPackage;
import ca.gc.space.mrt.geometry.data.DataPackage;
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
import ca.gc.space.mrt.geometry.data3d.MeshLocaliser;
import ca.gc.space.mrt.geometry.data3d.MeshSmoother;
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
import ca.gc.space.mrt.geometry.data3d.VecmathPointLocator;
import ca.gc.space.mrt.geometry.data3d.VoxelBased3DPointCloudResampler;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class Data3dPackageImpl extends EPackageImpl implements Data3dPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2008.";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianPolygonEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianTriangleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sphericalPolygonEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sphericalTriangleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianPositionCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rgbCartesianPositionCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianOrientationCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianCoordinatesSetEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianCoordinatesMeshEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianTriangularMeshEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sphericalCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sphericalCoordinatesSetEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spericalCoordinatesMeshEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sphericalTriangularMeshEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poseEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sphereSamplingShapeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianCoordinatesSetShapeSamplerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianCoordinatesMeshSamplerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianCoordinatesMeshPolygonSamplerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianTriangularMeshSamplerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianTriangularMeshPolygonSamplerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianPositionCoordinatesMesherEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass data3dFacadeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass data3DIOEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointLocatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass data3DUtilsEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalPointCloudEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vecmathPointLocatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vecmathKdTreePointLocatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meshLocaliserEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointNormalLocatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delaunayMesherEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalElevationMapMesherEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalElevationMapSamplerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triangularMeshNormalsCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triangularMesh2NormalPointCloudEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointsRangeGagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniquePointsFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triangleEdgeLenghtTriangularMeshFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outlierFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rasterPointCloudEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rasterPointCloudToCartesianCoordinatesSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meshSmootherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voxelBased3DPointCloudResamplerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rigidBodyPoseTrackerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionMarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cubeSamplingShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianCoordinatesSetExtentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalElevationMapEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cartesianAxisEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cartesianPlaneEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum meshinG_PLANEEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType intArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gVectorEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ioExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType outputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType matrix4dEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vector3dEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType point3dEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleArrayOfArrayEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Data3dPackageImpl() {
		super(eNS_URI, Data3dFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Data3dPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Data3dPackage init() {
		if (isInited) return (Data3dPackage)EPackage.Registry.INSTANCE.getEPackage(Data3dPackage.eNS_URI);

		// Obtain or create and register package
		Data3dPackageImpl theData3dPackage = (Data3dPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Data3dPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Data3dPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		DataPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theData3dPackage.createPackageContents();

		// Initialize created meta-data
		theData3dPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theData3dPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Data3dPackage.eNS_URI, theData3dPackage);
		return theData3dPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianPolygon() {
		return cartesianPolygonEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianPolygon_Surface() {
		return (EAttribute)cartesianPolygonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianPolygon_Normal() {
		return (EAttribute)cartesianPolygonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartesianPolygon_Centroid() {
		return (EReference)cartesianPolygonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianTriangle() {
		return cartesianTriangleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSphericalPolygon() {
		return sphericalPolygonEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSphericalTriangle() {
		return sphericalTriangleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianPositionCoordinates() {
		return cartesianPositionCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianPositionCoordinates_X() {
		return (EAttribute)cartesianPositionCoordinatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianPositionCoordinates_Y() {
		return (EAttribute)cartesianPositionCoordinatesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianPositionCoordinates_Z() {
		return (EAttribute)cartesianPositionCoordinatesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCartesianPositionCoordinates__AsPoint3d() {
		return cartesianPositionCoordinatesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRGBCartesianPositionCoordinates()
	{
		return rgbCartesianPositionCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBCartesianPositionCoordinates_Red()
	{
		return (EAttribute)rgbCartesianPositionCoordinatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBCartesianPositionCoordinates_Green()
	{
		return (EAttribute)rgbCartesianPositionCoordinatesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBCartesianPositionCoordinates_Blue()
	{
		return (EAttribute)rgbCartesianPositionCoordinatesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianOrientationCoordinates() {
		return cartesianOrientationCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianOrientationCoordinates_XRotation() {
		return (EAttribute)cartesianOrientationCoordinatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianOrientationCoordinates_YRotation() {
		return (EAttribute)cartesianOrientationCoordinatesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianOrientationCoordinates_ZRotation() {
		return (EAttribute)cartesianOrientationCoordinatesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianCoordinatesSet() {
		return cartesianCoordinatesSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCartesianCoordinatesSet__GetExtent() {
		return cartesianCoordinatesSetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianCoordinatesMesh() {
		return cartesianCoordinatesMeshEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianTriangularMesh() {
		return cartesianTriangularMeshEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSphericalCoordinates() {
		return sphericalCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphericalCoordinates_Phi() {
		return (EAttribute)sphericalCoordinatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphericalCoordinates_Theta() {
		return (EAttribute)sphericalCoordinatesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphericalCoordinates_R() {
		return (EAttribute)sphericalCoordinatesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSphericalCoordinatesSet() {
		return sphericalCoordinatesSetEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpericalCoordinatesMesh() {
		return spericalCoordinatesMeshEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSphericalTriangularMesh() {
		return sphericalTriangularMeshEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPose() {
		return poseEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSphereSamplingShape() {
		return sphereSamplingShapeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphereSamplingShape_Radius() {
		return (EAttribute)sphereSamplingShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSphereSamplingShape_Center() {
		return (EReference)sphereSamplingShapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphereSamplingShape_IncludeJustTouching() {
		return (EAttribute)sphereSamplingShapeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianCoordinatesSetShapeSampler() {
		return cartesianCoordinatesSetShapeSamplerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianCoordinatesMeshSampler() {
		return cartesianCoordinatesMeshSamplerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianCoordinatesMeshPolygonSampler() {
		return cartesianCoordinatesMeshPolygonSamplerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianTriangularMeshSampler() {
		return cartesianTriangularMeshSamplerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianTriangularMeshPolygonSampler() {
		return cartesianTriangularMeshPolygonSamplerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianPositionCoordinatesMesher() {
		return cartesianPositionCoordinatesMesherEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData3dFacade() {
		return data3dFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__CreateCartesianPositionCoordinates__double_double_double() {
		return data3dFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__CreateCartesianOrientationCoordinates__double_double_double() {
		return data3dFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__CreateSphericalCoordinates__double_double_double() {
		return data3dFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__CreatePose__double_double_double_double_double_double() {
		return data3dFacadeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__CreatePose__Pose() {
		return data3dFacadeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__CreatePose__CartesianPositionCoordinates_CartesianOrientationCoordinates() {
		return data3dFacadeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__CreateCartesianPolygon__CartesianPositionCoordinates_CartesianPositionCoordinates_CartesianPositionCoordinates() {
		return data3dFacadeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__CreateCartesianPositionCoordinates__CartesianPositionCoordinates() {
		return data3dFacadeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__CreateCartesianOrientationCoordinates__CartesianOrientationCoordinates() {
		return data3dFacadeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__CreateCartesianCoordinatesMesh__CartesianCoordinatesMesh() {
		return data3dFacadeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__CreateCartesianTriangle__CartesianPositionCoordinates_CartesianPositionCoordinates_CartesianPositionCoordinates() {
		return data3dFacadeEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__CreateCartesianTriangle__CartesianPolygon() {
		return data3dFacadeEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__ApplyTransform__CartesianCoordinatesSet_Matrix4d() {
		return data3dFacadeEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__CreateCartesianCoordinatesMesh__List() {
		return data3dFacadeEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__CreateCartesianTriangularMesh__List() {
		return data3dFacadeEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__ApplyTransform__List_Matrix4d() {
		return data3dFacadeEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__ApplyTransform__CartesianTriangularMesh_Matrix4d() {
		return data3dFacadeEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__ApplyTransformInt__CartesianTriangularMesh_Matrix4d() {
		return data3dFacadeEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__ApplyTransform__NormalPointCloud_Matrix4d() {
		return data3dFacadeEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__CreateCartesianCoordinatesMesh__CartesianTriangularMesh() {
		return data3dFacadeEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__CreateCartesianTriangularMesh__CartesianTriangularMesh() {
		return data3dFacadeEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__UpdateCartesianCoordinatesSet__CartesianCoordinatesSet_double() {
		return data3dFacadeEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__CreatePointNormalLocator__NormalPointCloud() {
		return data3dFacadeEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__CreateDigitalElevationMap__CartesianCoordinatesSet() {
		return data3dFacadeEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3dFacade__ConcatenateTriangularMeshes__EList() {
		return data3dFacadeEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData3DIO() {
		return data3DIOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__SaveTriangularMesh__CartesianTriangularMesh_String() {
		return data3DIOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__LoadTriangularMesh__String() {
		return data3DIOEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__SaveTriangularMesh__CartesianTriangularMesh_OutputStream() {
		return data3DIOEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__LoadTriangularMesh__InputStream() {
		return data3DIOEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__LoadTriangularMeshFromASCIIAsNormalPointCloud__String() {
		return data3DIOEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__LoadTriangularMeshFromASCII__String() {
		return data3DIOEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__SaveTriangularMeshAsASCII__CartesianTriangularMesh_String() {
		return data3DIOEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__LoadXYZ__String() {
		return data3DIOEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__LoadTriangularMeshFromTriXYZ__String_String() {
		return data3DIOEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__SaveCoordinatesSetToXYZ__CartesianCoordinatesSet_String() {
		return data3DIOEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__SaveCoordinatesSetToXYZ__CartesianCoordinatesSet_OutputStream() {
		return data3DIOEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__SaveCoordinatesSetToCSV__CartesianCoordinatesSet_OutputStream() {
		return data3DIOEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__SaveCoordinatesSetToCSV__CartesianCoordinatesSet_String() {
		return data3DIOEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointLocator() {
		return pointLocatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointLocator_Points() {
		return (EAttribute)pointLocatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPointLocator__FindClosestPoint__CartesianPositionCoordinates() {
		return pointLocatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPointLocator__FindPointsWithinRadius__double_CartesianPositionCoordinates() {
		return pointLocatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData3DUtils() {
		return data3DUtilsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DUtils__ComputeNormals__CartesianTriangularMesh() {
		return data3DUtilsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DUtils__ComputeCentroid__CartesianCoordinatesSet() {
		return data3DUtilsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DUtils__ComputeMinMaxValues__Point3d_Point3d_CartesianCoordinatesSet() {
		return data3DUtilsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DUtils__ComputeCurvatureChange__PointLocator_int_double() {
		return data3DUtilsEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DUtils__ComputeCurvatureChange__VecmathPointLocator_int_double() {
		return data3DUtilsEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DUtils__Extrude__List_CartesianAxis_double_boolean() {
		return data3DUtilsEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalPointCloud() {
		return normalPointCloudEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalPointCloud_Points() {
		return (EAttribute)normalPointCloudEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalPointCloud_Normals() {
		return (EAttribute)normalPointCloudEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVecmathPointLocator() {
		return vecmathPointLocatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVecmathPointLocator_Points() {
		return (EAttribute)vecmathPointLocatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVecmathPointLocator__FindClosestPoint__Point3d() {
		return vecmathPointLocatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVecmathPointLocator__FindPointsWithinRadius__double_Point3d() {
		return vecmathPointLocatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVecmathPointLocator__FindClosestPointId__Point3d() {
		return vecmathPointLocatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVecmathPointLocator__FindPointIdsWithinRadius__double_Point3d() {
		return vecmathPointLocatorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVecmathPointLocator__FindClosestNPoints__Point3d_int() {
		return vecmathPointLocatorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVecmathPointLocator__FindClosestNPointIds__Point3d_int() {
		return vecmathPointLocatorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVecmathKdTreePointLocator() {
		return vecmathKdTreePointLocatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeshLocaliser() {
		return meshLocaliserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMeshLocaliser__Localise__CartesianTriangularMesh_Matrix4d_CartesianTriangularMesh_Matrix4d() {
		return meshLocaliserEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointNormalLocator() {
		return pointNormalLocatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointNormalLocator_DataSet() {
		return (EReference)pointNormalLocatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPointNormalLocator__FindClosestPoint__Point3d_Vector3d() {
		return pointNormalLocatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPointNormalLocator__FindPointsWithinRadius__double_Point3d_Vector3d() {
		return pointNormalLocatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPointNormalLocator__FindClosestNPoints__int_Point3d_Vector3d() {
		return pointNormalLocatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPointNormalLocator__FindClosestPointId__Point3d_Vector3d() {
		return pointNormalLocatorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPointNormalLocator__FindPointIdsWithinRadius__double_Point3d_Vector3d() {
		return pointNormalLocatorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPointNormalLocator__FindClosestNPointIds__int_Point3d_Vector3d() {
		return pointNormalLocatorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelaunayMesher() {
		return delaunayMesherEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelaunayMesher_Tolerance() {
		return (EAttribute)delaunayMesherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelaunayMesher_Alpha() {
		return (EAttribute)delaunayMesherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelaunayMesher_Offset() {
		return (EAttribute)delaunayMesherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelaunayMesher_BoundingTriangulation() {
		return (EAttribute)delaunayMesherEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelaunayMesher_MeshingPlane() {
		return (EAttribute)delaunayMesherEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigitalElevationMapMesher() {
		return digitalElevationMapMesherEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigitalElevationMapSampler() {
		return digitalElevationMapSamplerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigitalElevationMapSampler_TargetResolution() {
		return (EAttribute)digitalElevationMapSamplerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriangularMeshNormalsCalculator() {
		return triangularMeshNormalsCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriangularMesh2NormalPointCloud() {
		return triangularMesh2NormalPointCloudEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointsRangeGager() {
		return pointsRangeGagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointsRangeGager_MinX() {
		return (EAttribute)pointsRangeGagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointsRangeGager_MaxX() {
		return (EAttribute)pointsRangeGagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointsRangeGager_MinY() {
		return (EAttribute)pointsRangeGagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointsRangeGager_MaxY() {
		return (EAttribute)pointsRangeGagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointsRangeGager_MinZ() {
		return (EAttribute)pointsRangeGagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointsRangeGager_MaxZ() {
		return (EAttribute)pointsRangeGagerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniquePointsFilter() {
		return uniquePointsFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriangleEdgeLenghtTriangularMeshFilter() {
		return triangleEdgeLenghtTriangularMeshFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriangleEdgeLenghtTriangularMeshFilter_MinimumRange() {
		return (EAttribute)triangleEdgeLenghtTriangularMeshFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriangleEdgeLenghtTriangularMeshFilter_MaximumRange() {
		return (EAttribute)triangleEdgeLenghtTriangularMeshFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriangleEdgeLenghtTriangularMeshFilter_MaximumEdgeLenght() {
		return (EAttribute)triangleEdgeLenghtTriangularMeshFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTriangleEdgeLenghtTriangularMeshFilter__Filter__CartesianTriangularMesh() {
		return triangleEdgeLenghtTriangularMeshFilterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutlierFilter() {
		return outlierFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlierFilter_MaxDistance() {
		return (EAttribute)outlierFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRasterPointCloud() {
		return rasterPointCloudEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRasterPointCloud_Rows() {
		return (EAttribute)rasterPointCloudEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRasterPointCloud_Columns() {
		return (EAttribute)rasterPointCloudEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRasterPointCloud__GetPoint__int_int() {
		return rasterPointCloudEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRasterPointCloud__SetPoint__int_int_CartesianPositionCoordinates() {
		return rasterPointCloudEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRasterPointCloudToCartesianCoordinatesSet() {
		return rasterPointCloudToCartesianCoordinatesSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeshSmoother() {
		return meshSmootherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeshSmoother_NumberOfIterations() {
		return (EAttribute)meshSmootherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoxelBased3DPointCloudResampler() {
		return voxelBased3DPointCloudResamplerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoxelBased3DPointCloudResampler_ResolutionX() {
		return (EAttribute)voxelBased3DPointCloudResamplerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoxelBased3DPointCloudResampler_ResolutionY() {
		return (EAttribute)voxelBased3DPointCloudResamplerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoxelBased3DPointCloudResampler_ResolutionZ() {
		return (EAttribute)voxelBased3DPointCloudResamplerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoxelBased3DPointCloudResampler_MinimumNumberOfPointPerVoxel() {
		return (EAttribute)voxelBased3DPointCloudResamplerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoxelBased3DPointCloudResampler_TileResolution() {
		return (EAttribute)voxelBased3DPointCloudResamplerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRigidBodyPoseTracker() {
		return rigidBodyPoseTrackerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRigidBodyPoseTracker_PositionMarkersAtOrigin() {
		return (EReference)rigidBodyPoseTrackerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRigidBodyPoseTracker__ComputeTransformation__EList() {
		return rigidBodyPoseTrackerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRigidBodyPoseTracker__AddPositionMarkers__List() {
		return rigidBodyPoseTrackerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRigidBodyPoseTracker__RemovePositionMarkers__List() {
		return rigidBodyPoseTrackerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionMarker() {
		return positionMarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionMarker_Identifier() {
		return (EAttribute)positionMarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCubeSamplingShape() {
		return cubeSamplingShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCubeSamplingShape_IncludeJustTouching() {
		return (EAttribute)cubeSamplingShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCubeSamplingShape_Corner1() {
		return (EReference)cubeSamplingShapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCubeSamplingShape_Corner2() {
		return (EReference)cubeSamplingShapeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianCoordinatesSetExtent() {
		return cartesianCoordinatesSetExtentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCoordinatesSetExtent_XMin() {
		return (EAttribute)cartesianCoordinatesSetExtentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCoordinatesSetExtent_XMax() {
		return (EAttribute)cartesianCoordinatesSetExtentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCoordinatesSetExtent_YMin() {
		return (EAttribute)cartesianCoordinatesSetExtentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCoordinatesSetExtent_YMax() {
		return (EAttribute)cartesianCoordinatesSetExtentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCoordinatesSetExtent_ZMin() {
		return (EAttribute)cartesianCoordinatesSetExtentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCoordinatesSetExtent_ZMax() {
		return (EAttribute)cartesianCoordinatesSetExtentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCoordinatesSetExtent_XDimension() {
		return (EAttribute)cartesianCoordinatesSetExtentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCoordinatesSetExtent_YDimension() {
		return (EAttribute)cartesianCoordinatesSetExtentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCoordinatesSetExtent_ZDimension() {
		return (EAttribute)cartesianCoordinatesSetExtentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigitalElevationMap() {
		return digitalElevationMapEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigitalElevationMap_XDimension() {
		return (EAttribute)digitalElevationMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigitalElevationMap_YDimension() {
		return (EAttribute)digitalElevationMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCartesianAxis() {
		return cartesianAxisEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCartesianPlane() {
		return cartesianPlaneEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMESHING_PLANE() {
		return meshinG_PLANEEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInputStream() {
		return inputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntArray() {
		return intArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getList() {
		return listEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGVector() {
		return gVectorEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIOException() {
		return ioExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOutputStream() {
		return outputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMatrix4d() {
		return matrix4dEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVector3d() {
		return vector3dEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPoint3d() {
		return point3dEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDoubleArrayOfArray() {
		return doubleArrayOfArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Data3dFactory getData3dFactory() {
		return (Data3dFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cartesianPolygonEClass = createEClass(CARTESIAN_POLYGON);
		createEAttribute(cartesianPolygonEClass, CARTESIAN_POLYGON__SURFACE);
		createEAttribute(cartesianPolygonEClass, CARTESIAN_POLYGON__NORMAL);
		createEReference(cartesianPolygonEClass, CARTESIAN_POLYGON__CENTROID);

		cartesianTriangleEClass = createEClass(CARTESIAN_TRIANGLE);

		sphericalPolygonEClass = createEClass(SPHERICAL_POLYGON);

		sphericalTriangleEClass = createEClass(SPHERICAL_TRIANGLE);

		cartesianPositionCoordinatesEClass = createEClass(CARTESIAN_POSITION_COORDINATES);
		createEAttribute(cartesianPositionCoordinatesEClass, CARTESIAN_POSITION_COORDINATES__X);
		createEAttribute(cartesianPositionCoordinatesEClass, CARTESIAN_POSITION_COORDINATES__Y);
		createEAttribute(cartesianPositionCoordinatesEClass, CARTESIAN_POSITION_COORDINATES__Z);
		createEOperation(cartesianPositionCoordinatesEClass, CARTESIAN_POSITION_COORDINATES___AS_POINT3D);

		rgbCartesianPositionCoordinatesEClass = createEClass(RGB_CARTESIAN_POSITION_COORDINATES);
		createEAttribute(rgbCartesianPositionCoordinatesEClass, RGB_CARTESIAN_POSITION_COORDINATES__RED);
		createEAttribute(rgbCartesianPositionCoordinatesEClass, RGB_CARTESIAN_POSITION_COORDINATES__GREEN);
		createEAttribute(rgbCartesianPositionCoordinatesEClass, RGB_CARTESIAN_POSITION_COORDINATES__BLUE);

		cartesianOrientationCoordinatesEClass = createEClass(CARTESIAN_ORIENTATION_COORDINATES);
		createEAttribute(cartesianOrientationCoordinatesEClass, CARTESIAN_ORIENTATION_COORDINATES__XROTATION);
		createEAttribute(cartesianOrientationCoordinatesEClass, CARTESIAN_ORIENTATION_COORDINATES__YROTATION);
		createEAttribute(cartesianOrientationCoordinatesEClass, CARTESIAN_ORIENTATION_COORDINATES__ZROTATION);

		cartesianCoordinatesSetEClass = createEClass(CARTESIAN_COORDINATES_SET);
		createEOperation(cartesianCoordinatesSetEClass, CARTESIAN_COORDINATES_SET___GET_EXTENT);

		digitalElevationMapEClass = createEClass(DIGITAL_ELEVATION_MAP);
		createEAttribute(digitalElevationMapEClass, DIGITAL_ELEVATION_MAP__XDIMENSION);
		createEAttribute(digitalElevationMapEClass, DIGITAL_ELEVATION_MAP__YDIMENSION);

		cartesianCoordinatesMeshEClass = createEClass(CARTESIAN_COORDINATES_MESH);

		cartesianTriangularMeshEClass = createEClass(CARTESIAN_TRIANGULAR_MESH);

		sphericalCoordinatesEClass = createEClass(SPHERICAL_COORDINATES);
		createEAttribute(sphericalCoordinatesEClass, SPHERICAL_COORDINATES__PHI);
		createEAttribute(sphericalCoordinatesEClass, SPHERICAL_COORDINATES__THETA);
		createEAttribute(sphericalCoordinatesEClass, SPHERICAL_COORDINATES__R);

		sphericalCoordinatesSetEClass = createEClass(SPHERICAL_COORDINATES_SET);

		spericalCoordinatesMeshEClass = createEClass(SPERICAL_COORDINATES_MESH);

		sphericalTriangularMeshEClass = createEClass(SPHERICAL_TRIANGULAR_MESH);

		poseEClass = createEClass(POSE);

		sphereSamplingShapeEClass = createEClass(SPHERE_SAMPLING_SHAPE);
		createEAttribute(sphereSamplingShapeEClass, SPHERE_SAMPLING_SHAPE__RADIUS);
		createEReference(sphereSamplingShapeEClass, SPHERE_SAMPLING_SHAPE__CENTER);
		createEAttribute(sphereSamplingShapeEClass, SPHERE_SAMPLING_SHAPE__INCLUDE_JUST_TOUCHING);

		cartesianCoordinatesSetShapeSamplerEClass = createEClass(CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER);

		cartesianCoordinatesMeshSamplerEClass = createEClass(CARTESIAN_COORDINATES_MESH_SAMPLER);

		cartesianCoordinatesMeshPolygonSamplerEClass = createEClass(CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER);

		cartesianTriangularMeshSamplerEClass = createEClass(CARTESIAN_TRIANGULAR_MESH_SAMPLER);

		cartesianTriangularMeshPolygonSamplerEClass = createEClass(CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER);

		cartesianPositionCoordinatesMesherEClass = createEClass(CARTESIAN_POSITION_COORDINATES_MESHER);

		data3dFacadeEClass = createEClass(DATA3D_FACADE);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___CREATE_CARTESIAN_POSITION_COORDINATES__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___CREATE_CARTESIAN_ORIENTATION_COORDINATES__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___CREATE_SPHERICAL_COORDINATES__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___CREATE_POSE__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___CREATE_POSE__POSE);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___CREATE_POSE__CARTESIANPOSITIONCOORDINATES_CARTESIANORIENTATIONCOORDINATES);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___CREATE_CARTESIAN_POLYGON__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___CREATE_CARTESIAN_POSITION_COORDINATES__CARTESIANPOSITIONCOORDINATES);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___CREATE_CARTESIAN_ORIENTATION_COORDINATES__CARTESIANORIENTATIONCOORDINATES);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___CREATE_CARTESIAN_COORDINATES_MESH__CARTESIANCOORDINATESMESH);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___CREATE_CARTESIAN_TRIANGLE__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___CREATE_CARTESIAN_TRIANGLE__CARTESIANPOLYGON);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___APPLY_TRANSFORM__CARTESIANCOORDINATESSET_MATRIX4D);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___CREATE_CARTESIAN_COORDINATES_MESH__LIST);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___CREATE_CARTESIAN_TRIANGULAR_MESH__LIST);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___APPLY_TRANSFORM__LIST_MATRIX4D);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___APPLY_TRANSFORM__CARTESIANTRIANGULARMESH_MATRIX4D);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___APPLY_TRANSFORM_INT__CARTESIANTRIANGULARMESH_MATRIX4D);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___APPLY_TRANSFORM__NORMALPOINTCLOUD_MATRIX4D);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___CREATE_CARTESIAN_COORDINATES_MESH__CARTESIANTRIANGULARMESH);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___CREATE_CARTESIAN_TRIANGULAR_MESH__CARTESIANTRIANGULARMESH);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___UPDATE_CARTESIAN_COORDINATES_SET__CARTESIANCOORDINATESSET_DOUBLE);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___CREATE_POINT_NORMAL_LOCATOR__NORMALPOINTCLOUD);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___CREATE_DIGITAL_ELEVATION_MAP__CARTESIANCOORDINATESSET);
		createEOperation(data3dFacadeEClass, DATA3D_FACADE___CONCATENATE_TRIANGULAR_MESHES__ELIST);

		data3DIOEClass = createEClass(DATA3_DIO);
		createEOperation(data3DIOEClass, DATA3_DIO___SAVE_TRIANGULAR_MESH__CARTESIANTRIANGULARMESH_STRING);
		createEOperation(data3DIOEClass, DATA3_DIO___LOAD_TRIANGULAR_MESH__STRING);
		createEOperation(data3DIOEClass, DATA3_DIO___SAVE_TRIANGULAR_MESH__CARTESIANTRIANGULARMESH_OUTPUTSTREAM);
		createEOperation(data3DIOEClass, DATA3_DIO___LOAD_TRIANGULAR_MESH__INPUTSTREAM);
		createEOperation(data3DIOEClass, DATA3_DIO___LOAD_TRIANGULAR_MESH_FROM_ASCII_AS_NORMAL_POINT_CLOUD__STRING);
		createEOperation(data3DIOEClass, DATA3_DIO___LOAD_TRIANGULAR_MESH_FROM_ASCII__STRING);
		createEOperation(data3DIOEClass, DATA3_DIO___SAVE_TRIANGULAR_MESH_AS_ASCII__CARTESIANTRIANGULARMESH_STRING);
		createEOperation(data3DIOEClass, DATA3_DIO___LOAD_XYZ__STRING);
		createEOperation(data3DIOEClass, DATA3_DIO___LOAD_TRIANGULAR_MESH_FROM_TRI_XYZ__STRING_STRING);
		createEOperation(data3DIOEClass, DATA3_DIO___SAVE_COORDINATES_SET_TO_XYZ__CARTESIANCOORDINATESSET_STRING);
		createEOperation(data3DIOEClass, DATA3_DIO___SAVE_COORDINATES_SET_TO_XYZ__CARTESIANCOORDINATESSET_OUTPUTSTREAM);
		createEOperation(data3DIOEClass, DATA3_DIO___SAVE_COORDINATES_SET_TO_CSV__CARTESIANCOORDINATESSET_OUTPUTSTREAM);
		createEOperation(data3DIOEClass, DATA3_DIO___SAVE_COORDINATES_SET_TO_CSV__CARTESIANCOORDINATESSET_STRING);

		pointLocatorEClass = createEClass(POINT_LOCATOR);
		createEAttribute(pointLocatorEClass, POINT_LOCATOR__POINTS);
		createEOperation(pointLocatorEClass, POINT_LOCATOR___FIND_CLOSEST_POINT__CARTESIANPOSITIONCOORDINATES);
		createEOperation(pointLocatorEClass, POINT_LOCATOR___FIND_POINTS_WITHIN_RADIUS__DOUBLE_CARTESIANPOSITIONCOORDINATES);

		data3DUtilsEClass = createEClass(DATA3_DUTILS);
		createEOperation(data3DUtilsEClass, DATA3_DUTILS___COMPUTE_NORMALS__CARTESIANTRIANGULARMESH);
		createEOperation(data3DUtilsEClass, DATA3_DUTILS___COMPUTE_CENTROID__CARTESIANCOORDINATESSET);
		createEOperation(data3DUtilsEClass, DATA3_DUTILS___COMPUTE_MIN_MAX_VALUES__POINT3D_POINT3D_CARTESIANCOORDINATESSET);
		createEOperation(data3DUtilsEClass, DATA3_DUTILS___COMPUTE_CURVATURE_CHANGE__POINTLOCATOR_INT_DOUBLE);
		createEOperation(data3DUtilsEClass, DATA3_DUTILS___COMPUTE_CURVATURE_CHANGE__VECMATHPOINTLOCATOR_INT_DOUBLE);
		createEOperation(data3DUtilsEClass, DATA3_DUTILS___EXTRUDE__LIST_CARTESIANAXIS_DOUBLE_BOOLEAN);

		normalPointCloudEClass = createEClass(NORMAL_POINT_CLOUD);
		createEAttribute(normalPointCloudEClass, NORMAL_POINT_CLOUD__POINTS);
		createEAttribute(normalPointCloudEClass, NORMAL_POINT_CLOUD__NORMALS);

		vecmathPointLocatorEClass = createEClass(VECMATH_POINT_LOCATOR);
		createEAttribute(vecmathPointLocatorEClass, VECMATH_POINT_LOCATOR__POINTS);
		createEOperation(vecmathPointLocatorEClass, VECMATH_POINT_LOCATOR___FIND_CLOSEST_POINT__POINT3D);
		createEOperation(vecmathPointLocatorEClass, VECMATH_POINT_LOCATOR___FIND_POINTS_WITHIN_RADIUS__DOUBLE_POINT3D);
		createEOperation(vecmathPointLocatorEClass, VECMATH_POINT_LOCATOR___FIND_CLOSEST_POINT_ID__POINT3D);
		createEOperation(vecmathPointLocatorEClass, VECMATH_POINT_LOCATOR___FIND_POINT_IDS_WITHIN_RADIUS__DOUBLE_POINT3D);
		createEOperation(vecmathPointLocatorEClass, VECMATH_POINT_LOCATOR___FIND_CLOSEST_NPOINTS__POINT3D_INT);
		createEOperation(vecmathPointLocatorEClass, VECMATH_POINT_LOCATOR___FIND_CLOSEST_NPOINT_IDS__POINT3D_INT);

		vecmathKdTreePointLocatorEClass = createEClass(VECMATH_KD_TREE_POINT_LOCATOR);

		meshLocaliserEClass = createEClass(MESH_LOCALISER);
		createEOperation(meshLocaliserEClass, MESH_LOCALISER___LOCALISE__CARTESIANTRIANGULARMESH_MATRIX4D_CARTESIANTRIANGULARMESH_MATRIX4D);

		pointNormalLocatorEClass = createEClass(POINT_NORMAL_LOCATOR);
		createEReference(pointNormalLocatorEClass, POINT_NORMAL_LOCATOR__DATA_SET);
		createEOperation(pointNormalLocatorEClass, POINT_NORMAL_LOCATOR___FIND_CLOSEST_POINT__POINT3D_VECTOR3D);
		createEOperation(pointNormalLocatorEClass, POINT_NORMAL_LOCATOR___FIND_POINTS_WITHIN_RADIUS__DOUBLE_POINT3D_VECTOR3D);
		createEOperation(pointNormalLocatorEClass, POINT_NORMAL_LOCATOR___FIND_CLOSEST_NPOINTS__INT_POINT3D_VECTOR3D);
		createEOperation(pointNormalLocatorEClass, POINT_NORMAL_LOCATOR___FIND_CLOSEST_POINT_ID__POINT3D_VECTOR3D);
		createEOperation(pointNormalLocatorEClass, POINT_NORMAL_LOCATOR___FIND_POINT_IDS_WITHIN_RADIUS__DOUBLE_POINT3D_VECTOR3D);
		createEOperation(pointNormalLocatorEClass, POINT_NORMAL_LOCATOR___FIND_CLOSEST_NPOINT_IDS__INT_POINT3D_VECTOR3D);

		delaunayMesherEClass = createEClass(DELAUNAY_MESHER);
		createEAttribute(delaunayMesherEClass, DELAUNAY_MESHER__TOLERANCE);
		createEAttribute(delaunayMesherEClass, DELAUNAY_MESHER__ALPHA);
		createEAttribute(delaunayMesherEClass, DELAUNAY_MESHER__OFFSET);
		createEAttribute(delaunayMesherEClass, DELAUNAY_MESHER__BOUNDING_TRIANGULATION);
		createEAttribute(delaunayMesherEClass, DELAUNAY_MESHER__MESHING_PLANE);

		digitalElevationMapMesherEClass = createEClass(DIGITAL_ELEVATION_MAP_MESHER);

		digitalElevationMapSamplerEClass = createEClass(DIGITAL_ELEVATION_MAP_SAMPLER);
		createEAttribute(digitalElevationMapSamplerEClass, DIGITAL_ELEVATION_MAP_SAMPLER__TARGET_RESOLUTION);

		triangularMeshNormalsCalculatorEClass = createEClass(TRIANGULAR_MESH_NORMALS_CALCULATOR);

		triangularMesh2NormalPointCloudEClass = createEClass(TRIANGULAR_MESH2_NORMAL_POINT_CLOUD);

		pointsRangeGagerEClass = createEClass(POINTS_RANGE_GAGER);
		createEAttribute(pointsRangeGagerEClass, POINTS_RANGE_GAGER__MIN_X);
		createEAttribute(pointsRangeGagerEClass, POINTS_RANGE_GAGER__MAX_X);
		createEAttribute(pointsRangeGagerEClass, POINTS_RANGE_GAGER__MIN_Y);
		createEAttribute(pointsRangeGagerEClass, POINTS_RANGE_GAGER__MAX_Y);
		createEAttribute(pointsRangeGagerEClass, POINTS_RANGE_GAGER__MIN_Z);
		createEAttribute(pointsRangeGagerEClass, POINTS_RANGE_GAGER__MAX_Z);

		uniquePointsFilterEClass = createEClass(UNIQUE_POINTS_FILTER);

		triangleEdgeLenghtTriangularMeshFilterEClass = createEClass(TRIANGLE_EDGE_LENGHT_TRIANGULAR_MESH_FILTER);
		createEAttribute(triangleEdgeLenghtTriangularMeshFilterEClass, TRIANGLE_EDGE_LENGHT_TRIANGULAR_MESH_FILTER__MINIMUM_RANGE);
		createEAttribute(triangleEdgeLenghtTriangularMeshFilterEClass, TRIANGLE_EDGE_LENGHT_TRIANGULAR_MESH_FILTER__MAXIMUM_RANGE);
		createEAttribute(triangleEdgeLenghtTriangularMeshFilterEClass, TRIANGLE_EDGE_LENGHT_TRIANGULAR_MESH_FILTER__MAXIMUM_EDGE_LENGHT);
		createEOperation(triangleEdgeLenghtTriangularMeshFilterEClass, TRIANGLE_EDGE_LENGHT_TRIANGULAR_MESH_FILTER___FILTER__CARTESIANTRIANGULARMESH);

		outlierFilterEClass = createEClass(OUTLIER_FILTER);
		createEAttribute(outlierFilterEClass, OUTLIER_FILTER__MAX_DISTANCE);

		rasterPointCloudEClass = createEClass(RASTER_POINT_CLOUD);
		createEAttribute(rasterPointCloudEClass, RASTER_POINT_CLOUD__ROWS);
		createEAttribute(rasterPointCloudEClass, RASTER_POINT_CLOUD__COLUMNS);
		createEOperation(rasterPointCloudEClass, RASTER_POINT_CLOUD___GET_POINT__INT_INT);
		createEOperation(rasterPointCloudEClass, RASTER_POINT_CLOUD___SET_POINT__INT_INT_CARTESIANPOSITIONCOORDINATES);

		rasterPointCloudToCartesianCoordinatesSetEClass = createEClass(RASTER_POINT_CLOUD_TO_CARTESIAN_COORDINATES_SET);

		meshSmootherEClass = createEClass(MESH_SMOOTHER);
		createEAttribute(meshSmootherEClass, MESH_SMOOTHER__NUMBER_OF_ITERATIONS);

		voxelBased3DPointCloudResamplerEClass = createEClass(VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER);
		createEAttribute(voxelBased3DPointCloudResamplerEClass, VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_X);
		createEAttribute(voxelBased3DPointCloudResamplerEClass, VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Y);
		createEAttribute(voxelBased3DPointCloudResamplerEClass, VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Z);
		createEAttribute(voxelBased3DPointCloudResamplerEClass, VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__MINIMUM_NUMBER_OF_POINT_PER_VOXEL);
		createEAttribute(voxelBased3DPointCloudResamplerEClass, VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__TILE_RESOLUTION);

		rigidBodyPoseTrackerEClass = createEClass(RIGID_BODY_POSE_TRACKER);
		createEReference(rigidBodyPoseTrackerEClass, RIGID_BODY_POSE_TRACKER__POSITION_MARKERS_AT_ORIGIN);
		createEOperation(rigidBodyPoseTrackerEClass, RIGID_BODY_POSE_TRACKER___COMPUTE_TRANSFORMATION__ELIST);
		createEOperation(rigidBodyPoseTrackerEClass, RIGID_BODY_POSE_TRACKER___ADD_POSITION_MARKERS__LIST);
		createEOperation(rigidBodyPoseTrackerEClass, RIGID_BODY_POSE_TRACKER___REMOVE_POSITION_MARKERS__LIST);

		positionMarkerEClass = createEClass(POSITION_MARKER);
		createEAttribute(positionMarkerEClass, POSITION_MARKER__IDENTIFIER);

		cubeSamplingShapeEClass = createEClass(CUBE_SAMPLING_SHAPE);
		createEAttribute(cubeSamplingShapeEClass, CUBE_SAMPLING_SHAPE__INCLUDE_JUST_TOUCHING);
		createEReference(cubeSamplingShapeEClass, CUBE_SAMPLING_SHAPE__CORNER1);
		createEReference(cubeSamplingShapeEClass, CUBE_SAMPLING_SHAPE__CORNER2);

		cartesianCoordinatesSetExtentEClass = createEClass(CARTESIAN_COORDINATES_SET_EXTENT);
		createEAttribute(cartesianCoordinatesSetExtentEClass, CARTESIAN_COORDINATES_SET_EXTENT__XMIN);
		createEAttribute(cartesianCoordinatesSetExtentEClass, CARTESIAN_COORDINATES_SET_EXTENT__XMAX);
		createEAttribute(cartesianCoordinatesSetExtentEClass, CARTESIAN_COORDINATES_SET_EXTENT__YMIN);
		createEAttribute(cartesianCoordinatesSetExtentEClass, CARTESIAN_COORDINATES_SET_EXTENT__YMAX);
		createEAttribute(cartesianCoordinatesSetExtentEClass, CARTESIAN_COORDINATES_SET_EXTENT__ZMIN);
		createEAttribute(cartesianCoordinatesSetExtentEClass, CARTESIAN_COORDINATES_SET_EXTENT__ZMAX);
		createEAttribute(cartesianCoordinatesSetExtentEClass, CARTESIAN_COORDINATES_SET_EXTENT__XDIMENSION);
		createEAttribute(cartesianCoordinatesSetExtentEClass, CARTESIAN_COORDINATES_SET_EXTENT__YDIMENSION);
		createEAttribute(cartesianCoordinatesSetExtentEClass, CARTESIAN_COORDINATES_SET_EXTENT__ZDIMENSION);

		// Create enums
		cartesianAxisEEnum = createEEnum(CARTESIAN_AXIS);
		cartesianPlaneEEnum = createEEnum(CARTESIAN_PLANE);
		meshinG_PLANEEEnum = createEEnum(MESHING_PLANE);

		// Create data types
		inputStreamEDataType = createEDataType(INPUT_STREAM);
		ioExceptionEDataType = createEDataType(IO_EXCEPTION);
		outputStreamEDataType = createEDataType(OUTPUT_STREAM);
		matrix4dEDataType = createEDataType(MATRIX4D);
		vector3dEDataType = createEDataType(VECTOR3D);
		point3dEDataType = createEDataType(POINT3D);
		doubleArrayOfArrayEDataType = createEDataType(DOUBLE_ARRAY_OF_ARRAY);
		intArrayEDataType = createEDataType(INT_ARRAY);
		listEDataType = createEDataType(LIST);
		gVectorEDataType = createEDataType(GVECTOR);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ProcessorsPackage theProcessorsPackage = (ProcessorsPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessorsPackage.eNS_URI);

		// Create type parameters
		ETypeParameter sphereSamplingShapeEClass_PolygonType = addETypeParameter(sphereSamplingShapeEClass, "PolygonType");
		ETypeParameter cubeSamplingShapeEClass_PolygonType = addETypeParameter(cubeSamplingShapeEClass, "PolygonType");
		addETypeParameter(listEDataType, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getCartesianPolygon());
		sphereSamplingShapeEClass_PolygonType.getEBounds().add(g1);
		g1 = createEGenericType(this.getCartesianPolygon());
		cubeSamplingShapeEClass_PolygonType.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(theDataPackage.getPolygon());
		EGenericType g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		cartesianPolygonEClass.getEGenericSuperTypes().add(g1);
		cartesianTriangleEClass.getESuperTypes().add(this.getCartesianPolygon());
		g1 = createEGenericType(theDataPackage.getPolygon());
		g2 = createEGenericType(this.getSphericalCoordinates());
		g1.getETypeArguments().add(g2);
		sphericalPolygonEClass.getEGenericSuperTypes().add(g1);
		sphericalTriangleEClass.getESuperTypes().add(this.getSphericalPolygon());
		cartesianPositionCoordinatesEClass.getESuperTypes().add(theDataPackage.getCoordinates());
		rgbCartesianPositionCoordinatesEClass.getESuperTypes().add(this.getCartesianPositionCoordinates());
		cartesianOrientationCoordinatesEClass.getESuperTypes().add(theDataPackage.getCoordinates());
		g1 = createEGenericType(theDataPackage.getCoordinatesSet());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		cartesianCoordinatesSetEClass.getEGenericSuperTypes().add(g1);
		digitalElevationMapEClass.getESuperTypes().add(this.getCartesianCoordinatesSet());
		g1 = createEGenericType(theDataPackage.getMesh());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianPolygon());
		g1.getETypeArguments().add(g2);
		cartesianCoordinatesMeshEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCartesianCoordinatesSet());
		cartesianCoordinatesMeshEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theDataPackage.getMesh());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianTriangle());
		g1.getETypeArguments().add(g2);
		cartesianTriangularMeshEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCartesianCoordinatesSet());
		cartesianTriangularMeshEClass.getEGenericSuperTypes().add(g1);
		sphericalCoordinatesEClass.getESuperTypes().add(theDataPackage.getCoordinates());
		g1 = createEGenericType(theDataPackage.getCoordinatesSet());
		g2 = createEGenericType(this.getSphericalCoordinates());
		g1.getETypeArguments().add(g2);
		sphericalCoordinatesSetEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theDataPackage.getMesh());
		g2 = createEGenericType(this.getSphericalCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getSphericalPolygon());
		g1.getETypeArguments().add(g2);
		spericalCoordinatesMeshEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSphericalCoordinatesSet());
		spericalCoordinatesMeshEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theDataPackage.getMesh());
		g2 = createEGenericType(this.getSphericalCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getSphericalTriangle());
		g1.getETypeArguments().add(g2);
		sphericalTriangularMeshEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSphericalCoordinatesSet());
		sphericalTriangularMeshEClass.getEGenericSuperTypes().add(g1);
		poseEClass.getESuperTypes().add(this.getCartesianPositionCoordinates());
		poseEClass.getESuperTypes().add(this.getCartesianOrientationCoordinates());
		g1 = createEGenericType(theDataPackage.getCoordinatesSamplingShape());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		sphereSamplingShapeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theDataPackage.getPolygonSamplingShape());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(sphereSamplingShapeEClass_PolygonType);
		g1.getETypeArguments().add(g2);
		sphereSamplingShapeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theDataPackage.getCoordinatesSetShapesSampler());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		cartesianCoordinatesSetShapeSamplerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theDataPackage.getMeshCoordinatesShapesSampler());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianPolygon());
		g1.getETypeArguments().add(g2);
		cartesianCoordinatesMeshSamplerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theDataPackage.getMeshPolygonShapesSampler());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianPolygon());
		g1.getETypeArguments().add(g2);
		cartesianCoordinatesMeshPolygonSamplerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theDataPackage.getMeshCoordinatesShapesSampler());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianTriangle());
		g1.getETypeArguments().add(g2);
		cartesianTriangularMeshSamplerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theDataPackage.getMeshPolygonShapesSampler());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianTriangle());
		g1.getETypeArguments().add(g2);
		cartesianTriangularMeshPolygonSamplerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getCartesianCoordinatesSet());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianTriangularMesh());
		g1.getETypeArguments().add(g2);
		cartesianPositionCoordinatesMesherEClass.getEGenericSuperTypes().add(g1);
		vecmathKdTreePointLocatorEClass.getESuperTypes().add(this.getVecmathPointLocator());
		delaunayMesherEClass.getESuperTypes().add(this.getCartesianPositionCoordinatesMesher());
		g1 = createEGenericType(theProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getDigitalElevationMap());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianTriangularMesh());
		g1.getETypeArguments().add(g2);
		digitalElevationMapMesherEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getDigitalElevationMap());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getDigitalElevationMap());
		g1.getETypeArguments().add(g2);
		digitalElevationMapSamplerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getCartesianTriangularMesh());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianTriangularMesh());
		g1.getETypeArguments().add(g2);
		triangularMeshNormalsCalculatorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getCartesianTriangularMesh());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getNormalPointCloud());
		g1.getETypeArguments().add(g2);
		triangularMesh2NormalPointCloudEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getCartesianCoordinatesSet());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianCoordinatesSet());
		g1.getETypeArguments().add(g2);
		pointsRangeGagerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getCartesianCoordinatesSet());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianCoordinatesSet());
		g1.getETypeArguments().add(g2);
		uniquePointsFilterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getCartesianCoordinatesSet());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianCoordinatesSet());
		g1.getETypeArguments().add(g2);
		outlierFilterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getRasterPointCloud());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianCoordinatesSet());
		g1.getETypeArguments().add(g2);
		rasterPointCloudToCartesianCoordinatesSetEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getCartesianTriangularMesh());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianTriangularMesh());
		g1.getETypeArguments().add(g2);
		meshSmootherEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getCartesianCoordinatesSet());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianCoordinatesSet());
		g1.getETypeArguments().add(g2);
		voxelBased3DPointCloudResamplerEClass.getEGenericSuperTypes().add(g1);
		positionMarkerEClass.getESuperTypes().add(this.getCartesianPositionCoordinates());
		g1 = createEGenericType(theDataPackage.getCoordinatesSamplingShape());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		cubeSamplingShapeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theDataPackage.getPolygonSamplingShape());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(cubeSamplingShapeEClass_PolygonType);
		g1.getETypeArguments().add(g2);
		cubeSamplingShapeEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(cartesianPolygonEClass, CartesianPolygon.class, "CartesianPolygon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCartesianPolygon_Surface(), theEcorePackage.getEDouble(), "surface", null, 1, 1, CartesianPolygon.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianPolygon_Normal(), theDataPackage.getVector3d(), "normal", null, 1, 1, CartesianPolygon.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCartesianPolygon_Centroid(), this.getCartesianPositionCoordinates(), null, "centroid", null, 1, 1, CartesianPolygon.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(cartesianTriangleEClass, CartesianTriangle.class, "CartesianTriangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sphericalPolygonEClass, SphericalPolygon.class, "SphericalPolygon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sphericalTriangleEClass, SphericalTriangle.class, "SphericalTriangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cartesianPositionCoordinatesEClass, CartesianPositionCoordinates.class, "CartesianPositionCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCartesianPositionCoordinates_X(), ecorePackage.getEDouble(), "x", null, 1, 1, CartesianPositionCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianPositionCoordinates_Y(), ecorePackage.getEDouble(), "y", null, 1, 1, CartesianPositionCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianPositionCoordinates_Z(), ecorePackage.getEDouble(), "z", null, 1, 1, CartesianPositionCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCartesianPositionCoordinates__AsPoint3d(), this.getPoint3d(), "asPoint3d", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rgbCartesianPositionCoordinatesEClass, RGBCartesianPositionCoordinates.class, "RGBCartesianPositionCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRGBCartesianPositionCoordinates_Red(), theEcorePackage.getEByte(), "red", null, 0, 1, RGBCartesianPositionCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGBCartesianPositionCoordinates_Green(), theEcorePackage.getEByte(), "green", null, 0, 1, RGBCartesianPositionCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGBCartesianPositionCoordinates_Blue(), theEcorePackage.getEByte(), "blue", null, 0, 1, RGBCartesianPositionCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartesianOrientationCoordinatesEClass, CartesianOrientationCoordinates.class, "CartesianOrientationCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCartesianOrientationCoordinates_XRotation(), ecorePackage.getEDouble(), "xRotation", null, 1, 1, CartesianOrientationCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianOrientationCoordinates_YRotation(), ecorePackage.getEDouble(), "yRotation", null, 1, 1, CartesianOrientationCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianOrientationCoordinates_ZRotation(), ecorePackage.getEDouble(), "zRotation", null, 1, 1, CartesianOrientationCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartesianCoordinatesSetEClass, CartesianCoordinatesSet.class, "CartesianCoordinatesSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCartesianCoordinatesSet__GetExtent(), this.getCartesianCoordinatesSetExtent(), "getExtent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(digitalElevationMapEClass, DigitalElevationMap.class, "DigitalElevationMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDigitalElevationMap_XDimension(), theEcorePackage.getEInt(), "xDimension", null, 0, 1, DigitalElevationMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDigitalElevationMap_YDimension(), theEcorePackage.getEInt(), "yDimension", null, 0, 1, DigitalElevationMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartesianCoordinatesMeshEClass, CartesianCoordinatesMesh.class, "CartesianCoordinatesMesh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cartesianTriangularMeshEClass, CartesianTriangularMesh.class, "CartesianTriangularMesh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sphericalCoordinatesEClass, SphericalCoordinates.class, "SphericalCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSphericalCoordinates_Phi(), ecorePackage.getEDouble(), "phi", null, 0, 1, SphericalCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSphericalCoordinates_Theta(), ecorePackage.getEDouble(), "theta", null, 0, 1, SphericalCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSphericalCoordinates_R(), ecorePackage.getEDouble(), "r", "0", 0, 1, SphericalCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sphericalCoordinatesSetEClass, SphericalCoordinatesSet.class, "SphericalCoordinatesSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spericalCoordinatesMeshEClass, SpericalCoordinatesMesh.class, "SpericalCoordinatesMesh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sphericalTriangularMeshEClass, SphericalTriangularMesh.class, "SphericalTriangularMesh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(poseEClass, Pose.class, "Pose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sphereSamplingShapeEClass, SphereSamplingShape.class, "SphereSamplingShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSphereSamplingShape_Radius(), theEcorePackage.getEDouble(), "radius", "1.0", 0, 1, SphereSamplingShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSphereSamplingShape_Center(), this.getCartesianPositionCoordinates(), null, "center", null, 0, 1, SphereSamplingShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSphereSamplingShape_IncludeJustTouching(), theEcorePackage.getEBoolean(), "includeJustTouching", "true", 0, 1, SphereSamplingShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartesianCoordinatesSetShapeSamplerEClass, CartesianCoordinatesSetShapeSampler.class, "CartesianCoordinatesSetShapeSampler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cartesianCoordinatesMeshSamplerEClass, CartesianCoordinatesMeshSampler.class, "CartesianCoordinatesMeshSampler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cartesianCoordinatesMeshPolygonSamplerEClass, CartesianCoordinatesMeshPolygonSampler.class, "CartesianCoordinatesMeshPolygonSampler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cartesianTriangularMeshSamplerEClass, CartesianTriangularMeshSampler.class, "CartesianTriangularMeshSampler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cartesianTriangularMeshPolygonSamplerEClass, CartesianTriangularMeshPolygonSampler.class, "CartesianTriangularMeshPolygonSampler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cartesianPositionCoordinatesMesherEClass, CartesianPositionCoordinatesMesher.class, "CartesianPositionCoordinatesMesher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(data3dFacadeEClass, Data3dFacade.class, "Data3dFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getData3dFacade__CreateCartesianPositionCoordinates__double_double_double(), this.getCartesianPositionCoordinates(), "createCartesianPositionCoordinates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "z", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3dFacade__CreateCartesianOrientationCoordinates__double_double_double(), this.getCartesianOrientationCoordinates(), "createCartesianOrientationCoordinates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "xRotation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "yRotation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "zRotation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3dFacade__CreateSphericalCoordinates__double_double_double(), this.getSphericalCoordinates(), "createSphericalCoordinates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "phi", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "theta", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3dFacade__CreatePose__double_double_double_double_double_double(), this.getPose(), "createPose", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "z", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "xRotation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "yRotation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "zRotation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3dFacade__CreatePose__Pose(), this.getPose(), "createPose", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPose(), "pose", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3dFacade__CreatePose__CartesianPositionCoordinates_CartesianOrientationCoordinates(), this.getPose(), "createPose", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "position", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianOrientationCoordinates(), "orientation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3dFacade__CreateCartesianPolygon__CartesianPositionCoordinates_CartesianPositionCoordinates_CartesianPositionCoordinates(), this.getCartesianPolygon(), "createCartesianPolygon", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "v1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "v2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "v3", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3dFacade__CreateCartesianPositionCoordinates__CartesianPositionCoordinates(), this.getCartesianPositionCoordinates(), "createCartesianPositionCoordinates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "coordinates", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3dFacade__CreateCartesianOrientationCoordinates__CartesianOrientationCoordinates(), this.getCartesianOrientationCoordinates(), "createCartesianOrientationCoordinates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianOrientationCoordinates(), "coordinates", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3dFacade__CreateCartesianCoordinatesMesh__CartesianCoordinatesMesh(), this.getCartesianCoordinatesMesh(), "createCartesianCoordinatesMesh", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianCoordinatesMesh(), "cartesianCoordinatesMesh", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3dFacade__CreateCartesianTriangle__CartesianPositionCoordinates_CartesianPositionCoordinates_CartesianPositionCoordinates(), this.getCartesianTriangle(), "createCartesianTriangle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "v1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "v2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "v3", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3dFacade__CreateCartesianTriangle__CartesianPolygon(), this.getCartesianTriangle(), "createCartesianTriangle", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getCartesianPolygon());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "polygon", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3dFacade__ApplyTransform__CartesianCoordinatesSet_Matrix4d(), this.getCartesianCoordinatesSet(), "applyTransform", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianCoordinatesSet(), "points", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4d(), "trMatrix", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3dFacade__CreateCartesianCoordinatesMesh__List(), this.getCartesianCoordinatesMesh(), "createCartesianCoordinatesMesh", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getCartesianPolygon());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "polygons", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3dFacade__CreateCartesianTriangularMesh__List(), this.getCartesianTriangularMesh(), "createCartesianTriangularMesh", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getCartesianTriangle());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "polygons", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3dFacade__ApplyTransform__List_Matrix4d(), null, "applyTransform", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theDataPackage.getList());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "points", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4d(), "trMatrix", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theDataPackage.getList());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getData3dFacade__ApplyTransform__CartesianTriangularMesh_Matrix4d(), this.getCartesianTriangularMesh(), "applyTransform", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "mesh", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4d(), "trMatrix", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3dFacade__ApplyTransformInt__CartesianTriangularMesh_Matrix4d(), this.getCartesianTriangularMesh(), "applyTransformInt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "mesh", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4d(), "trMatrix", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3dFacade__ApplyTransform__NormalPointCloud_Matrix4d(), this.getNormalPointCloud(), "applyTransform", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNormalPointCloud(), "points", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4d(), "trMatrix", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3dFacade__CreateCartesianCoordinatesMesh__CartesianTriangularMesh(), this.getCartesianCoordinatesMesh(), "createCartesianCoordinatesMesh", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "cartesianTriangularMesh", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3dFacade__CreateCartesianTriangularMesh__CartesianTriangularMesh(), this.getCartesianTriangularMesh(), "createCartesianTriangularMesh", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "cartesianCoordinatesMesh", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3dFacade__UpdateCartesianCoordinatesSet__CartesianCoordinatesSet_double(), null, "updateCartesianCoordinatesSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianCoordinatesSet(), "cartesianCoordinatesSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDoubleArrayOfArray(), "xyzData", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3dFacade__CreatePointNormalLocator__NormalPointCloud(), this.getPointNormalLocator(), "createPointNormalLocator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNormalPointCloud(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3dFacade__CreateDigitalElevationMap__CartesianCoordinatesSet(), this.getDigitalElevationMap(), "createDigitalElevationMap", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianCoordinatesSet(), "coordinatesSet", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3dFacade__ConcatenateTriangularMeshes__EList(), this.getCartesianTriangularMesh(), "concatenateTriangularMeshes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "listOfTriangularMeshes", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(data3DIOEClass, Data3DIO.class, "Data3DIO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getData3DIO__SaveTriangularMesh__CartesianTriangularMesh_String(), null, "saveTriangularMesh", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "mesh", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "file", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData3DIO__LoadTriangularMesh__String(), this.getCartesianTriangularMesh(), "loadTriangularMesh", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "file", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData3DIO__SaveTriangularMesh__CartesianTriangularMesh_OutputStream(), null, "saveTriangularMesh", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "mesh", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOutputStream(), "output", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData3DIO__LoadTriangularMesh__InputStream(), this.getCartesianTriangularMesh(), "loadTriangularMesh", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInputStream(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData3DIO__LoadTriangularMeshFromASCIIAsNormalPointCloud__String(), this.getNormalPointCloud(), "loadTriangularMeshFromASCIIAsNormalPointCloud", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "filePrefix", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData3DIO__LoadTriangularMeshFromASCII__String(), this.getCartesianTriangularMesh(), "loadTriangularMeshFromASCII", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "filePrefix", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData3DIO__SaveTriangularMeshAsASCII__CartesianTriangularMesh_String(), null, "saveTriangularMeshAsASCII", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "mesh", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "filePrefix", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theProcessorsPackage.getException());

		op = initEOperation(getData3DIO__LoadXYZ__String(), this.getCartesianCoordinatesSet(), "loadXYZ", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "fileName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData3DIO__LoadTriangularMeshFromTriXYZ__String_String(), this.getCartesianTriangularMesh(), "loadTriangularMeshFromTriXYZ", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "triFileName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "xyzFileName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData3DIO__SaveCoordinatesSetToXYZ__CartesianCoordinatesSet_String(), null, "saveCoordinatesSetToXYZ", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianCoordinatesSet(), "coordinatesSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "file", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData3DIO__SaveCoordinatesSetToXYZ__CartesianCoordinatesSet_OutputStream(), null, "saveCoordinatesSetToXYZ", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianCoordinatesSet(), "coordinatesSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOutputStream(), "file", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData3DIO__SaveCoordinatesSetToCSV__CartesianCoordinatesSet_OutputStream(), null, "saveCoordinatesSetToCSV", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianCoordinatesSet(), "coordinatesSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOutputStream(), "file", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData3DIO__SaveCoordinatesSetToCSV__CartesianCoordinatesSet_String(), null, "saveCoordinatesSetToCSV", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianCoordinatesSet(), "coordinatesSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "file", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		initEClass(pointLocatorEClass, PointLocator.class, "PointLocator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theDataPackage.getList());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		initEAttribute(getPointLocator_Points(), g1, "points", null, 0, 1, PointLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPointLocator__FindClosestPoint__CartesianPositionCoordinates(), this.getCartesianPositionCoordinates(), "findClosestPoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "point", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPointLocator__FindPointsWithinRadius__double_CartesianPositionCoordinates(), this.getCartesianPositionCoordinates(), "findPointsWithinRadius", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "radius", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "point", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(data3DUtilsEClass, Data3DUtils.class, "Data3DUtils", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getData3DUtils__ComputeNormals__CartesianTriangularMesh(), this.getVector3d(), "computeNormals", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "mesh", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3DUtils__ComputeCentroid__CartesianCoordinatesSet(), this.getCartesianPositionCoordinates(), "computeCentroid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianCoordinatesSet(), "points", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3DUtils__ComputeMinMaxValues__Point3d_Point3d_CartesianCoordinatesSet(), null, "computeMinMaxValues", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "min", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "max", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianCoordinatesSet(), "data", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3DUtils__ComputeCurvatureChange__PointLocator_int_double(), theEcorePackage.getEDouble(), "computeCurvatureChange", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPointLocator(), "pointLocator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "centerPoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "radius", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3DUtils__ComputeCurvatureChange__VecmathPointLocator_int_double(), theEcorePackage.getEDouble(), "computeCurvatureChange", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVecmathPointLocator(), "pointLocator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "centerPoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "radius", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3DUtils__Extrude__List_CartesianAxis_double_boolean(), this.getCartesianTriangularMesh(), "extrude", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theDataPackage.getList());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "profilePoints", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianAxis(), "extrusionAxis", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "extrusionWidth", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "closeMesh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(normalPointCloudEClass, NormalPointCloud.class, "NormalPointCloud", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theDataPackage.getList());
		g2 = createEGenericType(this.getPoint3d());
		g1.getETypeArguments().add(g2);
		initEAttribute(getNormalPointCloud_Points(), g1, "points", null, 0, 1, NormalPointCloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theDataPackage.getList());
		g2 = createEGenericType(theDataPackage.getVector3d());
		g1.getETypeArguments().add(g2);
		initEAttribute(getNormalPointCloud_Normals(), g1, "normals", null, 0, 1, NormalPointCloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vecmathPointLocatorEClass, VecmathPointLocator.class, "VecmathPointLocator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theDataPackage.getList());
		g2 = createEGenericType(this.getPoint3d());
		g1.getETypeArguments().add(g2);
		initEAttribute(getVecmathPointLocator_Points(), g1, "points", "", 0, 1, VecmathPointLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVecmathPointLocator__FindClosestPoint__Point3d(), this.getPoint3d(), "findClosestPoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "point", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVecmathPointLocator__FindPointsWithinRadius__double_Point3d(), this.getPoint3d(), "findPointsWithinRadius", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "radius", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "point", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVecmathPointLocator__FindClosestPointId__Point3d(), theEcorePackage.getEInt(), "findClosestPointId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "point", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVecmathPointLocator__FindPointIdsWithinRadius__double_Point3d(), this.getIntArray(), "findPointIdsWithinRadius", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "radius", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "point", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVecmathPointLocator__FindClosestNPoints__Point3d_int(), this.getPoint3d(), "findClosestNPoints", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "referencePoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVecmathPointLocator__FindClosestNPointIds__Point3d_int(), this.getIntArray(), "findClosestNPointIds", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "referencePoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vecmathKdTreePointLocatorEClass, VecmathKdTreePointLocator.class, "VecmathKdTreePointLocator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(meshLocaliserEClass, MeshLocaliser.class, "MeshLocaliser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getMeshLocaliser__Localise__CartesianTriangularMesh_Matrix4d_CartesianTriangularMesh_Matrix4d(), this.getMatrix4d(), "localise", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "fixedMesh", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4d(), "fixedMeshTransform", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "floatingMesh", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4d(), "floatingMeshTransformEstimate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theProcessorsPackage.getException());

		initEClass(pointNormalLocatorEClass, PointNormalLocator.class, "PointNormalLocator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointNormalLocator_DataSet(), this.getNormalPointCloud(), null, "dataSet", null, 0, 1, PointNormalLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPointNormalLocator__FindClosestPoint__Point3d_Vector3d(), this.getGVector(), "findClosestPoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "point", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getVector3d(), "normal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPointNormalLocator__FindPointsWithinRadius__double_Point3d_Vector3d(), this.getGVector(), "findPointsWithinRadius", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "radius", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "point", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getVector3d(), "normal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPointNormalLocator__FindClosestNPoints__int_Point3d_Vector3d(), this.getGVector(), "findClosestNPoints", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "point", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getVector3d(), "normal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPointNormalLocator__FindClosestPointId__Point3d_Vector3d(), theEcorePackage.getEInt(), "findClosestPointId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "point", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getVector3d(), "normal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPointNormalLocator__FindPointIdsWithinRadius__double_Point3d_Vector3d(), this.getIntArray(), "findPointIdsWithinRadius", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "radius", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "point", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getVector3d(), "normal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPointNormalLocator__FindClosestNPointIds__int_Point3d_Vector3d(), this.getIntArray(), "findClosestNPointIds", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "point", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getVector3d(), "normal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(delaunayMesherEClass, DelaunayMesher.class, "DelaunayMesher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelaunayMesher_Tolerance(), theEcorePackage.getEDouble(), "tolerance", null, 0, 1, DelaunayMesher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelaunayMesher_Alpha(), theEcorePackage.getEDouble(), "alpha", null, 0, 1, DelaunayMesher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelaunayMesher_Offset(), theEcorePackage.getEDouble(), "offset", "0.75", 0, 1, DelaunayMesher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelaunayMesher_BoundingTriangulation(), theEcorePackage.getEBoolean(), "boundingTriangulation", null, 0, 1, DelaunayMesher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelaunayMesher_MeshingPlane(), this.getMESHING_PLANE(), "meshingPlane", null, 0, 1, DelaunayMesher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digitalElevationMapMesherEClass, DigitalElevationMapMesher.class, "DigitalElevationMapMesher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(digitalElevationMapSamplerEClass, DigitalElevationMapSampler.class, "DigitalElevationMapSampler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDigitalElevationMapSampler_TargetResolution(), theEcorePackage.getEDouble(), "targetResolution", "1.0", 0, 1, DigitalElevationMapSampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triangularMeshNormalsCalculatorEClass, TriangularMeshNormalsCalculator.class, "TriangularMeshNormalsCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(triangularMesh2NormalPointCloudEClass, TriangularMesh2NormalPointCloud.class, "TriangularMesh2NormalPointCloud", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pointsRangeGagerEClass, PointsRangeGager.class, "PointsRangeGager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPointsRangeGager_MinX(), theEcorePackage.getEDouble(), "minX", "-1", 0, 1, PointsRangeGager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointsRangeGager_MaxX(), theEcorePackage.getEDouble(), "maxX", "1", 0, 1, PointsRangeGager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointsRangeGager_MinY(), theEcorePackage.getEDouble(), "minY", "-1", 0, 1, PointsRangeGager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointsRangeGager_MaxY(), theEcorePackage.getEDouble(), "maxY", "1", 0, 1, PointsRangeGager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointsRangeGager_MinZ(), theEcorePackage.getEDouble(), "minZ", "-1", 0, 1, PointsRangeGager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointsRangeGager_MaxZ(), theEcorePackage.getEDouble(), "maxZ", "1", 0, 1, PointsRangeGager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uniquePointsFilterEClass, UniquePointsFilter.class, "UniquePointsFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(triangleEdgeLenghtTriangularMeshFilterEClass, TriangleEdgeLenghtTriangularMeshFilter.class, "TriangleEdgeLenghtTriangularMeshFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriangleEdgeLenghtTriangularMeshFilter_MinimumRange(), theEcorePackage.getEDouble(), "minimumRange", null, 0, 1, TriangleEdgeLenghtTriangularMeshFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriangleEdgeLenghtTriangularMeshFilter_MaximumRange(), ecorePackage.getEDouble(), "maximumRange", null, 0, 1, TriangleEdgeLenghtTriangularMeshFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriangleEdgeLenghtTriangularMeshFilter_MaximumEdgeLenght(), ecorePackage.getEDouble(), "maximumEdgeLenght", null, 0, 1, TriangleEdgeLenghtTriangularMeshFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTriangleEdgeLenghtTriangularMeshFilter__Filter__CartesianTriangularMesh(), this.getCartesianTriangularMesh(), "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(outlierFilterEClass, OutlierFilter.class, "OutlierFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutlierFilter_MaxDistance(), theEcorePackage.getEDouble(), "maxDistance", null, 0, 1, OutlierFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rasterPointCloudEClass, RasterPointCloud.class, "RasterPointCloud", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRasterPointCloud_Rows(), theEcorePackage.getEInt(), "rows", "1", 0, 1, RasterPointCloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRasterPointCloud_Columns(), theEcorePackage.getEInt(), "columns", "1", 0, 1, RasterPointCloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRasterPointCloud__GetPoint__int_int(), this.getCartesianPositionCoordinates(), "getPoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "column", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRasterPointCloud__SetPoint__int_int_CartesianPositionCoordinates(), null, "setPoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "column", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "point", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rasterPointCloudToCartesianCoordinatesSetEClass, RasterPointCloudToCartesianCoordinatesSet.class, "RasterPointCloudToCartesianCoordinatesSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(meshSmootherEClass, MeshSmoother.class, "MeshSmoother", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeshSmoother_NumberOfIterations(), theEcorePackage.getEInt(), "numberOfIterations", null, 0, 1, MeshSmoother.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voxelBased3DPointCloudResamplerEClass, VoxelBased3DPointCloudResampler.class, "VoxelBased3DPointCloudResampler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVoxelBased3DPointCloudResampler_ResolutionX(), theEcorePackage.getEDouble(), "resolutionX", "0.1", 0, 1, VoxelBased3DPointCloudResampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoxelBased3DPointCloudResampler_ResolutionY(), theEcorePackage.getEDouble(), "resolutionY", "0.1", 0, 1, VoxelBased3DPointCloudResampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoxelBased3DPointCloudResampler_ResolutionZ(), theEcorePackage.getEDouble(), "resolutionZ", "0.05", 0, 1, VoxelBased3DPointCloudResampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoxelBased3DPointCloudResampler_MinimumNumberOfPointPerVoxel(), theEcorePackage.getEInt(), "minimumNumberOfPointPerVoxel", "1", 0, 1, VoxelBased3DPointCloudResampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoxelBased3DPointCloudResampler_TileResolution(), theEcorePackage.getEDouble(), "tileResolution", "5.0", 0, 1, VoxelBased3DPointCloudResampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rigidBodyPoseTrackerEClass, RigidBodyPoseTracker.class, "RigidBodyPoseTracker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRigidBodyPoseTracker_PositionMarkersAtOrigin(), this.getPositionMarker(), null, "positionMarkersAtOrigin", null, 0, -1, RigidBodyPoseTracker.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRigidBodyPoseTracker__ComputeTransformation__EList(), this.getPoint3d(), "computeTransformation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPositionMarker(), "markerPositionsToTrack", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theProcessorsPackage.getException());

		op = initEOperation(getRigidBodyPoseTracker__AddPositionMarkers__List(), null, "addPositionMarkers", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theDataPackage.getList());
		g2 = createEGenericType(this.getPositionMarker());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "marker", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theProcessorsPackage.getException());

		op = initEOperation(getRigidBodyPoseTracker__RemovePositionMarkers__List(), null, "removePositionMarkers", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theDataPackage.getList());
		g2 = createEGenericType(this.getPositionMarker());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "markers", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(positionMarkerEClass, PositionMarker.class, "PositionMarker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositionMarker_Identifier(), theEcorePackage.getEString(), "identifier", null, 0, 1, PositionMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cubeSamplingShapeEClass, CubeSamplingShape.class, "CubeSamplingShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCubeSamplingShape_IncludeJustTouching(), theEcorePackage.getEBoolean(), "includeJustTouching", "true", 0, 1, CubeSamplingShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCubeSamplingShape_Corner1(), this.getCartesianPositionCoordinates(), null, "corner1", null, 0, 1, CubeSamplingShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCubeSamplingShape_Corner2(), this.getCartesianPositionCoordinates(), null, "corner2", null, 0, 1, CubeSamplingShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartesianCoordinatesSetExtentEClass, CartesianCoordinatesSetExtent.class, "CartesianCoordinatesSetExtent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCartesianCoordinatesSetExtent_XMin(), theEcorePackage.getEDouble(), "xMin", null, 0, 1, CartesianCoordinatesSetExtent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianCoordinatesSetExtent_XMax(), theEcorePackage.getEDouble(), "xMax", null, 0, 1, CartesianCoordinatesSetExtent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianCoordinatesSetExtent_YMin(), theEcorePackage.getEDouble(), "yMin", null, 0, 1, CartesianCoordinatesSetExtent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianCoordinatesSetExtent_YMax(), theEcorePackage.getEDouble(), "yMax", null, 0, 1, CartesianCoordinatesSetExtent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianCoordinatesSetExtent_ZMin(), theEcorePackage.getEDouble(), "zMin", null, 0, 1, CartesianCoordinatesSetExtent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianCoordinatesSetExtent_ZMax(), theEcorePackage.getEDouble(), "zMax", null, 0, 1, CartesianCoordinatesSetExtent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianCoordinatesSetExtent_XDimension(), theEcorePackage.getEDouble(), "xDimension", null, 0, 1, CartesianCoordinatesSetExtent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianCoordinatesSetExtent_YDimension(), theEcorePackage.getEDouble(), "yDimension", null, 0, 1, CartesianCoordinatesSetExtent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianCoordinatesSetExtent_ZDimension(), theEcorePackage.getEDouble(), "zDimension", null, 0, 1, CartesianCoordinatesSetExtent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cartesianAxisEEnum, CartesianAxis.class, "CartesianAxis");
		addEEnumLiteral(cartesianAxisEEnum, CartesianAxis.X);
		addEEnumLiteral(cartesianAxisEEnum, CartesianAxis.Y);
		addEEnumLiteral(cartesianAxisEEnum, CartesianAxis.Z);

		initEEnum(cartesianPlaneEEnum, CartesianPlane.class, "CartesianPlane");
		addEEnumLiteral(cartesianPlaneEEnum, CartesianPlane.XY);
		addEEnumLiteral(cartesianPlaneEEnum, CartesianPlane.XZ);
		addEEnumLiteral(cartesianPlaneEEnum, CartesianPlane.YZ);

		initEEnum(meshinG_PLANEEEnum, ca.gc.space.mrt.geometry.data3d.MESHING_PLANE.class, "MESHING_PLANE");
		addEEnumLiteral(meshinG_PLANEEEnum, ca.gc.space.mrt.geometry.data3d.MESHING_PLANE.XY);
		addEEnumLiteral(meshinG_PLANEEEnum, ca.gc.space.mrt.geometry.data3d.MESHING_PLANE.YZ);
		addEEnumLiteral(meshinG_PLANEEEnum, ca.gc.space.mrt.geometry.data3d.MESHING_PLANE.XZ);

		// Initialize data types
		initEDataType(inputStreamEDataType, InputStream.class, "InputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ioExceptionEDataType, IOException.class, "IOException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(outputStreamEDataType, OutputStream.class, "OutputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(matrix4dEDataType, Matrix4d.class, "Matrix4d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(vector3dEDataType, Vector3d.class, "Vector3d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(point3dEDataType, Point3d.class, "Point3d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(doubleArrayOfArrayEDataType, double[][].class, "DoubleArrayOfArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(intArrayEDataType, int[].class, "IntArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(gVectorEDataType, GVector.class, "GVector", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // Data3dPackageImpl
