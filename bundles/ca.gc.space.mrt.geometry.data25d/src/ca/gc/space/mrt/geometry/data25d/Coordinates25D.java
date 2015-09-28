/**
 * Canadian Space Agency 2007.
 *
 * $Id: Coordinates25D.java,v 1.4.4.2 2015/05/21 15:51:20 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data25d;

import ca.gc.space.mrt.geometry.data.Coordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinates25 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represent "2.5 D" geometry where u and v are the independant variables and w the dependant variable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data25d.Coordinates25D#getU <em>U</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data25d.Coordinates25D#getV <em>V</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data25d.Coordinates25D#getW <em>W</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data25d.Data25dPackage#getCoordinates25D()
 * @model
 * @generated
 */
public interface Coordinates25D extends Coordinates {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * Returns the value of the '<em><b>U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>U</em>' attribute.
	 * @see #setU(double)
	 * @see ca.gc.space.mrt.geometry.data25d.Data25dPackage#getCoordinates25D_U()
	 * @model
	 * @generated
	 */
	double getU();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data25d.Coordinates25D#getU <em>U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>U</em>' attribute.
	 * @see #getU()
	 * @generated
	 */
	void setU(double value);

	/**
	 * Returns the value of the '<em><b>V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V</em>' attribute.
	 * @see #setV(double)
	 * @see ca.gc.space.mrt.geometry.data25d.Data25dPackage#getCoordinates25D_V()
	 * @model
	 * @generated
	 */
	double getV();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data25d.Coordinates25D#getV <em>V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V</em>' attribute.
	 * @see #getV()
	 * @generated
	 */
	void setV(double value);

	/**
	 * Returns the value of the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>W</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>W</em>' attribute.
	 * @see #setW(double)
	 * @see ca.gc.space.mrt.geometry.data25d.Data25dPackage#getCoordinates25D_W()
	 * @model
	 * @generated
	 */
	double getW();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data25d.Coordinates25D#getW <em>W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>W</em>' attribute.
	 * @see #getW()
	 * @generated
	 */
	void setW(double value);

} // Coordinates25D
