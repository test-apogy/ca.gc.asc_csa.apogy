/**
 * Canadian Space Agency 2008.
 *
 * $Id: SphericalCoordinates.java,v 1.2.4.2 2015/05/21 15:50:48 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d;

import ca.gc.space.mrt.geometry.data.Coordinates;


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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

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
	 * @model
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
	 * @model
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
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #setR(double)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getSphericalCoordinates_R()
	 * @model default="0"
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
