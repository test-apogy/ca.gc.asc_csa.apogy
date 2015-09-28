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
import ca.gc.asc_csa.symphony.environment.CartesianTriangularMeshHeightImageMapLayer;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.symphony.environment.CartesianTriangularMeshHeightImageMapLayer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CartesianTriangularMeshHeightImageMapLayerItemProvider extends CartesianTriangularMeshDerivedImageMapLayerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshHeightImageMapLayerItemProvider(AdapterFactory adapterFactory) {
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

			addAutoScalePropertyDescriptor(object);
			addMinimumHeightPropertyDescriptor(object);
			addMaximumHeightPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Auto Scale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoScalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianTriangularMeshHeightImageMapLayer_autoScale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianTriangularMeshHeightImageMapLayer_autoScale_feature", "_UI_CartesianTriangularMeshHeightImageMapLayer_type"),
				 SymphonyEnvironmentPackage.Literals.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__AUTO_SCALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_IMAGE_GENERATION_SETTINGSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addMinimumHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianTriangularMeshHeightImageMapLayer_minimumHeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianTriangularMeshHeightImageMapLayer_minimumHeight_feature", "_UI_CartesianTriangularMeshHeightImageMapLayer_type"),
				 SymphonyEnvironmentPackage.Literals.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MINIMUM_HEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_IMAGE_GENERATION_SETTINGSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addMaximumHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianTriangularMeshHeightImageMapLayer_maximumHeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianTriangularMeshHeightImageMapLayer_maximumHeight_feature", "_UI_CartesianTriangularMeshHeightImageMapLayer_type"),
				 SymphonyEnvironmentPackage.Literals.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MAXIMUM_HEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_IMAGE_GENERATION_SETTINGSPropertyCategory"),
				 null));
	}

	/**
	 * This returns CartesianTriangularMeshHeightImageMapLayer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CartesianTriangularMeshHeightImageMapLayer"));
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
		String label = ((CartesianTriangularMeshHeightImageMapLayer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CartesianTriangularMeshHeightImageMapLayer_type") : label;
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

		switch (notification.getFeatureID(CartesianTriangularMeshHeightImageMapLayer.class)) {
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__AUTO_SCALE:
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MINIMUM_HEIGHT:
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MAXIMUM_HEIGHT:
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
