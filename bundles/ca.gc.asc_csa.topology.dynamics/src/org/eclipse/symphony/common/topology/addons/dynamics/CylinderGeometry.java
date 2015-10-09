/**
 * <copyright>
 * </copyright>
 *
 * $Id: CylinderGeometry.java,v 1.6.2.2 2015/02/03 20:01:37 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.addons.dynamics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cylinder Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The cylinder is defined by its radius (width) and its length (from one side to the other).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.CylinderGeometry#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.CylinderGeometry#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getCylinderGeometry()
 * @model
 * @generated
 */
public interface CylinderGeometry extends Geometry {
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
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getCylinderGeometry_Radius()
	 * @model
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.CylinderGeometry#getRadius <em>Radius</em>}' attribute.
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
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getCylinderGeometry_Length()
	 * @model
	 * @generated
	 */
	double getLength();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.CylinderGeometry#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(double value);

} // CylinderGeometry
