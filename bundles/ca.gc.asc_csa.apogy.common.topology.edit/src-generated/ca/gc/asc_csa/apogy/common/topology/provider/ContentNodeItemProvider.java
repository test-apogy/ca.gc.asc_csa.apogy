package ca.gc.asc_csa.apogy.common.topology.provider;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFactory;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFactory;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.common.topology.ContentNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentNodeItemProvider
	extends LeafItemProvider {
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
			childrenFeatures.add(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT);
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
			case ApogyCommonTopologyPackage.CONTENT_NODE__CONTENT:
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
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 ApogyCommonTopologyFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 ApogyCommonTopologyFactory.eINSTANCE.createLeaf()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 ApogyCommonTopologyFactory.eINSTANCE.createURLNode()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 ApogyCommonTopologyFactory.eINSTANCE.createCADNode()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 ApogyCommonTopologyFactory.eINSTANCE.createContentNode()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 ApogyCommonTopologyFactory.eINSTANCE.createReferencedContentNode()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 ApogyCommonTopologyFactory.eINSTANCE.createAggregateContentNode()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 ApogyCommonTopologyFactory.eINSTANCE.createGroupNode()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 ApogyCommonTopologyFactory.eINSTANCE.createReferencedGroupNode()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 ApogyCommonTopologyFactory.eINSTANCE.createAggregateGroupNode()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 ApogyCommonTopologyFactory.eINSTANCE.createPositionNode()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 ApogyCommonTopologyFactory.eINSTANCE.createRotationNode()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 ApogyCommonTopologyFactory.eINSTANCE.createTransformNode()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 ApogyCommonTopologyFactory.eINSTANCE.createPickAndPlaceNode()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 ApogyCommonTopologyFactory.eINSTANCE.createApogyCommonTopologyFacade()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 EcoreFactory.eINSTANCE.createEAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 EcoreFactory.eINSTANCE.createEAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 EcoreFactory.eINSTANCE.createEClass()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 EcoreFactory.eINSTANCE.createEDataType()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 EcoreFactory.eINSTANCE.createEEnum()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 EcoreFactory.eINSTANCE.createEEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 EcoreFactory.eINSTANCE.createEFactory()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 EcoreFactory.eINSTANCE.createEObject()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 EcoreFactory.eINSTANCE.createEOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 EcoreFactory.eINSTANCE.createEPackage()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 EcoreFactory.eINSTANCE.createEParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 EcoreFactory.eINSTANCE.createEReference()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 EcoreFactory.eINSTANCE.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 EcoreFactory.eINSTANCE.createEGenericType()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 EcoreFactory.eINSTANCE.createETypeParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 ApogyCommonMathFactory.eINSTANCE.createTuple3d()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 ApogyCommonMathFactory.eINSTANCE.createMatrix3x3()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 ApogyCommonMathFactory.eINSTANCE.createMatrix4x4()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 ApogyCommonMathFactory.eINSTANCE.createPolynomial()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 ApogyCommonMathFactory.eINSTANCE.createApogyCommonMathFacade()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
				 ApogyCommonMathFactory.eINSTANCE.createMathIO()));
	}

}
