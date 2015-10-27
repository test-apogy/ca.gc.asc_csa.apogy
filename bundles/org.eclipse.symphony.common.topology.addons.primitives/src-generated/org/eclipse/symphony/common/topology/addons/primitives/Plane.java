/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.primitives;

import org.eclipse.symphony.common.math.Tuple3d;

import org.eclipse.symphony.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.primitives.Plane#getV0 <em>V0</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.primitives.Plane#getV1 <em>V1</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.primitives.Plane#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.primitives.Plane#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.topology.addons.primitives.Symphony__CommonTopologyAddonsPrimitivesPackage#getPlane()
 * @model
 * @generated
 */
public interface Plane extends Node {
	/**
	 * Returns the value of the '<em><b>V0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V0</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V0</em>' containment reference.
	 * @see #setV0(Tuple3d)
	 * @see org.eclipse.symphony.common.topology.addons.primitives.Symphony__CommonTopologyAddonsPrimitivesPackage#getPlane_V0()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getV0();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.primitives.Plane#getV0 <em>V0</em>}' containment reference.
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
	 * If the meaning of the '<em>V1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V1</em>' containment reference.
	 * @see #setV1(Tuple3d)
	 * @see org.eclipse.symphony.common.topology.addons.primitives.Symphony__CommonTopologyAddonsPrimitivesPackage#getPlane_V1()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getV1();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.primitives.Plane#getV1 <em>V1</em>}' containment reference.
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
	 * @see org.eclipse.symphony.common.topology.addons.primitives.Symphony__CommonTopologyAddonsPrimitivesPackage#getPlane_Width()
	 * @model unique="false"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.primitives.Plane#getWidth <em>Width</em>}' attribute.
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
	 * @see org.eclipse.symphony.common.topology.addons.primitives.Symphony__CommonTopologyAddonsPrimitivesPackage#getPlane_Height()
	 * @model unique="false"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.primitives.Plane#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

} // Plane
