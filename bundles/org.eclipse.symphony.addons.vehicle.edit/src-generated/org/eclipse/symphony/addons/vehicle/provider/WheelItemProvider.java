/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.addons.Symphony__AddonsFactory;
import org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsFactory;
import org.eclipse.symphony.addons.mobility.pathplanners.Symphony__AddonsMobilityPathplannersFactory;
import org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehicleFactory;
import org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage;
import org.eclipse.symphony.addons.vehicle.Wheel;
import org.eclipse.symphony.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage;
import org.eclipse.symphony.common.topology.addons.dynamics.provider.PhysicalBodyItemProvider;
import org.eclipse.symphony.core.Symphony__CoreFactory;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.addons.vehicle.Wheel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WheelItemProvider
  extends PhysicalBodyItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WheelItemProvider(AdapterFactory adapterFactory)
  {
		super(adapterFactory);
	}

  /**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addRadiusPropertyDescriptor(object);
			addLenghtPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Radius feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated_NOT
	 */
  protected void addRadiusPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Wheel_radius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Wheel_radius_feature", "_UI_Wheel_type"),
				 Symphony__AddonsVehiclePackage.Literals.WHEEL__RADIUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Lenght feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated_NOT
	 */
  protected void addLenghtPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Wheel_lenght_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Wheel_lenght_feature", "_UI_Wheel_type"),
				 Symphony__AddonsVehiclePackage.Literals.WHEEL__LENGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This returns Wheel.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Wheel"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object)
  {
		String label = ((Wheel)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_Wheel_type") :
			getString("_UI_Wheel_type") + " " + label;
	}

  /**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void notifyChanged(Notification notification)
  {
		updateChildren(notification);

		switch (notification.getFeatureID(Wheel.class)) {
			case Symphony__AddonsVehiclePackage.WHEEL__RADIUS:
			case Symphony__AddonsVehiclePackage.WHEEL__LENGHT:
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
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__AddonsVehicleFactory.eINSTANCE.createWheel()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__AddonsVehicleFactory.eINSTANCE.createThruster()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__AddonsVehicleFactory.eINSTANCE.createLanderSphericalFoot()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__AddonsVehicleFactory.eINSTANCE.createPathPlannerToolNode()));

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
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__AddonsFactory.eINSTANCE.createRuler3dToolNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__AddonsFactory.eINSTANCE.createSunVector3DToolNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__AddonsFactory.eINSTANCE.createTrajectory3DToolNode()));

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
				 Symphony__AddonsMobilityPathplannersFactory.eINSTANCE.createCircularExclusionZone()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__AddonsGeometryPathsFactory.eINSTANCE.createWayPoint()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__AddonsGeometryPathsFactory.eINSTANCE.createPath()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 Symphony__AddonsGeometryPathsFactory.eINSTANCE.createWayPointPath()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__AddonsVehicleFactory.eINSTANCE.createWheel()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__AddonsVehicleFactory.eINSTANCE.createThruster()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__AddonsVehicleFactory.eINSTANCE.createLanderSphericalFoot()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__AddonsVehicleFactory.eINSTANCE.createPathPlannerToolNode()));

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

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__AddonsFactory.eINSTANCE.createRuler3dToolNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__AddonsFactory.eINSTANCE.createSunVector3DToolNode()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__AddonsFactory.eINSTANCE.createTrajectory3DToolNode()));

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
				 Symphony__AddonsMobilityPathplannersFactory.eINSTANCE.createCircularExclusionZone()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__AddonsGeometryPathsFactory.eINSTANCE.createWayPoint()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__AddonsGeometryPathsFactory.eINSTANCE.createPath()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 Symphony__AddonsGeometryPathsFactory.eINSTANCE.createWayPointPath()));
	}

  /**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
  {
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
