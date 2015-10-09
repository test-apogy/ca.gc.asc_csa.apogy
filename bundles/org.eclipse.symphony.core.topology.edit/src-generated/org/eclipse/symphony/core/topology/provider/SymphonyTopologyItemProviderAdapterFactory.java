/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.topology.provider;

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
import org.eclipse.symphony.core.TopologyRoot;
import org.eclipse.symphony.core.topology.SymphonyTopologyFactory;
import org.eclipse.symphony.core.topology.SymphonyTopologyPackage;
import org.eclipse.symphony.core.topology.util.SymphonyTopologyAdapterFactory;
import org.eclipse.symphony.core.util.SymphonyCoreSwitch;

import ca.gc.asc_csa.topology.bindings.EnumerationCase;
import ca.gc.asc_csa.topology.bindings.TopologyBindingsPackage;
import ca.gc.asc_csa.topology.bindings.util.TopologyBindingsSwitch;
import ca.gc.space.topology.AggregateContentNode;
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
public class SymphonyTopologyItemProviderAdapterFactory extends SymphonyTopologyAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender
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
  protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(SymphonyTopologyEditPlugin.INSTANCE, SymphonyTopologyPackage.eNS_URI);

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
  public SymphonyTopologyItemProviderAdapterFactory()
  {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.topology.SystemsTopologyAdapter} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SystemsTopologyAdapterItemProvider systemsTopologyAdapterItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.topology.SystemsTopologyAdapter}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createSystemsTopologyAdapterAdapter()
  {
		if (systemsTopologyAdapterItemProvider == null) {
			systemsTopologyAdapterItemProvider = new SystemsTopologyAdapterItemProvider(this);
		}

		return systemsTopologyAdapterItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.topology.SymphonyEnvironmentNode} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SymphonyEnvironmentNodeItemProvider symphonyEnvironmentNodeItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.topology.SymphonyEnvironmentNode}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createSymphonyEnvironmentNodeAdapter()
  {
		if (symphonyEnvironmentNodeItemProvider == null) {
			symphonyEnvironmentNodeItemProvider = new SymphonyEnvironmentNodeItemProvider(this);
		}

		return symphonyEnvironmentNodeItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.topology.SymphonySystemAPIsNode} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SymphonySystemAPIsNodeItemProvider symphonySystemAPIsNodeItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.topology.SymphonySystemAPIsNode}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createSymphonySystemAPIsNodeAdapter()
  {
		if (symphonySystemAPIsNodeItemProvider == null) {
			symphonySystemAPIsNodeItemProvider = new SymphonySystemAPIsNodeItemProvider(this);
		}

		return symphonySystemAPIsNodeItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.topology.SymphonyTopologyFacade} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SymphonyTopologyFacadeItemProvider symphonyTopologyFacadeItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.topology.SymphonyTopologyFacade}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createSymphonyTopologyFacadeAdapter()
  {
		if (symphonyTopologyFacadeItemProvider == null) {
			symphonyTopologyFacadeItemProvider = new SymphonyTopologyFacadeItemProvider(this);
		}

		return symphonyTopologyFacadeItemProvider;
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
		if (systemsTopologyAdapterItemProvider != null) systemsTopologyAdapterItemProvider.dispose();
		if (symphonyEnvironmentNodeItemProvider != null) symphonyEnvironmentNodeItemProvider.dispose();
		if (symphonySystemAPIsNodeItemProvider != null) symphonySystemAPIsNodeItemProvider.dispose();
		if (symphonyTopologyFacadeItemProvider != null) symphonyTopologyFacadeItemProvider.dispose();
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
						 SymphonyTopologyFactory.eINSTANCE.createSystemsTopologyAdapter()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyTopologyFactory.eINSTANCE.createSymphonyEnvironmentNode()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyTopologyFactory.eINSTANCE.createSymphonySystemAPIsNode()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyTopologyFactory.eINSTANCE.createSymphonyTopologyFacade()));

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
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 SymphonyTopologyFactory.eINSTANCE.createSystemsTopologyAdapter()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 SymphonyTopologyFactory.eINSTANCE.createSymphonyEnvironmentNode()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 SymphonyTopologyFactory.eINSTANCE.createSymphonySystemAPIsNode()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 SymphonyTopologyFactory.eINSTANCE.createSymphonyTopologyFacade()));

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
						 SymphonyTopologyFactory.eINSTANCE.createSymphonyEnvironmentNode()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 SymphonyTopologyFactory.eINSTANCE.createSymphonySystemAPIsNode()));

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
						 SymphonyTopologyFactory.eINSTANCE.createSymphonyEnvironmentNode()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 SymphonyTopologyFactory.eINSTANCE.createSymphonySystemAPIsNode()));

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
			return SymphonyTopologyEditPlugin.INSTANCE;
		}
  }

		/**
	 * A child creation extender for the {@link SymphonyCorePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class SymphonyCoreChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends SymphonyCoreSwitch<Object> {
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
			public Object caseAssemblyLink(AssemblyLink object) {
				newChildDescriptors.add
					(createChildParameter
						(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
						 SymphonyTopologyFactory.eINSTANCE.createSymphonyEnvironmentNode()));

				newChildDescriptors.add
					(createChildParameter
						(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
						 SymphonyTopologyFactory.eINSTANCE.createSymphonySystemAPIsNode()));

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
						 SymphonyTopologyFactory.eINSTANCE.createSymphonyEnvironmentNode()));

				newChildDescriptors.add
					(createChildParameter
						(SymphonyCorePackage.Literals.TOPOLOGY_ROOT__ORIGIN_NODE,
						 SymphonyTopologyFactory.eINSTANCE.createSymphonySystemAPIsNode()));

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
			return SymphonyTopologyEditPlugin.INSTANCE;
		}
	}

		/**
	 * A child creation extender for the {@link TopologyBindingsPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class TopologyBindingsChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends TopologyBindingsSwitch<Object> {
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
						(TopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
						 SymphonyTopologyFactory.eINSTANCE.createSymphonyEnvironmentNode()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
						 SymphonyTopologyFactory.eINSTANCE.createSymphonySystemAPIsNode()));

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
			return SymphonyTopologyEditPlugin.INSTANCE;
		}
	}

}
