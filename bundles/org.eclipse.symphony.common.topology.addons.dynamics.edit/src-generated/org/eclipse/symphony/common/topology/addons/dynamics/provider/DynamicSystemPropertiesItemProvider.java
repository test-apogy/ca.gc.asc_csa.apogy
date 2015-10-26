/**
 * <copyright>
 * </copyright>
 *
 * $Id: DynamicSystemPropertiesItemProvider.java,v 1.10.2.2 2015/02/03 20:01:27 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.addons.dynamics.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage;
import org.eclipse.symphony.common.topology.addons.dynamics.DynamicSystemProperties;
import org.eclipse.symphony.common.topology.addons.dynamics.Symphony__CommonTopologyDynamicsFactory;
import org.eclipse.symphony.common.topology.addons.dynamics.Symphony__CommonTopologyDynamicsPackage;
import org.eclipse.symphony.common.topology.provider.AggregateGroupNodeItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.common.topology.addons.dynamics.DynamicSystemProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamicSystemPropertiesItemProvider
	extends AggregateGroupNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicSystemPropertiesItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Symphony__CommonTopologyDynamicsPackage.Literals.DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS);
			childrenFeatures.add(Symphony__CommonTopologyDynamicsPackage.Literals.DYNAMIC_SYSTEM_PROPERTIES__MATERIALS);
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
	 * This returns DynamicSystemProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DynamicSystemProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DynamicSystemProperties)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_DynamicSystemProperties_type") :
			getString("_UI_DynamicSystemProperties_type") + " " + label;
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

		switch (notification.getFeatureID(DynamicSystemProperties.class)) {
			case Symphony__CommonTopologyDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS:
			case Symphony__CommonTopologyDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES__MATERIALS:
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
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__CommonTopologyDynamicsFactory.eINSTANCE.createDynamicSystemProperties()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__CommonTopologyDynamicsFactory.eINSTANCE.createPhysicalBody()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__CommonTopologyDynamicsFactory.eINSTANCE.createDynamicSystemProperties()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__CommonTopologyDynamicsFactory.eINSTANCE.createPhysicalBody()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyDynamicsPackage.Literals.DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS,
				 Symphony__CommonTopologyDynamicsFactory.eINSTANCE.createCylindricalConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyDynamicsPackage.Literals.DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS,
				 Symphony__CommonTopologyDynamicsFactory.eINSTANCE.createGearRatioConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyDynamicsPackage.Literals.DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS,
				 Symphony__CommonTopologyDynamicsFactory.eINSTANCE.createHingeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyDynamicsPackage.Literals.DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS,
				 Symphony__CommonTopologyDynamicsFactory.eINSTANCE.createPrismaticConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyDynamicsPackage.Literals.DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS,
				 Symphony__CommonTopologyDynamicsFactory.eINSTANCE.createRPROConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyDynamicsPackage.Literals.DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS,
				 Symphony__CommonTopologyDynamicsFactory.eINSTANCE.createUniversalConstraint()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN ||
			childFeature == Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
