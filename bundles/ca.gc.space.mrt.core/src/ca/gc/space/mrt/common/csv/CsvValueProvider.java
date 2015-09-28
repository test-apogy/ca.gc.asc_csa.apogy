/**
 * Canadian Space Agency 2007
 *
 * $Id: CsvValueProvider.java,v 1.2.4.2 2015/05/21 15:51:13 pallard Exp $
 */
package ca.gc.space.mrt.common.csv;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.mrt.common.csv.CsvPackage#getCsvValueProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CsvValueProvider extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" objectRequired="true"
	 * @generated
	 */
	String getStringValue(Object object);

} // CsvValueProvider
