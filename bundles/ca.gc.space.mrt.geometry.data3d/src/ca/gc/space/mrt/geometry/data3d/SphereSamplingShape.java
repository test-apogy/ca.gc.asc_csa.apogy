/**
 * Canadian Space Agency 2008.
 *
 * $Id: SphereSamplingShape.java,v 1.2.4.2 2015/05/21 15:50:48 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d;

import ca.gc.space.mrt.geometry.data.CoordinatesSamplingShape;
import ca.gc.space.mrt.geometry.data.PolygonSamplingShape;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sphere Sampling Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.SphereSamplingShape#getRadius <em>Radius</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.SphereSamplingShape#getCenter <em>Center</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.SphereSamplingShape#isIncludeJustTouching <em>Include Just Touching</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getSphereSamplingShape()
 * @model
 * @generated
 */
public interface SphereSamplingShape<PolygonType extends CartesianPolygon> extends CoordinatesSamplingShape<CartesianPositionCoordinates>, PolygonSamplingShape<CartesianPositionCoordinates, PolygonType>
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getSphereSamplingShape_Radius()
	 * @model default="1.0"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.SphereSamplingShape#getRadius <em>Radius</em>}' attribute.
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
	 * @return the value of the '<em>Center</em>' reference.
	 * @see #setCenter(CartesianPositionCoordinates)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getSphereSamplingShape_Center()
	 * @model
	 * @generated
	 */
	CartesianPositionCoordinates getCenter();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.SphereSamplingShape#getCenter <em>Center</em>}' reference.
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
	 * @return the value of the '<em>Include Just Touching</em>' attribute.
	 * @see #setIncludeJustTouching(boolean)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getSphereSamplingShape_IncludeJustTouching()
	 * @model default="true"
	 * @generated
	 */
	boolean isIncludeJustTouching();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.SphereSamplingShape#isIncludeJustTouching <em>Include Just Touching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Just Touching</em>' attribute.
	 * @see #isIncludeJustTouching()
	 * @generated
	 */
	void setIncludeJustTouching(boolean value);

} // SphereSamplingShape
