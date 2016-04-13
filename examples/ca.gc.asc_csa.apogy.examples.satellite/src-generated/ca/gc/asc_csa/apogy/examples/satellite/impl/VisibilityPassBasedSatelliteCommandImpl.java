/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * Canadian Space Agency (CSA) - Initial API and implementation
 * -Pierre Allard (Pierre.Allard@canada.ca),
 * -Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 * -Sebastien Gemme (Sebastien.Gemme@canada.ca)
 */
package ca.gc.asc_csa.apogy.examples.satellite.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;
import ca.gc.asc_csa.apogy.examples.satellite.VisibilityPassBasedSatelliteCommand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visibility Pass Based Satellite Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.VisibilityPassBasedSatelliteCommandImpl#getVisibilityPass <em>Visibility Pass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisibilityPassBasedSatelliteCommandImpl extends AbstractRequestBasedSatelliteCommandImpl implements VisibilityPassBasedSatelliteCommand {
	/**
	 * The cached value of the '{@link #getVisibilityPass() <em>Visibility Pass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilityPass()
	 * @generated
	 * @ordered
	 */
	protected VisibilityPass visibilityPass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisibilityPassBasedSatelliteCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesSatellitePackage.Literals.VISIBILITY_PASS_BASED_SATELLITE_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityPass getVisibilityPass() {
		return visibilityPass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisibilityPass(VisibilityPass newVisibilityPass, NotificationChain msgs) {
		VisibilityPass oldVisibilityPass = visibilityPass;
		visibilityPass = newVisibilityPass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.VISIBILITY_PASS_BASED_SATELLITE_COMMAND__VISIBILITY_PASS, oldVisibilityPass, newVisibilityPass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibilityPass(VisibilityPass newVisibilityPass) {
		if (newVisibilityPass != visibilityPass) {
			NotificationChain msgs = null;
			if (visibilityPass != null)
				msgs = ((InternalEObject)visibilityPass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatellitePackage.VISIBILITY_PASS_BASED_SATELLITE_COMMAND__VISIBILITY_PASS, null, msgs);
			if (newVisibilityPass != null)
				msgs = ((InternalEObject)newVisibilityPass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatellitePackage.VISIBILITY_PASS_BASED_SATELLITE_COMMAND__VISIBILITY_PASS, null, msgs);
			msgs = basicSetVisibilityPass(newVisibilityPass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.VISIBILITY_PASS_BASED_SATELLITE_COMMAND__VISIBILITY_PASS, newVisibilityPass, newVisibilityPass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.VISIBILITY_PASS_BASED_SATELLITE_COMMAND__VISIBILITY_PASS:
				return basicSetVisibilityPass(null, msgs);
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
			case ApogyExamplesSatellitePackage.VISIBILITY_PASS_BASED_SATELLITE_COMMAND__VISIBILITY_PASS:
				return getVisibilityPass();
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
			case ApogyExamplesSatellitePackage.VISIBILITY_PASS_BASED_SATELLITE_COMMAND__VISIBILITY_PASS:
				setVisibilityPass((VisibilityPass)newValue);
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
			case ApogyExamplesSatellitePackage.VISIBILITY_PASS_BASED_SATELLITE_COMMAND__VISIBILITY_PASS:
				setVisibilityPass((VisibilityPass)null);
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
			case ApogyExamplesSatellitePackage.VISIBILITY_PASS_BASED_SATELLITE_COMMAND__VISIBILITY_PASS:
				return visibilityPass != null;
		}
		return super.eIsSet(featureID);
	}

} //VisibilityPassBasedSatelliteCommandImpl
