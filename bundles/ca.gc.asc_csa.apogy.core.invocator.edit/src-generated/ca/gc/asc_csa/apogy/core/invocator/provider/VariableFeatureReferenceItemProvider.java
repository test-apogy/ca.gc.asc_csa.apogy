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

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
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
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFactory;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.ListRootNode;
import ca.gc.asc_csa.apogy.common.emf.edit.utils.ApogyCommonEMFEditUtilsFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class VariableFeatureReferenceItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VariableFeatureReferenceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addVariablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
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
	 * This adds a property descriptor for the Variable feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariableFeatureReference_variable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariableFeatureReference_variable_feature", "_UI_VariableFeatureReference_type"),
				 ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__VARIABLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT);
			childrenFeatures.add(ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns VariableFeatureReference.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VariableFeatureReference"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((VariableFeatureReference)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_VariableFeatureReference_type") :
			getString("_UI_VariableFeatureReference_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(VariableFeatureReference.class)) {
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__NAME:
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__VARIABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT:
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void collectNewChildDescriptorsGen(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT,
				 ApogyCoreInvocatorFactory.eINSTANCE.createTypeMemberReferenceListElement()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT,
				 ApogyCommonEMFFactory.eINSTANCE.createListRootNode()));
	}

	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		collectNewChildDescriptorsGen(newChildDescriptors, object);
		VariableFeatureReference variableFeatureReference = (VariableFeatureReference) object;

		if (variableFeatureReference.getVariable() == null) {
			ApogyCommonEMFEditUtilsFacade.INSTANCE
					.removeChildDescriptor(
							newChildDescriptors,
							ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT);

			ApogyCommonEMFEditUtilsFacade.INSTANCE
					.removeChildDescriptor(
							newChildDescriptors,
							ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT);
		} else {
			// Remove default Root Node.
			ApogyCommonEMFEditUtilsFacade.INSTANCE
					.removeChildDescriptor(
							newChildDescriptors,
							ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT);

			// Create a new Root Node with Source Class Defined.
			ListRootNode rootNode = ApogyCommonEMFFactory.eINSTANCE
					.createListRootNode();
		rootNode.setSourceClass(ApogyCoreInvocatorFacade.INSTANCE
					.getInstanceClass(variableFeatureReference));
			newChildDescriptors
					.add(createChildParameter(
							ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT,
							rootNode));
		}
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

	@SuppressWarnings("unused")
	@Override
	/**
	 * Override the setCommand to automatically create arguments when an operation is set.
	 */
	protected Command createSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value, int index) {

		VariableFeatureReference variableFeatureReference = (VariableFeatureReference) owner;

		/** Execute default set operation. */
		CompoundCommand compoundCommand = new CompoundCommand();
		compoundCommand.append(super.createSetCommand(domain, owner, feature,
				value, index));

		if (feature == ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__VARIABLE) {

			// Clears the Type Member List.
			compoundCommand
					.append(new SetCommand(
							domain,
							owner,
							ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT,
							null));

			// Clears the Feature node
			compoundCommand
					.append(new SetCommand(
							domain,
							owner,
							ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT,
							null));
			
		} else if (feature == ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT) {

			// Clears the feature root node.
			compoundCommand
					.append(new SetCommand(
							domain,
							owner,
							ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT,
							null));
		}
		return compoundCommand;
	}
}
