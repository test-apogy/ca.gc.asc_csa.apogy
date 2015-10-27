/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.primitives;

import org.eclipse.symphony.common.topology.AggregateGroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sphere Primitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.primitives.SpherePrimitive#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.topology.addons.primitives.Symphony__CommonTopologyAddonsPrimitivesPackage#getSpherePrimitive()
 * @model
 * @generated
 */
public interface SpherePrimitive extends AggregateGroupNode {
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
	 * @see org.eclipse.symphony.common.topology.addons.primitives.Symphony__CommonTopologyAddonsPrimitivesPackage#getSpherePrimitive_Radius()
	 * @model unique="false"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.primitives.SpherePrimitive#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

} // SpherePrimitive
