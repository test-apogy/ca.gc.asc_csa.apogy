/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.CylinderGeometry#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.CylinderGeometry#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getCylinderGeometry()
 * @model
 * @generated
 */
public interface CylinderGeometry extends Geometry {
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
	 * @model unique="false"
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
	 * @model unique="false"
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
