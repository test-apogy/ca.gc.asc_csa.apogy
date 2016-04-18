package ca.gc.asc_csa.apogy.common.topology.addons.dynamics.provider;
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


import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.DynamicSystemProperties;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsFactory;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage;
import ca.gc.asc_csa.apogy.common.topology.provider.AggregateGroupNodeItemProvider;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.DynamicSystemProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamicSystemPropertiesItemProvider
	extends AggregateGroupNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicSystemPropertiesItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ApogyCommonTopologyAddonsDynamicsPackage.Literals.DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS);
			childrenFeatures.add(ApogyCommonTopologyAddonsDynamicsPackage.Literals.DYNAMIC_SYSTEM_PROPERTIES__MATERIALS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DynamicSystemProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DynamicSystemProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DynamicSystemProperties)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_DynamicSystemProperties_type") :
			getString("_UI_DynamicSystemProperties_type") + " " + label;
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

		switch (notification.getFeatureID(DynamicSystemProperties.class)) {
			case ApogyCommonTopologyAddonsDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS:
			case ApogyCommonTopologyAddonsDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__MATERIALS:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 ApogyCommonTopologyAddonsDynamicsFactory.eINSTANCE.createDynamicSystemProperties()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 ApogyCommonTopologyAddonsDynamicsFactory.eINSTANCE.createPhysicalBody()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyAddonsDynamicsPackage.Literals.DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS,
				 ApogyCommonTopologyAddonsDynamicsFactory.eINSTANCE.createCylindricalConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyAddonsDynamicsPackage.Literals.DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS,
				 ApogyCommonTopologyAddonsDynamicsFactory.eINSTANCE.createGearRatioConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyAddonsDynamicsPackage.Literals.DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS,
				 ApogyCommonTopologyAddonsDynamicsFactory.eINSTANCE.createHingeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyAddonsDynamicsPackage.Literals.DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS,
				 ApogyCommonTopologyAddonsDynamicsFactory.eINSTANCE.createPrismaticConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyAddonsDynamicsPackage.Literals.DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS,
				 ApogyCommonTopologyAddonsDynamicsFactory.eINSTANCE.createRPROConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyAddonsDynamicsPackage.Literals.DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS,
				 ApogyCommonTopologyAddonsDynamicsFactory.eINSTANCE.createUniversalConstraint()));
	}

}
