/**
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
package ca.gc.asc_csa.apogy.workspace.provider;


import ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade;
import ca.gc.asc_csa.apogy.workspace.ApogyWorkspacePackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyWorkspaceFacadeItemProvider 
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
	public ApogyWorkspaceFacadeItemProvider(AdapterFactory adapterFactory) {
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

			addDefaultProjectNamePrefixPropertyDescriptor(object);
			addDefaultSessionFilenamePropertyDescriptor(object);
			addDefaultSessionFilenameExtensionPropertyDescriptor(object);
			addDefaultSessionsFolderNamePropertyDescriptor(object);
			addDefaultProgramsFolderNamePropertyDescriptor(object);
			addDefaultDataFolderNamePropertyDescriptor(object);
			addActiveProjectPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Default Project Name Prefix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultProjectNamePrefixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApogyWorkspaceFacade_defaultProjectNamePrefix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApogyWorkspaceFacade_defaultProjectNamePrefix_feature", "_UI_ApogyWorkspaceFacade_type"),
				 ApogyWorkspacePackage.Literals.APOGY_WORKSPACE_FACADE__DEFAULT_PROJECT_NAME_PREFIX,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Session Filename feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultSessionFilenamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApogyWorkspaceFacade_defaultSessionFilename_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApogyWorkspaceFacade_defaultSessionFilename_feature", "_UI_ApogyWorkspaceFacade_type"),
				 ApogyWorkspacePackage.Literals.APOGY_WORKSPACE_FACADE__DEFAULT_SESSION_FILENAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Session Filename Extension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultSessionFilenameExtensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApogyWorkspaceFacade_defaultSessionFilenameExtension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApogyWorkspaceFacade_defaultSessionFilenameExtension_feature", "_UI_ApogyWorkspaceFacade_type"),
				 ApogyWorkspacePackage.Literals.APOGY_WORKSPACE_FACADE__DEFAULT_SESSION_FILENAME_EXTENSION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Sessions Folder Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultSessionsFolderNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApogyWorkspaceFacade_defaultSessionsFolderName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApogyWorkspaceFacade_defaultSessionsFolderName_feature", "_UI_ApogyWorkspaceFacade_type"),
				 ApogyWorkspacePackage.Literals.APOGY_WORKSPACE_FACADE__DEFAULT_SESSIONS_FOLDER_NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Programs Folder Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultProgramsFolderNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApogyWorkspaceFacade_defaultProgramsFolderName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApogyWorkspaceFacade_defaultProgramsFolderName_feature", "_UI_ApogyWorkspaceFacade_type"),
				 ApogyWorkspacePackage.Literals.APOGY_WORKSPACE_FACADE__DEFAULT_PROGRAMS_FOLDER_NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Data Folder Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultDataFolderNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApogyWorkspaceFacade_defaultDataFolderName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApogyWorkspaceFacade_defaultDataFolderName_feature", "_UI_ApogyWorkspaceFacade_type"),
				 ApogyWorkspacePackage.Literals.APOGY_WORKSPACE_FACADE__DEFAULT_DATA_FOLDER_NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Active Project feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActiveProjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApogyWorkspaceFacade_activeProject_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApogyWorkspaceFacade_activeProject_feature", "_UI_ApogyWorkspaceFacade_type"),
				 ApogyWorkspacePackage.Literals.APOGY_WORKSPACE_FACADE__ACTIVE_PROJECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ApogyWorkspaceFacade.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ApogyWorkspaceFacade"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ApogyWorkspaceFacade)object).getDefaultSessionFilename();
		return label == null || label.length() == 0 ?
			getString("_UI_ApogyWorkspaceFacade_type") :
			getString("_UI_ApogyWorkspaceFacade_type") + " " + label;
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

		switch (notification.getFeatureID(ApogyWorkspaceFacade.class)) {
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DEFAULT_PROJECT_NAME_PREFIX:
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DEFAULT_SESSION_FILENAME:
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DEFAULT_SESSION_FILENAME_EXTENSION:
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DEFAULT_SESSIONS_FOLDER_NAME:
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DEFAULT_PROGRAMS_FOLDER_NAME:
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DEFAULT_DATA_FOLDER_NAME:
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DELETED_WORSKPACE_PROJECT:
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__NEW_WORKSPACE_PROJECT:
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__ACTIVE_PROJECT:
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
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
