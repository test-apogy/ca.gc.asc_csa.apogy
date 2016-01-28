/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.vehicle.provider;

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
import ca.gc.asc_csa.apogy.addons.SimpleToolList;
import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;
import ca.gc.asc_csa.apogy.addons.util.ApogyAddonsSwitch;
import ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehicleFactory;
import ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage;
import ca.gc.asc_csa.apogy.addons.vehicle.util.ApogyAddonsVehicleAdapterFactory;
import ca.gc.asc_csa.apogy.common.topology.AggregateContentNode;
import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.common.topology.bindings.BindingsList;
import ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationCase;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage;
import ca.gc.asc_csa.apogy.common.topology.bindings.util.ApogyCommonTopologyBindingsSwitch;
import ca.gc.asc_csa.apogy.common.topology.util.ApogyCommonTopologySwitch;
import ca.gc.asc_csa.apogy.core.AssemblyLink;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.core.TopologyRoot;
import ca.gc.asc_csa.apogy.core.util.ApogyCoreSwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsVehicleItemProviderAdapterFactory extends ApogyAddonsVehicleAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender
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
  protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(ApogyAddonsVehicleEditPlugin.INSTANCE, ApogyAddonsVehiclePackage.eNS_URI);

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
  public ApogyAddonsVehicleItemProviderAdapterFactory()
  {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected VehiclePoseCorrectorItemProvider vehiclePoseCorrectorItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.vehicle.MeshNodeEntry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeshNodeEntryItemProvider meshNodeEntryItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.vehicle.MeshNodeEntry}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.vehicle.Wheel} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected WheelItemProvider wheelItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.vehicle.Wheel}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.vehicle.Thruster} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ThrusterItemProvider thrusterItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.vehicle.Thruster}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.vehicle.ThrusterBinding} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ThrusterBindingItemProvider thrusterBindingItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.vehicle.ThrusterBinding}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.vehicle.WheelContactProvider} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected WheelContactProviderItemProvider wheelContactProviderItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.vehicle.WheelContactProvider}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.vehicle.LanderSphericalFoot} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected LanderSphericalFootItemProvider landerSphericalFootItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.vehicle.LanderSphericalFoot}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.vehicle.LanderSphericalFootContactProvider} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected LanderSphericalFootContactProviderItemProvider landerSphericalFootContactProviderItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.vehicle.LanderSphericalFootContactProvider}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehicleFacade} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyAddonsVehicleFacadeItemProvider apogy__AddonsVehicleFacadeItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehicleFacade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApogyAddonsVehicleFacadeAdapter() {
		if (apogy__AddonsVehicleFacadeItemProvider == null) {
			apogy__AddonsVehicleFacadeItemProvider = new ApogyAddonsVehicleFacadeItemProvider(this);
		}

		return apogy__AddonsVehicleFacadeItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected WheelVehicleUtilitiesItemProvider wheelVehicleUtilitiesItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MeshExtent2DItemProvider meshExtent2DItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathPlannerToolItemProvider pathPlannerToolItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerToolNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathPlannerToolNodeItemProvider pathPlannerToolNodeItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerToolNode}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePathPlannerTool} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehiclePathPlannerToolItemProvider vehiclePathPlannerToolItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePathPlannerTool}.
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
		if (apogy__AddonsVehicleFacadeItemProvider != null) apogy__AddonsVehicleFacadeItemProvider.dispose();
		if (wheelVehicleUtilitiesItemProvider != null) wheelVehicleUtilitiesItemProvider.dispose();
		if (meshExtent2DItemProvider != null) meshExtent2DItemProvider.dispose();
		if (pathPlannerToolItemProvider != null) pathPlannerToolItemProvider.dispose();
		if (pathPlannerToolNodeItemProvider != null) pathPlannerToolNodeItemProvider.dispose();
		if (vehiclePathPlannerToolItemProvider != null) vehiclePathPlannerToolItemProvider.dispose();
	}

  /**
	 * A child creation extender for the {@link ApogyCorePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class ApogyCoreChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends ApogyCoreSwitch<Object> {
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
			public Object caseApogySystemApiAdapter(ApogySystemApiAdapter object) {
				newChildDescriptors.add
					(createChildParameter
						(ApogyCorePackage.Literals.APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR,
						 ApogyAddonsVehicleFactory.eINSTANCE.createVehiclePoseCorrector()));

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
						(ApogyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
						 ApogyAddonsVehicleFactory.eINSTANCE.createWheel()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
						 ApogyAddonsVehicleFactory.eINSTANCE.createThruster()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
						 ApogyAddonsVehicleFactory.eINSTANCE.createLanderSphericalFoot()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
						 ApogyAddonsVehicleFactory.eINSTANCE.createPathPlannerToolNode()));

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
						(ApogyCorePackage.Literals.TOPOLOGY_ROOT__ORIGIN_NODE,
						 ApogyAddonsVehicleFactory.eINSTANCE.createWheel()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCorePackage.Literals.TOPOLOGY_ROOT__ORIGIN_NODE,
						 ApogyAddonsVehicleFactory.eINSTANCE.createThruster()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCorePackage.Literals.TOPOLOGY_ROOT__ORIGIN_NODE,
						 ApogyAddonsVehicleFactory.eINSTANCE.createLanderSphericalFoot()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCorePackage.Literals.TOPOLOGY_ROOT__ORIGIN_NODE,
						 ApogyAddonsVehicleFactory.eINSTANCE.createPathPlannerToolNode()));

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
			return ApogyAddonsVehicleEditPlugin.INSTANCE;
		}
	}

		/**
	 * A child creation extender for the {@link ApogyCommonTopologyPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class ApogyCommonTopologyChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends ApogyCommonTopologySwitch<Object> {
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
			public <T> Object caseContentNode(ContentNode<T> object) {
				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createVehiclePoseCorrector()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createMeshNodeEntry()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createWheel()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createThruster()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createThrusterBinding()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createWheelContactProvider()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createLanderSphericalFoot()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createLanderSphericalFootContactProvider()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createApogyAddonsVehicleFacade()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createWheelVehicleUtilities()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createMeshExtent2D()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createPathPlannerTool()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createPathPlannerToolNode()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createVehiclePathPlannerTool()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public <T> Object caseAggregateContentNode(AggregateContentNode<T> object) {
				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createVehiclePoseCorrector()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createMeshNodeEntry()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createWheel()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createThruster()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createThrusterBinding()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createWheelContactProvider()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createLanderSphericalFoot()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createLanderSphericalFootContactProvider()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createApogyAddonsVehicleFacade()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createWheelVehicleUtilities()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createMeshExtent2D()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createPathPlannerTool()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createPathPlannerToolNode()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createVehiclePathPlannerTool()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseAggregateGroupNode(AggregateGroupNode object) {
				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 ApogyAddonsVehicleFactory.eINSTANCE.createWheel()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 ApogyAddonsVehicleFactory.eINSTANCE.createThruster()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 ApogyAddonsVehicleFactory.eINSTANCE.createLanderSphericalFoot()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 ApogyAddonsVehicleFactory.eINSTANCE.createPathPlannerToolNode()));

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
			return ApogyAddonsVehicleEditPlugin.INSTANCE;
		}
	}

		/**
	 * A child creation extender for the {@link ApogyCommonTopologyBindingsPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class ApogyCommonTopologyBindingsChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends ApogyCommonTopologyBindingsSwitch<Object> {
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
			public Object caseEnumerationCase(EnumerationCase object) {
				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createWheel()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createThruster()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createLanderSphericalFoot()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
						 ApogyAddonsVehicleFactory.eINSTANCE.createPathPlannerToolNode()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseBindingsList(BindingsList object) {
				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyBindingsPackage.Literals.BINDINGS_LIST__BINDINGS,
						 ApogyAddonsVehicleFactory.eINSTANCE.createThrusterBinding()));

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
			return ApogyAddonsVehicleEditPlugin.INSTANCE;
		}
	}

		/**
	 * A child creation extender for the {@link ApogyAddonsPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class ApogyAddonsChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends ApogyAddonsSwitch<Object> {
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
						(ApogyAddonsPackage.Literals.SIMPLE_TOOL_LIST__SIMPLE_TOOLS,
						 ApogyAddonsVehicleFactory.eINSTANCE.createPathPlannerTool()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyAddonsPackage.Literals.SIMPLE_TOOL_LIST__SIMPLE_TOOLS,
						 ApogyAddonsVehicleFactory.eINSTANCE.createVehiclePathPlannerTool()));

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
			return ApogyAddonsVehicleEditPlugin.INSTANCE;
		}
	}

}
