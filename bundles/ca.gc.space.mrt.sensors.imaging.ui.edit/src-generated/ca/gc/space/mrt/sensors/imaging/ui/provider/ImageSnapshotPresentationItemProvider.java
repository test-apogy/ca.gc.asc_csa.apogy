/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.space.mrt.sensors.imaging.ui.provider;


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

import ca.gc.space.mrt.sensors.imaging.ui.ImageSnapshotPresentation;
import ca.gc.space.mrt.sensors.imaging.ui.MRTSensorsImagingUIPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.space.mrt.sensors.imaging.ui.ImageSnapshotPresentation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageSnapshotPresentationItemProvider
  extends NodePresentationItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ImageSnapshotPresentationItemProvider(AdapterFactory adapterFactory)
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

			addPresentationModePropertyDescriptor(object);
			addTransparencyPropertyDescriptor(object);
			addImageProjectionVisiblePropertyDescriptor(object);
			addImageProjectionOnFOVVisiblePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Presentation Mode feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addPresentationModePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageSnapshotPresentation_presentationMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageSnapshotPresentation_presentationMode_feature", "_UI_ImageSnapshotPresentation_type"),
				 MRTSensorsImagingUIPackage.Literals.IMAGE_SNAPSHOT_PRESENTATION__PRESENTATION_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Transparency feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addTransparencyPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageSnapshotPresentation_transparency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageSnapshotPresentation_transparency_feature", "_UI_ImageSnapshotPresentation_type"),
				 MRTSensorsImagingUIPackage.Literals.IMAGE_SNAPSHOT_PRESENTATION__TRANSPARENCY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Image Projection Visible feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addImageProjectionVisiblePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageSnapshotPresentation_imageProjectionVisible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageSnapshotPresentation_imageProjectionVisible_feature", "_UI_ImageSnapshotPresentation_type"),
				 MRTSensorsImagingUIPackage.Literals.IMAGE_SNAPSHOT_PRESENTATION__IMAGE_PROJECTION_VISIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Image Projection On FOV Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageProjectionOnFOVVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageSnapshotPresentation_imageProjectionOnFOVVisible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageSnapshotPresentation_imageProjectionOnFOVVisible_feature", "_UI_ImageSnapshotPresentation_type"),
				 MRTSensorsImagingUIPackage.Literals.IMAGE_SNAPSHOT_PRESENTATION__IMAGE_PROJECTION_ON_FOV_VISIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This returns ImageSnapshotPresentation.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ImageSnapshotPresentation"));
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
		RGB labelValue = ((ImageSnapshotPresentation)object).getColor();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_ImageSnapshotPresentation_type") :
			getString("_UI_ImageSnapshotPresentation_type") + " " + label;
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

		switch (notification.getFeatureID(ImageSnapshotPresentation.class)) {
			case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__PRESENTATION_MODE:
			case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__TRANSPARENCY:
			case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__IMAGE_PROJECTION_VISIBLE:
			case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__IMAGE_PROJECTION_ON_FOV_VISIBLE:
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
