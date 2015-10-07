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
import org.eclipse.symphony.core.ui.SymphonyCoreUiFacade;
import org.eclipse.symphony.core.ui.SymphonyCoreUiPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.ui.SymphonyCoreUiFacade} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyCoreUiFacadeItemProvider 
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
	public SymphonyCoreUiFacadeItemProvider(AdapterFactory adapterFactory) {
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

			addDefaultSymphonyProjectNamePrefixPropertyDescriptor(object);
			addDefaultSymphonySessionFilenamePropertyDescriptor(object);
			addDefaultSymphonySessionFilenameExtensionPropertyDescriptor(object);
			addDefaultSymphonySessionFolderNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Default Symphony Project Name Prefix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultSymphonyProjectNamePrefixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SymphonyCoreUiFacade_defaultSymphonyProjectNamePrefix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SymphonyCoreUiFacade_defaultSymphonyProjectNamePrefix_feature", "_UI_SymphonyCoreUiFacade_type"),
				 SymphonyCoreUiPackage.Literals.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_PROJECT_NAME_PREFIX,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Symphony Session Filename feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultSymphonySessionFilenamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SymphonyCoreUiFacade_defaultSymphonySessionFilename_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SymphonyCoreUiFacade_defaultSymphonySessionFilename_feature", "_UI_SymphonyCoreUiFacade_type"),
				 SymphonyCoreUiPackage.Literals.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FILENAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Symphony Session Filename Extension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultSymphonySessionFilenameExtensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SymphonyCoreUiFacade_defaultSymphonySessionFilenameExtension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SymphonyCoreUiFacade_defaultSymphonySessionFilenameExtension_feature", "_UI_SymphonyCoreUiFacade_type"),
				 SymphonyCoreUiPackage.Literals.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FILENAME_EXTENSION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Symphony Session Folder Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultSymphonySessionFolderNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SymphonyCoreUiFacade_defaultSymphonySessionFolderName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SymphonyCoreUiFacade_defaultSymphonySessionFolderName_feature", "_UI_SymphonyCoreUiFacade_type"),
				 SymphonyCoreUiPackage.Literals.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FOLDER_NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SymphonyCoreUiFacade.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SymphonyCoreUiFacade"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SymphonyCoreUiFacade)object).getDefaultSymphonySessionFilename();
		return label == null || label.length() == 0 ?
			getString("_UI_SymphonyCoreUiFacade_type") :
			getString("_UI_SymphonyCoreUiFacade_type") + " " + label;
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

		switch (notification.getFeatureID(SymphonyCoreUiFacade.class)) {
			case SymphonyCoreUiPackage.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_PROJECT_NAME_PREFIX:
			case SymphonyCoreUiPackage.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FILENAME:
			case SymphonyCoreUiPackage.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FILENAME_EXTENSION:
			case SymphonyCoreUiPackage.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FOLDER_NAME:
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
		return SymphonyCoreUiEditPlugin.INSTANCE;
	}

}
