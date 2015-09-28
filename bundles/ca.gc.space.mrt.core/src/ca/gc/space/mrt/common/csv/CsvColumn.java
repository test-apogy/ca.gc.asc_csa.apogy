/**
 * Canadian Space Agency 2007
 *
 * $Id: CsvColumn.java,v 1.2.4.2 2015/05/21 15:51:13 pallard Exp $
 */
package ca.gc.space.mrt.common.csv;

import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.common.csv.CsvColumn#getValues <em>Values</em>}</li>
 *   <li>{@link ca.gc.space.mrt.common.csv.CsvColumn#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.space.mrt.common.csv.CsvColumn#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.common.csv.CsvPackage#getCsvColumn()
 * @model
 * @generated
 */
public interface CsvColumn extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007";

	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference.
	 * @see #setValues(Entry)
	 * @see ca.gc.space.mrt.common.csv.CsvPackage#getCsvColumn_Values()
	 * @model mapType="ca.gc.space.mrt.common.csv.CsvColumnValuesMap<org.eclipse.emf.ecore.EInt, org.eclipse.emf.ecore.EJavaObject>"
	 * @generated
	 */
	Entry getValues();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.common.csv.CsvColumn#getValues <em>Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' reference.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(Entry value);

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
	 * @see ca.gc.space.mrt.common.csv.CsvPackage#getCsvColumn_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.common.csv.CsvColumn#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see ca.gc.space.mrt.common.csv.CsvPackage#getCsvColumn_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.common.csv.CsvColumn#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CsvColumn
