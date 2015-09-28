/**
 * Canadian Space Agency 2008.
 *
 * $Id: CartesianTriangularMeshItemProvider.java,v 1.4.4.2 2015/05/21 15:50:28 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import ca.gc.space.mrt.geometry.data.DataPackage;
import ca.gc.space.mrt.geometry.data.provider.MeshItemProvider;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangularMesh;
import ca.gc.space.mrt.geometry.data3d.Data3dFactory;

/**
 * This is the item provider adapter for a {@link ca.gc.space.mrt.geometry.data3d.CartesianTriangularMesh} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CartesianTriangularMeshItemProvider
	extends MeshItemProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2008.";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns CartesianTriangularMesh.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CartesianTriangularMesh"));
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
		CartesianTriangularMesh mesh = (CartesianTriangularMesh) object;
		
		String label = getString("_UI_CartesianTriangularMesh_type");
		if(mesh.getPoints().size() > 0 || mesh.getPolygons().size() > 0)
		{
			label += " (" + (mesh.getPoints().size() + " points, ");
			label += mesh.getPolygons().size() + " triangles )";
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		return Data3dEditPlugin.INSTANCE;
	}

}
