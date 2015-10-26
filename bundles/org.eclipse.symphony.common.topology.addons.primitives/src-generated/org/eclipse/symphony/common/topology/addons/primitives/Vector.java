/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.primitives;

import javax.vecmath.Point3d;

import org.eclipse.symphony.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.primitives.Vector#getXRotation <em>XRotation</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.primitives.Vector#getYRotation <em>YRotation</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.primitives.Vector#getZRotation <em>ZRotation</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.primitives.Vector#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.primitives.Vector#getEndPoint <em>End Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.topology.addons.primitives.PrimitivesPackage#getVector()
 * @model
 * @generated
 */
public interface Vector extends Node {
	/**
	 * Returns the value of the '<em><b>XRotation</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRotation</em>' attribute.
	 * @see #setXRotation(double)
	 * @see org.eclipse.symphony.common.topology.addons.primitives.PrimitivesPackage#getVector_XRotation()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getXRotation();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.primitives.Vector#getXRotation <em>XRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRotation</em>' attribute.
	 * @see #getXRotation()
	 * @generated
	 */
	void setXRotation(double value);

	/**
	 * Returns the value of the '<em><b>YRotation</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YRotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YRotation</em>' attribute.
	 * @see #setYRotation(double)
	 * @see org.eclipse.symphony.common.topology.addons.primitives.PrimitivesPackage#getVector_YRotation()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getYRotation();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.primitives.Vector#getYRotation <em>YRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YRotation</em>' attribute.
	 * @see #getYRotation()
	 * @generated
	 */
	void setYRotation(double value);

	/**
	 * Returns the value of the '<em><b>ZRotation</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZRotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZRotation</em>' attribute.
	 * @see #setZRotation(double)
	 * @see org.eclipse.symphony.common.topology.addons.primitives.PrimitivesPackage#getVector_ZRotation()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getZRotation();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.primitives.Vector#getZRotation <em>ZRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZRotation</em>' attribute.
	 * @see #getZRotation()
	 * @generated
	 */
	void setZRotation(double value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(double)
	 * @see org.eclipse.symphony.common.topology.addons.primitives.PrimitivesPackage#getVector_Length()
	 * @model unique="false"
	 * @generated
	 */
	double getLength();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.primitives.Vector#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(double value);

	/**
	 * Returns the value of the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point</em>' attribute.
	 * @see org.eclipse.symphony.common.topology.addons.primitives.PrimitivesPackage#getVector_EndPoint()
	 * @model unique="false" dataType="org.eclipse.symphony.common.topology.addons.primitives.Point3d" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Point3d getEndPoint();

} // Vector
