/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.earth.provider;


import ca.gc.asc_csa.apogy.core.environment.orbit.earth.AbstractTLE;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.AbstractTLE} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractTLEItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTLEItemProvider(AdapterFactory adapterFactory) {
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

			addBStarPropertyDescriptor(object);
			addEpochPropertyDescriptor(object);
			addEccentricityPropertyDescriptor(object);
			addElementNumberPropertyDescriptor(object);
			addEphemerisTypePropertyDescriptor(object);
			addInclinationPropertyDescriptor(object);
			addMeanAnomalyPropertyDescriptor(object);
			addMeanMotionPropertyDescriptor(object);
			addRevolutionPerDayPropertyDescriptor(object);
			addMeanMotionFirstDerivativePropertyDescriptor(object);
			addMeanMotionSecondDerivativePropertyDescriptor(object);
			addArgumentOfPerigeePropertyDescriptor(object);
			addRightAscentionOfAscendingNodePropertyDescriptor(object);
			addRevolutionNumberAtEpochPropertyDescriptor(object);
			addSatelliteNumberPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the BStar feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBStarPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTLE_bStar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTLE_bStar_feature", "_UI_AbstractTLE_type"),
				 ApogyCoreEnvironmentOrbitEarthPackage.Literals.ABSTRACT_TLE__BSTAR,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_TLE_ORBITAL_PARAMETERSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Epoch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEpochPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTLE_epoch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTLE_epoch_feature", "_UI_AbstractTLE_type"),
				 ApogyCoreEnvironmentOrbitEarthPackage.Literals.ABSTRACT_TLE__EPOCH,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Eccentricity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEccentricityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTLE_eccentricity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTLE_eccentricity_feature", "_UI_AbstractTLE_type"),
				 ApogyCoreEnvironmentOrbitEarthPackage.Literals.ABSTRACT_TLE__ECCENTRICITY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_TLE_ORBITAL_PARAMETERSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Element Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTLE_elementNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTLE_elementNumber_feature", "_UI_AbstractTLE_type"),
				 ApogyCoreEnvironmentOrbitEarthPackage.Literals.ABSTRACT_TLE__ELEMENT_NUMBER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ephemeris Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEphemerisTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTLE_ephemerisType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTLE_ephemerisType_feature", "_UI_AbstractTLE_type"),
				 ApogyCoreEnvironmentOrbitEarthPackage.Literals.ABSTRACT_TLE__EPHEMERIS_TYPE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inclination feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInclinationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTLE_inclination_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTLE_inclination_feature", "_UI_AbstractTLE_type"),
				 ApogyCoreEnvironmentOrbitEarthPackage.Literals.ABSTRACT_TLE__INCLINATION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_TLE_ORBITAL_PARAMETERSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Mean Anomaly feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeanAnomalyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTLE_meanAnomaly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTLE_meanAnomaly_feature", "_UI_AbstractTLE_type"),
				 ApogyCoreEnvironmentOrbitEarthPackage.Literals.ABSTRACT_TLE__MEAN_ANOMALY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_TLE_ORBITAL_PARAMETERSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Mean Motion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeanMotionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTLE_meanMotion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTLE_meanMotion_feature", "_UI_AbstractTLE_type"),
				 ApogyCoreEnvironmentOrbitEarthPackage.Literals.ABSTRACT_TLE__MEAN_MOTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_TLE_ORBITAL_PARAMETERSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Revolution Per Day feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRevolutionPerDayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTLE_revolutionPerDay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTLE_revolutionPerDay_feature", "_UI_AbstractTLE_type"),
				 ApogyCoreEnvironmentOrbitEarthPackage.Literals.ABSTRACT_TLE__REVOLUTION_PER_DAY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_TLE_ORBITAL_PARAMETERSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Mean Motion First Derivative feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeanMotionFirstDerivativePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTLE_meanMotionFirstDerivative_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTLE_meanMotionFirstDerivative_feature", "_UI_AbstractTLE_type"),
				 ApogyCoreEnvironmentOrbitEarthPackage.Literals.ABSTRACT_TLE__MEAN_MOTION_FIRST_DERIVATIVE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_TLE_ORBITAL_PARAMETERSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Mean Motion Second Derivative feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeanMotionSecondDerivativePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTLE_meanMotionSecondDerivative_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTLE_meanMotionSecondDerivative_feature", "_UI_AbstractTLE_type"),
				 ApogyCoreEnvironmentOrbitEarthPackage.Literals.ABSTRACT_TLE__MEAN_MOTION_SECOND_DERIVATIVE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_TLE_ORBITAL_PARAMETERSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Argument Of Perigee feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArgumentOfPerigeePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTLE_argumentOfPerigee_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTLE_argumentOfPerigee_feature", "_UI_AbstractTLE_type"),
				 ApogyCoreEnvironmentOrbitEarthPackage.Literals.ABSTRACT_TLE__ARGUMENT_OF_PERIGEE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_TLE_ORBITAL_PARAMETERSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Right Ascention Of Ascending Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRightAscentionOfAscendingNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTLE_rightAscentionOfAscendingNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTLE_rightAscentionOfAscendingNode_feature", "_UI_AbstractTLE_type"),
				 ApogyCoreEnvironmentOrbitEarthPackage.Literals.ABSTRACT_TLE__RIGHT_ASCENTION_OF_ASCENDING_NODE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_TLE_ORBITAL_PARAMETERSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Revolution Number At Epoch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRevolutionNumberAtEpochPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTLE_revolutionNumberAtEpoch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTLE_revolutionNumberAtEpoch_feature", "_UI_AbstractTLE_type"),
				 ApogyCoreEnvironmentOrbitEarthPackage.Literals.ABSTRACT_TLE__REVOLUTION_NUMBER_AT_EPOCH,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_TLE_ORBITAL_PARAMETERSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Satellite Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSatelliteNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTLE_satelliteNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTLE_satelliteNumber_feature", "_UI_AbstractTLE_type"),
				 ApogyCoreEnvironmentOrbitEarthPackage.Literals.ABSTRACT_TLE__SATELLITE_NUMBER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		AbstractTLE abstractTLE = (AbstractTLE)object;
		return getString("_UI_AbstractTLE_type") + " " + abstractTLE.getBStar();
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

		switch (notification.getFeatureID(AbstractTLE.class)) {
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__BSTAR:
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__EPOCH:
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__ECCENTRICITY:
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__ELEMENT_NUMBER:
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__EPHEMERIS_TYPE:
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__INCLINATION:
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_ANOMALY:
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_MOTION:
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__REVOLUTION_PER_DAY:
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_MOTION_FIRST_DERIVATIVE:
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_MOTION_SECOND_DERIVATIVE:
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__ARGUMENT_OF_PERIGEE:
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__RIGHT_ASCENTION_OF_ASCENDING_NODE:
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__REVOLUTION_NUMBER_AT_EPOCH:
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__SATELLITE_NUMBER:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
