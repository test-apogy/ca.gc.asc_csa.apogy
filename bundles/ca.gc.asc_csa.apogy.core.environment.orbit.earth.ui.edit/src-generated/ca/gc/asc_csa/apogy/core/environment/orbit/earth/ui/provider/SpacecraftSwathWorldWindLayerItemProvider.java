/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.ui.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthFactory;
import org.eclipse.symphony.core.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer;
import org.eclipse.symphony.core.environment.orbit.earth.ui.Symphony__CoreEnvironmentOrbitEarthUIPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpacecraftSwathWorldWindLayerItemProvider extends AbstractWorldWindLayerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftSwathWorldWindLayerItemProvider(AdapterFactory adapterFactory) {
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

			addOrbitModelPropertyDescriptor(object);
			addTimeSourcePropertyDescriptor(object);
			addForwardPropagationDurationPropertyDescriptor(object);
			addBackwardPropagationDurationPropertyDescriptor(object);
			addTimeIntervalPropertyDescriptor(object);
			addLeftSwathAnglePropertyDescriptor(object);
			addRightSwathAnglePropertyDescriptor(object);
			addShowGroundTracePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Orbit Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrbitModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpacecraftSwathWorldWindLayer_orbitModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpacecraftSwathWorldWindLayer_orbitModel_feature", "_UI_SpacecraftSwathWorldWindLayer_type"),
				 Symphony__CoreEnvironmentOrbitEarthUIPackage.Literals.SPACECRAFT_SWATH_WORLD_WIND_LAYER__ORBIT_MODEL,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ORBIT_MODELPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpacecraftSwathWorldWindLayer_timeSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpacecraftSwathWorldWindLayer_timeSource_feature", "_UI_SpacecraftSwathWorldWindLayer_type"),
				 Symphony__CoreEnvironmentOrbitEarthUIPackage.Literals.SPACECRAFT_SWATH_WORLD_WIND_LAYER__TIME_SOURCE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_TIMEPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Forward Propagation Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addForwardPropagationDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpacecraftSwathWorldWindLayer_forwardPropagationDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpacecraftSwathWorldWindLayer_forwardPropagationDuration_feature", "_UI_SpacecraftSwathWorldWindLayer_type"),
				 Symphony__CoreEnvironmentOrbitEarthUIPackage.Literals.SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_PROPAGATION_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Backward Propagation Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addBackwardPropagationDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpacecraftSwathWorldWindLayer_backwardPropagationDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpacecraftSwathWorldWindLayer_backwardPropagationDuration_feature", "_UI_SpacecraftSwathWorldWindLayer_type"),
				 Symphony__CoreEnvironmentOrbitEarthUIPackage.Literals.SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_PROPAGATION_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Interval feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addTimeIntervalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpacecraftSwathWorldWindLayer_timeInterval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpacecraftSwathWorldWindLayer_timeInterval_feature", "_UI_SpacecraftSwathWorldWindLayer_type"),
				 Symphony__CoreEnvironmentOrbitEarthUIPackage.Literals.SPACECRAFT_SWATH_WORLD_WIND_LAYER__TIME_INTERVAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Left Swath Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addLeftSwathAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpacecraftSwathWorldWindLayer_leftSwathAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpacecraftSwathWorldWindLayer_leftSwathAngle_feature", "_UI_SpacecraftSwathWorldWindLayer_type"),
				 Symphony__CoreEnvironmentOrbitEarthUIPackage.Literals.SPACECRAFT_SWATH_WORLD_WIND_LAYER__LEFT_SWATH_ANGLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Right Swath Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addRightSwathAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpacecraftSwathWorldWindLayer_rightSwathAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpacecraftSwathWorldWindLayer_rightSwathAngle_feature", "_UI_SpacecraftSwathWorldWindLayer_type"),
				 Symphony__CoreEnvironmentOrbitEarthUIPackage.Literals.SPACECRAFT_SWATH_WORLD_WIND_LAYER__RIGHT_SWATH_ANGLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Ground Trace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowGroundTracePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpacecraftSwathWorldWindLayer_showGroundTrace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpacecraftSwathWorldWindLayer_showGroundTrace_feature", "_UI_SpacecraftSwathWorldWindLayer_type"),
				 Symphony__CoreEnvironmentOrbitEarthUIPackage.Literals.SPACECRAFT_SWATH_WORLD_WIND_LAYER__SHOW_GROUND_TRACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_VISUALSPropertyCategory"),
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
			childrenFeatures.add(Symphony__CoreEnvironmentOrbitEarthUIPackage.Literals.SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_SPACECRAFT_SWATH_CORRIDOR);
			childrenFeatures.add(Symphony__CoreEnvironmentOrbitEarthUIPackage.Literals.SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_SPACECRAFT_SWATH_CORRIDOR);
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
	 * This returns SpacecraftSwathWorldWindLayer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SpacecraftSwathWorldWindLayer"));
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
		SpacecraftSwathWorldWindLayer spacecraftSwathWorldWindLayer = (SpacecraftSwathWorldWindLayer)object;
		
		String label = getString("_UI_SpacecraftSwathWorldWindLayer_type");
		
		String text = getAbstractWorldWindLayerText(spacecraftSwathWorldWindLayer);
		
		if(text != null)
		{
			label += " (" + text + ")";
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

		switch (notification.getFeatureID(SpacecraftSwathWorldWindLayer.class)) {
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_PROPAGATION_DURATION:
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_PROPAGATION_DURATION:
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__TIME_INTERVAL:
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__LEFT_SWATH_ANGLE:
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__RIGHT_SWATH_ANGLE:
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__SHOW_GROUND_TRACE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_SPACECRAFT_SWATH_CORRIDOR:
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_SPACECRAFT_SWATH_CORRIDOR:
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
				(Symphony__CoreEnvironmentOrbitEarthUIPackage.Literals.SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_SPACECRAFT_SWATH_CORRIDOR,
				 Symphony__CoreEnvironmentOrbitEarthFactory.eINSTANCE.createSpacecraftSwathCorridor()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CoreEnvironmentOrbitEarthUIPackage.Literals.SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_SPACECRAFT_SWATH_CORRIDOR,
				 Symphony__CoreEnvironmentOrbitEarthFactory.eINSTANCE.createSpacecraftSwathCorridor()));
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
			childFeature == Symphony__CoreEnvironmentOrbitEarthUIPackage.Literals.SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_SPACECRAFT_SWATH_CORRIDOR ||
			childFeature == Symphony__CoreEnvironmentOrbitEarthUIPackage.Literals.SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_SPACECRAFT_SWATH_CORRIDOR;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
