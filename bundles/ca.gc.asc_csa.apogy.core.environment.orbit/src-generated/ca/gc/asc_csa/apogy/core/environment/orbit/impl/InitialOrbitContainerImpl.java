/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.impl;

import ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.InitialOrbitContainer;
import ca.gc.asc_csa.apogy.core.environment.orbit.Orbit;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial Orbit Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.InitialOrbitContainerImpl#getStartOrbit <em>Start Orbit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialOrbitContainerImpl extends MinimalEObjectImpl.Container implements InitialOrbitContainer {
	/**
	 * The cached value of the '{@link #getStartOrbit() <em>Start Orbit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOrbit()
	 * @generated
	 * @ordered
	 */
	protected Orbit startOrbit;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialOrbitContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitPackage.Literals.INITIAL_ORBIT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orbit getStartOrbit() {
		if (startOrbit != null && startOrbit.eIsProxy()) {
			InternalEObject oldStartOrbit = (InternalEObject)startOrbit;
			startOrbit = (Orbit)eResolveProxy(oldStartOrbit);
			if (startOrbit != oldStartOrbit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreEnvironmentOrbitPackage.INITIAL_ORBIT_CONTAINER__START_ORBIT, oldStartOrbit, startOrbit));
			}
		}
		return startOrbit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orbit basicGetStartOrbit() {
		return startOrbit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartOrbit(Orbit newStartOrbit) {
		Orbit oldStartOrbit = startOrbit;
		startOrbit = newStartOrbit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitPackage.INITIAL_ORBIT_CONTAINER__START_ORBIT, oldStartOrbit, startOrbit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orbit getInitialOrbit() {
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
			case ApogyCoreEnvironmentOrbitPackage.INITIAL_ORBIT_CONTAINER__START_ORBIT:
				if (resolve) return getStartOrbit();
				return basicGetStartOrbit();
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
			case ApogyCoreEnvironmentOrbitPackage.INITIAL_ORBIT_CONTAINER__START_ORBIT:
				setStartOrbit((Orbit)newValue);
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
			case ApogyCoreEnvironmentOrbitPackage.INITIAL_ORBIT_CONTAINER__START_ORBIT:
				setStartOrbit((Orbit)null);
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
			case ApogyCoreEnvironmentOrbitPackage.INITIAL_ORBIT_CONTAINER__START_ORBIT:
				return startOrbit != null;
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
			case ApogyCoreEnvironmentOrbitPackage.INITIAL_ORBIT_CONTAINER___GET_INITIAL_ORBIT:
				return getInitialOrbit();
		}
		return super.eInvoke(operationID, arguments);
	}

} //InitialOrbitContainerImpl
