package ca.gc.asc_csa.apogy.common.emf.provider;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.TreeFeatureNode;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.common.emf.TreeFeatureNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TreeFeatureNodeItemProvider
  extends AbstractFeatureTreeNodeItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TreeFeatureNodeItemProvider(AdapterFactory adapterFactory)
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
       ApogyCommonEMFPackage.Literals.ABSTRACT_FEATURE_SPECIFIER__STRUCTURAL_FEATURE,
       true,
       false,
       true,
       null,
       null,
       null){
			@Override
			protected Collection<?> getComboBoxObjects(Object object) 
			{
				TreeFeatureNode featureNode = (TreeFeatureNode) object;
				AbstractFeatureNode parent = featureNode.getParent();
				
				List<EStructuralFeature> childFeatures = ApogyCommonEMFFacade.INSTANCE.getChildEStructuralFeatures(parent);
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
				 ApogyCommonEMFPackage.Literals.ABSTRACT_FEATURE_SPECIFIER__MULTI_VALUED,
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
				 ApogyCommonEMFPackage.Literals.ABSTRACT_FEATURE_SPECIFIER__INDEX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This returns TreeFeatureNode.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TreeFeatureNode"));
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
    TreeFeatureNode treeFeatureNode = (TreeFeatureNode)object;
    
    String label = "";
    
    if(treeFeatureNode.getStructuralFeature() != null)
    {
    	label = treeFeatureNode.getStructuralFeature().getName();
    }
    else
    {
    	label = getString("_UI_TreeFeatureNode_type");
    }
    
	if(treeFeatureNode.getChildren() != null && treeFeatureNode.getChildren().size() > 0)
	{
		  label += " [" + treeFeatureNode.getChildren().size() + "]";
	}
    
    if(treeFeatureNode.isMultiValued())
    {
    	label += " ( index = " + treeFeatureNode.getIndex() + ")"; 
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

		switch (notification.getFeatureID(TreeFeatureNode.class)) {
			case ApogyCommonEMFPackage.TREE_FEATURE_NODE__STRUCTURAL_FEATURE:
			case ApogyCommonEMFPackage.TREE_FEATURE_NODE__MULTI_VALUED:
			case ApogyCommonEMFPackage.TREE_FEATURE_NODE__INDEX:
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
