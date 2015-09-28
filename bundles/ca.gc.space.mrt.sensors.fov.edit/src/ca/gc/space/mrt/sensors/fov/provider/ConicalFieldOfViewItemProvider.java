/**
 * Canadian Space Agency 2007.
 *
 * $Id: ConicalFieldOfViewItemProvider.java,v 1.4.4.2 2015/05/21 15:51:09 pallard Exp $
 */
package ca.gc.space.mrt.sensors.fov.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.gc.space.mrt.sensors.fov.ConicalFieldOfView;
import ca.gc.space.mrt.sensors.fov.FovFactory;
import ca.gc.space.mrt.sensors.fov.FovPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.space.mrt.sensors.fov.ConicalFieldOfView} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConicalFieldOfViewItemProvider
	extends FieldOfViewItemProvider
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
	public ConicalFieldOfViewItemProvider(AdapterFactory adapterFactory)
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

			addFieldOfViewAnglePropertyDescriptor(object);
			addRangePropertyDescriptor(object);
			addVolumePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Field Of View Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addFieldOfViewAnglePropertyDescriptor(Object object)
	{
		ItemPropertyDescriptor descriptor = new AngleItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ConicalFieldOfView_fieldOfViewAngle_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ConicalFieldOfView_fieldOfViewAngle_feature", "_UI_ConicalFieldOfView_type"),
				FovPackage.Literals.CONICAL_FIELD_OF_VIEW__FIELD_OF_VIEW_ANGLE,
				true, 
				false,
				false, 
				ItemPropertyDescriptor.REAL_VALUE_IMAGE,  
				getString("_UI_FOV_INFOPropertyCategory"), 
				null);

		itemPropertyDescriptors.add(descriptor);
	}

	/**
	 * This adds a property descriptor for the Range feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRangePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConicalFieldOfView_range_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConicalFieldOfView_range_feature", "_UI_ConicalFieldOfView_type"),
				 FovPackage.Literals.CONICAL_FIELD_OF_VIEW__RANGE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_FOV_INFOPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Volume feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVolumePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConicalFieldOfView_volume_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConicalFieldOfView_volume_feature", "_UI_ConicalFieldOfView_type"),
				 FovPackage.Literals.CONICAL_FIELD_OF_VIEW__VOLUME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_FOV_INFOPropertyCategory"),
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FovPackage.Literals.CONICAL_FIELD_OF_VIEW__RANGE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child)
	{
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ConicalFieldOfView.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConicalFieldOfView"));
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
		ConicalFieldOfView fov = (ConicalFieldOfView) object;
		
		String label = null;
		
		if(fov.getNodeId() != null && fov.getNodeId().length() > 0)
		{
			label = fov.getNodeId();
		}
		else
		{
			label = getString("_UI_ConicalFieldOfView_type");
		}
		
		label += " (" + Math.toDegrees(fov.getFieldOfViewAngle()) + " deg)";
		
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
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(ConicalFieldOfView.class)) {
			case FovPackage.CONICAL_FIELD_OF_VIEW__FIELD_OF_VIEW_ANGLE:
			case FovPackage.CONICAL_FIELD_OF_VIEW__VOLUME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FovPackage.CONICAL_FIELD_OF_VIEW__RANGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
				(FovPackage.Literals.CONICAL_FIELD_OF_VIEW__RANGE,
				 FovFactory.eINSTANCE.createDistanceRange()));
	}

}
