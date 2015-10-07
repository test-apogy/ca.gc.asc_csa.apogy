/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.space.mrt.common.csv;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.common.csv.CsvPackage
 * @generated
 */
public interface CsvFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CsvFactory eINSTANCE = ca.gc.space.mrt.common.csv.impl.CsvFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Csv Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Csv Column</em>'.
	 * @generated
	 */
	CsvColumn createCsvColumn();

	/**
	 * Returns a new object of class '<em>Csv Columns Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Csv Columns Set</em>'.
	 * @generated
	 */
	CsvColumnsSet createCsvColumnsSet();

	/**
	 * Returns a new object of class '<em>Csv Value Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Csv Value Provider</em>'.
	 * @generated
	 */
	CsvValueProvider createCsvValueProvider();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CsvPackage getMRTCsvPackage();

} //CsvFactory
