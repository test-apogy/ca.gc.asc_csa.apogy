/**
 * Canadian Space Agency 2007.
 *
 * $Id: AngularSpanImpl.java,v 1.5.4.2 2015/05/21 15:51:25 pallard Exp $
 */
package ca.gc.space.mrt.sensors.fov.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.symphony.common.math.GeometricUtils;

import ca.gc.space.mrt.sensors.fov.AngularSpan;
import ca.gc.space.mrt.sensors.fov.FovPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angular Span</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.fov.impl.AngularSpanImpl#getMinimumAngle <em>Minimum Angle</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.fov.impl.AngularSpanImpl#getMaximumAngle <em>Maximum Angle</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.fov.impl.AngularSpanImpl#getSpanningAngle <em>Spanning Angle</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.fov.impl.AngularSpanImpl#getCenterAngle <em>Center Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AngularSpanImpl extends EObjectImpl implements AngularSpan {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

	/**
	 * The default value of the '{@link #getMinimumAngle() <em>Minimum Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimumAngle() <em>Minimum Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumAngle()
	 * @generated
	 * @ordered
	 */
	protected double minimumAngle = MINIMUM_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumAngle() <em>Maximum Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximumAngle() <em>Maximum Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumAngle()
	 * @generated
	 * @ordered
	 */
	protected double maximumAngle = MAXIMUM_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpanningAngle() <em>Spanning Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpanningAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double SPANNING_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpanningAngle() <em>Spanning Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpanningAngle()
	 * @generated
	 * @ordered
	 */
	protected double spanningAngle = SPANNING_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCenterAngle() <em>Center Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double CENTER_ANGLE_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngularSpanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FovPackage.Literals.ANGULAR_SPAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumAngle() {
		return minimumAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumAngle(double newMinimumAngle) {
		double oldMinimumAngle = minimumAngle;
		minimumAngle = newMinimumAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FovPackage.ANGULAR_SPAN__MINIMUM_ANGLE, oldMinimumAngle, minimumAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumAngle() {
		return maximumAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumAngle(double newMaximumAngle) {
		double oldMaximumAngle = maximumAngle;
		maximumAngle = newMaximumAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FovPackage.ANGULAR_SPAN__MAXIMUM_ANGLE, oldMaximumAngle, maximumAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getSpanningAngle() 
	{
		return getMaximumAngle() - getMinimumAngle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getCenterAngle()
	{		
		return (getMinimumAngle() +  getMaximumAngle()) / 2.0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public boolean isWithinRange(double angle)
	{
		double min = GeometricUtils.normalizeAngleToPositiveValue(getMinimumAngle());
		double max = GeometricUtils.normalizeAngleToPositiveValue(getMaximumAngle());
		double normalizedAngle = GeometricUtils.normalizeAngleToPositiveValue(angle);
		return ((normalizedAngle >= min) && (normalizedAngle <= max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FovPackage.ANGULAR_SPAN__MINIMUM_ANGLE:
				return getMinimumAngle();
			case FovPackage.ANGULAR_SPAN__MAXIMUM_ANGLE:
				return getMaximumAngle();
			case FovPackage.ANGULAR_SPAN__SPANNING_ANGLE:
				return getSpanningAngle();
			case FovPackage.ANGULAR_SPAN__CENTER_ANGLE:
				return getCenterAngle();
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
			case FovPackage.ANGULAR_SPAN__MINIMUM_ANGLE:
				setMinimumAngle((Double)newValue);
				return;
			case FovPackage.ANGULAR_SPAN__MAXIMUM_ANGLE:
				setMaximumAngle((Double)newValue);
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
			case FovPackage.ANGULAR_SPAN__MINIMUM_ANGLE:
				setMinimumAngle(MINIMUM_ANGLE_EDEFAULT);
				return;
			case FovPackage.ANGULAR_SPAN__MAXIMUM_ANGLE:
				setMaximumAngle(MAXIMUM_ANGLE_EDEFAULT);
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
			case FovPackage.ANGULAR_SPAN__MINIMUM_ANGLE:
				return minimumAngle != MINIMUM_ANGLE_EDEFAULT;
			case FovPackage.ANGULAR_SPAN__MAXIMUM_ANGLE:
				return maximumAngle != MAXIMUM_ANGLE_EDEFAULT;
			case FovPackage.ANGULAR_SPAN__SPANNING_ANGLE:
				return spanningAngle != SPANNING_ANGLE_EDEFAULT;
			case FovPackage.ANGULAR_SPAN__CENTER_ANGLE:
				return getCenterAngle() != CENTER_ANGLE_EDEFAULT;
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
			case FovPackage.ANGULAR_SPAN___IS_WITHIN_RANGE__DOUBLE:
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
		result.append(" (minimumAngle: ");
		result.append(minimumAngle);
		result.append(", maximumAngle: ");
		result.append(maximumAngle);
		result.append(", spanningAngle: ");
		result.append(spanningAngle);
		result.append(')');
		return result.toString();
	}

} //AngularSpanImpl
