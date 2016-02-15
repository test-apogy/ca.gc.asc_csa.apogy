package ca.gc.asc_csa.apogy.core.environment.orbit.earth.provider;
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
import java.util.Date;
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
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFactory;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.CorridorPoint;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.CorridorPoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CorridorPointItemProvider 
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
	public CorridorPointItemProvider(AdapterFactory adapterFactory) {
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

			addTimePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Timed_time_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Timed_time_feature", "_UI_Timed_type"),
				 ApogyCommonEMFPackage.Literals.TIMED__TIME,
				 true,
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ApogyCoreEnvironmentOrbitEarthPackage.Literals.CORRIDOR_POINT__LEFT);
			childrenFeatures.add(ApogyCoreEnvironmentOrbitEarthPackage.Literals.CORRIDOR_POINT__CENTER);
			childrenFeatures.add(ApogyCoreEnvironmentOrbitEarthPackage.Literals.CORRIDOR_POINT__RIGHT);
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
	 * This returns CorridorPoint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CorridorPoint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Date labelValue = ((CorridorPoint)object).getTime();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_CorridorPoint_type") :
			getString("_UI_CorridorPoint_type") + " " + label;
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

		switch (notification.getFeatureID(CorridorPoint.class)) {
			case ApogyCoreEnvironmentOrbitEarthPackage.CORRIDOR_POINT__TIME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.CORRIDOR_POINT__LEFT:
			case ApogyCoreEnvironmentOrbitEarthPackage.CORRIDOR_POINT__CENTER:
			case ApogyCoreEnvironmentOrbitEarthPackage.CORRIDOR_POINT__RIGHT:
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
				(ApogyCoreEnvironmentOrbitEarthPackage.Literals.CORRIDOR_POINT__LEFT,
				 ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createEarthSurfaceLocation()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCoreEnvironmentOrbitEarthPackage.Literals.CORRIDOR_POINT__LEFT,
				 ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createGroundStation()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCoreEnvironmentOrbitEarthPackage.Literals.CORRIDOR_POINT__LEFT,
				 ApogyCoreEnvironmentFactory.eINSTANCE.createGeographicCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCoreEnvironmentOrbitEarthPackage.Literals.CORRIDOR_POINT__CENTER,
				 ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createEarthSurfaceLocation()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCoreEnvironmentOrbitEarthPackage.Literals.CORRIDOR_POINT__CENTER,
				 ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createGroundStation()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCoreEnvironmentOrbitEarthPackage.Literals.CORRIDOR_POINT__CENTER,
				 ApogyCoreEnvironmentFactory.eINSTANCE.createGeographicCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCoreEnvironmentOrbitEarthPackage.Literals.CORRIDOR_POINT__RIGHT,
				 ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createEarthSurfaceLocation()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCoreEnvironmentOrbitEarthPackage.Literals.CORRIDOR_POINT__RIGHT,
				 ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createGroundStation()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCoreEnvironmentOrbitEarthPackage.Literals.CORRIDOR_POINT__RIGHT,
				 ApogyCoreEnvironmentFactory.eINSTANCE.createGeographicCoordinates()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ApogyCoreEnvironmentOrbitEarthPackage.Literals.CORRIDOR_POINT__LEFT ||
			childFeature == ApogyCoreEnvironmentOrbitEarthPackage.Literals.CORRIDOR_POINT__CENTER ||
			childFeature == ApogyCoreEnvironmentOrbitEarthPackage.Literals.CORRIDOR_POINT__RIGHT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
