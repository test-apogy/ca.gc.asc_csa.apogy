/**
 * <copyright>
 * </copyright>
 *
 * $Id: SphereGeometry.java,v 1.6.2.2 2015/02/03 20:01:37 rlarcheveque Exp $
 */
package ca.gc.asc_csa.topology.dynamics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sphere Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The sphere geometry is defined by its radius.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.SphereGeometry#getRadius <em>Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getSphereGeometry()
 * @model
 * @generated
 */
public interface SphereGeometry extends Geometry {
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
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getSphereGeometry_Radius()
	 * @model
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.SphereGeometry#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

} // SphereGeometry
