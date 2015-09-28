/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.camera.provider;


import ca.gc.asc_csa.symphony.tools.camera.FOVOverlay;
import ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.FOVOverlay} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FOVOverlayItemProvider
	extends DrawnCameraOverlayItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FOVOverlayItemProvider(AdapterFactory adapterFactory) {
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

			addLineWidthPropertyDescriptor(object);
			addPositiveValuesColorPropertyDescriptor(object);
			addNegativeValueColorPropertyDescriptor(object);
			addAngleIntervalPropertyDescriptor(object);
			addFontNamePropertyDescriptor(object);
			addFontSizePropertyDescriptor(object);
			addAzimuthDirectionPropertyDescriptor(object);
			addElevationDirectionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Line Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLineWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FOVOverlay_lineWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FOVOverlay_lineWidth_feature", "_UI_FOVOverlay_type"),
				 SymphonyCameraToolsPackage.Literals.FOV_OVERLAY__LINE_WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_OVERLAY_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Positive Values Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositiveValuesColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FOVOverlay_positiveValuesColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FOVOverlay_positiveValuesColor_feature", "_UI_FOVOverlay_type"),
				 SymphonyCameraToolsPackage.Literals.FOV_OVERLAY__POSITIVE_VALUES_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_OVERLAY_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Negative Value Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNegativeValueColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FOVOverlay_negativeValueColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FOVOverlay_negativeValueColor_feature", "_UI_FOVOverlay_type"),
				 SymphonyCameraToolsPackage.Literals.FOV_OVERLAY__NEGATIVE_VALUE_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_OVERLAY_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Angle Interval feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAngleIntervalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FOVOverlay_angleInterval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FOVOverlay_angleInterval_feature", "_UI_FOVOverlay_type"),
				 SymphonyCameraToolsPackage.Literals.FOV_OVERLAY__ANGLE_INTERVAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_OVERLAY_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Font Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FOVOverlay_fontName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FOVOverlay_fontName_feature", "_UI_FOVOverlay_type"),
				 SymphonyCameraToolsPackage.Literals.FOV_OVERLAY__FONT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_FONT_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Font Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FOVOverlay_fontSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FOVOverlay_fontSize_feature", "_UI_FOVOverlay_type"),
				 SymphonyCameraToolsPackage.Literals.FOV_OVERLAY__FONT_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_FONT_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Azimuth Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAzimuthDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FOVOverlay_azimuthDirection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FOVOverlay_azimuthDirection_feature", "_UI_FOVOverlay_type"),
				 SymphonyCameraToolsPackage.Literals.FOV_OVERLAY__AZIMUTH_DIRECTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DIRECTIONS_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Elevation Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElevationDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FOVOverlay_elevationDirection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FOVOverlay_elevationDirection_feature", "_UI_FOVOverlay_type"),
				 SymphonyCameraToolsPackage.Literals.FOV_OVERLAY__ELEVATION_DIRECTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DIRECTIONS_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This returns FOVOverlay.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FOVOverlay"));
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
		return getCameraImageAnnotationText(object, "_UI_FOVOverlay_type");
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

		switch (notification.getFeatureID(FOVOverlay.class)) {
			case SymphonyCameraToolsPackage.FOV_OVERLAY__LINE_WIDTH:
			case SymphonyCameraToolsPackage.FOV_OVERLAY__POSITIVE_VALUES_COLOR:
			case SymphonyCameraToolsPackage.FOV_OVERLAY__NEGATIVE_VALUE_COLOR:
			case SymphonyCameraToolsPackage.FOV_OVERLAY__ANGLE_INTERVAL:
			case SymphonyCameraToolsPackage.FOV_OVERLAY__FONT_NAME:
			case SymphonyCameraToolsPackage.FOV_OVERLAY__FONT_SIZE:
			case SymphonyCameraToolsPackage.FOV_OVERLAY__AZIMUTH_DIRECTION:
			case SymphonyCameraToolsPackage.FOV_OVERLAY__ELEVATION_DIRECTION:
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
