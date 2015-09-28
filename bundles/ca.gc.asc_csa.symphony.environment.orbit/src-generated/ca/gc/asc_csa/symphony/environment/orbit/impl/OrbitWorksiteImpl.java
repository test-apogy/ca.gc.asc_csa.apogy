/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.impl;

import ca.gc.asc_csa.symphony.core.AbstractOrbitModel;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.symphony.environment.impl.WorksiteImpl;
import ca.gc.asc_csa.symphony.environment.orbit.OrbitWorksite;
import ca.gc.asc_csa.symphony.environment.orbit.SymphonyOrbitEnvironmentPackage;
import org.eclipse.emf.common.notify.Notification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orbit Worksite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.impl.OrbitWorksiteImpl#getActiveOrbitModel <em>Active Orbit Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OrbitWorksiteImpl extends WorksiteImpl implements OrbitWorksite {
	/**
	 * The cached value of the '{@link #getActiveOrbitModel() <em>Active Orbit Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveOrbitModel()
	 * @generated
	 * @ordered
	 */
	protected AbstractOrbitModel activeOrbitModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrbitWorksiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyOrbitEnvironmentPackage.Literals.ORBIT_WORKSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractOrbitModel getActiveOrbitModel() {
		if (activeOrbitModel != null && activeOrbitModel.eIsProxy()) {
			InternalEObject oldActiveOrbitModel = (InternalEObject)activeOrbitModel;
			activeOrbitModel = (AbstractOrbitModel)eResolveProxy(oldActiveOrbitModel);
			if (activeOrbitModel != oldActiveOrbitModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyOrbitEnvironmentPackage.ORBIT_WORKSITE__ACTIVE_ORBIT_MODEL, oldActiveOrbitModel, activeOrbitModel));
			}
		}
		return activeOrbitModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractOrbitModel basicGetActiveOrbitModel() {
		return activeOrbitModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveOrbitModel(AbstractOrbitModel newActiveOrbitModel) {
		AbstractOrbitModel oldActiveOrbitModel = activeOrbitModel;
		activeOrbitModel = newActiveOrbitModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.ORBIT_WORKSITE__ACTIVE_ORBIT_MODEL, oldActiveOrbitModel, activeOrbitModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyOrbitEnvironmentPackage.ORBIT_WORKSITE__ACTIVE_ORBIT_MODEL:
				if (resolve) return getActiveOrbitModel();
				return basicGetActiveOrbitModel();
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
			case SymphonyOrbitEnvironmentPackage.ORBIT_WORKSITE__ACTIVE_ORBIT_MODEL:
				setActiveOrbitModel((AbstractOrbitModel)newValue);
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
			case SymphonyOrbitEnvironmentPackage.ORBIT_WORKSITE__ACTIVE_ORBIT_MODEL:
				setActiveOrbitModel((AbstractOrbitModel)null);
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
			case SymphonyOrbitEnvironmentPackage.ORBIT_WORKSITE__ACTIVE_ORBIT_MODEL:
				return activeOrbitModel != null;
		}
		return super.eIsSet(featureID);
	}

} //OrbitWorksiteImpl
