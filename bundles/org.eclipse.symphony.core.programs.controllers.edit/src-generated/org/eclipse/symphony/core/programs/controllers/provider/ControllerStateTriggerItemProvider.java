/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import org.eclipse.symphony.core.programs.controllers.ControllerStateTrigger;
import org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.programs.controllers.ControllerStateTrigger} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ControllerStateTriggerItemProvider
  extends ControllerTriggerItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ControllerStateTriggerItemProvider(AdapterFactory adapterFactory)
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

			addEnablingValuePropertyDescriptor(object);
			addRepeatPeriodPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Enabling Value feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addEnablingValuePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControllerStateTrigger_enablingValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControllerStateTrigger_enablingValue_feature", "_UI_ControllerStateTrigger_type"),
				 EMFEcoreControllersPackage.Literals.CONTROLLER_STATE_TRIGGER__ENABLING_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Repeat Period feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated_NOT
	 */
  protected void addRepeatPeriodPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControllerStateTrigger_repeatPeriod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControllerStateTrigger_repeatPeriod_feature", "_UI_ControllerStateTrigger_type"),
				 EMFEcoreControllersPackage.Literals.CONTROLLER_STATE_TRIGGER__REPEAT_PERIOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This returns ControllerStateTrigger.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ControllerStateTrigger"));
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
	  ControllerStateTrigger trigger =  (ControllerStateTrigger) object;
	  
	  String label = getString("_UI_ControllerStateTrigger_type") + " [";
    
	  if(trigger.isEnablingValue()) label += "true, ";
	  else  label += "false, ";
    
	  label += Long.toString(trigger.getRepeatPeriod()) + " ms]";
    
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

		switch (notification.getFeatureID(ControllerStateTrigger.class)) {
			case EMFEcoreControllersPackage.CONTROLLER_STATE_TRIGGER__ENABLING_VALUE:
			case EMFEcoreControllersPackage.CONTROLLER_STATE_TRIGGER__REPEAT_PERIOD:
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
