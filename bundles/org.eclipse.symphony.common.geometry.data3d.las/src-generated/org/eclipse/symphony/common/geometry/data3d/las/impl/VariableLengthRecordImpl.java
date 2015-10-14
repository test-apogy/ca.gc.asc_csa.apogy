/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.symphony.common.geometry.data3d.las.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.geometry.data3d.las.LasPackage;
import org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Length Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.impl.VariableLengthRecordImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.impl.VariableLengthRecordImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.impl.VariableLengthRecordImpl#getRecordID <em>Record ID</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.impl.VariableLengthRecordImpl#getRecordLenghtAfterHeader <em>Record Lenght After Header</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.impl.VariableLengthRecordImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableLengthRecordImpl extends MinimalEObjectImpl.Container implements VariableLengthRecord {
	/**
	 * The default value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected static final int RESERVED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected int reserved = RESERVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected String userID = USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecordID() <em>Record ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordID()
	 * @generated
	 * @ordered
	 */
	protected static final int RECORD_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRecordID() <em>Record ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordID()
	 * @generated
	 * @ordered
	 */
	protected int recordID = RECORD_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecordLenghtAfterHeader() <em>Record Lenght After Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordLenghtAfterHeader()
	 * @generated
	 * @ordered
	 */
	protected static final int RECORD_LENGHT_AFTER_HEADER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRecordLenghtAfterHeader() <em>Record Lenght After Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordLenghtAfterHeader()
	 * @generated
	 * @ordered
	 */
	protected int recordLenghtAfterHeader = RECORD_LENGHT_AFTER_HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableLengthRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LasPackage.Literals.VARIABLE_LENGTH_RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved(int newReserved) {
		int oldReserved = reserved;
		reserved = newReserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.VARIABLE_LENGTH_RECORD__RESERVED, oldReserved, reserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserID(String newUserID) {
		String oldUserID = userID;
		userID = newUserID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.VARIABLE_LENGTH_RECORD__USER_ID, oldUserID, userID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRecordID() {
		return recordID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordID(int newRecordID) {
		int oldRecordID = recordID;
		recordID = newRecordID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.VARIABLE_LENGTH_RECORD__RECORD_ID, oldRecordID, recordID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRecordLenghtAfterHeader() {
		return recordLenghtAfterHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordLenghtAfterHeader(int newRecordLenghtAfterHeader) {
		int oldRecordLenghtAfterHeader = recordLenghtAfterHeader;
		recordLenghtAfterHeader = newRecordLenghtAfterHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.VARIABLE_LENGTH_RECORD__RECORD_LENGHT_AFTER_HEADER, oldRecordLenghtAfterHeader, recordLenghtAfterHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.VARIABLE_LENGTH_RECORD__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LasPackage.VARIABLE_LENGTH_RECORD__RESERVED:
				return getReserved();
			case LasPackage.VARIABLE_LENGTH_RECORD__USER_ID:
				return getUserID();
			case LasPackage.VARIABLE_LENGTH_RECORD__RECORD_ID:
				return getRecordID();
			case LasPackage.VARIABLE_LENGTH_RECORD__RECORD_LENGHT_AFTER_HEADER:
				return getRecordLenghtAfterHeader();
			case LasPackage.VARIABLE_LENGTH_RECORD__DESCRIPTION:
				return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LasPackage.VARIABLE_LENGTH_RECORD__RESERVED:
				setReserved((Integer)newValue);
				return;
			case LasPackage.VARIABLE_LENGTH_RECORD__USER_ID:
				setUserID((String)newValue);
				return;
			case LasPackage.VARIABLE_LENGTH_RECORD__RECORD_ID:
				setRecordID((Integer)newValue);
				return;
			case LasPackage.VARIABLE_LENGTH_RECORD__RECORD_LENGHT_AFTER_HEADER:
				setRecordLenghtAfterHeader((Integer)newValue);
				return;
			case LasPackage.VARIABLE_LENGTH_RECORD__DESCRIPTION:
				setDescription((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LasPackage.VARIABLE_LENGTH_RECORD__RESERVED:
				setReserved(RESERVED_EDEFAULT);
				return;
			case LasPackage.VARIABLE_LENGTH_RECORD__USER_ID:
				setUserID(USER_ID_EDEFAULT);
				return;
			case LasPackage.VARIABLE_LENGTH_RECORD__RECORD_ID:
				setRecordID(RECORD_ID_EDEFAULT);
				return;
			case LasPackage.VARIABLE_LENGTH_RECORD__RECORD_LENGHT_AFTER_HEADER:
				setRecordLenghtAfterHeader(RECORD_LENGHT_AFTER_HEADER_EDEFAULT);
				return;
			case LasPackage.VARIABLE_LENGTH_RECORD__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LasPackage.VARIABLE_LENGTH_RECORD__RESERVED:
				return reserved != RESERVED_EDEFAULT;
			case LasPackage.VARIABLE_LENGTH_RECORD__USER_ID:
				return USER_ID_EDEFAULT == null ? userID != null : !USER_ID_EDEFAULT.equals(userID);
			case LasPackage.VARIABLE_LENGTH_RECORD__RECORD_ID:
				return recordID != RECORD_ID_EDEFAULT;
			case LasPackage.VARIABLE_LENGTH_RECORD__RECORD_LENGHT_AFTER_HEADER:
				return recordLenghtAfterHeader != RECORD_LENGHT_AFTER_HEADER_EDEFAULT;
			case LasPackage.VARIABLE_LENGTH_RECORD__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (reserved: ");
		result.append(reserved);
		result.append(", userID: ");
		result.append(userID);
		result.append(", recordID: ");
		result.append(recordID);
		result.append(", recordLenghtAfterHeader: ");
		result.append(recordLenghtAfterHeader);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //VariableLengthRecordImpl
