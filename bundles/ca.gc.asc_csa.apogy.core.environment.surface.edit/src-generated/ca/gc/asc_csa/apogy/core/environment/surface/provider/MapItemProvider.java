/**
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
package ca.gc.asc_csa.apogy.core.environment.surface.provider;


import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;

import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFactory;

import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.Map;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.core.environment.surface.Map} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MapItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addMapNodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Named_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Named_name_feature", "_UI_Named_type"),
				 ApogyCommonEMFPackage.Literals.NAMED__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Described_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Described_description_feature", "_UI_Described_type"),
				 ApogyCommonEMFPackage.Literals.DESCRIBED__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Map Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMapNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_mapNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_mapNode_feature", "_UI_Map_type"),
				 ApogySurfaceEnvironmentPackage.Literals.MAP__MAP_NODE,
				 false,
				 false,
				 false,
				 null,
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ApogySurfaceEnvironmentPackage.Literals.MAP__TRANSFORMATION);
			childrenFeatures.add(ApogySurfaceEnvironmentPackage.Literals.MAP__LAYERS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Map.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Map"));
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
		  Map map = (Map) object;
		  
		  String label = ((Map)object).getName();
		  if(label == null || label.length() == 0)
		  {
			  label = getString("_UI_Map_type");
		  }
		  else
		  {
			  label =  getString("_UI_Map_type") + " " + label;
		  }
				  
		  if(map.getLayers().size() > 0)
		  {
			  label += " [" + map.getLayers().size() + "]";
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
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Map.class)) {
			case ApogySurfaceEnvironmentPackage.MAP__NAME:
			case ApogySurfaceEnvironmentPackage.MAP__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ApogySurfaceEnvironmentPackage.MAP__TRANSFORMATION:
			case ApogySurfaceEnvironmentPackage.MAP__LAYERS:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentPackage.Literals.MAP__TRANSFORMATION,
				 ApogyCommonMathFactory.eINSTANCE.createMatrix4x4()));

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentPackage.Literals.MAP__LAYERS,
				 ApogySurfaceEnvironmentFactory.eINSTANCE.createImageMapLayer()));

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentPackage.Literals.MAP__LAYERS,
				 ApogySurfaceEnvironmentFactory.eINSTANCE.createURLImageMapLayer()));

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentPackage.Literals.MAP__LAYERS,
				 ApogySurfaceEnvironmentFactory.eINSTANCE.createTopologyTreeMapLayer()));

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentPackage.Literals.MAP__LAYERS,
				 ApogySurfaceEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshMapLayer()));

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentPackage.Literals.MAP__LAYERS,
				 ApogySurfaceEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshSlopeImageMapLayer()));

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentPackage.Literals.MAP__LAYERS,
				 ApogySurfaceEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshDiscreteSlopeImageMapLayer()));

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentPackage.Literals.MAP__LAYERS,
				 ApogySurfaceEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshHeightImageMapLayer()));

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentPackage.Literals.MAP__LAYERS,
				 ApogySurfaceEnvironmentFactory.eINSTANCE.createLineOfSightImageMapLayer()));

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentPackage.Literals.MAP__LAYERS,
				 ApogySurfaceEnvironmentFactory.eINSTANCE.createEllipseShapeImageLayer()));

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentPackage.Literals.MAP__LAYERS,
				 ApogySurfaceEnvironmentFactory.eINSTANCE.createRectangleShapeImageLayer()));

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentPackage.Literals.MAP__LAYERS,
				 ApogySurfaceEnvironmentFactory.eINSTANCE.createCartesianCoordinatesPolygonShapeImageMapLayer()));

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentPackage.Literals.MAP__LAYERS,
				 ApogySurfaceEnvironmentFactory.eINSTANCE.createBasicCartesianTriangularMeshMapLayer()));

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentPackage.Literals.MAP__LAYERS,
				 ApogySurfaceEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshURLMapLayer()));

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentPackage.Literals.MAP__LAYERS,
				 ApogySurfaceEnvironmentFactory.eINSTANCE.createFeaturesOfInterestMapLayer()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
