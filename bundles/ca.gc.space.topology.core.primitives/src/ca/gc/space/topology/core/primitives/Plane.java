/**
 * <copyright>
 * </copyright>
 *
 * $Id: Plane.java,v 1.3.2.2 2015/02/03 20:01:31 rlarcheveque Exp $
 */
package ca.gc.space.topology.core.primitives;

import org.eclipse.symphony.common.math.Tuple3d;

import ca.gc.space.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.topology.core.primitives.Plane#getV0 <em>V0</em>}</li>
 *   <li>{@link ca.gc.space.topology.core.primitives.Plane#getV1 <em>V1</em>}</li>
 *   <li>{@link ca.gc.space.topology.core.primitives.Plane#getWidth <em>Width</em>}</li>
 *   <li>{@link ca.gc.space.topology.core.primitives.Plane#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.topology.core.primitives.PrimitivesPackage#getPlane()
 * @model
 * @generated
 */
public interface Plane extends Node {
	/**
	 * Returns the value of the '<em><b>V0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V0</em>' containment reference.
	 * @see #setV0(Tuple3d)
	 * @see ca.gc.space.topology.core.primitives.PrimitivesPackage#getPlane_V0()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getV0();

	/**
	 * Sets the value of the '{@link ca.gc.space.topology.core.primitives.Plane#getV0 <em>V0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V0</em>' containment reference.
	 * @see #getV0()
	 * @generated
	 */
	void setV0(Tuple3d value);

	/**
	 * Returns the value of the '<em><b>V1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V1</em>' containment reference.
	 * @see #setV1(Tuple3d)
	 * @see ca.gc.space.topology.core.primitives.PrimitivesPackage#getPlane_V1()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getV1();

	/**
	 * Sets the value of the '{@link ca.gc.space.topology.core.primitives.Plane#getV1 <em>V1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V1</em>' containment reference.
	 * @see #getV1()
	 * @generated
	 */
	void setV1(Tuple3d value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see ca.gc.space.topology.core.primitives.PrimitivesPackage#getPlane_Width()
	 * @model
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link ca.gc.space.topology.core.primitives.Plane#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see ca.gc.space.topology.core.primitives.PrimitivesPackage#getPlane_Height()
	 * @model
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link ca.gc.space.topology.core.primitives.Plane#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

} // Plane
