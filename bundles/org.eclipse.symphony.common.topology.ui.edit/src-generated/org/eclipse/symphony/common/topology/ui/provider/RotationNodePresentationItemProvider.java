/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.ui.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.symphony.common.topology.ui.RotationNodePresentation;
import org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.common.topology.ui.RotationNodePresentation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RotationNodePresentationItemProvider extends NodePresentationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotationNodePresentationItemProvider(AdapterFactory adapterFactory) {
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

			addAxisVisiblePropertyDescriptor(object);
			addAxisLenghtPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Axis Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAxisVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RotationNodePresentation_axisVisible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RotationNodePresentation_axisVisible_feature", "_UI_RotationNodePresentation_type"),
				 Symphony__CommonTopologyUIPackage.Literals.ROTATION_NODE_PRESENTATION__AXIS_VISIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_VISUAL_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Axis Lenght feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAxisLenghtPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RotationNodePresentation_axisLenght_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RotationNodePresentation_axisLenght_feature", "_UI_RotationNodePresentation_type"),
				 Symphony__CommonTopologyUIPackage.Literals.ROTATION_NODE_PRESENTATION__AXIS_LENGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_VISUAL_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This returns RotationNodePresentation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RotationNodePresentation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		RGB labelValue = ((RotationNodePresentation)object).getColor();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_RotationNodePresentation_type") :
			getString("_UI_RotationNodePresentation_type") + " " + label;
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

		switch (notification.getFeatureID(RotationNodePresentation.class)) {
			case Symphony__CommonTopologyUIPackage.ROTATION_NODE_PRESENTATION__AXIS_VISIBLE:
			case Symphony__CommonTopologyUIPackage.ROTATION_NODE_PRESENTATION__AXIS_LENGHT:
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
