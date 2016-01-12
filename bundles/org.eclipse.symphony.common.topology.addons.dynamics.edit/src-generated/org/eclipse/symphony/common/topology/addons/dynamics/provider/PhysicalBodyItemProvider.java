/**
 * <copyright>
 * </copyright>
 *
 * $Id: PhysicalBodyItemProvider.java,v 1.14.2.2 2015/02/03 20:01:26 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.addons.dynamics.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage;
import org.eclipse.symphony.common.topology.addons.dynamics.PhysicalBody;
import org.eclipse.symphony.common.topology.addons.dynamics.Symphony__CommonTopologyAddonsDynamicsFactory;
import org.eclipse.symphony.common.topology.addons.dynamics.Symphony__CommonTopologyAddonsDynamicsPackage;
import org.eclipse.symphony.common.topology.provider.AggregateGroupNodeItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.common.topology.addons.dynamics.PhysicalBody} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicalBodyItemProvider
	extends AggregateGroupNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalBodyItemProvider(AdapterFactory adapterFactory) {
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

			addConstraintAttachmentPointsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Constraint Attachment Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstraintAttachmentPointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalBody_constraintAttachmentPoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalBody_constraintAttachmentPoints_feature", "_UI_PhysicalBody_type"),
				 Symphony__CommonTopologyAddonsDynamicsPackage.Literals.PHYSICAL_BODY__CONSTRAINT_ATTACHMENT_POINTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(Symphony__CommonTopologyAddonsDynamicsPackage.Literals.PHYSICAL_BODY__PHYSICAL_PROPERTIES);
			childrenFeatures.add(Symphony__CommonTopologyAddonsDynamicsPackage.Literals.PHYSICAL_BODY__SIMULATION_PROPERTIES);
			childrenFeatures.add(Symphony__CommonTopologyAddonsDynamicsPackage.Literals.PHYSICAL_BODY__CENTER_OF_MASS_KINEMATIC_STATE);
			childrenFeatures.add(Symphony__CommonTopologyAddonsDynamicsPackage.Literals.PHYSICAL_BODY__POINTS_OF_INTEREST);
			childrenFeatures.add(Symphony__CommonTopologyAddonsDynamicsPackage.Literals.PHYSICAL_BODY__COLLISION_GEOMETRY);
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
	 * This returns PhysicalBody.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PhysicalBody"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PhysicalBody)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_PhysicalBody_type") :
			getString("_UI_PhysicalBody_type") + " " + label;
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

		switch (notification.getFeatureID(PhysicalBody.class)) {
			case Symphony__CommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__PHYSICAL_PROPERTIES:
			case Symphony__CommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__SIMULATION_PROPERTIES:
			case Symphony__CommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__CENTER_OF_MASS_KINEMATIC_STATE:
			case Symphony__CommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__POINTS_OF_INTEREST:
			case Symphony__CommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__COLLISION_GEOMETRY:
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
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__CommonTopologyAddonsDynamicsFactory.eINSTANCE.createDynamicSystemProperties()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__CommonTopologyAddonsDynamicsFactory.eINSTANCE.createPhysicalBody()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyAddonsDynamicsPackage.Literals.PHYSICAL_BODY__PHYSICAL_PROPERTIES,
				 Symphony__CommonTopologyAddonsDynamicsFactory.eINSTANCE.createPhysicalProperties()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyAddonsDynamicsPackage.Literals.PHYSICAL_BODY__CENTER_OF_MASS_KINEMATIC_STATE,
				 Symphony__CommonTopologyAddonsDynamicsFactory.eINSTANCE.createKinematicState()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyAddonsDynamicsPackage.Literals.PHYSICAL_BODY__POINTS_OF_INTEREST,
				 Symphony__CommonTopologyAddonsDynamicsFactory.eINSTANCE.createPointOfInterest()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyAddonsDynamicsPackage.Literals.PHYSICAL_BODY__COLLISION_GEOMETRY,
				 Symphony__CommonTopologyAddonsDynamicsFactory.eINSTANCE.createCollisionGeometry()));
	}

}
