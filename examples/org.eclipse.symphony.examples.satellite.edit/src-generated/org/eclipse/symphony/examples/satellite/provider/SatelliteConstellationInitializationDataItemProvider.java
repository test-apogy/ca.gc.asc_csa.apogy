/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.provider;


import ca.gc.asc_csa.symphony.environment.orbit.earth.SymphonyEarthOrbitEnvironmentFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.core.invocator.provider.AbstractInitializationDataItemProvider;
import org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatelliteFactory;
import org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage;
import org.eclipse.symphony.examples.satellite.SatelliteConstellationInitializationData;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.examples.satellite.SatelliteConstellationInitializationData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SatelliteConstellationInitializationDataItemProvider extends AbstractInitializationDataItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatelliteConstellationInitializationDataItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(EMFEcoreExampleSatellitePackage.Literals.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__SATELLITE_DATA);
			childrenFeatures.add(EMFEcoreExampleSatellitePackage.Literals.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__GROUND_STATIONS);
			childrenFeatures.add(EMFEcoreExampleSatellitePackage.Literals.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__PENDING_IMAGE_ORDERS);
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
	 * This returns SatelliteConstellationInitializationData.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SatelliteConstellationInitializationData"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_SatelliteConstellationInitializationData_type");
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

		switch (notification.getFeatureID(SatelliteConstellationInitializationData.class)) {
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__SATELLITE_DATA:
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__GROUND_STATIONS:
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__PENDING_IMAGE_ORDERS:
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
				(EMFEcoreExampleSatellitePackage.Literals.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__SATELLITE_DATA,
				 EMFEcoreExampleSatelliteFactory.eINSTANCE.createSatelliteInitializationData()));

		newChildDescriptors.add
			(createChildParameter
				(EMFEcoreExampleSatellitePackage.Literals.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__GROUND_STATIONS,
				 SymphonyEarthOrbitEnvironmentFactory.eINSTANCE.createGroundStation()));

		newChildDescriptors.add
			(createChildParameter
				(EMFEcoreExampleSatellitePackage.Literals.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__PENDING_IMAGE_ORDERS,
				 EMFEcoreExampleSatelliteFactory.eINSTANCE.createImageOrder()));
	}

}
