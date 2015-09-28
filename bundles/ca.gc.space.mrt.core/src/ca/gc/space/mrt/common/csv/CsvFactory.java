/**
 * Canadian Space Agency 2007
 *
 * $Id: CsvFactory.java,v 1.2.4.2 2015/05/21 15:51:13 pallard Exp $
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CsvFactory eINSTANCE = ca.gc.space.mrt.common.csv.impl.CsvFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column</em>'.
	 * @generated
	 */
	CsvColumn createCsvColumn();

	/**
	 * Returns a new object of class '<em>Colums Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Colums Set</em>'.
	 * @generated
	 */
	CsvColumsSet createCsvColumsSet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CsvPackage getCsvPackage();

} //CsvFactory
