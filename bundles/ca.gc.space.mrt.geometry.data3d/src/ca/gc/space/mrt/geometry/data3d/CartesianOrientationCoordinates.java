/**
 * Canadian Space Agency 2008.
 *
 * $Id: CartesianOrientationCoordinates.java,v 1.2.4.2 2015/05/21 15:50:48 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d;

import ca.gc.space.mrt.geometry.data.Coordinates;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Orientation Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.CartesianOrientationCoordinates#getXRotation <em>XRotation</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.CartesianOrientationCoordinates#getYRotation <em>YRotation</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.CartesianOrientationCoordinates#getZRotation <em>ZRotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getCartesianOrientationCoordinates()
 * @model
 * @generated
 */
public interface CartesianOrientationCoordinates extends Coordinates {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

	/**
	 * Returns the value of the '<em><b>XRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRotation</em>' attribute.
	 * @see #setXRotation(double)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getCartesianOrientationCoordinates_XRotation()
	 * @model required="true"
	 * @generated
	 */
	double getXRotation();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.CartesianOrientationCoordinates#getXRotation <em>XRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRotation</em>' attribute.
	 * @see #getXRotation()
	 * @generated
	 */
	void setXRotation(double value);

	/**
	 * Returns the value of the '<em><b>YRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YRotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YRotation</em>' attribute.
	 * @see #setYRotation(double)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getCartesianOrientationCoordinates_YRotation()
	 * @model required="true"
	 * @generated
	 */
	double getYRotation();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.CartesianOrientationCoordinates#getYRotation <em>YRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YRotation</em>' attribute.
	 * @see #getYRotation()
	 * @generated
	 */
	void setYRotation(double value);

	/**
	 * Returns the value of the '<em><b>ZRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZRotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZRotation</em>' attribute.
	 * @see #setZRotation(double)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getCartesianOrientationCoordinates_ZRotation()
	 * @model required="true"
	 * @generated
	 */
	double getZRotation();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.CartesianOrientationCoordinates#getZRotation <em>ZRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZRotation</em>' attribute.
	 * @see #getZRotation()
	 * @generated
	 */
	void setZRotation(double value);

} // CartesianOrientationCoordinates
