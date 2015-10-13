/**
 */
package org.eclipse.symphony.common.topology.addons.primitives.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.topology.addons.primitives.PickVector;
import org.eclipse.symphony.common.topology.addons.primitives.PrimitivesPackage;

import ca.gc.asc_csa.eclipse.emf.ecore.ui.descriptors.AbstractUnitItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.common.topology.addons.primitives.PickVector} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PickVectorItemProvider extends VectorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PickVectorItemProvider(AdapterFactory adapterFactory) {
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

			addIntersectionDistancePropertyDescriptor(object);
			addIntersectedNodePropertyDescriptor(object);
			addRelativeIntersectionPositionPropertyDescriptor(object);
			addAbsoluteIntersectionPositionPropertyDescriptor(object);
			addNodeTypesInIntersectionPropertyDescriptor(object);
			addNodeTypesToExcludeFromIntersectionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Intersection Distance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addIntersectionDistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PickVector_intersectionDistance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PickVector_intersectionDistance_feature", "_UI_PickVector_type"),
				 PrimitivesPackage.Literals.PICK_VECTOR__INTERSECTION_DISTANCE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Intersected Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntersectedNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PickVector_intersectedNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PickVector_intersectedNode_feature", "_UI_PickVector_type"),
				 PrimitivesPackage.Literals.PICK_VECTOR__INTERSECTED_NODE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Node Types In Intersection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodeTypesInIntersectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PickVector_nodeTypesInIntersection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PickVector_nodeTypesInIntersection_feature", "_UI_PickVector_type"),
				 PrimitivesPackage.Literals.PICK_VECTOR__NODE_TYPES_IN_INTERSECTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relative Intersection Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelativeIntersectionPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PickVector_relativeIntersectionPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PickVector_relativeIntersectionPosition_feature", "_UI_PickVector_type"),
				 PrimitivesPackage.Literals.PICK_VECTOR__RELATIVE_INTERSECTION_POSITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Absolute Intersection Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbsoluteIntersectionPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PickVector_absoluteIntersectionPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PickVector_absoluteIntersectionPosition_feature", "_UI_PickVector_type"),
				 PrimitivesPackage.Literals.PICK_VECTOR__ABSOLUTE_INTERSECTION_POSITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Node Types To Exclude From Intersection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodeTypesToExcludeFromIntersectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PickVector_nodeTypesToExcludeFromIntersection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PickVector_nodeTypesToExcludeFromIntersection_feature", "_UI_PickVector_type"),
				 PrimitivesPackage.Literals.PICK_VECTOR__NODE_TYPES_TO_EXCLUDE_FROM_INTERSECTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns PickVector.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PickVector"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PickVector)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_PickVector_type") :
			getString("_UI_PickVector_type") + " " + label;
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

		switch (notification.getFeatureID(PickVector.class)) {
			case PrimitivesPackage.PICK_VECTOR__INTERSECTION_DISTANCE:
			case PrimitivesPackage.PICK_VECTOR__RELATIVE_INTERSECTION_POSITION:
			case PrimitivesPackage.PICK_VECTOR__ABSOLUTE_INTERSECTION_POSITION:
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
