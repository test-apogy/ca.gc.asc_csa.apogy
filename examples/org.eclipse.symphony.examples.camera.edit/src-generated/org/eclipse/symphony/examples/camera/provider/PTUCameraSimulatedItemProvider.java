/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.camera.provider;


import ca.gc.asc_csa.eclipse.emf.ecore.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import ca.gc.space.topology.TopologyPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.addons.actuators.MRTActuatorsPackage;
import org.eclipse.symphony.examples.camera.EMFEcoreExampleCameraPackage;
import org.eclipse.symphony.examples.camera.PTUCameraSimulated;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.examples.camera.PTUCameraSimulated} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PTUCameraSimulatedItemProvider extends CameraSimulatedItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTUCameraSimulatedItemProvider(AdapterFactory adapterFactory) {
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
	 * @generated_NOT
	 */
	protected void addMovingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractActuator_moving_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractActuator_moving_feature", "_UI_AbstractActuator_type"),
				 MRTActuatorsPackage.Literals.ABSTRACT_ACTUATOR__MOVING,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_StatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Actuator Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addActuatorStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractActuator_actuatorStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractActuator_actuatorStatus_feature", "_UI_AbstractActuator_type"),
				 MRTActuatorsPackage.Literals.ABSTRACT_ACTUATOR__ACTUATOR_STATUS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_PanTiltUnitPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Pan Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addCurrentPanAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PanTiltUnit_currentPanAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PanTiltUnit_currentPanAngle_feature", "_UI_PanTiltUnit_type"),
				 MRTActuatorsPackage.Literals.PAN_TILT_UNIT__CURRENT_PAN_ANGLE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_PanTiltUnitPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Tilt Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addCurrentTiltAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PanTiltUnit_currentTiltAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PanTiltUnit_currentTiltAngle_feature", "_UI_PanTiltUnit_type"),
				 MRTActuatorsPackage.Literals.PAN_TILT_UNIT__CURRENT_TILT_ANGLE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_PanTiltUnitPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Commanded Pan Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addCommandedPanAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PanTiltUnit_commandedPanAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PanTiltUnit_commandedPanAngle_feature", "_UI_PanTiltUnit_type"),
				 MRTActuatorsPackage.Literals.PAN_TILT_UNIT__COMMANDED_PAN_ANGLE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_PanTiltUnitPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Commanded Tilt Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addCommandedTiltAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PanTiltUnit_commandedTiltAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PanTiltUnit_commandedTiltAngle_feature", "_UI_PanTiltUnit_type"),
				 MRTActuatorsPackage.Literals.PAN_TILT_UNIT__COMMANDED_TILT_ANGLE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_PanTiltUnitPropertyCategory"),
				 null));
	}

	/**
	 * This returns PTUCameraSimulated.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PTUCameraSimulated"));
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
		
		// Cast down to a simulated PTU camera
		PTUCameraSimulated ptuCameraSimulated = (PTUCameraSimulated) object;
		
		// Get the default label
		String label = getString("_UI_PTUCameraSimulated_type"); 
		
		// If the PTU Camera isn't null
		if (ptuCameraSimulated != null)
		{
			// Add relevant features to the label
			label += " (Zoom=" + ptuCameraSimulated.getCurrentZoom() +
					 ", PanAngle=" +
					 Math.toDegrees(ptuCameraSimulated.getCurrentPanAngle()) +
					 DEGREE_SYM + ", TiltAngle=" +
					 Math.toDegrees(ptuCameraSimulated.getCurrentTiltAngle()) +
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

		switch (notification.getFeatureID(PTUCameraSimulated.class)) {
			case EMFEcoreExampleCameraPackage.PTU_CAMERA_SIMULATED__MOVING:
			case EMFEcoreExampleCameraPackage.PTU_CAMERA_SIMULATED__ACTUATOR_STATUS:
			case EMFEcoreExampleCameraPackage.PTU_CAMERA_SIMULATED__CURRENT_PAN_ANGLE:
			case EMFEcoreExampleCameraPackage.PTU_CAMERA_SIMULATED__CURRENT_TILT_ANGLE:
			case EMFEcoreExampleCameraPackage.PTU_CAMERA_SIMULATED__COMMANDED_PAN_ANGLE:
			case EMFEcoreExampleCameraPackage.PTU_CAMERA_SIMULATED__COMMANDED_TILT_ANGLE:
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
			childFeature == TopologyPackage.Literals.GROUP_NODE__CHILDREN ||
			childFeature == TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN ||
			childFeature == EMFEcoreExampleCameraPackage.Literals.CAMERA__FOV;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
