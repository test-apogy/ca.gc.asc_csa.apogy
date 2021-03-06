package ca.gc.asc_csa.apogy.addons.sensors.fov.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.sensors.fov.DistanceRange;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVFactory;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage;
import ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectangular Frustrum Field Of View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.impl.RectangularFrustrumFieldOfViewImpl#getRange <em>Range</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.impl.RectangularFrustrumFieldOfViewImpl#getHorizontalFieldOfViewAngle <em>Horizontal Field Of View Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.impl.RectangularFrustrumFieldOfViewImpl#getVerticalFieldOfViewAngle <em>Vertical Field Of View Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.impl.RectangularFrustrumFieldOfViewImpl#getVolume <em>Volume</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RectangularFrustrumFieldOfViewImpl extends FieldOfViewImpl implements RectangularFrustrumFieldOfView {
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
	 * The default value of the '{@link #getHorizontalFieldOfViewAngle() <em>Horizontal Field Of View Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalFieldOfViewAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double HORIZONTAL_FIELD_OF_VIEW_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHorizontalFieldOfViewAngle() <em>Horizontal Field Of View Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalFieldOfViewAngle()
	 * @generated
	 * @ordered
	 */
	protected double horizontalFieldOfViewAngle = HORIZONTAL_FIELD_OF_VIEW_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalFieldOfViewAngle() <em>Vertical Field Of View Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalFieldOfViewAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double VERTICAL_FIELD_OF_VIEW_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVerticalFieldOfViewAngle() <em>Vertical Field Of View Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalFieldOfViewAngle()
	 * @generated
	 * @ordered
	 */
	protected double verticalFieldOfViewAngle = VERTICAL_FIELD_OF_VIEW_ANGLE_EDEFAULT;

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
	protected RectangularFrustrumFieldOfViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsSensorsFOVPackage.Literals.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public DistanceRange getRange() {
		
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__RANGE, oldRange, newRange);
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
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHorizontalFieldOfViewAngle() {
		return horizontalFieldOfViewAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalFieldOfViewAngle(double newHorizontalFieldOfViewAngle)
	{
		double oldHorizontalFieldOfViewAngle = horizontalFieldOfViewAngle;
		horizontalFieldOfViewAngle = newHorizontalFieldOfViewAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__HORIZONTAL_FIELD_OF_VIEW_ANGLE, oldHorizontalFieldOfViewAngle, horizontalFieldOfViewAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVerticalFieldOfViewAngle() {
		return verticalFieldOfViewAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalFieldOfViewAngle(double newVerticalFieldOfViewAngle)
	{
		double oldVerticalFieldOfViewAngle = verticalFieldOfViewAngle;
		verticalFieldOfViewAngle = newVerticalFieldOfViewAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__VERTICAL_FIELD_OF_VIEW_ANGLE, oldVerticalFieldOfViewAngle, verticalFieldOfViewAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getVolume() {
		
		if(getRange() != null)
		{			
			double surfaceFraction = getHorizontalFieldOfViewAngle() * ( Math.cos(0) - Math.cos(getVerticalFieldOfViewAngle()) ) / (4*Math.PI);
			
			double largeVolume = (4.0/3.0) * Math.PI * Math.pow(getRange().getMaximumDistance(), 3.0) * surfaceFraction;		
			double smallVolume = (4.0/3.0) * Math.PI * Math.pow(getRange().getMinimumDistance(), 3.0) * surfaceFraction;
			return largeVolume - smallVolume;
		}
		else
		{
			return 0.0;
		}
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
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__RANGE:
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
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__RANGE:
				return getRange();
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__HORIZONTAL_FIELD_OF_VIEW_ANGLE:
				return getHorizontalFieldOfViewAngle();
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__VERTICAL_FIELD_OF_VIEW_ANGLE:
				return getVerticalFieldOfViewAngle();
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__VOLUME:
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
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__RANGE:
				setRange((DistanceRange)newValue);
				return;
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__HORIZONTAL_FIELD_OF_VIEW_ANGLE:
				setHorizontalFieldOfViewAngle((Double)newValue);
				return;
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__VERTICAL_FIELD_OF_VIEW_ANGLE:
				setVerticalFieldOfViewAngle((Double)newValue);
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
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__RANGE:
				setRange((DistanceRange)null);
				return;
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__HORIZONTAL_FIELD_OF_VIEW_ANGLE:
				setHorizontalFieldOfViewAngle(HORIZONTAL_FIELD_OF_VIEW_ANGLE_EDEFAULT);
				return;
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__VERTICAL_FIELD_OF_VIEW_ANGLE:
				setVerticalFieldOfViewAngle(VERTICAL_FIELD_OF_VIEW_ANGLE_EDEFAULT);
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
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__RANGE:
				return range != null;
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__HORIZONTAL_FIELD_OF_VIEW_ANGLE:
				return horizontalFieldOfViewAngle != HORIZONTAL_FIELD_OF_VIEW_ANGLE_EDEFAULT;
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__VERTICAL_FIELD_OF_VIEW_ANGLE:
				return verticalFieldOfViewAngle != VERTICAL_FIELD_OF_VIEW_ANGLE_EDEFAULT;
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__VOLUME:
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
		result.append(" (horizontalFieldOfViewAngle: ");
		result.append(horizontalFieldOfViewAngle);
		result.append(", verticalFieldOfViewAngle: ");
		result.append(verticalFieldOfViewAngle);
		result.append(')');
		return result.toString();
	}

} //RectangularFrustrumFieldOfViewImpl
