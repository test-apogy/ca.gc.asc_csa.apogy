package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.provider;
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
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.EMFFeatureOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraFactory;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.EMFFeatureOverlay} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFFeatureOverlayItemProvider
  extends AbstractTextOverlayItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFFeatureOverlayItemProvider(AdapterFactory adapterFactory)
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

			addNumberFormatPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Number Format feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addNumberFormatPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMFFeatureOverlay_numberFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMFFeatureOverlay_numberFormat_feature", "_UI_EMFFeatureOverlay_type"),
				 ApogyAddonsSensorsImagingCameraPackage.Literals.EMF_FEATURE_OVERLAY__NUMBER_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_FONT_PROPERTIESPropertyCategory"),
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
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ApogyAddonsSensorsImagingCameraPackage.Literals.EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE);
		}
		return childrenFeatures;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

  /**
	 * This returns EMFFeatureOverlay.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EMFFeatureOverlay"));
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
	  return getCameraImageAnnotationText(object, "_UI_EMFFeatureOverlay_type");     
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

		switch (notification.getFeatureID(EMFFeatureOverlay.class)) {
			case ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY__NUMBER_FORMAT:
			case ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE_CHANGE_COUNT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE:
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
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ApogyAddonsSensorsImagingCameraPackage.Literals.EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE,
				 ApogyAddonsSensorsImagingCameraFactory.eINSTANCE.createCameraViewConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyAddonsSensorsImagingCameraPackage.Literals.EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE,
				 ApogyAddonsSensorsImagingCameraFactory.eINSTANCE.createAzimuthFeatureReference()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyAddonsSensorsImagingCameraPackage.Literals.EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE,
				 ApogyAddonsSensorsImagingCameraFactory.eINSTANCE.createElevationFeatureReference()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyAddonsSensorsImagingCameraPackage.Literals.EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE,
				 ApogyCoreInvocatorFactory.eINSTANCE.createVariableFeatureReference()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyAddonsSensorsImagingCameraPackage.Literals.EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE,
				 ApogyCoreInvocatorFactory.eINSTANCE.createOperationCall()));
	}

}
