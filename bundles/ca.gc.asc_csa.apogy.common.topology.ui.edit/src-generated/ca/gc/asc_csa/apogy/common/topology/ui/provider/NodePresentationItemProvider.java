/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.topology.ui.provider;


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
import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NodePresentationItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodePresentationItemProvider(AdapterFactory adapterFactory) {
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

			addTopologyPresentationSetPropertyDescriptor(object);
			addColorPropertyDescriptor(object);
			addVisiblePropertyDescriptor(object);
			addShadowModePropertyDescriptor(object);
			addUseInBoundingCalculationPropertyDescriptor(object);
			addCentroidPropertyDescriptor(object);
			addMinPropertyDescriptor(object);
			addMaxPropertyDescriptor(object);
			addXRangePropertyDescriptor(object);
			addYRangePropertyDescriptor(object);
			addZRangePropertyDescriptor(object);
			addSceneObjectPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Topology Presentation Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopologyPresentationSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodePresentation_topologyPresentationSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodePresentation_topologyPresentationSet_feature", "_UI_NodePresentation_type"),
				 ApogyCommonTopologyUIPackage.Literals.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodePresentation_color_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodePresentation_color_feature", "_UI_NodePresentation_type"),
				 ApogyCommonTopologyUIPackage.Literals.NODE_PRESENTATION__COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_VISUAL_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodePresentation_visible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodePresentation_visible_feature", "_UI_NodePresentation_type"),
				 ApogyCommonTopologyUIPackage.Literals.NODE_PRESENTATION__VISIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_VISUAL_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Use In Bounding Calculation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseInBoundingCalculationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodePresentation_useInBoundingCalculation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodePresentation_useInBoundingCalculation_feature", "_UI_NodePresentation_type"),
				 ApogyCommonTopologyUIPackage.Literals.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_BOUNDING_VOLUME_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Centroid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCentroidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodePresentation_centroid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodePresentation_centroid_feature", "_UI_NodePresentation_type"),
				 ApogyCommonTopologyUIPackage.Literals.NODE_PRESENTATION__CENTROID,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_BOUNDING_VOLUME_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Min feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodePresentation_min_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodePresentation_min_feature", "_UI_NodePresentation_type"),
				 ApogyCommonTopologyUIPackage.Literals.NODE_PRESENTATION__MIN,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_BOUNDING_VOLUME_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Max feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodePresentation_max_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodePresentation_max_feature", "_UI_NodePresentation_type"),
				 ApogyCommonTopologyUIPackage.Literals.NODE_PRESENTATION__MAX,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_BOUNDING_VOLUME_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the XRange feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXRangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodePresentation_xRange_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodePresentation_xRange_feature", "_UI_NodePresentation_type"),
				 ApogyCommonTopologyUIPackage.Literals.NODE_PRESENTATION__XRANGE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_BOUNDING_VOLUME_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the YRange feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYRangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodePresentation_yRange_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodePresentation_yRange_feature", "_UI_NodePresentation_type"),
				 ApogyCommonTopologyUIPackage.Literals.NODE_PRESENTATION__YRANGE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_BOUNDING_VOLUME_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the ZRange feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZRangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodePresentation_zRange_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodePresentation_zRange_feature", "_UI_NodePresentation_type"),
				 ApogyCommonTopologyUIPackage.Literals.NODE_PRESENTATION__ZRANGE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_BOUNDING_VOLUME_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Scene Object feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSceneObjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodePresentation_sceneObject_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodePresentation_sceneObject_feature", "_UI_NodePresentation_type"),
				 ApogyCommonTopologyUIPackage.Literals.NODE_PRESENTATION__SCENE_OBJECT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_PRESENTATION_INTERNAL_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Shadow Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShadowModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodePresentation_shadowMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodePresentation_shadowMode_feature", "_UI_NodePresentation_type"),
				 ApogyCommonTopologyUIPackage.Literals.NODE_PRESENTATION__SHADOW_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_VISUAL_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This returns NodePresentation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NodePresentation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		RGB labelValue = ((NodePresentation)object).getColor();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_NodePresentation_type") :
			getString("_UI_NodePresentation_type") + " " + label;
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

		switch (notification.getFeatureID(NodePresentation.class)) {
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__NODE:
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__COLOR:
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE:
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE:
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION:
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__CENTROID:
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MIN:
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MAX:
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__XRANGE:
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__YRANGE:
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE:
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT:
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
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
