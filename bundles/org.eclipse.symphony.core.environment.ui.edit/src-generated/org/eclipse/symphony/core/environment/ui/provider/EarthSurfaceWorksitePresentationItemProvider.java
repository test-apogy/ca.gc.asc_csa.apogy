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
import org.eclipse.swt.graphics.RGB;
import org.eclipse.symphony.common.topology.ui.provider.NodePresentationItemProvider;
import org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation;
import org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage;

import ca.gc.asc_csa.eclipse.emf.ecore.ui.descriptors.AbstractUnitItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EarthSurfaceWorksitePresentationItemProvider
  extends NodePresentationItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EarthSurfaceWorksitePresentationItemProvider(AdapterFactory adapterFactory)
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

			addAxisVisiblePropertyDescriptor(object);
			addAxisLengthPropertyDescriptor(object);
			addAzimuthVisiblePropertyDescriptor(object);
			addElevationLinesVisiblePropertyDescriptor(object);
			addAzimuthLinesVisiblePropertyDescriptor(object);
			addPlaneVisiblePropertyDescriptor(object);
			addPlaneGridSizePropertyDescriptor(object);
			addPlaneSizePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Axis Visible feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addAxisVisiblePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EarthSurfaceWorksitePresentation_axisVisible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EarthSurfaceWorksitePresentation_axisVisible_feature", "_UI_EarthSurfaceWorksitePresentation_type"),
				 SymphonyEnvironmentUIPackage.Literals.EARTH_SURFACE_WORKSITE_PRESENTATION__AXIS_VISIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_AXISPropertyCategory"),
				 null));
	}

  /**
   * This adds a property descriptor for the Axis Length feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected void addAxisLengthPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (new AbstractUnitItemPropertyDescriptor(
        ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EarthSurfaceWorksitePresentation_axisLength_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EarthSurfaceWorksitePresentation_axisLength_feature", "_UI_EarthSurfaceWorksitePresentation_type"),
         SymphonyEnvironmentUIPackage.Literals.EARTH_SURFACE_WORKSITE_PRESENTATION__AXIS_LENGTH,
         true,
         false,
         false,
         ItemPropertyDescriptor.REAL_VALUE_IMAGE,
         getString("_UI_AXISPropertyCategory"),
         null));
  }

  /**
	 * This adds a property descriptor for the Azimuth Visible feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addAzimuthVisiblePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EarthSurfaceWorksitePresentation_azimuthVisible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EarthSurfaceWorksitePresentation_azimuthVisible_feature", "_UI_EarthSurfaceWorksitePresentation_type"),
				 SymphonyEnvironmentUIPackage.Literals.EARTH_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_VISIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_SKYPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the Elevation Lines Visible feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addElevationLinesVisiblePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EarthSurfaceWorksitePresentation_elevationLinesVisible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EarthSurfaceWorksitePresentation_elevationLinesVisible_feature", "_UI_EarthSurfaceWorksitePresentation_type"),
				 SymphonyEnvironmentUIPackage.Literals.EARTH_SURFACE_WORKSITE_PRESENTATION__ELEVATION_LINES_VISIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_SKYPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the Azimuth Lines Visible feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addAzimuthLinesVisiblePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EarthSurfaceWorksitePresentation_azimuthLinesVisible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EarthSurfaceWorksitePresentation_azimuthLinesVisible_feature", "_UI_EarthSurfaceWorksitePresentation_type"),
				 SymphonyEnvironmentUIPackage.Literals.EARTH_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_LINES_VISIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_SKYPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the Plane Visible feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addPlaneVisiblePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EarthSurfaceWorksitePresentation_planeVisible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EarthSurfaceWorksitePresentation_planeVisible_feature", "_UI_EarthSurfaceWorksitePresentation_type"),
				 SymphonyEnvironmentUIPackage.Literals.EARTH_SURFACE_WORKSITE_PRESENTATION__PLANE_VISIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_PLANEPropertyCategory"),
				 null));
	}

  /**
   * This adds a property descriptor for the Plane Grid Size feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected void addPlaneGridSizePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (new AbstractUnitItemPropertyDescriptor(
        ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EarthSurfaceWorksitePresentation_planeGridSize_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EarthSurfaceWorksitePresentation_planeGridSize_feature", "_UI_EarthSurfaceWorksitePresentation_type"),
         SymphonyEnvironmentUIPackage.Literals.EARTH_SURFACE_WORKSITE_PRESENTATION__PLANE_GRID_SIZE,
         true,
         false,
         false,
         ItemPropertyDescriptor.REAL_VALUE_IMAGE,
         getString("_UI_PLANEPropertyCategory"),
         null));
  }

  /**
   * This adds a property descriptor for the Plane Size feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected void addPlaneSizePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (new AbstractUnitItemPropertyDescriptor(
        ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EarthSurfaceWorksitePresentation_planeSize_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EarthSurfaceWorksitePresentation_planeSize_feature", "_UI_EarthSurfaceWorksitePresentation_type"),
         SymphonyEnvironmentUIPackage.Literals.EARTH_SURFACE_WORKSITE_PRESENTATION__PLANE_SIZE,
         true,
         false,
         false,
         ItemPropertyDescriptor.REAL_VALUE_IMAGE,
         getString("_UI_PLANEPropertyCategory"),
         null));
  }

  /**
	 * This returns EarthSurfaceWorksitePresentation.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EarthSurfaceWorksitePresentation"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object)
  {
		RGB labelValue = ((EarthSurfaceWorksitePresentation)object).getColor();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_EarthSurfaceWorksitePresentation_type") :
			getString("_UI_EarthSurfaceWorksitePresentation_type") + " " + label;
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

		switch (notification.getFeatureID(EarthSurfaceWorksitePresentation.class)) {
			case SymphonyEnvironmentUIPackage.EARTH_SURFACE_WORKSITE_PRESENTATION__AXIS_VISIBLE:
			case SymphonyEnvironmentUIPackage.EARTH_SURFACE_WORKSITE_PRESENTATION__AXIS_LENGTH:
			case SymphonyEnvironmentUIPackage.EARTH_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_VISIBLE:
			case SymphonyEnvironmentUIPackage.EARTH_SURFACE_WORKSITE_PRESENTATION__ELEVATION_LINES_VISIBLE:
			case SymphonyEnvironmentUIPackage.EARTH_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_LINES_VISIBLE:
			case SymphonyEnvironmentUIPackage.EARTH_SURFACE_WORKSITE_PRESENTATION__PLANE_VISIBLE:
			case SymphonyEnvironmentUIPackage.EARTH_SURFACE_WORKSITE_PRESENTATION__PLANE_GRID_SIZE:
			case SymphonyEnvironmentUIPackage.EARTH_SURFACE_WORKSITE_PRESENTATION__PLANE_SIZE:
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
