/**
 */
package org.eclipse.symphony.common.emf.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.emf.BrowseableTimeSource;
import org.eclipse.symphony.common.emf.EMFEcorePackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.common.emf.BrowseableTimeSource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BrowseableTimeSourceItemProvider extends TimeSourceItemProvider 
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowseableTimeSourceItemProvider(AdapterFactory adapterFactory) {
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

			addStartTimePropertyDescriptor(object);
			addUpdatePeriodPropertyDescriptor(object);
			addTimeAccerationPropertyDescriptor(object);
			addTimeDirectionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Start Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BrowseableTimeSource_startTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BrowseableTimeSource_startTime_feature", "_UI_BrowseableTimeSource_type"),
				 EMFEcorePackage.Literals.BROWSEABLE_TIME_SOURCE__START_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Update Period feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdatePeriodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BrowseableTimeSource_updatePeriod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BrowseableTimeSource_updatePeriod_feature", "_UI_BrowseableTimeSource_type"),
				 EMFEcorePackage.Literals.BROWSEABLE_TIME_SOURCE__UPDATE_PERIOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Acceration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeAccerationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BrowseableTimeSource_timeAcceration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BrowseableTimeSource_timeAcceration_feature", "_UI_BrowseableTimeSource_type"),
				 EMFEcorePackage.Literals.BROWSEABLE_TIME_SOURCE__TIME_ACCERATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BrowseableTimeSource_timeDirection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BrowseableTimeSource_timeDirection_feature", "_UI_BrowseableTimeSource_type"),
				 EMFEcorePackage.Literals.BROWSEABLE_TIME_SOURCE__TIME_DIRECTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns BrowseableTimeSource.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BrowseableTimeSource"));
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
		BrowseableTimeSource timeSource = (BrowseableTimeSource) object;
		String label = getString("_UI_BrowseableTimeSource_type") + " " + getTimeSourceText(timeSource);							
		return label;			
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

		switch (notification.getFeatureID(BrowseableTimeSource.class)) {
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE__START_TIME:
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE__UPDATE_PERIOD:
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE__TIME_ACCERATION:
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE__TIME_DIRECTION:
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
