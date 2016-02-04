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


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.core.environment.ui.DefaultVariableTrajectoryProvider;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage;
import org.jfree.data.xy.XYDataItem;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.core.environment.ui.DefaultVariableTrajectoryProvider} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DefaultVariableTrajectoryProviderItemProvider
  extends VariableTrajectoryProviderItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DefaultVariableTrajectoryProviderItemProvider(AdapterFactory adapterFactory)
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

			addDistanceThresholdPropertyDescriptor(object);
			addAzimuthThresholdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Distance Threshold feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addDistanceThresholdPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DefaultVariableTrajectoryProvider_distanceThreshold_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DefaultVariableTrajectoryProvider_distanceThreshold_feature", "_UI_DefaultVariableTrajectoryProvider_type"),
				 ApogyCoreEnvironmentUIPackage.Literals.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__DISTANCE_THRESHOLD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_THRESHOLDSPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the Azimuth Threshold feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addAzimuthThresholdPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DefaultVariableTrajectoryProvider_azimuthThreshold_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DefaultVariableTrajectoryProvider_azimuthThreshold_feature", "_UI_DefaultVariableTrajectoryProvider_type"),
				 ApogyCoreEnvironmentUIPackage.Literals.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__AZIMUTH_THRESHOLD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_THRESHOLDSPropertyCategory"),
				 null));
	}

  /**
	 * This returns DefaultVariableTrajectoryProvider.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DefaultVariableTrajectoryProvider"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object)
  {
		XYDataItem labelValue = ((DefaultVariableTrajectoryProvider)object).getLatestPosition();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_DefaultVariableTrajectoryProvider_type") :
			getString("_UI_DefaultVariableTrajectoryProvider_type") + " " + label;
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

		switch (notification.getFeatureID(DefaultVariableTrajectoryProvider.class)) {
			case ApogyCoreEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__DISTANCE_THRESHOLD:
			case ApogyCoreEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__AZIMUTH_THRESHOLD:
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
