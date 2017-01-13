/**
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
package ca.gc.asc_csa.apogy.core.environment.surface.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.FeatureOfInterestNodePresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Of Interest Node Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.FeatureOfInterestNodePresentationImpl#getPoleHeight <em>Pole Height</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.FeatureOfInterestNodePresentationImpl#isFlagVisible <em>Flag Visible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureOfInterestNodePresentationImpl extends NodePresentationImpl implements FeatureOfInterestNodePresentation {
	/**
	 * The default value of the '{@link #getPoleHeight() <em>Pole Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoleHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double POLE_HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPoleHeight() <em>Pole Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoleHeight()
	 * @generated
	 * @ordered
	 */
	protected double poleHeight = POLE_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #isFlagVisible() <em>Flag Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlagVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLAG_VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFlagVisible() <em>Flag Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlagVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean flagVisible = FLAG_VISIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureOfInterestNodePresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogySurfaceEnvironmentUIPackage.Literals.FEATURE_OF_INTEREST_NODE_PRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPoleHeight() {
		return poleHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoleHeight(double newPoleHeight) {
		double oldPoleHeight = poleHeight;
		poleHeight = newPoleHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.FEATURE_OF_INTEREST_NODE_PRESENTATION__POLE_HEIGHT, oldPoleHeight, poleHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFlagVisible() {
		return flagVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlagVisible(boolean newFlagVisible) {
		boolean oldFlagVisible = flagVisible;
		flagVisible = newFlagVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.FEATURE_OF_INTEREST_NODE_PRESENTATION__FLAG_VISIBLE, oldFlagVisible, flagVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogySurfaceEnvironmentUIPackage.FEATURE_OF_INTEREST_NODE_PRESENTATION__POLE_HEIGHT:
				return getPoleHeight();
			case ApogySurfaceEnvironmentUIPackage.FEATURE_OF_INTEREST_NODE_PRESENTATION__FLAG_VISIBLE:
				return isFlagVisible();
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
			case ApogySurfaceEnvironmentUIPackage.FEATURE_OF_INTEREST_NODE_PRESENTATION__POLE_HEIGHT:
				setPoleHeight((Double)newValue);
				return;
			case ApogySurfaceEnvironmentUIPackage.FEATURE_OF_INTEREST_NODE_PRESENTATION__FLAG_VISIBLE:
				setFlagVisible((Boolean)newValue);
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
			case ApogySurfaceEnvironmentUIPackage.FEATURE_OF_INTEREST_NODE_PRESENTATION__POLE_HEIGHT:
				setPoleHeight(POLE_HEIGHT_EDEFAULT);
				return;
			case ApogySurfaceEnvironmentUIPackage.FEATURE_OF_INTEREST_NODE_PRESENTATION__FLAG_VISIBLE:
				setFlagVisible(FLAG_VISIBLE_EDEFAULT);
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
			case ApogySurfaceEnvironmentUIPackage.FEATURE_OF_INTEREST_NODE_PRESENTATION__POLE_HEIGHT:
				return poleHeight != POLE_HEIGHT_EDEFAULT;
			case ApogySurfaceEnvironmentUIPackage.FEATURE_OF_INTEREST_NODE_PRESENTATION__FLAG_VISIBLE:
				return flagVisible != FLAG_VISIBLE_EDEFAULT;
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
		result.append(" (poleHeight: ");
		result.append(poleHeight);
		result.append(", flagVisible: ");
		result.append(flagVisible);
		result.append(')');
		return result.toString();
	}

} //FeatureOfInterestNodePresentationImpl