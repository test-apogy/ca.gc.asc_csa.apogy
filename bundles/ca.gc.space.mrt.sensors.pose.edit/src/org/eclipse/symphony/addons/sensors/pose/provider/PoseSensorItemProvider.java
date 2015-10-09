/**
 * Canadian Space Agency 2007.
 *
 * $Id: PoseSensorItemProvider.java,v 1.3.4.2 2015/05/21 15:50:00 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.pose.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.addons.sensors.SensorsFactory;
import org.eclipse.symphony.addons.sensors.SensorsPackage;
import org.eclipse.symphony.addons.sensors.pose.PoseFactory;
import org.eclipse.symphony.addons.sensors.pose.PosePackage;
import org.eclipse.symphony.addons.sensors.pose.PoseSensor;
import org.eclipse.symphony.common.geometry.data3d.Data3dFactory;
import org.eclipse.symphony.common.topology.TopologyPackage;
import org.eclipse.symphony.common.topology.provider.TransformNodeItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.addons.sensors.pose.PoseSensor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PoseSensorItemProvider
	extends TransformNodeItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoseSensorItemProvider(AdapterFactory adapterFactory)
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

			addStatusPropertyDescriptor(object);
			addPositionCoordinatesPropertyDescriptor(object);
			addOrientationCoordinatesPropertyDescriptor(object);
			addPosePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Sensor_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Sensor_status_feature", "_UI_Sensor_type"),
				 SensorsPackage.Literals.SENSOR__STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SENSOR_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Position Coordinates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionCoordinatesPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PositionSensor_positionCoordinates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PositionSensor_positionCoordinates_feature", "_UI_PositionSensor_type"),
				 PosePackage.Literals.POSITION_SENSOR__POSITION_COORDINATES,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_SENSOR_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Orientation Coordinates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrientationCoordinatesPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrientationSensor_orientationCoordinates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrientationSensor_orientationCoordinates_feature", "_UI_OrientationSensor_type"),
				 PosePackage.Literals.ORIENTATION_SENSOR__ORIENTATION_COORDINATES,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_SENSOR_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Pose feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PoseSensor_pose_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PoseSensor_pose_feature", "_UI_PoseSensor_type"),
				 PosePackage.Literals.POSE_SENSOR__POSE,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_SENSOR_INFORMATIONPropertyCategory"),
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PosePackage.Literals.POSITION_SENSOR__POSITION_COORDINATES);
			childrenFeatures.add(PosePackage.Literals.ORIENTATION_SENSOR__ORIENTATION_COORDINATES);
			childrenFeatures.add(PosePackage.Literals.POSE_SENSOR__POSE);
			childrenFeatures.add(PosePackage.Literals.POSE_SENSOR__DATA_LOGGER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child)
	{
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns PoseSensor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PoseSensor"));
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
		String label = ((PoseSensor)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_PoseSensor_type") :
			getString("_UI_PoseSensor_type") + " " + label;
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

		switch (notification.getFeatureID(PoseSensor.class)) {
			case PosePackage.POSE_SENSOR__STATUS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PosePackage.POSE_SENSOR__POSITION_COORDINATES:
			case PosePackage.POSE_SENSOR__ORIENTATION_COORDINATES:
			case PosePackage.POSE_SENSOR__POSE:
			case PosePackage.POSE_SENSOR__DATA_LOGGER:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 PoseFactory.eINSTANCE.createPositionSensor()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 PoseFactory.eINSTANCE.createOrientationSensor()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 PoseFactory.eINSTANCE.createPoseSensor()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 PoseFactory.eINSTANCE.createSelfPlaceSensor()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 PoseFactory.eINSTANCE.createSimulatedPositionSensor()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 PoseFactory.eINSTANCE.createSimulatedOrientationSensor()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 PoseFactory.eINSTANCE.createSimulatedPoseSensor()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 PoseFactory.eINSTANCE.createInertialMeasurementUnit()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 SensorsFactory.eINSTANCE.createSensor()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 PoseFactory.eINSTANCE.createPositionSensor()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 PoseFactory.eINSTANCE.createOrientationSensor()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 PoseFactory.eINSTANCE.createPoseSensor()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 PoseFactory.eINSTANCE.createSelfPlaceSensor()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 PoseFactory.eINSTANCE.createSimulatedPositionSensor()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 PoseFactory.eINSTANCE.createSimulatedOrientationSensor()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 PoseFactory.eINSTANCE.createSimulatedPoseSensor()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 PoseFactory.eINSTANCE.createInertialMeasurementUnit()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 SensorsFactory.eINSTANCE.createSensor()));

		newChildDescriptors.add
			(createChildParameter
				(PosePackage.Literals.POSITION_SENSOR__POSITION_COORDINATES,
				 Data3dFactory.eINSTANCE.createCartesianPositionCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(PosePackage.Literals.POSITION_SENSOR__POSITION_COORDINATES,
				 Data3dFactory.eINSTANCE.createRGBCartesianPositionCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(PosePackage.Literals.POSITION_SENSOR__POSITION_COORDINATES,
				 Data3dFactory.eINSTANCE.createPose()));

		newChildDescriptors.add
			(createChildParameter
				(PosePackage.Literals.POSITION_SENSOR__POSITION_COORDINATES,
				 Data3dFactory.eINSTANCE.createPositionMarker()));

		newChildDescriptors.add
			(createChildParameter
				(PosePackage.Literals.ORIENTATION_SENSOR__ORIENTATION_COORDINATES,
				 Data3dFactory.eINSTANCE.createCartesianOrientationCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(PosePackage.Literals.ORIENTATION_SENSOR__ORIENTATION_COORDINATES,
				 Data3dFactory.eINSTANCE.createPose()));

		newChildDescriptors.add
			(createChildParameter
				(PosePackage.Literals.POSE_SENSOR__POSE,
				 Data3dFactory.eINSTANCE.createPose()));

		newChildDescriptors.add
			(createChildParameter
				(PosePackage.Literals.POSE_SENSOR__DATA_LOGGER,
				 PoseFactory.eINSTANCE.createCSVDataLogger()));
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
			childFeature == TopologyPackage.Literals.GROUP_NODE__CHILDREN ||
			childFeature == TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN ||
			childFeature == PosePackage.Literals.POSITION_SENSOR__POSITION_COORDINATES ||
			childFeature == PosePackage.Literals.ORIENTATION_SENSOR__ORIENTATION_COORDINATES ||
			childFeature == PosePackage.Literals.POSE_SENSOR__POSE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		return PoseEditPlugin.INSTANCE;
	}

}
