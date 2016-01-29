/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.math;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage
 * @generated
 */
public interface ApogyCommonMathFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonMathFactory eINSTANCE = ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tuple3d</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuple3d</em>'.
	 * @generated
	 */
	Tuple3d createTuple3d();

	/**
	 * Returns a new object of class '<em>Matrix3x3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matrix3x3</em>'.
	 * @generated
	 */
	Matrix3x3 createMatrix3x3();

	/**
	 * Returns a new object of class '<em>Matrix4x4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matrix4x4</em>'.
	 * @generated
	 */
	Matrix4x4 createMatrix4x4();

	/**
	 * Returns a new object of class '<em>Polynomial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polynomial</em>'.
	 * @generated
	 */
	Polynomial createPolynomial();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyCommonMathFacade createApogyCommonMathFacade();

	/**
	 * Returns a new object of class '<em>Math IO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Math IO</em>'.
	 * @generated
	 */
	MathIO createMathIO();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCommonMathPackage getApogyCommonMathPackage();

} //ApogyCommonMathFactory