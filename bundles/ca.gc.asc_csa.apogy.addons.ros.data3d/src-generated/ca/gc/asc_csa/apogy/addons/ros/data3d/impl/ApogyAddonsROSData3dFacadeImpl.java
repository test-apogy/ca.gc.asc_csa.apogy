/**
 * Canadian Space Agency / Agence spatiale canadienne 2016 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.ros.data3d.impl;

import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.ros.message.MessageFactory;
import ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade;
import ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
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
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyAddonsROSData3dFacadeImpl extends MinimalEObjectImpl.Container implements ApogyAddonsROSData3dFacade 
{
	private static ApogyAddonsROSData3dFacade instance;

	public static ApogyAddonsROSData3dFacade getInstance()
	{
		if(instance == null)
		{
			instance = new ApogyAddonsROSData3dFacadeImpl();
		}

		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyAddonsROSData3dFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsROSData3dPackage.Literals.APOGY_ADDONS_ROS_DATA3D_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianPositionCoordinates convertToCartesianPositionCoordinates(Point rosPoint) 
	{
		return ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(rosPoint.getX(), rosPoint.getY(), rosPoint.getZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Point convertToROSPoint(CartesianPositionCoordinates point, MessageFactory messageFactory) 
	{
		Point p = messageFactory.newFromType(Point._TYPE);
		
		p.setX(point.getX());
		p.setY(point.getY());
		p.setZ(point.getZ());
		
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Quaternion convertToROSQuaternion(CartesianOrientationCoordinates orientation) 
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianOrientationCoordinates convertToCartesianOrientationCoordinates(Quaternion rosQuaternion) 
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Pose convertToPose(geometry_msgs.Pose rosPose) 
	{
		Pose pose = ApogyCommonGeometryData3DFactory.eINSTANCE.createPose();
		
		pose.setX(rosPose.getPosition().getX());
		pose.setY(rosPose.getPosition().getY());
		pose.setZ(rosPose.getPosition().getZ());
		
		CartesianOrientationCoordinates rot = convertToCartesianOrientationCoordinates(rosPose.getOrientation());
		pose.setXRotation(rot.getXRotation());
		pose.setYRotation(rot.getYRotation());
		pose.setZRotation(rot.getZRotation());
		
		return pose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public geometry_msgs.Pose convertToROSPose(Pose pose, MessageFactory messageFactory) 
	{
		Point position = convertToROSPoint(pose, messageFactory);
		Quaternion orientation = convertToROSQuaternion(pose);
		
		geometry_msgs.Pose rosPose = messageFactory.newFromType(geometry_msgs.Pose._TYPE);
		rosPose.setPosition(position);
		rosPose.setOrientation(orientation);
		
		return rosPose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianCoordinatesSet rosPointCloudToCartesianCoordinateSet(PointCloud2 pointCloud2) 
	{
		CartesianCoordinatesSet coordinates = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSet();
		List<CartesianPositionCoordinates> points = new ArrayList<CartesianPositionCoordinates>();
		
		int count = pointCloud2.getData().capacity() / pointCloud2.getPointStep();
		ByteBuffer bb = ByteBuffer.wrap(pointCloud2.getData().array());
		bb.order(pointCloud2.getData().order());
		bb.position(pointCloud2.getData().arrayOffset());
		
		boolean color = (pointCloud2.getFields().size() > 3);
		
		for ( int i = 0; i < count; i ++ )
		{
			CartesianPositionCoordinates coord;
			if ( color )
				coord = readRGBCartesianPositionCoordinates(bb);
			else
				coord = readCartesianPositionCoordinates(bb);
			
			points.add(coord);
		}

		coordinates.getPoints().addAll(points);
		
		return coordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public ColoredCartesianPositionCoordinates readRGBCartesianPositionCoordinates(ByteBuffer byteBuffer) 
	{
		float x = byteBuffer.getFloat();
		float y = byteBuffer.getFloat();
		float z = byteBuffer.getFloat();
		
		byteBuffer.getFloat(); //Skip 4 bytes

		long rgb = byteBuffer.getLong();
		byte red = (byte)(rgb >> 16 & 0x0000ff);
		byte green = (byte)(rgb >> 8 & 0x0000ff);
		byte blue = (byte)(rgb & 0x0000ff);		
		byteBuffer.getLong(); //Skip 8 bytes
		
		return ApogyCommonGeometryData3DFacade.INSTANCE.createColoredCartesianPositionCoordinates(x, y, z, red, green, blue);	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianPositionCoordinates readCartesianPositionCoordinates(ByteBuffer byteBuffer) 
	{
		CartesianPositionCoordinates coord = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(byteBuffer.getFloat(), byteBuffer.getFloat(), byteBuffer.getFloat());
		byteBuffer.getFloat();
		
		return coord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public PointCloud2 cartesianCoordinateSetToRosPointCloud(CartesianCoordinatesSet map, MessageFactory messageFactory) 
	{
		sensor_msgs.PointCloud2 pc = messageFactory.newFromType(sensor_msgs.PointCloud2._TYPE);
		
		sensor_msgs.PointField pfx = messageFactory.newFromType(sensor_msgs.PointField._TYPE);
		pfx.setName("x");
		pfx.setDatatype(sensor_msgs.PointField.FLOAT32);
		pfx.setCount(1);
		
		sensor_msgs.PointField pfy = messageFactory.newFromType(sensor_msgs.PointField._TYPE);
		pfy.setName("y");
		pfy.setDatatype(sensor_msgs.PointField.FLOAT32);
		pfy.setOffset(4);
		pfy.setCount(1);
		
		sensor_msgs.PointField pfz = messageFactory.newFromType(sensor_msgs.PointField._TYPE);
		pfz.setName("z");
		pfz.setDatatype(sensor_msgs.PointField.FLOAT32);
		pfz.setOffset(8);
		pfz.setCount(1);
		
		pc.getFields().add(pfx);
		pc.getFields().add(pfy);
		pc.getFields().add(pfz);
		
		pc.setHeight(1);
		pc.setWidth(map.getPoints().size());
		pc.setIsBigendian(false);
		pc.setIsDense(true);
		pc.setPointStep(16);
		pc.setRowStep(map.getPoints().size() * 16);
		
		
		ChannelBuffer data = ChannelBuffers.buffer(ByteOrder.LITTLE_ENDIAN, map.getPoints().size() * 16);
		
		for ( CartesianPositionCoordinates pt : map.getPoints())
		{
			data.writeFloat((float)pt.getX());
			data.writeFloat((float)pt.getY());
			data.writeFloat((float)pt.getZ());
			data.writeFloat(1.0f);
		}
		
		pc.setData(data);
		
		return pc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyAddonsROSData3dPackage.APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_CARTESIAN_POSITION_COORDINATES__POINT:
				return convertToCartesianPositionCoordinates((Point)arguments.get(0));
			case ApogyAddonsROSData3dPackage.APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_ROS_POINT__CARTESIANPOSITIONCOORDINATES_MESSAGEFACTORY:
				return convertToROSPoint((CartesianPositionCoordinates)arguments.get(0), (MessageFactory)arguments.get(1));
			case ApogyAddonsROSData3dPackage.APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_ROS_QUATERNION__CARTESIANORIENTATIONCOORDINATES:
				return convertToROSQuaternion((CartesianOrientationCoordinates)arguments.get(0));
			case ApogyAddonsROSData3dPackage.APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_CARTESIAN_ORIENTATION_COORDINATES__QUATERNION:
				return convertToCartesianOrientationCoordinates((Quaternion)arguments.get(0));
			case ApogyAddonsROSData3dPackage.APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_POSE__POSE:
				return convertToPose((geometry_msgs.Pose)arguments.get(0));
			case ApogyAddonsROSData3dPackage.APOGY_ADDONS_ROS_DATA3D_FACADE___CONVERT_TO_ROS_POSE__POSE_MESSAGEFACTORY:
				return convertToROSPose((Pose)arguments.get(0), (MessageFactory)arguments.get(1));
			case ApogyAddonsROSData3dPackage.APOGY_ADDONS_ROS_DATA3D_FACADE___ROS_POINT_CLOUD_TO_CARTESIAN_COORDINATE_SET__POINTCLOUD2:
				return rosPointCloudToCartesianCoordinateSet((PointCloud2)arguments.get(0));
			case ApogyAddonsROSData3dPackage.APOGY_ADDONS_ROS_DATA3D_FACADE___READ_RGB_CARTESIAN_POSITION_COORDINATES__BYTEBUFFER:
				return readRGBCartesianPositionCoordinates((ByteBuffer)arguments.get(0));
			case ApogyAddonsROSData3dPackage.APOGY_ADDONS_ROS_DATA3D_FACADE___READ_CARTESIAN_POSITION_COORDINATES__BYTEBUFFER:
				return readCartesianPositionCoordinates((ByteBuffer)arguments.get(0));
			case ApogyAddonsROSData3dPackage.APOGY_ADDONS_ROS_DATA3D_FACADE___CARTESIAN_COORDINATE_SET_TO_ROS_POINT_CLOUD__CARTESIANCOORDINATESSET_MESSAGEFACTORY:
				return cartesianCoordinateSetToRosPointCloud((CartesianCoordinatesSet)arguments.get(0), (MessageFactory)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApogyAddonsROSData3dFacadeImpl
