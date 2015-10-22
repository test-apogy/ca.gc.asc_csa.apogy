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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.addons.SymphonyToolsCorePackage;
import org.eclipse.symphony.addons.geometry.paths.PathsPackage;
import org.eclipse.symphony.addons.mobility.pathplanners.PathplannersPackage;
import org.eclipse.symphony.addons.vehicle.ClosestNeighbourIteratorProvider;
import org.eclipse.symphony.addons.vehicle.ContactProvider;
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
import org.eclipse.symphony.addons.vehicle.VehicleToolsFacade;
import org.eclipse.symphony.addons.vehicle.Wheel;
import org.eclipse.symphony.addons.vehicle.WheelContactMode;
import org.eclipse.symphony.addons.vehicle.WheelContactProvider;
import org.eclipse.symphony.addons.vehicle.WheelVehicleUtilities;
import org.eclipse.symphony.addons.vehicle.ZCorrectionMode;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;
import org.eclipse.symphony.common.math.MathPackage;
import org.eclipse.symphony.common.topology.TopologyPackage;
import org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage;
import org.eclipse.symphony.common.topology.bindings.TopologyBindingsPackage;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyToolsVehiclePackageImpl extends EPackageImpl implements SymphonyToolsVehiclePackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass vehiclePoseCorrectorEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meshNodeEntryEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass contactProviderEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass wheelEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass thrusterEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass thrusterBindingEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass wheelContactProviderEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass landerSphericalFootEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass landerSphericalFootContactProviderEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleToolsFacadeEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass wheelVehicleUtilitiesEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass meshExtent2DEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathPlannerToolEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathPlannerToolNodeEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehiclePathPlannerToolEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum zCorrectionModeEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum orientationCorrectionModeEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum wheelContactModeEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType point2dEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType point3dEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType vector3dEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType mapEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType listEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType sortedSetEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType iteratorEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType segment2DEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType planeEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType terrainProfileEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType closestNeighbourIteratorProviderEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType line3dEDataType = null;

  /**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private SymphonyToolsVehiclePackageImpl()
  {
		super(eNS_URI, SymphonyToolsVehicleFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SymphonyToolsVehiclePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static SymphonyToolsVehiclePackage init()
  {
		if (isInited) return (SymphonyToolsVehiclePackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyToolsVehiclePackage.eNS_URI);

		// Obtain or create and register package
		SymphonyToolsVehiclePackageImpl theSymphonyToolsVehiclePackage = (SymphonyToolsVehiclePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SymphonyToolsVehiclePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SymphonyToolsVehiclePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SymphonyEnvironmentPackage.eINSTANCE.eClass();
		PathplannersPackage.eINSTANCE.eClass();
		SymphonyToolsCorePackage.eINSTANCE.eClass();
		TopologyDynamicsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphonyToolsVehiclePackage.createPackageContents();

		// Initialize created meta-data
		theSymphonyToolsVehiclePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphonyToolsVehiclePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SymphonyToolsVehiclePackage.eNS_URI, theSymphonyToolsVehiclePackage);
		return theSymphonyToolsVehiclePackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getVehiclePoseCorrector()
  {
		return vehiclePoseCorrectorEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getVehiclePoseCorrector_Initializing()
  {
		return (EAttribute)vehiclePoseCorrectorEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVehiclePoseCorrector_Meshes()
  {
		return (EReference)vehiclePoseCorrectorEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVehiclePoseCorrector_ContactBodies()
  {
		return (EReference)vehiclePoseCorrectorEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getVehiclePoseCorrector_ZCorrectionMode()
  {
		return (EAttribute)vehiclePoseCorrectorEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getVehiclePoseCorrector_ZCorrection()
  {
		return (EAttribute)vehiclePoseCorrectorEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getVehiclePoseCorrector_OrientationCorrectionMode()
  {
		return (EAttribute)vehiclePoseCorrectorEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVehiclePoseCorrector_OrientationCorrection()
  {
		return (EReference)vehiclePoseCorrectorEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVehiclePoseCorrector_ContactProvider()
  {
		return (EReference)vehiclePoseCorrectorEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getVehiclePoseCorrector__ReInitialize()
  {
		return vehiclePoseCorrectorEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getVehiclePoseCorrector__GetMeshExtent2D__CartesianTriangularMesh()
  {
		return vehiclePoseCorrectorEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getVehiclePoseCorrector__GetClosestNeighbourIteratorProvider__CartesianTriangularMesh()
  {
		return vehiclePoseCorrectorEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeshNodeEntry() {
		return meshNodeEntryEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeshNodeEntry_Node() {
		return (EReference)meshNodeEntryEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeshNodeEntry_Mesh() {
		return (EReference)meshNodeEntryEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getContactProvider()
  {
		return contactProviderEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getContactProvider_VehiclePoseCorrector()
  {
		return (EReference)contactProviderEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getContactProvider__ExtractContactBodies()
  {
		return contactProviderEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getContactProvider__UpdateContactPoints__Matrix4x4_Map()
  {
		return contactProviderEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getWheel()
  {
		return wheelEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getWheel_Radius()
  {
		return (EAttribute)wheelEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getWheel_Lenght()
  {
		return (EAttribute)wheelEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getThruster()
  {
		return thrusterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThruster_MinimumThrust() {
		return (EAttribute)thrusterEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThruster_MaximumThrust() {
		return (EAttribute)thrusterEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThruster_CurrentThrust() {
		return (EAttribute)thrusterEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getThruster_PlumeAngle()
  {
		return (EAttribute)thrusterEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getThruster_ThrustLevel()
  {
		return (EAttribute)thrusterEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getThrusterBinding()
  {
		return thrusterBindingEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getThrusterBinding_Thruster()
  {
		return (EReference)thrusterBindingEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getWheelContactProvider()
  {
		return wheelContactProviderEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getWheelContactProvider_ContactMode()
  {
		return (EAttribute)wheelContactProviderEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLanderSphericalFoot()
  {
		return landerSphericalFootEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLanderSphericalFoot_Radius()
  {
		return (EAttribute)landerSphericalFootEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLanderSphericalFootContactProvider()
  {
		return landerSphericalFootContactProviderEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getVehicleToolsFacade()
  {
		return vehicleToolsFacadeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getWheelVehicleUtilities()
  {
		return wheelVehicleUtilitiesEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getWheelVehicleUtilities__GetWheelCenterPoint__double_double_Segment2D()
  {
		return wheelVehicleUtilitiesEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getWheelVehicleUtilities__GetWheelCenterPoint__double_double_TerrainProfile()
  {
		return wheelVehicleUtilitiesEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getWheelVehicleUtilities__FindTerrainProfile__CartesianTriangularMesh_Plane()
  {
		return wheelVehicleUtilitiesEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getWheelVehicleUtilities__FindIntersection__Plane_Line3d()
  {
		return wheelVehicleUtilitiesEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getWheelVehicleUtilities__IsPointOnSegment__Point2d_Segment2D()
  {
		return wheelVehicleUtilitiesEClass.getEOperations().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getWheelVehicleUtilities__FindMeshExtent2D__CartesianTriangularMesh()
  {
		return wheelVehicleUtilitiesEClass.getEOperations().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getWheelVehicleUtilities__IsWithin__Point3d_MeshExtent2D()
  {
		return wheelVehicleUtilitiesEClass.getEOperations().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getWheelVehicleUtilities__FindBestFitPlane__List()
  {
		return wheelVehicleUtilitiesEClass.getEOperations().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMeshExtent2D()
  {
		return meshExtent2DEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMeshExtent2D_MinimumX()
  {
		return (EAttribute)meshExtent2DEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMeshExtent2D_MinimumY()
  {
		return (EAttribute)meshExtent2DEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMeshExtent2D_MaximumX()
  {
		return (EAttribute)meshExtent2DEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMeshExtent2D_MaximumY()
  {
		return (EAttribute)meshExtent2DEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathPlannerTool() {
		return pathPlannerToolEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPlannerTool_Busy() {
		return (EAttribute)pathPlannerToolEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathPlannerTool_AutoPathPlanEnabled() {
		return (EAttribute)pathPlannerToolEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathPlannerTool_MeshLayer() {
		return (EReference)pathPlannerToolEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathPlannerTool_PathPlanner() {
		return (EReference)pathPlannerToolEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathPlannerTool_PlannedPath() {
		return (EReference)pathPlannerToolEClass.getEStructuralFeatures().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathPlannerTool_PathPlannerToolNode() {
		return (EReference)pathPlannerToolEClass.getEStructuralFeatures().get(5);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPathPlannerTool__PlanPath() {
		return pathPlannerToolEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathPlannerToolNode() {
		return pathPlannerToolNodeEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathPlannerToolNode_PathPlannerTool() {
		return (EReference)pathPlannerToolNodeEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVehiclePathPlannerTool() {
		return vehiclePathPlannerToolEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehiclePathPlannerTool_Variable() {
		return (EReference)vehiclePathPlannerToolEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getZCorrectionMode()
  {
		return zCorrectionModeEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getOrientationCorrectionMode()
  {
		return orientationCorrectionModeEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getWheelContactMode()
  {
		return wheelContactModeEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getSegment2D()
  {
		return segment2DEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getLine3d()
  {
		return line3dEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getPlane()
  {
		return planeEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getTerrainProfile()
  {
		return terrainProfileEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getClosestNeighbourIteratorProvider()
  {
		return closestNeighbourIteratorProviderEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getPoint2d()
  {
		return point2dEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getPoint3d()
  {
		return point3dEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getVector3d()
  {
		return vector3dEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getMap()
  {
		return mapEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getList()
  {
		return listEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getSortedSet()
  {
		return sortedSetEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getIterator()
  {
		return iteratorEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyToolsVehicleFactory getSymphonyToolsVehicleFactory()
  {
		return (SymphonyToolsVehicleFactory)getEFactoryInstance();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isCreated = false;

  /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		vehiclePoseCorrectorEClass = createEClass(VEHICLE_POSE_CORRECTOR);
		createEAttribute(vehiclePoseCorrectorEClass, VEHICLE_POSE_CORRECTOR__INITIALIZING);
		createEReference(vehiclePoseCorrectorEClass, VEHICLE_POSE_CORRECTOR__MESHES);
		createEReference(vehiclePoseCorrectorEClass, VEHICLE_POSE_CORRECTOR__CONTACT_BODIES);
		createEAttribute(vehiclePoseCorrectorEClass, VEHICLE_POSE_CORRECTOR__ZCORRECTION_MODE);
		createEAttribute(vehiclePoseCorrectorEClass, VEHICLE_POSE_CORRECTOR__ZCORRECTION);
		createEAttribute(vehiclePoseCorrectorEClass, VEHICLE_POSE_CORRECTOR__ORIENTATION_CORRECTION_MODE);
		createEReference(vehiclePoseCorrectorEClass, VEHICLE_POSE_CORRECTOR__ORIENTATION_CORRECTION);
		createEReference(vehiclePoseCorrectorEClass, VEHICLE_POSE_CORRECTOR__CONTACT_PROVIDER);
		createEOperation(vehiclePoseCorrectorEClass, VEHICLE_POSE_CORRECTOR___RE_INITIALIZE);
		createEOperation(vehiclePoseCorrectorEClass, VEHICLE_POSE_CORRECTOR___GET_MESH_EXTENT2_D__CARTESIANTRIANGULARMESH);
		createEOperation(vehiclePoseCorrectorEClass, VEHICLE_POSE_CORRECTOR___GET_CLOSEST_NEIGHBOUR_ITERATOR_PROVIDER__CARTESIANTRIANGULARMESH);

		meshNodeEntryEClass = createEClass(MESH_NODE_ENTRY);
		createEReference(meshNodeEntryEClass, MESH_NODE_ENTRY__NODE);
		createEReference(meshNodeEntryEClass, MESH_NODE_ENTRY__MESH);

		contactProviderEClass = createEClass(CONTACT_PROVIDER);
		createEReference(contactProviderEClass, CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR);
		createEOperation(contactProviderEClass, CONTACT_PROVIDER___EXTRACT_CONTACT_BODIES);
		createEOperation(contactProviderEClass, CONTACT_PROVIDER___UPDATE_CONTACT_POINTS__MATRIX4X4_MAP);

		wheelEClass = createEClass(WHEEL);
		createEAttribute(wheelEClass, WHEEL__RADIUS);
		createEAttribute(wheelEClass, WHEEL__LENGHT);

		thrusterEClass = createEClass(THRUSTER);
		createEAttribute(thrusterEClass, THRUSTER__MINIMUM_THRUST);
		createEAttribute(thrusterEClass, THRUSTER__MAXIMUM_THRUST);
		createEAttribute(thrusterEClass, THRUSTER__CURRENT_THRUST);
		createEAttribute(thrusterEClass, THRUSTER__THRUST_LEVEL);
		createEAttribute(thrusterEClass, THRUSTER__PLUME_ANGLE);

		thrusterBindingEClass = createEClass(THRUSTER_BINDING);
		createEReference(thrusterBindingEClass, THRUSTER_BINDING__THRUSTER);

		wheelContactProviderEClass = createEClass(WHEEL_CONTACT_PROVIDER);
		createEAttribute(wheelContactProviderEClass, WHEEL_CONTACT_PROVIDER__CONTACT_MODE);

		landerSphericalFootEClass = createEClass(LANDER_SPHERICAL_FOOT);
		createEAttribute(landerSphericalFootEClass, LANDER_SPHERICAL_FOOT__RADIUS);

		landerSphericalFootContactProviderEClass = createEClass(LANDER_SPHERICAL_FOOT_CONTACT_PROVIDER);

		vehicleToolsFacadeEClass = createEClass(VEHICLE_TOOLS_FACADE);

		wheelVehicleUtilitiesEClass = createEClass(WHEEL_VEHICLE_UTILITIES);
		createEOperation(wheelVehicleUtilitiesEClass, WHEEL_VEHICLE_UTILITIES___GET_WHEEL_CENTER_POINT__DOUBLE_DOUBLE_SEGMENT2D);
		createEOperation(wheelVehicleUtilitiesEClass, WHEEL_VEHICLE_UTILITIES___GET_WHEEL_CENTER_POINT__DOUBLE_DOUBLE_TERRAINPROFILE);
		createEOperation(wheelVehicleUtilitiesEClass, WHEEL_VEHICLE_UTILITIES___FIND_TERRAIN_PROFILE__CARTESIANTRIANGULARMESH_PLANE);
		createEOperation(wheelVehicleUtilitiesEClass, WHEEL_VEHICLE_UTILITIES___FIND_INTERSECTION__PLANE_LINE3D);
		createEOperation(wheelVehicleUtilitiesEClass, WHEEL_VEHICLE_UTILITIES___IS_POINT_ON_SEGMENT__POINT2D_SEGMENT2D);
		createEOperation(wheelVehicleUtilitiesEClass, WHEEL_VEHICLE_UTILITIES___FIND_MESH_EXTENT2_D__CARTESIANTRIANGULARMESH);
		createEOperation(wheelVehicleUtilitiesEClass, WHEEL_VEHICLE_UTILITIES___IS_WITHIN__POINT3D_MESHEXTENT2D);
		createEOperation(wheelVehicleUtilitiesEClass, WHEEL_VEHICLE_UTILITIES___FIND_BEST_FIT_PLANE__LIST);

		meshExtent2DEClass = createEClass(MESH_EXTENT2_D);
		createEAttribute(meshExtent2DEClass, MESH_EXTENT2_D__MINIMUM_X);
		createEAttribute(meshExtent2DEClass, MESH_EXTENT2_D__MINIMUM_Y);
		createEAttribute(meshExtent2DEClass, MESH_EXTENT2_D__MAXIMUM_X);
		createEAttribute(meshExtent2DEClass, MESH_EXTENT2_D__MAXIMUM_Y);

		pathPlannerToolEClass = createEClass(PATH_PLANNER_TOOL);
		createEAttribute(pathPlannerToolEClass, PATH_PLANNER_TOOL__BUSY);
		createEAttribute(pathPlannerToolEClass, PATH_PLANNER_TOOL__AUTO_PATH_PLAN_ENABLED);
		createEReference(pathPlannerToolEClass, PATH_PLANNER_TOOL__MESH_LAYER);
		createEReference(pathPlannerToolEClass, PATH_PLANNER_TOOL__PATH_PLANNER);
		createEReference(pathPlannerToolEClass, PATH_PLANNER_TOOL__PLANNED_PATH);
		createEReference(pathPlannerToolEClass, PATH_PLANNER_TOOL__PATH_PLANNER_TOOL_NODE);
		createEOperation(pathPlannerToolEClass, PATH_PLANNER_TOOL___PLAN_PATH);

		pathPlannerToolNodeEClass = createEClass(PATH_PLANNER_TOOL_NODE);
		createEReference(pathPlannerToolNodeEClass, PATH_PLANNER_TOOL_NODE__PATH_PLANNER_TOOL);

		vehiclePathPlannerToolEClass = createEClass(VEHICLE_PATH_PLANNER_TOOL);
		createEReference(vehiclePathPlannerToolEClass, VEHICLE_PATH_PLANNER_TOOL__VARIABLE);

		// Create enums
		zCorrectionModeEEnum = createEEnum(ZCORRECTION_MODE);
		orientationCorrectionModeEEnum = createEEnum(ORIENTATION_CORRECTION_MODE);
		wheelContactModeEEnum = createEEnum(WHEEL_CONTACT_MODE);

		// Create data types
		point2dEDataType = createEDataType(POINT2D);
		point3dEDataType = createEDataType(POINT3D);
		vector3dEDataType = createEDataType(VECTOR3D);
		mapEDataType = createEDataType(MAP);
		listEDataType = createEDataType(LIST);
		sortedSetEDataType = createEDataType(SORTED_SET);
		iteratorEDataType = createEDataType(ITERATOR);
		segment2DEDataType = createEDataType(SEGMENT2_D);
		line3dEDataType = createEDataType(LINE3D);
		planeEDataType = createEDataType(PLANE);
		terrainProfileEDataType = createEDataType(TERRAIN_PROFILE);
		closestNeighbourIteratorProviderEDataType = createEDataType(CLOSEST_NEIGHBOUR_ITERATOR_PROVIDER);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isInitialized = false;

  /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SymphonyCorePackage theSymphonyCorePackage = (SymphonyCorePackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyCorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		TopologyDynamicsPackage theTopologyDynamicsPackage = (TopologyDynamicsPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyDynamicsPackage.eNS_URI);
		MathPackage theMathPackage = (MathPackage)EPackage.Registry.INSTANCE.getEPackage(MathPackage.eNS_URI);
		Data3dPackage theData3dPackage = (Data3dPackage)EPackage.Registry.INSTANCE.getEPackage(Data3dPackage.eNS_URI);
		TopologyPackage theTopologyPackage = (TopologyPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI);
		TopologyBindingsPackage theTopologyBindingsPackage = (TopologyBindingsPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyBindingsPackage.eNS_URI);
		SymphonyToolsCorePackage theSymphonyToolsCorePackage = (SymphonyToolsCorePackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyToolsCorePackage.eNS_URI);
		SymphonyEnvironmentPackage theSymphonyEnvironmentPackage = (SymphonyEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyEnvironmentPackage.eNS_URI);
		PathplannersPackage thePathplannersPackage = (PathplannersPackage)EPackage.Registry.INSTANCE.getEPackage(PathplannersPackage.eNS_URI);
		PathsPackage thePathsPackage = (PathsPackage)EPackage.Registry.INSTANCE.getEPackage(PathsPackage.eNS_URI);
		EMFEcoreInvocatorPackage theEMFEcoreInvocatorPackage = (EMFEcoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreInvocatorPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(mapEDataType, "K");
		addETypeParameter(mapEDataType, "V");
		addETypeParameter(listEDataType, "T");
		addETypeParameter(sortedSetEDataType, "T");
		addETypeParameter(iteratorEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		vehiclePoseCorrectorEClass.getESuperTypes().add(theSymphonyCorePackage.getPoseCorrector());
		wheelEClass.getESuperTypes().add(theTopologyDynamicsPackage.getPhysicalBody());
		thrusterEClass.getESuperTypes().add(theTopologyPackage.getNode());
		thrusterBindingEClass.getESuperTypes().add(theTopologyBindingsPackage.getAbstractTopologyBinding());
		wheelContactProviderEClass.getESuperTypes().add(this.getContactProvider());
		landerSphericalFootEClass.getESuperTypes().add(theTopologyDynamicsPackage.getPhysicalBody());
		landerSphericalFootContactProviderEClass.getESuperTypes().add(this.getContactProvider());
		pathPlannerToolEClass.getESuperTypes().add(theSymphonyToolsCorePackage.getAbstractTwoPoints3DTool());
		pathPlannerToolNodeEClass.getESuperTypes().add(theTopologyPackage.getAggregateGroupNode());
		vehiclePathPlannerToolEClass.getESuperTypes().add(this.getPathPlannerTool());

		// Initialize classes, features, and operations; add parameters
		initEClass(vehiclePoseCorrectorEClass, VehiclePoseCorrector.class, "VehiclePoseCorrector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVehiclePoseCorrector_Initializing(), theEcorePackage.getEBoolean(), "initializing", "false", 0, 1, VehiclePoseCorrector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehiclePoseCorrector_Meshes(), this.getMeshNodeEntry(), null, "meshes", null, 0, -1, VehiclePoseCorrector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehiclePoseCorrector_ContactBodies(), theTopologyDynamicsPackage.getPhysicalBody(), null, "contactBodies", null, 0, -1, VehiclePoseCorrector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehiclePoseCorrector_ZCorrectionMode(), this.getZCorrectionMode(), "zCorrectionMode", null, 0, 1, VehiclePoseCorrector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehiclePoseCorrector_ZCorrection(), theEcorePackage.getEDouble(), "zCorrection", "0", 0, 1, VehiclePoseCorrector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehiclePoseCorrector_OrientationCorrectionMode(), this.getOrientationCorrectionMode(), "orientationCorrectionMode", null, 0, 1, VehiclePoseCorrector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehiclePoseCorrector_OrientationCorrection(), theMathPackage.getMatrix3x3(), null, "orientationCorrection", null, 0, 1, VehiclePoseCorrector.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehiclePoseCorrector_ContactProvider(), this.getContactProvider(), this.getContactProvider_VehiclePoseCorrector(), "contactProvider", null, 1, 1, VehiclePoseCorrector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getVehiclePoseCorrector__ReInitialize(), null, "reInitialize", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getVehiclePoseCorrector__GetMeshExtent2D__CartesianTriangularMesh(), this.getMeshExtent2D(), "getMeshExtent2D", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theData3dPackage.getCartesianTriangularMesh(), "mesh", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVehiclePoseCorrector__GetClosestNeighbourIteratorProvider__CartesianTriangularMesh(), this.getClosestNeighbourIteratorProvider(), "getClosestNeighbourIteratorProvider", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theData3dPackage.getCartesianTriangularMesh(), "mesh", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(meshNodeEntryEClass, MeshNodeEntry.class, "MeshNodeEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeshNodeEntry_Node(), theTopologyPackage.getNode(), null, "node", null, 0, 1, MeshNodeEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeshNodeEntry_Mesh(), theData3dPackage.getCartesianTriangularMesh(), null, "mesh", null, 0, 1, MeshNodeEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactProviderEClass, ContactProvider.class, "ContactProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContactProvider_VehiclePoseCorrector(), this.getVehiclePoseCorrector(), this.getVehiclePoseCorrector_ContactProvider(), "vehiclePoseCorrector", null, 0, 1, ContactProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getContactProvider__ExtractContactBodies(), null, "extractContactBodies", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(theTopologyDynamicsPackage.getPhysicalBody());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getContactProvider__UpdateContactPoints__Matrix4x4_Map(), null, "updateContactPoints", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getMatrix4x4(), "originalPose", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getMap());
		g2 = createEGenericType(theTopologyDynamicsPackage.getPhysicalBody());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getPoint3d());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "bodyToContactsMap", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(wheelEClass, Wheel.class, "Wheel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWheel_Radius(), theEcorePackage.getEDouble(), "radius", "0.25", 0, 1, Wheel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWheel_Lenght(), theEcorePackage.getEDouble(), "lenght", "0.1", 0, 1, Wheel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thrusterEClass, Thruster.class, "Thruster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThruster_MinimumThrust(), theEcorePackage.getEDouble(), "minimumThrust", "0", 0, 1, Thruster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThruster_MaximumThrust(), theEcorePackage.getEDouble(), "maximumThrust", "100", 0, 1, Thruster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThruster_CurrentThrust(), theEcorePackage.getEDouble(), "currentThrust", null, 0, 1, Thruster.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThruster_ThrustLevel(), theEcorePackage.getEDouble(), "thrustLevel", "0.0", 0, 1, Thruster.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThruster_PlumeAngle(), theEcorePackage.getEDouble(), "plumeAngle", "0.5", 0, 1, Thruster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thrusterBindingEClass, ThrusterBinding.class, "ThrusterBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThrusterBinding_Thruster(), this.getThruster(), null, "thruster", null, 0, 1, ThrusterBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wheelContactProviderEClass, WheelContactProvider.class, "WheelContactProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWheelContactProvider_ContactMode(), this.getWheelContactMode(), "contactMode", null, 0, 1, WheelContactProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(landerSphericalFootEClass, LanderSphericalFoot.class, "LanderSphericalFoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanderSphericalFoot_Radius(), theEcorePackage.getEDouble(), "radius", "0.01", 0, 1, LanderSphericalFoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(landerSphericalFootContactProviderEClass, LanderSphericalFootContactProvider.class, "LanderSphericalFootContactProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vehicleToolsFacadeEClass, VehicleToolsFacade.class, "VehicleToolsFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wheelVehicleUtilitiesEClass, WheelVehicleUtilities.class, "WheelVehicleUtilities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getWheelVehicleUtilities__GetWheelCenterPoint__double_double_Segment2D(), this.getPoint2d(), "getWheelCenterPoint", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "wheelRadius", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "wheelCenterX", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSegment2D(), "segment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWheelVehicleUtilities__GetWheelCenterPoint__double_double_TerrainProfile(), this.getPoint2d(), "getWheelCenterPoint", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "wheelRadius", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "wheelCenterX", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTerrainProfile(), "terrainProfile", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWheelVehicleUtilities__FindTerrainProfile__CartesianTriangularMesh_Plane(), this.getTerrainProfile(), "findTerrainProfile", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theData3dPackage.getCartesianTriangularMesh(), "mesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPlane(), "plane", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWheelVehicleUtilities__FindIntersection__Plane_Line3d(), null, "findIntersection", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPlane(), "plane", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLine3d(), "line3d", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getPoint3d());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getWheelVehicleUtilities__IsPointOnSegment__Point2d_Segment2D(), theEcorePackage.getEBoolean(), "isPointOnSegment", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint2d(), "p", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSegment2D(), "segment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWheelVehicleUtilities__FindMeshExtent2D__CartesianTriangularMesh(), this.getMeshExtent2D(), "findMeshExtent2D", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theData3dPackage.getCartesianTriangularMesh(), "mesh", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWheelVehicleUtilities__IsWithin__Point3d_MeshExtent2D(), theEcorePackage.getEBoolean(), "isWithin", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "point", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMeshExtent2D(), "meshExtent", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWheelVehicleUtilities__FindBestFitPlane__List(), this.getVector3d(), "findBestFitPlane", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getPoint3d());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "points", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(meshExtent2DEClass, MeshExtent2D.class, "MeshExtent2D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeshExtent2D_MinimumX(), theEcorePackage.getEDouble(), "minimumX", "0", 0, 1, MeshExtent2D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeshExtent2D_MinimumY(), theEcorePackage.getEDouble(), "minimumY", "0", 0, 1, MeshExtent2D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeshExtent2D_MaximumX(), theEcorePackage.getEDouble(), "maximumX", "0", 0, 1, MeshExtent2D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeshExtent2D_MaximumY(), theEcorePackage.getEDouble(), "maximumY", "0", 0, 1, MeshExtent2D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathPlannerToolEClass, PathPlannerTool.class, "PathPlannerTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPathPlannerTool_Busy(), theEcorePackage.getEBoolean(), "busy", "false", 0, 1, PathPlannerTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathPlannerTool_AutoPathPlanEnabled(), theEcorePackage.getEBoolean(), "autoPathPlanEnabled", "false", 0, 1, PathPlannerTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathPlannerTool_MeshLayer(), theSymphonyEnvironmentPackage.getCartesianTriangularMeshMapLayer(), null, "meshLayer", null, 0, 1, PathPlannerTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathPlannerTool_PathPlanner(), thePathplannersPackage.getMeshWayPointPathPlanner(), null, "pathPlanner", null, 0, 1, PathPlannerTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathPlannerTool_PlannedPath(), thePathsPackage.getWayPointPath(), null, "plannedPath", null, 0, 1, PathPlannerTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathPlannerTool_PathPlannerToolNode(), this.getPathPlannerToolNode(), this.getPathPlannerToolNode_PathPlannerTool(), "pathPlannerToolNode", null, 0, 1, PathPlannerTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPathPlannerTool__PlanPath(), theEcorePackage.getEBoolean(), "planPath", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(pathPlannerToolNodeEClass, PathPlannerToolNode.class, "PathPlannerToolNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathPlannerToolNode_PathPlannerTool(), this.getPathPlannerTool(), this.getPathPlannerTool_PathPlannerToolNode(), "pathPlannerTool", null, 0, 1, PathPlannerToolNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehiclePathPlannerToolEClass, VehiclePathPlannerTool.class, "VehiclePathPlannerTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVehiclePathPlannerTool_Variable(), theEMFEcoreInvocatorPackage.getVariable(), null, "variable", null, 1, 1, VehiclePathPlannerTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(zCorrectionModeEEnum, ZCorrectionMode.class, "ZCorrectionMode");
		addEEnumLiteral(zCorrectionModeEEnum, ZCorrectionMode.AVERAGE_CONTACT);
		addEEnumLiteral(zCorrectionModeEEnum, ZCorrectionMode.HIGHEST_CONTACT);
		addEEnumLiteral(zCorrectionModeEEnum, ZCorrectionMode.LOWEST_CONTACT);
		addEEnumLiteral(zCorrectionModeEEnum, ZCorrectionMode.NO_ZCORRECTION);

		initEEnum(orientationCorrectionModeEEnum, OrientationCorrectionMode.class, "OrientationCorrectionMode");
		addEEnumLiteral(orientationCorrectionModeEEnum, OrientationCorrectionMode.LEAST_SQUARE_PLANE_CORRECTION);
		addEEnumLiteral(orientationCorrectionModeEEnum, OrientationCorrectionMode.NO_ORIENTATION_CORRECTION);

		initEEnum(wheelContactModeEEnum, WheelContactMode.class, "WheelContactMode");
		addEEnumLiteral(wheelContactModeEEnum, WheelContactMode.POINT_WHEEL_CONTACT);
		addEEnumLiteral(wheelContactModeEEnum, WheelContactMode.CYLINDRICAL_WHEEL_CONTACT);

		// Initialize data types
		initEDataType(point2dEDataType, Point2d.class, "Point2d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(point3dEDataType, Point3d.class, "Point3d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(vector3dEDataType, Vector3d.class, "Vector3d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mapEDataType, Map.class, "Map", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sortedSetEDataType, SortedSet.class, "SortedSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iteratorEDataType, Iterator.class, "Iterator", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(segment2DEDataType, Segment2D.class, "Segment2D", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(line3dEDataType, Line3d.class, "Line3d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(planeEDataType, Plane.class, "Plane", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(terrainProfileEDataType, TerrainProfile.class, "TerrainProfile", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(closestNeighbourIteratorProviderEDataType, ClosestNeighbourIteratorProvider.class, "ClosestNeighbourIteratorProvider", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

  /**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGenModelAnnotations()
  {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "prefix", "SymphonyToolsVehicle",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "copyrightText", "Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)",
			 "modelName", "SymphonyToolsVehicle",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.addons.vehicle/src-generated",
			 "editDirectory", "/org.eclipse.symphony.addons.vehicle.edit/src-generated",
			 "basePackage", "org.eclipse.symphony.addons"
		   });	
		addAnnotation
		  (zCorrectionModeEEnum, 
		   source, 
		   new String[] {
			 "documentation", "Enumeration of available methods use to compute the correction along the Z axis."
		   });	
		addAnnotation
		  (orientationCorrectionModeEEnum, 
		   source, 
		   new String[] {
			 "documentation", "Enumeration of available methods use to compute the orientation correction."
		   });	
		addAnnotation
		  (getVehiclePoseCorrector__ReInitialize(), 
		   source, 
		   new String[] {
			 "documentation", " Method that forces re-initialization of the pose corrector meshes contact geometries."
		   });	
		addAnnotation
		  (getVehiclePoseCorrector__GetMeshExtent2D__CartesianTriangularMesh(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the MeshExtent2D associated with the specified mesh.\n@param mesh The specified mesh.\n@return The MeshExtent2D associated with the mesh or null if none is found."
		   });	
		addAnnotation
		  (getVehiclePoseCorrector__GetClosestNeighbourIteratorProvider__CartesianTriangularMesh(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the ClosestNeighbourIteratorProvider associated with the specified mesh.\n@param mesh The specified mesh.\n@return The ClosestNeighbourIteratorProvider associated with the mesh or null if none is found."
		   });	
		addAnnotation
		  (getVehiclePoseCorrector_Initializing(), 
		   source, 
		   new String[] {
			 "documentation", " Whether or not the corrector is initializing.",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "INTERNAL_INFO"
		   });	
		addAnnotation
		  (getVehiclePoseCorrector_Meshes(), 
		   source, 
		   new String[] {
			 "documentation", " The list of ContentNode containing the meshes being processed to find contact points.",
			 "children", "true",
			 "notify", "true",
			 "propertyCategory", "INTERNAL_INFO"
		   });	
		addAnnotation
		  (getVehiclePoseCorrector_ContactBodies(), 
		   source, 
		   new String[] {
			 "documentation", " The list of physical bodies being processed to find contact points.",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "INTERNAL_INFO"
		   });	
		addAnnotation
		  (getVehiclePoseCorrector_ZCorrectionMode(), 
		   source, 
		   new String[] {
			 "documentation", " The method used to compute the correction along the Z axis.",
			 "notify", "true",
			 "propertyCategory", "SETTINGS_INFO"
		   });	
		addAnnotation
		  (getVehiclePoseCorrector_ZCorrection(), 
		   source, 
		   new String[] {
			 "documentation", " The last value of the pose correction along z.",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "CORRECTION_INFO",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getVehiclePoseCorrector_OrientationCorrectionMode(), 
		   source, 
		   new String[] {
			 "documentation", " The method used to correct orientation.",
			 "notify", "true",
			 "propertyCategory", "SETTINGS_INFO"
		   });	
		addAnnotation
		  (getVehiclePoseCorrector_OrientationCorrection(), 
		   source, 
		   new String[] {
			 "documentation", " Orientation Correction.",
			 "notify", "true",
			 "child", "true",
			 "property", "Readonly",
			 "propertyCategory", "CORRECTION_INFO"
		   });	
		addAnnotation
		  (getVehiclePoseCorrector_ContactProvider(), 
		   source, 
		   new String[] {
			 "documentation", " Provider of contacts for the VehiclePoseCorrector."
		   });	
		addAnnotation
		  (meshNodeEntryEClass, 
		   source, 
		   new String[] {
			 "documentation", "Class representing a Node and CartesianTriangularMesh association."
		   });	
		addAnnotation
		  (wheelEClass, 
		   source, 
		   new String[] {
			 "documentation", " Class that represent a physical wheel used to model Wheel to Mesh contact."
		   });	
		addAnnotation
		  (getWheel_Radius(), 
		   source, 
		   new String[] {
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getWheel_Lenght(), 
		   source, 
		   new String[] {
			 "csa_units", "m"
		   });	
		addAnnotation
		  (thrusterEClass, 
		   source, 
		   new String[] {
			 "documentation", "Class that represents a thruster, including its plume.\nThe thrust is directed along the +Z axis."
		   });	
		addAnnotation
		  (getThruster_MinimumThrust(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe minimum thrust, in Newtons. Must be positive.",
			 "notify", "true",
			 "csa_units", "N",
			 "propertyCategory", "THRUST_INFO"
		   });	
		addAnnotation
		  (getThruster_MaximumThrust(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe maximum thrust, in Newtons. Must be positive.",
			 "notify", "true",
			 "csa_units", "N",
			 "propertyCategory", "THRUST_INFO"
		   });	
		addAnnotation
		  (getThruster_CurrentThrust(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe current thrust, in Newtons. Always between minimumThrust and maximumThrust.",
			 "notify", "true",
			 "csa_units", "N",
			 "propertyCategory", "THRUST_INFO"
		   });	
		addAnnotation
		  (getThruster_ThrustLevel(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe current thrust level. Between 0.0 and 1.0",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "THRUST_INFO"
		   });	
		addAnnotation
		  (getThruster_PlumeAngle(), 
		   source, 
		   new String[] {
			 "documentation", " Plume angle, in radians",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (wheelContactModeEEnum, 
		   source, 
		   new String[] {
			 "documentation", " Enumeration of available model of wheel to Mesh contact."
		   });	
		addAnnotation
		  (getWheelContactProvider_ContactMode(), 
		   source, 
		   new String[] {
			 "documentation", " The type of wheel to Mesh contact to use.",
			 "notify", "true",
			 "propertyCategory", "SETTINGS_INFO"
		   });	
		addAnnotation
		  (getLanderSphericalFoot_Radius(), 
		   source, 
		   new String[] {
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getWheelVehicleUtilities__GetWheelCenterPoint__double_double_Segment2D(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the location of the wheel center that makes the wheel contact the specified segment.\n@param wheelRadius The wheel radius, in meters.\n@param The wheel center x position in the profile coordinates.\n@param segment The specified segment.\n@return The position of the wheel center, null if none is found."
		   });	
		addAnnotation
		  (getWheelVehicleUtilities__GetWheelCenterPoint__double_double_TerrainProfile(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the location of the wheel center that makes the wheel contact with the specified TerrainProfile.\n@param wheelRadius The wheel radius, in meters.\n@param The wheel center x position in the profile coordinates.\n@param terrainProfile The specified TerrainProfile.\n@return The position of the wheel center, null if none is found."
		   });	
		addAnnotation
		  (getWheelVehicleUtilities__FindTerrainProfile__CartesianTriangularMesh_Plane(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the terrain profile for the specified plane cutting through the specified mesh.\n@param mesh The specified mesh.\n@param plane The specified plane.\n@return The set of Segment (sorted by p1.x) of the profile found at the intersection."
		   });	
		addAnnotation
		  (getWheelVehicleUtilities__FindIntersection__Plane_Line3d(), 
		   source, 
		   new String[] {
			 "documentation", "Finds the list of points found at the intersection of the specified plane and line.\n@param plane The specified Plane.\n@param line3d The specified line\n@return The list containing the intersection points. Can be empty if no intersection is found.\nCan contain 1 point if the line intersect with the plane but does lies in it. Can contain 2\npoints (the segment end points) if the line lies in the plane."
		   });	
		addAnnotation
		  (getWheelVehicleUtilities__IsPointOnSegment__Point2d_Segment2D(), 
		   source, 
		   new String[] {
			 "documentation", "Returns whether or no a specified point falls on a Segment2D\n@param p The specified point.\n@param segment The sepcified Segment2D.\n@return True if the point falls on the segment, false otherwise."
		   });	
		addAnnotation
		  (getWheelVehicleUtilities__FindMeshExtent2D__CartesianTriangularMesh(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the mesh extent of a specified mesh.\n@param mesh The specified mesh.\n@return The associated MeshExtent."
		   });	
		addAnnotation
		  (getWheelVehicleUtilities__IsWithin__Point3d_MeshExtent2D(), 
		   source, 
		   new String[] {
			 "documentation", "Returns whether of not a specified point falls within a mesh extents.\n@param point The specified point.\n@param meshExtent The specified mesh extent.\n@return True is the point falls within the meshExtent, false otherwise."
		   });	
		addAnnotation
		  (getWheelVehicleUtilities__FindBestFitPlane__List(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the normal of the plane that best (least square errors) fits a set of points.\n@param points The list of points.\n@return The normal of the plane that best (least square errors) fits a set of points, null if it is not defined.\n@see D. Gingras, Memoire de maitrise, pp. 73-74."
		   });	
		addAnnotation
		  (getPathPlannerTool__PlanPath(), 
		   source, 
		   new String[] {
			 "documentation", "*\nMethod that plan a path from the variable current location to the specified destination and updates\nthe planned path according to the result."
		   });	
		addAnnotation
		  (getPathPlannerTool_Busy(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (getPathPlannerTool_AutoPathPlanEnabled(), 
		   source, 
		   new String[] {
			 "documentation", "*\nWhether or not automatic path planning is enabled. When enabled, chnaging the destination will automatically\nstart a replan of the path.",
			 "notify", "true",
			 "property", "Editable"
		   });	
		addAnnotation
		  (getPathPlannerTool_MeshLayer(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe mesh layer to use to plan the path."
		   });	
		addAnnotation
		  (getPathPlannerTool_PathPlanner(), 
		   source, 
		   new String[] {
			 "children", "true",
			 "notify", "true"
		   });	
		addAnnotation
		  (getPathPlannerTool_PlannedPath(), 
		   source, 
		   new String[] {
			 "children", "true",
			 "notify", "true",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (getPathPlannerTool_PathPlannerToolNode(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "property", "None",
			 "propertyCategory", "TRAJECTORY_3D_TOOL"
		   });	
		addAnnotation
		  (getVehiclePathPlannerTool_Variable(), 
		   source, 
		   new String[] {
			 "documentation", " The Symphony System for which to plan a path.",
			 "propertyCategory", "TRAJECTORY_3D_TOOL"
		   });
	}

} //SymphonyToolsVehiclePackageImpl
