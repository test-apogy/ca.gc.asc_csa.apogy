package ca.gc.asc_csa.apogy.common.geometry.data25d.provider;
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
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage;
import ca.gc.asc_csa.apogy.common.geometry.data.provider.CoordinatesSetItemProvider;
import ca.gc.asc_csa.apogy.common.geometry.data25d.CoordinatesSet25D;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.common.geometry.data25d.CoordinatesSet25D} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CoordinatesSet25DItemProvider
	extends CoordinatesSetItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinatesSet25DItemProvider(AdapterFactory adapterFactory)
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

			addEnforceUniquenessPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Enforce Uniqueness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnforceUniquenessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoordinatesSet25D_enforceUniqueness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoordinatesSet25D_enforceUniqueness_feature", "_UI_CoordinatesSet25D_type"),
				 ApogyCommonGeometryData25DPackage.Literals.COORDINATES_SET25_D__ENFORCE_UNIQUENESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CoordinatesSet25D.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CoordinatesSet25D"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public String getText(Object object)
	{
		List labelValue = ((CoordinatesSet25D)object).getNormals();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_CoordinatesSet25D_type") :
			getString("_UI_CoordinatesSet25D_type") + " " + label;
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

		switch (notification.getFeatureID(CoordinatesSet25D.class)) {
			case ApogyCommonGeometryData25DPackage.COORDINATES_SET25_D__ENFORCE_UNIQUENESS:
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

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonGeometryDataPackage.Literals.COORDINATES_SET__POINTS,
				 ApogyCommonGeometryData25DFactory.eINSTANCE.createCoordinates25D()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonGeometryDataPackage.Literals.COORDINATES_SET__POINTS,
				 ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianPositionCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonGeometryDataPackage.Literals.COORDINATES_SET__POINTS,
				 ApogyCommonGeometryData3DFactory.eINSTANCE.createColoredCartesianPositionCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonGeometryDataPackage.Literals.COORDINATES_SET__POINTS,
				 ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianOrientationCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonGeometryDataPackage.Literals.COORDINATES_SET__POINTS,
				 ApogyCommonGeometryData3DFactory.eINSTANCE.createSphericalCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonGeometryDataPackage.Literals.COORDINATES_SET__POINTS,
				 ApogyCommonGeometryData3DFactory.eINSTANCE.createPose()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonGeometryDataPackage.Literals.COORDINATES_SET__POINTS,
				 ApogyCommonGeometryData3DFactory.eINSTANCE.createPositionMarker()));
	}

}
