/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.images.ImagesCoreFactory;

import ca.gc.asc_csa.eclipse.emf.ecore.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import ca.gc.asc_csa.symphony.environment.ImageMapLayer;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.symphony.environment.ImageMapLayer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageMapLayerItemProvider
  extends AbstractMapLayerItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ImageMapLayerItemProvider(AdapterFactory adapterFactory)
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

			addWidthPropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addOpaquePropertyDescriptor(object);
			addResolutionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated_NOT
	 */
  protected void addWidthPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageMapLayer_width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageMapLayer_width_feature", "_UI_ImageMapLayer_type"),
				 SymphonyEnvironmentPackage.Literals.IMAGE_MAP_LAYER__WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_SIZE_AND_RESOLUTIONPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the Height feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated_NOT
	 */
  protected void addHeightPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageMapLayer_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageMapLayer_height_feature", "_UI_ImageMapLayer_type"),
				 SymphonyEnvironmentPackage.Literals.IMAGE_MAP_LAYER__HEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_SIZE_AND_RESOLUTIONPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the Opaque feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addOpaquePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageMapLayer_opaque_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageMapLayer_opaque_feature", "_UI_ImageMapLayer_type"),
				 SymphonyEnvironmentPackage.Literals.IMAGE_MAP_LAYER__OPAQUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Resolution feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated_NOT
	 */
  protected void addResolutionPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageMapLayer_resolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageMapLayer_resolution_feature", "_UI_ImageMapLayer_type"),
				 SymphonyEnvironmentPackage.Literals.IMAGE_MAP_LAYER__RESOLUTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_SIZE_AND_RESOLUTIONPropertyCategory"),
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
			childrenFeatures.add(SymphonyEnvironmentPackage.Literals.IMAGE_MAP_LAYER__IMAGE);
			childrenFeatures.add(SymphonyEnvironmentPackage.Literals.IMAGE_MAP_LAYER__LEGEND);
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
	 * This returns ImageMapLayer.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ImageMapLayer"));
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
		String label = ((ImageMapLayer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ImageMapLayer_type") :
			getString("_UI_ImageMapLayer_type") + " " + label;
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

		switch (notification.getFeatureID(ImageMapLayer.class)) {
			case SymphonyEnvironmentPackage.IMAGE_MAP_LAYER__WIDTH:
			case SymphonyEnvironmentPackage.IMAGE_MAP_LAYER__HEIGHT:
			case SymphonyEnvironmentPackage.IMAGE_MAP_LAYER__OPAQUE:
			case SymphonyEnvironmentPackage.IMAGE_MAP_LAYER__RESOLUTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SymphonyEnvironmentPackage.IMAGE_MAP_LAYER__IMAGE:
			case SymphonyEnvironmentPackage.IMAGE_MAP_LAYER__LEGEND:
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
				(SymphonyEnvironmentPackage.Literals.IMAGE_MAP_LAYER__IMAGE,
				 ImagesCoreFactory.eINSTANCE.createEImage()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyEnvironmentPackage.Literals.IMAGE_MAP_LAYER__IMAGE,
				 ImagesCoreFactory.eINSTANCE.createURLEImage()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyEnvironmentPackage.Literals.IMAGE_MAP_LAYER__LEGEND,
				 ImagesCoreFactory.eINSTANCE.createEImage()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyEnvironmentPackage.Literals.IMAGE_MAP_LAYER__LEGEND,
				 ImagesCoreFactory.eINSTANCE.createURLEImage()));
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
			childFeature == SymphonyEnvironmentPackage.Literals.IMAGE_MAP_LAYER__IMAGE ||
			childFeature == SymphonyEnvironmentPackage.Literals.IMAGE_MAP_LAYER__LEGEND;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
