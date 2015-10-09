/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.ui.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import org.eclipse.symphony.core.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer;
import org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EarthSurfaceLocationWorldWindLayerItemProvider extends AbstractWorldWindLayerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSurfaceLocationWorldWindLayerItemProvider(AdapterFactory adapterFactory) {
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

			addEarthSurfaceLocationPropertyDescriptor(object);
			addTargetRadiusPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Earth Surface Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEarthSurfaceLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EarthSurfaceLocationWorldWindLayer_earthSurfaceLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EarthSurfaceLocationWorldWindLayer_earthSurfaceLocation_feature", "_UI_EarthSurfaceLocationWorldWindLayer_type"),
				 SymphonyEarthOrbitEnvironmentUIPackage.Literals.EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__EARTH_SURFACE_LOCATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addTargetRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EarthSurfaceLocationWorldWindLayer_targetRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EarthSurfaceLocationWorldWindLayer_targetRadius_feature", "_UI_EarthSurfaceLocationWorldWindLayer_type"),
				 SymphonyEarthOrbitEnvironmentUIPackage.Literals.EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__TARGET_RADIUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns EarthSurfaceLocationWorldWindLayer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EarthSurfaceLocationWorldWindLayer"));
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
		EarthSurfaceLocationWorldWindLayer earthSurfaceLocationWorldWindLayer = (EarthSurfaceLocationWorldWindLayer)object;
	
		String label = null;
		if(earthSurfaceLocationWorldWindLayer.getEarthSurfaceLocation() != null && earthSurfaceLocationWorldWindLayer.getEarthSurfaceLocation().getName() != null)
		{
			label = earthSurfaceLocationWorldWindLayer.getEarthSurfaceLocation().getName();
		}
		else
		{
			label = getString("_UI_EarthSurfaceLocationWorldWindLayer_type");
		}
		
		String text = getAbstractWorldWindLayerText(earthSurfaceLocationWorldWindLayer);
		
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

		switch (notification.getFeatureID(EarthSurfaceLocationWorldWindLayer.class)) {
			case SymphonyEarthOrbitEnvironmentUIPackage.EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__TARGET_RADIUS:
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
