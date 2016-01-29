/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d;

import javax.vecmath.Vector3d;

import ca.gc.asc_csa.apogy.common.geometry.data.Polygon;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Polygon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A polygon having Cartesian position as its vertices.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon#getSurface <em>Surface</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon#getNormal <em>Normal</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon#getCentroid <em>Centroid</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getCartesianPolygon()
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
	 * <!-- begin-model-doc -->
	 * *
	 * The surface of the polygon.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surface</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getCartesianPolygon_Surface()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' apogy_units='m\262'"
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
	 * <!-- begin-model-doc -->
	 * *
	 * The normal of the polygon.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Normal</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getCartesianPolygon_Normal()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.common.geometry.data3d.Vector3d" transient="true" changeable="false" volatile="true" derived="true"
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
	 * <!-- begin-model-doc -->
	 * *
	 * The centroid of the polygon.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Centroid</em>' reference.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getCartesianPolygon_Centroid()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	CartesianPositionCoordinates getCentroid();

} // CartesianPolygon