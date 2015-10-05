/**
 * <copyright>
 * </copyright>
 *
 * $Id: TopologyFacade.java,v 1.9.2.3 2015/02/03 20:01:29 rlarcheveque Exp $
 */
package ca.gc.space.topology;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import ca.gc.space.topology.impl.TopologyFacadeImpl;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.topology.TopologyPackage#getTopologyFacade()
 * @model
 * @generated
 */
public interface TopologyFacade extends EObject {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T> ContentNode<T> createContentNode(T content);

	public static final TopologyFacade INSTANCE = TopologyFacadeImpl
			.getInstance();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PositionNode createPositionNode(double x, double y, double z);

	/**
	 * <!-- begin-user-doc --> Creates a rotation node with the rotation order
	 * x*y*z
	 * 
	 * @param x
	 *            the rotation around the x axis, in radians.
	 * @param y
	 *            the rotation around the y axis, in radians.
	 * @param z
	 *            the rotation around the z axis, in radians. <!-- end-user-doc
	 *            -->
	 * @model
	 * @generated
	 */
	RotationNode createRotationNodeXYZ(double x, double y, double z);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.math.Matrix4d"
	 * @generated
	 */
	Matrix4d expressNodeInRootFrame(Node node);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.math.Matrix4d"
	 * @generated
	 */
	Matrix4d expressRootInNodeFrame(Node node);

	/**
	 * <!-- begin-user-doc --> Compute the transformation to express sourceFrame
	 * into targetFrame.
	 * <p>
	 * For example
	 * <ul>
	 * <li>sourceFrame could be laser scanner</li>
	 * <li>targetFrame could be the sonar sensor</li>
	 * </ul>
	 * This method can be used to express the point cloud coming out of the
	 * laser scanner in the frame of the sonar sensor.
	 * </p>
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.math.Matrix4d"
	 * @generated
	 */
	Matrix4d expressInFrame(Node sourceFrame, Node targetFrame);

	/**
	 * <!-- begin-user-doc --> Creates a rotation node with the rotation order
	 * y*z*x
	 * 
	 * @param x
	 *            the rotation around the x axis, in radians.
	 * @param y
	 *            the rotation around the y axis, in radians.
	 * @param z
	 *            the rotation around the z axis, in radians.<!-- end-user-doc
	 *            -->
	 * 
	 * @model
	 * @generated
	 */
	RotationNode createRotationNodeYZX(double x, double y, double z);

	/**
	 * <!-- begin-user-doc --> Creates a rotation node with the rotation order
	 * z*y*x
	 * 
	 * @param x
	 *            the rotation around the x axis, in radians.
	 * @param y
	 *            the rotation around the y axis, in radians.
	 * @param z
	 *            the rotation around the z axis, in radians. <!-- end-user-doc
	 *            -->
	 * 
	 * @model
	 * @generated
	 */
	RotationNode createRotationNodeZYX(double x, double y, double z);

	/**
	 * <!-- begin-user-doc --> Creates a transformation node with the rotation
	 * order x*y*z
	 * 
	 * @param tx
	 *            the x translation.
	 * @param ty
	 *            the y translation.
	 * @param tz
	 *            the z translation.
	 * @param rx
	 *            the rotation around the x axis, in radians.
	 * @param ry
	 *            the rotation around the y axis, in radians.
	 * @param rz
	 *            the rotation around the z axis, in radians. <!-- end-user-doc
	 *            -->
	 * 
	 * @model
	 * @generated
	 */
	TransformNode createTransformNodeXYZ(double tx, double ty, double tz,
			double rx, double ry, double rz);

	/**
	 * <!-- begin-user-doc --> Creates a transformation node with the rotation
	 * order y*z*x
	 * 
	 * @param tx
	 *            the x translation.
	 * @param ty
	 *            the y translation.
	 * @param tz
	 *            the z translation.
	 * @param rx
	 *            the rotation around the x axis, in radians.
	 * @param ry
	 *            the rotation around the y axis, in radians.
	 * @param rz
	 *            the rotation around the z axis, in radians. <!-- end-user-doc
	 *            -->
	 * 
	 * @model
	 * @generated
	 */
	TransformNode createTransformNodeYZX(double tx, double ty, double tz,
			double rx, double ry, double rz);

	/**
	 * <!-- begin-user-doc --> Creates a transformation node with the rotation
	 * order z*y*x
	 * 
	 * @param tx
	 *            the x translation.
	 * @param ty
	 *            the y translation.
	 * @param tz
	 *            the z translation.
	 * @param rx
	 *            the rotation around the x axis, in radians.
	 * @param ry
	 *            the rotation around the y axis, in radians.
	 * @param rz
	 *            the rotation around the z axis, in radians. <!-- end-user-doc
	 *            -->
	 * 
	 * @model
	 * @generated
	 */
	TransformNode createTransformNodeZYX(double tx, double ty, double tz,
			double rx, double ry, double rz);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model matrixDataType="org.eclipse.symphony.common.math.Matrix4d"
	 * @generated
	 */
	TransformNode createTransformNode(Matrix4d matrix);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model matrixDataType="org.eclipse.symphony.common.math.Matrix4d"
	 * @generated
	 */
	PickAndPlaceNode createPickAndPlaceNode(Matrix4d matrix);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printTopology(Node node);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T> ReferencedContentNode<T> createReferencedContentNode(T content);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T> AggregateContentNode<T> createAggregateContentNode(T content);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Link createLink(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Node> findNodesByDescription(String description, Node topology);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Node> findNodesByID(String id, Node topology);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Node> findNodesByType(EClass clazz, Node topology);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Node findRoot(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double getEuclidianDistance(Node fromNode, Node toNode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double getGeodesicDistance(Node fromNode, Node toNode);

} // TopologyFacade
