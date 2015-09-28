/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.gc.asc_csa.eclipse.emf.ecore.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import ca.gc.asc_csa.symphony.environment.RectangularRegion;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.symphony.environment.RectangularRegion} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RectangularRegionItemProvider
  extends RegionItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RectangularRegionItemProvider(AdapterFactory adapterFactory)
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

			addXMinPropertyDescriptor(object);
			addXMaxPropertyDescriptor(object);
			addYMinPropertyDescriptor(object);
			addYMaxPropertyDescriptor(object);
			addXDimensionPropertyDescriptor(object);
			addYDimensionPropertyDescriptor(object);
			addLowerLeftCornerPropertyDescriptor(object);
			addUpperLeftCornerPropertyDescriptor(object);
			addLowerRightCornerPropertyDescriptor(object);
			addUpperRightCornerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
   * This adds a property descriptor for the XMin feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected void addXMinPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (new AbstractUnitItemPropertyDescriptor(
        ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_RectangularRegion_xMin_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_RectangularRegion_xMin_feature", "_UI_RectangularRegion_type"),
         SymphonyEnvironmentPackage.Literals.RECTANGULAR_REGION__XMIN,
         false,
         false,
         false,
         ItemPropertyDescriptor.REAL_VALUE_IMAGE,
         getString("_UI_EXTENT_COORDINATESPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the XMax feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected void addXMaxPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (new AbstractUnitItemPropertyDescriptor(
        ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_RectangularRegion_xMax_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_RectangularRegion_xMax_feature", "_UI_RectangularRegion_type"),
         SymphonyEnvironmentPackage.Literals.RECTANGULAR_REGION__XMAX,
         false,
         false,
         false,
         ItemPropertyDescriptor.REAL_VALUE_IMAGE,
         getString("_UI_EXTENT_COORDINATESPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the YMin feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected void addYMinPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (new AbstractUnitItemPropertyDescriptor(
        ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_RectangularRegion_yMin_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_RectangularRegion_yMin_feature", "_UI_RectangularRegion_type"),
         SymphonyEnvironmentPackage.Literals.RECTANGULAR_REGION__YMIN,
         false,
         false,
         false,
         ItemPropertyDescriptor.REAL_VALUE_IMAGE,
         getString("_UI_EXTENT_COORDINATESPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the YMax feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected void addYMaxPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (new AbstractUnitItemPropertyDescriptor(
        ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_RectangularRegion_yMax_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_RectangularRegion_yMax_feature", "_UI_RectangularRegion_type"),
         SymphonyEnvironmentPackage.Literals.RECTANGULAR_REGION__YMAX,
         false,
         false,
         false,
         ItemPropertyDescriptor.REAL_VALUE_IMAGE,
         getString("_UI_EXTENT_COORDINATESPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the XDimension feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected void addXDimensionPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (new AbstractUnitItemPropertyDescriptor(
        ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_RectangularRegion_xDimension_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_RectangularRegion_xDimension_feature", "_UI_RectangularRegion_type"),
         SymphonyEnvironmentPackage.Literals.RECTANGULAR_REGION__XDIMENSION,
         false,
         false,
         false,
         ItemPropertyDescriptor.REAL_VALUE_IMAGE,
         getString("_UI_EXTENT_SIZESPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the YDimension feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected void addYDimensionPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (new AbstractUnitItemPropertyDescriptor(
        ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_RectangularRegion_yDimension_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_RectangularRegion_yDimension_feature", "_UI_RectangularRegion_type"),
         SymphonyEnvironmentPackage.Literals.RECTANGULAR_REGION__YDIMENSION,
         false,
         false,
         false,
         ItemPropertyDescriptor.REAL_VALUE_IMAGE,
         getString("_UI_EXTENT_SIZESPropertyCategory"),
         null));
  }

  /**
	 * This adds a property descriptor for the Lower Left Corner feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addLowerLeftCornerPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RectangularRegion_lowerLeftCorner_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectangularRegion_lowerLeftCorner_feature", "_UI_RectangularRegion_type"),
				 SymphonyEnvironmentPackage.Literals.RECTANGULAR_REGION__LOWER_LEFT_CORNER,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Upper Left Corner feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addUpperLeftCornerPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RectangularRegion_upperLeftCorner_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectangularRegion_upperLeftCorner_feature", "_UI_RectangularRegion_type"),
				 SymphonyEnvironmentPackage.Literals.RECTANGULAR_REGION__UPPER_LEFT_CORNER,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Lower Right Corner feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addLowerRightCornerPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RectangularRegion_lowerRightCorner_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectangularRegion_lowerRightCorner_feature", "_UI_RectangularRegion_type"),
				 SymphonyEnvironmentPackage.Literals.RECTANGULAR_REGION__LOWER_RIGHT_CORNER,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Upper Right Corner feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addUpperRightCornerPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RectangularRegion_upperRightCorner_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectangularRegion_upperRightCorner_feature", "_UI_RectangularRegion_type"),
				 SymphonyEnvironmentPackage.Literals.RECTANGULAR_REGION__UPPER_RIGHT_CORNER,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

  /**
	 * This returns RectangularRegion.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RectangularRegion"));
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
    RectangularRegion rectangularRegion = (RectangularRegion)object;
    
    String label = getString("_UI_RectangularRegion_type");
    
    label += " (" + rectangularRegion.getXDimension() + " X " + rectangularRegion.getYDimension() + ")";
    
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

		switch (notification.getFeatureID(RectangularRegion.class)) {
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__XMIN:
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__XMAX:
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__YMIN:
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__YMAX:
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__XDIMENSION:
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__YDIMENSION:
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
