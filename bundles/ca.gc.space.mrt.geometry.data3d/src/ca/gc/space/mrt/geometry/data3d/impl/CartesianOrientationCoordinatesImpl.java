/**
 * Canadian Space Agency 2007.
 *
 * $Id: CartesianOrientationCoordinatesImpl.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.space.mrt.geometry.data.impl.CoordinatesImpl;
import ca.gc.space.mrt.geometry.data3d.CartesianOrientationCoordinates;
import ca.gc.space.mrt.geometry.data3d.Data3dPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Orientation Coordinates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.CartesianOrientationCoordinatesImpl#getXRotation <em>XRotation</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.CartesianOrientationCoordinatesImpl#getYRotation <em>YRotation</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.CartesianOrientationCoordinatesImpl#getZRotation <em>ZRotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CartesianOrientationCoordinatesImpl extends CoordinatesImpl implements CartesianOrientationCoordinates {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2008.";

	/**
	 * The default value of the '{@link #getXRotation() <em>XRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRotation()
	 * @generated
	 * @ordered
	 */
	protected static final double XROTATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXRotation() <em>XRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRotation()
	 * @generated
	 * @ordered
	 */
	protected double xRotation = XROTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getYRotation() <em>YRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYRotation()
	 * @generated
	 * @ordered
	 */
	protected static final double YROTATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYRotation() <em>YRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYRotation()
	 * @generated
	 * @ordered
	 */
	protected double yRotation = YROTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getZRotation() <em>ZRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZRotation()
	 * @generated
	 * @ordered
	 */
	protected static final double ZROTATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getZRotation() <em>ZRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZRotation()
	 * @generated
	 * @ordered
	 */
	protected double zRotation = ZROTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianOrientationCoordinatesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data3dPackage.Literals.CARTESIAN_ORIENTATION_COORDINATES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXRotation() {
		return xRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRotation(double newXRotation) {
		double oldXRotation = xRotation;
		xRotation = newXRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.CARTESIAN_ORIENTATION_COORDINATES__XROTATION, oldXRotation, xRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYRotation() {
		return yRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYRotation(double newYRotation) {
		double oldYRotation = yRotation;
		yRotation = newYRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.CARTESIAN_ORIENTATION_COORDINATES__YROTATION, oldYRotation, yRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getZRotation() {
		return zRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZRotation(double newZRotation) {
		double oldZRotation = zRotation;
		zRotation = newZRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.CARTESIAN_ORIENTATION_COORDINATES__ZROTATION, oldZRotation, zRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Data3dPackage.CARTESIAN_ORIENTATION_COORDINATES__XROTATION:
				return getXRotation();
			case Data3dPackage.CARTESIAN_ORIENTATION_COORDINATES__YROTATION:
				return getYRotation();
			case Data3dPackage.CARTESIAN_ORIENTATION_COORDINATES__ZROTATION:
				return getZRotation();
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
			case Data3dPackage.CARTESIAN_ORIENTATION_COORDINATES__XROTATION:
				setXRotation((Double)newValue);
				return;
			case Data3dPackage.CARTESIAN_ORIENTATION_COORDINATES__YROTATION:
				setYRotation((Double)newValue);
				return;
			case Data3dPackage.CARTESIAN_ORIENTATION_COORDINATES__ZROTATION:
				setZRotation((Double)newValue);
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
			case Data3dPackage.CARTESIAN_ORIENTATION_COORDINATES__XROTATION:
				setXRotation(XROTATION_EDEFAULT);
				return;
			case Data3dPackage.CARTESIAN_ORIENTATION_COORDINATES__YROTATION:
				setYRotation(YROTATION_EDEFAULT);
				return;
			case Data3dPackage.CARTESIAN_ORIENTATION_COORDINATES__ZROTATION:
				setZRotation(ZROTATION_EDEFAULT);
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
			case Data3dPackage.CARTESIAN_ORIENTATION_COORDINATES__XROTATION:
				return xRotation != XROTATION_EDEFAULT;
			case Data3dPackage.CARTESIAN_ORIENTATION_COORDINATES__YROTATION:
				return yRotation != YROTATION_EDEFAULT;
			case Data3dPackage.CARTESIAN_ORIENTATION_COORDINATES__ZROTATION:
				return zRotation != ZROTATION_EDEFAULT;
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
		result.append(" (xRotation: ");
		result.append(xRotation);
		result.append(", yRotation: ");
		result.append(yRotation);
		result.append(", zRotation: ");
		result.append(zRotation);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean equals(Object obj) {
		
		if(super.equals(obj))
		{
			return true;
		}
		else if( obj instanceof CartesianOrientationCoordinates)
		{
			CartesianOrientationCoordinates coord = (CartesianOrientationCoordinates) obj;
			
			// TODO : Ensures that equivalent angle are found to be equal.
			
			return ( (coord.getXRotation() == getXRotation()) && (coord.getYRotation() == getYRotation()) && (coord.getZRotation() == getZRotation()));
		}
		else
		{
			return false;
		}
	}
} //CartesianOrientationCoordinatesImpl
