/**
 * Canadian Space Agency 2007.
 *
 * $Id: Mesh25DItemProvider.java,v 1.3.4.2 2015/05/21 15:50:03 pallard Exp $
 */
package ca.gc.asc_csa.apogy.common.geometry.data25d.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage;
import ca.gc.asc_csa.apogy.common.geometry.data.provider.MeshItemProvider;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data25d.Mesh25D;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.common.geometry.data25d.Mesh25D} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Mesh25DItemProvider
	extends MeshItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mesh25DItemProvider(AdapterFactory adapterFactory)
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
	 * This returns Mesh25D.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Mesh25D"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public String getText(Object object)
	{
		List labelValue = ((Mesh25D)object).getNormals();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Mesh25D_type") :
			getString("_UI_Mesh25D_type") + " " + label;
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
				(ApogyCommonGeometryDataPackage.Literals.COORDINATES_SET__POINTS,
				 ApogyCommonGeometryData25DFactory.eINSTANCE.createCoordinates25D()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonGeometryDataPackage.Literals.COORDINATES_SET__POINTS,
				 ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianPositionCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonGeometryDataPackage.Literals.COORDINATES_SET__POINTS,
				 ApogyCommonGeometryData3DFactory.eINSTANCE.createColoredCartesianPositionCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonGeometryDataPackage.Literals.COORDINATES_SET__POINTS,
				 ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianOrientationCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonGeometryDataPackage.Literals.COORDINATES_SET__POINTS,
				 ApogyCommonGeometryData3DFactory.eINSTANCE.createSphericalCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonGeometryDataPackage.Literals.COORDINATES_SET__POINTS,
				 ApogyCommonGeometryData3DFactory.eINSTANCE.createPose()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonGeometryDataPackage.Literals.COORDINATES_SET__POINTS,
				 ApogyCommonGeometryData3DFactory.eINSTANCE.createPositionMarker()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonGeometryDataPackage.Literals.MESH__POLYGONS,
				 ApogyCommonGeometryData25DFactory.eINSTANCE.createPolygon25D()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonGeometryDataPackage.Literals.MESH__POLYGONS,
				 ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianPolygon()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonGeometryDataPackage.Literals.MESH__POLYGONS,
				 ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianTriangle()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonGeometryDataPackage.Literals.MESH__POLYGONS,
				 ApogyCommonGeometryData3DFactory.eINSTANCE.createSphericalPolygon()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonGeometryDataPackage.Literals.MESH__POLYGONS,
				 ApogyCommonGeometryData3DFactory.eINSTANCE.createSphericalTriangle()));
	}

}
