/**
 * <copyright>
 * </copyright>
 *
 */
package ca.gc.asc_csa.apogy.common.math.provider;

import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;

import javax.vecmath.Matrix3d;
import javax.vecmath.Vector3d;

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

import ca.gc.asc_csa.apogy.common.math.GeometricUtils;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage;
import ca.gc.asc_csa.apogy.common.math.Matrix3x3;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.common.math.Matrix3x3} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class Matrix3x3ItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource 
		{
	
	public static final String DEGREE_STRING = 	"\u00b0";
	private DecimalFormat orientationFormat = new DecimalFormat("0.0");
	
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Matrix3x3ItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
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

			addM00PropertyDescriptor(object);
			addM01PropertyDescriptor(object);
			addM02PropertyDescriptor(object);
			addM10PropertyDescriptor(object);
			addM11PropertyDescriptor(object);
			addM12PropertyDescriptor(object);
			addM20PropertyDescriptor(object);
			addM21PropertyDescriptor(object);
			addM22PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the M00 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM00PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix3x3_m00_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix3x3_m00_feature", "_UI_Matrix3x3_type"),
				 ApogyCommonMathPackage.Literals.MATRIX3X3__M00,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M01 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM01PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix3x3_m01_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix3x3_m01_feature", "_UI_Matrix3x3_type"),
				 ApogyCommonMathPackage.Literals.MATRIX3X3__M01,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M02 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM02PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix3x3_m02_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix3x3_m02_feature", "_UI_Matrix3x3_type"),
				 ApogyCommonMathPackage.Literals.MATRIX3X3__M02,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M10 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM10PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix3x3_m10_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix3x3_m10_feature", "_UI_Matrix3x3_type"),
				 ApogyCommonMathPackage.Literals.MATRIX3X3__M10,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M11 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM11PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix3x3_m11_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix3x3_m11_feature", "_UI_Matrix3x3_type"),
				 ApogyCommonMathPackage.Literals.MATRIX3X3__M11,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M12 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM12PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix3x3_m12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix3x3_m12_feature", "_UI_Matrix3x3_type"),
				 ApogyCommonMathPackage.Literals.MATRIX3X3__M12,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M20 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM20PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix3x3_m20_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix3x3_m20_feature", "_UI_Matrix3x3_type"),
				 ApogyCommonMathPackage.Literals.MATRIX3X3__M20,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M21 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM21PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix3x3_m21_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix3x3_m21_feature", "_UI_Matrix3x3_type"),
				 ApogyCommonMathPackage.Literals.MATRIX3X3__M21,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M22 feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM22PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Matrix3x3_m22_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Matrix3x3_m22_feature", "_UI_Matrix3x3_type"),
				 ApogyCommonMathPackage.Literals.MATRIX3X3__M22,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Matrix3x3.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Matrix3x3"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public String getText(Object object) 
	{
		Matrix3x3 matrix3x3 = (Matrix3x3) object;
		
		Matrix3d rotation = new Matrix3d(matrix3x3.asMatrix3d());		
		Vector3d rotationVector = GeometricUtils.extractRotationFromXYZRotMatrix(rotation);
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(getString("_UI_Matrix3x3_type"));
		
		// Orientation
		buffer.append(" (" + orientationFormat.format(Math.toDegrees(rotationVector.getX())) + DEGREE_STRING + ", ");
		buffer.append(orientationFormat.format(Math.toDegrees(rotationVector.getY())) + DEGREE_STRING + ", ");
		buffer.append(orientationFormat.format(Math.toDegrees(rotationVector.getZ())) + DEGREE_STRING + ")");
		
		return buffer.toString();
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

		switch (notification.getFeatureID(Matrix3x3.class)) {
			case ApogyCommonMathPackage.MATRIX3X3__M00:
			case ApogyCommonMathPackage.MATRIX3X3__M01:
			case ApogyCommonMathPackage.MATRIX3X3__M02:
			case ApogyCommonMathPackage.MATRIX3X3__M10:
			case ApogyCommonMathPackage.MATRIX3X3__M11:
			case ApogyCommonMathPackage.MATRIX3X3__M12:
			case ApogyCommonMathPackage.MATRIX3X3__M20:
			case ApogyCommonMathPackage.MATRIX3X3__M21:
			case ApogyCommonMathPackage.MATRIX3X3__M22:
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
