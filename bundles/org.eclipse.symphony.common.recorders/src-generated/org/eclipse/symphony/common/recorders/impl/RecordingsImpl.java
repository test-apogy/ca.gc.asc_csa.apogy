/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.recorders.impl;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.symphony.common.recorders.RecordersPackage;
import org.eclipse.symphony.common.recorders.Recordings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recordings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.recorders.impl.RecordingsImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.recorders.impl.RecordingsImpl#getRecords <em>Records</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.recorders.impl.RecordingsImpl#getTracks <em>Tracks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordingsImpl extends MinimalEObjectImpl.Container implements Recordings {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EObject source;

	/**
	 * The cached value of the '{@link #getRecords() <em>Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecords()
	 * @generated
	 * @ordered
	 */
	protected Map<Date, EList<Object>> records;

	/**
	 * The cached value of the '{@link #getTracks() <em>Tracks</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracks()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tracks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecordersPackage.Literals.RECORDINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecordersPackage.RECORDINGS__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(EObject newSource) {
		EObject oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecordersPackage.RECORDINGS__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<Date, EList<Object>> getRecords() {
		return records;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecords(Map<Date, EList<Object>> newRecords) {
		Map<Date, EList<Object>> oldRecords = records;
		records = newRecords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecordersPackage.RECORDINGS__RECORDS, oldRecords, records));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTracks() {
		if (tracks == null) {
			tracks = new EDataTypeEList<String>(String.class, this, RecordersPackage.RECORDINGS__TRACKS);
		}
		return tracks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecordersPackage.RECORDINGS__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case RecordersPackage.RECORDINGS__RECORDS:
				return getRecords();
			case RecordersPackage.RECORDINGS__TRACKS:
				return getTracks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RecordersPackage.RECORDINGS__SOURCE:
				setSource((EObject)newValue);
				return;
			case RecordersPackage.RECORDINGS__RECORDS:
				setRecords((Map<Date, EList<Object>>)newValue);
				return;
			case RecordersPackage.RECORDINGS__TRACKS:
				getTracks().clear();
				getTracks().addAll((Collection<? extends String>)newValue);
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
			case RecordersPackage.RECORDINGS__SOURCE:
				setSource((EObject)null);
				return;
			case RecordersPackage.RECORDINGS__RECORDS:
				setRecords((Map<Date, EList<Object>>)null);
				return;
			case RecordersPackage.RECORDINGS__TRACKS:
				getTracks().clear();
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
			case RecordersPackage.RECORDINGS__SOURCE:
				return source != null;
			case RecordersPackage.RECORDINGS__RECORDS:
				return records != null;
			case RecordersPackage.RECORDINGS__TRACKS:
				return tracks != null && !tracks.isEmpty();
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
		result.append(" (records: ");
		result.append(records);
		result.append(", tracks: ");
		result.append(tracks);
		result.append(')');
		return result.toString();
	}

} //RecordingsImpl
