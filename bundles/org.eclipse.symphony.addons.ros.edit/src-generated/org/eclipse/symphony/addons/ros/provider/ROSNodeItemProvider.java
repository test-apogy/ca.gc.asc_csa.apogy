/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.ros.provider;


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

import org.eclipse.symphony.addons.ros.Symphony__AddonsROSPackage;
import org.eclipse.symphony.addons.ros.ROSNode;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.addons.ros.ROSNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ROSNodeItemProvider
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
	public ROSNodeItemProvider(AdapterFactory adapterFactory) {
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

			addConnectedNodePropertyDescriptor(object);
			addModulesPropertyDescriptor(object);
			addServiceManagersPropertyDescriptor(object);
			addTopicLaunchersPropertyDescriptor(object);
			addPublisherManagersPropertyDescriptor(object);
			addInitializedPropertyDescriptor(object);
			addConnectedPropertyDescriptor(object);
			addRestartingPropertyDescriptor(object);
			addEnableAutoRestartOnConnectionLostPropertyDescriptor(object);
			addNodeNamePropertyDescriptor(object);
			addResponseLoggerPropertyDescriptor(object);
			addNullResponseHandlerPropertyDescriptor(object);
			addNullRequestHandlerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Connected Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectedNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROSNode_connectedNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROSNode_connectedNode_feature", "_UI_ROSNode_type"),
				 Symphony__AddonsROSPackage.Literals.ROS_NODE__CONNECTED_NODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modules feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModulesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROSNode_modules_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROSNode_modules_feature", "_UI_ROSNode_type"),
				 Symphony__AddonsROSPackage.Literals.ROS_NODE__MODULES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Managers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceManagersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROSNode_serviceManagers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROSNode_serviceManagers_feature", "_UI_ROSNode_type"),
				 Symphony__AddonsROSPackage.Literals.ROS_NODE__SERVICE_MANAGERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Topic Launchers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopicLaunchersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROSNode_topicLaunchers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROSNode_topicLaunchers_feature", "_UI_ROSNode_type"),
				 Symphony__AddonsROSPackage.Literals.ROS_NODE__TOPIC_LAUNCHERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Publisher Managers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublisherManagersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROSNode_publisherManagers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROSNode_publisherManagers_feature", "_UI_ROSNode_type"),
				 Symphony__AddonsROSPackage.Literals.ROS_NODE__PUBLISHER_MANAGERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initialized feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitializedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROSNode_initialized_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROSNode_initialized_feature", "_UI_ROSNode_type"),
				 Symphony__AddonsROSPackage.Literals.ROS_NODE__INITIALIZED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_ROS_NODEPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Connected feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROSNode_connected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROSNode_connected_feature", "_UI_ROSNode_type"),
				 Symphony__AddonsROSPackage.Literals.ROS_NODE__CONNECTED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_ROS_NODEPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Restarting feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRestartingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROSNode_restarting_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROSNode_restarting_feature", "_UI_ROSNode_type"),
				 Symphony__AddonsROSPackage.Literals.ROS_NODE__RESTARTING,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_ROS_NODEPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Auto Restart On Connection Lost feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableAutoRestartOnConnectionLostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROSNode_enableAutoRestartOnConnectionLost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROSNode_enableAutoRestartOnConnectionLost_feature", "_UI_ROSNode_type"),
				 Symphony__AddonsROSPackage.Literals.ROS_NODE__ENABLE_AUTO_RESTART_ON_CONNECTION_LOST,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_ROS_NODEPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Node Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodeNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROSNode_nodeName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROSNode_nodeName_feature", "_UI_ROSNode_type"),
				 Symphony__AddonsROSPackage.Literals.ROS_NODE__NODE_NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ROS_NODEPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Response Logger feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponseLoggerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROSNode_responseLogger_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROSNode_responseLogger_feature", "_UI_ROSNode_type"),
				 Symphony__AddonsROSPackage.Literals.ROS_NODE__RESPONSE_LOGGER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Null Response Handler feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNullResponseHandlerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROSNode_nullResponseHandler_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROSNode_nullResponseHandler_feature", "_UI_ROSNode_type"),
				 Symphony__AddonsROSPackage.Literals.ROS_NODE__NULL_RESPONSE_HANDLER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Null Request Handler feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNullRequestHandlerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROSNode_nullRequestHandler_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROSNode_nullRequestHandler_feature", "_UI_ROSNode_type"),
				 Symphony__AddonsROSPackage.Literals.ROS_NODE__NULL_REQUEST_HANDLER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ROSNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ROSNode"));
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
		ROSNode rosNode = (ROSNode) object;
		
		String label = getString("_UI_ROSNode_type") + " (";
		
		if(rosNode.getNodeName() != null)
		{
			label += rosNode.getNodeName();
		}
		else
		{
			label += "?";
		}
		

		if(rosNode.isInitialized())
		{
			label += " , Initialized";
		}
		else
		{
			label += " , Not Initialized";
		}
		
		if(rosNode.isRestarting())
		{
			label += " , Restarting";
		}		

		if(rosNode.isConnected())
		{
			label += " , Connected";
		}
		else
		{
			label += " , Not Connected";
		}		
		
		label += ")";
		
		return label;
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

		switch (notification.getFeatureID(org.eclipse.symphony.addons.ros.ROSNode.class)) {
			case Symphony__AddonsROSPackage.ROS_NODE__CONNECTED_NODE:
			case Symphony__AddonsROSPackage.ROS_NODE__INITIALIZED:
			case Symphony__AddonsROSPackage.ROS_NODE__CONNECTED:
			case Symphony__AddonsROSPackage.ROS_NODE__RESTARTING:
			case Symphony__AddonsROSPackage.ROS_NODE__ENABLE_AUTO_RESTART_ON_CONNECTION_LOST:
			case Symphony__AddonsROSPackage.ROS_NODE__NODE_NAME:
			case Symphony__AddonsROSPackage.ROS_NODE__RESPONSE_LOGGER:
			case Symphony__AddonsROSPackage.ROS_NODE__NULL_RESPONSE_HANDLER:
			case Symphony__AddonsROSPackage.ROS_NODE__NULL_REQUEST_HANDLER:
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
