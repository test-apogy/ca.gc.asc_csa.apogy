/**
 * <copyright>
 * </copyright>
 *
 * $Id: CollisionGeometryItemProvider.java,v 1.3.2.2 2015/02/03 20:01:27 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.addons.dynamics.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
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
import org.eclipse.symphony.common.math.MathFactory;
import org.eclipse.symphony.common.topology.addons.dynamics.CollisionGeometry;
import org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsFactory;
import org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.common.topology.addons.dynamics.CollisionGeometry} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CollisionGeometryItemProvider
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
	public CollisionGeometryItemProvider(AdapterFactory adapterFactory) {
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

			addSimulationPropertiesPropertyDescriptor(object);
			addMaterialPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addGeometryIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Simulation Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSimulationPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollisionGeometry_simulationProperties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollisionGeometry_simulationProperties_feature", "_UI_CollisionGeometry_type"),
				 TopologyDynamicsPackage.Literals.COLLISION_GEOMETRY__SIMULATION_PROPERTIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Material feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaterialPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollisionGeometry_material_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollisionGeometry_material_feature", "_UI_CollisionGeometry_type"),
				 TopologyDynamicsPackage.Literals.COLLISION_GEOMETRY__MATERIAL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollisionGeometry_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollisionGeometry_description_feature", "_UI_CollisionGeometry_type"),
				 TopologyDynamicsPackage.Literals.COLLISION_GEOMETRY__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Geometry Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeometryIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollisionGeometry_geometryId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollisionGeometry_geometryId_feature", "_UI_CollisionGeometry_type"),
				 TopologyDynamicsPackage.Literals.COLLISION_GEOMETRY__GEOMETRY_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(TopologyDynamicsPackage.Literals.COLLISION_GEOMETRY__GEOMETRY);
			childrenFeatures.add(TopologyDynamicsPackage.Literals.COLLISION_GEOMETRY__TRANSFORM);
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
	 * This returns CollisionGeometry.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CollisionGeometry"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CollisionGeometry)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_CollisionGeometry_type") :
			getString("_UI_CollisionGeometry_type") + " " + label;
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

		switch (notification.getFeatureID(CollisionGeometry.class)) {
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__DESCRIPTION:
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__GEOMETRY_ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__GEOMETRY:
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__TRANSFORM:
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
				(TopologyDynamicsPackage.Literals.COLLISION_GEOMETRY__GEOMETRY,
				 TopologyDynamicsFactory.eINSTANCE.createBoxGeometry()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyDynamicsPackage.Literals.COLLISION_GEOMETRY__GEOMETRY,
				 TopologyDynamicsFactory.eINSTANCE.createCapsuleGeometry()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyDynamicsPackage.Literals.COLLISION_GEOMETRY__GEOMETRY,
				 TopologyDynamicsFactory.eINSTANCE.createCylinderGeometry()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyDynamicsPackage.Literals.COLLISION_GEOMETRY__GEOMETRY,
				 TopologyDynamicsFactory.eINSTANCE.createSphereGeometry()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyDynamicsPackage.Literals.COLLISION_GEOMETRY__TRANSFORM,
				 MathFactory.eINSTANCE.createMatrix4x4()));
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
