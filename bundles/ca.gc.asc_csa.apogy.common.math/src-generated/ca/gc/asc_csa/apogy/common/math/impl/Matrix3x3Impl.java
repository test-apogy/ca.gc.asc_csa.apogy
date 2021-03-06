package ca.gc.asc_csa.apogy.common.math.impl;
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

import java.lang.reflect.InvocationTargetException;
import javax.vecmath.Matrix3d;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage;
import ca.gc.asc_csa.apogy.common.math.Matrix3x3;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Matrix3x3</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.impl.Matrix3x3Impl#getM00 <em>M00</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.impl.Matrix3x3Impl#getM01 <em>M01</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.impl.Matrix3x3Impl#getM02 <em>M02</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.impl.Matrix3x3Impl#getM10 <em>M10</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.impl.Matrix3x3Impl#getM11 <em>M11</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.impl.Matrix3x3Impl#getM12 <em>M12</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.impl.Matrix3x3Impl#getM20 <em>M20</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.impl.Matrix3x3Impl#getM21 <em>M21</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.impl.Matrix3x3Impl#getM22 <em>M22</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Matrix3x3Impl extends MinimalEObjectImpl.Container implements Matrix3x3 {
	/**
	 * The default value of the '{@link #getM00() <em>M00</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM00()
	 * @generated
	 * @ordered
	 */
	protected static final double M00_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getM00() <em>M00</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM00()
	 * @generated
	 * @ordered
	 */
	protected double m00 = M00_EDEFAULT;

	/**
	 * The default value of the '{@link #getM01() <em>M01</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM01()
	 * @generated
	 * @ordered
	 */
	protected static final double M01_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getM01() <em>M01</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM01()
	 * @generated
	 * @ordered
	 */
	protected double m01 = M01_EDEFAULT;

	/**
	 * The default value of the '{@link #getM02() <em>M02</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM02()
	 * @generated
	 * @ordered
	 */
	protected static final double M02_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getM02() <em>M02</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM02()
	 * @generated
	 * @ordered
	 */
	protected double m02 = M02_EDEFAULT;

	/**
	 * The default value of the '{@link #getM10() <em>M10</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM10()
	 * @generated
	 * @ordered
	 */
	protected static final double M10_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getM10() <em>M10</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM10()
	 * @generated
	 * @ordered
	 */
	protected double m10 = M10_EDEFAULT;

	/**
	 * The default value of the '{@link #getM11() <em>M11</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM11()
	 * @generated
	 * @ordered
	 */
	protected static final double M11_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getM11() <em>M11</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM11()
	 * @generated
	 * @ordered
	 */
	protected double m11 = M11_EDEFAULT;

	/**
	 * The default value of the '{@link #getM12() <em>M12</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM12()
	 * @generated
	 * @ordered
	 */
	protected static final double M12_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getM12() <em>M12</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM12()
	 * @generated
	 * @ordered
	 */
	protected double m12 = M12_EDEFAULT;

	/**
	 * The default value of the '{@link #getM20() <em>M20</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM20()
	 * @generated
	 * @ordered
	 */
	protected static final double M20_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getM20() <em>M20</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM20()
	 * @generated
	 * @ordered
	 */
	protected double m20 = M20_EDEFAULT;

	/**
	 * The default value of the '{@link #getM21() <em>M21</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM21()
	 * @generated
	 * @ordered
	 */
	protected static final double M21_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getM21() <em>M21</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM21()
	 * @generated
	 * @ordered
	 */
	protected double m21 = M21_EDEFAULT;

	/**
	 * The default value of the '{@link #getM22() <em>M22</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM22()
	 * @generated
	 * @ordered
	 */
	protected static final double M22_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getM22() <em>M22</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM22()
	 * @generated
	 * @ordered
	 */
	protected double m22 = M22_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected Matrix3x3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonMathPackage.Literals.MATRIX3X3;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getM00() {
		return m00;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setM00(double newM00) {
		double oldM00 = m00;
		m00 = newM00;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonMathPackage.MATRIX3X3__M00, oldM00, m00));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getM01() {
		return m01;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setM01(double newM01) {
		double oldM01 = m01;
		m01 = newM01;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonMathPackage.MATRIX3X3__M01, oldM01, m01));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getM02() {
		return m02;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setM02(double newM02) {
		double oldM02 = m02;
		m02 = newM02;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonMathPackage.MATRIX3X3__M02, oldM02, m02));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getM10() {
		return m10;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setM10(double newM10) {
		double oldM10 = m10;
		m10 = newM10;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonMathPackage.MATRIX3X3__M10, oldM10, m10));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getM11() {
		return m11;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setM11(double newM11) {
		double oldM11 = m11;
		m11 = newM11;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonMathPackage.MATRIX3X3__M11, oldM11, m11));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getM12() {
		return m12;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setM12(double newM12) {
		double oldM12 = m12;
		m12 = newM12;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonMathPackage.MATRIX3X3__M12, oldM12, m12));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getM20() {
		return m20;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setM20(double newM20) {
		double oldM20 = m20;
		m20 = newM20;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonMathPackage.MATRIX3X3__M20, oldM20, m20));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getM21() {
		return m21;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setM21(double newM21) {
		double oldM21 = m21;
		m21 = newM21;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonMathPackage.MATRIX3X3__M21, oldM21, m21));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getM22() {
		return m22;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setM22(double newM22) {
		double oldM22 = m22;
		m22 = newM22;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonMathPackage.MATRIX3X3__M22, oldM22, m22));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Matrix3d asMatrix3d() {

		double[] data = new double[] { getM00(), getM01(), getM02(), getM10(),
				getM11(), getM12(), getM20(), getM21(), getM22() };

		return new Matrix3d(data);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonMathPackage.MATRIX3X3__M00:
				return getM00();
			case ApogyCommonMathPackage.MATRIX3X3__M01:
				return getM01();
			case ApogyCommonMathPackage.MATRIX3X3__M02:
				return getM02();
			case ApogyCommonMathPackage.MATRIX3X3__M10:
				return getM10();
			case ApogyCommonMathPackage.MATRIX3X3__M11:
				return getM11();
			case ApogyCommonMathPackage.MATRIX3X3__M12:
				return getM12();
			case ApogyCommonMathPackage.MATRIX3X3__M20:
				return getM20();
			case ApogyCommonMathPackage.MATRIX3X3__M21:
				return getM21();
			case ApogyCommonMathPackage.MATRIX3X3__M22:
				return getM22();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCommonMathPackage.MATRIX3X3__M00:
				setM00((Double)newValue);
				return;
			case ApogyCommonMathPackage.MATRIX3X3__M01:
				setM01((Double)newValue);
				return;
			case ApogyCommonMathPackage.MATRIX3X3__M02:
				setM02((Double)newValue);
				return;
			case ApogyCommonMathPackage.MATRIX3X3__M10:
				setM10((Double)newValue);
				return;
			case ApogyCommonMathPackage.MATRIX3X3__M11:
				setM11((Double)newValue);
				return;
			case ApogyCommonMathPackage.MATRIX3X3__M12:
				setM12((Double)newValue);
				return;
			case ApogyCommonMathPackage.MATRIX3X3__M20:
				setM20((Double)newValue);
				return;
			case ApogyCommonMathPackage.MATRIX3X3__M21:
				setM21((Double)newValue);
				return;
			case ApogyCommonMathPackage.MATRIX3X3__M22:
				setM22((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyCommonMathPackage.MATRIX3X3__M00:
				setM00(M00_EDEFAULT);
				return;
			case ApogyCommonMathPackage.MATRIX3X3__M01:
				setM01(M01_EDEFAULT);
				return;
			case ApogyCommonMathPackage.MATRIX3X3__M02:
				setM02(M02_EDEFAULT);
				return;
			case ApogyCommonMathPackage.MATRIX3X3__M10:
				setM10(M10_EDEFAULT);
				return;
			case ApogyCommonMathPackage.MATRIX3X3__M11:
				setM11(M11_EDEFAULT);
				return;
			case ApogyCommonMathPackage.MATRIX3X3__M12:
				setM12(M12_EDEFAULT);
				return;
			case ApogyCommonMathPackage.MATRIX3X3__M20:
				setM20(M20_EDEFAULT);
				return;
			case ApogyCommonMathPackage.MATRIX3X3__M21:
				setM21(M21_EDEFAULT);
				return;
			case ApogyCommonMathPackage.MATRIX3X3__M22:
				setM22(M22_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCommonMathPackage.MATRIX3X3__M00:
				return m00 != M00_EDEFAULT;
			case ApogyCommonMathPackage.MATRIX3X3__M01:
				return m01 != M01_EDEFAULT;
			case ApogyCommonMathPackage.MATRIX3X3__M02:
				return m02 != M02_EDEFAULT;
			case ApogyCommonMathPackage.MATRIX3X3__M10:
				return m10 != M10_EDEFAULT;
			case ApogyCommonMathPackage.MATRIX3X3__M11:
				return m11 != M11_EDEFAULT;
			case ApogyCommonMathPackage.MATRIX3X3__M12:
				return m12 != M12_EDEFAULT;
			case ApogyCommonMathPackage.MATRIX3X3__M20:
				return m20 != M20_EDEFAULT;
			case ApogyCommonMathPackage.MATRIX3X3__M21:
				return m21 != M21_EDEFAULT;
			case ApogyCommonMathPackage.MATRIX3X3__M22:
				return m22 != M22_EDEFAULT;
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
			case ApogyCommonMathPackage.MATRIX3X3___AS_MATRIX3D:
				return asMatrix3d();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (m00: ");
		result.append(m00);
		result.append(", m01: ");
		result.append(m01);
		result.append(", m02: ");
		result.append(m02);
		result.append(", m10: ");
		result.append(m10);
		result.append(", m11: ");
		result.append(m11);
		result.append(", m12: ");
		result.append(m12);
		result.append(", m20: ");
		result.append(m20);
		result.append(", m21: ");
		result.append(m21);
		result.append(", m22: ");
		result.append(m22);
		result.append(')');
		return result.toString();
	}

} // Matrix3x3Impl
