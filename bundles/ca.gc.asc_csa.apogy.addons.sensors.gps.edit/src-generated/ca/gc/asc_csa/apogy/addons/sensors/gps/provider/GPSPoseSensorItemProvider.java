package ca.gc.asc_csa.apogy.addons.sensors.gps.provider;
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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor;
import ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSFactory;
import ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSPackage;
import ca.gc.asc_csa.apogy.addons.sensors.pose.provider.PoseSensorItemProvider;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
<<<<<<< HEAD
=======
import ca.gc.asc_csa.apogy.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
>>>>>>> refs/heads/master

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSPoseSensor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GPSPoseSensorItemProvider
	extends PoseSensorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPSPoseSensorItemProvider(AdapterFactory adapterFactory) {
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

			addStartedPropertyDescriptor(object);
			addServerJobPropertyDescriptor(object);
			addOriginLatitudePropertyDescriptor(object);
			addOriginLongitudePropertyDescriptor(object);
			addNeAnglePropertyDescriptor(object);
			addOriginElevationPropertyDescriptor(object);
			addMaxInitTimePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Started feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Startable_started_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Startable_started_feature", "_UI_Startable_type"),
				 ApogyCommonEMFPackage.Literals.STARTABLE__STARTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Server Job feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerJobPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Server_serverJob_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Server_serverJob_feature", "_UI_Server_type"),
				 ApogyCommonEMFPackage.Literals.SERVER__SERVER_JOB,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Origin Latitude feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginLatitudePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GPSPoseSensor_originLatitude_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GPSPoseSensor_originLatitude_feature", "_UI_GPSPoseSensor_type"),
				 ApogyAddonsSensorsGPSPackage.Literals.GPS_POSE_SENSOR__ORIGIN_LATITUDE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Origin Longitude feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginLongitudePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GPSPoseSensor_originLongitude_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GPSPoseSensor_originLongitude_feature", "_UI_GPSPoseSensor_type"),
				 ApogyAddonsSensorsGPSPackage.Literals.GPS_POSE_SENSOR__ORIGIN_LONGITUDE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ne Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNeAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GPSPoseSensor_neAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GPSPoseSensor_neAngle_feature", "_UI_GPSPoseSensor_type"),
				 ApogyAddonsSensorsGPSPackage.Literals.GPS_POSE_SENSOR__NE_ANGLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Origin Elevation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginElevationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GPSPoseSensor_originElevation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GPSPoseSensor_originElevation_feature", "_UI_GPSPoseSensor_type"),
				 ApogyAddonsSensorsGPSPackage.Literals.GPS_POSE_SENSOR__ORIGIN_ELEVATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Init Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxInitTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GPSPoseSensor_maxInitTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GPSPoseSensor_maxInitTime_feature", "_UI_GPSPoseSensor_type"),
				 ApogyAddonsSensorsGPSPackage.Literals.GPS_POSE_SENSOR__MAX_INIT_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(ApogyAddonsSensorsGPSPackage.Literals.GPS_POSE_SENSOR__GPS);
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
	 * This returns GPSPoseSensor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GPSPoseSensor"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GPSPoseSensor)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_GPSPoseSensor_type") :
			getString("_UI_GPSPoseSensor_type") + " " + label;
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

		switch (notification.getFeatureID(GPSPoseSensor.class)) {
			case ApogyAddonsSensorsGPSPackage.GPS_POSE_SENSOR__STARTED:
			case ApogyAddonsSensorsGPSPackage.GPS_POSE_SENSOR__SERVER_JOB:
			case ApogyAddonsSensorsGPSPackage.GPS_POSE_SENSOR__ORIGIN_LATITUDE:
			case ApogyAddonsSensorsGPSPackage.GPS_POSE_SENSOR__ORIGIN_LONGITUDE:
			case ApogyAddonsSensorsGPSPackage.GPS_POSE_SENSOR__NE_ANGLE:
			case ApogyAddonsSensorsGPSPackage.GPS_POSE_SENSOR__ORIGIN_ELEVATION:
			case ApogyAddonsSensorsGPSPackage.GPS_POSE_SENSOR__MAX_INIT_TIME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ApogyAddonsSensorsGPSPackage.GPS_POSE_SENSOR__GPS:
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
				(ApogyAddonsSensorsGPSPackage.Literals.GPS_POSE_SENSOR__GPS,
				 ApogyAddonsSensorsGPSFactory.eINSTANCE.createMarkedGPS()));
	}

}
