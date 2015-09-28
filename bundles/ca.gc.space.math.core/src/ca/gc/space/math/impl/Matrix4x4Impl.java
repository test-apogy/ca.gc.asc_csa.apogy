/**
 * <copyright>
 * </copyright>
 *
 */
package ca.gc.space.math.impl;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ca.gc.space.math.MathPackage;
import ca.gc.space.math.Matrix4x4;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Matrix4x4</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.math.impl.Matrix4x4Impl#getM00 <em>M00</em>}</li>
 *   <li>{@link ca.gc.space.math.impl.Matrix4x4Impl#getM01 <em>M01</em>}</li>
 *   <li>{@link ca.gc.space.math.impl.Matrix4x4Impl#getM02 <em>M02</em>}</li>
 *   <li>{@link ca.gc.space.math.impl.Matrix4x4Impl#getM03 <em>M03</em>}</li>
 *   <li>{@link ca.gc.space.math.impl.Matrix4x4Impl#getM10 <em>M10</em>}</li>
 *   <li>{@link ca.gc.space.math.impl.Matrix4x4Impl#getM11 <em>M11</em>}</li>
 *   <li>{@link ca.gc.space.math.impl.Matrix4x4Impl#getM12 <em>M12</em>}</li>
 *   <li>{@link ca.gc.space.math.impl.Matrix4x4Impl#getM13 <em>M13</em>}</li>
 *   <li>{@link ca.gc.space.math.impl.Matrix4x4Impl#getM20 <em>M20</em>}</li>
 *   <li>{@link ca.gc.space.math.impl.Matrix4x4Impl#getM21 <em>M21</em>}</li>
 *   <li>{@link ca.gc.space.math.impl.Matrix4x4Impl#getM22 <em>M22</em>}</li>
 *   <li>{@link ca.gc.space.math.impl.Matrix4x4Impl#getM23 <em>M23</em>}</li>
 *   <li>{@link ca.gc.space.math.impl.Matrix4x4Impl#getM30 <em>M30</em>}</li>
 *   <li>{@link ca.gc.space.math.impl.Matrix4x4Impl#getM31 <em>M31</em>}</li>
 *   <li>{@link ca.gc.space.math.impl.Matrix4x4Impl#getM32 <em>M32</em>}</li>
 *   <li>{@link ca.gc.space.math.impl.Matrix4x4Impl#getM33 <em>M33</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Matrix4x4Impl extends EObjectImpl implements Matrix4x4 {
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
	 * The default value of the '{@link #getM03() <em>M03</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM03()
	 * @generated
	 * @ordered
	 */
	protected static final double M03_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getM03() <em>M03</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM03()
	 * @generated
	 * @ordered
	 */
	protected double m03 = M03_EDEFAULT;
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
	 * The default value of the '{@link #getM13() <em>M13</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM13()
	 * @generated
	 * @ordered
	 */
	protected static final double M13_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getM13() <em>M13</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM13()
	 * @generated
	 * @ordered
	 */
	protected double m13 = M13_EDEFAULT;
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
	 * The default value of the '{@link #getM23() <em>M23</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM23()
	 * @generated
	 * @ordered
	 */
	protected static final double M23_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getM23() <em>M23</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM23()
	 * @generated
	 * @ordered
	 */
	protected double m23 = M23_EDEFAULT;
	/**
	 * The default value of the '{@link #getM30() <em>M30</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getM30()
	 * @generated
	 * @ordered
	 */
  protected static final double M30_EDEFAULT = 0.0;
  /**
	 * The cached value of the '{@link #getM30() <em>M30</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getM30()
	 * @generated
	 * @ordered
	 */
  protected double m30 = M30_EDEFAULT;
  /**
	 * The default value of the '{@link #getM31() <em>M31</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM31()
	 * @generated
	 * @ordered
	 */
	protected static final double M31_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getM31() <em>M31</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM31()
	 * @generated
	 * @ordered
	 */
	protected double m31 = M31_EDEFAULT;
	/**
	 * The default value of the '{@link #getM32() <em>M32</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM32()
	 * @generated
	 * @ordered
	 */
	protected static final double M32_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getM32() <em>M32</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM32()
	 * @generated
	 * @ordered
	 */
	protected double m32 = M32_EDEFAULT;
	/**
	 * The default value of the '{@link #getM33() <em>M33</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM33()
	 * @generated
	 * @ordered
	 */
	protected static final double M33_EDEFAULT = 1.0;
	/**
	 * The cached value of the '{@link #getM33() <em>M33</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getM33()
	 * @generated
	 * @ordered
	 */
	protected double m33 = M33_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected Matrix4x4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MathPackage.Literals.MATRIX4X4;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MathPackage.MATRIX4X4__M00, oldM00, m00));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MathPackage.MATRIX4X4__M01, oldM01, m01));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MathPackage.MATRIX4X4__M02, oldM02, m02));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getM03() {
		return m03;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setM03(double newM03) {
		double oldM03 = m03;
		m03 = newM03;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MathPackage.MATRIX4X4__M03, oldM03, m03));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MathPackage.MATRIX4X4__M10, oldM10, m10));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MathPackage.MATRIX4X4__M11, oldM11, m11));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MathPackage.MATRIX4X4__M12, oldM12, m12));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getM13() {
		return m13;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setM13(double newM13) {
		double oldM13 = m13;
		m13 = newM13;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MathPackage.MATRIX4X4__M13, oldM13, m13));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MathPackage.MATRIX4X4__M20, oldM20, m20));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MathPackage.MATRIX4X4__M21, oldM21, m21));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MathPackage.MATRIX4X4__M22, oldM22, m22));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getM23() {
		return m23;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setM23(double newM23) {
		double oldM23 = m23;
		m23 = newM23;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MathPackage.MATRIX4X4__M23, oldM23, m23));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getM30()
  {
		return m30;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setM30(double newM30)
  {
		double oldM30 = m30;
		m30 = newM30;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MathPackage.MATRIX4X4__M30, oldM30, m30));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getM31() {
		return m31;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setM31(double newM31) {
		double oldM31 = m31;
		m31 = newM31;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MathPackage.MATRIX4X4__M31, oldM31, m31));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getM32() {
		return m32;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setM32(double newM32) {
		double oldM32 = m32;
		m32 = newM32;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MathPackage.MATRIX4X4__M32, oldM32, m32));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getM33() {
		return m33;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setM33(double newM33) {
		double oldM33 = m33;
		m33 = newM33;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MathPackage.MATRIX4X4__M33, oldM33, m33));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Matrix4d asMatrix4d() {
		double[] values = new double[] { getM00(), getM01(), getM02(),
				getM03(), getM10(), getM11(), getM12(), getM13(), getM20(),
				getM21(), getM22(), getM23(), getM30(), getM31(), getM32(),
				getM33() };

		return new Matrix4d(values);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MathPackage.MATRIX4X4__M00:
				return getM00();
			case MathPackage.MATRIX4X4__M01:
				return getM01();
			case MathPackage.MATRIX4X4__M02:
				return getM02();
			case MathPackage.MATRIX4X4__M03:
				return getM03();
			case MathPackage.MATRIX4X4__M10:
				return getM10();
			case MathPackage.MATRIX4X4__M11:
				return getM11();
			case MathPackage.MATRIX4X4__M12:
				return getM12();
			case MathPackage.MATRIX4X4__M13:
				return getM13();
			case MathPackage.MATRIX4X4__M20:
				return getM20();
			case MathPackage.MATRIX4X4__M21:
				return getM21();
			case MathPackage.MATRIX4X4__M22:
				return getM22();
			case MathPackage.MATRIX4X4__M23:
				return getM23();
			case MathPackage.MATRIX4X4__M30:
				return getM30();
			case MathPackage.MATRIX4X4__M31:
				return getM31();
			case MathPackage.MATRIX4X4__M32:
				return getM32();
			case MathPackage.MATRIX4X4__M33:
				return getM33();
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
			case MathPackage.MATRIX4X4__M00:
				setM00((Double)newValue);
				return;
			case MathPackage.MATRIX4X4__M01:
				setM01((Double)newValue);
				return;
			case MathPackage.MATRIX4X4__M02:
				setM02((Double)newValue);
				return;
			case MathPackage.MATRIX4X4__M03:
				setM03((Double)newValue);
				return;
			case MathPackage.MATRIX4X4__M10:
				setM10((Double)newValue);
				return;
			case MathPackage.MATRIX4X4__M11:
				setM11((Double)newValue);
				return;
			case MathPackage.MATRIX4X4__M12:
				setM12((Double)newValue);
				return;
			case MathPackage.MATRIX4X4__M13:
				setM13((Double)newValue);
				return;
			case MathPackage.MATRIX4X4__M20:
				setM20((Double)newValue);
				return;
			case MathPackage.MATRIX4X4__M21:
				setM21((Double)newValue);
				return;
			case MathPackage.MATRIX4X4__M22:
				setM22((Double)newValue);
				return;
			case MathPackage.MATRIX4X4__M23:
				setM23((Double)newValue);
				return;
			case MathPackage.MATRIX4X4__M30:
				setM30((Double)newValue);
				return;
			case MathPackage.MATRIX4X4__M31:
				setM31((Double)newValue);
				return;
			case MathPackage.MATRIX4X4__M32:
				setM32((Double)newValue);
				return;
			case MathPackage.MATRIX4X4__M33:
				setM33((Double)newValue);
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
			case MathPackage.MATRIX4X4__M00:
				setM00(M00_EDEFAULT);
				return;
			case MathPackage.MATRIX4X4__M01:
				setM01(M01_EDEFAULT);
				return;
			case MathPackage.MATRIX4X4__M02:
				setM02(M02_EDEFAULT);
				return;
			case MathPackage.MATRIX4X4__M03:
				setM03(M03_EDEFAULT);
				return;
			case MathPackage.MATRIX4X4__M10:
				setM10(M10_EDEFAULT);
				return;
			case MathPackage.MATRIX4X4__M11:
				setM11(M11_EDEFAULT);
				return;
			case MathPackage.MATRIX4X4__M12:
				setM12(M12_EDEFAULT);
				return;
			case MathPackage.MATRIX4X4__M13:
				setM13(M13_EDEFAULT);
				return;
			case MathPackage.MATRIX4X4__M20:
				setM20(M20_EDEFAULT);
				return;
			case MathPackage.MATRIX4X4__M21:
				setM21(M21_EDEFAULT);
				return;
			case MathPackage.MATRIX4X4__M22:
				setM22(M22_EDEFAULT);
				return;
			case MathPackage.MATRIX4X4__M23:
				setM23(M23_EDEFAULT);
				return;
			case MathPackage.MATRIX4X4__M30:
				setM30(M30_EDEFAULT);
				return;
			case MathPackage.MATRIX4X4__M31:
				setM31(M31_EDEFAULT);
				return;
			case MathPackage.MATRIX4X4__M32:
				setM32(M32_EDEFAULT);
				return;
			case MathPackage.MATRIX4X4__M33:
				setM33(M33_EDEFAULT);
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
			case MathPackage.MATRIX4X4__M00:
				return m00 != M00_EDEFAULT;
			case MathPackage.MATRIX4X4__M01:
				return m01 != M01_EDEFAULT;
			case MathPackage.MATRIX4X4__M02:
				return m02 != M02_EDEFAULT;
			case MathPackage.MATRIX4X4__M03:
				return m03 != M03_EDEFAULT;
			case MathPackage.MATRIX4X4__M10:
				return m10 != M10_EDEFAULT;
			case MathPackage.MATRIX4X4__M11:
				return m11 != M11_EDEFAULT;
			case MathPackage.MATRIX4X4__M12:
				return m12 != M12_EDEFAULT;
			case MathPackage.MATRIX4X4__M13:
				return m13 != M13_EDEFAULT;
			case MathPackage.MATRIX4X4__M20:
				return m20 != M20_EDEFAULT;
			case MathPackage.MATRIX4X4__M21:
				return m21 != M21_EDEFAULT;
			case MathPackage.MATRIX4X4__M22:
				return m22 != M22_EDEFAULT;
			case MathPackage.MATRIX4X4__M23:
				return m23 != M23_EDEFAULT;
			case MathPackage.MATRIX4X4__M30:
				return m30 != M30_EDEFAULT;
			case MathPackage.MATRIX4X4__M31:
				return m31 != M31_EDEFAULT;
			case MathPackage.MATRIX4X4__M32:
				return m32 != M32_EDEFAULT;
			case MathPackage.MATRIX4X4__M33:
				return m33 != M33_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(", m03: ");
		result.append(m03);
		result.append(", m10: ");
		result.append(m10);
		result.append(", m11: ");
		result.append(m11);
		result.append(", m12: ");
		result.append(m12);
		result.append(", m13: ");
		result.append(m13);
		result.append(", m20: ");
		result.append(m20);
		result.append(", m21: ");
		result.append(m21);
		result.append(", m22: ");
		result.append(m22);
		result.append(", m23: ");
		result.append(m23);
		result.append(", m30: ");
		result.append(m30);
		result.append(", m31: ");
		result.append(m31);
		result.append(", m32: ");
		result.append(m32);
		result.append(", m33: ");
		result.append(m33);
		result.append(')');
		return result.toString();
	}

} // Matrix4x4Impl
