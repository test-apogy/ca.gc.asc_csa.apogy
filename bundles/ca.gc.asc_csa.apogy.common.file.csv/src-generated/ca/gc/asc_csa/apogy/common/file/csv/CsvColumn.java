/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.file.csv;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Csv Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.file.csv.CsvColumn#getValues <em>Values</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.file.csv.CsvColumn#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.file.csv.CsvColumn#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.file.csv.ApogyCommonFileCSVPackage#getCsvColumn()
 * @model
 * @generated
 */
public interface CsvColumn extends EObject {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference.
	 * @see #setValues(Map.Entry)
	 * @see ca.gc.asc_csa.apogy.common.file.csv.ApogyCommonFileCSVPackage#getCsvColumn_Values()
	 * @model mapType="ca.gc.asc_csa.apogy.common.file.csv.CsvColumnValuesMap<org.eclipse.emf.ecore.EIntegerObject, org.eclipse.emf.ecore.EJavaObject>"
	 * @generated
	 */
	Map.Entry<Integer, Object> getValues();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.file.csv.CsvColumn#getValues <em>Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' reference.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(Map.Entry<Integer, Object> value);

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
	 * @see ca.gc.asc_csa.apogy.common.file.csv.ApogyCommonFileCSVPackage#getCsvColumn_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.file.csv.CsvColumn#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ca.gc.asc_csa.apogy.common.file.csv.ApogyCommonFileCSVPackage#getCsvColumn_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.file.csv.CsvColumn#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // CsvColumn
