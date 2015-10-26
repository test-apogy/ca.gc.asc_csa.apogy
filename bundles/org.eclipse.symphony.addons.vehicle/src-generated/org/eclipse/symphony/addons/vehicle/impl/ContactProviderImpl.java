/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle.impl;

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
import org.eclipse.symphony.addons.vehicle.ClosestNeighbourIteratorProvider;
import org.eclipse.symphony.addons.vehicle.ContactProvider;
import org.eclipse.symphony.addons.vehicle.MeshExtent2D;
import org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage;
import org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector;
import org.eclipse.symphony.addons.vehicle.WheelVehicleUtilities;
import org.eclipse.symphony.common.geometry.data3d.CartesianAxis;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangle;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.geometry.data3d.Geometry3dUtilities;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.TopologyFacade;
import org.eclipse.symphony.common.topology.addons.dynamics.PhysicalBody;
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
 *   <li>{@link org.eclipse.symphony.addons.vehicle.impl.ContactProviderImpl#getVehiclePoseCorrector <em>Vehicle Pose Corrector</em>}</li>
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
		return Symphony__AddonsVehiclePackage.Literals.CONTACT_PROVIDER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VehiclePoseCorrector getVehiclePoseCorrector()
  {
		if (eContainerFeatureID() != Symphony__AddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR) return null;
		return (VehiclePoseCorrector)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VehiclePoseCorrector basicGetVehiclePoseCorrector()
  {
		if (eContainerFeatureID() != Symphony__AddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR) return null;
		return (VehiclePoseCorrector)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetVehiclePoseCorrector(VehiclePoseCorrector newVehiclePoseCorrector, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newVehiclePoseCorrector, Symphony__AddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVehiclePoseCorrector(VehiclePoseCorrector newVehiclePoseCorrector)
  {
		if (newVehiclePoseCorrector != eInternalContainer() || (eContainerFeatureID() != Symphony__AddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR && newVehiclePoseCorrector != null)) {
			if (EcoreUtil.isAncestor(this, newVehiclePoseCorrector))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVehiclePoseCorrector != null)
				msgs = ((InternalEObject)newVehiclePoseCorrector).eInverseAdd(this, Symphony__AddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__CONTACT_PROVIDER, VehiclePoseCorrector.class, msgs);
			msgs = basicSetVehiclePoseCorrector(newVehiclePoseCorrector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR, newVehiclePoseCorrector, newVehiclePoseCorrector));
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
			case Symphony__AddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR:
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
			case Symphony__AddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR:
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
			case Symphony__AddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR:
				return eInternalContainer().eInverseRemove(this, Symphony__AddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__CONTACT_PROVIDER, VehiclePoseCorrector.class, msgs);
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
			case Symphony__AddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR:
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
			case Symphony__AddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR:
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
			case Symphony__AddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR:
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
			case Symphony__AddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR:
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
			case Symphony__AddonsVehiclePackage.CONTACT_PROVIDER___EXTRACT_CONTACT_BODIES:
				return extractContactBodies();
			case Symphony__AddonsVehiclePackage.CONTACT_PROVIDER___UPDATE_CONTACT_POINTS__MATRIX4X4_MAP:
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
				  projection = Geometry3dUtilities.getProjectionAlongAxisOnToPolygon(CartesianAxis.Z, point, polygon);			  			 
				  
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
	  Matrix4d meshToWorldTransform = TopologyFacade.INSTANCE.expressNodeInRootFrame(node);
	  
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

	  Node root = getVehiclePoseCorrector().getSymphonySystemApiAdapter().getSymphonySystem().getTopologyRoot().getOriginNode();	  
	  Matrix4d transform = TopologyFacade.INSTANCE.expressInFrame(body, root);	  	  
	  return transform;
  }
} //ContactProviderImpl
