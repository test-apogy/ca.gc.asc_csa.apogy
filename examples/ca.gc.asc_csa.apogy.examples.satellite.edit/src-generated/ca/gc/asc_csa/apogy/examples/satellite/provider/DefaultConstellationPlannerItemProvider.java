/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * Canadian Space Agency (CSA) - Initial API and implementation
 * -Pierre Allard (Pierre.Allard@canada.ca),
 * -Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 * -Sebastien Gemme (Sebastien.Gemme@canada.ca)
 */
package ca.gc.asc_csa.apogy.examples.satellite.provider;


import ca.gc.asc_csa.apogy.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;
import ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationPlanner;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationPlanner} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DefaultConstellationPlannerItemProvider extends AbstractConstellationPlannerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultConstellationPlannerItemProvider(AdapterFactory adapterFactory) {
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

			addUmbraPassesValidPropertyDescriptor(object);
			addSatelliteRollCommandValidPropertyDescriptor(object);
			addSunHorizonAngleUmbraThresholdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Umbra Passes Valid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUmbraPassesValidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DefaultConstellationPlanner_umbraPassesValid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DefaultConstellationPlanner_umbraPassesValid_feature", "_UI_DefaultConstellationPlanner_type"),
				 ApogyExamplesSatellitePackage.Literals.DEFAULT_CONSTELLATION_PLANNER__UMBRA_PASSES_VALID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_VISIBILITY_PASS_VALIDITYPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Satellite Roll Command Valid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSatelliteRollCommandValidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DefaultConstellationPlanner_satelliteRollCommandValid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DefaultConstellationPlanner_satelliteRollCommandValid_feature", "_UI_DefaultConstellationPlanner_type"),
				 ApogyExamplesSatellitePackage.Literals.DEFAULT_CONSTELLATION_PLANNER__SATELLITE_ROLL_COMMAND_VALID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_VISIBILITY_PASS_VALIDITYPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Sun Horizon Angle Umbra Threshold feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addSunHorizonAngleUmbraThresholdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DefaultConstellationPlanner_sunHorizonAngleUmbraThreshold_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DefaultConstellationPlanner_sunHorizonAngleUmbraThreshold_feature", "_UI_DefaultConstellationPlanner_type"),
				 ApogyExamplesSatellitePackage.Literals.DEFAULT_CONSTELLATION_PLANNER__SUN_HORIZON_ANGLE_UMBRA_THRESHOLD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_VISIBILITY_PASS_VALIDITYPropertyCategory"),
				 null));
	}

	/**
	 * This returns DefaultConstellationPlanner.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DefaultConstellationPlanner"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DefaultConstellationPlanner)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DefaultConstellationPlanner_type") :
			getString("_UI_DefaultConstellationPlanner_type") + " " + label;
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

		switch (notification.getFeatureID(DefaultConstellationPlanner.class)) {
			case ApogyExamplesSatellitePackage.DEFAULT_CONSTELLATION_PLANNER__UMBRA_PASSES_VALID:
			case ApogyExamplesSatellitePackage.DEFAULT_CONSTELLATION_PLANNER__SATELLITE_ROLL_COMMAND_VALID:
			case ApogyExamplesSatellitePackage.DEFAULT_CONSTELLATION_PLANNER__SUN_HORIZON_ANGLE_UMBRA_THRESHOLD:
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
