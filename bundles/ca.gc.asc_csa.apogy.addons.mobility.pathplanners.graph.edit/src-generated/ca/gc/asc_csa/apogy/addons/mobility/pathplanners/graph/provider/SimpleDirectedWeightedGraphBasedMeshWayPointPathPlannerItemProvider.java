package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.provider;
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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner;
import ca.gc.asc_csa.apogy.common.processors.ApogyCommonProcessorsPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleDirectedWeightedGraphBasedMeshWayPointPathPlannerItemProvider
	extends CostBasedMeshWayPointPathPlannerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleDirectedWeightedGraphBasedMeshWayPointPathPlannerItemProvider(AdapterFactory adapterFactory) {
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

			addVerbosePropertyDescriptor(object);
			addSimpleDirectedWeightedGraphPropertyDescriptor(object);
			addEnablePathSimplificationPropertyDescriptor(object);
			addRobotWidthForPathSimplicationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Verbose feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerbosePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VerboseProvider_verbose_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VerboseProvider_verbose_feature", "_UI_VerboseProvider_type"),
				 ApogyCommonProcessorsPackage.Literals.VERBOSE_PROVIDER__VERBOSE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Simple Directed Weighted Graph feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSimpleDirectedWeightedGraphPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_simpleDirectedWeightedGraph_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_simpleDirectedWeightedGraph_feature", "_UI_SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_type"),
				 ApogyAddonsMobilityPathplannersGraphPackage.Literals.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__SIMPLE_DIRECTED_WEIGHTED_GRAPH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Path Simplification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnablePathSimplificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_enablePathSimplification_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_enablePathSimplification_feature", "_UI_SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_type"),
				 ApogyAddonsMobilityPathplannersGraphPackage.Literals.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__ENABLE_PATH_SIMPLIFICATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Robot Width For Path Simplication feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRobotWidthForPathSimplicationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_robotWidthForPathSimplication_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_robotWidthForPathSimplication_feature", "_UI_SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_type"),
				 ApogyAddonsMobilityPathplannersGraphPackage.Literals.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__ROBOT_WIDTH_FOR_PATH_SIMPLICATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IProgressMonitor labelValue = ((SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner<?>)object).getProgressMonitor();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_type") :
			getString("_UI_SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner_type") + " " + label;
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

		switch (notification.getFeatureID(SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner.class)) {
			case ApogyAddonsMobilityPathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__VERBOSE:
			case ApogyAddonsMobilityPathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__SIMPLE_DIRECTED_WEIGHTED_GRAPH:
			case ApogyAddonsMobilityPathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__ENABLE_PATH_SIMPLIFICATION:
			case ApogyAddonsMobilityPathplannersGraphPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH_BASED_MESH_WAY_POINT_PATH_PLANNER__ROBOT_WIDTH_FOR_PATH_SIMPLICATION:
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
