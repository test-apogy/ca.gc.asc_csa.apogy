/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.impl;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.common.topology.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonTopologyFactoryImpl extends EFactoryImpl implements Symphony__CommonTopologyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__CommonTopologyFactory init() {
		try {
			Symphony__CommonTopologyFactory theSymphony__CommonTopologyFactory = (Symphony__CommonTopologyFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CommonTopologyPackage.eNS_URI);
			if (theSymphony__CommonTopologyFactory != null) {
				return theSymphony__CommonTopologyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CommonTopologyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonTopologyFactoryImpl() {
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
			case Symphony__CommonTopologyPackage.LINK: return createLink();
			case Symphony__CommonTopologyPackage.LEAF: return createLeaf();
			case Symphony__CommonTopologyPackage.URL_NODE: return createURLNode();
			case Symphony__CommonTopologyPackage.CAD_NODE: return createCADNode();
			case Symphony__CommonTopologyPackage.CONTENT_NODE: return createContentNode();
			case Symphony__CommonTopologyPackage.REFERENCED_CONTENT_NODE: return createReferencedContentNode();
			case Symphony__CommonTopologyPackage.AGGREGATE_CONTENT_NODE: return createAggregateContentNode();
			case Symphony__CommonTopologyPackage.GROUP_NODE: return createGroupNode();
			case Symphony__CommonTopologyPackage.REFERENCED_GROUP_NODE: return createReferencedGroupNode();
			case Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE: return createAggregateGroupNode();
			case Symphony__CommonTopologyPackage.POSITION_NODE: return createPositionNode();
			case Symphony__CommonTopologyPackage.ROTATION_NODE: return createRotationNode();
			case Symphony__CommonTopologyPackage.TRANSFORM_NODE: return createTransformNode();
			case Symphony__CommonTopologyPackage.PICK_AND_PLACE_NODE: return createPickAndPlaceNode();
			case Symphony__CommonTopologyPackage.SYMPHONY_COMMON_TOPOLOGY_FACADE: return createSymphony__CommonTopologyFacade();
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
			case Symphony__CommonTopologyPackage.MATRIX4D:
				return createMatrix4dFromString(eDataType, initialValue);
			case Symphony__CommonTopologyPackage.ECLASS:
				return createEClassFromString(eDataType, initialValue);
			case Symphony__CommonTopologyPackage.INODE_VISITOR:
				return createINodeVisitorFromString(eDataType, initialValue);
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
			case Symphony__CommonTopologyPackage.MATRIX4D:
				return convertMatrix4dToString(eDataType, instanceValue);
			case Symphony__CommonTopologyPackage.ECLASS:
				return convertEClassToString(eDataType, instanceValue);
			case Symphony__CommonTopologyPackage.INODE_VISITOR:
				return convertINodeVisitorToString(eDataType, instanceValue);
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
	public Symphony__CommonTopologyFacade createSymphony__CommonTopologyFacade() {
		Symphony__CommonTopologyFacadeImpl symphony__CommonTopologyFacade = new Symphony__CommonTopologyFacadeImpl();
		return symphony__CommonTopologyFacade;
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
	public Symphony__CommonTopologyPackage getSymphony__CommonTopologyPackage() {
		return (Symphony__CommonTopologyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__CommonTopologyPackage getPackage() {
		return Symphony__CommonTopologyPackage.eINSTANCE;
	}

} //Symphony__CommonTopologyFactoryImpl
