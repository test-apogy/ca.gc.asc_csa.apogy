package ca.gc.asc_csa.apogy.common.geometry.data3d.las.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.las.VariableLengthRecord;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Length Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.impl.VariableLengthRecordImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.impl.VariableLengthRecordImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.impl.VariableLengthRecordImpl#getRecordID <em>Record ID</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.impl.VariableLengthRecordImpl#getRecordLengthAfterHeader <em>Record Length After Header</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.impl.VariableLengthRecordImpl#getDescription <em>Description</em>}</li>
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
	 * The default value of the '{@link #getRecordLengthAfterHeader() <em>Record Length After Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordLengthAfterHeader()
	 * @generated
	 * @ordered
	 */
	protected static final int RECORD_LENGTH_AFTER_HEADER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRecordLengthAfterHeader() <em>Record Length After Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordLengthAfterHeader()
	 * @generated
	 * @ordered
	 */
	protected int recordLengthAfterHeader = RECORD_LENGTH_AFTER_HEADER_EDEFAULT;

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
		return ApogyCommonGeometryData3DLASPackage.Literals.VARIABLE_LENGTH_RECORD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__RESERVED, oldReserved, reserved));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__USER_ID, oldUserID, userID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__RECORD_ID, oldRecordID, recordID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRecordLengthAfterHeader() {
		return recordLengthAfterHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordLengthAfterHeader(int newRecordLengthAfterHeader) {
		int oldRecordLengthAfterHeader = recordLengthAfterHeader;
		recordLengthAfterHeader = newRecordLengthAfterHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__RECORD_LENGTH_AFTER_HEADER, oldRecordLengthAfterHeader, recordLengthAfterHeader));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__RESERVED:
				return getReserved();
			case ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__USER_ID:
				return getUserID();
			case ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__RECORD_ID:
				return getRecordID();
			case ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__RECORD_LENGTH_AFTER_HEADER:
				return getRecordLengthAfterHeader();
			case ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__DESCRIPTION:
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
			case ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__RESERVED:
				setReserved((Integer)newValue);
				return;
			case ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__USER_ID:
				setUserID((String)newValue);
				return;
			case ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__RECORD_ID:
				setRecordID((Integer)newValue);
				return;
			case ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__RECORD_LENGTH_AFTER_HEADER:
				setRecordLengthAfterHeader((Integer)newValue);
				return;
			case ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__DESCRIPTION:
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
			case ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__RESERVED:
				setReserved(RESERVED_EDEFAULT);
				return;
			case ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__USER_ID:
				setUserID(USER_ID_EDEFAULT);
				return;
			case ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__RECORD_ID:
				setRecordID(RECORD_ID_EDEFAULT);
				return;
			case ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__RECORD_LENGTH_AFTER_HEADER:
				setRecordLengthAfterHeader(RECORD_LENGTH_AFTER_HEADER_EDEFAULT);
				return;
			case ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__DESCRIPTION:
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
			case ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__RESERVED:
				return reserved != RESERVED_EDEFAULT;
			case ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__USER_ID:
				return USER_ID_EDEFAULT == null ? userID != null : !USER_ID_EDEFAULT.equals(userID);
			case ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__RECORD_ID:
				return recordID != RECORD_ID_EDEFAULT;
			case ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__RECORD_LENGTH_AFTER_HEADER:
				return recordLengthAfterHeader != RECORD_LENGTH_AFTER_HEADER_EDEFAULT;
			case ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD__DESCRIPTION:
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
		result.append(", recordLengthAfterHeader: ");
		result.append(recordLengthAfterHeader);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //VariableLengthRecordImpl
