/**
 */
package ca.gc.asc_csa.apogy.common.emf.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectionTimedTimeSourceItemProvider extends BrowseableTimeSourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionTimedTimeSourceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addLoopEnablePropertyDescriptor(object);
			addCurrentTimedElementPropertyDescriptor(object);
			addEarliestDatePropertyDescriptor(object);
			addLatestDatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Loop Enable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoopEnablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionTimedTimeSource_loopEnable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionTimedTimeSource_loopEnable_feature", "_UI_CollectionTimedTimeSource_type"),
				 ApogyCommonEMFPackage.Literals.COLLECTION_TIMED_TIME_SOURCE__LOOP_ENABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Timed Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentTimedElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionTimedTimeSource_currentTimedElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionTimedTimeSource_currentTimedElement_feature", "_UI_CollectionTimedTimeSource_type"),
				 ApogyCommonEMFPackage.Literals.COLLECTION_TIMED_TIME_SOURCE__CURRENT_TIMED_ELEMENT,
				 false,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Earliest Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEarliestDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionTimedTimeSource_earliestDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionTimedTimeSource_earliestDate_feature", "_UI_CollectionTimedTimeSource_type"),
				 ApogyCommonEMFPackage.Literals.COLLECTION_TIMED_TIME_SOURCE__EARLIEST_DATE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Latest Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLatestDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionTimedTimeSource_latestDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionTimedTimeSource_latestDate_feature", "_UI_CollectionTimedTimeSource_type"),
				 ApogyCommonEMFPackage.Literals.COLLECTION_TIMED_TIME_SOURCE__LATEST_DATE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CollectionTimedTimeSource.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CollectionTimedTimeSource"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public String getText(Object object) 
	{
		return super.getText(object) + " [" + ((CollectionTimedTimeSource)object).getTimedsList().size() + "]";
	}
	
	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CollectionTimedTimeSource.class)) {
			case ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__LOOP_ENABLE:
			case ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__EARLIEST_DATE:
			case ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__LATEST_DATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
