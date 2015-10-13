/**
 */
package org.eclipse.symphony.common.emf.provider;

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
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.util.EMFEcoreAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreItemProviderAdapterFactory extends EMFEcoreAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender
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
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(EMFEcoreEditPlugin.INSTANCE, EMFEcorePackage.eNS_URI);

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
  public EMFEcoreItemProviderAdapterFactory()
  {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.emf.EMFEcoreFacade} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EMFEcoreFacadeItemProvider emfEcoreFacadeItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.emf.EMFEcoreFacade}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createEMFEcoreFacadeAdapter()
  {
		if (emfEcoreFacadeItemProvider == null) {
			emfEcoreFacadeItemProvider = new EMFEcoreFacadeItemProvider(this);
		}

		return emfEcoreFacadeItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.emf.TimeSourcesList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSourcesListItemProvider timeSourcesListItemProvider;

		/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.emf.TimeSourcesList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeSourcesListAdapter() {
		if (timeSourcesListItemProvider == null) {
			timeSourcesListItemProvider = new TimeSourcesListItemProvider(this);
		}

		return timeSourcesListItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.emf.FixedTimeSource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedTimeSourceItemProvider fixedTimeSourceItemProvider;

		/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.emf.FixedTimeSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFixedTimeSourceAdapter() {
		if (fixedTimeSourceItemProvider == null) {
			fixedTimeSourceItemProvider = new FixedTimeSourceItemProvider(this);
		}

		return fixedTimeSourceItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.emf.CurrentTimeSource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentTimeSourceItemProvider currentTimeSourceItemProvider;

		/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.emf.CurrentTimeSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCurrentTimeSourceAdapter() {
		if (currentTimeSourceItemProvider == null) {
			currentTimeSourceItemProvider = new CurrentTimeSourceItemProvider(this);
		}

		return currentTimeSourceItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.emf.BrowseableTimeSource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrowseableTimeSourceItemProvider browseableTimeSourceItemProvider;

		/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.emf.BrowseableTimeSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBrowseableTimeSourceAdapter() {
		if (browseableTimeSourceItemProvider == null) {
			browseableTimeSourceItemProvider = new BrowseableTimeSourceItemProvider(this);
		}

		return browseableTimeSourceItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.emf.SelectionBasedTimeSource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionBasedTimeSourceItemProvider selectionBasedTimeSourceItemProvider;

		/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.emf.SelectionBasedTimeSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectionBasedTimeSourceAdapter() {
		if (selectionBasedTimeSourceItemProvider == null) {
			selectionBasedTimeSourceItemProvider = new SelectionBasedTimeSourceItemProvider(this);
		}

		return selectionBasedTimeSourceItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.emf.CollectionTimedTimeSource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionTimedTimeSourceItemProvider collectionTimedTimeSourceItemProvider;

		/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.emf.CollectionTimedTimeSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCollectionTimedTimeSourceAdapter() {
		if (collectionTimedTimeSourceItemProvider == null) {
			collectionTimedTimeSourceItemProvider = new CollectionTimedTimeSourceItemProvider(this);
		}

		return collectionTimedTimeSourceItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.emf.FeatureNodeAdapter} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected FeatureNodeAdapterItemProvider featureNodeAdapterItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.emf.FeatureNodeAdapter}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createFeatureNodeAdapterAdapter()
  {
		if (featureNodeAdapterItemProvider == null) {
			featureNodeAdapterItemProvider = new FeatureNodeAdapterItemProvider(this);
		}

		return featureNodeAdapterItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.emf.TreeRootNode} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TreeRootNodeItemProvider treeRootNodeItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.emf.TreeRootNode}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createTreeRootNodeAdapter()
  {
		if (treeRootNodeItemProvider == null) {
			treeRootNodeItemProvider = new TreeRootNodeItemProvider(this);
		}

		return treeRootNodeItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.emf.TreeFeatureNode} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TreeFeatureNodeItemProvider treeFeatureNodeItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.emf.TreeFeatureNode}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createTreeFeatureNodeAdapter()
  {
		if (treeFeatureNodeItemProvider == null) {
			treeFeatureNodeItemProvider = new TreeFeatureNodeItemProvider(this);
		}

		return treeFeatureNodeItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.emf.ListRootNode} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ListRootNodeItemProvider listRootNodeItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.emf.ListRootNode}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createListRootNodeAdapter()
  {
		if (listRootNodeItemProvider == null) {
			listRootNodeItemProvider = new ListRootNodeItemProvider(this);
		}

		return listRootNodeItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.emf.ListFeatureNode} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ListFeatureNodeItemProvider listFeatureNodeItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.emf.ListFeatureNode}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createListFeatureNodeAdapter()
  {
		if (listFeatureNodeItemProvider == null) {
			listFeatureNodeItemProvider = new ListFeatureNodeItemProvider(this);
		}

		return listFeatureNodeItemProvider;
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
		if (emfEcoreFacadeItemProvider != null) emfEcoreFacadeItemProvider.dispose();
		if (timeSourcesListItemProvider != null) timeSourcesListItemProvider.dispose();
		if (fixedTimeSourceItemProvider != null) fixedTimeSourceItemProvider.dispose();
		if (currentTimeSourceItemProvider != null) currentTimeSourceItemProvider.dispose();
		if (browseableTimeSourceItemProvider != null) browseableTimeSourceItemProvider.dispose();
		if (selectionBasedTimeSourceItemProvider != null) selectionBasedTimeSourceItemProvider.dispose();
		if (collectionTimedTimeSourceItemProvider != null) collectionTimedTimeSourceItemProvider.dispose();
		if (featureNodeAdapterItemProvider != null) featureNodeAdapterItemProvider.dispose();
		if (treeRootNodeItemProvider != null) treeRootNodeItemProvider.dispose();
		if (treeFeatureNodeItemProvider != null) treeFeatureNodeItemProvider.dispose();
		if (listRootNodeItemProvider != null) listRootNodeItemProvider.dispose();
		if (listFeatureNodeItemProvider != null) listFeatureNodeItemProvider.dispose();
	}

}
