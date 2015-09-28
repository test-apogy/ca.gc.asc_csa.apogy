/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.earth.ui.provider;


import ca.gc.asc_csa.eclipse.emf.ecore.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import ca.gc.asc_csa.symphony.environment.orbit.earth.ui.OrbitModelWorldWindLayer;
import ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.OrbitModelWorldWindLayer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OrbitModelWorldWindLayerItemProvider extends AbstractWorldWindLayerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrbitModelWorldWindLayerItemProvider(AdapterFactory adapterFactory) {
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
			addTimeIntervalPropertyDescriptor(object);
			addForwardPropagationDurationPropertyDescriptor(object);
			addBackwardPropagationDurationPropertyDescriptor(object);
			addShowGroundTracePropertyDescriptor(object);
			addShowOrbitPropertyDescriptor(object);
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
				 getString("_UI_OrbitModelWorldWindLayer_orbitModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrbitModelWorldWindLayer_orbitModel_feature", "_UI_OrbitModelWorldWindLayer_type"),
				 SymphonyEarthOrbitEnvironmentUIPackage.Literals.ORBIT_MODEL_WORLD_WIND_LAYER__ORBIT_MODEL,
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
				 getString("_UI_OrbitModelWorldWindLayer_timeSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrbitModelWorldWindLayer_timeSource_feature", "_UI_OrbitModelWorldWindLayer_type"),
				 SymphonyEarthOrbitEnvironmentUIPackage.Literals.ORBIT_MODEL_WORLD_WIND_LAYER__TIME_SOURCE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_TIMEPropertyCategory"),
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
				 getString("_UI_OrbitModelWorldWindLayer_timeInterval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrbitModelWorldWindLayer_timeInterval_feature", "_UI_OrbitModelWorldWindLayer_type"),
				 SymphonyEarthOrbitEnvironmentUIPackage.Literals.ORBIT_MODEL_WORLD_WIND_LAYER__TIME_INTERVAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
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
				 getString("_UI_OrbitModelWorldWindLayer_forwardPropagationDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrbitModelWorldWindLayer_forwardPropagationDuration_feature", "_UI_OrbitModelWorldWindLayer_type"),
				 SymphonyEarthOrbitEnvironmentUIPackage.Literals.ORBIT_MODEL_WORLD_WIND_LAYER__FORWARD_PROPAGATION_DURATION,
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
				 getString("_UI_OrbitModelWorldWindLayer_backwardPropagationDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrbitModelWorldWindLayer_backwardPropagationDuration_feature", "_UI_OrbitModelWorldWindLayer_type"),
				 SymphonyEarthOrbitEnvironmentUIPackage.Literals.ORBIT_MODEL_WORLD_WIND_LAYER__BACKWARD_PROPAGATION_DURATION,
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
				 getString("_UI_OrbitModelWorldWindLayer_showGroundTrace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrbitModelWorldWindLayer_showGroundTrace_feature", "_UI_OrbitModelWorldWindLayer_type"),
				 SymphonyEarthOrbitEnvironmentUIPackage.Literals.ORBIT_MODEL_WORLD_WIND_LAYER__SHOW_GROUND_TRACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_VISUALSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Orbit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowOrbitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrbitModelWorldWindLayer_showOrbit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrbitModelWorldWindLayer_showOrbit_feature", "_UI_OrbitModelWorldWindLayer_type"),
				 SymphonyEarthOrbitEnvironmentUIPackage.Literals.ORBIT_MODEL_WORLD_WIND_LAYER__SHOW_ORBIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_VISUALSPropertyCategory"),
				 null));
	}

	/**
	 * This returns OrbitModelWorldWindLayer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OrbitModelWorldWindLayer"));
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
		OrbitModelWorldWindLayer orbitModelWorldWindLayer = (OrbitModelWorldWindLayer)object;
		
		String label = getString("_UI_OrbitModelWorldWindLayer_type") ;
		
		String text = getAbstractWorldWindLayerText(orbitModelWorldWindLayer);
		
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

		switch (notification.getFeatureID(OrbitModelWorldWindLayer.class)) {
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__TIME_INTERVAL:
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__FORWARD_PROPAGATION_DURATION:
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__BACKWARD_PROPAGATION_DURATION:
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__SHOW_GROUND_TRACE:
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__SHOW_ORBIT:
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
