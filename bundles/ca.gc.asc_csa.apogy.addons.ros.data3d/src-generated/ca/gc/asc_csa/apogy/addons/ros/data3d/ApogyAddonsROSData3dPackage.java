/**
 * Canadian Space Agency / Agence spatiale canadienne 2016 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.ros.data3d;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
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
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyAddonsROSData3d' modelName='ApogyAddonsROSData3d' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2016 Copyrights (c)' modelDirectory='/ca.gc.asc_csa.apogy.addons.ros.data3d/src-generated' editDirectory='/ca.gc.asc_csa.apogy.addons.ros.data3d.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.addons.ros'"
 * @generated
 */
public interface ApogyAddonsROSData3dPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data3d";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.addons.ros.data3d";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "data3d";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyAddonsROSData3dPackage eINSTANCE = ca.gc.asc_csa.apogy.addons.ros.data3d.impl.ApogyAddonsROSData3dPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.ros.data3d.impl.ApogyAddonsROSData3dFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.impl.ApogyAddonsROSData3dFacadeImpl
	 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.impl.ApogyAddonsROSData3dPackageImpl#getApogyAddonsROSData3dFacade()
	 * @generated
	 */
	int APOGY_ADDONS_ROS_DATA3D_FACADE = 0;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_DATA3D_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Convert To Cartesian Position Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_CARTESIAN_POSITION_COORDINATES__POINT = 0;

	/**
	 * The operation id for the '<em>Convert To ROS Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_ROS_POINT__CARTESIANPOSITIONCOORDINATES_MESSAGEFACTORY = 1;

	/**
	 * The operation id for the '<em>Convert To ROS Quaternion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_ROS_QUATERNION__CARTESIANORIENTATIONCOORDINATES = 2;

	/**
	 * The operation id for the '<em>Convert To Cartesian Orientation Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_CARTESIAN_ORIENTATION_COORDINATES__QUATERNION = 3;

	/**
	 * The operation id for the '<em>Convert To Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_POSE__POSE = 4;

	/**
	 * The operation id for the '<em>Convert To ROS Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_ROS_POSE__POSE_MESSAGEFACTORY = 5;

	/**
	 * The operation id for the '<em>Ros Point Cloud To Cartesian Coordinate Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_DATA3D_FACADE___ROS_POINT_CLOUD_TO_CARTESIAN_COORDINATE_SET__POINTCLOUD2 = 6;

	/**
	 * The operation id for the '<em>Read RGB Cartesian Position Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_DATA3D_FACADE___READ_RGB_CARTESIAN_POSITION_COORDINATES__BYTEBUFFER = 7;

	/**
	 * The operation id for the '<em>Read Cartesian Position Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_DATA3D_FACADE___READ_CARTESIAN_POSITION_COORDINATES__BYTEBUFFER = 8;

	/**
	 * The operation id for the '<em>Cartesian Coordinate Set To Ros Point Cloud</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_DATA3D_FACADE___CARTESIAN_COORDINATE_SET_TO_ROS_POINT_CLOUD__CARTESIANCOORDINATESSET_MESSAGEFACTORY = 9;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_DATA3D_FACADE_OPERATION_COUNT = 10;

	/**
	 * The meta object id for the '<em>Point Cloud2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensor_msgs.PointCloud2
	 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.impl.ApogyAddonsROSData3dPackageImpl#getPointCloud2()
	 * @generated
	 */
	int POINT_CLOUD2 = 1;

	/**
	 * The meta object id for the '<em>Byte Buffer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.nio.ByteBuffer
	 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.impl.ApogyAddonsROSData3dPackageImpl#getByteBuffer()
	 * @generated
	 */
	int BYTE_BUFFER = 2;

	/**
	 * The meta object id for the '<em>Message Factory</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.message.MessageFactory
	 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.impl.ApogyAddonsROSData3dPackageImpl#getMessageFactory()
	 * @generated
	 */
	int MESSAGE_FACTORY = 3;

	/**
	 * The meta object id for the '<em>ROS Point</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry_msgs.Point
	 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.impl.ApogyAddonsROSData3dPackageImpl#getROSPoint()
	 * @generated
	 */
	int ROS_POINT = 4;

	/**
	 * The meta object id for the '<em>ROS Quaternion</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry_msgs.Quaternion
	 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.impl.ApogyAddonsROSData3dPackageImpl#getROSQuaternion()
	 * @generated
	 */
	int ROS_QUATERNION = 5;

	/**
	 * The meta object id for the '<em>ROS Pose</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry_msgs.Pose
	 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.impl.ApogyAddonsROSData3dPackageImpl#getROSPose()
	 * @generated
	 */
	int ROS_POSE = 6;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade
	 * @generated
	 */
	EClass getApogyAddonsROSData3dFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade#convertToCartesianPositionCoordinates(geometry_msgs.Point) <em>Convert To Cartesian Position Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Cartesian Position Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade#convertToCartesianPositionCoordinates(geometry_msgs.Point)
	 * @generated
	 */
	EOperation getApogyAddonsROSData3dFacade__ConvertToCartesianPositionCoordinates__Point();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade#convertToROSPoint(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, org.ros.message.MessageFactory) <em>Convert To ROS Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To ROS Point</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade#convertToROSPoint(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, org.ros.message.MessageFactory)
	 * @generated
	 */
	EOperation getApogyAddonsROSData3dFacade__ConvertToROSPoint__CartesianPositionCoordinates_MessageFactory();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade#convertToROSQuaternion(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates) <em>Convert To ROS Quaternion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To ROS Quaternion</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade#convertToROSQuaternion(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates)
	 * @generated
	 */
	EOperation getApogyAddonsROSData3dFacade__ConvertToROSQuaternion__CartesianOrientationCoordinates();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade#convertToCartesianOrientationCoordinates(geometry_msgs.Quaternion) <em>Convert To Cartesian Orientation Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Cartesian Orientation Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade#convertToCartesianOrientationCoordinates(geometry_msgs.Quaternion)
	 * @generated
	 */
	EOperation getApogyAddonsROSData3dFacade__ConvertToCartesianOrientationCoordinates__Quaternion();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade#convertToPose(geometry_msgs.Pose) <em>Convert To Pose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Pose</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade#convertToPose(geometry_msgs.Pose)
	 * @generated
	 */
	EOperation getApogyAddonsROSData3dFacade__ConvertToPose__Pose();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade#convertToROSPose(ca.gc.asc_csa.apogy.common.geometry.data3d.Pose, org.ros.message.MessageFactory) <em>Convert To ROS Pose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To ROS Pose</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade#convertToROSPose(ca.gc.asc_csa.apogy.common.geometry.data3d.Pose, org.ros.message.MessageFactory)
	 * @generated
	 */
	EOperation getApogyAddonsROSData3dFacade__ConvertToROSPose__Pose_MessageFactory();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade#rosPointCloudToCartesianCoordinateSet(sensor_msgs.PointCloud2) <em>Ros Point Cloud To Cartesian Coordinate Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ros Point Cloud To Cartesian Coordinate Set</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade#rosPointCloudToCartesianCoordinateSet(sensor_msgs.PointCloud2)
	 * @generated
	 */
	EOperation getApogyAddonsROSData3dFacade__RosPointCloudToCartesianCoordinateSet__PointCloud2();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade#readRGBCartesianPositionCoordinates(java.nio.ByteBuffer) <em>Read RGB Cartesian Position Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read RGB Cartesian Position Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade#readRGBCartesianPositionCoordinates(java.nio.ByteBuffer)
	 * @generated
	 */
	EOperation getApogyAddonsROSData3dFacade__ReadRGBCartesianPositionCoordinates__ByteBuffer();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade#readCartesianPositionCoordinates(java.nio.ByteBuffer) <em>Read Cartesian Position Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Cartesian Position Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade#readCartesianPositionCoordinates(java.nio.ByteBuffer)
	 * @generated
	 */
	EOperation getApogyAddonsROSData3dFacade__ReadCartesianPositionCoordinates__ByteBuffer();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade#cartesianCoordinateSetToRosPointCloud(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, org.ros.message.MessageFactory) <em>Cartesian Coordinate Set To Ros Point Cloud</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cartesian Coordinate Set To Ros Point Cloud</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade#cartesianCoordinateSetToRosPointCloud(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, org.ros.message.MessageFactory)
	 * @generated
	 */
	EOperation getApogyAddonsROSData3dFacade__CartesianCoordinateSetToRosPointCloud__CartesianCoordinatesSet_MessageFactory();

	/**
	 * Returns the meta object for data type '{@link sensor_msgs.PointCloud2 <em>Point Cloud2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point Cloud2</em>'.
	 * @see sensor_msgs.PointCloud2
	 * @model instanceClass="sensor_msgs.PointCloud2"
	 * @generated
	 */
	EDataType getPointCloud2();

	/**
	 * Returns the meta object for data type '{@link java.nio.ByteBuffer <em>Byte Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Byte Buffer</em>'.
	 * @see java.nio.ByteBuffer
	 * @model instanceClass="java.nio.ByteBuffer"
	 * @generated
	 */
	EDataType getByteBuffer();

	/**
	 * Returns the meta object for data type '{@link org.ros.message.MessageFactory <em>Message Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Factory</em>'.
	 * @see org.ros.message.MessageFactory
	 * @model instanceClass="org.ros.message.MessageFactory"
	 * @generated
	 */
	EDataType getMessageFactory();

	/**
	 * Returns the meta object for data type '{@link geometry_msgs.Point <em>ROS Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ROS Point</em>'.
	 * @see geometry_msgs.Point
	 * @model instanceClass="geometry_msgs.Point"
	 * @generated
	 */
	EDataType getROSPoint();

	/**
	 * Returns the meta object for data type '{@link geometry_msgs.Quaternion <em>ROS Quaternion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ROS Quaternion</em>'.
	 * @see geometry_msgs.Quaternion
	 * @model instanceClass="geometry_msgs.Quaternion"
	 * @generated
	 */
	EDataType getROSQuaternion();

	/**
	 * Returns the meta object for data type '{@link geometry_msgs.Pose <em>ROS Pose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ROS Pose</em>'.
	 * @see geometry_msgs.Pose
	 * @model instanceClass="geometry_msgs.Pose"
	 * @generated
	 */
	EDataType getROSPose();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyAddonsROSData3dFactory getApogyAddonsROSData3dFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.ros.data3d.impl.ApogyAddonsROSData3dFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.impl.ApogyAddonsROSData3dFacadeImpl
		 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.impl.ApogyAddonsROSData3dPackageImpl#getApogyAddonsROSData3dFacade()
		 * @generated
		 */
		EClass APOGY_ADDONS_ROS_DATA3D_FACADE = eINSTANCE.getApogyAddonsROSData3dFacade();

		/**
		 * The meta object literal for the '<em><b>Convert To Cartesian Position Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_CARTESIAN_POSITION_COORDINATES__POINT = eINSTANCE.getApogyAddonsROSData3dFacade__ConvertToCartesianPositionCoordinates__Point();

		/**
		 * The meta object literal for the '<em><b>Convert To ROS Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_ROS_POINT__CARTESIANPOSITIONCOORDINATES_MESSAGEFACTORY = eINSTANCE.getApogyAddonsROSData3dFacade__ConvertToROSPoint__CartesianPositionCoordinates_MessageFactory();

		/**
		 * The meta object literal for the '<em><b>Convert To ROS Quaternion</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_ROS_QUATERNION__CARTESIANORIENTATIONCOORDINATES = eINSTANCE.getApogyAddonsROSData3dFacade__ConvertToROSQuaternion__CartesianOrientationCoordinates();

		/**
		 * The meta object literal for the '<em><b>Convert To Cartesian Orientation Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_CARTESIAN_ORIENTATION_COORDINATES__QUATERNION = eINSTANCE.getApogyAddonsROSData3dFacade__ConvertToCartesianOrientationCoordinates__Quaternion();

		/**
		 * The meta object literal for the '<em><b>Convert To Pose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_POSE__POSE = eINSTANCE.getApogyAddonsROSData3dFacade__ConvertToPose__Pose();

		/**
		 * The meta object literal for the '<em><b>Convert To ROS Pose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_ROS_POSE__POSE_MESSAGEFACTORY = eINSTANCE.getApogyAddonsROSData3dFacade__ConvertToROSPose__Pose_MessageFactory();

		/**
		 * The meta object literal for the '<em><b>Ros Point Cloud To Cartesian Coordinate Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_ADDONS_ROS_DATA3D_FACADE___ROS_POINT_CLOUD_TO_CARTESIAN_COORDINATE_SET__POINTCLOUD2 = eINSTANCE.getApogyAddonsROSData3dFacade__RosPointCloudToCartesianCoordinateSet__PointCloud2();

		/**
		 * The meta object literal for the '<em><b>Read RGB Cartesian Position Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_ADDONS_ROS_DATA3D_FACADE___READ_RGB_CARTESIAN_POSITION_COORDINATES__BYTEBUFFER = eINSTANCE.getApogyAddonsROSData3dFacade__ReadRGBCartesianPositionCoordinates__ByteBuffer();

		/**
		 * The meta object literal for the '<em><b>Read Cartesian Position Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_ADDONS_ROS_DATA3D_FACADE___READ_CARTESIAN_POSITION_COORDINATES__BYTEBUFFER = eINSTANCE.getApogyAddonsROSData3dFacade__ReadCartesianPositionCoordinates__ByteBuffer();

		/**
		 * The meta object literal for the '<em><b>Cartesian Coordinate Set To Ros Point Cloud</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_ADDONS_ROS_DATA3D_FACADE___CARTESIAN_COORDINATE_SET_TO_ROS_POINT_CLOUD__CARTESIANCOORDINATESSET_MESSAGEFACTORY = eINSTANCE.getApogyAddonsROSData3dFacade__CartesianCoordinateSetToRosPointCloud__CartesianCoordinatesSet_MessageFactory();

		/**
		 * The meta object literal for the '<em>Point Cloud2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensor_msgs.PointCloud2
		 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.impl.ApogyAddonsROSData3dPackageImpl#getPointCloud2()
		 * @generated
		 */
		EDataType POINT_CLOUD2 = eINSTANCE.getPointCloud2();

		/**
		 * The meta object literal for the '<em>Byte Buffer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.nio.ByteBuffer
		 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.impl.ApogyAddonsROSData3dPackageImpl#getByteBuffer()
		 * @generated
		 */
		EDataType BYTE_BUFFER = eINSTANCE.getByteBuffer();

		/**
		 * The meta object literal for the '<em>Message Factory</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.message.MessageFactory
		 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.impl.ApogyAddonsROSData3dPackageImpl#getMessageFactory()
		 * @generated
		 */
		EDataType MESSAGE_FACTORY = eINSTANCE.getMessageFactory();

		/**
		 * The meta object literal for the '<em>ROS Point</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry_msgs.Point
		 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.impl.ApogyAddonsROSData3dPackageImpl#getROSPoint()
		 * @generated
		 */
		EDataType ROS_POINT = eINSTANCE.getROSPoint();

		/**
		 * The meta object literal for the '<em>ROS Quaternion</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry_msgs.Quaternion
		 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.impl.ApogyAddonsROSData3dPackageImpl#getROSQuaternion()
		 * @generated
		 */
		EDataType ROS_QUATERNION = eINSTANCE.getROSQuaternion();

		/**
		 * The meta object literal for the '<em>ROS Pose</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry_msgs.Pose
		 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.impl.ApogyAddonsROSData3dPackageImpl#getROSPose()
		 * @generated
		 */
		EDataType ROS_POSE = eINSTANCE.getROSPose();

	}

} //ApogyAddonsROSData3dPackage
