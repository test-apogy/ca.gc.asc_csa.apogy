/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.vehicle.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.math.Matrix4x4;

import ca.gc.asc_csa.symphony.tools.vehicle.LanderSphericalFoot;
import ca.gc.asc_csa.symphony.tools.vehicle.LanderSphericalFootContactProvider;
import ca.gc.asc_csa.symphony.tools.vehicle.MeshNodeEntry;
import ca.gc.asc_csa.symphony.tools.vehicle.SymphonyToolsVehiclePackage;
import ca.gc.asc_csa.topology.dynamics.PhysicalBody;
import ca.gc.space.mrt.geometry.data3d.CartesianAxis;
import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.space.mrt.geometry.data3d.Data3dFacade;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.TopologyFacade;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lander Spherical Foot Contact Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
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
		return SymphonyToolsVehiclePackage.Literals.LANDER_SPHERICAL_FOOT_CONTACT_PROVIDER;
	}

  @Override
  public List<PhysicalBody> extractContactBodies() 
  {
	  List<PhysicalBody> extractedFeet = new ArrayList<PhysicalBody>();
		 
	  try
	  {
		  Node root = getVehiclePoseCorrector().getSymphonySystemApiAdapter().getSymphonySystem().getTopologyRoot().getOriginNode();
		  List<Node> nodes = TopologyFacade.INSTANCE.findNodesByType(SymphonyToolsVehiclePackage.Literals.LANDER_SPHERICAL_FOOT, root);
		  
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
			  
			  points.add(Data3dFacade.INSTANCE.createCartesianPositionCoordinates(footPosition.x, footPosition.y, footPosition.z));  
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
//	  Matrix4d meshToWorldTransform = TopologyFacade.INSTANCE.expressNodeInRootFrame(contentNode);
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
//	  Matrix4d transform = TopologyFacade.INSTANCE.expressInFrame(body, root);	  	  
//	  return transform;
//  }
} //LanderSphericalFootContactProviderImpl
