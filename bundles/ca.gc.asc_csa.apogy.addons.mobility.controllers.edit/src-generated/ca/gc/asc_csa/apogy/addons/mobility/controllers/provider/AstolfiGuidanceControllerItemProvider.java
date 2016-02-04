package ca.gc.asc_csa.apogy.addons.mobility.controllers.provider;
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
import ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController;
import ca.gc.asc_csa.apogy.addons.mobility.controllers.ApogyAddonsMobilityControllersPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AstolfiGuidanceControllerItemProvider
	extends SkidSteeredPlatformPathFollowerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstolfiGuidanceControllerItemProvider(AdapterFactory adapterFactory) {
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

			addCurrentWayPointPropertyDescriptor(object);
			addPreviousWayPointPropertyDescriptor(object);
			addCurrentPoseInGuidanceReferenceFramePropertyDescriptor(object);
			addRhoPropertyDescriptor(object);
			addPhiPropertyDescriptor(object);
			addAlphaPropertyDescriptor(object);
			addYawPropertyDescriptor(object);
			addNuPropertyDescriptor(object);
			addOmegaPropertyDescriptor(object);
			addKrhoPropertyDescriptor(object);
			addKphiPropertyDescriptor(object);
			addKalphaPropertyDescriptor(object);
			addDestinationDistanceThresholdPropertyDescriptor(object);
			addWayPointDistanceThresholdPropertyDescriptor(object);
			addKHillPropertyDescriptor(object);
			addHillThresholdPropertyDescriptor(object);
			addPhiThresholdForReducedVelocityPropertyDescriptor(object);
			addAlphaThresholdForReducedVelocityPropertyDescriptor(object);
			addSmoothPathEnabledPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Current Way Point feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentWayPointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AstolfiGuidanceController_currentWayPoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AstolfiGuidanceController_currentWayPoint_feature", "_UI_AstolfiGuidanceController_type"),
				 ApogyAddonsMobilityControllersPackage.Literals.ASTOLFI_GUIDANCE_CONTROLLER__CURRENT_WAY_POINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Previous Way Point feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreviousWayPointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AstolfiGuidanceController_previousWayPoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AstolfiGuidanceController_previousWayPoint_feature", "_UI_AstolfiGuidanceController_type"),
				 ApogyAddonsMobilityControllersPackage.Literals.ASTOLFI_GUIDANCE_CONTROLLER__PREVIOUS_WAY_POINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Pose In Guidance Reference Frame feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentPoseInGuidanceReferenceFramePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AstolfiGuidanceController_currentPoseInGuidanceReferenceFrame_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AstolfiGuidanceController_currentPoseInGuidanceReferenceFrame_feature", "_UI_AstolfiGuidanceController_type"),
				 ApogyAddonsMobilityControllersPackage.Literals.ASTOLFI_GUIDANCE_CONTROLLER__CURRENT_POSE_IN_GUIDANCE_REFERENCE_FRAME,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rho feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRhoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AstolfiGuidanceController_rho_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AstolfiGuidanceController_rho_feature", "_UI_AstolfiGuidanceController_type"),
				 ApogyAddonsMobilityControllersPackage.Literals.ASTOLFI_GUIDANCE_CONTROLLER__RHO,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phi feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhiPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AstolfiGuidanceController_phi_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AstolfiGuidanceController_phi_feature", "_UI_AstolfiGuidanceController_type"),
				 ApogyAddonsMobilityControllersPackage.Literals.ASTOLFI_GUIDANCE_CONTROLLER__PHI,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alpha feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlphaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AstolfiGuidanceController_alpha_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AstolfiGuidanceController_alpha_feature", "_UI_AstolfiGuidanceController_type"),
				 ApogyAddonsMobilityControllersPackage.Literals.ASTOLFI_GUIDANCE_CONTROLLER__ALPHA,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Yaw feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYawPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AstolfiGuidanceController_yaw_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AstolfiGuidanceController_yaw_feature", "_UI_AstolfiGuidanceController_type"),
				 ApogyAddonsMobilityControllersPackage.Literals.ASTOLFI_GUIDANCE_CONTROLLER__YAW,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nu feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNuPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AstolfiGuidanceController_nu_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AstolfiGuidanceController_nu_feature", "_UI_AstolfiGuidanceController_type"),
				 ApogyAddonsMobilityControllersPackage.Literals.ASTOLFI_GUIDANCE_CONTROLLER__NU,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Omega feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOmegaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AstolfiGuidanceController_omega_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AstolfiGuidanceController_omega_feature", "_UI_AstolfiGuidanceController_type"),
				 ApogyAddonsMobilityControllersPackage.Literals.ASTOLFI_GUIDANCE_CONTROLLER__OMEGA,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Krho feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKrhoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AstolfiGuidanceController_krho_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AstolfiGuidanceController_krho_feature", "_UI_AstolfiGuidanceController_type"),
				 ApogyAddonsMobilityControllersPackage.Literals.ASTOLFI_GUIDANCE_CONTROLLER__KRHO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Kphi feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKphiPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AstolfiGuidanceController_kphi_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AstolfiGuidanceController_kphi_feature", "_UI_AstolfiGuidanceController_type"),
				 ApogyAddonsMobilityControllersPackage.Literals.ASTOLFI_GUIDANCE_CONTROLLER__KPHI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Kalpha feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKalphaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AstolfiGuidanceController_kalpha_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AstolfiGuidanceController_kalpha_feature", "_UI_AstolfiGuidanceController_type"),
				 ApogyAddonsMobilityControllersPackage.Literals.ASTOLFI_GUIDANCE_CONTROLLER__KALPHA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Destination Distance Threshold feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDestinationDistanceThresholdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AstolfiGuidanceController_destinationDistanceThreshold_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AstolfiGuidanceController_destinationDistanceThreshold_feature", "_UI_AstolfiGuidanceController_type"),
				 ApogyAddonsMobilityControllersPackage.Literals.ASTOLFI_GUIDANCE_CONTROLLER__DESTINATION_DISTANCE_THRESHOLD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Way Point Distance Threshold feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWayPointDistanceThresholdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AstolfiGuidanceController_wayPointDistanceThreshold_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AstolfiGuidanceController_wayPointDistanceThreshold_feature", "_UI_AstolfiGuidanceController_type"),
				 ApogyAddonsMobilityControllersPackage.Literals.ASTOLFI_GUIDANCE_CONTROLLER__WAY_POINT_DISTANCE_THRESHOLD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the KHill feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKHillPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AstolfiGuidanceController_kHill_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AstolfiGuidanceController_kHill_feature", "_UI_AstolfiGuidanceController_type"),
				 ApogyAddonsMobilityControllersPackage.Literals.ASTOLFI_GUIDANCE_CONTROLLER__KHILL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hill Threshold feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHillThresholdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AstolfiGuidanceController_hillThreshold_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AstolfiGuidanceController_hillThreshold_feature", "_UI_AstolfiGuidanceController_type"),
				 ApogyAddonsMobilityControllersPackage.Literals.ASTOLFI_GUIDANCE_CONTROLLER__HILL_THRESHOLD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phi Threshold For Reduced Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhiThresholdForReducedVelocityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AstolfiGuidanceController_phiThresholdForReducedVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AstolfiGuidanceController_phiThresholdForReducedVelocity_feature", "_UI_AstolfiGuidanceController_type"),
				 ApogyAddonsMobilityControllersPackage.Literals.ASTOLFI_GUIDANCE_CONTROLLER__PHI_THRESHOLD_FOR_REDUCED_VELOCITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alpha Threshold For Reduced Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlphaThresholdForReducedVelocityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AstolfiGuidanceController_alphaThresholdForReducedVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AstolfiGuidanceController_alphaThresholdForReducedVelocity_feature", "_UI_AstolfiGuidanceController_type"),
				 ApogyAddonsMobilityControllersPackage.Literals.ASTOLFI_GUIDANCE_CONTROLLER__ALPHA_THRESHOLD_FOR_REDUCED_VELOCITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Smooth Path Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSmoothPathEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AstolfiGuidanceController_smoothPathEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AstolfiGuidanceController_smoothPathEnabled_feature", "_UI_AstolfiGuidanceController_type"),
				 ApogyAddonsMobilityControllersPackage.Literals.ASTOLFI_GUIDANCE_CONTROLLER__SMOOTH_PATH_ENABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns AstolfiGuidanceController.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AstolfiGuidanceController"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		AstolfiGuidanceController astolfiGuidanceController = (AstolfiGuidanceController)object;
		return getString("_UI_AstolfiGuidanceController_type") + " " + astolfiGuidanceController.isDestinationReached();
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

		switch (notification.getFeatureID(AstolfiGuidanceController.class)) {
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__RHO:
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__PHI:
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__ALPHA:
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__YAW:
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__NU:
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__OMEGA:
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KRHO:
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KPHI:
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KALPHA:
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__DESTINATION_DISTANCE_THRESHOLD:
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__WAY_POINT_DISTANCE_THRESHOLD:
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KHILL:
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__HILL_THRESHOLD:
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__PHI_THRESHOLD_FOR_REDUCED_VELOCITY:
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__ALPHA_THRESHOLD_FOR_REDUCED_VELOCITY:
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__SMOOTH_PATH_ENABLED:
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
