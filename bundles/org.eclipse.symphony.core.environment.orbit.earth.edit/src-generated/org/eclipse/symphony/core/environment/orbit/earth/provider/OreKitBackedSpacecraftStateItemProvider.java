/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.provider;


import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.core.environment.orbit.SymphonyOrbitEnvironmentPackage;
import org.eclipse.symphony.core.environment.orbit.earth.OreKitBackedSpacecraftState;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentFactory;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage;
import org.eclipse.symphony.core.environment.orbit.provider.SpacecraftStateItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.environment.orbit.earth.OreKitBackedSpacecraftState} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OreKitBackedSpacecraftStateItemProvider extends SpacecraftStateItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OreKitBackedSpacecraftStateItemProvider(AdapterFactory adapterFactory) {
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

			addOreKitSpacecraftStatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ore Kit Spacecraft State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOreKitSpacecraftStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OreKitBackedSpacecraftState_oreKitSpacecraftState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OreKitBackedSpacecraftState_oreKitSpacecraftState_feature", "_UI_OreKitBackedSpacecraftState_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.ORE_KIT_BACKED_SPACECRAFT_STATE__ORE_KIT_SPACECRAFT_STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns OreKitBackedSpacecraftState.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OreKitBackedSpacecraftState"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Date labelValue = ((OreKitBackedSpacecraftState)object).getTime();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_OreKitBackedSpacecraftState_type") :
			getString("_UI_OreKitBackedSpacecraftState_type") + " " + label;
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

		switch (notification.getFeatureID(OreKitBackedSpacecraftState.class)) {
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_BACKED_SPACECRAFT_STATE__ORE_KIT_SPACECRAFT_STATE:
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

		newChildDescriptors.add
			(createChildParameter
				(SymphonyOrbitEnvironmentPackage.Literals.SPACECRAFT_STATE__ORBIT,
				 SymphonyEarthOrbitEnvironmentFactory.eINSTANCE.createKeplerianEarthOrbit()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyOrbitEnvironmentPackage.Literals.SPACECRAFT_STATE__ORBIT,
				 SymphonyEarthOrbitEnvironmentFactory.eINSTANCE.createCartesianEarthOrbit()));
	}

}
