/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.symphony.common.emf.TimeSource;

import org.eclipse.symphony.core.SymphonyEnvironment;
import org.eclipse.symphony.core.Symphony__CorePackage;
import org.eclipse.symphony.core.TimeSourcesList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Sources List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.impl.TimeSourcesListImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.impl.TimeSourcesListImpl#getTimeSources <em>Time Sources</em>}</li>
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
		return Symphony__CorePackage.Literals.TIME_SOURCES_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyEnvironment getEnvironment() {
		if (eContainerFeatureID() != Symphony__CorePackage.TIME_SOURCES_LIST__ENVIRONMENT) return null;
		return (SymphonyEnvironment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyEnvironment basicGetEnvironment() {
		if (eContainerFeatureID() != Symphony__CorePackage.TIME_SOURCES_LIST__ENVIRONMENT) return null;
		return (SymphonyEnvironment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(SymphonyEnvironment newEnvironment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnvironment, Symphony__CorePackage.TIME_SOURCES_LIST__ENVIRONMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(SymphonyEnvironment newEnvironment) {
		if (newEnvironment != eInternalContainer() || (eContainerFeatureID() != Symphony__CorePackage.TIME_SOURCES_LIST__ENVIRONMENT && newEnvironment != null)) {
			if (EcoreUtil.isAncestor(this, newEnvironment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, Symphony__CorePackage.SYMPHONY_ENVIRONMENT__TIME_SOURCES_LIST, SymphonyEnvironment.class, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CorePackage.TIME_SOURCES_LIST__ENVIRONMENT, newEnvironment, newEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeSource> getTimeSources() {
		if (timeSources == null) {
			timeSources = new EObjectContainmentEList<TimeSource>(TimeSource.class, this, Symphony__CorePackage.TIME_SOURCES_LIST__TIME_SOURCES);
		}
		return timeSources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__CorePackage.TIME_SOURCES_LIST__ENVIRONMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnvironment((SymphonyEnvironment)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__CorePackage.TIME_SOURCES_LIST__ENVIRONMENT:
				return basicSetEnvironment(null, msgs);
			case Symphony__CorePackage.TIME_SOURCES_LIST__TIME_SOURCES:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Symphony__CorePackage.TIME_SOURCES_LIST__ENVIRONMENT:
				return eInternalContainer().eInverseRemove(this, Symphony__CorePackage.SYMPHONY_ENVIRONMENT__TIME_SOURCES_LIST, SymphonyEnvironment.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__CorePackage.TIME_SOURCES_LIST__ENVIRONMENT:
				if (resolve) return getEnvironment();
				return basicGetEnvironment();
			case Symphony__CorePackage.TIME_SOURCES_LIST__TIME_SOURCES:
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
			case Symphony__CorePackage.TIME_SOURCES_LIST__ENVIRONMENT:
				setEnvironment((SymphonyEnvironment)newValue);
				return;
			case Symphony__CorePackage.TIME_SOURCES_LIST__TIME_SOURCES:
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
			case Symphony__CorePackage.TIME_SOURCES_LIST__ENVIRONMENT:
				setEnvironment((SymphonyEnvironment)null);
				return;
			case Symphony__CorePackage.TIME_SOURCES_LIST__TIME_SOURCES:
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
			case Symphony__CorePackage.TIME_SOURCES_LIST__ENVIRONMENT:
				return basicGetEnvironment() != null;
			case Symphony__CorePackage.TIME_SOURCES_LIST__TIME_SOURCES:
				return timeSources != null && !timeSources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimeSourcesListImpl
