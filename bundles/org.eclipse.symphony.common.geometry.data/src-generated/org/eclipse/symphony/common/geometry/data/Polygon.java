/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data.Polygon#getVertices <em>Vertices</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.geometry.data.DataPackage#getPolygon()
 * @model
 * @generated
 */
public interface Polygon<T extends Coordinates> extends EObject {
	/**
	 * Returns the value of the '<em><b>Vertices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertices</em>' reference list.
	 * @see org.eclipse.symphony.common.geometry.data.DataPackage#getPolygon_Vertices()
	 * @model resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList<T> getVertices();

} // Polygon
