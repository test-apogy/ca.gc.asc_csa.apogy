/**
 * <copyright>
 * </copyright>
 *
 * $Id: CapsuleGeometry.java,v 1.4.2.2 2015/02/03 20:01:37 rlarcheveque Exp $
 */
package ca.gc.asc_csa.topology.dynamics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capsule Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The capsule is like a cylinder with rounded extremities. The shape is defined by the radius of the capsule (width) and its length (from one rounded extremity to the other).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.CapsuleGeometry#getRadius <em>Radius</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.CapsuleGeometry#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getCapsuleGeometry()
 * @model
 * @generated
 */
public interface CapsuleGeometry extends Geometry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyrights Canadian Space Agency 2012.";

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getCapsuleGeometry_Radius()
	 * @model
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.CapsuleGeometry#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

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
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getCapsuleGeometry_Length()
	 * @model
	 * @generated
	 */
	double getLength();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.CapsuleGeometry#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(double value);

} // CapsuleGeometry
