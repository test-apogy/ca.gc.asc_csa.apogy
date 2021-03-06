package ca.gc.asc_csa.apogy.common.math.provider;
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

import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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

import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.common.math.Matrix4x4} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class Matrix4x4ItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

	public static final String DEGREE_STRING = 	"\u00b0";
	public static final String METERS_STRING = 	"m";
	
	private DecimalFormat positionFormat = new DecimalFormat("0.000");
	private DecimalFormat orientationFormat = new DecimalFormat("0.0");


	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Matrix4x4ItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addM00PropertyDescriptor(object);
			addM01PropertyDescriptor(object);
			addM02PropertyDescriptor(object);
			addM03PropertyDescriptor(object);
			addM10PropertyDescriptor(object);
			addM11PropertyDescriptor(object);
			addM12PropertyDescriptor(object);
			addM13PropertyDescriptor(object);
			addM20PropertyDescriptor(object);
			addM21PropertyDescriptor(object);
			addM22PropertyDescriptor(object);
			addM23PropertyDescriptor(object);
			addM30PropertyDescriptor(object);
			addM31PropertyDescriptor(object);
			addM32PropertyDescriptor(object);
			addM33PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the M00 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM00PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix4x4_m00_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix4x4_m00_feature", "_UI_Matrix4x4_type"),
				 ApogyCommonMathPackage.Literals.MATRIX4X4__M00,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M01 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM01PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix4x4_m01_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix4x4_m01_feature", "_UI_Matrix4x4_type"),
				 ApogyCommonMathPackage.Literals.MATRIX4X4__M01,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M02 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM02PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix4x4_m02_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix4x4_m02_feature", "_UI_Matrix4x4_type"),
				 ApogyCommonMathPackage.Literals.MATRIX4X4__M02,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M03 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM03PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix4x4_m03_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix4x4_m03_feature", "_UI_Matrix4x4_type"),
				 ApogyCommonMathPackage.Literals.MATRIX4X4__M03,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M10 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM10PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix4x4_m10_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix4x4_m10_feature", "_UI_Matrix4x4_type"),
				 ApogyCommonMathPackage.Literals.MATRIX4X4__M10,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M11 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM11PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix4x4_m11_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix4x4_m11_feature", "_UI_Matrix4x4_type"),
				 ApogyCommonMathPackage.Literals.MATRIX4X4__M11,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M12 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM12PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix4x4_m12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix4x4_m12_feature", "_UI_Matrix4x4_type"),
				 ApogyCommonMathPackage.Literals.MATRIX4X4__M12,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M13 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM13PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix4x4_m13_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix4x4_m13_feature", "_UI_Matrix4x4_type"),
				 ApogyCommonMathPackage.Literals.MATRIX4X4__M13,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M20 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM20PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix4x4_m20_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix4x4_m20_feature", "_UI_Matrix4x4_type"),
				 ApogyCommonMathPackage.Literals.MATRIX4X4__M20,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M21 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM21PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix4x4_m21_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix4x4_m21_feature", "_UI_Matrix4x4_type"),
				 ApogyCommonMathPackage.Literals.MATRIX4X4__M21,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M22 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM22PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix4x4_m22_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix4x4_m22_feature", "_UI_Matrix4x4_type"),
				 ApogyCommonMathPackage.Literals.MATRIX4X4__M22,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M23 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM23PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix4x4_m23_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix4x4_m23_feature", "_UI_Matrix4x4_type"),
				 ApogyCommonMathPackage.Literals.MATRIX4X4__M23,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M30 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM30PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix4x4_m30_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix4x4_m30_feature", "_UI_Matrix4x4_type"),
				 ApogyCommonMathPackage.Literals.MATRIX4X4__M30,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M31 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM31PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix4x4_m31_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix4x4_m31_feature", "_UI_Matrix4x4_type"),
				 ApogyCommonMathPackage.Literals.MATRIX4X4__M31,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M32 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM32PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix4x4_m32_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix4x4_m32_feature", "_UI_Matrix4x4_type"),
				 ApogyCommonMathPackage.Literals.MATRIX4X4__M32,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M33 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM33PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix4x4_m33_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix4x4_m33_feature", "_UI_Matrix4x4_type"),
				 ApogyCommonMathPackage.Literals.MATRIX4X4__M33,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Matrix4x4.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Matrix4x4"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public String getText(Object object) 
	{
		Matrix4x4 matrix4x4 = (Matrix4x4) object;		

		Tuple3d position = ApogyCommonMathFacade.INSTANCE.extractPosition(matrix4x4);
		Tuple3d orientation = ApogyCommonMathFacade.INSTANCE.extractOrientation(matrix4x4);
		
		StringBuffer buffer = new StringBuffer();

		buffer.append(getString("_UI_Matrix4x4_type"));
		
		// Position
		buffer.append(" (" + positionFormat.format(position.getX()) + METERS_STRING + ", ");
		buffer.append(positionFormat.format(position.getY()) + METERS_STRING + ", ");
		buffer.append(positionFormat.format(position.getZ()) + METERS_STRING + ")");
		
		
		// Orientation
		buffer.append(" (" + orientationFormat.format(Math.toDegrees(orientation.getX())) + DEGREE_STRING + ", ");
		buffer.append(orientationFormat.format(Math.toDegrees(orientation.getY())) + DEGREE_STRING + ", ");
		buffer.append(orientationFormat.format(Math.toDegrees(orientation.getZ())) + DEGREE_STRING + ")");

		return buffer.toString();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Matrix4x4.class)) {
			case ApogyCommonMathPackage.MATRIX4X4__M00:
			case ApogyCommonMathPackage.MATRIX4X4__M01:
			case ApogyCommonMathPackage.MATRIX4X4__M02:
			case ApogyCommonMathPackage.MATRIX4X4__M03:
			case ApogyCommonMathPackage.MATRIX4X4__M10:
			case ApogyCommonMathPackage.MATRIX4X4__M11:
			case ApogyCommonMathPackage.MATRIX4X4__M12:
			case ApogyCommonMathPackage.MATRIX4X4__M13:
			case ApogyCommonMathPackage.MATRIX4X4__M20:
			case ApogyCommonMathPackage.MATRIX4X4__M21:
			case ApogyCommonMathPackage.MATRIX4X4__M22:
			case ApogyCommonMathPackage.MATRIX4X4__M23:
			case ApogyCommonMathPackage.MATRIX4X4__M30:
			case ApogyCommonMathPackage.MATRIX4X4__M31:
			case ApogyCommonMathPackage.MATRIX4X4__M32:
			case ApogyCommonMathPackage.MATRIX4X4__M33:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
