/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage
 * @generated
 */
public interface Symphony__CommonTopologyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__CommonTopologyFactory eINSTANCE = org.eclipse.symphony.common.topology.impl.Symphony__CommonTopologyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Leaf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaf</em>'.
	 * @generated
	 */
	Leaf createLeaf();

	/**
	 * Returns a new object of class '<em>URL Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>URL Node</em>'.
	 * @generated
	 */
	URLNode createURLNode();

	/**
	 * Returns a new object of class '<em>CAD Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAD Node</em>'.
	 * @generated
	 */
	CADNode createCADNode();

	/**
	 * Returns a new object of class '<em>Content Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Node</em>'.
	 * @generated
	 */
	<T> ContentNode<T> createContentNode();

	/**
	 * Returns a new object of class '<em>Referenced Content Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referenced Content Node</em>'.
	 * @generated
	 */
	<T> ReferencedContentNode<T> createReferencedContentNode();

	/**
	 * Returns a new object of class '<em>Aggregate Content Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregate Content Node</em>'.
	 * @generated
	 */
	<T> AggregateContentNode<T> createAggregateContentNode();

	/**
	 * Returns a new object of class '<em>Group Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Node</em>'.
	 * @generated
	 */
	GroupNode createGroupNode();

	/**
	 * Returns a new object of class '<em>Referenced Group Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referenced Group Node</em>'.
	 * @generated
	 */
	ReferencedGroupNode createReferencedGroupNode();

	/**
	 * Returns a new object of class '<em>Aggregate Group Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregate Group Node</em>'.
	 * @generated
	 */
	AggregateGroupNode createAggregateGroupNode();

	/**
	 * Returns a new object of class '<em>Position Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position Node</em>'.
	 * @generated
	 */
	PositionNode createPositionNode();

	/**
	 * Returns a new object of class '<em>Rotation Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotation Node</em>'.
	 * @generated
	 */
	RotationNode createRotationNode();

	/**
	 * Returns a new object of class '<em>Transform Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transform Node</em>'.
	 * @generated
	 */
	TransformNode createTransformNode();

	/**
	 * Returns a new object of class '<em>Pick And Place Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pick And Place Node</em>'.
	 * @generated
	 */
	PickAndPlaceNode createPickAndPlaceNode();

	/**
	 * Returns a new object of class '<em>Topology Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topology Facade</em>'.
	 * @generated
	 */
	TopologyFacade createTopologyFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__CommonTopologyPackage getSymphony__CommonTopologyPackage();

} //Symphony__CommonTopologyFactory
