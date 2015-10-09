/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.symphony.environment.orbit.earth.provider;


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
import org.eclipse.symphony.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage;
import org.eclipse.symphony.core.environment.orbit.earth.TLE;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.environment.orbit.earth.TLE} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TLEItemProvider 
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
	public TLEItemProvider(AdapterFactory adapterFactory) {
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

			addLine1PropertyDescriptor(object);
			addLine2PropertyDescriptor(object);
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
	 * This adds a property descriptor for the Line1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLine1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TLE_line1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TLE_line1_feature", "_UI_TLE_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.TLE__LINE1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_TLE_RAW_DATAPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Line2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLine2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TLE_line2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TLE_line2_feature", "_UI_TLE_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.TLE__LINE2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_TLE_RAW_DATAPropertyCategory"),
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
				 getString("_UI_TLE_ephemerisType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TLE_ephemerisType_feature", "_UI_TLE_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.TLE__EPHEMERIS_TYPE,
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
	 * @generated_NOT
	 */
	protected void addInclinationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TLE_inclination_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TLE_inclination_feature", "_UI_TLE_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.TLE__INCLINATION,
				 false,
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
				 getString("_UI_TLE_meanAnomaly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TLE_meanAnomaly_feature", "_UI_TLE_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.TLE__MEAN_ANOMALY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mean Motion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addMeanMotionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TLE_meanMotion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TLE_meanMotion_feature", "_UI_TLE_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.TLE__MEAN_MOTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Revolution Per Day feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addRevolutionPerDayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TLE_revolutionPerDay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TLE_revolutionPerDay_feature", "_UI_TLE_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.TLE__REVOLUTION_PER_DAY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mean Motion First Derivative feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addMeanMotionFirstDerivativePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TLE_meanMotionFirstDerivative_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TLE_meanMotionFirstDerivative_feature", "_UI_TLE_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.TLE__MEAN_MOTION_FIRST_DERIVATIVE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mean Motion Second Derivative feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addMeanMotionSecondDerivativePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TLE_meanMotionSecondDerivative_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TLE_meanMotionSecondDerivative_feature", "_UI_TLE_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.TLE__MEAN_MOTION_SECOND_DERIVATIVE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Argument Of Perigee feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addArgumentOfPerigeePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TLE_argumentOfPerigee_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TLE_argumentOfPerigee_feature", "_UI_TLE_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.TLE__ARGUMENT_OF_PERIGEE,
				 false,
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
				 getString("_UI_TLE_rightAscentionOfAscendingNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TLE_rightAscentionOfAscendingNode_feature", "_UI_TLE_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.TLE__RIGHT_ASCENTION_OF_ASCENDING_NODE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Revolution Number At Epoch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addRevolutionNumberAtEpochPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TLE_revolutionNumberAtEpoch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TLE_revolutionNumberAtEpoch_feature", "_UI_TLE_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.TLE__REVOLUTION_NUMBER_AT_EPOCH,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Satellite Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addSatelliteNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TLE_satelliteNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TLE_satelliteNumber_feature", "_UI_TLE_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.TLE__SATELLITE_NUMBER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the BStar feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addBStarPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TLE_bStar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TLE_bStar_feature", "_UI_TLE_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.TLE__BSTAR,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
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
				 getString("_UI_TLE_epoch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TLE_epoch_feature", "_UI_TLE_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.TLE__EPOCH,
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
	 * @generated_NOT
	 */
	protected void addEccentricityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TLE_eccentricity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TLE_eccentricity_feature", "_UI_TLE_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.TLE__ECCENTRICITY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
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
				 getString("_UI_TLE_elementNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TLE_elementNumber_feature", "_UI_TLE_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.TLE__ELEMENT_NUMBER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TLE.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TLE"));
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
		TLE tle = (TLE) object;
		String label = getString("_UI_TLE_type");
		
		if(tle.getSatelliteNumber() > 0)
		{
			label += " (" + Integer.toString(tle.getSatelliteNumber()) + ")";
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

		switch (notification.getFeatureID(TLE.class)) {
			case SymphonyEarthOrbitEnvironmentPackage.TLE__LINE1:
			case SymphonyEarthOrbitEnvironmentPackage.TLE__LINE2:
			case SymphonyEarthOrbitEnvironmentPackage.TLE__BSTAR:
			case SymphonyEarthOrbitEnvironmentPackage.TLE__EPOCH:
			case SymphonyEarthOrbitEnvironmentPackage.TLE__ECCENTRICITY:
			case SymphonyEarthOrbitEnvironmentPackage.TLE__ELEMENT_NUMBER:
			case SymphonyEarthOrbitEnvironmentPackage.TLE__EPHEMERIS_TYPE:
			case SymphonyEarthOrbitEnvironmentPackage.TLE__INCLINATION:
			case SymphonyEarthOrbitEnvironmentPackage.TLE__MEAN_ANOMALY:
			case SymphonyEarthOrbitEnvironmentPackage.TLE__MEAN_MOTION:
			case SymphonyEarthOrbitEnvironmentPackage.TLE__REVOLUTION_PER_DAY:
			case SymphonyEarthOrbitEnvironmentPackage.TLE__MEAN_MOTION_FIRST_DERIVATIVE:
			case SymphonyEarthOrbitEnvironmentPackage.TLE__MEAN_MOTION_SECOND_DERIVATIVE:
			case SymphonyEarthOrbitEnvironmentPackage.TLE__ARGUMENT_OF_PERIGEE:
			case SymphonyEarthOrbitEnvironmentPackage.TLE__RIGHT_ASCENTION_OF_ASCENDING_NODE:
			case SymphonyEarthOrbitEnvironmentPackage.TLE__REVOLUTION_NUMBER_AT_EPOCH:
			case SymphonyEarthOrbitEnvironmentPackage.TLE__SATELLITE_NUMBER:
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
