/**
 * Canadian Space Agency 2007.
 *
 * $Id: DistanceRangeImpl.java,v 1.5.4.2 2015/05/21 15:51:25 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.fov.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.addons.sensors.fov.DistanceRange;
import org.eclipse.symphony.addons.sensors.fov.FovPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.fov.impl.DistanceRangeImpl#getMinimumDistance <em>Minimum Distance</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.fov.impl.DistanceRangeImpl#getMaximumDistance <em>Maximum Distance</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.fov.impl.DistanceRangeImpl#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistanceRangeImpl extends MinimalEObjectImpl.Container implements DistanceRange {
	/**
	 * The default value of the '{@link #getMinimumDistance() <em>Minimum Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_DISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimumDistance() <em>Minimum Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumDistance()
	 * @generated
	 * @ordered
	 */
	protected double minimumDistance = MINIMUM_DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumDistance() <em>Maximum Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_DISTANCE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getMaximumDistance() <em>Maximum Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumDistance()
	 * @generated
	 * @ordered
	 */
	protected double maximumDistance = MAXIMUM_DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistanceRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FovPackage.Literals.DISTANCE_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumDistance() {
		return minimumDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumDistance(double newMinimumDistance) {
		double oldMinimumDistance = minimumDistance;
		minimumDistance = newMinimumDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FovPackage.DISTANCE_RANGE__MINIMUM_DISTANCE, oldMinimumDistance, minimumDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumDistance() {
		return maximumDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumDistance(double newMaximumDistance) {
		double oldMaximumDistance = maximumDistance;
		maximumDistance = newMaximumDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FovPackage.DISTANCE_RANGE__MAXIMUM_DISTANCE, oldMaximumDistance, maximumDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getDistance()
	{
		return getMaximumDistance() - getMinimumDistance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public boolean isWithinRange(double distance)
	{
		return ( (distance <= getMaximumDistance()) && (distance >= getMinimumDistance()) );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FovPackage.DISTANCE_RANGE__MINIMUM_DISTANCE:
				return getMinimumDistance();
			case FovPackage.DISTANCE_RANGE__MAXIMUM_DISTANCE:
				return getMaximumDistance();
			case FovPackage.DISTANCE_RANGE__DISTANCE:
				return getDistance();
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
			case FovPackage.DISTANCE_RANGE__MINIMUM_DISTANCE:
				setMinimumDistance((Double)newValue);
				return;
			case FovPackage.DISTANCE_RANGE__MAXIMUM_DISTANCE:
				setMaximumDistance((Double)newValue);
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
			case FovPackage.DISTANCE_RANGE__MINIMUM_DISTANCE:
				setMinimumDistance(MINIMUM_DISTANCE_EDEFAULT);
				return;
			case FovPackage.DISTANCE_RANGE__MAXIMUM_DISTANCE:
				setMaximumDistance(MAXIMUM_DISTANCE_EDEFAULT);
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
			case FovPackage.DISTANCE_RANGE__MINIMUM_DISTANCE:
				return minimumDistance != MINIMUM_DISTANCE_EDEFAULT;
			case FovPackage.DISTANCE_RANGE__MAXIMUM_DISTANCE:
				return maximumDistance != MAXIMUM_DISTANCE_EDEFAULT;
			case FovPackage.DISTANCE_RANGE__DISTANCE:
				return getDistance() != DISTANCE_EDEFAULT;
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
			case FovPackage.DISTANCE_RANGE___IS_WITHIN_RANGE__DOUBLE:
				return isWithinRange((Double)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (minimumDistance: ");
		result.append(minimumDistance);
		result.append(", maximumDistance: ");
		result.append(maximumDistance);
		result.append(')');
		return result.toString();
	}

} //DistanceRangeImpl