/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Pierre Allard (Pierre.Allard@canada.ca), 
 *      Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *      Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *      Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.core.invocator.provider;


import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.ProgramFactoriesRegistry;

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
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.core.invocator.ProgramFactoriesRegistry} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgramFactoriesRegistryItemProvider 
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
	public ProgramFactoriesRegistryItemProvider(AdapterFactory adapterFactory) {
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

			addPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_IDPropertyDescriptor(object);
			addPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_IDPropertyDescriptor(object);
			addPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_IDPropertyDescriptor(object);
			addProgramFactoriesMapPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the PROGRAM FACTORY PROVIDER CONTRIBUTORS POINT ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_IDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProgramFactoriesRegistry_PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProgramFactoriesRegistry_PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID_feature", "_UI_ProgramFactoriesRegistry_type"),
				 ApogyCoreInvocatorPackage.Literals.PROGRAM_FACTORIES_REGISTRY__PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PROGRAM FACTORY PROVIDER CONTRIBUTORS ECLASS ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_IDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProgramFactoriesRegistry_PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProgramFactoriesRegistry_PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID_feature", "_UI_ProgramFactoriesRegistry_type"),
				 ApogyCoreInvocatorPackage.Literals.PROGRAM_FACTORIES_REGISTRY__PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PROGRAM FACTORY PROVIDER CONTRIBUTORS FACTORY ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_IDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProgramFactoriesRegistry_PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProgramFactoriesRegistry_PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID_feature", "_UI_ProgramFactoriesRegistry_type"),
				 ApogyCoreInvocatorPackage.Literals.PROGRAM_FACTORIES_REGISTRY__PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Program Factories Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProgramFactoriesMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProgramFactoriesRegistry_programFactoriesMap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProgramFactoriesRegistry_programFactoriesMap_feature", "_UI_ProgramFactoriesRegistry_type"),
				 ApogyCoreInvocatorPackage.Literals.PROGRAM_FACTORIES_REGISTRY__PROGRAM_FACTORIES_MAP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ProgramFactoriesRegistry.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProgramFactoriesRegistry"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ProgramFactoriesRegistry)object).getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID();
		return label == null || label.length() == 0 ?
			getString("_UI_ProgramFactoriesRegistry_type") :
			getString("_UI_ProgramFactoriesRegistry_type") + " " + label;
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

		switch (notification.getFeatureID(ProgramFactoriesRegistry.class)) {
			case ApogyCoreInvocatorPackage.PROGRAM_FACTORIES_REGISTRY__PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID:
			case ApogyCoreInvocatorPackage.PROGRAM_FACTORIES_REGISTRY__PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID:
			case ApogyCoreInvocatorPackage.PROGRAM_FACTORIES_REGISTRY__PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID:
			case ApogyCoreInvocatorPackage.PROGRAM_FACTORIES_REGISTRY__PROGRAM_FACTORIES_MAP:
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
