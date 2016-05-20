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
package ca.gc.asc_csa.apogy.addons.provider;


import ca.gc.asc_csa.apogy.addons.AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool;
import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractURLNodeGeometryPlacementAtFeatureOfInterestToolItemProvider extends GeometryPlacementAtFeatureOfInterestToolItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractURLNodeGeometryPlacementAtFeatureOfInterestToolItemProvider(AdapterFactory adapterFactory) {
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

			addCadTransformNodePropertyDescriptor(object);
			addUrlNodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	
	/**
	 * This adds a property descriptor for the Cad Transform Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCadTransformNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool_cadTransformNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool_cadTransformNode_feature", "_UI_AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool_type"),
				 ApogyAddonsPackage.Literals.ABSTRACT_URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__CAD_TRANSFORM_NODE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Url Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUrlNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool_urlNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool_urlNode_feature", "_UI_AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool_type"),
				 ApogyAddonsPackage.Literals.ABSTRACT_URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__URL_NODE,
				 false,
				 false,
				 false,
				 null,
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ApogyAddonsPackage.Literals.ABSTRACT_URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__CAD_TRANSFORM_NODE);
			childrenFeatures.add(ApogyAddonsPackage.Literals.ABSTRACT_URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__URL_NODE);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool_type") :
			getString("_UI_AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool_type") + " " + label;
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

		switch (notification.getFeatureID(AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool.class)) {
			case ApogyAddonsPackage.ABSTRACT_URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__CAD_TRANSFORM_NODE:
			case ApogyAddonsPackage.ABSTRACT_URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__URL_NODE:
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
	}

}