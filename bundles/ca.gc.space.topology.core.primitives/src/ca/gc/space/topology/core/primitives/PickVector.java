/**
 */
package ca.gc.space.topology.core.primitives;

import ca.gc.space.topology.Node;
import javax.vecmath.Point3d;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pick Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.topology.core.primitives.PickVector#getNodeTypesInIntersection <em>Node Types In Intersection</em>}</li>
 *   <li>{@link ca.gc.space.topology.core.primitives.PickVector#getIntersectionDistance <em>Intersection Distance</em>}</li>
 *   <li>{@link ca.gc.space.topology.core.primitives.PickVector#getIntersectedNode <em>Intersected Node</em>}</li>
 *   <li>{@link ca.gc.space.topology.core.primitives.PickVector#getRelativeIntersectionPosition <em>Relative Intersection Position</em>}</li>
 *   <li>{@link ca.gc.space.topology.core.primitives.PickVector#getAbsoluteIntersectionPosition <em>Absolute Intersection Position</em>}</li>
 *   <li>{@link ca.gc.space.topology.core.primitives.PickVector#getNodeTypesToExcludeFromIntersection <em>Node Types To Exclude From Intersection</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.topology.core.primitives.PrimitivesPackage#getPickVector()
 * @model
 * @generated
 */
public interface PickVector extends Vector {
	/**
	 * Returns the value of the '<em><b>Intersection Distance</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intersection Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current shortest intersection distance between the ray and a node of one of the included type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intersection Distance</em>' attribute.
	 * @see #setIntersectionDistance(double)
	 * @see ca.gc.space.topology.core.primitives.PrimitivesPackage#getPickVector_IntersectionDistance()
	 * @model default="-1"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='m'"
	 * @generated
	 */
	double getIntersectionDistance();

	/**
	 * Sets the value of the '{@link ca.gc.space.topology.core.primitives.PickVector#getIntersectionDistance <em>Intersection Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intersection Distance</em>' attribute.
	 * @see #getIntersectionDistance()
	 * @generated
	 */
	void setIntersectionDistance(double value);

	/**
	 * Returns the value of the '<em><b>Intersected Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intersected Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intersected Node</em>' reference.
	 * @see #setIntersectedNode(Node)
	 * @see ca.gc.space.topology.core.primitives.PrimitivesPackage#getPickVector_IntersectedNode()
	 * @model
	 * @generated
	 */
	Node getIntersectedNode();

	/**
	 * Sets the value of the '{@link ca.gc.space.topology.core.primitives.PickVector#getIntersectedNode <em>Intersected Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intersected Node</em>' reference.
	 * @see #getIntersectedNode()
	 * @generated
	 */
	void setIntersectedNode(Node value);

	/**
	 * Returns the value of the '<em><b>Node Types In Intersection</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Types In Intersection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Types In Intersection</em>' reference list.
	 * @see ca.gc.space.topology.core.primitives.PrimitivesPackage#getPickVector_NodeTypesInIntersection()
	 * @model
	 * @generated
	 */
	EList<EClass> getNodeTypesInIntersection();

	/**
	 * Returns the value of the '<em><b>Relative Intersection Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Intersection Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Intersection Position</em>' attribute.
	 * @see #setRelativeIntersectionPosition(Point3d)
	 * @see ca.gc.space.topology.core.primitives.PrimitivesPackage#getPickVector_RelativeIntersectionPosition()
	 * @model dataType="ca.gc.space.topology.core.primitives.Point3d"
	 * @generated
	 */
	Point3d getRelativeIntersectionPosition();

	/**
	 * Sets the value of the '{@link ca.gc.space.topology.core.primitives.PickVector#getRelativeIntersectionPosition <em>Relative Intersection Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Intersection Position</em>' attribute.
	 * @see #getRelativeIntersectionPosition()
	 * @generated
	 */
	void setRelativeIntersectionPosition(Point3d value);

	/**
	 * Returns the value of the '<em><b>Absolute Intersection Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Intersection Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Intersection Position</em>' attribute.
	 * @see #setAbsoluteIntersectionPosition(Point3d)
	 * @see ca.gc.space.topology.core.primitives.PrimitivesPackage#getPickVector_AbsoluteIntersectionPosition()
	 * @model dataType="ca.gc.space.topology.core.primitives.Point3d"
	 * @generated
	 */
	Point3d getAbsoluteIntersectionPosition();

	/**
	 * Sets the value of the '{@link ca.gc.space.topology.core.primitives.PickVector#getAbsoluteIntersectionPosition <em>Absolute Intersection Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute Intersection Position</em>' attribute.
	 * @see #getAbsoluteIntersectionPosition()
	 * @generated
	 */
	void setAbsoluteIntersectionPosition(Point3d value);

	/**
	 * Returns the value of the '<em><b>Node Types To Exclude From Intersection</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Types To Exclude From Intersection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Types To Exclude From Intersection</em>' reference list.
	 * @see ca.gc.space.topology.core.primitives.PrimitivesPackage#getPickVector_NodeTypesToExcludeFromIntersection()
	 * @model
	 * @generated
	 */
	EList<EClass> getNodeTypesToExcludeFromIntersection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isNodeIncludedInIntersection(Node node);

} // PickVector
