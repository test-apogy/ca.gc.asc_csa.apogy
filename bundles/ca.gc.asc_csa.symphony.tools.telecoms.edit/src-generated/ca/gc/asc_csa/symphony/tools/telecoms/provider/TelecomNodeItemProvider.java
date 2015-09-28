/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.telecoms.provider;


import ca.gc.asc_csa.symphony.tools.telecoms.SymphonyTelecomToolsPackage;
import ca.gc.asc_csa.symphony.tools.telecoms.TelecomNode;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.symphony.tools.telecoms.TelecomNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TelecomNodeItemProvider 
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
	public TelecomNodeItemProvider(AdapterFactory adapterFactory) {
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

			addStatusMonitorToolPropertyDescriptor(object);
			addEnabledPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addAddressPropertyDescriptor(object);
			addPacketsToSendPropertyDescriptor(object);
			addConnectionTimeoutPropertyDescriptor(object);
			addLatencyWarningPropertyDescriptor(object);
			addLatencyAlarmPropertyDescriptor(object);
			addPacketLossWarningPropertyDescriptor(object);
			addPacketLossAlarmPropertyDescriptor(object);
			addLatencyPropertyDescriptor(object);
			addPacketLossPropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Status Monitor Tool feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusMonitorToolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TelecomNode_statusMonitorTool_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TelecomNode_statusMonitorTool_feature", "_UI_TelecomNode_type"),
				 SymphonyTelecomToolsPackage.Literals.TELECOM_NODE__STATUS_MONITOR_TOOL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TelecomNode_enabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TelecomNode_enabled_feature", "_UI_TelecomNode_type"),
				 SymphonyTelecomToolsPackage.Literals.TELECOM_NODE__ENABLED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_CurrentStatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TelecomNode_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TelecomNode_name_feature", "_UI_TelecomNode_type"),
				 SymphonyTelecomToolsPackage.Literals.TELECOM_NODE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ConnectionSettingsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TelecomNode_address_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TelecomNode_address_feature", "_UI_TelecomNode_type"),
				 SymphonyTelecomToolsPackage.Literals.TELECOM_NODE__ADDRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ConnectionSettingsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Packets To Send feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPacketsToSendPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TelecomNode_packetsToSend_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TelecomNode_packetsToSend_feature", "_UI_TelecomNode_type"),
				 SymphonyTelecomToolsPackage.Literals.TELECOM_NODE__PACKETS_TO_SEND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_ConnectionSettingsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Connection Timeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectionTimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TelecomNode_connectionTimeout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TelecomNode_connectionTimeout_feature", "_UI_TelecomNode_type"),
				 SymphonyTelecomToolsPackage.Literals.TELECOM_NODE__CONNECTION_TIMEOUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_ConnectionSettingsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Latency Warning feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLatencyWarningPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TelecomNode_latencyWarning_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TelecomNode_latencyWarning_feature", "_UI_TelecomNode_type"),
				 SymphonyTelecomToolsPackage.Literals.TELECOM_NODE__LATENCY_WARNING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_WarningsAndAlarmsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Latency Alarm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLatencyAlarmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TelecomNode_latencyAlarm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TelecomNode_latencyAlarm_feature", "_UI_TelecomNode_type"),
				 SymphonyTelecomToolsPackage.Literals.TELECOM_NODE__LATENCY_ALARM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_WarningsAndAlarmsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Packet Loss Warning feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPacketLossWarningPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TelecomNode_packetLossWarning_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TelecomNode_packetLossWarning_feature", "_UI_TelecomNode_type"),
				 SymphonyTelecomToolsPackage.Literals.TELECOM_NODE__PACKET_LOSS_WARNING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_WarningsAndAlarmsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Packet Loss Alarm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPacketLossAlarmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TelecomNode_packetLossAlarm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TelecomNode_packetLossAlarm_feature", "_UI_TelecomNode_type"),
				 SymphonyTelecomToolsPackage.Literals.TELECOM_NODE__PACKET_LOSS_ALARM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_WarningsAndAlarmsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Latency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLatencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TelecomNode_latency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TelecomNode_latency_feature", "_UI_TelecomNode_type"),
				 SymphonyTelecomToolsPackage.Literals.TELECOM_NODE__LATENCY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_CurrentStatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Packet Loss feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPacketLossPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TelecomNode_packetLoss_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TelecomNode_packetLoss_feature", "_UI_TelecomNode_type"),
				 SymphonyTelecomToolsPackage.Literals.TELECOM_NODE__PACKET_LOSS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_CurrentStatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TelecomNode_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TelecomNode_status_feature", "_UI_TelecomNode_type"),
				 SymphonyTelecomToolsPackage.Literals.TELECOM_NODE__STATUS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_CurrentStatusPropertyCategory"),
				 null));
	}

	/**
	 * This returns TelecomNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TelecomNode"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TelecomNode)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TelecomNode_type") :
			getString("_UI_TelecomNode_type") + " " + label;
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

		switch (notification.getFeatureID(TelecomNode.class)) {
			case SymphonyTelecomToolsPackage.TELECOM_NODE__ENABLED:
			case SymphonyTelecomToolsPackage.TELECOM_NODE__NAME:
			case SymphonyTelecomToolsPackage.TELECOM_NODE__ADDRESS:
			case SymphonyTelecomToolsPackage.TELECOM_NODE__PACKETS_TO_SEND:
			case SymphonyTelecomToolsPackage.TELECOM_NODE__CONNECTION_TIMEOUT:
			case SymphonyTelecomToolsPackage.TELECOM_NODE__LATENCY_WARNING:
			case SymphonyTelecomToolsPackage.TELECOM_NODE__LATENCY_ALARM:
			case SymphonyTelecomToolsPackage.TELECOM_NODE__PACKET_LOSS_WARNING:
			case SymphonyTelecomToolsPackage.TELECOM_NODE__PACKET_LOSS_ALARM:
			case SymphonyTelecomToolsPackage.TELECOM_NODE__LATENCY:
			case SymphonyTelecomToolsPackage.TELECOM_NODE__PACKET_LOSS:
			case SymphonyTelecomToolsPackage.TELECOM_NODE__STATUS:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
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
