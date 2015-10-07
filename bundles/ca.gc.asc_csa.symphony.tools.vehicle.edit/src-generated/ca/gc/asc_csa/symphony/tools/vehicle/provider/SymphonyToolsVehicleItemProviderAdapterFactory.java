/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.vehicle.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.symphony.core.AssemblyLink;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.core.SymphonySystemApiAdapter;
import org.eclipse.symphony.core.TopologyRoot;
import org.eclipse.symphony.core.util.SymphonyCoreSwitch;

import ca.gc.asc_csa.symphony.tools.core.SimpleToolList;
import ca.gc.asc_csa.symphony.tools.core.SymphonyToolsCorePackage;
import ca.gc.asc_csa.symphony.tools.core.util.SymphonyToolsCoreSwitch;
import ca.gc.asc_csa.symphony.tools.vehicle.SymphonyToolsVehicleFactory;
import ca.gc.asc_csa.symphony.tools.vehicle.SymphonyToolsVehiclePackage;
import ca.gc.asc_csa.symphony.tools.vehicle.util.SymphonyToolsVehicleAdapterFactory;
import ca.gc.asc_csa.topology.bindings.BindingsList;
import ca.gc.asc_csa.topology.bindings.EnumerationCase;
import ca.gc.asc_csa.topology.bindings.TopologyBindingsPackage;
import ca.gc.asc_csa.topology.bindings.util.TopologyBindingsSwitch;
import ca.gc.space.mrt.geometry.paths.PathsPackage;
import ca.gc.space.mrt.geometry.paths.util.PathsSwitch;
import ca.gc.space.topology.AggregateGroupNode;
import ca.gc.space.topology.ContentNode;
import ca.gc.space.topology.GroupNode;
import ca.gc.space.topology.TopologyPackage;
import ca.gc.space.topology.util.TopologySwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyToolsVehicleItemProviderAdapterFactory extends SymphonyToolsVehicleAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender
{
  /**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ComposedAdapterFactory parentAdapterFactory;

  /**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected IChangeNotifier changeNotifier = new ChangeNotifier();

  /**
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(SymphonyToolsVehicleEditPlugin.INSTANCE, SymphonyToolsVehiclePackage.eNS_URI);

  /**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected Collection<Object> supportedTypes = new ArrayList<Object>();

  /**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyToolsVehicleItemProviderAdapterFactory()
  {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.vehicle.VehiclePoseCorrector} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected VehiclePoseCorrectorItemProvider vehiclePoseCorrectorItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.vehicle.VehiclePoseCorrector}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createVehiclePoseCorrectorAdapter()
  {
		if (vehiclePoseCorrectorItemProvider == null) {
			vehiclePoseCorrectorItemProvider = new VehiclePoseCorrectorItemProvider(this);
		}

		return vehiclePoseCorrectorItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.vehicle.MeshNodeEntry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeshNodeEntryItemProvider meshNodeEntryItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.vehicle.MeshNodeEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMeshNodeEntryAdapter() {
		if (meshNodeEntryItemProvider == null) {
			meshNodeEntryItemProvider = new MeshNodeEntryItemProvider(this);
		}

		return meshNodeEntryItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.vehicle.Wheel} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected WheelItemProvider wheelItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.vehicle.Wheel}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createWheelAdapter()
  {
		if (wheelItemProvider == null) {
			wheelItemProvider = new WheelItemProvider(this);
		}

		return wheelItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.vehicle.Thruster} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ThrusterItemProvider thrusterItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.vehicle.Thruster}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createThrusterAdapter()
  {
		if (thrusterItemProvider == null) {
			thrusterItemProvider = new ThrusterItemProvider(this);
		}

		return thrusterItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.vehicle.ThrusterBinding} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ThrusterBindingItemProvider thrusterBindingItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.vehicle.ThrusterBinding}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createThrusterBindingAdapter()
  {
		if (thrusterBindingItemProvider == null) {
			thrusterBindingItemProvider = new ThrusterBindingItemProvider(this);
		}

		return thrusterBindingItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.vehicle.WheelContactProvider} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected WheelContactProviderItemProvider wheelContactProviderItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.vehicle.WheelContactProvider}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createWheelContactProviderAdapter()
  {
		if (wheelContactProviderItemProvider == null) {
			wheelContactProviderItemProvider = new WheelContactProviderItemProvider(this);
		}

		return wheelContactProviderItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.vehicle.LanderSphericalFoot} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected LanderSphericalFootItemProvider landerSphericalFootItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.vehicle.LanderSphericalFoot}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createLanderSphericalFootAdapter()
  {
		if (landerSphericalFootItemProvider == null) {
			landerSphericalFootItemProvider = new LanderSphericalFootItemProvider(this);
		}

		return landerSphericalFootItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.vehicle.LanderSphericalFootContactProvider} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected LanderSphericalFootContactProviderItemProvider landerSphericalFootContactProviderItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.vehicle.LanderSphericalFootContactProvider}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createLanderSphericalFootContactProviderAdapter()
  {
		if (landerSphericalFootContactProviderItemProvider == null) {
			landerSphericalFootContactProviderItemProvider = new LanderSphericalFootContactProviderItemProvider(this);
		}

		return landerSphericalFootContactProviderItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.vehicle.VehiculeToolsFacade} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected VehiculeToolsFacadeItemProvider vehiculeToolsFacadeItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.vehicle.VehiculeToolsFacade}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createVehiculeToolsFacadeAdapter()
  {
		if (vehiculeToolsFacadeItemProvider == null) {
			vehiculeToolsFacadeItemProvider = new VehiculeToolsFacadeItemProvider(this);
		}

		return vehiculeToolsFacadeItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.vehicle.WheelVehicleUtilities} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected WheelVehicleUtilitiesItemProvider wheelVehicleUtilitiesItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.vehicle.WheelVehicleUtilities}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createWheelVehicleUtilitiesAdapter()
  {
		if (wheelVehicleUtilitiesItemProvider == null) {
			wheelVehicleUtilitiesItemProvider = new WheelVehicleUtilitiesItemProvider(this);
		}

		return wheelVehicleUtilitiesItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.vehicle.MeshExtent2D} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MeshExtent2DItemProvider meshExtent2DItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.vehicle.MeshExtent2D}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createMeshExtent2DAdapter()
  {
		if (meshExtent2DItemProvider == null) {
			meshExtent2DItemProvider = new MeshExtent2DItemProvider(this);
		}

		return meshExtent2DItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.vehicle.PathPlannerTool} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathPlannerToolItemProvider pathPlannerToolItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.vehicle.PathPlannerTool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPathPlannerToolAdapter() {
		if (pathPlannerToolItemProvider == null) {
			pathPlannerToolItemProvider = new PathPlannerToolItemProvider(this);
		}

		return pathPlannerToolItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.vehicle.PathPlannerToolNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathPlannerToolNodeItemProvider pathPlannerToolNodeItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.vehicle.PathPlannerToolNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPathPlannerToolNodeAdapter() {
		if (pathPlannerToolNodeItemProvider == null) {
			pathPlannerToolNodeItemProvider = new PathPlannerToolNodeItemProvider(this);
		}

		return pathPlannerToolNodeItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.vehicle.VehiclePathPlannerTool} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehiclePathPlannerToolItemProvider vehiclePathPlannerToolItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.vehicle.VehiclePathPlannerTool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVehiclePathPlannerToolAdapter() {
		if (vehiclePathPlannerToolItemProvider == null) {
			vehiclePathPlannerToolItemProvider = new VehiclePathPlannerToolItemProvider(this);
		}

		return vehiclePathPlannerToolItemProvider;
	}

		/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ComposeableAdapterFactory getRootAdapterFactory()
  {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

  /**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
  {
		this.parentAdapterFactory = parentAdapterFactory;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object type)
  {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

  /**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter adapt(Notifier notifier, Object type)
  {
		return super.adapt(notifier, this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object adapt(Object object, Object type)
  {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public List<IChildCreationExtender> getChildCreationExtenders()
  {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain)
  {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ResourceLocator getResourceLocator()
  {
		return childCreationExtenderManager;
	}

  /**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void addListener(INotifyChangedListener notifyChangedListener)
  {
		changeNotifier.addListener(notifyChangedListener);
	}

  /**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void removeListener(INotifyChangedListener notifyChangedListener)
  {
		changeNotifier.removeListener(notifyChangedListener);
	}

  /**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void fireNotifyChanged(Notification notification)
  {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

  /**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void dispose()
  {
		if (vehiclePoseCorrectorItemProvider != null) vehiclePoseCorrectorItemProvider.dispose();
		if (meshNodeEntryItemProvider != null) meshNodeEntryItemProvider.dispose();
		if (wheelItemProvider != null) wheelItemProvider.dispose();
		if (thrusterItemProvider != null) thrusterItemProvider.dispose();
		if (thrusterBindingItemProvider != null) thrusterBindingItemProvider.dispose();
		if (wheelContactProviderItemProvider != null) wheelContactProviderItemProvider.dispose();
		if (landerSphericalFootItemProvider != null) landerSphericalFootItemProvider.dispose();
		if (landerSphericalFootContactProviderItemProvider != null) landerSphericalFootContactProviderItemProvider.dispose();
		if (vehiculeToolsFacadeItemProvider != null) vehiculeToolsFacadeItemProvider.dispose();
		if (wheelVehicleUtilitiesItemProvider != null) wheelVehicleUtilitiesItemProvider.dispose();
		if (meshExtent2DItemProvider != null) meshExtent2DItemProvider.dispose();
		if (pathPlannerToolItemProvider != null) pathPlannerToolItemProvider.dispose();
		if (pathPlannerToolNodeItemProvider != null) pathPlannerToolNodeItemProvider.dispose();
		if (vehiclePathPlannerToolItemProvider != null) vehiclePathPlannerToolItemProvider.dispose();
	}

  /**
	 * A child creation extender for the {@link SymphonyCorePackage}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static class SymphonyCoreChildCreationExtender implements IChildCreationExtender
  {
    /**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    protected static class CreationSwitch extends SymphonyCoreSwitch<Object>
    {
      /**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
			 * @generated
			 */
      protected List<Object> newChildDescriptors;

      /**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
			 * @generated
			 */
      protected EditingDomain editingDomain;

      /**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
			 * @generated
			 */
      CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) 
      {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
      /**
			 * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
			 * @generated
			 */
      @Override
      public Object caseSymphonySystemApiAdapter(SymphonySystemApiAdapter object)
      {
				newChildDescriptors.add
					(createChildParameter
						(SymphonyCorePackage.Literals.SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR,
						 SymphonyToolsVehicleFactory.eINSTANCE.createVehiclePoseCorrector()));

				return null;
			}
 
      /**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseAssemblyLink(AssemblyLink object) {
				newChildDescriptors.add
					(createChildParameter
						(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
						 SymphonyToolsVehicleFactory.eINSTANCE.createWheel()));

				newChildDescriptors.add
					(createChildParameter
						(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
						 SymphonyToolsVehicleFactory.eINSTANCE.createThruster()));

				newChildDescriptors.add
					(createChildParameter
						(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
						 SymphonyToolsVehicleFactory.eINSTANCE.createLanderSphericalFoot()));

				newChildDescriptors.add
					(createChildParameter
						(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
						 SymphonyToolsVehicleFactory.eINSTANCE.createPathPlannerToolNode()));

				return null;
			}
						/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseTopologyRoot(TopologyRoot object) {
				newChildDescriptors.add
					(createChildParameter
						(SymphonyCorePackage.Literals.TOPOLOGY_ROOT__ORIGIN_NODE,
						 SymphonyToolsVehicleFactory.eINSTANCE.createWheel()));

				newChildDescriptors.add
					(createChildParameter
						(SymphonyCorePackage.Literals.TOPOLOGY_ROOT__ORIGIN_NODE,
						 SymphonyToolsVehicleFactory.eINSTANCE.createThruster()));

				newChildDescriptors.add
					(createChildParameter
						(SymphonyCorePackage.Literals.TOPOLOGY_ROOT__ORIGIN_NODE,
						 SymphonyToolsVehicleFactory.eINSTANCE.createLanderSphericalFoot()));

				newChildDescriptors.add
					(createChildParameter
						(SymphonyCorePackage.Literals.TOPOLOGY_ROOT__ORIGIN_NODE,
						 SymphonyToolsVehicleFactory.eINSTANCE.createPathPlannerToolNode()));

				return null;
			}
						/**
			 * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
			 * @generated
			 */
      protected CommandParameter createChildParameter(Object feature, Object child)
      {
				return new CommandParameter(null, feature, child);
			}

    }

    /**
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain)
    {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

    /**
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    public ResourceLocator getResourceLocator()
    {
			return SymphonyToolsVehicleEditPlugin.INSTANCE;
		}
  }

  /**
	 * A child creation extender for the {@link TopologyBindingsPackage}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static class TopologyBindingsChildCreationExtender implements IChildCreationExtender
  {
    /**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    protected static class CreationSwitch extends TopologyBindingsSwitch<Object>
    {
      /**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
			 * @generated
			 */
      protected List<Object> newChildDescriptors;

      /**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
			 * @generated
			 */
      protected EditingDomain editingDomain;

      /**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
			 * @generated
			 */
      CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) 
      {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
      /**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseEnumerationCase(EnumerationCase object) {
				newChildDescriptors.add
					(createChildParameter
						(TopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
						 SymphonyToolsVehicleFactory.eINSTANCE.createWheel()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
						 SymphonyToolsVehicleFactory.eINSTANCE.createThruster()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
						 SymphonyToolsVehicleFactory.eINSTANCE.createLanderSphericalFoot()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
						 SymphonyToolsVehicleFactory.eINSTANCE.createPathPlannerToolNode()));

				return null;
			}
						/**
			 * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
			 * @generated
			 */
      @Override
      public Object caseBindingsList(BindingsList object)
      {
				newChildDescriptors.add
					(createChildParameter
						(TopologyBindingsPackage.Literals.BINDINGS_LIST__BINDINGS,
						 SymphonyToolsVehicleFactory.eINSTANCE.createThrusterBinding()));

				return null;
			}
      /**
			 * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
			 * @generated
			 */
      protected CommandParameter createChildParameter(Object feature, Object child)
      {
				return new CommandParameter(null, feature, child);
			}

    }

    /**
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain)
    {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

    /**
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    public ResourceLocator getResourceLocator()
    {
			return SymphonyToolsVehicleEditPlugin.INSTANCE;
		}
  }

  /**
	 * A child creation extender for the {@link SymphonyToolsCorePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class SymphonyToolsCoreChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends SymphonyToolsCoreSwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseSimpleToolList(SimpleToolList object) {
				newChildDescriptors.add
					(createChildParameter
						(SymphonyToolsCorePackage.Literals.SIMPLE_TOOL_LIST__SIMPLE_TOOLS,
						 SymphonyToolsVehicleFactory.eINSTANCE.createPathPlannerTool()));

				newChildDescriptors.add
					(createChildParameter
						(SymphonyToolsCorePackage.Literals.SIMPLE_TOOL_LIST__SIMPLE_TOOLS,
						 SymphonyToolsVehicleFactory.eINSTANCE.createVehiclePathPlannerTool()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return SymphonyToolsVehicleEditPlugin.INSTANCE;
		}
	}

		/**
	 * A child creation extender for the {@link PathsPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class PathsChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends PathsSwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseGroupNode(GroupNode object) {
				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 SymphonyToolsVehicleFactory.eINSTANCE.createWheel()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 SymphonyToolsVehicleFactory.eINSTANCE.createThruster()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 SymphonyToolsVehicleFactory.eINSTANCE.createLanderSphericalFoot()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 SymphonyToolsVehicleFactory.eINSTANCE.createPathPlannerToolNode()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return SymphonyToolsVehicleEditPlugin.INSTANCE;
		}
	}

		/**
	 * A child creation extender for the {@link TopologyPackage}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static class TopologyChildCreationExtender implements IChildCreationExtender
  {
    /**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    protected static class CreationSwitch extends TopologySwitch<Object>
    {
      /**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
			 * @generated
			 */
      protected List<Object> newChildDescriptors;

      /**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
			 * @generated
			 */
      protected EditingDomain editingDomain;

      /**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
			 * @generated
			 */
      CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) 
      {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
      /**
			 * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
			 * @generated
			 */
      @Override
      public <T> Object caseContentNode(ContentNode<T> object)
      {
				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyToolsVehicleFactory.eINSTANCE.createVehiclePoseCorrector()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyToolsVehicleFactory.eINSTANCE.createMeshNodeEntry()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyToolsVehicleFactory.eINSTANCE.createWheel()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyToolsVehicleFactory.eINSTANCE.createThruster()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyToolsVehicleFactory.eINSTANCE.createThrusterBinding()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyToolsVehicleFactory.eINSTANCE.createWheelContactProvider()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyToolsVehicleFactory.eINSTANCE.createLanderSphericalFoot()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyToolsVehicleFactory.eINSTANCE.createLanderSphericalFootContactProvider()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyToolsVehicleFactory.eINSTANCE.createVehiculeToolsFacade()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyToolsVehicleFactory.eINSTANCE.createWheelVehicleUtilities()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyToolsVehicleFactory.eINSTANCE.createMeshExtent2D()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyToolsVehicleFactory.eINSTANCE.createPathPlannerTool()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyToolsVehicleFactory.eINSTANCE.createPathPlannerToolNode()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyToolsVehicleFactory.eINSTANCE.createVehiclePathPlannerTool()));

				return null;
			}
 
      /**
			 * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
			 * @generated
			 */
      @Override
      public Object caseGroupNode(GroupNode object)
      {
				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 SymphonyToolsVehicleFactory.eINSTANCE.createWheel()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 SymphonyToolsVehicleFactory.eINSTANCE.createThruster()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 SymphonyToolsVehicleFactory.eINSTANCE.createLanderSphericalFoot()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 SymphonyToolsVehicleFactory.eINSTANCE.createPathPlannerToolNode()));

				return null;
			}
 
      /**
			 * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
			 * @generated
			 */
      @Override
      public Object caseAggregateGroupNode(AggregateGroupNode object)
      {
				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 SymphonyToolsVehicleFactory.eINSTANCE.createWheel()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 SymphonyToolsVehicleFactory.eINSTANCE.createThruster()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 SymphonyToolsVehicleFactory.eINSTANCE.createLanderSphericalFoot()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 SymphonyToolsVehicleFactory.eINSTANCE.createPathPlannerToolNode()));

				return null;
			}
 
      /**
			 * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
			 * @generated
			 */
      protected CommandParameter createChildParameter(Object feature, Object child)
      {
				return new CommandParameter(null, feature, child);
			}

    }

    /**
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain)
    {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

    /**
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    public ResourceLocator getResourceLocator()
    {
			return SymphonyToolsVehicleEditPlugin.INSTANCE;
		}
  }

}
