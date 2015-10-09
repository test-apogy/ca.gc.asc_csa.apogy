/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data25d;

import org.eclipse.symphony.common.geometry.data.Coordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinates25 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represent "2.5 D" geometry where u and v are the independent variables and w the dependent variable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data25d.Coordinates25D#getU <em>U</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data25d.Coordinates25D#getV <em>V</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data25d.Coordinates25D#getW <em>W</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.geometry.data25d.Data25dPackage#getCoordinates25D()
 * @model
 * @generated
 */
public interface Coordinates25D extends Coordinates {
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
	 * @see org.eclipse.symphony.common.geometry.data25d.Data25dPackage#getCoordinates25D_U()
	 * @model unique="false"
	 * @generated
	 */
	double getU();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data25d.Coordinates25D#getU <em>U</em>}' attribute.
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
	 * @see org.eclipse.symphony.common.geometry.data25d.Data25dPackage#getCoordinates25D_V()
	 * @model unique="false"
	 * @generated
	 */
	double getV();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data25d.Coordinates25D#getV <em>V</em>}' attribute.
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
	 * @see org.eclipse.symphony.common.geometry.data25d.Data25dPackage#getCoordinates25D_W()
	 * @model unique="false"
	 * @generated
	 */
	double getW();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data25d.Coordinates25D#getW <em>W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>W</em>' attribute.
	 * @see #getW()
	 * @generated
	 */
	void setW(double value);

} // Coordinates25D
