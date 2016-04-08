package ca.gc.asc_csa.apogy.core.environment.ui.provider;
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


import ca.gc.asc_csa.apogy.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIFactory;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.core.environment.ui.VariableTrajectoryAnnotation;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.core.environment.ui.VariableTrajectoryAnnotation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VariableTrajectoryAnnotationItemProvider
  extends AbstractVariableAnnotationItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariableTrajectoryAnnotationItemProvider(AdapterFactory adapterFactory)
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

			addLatestPositionPropertyDescriptor(object);
			addAzimuthAnglePropertyDescriptor(object);
			addTrajectoryLengthPropertyDescriptor(object);
			addTrajectoryColorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Latest Position feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addLatestPositionPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TrajectoryProvider_latestPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TrajectoryProvider_latestPosition_feature", "_UI_TrajectoryProvider_type"),
				 ApogyCoreEnvironmentUIPackage.Literals.TRAJECTORY_PROVIDER__LATEST_POSITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Azimuth Angle feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addAzimuthAnglePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TrajectoryProvider_azimuthAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TrajectoryProvider_azimuthAngle_feature", "_UI_TrajectoryProvider_type"),
				 ApogyCoreEnvironmentUIPackage.Literals.TRAJECTORY_PROVIDER__AZIMUTH_ANGLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Trajectory Length feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addTrajectoryLengthPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TrajectoryProvider_trajectoryLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TrajectoryProvider_trajectoryLength_feature", "_UI_TrajectoryProvider_type"),
				 ApogyCoreEnvironmentUIPackage.Literals.TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Trajectory Color feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addTrajectoryColorPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TrajectoryProvider_trajectoryColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TrajectoryProvider_trajectoryColor_feature", "_UI_TrajectoryProvider_type"),
				 ApogyCoreEnvironmentUIPackage.Literals.TRAJECTORY_PROVIDER__TRAJECTORY_COLOR,
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
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ApogyCoreEnvironmentUIPackage.Literals.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_PROVIDER);
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
	 * This returns VariableTrajectoryAnnotation.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VariableTrajectoryAnnotation"));
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
	  VariableTrajectoryAnnotation variableTrajectoryAnnotation = (VariableTrajectoryAnnotation)object;
    
	  String label = getString("_UI_VariableTrajectoryAnnotation_type");
	 
	  label += " " + getMapViewItemPresentationText(variableTrajectoryAnnotation);
	  
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

		switch (notification.getFeatureID(VariableTrajectoryAnnotation.class)) {
			case ApogyCoreEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__LATEST_POSITION:
			case ApogyCoreEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__AZIMUTH_ANGLE:
			case ApogyCoreEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_LENGTH:
			case ApogyCoreEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_COLOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ApogyCoreEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_PROVIDER:
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
				(ApogyCoreEnvironmentUIPackage.Literals.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_PROVIDER,
				 ApogyCoreEnvironmentUIFactory.eINSTANCE.createDefaultVariableTrajectoryProvider()));
	}

}
