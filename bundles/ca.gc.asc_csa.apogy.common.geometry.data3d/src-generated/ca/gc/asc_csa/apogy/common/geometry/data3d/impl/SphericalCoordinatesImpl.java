package ca.gc.asc_csa.apogy.common.geometry.data3d.impl;
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.geometry.data.impl.CoordinatesImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinates;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spherical Coordinates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalCoordinatesImpl#getPhi <em>Phi</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalCoordinatesImpl#getTheta <em>Theta</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalCoordinatesImpl#getR <em>R</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SphericalCoordinatesImpl extends CoordinatesImpl implements SphericalCoordinates {
	/**
	 * The default value of the '{@link #getPhi() <em>Phi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhi()
	 * @generated
	 * @ordered
	 */
	protected static final double PHI_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPhi() <em>Phi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhi()
	 * @generated
	 * @ordered
	 */
	protected double phi = PHI_EDEFAULT;

	/**
	 * The default value of the '{@link #getTheta() <em>Theta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheta()
	 * @generated
	 * @ordered
	 */
	protected static final double THETA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTheta() <em>Theta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheta()
	 * @generated
	 * @ordered
	 */
	protected double theta = THETA_EDEFAULT;

	/**
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final double R_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected double r = R_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SphericalCoordinatesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DPackage.Literals.SPHERICAL_COORDINATES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPhi() {
		return phi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhi(double newPhi) {
		double oldPhi = phi;
		phi = newPhi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DPackage.SPHERICAL_COORDINATES__PHI, oldPhi, phi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTheta() {
		return theta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheta(double newTheta) {
		double oldTheta = theta;
		theta = newTheta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DPackage.SPHERICAL_COORDINATES__THETA, oldTheta, theta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(double newR) {
		double oldR = r;
		r = newR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DPackage.SPHERICAL_COORDINATES__R, oldR, r));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonGeometryData3DPackage.SPHERICAL_COORDINATES__PHI:
				return getPhi();
			case ApogyCommonGeometryData3DPackage.SPHERICAL_COORDINATES__THETA:
				return getTheta();
			case ApogyCommonGeometryData3DPackage.SPHERICAL_COORDINATES__R:
				return getR();
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
			case ApogyCommonGeometryData3DPackage.SPHERICAL_COORDINATES__PHI:
				setPhi((Double)newValue);
				return;
			case ApogyCommonGeometryData3DPackage.SPHERICAL_COORDINATES__THETA:
				setTheta((Double)newValue);
				return;
			case ApogyCommonGeometryData3DPackage.SPHERICAL_COORDINATES__R:
				setR((Double)newValue);
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
			case ApogyCommonGeometryData3DPackage.SPHERICAL_COORDINATES__PHI:
				setPhi(PHI_EDEFAULT);
				return;
			case ApogyCommonGeometryData3DPackage.SPHERICAL_COORDINATES__THETA:
				setTheta(THETA_EDEFAULT);
				return;
			case ApogyCommonGeometryData3DPackage.SPHERICAL_COORDINATES__R:
				setR(R_EDEFAULT);
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
			case ApogyCommonGeometryData3DPackage.SPHERICAL_COORDINATES__PHI:
				return phi != PHI_EDEFAULT;
			case ApogyCommonGeometryData3DPackage.SPHERICAL_COORDINATES__THETA:
				return theta != THETA_EDEFAULT;
			case ApogyCommonGeometryData3DPackage.SPHERICAL_COORDINATES__R:
				return r != R_EDEFAULT;
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
		result.append(" (phi: ");
		result.append(phi);
		result.append(", theta: ");
		result.append(theta);
		result.append(", r: ");
		result.append(r);
		result.append(')');
		return result.toString();
	}

} //SphericalCoordinatesImpl
