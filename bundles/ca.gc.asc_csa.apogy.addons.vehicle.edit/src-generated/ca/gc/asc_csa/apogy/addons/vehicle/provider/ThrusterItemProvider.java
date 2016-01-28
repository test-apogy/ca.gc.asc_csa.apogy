/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle.provider;


import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage;
import org.eclipse.symphony.addons.vehicle.Thruster;
import org.eclipse.symphony.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import org.eclipse.symphony.common.topology.provider.NodeItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.addons.vehicle.Thruster} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ThrusterItemProvider
  extends NodeItemProvider
{
	
  private DecimalFormat thrustLevelFormat = new DecimalFormat("0.00");
	
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ThrusterItemProvider(AdapterFactory adapterFactory)
  {
		super(adapterFactory);
	}

  /**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addMinimumThrustPropertyDescriptor(object);
			addMaximumThrustPropertyDescriptor(object);
			addCurrentThrustPropertyDescriptor(object);
			addThrustLevelPropertyDescriptor(object);
			addPlumeAnglePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Minimum Thrust feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addMinimumThrustPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Thruster_minimumThrust_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Thruster_minimumThrust_feature", "_UI_Thruster_type"),
				 Symphony__AddonsVehiclePackage.Literals.THRUSTER__MINIMUM_THRUST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_THRUST_INFOPropertyCategory"),
				 null));
	}

		/**
	 * This adds a property descriptor for the Maximum Thrust feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addMaximumThrustPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Thruster_maximumThrust_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Thruster_maximumThrust_feature", "_UI_Thruster_type"),
				 Symphony__AddonsVehiclePackage.Literals.THRUSTER__MAXIMUM_THRUST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_THRUST_INFOPropertyCategory"),
				 null));
	}

		/**
	 * This adds a property descriptor for the Current Thrust feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addCurrentThrustPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Thruster_currentThrust_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Thruster_currentThrust_feature", "_UI_Thruster_type"),
				 Symphony__AddonsVehiclePackage.Literals.THRUSTER__CURRENT_THRUST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_THRUST_INFOPropertyCategory"),
				 null));
	}

		/**
	 * This adds a property descriptor for the Plume Angle feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated_NOT
	 */
  protected void addPlumeAnglePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Thruster_plumeAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Thruster_plumeAngle_feature", "_UI_Thruster_type"),
				 Symphony__AddonsVehiclePackage.Literals.THRUSTER__PLUME_ANGLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Thrust Level feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addThrustLevelPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Thruster_thrustLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Thruster_thrustLevel_feature", "_UI_Thruster_type"),
				 Symphony__AddonsVehiclePackage.Literals.THRUSTER__THRUST_LEVEL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_THRUST_INFOPropertyCategory"),
				 null));
	}

  /**
	 * This returns Thruster.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Thruster"));
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
	  Thruster thruster = (Thruster) object;
	  
	  String label = getString("_UI_Thruster_type");
	
	  label += " (Thrust Level : ";
	  	  
	  label += thrustLevelFormat.format(thruster.getThrustLevel());
	  label += ")";
	  
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
  public void notifyChanged(Notification notification)
  {
		updateChildren(notification);

		switch (notification.getFeatureID(Thruster.class)) {
			case Symphony__AddonsVehiclePackage.THRUSTER__MINIMUM_THRUST:
			case Symphony__AddonsVehiclePackage.THRUSTER__MAXIMUM_THRUST:
			case Symphony__AddonsVehiclePackage.THRUSTER__CURRENT_THRUST:
			case Symphony__AddonsVehiclePackage.THRUSTER__THRUST_LEVEL:
			case Symphony__AddonsVehiclePackage.THRUSTER__PLUME_ANGLE:
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
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
