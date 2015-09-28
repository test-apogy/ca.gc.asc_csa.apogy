/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.earth.ui.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.gc.asc_csa.eclipse.emf.ecore.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import ca.gc.asc_csa.symphony.environment.orbit.earth.ui.GroundStationWorldWindLayer;
import ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.GroundStationWorldWindLayer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GroundStationWorldWindLayerItemProvider extends EarthSurfaceLocationWorldWindLayerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundStationWorldWindLayerItemProvider(AdapterFactory adapterFactory) {
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

			addGroundStationPropertyDescriptor(object);
			addReferenceAltitudePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ground Station feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroundStationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroundStationWorldWindLayer_groundStation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroundStationWorldWindLayer_groundStation_feature", "_UI_GroundStationWorldWindLayer_type"),
				 SymphonyEarthOrbitEnvironmentUIPackage.Literals.GROUND_STATION_WORLD_WIND_LAYER__GROUND_STATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reference Altitude feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addReferenceAltitudePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroundStationWorldWindLayer_referenceAltitude_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroundStationWorldWindLayer_referenceAltitude_feature", "_UI_GroundStationWorldWindLayer_type"),
				 SymphonyEarthOrbitEnvironmentUIPackage.Literals.GROUND_STATION_WORLD_WIND_LAYER__REFERENCE_ALTITUDE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns GroundStationWorldWindLayer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GroundStationWorldWindLayer"));
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
		GroundStationWorldWindLayer groundStationWorldWindLayer = (GroundStationWorldWindLayer)object;
				
		String label = null;
		if(groundStationWorldWindLayer.getGroundStation() != null && groundStationWorldWindLayer.getGroundStation().getName() != null)
		{
			label = groundStationWorldWindLayer.getGroundStation().getName();
		}
		else
		{
			label = getString("_UI_GroundStationWorldWindLayer_type");
		}
		
		String text = getAbstractWorldWindLayerText(groundStationWorldWindLayer);
		
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

		switch (notification.getFeatureID(GroundStationWorldWindLayer.class)) {
			case SymphonyEarthOrbitEnvironmentUIPackage.GROUND_STATION_WORLD_WIND_LAYER__REFERENCE_ALTITUDE:
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
