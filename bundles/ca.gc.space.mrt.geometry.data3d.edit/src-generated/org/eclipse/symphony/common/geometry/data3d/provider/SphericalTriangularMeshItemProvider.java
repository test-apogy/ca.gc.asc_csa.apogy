/**
 * Canadian Space Agency 2008.
 *
 * $Id: SphericalTriangularMeshItemProvider.java,v 1.3.4.2 2015/05/21 15:50:28 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.symphony.common.geometry.data.DataPackage;
import org.eclipse.symphony.common.geometry.data.provider.MeshItemProvider;
import org.eclipse.symphony.common.geometry.data3d.Data3dFactory;
import org.eclipse.symphony.common.geometry.data3d.SphericalTriangularMesh;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.common.geometry.data3d.SphericalTriangularMesh} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SphericalTriangularMeshItemProvider
	extends MeshItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SphericalTriangularMeshItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns SphericalTriangularMesh.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SphericalTriangularMesh"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		List labelValue = ((SphericalTriangularMesh)object).getNormals();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_SphericalTriangularMesh_type") :
			getString("_UI_SphericalTriangularMesh_type") + " " + label;
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
				(DataPackage.Literals.COORDINATES_SET__POINTS,
				 Data3dFactory.eINSTANCE.createCartesianPositionCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.COORDINATES_SET__POINTS,
				 Data3dFactory.eINSTANCE.createRGBCartesianPositionCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.COORDINATES_SET__POINTS,
				 Data3dFactory.eINSTANCE.createCartesianOrientationCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.COORDINATES_SET__POINTS,
				 Data3dFactory.eINSTANCE.createSphericalCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.COORDINATES_SET__POINTS,
				 Data3dFactory.eINSTANCE.createPose()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.COORDINATES_SET__POINTS,
				 Data3dFactory.eINSTANCE.createPositionMarker()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.MESH__POLYGONS,
				 Data3dFactory.eINSTANCE.createCartesianPolygon()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.MESH__POLYGONS,
				 Data3dFactory.eINSTANCE.createCartesianTriangle()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.MESH__POLYGONS,
				 Data3dFactory.eINSTANCE.createSphericalPolygon()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.MESH__POLYGONS,
				 Data3dFactory.eINSTANCE.createSphericalTriangle()));
	}

}
