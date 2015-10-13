/**
 * Canadian Space Agency 2007.
 *
 * $Id: Coordinates25DImpl.java,v 1.5.4.2 2015/05/21 15:51:20 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data25d.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.geometry.data.impl.CoordinatesImpl;
import org.eclipse.symphony.common.geometry.data25d.Coordinates25D;
import org.eclipse.symphony.common.geometry.data25d.Data25dPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinates25 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data25d.impl.Coordinates25DImpl#getU <em>U</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data25d.impl.Coordinates25DImpl#getV <em>V</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data25d.impl.Coordinates25DImpl#getW <em>W</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Coordinates25DImpl extends CoordinatesImpl implements Coordinates25D {
	/**
	 * The default value of the '{@link #getU() <em>U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getU()
	 * @generated
	 * @ordered
	 */
	protected static final double U_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getU() <em>U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getU()
	 * @generated
	 * @ordered
	 */
	protected double u = U_EDEFAULT;

	/**
	 * The default value of the '{@link #getV() <em>V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV()
	 * @generated
	 * @ordered
	 */
	protected static final double V_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getV() <em>V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV()
	 * @generated
	 * @ordered
	 */
	protected double v = V_EDEFAULT;

	/**
	 * The default value of the '{@link #getW() <em>W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW()
	 * @generated
	 * @ordered
	 */
	protected static final double W_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getW() <em>W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW()
	 * @generated
	 * @ordered
	 */
	protected double w = W_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Coordinates25DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data25dPackage.Literals.COORDINATES25_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getU() {
		return u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setU(double newU) {
		double oldU = u;
		u = newU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data25dPackage.COORDINATES25_D__U, oldU, u));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getV() {
		return v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV(double newV) {
		double oldV = v;
		v = newV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data25dPackage.COORDINATES25_D__V, oldV, v));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getW() {
		return w;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setW(double newW) {
		double oldW = w;
		w = newW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data25dPackage.COORDINATES25_D__W, oldW, w));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Data25dPackage.COORDINATES25_D__U:
				return getU();
			case Data25dPackage.COORDINATES25_D__V:
				return getV();
			case Data25dPackage.COORDINATES25_D__W:
				return getW();
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
			case Data25dPackage.COORDINATES25_D__U:
				setU((Double)newValue);
				return;
			case Data25dPackage.COORDINATES25_D__V:
				setV((Double)newValue);
				return;
			case Data25dPackage.COORDINATES25_D__W:
				setW((Double)newValue);
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
			case Data25dPackage.COORDINATES25_D__U:
				setU(U_EDEFAULT);
				return;
			case Data25dPackage.COORDINATES25_D__V:
				setV(V_EDEFAULT);
				return;
			case Data25dPackage.COORDINATES25_D__W:
				setW(W_EDEFAULT);
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
			case Data25dPackage.COORDINATES25_D__U:
				return u != U_EDEFAULT;
			case Data25dPackage.COORDINATES25_D__V:
				return v != V_EDEFAULT;
			case Data25dPackage.COORDINATES25_D__W:
				return w != W_EDEFAULT;
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
		result.append(" (u: ");
		result.append(u);
		result.append(", v: ");
		result.append(v);
		result.append(", w: ");
		result.append(w);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Coordinates25D point = (Coordinates25D) obj;
		if((point != null) && (point.getU() == u) && (point.getV() == v) && (point.getW() == w))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

} //Coordinates25DImpl
