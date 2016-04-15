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

import ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.RGBAColor;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colored Cartesian Position Coordinates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ColoredCartesianPositionCoordinatesImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ColoredCartesianPositionCoordinatesImpl#getRed <em>Red</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ColoredCartesianPositionCoordinatesImpl#getGreen <em>Green</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ColoredCartesianPositionCoordinatesImpl#getBlue <em>Blue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColoredCartesianPositionCoordinatesImpl extends CartesianPositionCoordinatesImpl implements ColoredCartesianPositionCoordinates {
	/**
	 * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final short ALPHA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected short alpha = ALPHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected static final short RED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected short red = RED_EDEFAULT;

	/**
	 * The default value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected static final short GREEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected short green = GREEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected static final short BLUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected short blue = BLUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColoredCartesianPositionCoordinatesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DPackage.Literals.COLORED_CARTESIAN_POSITION_COORDINATES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getAlpha() {
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlpha(short newAlpha) {
		short oldAlpha = alpha;
		alpha = newAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getRed() {
		return red;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRed(short newRed) {
		short oldRed = red;
		red = newRed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__RED, oldRed, red));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getGreen() {
		return green;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreen(short newGreen) {
		short oldGreen = green;
		green = newGreen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__GREEN, oldGreen, green));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getBlue() {
		return blue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlue(short newBlue) {
		short oldBlue = blue;
		blue = newBlue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__BLUE, oldBlue, blue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__ALPHA:
				return getAlpha();
			case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__RED:
				return getRed();
			case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__GREEN:
				return getGreen();
			case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__BLUE:
				return getBlue();
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
			case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__ALPHA:
				setAlpha((Short)newValue);
				return;
			case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__RED:
				setRed((Short)newValue);
				return;
			case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__GREEN:
				setGreen((Short)newValue);
				return;
			case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__BLUE:
				setBlue((Short)newValue);
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
			case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__RED:
				setRed(RED_EDEFAULT);
				return;
			case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__GREEN:
				setGreen(GREEN_EDEFAULT);
				return;
			case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__BLUE:
				setBlue(BLUE_EDEFAULT);
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
			case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__ALPHA:
				return alpha != ALPHA_EDEFAULT;
			case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__RED:
				return red != RED_EDEFAULT;
			case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__GREEN:
				return green != GREEN_EDEFAULT;
			case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__BLUE:
				return blue != BLUE_EDEFAULT;
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
		if (baseClass == RGBAColor.class) {
			switch (derivedFeatureID) {
				case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__ALPHA: return ApogyCommonGeometryData3DPackage.RGBA_COLOR__ALPHA;
				case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__RED: return ApogyCommonGeometryData3DPackage.RGBA_COLOR__RED;
				case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__GREEN: return ApogyCommonGeometryData3DPackage.RGBA_COLOR__GREEN;
				case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__BLUE: return ApogyCommonGeometryData3DPackage.RGBA_COLOR__BLUE;
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
		if (baseClass == RGBAColor.class) {
			switch (baseFeatureID) {
				case ApogyCommonGeometryData3DPackage.RGBA_COLOR__ALPHA: return ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__ALPHA;
				case ApogyCommonGeometryData3DPackage.RGBA_COLOR__RED: return ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__RED;
				case ApogyCommonGeometryData3DPackage.RGBA_COLOR__GREEN: return ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__GREEN;
				case ApogyCommonGeometryData3DPackage.RGBA_COLOR__BLUE: return ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__BLUE;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (alpha: ");
		result.append(alpha);
		result.append(", red: ");
		result.append(red);
		result.append(", green: ");
		result.append(green);
		result.append(", blue: ");
		result.append(blue);
		result.append(')');
		return result.toString();
	}

} //ColoredCartesianPositionCoordinatesImpl
