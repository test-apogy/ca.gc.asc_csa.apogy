/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage;
import org.eclipse.symphony.core.environment.ui.VehicleVariableAnnotation;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.environment.ui.VehicleVariableAnnotation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VehicleVariableAnnotationItemProvider
  extends PoseVariableAnnotationItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VehicleVariableAnnotationItemProvider(AdapterFactory adapterFactory)
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

			addVehicleLengthPropertyDescriptor(object);
			addVehicleWidthPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Vehicle Length feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addVehicleLengthPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VehicleVariableAnnotation_vehicleLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VehicleVariableAnnotation_vehicleLength_feature", "_UI_VehicleVariableAnnotation_type"),
				 SymphonyEnvironmentUIPackage.Literals.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_VEHICLE_DIMENSIONSPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the Vehicle Width feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addVehicleWidthPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VehicleVariableAnnotation_vehicleWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VehicleVariableAnnotation_vehicleWidth_feature", "_UI_VehicleVariableAnnotation_type"),
				 SymphonyEnvironmentUIPackage.Literals.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_VEHICLE_DIMENSIONSPropertyCategory"),
				 null));
	}

  /**
	 * This returns VehicleVariableAnnotation.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VehicleVariableAnnotation"));
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
    VehicleVariableAnnotation vehicleVariableAnnotation = (VehicleVariableAnnotation)object;    
    String label = getString("_UI_VehicleVariableAnnotation_type");
    label += " " +getMapViewItemPresentationText(vehicleVariableAnnotation);
    
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

		switch (notification.getFeatureID(VehicleVariableAnnotation.class)) {
			case SymphonyEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_LENGTH:
			case SymphonyEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_WIDTH:
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
