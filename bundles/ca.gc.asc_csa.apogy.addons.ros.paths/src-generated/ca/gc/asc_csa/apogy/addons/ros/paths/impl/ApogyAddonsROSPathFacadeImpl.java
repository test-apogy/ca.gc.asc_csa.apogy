/**
 * Canadian Space Agency / Agence spatiale canadienne 2016 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.ros.paths.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.ros.message.MessageFactory;

import ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsFactory;
import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath;
import ca.gc.asc_csa.apogy.addons.ros.data3d.ApogyAddonsROSData3dFacade;
import ca.gc.asc_csa.apogy.addons.ros.paths.ApogyAddonsROSPathFacade;
import ca.gc.asc_csa.apogy.addons.ros.paths.ApogyAddonsROSPathsPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import geometry_msgs.Point;
import geometry_msgs.Pose;
import geometry_msgs.PoseStamped;
import geometry_msgs.Quaternion;
import nav_msgs.Path;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apogy Addons ROS Path Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyAddonsROSPathFacadeImpl extends MinimalEObjectImpl.Container implements ApogyAddonsROSPathFacade 
{
	private static ApogyAddonsROSPathFacade instance;

	public static ApogyAddonsROSPathFacade getInstance()
	{
		if(instance == null)
		{
			instance = new ApogyAddonsROSPathFacadeImpl();
		}

		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyAddonsROSPathFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsROSPathsPackage.Literals.APOGY_ADDONS_ROS_PATH_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public WayPointPath convertToWayPointPath(Path rosPath) 
	{
		WayPointPath wayPointPath = ApogyAddonsGeometryPathsFactory.eINSTANCE.createWayPointPath();
		
		for(PoseStamped pose : rosPath.getPoses())
		{
			CartesianPositionCoordinates point = ApogyAddonsROSData3dFacade.INSTANCE.convertToCartesianPositionCoordinates(pose.getPose().getPosition());						
			wayPointPath.getPoints().add(point);
		}
		
		return wayPointPath;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Path convertToROSPath(WayPointPath wayPointPath, MessageFactory messageFactory)
	{				
		Path path = messageFactory.newFromType(Path._TYPE);
		
		CartesianPositionCoordinates previousPoint = null;
		for(CartesianPositionCoordinates p : wayPointPath.getPoints())
		{
			PoseStamped poseStamped =  messageFactory.newFromType(PoseStamped._TYPE);
			Pose pose = messageFactory.newFromType(Pose._TYPE);
			
			Point position = messageFactory.newFromType(Point._TYPE);
			position.setX(p.getX());
			position.setY(p.getY());
			position.setZ(p.getZ());
			pose.setPosition(position);
						
			CartesianOrientationCoordinates orientation = null;
			if(previousPoint != null)
			{
				// TODO
				orientation = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianOrientationCoordinates(0, 0, 0);
			}
			else
			{
				// TODO
				orientation = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianOrientationCoordinates(0, 0, 0);
			}
			
			Quaternion quat =  ApogyAddonsROSData3dFacade.INSTANCE.convertToROSQuaternion(orientation);			
			pose.setOrientation(quat);
			
			poseStamped.setPose(pose);
			
			// Adds the pose.
			path.getPoses().add(poseStamped);
			
			previousPoint = p;
		}
		
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyAddonsROSPathsPackage.APOGY_ADDONS_ROS_PATH_FACADE___CONVERT_TO_WAY_POINT_PATH__PATH:
				return convertToWayPointPath((Path)arguments.get(0));
			case ApogyAddonsROSPathsPackage.APOGY_ADDONS_ROS_PATH_FACADE___CONVERT_TO_ROS_PATH__WAYPOINTPATH_MESSAGEFACTORY:
				return convertToROSPath((WayPointPath)arguments.get(0), (MessageFactory)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApogyAddonsROSPathFacadeImpl
