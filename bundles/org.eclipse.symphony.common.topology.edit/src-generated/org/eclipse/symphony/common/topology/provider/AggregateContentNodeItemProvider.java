/**
 * <copyright>
 * </copyright>
 *
 * $Id: AggregateContentNodeItemProvider.java,v 1.12.2.2 2015/02/03 20:01:35 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.math.MathFactory;
import org.eclipse.symphony.common.topology.AggregateContentNode;
import org.eclipse.symphony.common.topology.TopologyFactory;
import org.eclipse.symphony.common.topology.TopologyPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.common.topology.AggregateContentNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AggregateContentNodeItemProvider
	extends ContentNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateContentNodeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT);
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
	 * This returns AggregateContentNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AggregateContentNode"));
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
		AggregateContentNode<?> aggregateContentNode = (AggregateContentNode<?>)object;
		String label = null;
		if(aggregateContentNode.getNodeId() != null && aggregateContentNode.getNodeId().length() > 0)
		{
			label = aggregateContentNode.getNodeId();
		}
		else
		{
			label = getString("_UI_AggregateContentNode_type");
		}
		
		return label;		
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

		switch (notification.getFeatureID(AggregateContentNode.class)) {
			case TopologyPackage.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT:
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
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 TopologyFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 TopologyFactory.eINSTANCE.createLeaf()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 TopologyFactory.eINSTANCE.createURLNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 TopologyFactory.eINSTANCE.createCADNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 TopologyFactory.eINSTANCE.createContentNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 TopologyFactory.eINSTANCE.createReferencedContentNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 TopologyFactory.eINSTANCE.createAggregateContentNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 TopologyFactory.eINSTANCE.createGroupNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 TopologyFactory.eINSTANCE.createReferencedGroupNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 TopologyFactory.eINSTANCE.createAggregateGroupNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 TopologyFactory.eINSTANCE.createPositionNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 TopologyFactory.eINSTANCE.createRotationNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 TopologyFactory.eINSTANCE.createTransformNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 TopologyFactory.eINSTANCE.createPickAndPlaceNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 TopologyFactory.eINSTANCE.createTopologyFacade()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 MathFactory.eINSTANCE.createMatrix4x4()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 MathFactory.eINSTANCE.createMathFacade()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 MathFactory.eINSTANCE.createMatrix3x3()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 MathFactory.eINSTANCE.createTuple3d()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 MathFactory.eINSTANCE.createPolynomial()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 MathFactory.eINSTANCE.createMathIO()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 EcoreFactory.eINSTANCE.createEAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 EcoreFactory.eINSTANCE.createEAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 EcoreFactory.eINSTANCE.createEClass()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 EcoreFactory.eINSTANCE.createEDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 EcoreFactory.eINSTANCE.createEEnum()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 EcoreFactory.eINSTANCE.createEEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 EcoreFactory.eINSTANCE.createEFactory()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 EcoreFactory.eINSTANCE.createEObject()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 EcoreFactory.eINSTANCE.createEOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 EcoreFactory.eINSTANCE.createEPackage()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 EcoreFactory.eINSTANCE.createEParameter()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 EcoreFactory.eINSTANCE.createEReference()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 EcoreFactory.eINSTANCE.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 EcoreFactory.eINSTANCE.createEGenericType()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
				 EcoreFactory.eINSTANCE.createETypeParameter()));
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
			childFeature == TopologyPackage.Literals.CONTENT_NODE__CONTENT ||
			childFeature == TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
