/**
 * <copyright>
 * </copyright>
 *
 */
package ca.gc.asc_csa.io.las;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Length Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.io.las.VariableLengthRecord#getReserved <em>Reserved</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.VariableLengthRecord#getUserID <em>User ID</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.VariableLengthRecord#getRecordID <em>Record ID</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.VariableLengthRecord#getRecordLenghtAfterHeader <em>Record Lenght After Header</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.VariableLengthRecord#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.io.las.LasPackage#getVariableLengthRecord()
 * @model
 * @generated
 */
public interface VariableLengthRecord extends EObject {
	/**
	 * Returns the value of the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved</em>' attribute.
	 * @see #setReserved(int)
	 * @see ca.gc.asc_csa.io.las.LasPackage#getVariableLengthRecord_Reserved()
	 * @model
	 * @generated
	 */
	int getReserved();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.io.las.VariableLengthRecord#getReserved <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' attribute.
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(int value);

	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User ID</em>' attribute.
	 * @see #setUserID(String)
	 * @see ca.gc.asc_csa.io.las.LasPackage#getVariableLengthRecord_UserID()
	 * @model
	 * @generated
	 */
	String getUserID();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.io.las.VariableLengthRecord#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #getUserID()
	 * @generated
	 */
	void setUserID(String value);

	/**
	 * Returns the value of the '<em><b>Record ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record ID</em>' attribute.
	 * @see #setRecordID(int)
	 * @see ca.gc.asc_csa.io.las.LasPackage#getVariableLengthRecord_RecordID()
	 * @model
	 * @generated
	 */
	int getRecordID();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.io.las.VariableLengthRecord#getRecordID <em>Record ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record ID</em>' attribute.
	 * @see #getRecordID()
	 * @generated
	 */
	void setRecordID(int value);

	/**
	 * Returns the value of the '<em><b>Record Lenght After Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Lenght After Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Lenght After Header</em>' attribute.
	 * @see #setRecordLenghtAfterHeader(int)
	 * @see ca.gc.asc_csa.io.las.LasPackage#getVariableLengthRecord_RecordLenghtAfterHeader()
	 * @model
	 * @generated
	 */
	int getRecordLenghtAfterHeader();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.io.las.VariableLengthRecord#getRecordLenghtAfterHeader <em>Record Lenght After Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Lenght After Header</em>' attribute.
	 * @see #getRecordLenghtAfterHeader()
	 * @generated
	 */
	void setRecordLenghtAfterHeader(int value);

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
	 * @see ca.gc.asc_csa.io.las.LasPackage#getVariableLengthRecord_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.io.las.VariableLengthRecord#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // VariableLengthRecord
