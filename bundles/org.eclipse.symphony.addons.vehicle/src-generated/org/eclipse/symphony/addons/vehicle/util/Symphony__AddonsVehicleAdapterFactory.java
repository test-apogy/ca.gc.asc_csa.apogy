/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.addons.AbstractTool;
import org.eclipse.symphony.addons.AbstractTwoPoints3DTool;
import org.eclipse.symphony.addons.Simple3DTool;
import org.eclipse.symphony.addons.SimpleTool;
import org.eclipse.symphony.addons.vehicle.ContactProvider;
import org.eclipse.symphony.addons.vehicle.LanderSphericalFoot;
import org.eclipse.symphony.addons.vehicle.LanderSphericalFootContactProvider;
import org.eclipse.symphony.addons.vehicle.MeshExtent2D;
import org.eclipse.symphony.addons.vehicle.MeshNodeEntry;
import org.eclipse.symphony.addons.vehicle.PathPlannerTool;
import org.eclipse.symphony.addons.vehicle.PathPlannerToolNode;
import org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage;
import org.eclipse.symphony.addons.vehicle.Thruster;
import org.eclipse.symphony.addons.vehicle.ThrusterBinding;
import org.eclipse.symphony.addons.vehicle.VehiclePathPlannerTool;
import org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector;
import org.eclipse.symphony.addons.vehicle.VehicleToolsFacade;
import org.eclipse.symphony.addons.vehicle.Wheel;
import org.eclipse.symphony.addons.vehicle.WheelContactProvider;
import org.eclipse.symphony.addons.vehicle.WheelVehicleUtilities;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;
import org.eclipse.symphony.common.topology.AggregateGroupNode;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.addons.dynamics.PhysicalBody;
import org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding;
import org.eclipse.symphony.core.PoseCorrector;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage
 * @generated
 */
