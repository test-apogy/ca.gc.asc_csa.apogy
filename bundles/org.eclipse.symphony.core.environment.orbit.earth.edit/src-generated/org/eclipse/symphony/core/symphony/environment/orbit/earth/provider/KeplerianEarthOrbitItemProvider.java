/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.symphony.environment.orbit.earth.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import org.eclipse.symphony.core.environment.orbit.earth.KeplerianEarthOrbit;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.environment.orbit.earth.KeplerianEarthOrbit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KeplerianEarthOrbitItemProvider extends EarthOrbitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeplerianEarthOrbitItemProvider(AdapterFactory adapterFactory) {
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

			addSemiMajorAxisPropertyDescriptor(object);
			addEccentricityPropertyDescriptor(object);
			addInclinationPropertyDescriptor(object);
			addPerigeeArgumentPropertyDescriptor(object);
			addRightAscentionOfAscendingNodePropertyDescriptor(object);
			addMeanAnomalyPropertyDescriptor(object);
			addTrueAnomalyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Semi Major Axis feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addSemiMajorAxisPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KeplerianEarthOrbit_semiMajorAxis_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KeplerianEarthOrbit_semiMajorAxis_feature", "_UI_KeplerianEarthOrbit_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.KEPLERIAN_EARTH_ORBIT__SEMI_MAJOR_AXIS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Eccentricity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addEccentricityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KeplerianEarthOrbit_eccentricity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KeplerianEarthOrbit_eccentricity_feature", "_UI_KeplerianEarthOrbit_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.KEPLERIAN_EARTH_ORBIT__ECCENTRICITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inclination feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addInclinationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KeplerianEarthOrbit_inclination_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KeplerianEarthOrbit_inclination_feature", "_UI_KeplerianEarthOrbit_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.KEPLERIAN_EARTH_ORBIT__INCLINATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Perigee Argument feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addPerigeeArgumentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KeplerianEarthOrbit_perigeeArgument_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KeplerianEarthOrbit_perigeeArgument_feature", "_UI_KeplerianEarthOrbit_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.KEPLERIAN_EARTH_ORBIT__PERIGEE_ARGUMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Right Ascention Of Ascending Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addRightAscentionOfAscendingNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KeplerianEarthOrbit_rightAscentionOfAscendingNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KeplerianEarthOrbit_rightAscentionOfAscendingNode_feature", "_UI_KeplerianEarthOrbit_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.KEPLERIAN_EARTH_ORBIT__RIGHT_ASCENTION_OF_ASCENDING_NODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mean Anomaly feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addMeanAnomalyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KeplerianEarthOrbit_meanAnomaly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KeplerianEarthOrbit_meanAnomaly_feature", "_UI_KeplerianEarthOrbit_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.KEPLERIAN_EARTH_ORBIT__MEAN_ANOMALY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the True Anomaly feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addTrueAnomalyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KeplerianEarthOrbit_trueAnomaly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KeplerianEarthOrbit_trueAnomaly_feature", "_UI_KeplerianEarthOrbit_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.KEPLERIAN_EARTH_ORBIT__TRUE_ANOMALY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns KeplerianEarthOrbit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/KeplerianEarthOrbit"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((KeplerianEarthOrbit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_KeplerianEarthOrbit_type") :
			getString("_UI_KeplerianEarthOrbit_type") + " " + label;
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

		switch (notification.getFeatureID(KeplerianEarthOrbit.class)) {
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__SEMI_MAJOR_AXIS:
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__ECCENTRICITY:
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__INCLINATION:
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__PERIGEE_ARGUMENT:
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__RIGHT_ASCENTION_OF_ASCENDING_NODE:
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__MEAN_ANOMALY:
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__TRUE_ANOMALY:
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
