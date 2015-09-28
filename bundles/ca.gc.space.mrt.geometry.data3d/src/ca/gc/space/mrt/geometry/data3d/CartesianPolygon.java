/**
 * Canadian Space Agency 2008.
 *
 * $Id: CartesianPolygon.java,v 1.3.4.2 2015/05/21 15:50:48 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d;

import javax.vecmath.Vector3d;

import ca.gc.space.mrt.geometry.data.Polygon;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

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
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
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
	 * @model dataType="ca.gc.space.mrt.geometry.data.Vector3d" required="true" transient="true" changeable="false" volatile="true" derived="true"
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
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	CartesianPositionCoordinates getCentroid();

} // CartesianPolygon
