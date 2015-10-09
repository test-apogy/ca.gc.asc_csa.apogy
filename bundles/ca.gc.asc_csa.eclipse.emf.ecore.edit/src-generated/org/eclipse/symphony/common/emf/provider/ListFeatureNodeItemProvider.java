/**
 */
package org.eclipse.symphony.common.emf.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureNode;
import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcoreFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.asc_csa.eclipse.emf.ecore.ListFeatureNode;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.common.emf.ListFeatureNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ListFeatureNodeItemProvider
  extends AbstractFeatureListNodeItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ListFeatureNodeItemProvider(AdapterFactory adapterFactory)
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

			addStructuralFeaturePropertyDescriptor(object);
			addMultiValuedPropertyDescriptor(object);
			addIndexPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
   * This adds a property descriptor for the Structural Feature feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected void addStructuralFeaturePropertyDescriptor(Object object)
  {    
    itemPropertyDescriptors.add
    (new ItemPropertyDescriptor
      (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
       getResourceLocator(),
       getString("_UI_AbstractFeatureSpecifier_structuralFeature_feature"),
       getString("_UI_PropertyDescriptor_description", "_UI_AbstractFeatureSpecifier_structuralFeature_feature", "_UI_AbstractFeatureSpecifier_type"),
       EMFEcorePackage.Literals.ABSTRACT_FEATURE_SPECIFIER__STRUCTURAL_FEATURE,
       true,
       false,
       true,
       null,
       null,
       null){
			@Override
			protected Collection<?> getComboBoxObjects(Object object) 
			{
				ListFeatureNode listFeatureNode = (ListFeatureNode) object;
				AbstractFeatureNode parent = listFeatureNode.getParent();
				
				List<EStructuralFeature> childFeatures = EMFEcoreFacade.INSTANCE.getChildEStructuralFeatures(parent);
				return childFeatures;
			}
		});
  }

  /**
	 * This adds a property descriptor for the Multi Valued feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addMultiValuedPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractFeatureSpecifier_multiValued_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractFeatureSpecifier_multiValued_feature", "_UI_AbstractFeatureSpecifier_type"),
				 EMFEcorePackage.Literals.ABSTRACT_FEATURE_SPECIFIER__MULTI_VALUED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Index feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addIndexPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractFeatureSpecifier_index_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractFeatureSpecifier_index_feature", "_UI_AbstractFeatureSpecifier_type"),
				 EMFEcorePackage.Literals.ABSTRACT_FEATURE_SPECIFIER__INDEX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This returns ListFeatureNode.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ListFeatureNode"));
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
    ListFeatureNode listFeatureNode = (ListFeatureNode)object;
    
    String label = "";
    
    if(listFeatureNode.getStructuralFeature() != null)
    {
    	label = listFeatureNode.getStructuralFeature().getName();
    }
    else
    {
    	label =  getString("_UI_ListFeatureNode_type");
    }
    
    if(listFeatureNode.isMultiValued())
    {
    	label += " (index = " + listFeatureNode.getIndex() + ")"; 
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

		switch (notification.getFeatureID(ListFeatureNode.class)) {
			case EMFEcorePackage.LIST_FEATURE_NODE__STRUCTURAL_FEATURE:
			case EMFEcorePackage.LIST_FEATURE_NODE__MULTI_VALUED:
			case EMFEcorePackage.LIST_FEATURE_NODE__INDEX:
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
