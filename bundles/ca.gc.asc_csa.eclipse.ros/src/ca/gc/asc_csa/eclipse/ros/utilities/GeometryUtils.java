package ca.gc.asc_csa.eclipse.ros.utilities;

import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;
import javax.vecmath.Quat4d;

import ca.gc.asc_csa.eclipse.ros.RosNode;
import ca.gc.space.math.MathFacade;
import ca.gc.space.math.MathFactory;
import ca.gc.space.math.Matrix4x4;

public class GeometryUtils
{
	/**
	 * Function to convert a ROS pose to a 4x4 matrix
	 * @param rosPose The ROS pose
	 * @return The converted matrix
	 */
	public static Matrix4x4 rosPoseToMatrix(geometry_msgs.Pose rosPose)
	{		
		// Create javax.vecmath quaternion and populate it
		Quat4d quat4dPose = new Quat4d(rosPose.getOrientation().getX(),
				rosPose.getOrientation().getY(),
				rosPose.getOrientation().getZ(),
				rosPose.getOrientation().getW());
		
		// Create the rotation matrix.
		Matrix3d rotationMatrix = new Matrix3d();
		rotationMatrix.setIdentity();
		
		// Populate the rotationMatrix with the quaternion.
		rotationMatrix.set(quat4dPose);
		
		// Create the transform matrix.
		Matrix4d transformMatrix = new Matrix4d();
		transformMatrix.setIdentity();
		
		// Populate the orientation part of the transform matrix.
		transformMatrix.set(rotationMatrix);
						
		// Populate the position part of the transform matrix. 
		transformMatrix.setM03(rosPose.getPosition().getX());		
		transformMatrix.setM13(rosPose.getPosition().getY());
		transformMatrix.setM23(rosPose.getPosition().getZ());
		transformMatrix.setM33(1.0);		
		
		// Create Matrix4x4
		Matrix4x4 pose = MathFacade.INSTANCE.createMatrix4x4(transformMatrix);		
		return pose;
	}
	
	/**
	 * Function to convert a ROS pose Stamped to a 4x4 matrix
	 * @param rosPose The ROS pose stamped.
	 * @return The converted matrix
	 */
	public static Matrix4x4 rosPoseToMatrix(geometry_msgs.PoseStamped rosPoseStamped)
	{
		return rosPoseToMatrix(rosPoseStamped.getPose());
	}
	
	/**
	 * Function to convert a 4x4 matrix to a ROS pose
	 * @param pose The 4x4 matrix
	 * @param node The converted ROS pose
	 * @return
	 */
	public static geometry_msgs.Pose matrixToRosPose(Matrix4x4 pose, RosNode node)
	{
		// Create ROS pose
		geometry_msgs.Pose rosPose = node.newFromType(geometry_msgs.Pose._TYPE);
		
		// Create javax.vecmath quaternion
		Quat4d quat4dPose = new Quat4d();
		
		// Create javax.vecmath Matrix 3x
		Matrix3d matrix3dPose = new Matrix3d();
		
		// Populate the Matrix3 with the matrix3x
		matrix3dPose.setM00(pose.getM00());
		matrix3dPose.setM01(pose.getM01());
		matrix3dPose.setM02(pose.getM02());
		matrix3dPose.setM10(pose.getM10());
		matrix3dPose.setM11(pose.getM11());
		matrix3dPose.setM12(pose.getM12());
		matrix3dPose.setM20(pose.getM20());
		matrix3dPose.setM21(pose.getM21());
		matrix3dPose.setM22(pose.getM22());
		
		// Transform the matrix to a quaternion
		quat4dPose.set(matrix3dPose);
		
		// Populate the orientation 
		rosPose.getOrientation().setX(quat4dPose.getX());
		rosPose.getOrientation().setY(quat4dPose.getY());
		rosPose.getOrientation().setZ(quat4dPose.getZ());
		rosPose.getOrientation().setW(quat4dPose.getW());
		
		// Populate the position 
		rosPose.getPosition().setX(pose.getM03());		
		rosPose.getPosition().setY(pose.getM13());
		rosPose.getPosition().setZ(pose.getM23());
		
		return rosPose;
	}
	
	public static Matrix4x4 createPositionMatrix ( double x, double y, double z )
	{
		Matrix4x4 pose = MathFactory.eINSTANCE.createMatrix4x4();
		pose.setM03(x);
		pose.setM13(y);
		pose.setM23(z);
		return pose;
	}
}
