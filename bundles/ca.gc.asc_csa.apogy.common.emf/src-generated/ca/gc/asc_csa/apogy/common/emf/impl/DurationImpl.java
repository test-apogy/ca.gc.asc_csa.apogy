/**
 */
package ca.gc.asc_csa.apogy.common.emf.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFactory;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.Duration;
import ca.gc.asc_csa.apogy.common.emf.Timed;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.impl.DurationImpl#getValue <em>Value</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.impl.DurationImpl#getDays <em>Days</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.impl.DurationImpl#getHours <em>Hours</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.impl.DurationImpl#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.impl.DurationImpl#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.impl.DurationImpl#getMilliseconds <em>Milliseconds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DurationImpl extends MinimalEObjectImpl.Container implements Duration {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final long VALUE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected long value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDays() <em>Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDays()
	 * @generated
	 * @ordered
	 */
	protected static final byte DAYS_EDEFAULT = 0x00;

	/**
	 * The default value of the '{@link #getHours() <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHours()
	 * @generated
	 * @ordered
	 */
	protected static final byte HOURS_EDEFAULT = 0x00;

	/**
	 * The default value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final byte MINUTES_EDEFAULT = 0x00;

	/**
	 * The default value of the '{@link #getSeconds() <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final byte SECONDS_EDEFAULT = 0x00;

	/**
	 * The default value of the '{@link #getMilliseconds() <em>Milliseconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilliseconds()
	 * @generated
	 * @ordered
	 */
	protected static final int MILLISECONDS_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonEMFPackage.Literals.DURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(long newValue) {
		long oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonEMFPackage.DURATION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public byte getDays() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public byte getHours() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public byte getMinutes() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public byte getSeconds() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public int getMilliseconds() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Duration getDuration(Timed firstEvent, Timed secondEvent) {
		Duration duration = ApogyCommonEMFFactory.eINSTANCE.createDuration();
		long durationValue = 0;
		
		if (firstEvent != null & firstEvent.getTime() != null && secondEvent != null && secondEvent.getTime() != null){
			durationValue = secondEvent.getTime().getTime() - firstEvent.getTime().getTime();
		}		
		duration.setValue(durationValue);
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonEMFPackage.DURATION__VALUE:
				return getValue();
			case ApogyCommonEMFPackage.DURATION__DAYS:
				return getDays();
			case ApogyCommonEMFPackage.DURATION__HOURS:
				return getHours();
			case ApogyCommonEMFPackage.DURATION__MINUTES:
				return getMinutes();
			case ApogyCommonEMFPackage.DURATION__SECONDS:
				return getSeconds();
			case ApogyCommonEMFPackage.DURATION__MILLISECONDS:
				return getMilliseconds();
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
			case ApogyCommonEMFPackage.DURATION__VALUE:
				setValue((Long)newValue);
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
			case ApogyCommonEMFPackage.DURATION__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case ApogyCommonEMFPackage.DURATION__VALUE:
				return value != VALUE_EDEFAULT;
			case ApogyCommonEMFPackage.DURATION__DAYS:
				return getDays() != DAYS_EDEFAULT;
			case ApogyCommonEMFPackage.DURATION__HOURS:
				return getHours() != HOURS_EDEFAULT;
			case ApogyCommonEMFPackage.DURATION__MINUTES:
				return getMinutes() != MINUTES_EDEFAULT;
			case ApogyCommonEMFPackage.DURATION__SECONDS:
				return getSeconds() != SECONDS_EDEFAULT;
			case ApogyCommonEMFPackage.DURATION__MILLISECONDS:
				return getMilliseconds() != MILLISECONDS_EDEFAULT;
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
			case ApogyCommonEMFPackage.DURATION___GET_DURATION__TIMED_TIMED:
				return getDuration((Timed)arguments.get(0), (Timed)arguments.get(1));
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //DurationImpl
