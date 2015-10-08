/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.symphony.core.environment.orbit.SymphonyOrbitEnvironmentPackage;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitPropagator;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentFactory;
import org.eclipse.symphony.core.environment.orbit.provider.AbstractOrbitPropagatorItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitPropagator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EarthOrbitPropagatorItemProvider extends AbstractOrbitPropagatorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthOrbitPropagatorItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EarthOrbitPropagator)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EarthOrbitPropagator_type") :
			getString("_UI_EarthOrbitPropagator_type") + " " + label;
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
				(SymphonyOrbitEnvironmentPackage.Literals.ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME,
				 SymphonyEarthOrbitEnvironmentFactory.eINSTANCE.createOreKitBackedFrame()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyOrbitEnvironmentPackage.Literals.ABSTRACT_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER,
				 SymphonyEarthOrbitEnvironmentFactory.eINSTANCE.createNadirPointingAttitudeProvider()));
	}

}
