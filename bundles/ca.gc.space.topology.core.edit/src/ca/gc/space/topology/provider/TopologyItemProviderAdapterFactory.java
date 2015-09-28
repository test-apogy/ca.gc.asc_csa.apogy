/**
 * <copyright>
 * </copyright>
 *
 * $Id: TopologyItemProviderAdapterFactory.java,v 1.17.2.2 2015/02/03 20:01:35 rlarcheveque Exp $
 */
package ca.gc.space.topology.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
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

import ca.gc.space.topology.TopologyPackage;
import ca.gc.space.topology.util.TopologyAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class TopologyItemProviderAdapterFactory extends TopologyAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable,
		IChildCreationExtender {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement
	 * {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(TopologyEditPlugin.INSTANCE, TopologyPackage.eNS_URI);

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public TopologyItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.space.topology.TransformNode} instances.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformNodeItemProvider transformNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.space.topology.TransformNode}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransformNodeAdapter() {
		if (transformNodeItemProvider == null) {
			transformNodeItemProvider = new TransformNodeItemProvider(this);
		}

		return transformNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link ca.gc.space.topology.TopologyFacade} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TopologyFacadeItemProvider topologyFacadeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.space.topology.TopologyFacade}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTopologyFacadeAdapter() {
		if (topologyFacadeItemProvider == null) {
			topologyFacadeItemProvider = new TopologyFacadeItemProvider(this);
		}

		return topologyFacadeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.space.topology.ContentNode} instances.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentNodeItemProvider contentNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.space.topology.ContentNode}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContentNodeAdapter() {
		if (contentNodeItemProvider == null) {
			contentNodeItemProvider = new ContentNodeItemProvider(this);
		}

		return contentNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.space.topology.PositionNode} instances.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionNodeItemProvider positionNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.space.topology.PositionNode}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPositionNodeAdapter() {
		if (positionNodeItemProvider == null) {
			positionNodeItemProvider = new PositionNodeItemProvider(this);
		}

		return positionNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.space.topology.RotationNode} instances.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RotationNodeItemProvider rotationNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.space.topology.RotationNode}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRotationNodeAdapter() {
		if (rotationNodeItemProvider == null) {
			rotationNodeItemProvider = new RotationNodeItemProvider(this);
		}

		return rotationNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.space.topology.Leaf} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected LeafItemProvider leafItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.space.topology.Leaf}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createLeafAdapter() {
		if (leafItemProvider == null) {
			leafItemProvider = new LeafItemProvider(this);
		}

		return leafItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link ca.gc.space.topology.PickAndPlaceNode} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PickAndPlaceNodeItemProvider pickAndPlaceNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.space.topology.PickAndPlaceNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPickAndPlaceNodeAdapter() {
		if (pickAndPlaceNodeItemProvider == null) {
			pickAndPlaceNodeItemProvider = new PickAndPlaceNodeItemProvider(this);
		}

		return pickAndPlaceNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link ca.gc.space.topology.ReferencedContentNode} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ReferencedContentNodeItemProvider referencedContentNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.space.topology.ReferencedContentNode}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReferencedContentNodeAdapter() {
		if (referencedContentNodeItemProvider == null) {
			referencedContentNodeItemProvider = new ReferencedContentNodeItemProvider(this);
		}

		return referencedContentNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link ca.gc.space.topology.AggregateContentNode} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AggregateContentNodeItemProvider aggregateContentNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.space.topology.AggregateContentNode}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAggregateContentNodeAdapter() {
		if (aggregateContentNodeItemProvider == null) {
			aggregateContentNodeItemProvider = new AggregateContentNodeItemProvider(this);
		}

		return aggregateContentNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.space.topology.URLNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URLNodeItemProvider urlNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.space.topology.URLNode}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createURLNodeAdapter() {
		if (urlNodeItemProvider == null) {
			urlNodeItemProvider = new URLNodeItemProvider(this);
		}

		return urlNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link ca.gc.space.topology.ReferencedGroupNode} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ReferencedGroupNodeItemProvider referencedGroupNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.space.topology.ReferencedGroupNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReferencedGroupNodeAdapter() {
		if (referencedGroupNodeItemProvider == null) {
			referencedGroupNodeItemProvider = new ReferencedGroupNodeItemProvider(this);
		}

		return referencedGroupNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.space.topology.Link} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected LinkItemProvider linkItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.space.topology.Link}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createLinkAdapter() {
		if (linkItemProvider == null) {
			linkItemProvider = new LinkItemProvider(this);
		}

		return linkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link ca.gc.space.topology.AggregateGroupNode} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AggregateGroupNodeItemProvider aggregateGroupNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.space.topology.AggregateGroupNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAggregateGroupNodeAdapter() {
		if (aggregateGroupNodeItemProvider == null) {
			aggregateGroupNodeItemProvider = new AggregateGroupNodeItemProvider(this);
		}

		return aggregateGroupNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.space.topology.CADNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CADNodeItemProvider cadNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.space.topology.CADNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCADNodeAdapter() {
		if (cadNodeItemProvider == null) {
			cadNodeItemProvider = new CADNodeItemProvider(this);
		}

		return cadNodeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParentAdapterFactory(
			ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object,
			EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to
	 * {@link #parentAdapterFactory}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void dispose() {
		if (transformNodeItemProvider != null) transformNodeItemProvider.dispose();
		if (topologyFacadeItemProvider != null) topologyFacadeItemProvider.dispose();
		if (contentNodeItemProvider != null) contentNodeItemProvider.dispose();
		if (positionNodeItemProvider != null) positionNodeItemProvider.dispose();
		if (rotationNodeItemProvider != null) rotationNodeItemProvider.dispose();
		if (leafItemProvider != null) leafItemProvider.dispose();
		if (pickAndPlaceNodeItemProvider != null) pickAndPlaceNodeItemProvider.dispose();
		if (referencedContentNodeItemProvider != null) referencedContentNodeItemProvider.dispose();
		if (aggregateContentNodeItemProvider != null) aggregateContentNodeItemProvider.dispose();
		if (urlNodeItemProvider != null) urlNodeItemProvider.dispose();
		if (referencedGroupNodeItemProvider != null) referencedGroupNodeItemProvider.dispose();
		if (linkItemProvider != null) linkItemProvider.dispose();
		if (aggregateGroupNodeItemProvider != null) aggregateGroupNodeItemProvider.dispose();
		if (cadNodeItemProvider != null) cadNodeItemProvider.dispose();
	}

}
