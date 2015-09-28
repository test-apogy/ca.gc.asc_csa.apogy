/**
 * Canadian Space Agency 2008.
 *
 * $Id: CartesianPositionCoordinates.java,v 1.2.4.2 2015/05/21 15:50:48 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d;

import javax.vecmath.Point3d;

import ca.gc.space.mrt.geometry.data.Coordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Position Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates#getX <em>X</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates#getY <em>Y</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates#getZ <em>Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getCartesianPositionCoordinates()
 * @model
 * @generated
 */
public interface CartesianPositionCoordinates extends Coordinates {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getCartesianPositionCoordinates_X()
	 * @model required="true"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getCartesianPositionCoordinates_Y()
	 * @model required="true"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #setZ(double)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getCartesianPositionCoordinates_Z()
	 * @model required="true"
	 * @generated
	 */
	double getZ();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.Point3d"
	 * @generated
	 */
	Point3d asPoint3d();

} // CartesianPositionCoordinates
