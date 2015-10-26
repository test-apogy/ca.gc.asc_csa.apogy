/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d;

import javax.vecmath.Vector3d;

import org.eclipse.symphony.common.geometry.data.Polygon;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Polygon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.CartesianPolygon#getSurface <em>Surface</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.CartesianPolygon#getNormal <em>Normal</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.CartesianPolygon#getCentroid <em>Centroid</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getCartesianPolygon()
 * @model
 * @generated
 */
public interface CartesianPolygon extends Polygon<CartesianPositionCoordinates> {
	/**
	 * Returns the value of the '<em><b>Surface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface</em>' attribute.
	 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getCartesianPolygon_Surface()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getSurface();

	/**
	 * Returns the value of the '<em><b>Normal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal</em>' attribute.
	 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getCartesianPolygon_Normal()
	 * @model unique="false" dataType="org.eclipse.symphony.common.geometry.data3d.Vector3d" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Vector3d getNormal();

	/**
	 * Returns the value of the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centroid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centroid</em>' reference.
	 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getCartesianPolygon_Centroid()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	CartesianPositionCoordinates getCentroid();

} // CartesianPolygon
