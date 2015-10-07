/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.impl;

import ca.gc.asc_csa.symphony.environment.orbit.AbstractOrbitPropagator;
import ca.gc.asc_csa.symphony.environment.orbit.Orbit;
import ca.gc.asc_csa.symphony.environment.orbit.OrbitModel;
import ca.gc.asc_csa.symphony.environment.orbit.SymphonyOrbitEnvironmentPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.core.impl.AbstractOrbitModelImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orbit Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.impl.OrbitModelImpl#getInitialOrbit <em>Initial Orbit</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.impl.OrbitModelImpl#getPropagator <em>Propagator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrbitModelImpl extends AbstractOrbitModelImpl implements OrbitModel {
	/**
	 * The cached value of the '{@link #getInitialOrbit() <em>Initial Orbit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialOrbit()
	 * @generated
	 * @ordered
	 */
	protected Orbit initialOrbit;
	/**
	 * The cached value of the '{@link #getPropagator() <em>Propagator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagator()
	 * @generated
	 * @ordered
	 */
	protected AbstractOrbitPropagator propagator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrbitModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyOrbitEnvironmentPackage.Literals.ORBIT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orbit getInitialOrbit() {
		return initialOrbit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialOrbit(Orbit newInitialOrbit, NotificationChain msgs) {
		Orbit oldInitialOrbit = initialOrbit;
		initialOrbit = newInitialOrbit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.ORBIT_MODEL__INITIAL_ORBIT, oldInitialOrbit, newInitialOrbit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialOrbit(Orbit newInitialOrbit) {
		if (newInitialOrbit != initialOrbit) {
			NotificationChain msgs = null;
			if (initialOrbit != null)
				msgs = ((InternalEObject)initialOrbit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyOrbitEnvironmentPackage.ORBIT_MODEL__INITIAL_ORBIT, null, msgs);
			if (newInitialOrbit != null)
				msgs = ((InternalEObject)newInitialOrbit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyOrbitEnvironmentPackage.ORBIT_MODEL__INITIAL_ORBIT, null, msgs);
			msgs = basicSetInitialOrbit(newInitialOrbit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.ORBIT_MODEL__INITIAL_ORBIT, newInitialOrbit, newInitialOrbit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractOrbitPropagator getPropagator() {
		return propagator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropagator(AbstractOrbitPropagator newPropagator, NotificationChain msgs) {
		AbstractOrbitPropagator oldPropagator = propagator;
		propagator = newPropagator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.ORBIT_MODEL__PROPAGATOR, oldPropagator, newPropagator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropagator(AbstractOrbitPropagator newPropagator) {
		if (newPropagator != propagator) {
			NotificationChain msgs = null;
			if (propagator != null)
				msgs = ((InternalEObject)propagator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyOrbitEnvironmentPackage.ORBIT_MODEL__PROPAGATOR, null, msgs);
			if (newPropagator != null)
				msgs = ((InternalEObject)newPropagator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyOrbitEnvironmentPackage.ORBIT_MODEL__PROPAGATOR, null, msgs);
			msgs = basicSetPropagator(newPropagator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.ORBIT_MODEL__PROPAGATOR, newPropagator, newPropagator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyOrbitEnvironmentPackage.ORBIT_MODEL__INITIAL_ORBIT:
				return basicSetInitialOrbit(null, msgs);
			case SymphonyOrbitEnvironmentPackage.ORBIT_MODEL__PROPAGATOR:
				return basicSetPropagator(null, msgs);
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
			case SymphonyOrbitEnvironmentPackage.ORBIT_MODEL__INITIAL_ORBIT:
				return getInitialOrbit();
			case SymphonyOrbitEnvironmentPackage.ORBIT_MODEL__PROPAGATOR:
				return getPropagator();
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
			case SymphonyOrbitEnvironmentPackage.ORBIT_MODEL__INITIAL_ORBIT:
				setInitialOrbit((Orbit)newValue);
				return;
			case SymphonyOrbitEnvironmentPackage.ORBIT_MODEL__PROPAGATOR:
				setPropagator((AbstractOrbitPropagator)newValue);
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
			case SymphonyOrbitEnvironmentPackage.ORBIT_MODEL__INITIAL_ORBIT:
				setInitialOrbit((Orbit)null);
				return;
			case SymphonyOrbitEnvironmentPackage.ORBIT_MODEL__PROPAGATOR:
				setPropagator((AbstractOrbitPropagator)null);
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
			case SymphonyOrbitEnvironmentPackage.ORBIT_MODEL__INITIAL_ORBIT:
				return initialOrbit != null;
			case SymphonyOrbitEnvironmentPackage.ORBIT_MODEL__PROPAGATOR:
				return propagator != null;
		}
		return super.eIsSet(featureID);
	}

} //OrbitModelImpl
