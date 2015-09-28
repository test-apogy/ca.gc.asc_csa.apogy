/**
 * Canadian Space Agency 2008.
 *
 * $Id: PointsRangeGagerImpl.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.space.mrt.common.processors.impl.ProcessorImpl;
import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.space.mrt.geometry.data3d.Data3dFacade;
import ca.gc.space.mrt.geometry.data3d.Data3dFactory;
import ca.gc.space.mrt.geometry.data3d.Data3dPackage;
import ca.gc.space.mrt.geometry.data3d.PointsRangeGager;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Points Range Gager</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.PointsRangeGagerImpl#getMinX <em>Min X</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.PointsRangeGagerImpl#getMaxX <em>Max X</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.PointsRangeGagerImpl#getMinY <em>Min Y</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.PointsRangeGagerImpl#getMaxY <em>Max Y</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.PointsRangeGagerImpl#getMinZ <em>Min Z</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.PointsRangeGagerImpl#getMaxZ <em>Max Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointsRangeGagerImpl extends
		ProcessorImpl<CartesianCoordinatesSet, CartesianCoordinatesSet>
		implements PointsRangeGager {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2008.";

	/**
	 * The default value of the '{@link #getMinX() <em>Min X</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMinX()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_X_EDEFAULT = -1.0;

	/**
	 * The cached value of the '{@link #getMinX() <em>Min X</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMinX()
	 * @generated
	 * @ordered
	 */
	protected double minX = MIN_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxX() <em>Max X</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxX()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_X_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getMaxX() <em>Max X</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxX()
	 * @generated
	 * @ordered
	 */
	protected double maxX = MAX_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinY() <em>Min Y</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMinY()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_Y_EDEFAULT = -1.0;

	/**
	 * The cached value of the '{@link #getMinY() <em>Min Y</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMinY()
	 * @generated
	 * @ordered
	 */
	protected double minY = MIN_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxY() <em>Max Y</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxY()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_Y_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getMaxY() <em>Max Y</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxY()
	 * @generated
	 * @ordered
	 */
	protected double maxY = MAX_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinZ() <em>Min Z</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMinZ()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_Z_EDEFAULT = -1.0;

	/**
	 * The cached value of the '{@link #getMinZ() <em>Min Z</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMinZ()
	 * @generated
	 * @ordered
	 */
	protected double minZ = MIN_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxZ() <em>Max Z</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxZ()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_Z_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getMaxZ() <em>Max Z</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxZ()
	 * @generated
	 * @ordered
	 */
	protected double maxZ = MAX_Z_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	protected PointsRangeGagerImpl() {
		super();

		setMinX(Double.MIN_VALUE);
		setMinY(Double.MIN_VALUE);
		setMinZ(Double.MIN_VALUE);

		setMaxX(Double.MAX_VALUE);
		setMaxY(Double.MAX_VALUE);
		setMaxZ(Double.MAX_VALUE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data3dPackage.Literals.POINTS_RANGE_GAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setInput(CartesianCoordinatesSet newInput) {
		super.setInput(newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setOutput(CartesianCoordinatesSet newOutput) {
		super.setOutput(newOutput);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinX() {
		return minX;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinX(double newMinX) {
		double oldMinX = minX;
		minX = newMinX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.POINTS_RANGE_GAGER__MIN_X, oldMinX, minX));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxX() {
		return maxX;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxX(double newMaxX) {
		double oldMaxX = maxX;
		maxX = newMaxX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.POINTS_RANGE_GAGER__MAX_X, oldMaxX, maxX));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinY() {
		return minY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinY(double newMinY) {
		double oldMinY = minY;
		minY = newMinY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.POINTS_RANGE_GAGER__MIN_Y, oldMinY, minY));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxY() {
		return maxY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxY(double newMaxY) {
		double oldMaxY = maxY;
		maxY = newMaxY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.POINTS_RANGE_GAGER__MAX_Y, oldMaxY, maxY));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinZ() {
		return minZ;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinZ(double newMinZ) {
		double oldMinZ = minZ;
		minZ = newMinZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.POINTS_RANGE_GAGER__MIN_Z, oldMinZ, minZ));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxZ() {
		return maxZ;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxZ(double newMaxZ) {
		double oldMaxZ = maxZ;
		maxZ = newMaxZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.POINTS_RANGE_GAGER__MAX_Z, oldMaxZ, maxZ));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Data3dPackage.POINTS_RANGE_GAGER__MIN_X:
				return getMinX();
			case Data3dPackage.POINTS_RANGE_GAGER__MAX_X:
				return getMaxX();
			case Data3dPackage.POINTS_RANGE_GAGER__MIN_Y:
				return getMinY();
			case Data3dPackage.POINTS_RANGE_GAGER__MAX_Y:
				return getMaxY();
			case Data3dPackage.POINTS_RANGE_GAGER__MIN_Z:
				return getMinZ();
			case Data3dPackage.POINTS_RANGE_GAGER__MAX_Z:
				return getMaxZ();
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
			case Data3dPackage.POINTS_RANGE_GAGER__MIN_X:
				setMinX((Double)newValue);
				return;
			case Data3dPackage.POINTS_RANGE_GAGER__MAX_X:
				setMaxX((Double)newValue);
				return;
			case Data3dPackage.POINTS_RANGE_GAGER__MIN_Y:
				setMinY((Double)newValue);
				return;
			case Data3dPackage.POINTS_RANGE_GAGER__MAX_Y:
				setMaxY((Double)newValue);
				return;
			case Data3dPackage.POINTS_RANGE_GAGER__MIN_Z:
				setMinZ((Double)newValue);
				return;
			case Data3dPackage.POINTS_RANGE_GAGER__MAX_Z:
				setMaxZ((Double)newValue);
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
			case Data3dPackage.POINTS_RANGE_GAGER__MIN_X:
				setMinX(MIN_X_EDEFAULT);
				return;
			case Data3dPackage.POINTS_RANGE_GAGER__MAX_X:
				setMaxX(MAX_X_EDEFAULT);
				return;
			case Data3dPackage.POINTS_RANGE_GAGER__MIN_Y:
				setMinY(MIN_Y_EDEFAULT);
				return;
			case Data3dPackage.POINTS_RANGE_GAGER__MAX_Y:
				setMaxY(MAX_Y_EDEFAULT);
				return;
			case Data3dPackage.POINTS_RANGE_GAGER__MIN_Z:
				setMinZ(MIN_Z_EDEFAULT);
				return;
			case Data3dPackage.POINTS_RANGE_GAGER__MAX_Z:
				setMaxZ(MAX_Z_EDEFAULT);
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
			case Data3dPackage.POINTS_RANGE_GAGER__MIN_X:
				return minX != MIN_X_EDEFAULT;
			case Data3dPackage.POINTS_RANGE_GAGER__MAX_X:
				return maxX != MAX_X_EDEFAULT;
			case Data3dPackage.POINTS_RANGE_GAGER__MIN_Y:
				return minY != MIN_Y_EDEFAULT;
			case Data3dPackage.POINTS_RANGE_GAGER__MAX_Y:
				return maxY != MAX_Y_EDEFAULT;
			case Data3dPackage.POINTS_RANGE_GAGER__MIN_Z:
				return minZ != MIN_Z_EDEFAULT;
			case Data3dPackage.POINTS_RANGE_GAGER__MAX_Z:
				return maxZ != MAX_Z_EDEFAULT;
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
		result.append(" (minX: ");
		result.append(minX);
		result.append(", maxX: ");
		result.append(maxX);
		result.append(", minY: ");
		result.append(minY);
		result.append(", maxY: ");
		result.append(maxY);
		result.append(", minZ: ");
		result.append(minZ);
		result.append(", maxZ: ");
		result.append(maxZ);
		result.append(')');
		return result.toString();
	}

	@Override
	public CartesianCoordinatesSet process(CartesianCoordinatesSet input)
			throws Exception {

		if (getMinX() > getMaxX()) {
			throw new IllegalArgumentException("Invalid X range, x min > max x");
		}

		if (getMinY() > getMaxY()) {
			throw new IllegalArgumentException("Invalid Y range, y min > max y");
		}

		if (getMinZ() > getMaxZ()) {
			throw new IllegalArgumentException("Invalid Z range, z min > max z");
		}

		if (input == null) {
			throw new IllegalArgumentException("Illegal input (null)");
		}

		CartesianCoordinatesSet output = Data3dFactory.eINSTANCE
				.createCartesianCoordinatesSet();

		for (CartesianPositionCoordinates point : input.getPoints()) {
			if (isInRange(point)) {
				// We create a copy of the point.
				CartesianPositionCoordinates pointCopy = Data3dFacade.INSTANCE
						.createCartesianPositionCoordinates(point);

				output.getPoints().add(pointCopy);
			}
		}

		setOutput(output);

		return output;
	}

	private boolean isInRange(CartesianPositionCoordinates point) {

		return point.getX() >= getMinX() && point.getX() <= getMaxX()
				&& point.getY() >= getMinY() && point.getY() <= getMaxY()
				&& point.getZ() >= getMinZ() && point.getZ() <= getMaxZ();
	}

} // PointsRangeGagerImpl
