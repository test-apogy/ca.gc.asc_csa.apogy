/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.vehicle.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import ca.gc.asc_csa.apogy.addons.AbstractTool;
import ca.gc.asc_csa.apogy.addons.AbstractTwoPoints3DTool;
import ca.gc.asc_csa.apogy.addons.Simple3DTool;
import ca.gc.asc_csa.apogy.addons.SimpleTool;
import ca.gc.asc_csa.apogy.addons.vehicle.ContactProvider;
import ca.gc.asc_csa.apogy.addons.vehicle.LanderSphericalFoot;
import ca.gc.asc_csa.apogy.addons.vehicle.LanderSphericalFootContactProvider;
import ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D;
import ca.gc.asc_csa.apogy.addons.vehicle.MeshNodeEntry;
import ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool;
import ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerToolNode;
import ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage;
import ca.gc.asc_csa.apogy.addons.vehicle.Thruster;
import ca.gc.asc_csa.apogy.addons.vehicle.ThrusterBinding;
import ca.gc.asc_csa.apogy.addons.vehicle.VehiclePathPlannerTool;
import ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector;
import ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehicleFacade;
import ca.gc.asc_csa.apogy.addons.vehicle.Wheel;
import ca.gc.asc_csa.apogy.addons.vehicle.WheelContactProvider;
import ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody;
import ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding;
import ca.gc.asc_csa.apogy.core.PoseCorrector;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage
 * @generated
 */
public class ApogyAddonsVehicleSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ApogyAddonsVehiclePackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyAddonsVehicleSwitch()
  {
		if (modelPackage == null) {
			modelPackage = ApogyAddonsVehiclePackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
		return ePackage == modelPackage;
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case ApogyAddonsVehiclePackage.VEHICLE_POSE_CORRECTOR: {
				VehiclePoseCorrector vehiclePoseCorrector = (VehiclePoseCorrector)theEObject;
				T result = caseVehiclePoseCorrector(vehiclePoseCorrector);
				if (result == null) result = casePoseCorrector(vehiclePoseCorrector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsVehiclePackage.MESH_NODE_ENTRY: {
				MeshNodeEntry meshNodeEntry = (MeshNodeEntry)theEObject;
				T result = caseMeshNodeEntry(meshNodeEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsVehiclePackage.CONTACT_PROVIDER: {
				ContactProvider contactProvider = (ContactProvider)theEObject;
				T result = caseContactProvider(contactProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsVehiclePackage.WHEEL: {
				Wheel wheel = (Wheel)theEObject;
				T result = caseWheel(wheel);
				if (result == null) result = casePhysicalBody(wheel);
				if (result == null) result = caseAggregateGroupNode(wheel);
				if (result == null) result = caseGroupNode(wheel);
				if (result == null) result = caseNode(wheel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsVehiclePackage.THRUSTER: {
				Thruster thruster = (Thruster)theEObject;
				T result = caseThruster(thruster);
				if (result == null) result = caseNode(thruster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsVehiclePackage.THRUSTER_BINDING: {
				ThrusterBinding thrusterBinding = (ThrusterBinding)theEObject;
				T result = caseThrusterBinding(thrusterBinding);
				if (result == null) result = caseAbstractTopologyBinding(thrusterBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsVehiclePackage.WHEEL_CONTACT_PROVIDER: {
				WheelContactProvider wheelContactProvider = (WheelContactProvider)theEObject;
				T result = caseWheelContactProvider(wheelContactProvider);
				if (result == null) result = caseContactProvider(wheelContactProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsVehiclePackage.LANDER_SPHERICAL_FOOT: {
				LanderSphericalFoot landerSphericalFoot = (LanderSphericalFoot)theEObject;
				T result = caseLanderSphericalFoot(landerSphericalFoot);
				if (result == null) result = casePhysicalBody(landerSphericalFoot);
				if (result == null) result = caseAggregateGroupNode(landerSphericalFoot);
				if (result == null) result = caseGroupNode(landerSphericalFoot);
				if (result == null) result = caseNode(landerSphericalFoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsVehiclePackage.LANDER_SPHERICAL_FOOT_CONTACT_PROVIDER: {
				LanderSphericalFootContactProvider landerSphericalFootContactProvider = (LanderSphericalFootContactProvider)theEObject;
				T result = caseLanderSphericalFootContactProvider(landerSphericalFootContactProvider);
				if (result == null) result = caseContactProvider(landerSphericalFootContactProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsVehiclePackage.APOGY_ADDONS_VEHICLE_FACADE: {
				ApogyAddonsVehicleFacade apogy__AddonsVehicleFacade = (ApogyAddonsVehicleFacade)theEObject;
				T result = caseApogyAddonsVehicleFacade(apogy__AddonsVehicleFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsVehiclePackage.WHEEL_VEHICLE_UTILITIES: {
				WheelVehicleUtilities wheelVehicleUtilities = (WheelVehicleUtilities)theEObject;
				T result = caseWheelVehicleUtilities(wheelVehicleUtilities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsVehiclePackage.MESH_EXTENT2_D: {
				MeshExtent2D meshExtent2D = (MeshExtent2D)theEObject;
				T result = caseMeshExtent2D(meshExtent2D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsVehiclePackage.PATH_PLANNER_TOOL: {
				PathPlannerTool pathPlannerTool = (PathPlannerTool)theEObject;
				T result = casePathPlannerTool(pathPlannerTool);
				if (result == null) result = caseAbstractTwoPoints3DTool(pathPlannerTool);
				if (result == null) result = caseSimple3DTool(pathPlannerTool);
				if (result == null) result = caseSimpleTool(pathPlannerTool);
				if (result == null) result = caseAbstractTool(pathPlannerTool);
				if (result == null) result = caseNamed(pathPlannerTool);
				if (result == null) result = caseDescribed(pathPlannerTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsVehiclePackage.PATH_PLANNER_TOOL_NODE: {
				PathPlannerToolNode pathPlannerToolNode = (PathPlannerToolNode)theEObject;
				T result = casePathPlannerToolNode(pathPlannerToolNode);
				if (result == null) result = caseAggregateGroupNode(pathPlannerToolNode);
				if (result == null) result = caseGroupNode(pathPlannerToolNode);
				if (result == null) result = caseNode(pathPlannerToolNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsVehiclePackage.VEHICLE_PATH_PLANNER_TOOL: {
				VehiclePathPlannerTool vehiclePathPlannerTool = (VehiclePathPlannerTool)theEObject;
				T result = caseVehiclePathPlannerTool(vehiclePathPlannerTool);
				if (result == null) result = casePathPlannerTool(vehiclePathPlannerTool);
				if (result == null) result = caseAbstractTwoPoints3DTool(vehiclePathPlannerTool);
				if (result == null) result = caseSimple3DTool(vehiclePathPlannerTool);
				if (result == null) result = caseSimpleTool(vehiclePathPlannerTool);
				if (result == null) result = caseAbstractTool(vehiclePathPlannerTool);
				if (result == null) result = caseNamed(vehiclePathPlannerTool);
				if (result == null) result = caseDescribed(vehiclePathPlannerTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle Pose Corrector</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle Pose Corrector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseVehiclePoseCorrector(VehiclePoseCorrector object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Mesh Node Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mesh Node Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeshNodeEntry(MeshNodeEntry object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Provider</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseContactProvider(ContactProvider object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Wheel</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wheel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseWheel(Wheel object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Thruster</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thruster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseThruster(Thruster object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Thruster Binding</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thruster Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseThrusterBinding(ThrusterBinding object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Wheel Contact Provider</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wheel Contact Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseWheelContactProvider(WheelContactProvider object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Lander Spherical Foot</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lander Spherical Foot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseLanderSphericalFoot(LanderSphericalFoot object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Lander Spherical Foot Contact Provider</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lander Spherical Foot Contact Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseLanderSphericalFootContactProvider(LanderSphericalFootContactProvider object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApogyAddonsVehicleFacade(ApogyAddonsVehicleFacade object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Wheel Vehicle Utilities</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wheel Vehicle Utilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseWheelVehicleUtilities(WheelVehicleUtilities object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Mesh Extent2 D</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mesh Extent2 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMeshExtent2D(MeshExtent2D object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Path Planner Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Planner Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathPlannerTool(PathPlannerTool object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Planner Tool Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Planner Tool Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathPlannerToolNode(PathPlannerToolNode object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle Path Planner Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle Path Planner Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehiclePathPlannerTool(VehiclePathPlannerTool object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Pose Corrector</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pose Corrector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePoseCorrector(PoseCorrector object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNode(Node object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Group Node</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseGroupNode(GroupNode object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Group Node</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Group Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAggregateGroupNode(AggregateGroupNode object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Body</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePhysicalBody(PhysicalBody object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Topology Binding</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Topology Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractTopologyBinding(AbstractTopologyBinding object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamed(Named object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Described</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribed(Described object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTool(AbstractTool object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleTool(SimpleTool object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple3 DTool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple3 DTool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimple3DTool(Simple3DTool object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Two Points3 DTool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Two Points3 DTool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTwoPoints3DTool(AbstractTwoPoints3DTool object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  @Override
  public T defaultCase(EObject object)
  {
		return null;
	}

} //ApogyAddonsVehicleSwitch
