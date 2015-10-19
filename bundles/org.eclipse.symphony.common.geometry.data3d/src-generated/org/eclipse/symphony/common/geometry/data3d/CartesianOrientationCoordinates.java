/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d;

import org.eclipse.symphony.common.geometry.data.Coordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Orientation Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates#getXRotation <em>XRotation</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates#getYRotation <em>YRotation</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates#getZRotation <em>ZRotation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.geometry.data3d.Data3dPackage#getCartesianOrientationCoordinates()
 * @model
 * @generated
 */
public interface CartesianOrientationCoordinates extends Coordinates {
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
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dPackage#getCartesianOrientationCoordinates_XRotation()
	 * @model unique="false"
	 * @generated
	 */
	double getXRotation();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates#getXRotation <em>XRotation</em>}' attribute.
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
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dPackage#getCartesianOrientationCoordinates_YRotation()
	 * @model unique="false"
	 * @generated
	 */
	double getYRotation();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates#getYRotation <em>YRotation</em>}' attribute.
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
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dPackage#getCartesianOrientationCoordinates_ZRotation()
	 * @model unique="false"
	 * @generated
	 */
	double getZRotation();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates#getZRotation <em>ZRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZRotation</em>' attribute.
	 * @see #getZRotation()
	 * @generated
	 */
	void setZRotation(double value);

} // CartesianOrientationCoordinates
