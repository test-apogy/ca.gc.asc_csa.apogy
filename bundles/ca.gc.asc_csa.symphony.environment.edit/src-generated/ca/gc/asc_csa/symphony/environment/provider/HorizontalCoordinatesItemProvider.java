/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.provider;


import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.gc.asc_csa.symphony.environment.HorizontalCoordinates;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.symphony.environment.HorizontalCoordinates} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HorizontalCoordinatesItemProvider
  extends ItemProviderAdapter
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
	private DecimalFormat decimalFormat = new DecimalFormat("0.0");
	public static final String DEGREE_STRING = 	"\u00b0";

	
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HorizontalCoordinatesItemProvider(AdapterFactory adapterFactory)
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

			addAltitudePropertyDescriptor(object);
			addAzimuthPropertyDescriptor(object);
			addRadiusPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
   * This adds a property descriptor for the Altitude feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected void addAltitudePropertyDescriptor(Object object)
  {
		ItemPropertyDescriptor descriptor = new AngleItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_HorizontalCoordinates_altitude_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_HorizontalCoordinates_altitude_feature", "_UI_HorizontalCoordinates_type"),
				SymphonyEnvironmentPackage.Literals.HORIZONTAL_COORDINATES__ALTITUDE,
				true, 
				false,
				false, 
				ItemPropertyDescriptor.REAL_VALUE_IMAGE,  
				null, 
				null);

		itemPropertyDescriptors.add(descriptor);
	  
	  
//    itemPropertyDescriptors.add
//      (createItemPropertyDescriptor
//        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//         getResourceLocator(),
//         getString("_UI_HorizontalCoordinates_altitude_feature"),
//         getString("_UI_PropertyDescriptor_description", "_UI_HorizontalCoordinates_altitude_feature", "_UI_HorizontalCoordinates_type"),
//         SymphonyEnvironmentPackage.Literals.HORIZONTAL_COORDINATES__ALTITUDE,
//         true,
//         false,
//         false,
//         ItemPropertyDescriptor.REAL_VALUE_IMAGE,
//         null,
//         null));
  }

  /**
   * This adds a property descriptor for the Azimuth feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected void addAzimuthPropertyDescriptor(Object object)
  {
		ItemPropertyDescriptor descriptor = new AngleItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_HorizontalCoordinates_azimuth_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_HorizontalCoordinates_azimuth_feature", "_UI_HorizontalCoordinates_type"),
				SymphonyEnvironmentPackage.Literals.HORIZONTAL_COORDINATES__AZIMUTH,
				true, 
				false,
				false, 
				ItemPropertyDescriptor.REAL_VALUE_IMAGE,  
				null, 
				null);

		itemPropertyDescriptors.add(descriptor);
	  
	  
//    itemPropertyDescriptors.add
//      (createItemPropertyDescriptor
//        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//         getResourceLocator(),
//         getString("_UI_HorizontalCoordinates_azimuth_feature"),
//         getString("_UI_PropertyDescriptor_description", "_UI_HorizontalCoordinates_azimuth_feature", "_UI_HorizontalCoordinates_type"),
//         SymphonyEnvironmentPackage.Literals.HORIZONTAL_COORDINATES__AZIMUTH,
//         true,
//         false,
//         false,
//         ItemPropertyDescriptor.REAL_VALUE_IMAGE,
//         null,
//         null));
  }

  /**
	 * This adds a property descriptor for the Radius feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addRadiusPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HorizontalCoordinates_radius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HorizontalCoordinates_radius_feature", "_UI_HorizontalCoordinates_type"),
				 SymphonyEnvironmentPackage.Literals.HORIZONTAL_COORDINATES__RADIUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This returns HorizontalCoordinates.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HorizontalCoordinates"));
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
		HorizontalCoordinates horizontalCoordinates = (HorizontalCoordinates)object;						
		String string = getString("_UI_HorizontalCoordinates_type");
		string += " (" + decimalFormat.format(Math.toDegrees(horizontalCoordinates.getAzimuth())) + DEGREE_STRING + " az, ";
		string += decimalFormat.format(Math.toDegrees(horizontalCoordinates.getAltitude())) + DEGREE_STRING + " el)";
		return string;  }

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

		switch (notification.getFeatureID(HorizontalCoordinates.class)) {
			case SymphonyEnvironmentPackage.HORIZONTAL_COORDINATES__ALTITUDE:
			case SymphonyEnvironmentPackage.HORIZONTAL_COORDINATES__AZIMUTH:
			case SymphonyEnvironmentPackage.HORIZONTAL_COORDINATES__RADIUS:
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

  /**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ResourceLocator getResourceLocator()
  {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
