/**
 * <copyright>
 * </copyright>
 *
 */
package ca.gc.asc_csa.apogy.common.math.provider;

import java.text.NumberFormat;
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
import ca.gc.asc_csa.apogy.common.emf.edit.utils.descriptors.DoubleItemPropertyDescriptor;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.common.math.Tuple3d} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class Tuple3dItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

	private NumberFormat formatter;

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Tuple3dItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	private NumberFormat getFormatter() {
		if (formatter == null) {
			formatter = NumberFormat.getInstance();
		}

		return formatter;
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addXPropertyDescriptor(object);
			addYPropertyDescriptor(object);
			addZPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the X feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	protected void addXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new DoubleItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Tuple3d_x_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_Tuple3d_x_feature", "_UI_Tuple3d_type"),
				ApogyCommonMathPackage.Literals.TUPLE3D__X, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Y feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	protected void addYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new DoubleItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Tuple3d_y_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_Tuple3d_y_feature", "_UI_Tuple3d_type"),
				ApogyCommonMathPackage.Literals.TUPLE3D__Y, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Z feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	protected void addZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new DoubleItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Tuple3d_z_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_Tuple3d_z_feature", "_UI_Tuple3d_type"),
				ApogyCommonMathPackage.Literals.TUPLE3D__Z, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Tuple3d.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Tuple3d"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public String getText(Object object) {

		Tuple3d tuple3d = (Tuple3d) object;
		return getString("_UI_Tuple3d_type") + " (" 
				+ getFormatter().format(tuple3d.getX()) + ", "
				+ getFormatter().format(tuple3d.getY()) + ", "
				+ getFormatter().format(tuple3d.getZ()) + ")";
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Tuple3d.class)) {
			case ApogyCommonMathPackage.TUPLE3D__X:
			case ApogyCommonMathPackage.TUPLE3D__Y:
			case ApogyCommonMathPackage.TUPLE3D__Z:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
