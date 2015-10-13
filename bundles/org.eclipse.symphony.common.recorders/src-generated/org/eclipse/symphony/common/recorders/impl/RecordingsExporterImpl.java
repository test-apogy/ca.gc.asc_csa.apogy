/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.recorders.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.recorders.RecordersPackage;
import org.eclipse.symphony.common.recorders.Recordings;
import org.eclipse.symphony.common.recorders.RecordingsExporter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recordings Exporter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.recorders.impl.RecordingsExporterImpl#getRecordings <em>Recordings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordingsExporterImpl extends MinimalEObjectImpl.Container implements RecordingsExporter {
	/**
	 * The cached value of the '{@link #getRecordings() <em>Recordings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordings()
	 * @generated
	 * @ordered
	 */
	protected Recordings recordings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordingsExporterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecordersPackage.Literals.RECORDINGS_EXPORTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recordings getRecordings() {
		if (recordings != null && recordings.eIsProxy()) {
			InternalEObject oldRecordings = (InternalEObject)recordings;
			recordings = (Recordings)eResolveProxy(oldRecordings);
			if (recordings != oldRecordings) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecordersPackage.RECORDINGS_EXPORTER__RECORDINGS, oldRecordings, recordings));
			}
		}
		return recordings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recordings basicGetRecordings() {
		return recordings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordings(Recordings newRecordings) {
		Recordings oldRecordings = recordings;
		recordings = newRecordings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecordersPackage.RECORDINGS_EXPORTER__RECORDINGS, oldRecordings, recordings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void export(String path) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecordersPackage.RECORDINGS_EXPORTER__RECORDINGS:
				if (resolve) return getRecordings();
				return basicGetRecordings();
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
			case RecordersPackage.RECORDINGS_EXPORTER__RECORDINGS:
				setRecordings((Recordings)newValue);
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
			case RecordersPackage.RECORDINGS_EXPORTER__RECORDINGS:
				setRecordings((Recordings)null);
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
			case RecordersPackage.RECORDINGS_EXPORTER__RECORDINGS:
				return recordings != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RecordersPackage.RECORDINGS_EXPORTER___EXPORT__STRING:
				export((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RecordingsExporterImpl
