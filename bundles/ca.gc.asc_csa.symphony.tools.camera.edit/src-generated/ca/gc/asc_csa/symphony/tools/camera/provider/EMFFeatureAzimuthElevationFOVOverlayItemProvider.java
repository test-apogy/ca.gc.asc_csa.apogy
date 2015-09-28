/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.camera.provider;


import ca.gc.asc_csa.symphony.tools.camera.EMFFeatureAzimuthElevationFOVOverlay;
import ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsFactory;
import ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.EMFFeatureAzimuthElevationFOVOverlay} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFFeatureAzimuthElevationFOVOverlayItemProvider
	extends AzimuthElevationFOVOverlayItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFFeatureAzimuthElevationFOVOverlayItemProvider(AdapterFactory adapterFactory) {
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
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SymphonyCameraToolsPackage.Literals.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__AZIMUTH_FEATURE_REFERENCE);
			childrenFeatures.add(SymphonyCameraToolsPackage.Literals.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__ELEVATION_FEATURE_REFERENCE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns EMFFeatureAzimuthElevationFOVOverlay.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EMFFeatureAzimuthElevationFOVOverlay"));
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
		return getCameraImageAnnotationText(object, "_UI_EMFFeatureAzimuthElevationFOVOverlay_type");
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

		switch (notification.getFeatureID(EMFFeatureAzimuthElevationFOVOverlay.class)) {
			case SymphonyCameraToolsPackage.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__AZIMUTH_FEATURE_REFERENCE:
			case SymphonyCameraToolsPackage.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__ELEVATION_FEATURE_REFERENCE:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SymphonyCameraToolsPackage.Literals.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__AZIMUTH_FEATURE_REFERENCE,
				 SymphonyCameraToolsFactory.eINSTANCE.createAzimuthFeatureReference()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyCameraToolsPackage.Literals.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__ELEVATION_FEATURE_REFERENCE,
				 SymphonyCameraToolsFactory.eINSTANCE.createElevationFeatureReference()));
	}

}
