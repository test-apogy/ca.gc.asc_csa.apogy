package ca.gc.asc_csa.apogy.examples.camera.provider;
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
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.addons.actuators.ApogyAddonsActuatorsPackage;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.examples.camera.ApogyExamplesCameraPackage;
import ca.gc.asc_csa.apogy.examples.camera.PTUCameraStub;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.examples.camera.PTUCameraStub} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PTUCameraStubItemProvider extends CameraStubItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTUCameraStubItemProvider(AdapterFactory adapterFactory) {
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

			addMovingPropertyDescriptor(object);
			addActuatorStatusPropertyDescriptor(object);
			addCurrentPanAnglePropertyDescriptor(object);
			addCurrentTiltAnglePropertyDescriptor(object);
			addCommandedPanAnglePropertyDescriptor(object);
			addCommandedTiltAnglePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Moving feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMovingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractActuator_moving_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractActuator_moving_feature", "_UI_AbstractActuator_type"),
				 ApogyAddonsActuatorsPackage.Literals.ABSTRACT_ACTUATOR__MOVING,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_ACTUATOR_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Actuator Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActuatorStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractActuator_actuatorStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractActuator_actuatorStatus_feature", "_UI_AbstractActuator_type"),
				 ApogyAddonsActuatorsPackage.Literals.ABSTRACT_ACTUATOR__ACTUATOR_STATUS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ACTUATOR_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Pan Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentPanAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PanTiltUnit_currentPanAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PanTiltUnit_currentPanAngle_feature", "_UI_PanTiltUnit_type"),
				 ApogyAddonsActuatorsPackage.Literals.PAN_TILT_UNIT__CURRENT_PAN_ANGLE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_ACTUATOR_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Tilt Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentTiltAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PanTiltUnit_currentTiltAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PanTiltUnit_currentTiltAngle_feature", "_UI_PanTiltUnit_type"),
				 ApogyAddonsActuatorsPackage.Literals.PAN_TILT_UNIT__CURRENT_TILT_ANGLE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_ACTUATOR_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Commanded Pan Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommandedPanAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PanTiltUnit_commandedPanAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PanTiltUnit_commandedPanAngle_feature", "_UI_PanTiltUnit_type"),
				 ApogyAddonsActuatorsPackage.Literals.PAN_TILT_UNIT__COMMANDED_PAN_ANGLE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_ACTUATOR_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Commanded Tilt Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommandedTiltAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PanTiltUnit_commandedTiltAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PanTiltUnit_commandedTiltAngle_feature", "_UI_PanTiltUnit_type"),
				 ApogyAddonsActuatorsPackage.Literals.PAN_TILT_UNIT__COMMANDED_TILT_ANGLE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_ACTUATOR_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This returns PTUCameraStub.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PTUCameraStub"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public String getText(Object object)
	{
		/**
		 * This is the degree symbol, as expressed in unicode
		 */
		final String DEGREE_SYM = "\u00b0";
		
		// Cast down to a stub PTU camera
		PTUCameraStub ptuCameraStub = (PTUCameraStub) object;
		
		// Get the default label
		String label = getString("_UI_PTUCameraStub_type"); 
		
		// If the PTU Camera isn't null
		if (ptuCameraStub != null)
		{
			// Add relevant features to the label
			label += " (Zoom=" + ptuCameraStub.getCurrentZoom() +
					 ", PanAngle=" +
					 Math.toDegrees(ptuCameraStub.getCurrentPanAngle()) +
					 DEGREE_SYM + ", TiltAngle=" +
					 Math.toDegrees(ptuCameraStub.getCurrentTiltAngle()) +
					 DEGREE_SYM + ")";
		}
		
		// Return the label
		return label;
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

		switch (notification.getFeatureID(PTUCameraStub.class)) {
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__MOVING:
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__ACTUATOR_STATUS:
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__CURRENT_PAN_ANGLE:
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__CURRENT_TILT_ANGLE:
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__COMMANDED_PAN_ANGLE:
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__COMMANDED_TILT_ANGLE:
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
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ApogyCommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN ||
			childFeature == ApogyExamplesCameraPackage.Literals.CAMERA__FOV;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
