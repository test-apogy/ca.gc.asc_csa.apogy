/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.gc.asc_csa.eclipse.emf.ecore.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import ca.gc.asc_csa.symphony.environment.CartesianTriangularMeshDerivedImageMapLayer;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.symphony.environment.CartesianTriangularMeshDerivedImageMapLayer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CartesianTriangularMeshDerivedImageMapLayerItemProvider extends ImageMapLayerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshDerivedImageMapLayerItemProvider(AdapterFactory adapterFactory) {
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

			addRequiredResolutionPropertyDescriptor(object);
			addCartesianTriangularMeshMapLayerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Required Resolution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addRequiredResolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianTriangularMeshDerivedImageMapLayer_requiredResolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianTriangularMeshDerivedImageMapLayer_requiredResolution_feature", "_UI_CartesianTriangularMeshDerivedImageMapLayer_type"),
				 SymphonyEnvironmentPackage.Literals.CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_IMAGE_GENERATION_SETTINGSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Cartesian Triangular Mesh Map Layer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCartesianTriangularMeshMapLayerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianTriangularMeshDerivedImageMapLayer_cartesianTriangularMeshMapLayer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianTriangularMeshDerivedImageMapLayer_cartesianTriangularMeshMapLayer_feature", "_UI_CartesianTriangularMeshDerivedImageMapLayer_type"),
				 SymphonyEnvironmentPackage.Literals.CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_IMAGE_GENERATION_SETTINGSPropertyCategory"),
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((CartesianTriangularMeshDerivedImageMapLayer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CartesianTriangularMeshDerivedImageMapLayer_type") : label;
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

		switch (notification.getFeatureID(CartesianTriangularMeshDerivedImageMapLayer.class)) {
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION:
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

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == SymphonyEnvironmentPackage.Literals.IMAGE_MAP_LAYER__IMAGE ||
			childFeature == SymphonyEnvironmentPackage.Literals.IMAGE_MAP_LAYER__LEGEND;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
