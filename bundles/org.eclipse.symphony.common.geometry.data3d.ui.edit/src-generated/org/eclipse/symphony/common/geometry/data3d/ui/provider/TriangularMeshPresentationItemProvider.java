/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.ui.provider;


import ca.gc.space.topology.ui.provider.NodePresentationItemProvider;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.symphony.common.geometry.data3d.ui.Data3DUIPackage;
import org.eclipse.symphony.common.geometry.data3d.ui.TriangularMeshPresentation;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.common.geometry.data3d.ui.TriangularMeshPresentation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TriangularMeshPresentationItemProvider extends NodePresentationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriangularMeshPresentationItemProvider(AdapterFactory adapterFactory) {
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

			addMeshPropertyDescriptor(object);
			addPointSizePropertyDescriptor(object);
			addNumberOfPointsPropertyDescriptor(object);
			addNumberOfPolygonsPropertyDescriptor(object);
			addPresentationModePropertyDescriptor(object);
			addTransparencyPropertyDescriptor(object);
			addUseShadingPropertyDescriptor(object);
			addTextureImagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Mesh feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeshPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TriangularMeshPresentation_mesh_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TriangularMeshPresentation_mesh_feature", "_UI_TriangularMeshPresentation_type"),
				 Data3DUIPackage.Literals.TRIANGULAR_MESH_PRESENTATION__MESH,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Point Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPointSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TriangularMeshPresentation_pointSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TriangularMeshPresentation_pointSize_feature", "_UI_TriangularMeshPresentation_type"),
				 Data3DUIPackage.Literals.TRIANGULAR_MESH_PRESENTATION__POINT_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfPointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TriangularMeshPresentation_numberOfPoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TriangularMeshPresentation_numberOfPoints_feature", "_UI_TriangularMeshPresentation_type"),
				 Data3DUIPackage.Literals.TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POINTS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Polygons feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfPolygonsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TriangularMeshPresentation_numberOfPolygons_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TriangularMeshPresentation_numberOfPolygons_feature", "_UI_TriangularMeshPresentation_type"),
				 Data3DUIPackage.Literals.TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POLYGONS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Presentation Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPresentationModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TriangularMeshPresentation_presentationMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TriangularMeshPresentation_presentationMode_feature", "_UI_TriangularMeshPresentation_type"),
				 Data3DUIPackage.Literals.TRIANGULAR_MESH_PRESENTATION__PRESENTATION_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transparency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransparencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TriangularMeshPresentation_transparency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TriangularMeshPresentation_transparency_feature", "_UI_TriangularMeshPresentation_type"),
				 Data3DUIPackage.Literals.TRIANGULAR_MESH_PRESENTATION__TRANSPARENCY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Shading feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseShadingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TriangularMeshPresentation_useShading_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TriangularMeshPresentation_useShading_feature", "_UI_TriangularMeshPresentation_type"),
				 Data3DUIPackage.Literals.TRIANGULAR_MESH_PRESENTATION__USE_SHADING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Texture Image feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextureImagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TriangularMeshPresentation_textureImage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TriangularMeshPresentation_textureImage_feature", "_UI_TriangularMeshPresentation_type"),
				 Data3DUIPackage.Literals.TRIANGULAR_MESH_PRESENTATION__TEXTURE_IMAGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns TriangularMeshPresentation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TriangularMeshPresentation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		RGB labelValue = ((TriangularMeshPresentation)object).getColor();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_TriangularMeshPresentation_type") :
			getString("_UI_TriangularMeshPresentation_type") + " " + label;
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

		switch (notification.getFeatureID(TriangularMeshPresentation.class)) {
			case Data3DUIPackage.TRIANGULAR_MESH_PRESENTATION__POINT_SIZE:
			case Data3DUIPackage.TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POINTS:
			case Data3DUIPackage.TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POLYGONS:
			case Data3DUIPackage.TRIANGULAR_MESH_PRESENTATION__PRESENTATION_MODE:
			case Data3DUIPackage.TRIANGULAR_MESH_PRESENTATION__TRANSPARENCY:
			case Data3DUIPackage.TRIANGULAR_MESH_PRESENTATION__USE_SHADING:
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
