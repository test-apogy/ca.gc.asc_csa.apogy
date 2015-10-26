/**
 * <copyright>
 * </copyright>
 *
 * $Id: WayPointItemProvider.java,v 1.7.2.3 2015/02/03 20:01:35 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.addons.primitives.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage;
import org.eclipse.symphony.common.topology.addons.primitives.PrimitivesFactory;
import org.eclipse.symphony.common.topology.addons.primitives.WayPoint;
import org.eclipse.symphony.common.topology.provider.AggregateGroupNodeItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.common.topology.addons.primitives.WayPoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WayPointItemProvider
	extends AggregateGroupNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WayPointItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns WayPoint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WayPoint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WayPoint)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_WayPoint_type") :
			getString("_UI_WayPoint_type") + " " + label;
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
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 PrimitivesFactory.eINSTANCE.createVector()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 PrimitivesFactory.eINSTANCE.createPickVector()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 PrimitivesFactory.eINSTANCE.createPlane()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 PrimitivesFactory.eINSTANCE.createWayPoint()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 PrimitivesFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 PrimitivesFactory.eINSTANCE.createSpherePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 PrimitivesFactory.eINSTANCE.createAmbientLight()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 PrimitivesFactory.eINSTANCE.createDirectionalLight()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 PrimitivesFactory.eINSTANCE.createPointLight()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 PrimitivesFactory.eINSTANCE.createSpotLight()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 PrimitivesFactory.eINSTANCE.createVector()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 PrimitivesFactory.eINSTANCE.createPickVector()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 PrimitivesFactory.eINSTANCE.createPlane()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 PrimitivesFactory.eINSTANCE.createWayPoint()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 PrimitivesFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 PrimitivesFactory.eINSTANCE.createSpherePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 PrimitivesFactory.eINSTANCE.createAmbientLight()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 PrimitivesFactory.eINSTANCE.createDirectionalLight()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 PrimitivesFactory.eINSTANCE.createPointLight()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 PrimitivesFactory.eINSTANCE.createSpotLight()));
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
