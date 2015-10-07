/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.display.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.core.display.AbstractFeatureDisplay;
import org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayPackage;
import org.eclipse.symphony.core.invocator.provider.AbstractDisplayItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.display.AbstractFeatureDisplay} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractFeatureDisplayItemProvider
  extends AbstractDisplayItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractFeatureDisplayItemProvider(AdapterFactory adapterFactory)
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

			addAbstractFeatureNodePropertyDescriptor(object);
			addMinimumWidthPropertyDescriptor(object);
			addMinimumHeightPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Abstract Feature Node feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addAbstractFeatureNodePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractFeatureDisplay_abstractFeatureNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractFeatureDisplay_abstractFeatureNode_feature", "_UI_AbstractFeatureDisplay_type"),
				 EMFEcoreInvocatorDisplayPackage.Literals.ABSTRACT_FEATURE_DISPLAY__ABSTRACT_FEATURE_NODE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Minimum Width feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addMinimumWidthPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractFeatureDisplay_minimumWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractFeatureDisplay_minimumWidth_feature", "_UI_AbstractFeatureDisplay_type"),
				 EMFEcoreInvocatorDisplayPackage.Literals.ABSTRACT_FEATURE_DISPLAY__MINIMUM_WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Minimum Height feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addMinimumHeightPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractFeatureDisplay_minimumHeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractFeatureDisplay_minimumHeight_feature", "_UI_AbstractFeatureDisplay_type"),
				 EMFEcoreInvocatorDisplayPackage.Literals.ABSTRACT_FEATURE_DISPLAY__MINIMUM_HEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
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
		String label = ((AbstractFeatureDisplay)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractFeatureDisplay_type") :
			getString("_UI_AbstractFeatureDisplay_type") + " " + label;
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

		switch (notification.getFeatureID(AbstractFeatureDisplay.class)) {
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY__ABSTRACT_FEATURE_NODE:
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY__MINIMUM_WIDTH:
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY__MINIMUM_HEIGHT:
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
