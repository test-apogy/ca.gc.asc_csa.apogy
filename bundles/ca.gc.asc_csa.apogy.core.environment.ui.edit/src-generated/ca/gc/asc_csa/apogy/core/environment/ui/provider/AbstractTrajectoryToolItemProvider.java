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
import org.eclipse.symphony.core.environment.ui.AbstractTrajectoryTool;
import org.eclipse.symphony.core.environment.ui.Symphony__CoreEnvironmentUIPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.environment.ui.AbstractTrajectoryTool} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractTrajectoryToolItemProvider
  extends TrajectoryProviderItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractTrajectoryToolItemProvider(AdapterFactory adapterFactory)
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

			addVisiblePropertyDescriptor(object);
			addActivePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Visible feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addVisiblePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapViewItemPresentation_visible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapViewItemPresentation_visible_feature", "_UI_MapViewItemPresentation_type"),
				 Symphony__CoreEnvironmentUIPackage.Literals.MAP_VIEW_ITEM_PRESENTATION__VISIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Active feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addActivePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapTool_active_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapTool_active_feature", "_UI_MapTool_type"),
				 Symphony__CoreEnvironmentUIPackage.Literals.MAP_TOOL__ACTIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
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
	  AbstractTrajectoryTool abstractTrajectoryTool = (AbstractTrajectoryTool) object;
	  String label = getString("_UI_AbstractTrajectoryTool_type");
	  label += getAbstractTrajectoryToolText(abstractTrajectoryTool);	  
	  return label;
  }

  protected String getAbstractTrajectoryToolText(AbstractTrajectoryTool abstractTrajectoryTool)
  {	 
	  String label = new String();
	  
	  if(abstractTrajectoryTool.isActive() || abstractTrajectoryTool.isVisible())
	  {
		  label += "(";
		  
		  if(abstractTrajectoryTool.isActive())
		  {
			  label += "active, ";
		  }
		  else
		  {
			  label += "not active, ";
		  }
		  
		  if(abstractTrajectoryTool.isVisible())
		  {
			  label += "visible";
		  }
		  else
		  {
			  label += "not visible";
		  }
		  
		  label += ")";
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

		switch (notification.getFeatureID(AbstractTrajectoryTool.class)) {
			case Symphony__CoreEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__VISIBLE:
			case Symphony__CoreEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__ACTIVE:
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
