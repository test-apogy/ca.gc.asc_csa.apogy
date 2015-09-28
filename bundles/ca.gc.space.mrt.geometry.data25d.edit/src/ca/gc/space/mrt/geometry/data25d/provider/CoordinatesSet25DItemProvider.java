/**
 * Canadian Space Agency 2007.
 *
 * $Id: CoordinatesSet25DItemProvider.java,v 1.4.4.2 2015/05/21 15:50:03 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data25d.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.gc.space.mrt.geometry.data.DataPackage;
import ca.gc.space.mrt.geometry.data.provider.CoordinatesSetItemProvider;
import ca.gc.space.mrt.geometry.data25d.CoordinatesSet25D;
import ca.gc.space.mrt.geometry.data25d.Data25dFactory;
import ca.gc.space.mrt.geometry.data25d.Data25dPackage;
import ca.gc.space.mrt.geometry.data3d.Data3dFactory;

/**
 * This is the item provider adapter for a {@link ca.gc.space.mrt.geometry.data25d.CoordinatesSet25D} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CoordinatesSet25DItemProvider
	extends CoordinatesSetItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinatesSet25DItemProvider(AdapterFactory adapterFactory)
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

			addEnforceUniquenessPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Enforce Uniqueness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnforceUniquenessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoordinatesSet25D_enforceUniqueness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoordinatesSet25D_enforceUniqueness_feature", "_UI_CoordinatesSet25D_type"),
				 Data25dPackage.Literals.COORDINATES_SET25_D__ENFORCE_UNIQUENESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CoordinatesSet25D.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CoordinatesSet25D"));
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
		List labelValue = ((CoordinatesSet25D)object).getNormals();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_CoordinatesSet25D_type") :
			getString("_UI_CoordinatesSet25D_type") + " " + label;
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

		switch (notification.getFeatureID(CoordinatesSet25D.class)) {
			case Data25dPackage.COORDINATES_SET25_D__ENFORCE_UNIQUENESS:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.COORDINATES_SET__POINTS,
				 Data25dFactory.eINSTANCE.createCoordinates25D()));

		newChildDescriptors.add
			(createChildParameter
				(DataPackage.Literals.COORDINATES_SET__POINTS,
				 Data3dFactory.eINSTANCE.createCartesianPositionCoordinates()));

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
		return Data25dEditPlugin.INSTANCE;
	}

}
