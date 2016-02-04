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

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import javax.vecmath.Point2d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.addons.vehicle.ClosestNeighbourIteratorProvider;
import ca.gc.asc_csa.apogy.addons.vehicle.LanderSphericalFoot;
import ca.gc.asc_csa.apogy.addons.vehicle.LanderSphericalFootContactProvider;
import ca.gc.asc_csa.apogy.addons.vehicle.Line3d;
import ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D;
import ca.gc.asc_csa.apogy.addons.vehicle.MeshNodeEntry;
import ca.gc.asc_csa.apogy.addons.vehicle.OrientationCorrectionMode;
import ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool;
import ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerToolNode;
import ca.gc.asc_csa.apogy.addons.vehicle.Plane;
import ca.gc.asc_csa.apogy.addons.vehicle.Segment2D;
import ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehicleFactory;
import ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage;
import ca.gc.asc_csa.apogy.addons.vehicle.TerrainProfile;
import ca.gc.asc_csa.apogy.addons.vehicle.Thruster;
import ca.gc.asc_csa.apogy.addons.vehicle.ThrusterBinding;
import ca.gc.asc_csa.apogy.addons.vehicle.VehiclePathPlannerTool;
import ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector;
import ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehicleFacade;
import ca.gc.asc_csa.apogy.addons.vehicle.Wheel;
import ca.gc.asc_csa.apogy.addons.vehicle.WheelContactMode;
import ca.gc.asc_csa.apogy.addons.vehicle.WheelContactProvider;
import ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities;
import ca.gc.asc_csa.apogy.addons.vehicle.ZCorrectionMode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsVehicleFactoryImpl extends EFactoryImpl implements ApogyAddonsVehicleFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ApogyAddonsVehicleFactory init()
  {
		try {
			ApogyAddonsVehicleFactory theApogyAddonsVehicleFactory = (ApogyAddonsVehicleFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsVehiclePackage.eNS_URI);
			if (theApogyAddonsVehicleFactory != null) {
				return theApogyAddonsVehicleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsVehicleFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyAddonsVehicleFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR: return createVehiclePoseCorrector();
			case ApogyAddonsVehiclePackage.MESH_NODE_ENTRY: return createMeshNodeEntry();
			case ApogyAddonsVehiclePackage.WHEEL: return createWheel();
			case ApogyAddonsVehiclePackage.THRUSTER: return createThruster();
			case ApogyAddonsVehiclePackage.THRUSTER_BINDING: return createThrusterBinding();
			case ApogyAddonsVehiclePackage.WHEEL_CONTACT_PROVIDER: return createWheelContactProvider();
			case ApogyAddonsVehiclePackage.LANDER_SPHERICAL_FOOT: return createLanderSphericalFoot();
			case ApogyAddonsVehiclePackage.LANDER_SPHERICAL_FOOT_CONTACT_PROVIDER: return createLanderSphericalFootContactProvider();
			case ApogyAddonsVehiclePackage.APOGY_ADDONS_VEHICLE_FACADE: return createApogyAddonsVehicleFacade();
			case ApogyAddonsVehiclePackage.WHEEL_VEHICLE_UTILITIES: return createWheelVehicleUtilities();
			case ApogyAddonsVehiclePackage.MESH_EXTENT2_D: return createMeshExtent2D();
			case ApogyAddonsVehiclePackage.PATH_PLANNER_TOOL: return createPathPlannerTool();
			case ApogyAddonsVehiclePackage.PATH_PLANNER_TOOL_NODE: return createPathPlannerToolNode();
			case ApogyAddonsVehiclePackage.VEHICLE_PATH_PLANNER_TOOL: return createVehiclePathPlannerTool();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
		switch (eDataType.getClassifierID()) {
			case ApogyAddonsVehiclePackage.ZCORRECTION_MODE:
				return createZCorrectionModeFromString(eDataType, initialValue);
			case ApogyAddonsVehiclePackage.ORIENTATION_CORRECTION_MODE:
				return createOrientationCorrectionModeFromString(eDataType, initialValue);
			case ApogyAddonsVehiclePackage.WHEEL_CONTACT_MODE:
				return createWheelContactModeFromString(eDataType, initialValue);
			case ApogyAddonsVehiclePackage.POINT2D:
				return createPoint2dFromString(eDataType, initialValue);
			case ApogyAddonsVehiclePackage.POINT3D:
				return createPoint3dFromString(eDataType, initialValue);
			case ApogyAddonsVehiclePackage.VECTOR3D:
				return createVector3dFromString(eDataType, initialValue);
			case ApogyAddonsVehiclePackage.MAP:
				return createMapFromString(eDataType, initialValue);
			case ApogyAddonsVehiclePackage.LIST:
				return createListFromString(eDataType, initialValue);
			case ApogyAddonsVehiclePackage.SORTED_SET:
				return createSortedSetFromString(eDataType, initialValue);
			case ApogyAddonsVehiclePackage.ITERATOR:
				return createIteratorFromString(eDataType, initialValue);
			case ApogyAddonsVehiclePackage.SEGMENT2_D:
				return createSegment2DFromString(eDataType, initialValue);
			case ApogyAddonsVehiclePackage.LINE3D:
				return createLine3dFromString(eDataType, initialValue);
			case ApogyAddonsVehiclePackage.PLANE:
				return createPlaneFromString(eDataType, initialValue);
			case ApogyAddonsVehiclePackage.TERRAIN_PROFILE:
				return createTerrainProfileFromString(eDataType, initialValue);
			case ApogyAddonsVehiclePackage.CLOSEST_NEIGHBOUR_ITERATOR_PROVIDER:
				return createClosestNeighbourIteratorProviderFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
		switch (eDataType.getClassifierID()) {
			case ApogyAddonsVehiclePackage.ZCORRECTION_MODE:
				return convertZCorrectionModeToString(eDataType, instanceValue);
			case ApogyAddonsVehiclePackage.ORIENTATION_CORRECTION_MODE:
				return convertOrientationCorrectionModeToString(eDataType, instanceValue);
			case ApogyAddonsVehiclePackage.WHEEL_CONTACT_MODE:
				return convertWheelContactModeToString(eDataType, instanceValue);
			case ApogyAddonsVehiclePackage.POINT2D:
				return convertPoint2dToString(eDataType, instanceValue);
			case ApogyAddonsVehiclePackage.POINT3D:
				return convertPoint3dToString(eDataType, instanceValue);
			case ApogyAddonsVehiclePackage.VECTOR3D:
				return convertVector3dToString(eDataType, instanceValue);
			case ApogyAddonsVehiclePackage.MAP:
				return convertMapToString(eDataType, instanceValue);
			case ApogyAddonsVehiclePackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case ApogyAddonsVehiclePackage.SORTED_SET:
				return convertSortedSetToString(eDataType, instanceValue);
			case ApogyAddonsVehiclePackage.ITERATOR:
				return convertIteratorToString(eDataType, instanceValue);
			case ApogyAddonsVehiclePackage.SEGMENT2_D:
				return convertSegment2DToString(eDataType, instanceValue);
			case ApogyAddonsVehiclePackage.LINE3D:
				return convertLine3dToString(eDataType, instanceValue);
			case ApogyAddonsVehiclePackage.PLANE:
				return convertPlaneToString(eDataType, instanceValue);
			case ApogyAddonsVehiclePackage.TERRAIN_PROFILE:
				return convertTerrainProfileToString(eDataType, instanceValue);
			case ApogyAddonsVehiclePackage.CLOSEST_NEIGHBOUR_ITERATOR_PROVIDER:
				return convertClosestNeighbourIteratorProviderToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VehiclePoseCorrector createVehiclePoseCorrector()
  {
		VehiclePoseCorrectorImpl vehiclePoseCorrector = new VehiclePoseCorrectorImpl();
		return vehiclePoseCorrector;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeshNodeEntry createMeshNodeEntry() {
		MeshNodeEntryImpl meshNodeEntry = new MeshNodeEntryImpl();
		return meshNodeEntry;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Wheel createWheel()
  {
		WheelImpl wheel = new WheelImpl();
		return wheel;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Thruster createThruster()
  {
		ThrusterImpl thruster = new ThrusterImpl();
		return thruster;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ThrusterBinding createThrusterBinding()
  {
		ThrusterBindingImpl thrusterBinding = new ThrusterBindingImpl();
		return thrusterBinding;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WheelContactProvider createWheelContactProvider()
  {
		WheelContactProviderImpl wheelContactProvider = new WheelContactProviderImpl();
		return wheelContactProvider;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LanderSphericalFoot createLanderSphericalFoot()
  {
		LanderSphericalFootImpl landerSphericalFoot = new LanderSphericalFootImpl();
		return landerSphericalFoot;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LanderSphericalFootContactProvider createLanderSphericalFootContactProvider()
  {
		LanderSphericalFootContactProviderImpl landerSphericalFootContactProvider = new LanderSphericalFootContactProviderImpl();
		return landerSphericalFootContactProvider;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsVehicleFacade createApogyAddonsVehicleFacade() {
		ApogyAddonsVehicleFacadeImpl apogyAddonsVehicleFacade = new ApogyAddonsVehicleFacadeImpl();
		return apogyAddonsVehicleFacade;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WheelVehicleUtilities createWheelVehicleUtilities()
  {
		WheelVehicleUtilitiesImpl wheelVehicleUtilities = new WheelVehicleUtilitiesImpl();
		return wheelVehicleUtilities;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MeshExtent2D createMeshExtent2D()
  {
		MeshExtent2DImpl meshExtent2D = new MeshExtent2DImpl();
		return meshExtent2D;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathPlannerTool createPathPlannerTool() {
		PathPlannerToolImpl pathPlannerTool = new PathPlannerToolImpl();
		return pathPlannerTool;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathPlannerToolNode createPathPlannerToolNode() {
		PathPlannerToolNodeImpl pathPlannerToolNode = new PathPlannerToolNodeImpl();
		return pathPlannerToolNode;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehiclePathPlannerTool createVehiclePathPlannerTool() {
		VehiclePathPlannerToolImpl vehiclePathPlannerTool = new VehiclePathPlannerToolImpl();
		return vehiclePathPlannerTool;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ZCorrectionMode createZCorrectionModeFromString(EDataType eDataType, String initialValue)
  {
		ZCorrectionMode result = ZCorrectionMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertZCorrectionModeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OrientationCorrectionMode createOrientationCorrectionModeFromString(EDataType eDataType, String initialValue)
  {
		OrientationCorrectionMode result = OrientationCorrectionMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertOrientationCorrectionModeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WheelContactMode createWheelContactModeFromString(EDataType eDataType, String initialValue)
  {
		WheelContactMode result = WheelContactMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertWheelContactModeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Point2d createPoint2dFromString(EDataType eDataType, String initialValue)
  {
		return (Point2d)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertPoint2dToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Point3d createPoint3dFromString(EDataType eDataType, String initialValue)
  {
		return (Point3d)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertPoint3dToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Vector3d createVector3dFromString(EDataType eDataType, String initialValue)
  {
		return (Vector3d)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertVector3dToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Map<?, ?> createMapFromString(EDataType eDataType, String initialValue)
  {
		return (Map<?, ?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertMapToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public List<?> createListFromString(EDataType eDataType, String initialValue)
  {
		return (List<?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertListToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SortedSet<?> createSortedSetFromString(EDataType eDataType, String initialValue)
  {
		return (SortedSet<?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertSortedSetToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Iterator<?> createIteratorFromString(EDataType eDataType, String initialValue)
  {
		return (Iterator<?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertIteratorToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Segment2D createSegment2DFromString(EDataType eDataType, String initialValue)
  {
		return (Segment2D)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertSegment2DToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Plane createPlaneFromString(EDataType eDataType, String initialValue)
  {
		return (Plane)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertPlaneToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TerrainProfile createTerrainProfileFromString(EDataType eDataType, String initialValue)
  {
		return (TerrainProfile)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertTerrainProfileToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ClosestNeighbourIteratorProvider createClosestNeighbourIteratorProviderFromString(EDataType eDataType, String initialValue)
  {
		return (ClosestNeighbourIteratorProvider)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertClosestNeighbourIteratorProviderToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsVehiclePackage getApogyAddonsVehiclePackage() {
		return (ApogyAddonsVehiclePackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Line3d createLine3dFromString(EDataType eDataType, String initialValue)
  {
		return (Line3d)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertLine3dToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ApogyAddonsVehiclePackage getPackage()
  {
		return ApogyAddonsVehiclePackage.eINSTANCE;
	}

} //ApogyAddonsVehicleFactoryImpl
