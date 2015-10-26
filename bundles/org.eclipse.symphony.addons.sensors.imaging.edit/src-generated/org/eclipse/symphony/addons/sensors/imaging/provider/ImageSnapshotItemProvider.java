/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.addons.sensors.Symphony__AddonsSensorsFactory;
import org.eclipse.symphony.addons.sensors.fov.Symphony__AddonsSensorsFOVFactory;
import org.eclipse.symphony.addons.sensors.imaging.ImageSnapshot;
import org.eclipse.symphony.addons.sensors.imaging.Symphony__AddonsSensorsImagingFactory;
import org.eclipse.symphony.addons.sensors.imaging.Symphony__AddonsSensorsImagingPackage;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.images.Symphony__CommonImagesFactory;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage;
import org.eclipse.symphony.common.topology.provider.GroupNodeItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.addons.sensors.imaging.ImageSnapshot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageSnapshotItemProvider
  extends GroupNodeItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ImageSnapshotItemProvider(AdapterFactory adapterFactory)
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

			addTimePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Time feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addTimePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Timed_time_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Timed_time_feature", "_UI_Timed_type"),
				 Symphony__CommonEMFPackage.Literals.TIMED__TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Symphony__AddonsSensorsImagingPackage.Literals.IMAGE_SNAPSHOT__FIELD_OF_VIEW);
			childrenFeatures.add(Symphony__AddonsSensorsImagingPackage.Literals.IMAGE_SNAPSHOT__IMAGE);
		}
		return childrenFeatures;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

  /**
	 * This returns ImageSnapshot.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ImageSnapshot"));
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
		String label = ((ImageSnapshot)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_ImageSnapshot_type") :
			getString("_UI_ImageSnapshot_type") + " " + label;
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

		switch (notification.getFeatureID(ImageSnapshot.class)) {
			case Symphony__AddonsSensorsImagingPackage.IMAGE_SNAPSHOT__TIME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Symphony__AddonsSensorsImagingPackage.IMAGE_SNAPSHOT__FIELD_OF_VIEW:
			case Symphony__AddonsSensorsImagingPackage.IMAGE_SNAPSHOT__IMAGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__AddonsSensorsImagingFactory.eINSTANCE.createImageSnapshot()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__AddonsSensorsImagingFactory.eINSTANCE.createRectifiedImageSnapshot()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__AddonsSensorsFactory.eINSTANCE.createSensor()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__AddonsSensorsFOVFactory.eINSTANCE.createFieldOfView()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__AddonsSensorsFOVFactory.eINSTANCE.createRectangularFrustrumFieldOfView()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__AddonsSensorsFOVFactory.eINSTANCE.createConicalFieldOfView()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__AddonsSensorsFOVFactory.eINSTANCE.createCircularSectorFieldOfView()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__AddonsSensorsImagingPackage.Literals.IMAGE_SNAPSHOT__FIELD_OF_VIEW,
				 Symphony__AddonsSensorsFOVFactory.eINSTANCE.createRectangularFrustrumFieldOfView()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__AddonsSensorsImagingPackage.Literals.IMAGE_SNAPSHOT__IMAGE,
				 Symphony__CommonImagesFactory.eINSTANCE.createEImage()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__AddonsSensorsImagingPackage.Literals.IMAGE_SNAPSHOT__IMAGE,
				 Symphony__CommonImagesFactory.eINSTANCE.createURLEImage()));
	}

  /**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
  {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN ||
			childFeature == Symphony__AddonsSensorsImagingPackage.Literals.IMAGE_SNAPSHOT__FIELD_OF_VIEW;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
