package ca.gc.asc_csa.apogy.core.environment.orbit.impl;
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

import ca.gc.asc_csa.apogy.core.environment.orbit.AbstractFrame;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel;
import ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState;
import ca.gc.asc_csa.apogy.core.environment.orbit.ValidityRangeProvider;
import ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.AttitudeProvider;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orbit Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.OrbitModelImpl#getFromValidDate <em>From Valid Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.OrbitModelImpl#getToValidDate <em>To Valid Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.OrbitModelImpl#getReferenceFrame <em>Reference Frame</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.OrbitModelImpl#getAttitudeProvider <em>Attitude Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OrbitModelImpl extends AbstractOrbitModelImpl implements OrbitModel {
	/**
	 * The default value of the '{@link #getFromValidDate() <em>From Valid Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromValidDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_VALID_DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getToValidDate() <em>To Valid Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToValidDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date TO_VALID_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getReferenceFrame() <em>Reference Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceFrame()
	 * @generated
	 * @ordered
	 */
	protected AbstractFrame referenceFrame;
	/**
	 * The cached value of the '{@link #getAttitudeProvider() <em>Attitude Provider</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttitudeProvider()
	 * @generated
	 * @ordered
	 */
	protected EList<AttitudeProvider> attitudeProvider;

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
		return ApogyCoreEnvironmentOrbitPackage.Literals.ORBIT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT 
	 */
	public abstract Date getFromValidDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public abstract Date getToValidDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFrame getReferenceFrame() {
		return referenceFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceFrame(AbstractFrame newReferenceFrame, NotificationChain msgs) {
		AbstractFrame oldReferenceFrame = referenceFrame;
		referenceFrame = newReferenceFrame;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL__REFERENCE_FRAME, oldReferenceFrame, newReferenceFrame);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceFrame(AbstractFrame newReferenceFrame) {
		if (newReferenceFrame != referenceFrame) {
			NotificationChain msgs = null;
			if (referenceFrame != null)
				msgs = ((InternalEObject)referenceFrame).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL__REFERENCE_FRAME, null, msgs);
			if (newReferenceFrame != null)
				msgs = ((InternalEObject)newReferenceFrame).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL__REFERENCE_FRAME, null, msgs);
			msgs = basicSetReferenceFrame(newReferenceFrame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL__REFERENCE_FRAME, newReferenceFrame, newReferenceFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttitudeProvider> getAttitudeProvider() {
		if (attitudeProvider == null) {
			attitudeProvider = new EObjectContainmentEList<AttitudeProvider>(AttitudeProvider.class, this, ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL__ATTITUDE_PROVIDER);
		}
		return attitudeProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public abstract SpacecraftState propagate(Date targetDate) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public abstract List<SpacecraftState> getSpacecraftStates(Date startDate, Date endDate, double timeInterval) throws Exception;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public abstract boolean isDateInValidRange(Date date);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL__REFERENCE_FRAME:
				return basicSetReferenceFrame(null, msgs);
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL__ATTITUDE_PROVIDER:
				return ((InternalEList<?>)getAttitudeProvider()).basicRemove(otherEnd, msgs);
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
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL__FROM_VALID_DATE:
				return getFromValidDate();
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL__TO_VALID_DATE:
				return getToValidDate();
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL__REFERENCE_FRAME:
				return getReferenceFrame();
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL__ATTITUDE_PROVIDER:
				return getAttitudeProvider();
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
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL__REFERENCE_FRAME:
				setReferenceFrame((AbstractFrame)newValue);
				return;
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL__ATTITUDE_PROVIDER:
				getAttitudeProvider().clear();
				getAttitudeProvider().addAll((Collection<? extends AttitudeProvider>)newValue);
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
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL__REFERENCE_FRAME:
				setReferenceFrame((AbstractFrame)null);
				return;
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL__ATTITUDE_PROVIDER:
				getAttitudeProvider().clear();
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
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL__FROM_VALID_DATE:
				return FROM_VALID_DATE_EDEFAULT == null ? getFromValidDate() != null : !FROM_VALID_DATE_EDEFAULT.equals(getFromValidDate());
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL__TO_VALID_DATE:
				return TO_VALID_DATE_EDEFAULT == null ? getToValidDate() != null : !TO_VALID_DATE_EDEFAULT.equals(getToValidDate());
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL__REFERENCE_FRAME:
				return referenceFrame != null;
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL__ATTITUDE_PROVIDER:
				return attitudeProvider != null && !attitudeProvider.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ValidityRangeProvider.class) {
			switch (derivedFeatureID) {
				case ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL__FROM_VALID_DATE: return ApogyCoreEnvironmentOrbitPackage.VALIDITY_RANGE_PROVIDER__FROM_VALID_DATE;
				case ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL__TO_VALID_DATE: return ApogyCoreEnvironmentOrbitPackage.VALIDITY_RANGE_PROVIDER__TO_VALID_DATE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ValidityRangeProvider.class) {
			switch (baseFeatureID) {
				case ApogyCoreEnvironmentOrbitPackage.VALIDITY_RANGE_PROVIDER__FROM_VALID_DATE: return ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL__FROM_VALID_DATE;
				case ApogyCoreEnvironmentOrbitPackage.VALIDITY_RANGE_PROVIDER__TO_VALID_DATE: return ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL__TO_VALID_DATE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ValidityRangeProvider.class) {
			switch (baseOperationID) {
				case ApogyCoreEnvironmentOrbitPackage.VALIDITY_RANGE_PROVIDER___IS_DATE_IN_VALID_RANGE__DATE: return ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL___IS_DATE_IN_VALID_RANGE__DATE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL___PROPAGATE__DATE:
				try {
					return propagate((Date)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL___GET_SPACECRAFT_STATES__DATE_DATE_DOUBLE:
				try {
					return getSpacecraftStates((Date)arguments.get(0), (Date)arguments.get(1), (Double)arguments.get(2));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_MODEL___IS_DATE_IN_VALID_RANGE__DATE:
				return isDateInValidRange((Date)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //OrbitModelImpl
