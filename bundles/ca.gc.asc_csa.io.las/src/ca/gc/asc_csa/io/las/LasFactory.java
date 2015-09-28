/**
 * <copyright>
 * </copyright>
 *
 */
package ca.gc.asc_csa.io.las;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.io.las.LasPackage
 * @generated
 */
public interface LasFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LasFactory eINSTANCE = ca.gc.asc_csa.io.las.impl.LasFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>LAS Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LAS Header</em>'.
	 * @generated
	 */
	LASHeader createLASHeader();

	/**
	 * Returns a new object of class '<em>Variable Length Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Length Record</em>'.
	 * @generated
	 */
	VariableLengthRecord createVariableLengthRecord();

	/**
	 * Returns a new object of class '<em>LAS Reader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LAS Reader</em>'.
	 * @generated
	 */
	LASReader createLASReader();

	/**
	 * Returns a new object of class '<em>LAS Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LAS Point</em>'.
	 * @generated
	 */
	LASPoint createLASPoint();

	/**
	 * Returns a new object of class '<em>LAS Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LAS Facade</em>'.
	 * @generated
	 */
	LASFacade createLASFacade();

	/**
	 * Returns a new object of class '<em>LAS Writer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LAS Writer</em>'.
	 * @generated
	 */
	LASWriter createLASWriter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LasPackage getLasPackage();

} //LasFactory
