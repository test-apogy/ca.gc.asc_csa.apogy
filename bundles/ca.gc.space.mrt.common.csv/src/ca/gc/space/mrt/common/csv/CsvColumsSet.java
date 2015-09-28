/**
 * Canadian Space Agency 2007.
 *
 * $Id: CsvColumsSet.java,v 1.2.4.2 2015/05/21 15:49:54 pallard Exp $
 */
package ca.gc.space.mrt.common.csv;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colums Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.common.csv.CsvColumsSet#getColumns <em>Columns</em>}</li>
 *   <li>{@link ca.gc.space.mrt.common.csv.CsvColumsSet#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.common.csv.CsvPackage#getCsvColumsSet()
 * @model
 * @generated
 */
public interface CsvColumsSet extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(Map)
	 * @see ca.gc.space.mrt.common.csv.CsvPackage#getCsvColumsSet_Columns()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Map<String, CsvColumn> getColumns();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.common.csv.CsvColumsSet#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(Map<String, CsvColumn> value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ca.gc.space.mrt.common.csv.CsvPackage#getCsvColumsSet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.common.csv.CsvColumsSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CsvColumsSet
