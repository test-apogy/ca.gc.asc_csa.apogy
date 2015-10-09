/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.space.mrt.geometry.data3d;

import org.eclipse.symphony.common.geometry.data.Coordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spherical Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.SphericalCoordinates#getPhi <em>Phi</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.SphericalCoordinates#getTheta <em>Theta</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.SphericalCoordinates#getR <em>R</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getSphericalCoordinates()
 * @model
 * @generated
 */
public interface SphericalCoordinates extends Coordinates {
	/**
	 * Returns the value of the '<em><b>Phi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phi</em>' attribute.
	 * @see #setPhi(double)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getSphericalCoordinates_Phi()
	 * @model unique="false"
	 * @generated
	 */
	double getPhi();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.SphericalCoordinates#getPhi <em>Phi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phi</em>' attribute.
	 * @see #getPhi()
	 * @generated
	 */
	void setPhi(double value);

	/**
	 * Returns the value of the '<em><b>Theta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Theta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theta</em>' attribute.
	 * @see #setTheta(double)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getSphericalCoordinates_Theta()
	 * @model unique="false"
	 * @generated
	 */
	double getTheta();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.SphericalCoordinates#getTheta <em>Theta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theta</em>' attribute.
	 * @see #getTheta()
	 * @generated
	 */
	void setTheta(double value);

	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #setR(double)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getSphericalCoordinates_R()
	 * @model unique="false"
	 * @generated
	 */
	double getR();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.SphericalCoordinates#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #getR()
	 * @generated
	 */
	void setR(double value);

} // SphericalCoordinates
