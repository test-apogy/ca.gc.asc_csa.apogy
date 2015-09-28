/**
 * <copyright>
 * </copyright>
 *
 * $Id: TopologyFactory.java,v 1.8.2.2 2015/02/03 20:01:29 rlarcheveque Exp $
 */
package ca.gc.space.topology;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see ca.gc.space.topology.TopologyPackage
 * @generated
 */
public interface TopologyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	TopologyFactory eINSTANCE = ca.gc.space.topology.impl.TopologyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Position Node</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Position Node</em>'.
	 * @generated
	 */
	PositionNode createPositionNode();

	/**
	 * Returns a new object of class '<em>Rotation Node</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Rotation Node</em>'.
	 * @generated
	 */
	RotationNode createRotationNode();

	/**
	 * Returns a new object of class '<em>Leaf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaf</em>'.
	 * @generated
	 */
	Leaf createLeaf();

	/**
	 * Returns a new object of class '<em>Pick And Place Node</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Pick And Place Node</em>'.
	 * @generated
	 */
	PickAndPlaceNode createPickAndPlaceNode();

	/**
	 * Returns a new object of class '<em>Referenced Content Node</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Referenced Content Node</em>'.
	 * @generated
	 */
	<T> ReferencedContentNode<T> createReferencedContentNode();

	/**
	 * Returns a new object of class '<em>Aggregate Content Node</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Aggregate Content Node</em>'.
	 * @generated
	 */
	<T> AggregateContentNode<T> createAggregateContentNode();

	/**
	 * Returns a new object of class '<em>URL Node</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>URL Node</em>'.
	 * @generated
	 */
	URLNode createURLNode();

	/**
	 * Returns a new object of class '<em>Referenced Group Node</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Referenced Group Node</em>'.
	 * @generated
	 */
	ReferencedGroupNode createReferencedGroupNode();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Aggregate Group Node</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Aggregate Group Node</em>'.
	 * @generated
	 */
	AggregateGroupNode createAggregateGroupNode();

	/**
	 * Returns a new object of class '<em>CAD Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAD Node</em>'.
	 * @generated
	 */
	CADNode createCADNode();

	/**
	 * Returns a new object of class '<em>Transform Node</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Transform Node</em>'.
	 * @generated
	 */
	TransformNode createTransformNode();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	TopologyFacade createTopologyFacade();

	/**
	 * Returns a new object of class '<em>Content Node</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Content Node</em>'.
	 * @generated
	 */
	<T> ContentNode<T> createContentNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TopologyPackage getTopologyPackage();

	/**
	 * 
	 * <dl>
	 * <dt>Name:</dt>
	 * <dd>createGroupNode</dd>
	 * <dt>Description:</dt>
	 * <dd>creates a group node. This method is present for legacy reasons only.
	 * This method creates an {@link AggregateGroupNode}.</dd>
	 * <dt>Pre-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>None</li>
	 * </ul>
	 * </dd>
	 * <dt>Post-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>None</li>
	 * </ul>
	 * </dd>
	 * </dl>
	 * 
	 * @return an instance of {@link AggregateGroupNode}.
	 * @deprecated Use {@link #createAggregateContentNode()} or
	 *             {@link #createReferencedContentNode()}
	 */
	GroupNode createGroupNode();

} // TopologyFactory
