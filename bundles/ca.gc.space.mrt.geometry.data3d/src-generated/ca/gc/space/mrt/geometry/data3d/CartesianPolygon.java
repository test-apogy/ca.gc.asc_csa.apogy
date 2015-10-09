/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.space.mrt.geometry.data3d;

import javax.vecmath.Vector3d;

import org.eclipse.symphony.common.geometry.data.Polygon;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Polygon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.CartesianPolygon#getSurface <em>Surface</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.CartesianPolygon#getNormal <em>Normal</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.CartesianPolygon#getCentroid <em>Centroid</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getCartesianPolygon()
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
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getCartesianPolygon_Surface()
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
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getCartesianPolygon_Normal()
	 * @model unique="false" dataType="ca.gc.space.mrt.geometry.data3d.Vector3d" transient="true" changeable="false" volatile="true" derived="true"
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
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getCartesianPolygon_Centroid()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	CartesianPositionCoordinates getCentroid();

} // CartesianPolygon
