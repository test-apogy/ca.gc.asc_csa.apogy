/**
 * Canadian Space Agency 2007
 *
 * $Id: CsvExporter.java,v 1.3.4.2 2015/05/21 15:51:12 pallard Exp $
 */
package ca.gc.space.mrt.common.recorders;

import org.eclipse.emf.ecore.EObject;

import ca.gc.space.mrt.common.csv.CsvColumsSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Csv Exporter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.common.recorders.CsvExporter#isIncludeColumnDescription <em>Include Column Description</em>}</li>
 *   <li>{@link ca.gc.space.mrt.common.recorders.CsvExporter#isIncludeColumnName <em>Include Column Name</em>}</li>
 *   <li>{@link ca.gc.space.mrt.common.recorders.CsvExporter#getColumnSet <em>Column Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.common.recorders.RecordersPackage#getCsvExporter()
 * @model
 * @generated
 */
public interface CsvExporter extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007";

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
	 * @see ca.gc.space.mrt.common.recorders.RecordersPackage#getCsvExporter_IncludeColumnDescription()
	 * @model required="true"
	 * @generated
	 */
	boolean isIncludeColumnDescription();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.common.recorders.CsvExporter#isIncludeColumnDescription <em>Include Column Description</em>}' attribute.
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
	 * @see ca.gc.space.mrt.common.recorders.RecordersPackage#getCsvExporter_IncludeColumnName()
	 * @model required="true"
	 * @generated
	 */
	boolean isIncludeColumnName();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.common.recorders.CsvExporter#isIncludeColumnName <em>Include Column Name</em>}' attribute.
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
	 * @see ca.gc.space.mrt.common.recorders.RecordersPackage#getCsvExporter_ColumnSet()
	 * @model required="true" changeable="false" derived="true"
	 * @generated
	 */
	CsvColumsSet getColumnSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exportPathRequired="true"
	 * @generated
	 */
	void exportToCSVFile(String exportPath);

} // CsvExporter
