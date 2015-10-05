/**
 * <copyright>
 * </copyright>
 *
 * $Id: ContentNodeItemProvider.java,v 1.20.2.2 2015/02/03 20:01:35 rlarcheveque Exp $
 */
package ca.gc.space.topology.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.math.MathFactory;

import ca.gc.space.topology.ContentNode;
import ca.gc.space.topology.TopologyFactory;
import ca.gc.space.topology.TopologyPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.space.topology.ContentNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentNodeItemProvider
	extends LeafItemProvider
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
	public ContentNodeItemProvider(AdapterFactory adapterFactory) {
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

			addContentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Content feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContentNode_content_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentNode_content_feature", "_UI_ContentNode_type"),
				 TopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_TOPOLOGY_INFORMATIONPropertyCategory"),
				 null));
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
			childrenFeatures.add(TopologyPackage.Literals.CONTENT_NODE__CONTENT);
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
	 * This returns ContentNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContentNode"));
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
		ContentNode<?> contentNode = (ContentNode<?>)object;
		String label = null;
		if(contentNode.getNodeId() != null && contentNode.getNodeId().length() > 0)
		{
			label = contentNode.getNodeId();
		}
		else
		{
			label = getString("_UI_ContentNode_type");
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

		switch (notification.getFeatureID(ContentNode.class)) {
			case TopologyPackage.CONTENT_NODE__CONTENT:
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
				(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 TopologyFactory.eINSTANCE.createAggregateGroupNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 TopologyFactory.eINSTANCE.createPositionNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 TopologyFactory.eINSTANCE.createTransformNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 TopologyFactory.eINSTANCE.createTopologyFacade()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 TopologyFactory.eINSTANCE.createLeaf()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 TopologyFactory.eINSTANCE.createContentNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 TopologyFactory.eINSTANCE.createRotationNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 TopologyFactory.eINSTANCE.createPickAndPlaceNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 TopologyFactory.eINSTANCE.createReferencedContentNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 TopologyFactory.eINSTANCE.createAggregateContentNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 TopologyFactory.eINSTANCE.createURLNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 TopologyFactory.eINSTANCE.createReferencedGroupNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 TopologyFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 TopologyFactory.eINSTANCE.createCADNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 MathFactory.eINSTANCE.createMatrix4x4()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 MathFactory.eINSTANCE.createMathFacade()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 MathFactory.eINSTANCE.createMatrix3x3()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 MathFactory.eINSTANCE.createTuple3d()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 MathFactory.eINSTANCE.createPolynomial()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 MathFactory.eINSTANCE.createMathIO()));
	}

}
