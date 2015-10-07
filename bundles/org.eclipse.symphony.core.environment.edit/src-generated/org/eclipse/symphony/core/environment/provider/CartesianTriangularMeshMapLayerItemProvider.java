/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshMapLayer;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentFactory;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;

import ca.gc.space.mrt.geometry.data3d.CartesianTriangularMesh;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.environment.CartesianTriangularMeshMapLayer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CartesianTriangularMeshMapLayerItemProvider
	extends AbstractMapLayerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshMapLayerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(SymphonyEnvironmentPackage.Literals.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP_LAYER_PRESENTATIONS);
			childrenFeatures.add(SymphonyEnvironmentPackage.Literals.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__TEXTURE_IMAGE);
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
	 * This returns CartesianTriangularMeshMapLayer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CartesianTriangularMeshMapLayer"));
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
		CartesianTriangularMeshMapLayer cartesianTriangularMeshMapLayer = (CartesianTriangularMeshMapLayer) object;
		String label = cartesianTriangularMeshMapLayer.getName();
		if(label == null || label.length() == 0)
		{
			label = getString("_UI_CartesianTriangularMeshMapLayer_type");
		}		
		label += " " + getCartesianTriangularMeshMapLayerText(cartesianTriangularMeshMapLayer);
		
		return label;
	}
	
	protected String getCartesianTriangularMeshMapLayerText(CartesianTriangularMeshMapLayer cartesianTriangularMeshMapLayer)
	{
		String text = "";
		CartesianTriangularMesh mesh = cartesianTriangularMeshMapLayer.getCurrentMesh();
		if(mesh != null)
		{
			text += "(" + mesh.getPolygons().size() + " triangles)";
		}
		
		return text;
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

		switch (notification.getFeatureID(CartesianTriangularMeshMapLayer.class)) {
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH_IS_DIRTY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP_LAYER_PRESENTATIONS:
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
				(SymphonyEnvironmentPackage.Literals.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP_LAYER_PRESENTATIONS,
				 SymphonyEnvironmentFactory.eINSTANCE.createImageMapLayerPresentation()));
	}

}