public class Symphony__AddonsVehicleAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static Symphony__AddonsVehiclePackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__AddonsVehicleAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = Symphony__AddonsVehiclePackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected Symphony__AddonsVehicleSwitch<Adapter> modelSwitch =
    new Symphony__AddonsVehicleSwitch<Adapter>() {
			@Override
			public Adapter caseVehiclePoseCorrector(VehiclePoseCorrector object) {
				return createVehiclePoseCorrectorAdapter();
			}
			@Override
			public Adapter caseMeshNodeEntry(MeshNodeEntry object) {
				return createMeshNodeEntryAdapter();
			}
			@Override
			public Adapter caseContactProvider(ContactProvider object) {
				return createContactProviderAdapter();
			}
			@Override
			public Adapter caseWheel(Wheel object) {
				return createWheelAdapter();
			}
			@Override
			public Adapter caseThruster(Thruster object) {
				return createThrusterAdapter();
			}
			@Override
			public Adapter caseThrusterBinding(ThrusterBinding object) {
				return createThrusterBindingAdapter();
			}
			@Override
			public Adapter caseWheelContactProvider(WheelContactProvider object) {
				return createWheelContactProviderAdapter();
			}
			@Override
			public Adapter caseLanderSphericalFoot(LanderSphericalFoot object) {
				return createLanderSphericalFootAdapter();
			}
			@Override
			public Adapter caseLanderSphericalFootContactProvider(LanderSphericalFootContactProvider object) {
				return createLanderSphericalFootContactProviderAdapter();
			}
			@Override
			public Adapter caseVehicleToolsFacade(VehicleToolsFacade object) {
				return createVehicleToolsFacadeAdapter();
			}
			@Override
			public Adapter caseWheelVehicleUtilities(WheelVehicleUtilities object) {
				return createWheelVehicleUtilitiesAdapter();
			}
			@Override
			public Adapter caseMeshExtent2D(MeshExtent2D object) {
				return createMeshExtent2DAdapter();
			}
			@Override
			public Adapter casePathPlannerTool(PathPlannerTool object) {
				return createPathPlannerToolAdapter();
			}
			@Override
			public Adapter casePathPlannerToolNode(PathPlannerToolNode object) {
				return createPathPlannerToolNodeAdapter();
			}
			@Override
			public Adapter caseVehiclePathPlannerTool(VehiclePathPlannerTool object) {
				return createVehiclePathPlannerToolAdapter();
			}
			@Override
			public Adapter casePoseCorrector(PoseCorrector object) {
				return createPoseCorrectorAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseGroupNode(GroupNode object) {
				return createGroupNodeAdapter();
			}
			@Override
			public Adapter caseAggregateGroupNode(AggregateGroupNode object) {
				return createAggregateGroupNodeAdapter();
			}
			@Override
			public Adapter casePhysicalBody(PhysicalBody object) {
				return createPhysicalBodyAdapter();
			}
			@Override
			public Adapter caseAbstractTopologyBinding(AbstractTopologyBinding object) {
				return createAbstractTopologyBindingAdapter();
			}
			@Override
			public Adapter caseNamed(Named object) {
				return createNamedAdapter();
			}
			@Override
			public Adapter caseDescribed(Described object) {
				return createDescribedAdapter();
			}
			@Override
			public Adapter caseAbstractTool(AbstractTool object) {
				return createAbstractToolAdapter();
			}
			@Override
			public Adapter caseSimpleTool(SimpleTool object) {
				return createSimpleToolAdapter();
			}
			@Override
			public Adapter caseSimple3DTool(Simple3DTool object) {
				return createSimple3DToolAdapter();
			}
			@Override
			public Adapter caseAbstractTwoPoints3DTool(AbstractTwoPoints3DTool object) {
				return createAbstractTwoPoints3DToolAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector <em>Vehicle Pose Corrector</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector
	 * @generated
	 */
  public Adapter createVehiclePoseCorrectorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.vehicle.MeshNodeEntry <em>Mesh Node Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.vehicle.MeshNodeEntry
	 * @generated
	 */
	public Adapter createMeshNodeEntryAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.vehicle.ContactProvider <em>Contact Provider</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.vehicle.ContactProvider
	 * @generated
	 */
  public Adapter createContactProviderAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.vehicle.Wheel <em>Wheel</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.vehicle.Wheel
	 * @generated
	 */
  public Adapter createWheelAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.vehicle.Thruster <em>Thruster</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.vehicle.Thruster
	 * @generated
	 */
  public Adapter createThrusterAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.vehicle.ThrusterBinding <em>Thruster Binding</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.vehicle.ThrusterBinding
	 * @generated
	 */
  public Adapter createThrusterBindingAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.vehicle.WheelContactProvider <em>Wheel Contact Provider</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.vehicle.WheelContactProvider
	 * @generated
	 */
  public Adapter createWheelContactProviderAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.vehicle.LanderSphericalFoot <em>Lander Spherical Foot</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.vehicle.LanderSphericalFoot
	 * @generated
	 */
  public Adapter createLanderSphericalFootAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.vehicle.LanderSphericalFootContactProvider <em>Lander Spherical Foot Contact Provider</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.vehicle.LanderSphericalFootContactProvider
	 * @generated
	 */
  public Adapter createLanderSphericalFootContactProviderAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.vehicle.VehicleToolsFacade <em>Vehicle Tools Facade</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.vehicle.VehicleToolsFacade
	 * @generated
	 */
  public Adapter createVehicleToolsFacadeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.vehicle.WheelVehicleUtilities <em>Wheel Vehicle Utilities</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.vehicle.WheelVehicleUtilities
	 * @generated
	 */
  public Adapter createWheelVehicleUtilitiesAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.vehicle.MeshExtent2D <em>Mesh Extent2 D</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.vehicle.MeshExtent2D
	 * @generated
	 */
  public Adapter createMeshExtent2DAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.vehicle.PathPlannerTool <em>Path Planner Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.vehicle.PathPlannerTool
	 * @generated
	 */
	public Adapter createPathPlannerToolAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.vehicle.PathPlannerToolNode <em>Path Planner Tool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.vehicle.PathPlannerToolNode
	 * @generated
	 */
	public Adapter createPathPlannerToolNodeAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.vehicle.VehiclePathPlannerTool <em>Vehicle Path Planner Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.vehicle.VehiclePathPlannerTool
	 * @generated
	 */
	public Adapter createVehiclePathPlannerToolAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.PoseCorrector <em>Pose Corrector</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.PoseCorrector
	 * @generated
	 */
  public Adapter createPoseCorrectorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.Node
	 * @generated
	 */
  public Adapter createNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.GroupNode <em>Group Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.GroupNode
	 * @generated
	 */
  public Adapter createGroupNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.AggregateGroupNode <em>Aggregate Group Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.AggregateGroupNode
	 * @generated
	 */
  public Adapter createAggregateGroupNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.addons.dynamics.PhysicalBody <em>Physical Body</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.PhysicalBody
	 * @generated
	 */
  public Adapter createPhysicalBodyAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding <em>Abstract Topology Binding</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding
	 * @generated
	 */
  public Adapter createAbstractTopologyBindingAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.Named
	 * @generated
	 */
	public Adapter createNamedAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.Described <em>Described</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.Described
	 * @generated
	 */
	public Adapter createDescribedAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.AbstractTool <em>Abstract Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.AbstractTool
	 * @generated
	 */
	public Adapter createAbstractToolAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.SimpleTool <em>Simple Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.SimpleTool
	 * @generated
	 */
	public Adapter createSimpleToolAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.Simple3DTool <em>Simple3 DTool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.Simple3DTool
	 * @generated
	 */
	public Adapter createSimple3DToolAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool <em>Abstract Two Points3 DTool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.AbstractTwoPoints3DTool
	 * @generated
	 */
	public Adapter createAbstractTwoPoints3DToolAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //Symphony__AddonsVehicleAdapterFactory
