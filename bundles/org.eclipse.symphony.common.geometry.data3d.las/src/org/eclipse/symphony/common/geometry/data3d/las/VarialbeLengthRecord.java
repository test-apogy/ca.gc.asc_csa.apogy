/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.symphony.common.geometry.data3d.las;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Varialbe Length Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.VarialbeLengthRecord#getUserID <em>User ID</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.VarialbeLengthRecord#getRecordID <em>Record ID</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.VarialbeLengthRecord#getRecordLenghtAfterHeader <em>Record Lenght After Header</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.VarialbeLengthRecord#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getVarialbeLengthRecord()
 * @model
 * @generated
 */
public interface VarialbeLengthRecord extends EObject {
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
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getVarialbeLengthRecord_UserID()
	 * @model
	 * @generated
	 */
	String getUserID();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.VarialbeLengthRecord#getUserID <em>User ID</em>}' attribute.
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
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getVarialbeLengthRecord_RecordID()
	 * @model
	 * @generated
	 */
	int getRecordID();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.VarialbeLengthRecord#getRecordID <em>Record ID</em>}' attribute.
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
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getVarialbeLengthRecord_RecordLenghtAfterHeader()
	 * @model
	 * @generated
	 */
	int getRecordLenghtAfterHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.VarialbeLengthRecord#getRecordLenghtAfterHeader <em>Record Lenght After Header</em>}' attribute.
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
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getVarialbeLengthRecord_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.VarialbeLengthRecord#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // VarialbeLengthRecord
