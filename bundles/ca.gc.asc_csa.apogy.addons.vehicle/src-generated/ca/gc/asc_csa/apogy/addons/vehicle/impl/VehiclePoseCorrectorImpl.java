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
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.vecmath.AxisAngle4d;
import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import ca.gc.asc_csa.apogy.addons.vehicle.Activator;
import ca.gc.asc_csa.apogy.addons.vehicle.ClosestNeighbourIteratorProvider;
import ca.gc.asc_csa.apogy.addons.vehicle.ContactProvider;
import ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D;
import ca.gc.asc_csa.apogy.addons.vehicle.MeshNodeEntry;
import ca.gc.asc_csa.apogy.addons.vehicle.OrientationCorrectionMode;
import ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehicleFactory;
import ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage;
import ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector;
import ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities;
import ca.gc.asc_csa.apogy.addons.vehicle.ZCorrectionMode;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Matrix3x3;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody;
import ca.gc.asc_csa.apogy.core.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayerNode;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.impl.PoseCorrectorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Pose Corrector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.VehiclePoseCorrectorImpl#isInitializing <em>Initializing</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.VehiclePoseCorrectorImpl#getMeshes <em>Meshes</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.VehiclePoseCorrectorImpl#getContactBodies <em>Contact Bodies</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.VehiclePoseCorrectorImpl#getZCorrectionMode <em>ZCorrection Mode</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.VehiclePoseCorrectorImpl#getZCorrection <em>ZCorrection</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.VehiclePoseCorrectorImpl#getOrientationCorrectionMode <em>Orientation Correction Mode</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.VehiclePoseCorrectorImpl#getOrientationCorrection <em>Orientation Correction</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.VehiclePoseCorrectorImpl#getContactProvider <em>Contact Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehiclePoseCorrectorImpl extends PoseCorrectorImpl implements VehiclePoseCorrector
{
  protected Map<PhysicalBody, Point3d> bodyToContactsMap = new HashMap<PhysicalBody, Point3d>();
	
  /* Stores the MeshExtent2D associated with each of the CartesianTriangularMesh currently searched. */
  protected Map<CartesianTriangularMesh, MeshExtent2D>  meshToMeshExtent2DMap = new HashMap<CartesianTriangularMesh, MeshExtent2D>();
    
  
  /* Stores the ClosestNeighbourIteratorProvider associated with each of the CartesianTriangularMesh currently searched.*/
  protected Map<CartesianTriangularMesh, ClosestNeighbourIteratorProvider>  meshToClosestNeighbourIteratorProviderMap = new HashMap<CartesianTriangularMesh, ClosestNeighbourIteratorProvider>();

  
  /**
	 * The default value of the '{@link #isInitializing() <em>Initializing</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isInitializing()
	 * @generated
	 * @ordered
	 */
  protected static final boolean INITIALIZING_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isInitializing() <em>Initializing</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isInitializing()
	 * @generated
	 * @ordered
	 */
  protected boolean initializing = INITIALIZING_EDEFAULT;

  /**
	 * The cached value of the '{@link #getMeshes() <em>Meshes</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMeshes()
	 * @generated
	 * @ordered
	 */
  protected EList<MeshNodeEntry> meshes;

  /**
	 * The cached value of the '{@link #getContactBodies() <em>Contact Bodies</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getContactBodies()
	 * @generated
	 * @ordered
	 */
  protected EList<PhysicalBody> contactBodies;

  /**
	 * The default value of the '{@link #getZCorrectionMode() <em>ZCorrection Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getZCorrectionMode()
	 * @generated
	 * @ordered
	 */
  protected static final ZCorrectionMode ZCORRECTION_MODE_EDEFAULT = ZCorrectionMode.AVERAGE_CONTACT;

  /**
	 * The cached value of the '{@link #getZCorrectionMode() <em>ZCorrection Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getZCorrectionMode()
	 * @generated
	 * @ordered
	 */
  protected ZCorrectionMode zCorrectionMode = ZCORRECTION_MODE_EDEFAULT;

  /**
	 * The default value of the '{@link #getZCorrection() <em>ZCorrection</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getZCorrection()
	 * @generated
	 * @ordered
	 */
  protected static final double ZCORRECTION_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getZCorrection() <em>ZCorrection</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getZCorrection()
	 * @generated
	 * @ordered
	 */
  protected double zCorrection = ZCORRECTION_EDEFAULT;

  /**
	 * The default value of the '{@link #getOrientationCorrectionMode() <em>Orientation Correction Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOrientationCorrectionMode()
	 * @generated
	 * @ordered
	 */
  protected static final OrientationCorrectionMode ORIENTATION_CORRECTION_MODE_EDEFAULT = OrientationCorrectionMode.LEAST_SQUARE_PLANE_CORRECTION;

  /**
	 * The cached value of the '{@link #getOrientationCorrectionMode() <em>Orientation Correction Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOrientationCorrectionMode()
	 * @generated
	 * @ordered
	 */
  protected OrientationCorrectionMode orientationCorrectionMode = ORIENTATION_CORRECTION_MODE_EDEFAULT;

  /**
	 * The cached value of the '{@link #getOrientationCorrection() <em>Orientation Correction</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOrientationCorrection()
	 * @generated
	 * @ordered
	 */
  protected Matrix3x3 orientationCorrection;

  /**
	 * The cached value of the '{@link #getContactProvider() <em>Contact Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getContactProvider()
	 * @generated
	 * @ordered
	 */
  protected ContactProvider contactProvider;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected VehiclePoseCorrectorImpl()
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
		return ApogyAddonsVehiclePackage.Literals.VEHICLE_POSE_CORRECTOR;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isInitializing()
  {
		return initializing;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setInitializing(boolean newInitializing)
  {
		boolean oldInitializing = initializing;
		initializing = newInitializing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__INITIALIZING, oldInitializing, initializing));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public EList<MeshNodeEntry> getMeshes()
  {
	  // If no CartesianTriangularMesh has been found, search for them.
	  if(getMeshesGen().isEmpty())
	  {		  
		  getMeshesGen().addAll(extractMeshes());
		  
		  // NEW
		  meshToClosestNeighbourIteratorProviderMap.clear();
		  meshToMeshExtent2DMap.clear();
		  // NEW End
		  
		  for(MeshNodeEntry contentNode : getMeshesGen())
		  {
			  // Gets the mesh contained in the node.
			  CartesianTriangularMesh mesh = contentNode.getMesh();
			  
			  // Creates a ClosestNeighbourIteratorProvider and adds it to the appropriate map.
			  meshToClosestNeighbourIteratorProviderMap.put(mesh, new ClosestNeighbourIteratorProvider(mesh));
			  
			  // Gets the mesh extent for the mesh and adds it to the appropriate map.
			  MeshExtent2D meshExtent = WheelVehicleUtilities.INSTANCE.findMeshExtent2D(mesh);
			  meshToMeshExtent2DMap.put(mesh, meshExtent);
		  }
	  }
	  
	  return getMeshesGen();
  }
  
  @Override
  public void setEnabled(boolean newEnabled) 
  {	
	  boolean previousEnabled = isEnabled();
	  getMeshesGen().clear();	 	 	  	  
	  super.setEnabled(newEnabled);
	  
	  // Forces an update if the corrector is being enabled.
	  if(newEnabled && !previousEnabled)
	  {
		  try
		  {
			  if(getApogySystemApiAdapter() != null)
			  {
				  Matrix4x4 correctedPose = applyCorrection(getApogySystemApiAdapter().getPoseTransform());
				  getApogySystemApiAdapter().setPoseTransform(correctedPose);
			  }
		  }
		  catch(Throwable t)
		  {
			  t.printStackTrace();
		  }
	  }
  }
  
  /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<MeshNodeEntry> getMeshesGen()
  {
		if (meshes == null) {
			meshes = new EObjectResolvingEList<MeshNodeEntry>(MeshNodeEntry.class, this, ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__MESHES);
		}
		return meshes;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public EList<PhysicalBody> getContactBodies()
  {
	  // If no wheels has been found, search for them.
	  if(getContactBodiesGen().isEmpty() && getContactProvider() != null)
	  {
		  getContactBodiesGen().addAll(getContactProvider().extractContactBodies());
	  }
	  
	  return getContactBodiesGen(); 
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<PhysicalBody> getContactBodiesGen()
  {
		if (contactBodies == null) {
			contactBodies = new EObjectResolvingEList<PhysicalBody>(PhysicalBody.class, this, ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__CONTACT_BODIES);
		}
		return contactBodies;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ZCorrectionMode getZCorrectionMode()
  {
		return zCorrectionMode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setZCorrectionMode(ZCorrectionMode newZCorrectionMode)
  {
		ZCorrectionMode oldZCorrectionMode = zCorrectionMode;
		zCorrectionMode = newZCorrectionMode == null ? ZCORRECTION_MODE_EDEFAULT : newZCorrectionMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ZCORRECTION_MODE, oldZCorrectionMode, zCorrectionMode));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getZCorrection()
  {
		return zCorrection;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setZCorrection(double newZCorrection)
  {
		double oldZCorrection = zCorrection;
		zCorrection = newZCorrection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ZCORRECTION, oldZCorrection, zCorrection));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OrientationCorrectionMode getOrientationCorrectionMode()
  {
		return orientationCorrectionMode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOrientationCorrectionMode(OrientationCorrectionMode newOrientationCorrectionMode)
  {
		OrientationCorrectionMode oldOrientationCorrectionMode = orientationCorrectionMode;
		orientationCorrectionMode = newOrientationCorrectionMode == null ? ORIENTATION_CORRECTION_MODE_EDEFAULT : newOrientationCorrectionMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ORIENTATION_CORRECTION_MODE, oldOrientationCorrectionMode, orientationCorrectionMode));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Matrix3x3 getOrientationCorrection()
  {
		if (orientationCorrection != null && orientationCorrection.eIsProxy()) {
			InternalEObject oldOrientationCorrection = (InternalEObject)orientationCorrection;
			orientationCorrection = (Matrix3x3)eResolveProxy(oldOrientationCorrection);
			if (orientationCorrection != oldOrientationCorrection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ORIENTATION_CORRECTION, oldOrientationCorrection, orientationCorrection));
			}
		}
		return orientationCorrection;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Matrix3x3 basicGetOrientationCorrection()
  {
		return orientationCorrection;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOrientationCorrection(Matrix3x3 newOrientationCorrection)
  {
		Matrix3x3 oldOrientationCorrection = orientationCorrection;
		orientationCorrection = newOrientationCorrection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ORIENTATION_CORRECTION, oldOrientationCorrection, orientationCorrection));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ContactProvider getContactProvider()
  {
		return contactProvider;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetContactProvider(ContactProvider newContactProvider, NotificationChain msgs)
  {
		ContactProvider oldContactProvider = contactProvider;
		contactProvider = newContactProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__CONTACT_PROVIDER, oldContactProvider, newContactProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setContactProvider(ContactProvider newContactProvider)
  {
		if (newContactProvider != contactProvider) {
			NotificationChain msgs = null;
			if (contactProvider != null)
				msgs = ((InternalEObject)contactProvider).eInverseRemove(this, ApogyAddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR, ContactProvider.class, msgs);
			if (newContactProvider != null)
				msgs = ((InternalEObject)newContactProvider).eInverseAdd(this, ApogyAddonsVehiclePackage.CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR, ContactProvider.class, msgs);
			msgs = basicSetContactProvider(newContactProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__CONTACT_PROVIDER, newContactProvider, newContactProvider));
	}

  @Override
  public Matrix4x4 applyCorrection(Matrix4x4 originalPose) 
  {	  
	  // If corrector is enabled and not initializing.
	  if(isEnabled())
	  {
		  if(!isInitializing())
		  {
			  // If Z Correction or Orientation correction is enabled.
			  if(getZCorrectionMode() != ZCorrectionMode.NO_ZCORRECTION || 
				 getOrientationCorrectionMode() != OrientationCorrectionMode.NO_ORIENTATION_CORRECTION)
			  {				
				  
				  // Updates the wheel axis position. This is required for both position and orientation corrections.
				  if(getContactProvider() != null)
				  {
					  getContactProvider().updateContactPoints(originalPose, bodyToContactsMap);
				  }
				  				  				  
				  // Initialize the corrections matrix to identity.
				  Matrix4d correctionMatrix = new Matrix4d();		  
				  correctionMatrix.setIdentity();
				  			  
				  // If z correction is required.
				  if(getZCorrectionMode() != ZCorrectionMode.NO_ZCORRECTION)
				  {
					  try
					  {
						  // Computes the Z correction.
						  double zCorrection = computeZCorrection(bodyToContactsMap, originalPose);
						  setZCorrection(zCorrection);			
						  
						  // Applies the zCorrection to the correction matrix.
						  correctionMatrix.set(new Vector3d(0, 0, getZCorrection()));	
					  }
					  catch(Throwable t)
					  {
						  t.printStackTrace();
					  }
				  }
				  
				  // If Orientation Correction is required.
				  if(getOrientationCorrectionMode() != OrientationCorrectionMode.NO_ORIENTATION_CORRECTION)
				  {
					  try
					  {
						  // Initialize the rotation correction to identity.
						  Matrix3d rotationCorrection = new Matrix3d();
						  rotationCorrection.setIdentity();
						  
						  // Compute orientation correction.
						  rotationCorrection = computeOrientationCorrection(originalPose);
						  				  
						  // Updates rotationCorrection			 
						  setOrientationCorrection(ApogyCommonMathFacade.INSTANCE.createMatrix3x3(rotationCorrection));
						  
						  // Applies the rotation correction to the correction matrix.
						  Matrix4d rot = new Matrix4d();
						  rot.setIdentity();
						  rot.set(rotationCorrection);					  
						  correctionMatrix.mul(rot);
					  }
					  catch(Throwable t)
					  {
						  t.printStackTrace();
					  }
				  }
				  		  
				  // Applies the correction matrix to the original pose.
				  Matrix4d corrected = new Matrix4d(originalPose.asMatrix4d());
				  corrected.mul(correctionMatrix);
				  
				  Matrix4x4 correctedPose = ApogyCommonMathFacade.INSTANCE.createMatrix4x4(corrected);
				  
				  return correctedPose;
			  }
		  }
		  else
		  {
			  // Initialize has been requested !
			  
			  // Clears the mesh list and associated Maps.
			  getMeshesGen().clear();
			  meshToMeshExtent2DMap.clear();			  
			  meshToClosestNeighbourIteratorProviderMap.clear();
			  
			  // Clears the PhysicalBody to contact Map.
			  bodyToContactsMap.clear();
			  	  	  	  
			  // Reloads meshes and wheels.
			  getMeshes();
			  
			  setInitializing(false);
		  }
	  }
	  	  	  
	  return originalPose;
  }
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void reInitialize()
  {
	  setInitializing(true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public MeshExtent2D getMeshExtent2D(CartesianTriangularMesh mesh)
  {
	  return meshToMeshExtent2DMap.get(mesh);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public ClosestNeighbourIteratorProvider getClosestNeighbourIteratorProvider(CartesianTriangularMesh mesh)
  {
	  return meshToClosestNeighbourIteratorProviderMap.get(mesh);
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
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__CONTACT_PROVIDER:
				if (contactProvider != null)
					msgs = ((InternalEObject)contactProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__CONTACT_PROVIDER, null, msgs);
				return basicSetContactProvider((ContactProvider)otherEnd, msgs);
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
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__CONTACT_PROVIDER:
				return basicSetContactProvider(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__INITIALIZING:
				return isInitializing();
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__MESHES:
				return getMeshes();
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__CONTACT_BODIES:
				return getContactBodies();
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ZCORRECTION_MODE:
				return getZCorrectionMode();
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ZCORRECTION:
				return getZCorrection();
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ORIENTATION_CORRECTION_MODE:
				return getOrientationCorrectionMode();
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ORIENTATION_CORRECTION:
				if (resolve) return getOrientationCorrection();
				return basicGetOrientationCorrection();
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__CONTACT_PROVIDER:
				return getContactProvider();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__INITIALIZING:
				setInitializing((Boolean)newValue);
				return;
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__MESHES:
				getMeshes().clear();
				getMeshes().addAll((Collection<? extends MeshNodeEntry>)newValue);
				return;
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__CONTACT_BODIES:
				getContactBodies().clear();
				getContactBodies().addAll((Collection<? extends PhysicalBody>)newValue);
				return;
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ZCORRECTION_MODE:
				setZCorrectionMode((ZCorrectionMode)newValue);
				return;
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ZCORRECTION:
				setZCorrection((Double)newValue);
				return;
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ORIENTATION_CORRECTION_MODE:
				setOrientationCorrectionMode((OrientationCorrectionMode)newValue);
				return;
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ORIENTATION_CORRECTION:
				setOrientationCorrection((Matrix3x3)newValue);
				return;
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__CONTACT_PROVIDER:
				setContactProvider((ContactProvider)newValue);
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
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__INITIALIZING:
				setInitializing(INITIALIZING_EDEFAULT);
				return;
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__MESHES:
				getMeshes().clear();
				return;
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__CONTACT_BODIES:
				getContactBodies().clear();
				return;
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ZCORRECTION_MODE:
				setZCorrectionMode(ZCORRECTION_MODE_EDEFAULT);
				return;
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ZCORRECTION:
				setZCorrection(ZCORRECTION_EDEFAULT);
				return;
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ORIENTATION_CORRECTION_MODE:
				setOrientationCorrectionMode(ORIENTATION_CORRECTION_MODE_EDEFAULT);
				return;
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ORIENTATION_CORRECTION:
				setOrientationCorrection((Matrix3x3)null);
				return;
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__CONTACT_PROVIDER:
				setContactProvider((ContactProvider)null);
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
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__INITIALIZING:
				return initializing != INITIALIZING_EDEFAULT;
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__MESHES:
				return meshes != null && !meshes.isEmpty();
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__CONTACT_BODIES:
				return contactBodies != null && !contactBodies.isEmpty();
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ZCORRECTION_MODE:
				return zCorrectionMode != ZCORRECTION_MODE_EDEFAULT;
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ZCORRECTION:
				return zCorrection != ZCORRECTION_EDEFAULT;
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ORIENTATION_CORRECTION_MODE:
				return orientationCorrectionMode != ORIENTATION_CORRECTION_MODE_EDEFAULT;
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ORIENTATION_CORRECTION:
				return orientationCorrection != null;
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__CONTACT_PROVIDER:
				return contactProvider != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR___RE_INITIALIZE:
				reInitialize();
				return null;
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR___GET_MESH_EXTENT2_D__CARTESIANTRIANGULARMESH:
				return getMeshExtent2D((CartesianTriangularMesh)arguments.get(0));
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR___GET_CLOSEST_NEIGHBOUR_ITERATOR_PROVIDER__CARTESIANTRIANGULARMESH:
				return getClosestNeighbourIteratorProvider((CartesianTriangularMesh)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (initializing: ");
		result.append(initializing);
		result.append(", zCorrectionMode: ");
		result.append(zCorrectionMode);
		result.append(", zCorrection: ");
		result.append(zCorrection);
		result.append(", orientationCorrectionMode: ");
		result.append(orientationCorrectionMode);
		result.append(')');
		return result.toString();
	}
  
  @SuppressWarnings("unchecked")
  protected List<MeshNodeEntry> extractMeshes()
  {
	  List<MeshNodeEntry> extractedMeshes = new ArrayList<MeshNodeEntry>();		
	  
	  try
	  {		  
		  ApogyEnvironment env = (ApogyEnvironment) getApogySystemApiAdapter().getEnvironment();		
		  
// FIXME TRANSACTION: SINGLETON, Volatile -> Facade.		  
//		  Node root = env.getApogyTopology().getRootNode();		  		  		  
//		  
//		  // Gets the list of nodes that are part of the system topology.
//		  Node systemRoot = getApogySystemApiAdapter().getApogySystem().getTopologyRoot().getOriginNode();
//		  List<Node> systemNodes = ApogyCommonTopologyFacade.INSTANCE.findNodesByType(ApogyCommonTopologyPackage.Literals.NODE, systemRoot);
//		  		  
//		  List<Node> nodes = ApogyCommonTopologyFacade.INSTANCE.findNodesByType(ApogyCommonTopologyPackage.Literals.REFERENCED_CONTENT_NODE, root);		  		  
//		  nodes.addAll(ApogyCommonTopologyFacade.INSTANCE.findNodesByType(ApogyCommonTopologyPackage.Literals.CONTENT_NODE, root));
//		  nodes.addAll(ApogyCommonTopologyFacade.INSTANCE.findNodesByType(ApogyCoreEnvironmentPackage.Literals.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE, root));
//		  
//		  for(Node node : nodes)
//		  {
//			  // Adds only nodes that are not part of the system itself.
//			  if(!systemNodes.contains(node))
//			  {			  
//				  if(node instanceof ContentNode<?>) 
//				  {
//					  ContentNode<?> contentNode = (ContentNode<?>) node;
//					  
//					   if(contentNode.getContent() instanceof CartesianTriangularMesh)
//					   {
//						  if(!extractedMeshes.contains((ContentNode<CartesianTriangularMesh>) contentNode))
//						  {						  
//							  MeshNodeEntry entry = ApogyAddonsVehicleFactory.eINSTANCE.createMeshNodeEntry();
//							  entry.setNode(contentNode);
//							  entry.setMesh(((ContentNode<CartesianTriangularMesh>) contentNode).getContent());							  							 
//							  extractedMeshes.add(entry);
//						  }
//					   }					  
//				  }
//				  else if(node instanceof CartesianTriangularMeshMapLayerNode)
//				  {
//					  CartesianTriangularMeshMapLayerNode cartesianTriangularMeshMapLayerNode = (CartesianTriangularMeshMapLayerNode) node;
//					  if(cartesianTriangularMeshMapLayerNode.getCartesianTriangularMeshMapLayer() != null)
//					  {
//						  MeshNodeEntry entry = ApogyAddonsVehicleFactory.eINSTANCE.createMeshNodeEntry();
//						  entry.setNode(cartesianTriangularMeshMapLayerNode);
//						  entry.setMesh(cartesianTriangularMeshMapLayerNode.getCartesianTriangularMeshMapLayer().getCurrentMesh());	
//						  extractedMeshes.add(entry);
//					  }
//				  }
//			  }
//		  }	  
	  }
	  catch(Exception e)
	  {
		  //e.printStackTrace();
	  }
	  
	  Logger.INSTANCE.log(Activator.ID, this, "Extracted " + extractedMeshes.size() + " meshes.", EventSeverity.INFO);	  
	  
	  return extractedMeshes;
  }
  
  
  
  protected double computeZCorrection(Map<PhysicalBody, Point3d> wheelToContactsPointsMap, Matrix4x4 originalPose)
  {
	  double zCorrection = 0.0;
	  switch (getZCorrectionMode().getValue()) 
	  {
	  	case ZCorrectionMode.AVERAGE_CONTACT_VALUE:
	  		zCorrection = computeZCorrectionAverageContact(wheelToContactsPointsMap, originalPose);
		break;
	  
	  	case ZCorrectionMode.HIGHEST_CONTACT_VALUE:
	  		zCorrection = computeZCorrectionHighestContact(wheelToContactsPointsMap, originalPose);
		break;
		
	  	case ZCorrectionMode.LOWEST_CONTACT_VALUE:
	  		zCorrection = computeZCorrectionLowestContact(wheelToContactsPointsMap, originalPose);
		break;
		
	  	default:
		break;
	  }
	  return zCorrection;
  }
  
 /**
  * Computes the z correction based on highest wheel contact position.
  * @param bodyToPositionMap The map containing the position of the wheel axis for each wheel.
  * @param originalPose The original pose.
  * @return The z correction.
  */
 protected double computeZCorrectionHighestContact(Map<PhysicalBody, Point3d> bodyToPositionMap, Matrix4x4 originalPose)
 {	 
	  PhysicalBody highestBody = null;
	  for(PhysicalBody body : getContactBodies())
	  {
		  Point3d bodyPosition = bodyToPositionMap.get(body);
		  
		  if(bodyPosition != null)
		  {
			  if(highestBody == null)
			  {
				  highestBody = body;
			  }
			  else
			  {
				  if(bodyPosition.z > bodyToPositionMap.get(highestBody).z)
				  {
					  highestBody = body; 
				  }
			  }
		  }
	  }
	  
	  if(highestBody != null)
	  {
		  // Finds the original pose of the highest wheel.		  
		  Matrix4d bodyToWorldTransform = getPhysicalBodyToWorldTransform(highestBody, originalPose);
		  Point3d  originalBodyPosition = new Point3d();
		  bodyToWorldTransform.transform(originalBodyPosition);
		  
		  return bodyToPositionMap.get(highestBody).z - originalBodyPosition.z;
	  }
	  else
	  {
		  return 0.0;
	  }	  	  
 }
 
 /**
  * Computes the z correction based on lowest wheel contact position.
  * @param bodyToPositionMap The map containing the position of the wheel axis for each wheel.
  * @param originalPose The original pose.
  * @return The z correction.
  */
 protected double computeZCorrectionLowestContact(Map<PhysicalBody, Point3d> bodyToPositionMap, Matrix4x4 originalPose)
 {	 
	  PhysicalBody lowestBody = null;
	  for(PhysicalBody body : getContactBodies())
	  {
		  Point3d bodyPosition = bodyToPositionMap.get(body);
		  
		  if(bodyPosition != null)
		  {
			  if(lowestBody == null)
			  {
				  lowestBody = body;
			  }
			  else
			  {
				  if(bodyPosition.z < bodyToPositionMap.get(lowestBody).z)
				  {
					  lowestBody = body; 
				  }
			  }
		  }
	  }
	  
	  if(lowestBody != null)
	  {
		  // Finds the original pose of the lowest body.
		  Matrix4d bodyToWorldTransform = getPhysicalBodyToWorldTransform(lowestBody, originalPose);
		  Point3d  originalBodyPosition = new Point3d();
		  bodyToWorldTransform.transform(originalBodyPosition);
		  
		  return bodyToPositionMap.get(lowestBody).z - originalBodyPosition.z;
	  }
	  else
	  {
		  return 0.0;
	  }	  	  
 }

  /**
   * Computes the z correction based on average correction.
   * @param bodyToPositionMap The map containing the position of the wheel axis for each wheel.
   * @param originalPose The original pose.
   * @return The z correction.
   */
  protected double computeZCorrectionAverageContact(Map<PhysicalBody, Point3d> bodyToPositionMap, Matrix4x4 originalPose)
  {
	  // Sums the corrections from all wheel if applicable.
	  double zCorrectionSum = 0.0;
	  double correctionCount = 0;
	  
	  for(PhysicalBody body : getContactBodies())
	  {
		  Point3d bodyPosition = bodyToPositionMap.get(body);
		  
		  if(bodyPosition != null)
		  {
			  // Computes the z correction for the body.
			  
			  // Gets the original body position in world coordinates.
			  Matrix4d bodyToWorldTransform = getPhysicalBodyToWorldTransform(body, originalPose);
			  Point3d  originalBodyPosition = new Point3d();
			  bodyToWorldTransform.transform(originalBodyPosition);
			  			  			  			  
			  //double bodyCorrection = bodyToPositionMap.get(body).z - originalBodyPosition.z;
			  double bodyCorrection = bodyPosition.z - originalBodyPosition.z;
			  
			  zCorrectionSum += bodyCorrection;
			  correctionCount++;
		  }
	  }
	  
	  // Applies the averaging.
	  if(correctionCount > 0)
	  {
		  zCorrectionSum = zCorrectionSum / correctionCount;
	  }	  
	  
	  return zCorrectionSum;
  }
  
  /**
   * Computes the orientation correction matrix.
   * @param originalPose The original pose.
   * @return The orientation correction matrix.
   */
  protected Matrix3d computeOrientationCorrection(Matrix4x4 originalPose)
  {
	  Matrix3d correction = new Matrix3d();
	  correction.setIdentity();
	  
	  /* Creates the list of original wheel axis position and contact wheel axis position.
	   * Both position are expressed in the originalPose reference frame.
	   */
	  List<Point3d> originalWheelPoints = new  ArrayList<Point3d>();
	  List<Point3d> contactWheelPoints = new  ArrayList<Point3d>();
	  for(PhysicalBody wheel : bodyToContactsMap.keySet())
	  {
		  Point3d contactPoint = bodyToContactsMap.get(wheel);
		  
		  // Computes the matrix that converts contacts to the originalPose reference frame.
		  Matrix4d contactToSystem = new Matrix4d(originalPose.asMatrix4d());
		  contactToSystem.invert();		  
		  
		  if(contactPoint != null)
		  {		  
			  // Gets the wheel position expressed in the originalPose reference frame.
			  Matrix4d wheelToSystem = getPhysicalBodyToSystemTransform(wheel);
			  Point3d wheelHub = new Point3d();
			  wheelToSystem.transform(wheelHub);			  
			  originalWheelPoints.add(wheelHub);
			  
			  // Converts the contact point into the originalPose reference frame.			  
			  Point3d contactInSystem = new Point3d(contactPoint);
			  contactToSystem.transform(contactInSystem);			  
			  contactWheelPoints.add(contactInSystem);  				  
		  }
	  }
	  
	  // If we have enough contact points to define a plane.
	  if(contactWheelPoints.size() >= 3)
	  {	  
		  // Computes the best fit plane for the wheel axis in the originalPose reference frame.
		  Vector3d planeOriginal = WheelVehicleUtilities.INSTANCE.findBestFitPlane(originalWheelPoints);
		  
		  // Computes the best fit plane for the contact position of the wheel axis in the originalPose reference frame.
		  Vector3d planeContact = WheelVehicleUtilities.INSTANCE.findBestFitPlane(contactWheelPoints);
		  		  	  		  
		  // Computes angle between both vectors.
		  double dotProduct = planeContact.dot(planeOriginal);
		  
		  // If the angle is defined
		  if(-1.0 <= dotProduct && dotProduct<= 1.0)
		  {
			  double theta = Math.acos(dotProduct);
			  		  
			  // If theta is not 0, computes rotation matrix.
			  if(theta != 0)
			  {
				  // Computes the vector orthogonal to both planes normals.
				  Vector3d cross = new Vector3d();
				  cross.cross(planeContact, planeOriginal);	  
				  cross.normalize();	  	  
				  
				  // Creates a rotation of theta around the orthogonal vector.
				  AxisAngle4d axisAngle = new AxisAngle4d(cross, theta);  
				  
				  // Converts rotation around vector to rotation matrix.
				  correction.set(axisAngle);
				  
				  // Invert the rotation to provide the correction.
				  correction.invert();
			  }	  	  	 
		  }
	  }
	  return correction;
  }
    
  protected Matrix4d getPhysicalBodyToSystemTransform(PhysicalBody wheel)
  {
	  Node root = getApogySystemApiAdapter().getApogySystem().getTopologyRoot().getOriginNode();	  
	  Matrix4d transform = ApogyCommonTopologyFacade.INSTANCE.expressInFrame(wheel, root);	  	  
	  return transform;
  }
    
  protected Matrix4d getPhysicalBodyToWorldTransform(PhysicalBody body, Matrix4x4 originalPose)
  {
	  // Gets the body to System transform
	  Matrix4d bodyToSystemTransform = getPhysicalBodyToSystemTransform(body);
	  
	  // Gets the body in the world origin.
	  Matrix4d bodyToWorldTransform = new Matrix4d(originalPose.asMatrix4d());
	  bodyToWorldTransform.mul(bodyToSystemTransform);
	  
	  return bodyToWorldTransform;

  }
} //VehiclePoseCorrectorImpl
