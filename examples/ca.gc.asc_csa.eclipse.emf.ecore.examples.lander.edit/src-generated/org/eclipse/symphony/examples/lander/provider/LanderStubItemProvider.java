/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lander.provider;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.symphony.examples.lander.LanderStub;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.examples.lander.LanderStub} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LanderStubItemProvider extends LanderItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanderStubItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns LanderStub.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LanderStub"));
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
		// Cast down accordingly
		LanderStub stubLander = (LanderStub) object; 

		// The default label for the lander
		String label = this.getString("_UI_LanderStub_type");

		// If the stub lander isn't null
		if (stubLander != null)
		{
			// If the position is present
			if (stubLander.getPosition() != null)
			{
				// Add the coordinates to the label
				label = label + " (X=" + stubLander.getPosition().getX() +
						", Y=" + stubLander.getPosition().getY() +
						", Z=" + stubLander.getPosition().getZ();

				// If the thruster is also present
				if (stubLander.getThruster() != null)
				{
					// Add the thrust level to the label
					label = label + ", Thrust=" + stubLander.getThruster().getCurrentThrust();
				}

				// Finish off the label
				label = label + ")";
			}
			// Otherwise if the position is not present
			// but the thruster is
			else if (stubLander.getThruster() != null)
			{
				// Add the thrust level to the label
				label = "(Thrust=" + stubLander.getThruster().getCurrentThrust() +")";
			}
		}

		// Return the generated label
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
