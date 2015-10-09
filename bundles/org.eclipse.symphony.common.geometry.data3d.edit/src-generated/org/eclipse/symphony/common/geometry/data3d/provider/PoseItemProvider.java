/**
 * Canadian Space Agency 2007.
 *
 * $Id: PoseItemProvider.java,v 1.2.4.2 2015/05/21 15:50:28 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.provider;


import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;
import org.eclipse.symphony.common.geometry.data3d.Pose;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.common.geometry.data3d.Pose} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PoseItemProvider
	extends CartesianPositionCoordinatesItemProvider {
	
	private DecimalFormat radiansDecimalFormat = new DecimalFormat("0.000");
	private DecimalFormat degreesDecimalFormat = new DecimalFormat("0.000");	
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoseItemProvider(AdapterFactory adapterFactory) {
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

			addXRotationPropertyDescriptor(object);
			addYRotationPropertyDescriptor(object);
			addZRotationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the XRotation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addXRotationPropertyDescriptor(Object object) {
		
		ItemPropertyDescriptor ipd = new ItemPropertyDescriptor(
				 ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianOrientationCoordinates_xRotation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianOrientationCoordinates_xRotation_feature", "_UI_CartesianOrientationCoordinates_type"),
				 Data3dPackage.Literals.CARTESIAN_ORIENTATION_COORDINATES__XROTATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null)
			 {
				@Override
				protected Object getValue(EObject object, EStructuralFeature feature)
				{				
					CartesianOrientationCoordinates orientation = (CartesianOrientationCoordinates) object;				
					String radians = radiansDecimalFormat.format(orientation.getXRotation());
					String degrees = degreesDecimalFormat.format(Math.toDegrees(orientation.getXRotation()));														
					return radians + " (" + degrees +" deg)";							
				}
			};
			itemPropertyDescriptors.add(ipd);
	}

	/**
	 * This adds a property descriptor for the YRotation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addYRotationPropertyDescriptor(Object object) {
		
		ItemPropertyDescriptor ipd = new ItemPropertyDescriptor(
				 ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianOrientationCoordinates_yRotation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianOrientationCoordinates_yRotation_feature", "_UI_CartesianOrientationCoordinates_type"),
				 Data3dPackage.Literals.CARTESIAN_ORIENTATION_COORDINATES__YROTATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null)
		{
			@Override
			protected Object getValue(EObject object, EStructuralFeature feature)
			{				
				CartesianOrientationCoordinates orientation = (CartesianOrientationCoordinates) object;				
				String radians = radiansDecimalFormat.format(orientation.getYRotation());
				String degrees = degreesDecimalFormat.format(Math.toDegrees(orientation.getYRotation()));				
				return radians + " (" + degrees +" deg)";							
			}
		};
		
		itemPropertyDescriptors.add(ipd);
	}

	/**
	 * This adds a property descriptor for the ZRotation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addZRotationPropertyDescriptor(Object object) {
		
		ItemPropertyDescriptor ipd = new ItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianOrientationCoordinates_zRotation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianOrientationCoordinates_zRotation_feature", "_UI_CartesianOrientationCoordinates_type"),
				 Data3dPackage.Literals.CARTESIAN_ORIENTATION_COORDINATES__ZROTATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null)
		{
			@Override
			protected Object getValue(EObject object, EStructuralFeature feature)
			{				
				CartesianOrientationCoordinates orientation = (CartesianOrientationCoordinates) object;				
				String radians = radiansDecimalFormat.format(orientation.getZRotation());
				String degrees = degreesDecimalFormat.format(Math.toDegrees(orientation.getZRotation()));				
				return radians + " (" + degrees +" deg)";							
			}
		};
		
		itemPropertyDescriptors.add(ipd);
	}

	/**
	 * This returns Pose.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Pose"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Pose pose = (Pose)object;
		return getString("_UI_Pose_type") + " " + pose.getX();
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

		switch (notification.getFeatureID(Pose.class)) {
			case Data3dPackage.POSE__XROTATION:
			case Data3dPackage.POSE__YROTATION:
			case Data3dPackage.POSE__ZROTATION:
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
