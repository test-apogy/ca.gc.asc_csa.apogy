/**
 */
package org.eclipse.symphony.common.emf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.TimeSource;
import org.eclipse.symphony.common.emf.TimeSourcesList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Sources List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.emf.impl.TimeSourcesListImpl#getTimeSources <em>Time Sources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeSourcesListImpl extends MinimalEObjectImpl.Container implements TimeSourcesList {
	/**
	 * The cached value of the '{@link #getTimeSources() <em>Time Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSources()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeSource> timeSources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSourcesListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcorePackage.Literals.TIME_SOURCES_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeSource> getTimeSources() {
		if (timeSources == null) {
			timeSources = new EObjectContainmentEList<TimeSource>(TimeSource.class, this, EMFEcorePackage.TIME_SOURCES_LIST__TIME_SOURCES);
		}
		return timeSources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EMFEcorePackage.TIME_SOURCES_LIST__TIME_SOURCES:
				return ((InternalEList<?>)getTimeSources()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EMFEcorePackage.TIME_SOURCES_LIST__TIME_SOURCES:
				return getTimeSources();
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
			case EMFEcorePackage.TIME_SOURCES_LIST__TIME_SOURCES:
				getTimeSources().clear();
				getTimeSources().addAll((Collection<? extends TimeSource>)newValue);
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
			case EMFEcorePackage.TIME_SOURCES_LIST__TIME_SOURCES:
				getTimeSources().clear();
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
			case EMFEcorePackage.TIME_SOURCES_LIST__TIME_SOURCES:
				return timeSources != null && !timeSources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimeSourcesListImpl
