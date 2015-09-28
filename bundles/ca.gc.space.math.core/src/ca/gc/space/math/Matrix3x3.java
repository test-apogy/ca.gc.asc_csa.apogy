/**
 * <copyright>
 * </copyright>
 *
 */
package ca.gc.space.math;

import javax.vecmath.Matrix3d;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix3x3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.math.Matrix3x3#getM00 <em>M00</em>}</li>
 *   <li>{@link ca.gc.space.math.Matrix3x3#getM01 <em>M01</em>}</li>
 *   <li>{@link ca.gc.space.math.Matrix3x3#getM02 <em>M02</em>}</li>
 *   <li>{@link ca.gc.space.math.Matrix3x3#getM10 <em>M10</em>}</li>
 *   <li>{@link ca.gc.space.math.Matrix3x3#getM11 <em>M11</em>}</li>
 *   <li>{@link ca.gc.space.math.Matrix3x3#getM12 <em>M12</em>}</li>
 *   <li>{@link ca.gc.space.math.Matrix3x3#getM20 <em>M20</em>}</li>
 *   <li>{@link ca.gc.space.math.Matrix3x3#getM21 <em>M21</em>}</li>
 *   <li>{@link ca.gc.space.math.Matrix3x3#getM22 <em>M22</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.math.MathPackage#getMatrix3x3()
 * @model
 * @generated
 */
public interface Matrix3x3 extends EObject {
	/**
	 * Returns the value of the '<em><b>M00</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>M00</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M00</em>' attribute.
	 * @see #setM00(double)
	 * @see ca.gc.space.math.MathPackage#getMatrix3x3_M00()
	 * @model default="1.0"
	 * @generated
	 */
	double getM00();

	/**
	 * Sets the value of the '{@link ca.gc.space.math.Matrix3x3#getM00 <em>M00</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M00</em>' attribute.
	 * @see #getM00()
	 * @generated
	 */
	void setM00(double value);

	/**
	 * Returns the value of the '<em><b>M01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>M01</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M01</em>' attribute.
	 * @see #setM01(double)
	 * @see ca.gc.space.math.MathPackage#getMatrix3x3_M01()
	 * @model
	 * @generated
	 */
	double getM01();

	/**
	 * Sets the value of the '{@link ca.gc.space.math.Matrix3x3#getM01 <em>M01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M01</em>' attribute.
	 * @see #getM01()
	 * @generated
	 */
	void setM01(double value);

	/**
	 * Returns the value of the '<em><b>M02</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>M02</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M02</em>' attribute.
	 * @see #setM02(double)
	 * @see ca.gc.space.math.MathPackage#getMatrix3x3_M02()
	 * @model
	 * @generated
	 */
	double getM02();

	/**
	 * Sets the value of the '{@link ca.gc.space.math.Matrix3x3#getM02 <em>M02</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M02</em>' attribute.
	 * @see #getM02()
	 * @generated
	 */
	void setM02(double value);

	/**
	 * Returns the value of the '<em><b>M10</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>M10</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M10</em>' attribute.
	 * @see #setM10(double)
	 * @see ca.gc.space.math.MathPackage#getMatrix3x3_M10()
	 * @model
	 * @generated
	 */
	double getM10();

	/**
	 * Sets the value of the '{@link ca.gc.space.math.Matrix3x3#getM10 <em>M10</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M10</em>' attribute.
	 * @see #getM10()
	 * @generated
	 */
	void setM10(double value);

	/**
	 * Returns the value of the '<em><b>M11</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>M11</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M11</em>' attribute.
	 * @see #setM11(double)
	 * @see ca.gc.space.math.MathPackage#getMatrix3x3_M11()
	 * @model default="1.0"
	 * @generated
	 */
	double getM11();

	/**
	 * Sets the value of the '{@link ca.gc.space.math.Matrix3x3#getM11 <em>M11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M11</em>' attribute.
	 * @see #getM11()
	 * @generated
	 */
	void setM11(double value);

	/**
	 * Returns the value of the '<em><b>M12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>M12</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M12</em>' attribute.
	 * @see #setM12(double)
	 * @see ca.gc.space.math.MathPackage#getMatrix3x3_M12()
	 * @model
	 * @generated
	 */
	double getM12();

	/**
	 * Sets the value of the '{@link ca.gc.space.math.Matrix3x3#getM12 <em>M12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M12</em>' attribute.
	 * @see #getM12()
	 * @generated
	 */
	void setM12(double value);

	/**
	 * Returns the value of the '<em><b>M20</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>M20</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M20</em>' attribute.
	 * @see #setM20(double)
	 * @see ca.gc.space.math.MathPackage#getMatrix3x3_M20()
	 * @model
	 * @generated
	 */
	double getM20();

	/**
	 * Sets the value of the '{@link ca.gc.space.math.Matrix3x3#getM20 <em>M20</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M20</em>' attribute.
	 * @see #getM20()
	 * @generated
	 */
	void setM20(double value);

	/**
	 * Returns the value of the '<em><b>M21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>M21</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M21</em>' attribute.
	 * @see #setM21(double)
	 * @see ca.gc.space.math.MathPackage#getMatrix3x3_M21()
	 * @model
	 * @generated
	 */
	double getM21();

	/**
	 * Sets the value of the '{@link ca.gc.space.math.Matrix3x3#getM21 <em>M21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M21</em>' attribute.
	 * @see #getM21()
	 * @generated
	 */
	void setM21(double value);

	/**
	 * Returns the value of the '<em><b>M22</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>M22</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M22</em>' attribute.
	 * @see #setM22(double)
	 * @see ca.gc.space.math.MathPackage#getMatrix3x3_M22()
	 * @model default="1.0"
	 * @generated
	 */
	double getM22();

	/**
	 * Sets the value of the '{@link ca.gc.space.math.Matrix3x3#getM22 <em>M22</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M22</em>' attribute.
	 * @see #getM22()
	 * @generated
	 */
	void setM22(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.space.math.Matrix3d"
	 * @generated
	 */
	Matrix3d asMatrix3d();

} // Matrix3x3
