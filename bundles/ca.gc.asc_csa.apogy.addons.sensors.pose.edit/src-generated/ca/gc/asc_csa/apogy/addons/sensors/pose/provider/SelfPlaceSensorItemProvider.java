/**
 * Canadian Space Agency 2007.
 *
 * $Id: SelfPlaceSensorItemProvider.java,v 1.3.4.2 2015/05/21 15:50:00 pallard Exp $
 */
package ca.gc.asc_csa.apogy.addons.sensors.pose.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPoseFactory;
import ca.gc.asc_csa.apogy.addons.sensors.pose.SelfPlaceSensor;
import ca.gc.asc_csa.apogy.addons.sensors.provider.SensorItemProvider;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.sensors.pose.SelfPlaceSensor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SelfPlaceSensorItemProvider
	extends SensorItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfPlaceSensorItemProvider(AdapterFactory adapterFactory)
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns SelfPlaceSensor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SelfPlaceSensor"));
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
		String label = ((SelfPlaceSensor)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_SelfPlaceSensor_type") :
			getString("_UI_SelfPlaceSensor_type") + " " + label;
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
				(ApogyCommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 ApogyAddonsSensorsPoseFactory.eINSTANCE.createSelfPlaceSensor()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 ApogyAddonsSensorsPoseFactory.eINSTANCE.createPositionSensor()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 ApogyAddonsSensorsPoseFactory.eINSTANCE.createSimulatedPositionSensor()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 ApogyAddonsSensorsPoseFactory.eINSTANCE.createOrientationSensor()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 ApogyAddonsSensorsPoseFactory.eINSTANCE.createInertialMeasurementUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 ApogyAddonsSensorsPoseFactory.eINSTANCE.createSimulatedOrientationSensor()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 ApogyAddonsSensorsPoseFactory.eINSTANCE.createPoseSensor()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
				 ApogyAddonsSensorsPoseFactory.eINSTANCE.createSimulatedPoseSensor()));
	}

}