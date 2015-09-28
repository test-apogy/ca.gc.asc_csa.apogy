/**
 * Canadian Space Agency 2008.
 */
package ca.gc.space.mrt.geometry.data3d;

import ca.gc.space.mrt.geometry.data.CoordinatesSamplingShape;
import ca.gc.space.mrt.geometry.data.PolygonSamplingShape;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cube Sampling Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.CubeSamplingShape#isIncludeJustTouching <em>Include Just Touching</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.CubeSamplingShape#getCorner1 <em>Corner1</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.CubeSamplingShape#getCorner2 <em>Corner2</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getCubeSamplingShape()
 * @model
 * @generated
 */
public interface CubeSamplingShape<PolygonType extends CartesianPolygon> extends CoordinatesSamplingShape<CartesianPositionCoordinates>, PolygonSamplingShape<CartesianPositionCoordinates, PolygonType> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

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
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getCubeSamplingShape_IncludeJustTouching()
	 * @model default="true"
	 * @generated
	 */
	boolean isIncludeJustTouching();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.CubeSamplingShape#isIncludeJustTouching <em>Include Just Touching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Just Touching</em>' attribute.
	 * @see #isIncludeJustTouching()
	 * @generated
	 */
	void setIncludeJustTouching(boolean value);

	/**
	 * Returns the value of the '<em><b>Corner1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corner1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corner1</em>' reference.
	 * @see #setCorner1(CartesianPositionCoordinates)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getCubeSamplingShape_Corner1()
	 * @model
	 * @generated
	 */
	CartesianPositionCoordinates getCorner1();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.CubeSamplingShape#getCorner1 <em>Corner1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corner1</em>' reference.
	 * @see #getCorner1()
	 * @generated
	 */
	void setCorner1(CartesianPositionCoordinates value);

	/**
	 * Returns the value of the '<em><b>Corner2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corner2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corner2</em>' reference.
	 * @see #setCorner2(CartesianPositionCoordinates)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getCubeSamplingShape_Corner2()
	 * @model
	 * @generated
	 */
	CartesianPositionCoordinates getCorner2();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.CubeSamplingShape#getCorner2 <em>Corner2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corner2</em>' reference.
	 * @see #getCorner2()
	 * @generated
	 */
	void setCorner2(CartesianPositionCoordinates value);

} // CubeSamplingShape
