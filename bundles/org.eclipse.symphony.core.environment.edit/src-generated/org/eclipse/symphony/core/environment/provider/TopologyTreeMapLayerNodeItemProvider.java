/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage;
import org.eclipse.symphony.common.topology.provider.AggregateGroupNodeItemProvider;
import org.eclipse.symphony.core.Symphony__CoreFactory;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage;
import org.eclipse.symphony.core.environment.TopologyTreeMapLayerNode;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.environment.TopologyTreeMapLayerNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TopologyTreeMapLayerNodeItemProvider extends AggregateGroupNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyTreeMapLayerNodeItemProvider(AdapterFactory adapterFactory) {
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

			addTopologyTreeMapLayerPropertyDescriptor(object);
			addTransientParentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Topology Tree Map Layer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopologyTreeMapLayerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TopologyTreeMapLayerNode_topologyTreeMapLayer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TopologyTreeMapLayerNode_topologyTreeMapLayer_feature", "_UI_TopologyTreeMapLayerNode_type"),
				 Symphony__CoreEnvironmentPackage.Literals.TOPOLOGY_TREE_MAP_LAYER_NODE__TOPOLOGY_TREE_MAP_LAYER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transient Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransientParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TopologyTreeMapLayerNode_transientParent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TopologyTreeMapLayerNode_transientParent_feature", "_UI_TopologyTreeMapLayerNode_type"),
				 Symphony__CoreEnvironmentPackage.Literals.TOPOLOGY_TREE_MAP_LAYER_NODE__TRANSIENT_PARENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns TopologyTreeMapLayerNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TopologyTreeMapLayerNode"));
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
		TopologyTreeMapLayerNode topologyTreeMapLayerNode = (TopologyTreeMapLayerNode) object;
		String label = topologyTreeMapLayerNode.getNodeId();
		return label == null || label.length() == 0 ? getString("_UI_TopologyTreeMapLayerNode_type") : label;
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
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createSun()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createEarth()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createMoon()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createStarField()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createTopologyTreeMapLayerNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createWorksiteNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createSurfaceWorksiteNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createEarthSurfaceWorksiteNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createMapsListNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createMapNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createAbstractMapLayerNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createSkyNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createEarthSkyNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshMapLayerNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__CoreFactory.eINSTANCE.createResultNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__CoreFactory.eINSTANCE.createResultsListNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__CoreFactory.eINSTANCE.createFeatureOfInterestNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__CoreFactory.eINSTANCE.createFeatureOfInterestListNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createSun()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createEarth()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createMoon()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createStarField()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createTopologyTreeMapLayerNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createWorksiteNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createSurfaceWorksiteNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createEarthSurfaceWorksiteNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createMapsListNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createMapNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createAbstractMapLayerNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createSkyNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createEarthSkyNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__CoreEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshMapLayerNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__CoreFactory.eINSTANCE.createResultNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__CoreFactory.eINSTANCE.createResultsListNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__CoreFactory.eINSTANCE.createFeatureOfInterestNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__CoreFactory.eINSTANCE.createFeatureOfInterestListNode()));
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
