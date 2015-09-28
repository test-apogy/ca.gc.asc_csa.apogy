/**
 * Canadian Space Agency 2008.
 */
package ca.gc.space.mrt.geometry.data3d.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSetExtent;
import ca.gc.space.mrt.geometry.data3d.Data3dPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Coordinates Set Extent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.CartesianCoordinatesSetExtentImpl#getXMin <em>XMin</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.CartesianCoordinatesSetExtentImpl#getXMax <em>XMax</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.CartesianCoordinatesSetExtentImpl#getYMin <em>YMin</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.CartesianCoordinatesSetExtentImpl#getYMax <em>YMax</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.CartesianCoordinatesSetExtentImpl#getZMin <em>ZMin</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.CartesianCoordinatesSetExtentImpl#getZMax <em>ZMax</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.CartesianCoordinatesSetExtentImpl#getXDimension <em>XDimension</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.CartesianCoordinatesSetExtentImpl#getYDimension <em>YDimension</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.CartesianCoordinatesSetExtentImpl#getZDimension <em>ZDimension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CartesianCoordinatesSetExtentImpl extends EObjectImpl implements CartesianCoordinatesSetExtent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2008.";

	/**
	 * The default value of the '{@link #getXMin() <em>XMin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMin()
	 * @generated
	 * @ordered
	 */
	protected static final double XMIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXMin() <em>XMin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMin()
	 * @generated
	 * @ordered
	 */
	protected double xMin = XMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getXMax() <em>XMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMax()
	 * @generated
	 * @ordered
	 */
	protected static final double XMAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXMax() <em>XMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMax()
	 * @generated
	 * @ordered
	 */
	protected double xMax = XMAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getYMin() <em>YMin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYMin()
	 * @generated
	 * @ordered
	 */
	protected static final double YMIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYMin() <em>YMin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYMin()
	 * @generated
	 * @ordered
	 */
	protected double yMin = YMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getYMax() <em>YMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYMax()
	 * @generated
	 * @ordered
	 */
	protected static final double YMAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYMax() <em>YMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYMax()
	 * @generated
	 * @ordered
	 */
	protected double yMax = YMAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getZMin() <em>ZMin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZMin()
	 * @generated
	 * @ordered
	 */
	protected static final double ZMIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getZMin() <em>ZMin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZMin()
	 * @generated
	 * @ordered
	 */
	protected double zMin = ZMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getZMax() <em>ZMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZMax()
	 * @generated
	 * @ordered
	 */
	protected static final double ZMAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getZMax() <em>ZMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZMax()
	 * @generated
	 * @ordered
	 */
	protected double zMax = ZMAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getXDimension() <em>XDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDimension()
	 * @generated
	 * @ordered
	 */
	protected static final double XDIMENSION_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getYDimension() <em>YDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDimension()
	 * @generated
	 * @ordered
	 */
	protected static final double YDIMENSION_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getZDimension() <em>ZDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZDimension()
	 * @generated
	 * @ordered
	 */
	protected static final double ZDIMENSION_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianCoordinatesSetExtentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data3dPackage.Literals.CARTESIAN_COORDINATES_SET_EXTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXMin() {
		return xMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXMin(double newXMin) {
		double oldXMin = xMin;
		xMin = newXMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__XMIN, oldXMin, xMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXMax() {
		return xMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXMax(double newXMax) {
		double oldXMax = xMax;
		xMax = newXMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__XMAX, oldXMax, xMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYMin() {
		return yMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYMin(double newYMin) {
		double oldYMin = yMin;
		yMin = newYMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__YMIN, oldYMin, yMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYMax() {
		return yMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYMax(double newYMax) {
		double oldYMax = yMax;
		yMax = newYMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__YMAX, oldYMax, yMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getZMin() {
		return zMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZMin(double newZMin) {
		double oldZMin = zMin;
		zMin = newZMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__ZMIN, oldZMin, zMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getZMax() {
		return zMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZMax(double newZMax) {
		double oldZMax = zMax;
		zMax = newZMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__ZMAX, oldZMax, zMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getXDimension() 
	{
		return getXMax() - getXMin();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getYDimension() {
		return getYMax() - getYMin();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getZDimension() {
		return getZMax() - getZMin();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__XMIN:
				return getXMin();
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__XMAX:
				return getXMax();
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__YMIN:
				return getYMin();
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__YMAX:
				return getYMax();
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__ZMIN:
				return getZMin();
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__ZMAX:
				return getZMax();
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__XDIMENSION:
				return getXDimension();
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__YDIMENSION:
				return getYDimension();
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__ZDIMENSION:
				return getZDimension();
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
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__XMIN:
				setXMin((Double)newValue);
				return;
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__XMAX:
				setXMax((Double)newValue);
				return;
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__YMIN:
				setYMin((Double)newValue);
				return;
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__YMAX:
				setYMax((Double)newValue);
				return;
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__ZMIN:
				setZMin((Double)newValue);
				return;
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__ZMAX:
				setZMax((Double)newValue);
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
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__XMIN:
				setXMin(XMIN_EDEFAULT);
				return;
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__XMAX:
				setXMax(XMAX_EDEFAULT);
				return;
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__YMIN:
				setYMin(YMIN_EDEFAULT);
				return;
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__YMAX:
				setYMax(YMAX_EDEFAULT);
				return;
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__ZMIN:
				setZMin(ZMIN_EDEFAULT);
				return;
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__ZMAX:
				setZMax(ZMAX_EDEFAULT);
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
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__XMIN:
				return xMin != XMIN_EDEFAULT;
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__XMAX:
				return xMax != XMAX_EDEFAULT;
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__YMIN:
				return yMin != YMIN_EDEFAULT;
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__YMAX:
				return yMax != YMAX_EDEFAULT;
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__ZMIN:
				return zMin != ZMIN_EDEFAULT;
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__ZMAX:
				return zMax != ZMAX_EDEFAULT;
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__XDIMENSION:
				return getXDimension() != XDIMENSION_EDEFAULT;
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__YDIMENSION:
				return getYDimension() != YDIMENSION_EDEFAULT;
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__ZDIMENSION:
				return getZDimension() != ZDIMENSION_EDEFAULT;
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
		result.append(" (xMin: ");
		result.append(xMin);
		result.append(", xMax: ");
		result.append(xMax);
		result.append(", yMin: ");
		result.append(yMin);
		result.append(", yMax: ");
		result.append(yMax);
		result.append(", zMin: ");
		result.append(zMin);
		result.append(", zMax: ");
		result.append(zMax);
		result.append(')');
		return result.toString();
	}

} //CartesianCoordinatesSetExtentImpl
