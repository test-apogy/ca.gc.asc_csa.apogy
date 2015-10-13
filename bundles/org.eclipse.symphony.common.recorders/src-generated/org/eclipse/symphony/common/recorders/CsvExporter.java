/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.recorders;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.file.csv.CsvColumnsSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Csv Exporter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.recorders.CsvExporter#isIncludeColumnDescription <em>Include Column Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.recorders.CsvExporter#isIncludeColumnName <em>Include Column Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.recorders.CsvExporter#getColumnSet <em>Column Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.recorders.RecordersPackage#getCsvExporter()
 * @model
 * @generated
 */
public interface CsvExporter extends EObject {
	/**
	 * Returns the value of the '<em><b>Include Column Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Column Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Column Description</em>' attribute.
	 * @see #setIncludeColumnDescription(boolean)
	 * @see org.eclipse.symphony.common.recorders.RecordersPackage#getCsvExporter_IncludeColumnDescription()
	 * @model unique="false"
	 * @generated
	 */
	boolean isIncludeColumnDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.recorders.CsvExporter#isIncludeColumnDescription <em>Include Column Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Column Description</em>' attribute.
	 * @see #isIncludeColumnDescription()
	 * @generated
	 */
	void setIncludeColumnDescription(boolean value);

	/**
	 * Returns the value of the '<em><b>Include Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Column Name</em>' attribute.
	 * @see #setIncludeColumnName(boolean)
	 * @see org.eclipse.symphony.common.recorders.RecordersPackage#getCsvExporter_IncludeColumnName()
	 * @model unique="false"
	 * @generated
	 */
	boolean isIncludeColumnName();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.recorders.CsvExporter#isIncludeColumnName <em>Include Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Column Name</em>' attribute.
	 * @see #isIncludeColumnName()
	 * @generated
	 */
	void setIncludeColumnName(boolean value);

	/**
	 * Returns the value of the '<em><b>Column Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Set</em>' reference.
	 * @see #setColumnSet(CsvColumnsSet)
	 * @see org.eclipse.symphony.common.recorders.RecordersPackage#getCsvExporter_ColumnSet()
	 * @model derived="true"
	 * @generated
	 */
	CsvColumnsSet getColumnSet();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.recorders.CsvExporter#getColumnSet <em>Column Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Set</em>' reference.
	 * @see #getColumnSet()
	 * @generated
	 */
	void setColumnSet(CsvColumnsSet value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exportPathUnique="false"
	 * @generated
	 */
	void exportToCSVFile(String exportPath);

} // CsvExporter
