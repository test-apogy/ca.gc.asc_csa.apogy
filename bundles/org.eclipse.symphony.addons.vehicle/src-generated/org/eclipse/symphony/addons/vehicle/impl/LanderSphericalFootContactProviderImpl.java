/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.addons.vehicle.LanderSphericalFoot;
import org.eclipse.symphony.addons.vehicle.LanderSphericalFootContactProvider;
import org.eclipse.symphony.addons.vehicle.MeshNodeEntry;
import org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage;
import org.eclipse.symphony.common.geometry.data3d.CartesianAxis;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFacade;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyFacade;
import org.eclipse.symphony.common.topology.addons.dynamics.PhysicalBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lander Spherical Foot Contact Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LanderSphericalFootContactProviderImpl extends ContactProviderImpl implements LanderSphericalFootContactProvider
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected LanderSphericalFootContactProviderImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return Symphony__AddonsVehiclePackage.Literals.LANDER_SPHERICAL_FOOT_CONTACT_PROVIDER;
	}

  @Override
  public List<PhysicalBody> extractContactBodies() 
  {
	  List<PhysicalBody> extractedFeet = new ArrayList<PhysicalBody>();
		 
	  try
	  {
		  Node root = getVehiclePoseCorrector().getSymphonySystemApiAdapter().getSymphonySystem().getTopologyRoot().getOriginNode();
		  List<Node> nodes = Symphony__CommonTopologyFacade.INSTANCE.findNodesByType(Symphony__AddonsVehiclePackage.Literals.LANDER_SPHERICAL_FOOT, root);
		  
		  for(Node node : nodes)
		  {
			  if(node instanceof LanderSphericalFoot)
			  {
				  extractedFeet.add((LanderSphericalFoot) node);
			  }
		  }	  
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }	  	  
	  
	  return extractedFeet;
  }  
  
  @Override
  public void updateContactPoints(Matrix4x4 originalPose, Map<PhysicalBody, Point3d> bodyToContactsMap) 
  {
	  // Clears the previous contacts.
	  bodyToContactsMap.clear();
	  	  
	  // Process each of the meshes	  
	  List<MeshNodeEntry> meshes = getVehiclePoseCorrector().getMeshes();
	  for(MeshNodeEntry meshNodeEntry : meshes)
	  {		  		  		  		  		  
		  // Finds the position of all the foot relative to the mesh				  
		  List<CartesianPositionCoordinates> points = new ArrayList<CartesianPositionCoordinates>();		  		  
		  for(PhysicalBody foot : getVehiclePoseCorrector().getContactBodies())
		  {			 			 			  
			  Matrix4d footTransform = getBodyToMeshTransform(originalPose, foot, meshNodeEntry.getNode());
			  Vector3d footPosition = new Vector3d();			  			  			  
			  footTransform.get(footPosition);				 	
			  
			  points.add(Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(footPosition.x, footPosition.y, footPosition.z));  
		  }
		  
		  // Finds the intersection of the vector along Z going through the center of foot with the mesh.		 
		  CartesianPositionCoordinates[] intersections = getProjectionAlongAxisOnToPolygon(CartesianAxis.Z, points, meshNodeEntry.getMesh());
		  
		  // Converts the position back into the world frame and checks against the position from previous meshes.		  
		  for(int i = 0; i < intersections.length; i++)
		  {
			  if(intersections[i] != null)
			  {
				  PhysicalBody body = getVehiclePoseCorrector().getContactBodies().get(i);
				  if(body instanceof LanderSphericalFoot)
				  {				  
					  LanderSphericalFoot foot = (LanderSphericalFoot) body;			  
					  Point3d footPosition= new Point3d(intersections[i].asPoint3d());					  
					  
					  // Adds the foot radius.
					  footPosition.z += foot.getRadius();
					  
					  // Checks if the new foot position is higher that the previous one.
					  if(bodyToContactsMap.get(foot) != null)
					  {
						  double previousZ = bodyToContactsMap.get(foot).z;
						  
						  if(footPosition.getZ() > previousZ)
						  {
							  bodyToContactsMap.put(foot, footPosition);						  
						  }
					  }
					  else
					  {
						  bodyToContactsMap.put(foot, footPosition);
					  }
				  }
			  }
		  }
	  }
  }
  
//  protected Matrix4d getBodyToMeshTransform(Matrix4x4 originalPose, PhysicalBody body,ContentNode<CartesianTriangularMesh> contentNode)
//  {	  
//	  // Gets the body to System transform
//	  Matrix4d bodyToSystemTransform = getFootToSystemTransform(body);
//	  
//	  // Gets the body in the world origin.
//	  Matrix4d bodyToWorldTransform = new Matrix4d(originalPose.asMatrix4d());
//	  bodyToWorldTransform.mul(bodyToSystemTransform);
//	  
//	  // Gets the mesh to world transform.
//	  Matrix4d meshToWorldTransform = Symphony__CommonTopologyFacade.INSTANCE.expressNodeInRootFrame(contentNode);
//	  
//	  // Gets the bodyToMeshTransform
//	  meshToWorldTransform.invert();
//	  bodyToWorldTransform.mul(meshToWorldTransform);
//	  
//	  return bodyToWorldTransform;
//  }
//  
//  protected Matrix4d getFootToSystemTransform(PhysicalBody body)
//  {
//
//	  Node root = getVehiclePoseCorrector().getSymphonySystemApiAdapter().getSymphonySystem().getTopologyRoot().getOriginNode();	  
//	  Matrix4d transform = Symphony__CommonTopologyFacade.INSTANCE.expressInFrame(body, root);	  	  
//	  return transform;
//  }
} //LanderSphericalFootContactProviderImpl
