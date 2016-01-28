/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.math;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple3d</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.Tuple3d#getX <em>X</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.Tuple3d#getY <em>Y</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.Tuple3d#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage#getTuple3d()
 * @model
 * @generated
 */
public interface Tuple3d extends EObject {
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
	 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage#getTuple3d_X()
	 * @model unique="false"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.math.Tuple3d#getX <em>X</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage#getTuple3d_Y()
	 * @model unique="false"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.math.Tuple3d#getY <em>Y</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage#getTuple3d_Z()
	 * @model unique="false"
	 * @generated
	 */
	double getZ();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.math.Tuple3d#getZ <em>Z</em>}' attribute.
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
	 * @model dataType="ca.gc.asc_csa.apogy.common.math.VecmathTuple3d" unique="false"
	 * @generated
	 */
	javax.vecmath.Tuple3d asTuple3d();

} // Tuple3d
