/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.ui.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.core.ui.NewSymphonySessionSettings;
import org.eclipse.symphony.core.ui.Symphony__CoreUIPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.ui.NewSymphonySessionSettings} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NewSymphonySessionSettingsItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewSymphonySessionSettingsItemProvider(AdapterFactory adapterFactory) {
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

			addFolderPropertyDescriptor(object);
			addFilenamePropertyDescriptor(object);
			addCreateEnvironmentPropertyDescriptor(object);
			addCreateProgramsPropertyDescriptor(object);
			addCreateDataProductsPropertyDescriptor(object);
			addCreateToolsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Folder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFolderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NewSymphonySessionSettings_folder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NewSymphonySessionSettings_folder_feature", "_UI_NewSymphonySessionSettings_type"),
				 Symphony__CoreUIPackage.Literals.NEW_SYMPHONY_SESSION_SETTINGS__FOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Filename feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilenamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NewSymphonySessionSettings_filename_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NewSymphonySessionSettings_filename_feature", "_UI_NewSymphonySessionSettings_type"),
				 Symphony__CoreUIPackage.Literals.NEW_SYMPHONY_SESSION_SETTINGS__FILENAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Create Environment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreateEnvironmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NewSymphonySessionSettings_createEnvironment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NewSymphonySessionSettings_createEnvironment_feature", "_UI_NewSymphonySessionSettings_type"),
				 Symphony__CoreUIPackage.Literals.NEW_SYMPHONY_SESSION_SETTINGS__CREATE_ENVIRONMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Create Programs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreateProgramsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NewSymphonySessionSettings_createPrograms_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NewSymphonySessionSettings_createPrograms_feature", "_UI_NewSymphonySessionSettings_type"),
				 Symphony__CoreUIPackage.Literals.NEW_SYMPHONY_SESSION_SETTINGS__CREATE_PROGRAMS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Create Data Products feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreateDataProductsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NewSymphonySessionSettings_createDataProducts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NewSymphonySessionSettings_createDataProducts_feature", "_UI_NewSymphonySessionSettings_type"),
				 Symphony__CoreUIPackage.Literals.NEW_SYMPHONY_SESSION_SETTINGS__CREATE_DATA_PRODUCTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Create Tools feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreateToolsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NewSymphonySessionSettings_createTools_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NewSymphonySessionSettings_createTools_feature", "_UI_NewSymphonySessionSettings_type"),
				 Symphony__CoreUIPackage.Literals.NEW_SYMPHONY_SESSION_SETTINGS__CREATE_TOOLS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns NewSymphonySessionSettings.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NewSymphonySessionSettings"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NewSymphonySessionSettings)object).getFilename();
		return label == null || label.length() == 0 ?
			getString("_UI_NewSymphonySessionSettings_type") :
			getString("_UI_NewSymphonySessionSettings_type") + " " + label;
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

		switch (notification.getFeatureID(NewSymphonySessionSettings.class)) {
			case Symphony__CoreUIPackage.NEW_SYMPHONY_SESSION_SETTINGS__FOLDER:
			case Symphony__CoreUIPackage.NEW_SYMPHONY_SESSION_SETTINGS__FILENAME:
			case Symphony__CoreUIPackage.NEW_SYMPHONY_SESSION_SETTINGS__CREATE_ENVIRONMENT:
			case Symphony__CoreUIPackage.NEW_SYMPHONY_SESSION_SETTINGS__CREATE_PROGRAMS:
			case Symphony__CoreUIPackage.NEW_SYMPHONY_SESSION_SETTINGS__CREATE_DATA_PRODUCTS:
			case Symphony__CoreUIPackage.NEW_SYMPHONY_SESSION_SETTINGS__CREATE_TOOLS:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Symphony__CoreUIEditPlugin.INSTANCE;
	}

}
