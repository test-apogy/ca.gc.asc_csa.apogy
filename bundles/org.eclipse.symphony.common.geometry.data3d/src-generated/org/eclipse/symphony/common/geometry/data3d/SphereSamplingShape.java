/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d;

import org.eclipse.symphony.common.geometry.data.CoordinatesSamplingShape;
import org.eclipse.symphony.common.geometry.data.PolygonSamplingShape;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sphere Sampling Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A spherical sampling shape.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.SphereSamplingShape#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.SphereSamplingShape#getCenter <em>Center</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.SphereSamplingShape#isIncludeJustTouching <em>Include Just Touching</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getSphereSamplingShape()
 * @model
 * @generated
 */
public interface SphereSamplingShape<PolygonType extends CartesianPolygon> extends CoordinatesSamplingShape<CartesianPositionCoordinates>, PolygonSamplingShape<CartesianPositionCoordinates, PolygonType> {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The radius of the sampling sphere, in meters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getSphereSamplingShape_Radius()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' symphony_units='m'"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.SphereSamplingShape#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

	/**
	 * Returns the value of the '<em><b>Center</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Center</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The position of the center of the sphere.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Center</em>' reference.
	 * @see #setCenter(CartesianPositionCoordinates)
	 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getSphereSamplingShape_Center()
	 * @model
	 * @generated
	 */
	CartesianPositionCoordinates getCenter();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.SphereSamplingShape#getCenter <em>Center</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center</em>' reference.
	 * @see #getCenter()
	 * @generated
	 */
	void setCenter(CartesianPositionCoordinates value);

	/**
	 * Returns the value of the '<em><b>Include Just Touching</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Just Touching</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Whether or not to include polygon that have a vertex on the boundary.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Just Touching</em>' attribute.
	 * @see #setIncludeJustTouching(boolean)
	 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getSphereSamplingShape_IncludeJustTouching()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isIncludeJustTouching();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.SphereSamplingShape#isIncludeJustTouching <em>Include Just Touching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Just Touching</em>' attribute.
	 * @see #isIncludeJustTouching()
	 * @generated
	 */
	void setIncludeJustTouching(boolean value);

} // SphereSamplingShape
