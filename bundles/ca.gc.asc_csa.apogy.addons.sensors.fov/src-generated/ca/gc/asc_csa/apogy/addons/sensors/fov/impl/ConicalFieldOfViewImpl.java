/**
 * Canadian Space Agency 2007.
 *
 * $Id: ConicalFieldOfViewImpl.java,v 1.3.4.2 2015/05/21 15:51:25 pallard Exp $
 */
package ca.gc.asc_csa.apogy.addons.sensors.fov.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ConicalFieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.fov.DistanceRange;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVFactory;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conical Field Of View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.impl.ConicalFieldOfViewImpl#getRange <em>Range</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.impl.ConicalFieldOfViewImpl#getFieldOfViewAngle <em>Field Of View Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.impl.ConicalFieldOfViewImpl#getVolume <em>Volume</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConicalFieldOfViewImpl extends FieldOfViewImpl implements ConicalFieldOfView {
	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected DistanceRange range;

	/**
	 * The default value of the '{@link #getFieldOfViewAngle() <em>Field Of View Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldOfViewAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double FIELD_OF_VIEW_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFieldOfViewAngle() <em>Field Of View Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldOfViewAngle()
	 * @generated
	 * @ordered
	 */
	protected double fieldOfViewAngle = FIELD_OF_VIEW_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLUME_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConicalFieldOfViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsSensorsFOVPackage.Literals.CONICAL_FIELD_OF_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFieldOfViewAngle() {
		return fieldOfViewAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldOfViewAngle(double newFieldOfViewAngle) {
		double oldFieldOfViewAngle = fieldOfViewAngle;
		fieldOfViewAngle = newFieldOfViewAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsFOVPackage.CONICAL_FIELD_OF_VIEW__FIELD_OF_VIEW_ANGLE, oldFieldOfViewAngle, fieldOfViewAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public DistanceRange getRange() 
	{
		DistanceRange tmp = getRangeGen();
		if(tmp == null)
		{
			tmp = ApogyAddonsSensorsFOVFactory.eINSTANCE.createDistanceRange();
			setRange(tmp);
		}
		
		return tmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceRange getRangeGen() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(DistanceRange newRange, NotificationChain msgs)
	{
		DistanceRange oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsFOVPackage.CONICAL_FIELD_OF_VIEW__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(DistanceRange newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyAddonsSensorsFOVPackage.CONICAL_FIELD_OF_VIEW__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyAddonsSensorsFOVPackage.CONICAL_FIELD_OF_VIEW__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsFOVPackage.CONICAL_FIELD_OF_VIEW__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * V = 2/3 * PI * R^3 * (1 - cos(apexAngle / 2)).
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getVolume() {
		
		double largeConeVolume = (2.0/3.0) * Math.PI * Math.pow(getRange().getMaximumDistance(), 3.0)* (1 - (Math.cos(this.getFieldOfViewAngle() / 2)));
		double smallConeVolume = (2.0/3.0) * Math.PI * Math.pow(getRange().getMinimumDistance(), 3.0) * (1 - (Math.cos(this.getFieldOfViewAngle() / 2)));
		return largeConeVolume - smallConeVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case ApogyAddonsSensorsFOVPackage.CONICAL_FIELD_OF_VIEW__RANGE:
				return basicSetRange(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsSensorsFOVPackage.CONICAL_FIELD_OF_VIEW__RANGE:
				return getRange();
			case ApogyAddonsSensorsFOVPackage.CONICAL_FIELD_OF_VIEW__FIELD_OF_VIEW_ANGLE:
				return getFieldOfViewAngle();
			case ApogyAddonsSensorsFOVPackage.CONICAL_FIELD_OF_VIEW__VOLUME:
				return getVolume();
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
			case ApogyAddonsSensorsFOVPackage.CONICAL_FIELD_OF_VIEW__RANGE:
				setRange((DistanceRange)newValue);
				return;
			case ApogyAddonsSensorsFOVPackage.CONICAL_FIELD_OF_VIEW__FIELD_OF_VIEW_ANGLE:
				setFieldOfViewAngle((Double)newValue);
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
			case ApogyAddonsSensorsFOVPackage.CONICAL_FIELD_OF_VIEW__RANGE:
				setRange((DistanceRange)null);
				return;
			case ApogyAddonsSensorsFOVPackage.CONICAL_FIELD_OF_VIEW__FIELD_OF_VIEW_ANGLE:
				setFieldOfViewAngle(FIELD_OF_VIEW_ANGLE_EDEFAULT);
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
			case ApogyAddonsSensorsFOVPackage.CONICAL_FIELD_OF_VIEW__RANGE:
				return range != null;
			case ApogyAddonsSensorsFOVPackage.CONICAL_FIELD_OF_VIEW__FIELD_OF_VIEW_ANGLE:
				return fieldOfViewAngle != FIELD_OF_VIEW_ANGLE_EDEFAULT;
			case ApogyAddonsSensorsFOVPackage.CONICAL_FIELD_OF_VIEW__VOLUME:
				return getVolume() != VOLUME_EDEFAULT;
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
		result.append(" (fieldOfViewAngle: ");
		result.append(fieldOfViewAngle);
		result.append(')');
		return result.toString();
	}
} //ConicalFieldOfViewImpl
