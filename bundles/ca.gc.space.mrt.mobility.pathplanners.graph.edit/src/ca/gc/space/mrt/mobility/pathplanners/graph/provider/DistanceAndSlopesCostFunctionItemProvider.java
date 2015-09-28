/**
 * Canadian Space Agency 2008.
 *
 * $Id: DistanceAndSlopesCostFunctionItemProvider.java,v 1.2.4.2 2015/05/21 15:51:33 pallard Exp $
 */
package ca.gc.space.mrt.mobility.pathplanners.graph.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.gc.space.mrt.mobility.pathplanners.graph.DistanceAndSlopesCostFunction;
import ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.space.mrt.mobility.pathplanners.graph.DistanceAndSlopesCostFunction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DistanceAndSlopesCostFunctionItemProvider
	extends MeshDisplacementCostFunctionItemProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2008.";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceAndSlopesCostFunctionItemProvider(AdapterFactory adapterFactory) {
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

			addUpSlopeCostFactorPropertyDescriptor(object);
			addDownSlopeCostFactorPropertyDescriptor(object);
			addGravityAxisPropertyDescriptor(object);
			addMaximumUpSlopePropertyDescriptor(object);
			addMaximumDownSlopePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Up Slope Cost Factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpSlopeCostFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistanceAndSlopesCostFunction_upSlopeCostFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistanceAndSlopesCostFunction_upSlopeCostFactor_feature", "_UI_DistanceAndSlopesCostFunction_type"),
				 PathplannersGraphPackage.Literals.DISTANCE_AND_SLOPES_COST_FUNCTION__UP_SLOPE_COST_FACTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Down Slope Cost Factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDownSlopeCostFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistanceAndSlopesCostFunction_downSlopeCostFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistanceAndSlopesCostFunction_downSlopeCostFactor_feature", "_UI_DistanceAndSlopesCostFunction_type"),
				 PathplannersGraphPackage.Literals.DISTANCE_AND_SLOPES_COST_FUNCTION__DOWN_SLOPE_COST_FACTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gravity Axis feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGravityAxisPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistanceAndSlopesCostFunction_gravityAxis_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistanceAndSlopesCostFunction_gravityAxis_feature", "_UI_DistanceAndSlopesCostFunction_type"),
				 PathplannersGraphPackage.Literals.DISTANCE_AND_SLOPES_COST_FUNCTION__GRAVITY_AXIS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Up Slope feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumUpSlopePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistanceAndSlopesCostFunction_maximumUpSlope_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistanceAndSlopesCostFunction_maximumUpSlope_feature", "_UI_DistanceAndSlopesCostFunction_type"),
				 PathplannersGraphPackage.Literals.DISTANCE_AND_SLOPES_COST_FUNCTION__MAXIMUM_UP_SLOPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Down Slope feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumDownSlopePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistanceAndSlopesCostFunction_maximumDownSlope_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistanceAndSlopesCostFunction_maximumDownSlope_feature", "_UI_DistanceAndSlopesCostFunction_type"),
				 PathplannersGraphPackage.Literals.DISTANCE_AND_SLOPES_COST_FUNCTION__MAXIMUM_DOWN_SLOPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DistanceAndSlopesCostFunction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DistanceAndSlopesCostFunction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		DistanceAndSlopesCostFunction distanceAndSlopesCostFunction = (DistanceAndSlopesCostFunction)object;
		return getString("_UI_DistanceAndSlopesCostFunction_type") + " " + distanceAndSlopesCostFunction.getUpSlopeCostFactor();
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

		switch (notification.getFeatureID(DistanceAndSlopesCostFunction.class)) {
			case PathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__UP_SLOPE_COST_FACTOR:
			case PathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__DOWN_SLOPE_COST_FACTOR:
			case PathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__GRAVITY_AXIS:
			case PathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__MAXIMUM_UP_SLOPE:
			case PathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__MAXIMUM_DOWN_SLOPE:
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
