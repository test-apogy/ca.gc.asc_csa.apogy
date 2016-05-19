package ca.gc.asc_csa.apogy.addons.provider;
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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.addons.SunVector3DTool;
import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.SunVector3DTool} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SunVector3DToolItemProvider
	extends AbstractTwoPoints3DToolItemProvider 
		{
	
	public static final String SQUARE_STRING = 	"\u00b2"; 
	private DecimalFormat sunIntensityFormat = new DecimalFormat("0.0");
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SunVector3DToolItemProvider(AdapterFactory adapterFactory) {
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

			addVectorColorPropertyDescriptor(object);
			addVectorLengthPropertyDescriptor(object);
			addEndPointRadiusPropertyDescriptor(object);
			addSunIntensityPropertyDescriptor(object);
			addCurrentDayMaximumSunIntensityPropertyDescriptor(object);
			addCurrentSunIntensityPercentagePropertyDescriptor(object);
			addSunVector3DToolNodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Vector Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVectorColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SunVector3DTool_vectorColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SunVector3DTool_vectorColor_feature", "_UI_SunVector3DTool_type"),
				 ApogyAddonsPackage.Literals.SUN_VECTOR3_DTOOL__VECTOR_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SUN_VECTOR_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Vector Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVectorLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SunVector3DTool_vectorLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SunVector3DTool_vectorLength_feature", "_UI_SunVector3DTool_type"),
				 ApogyAddonsPackage.Literals.SUN_VECTOR3_DTOOL__VECTOR_LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_SUN_VECTOR_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the End Point Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndPointRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SunVector3DTool_endPointRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SunVector3DTool_endPointRadius_feature", "_UI_SunVector3DTool_type"),
				 ApogyAddonsPackage.Literals.SUN_VECTOR3_DTOOL__END_POINT_RADIUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_SUN_VECTOR_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Sun Intensity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSunIntensityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SunVector3DTool_sunIntensity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SunVector3DTool_sunIntensity_feature", "_UI_SunVector3DTool_type"),
				 ApogyAddonsPackage.Literals.SUN_VECTOR3_DTOOL__SUN_INTENSITY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_SUN_VECTOR_LIGHT_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Day Maximum Sun Intensity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentDayMaximumSunIntensityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SunVector3DTool_currentDayMaximumSunIntensity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SunVector3DTool_currentDayMaximumSunIntensity_feature", "_UI_SunVector3DTool_type"),
				 ApogyAddonsPackage.Literals.SUN_VECTOR3_DTOOL__CURRENT_DAY_MAXIMUM_SUN_INTENSITY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_SUN_VECTOR_LIGHT_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Sun Intensity Percentage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentSunIntensityPercentagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SunVector3DTool_currentSunIntensityPercentage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SunVector3DTool_currentSunIntensityPercentage_feature", "_UI_SunVector3DTool_type"),
				 ApogyAddonsPackage.Literals.SUN_VECTOR3_DTOOL__CURRENT_SUN_INTENSITY_PERCENTAGE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_SUN_VECTOR_LIGHT_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Sun Vector3 DTool Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSunVector3DToolNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SunVector3DTool_sunVector3DToolNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SunVector3DTool_sunVector3DToolNode_feature", "_UI_SunVector3DTool_type"),
				 ApogyAddonsPackage.Literals.SUN_VECTOR3_DTOOL__SUN_VECTOR3_DTOOL_NODE,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_SUN_VECTOR_PROPERTIESPropertyCategory"),
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
			childrenFeatures.add(ApogyAddonsPackage.Literals.SUN_VECTOR3_DTOOL__SUN_VECTOR3_DTOOL_NODE);
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
	 * This returns SunVector3DTool.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SunVector3DTool"));
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
		SunVector3DTool sunVector3DTool = (SunVector3DTool) object;
		String label = null;
				
		if(sunVector3DTool.getName() != null && sunVector3DTool.getName().length() > 0)
		{
			label = sunVector3DTool.getName();
		}
		else
		{
			label = getString("_UI_SunVector3DTool_type");
		}
				
		label += " (";
		String simpleToolText = getSimple3DToolText(sunVector3DTool);
		if(simpleToolText.length() > 0)
		{
			label += simpleToolText + ", ";
		}		
		
		label += sunIntensityFormat.format(sunVector3DTool.getSunIntensity()) + " W/m" + SQUARE_STRING;
		
		// Adds lock Status.
		
		String lockText = new String();
		if(sunVector3DTool.isToNodeLock())
		{
			lockText = "Locked";
		}		
		
		if(lockText.length() > 0)
		{
			label += ", " + lockText;
		}
		
		label += ")";
		
		
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

		switch (notification.getFeatureID(SunVector3DTool.class)) {
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__VECTOR_COLOR:
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__VECTOR_LENGTH:
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__END_POINT_RADIUS:
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__SUN_INTENSITY:
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__CURRENT_DAY_MAXIMUM_SUN_INTENSITY:
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__CURRENT_SUN_INTENSITY_PERCENTAGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__SUN_VECTOR3_DTOOL_NODE:
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
	}

}
