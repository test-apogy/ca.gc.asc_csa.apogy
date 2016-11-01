package ca.gc.asc_csa.apogy.core.invocator.provider;
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
import org.eclipse.emf.ecore.EStructuralFeature;
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
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.core.invocator.Context} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContextItemProvider
  extends ItemProviderAdapter
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ContextItemProvider(AdapterFactory adapterFactory)
  {
		super(adapterFactory);
	}

  /**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addArchivedPropertyDescriptor(object);
			addDataProductsListPropertyDescriptor(object);
			addInstancesCreationDatePropertyDescriptor(object);
			addInstancesDisposalDatePropertyDescriptor(object);
			addVariablesInstantiatedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addNamePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Named_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Named_name_feature", "_UI_Named_type"),
				 ApogyCommonEMFPackage.Literals.NAMED__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Described_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Described_description_feature", "_UI_Described_type"),
				 ApogyCommonEMFPackage.Literals.DESCRIBED__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Archived feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArchivedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Archivable_archived_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Archivable_archived_feature", "_UI_Archivable_type"),
				 ApogyCommonEMFPackage.Literals.ARCHIVABLE__ARCHIVED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Data Products List feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addDataProductsListPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Context_dataProductsList_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Context_dataProductsList_feature", "_UI_Context_type"),
				 ApogyCoreInvocatorPackage.Literals.CONTEXT__DATA_PRODUCTS_LIST,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Instances Creation Date feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addInstancesCreationDatePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Context_instancesCreationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Context_instancesCreationDate_feature", "_UI_Context_type"),
				 ApogyCoreInvocatorPackage.Literals.CONTEXT__INSTANCES_CREATION_DATE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Instances Disposal Date feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addInstancesDisposalDatePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Context_instancesDisposalDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Context_instancesDisposalDate_feature", "_UI_Context_type"),
				 ApogyCoreInvocatorPackage.Literals.CONTEXT__INSTANCES_DISPOSAL_DATE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Variables Instantiated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariablesInstantiatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Context_variablesInstantiated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Context_variablesInstantiated_feature", "_UI_Context_type"),
				 ApogyCoreInvocatorPackage.Literals.CONTEXT__VARIABLES_INSTANTIATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ApogyCoreInvocatorPackage.Literals.CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST);
		}
		return childrenFeatures;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

  /**
	 * This returns Context.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Context"));
	}

		/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object)
  {
		String label = ((Context)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Context_type") :
			getString("_UI_Context_type") + " " + label;
	}

  /**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void notifyChanged(Notification notification)
  {
		updateChildren(notification);

		switch (notification.getFeatureID(Context.class)) {
			case ApogyCoreInvocatorPackage.CONTEXT__NAME:
			case ApogyCoreInvocatorPackage.CONTEXT__DESCRIPTION:
			case ApogyCoreInvocatorPackage.CONTEXT__ARCHIVED:
			case ApogyCoreInvocatorPackage.CONTEXT__DATA_PRODUCTS_LIST:
			case ApogyCoreInvocatorPackage.CONTEXT__INSTANCES_CREATION_DATE:
			case ApogyCoreInvocatorPackage.CONTEXT__INSTANCES_DISPOSAL_DATE:
			case ApogyCoreInvocatorPackage.CONTEXT__VARIABLES_INSTANTIATED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ApogyCoreInvocatorPackage.CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ApogyCoreInvocatorPackage.Literals.CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST,
				 ApogyCoreInvocatorFactory.eINSTANCE.createVariableImplementationsList()));
	}

  /**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ResourceLocator getResourceLocator()
  {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
