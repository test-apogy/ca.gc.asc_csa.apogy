/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.addons.FeatureOfInterestPickingTool;
import org.eclipse.symphony.addons.SymphonyToolsCorePackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.addons.FeatureOfInterestPickingTool} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureOfInterestPickingToolItemProvider
	extends Simple3DToolItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOfInterestPickingToolItemProvider(AdapterFactory adapterFactory) {
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

			addFeatureOfInterestListPropertyDescriptor(object);
			addPickAbsolutePositionPropertyDescriptor(object);
			addPickRelativePositionPropertyDescriptor(object);
			addPickedNodePropertyDescriptor(object);
			addPickAbsoluteNormalPropertyDescriptor(object);
			addPickRelativeNormalPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Feature Of Interest List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeatureOfInterestListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeatureOfInterestPickingTool_featureOfInterestList_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureOfInterestPickingTool_featureOfInterestList_feature", "_UI_FeatureOfInterestPickingTool_type"),
				 SymphonyToolsCorePackage.Literals.FEATURE_OF_INTEREST_PICKING_TOOL__FEATURE_OF_INTEREST_LIST,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pick Absolute Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPickAbsolutePositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeatureOfInterestPickingTool_pickAbsolutePosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureOfInterestPickingTool_pickAbsolutePosition_feature", "_UI_FeatureOfInterestPickingTool_type"),
				 SymphonyToolsCorePackage.Literals.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_POSITION,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_PICKED_NODEPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Pick Relative Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPickRelativePositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeatureOfInterestPickingTool_pickRelativePosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureOfInterestPickingTool_pickRelativePosition_feature", "_UI_FeatureOfInterestPickingTool_type"),
				 SymphonyToolsCorePackage.Literals.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_POSITION,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_PICKED_NODEPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Picked Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPickedNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeatureOfInterestPickingTool_pickedNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureOfInterestPickingTool_pickedNode_feature", "_UI_FeatureOfInterestPickingTool_type"),
				 SymphonyToolsCorePackage.Literals.FEATURE_OF_INTEREST_PICKING_TOOL__PICKED_NODE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_PICKED_NODEPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Pick Absolute Normal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPickAbsoluteNormalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeatureOfInterestPickingTool_pickAbsoluteNormal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureOfInterestPickingTool_pickAbsoluteNormal_feature", "_UI_FeatureOfInterestPickingTool_type"),
				 SymphonyToolsCorePackage.Literals.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_NORMAL,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_PICKED_NODEPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Pick Relative Normal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPickRelativeNormalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeatureOfInterestPickingTool_pickRelativeNormal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureOfInterestPickingTool_pickRelativeNormal_feature", "_UI_FeatureOfInterestPickingTool_type"),
				 SymphonyToolsCorePackage.Literals.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_NORMAL,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_PICKED_NODEPropertyCategory"),
				 null));
	}

	/**
	 * This returns FeatureOfInterestPickingTool.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FeatureOfInterestPickingTool"));
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
		FeatureOfInterestPickingTool featureOfInterestPickingTool = (FeatureOfInterestPickingTool) object;
		String label = null;		
		if(featureOfInterestPickingTool.getName() != null && featureOfInterestPickingTool.getName().length() > 0)
		{
			label = featureOfInterestPickingTool.getName();
		}
		else
		{
			label = getString("_UI_FeatureOfInterestPickingTool_type");
		}
		
		if(featureOfInterestPickingTool.isActive())
		{
			label += " (active)";
		}
		
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

		switch (notification.getFeatureID(FeatureOfInterestPickingTool.class)) {
			case SymphonyToolsCorePackage.FEATURE_OF_INTEREST_PICKING_TOOL__FEATURE_OF_INTEREST_LIST:
			case SymphonyToolsCorePackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_POSITION:
			case SymphonyToolsCorePackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_POSITION:
			case SymphonyToolsCorePackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICKED_NODE:
			case SymphonyToolsCorePackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_NORMAL:
			case SymphonyToolsCorePackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_NORMAL:
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

}
