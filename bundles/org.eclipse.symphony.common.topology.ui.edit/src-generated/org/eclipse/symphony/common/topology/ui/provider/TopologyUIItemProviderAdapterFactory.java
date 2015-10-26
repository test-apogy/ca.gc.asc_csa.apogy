/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.ui.provider;

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
import org.eclipse.symphony.common.topology.AggregateContentNode;
import org.eclipse.symphony.common.topology.ContentNode;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage;
import org.eclipse.symphony.common.topology.ui.TopologyUIFactory;
import org.eclipse.symphony.common.topology.ui.TopologyUIPackage;
import org.eclipse.symphony.common.topology.ui.util.TopologyUIAdapterFactory;
import org.eclipse.symphony.common.topology.util.Symphony__CommonTopologySwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TopologyUIItemProviderAdapterFactory extends TopologyUIAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
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
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(TopologyUIEditPlugin.INSTANCE, TopologyUIPackage.eNS_URI);

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
	public TopologyUIItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.ui.TopologyPresentationRegistry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopologyPresentationRegistryItemProvider topologyPresentationRegistryItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.ui.TopologyPresentationRegistry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTopologyPresentationRegistryAdapter() {
		if (topologyPresentationRegistryItemProvider == null) {
			topologyPresentationRegistryItemProvider = new TopologyPresentationRegistryItemProvider(this);
		}

		return topologyPresentationRegistryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.ui.GraphicsContext} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicsContextItemProvider graphicsContextItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.ui.GraphicsContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGraphicsContextAdapter() {
		if (graphicsContextItemProvider == null) {
			graphicsContextItemProvider = new GraphicsContextItemProvider(this);
		}

		return graphicsContextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.ui.NodeSelection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeSelectionItemProvider nodeSelectionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.ui.NodeSelection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeSelectionAdapter() {
		if (nodeSelectionItemProvider == null) {
			nodeSelectionItemProvider = new NodeSelectionItemProvider(this);
		}

		return nodeSelectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.ui.TopologyPresentationSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopologyPresentationSetItemProvider topologyPresentationSetItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.ui.TopologyPresentationSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTopologyPresentationSetAdapter() {
		if (topologyPresentationSetItemProvider == null) {
			topologyPresentationSetItemProvider = new TopologyPresentationSetItemProvider(this);
		}

		return topologyPresentationSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.ui.NodePresentation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodePresentationItemProvider nodePresentationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.ui.NodePresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodePresentationAdapter() {
		if (nodePresentationItemProvider == null) {
			nodePresentationItemProvider = new NodePresentationItemProvider(this);
		}

		return nodePresentationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.ui.TransformNodePresentation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformNodePresentationItemProvider transformNodePresentationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.ui.TransformNodePresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransformNodePresentationAdapter() {
		if (transformNodePresentationItemProvider == null) {
			transformNodePresentationItemProvider = new TransformNodePresentationItemProvider(this);
		}

		return transformNodePresentationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.ui.RotationNodePresentation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotationNodePresentationItemProvider rotationNodePresentationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.ui.RotationNodePresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRotationNodePresentationAdapter() {
		if (rotationNodePresentationItemProvider == null) {
			rotationNodePresentationItemProvider = new RotationNodePresentationItemProvider(this);
		}

		return rotationNodePresentationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.ui.PositionNodePresentation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionNodePresentationItemProvider positionNodePresentationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.ui.PositionNodePresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPositionNodePresentationAdapter() {
		if (positionNodePresentationItemProvider == null) {
			positionNodePresentationItemProvider = new PositionNodePresentationItemProvider(this);
		}

		return positionNodePresentationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.ui.URLNodePresentation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URLNodePresentationItemProvider urlNodePresentationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.ui.URLNodePresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createURLNodePresentationAdapter() {
		if (urlNodePresentationItemProvider == null) {
			urlNodePresentationItemProvider = new URLNodePresentationItemProvider(this);
		}

		return urlNodePresentationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.ui.TopologyUIFacade} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopologyUIFacadeItemProvider topologyUIFacadeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.ui.TopologyUIFacade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTopologyUIFacadeAdapter() {
		if (topologyUIFacadeItemProvider == null) {
			topologyUIFacadeItemProvider = new TopologyUIFacadeItemProvider(this);
		}

		return topologyUIFacadeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
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
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
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
	public void dispose() {
		if (topologyPresentationRegistryItemProvider != null) topologyPresentationRegistryItemProvider.dispose();
		if (graphicsContextItemProvider != null) graphicsContextItemProvider.dispose();
		if (nodeSelectionItemProvider != null) nodeSelectionItemProvider.dispose();
		if (topologyPresentationSetItemProvider != null) topologyPresentationSetItemProvider.dispose();
		if (nodePresentationItemProvider != null) nodePresentationItemProvider.dispose();
		if (transformNodePresentationItemProvider != null) transformNodePresentationItemProvider.dispose();
		if (rotationNodePresentationItemProvider != null) rotationNodePresentationItemProvider.dispose();
		if (positionNodePresentationItemProvider != null) positionNodePresentationItemProvider.dispose();
		if (urlNodePresentationItemProvider != null) urlNodePresentationItemProvider.dispose();
		if (topologyUIFacadeItemProvider != null) topologyUIFacadeItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link Symphony__CommonTopologyPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Symphony__CommonTopologyChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends Symphony__CommonTopologySwitch<Object> {
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
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyUIFactory.eINSTANCE.createTopologyPresentationRegistry()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyUIFactory.eINSTANCE.createGraphicsContext()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyUIFactory.eINSTANCE.createNodeSelection()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyUIFactory.eINSTANCE.createTopologyPresentationSet()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyUIFactory.eINSTANCE.createNodePresentation()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyUIFactory.eINSTANCE.createTransformNodePresentation()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyUIFactory.eINSTANCE.createRotationNodePresentation()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyUIFactory.eINSTANCE.createPositionNodePresentation()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyUIFactory.eINSTANCE.createURLNodePresentation()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyUIFactory.eINSTANCE.createTopologyUIFacade()));

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
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyUIFactory.eINSTANCE.createTopologyPresentationRegistry()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyUIFactory.eINSTANCE.createGraphicsContext()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyUIFactory.eINSTANCE.createNodeSelection()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyUIFactory.eINSTANCE.createTopologyPresentationSet()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyUIFactory.eINSTANCE.createNodePresentation()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyUIFactory.eINSTANCE.createTransformNodePresentation()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyUIFactory.eINSTANCE.createRotationNodePresentation()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyUIFactory.eINSTANCE.createPositionNodePresentation()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyUIFactory.eINSTANCE.createURLNodePresentation()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyUIFactory.eINSTANCE.createTopologyUIFacade()));

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
			return TopologyUIEditPlugin.INSTANCE;
		}
	}

}
