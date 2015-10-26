/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.io.jinput.Symphony__CommonIOJInputFactory;
import org.eclipse.symphony.core.programs.controllers.ControllerValueSource;
import org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersFactory;
import org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.programs.controllers.ControllerValueSource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ControllerValueSourceItemProvider
  extends ValueSourceItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ControllerValueSourceItemProvider(AdapterFactory adapterFactory)
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

			addLastValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Last Value feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addLastValuePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControllerValueSource_lastValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControllerValueSource_lastValue_feature", "_UI_ControllerValueSource_type"),
				 EMFEcoreControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__LAST_VALUE,
				 false,
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
			childrenFeatures.add(EMFEcoreControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER);
			childrenFeatures.add(EMFEcoreControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__CONDITIONING);
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
	 * This returns ControllerValueSource.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ControllerValueSource"));
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
	  ControllerValueSource source = (ControllerValueSource) object;
	  String label = getString("_UI_ControllerValueSource_type");
	  
	  if(source.getLastValue() != null) 
	  {
		  label += " " + source.getLastValue().toString();
	  }
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

		switch (notification.getFeatureID(ControllerValueSource.class)) {
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__COMPONENT:
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__LAST_VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER:
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE__CONDITIONING:
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
				(EMFEcoreControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER,
				 Symphony__CommonIOJInputFactory.eINSTANCE.createEComponentQualifier()));

		newChildDescriptors.add
			(createChildParameter
				(EMFEcoreControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__CONDITIONING,
				 EMFEcoreControllersFactory.eINSTANCE.createLinearInputConditioning()));

		newChildDescriptors.add
			(createChildParameter
				(EMFEcoreControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__CONDITIONING,
				 EMFEcoreControllersFactory.eINSTANCE.createCenteredLinearInputConditioning()));

		newChildDescriptors.add
			(createChildParameter
				(EMFEcoreControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__CONDITIONING,
				 EMFEcoreControllersFactory.eINSTANCE.createParabolicInputConditioning()));

		newChildDescriptors.add
			(createChildParameter
				(EMFEcoreControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__CONDITIONING,
				 EMFEcoreControllersFactory.eINSTANCE.createCenteredParabolicInputConditioning()));

		newChildDescriptors.add
			(createChildParameter
				(EMFEcoreControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__CONDITIONING,
				 EMFEcoreControllersFactory.eINSTANCE.createUserDefinedInputConditioning()));
	}

}
