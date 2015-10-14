/**
 */
package org.eclipse.symphony.common.emf.provider;


import java.util.Collection;
import java.util.List;
import java.util.SortedSet;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.emf.EMFEcoreFacade;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.ListRootNode;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.common.emf.ListRootNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ListRootNodeItemProvider
  extends AbstractFeatureListNodeItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ListRootNodeItemProvider(AdapterFactory adapterFactory)
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

			addSourceClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
   * This adds a property descriptor for the Source Class feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected void addSourceClassPropertyDescriptor(Object object)
  {
	   itemPropertyDescriptors.add
	    (new ItemPropertyDescriptor
	      (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
	       getResourceLocator(),
	       getString("_UI_AbstractRootNode_sourceClass_feature"),
	       getString("_UI_PropertyDescriptor_description", "_UI_AbstractRootNode_sourceClass_feature", "_UI_AbstractRootNode_type"),
	       EMFEcorePackage.Literals.ABSTRACT_ROOT_NODE__SOURCE_CLASS,
	       true,
	       false,
	       true,
	       null,
	       null,
	       null){
				@Override
				protected Collection<?> getComboBoxObjects(Object object) {
					List<EClass> list = EMFEcoreFacade.INSTANCE.getAllAvailableEClasses();
					SortedSet<EClass> classes = EMFEcoreFacade.INSTANCE.sortAlphabetically(list);
					return classes;
				}
			});
  }

  /**
	 * This returns ListRootNode.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ListRootNode"));
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
	  ListRootNode root = (ListRootNode) object;
	  
	  String label = null;
	  
	  if(root.getSourceClass() != null)
	  {
		  label = root.getSourceClass().getInstanceTypeName();
	  }
	  else
	  {
		  label = getString("_UI_ListRootNode_type");
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

		switch (notification.getFeatureID(ListRootNode.class)) {
			case EMFEcorePackage.LIST_ROOT_NODE__SOURCE_CLASS:
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
