/**
 * Canadian Space Agency / Agence spatiale canadienne 2016 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.ros.data3d;

import java.nio.ByteBuffer;

import org.eclipse.emf.ecore.EObject;
import org.ros.message.MessageFactory;
import ca.gc.asc_csa.apogy.addons.ros.data3d.impl.ApogyAddonsROSData3dFacadeImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Pose;
import geometry_msgs.Point;
import geometry_msgs.Quaternion;
import sensor_msgs.PointCloud2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A facade used ton convert to and from ROS Types for types defined in ca.gc.asc_csa.apogy.common.geometry.data3d.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dPackage#getApogyAddonsROSData3dFacade()
 * @model
 * @generated
 */
public interface ApogyAddonsROSData3dFacade extends EObject 
{
	public static final ApogyAddonsROSData3dFacade INSTANCE = ApogyAddonsROSData3dFacadeImpl.getInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" rosPointDataType="ca.gc.asc_csa.apogy.addons.ros.data3d.ROSPoint" rosPointUnique="false"
	 * @generated
	 */
	CartesianPositionCoordinates convertToCartesianPositionCoordinates(Point rosPoint);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.addons.ros.data3d.ROSPoint" unique="false" pointUnique="false" messageFactoryDataType="ca.gc.asc_csa.apogy.addons.ros.data3d.MessageFactory" messageFactoryUnique="false"
	 * @generated
	 */
	Point convertToROSPoint(CartesianPositionCoordinates point, MessageFactory messageFactory);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.addons.ros.data3d.ROSQuaternion" unique="false" orientationUnique="false"
	 * @generated
	 */
	Quaternion convertToROSQuaternion(CartesianOrientationCoordinates orientation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" rosQuaternionDataType="ca.gc.asc_csa.apogy.addons.ros.data3d.ROSQuaternion" rosQuaternionUnique="false"
	 * @generated
	 */
	CartesianOrientationCoordinates convertToCartesianOrientationCoordinates(Quaternion rosQuaternion);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" rosPoseDataType="ca.gc.asc_csa.apogy.addons.ros.data3d.ROSPose" rosPoseUnique="false"
	 * @generated
	 */
	Pose convertToPose(geometry_msgs.Pose rosPose);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.addons.ros.data3d.ROSPose" unique="false" poseUnique="false" messageFactoryDataType="ca.gc.asc_csa.apogy.addons.ros.data3d.MessageFactory" messageFactoryUnique="false"
	 * @generated
	 */
	geometry_msgs.Pose convertToROSPose(Pose pose, MessageFactory messageFactory);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" pointCloud2DataType="ca.gc.asc_csa.apogy.addons.ros.data3d.PointCloud2" pointCloud2Unique="false"
	 * @generated
	 */
	CartesianCoordinatesSet rosPointCloudToCartesianCoordinateSet(PointCloud2 pointCloud2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" byteBufferDataType="ca.gc.asc_csa.apogy.addons.ros.data3d.ByteBuffer" byteBufferUnique="false"
	 * @generated
	 */
	ColoredCartesianPositionCoordinates readRGBCartesianPositionCoordinates(ByteBuffer byteBuffer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" byteBufferDataType="ca.gc.asc_csa.apogy.addons.ros.data3d.ByteBuffer" byteBufferUnique="false"
	 * @generated
	 */
	CartesianPositionCoordinates readCartesianPositionCoordinates(ByteBuffer byteBuffer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.addons.ros.data3d.PointCloud2" unique="false" mapUnique="false" messageFactoryDataType="ca.gc.asc_csa.apogy.addons.ros.data3d.MessageFactory" messageFactoryUnique="false"
	 * @generated
	 */
	PointCloud2 cartesianCoordinateSetToRosPointCloud(CartesianCoordinatesSet map, MessageFactory messageFactory);

} // ApogyAddonsROSData3dFacade
