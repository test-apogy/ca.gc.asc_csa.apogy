/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.impl;

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

import ca.gc.asc_csa.apogy.common.emf.TimeSource;

import ca.gc.asc_csa.apogy.core.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.TimeSourcesList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Sources List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.TimeSourcesListImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.TimeSourcesListImpl#getTimeSources <em>Time Sources</em>}</li>
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
		return ApogyCorePackage.Literals.TIME_SOURCES_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyEnvironment getEnvironment() {
		if (eContainerFeatureID() != ApogyCorePackage.TIME_SOURCES_LIST__ENVIRONMENT) return null;
		return (ApogyEnvironment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyEnvironment basicGetEnvironment() {
		if (eContainerFeatureID() != ApogyCorePackage.TIME_SOURCES_LIST__ENVIRONMENT) return null;
		return (ApogyEnvironment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(ApogyEnvironment newEnvironment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnvironment, ApogyCorePackage.TIME_SOURCES_LIST__ENVIRONMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(ApogyEnvironment newEnvironment) {
		if (newEnvironment != eInternalContainer() || (eContainerFeatureID() != ApogyCorePackage.TIME_SOURCES_LIST__ENVIRONMENT && newEnvironment != null)) {
			if (EcoreUtil.isAncestor(this, newEnvironment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, ApogyCorePackage.APOGY_ENVIRONMENT__TIME_SOURCES_LIST, ApogyEnvironment.class, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.TIME_SOURCES_LIST__ENVIRONMENT, newEnvironment, newEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeSource> getTimeSources() {
		if (timeSources == null) {
			timeSources = new EObjectContainmentEList<TimeSource>(TimeSource.class, this, ApogyCorePackage.TIME_SOURCES_LIST__TIME_SOURCES);
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
			case ApogyCorePackage.TIME_SOURCES_LIST__ENVIRONMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnvironment((ApogyEnvironment)otherEnd, msgs);
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
			case ApogyCorePackage.TIME_SOURCES_LIST__ENVIRONMENT:
				return basicSetEnvironment(null, msgs);
			case ApogyCorePackage.TIME_SOURCES_LIST__TIME_SOURCES:
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
			case ApogyCorePackage.TIME_SOURCES_LIST__ENVIRONMENT:
				return eInternalContainer().eInverseRemove(this, ApogyCorePackage.APOGY_ENVIRONMENT__TIME_SOURCES_LIST, ApogyEnvironment.class, msgs);
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
			case ApogyCorePackage.TIME_SOURCES_LIST__ENVIRONMENT:
				if (resolve) return getEnvironment();
				return basicGetEnvironment();
			case ApogyCorePackage.TIME_SOURCES_LIST__TIME_SOURCES:
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
			case ApogyCorePackage.TIME_SOURCES_LIST__ENVIRONMENT:
				setEnvironment((ApogyEnvironment)newValue);
				return;
			case ApogyCorePackage.TIME_SOURCES_LIST__TIME_SOURCES:
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
			case ApogyCorePackage.TIME_SOURCES_LIST__ENVIRONMENT:
				setEnvironment((ApogyEnvironment)null);
				return;
			case ApogyCorePackage.TIME_SOURCES_LIST__TIME_SOURCES:
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
			case ApogyCorePackage.TIME_SOURCES_LIST__ENVIRONMENT:
				return basicGetEnvironment() != null;
			case ApogyCorePackage.TIME_SOURCES_LIST__TIME_SOURCES:
				return timeSources != null && !timeSources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimeSourcesListImpl
