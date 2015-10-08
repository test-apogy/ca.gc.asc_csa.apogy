/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.space.mrt.common.csv;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Csv Columns Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.common.csv.CsvColumnsSet#getColumns <em>Columns</em>}</li>
 *   <li>{@link ca.gc.space.mrt.common.csv.CsvColumnsSet#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.common.csv.CsvPackage#getCsvColumnsSet()
 * @model
 * @generated
 */
public interface CsvColumnsSet extends EObject {
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
	 * @see ca.gc.space.mrt.common.csv.CsvPackage#getCsvColumnsSet_Columns()
	 * @model unique="false" dataType="ca.gc.space.mrt.common.csv.CsvColumnMap" transient="true"
	 * @generated
	 */
	Map<String, CsvColumn> getColumns();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.common.csv.CsvColumnsSet#getColumns <em>Columns</em>}' attribute.
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
	 * @see ca.gc.space.mrt.common.csv.CsvPackage#getCsvColumnsSet_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.common.csv.CsvColumnsSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CsvColumnsSet
