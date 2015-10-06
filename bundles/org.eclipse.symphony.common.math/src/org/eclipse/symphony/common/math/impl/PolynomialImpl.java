/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.symphony.common.math.impl;

import java.util.Arrays;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.math.MathPackage;
import org.eclipse.symphony.common.math.Polynomial;
import Jama.EigenvalueDecomposition;
import Jama.Matrix;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Polynomial</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.math.impl.PolynomialImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.math.impl.PolynomialImpl#getCoeffs <em>Coeffs</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.math.impl.PolynomialImpl#getRealRoots <em>Real Roots</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.math.impl.PolynomialImpl#getImaginaryRoots <em>Imaginary Roots</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolynomialImpl extends MinimalEObjectImpl.Container implements Polynomial {
	/**
	 * The default value of the '{@link #getDegree() <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected static final int DEGREE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getCoeffs() <em>Coeffs</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCoeffs()
	 * @generated
	 * @ordered
	 */
	protected static final double[] COEFFS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoeffs() <em>Coeffs</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCoeffs()
	 * @generated
	 * @ordered
	 */
	protected double[] coeffs = COEFFS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRealRoots() <em>Real Roots</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRealRoots()
	 * @generated
	 * @ordered
	 */
	protected static final double[] REAL_ROOTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRealRoots() <em>Real Roots</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRealRoots()
	 * @generated
	 * @ordered
	 */
	protected double[] realRoots = REAL_ROOTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getImaginaryRoots() <em>Imaginary Roots</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getImaginaryRoots()
	 * @generated
	 * @ordered
	 */
	protected static final double[] IMAGINARY_ROOTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImaginaryRoots() <em>Imaginary Roots</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getImaginaryRoots()
	 * @generated
	 * @ordered
	 */
	protected double[] imaginaryRoots = IMAGINARY_ROOTS_EDEFAULT;

	private boolean isDirty;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PolynomialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MathPackage.Literals.POLYNOMIAL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public int getDegree() {
		if (getCoeffs() == null || getCoeffs().length == 0) {
			return -1;
		} else {
			return getCoeffs().length - 1;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double[] getCoeffs() {
		return coeffs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void setCoeffs(double[] newCoeffs) {
		double[] oldCoeffs = coeffs;
		coeffs = newCoeffs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MathPackage.POLYNOMIAL__COEFFS, oldCoeffs, coeffs));
		isDirty = true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public double[] getRealRoots() {

		if (isDirty) {
			roots();
		}

		return realRoots;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public double[] getImaginaryRoots() {

		if (isDirty) {
			roots();
		}

		return imaginaryRoots;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MathPackage.POLYNOMIAL__DEGREE:
				return getDegree();
			case MathPackage.POLYNOMIAL__COEFFS:
				return getCoeffs();
			case MathPackage.POLYNOMIAL__REAL_ROOTS:
				return getRealRoots();
			case MathPackage.POLYNOMIAL__IMAGINARY_ROOTS:
				return getImaginaryRoots();
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
			case MathPackage.POLYNOMIAL__COEFFS:
				setCoeffs((double[])newValue);
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
			case MathPackage.POLYNOMIAL__COEFFS:
				setCoeffs(COEFFS_EDEFAULT);
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
			case MathPackage.POLYNOMIAL__DEGREE:
				return getDegree() != DEGREE_EDEFAULT;
			case MathPackage.POLYNOMIAL__COEFFS:
				return COEFFS_EDEFAULT == null ? coeffs != null : !COEFFS_EDEFAULT.equals(coeffs);
			case MathPackage.POLYNOMIAL__REAL_ROOTS:
				return REAL_ROOTS_EDEFAULT == null ? realRoots != null : !REAL_ROOTS_EDEFAULT.equals(realRoots);
			case MathPackage.POLYNOMIAL__IMAGINARY_ROOTS:
				return IMAGINARY_ROOTS_EDEFAULT == null ? imaginaryRoots != null : !IMAGINARY_ROOTS_EDEFAULT.equals(imaginaryRoots);
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
		result.append(" (coeffs: ");
		result.append(coeffs);
		result.append(", realRoots: ");
		result.append(realRoots);
		result.append(", imaginaryRoots: ");
		result.append(imaginaryRoots);
		result.append(')');
		return result.toString();
	}

	private void roots() {
		double[] a = getCoeffs();
		int m = a.length - 1;
		Matrix hess = new Matrix(m + 1, m + 1);

		for (int k = 1; k <= m; k++) {
			if ( a[m] == 0 ) {
				System.err.println("division by 0");
			}
			hess.set(1, k, -a[m - k] / a[m]);
			for (int j = 2; j <= m; j++) {
				hess.set(j, k, 0.0);
			}

			if (k != m) {
				hess.set(k + 1, k, 1.0);
			}
		}
		
		EigenvalueDecomposition eig = new EigenvalueDecomposition(hess);

		this.realRoots = Arrays.copyOf(eig.getRealEigenvalues(), eig
				.getRealEigenvalues().length);

		this.imaginaryRoots = Arrays.copyOf(eig.getImagEigenvalues(), eig
				.getRealEigenvalues().length);

		isDirty = false;
	}

} // PolynomialImpl
