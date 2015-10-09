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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.vehicle.MeshNodeEntry;
import org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage;
import org.eclipse.symphony.addons.vehicle.Wheel;
import org.eclipse.symphony.addons.vehicle.WheelContactMode;
import org.eclipse.symphony.addons.vehicle.WheelContactProvider;
import org.eclipse.symphony.common.geometry.data3d.CartesianAxis;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Data3dFacade;
import org.eclipse.symphony.common.math.Matrix4x4;

import ca.gc.asc_csa.topology.dynamics.PhysicalBody;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.TopologyFacade;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wheel Contact Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.impl.WheelContactProviderImpl#getContactMode <em>Contact Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WheelContactProviderImpl extends ContactProviderImpl implements WheelContactProvider
{
  /**
	 * The default value of the '{@link #getContactMode() <em>Contact Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getContactMode()
	 * @generated
	 * @ordered
	 */
  protected static final WheelContactMode CONTACT_MODE_EDEFAULT = WheelContactMode.POINT_WHEEL_CONTACT;

  /**
	 * The cached value of the '{@link #getContactMode() <em>Contact Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getContactMode()
	 * @generated
	 * @ordered
	 */
  protected WheelContactMode contactMode = CONTACT_MODE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected WheelContactProviderImpl()
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
		return SymphonyToolsVehiclePackage.Literals.WHEEL_CONTACT_PROVIDER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WheelContactMode getContactMode()
  {
		return contactMode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setContactMode(WheelContactMode newContactMode)
  {
		WheelContactMode oldContactMode = contactMode;
		contactMode = newContactMode == null ? CONTACT_MODE_EDEFAULT : newContactMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsVehiclePackage.WHEEL_CONTACT_PROVIDER__CONTACT_MODE, oldContactMode, contactMode));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case SymphonyToolsVehiclePackage.WHEEL_CONTACT_PROVIDER__CONTACT_MODE:
				return getContactMode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case SymphonyToolsVehiclePackage.WHEEL_CONTACT_PROVIDER__CONTACT_MODE:
				setContactMode((WheelContactMode)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case SymphonyToolsVehiclePackage.WHEEL_CONTACT_PROVIDER__CONTACT_MODE:
				setContactMode(CONTACT_MODE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case SymphonyToolsVehiclePackage.WHEEL_CONTACT_PROVIDER__CONTACT_MODE:
				return contactMode != CONTACT_MODE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (contactMode: ");
		result.append(contactMode);
		result.append(')');
		return result.toString();
	}

  @Override
  public List<PhysicalBody> extractContactBodies() 
  {
	  List<PhysicalBody> extractedWheels = new ArrayList<PhysicalBody>();
		 
	  try
	  {
		  Node root = getVehiclePoseCorrector().getSymphonySystemApiAdapter().getSymphonySystem().getTopologyRoot().getOriginNode();
		  List<Node> nodes = TopologyFacade.INSTANCE.findNodesByType(SymphonyToolsVehiclePackage.Literals.WHEEL, root);
		  
		  for(Node node : nodes)
		  {
			  if(node instanceof Wheel)
			  {
				  extractedWheels.add((Wheel) node);
			  }
		  }	  
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }	  	  
	  
	  return extractedWheels;
  }
  
  @Override
  public void updateContactPoints(Matrix4x4 originalPose, Map<PhysicalBody, Point3d> bodyToContactsMap) 
  {
	  switch (getContactMode().getValue()) 
	  {
	  	case WheelContactMode.POINT_WHEEL_CONTACT_VALUE:
	  		getWheelHubPositionPointWheelContact(originalPose, bodyToContactsMap);
		break;
		
	  	case WheelContactMode.CYLINDRICAL_WHEEL_CONTACT_VALUE:
	  		getWheelHubPositionCylindricalWheelContact(originalPose, bodyToContactsMap);
		break;

	  	default:
		break;
	}
  }
  
  protected void getWheelHubPositionPointWheelContact(Matrix4x4 originalPose, Map<PhysicalBody, Point3d> wheelToContacts)
  {
	  // Clears the previous contacts.
	  wheelToContacts.clear();
	  	  
	  // Process each of the meshes	  
	  List<MeshNodeEntry> meshes = getVehiclePoseCorrector().getMeshes();
	  for(MeshNodeEntry meshNodeEntry : meshes)
	  {		  		  		  		  
		  // Gets the mesh to world matrix
		  Matrix4d meshToWorld = TopologyFacade.INSTANCE.expressNodeInRootFrame(meshNodeEntry.getNode());		    
		  
		  // Finds the position of all the wheels relative to the mesh				  
		  List<CartesianPositionCoordinates> points = new ArrayList<CartesianPositionCoordinates>();		  		  
		  for(PhysicalBody wheel : getVehiclePoseCorrector().getContactBodies())
		  {
			  Matrix4d wheelTransform = TopologyFacade.INSTANCE.expressInFrame(wheel, meshNodeEntry.getNode());
			  Vector3d wheelPosition = new Vector3d();			  			  			  
			  wheelTransform.get(wheelPosition);	
			 	  
			  points.add(Data3dFacade.INSTANCE.createCartesianPositionCoordinates(wheelPosition.x, wheelPosition.y, wheelPosition.z));  
		  }
		  
		  // Finds the intersection of the vector along Z going through the center of wheels with the mesh.		 
		  CartesianPositionCoordinates[] intersections = getProjectionAlongAxisOnToPolygon(CartesianAxis.Z, points, meshNodeEntry.getMesh());
		  
		  // Converts the position back into the world frame and checks against the position from previous meshes.		  
		  for(int i = 0; i < intersections.length; i++)
		  {
			  if(intersections[i] != null)
			  {
				  PhysicalBody body = getVehiclePoseCorrector().getContactBodies().get(i);
				  if(body instanceof Wheel)
				  {				  
					  Wheel wheel = (Wheel) body;			  
					  Point3d wheelPosition= new Point3d();
					  meshToWorld.transform(intersections[i].asPoint3d(), wheelPosition);
					  
					  // Adds the wheel radius.
					  wheelPosition.z += wheel.getRadius();
					  
					  // Checks if the new hub position is higher that the previous one.
					  if(wheelToContacts.get(wheel) != null)
					  {
						  double previousZ = wheelToContacts.get(wheel).z;
						  
						  if(wheelPosition.getZ() > previousZ)
						  {
							  wheelToContacts.put(wheel, wheelPosition);						  
						  }
					  }
					  else
					  {
						  wheelToContacts.put(wheel, wheelPosition);
					  }
				  }
			  }
		  }
	  }
  }
  
  protected void getWheelHubPositionCylindricalWheelContact(Matrix4x4 originalPose, Map<PhysicalBody, Point3d> wheelToContacts)
  {
	  // Clears the previous contacts.
	  wheelToContacts.clear();
	  
	  // TODO
  }
    
} //WheelContactProviderImpl
