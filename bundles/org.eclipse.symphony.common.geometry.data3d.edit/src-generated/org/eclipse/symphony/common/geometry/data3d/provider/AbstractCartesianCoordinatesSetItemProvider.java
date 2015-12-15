/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.symphony.common.geometry.data.Symphony__CommonGeometryDataPackage;

import org.eclipse.symphony.common.geometry.data.provider.CoordinatesSetItemProvider;

import org.eclipse.symphony.common.geometry.data3d.AbstractCartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.common.geometry.data3d.AbstractCartesianCoordinatesSet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractCartesianCoordinatesSetItemProvider extends CoordinatesSetItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCartesianCoordinatesSetItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns AbstractCartesianCoordinatesSet.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AbstractCartesianCoordinatesSet"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		List labelValue = ((AbstractCartesianCoordinatesSet<?>)object).getNormals();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractCartesianCoordinatesSet_type") :
			getString("_UI_AbstractCartesianCoordinatesSet_type") + " " + label;
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
				(Symphony__CommonGeometryDataPackage.Literals.COORDINATES_SET__POINTS,
				 Symphony__CommonGeometryData3DFactory.eINSTANCE.createCartesianPositionCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonGeometryDataPackage.Literals.COORDINATES_SET__POINTS,
				 Symphony__CommonGeometryData3DFactory.eINSTANCE.createColoredCartesianPositionCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonGeometryDataPackage.Literals.COORDINATES_SET__POINTS,
				 Symphony__CommonGeometryData3DFactory.eINSTANCE.createCartesianOrientationCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonGeometryDataPackage.Literals.COORDINATES_SET__POINTS,
				 Symphony__CommonGeometryData3DFactory.eINSTANCE.createSphericalCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonGeometryDataPackage.Literals.COORDINATES_SET__POINTS,
				 Symphony__CommonGeometryData3DFactory.eINSTANCE.createPose()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CommonGeometryDataPackage.Literals.COORDINATES_SET__POINTS,
				 Symphony__CommonGeometryData3DFactory.eINSTANCE.createPositionMarker()));
	}

}
