package ca.gc.asc_csa.apogy.core.ui.provider;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */


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
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreUIFacadeItemProvider 
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
	public ApogyCoreUIFacadeItemProvider(AdapterFactory adapterFactory) {
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

			addDefaultApogyProjectNamePrefixPropertyDescriptor(object);
			addDefaultApogySessionFilenamePropertyDescriptor(object);
			addDefaultApogySessionFilenameExtensionPropertyDescriptor(object);
			addDefaultApogySessionFolderNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Default Apogy Project Name Prefix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultApogyProjectNamePrefixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApogyCoreUIFacade_defaultApogyProjectNamePrefix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApogyCoreUIFacade_defaultApogyProjectNamePrefix_feature", "_UI_ApogyCoreUIFacade_type"),
				 ApogyCoreUIPackage.Literals.APOGY_CORE_UI_FACADE__DEFAULT_APOGY_PROJECT_NAME_PREFIX,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Apogy Session Filename feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultApogySessionFilenamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApogyCoreUIFacade_defaultApogySessionFilename_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApogyCoreUIFacade_defaultApogySessionFilename_feature", "_UI_ApogyCoreUIFacade_type"),
				 ApogyCoreUIPackage.Literals.APOGY_CORE_UI_FACADE__DEFAULT_APOGY_SESSION_FILENAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Apogy Session Filename Extension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultApogySessionFilenameExtensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApogyCoreUIFacade_defaultApogySessionFilenameExtension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApogyCoreUIFacade_defaultApogySessionFilenameExtension_feature", "_UI_ApogyCoreUIFacade_type"),
				 ApogyCoreUIPackage.Literals.APOGY_CORE_UI_FACADE__DEFAULT_APOGY_SESSION_FILENAME_EXTENSION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Apogy Session Folder Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultApogySessionFolderNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApogyCoreUIFacade_defaultApogySessionFolderName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApogyCoreUIFacade_defaultApogySessionFolderName_feature", "_UI_ApogyCoreUIFacade_type"),
				 ApogyCoreUIPackage.Literals.APOGY_CORE_UI_FACADE__DEFAULT_APOGY_SESSION_FOLDER_NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ApogyCoreUIFacade.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ApogyCoreUIFacade"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ApogyCoreUIFacade)object).getDefaultApogySessionFilename();
		return label == null || label.length() == 0 ?
			getString("_UI_ApogyCoreUIFacade_type") :
			getString("_UI_ApogyCoreUIFacade_type") + " " + label;
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

		switch (notification.getFeatureID(ApogyCoreUIFacade.class)) {
			case ApogyCoreUIPackage.APOGY_CORE_UI_FACADE__DEFAULT_APOGY_PROJECT_NAME_PREFIX:
			case ApogyCoreUIPackage.APOGY_CORE_UI_FACADE__DEFAULT_APOGY_SESSION_FILENAME:
			case ApogyCoreUIPackage.APOGY_CORE_UI_FACADE__DEFAULT_APOGY_SESSION_FILENAME_EXTENSION:
			case ApogyCoreUIPackage.APOGY_CORE_UI_FACADE__DEFAULT_APOGY_SESSION_FOLDER_NAME:
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
		return ApogyCoreUIEditPlugin.INSTANCE;
	}

}
