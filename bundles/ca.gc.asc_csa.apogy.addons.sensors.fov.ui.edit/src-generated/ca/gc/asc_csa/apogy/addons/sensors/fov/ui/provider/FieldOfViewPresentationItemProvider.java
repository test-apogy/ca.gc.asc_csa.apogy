package ca.gc.asc_csa.apogy.addons.sensors.fov.ui.provider;
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
import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ApogyAddonsSensorsFOVUIPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.provider.NodePresentationItemProvider;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FieldOfViewPresentationItemProvider extends NodePresentationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfViewPresentationItemProvider(AdapterFactory adapterFactory) {
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

			addTransparencyPropertyDescriptor(object);
			addPresentationModePropertyDescriptor(object);
			addShowOutlineOnlyPropertyDescriptor(object);
			addShowProjectionPropertyDescriptor(object);
			addProjectionColorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Transparency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransparencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FieldOfViewPresentation_transparency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FieldOfViewPresentation_transparency_feature", "_UI_FieldOfViewPresentation_type"),
				 ApogyAddonsSensorsFOVUIPackage.Literals.FIELD_OF_VIEW_PRESENTATION__TRANSPARENCY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Presentation Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPresentationModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FieldOfViewPresentation_presentationMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FieldOfViewPresentation_presentationMode_feature", "_UI_FieldOfViewPresentation_type"),
				 ApogyAddonsSensorsFOVUIPackage.Literals.FIELD_OF_VIEW_PRESENTATION__PRESENTATION_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Outline Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowOutlineOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FieldOfViewPresentation_showOutlineOnly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FieldOfViewPresentation_showOutlineOnly_feature", "_UI_FieldOfViewPresentation_type"),
				 ApogyAddonsSensorsFOVUIPackage.Literals.FIELD_OF_VIEW_PRESENTATION__SHOW_OUTLINE_ONLY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Projection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowProjectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FieldOfViewPresentation_showProjection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FieldOfViewPresentation_showProjection_feature", "_UI_FieldOfViewPresentation_type"),
				 ApogyAddonsSensorsFOVUIPackage.Literals.FIELD_OF_VIEW_PRESENTATION__SHOW_PROJECTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Projection Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectionColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FieldOfViewPresentation_projectionColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FieldOfViewPresentation_projectionColor_feature", "_UI_FieldOfViewPresentation_type"),
				 ApogyAddonsSensorsFOVUIPackage.Literals.FIELD_OF_VIEW_PRESENTATION__PROJECTION_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns FieldOfViewPresentation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FieldOfViewPresentation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		RGB labelValue = ((FieldOfViewPresentation)object).getColor();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_FieldOfViewPresentation_type") :
			getString("_UI_FieldOfViewPresentation_type") + " " + label;
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

		switch (notification.getFeatureID(FieldOfViewPresentation.class)) {
			case ApogyAddonsSensorsFOVUIPackage.FIELD_OF_VIEW_PRESENTATION__TRANSPARENCY:
			case ApogyAddonsSensorsFOVUIPackage.FIELD_OF_VIEW_PRESENTATION__PRESENTATION_MODE:
			case ApogyAddonsSensorsFOVUIPackage.FIELD_OF_VIEW_PRESENTATION__SHOW_OUTLINE_ONLY:
			case ApogyAddonsSensorsFOVUIPackage.FIELD_OF_VIEW_PRESENTATION__SHOW_PROJECTION:
			case ApogyAddonsSensorsFOVUIPackage.FIELD_OF_VIEW_PRESENTATION__PROJECTION_COLOR:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
