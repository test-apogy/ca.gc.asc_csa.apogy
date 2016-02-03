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

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import ca.gc.asc_csa.apogy.addons.vehicle.ClosestNeighbourIteratorProvider;
import ca.gc.asc_csa.apogy.addons.vehicle.ContactProvider;
import ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D;
import ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage;
import ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector;
import ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianAxis;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangle;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Geometry3DUtilities;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.traverse.BreadthFirstIterator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.ContactProviderImpl#getVehiclePoseCorrector <em>Vehicle Pose Corrector</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContactProviderImpl extends MinimalEObjectImpl.Container implements ContactProvider
{
	
  /* Stores the last triangle were a contact was made for each mesh and each wheel. A null triangle indicates that no intersection was found for the wheel. */
  protected Map<CartesianTriangularMesh, Map<Integer, CartesianTriangle>> meshToWheelToLastTriangleMap = new HashMap<CartesianTriangularMesh, Map<Integer, CartesianTriangle>>();

	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ContactProviderImpl()
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
		return ApogyAddonsVehiclePackage.Literals.CONTACT_PROVIDER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VehiclePoseCorrector getVehiclePoseCorrector()
  {
		if (eContainerFeatureID() != ApogyAddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR) return null;
		return (VehiclePoseCorrector)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VehiclePoseCorrector basicGetVehiclePoseCorrector()
  {
		if (eContainerFeatureID() != ApogyAddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR) return null;
		return (VehiclePoseCorrector)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetVehiclePoseCorrector(VehiclePoseCorrector newVehiclePoseCorrector, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newVehiclePoseCorrector, ApogyAddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVehiclePoseCorrector(VehiclePoseCorrector newVehiclePoseCorrector)
  {
		if (newVehiclePoseCorrector != eInternalContainer() || (eContainerFeatureID() != ApogyAddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR && newVehiclePoseCorrector != null)) {
			if (EcoreUtil.isAncestor(this, newVehiclePoseCorrector))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVehiclePoseCorrector != null)
				msgs = ((InternalEObject)newVehiclePoseCorrector).eInverseAdd(this, ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__CONTACT_PROVIDER, VehiclePoseCorrector.class, msgs);
			msgs = basicSetVehiclePoseCorrector(newVehiclePoseCorrector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR, newVehiclePoseCorrector, newVehiclePoseCorrector));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public List<PhysicalBody> extractContactBodies()
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void updateContactPoints(Matrix4x4 originalPose, Map<PhysicalBody, Point3d> bodyToContactsMap)
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ApogyAddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVehiclePoseCorrector((VehiclePoseCorrector)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ApogyAddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR:
				return basicSetVehiclePoseCorrector(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
		switch (eContainerFeatureID()) {
			case ApogyAddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR:
				return eInternalContainer().eInverseRemove(this, ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__CONTACT_PROVIDER, VehiclePoseCorrector.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case ApogyAddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR:
				if (resolve) return getVehiclePoseCorrector();
				return basicGetVehiclePoseCorrector();
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
			case ApogyAddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR:
				setVehiclePoseCorrector((VehiclePoseCorrector)newValue);
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
			case ApogyAddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR:
				setVehiclePoseCorrector((VehiclePoseCorrector)null);
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
			case ApogyAddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR:
				return basicGetVehiclePoseCorrector() != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  @SuppressWarnings("unchecked")
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case ApogyAddonsVehiclePackage.CONTACT_PROVIDER___EXTRACT_CONTACT_BODIES:
				return extractContactBodies();
			case ApogyAddonsVehiclePackage.CONTACT_PROVIDER___UPDATE_CONTACT_POINTS__MATRIX4X4_MAP:
				updateContactPoints((Matrix4x4)arguments.get(0), (Map<PhysicalBody, Point3d>)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

  protected CartesianPositionCoordinates[] getProjectionAlongAxisOnToPolygon(CartesianAxis axis, List<CartesianPositionCoordinates> points, CartesianTriangularMesh mesh)
  {
	  CartesianPositionCoordinates[] intersections = new CartesianPositionCoordinates[points.size()];	  
	  ClosestNeighbourIteratorProvider closestNeighbourIteratorProvider = getVehiclePoseCorrector().getClosestNeighbourIteratorProvider(mesh);  
	  MeshExtent2D meshExtent2D = getVehiclePoseCorrector().getMeshExtent2D(mesh);
	  
	  Map<Integer, CartesianTriangle> wheelToLastTriangleMap = meshToWheelToLastTriangleMap.get(mesh);
	  if(wheelToLastTriangleMap == null)
	  {
		  wheelToLastTriangleMap = new HashMap<Integer, CartesianTriangle>();
		  meshToWheelToLastTriangleMap.put(mesh, wheelToLastTriangleMap);
	  }	  
	  
	  // Process each of wheels.
	  for(int i = 0; i < points.size(); i++)
	  {		  
		  CartesianPositionCoordinates point = points.get(i);		  		  		 
		  Integer wheelIndex = new Integer(i);
		  
		  // If the point falls within the mesh extent.
		  if(WheelVehicleUtilities.INSTANCE.isWithin(point.asPoint3d(), meshExtent2D))
		  {		  
			  CartesianTriangle startTriangle = wheelToLastTriangleMap.get(wheelIndex);
			  		  		  
			  BreadthFirstIterator<CartesianTriangle, DefaultEdge> it = closestNeighbourIteratorProvider.createBreadthFirstIterator(startTriangle);		  		  
			  CartesianPositionCoordinates projection = null;
			  
			  while(it.hasNext() && projection == null)
			  {
				  CartesianPolygon polygon = it.next();
				  projection = Geometry3DUtilities.getProjectionAlongAxisOnToPolygon(CartesianAxis.Z, point, polygon);			  			 
				  
				  if(projection != null) 
				  {
					  wheelToLastTriangleMap.put(wheelIndex, (CartesianTriangle) polygon);								  
				  }
			  }
			  intersections[i] = projection;	
		  }
	  }
	  
	  return intersections;
  }
  
  /*
   * Gets the matrix that expresses the pose of a PhysicalBody relative to a ContentNode.
   * @param originalPose The original, uncorrected pose of the system.
   * @param body The PhysicalBody.
   * @param node The node containing the mesh.
   * @return The matrix.
   */
  protected Matrix4d getBodyToMeshTransform(Matrix4x4 originalPose, PhysicalBody body, Node node)
  {	  
	  // Gets the body to System transform
	  Matrix4d bodyToSystemTransform = getFootToSystemTransform(body);
	  
	  // Gets the body in the world origin.
	  Matrix4d bodyToWorldTransform = new Matrix4d(originalPose.asMatrix4d());
	  bodyToWorldTransform.mul(bodyToSystemTransform);
	  
	  // Gets the mesh to world transform.
	  Matrix4d meshToWorldTransform = ApogyCommonTopologyFacade.INSTANCE.expressNodeInRootFrame(node);
	  
	  // Gets the bodyToMeshTransform
	  meshToWorldTransform.invert();
	  bodyToWorldTransform.mul(meshToWorldTransform);
	  
	  return bodyToWorldTransform;
  }
  
  /*
   * Gets the matrix that expresses the pose of a PhysicalBody relative to the current System.   
   * @param body The PhysicalBody.   
   * @return The matrix.
   */
  protected Matrix4d getFootToSystemTransform(PhysicalBody body)
  {

	  Node root = getVehiclePoseCorrector().getApogySystemApiAdapter().getApogySystem().getTopologyRoot().getOriginNode();	  
	  Matrix4d transform = ApogyCommonTopologyFacade.INSTANCE.expressInFrame(body, root);	  	  
	  return transform;
  }
} //ContactProviderImpl
