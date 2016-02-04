package ca.gc.asc_csa.apogy.addons.vehicle.impl;
/*
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
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.vehicle.MeshNodeEntry;
import ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage;
import ca.gc.asc_csa.apogy.addons.vehicle.Wheel;
import ca.gc.asc_csa.apogy.addons.vehicle.WheelContactMode;
import ca.gc.asc_csa.apogy.addons.vehicle.WheelContactProvider;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianAxis;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wheel Contact Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.WheelContactProviderImpl#getContactMode <em>Contact Mode</em>}</li>
 * </ul>
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
		return ApogyAddonsVehiclePackage.Literals.WHEEL_CONTACT_PROVIDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsVehiclePackage.WHEEL_CONTACT_PROVIDER__CONTACT_MODE, oldContactMode, contactMode));
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
			case ApogyAddonsVehiclePackage.WHEEL_CONTACT_PROVIDER__CONTACT_MODE:
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
			case ApogyAddonsVehiclePackage.WHEEL_CONTACT_PROVIDER__CONTACT_MODE:
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
			case ApogyAddonsVehiclePackage.WHEEL_CONTACT_PROVIDER__CONTACT_MODE:
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
			case ApogyAddonsVehiclePackage.WHEEL_CONTACT_PROVIDER__CONTACT_MODE:
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
		  Node root = getVehiclePoseCorrector().getApogySystemApiAdapter().getApogySystem().getTopologyRoot().getOriginNode();
		  List<Node> nodes = ApogyCommonTopologyFacade.INSTANCE.findNodesByType(ApogyAddonsVehiclePackage.Literals.WHEEL, root);
		  
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
		  Matrix4d meshToWorld = ApogyCommonTopologyFacade.INSTANCE.expressNodeInRootFrame(meshNodeEntry.getNode());		    
		  
		  // Finds the position of all the wheels relative to the mesh				  
		  List<CartesianPositionCoordinates> points = new ArrayList<CartesianPositionCoordinates>();		  		  
		  for(PhysicalBody wheel : getVehiclePoseCorrector().getContactBodies())
		  {
			  Matrix4d wheelTransform = ApogyCommonTopologyFacade.INSTANCE.expressInFrame(wheel, meshNodeEntry.getNode());
			  Vector3d wheelPosition = new Vector3d();			  			  			  
			  wheelTransform.get(wheelPosition);	
			 	  
			  points.add(ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(wheelPosition.x, wheelPosition.y, wheelPosition.z));  
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
