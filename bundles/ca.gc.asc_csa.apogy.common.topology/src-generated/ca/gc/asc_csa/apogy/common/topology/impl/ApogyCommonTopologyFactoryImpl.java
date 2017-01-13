package ca.gc.asc_csa.apogy.common.topology.impl;
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

import javax.vecmath.Matrix4d;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.common.topology.*;
import java.util.Collection;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonTopologyFactoryImpl extends EFactoryImpl implements ApogyCommonTopologyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCommonTopologyFactory init() {
		try {
			ApogyCommonTopologyFactory theApogyCommonTopologyFactory = (ApogyCommonTopologyFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonTopologyPackage.eNS_URI);
			if (theApogyCommonTopologyFactory != null) {
				return theApogyCommonTopologyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonTopologyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonTopologyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ApogyCommonTopologyPackage.LINK: return createLink();
			case ApogyCommonTopologyPackage.LEAF: return createLeaf();
			case ApogyCommonTopologyPackage.URL_NODE: return createURLNode();
			case ApogyCommonTopologyPackage.CAD_NODE: return createCADNode();
			case ApogyCommonTopologyPackage.CONTENT_NODE: return createContentNode();
			case ApogyCommonTopologyPackage.REFERENCED_CONTENT_NODE: return createReferencedContentNode();
			case ApogyCommonTopologyPackage.AGGREGATE_CONTENT_NODE: return createAggregateContentNode();
			case ApogyCommonTopologyPackage.GROUP_NODE: return createGroupNode();
			case ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE: return createReferencedGroupNode();
			case ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE: return createAggregateGroupNode();
			case ApogyCommonTopologyPackage.POSITION_NODE: return createPositionNode();
			case ApogyCommonTopologyPackage.ROTATION_NODE: return createRotationNode();
			case ApogyCommonTopologyPackage.TRANSFORM_NODE: return createTransformNode();
			case ApogyCommonTopologyPackage.PICK_AND_PLACE_NODE: return createPickAndPlaceNode();
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE: return createApogyCommonTopologyFacade();
			case ApogyCommonTopologyPackage.NODE_FILTER_CHAIN: return createNodeFilterChain();
			case ApogyCommonTopologyPackage.NODE_TYPE_FILTER: return createNodeTypeFilter();
			case ApogyCommonTopologyPackage.NODE_ID_FILTER: return createNodeIdFilter();
			case ApogyCommonTopologyPackage.NODE_DESCRIPTION_FILTER: return createNodeDescriptionFilter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyCommonTopologyPackage.FILTER_CHAIN_TYPE:
				return createFilterChainTypeFromString(eDataType, initialValue);
			case ApogyCommonTopologyPackage.MATRIX4D:
				return createMatrix4dFromString(eDataType, initialValue);
			case ApogyCommonTopologyPackage.ECLASS:
				return createEClassFromString(eDataType, initialValue);
			case ApogyCommonTopologyPackage.INODE_VISITOR:
				return createINodeVisitorFromString(eDataType, initialValue);
			case ApogyCommonTopologyPackage.COLLECTION:
				return createCollectionFromString(eDataType, initialValue);
			case ApogyCommonTopologyPackage.LIST:
				return createListFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyCommonTopologyPackage.FILTER_CHAIN_TYPE:
				return convertFilterChainTypeToString(eDataType, instanceValue);
			case ApogyCommonTopologyPackage.MATRIX4D:
				return convertMatrix4dToString(eDataType, instanceValue);
			case ApogyCommonTopologyPackage.ECLASS:
				return convertEClassToString(eDataType, instanceValue);
			case ApogyCommonTopologyPackage.INODE_VISITOR:
				return convertINodeVisitorToString(eDataType, instanceValue);
			case ApogyCommonTopologyPackage.COLLECTION:
				return convertCollectionToString(eDataType, instanceValue);
			case ApogyCommonTopologyPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Leaf createLeaf() {
		LeafImpl leaf = new LeafImpl();
		return leaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLNode createURLNode() {
		URLNodeImpl urlNode = new URLNodeImpl();
		return urlNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CADNode createCADNode() {
		CADNodeImpl cadNode = new CADNodeImpl();
		return cadNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> ContentNode<T> createContentNode() {
		ContentNodeImpl<T> contentNode = new ContentNodeImpl<T>();
		return contentNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> ReferencedContentNode<T> createReferencedContentNode() {
		ReferencedContentNodeImpl<T> referencedContentNode = new ReferencedContentNodeImpl<T>();
		return referencedContentNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> AggregateContentNode<T> createAggregateContentNode() {
		AggregateContentNodeImpl<T> aggregateContentNode = new AggregateContentNodeImpl<T>();
		return aggregateContentNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupNode createGroupNode() {
		GroupNodeImpl groupNode = new GroupNodeImpl();
		return groupNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencedGroupNode createReferencedGroupNode() {
		ReferencedGroupNodeImpl referencedGroupNode = new ReferencedGroupNodeImpl();
		return referencedGroupNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateGroupNode createAggregateGroupNode() {
		AggregateGroupNodeImpl aggregateGroupNode = new AggregateGroupNodeImpl();
		return aggregateGroupNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionNode createPositionNode() {
		PositionNodeImpl positionNode = new PositionNodeImpl();
		return positionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotationNode createRotationNode() {
		RotationNodeImpl rotationNode = new RotationNodeImpl();
		return rotationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformNode createTransformNode() {
		TransformNodeImpl transformNode = new TransformNodeImpl();
		return transformNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PickAndPlaceNode createPickAndPlaceNode() {
		PickAndPlaceNodeImpl pickAndPlaceNode = new PickAndPlaceNodeImpl();
		return pickAndPlaceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonTopologyFacade createApogyCommonTopologyFacade() {
		ApogyCommonTopologyFacadeImpl apogyCommonTopologyFacade = new ApogyCommonTopologyFacadeImpl();
		return apogyCommonTopologyFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeFilterChain createNodeFilterChain() {
		NodeFilterChainImpl nodeFilterChain = new NodeFilterChainImpl();
		return nodeFilterChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTypeFilter createNodeTypeFilter() {
		NodeTypeFilterImpl nodeTypeFilter = new NodeTypeFilterImpl();
		return nodeTypeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeIdFilter createNodeIdFilter() {
		NodeIdFilterImpl nodeIdFilter = new NodeIdFilterImpl();
		return nodeIdFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeDescriptionFilter createNodeDescriptionFilter() {
		NodeDescriptionFilterImpl nodeDescriptionFilter = new NodeDescriptionFilterImpl();
		return nodeDescriptionFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterChainType createFilterChainTypeFromString(EDataType eDataType, String initialValue) {
		FilterChainType result = FilterChainType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterChainTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix4d createMatrix4dFromString(EDataType eDataType, String initialValue) {
		return (Matrix4d)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMatrix4dToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass createEClassFromString(EDataType eDataType, String initialValue) {
		return (EClass)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEClassToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INodeVisitor createINodeVisitorFromString(EDataType eDataType, String initialValue) {
		return (INodeVisitor)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertINodeVisitorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> createCollectionFromString(EDataType eDataType, String initialValue) {
		return (Collection<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<?> createListFromString(EDataType eDataType, String initialValue) {
		return (List<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonTopologyPackage getApogyCommonTopologyPackage() {
		return (ApogyCommonTopologyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCommonTopologyPackage getPackage() {
		return ApogyCommonTopologyPackage.eINSTANCE;
	}

} //ApogyCommonTopologyFactoryImpl
