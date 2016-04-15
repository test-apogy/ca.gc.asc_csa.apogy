/**
 * Canadian Space Agency / Agence spatiale canadienne 2016 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.ros.data3d.impl;

import ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade;
import ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFactory;
import ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dPackage;

import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;

import geometry_msgs.Point;
import geometry_msgs.Pose;
import geometry_msgs.Quaternion;

import java.nio.ByteBuffer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ros.message.MessageFactory;
import sensor_msgs.PointCloud2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsROSData3dPackageImpl extends EPackageImpl implements ApogyAddonsROSData3dPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyAddonsROSData3dFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pointCloud2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType byteBufferEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageFactoryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rosPointEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rosQuaternionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rosPoseEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyAddonsROSData3dPackageImpl() {
		super(eNS_URI, ApogyAddonsROSData3dFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ApogyAddonsROSData3dPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyAddonsROSData3dPackage init() {
		if (isInited) return (ApogyAddonsROSData3dPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsROSData3dPackage.eNS_URI);

		// Obtain or create and register package
		ApogyAddonsROSData3dPackageImpl theApogyAddonsROSData3dPackage = (ApogyAddonsROSData3dPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyAddonsROSData3dPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyAddonsROSData3dPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCommonGeometryData3DPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyAddonsROSData3dPackage.createPackageContents();

		// Initialize created meta-data
		theApogyAddonsROSData3dPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyAddonsROSData3dPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyAddonsROSData3dPackage.eNS_URI, theApogyAddonsROSData3dPackage);
		return theApogyAddonsROSData3dPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyAddonsROSData3dFacade() {
		return apogyAddonsROSData3dFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsROSData3dFacade__ConvertToCartesianPositionCoordinates__Point() {
		return apogyAddonsROSData3dFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsROSData3dFacade__ConvertToROSPoint__CartesianPositionCoordinates_MessageFactory() {
		return apogyAddonsROSData3dFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsROSData3dFacade__ConvertToROSQuaternion__CartesianOrientationCoordinates() {
		return apogyAddonsROSData3dFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsROSData3dFacade__ConvertToCartesianOrientationCoordinates__Quaternion() {
		return apogyAddonsROSData3dFacadeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsROSData3dFacade__ConvertToPose__Pose() {
		return apogyAddonsROSData3dFacadeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsROSData3dFacade__ConvertToROSPose__Pose_MessageFactory() {
		return apogyAddonsROSData3dFacadeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsROSData3dFacade__RosPointCloudToCartesianCoordinateSet__PointCloud2() {
		return apogyAddonsROSData3dFacadeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsROSData3dFacade__ReadRGBCartesianPositionCoordinates__ByteBuffer() {
		return apogyAddonsROSData3dFacadeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsROSData3dFacade__ReadCartesianPositionCoordinates__ByteBuffer() {
		return apogyAddonsROSData3dFacadeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsROSData3dFacade__CartesianCoordinateSetToRosPointCloud__CartesianCoordinatesSet_MessageFactory() {
		return apogyAddonsROSData3dFacadeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPointCloud2() {
		return pointCloud2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getByteBuffer() {
		return byteBufferEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMessageFactory() {
		return messageFactoryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getROSPoint() {
		return rosPointEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getROSQuaternion() {
		return rosQuaternionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getROSPose() {
		return rosPoseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsROSData3dFactory getApogyAddonsROSData3dFactory() {
		return (ApogyAddonsROSData3dFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
		apogyAddonsROSData3dFacadeEClass = createEClass(APOGY_ADDONS_ROS_DATA3D_FACADE);
		createEOperation(apogyAddonsROSData3dFacadeEClass, APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_CARTESIAN_POSITION_COORDINATES__POINT);
		createEOperation(apogyAddonsROSData3dFacadeEClass, APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_ROS_POINT__CARTESIANPOSITIONCOORDINATES_MESSAGEFACTORY);
		createEOperation(apogyAddonsROSData3dFacadeEClass, APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_ROS_QUATERNION__CARTESIANORIENTATIONCOORDINATES);
		createEOperation(apogyAddonsROSData3dFacadeEClass, APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_CARTESIAN_ORIENTATION_COORDINATES__QUATERNION);
		createEOperation(apogyAddonsROSData3dFacadeEClass, APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_POSE__POSE);
		createEOperation(apogyAddonsROSData3dFacadeEClass, APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_ROS_POSE__POSE_MESSAGEFACTORY);
		createEOperation(apogyAddonsROSData3dFacadeEClass, APOGY_ADDONS_ROS_DATA3D_FACADE___ROS_POINT_CLOUD_TO_CARTESIAN_COORDINATE_SET__POINTCLOUD2);
		createEOperation(apogyAddonsROSData3dFacadeEClass, APOGY_ADDONS_ROS_DATA3D_FACADE___READ_RGB_CARTESIAN_POSITION_COORDINATES__BYTEBUFFER);
		createEOperation(apogyAddonsROSData3dFacadeEClass, APOGY_ADDONS_ROS_DATA3D_FACADE___READ_CARTESIAN_POSITION_COORDINATES__BYTEBUFFER);
		createEOperation(apogyAddonsROSData3dFacadeEClass, APOGY_ADDONS_ROS_DATA3D_FACADE___CARTESIAN_COORDINATE_SET_TO_ROS_POINT_CLOUD__CARTESIANCOORDINATESSET_MESSAGEFACTORY);

		// Create data types
		pointCloud2EDataType = createEDataType(POINT_CLOUD2);
		byteBufferEDataType = createEDataType(BYTE_BUFFER);
		messageFactoryEDataType = createEDataType(MESSAGE_FACTORY);
		rosPointEDataType = createEDataType(ROS_POINT);
		rosQuaternionEDataType = createEDataType(ROS_QUATERNION);
		rosPoseEDataType = createEDataType(ROS_POSE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
		ApogyCommonGeometryData3DPackage theApogyCommonGeometryData3DPackage = (ApogyCommonGeometryData3DPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonGeometryData3DPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(apogyAddonsROSData3dFacadeEClass, ApogyAddonsROSData3dFacade.class, "ApogyAddonsROSData3dFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getApogyAddonsROSData3dFacade__ConvertToCartesianPositionCoordinates__Point(), theApogyCommonGeometryData3DPackage.getCartesianPositionCoordinates(), "convertToCartesianPositionCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getROSPoint(), "rosPoint", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyAddonsROSData3dFacade__ConvertToROSPoint__CartesianPositionCoordinates_MessageFactory(), this.getROSPoint(), "convertToROSPoint", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonGeometryData3DPackage.getCartesianPositionCoordinates(), "point", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMessageFactory(), "messageFactory", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyAddonsROSData3dFacade__ConvertToROSQuaternion__CartesianOrientationCoordinates(), this.getROSQuaternion(), "convertToROSQuaternion", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonGeometryData3DPackage.getCartesianOrientationCoordinates(), "orientation", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyAddonsROSData3dFacade__ConvertToCartesianOrientationCoordinates__Quaternion(), theApogyCommonGeometryData3DPackage.getCartesianOrientationCoordinates(), "convertToCartesianOrientationCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getROSQuaternion(), "rosQuaternion", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyAddonsROSData3dFacade__ConvertToPose__Pose(), theApogyCommonGeometryData3DPackage.getPose(), "convertToPose", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getROSPose(), "rosPose", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyAddonsROSData3dFacade__ConvertToROSPose__Pose_MessageFactory(), this.getROSPose(), "convertToROSPose", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonGeometryData3DPackage.getPose(), "pose", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMessageFactory(), "messageFactory", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyAddonsROSData3dFacade__RosPointCloudToCartesianCoordinateSet__PointCloud2(), theApogyCommonGeometryData3DPackage.getColoredCartesianCoordinatesSet(), "rosPointCloudToCartesianCoordinateSet", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPointCloud2(), "pointCloud2", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyAddonsROSData3dFacade__ReadRGBCartesianPositionCoordinates__ByteBuffer(), theApogyCommonGeometryData3DPackage.getColoredCartesianPositionCoordinates(), "readRGBCartesianPositionCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getByteBuffer(), "byteBuffer", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyAddonsROSData3dFacade__ReadCartesianPositionCoordinates__ByteBuffer(), theApogyCommonGeometryData3DPackage.getCartesianPositionCoordinates(), "readCartesianPositionCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getByteBuffer(), "byteBuffer", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyAddonsROSData3dFacade__CartesianCoordinateSetToRosPointCloud__CartesianCoordinatesSet_MessageFactory(), this.getPointCloud2(), "cartesianCoordinateSetToRosPointCloud", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonGeometryData3DPackage.getCartesianCoordinatesSet(), "map", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMessageFactory(), "messageFactory", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(pointCloud2EDataType, PointCloud2.class, "PointCloud2", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(byteBufferEDataType, ByteBuffer.class, "ByteBuffer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(messageFactoryEDataType, MessageFactory.class, "MessageFactory", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rosPointEDataType, Point.class, "ROSPoint", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rosQuaternionEDataType, Quaternion.class, "ROSQuaternion", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rosPoseEDataType, Pose.class, "ROSPose", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyAddonsROSData3dPackageImpl
