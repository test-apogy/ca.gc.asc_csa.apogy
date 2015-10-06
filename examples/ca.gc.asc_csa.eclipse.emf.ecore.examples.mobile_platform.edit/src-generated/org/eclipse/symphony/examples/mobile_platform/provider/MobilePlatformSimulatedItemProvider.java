/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.mobile_platform.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.symphony.examples.mobile_platform.MobilePlatformSimulated;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.examples.mobile_platform.MobilePlatformSimulated} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MobilePlatformSimulatedItemProvider extends MobilePlatformItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilePlatformSimulatedItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns MobilePlatformSimulated.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MobilePlatformSimulated"));
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
		/**
		 * This is the degree symbol, as expressed in unicode
		 */
		final String DEGREE_SYM = "\u00b0";
		
		MobilePlatformSimulated mobilePlatformSimulated = (MobilePlatformSimulated)object;
		
		// Get the basic label
		String label = getString("_UI_MobilePlatformSimulated_type"); 
		
		// If the platform isn't null
		if (mobilePlatformSimulated != null)
		{
			// Add on appropriate values
			label += " (X=" + mobilePlatformSimulated.getPosition().getX() +
					 ", Y=" + mobilePlatformSimulated.getPosition().getY() +
					 ", LinVel=" + mobilePlatformSimulated.getLinearVelocity() +
					 ", AngVel=" + Math.toDegrees(mobilePlatformSimulated.getAngularVelocity()) +
					 "(" + DEGREE_SYM + "/s))";
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
