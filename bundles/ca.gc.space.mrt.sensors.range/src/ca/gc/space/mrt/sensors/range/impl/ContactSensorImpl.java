/**
 * <copyright>
 * </copyright>
 *
 * $Id: ContactSensorImpl.java,v 1.3.4.2 2015/05/21 15:50:21 pallard Exp $
 */
package ca.gc.space.mrt.sensors.range.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.space.mrt.sensors.range.ContactSensor;
import ca.gc.space.mrt.sensors.range.RangePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.range.impl.ContactSensorImpl#isContacted <em>Contacted</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContactSensorImpl extends RangeSensorImpl implements ContactSensor
{
	/**
	 * The default value of the '{@link #isContacted() <em>Contacted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContacted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTACTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContacted() <em>Contacted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContacted()
	 * @generated
	 * @ordered
	 */
	protected boolean contacted = CONTACTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactSensorImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return RangePackage.Literals.CONTACT_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContacted()
	{
		return contacted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContacted(boolean newContacted)
	{
		boolean oldContacted = contacted;
		contacted = newContacted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RangePackage.CONTACT_SENSOR__CONTACTED, oldContacted, contacted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case RangePackage.CONTACT_SENSOR__CONTACTED:
				return isContacted();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case RangePackage.CONTACT_SENSOR__CONTACTED:
				setContacted((Boolean)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case RangePackage.CONTACT_SENSOR__CONTACTED:
				setContacted(CONTACTED_EDEFAULT);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case RangePackage.CONTACT_SENSOR__CONTACTED:
				return contacted != CONTACTED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (contacted: ");
		result.append(contacted);
		result.append(')');
		return result.toString();
	}

} //ContactSensorImpl
