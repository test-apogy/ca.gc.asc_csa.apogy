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
import org.eclipse.symphony.core.programs.controllers.ControllerEdgeTrigger;
import org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage;
import org.eclipse.symphony.core.programs.controllers.EdgeType;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.programs.controllers.ControllerEdgeTrigger} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ControllerEdgeTriggerItemProvider
  extends ControllerTriggerItemProvider
{
	public static final String RISING_EDGE_STRING  = "\u2191";
	public static final String FALLING_EDGE_STRING  = "\u2193";
	public static final String BOTH_EDGE_STRING  = "\u2195";
	
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ControllerEdgeTriggerItemProvider(AdapterFactory adapterFactory)
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

			addEdgeTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Edge Type feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addEdgeTypePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControllerEdgeTrigger_edgeType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControllerEdgeTrigger_edgeType_feature", "_UI_ControllerEdgeTrigger_type"),
				 EMFEcoreControllersPackage.Literals.CONTROLLER_EDGE_TRIGGER__EDGE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
   * This returns ControllerEdgeTrigger.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  @Override
  public Object getImage(Object object)
  {
	  ControllerEdgeTrigger trigger = (ControllerEdgeTrigger) object;
	  
	  String imagePath = "";
	  
	  switch (trigger.getEdgeType().getValue()) 
	  {
			case EdgeType.RISING_VALUE:
				imagePath = "full/obj16/Rising";
				break;
			case EdgeType.FALLING_VALUE:
				imagePath = "full/obj16/Falling";
				break;
			case EdgeType.BOTH_VALUE:
				imagePath = "full/obj16/Both";
				break;				
			default:
				imagePath = "full/obj16/Both";
				break;
	  }	  	  
	  
	  return overlayImage(object, getResourceLocator().getImage(imagePath));
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
	  
	  ControllerEdgeTrigger trigger = (ControllerEdgeTrigger) object;
	  
	  String label = getString("_UI_ControllerEdgeTrigger_type");
	  String edge = "";
	  
	  switch (trigger.getEdgeType().getValue()) 
	  {
		case EdgeType.RISING_VALUE:		
			edge = RISING_EDGE_STRING;
			break;
		case EdgeType.FALLING_VALUE:	
			edge = FALLING_EDGE_STRING;
			break;
		case EdgeType.BOTH_VALUE:		
			edge = BOTH_EDGE_STRING;
			break;
	
		default:
			break;
		}
	  
	 	            
      return label + " (" + edge + ")";
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

		switch (notification.getFeatureID(ControllerEdgeTrigger.class)) {
			case EMFEcoreControllersPackage.CONTROLLER_EDGE_TRIGGER__EDGE_TYPE:
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
