/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle.impl;

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
import org.eclipse.symphony.addons.vehicle.ClosestNeighbourIteratorProvider;
import org.eclipse.symphony.addons.vehicle.LanderSphericalFoot;
import org.eclipse.symphony.addons.vehicle.LanderSphericalFootContactProvider;
import org.eclipse.symphony.addons.vehicle.Line3d;
import org.eclipse.symphony.addons.vehicle.MeshExtent2D;
import org.eclipse.symphony.addons.vehicle.MeshNodeEntry;
import org.eclipse.symphony.addons.vehicle.OrientationCorrectionMode;
import org.eclipse.symphony.addons.vehicle.PathPlannerTool;
import org.eclipse.symphony.addons.vehicle.PathPlannerToolNode;
import org.eclipse.symphony.addons.vehicle.Plane;
import org.eclipse.symphony.addons.vehicle.Segment2D;
import org.eclipse.symphony.addons.vehicle.SymphonyToolsVehicleFactory;
import org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage;
import org.eclipse.symphony.addons.vehicle.TerrainProfile;
import org.eclipse.symphony.addons.vehicle.Thruster;
import org.eclipse.symphony.addons.vehicle.ThrusterBinding;
import org.eclipse.symphony.addons.vehicle.VehiclePathPlannerTool;
import org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector;
import org.eclipse.symphony.addons.vehicle.VehiculeToolsFacade;
import org.eclipse.symphony.addons.vehicle.Wheel;
import org.eclipse.symphony.addons.vehicle.WheelContactMode;
import org.eclipse.symphony.addons.vehicle.WheelContactProvider;
import org.eclipse.symphony.addons.vehicle.WheelVehicleUtilities;
import org.eclipse.symphony.addons.vehicle.ZCorrectionMode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyToolsVehicleFactoryImpl extends EFactoryImpl implements SymphonyToolsVehicleFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static SymphonyToolsVehicleFactory init()
  {
		try {
			SymphonyToolsVehicleFactory theSymphonyToolsVehicleFactory = (SymphonyToolsVehicleFactory)EPackage.Registry.INSTANCE.getEFactory(SymphonyToolsVehiclePackage.eNS_URI);
			if (theSymphonyToolsVehicleFactory != null) {
				return theSymphonyToolsVehicleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SymphonyToolsVehicleFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyToolsVehicleFactoryImpl()
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
			case SymphonyToolsVehiclePackage.VEHICLE_POSE_CORRECTOR: return createVehiclePoseCorrector();
			case SymphonyToolsVehiclePackage.MESH_NODE_ENTRY: return createMeshNodeEntry();
			case SymphonyToolsVehiclePackage.WHEEL: return createWheel();
			case SymphonyToolsVehiclePackage.THRUSTER: return createThruster();
			case SymphonyToolsVehiclePackage.THRUSTER_BINDING: return createThrusterBinding();
			case SymphonyToolsVehiclePackage.WHEEL_CONTACT_PROVIDER: return createWheelContactProvider();
			case SymphonyToolsVehiclePackage.LANDER_SPHERICAL_FOOT: return createLanderSphericalFoot();
			case SymphonyToolsVehiclePackage.LANDER_SPHERICAL_FOOT_CONTACT_PROVIDER: return createLanderSphericalFootContactProvider();
			case SymphonyToolsVehiclePackage.VEHICULE_TOOLS_FACADE: return createVehiculeToolsFacade();
			case SymphonyToolsVehiclePackage.WHEEL_VEHICLE_UTILITIES: return createWheelVehicleUtilities();
			case SymphonyToolsVehiclePackage.MESH_EXTENT2_D: return createMeshExtent2D();
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL: return createPathPlannerTool();
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL_NODE: return createPathPlannerToolNode();
			case SymphonyToolsVehiclePackage.VEHICLE_PATH_PLANNER_TOOL: return createVehiclePathPlannerTool();
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
			case SymphonyToolsVehiclePackage.ZCORRECTION_MODE:
				return createZCorrectionModeFromString(eDataType, initialValue);
			case SymphonyToolsVehiclePackage.ORIENTATION_CORRECTION_MODE:
				return createOrientationCorrectionModeFromString(eDataType, initialValue);
			case SymphonyToolsVehiclePackage.WHEEL_CONTACT_MODE:
				return createWheelContactModeFromString(eDataType, initialValue);
			case SymphonyToolsVehiclePackage.POINT2D:
				return createPoint2dFromString(eDataType, initialValue);
			case SymphonyToolsVehiclePackage.POINT3D:
				return createPoint3dFromString(eDataType, initialValue);
			case SymphonyToolsVehiclePackage.VECTOR3D:
				return createVector3dFromString(eDataType, initialValue);
			case SymphonyToolsVehiclePackage.MAP:
				return createMapFromString(eDataType, initialValue);
			case SymphonyToolsVehiclePackage.LIST:
				return createListFromString(eDataType, initialValue);
			case SymphonyToolsVehiclePackage.SORTED_SET:
				return createSortedSetFromString(eDataType, initialValue);
			case SymphonyToolsVehiclePackage.ITERATOR:
				return createIteratorFromString(eDataType, initialValue);
			case SymphonyToolsVehiclePackage.SEGMENT2_D:
				return createSegment2DFromString(eDataType, initialValue);
			case SymphonyToolsVehiclePackage.LINE3D:
				return createLine3dFromString(eDataType, initialValue);
			case SymphonyToolsVehiclePackage.PLANE:
				return createPlaneFromString(eDataType, initialValue);
			case SymphonyToolsVehiclePackage.TERRAIN_PROFILE:
				return createTerrainProfileFromString(eDataType, initialValue);
			case SymphonyToolsVehiclePackage.CLOSEST_NEIGHBOUR_ITERATOR_PROVIDER:
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
			case SymphonyToolsVehiclePackage.ZCORRECTION_MODE:
				return convertZCorrectionModeToString(eDataType, instanceValue);
			case SymphonyToolsVehiclePackage.ORIENTATION_CORRECTION_MODE:
				return convertOrientationCorrectionModeToString(eDataType, instanceValue);
			case SymphonyToolsVehiclePackage.WHEEL_CONTACT_MODE:
				return convertWheelContactModeToString(eDataType, instanceValue);
			case SymphonyToolsVehiclePackage.POINT2D:
				return convertPoint2dToString(eDataType, instanceValue);
			case SymphonyToolsVehiclePackage.POINT3D:
				return convertPoint3dToString(eDataType, instanceValue);
			case SymphonyToolsVehiclePackage.VECTOR3D:
				return convertVector3dToString(eDataType, instanceValue);
			case SymphonyToolsVehiclePackage.MAP:
				return convertMapToString(eDataType, instanceValue);
			case SymphonyToolsVehiclePackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case SymphonyToolsVehiclePackage.SORTED_SET:
				return convertSortedSetToString(eDataType, instanceValue);
			case SymphonyToolsVehiclePackage.ITERATOR:
				return convertIteratorToString(eDataType, instanceValue);
			case SymphonyToolsVehiclePackage.SEGMENT2_D:
				return convertSegment2DToString(eDataType, instanceValue);
			case SymphonyToolsVehiclePackage.LINE3D:
				return convertLine3dToString(eDataType, instanceValue);
			case SymphonyToolsVehiclePackage.PLANE:
				return convertPlaneToString(eDataType, instanceValue);
			case SymphonyToolsVehiclePackage.TERRAIN_PROFILE:
				return convertTerrainProfileToString(eDataType, instanceValue);
			case SymphonyToolsVehiclePackage.CLOSEST_NEIGHBOUR_ITERATOR_PROVIDER:
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
  public VehiculeToolsFacade createVehiculeToolsFacade()
  {
		VehiculeToolsFacadeImpl vehiculeToolsFacade = new VehiculeToolsFacadeImpl();
		return vehiculeToolsFacade;
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
	 * @generated
	 */
  public SymphonyToolsVehiclePackage getSymphonyToolsVehiclePackage()
  {
		return (SymphonyToolsVehiclePackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static SymphonyToolsVehiclePackage getPackage()
  {
		return SymphonyToolsVehiclePackage.eINSTANCE;
	}

} //SymphonyToolsVehicleFactoryImpl
