/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.las;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Length Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord#getUserID <em>User ID</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord#getRecordID <em>Record ID</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord#getRecordLenghtAfterHeader <em>Record Lenght After Header</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getVariableLengthRecord()
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
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getVariableLengthRecord_Reserved()
	 * @model unique="false"
	 * @generated
	 */
	int getReserved();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord#getReserved <em>Reserved</em>}' attribute.
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
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getVariableLengthRecord_UserID()
	 * @model unique="false"
	 * @generated
	 */
	String getUserID();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord#getUserID <em>User ID</em>}' attribute.
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
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getVariableLengthRecord_RecordID()
	 * @model unique="false"
	 * @generated
	 */
	int getRecordID();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord#getRecordID <em>Record ID</em>}' attribute.
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
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getVariableLengthRecord_RecordLenghtAfterHeader()
	 * @model unique="false"
	 * @generated
	 */
	int getRecordLenghtAfterHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord#getRecordLenghtAfterHeader <em>Record Lenght After Header</em>}' attribute.
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
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getVariableLengthRecord_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // VariableLengthRecord
