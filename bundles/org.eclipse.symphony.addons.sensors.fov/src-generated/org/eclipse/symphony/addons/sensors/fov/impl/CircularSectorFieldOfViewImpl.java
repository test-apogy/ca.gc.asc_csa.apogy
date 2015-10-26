/**
 * Canadian Space Agency 2007.
 *
 * $Id: CircularSectorFieldOfViewImpl.java,v 1.3.4.2 2015/05/21 15:51:25 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.fov.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.sensors.fov.AngularSpan;
import org.eclipse.symphony.addons.sensors.fov.CircularSectorFieldOfView;
import org.eclipse.symphony.addons.sensors.fov.DistanceRange;
import org.eclipse.symphony.addons.sensors.fov.Symphony__AddonsSensorsFOVFactory;
import org.eclipse.symphony.addons.sensors.fov.Symphony__AddonsSensorsFOVPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circular Sector Field Of View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.fov.impl.CircularSectorFieldOfViewImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.fov.impl.CircularSectorFieldOfViewImpl#getAngularSpan <em>Angular Span</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.fov.impl.CircularSectorFieldOfViewImpl#getArea <em>Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CircularSectorFieldOfViewImpl extends FieldOfViewImpl implements CircularSectorFieldOfView {
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
	 * The cached value of the '{@link #getAngularSpan() <em>Angular Span</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngularSpan()
	 * @generated
	 * @ordered
	 */
	protected AngularSpan angularSpan;

	/**
	 * The default value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected static final double AREA_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircularSectorFieldOfViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__AddonsSensorsFOVPackage.Literals.CIRCULAR_SECTOR_FIELD_OF_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngularSpan getAngularSpan() {
		return angularSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngularSpan(AngularSpan newAngularSpan, NotificationChain msgs)
	{
		AngularSpan oldAngularSpan = angularSpan;
		angularSpan = newAngularSpan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW__ANGULAR_SPAN, oldAngularSpan, newAngularSpan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	public void setAngularSpan(AngularSpan newAngularSpan) 
	{
		setAngularSpanGen(newAngularSpan);		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngularSpanGen(AngularSpan newAngularSpan) {
		if (newAngularSpan != angularSpan) {
			NotificationChain msgs = null;
			if (angularSpan != null)
				msgs = ((InternalEObject)angularSpan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__AddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW__ANGULAR_SPAN, null, msgs);
			if (newAngularSpan != null)
				msgs = ((InternalEObject)newAngularSpan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Symphony__AddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW__ANGULAR_SPAN, null, msgs);
			msgs = basicSetAngularSpan(newAngularSpan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW__ANGULAR_SPAN, newAngularSpan, newAngularSpan));
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
			tmp = Symphony__AddonsSensorsFOVFactory.eINSTANCE.createDistanceRange();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	public void setRange(DistanceRange newRange) {
		setRangeGen(newRange);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeGen(DistanceRange newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__AddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Symphony__AddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @see http://en.wikipedia.org/wiki/Circular_sector
	 */
	public double getArea() 
	{
		double area = 0.0;
		if((getAngularSpan() != null) && (getRange() != null))
		{
			// Computes the area of the maximum radius sector.
			double maxRadiusSectorArea = 0.5 * Math.pow(getRange().getMaximumDistance(), 2.0) * getAngularSpan().getSpanningAngle();
			
			// Computes the area of the minimum radius sector.
			double minRadiusSectorArea = 0.5 * Math.pow(getRange().getMinimumDistance(), 2.0) * getAngularSpan().getSpanningAngle();
			
			// The field of view area is the difference between the two.
			if(maxRadiusSectorArea > minRadiusSectorArea)
			{
				area = maxRadiusSectorArea - minRadiusSectorArea;
			}
			else
			{
				area = 0.0;
			}
		}
		else
		{
			area = 0.0;
		}
		
		return area;
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
			case Symphony__AddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW__RANGE:
				return basicSetRange(null, msgs);
			case Symphony__AddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW__ANGULAR_SPAN:
				return basicSetAngularSpan(null, msgs);
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
			case Symphony__AddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW__RANGE:
				return getRange();
			case Symphony__AddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW__ANGULAR_SPAN:
				return getAngularSpan();
			case Symphony__AddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW__AREA:
				return getArea();
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
			case Symphony__AddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW__RANGE:
				setRange((DistanceRange)newValue);
				return;
			case Symphony__AddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW__ANGULAR_SPAN:
				setAngularSpan((AngularSpan)newValue);
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
			case Symphony__AddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW__RANGE:
				setRange((DistanceRange)null);
				return;
			case Symphony__AddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW__ANGULAR_SPAN:
				setAngularSpan((AngularSpan)null);
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
			case Symphony__AddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW__RANGE:
				return range != null;
			case Symphony__AddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW__ANGULAR_SPAN:
				return angularSpan != null;
			case Symphony__AddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW__AREA:
				return getArea() != AREA_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}
} //CircularSectorFieldOfViewImpl
