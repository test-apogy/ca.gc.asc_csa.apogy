/**
 * <copyright>
 * </copyright>
 *
 * $Id: PhysicalBodyItemProvider.java,v 1.14.2.2 2015/02/03 20:01:26 rlarcheveque Exp $
 */
package ca.gc.asc_csa.topology.dynamics.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.gc.asc_csa.topology.dynamics.PhysicalBody;
import ca.gc.asc_csa.topology.dynamics.TopologyDynamicsFactory;
import ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage;
import ca.gc.space.topology.TopologyPackage;
import ca.gc.space.topology.provider.AggregateGroupNodeItemProvider;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.topology.dynamics.PhysicalBody} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicalBodyItemProvider
	extends AggregateGroupNodeItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyrights Canadian Space Agency 2012.";

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

			addPhysicalPropertiesPropertyDescriptor(object);
			addCenterOfMassKinematicStatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Physical Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhysicalPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalBody_physicalProperties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalBody_physicalProperties_feature", "_UI_PhysicalBody_type"),
				 TopologyDynamicsPackage.Literals.PHYSICAL_BODY__PHYSICAL_PROPERTIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Center Of Mass Kinematic State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCenterOfMassKinematicStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalBody_centerOfMassKinematicState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalBody_centerOfMassKinematicState_feature", "_UI_PhysicalBody_type"),
				 TopologyDynamicsPackage.Literals.PHYSICAL_BODY__CENTER_OF_MASS_KINEMATIC_STATE,
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
			childrenFeatures.add(TopologyDynamicsPackage.Literals.PHYSICAL_BODY__PHYSICAL_PROPERTIES);
			childrenFeatures.add(TopologyDynamicsPackage.Literals.PHYSICAL_BODY__CONSTRAINT_ATTACHMENT_POINTS);
			childrenFeatures.add(TopologyDynamicsPackage.Literals.PHYSICAL_BODY__SIMULATION_PROPERTIES);
			childrenFeatures.add(TopologyDynamicsPackage.Literals.PHYSICAL_BODY__CENTER_OF_MASS_KINEMATIC_STATE);
			childrenFeatures.add(TopologyDynamicsPackage.Literals.PHYSICAL_BODY__POINTS_OF_INTEREST);
			childrenFeatures.add(TopologyDynamicsPackage.Literals.PHYSICAL_BODY__COLLISION_GEOMETRY);
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
			case TopologyDynamicsPackage.PHYSICAL_BODY__CONSTRAINT_ATTACHMENT_POINTS:
			case TopologyDynamicsPackage.PHYSICAL_BODY__SIMULATION_PROPERTIES:
			case TopologyDynamicsPackage.PHYSICAL_BODY__POINTS_OF_INTEREST:
			case TopologyDynamicsPackage.PHYSICAL_BODY__COLLISION_GEOMETRY:
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
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 TopologyDynamicsFactory.eINSTANCE.createDynamicSystemProperties()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 TopologyDynamicsFactory.eINSTANCE.createPhysicalBody()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 TopologyDynamicsFactory.eINSTANCE.createDynamicSystemProperties()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 TopologyDynamicsFactory.eINSTANCE.createPhysicalBody()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyDynamicsPackage.Literals.PHYSICAL_BODY__PHYSICAL_PROPERTIES,
				 TopologyDynamicsFactory.eINSTANCE.createPhysicalProperties()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyDynamicsPackage.Literals.PHYSICAL_BODY__CONSTRAINT_ATTACHMENT_POINTS,
				 TopologyDynamicsFactory.eINSTANCE.createConstraintAttachmentPoint()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyDynamicsPackage.Literals.PHYSICAL_BODY__SIMULATION_PROPERTIES,
				 TopologyDynamicsFactory.eINSTANCE.createAbstractPhysicalBodySimulationProperties()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyDynamicsPackage.Literals.PHYSICAL_BODY__CENTER_OF_MASS_KINEMATIC_STATE,
				 TopologyDynamicsFactory.eINSTANCE.createKinematicState()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyDynamicsPackage.Literals.PHYSICAL_BODY__POINTS_OF_INTEREST,
				 TopologyDynamicsFactory.eINSTANCE.createPointOfInterest()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyDynamicsPackage.Literals.PHYSICAL_BODY__COLLISION_GEOMETRY,
				 TopologyDynamicsFactory.eINSTANCE.createCollisionGeometry()));
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
			childFeature == TopologyPackage.Literals.GROUP_NODE__CHILDREN ||
			childFeature == TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
