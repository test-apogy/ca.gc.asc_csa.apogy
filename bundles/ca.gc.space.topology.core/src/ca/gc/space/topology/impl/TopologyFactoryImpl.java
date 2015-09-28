/**
 * <copyright>
 * </copyright>
 *
 * $Id: TopologyFactoryImpl.java,v 1.15.2.3 2015/02/03 20:01:30 rlarcheveque Exp $
 */
package ca.gc.space.topology.impl;

import ca.gc.space.topology.*;
import java.net.URL;

import javax.vecmath.Tuple3d;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.space.topology.AggregateContentNode;
import ca.gc.space.topology.AggregateGroupNode;
import ca.gc.space.topology.CADNode;
import ca.gc.space.topology.ContentNode;
import ca.gc.space.topology.GroupNode;
import ca.gc.space.topology.Leaf;
import ca.gc.space.topology.Link;
import ca.gc.space.topology.PickAndPlaceNode;
import ca.gc.space.topology.PositionNode;
import ca.gc.space.topology.ReferencedContentNode;
import ca.gc.space.topology.ReferencedGroupNode;
import ca.gc.space.topology.RotationNode;
import ca.gc.space.topology.TopologyFacade;
import ca.gc.space.topology.TopologyFactory;
import ca.gc.space.topology.TopologyPackage;
import ca.gc.space.topology.TransformNode;
import ca.gc.space.topology.URLNode;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class TopologyFactoryImpl extends EFactoryImpl implements
		TopologyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static TopologyFactory init() {
		try {
			TopologyFactory theTopologyFactory = (TopologyFactory)EPackage.Registry.INSTANCE.getEFactory(TopologyPackage.eNS_URI);
			if (theTopologyFactory != null) {
				return theTopologyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TopologyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public TopologyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TopologyPackage.TRANSFORM_NODE: return createTransformNode();
			case TopologyPackage.TOPOLOGY_FACADE: return createTopologyFacade();
			case TopologyPackage.CONTENT_NODE: return createContentNode();
			case TopologyPackage.POSITION_NODE: return createPositionNode();
			case TopologyPackage.ROTATION_NODE: return createRotationNode();
			case TopologyPackage.LEAF: return createLeaf();
			case TopologyPackage.PICK_AND_PLACE_NODE: return createPickAndPlaceNode();
			case TopologyPackage.REFERENCED_CONTENT_NODE: return createReferencedContentNode();
			case TopologyPackage.AGGREGATE_CONTENT_NODE: return createAggregateContentNode();
			case TopologyPackage.URL_NODE: return createURLNode();
			case TopologyPackage.REFERENCED_GROUP_NODE: return createReferencedGroupNode();
			case TopologyPackage.LINK: return createLink();
			case TopologyPackage.AGGREGATE_GROUP_NODE: return createAggregateGroupNode();
			case TopologyPackage.CAD_NODE: return createCADNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TopologyPackage.URL:
				return createURLFromString(eDataType, initialValue);
			case TopologyPackage.OBJECT:
				return createObjectFromString(eDataType, initialValue);
			case TopologyPackage.DOUBLE_ARRAY:
				return createDoubleArrayFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TopologyPackage.URL:
				return convertURLToString(eDataType, instanceValue);
			case TopologyPackage.OBJECT:
				return convertObjectToString(eDataType, instanceValue);
			case TopologyPackage.DOUBLE_ARRAY:
				return convertDoubleArrayToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PositionNode createPositionNode() {
		PositionNodeImpl positionNode = new PositionNodeImpl();
		return positionNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RotationNode createRotationNode() {
		RotationNodeImpl rotationNode = new RotationNodeImpl();
		return rotationNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Leaf createLeaf() {
		LeafImpl leaf = new LeafImpl();
		return leaf;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PickAndPlaceNode createPickAndPlaceNode() {
		PickAndPlaceNodeImpl pickAndPlaceNode = new PickAndPlaceNodeImpl();
		return pickAndPlaceNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public <T> ReferencedContentNode<T> createReferencedContentNode() {
		ReferencedContentNodeImpl<T> referencedContentNode = new ReferencedContentNodeImpl<T>();
		return referencedContentNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public <T> AggregateContentNode<T> createAggregateContentNode() {
		AggregateContentNodeImpl<T> aggregateContentNode = new AggregateContentNodeImpl<T>();
		return aggregateContentNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public URLNode createURLNode() {
		URLNodeImpl urlNode = new URLNodeImpl();
		return urlNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencedGroupNode createReferencedGroupNode() {
		ReferencedGroupNodeImpl referencedGroupNode = new ReferencedGroupNodeImpl();
		return referencedGroupNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	public CADNode createCADNode() {
		CADNodeImpl cadNode = new CADNodeImpl();
		return cadNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TransformNode createTransformNode() {
		TransformNodeImpl transformNode = new TransformNodeImpl();
		return transformNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyFacade createTopologyFacade() {
		TopologyFacadeImpl topologyFacade = new TopologyFacadeImpl();
		return topologyFacade;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public <T> ContentNode<T> createContentNode() {
		ContentNodeImpl<T> contentNode = new ContentNodeImpl<T>();
		return contentNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Object createObjectFromString(EDataType eDataType,
			String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double[] createDoubleArrayFromString(EDataType eDataType,
			String initialValue) {
		return (double[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleArrayToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public URL createURLFromString(EDataType eDataType, String initialValue) {
		return (URL)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURLToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Tuple3d createTuple3dFromString(EDataType eDataType,
			String initialValue) {
		return (Tuple3d) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyPackage getTopologyPackage() {
		return (TopologyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TopologyPackage getPackage() {
		return TopologyPackage.eINSTANCE;
	}

	@Override
	public GroupNode createGroupNode() {
		return createAggregateGroupNode();
	}

} // TopologyFactoryImpl
