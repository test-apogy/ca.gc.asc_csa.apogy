/**
 * Canadian Space Agency 2007.
 *
 * $Id: AngularSpanItemProvider.java,v 1.4.4.2 2015/05/21 15:51:09 pallard Exp $
 */
package ca.gc.space.mrt.sensors.fov.provider;


import java.text.DecimalFormat;
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

import ca.gc.space.mrt.sensors.fov.AngularSpan;
import ca.gc.space.mrt.sensors.fov.FovPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.space.mrt.sensors.fov.AngularSpan} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AngularSpanItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource
{
	private DecimalFormat numberFormat = new DecimalFormat("0.##");
	
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
	public AngularSpanItemProvider(AdapterFactory adapterFactory)
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

			addMinimumAnglePropertyDescriptor(object);
			addMaximumAnglePropertyDescriptor(object);
			addSpanningAnglePropertyDescriptor(object);
			addCenterAnglePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Minimum Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addMinimumAnglePropertyDescriptor(Object object)
	{
		ItemPropertyDescriptor descriptor = new AngleItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_AngularSpan_minimumAngle_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AngularSpan_minimumAngle_feature", "_UI_AngularSpan_type"),
				FovPackage.Literals.ANGULAR_SPAN__MINIMUM_ANGLE,
				true, 
				false,
				false, 
				ItemPropertyDescriptor.REAL_VALUE_IMAGE,  
				null,
				null);

		itemPropertyDescriptors.add(descriptor);
	}

	/**
	 * This adds a property descriptor for the Maximum Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addMaximumAnglePropertyDescriptor(Object object)
	{		
		ItemPropertyDescriptor descriptor = new AngleItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_AngularSpan_maximumAngle_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AngularSpan_maximumAngle_feature", "_UI_AngularSpan_type"),
				FovPackage.Literals.ANGULAR_SPAN__MAXIMUM_ANGLE,
				true, 
				false,
				false, 
				ItemPropertyDescriptor.REAL_VALUE_IMAGE,  
				null,
				null);

		itemPropertyDescriptors.add(descriptor);
	}

	/**
	 * This adds a property descriptor for the Spanning Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addSpanningAnglePropertyDescriptor(Object object)
	{
		ItemPropertyDescriptor descriptor = new AngleItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_AngularSpan_spanningAngle_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AngularSpan_spanningAngle_feature", "_UI_AngularSpan_type"),
				FovPackage.Literals.ANGULAR_SPAN__SPANNING_ANGLE,
				false, 
				false,
				false, 
				ItemPropertyDescriptor.REAL_VALUE_IMAGE,  
				null,
				null);

		itemPropertyDescriptors.add(descriptor);
	}

	/**
	 * This adds a property descriptor for the Center Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addCenterAnglePropertyDescriptor(Object object)
	{
		ItemPropertyDescriptor descriptor = new AngleItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_AngularSpan_centerAngle_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AngularSpan_centerAngle_feature", "_UI_AngularSpan_type"),
				FovPackage.Literals.ANGULAR_SPAN__CENTER_ANGLE,
				false, 
				false,
				false, 
				ItemPropertyDescriptor.REAL_VALUE_IMAGE,  
				null,
				null);

		itemPropertyDescriptors.add(descriptor);
	}

	/**
	 * This returns AngularSpan.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AngularSpan"));
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
		AngularSpan angularSpan = (AngularSpan)object;
		return getString("_UI_AngularSpan_type") + " (" + numberFormat.format(Math.toDegrees(angularSpan.getMinimumAngle())) + ", " + numberFormat.format(Math.toDegrees(angularSpan.getMaximumAngle())) + ")";
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

		switch (notification.getFeatureID(AngularSpan.class)) {
			case FovPackage.ANGULAR_SPAN__MINIMUM_ANGLE:
			case FovPackage.ANGULAR_SPAN__MAXIMUM_ANGLE:
			case FovPackage.ANGULAR_SPAN__SPANNING_ANGLE:
			case FovPackage.ANGULAR_SPAN__CENTER_ANGLE:
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
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
