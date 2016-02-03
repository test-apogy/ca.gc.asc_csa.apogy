package ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl;
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
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesPackage;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.SpotLight;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spot Light</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.SpotLightImpl#getConcentration <em>Concentration</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.SpotLightImpl#getSpreadAngle <em>Spread Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.SpotLightImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpotLightImpl extends PointLightImpl implements SpotLight {
	/**
	 * The default value of the '{@link #getConcentration() <em>Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentration()
	 * @generated
	 * @ordered
	 */
	protected static final float CONCENTRATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getConcentration() <em>Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentration()
	 * @generated
	 * @ordered
	 */
	protected float concentration = CONCENTRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpreadAngle() <em>Spread Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadAngle()
	 * @generated
	 * @ordered
	 */
	protected static final float SPREAD_ANGLE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpreadAngle() <em>Spread Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadAngle()
	 * @generated
	 * @ordered
	 */
	protected float spreadAngle = SPREAD_ANGLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d direction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpotLightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyAddonsPrimitivesPackage.Literals.SPOT_LIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getConcentration() {
		return concentration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcentration(float newConcentration) {
		float oldConcentration = concentration;
		concentration = newConcentration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsPrimitivesPackage.SPOT_LIGHT__CONCENTRATION, oldConcentration, concentration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpreadAngle() {
		return spreadAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpreadAngle(float newSpreadAngle) {
		float oldSpreadAngle = spreadAngle;
		spreadAngle = newSpreadAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsPrimitivesPackage.SPOT_LIGHT__SPREAD_ANGLE, oldSpreadAngle, spreadAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirection(Tuple3d newDirection, NotificationChain msgs) {
		Tuple3d oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsPrimitivesPackage.SPOT_LIGHT__DIRECTION, oldDirection, newDirection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(Tuple3d newDirection) {
		if (newDirection != direction) {
			NotificationChain msgs = null;
			if (direction != null)
				msgs = ((InternalEObject)direction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyAddonsPrimitivesPackage.SPOT_LIGHT__DIRECTION, null, msgs);
			if (newDirection != null)
				msgs = ((InternalEObject)newDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyAddonsPrimitivesPackage.SPOT_LIGHT__DIRECTION, null, msgs);
			msgs = basicSetDirection(newDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsPrimitivesPackage.SPOT_LIGHT__DIRECTION, newDirection, newDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCommonTopologyAddonsPrimitivesPackage.SPOT_LIGHT__DIRECTION:
				return basicSetDirection(null, msgs);
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
			case ApogyCommonTopologyAddonsPrimitivesPackage.SPOT_LIGHT__CONCENTRATION:
				return getConcentration();
			case ApogyCommonTopologyAddonsPrimitivesPackage.SPOT_LIGHT__SPREAD_ANGLE:
				return getSpreadAngle();
			case ApogyCommonTopologyAddonsPrimitivesPackage.SPOT_LIGHT__DIRECTION:
				return getDirection();
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
			case ApogyCommonTopologyAddonsPrimitivesPackage.SPOT_LIGHT__CONCENTRATION:
				setConcentration((Float)newValue);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.SPOT_LIGHT__SPREAD_ANGLE:
				setSpreadAngle((Float)newValue);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.SPOT_LIGHT__DIRECTION:
				setDirection((Tuple3d)newValue);
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
			case ApogyCommonTopologyAddonsPrimitivesPackage.SPOT_LIGHT__CONCENTRATION:
				setConcentration(CONCENTRATION_EDEFAULT);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.SPOT_LIGHT__SPREAD_ANGLE:
				setSpreadAngle(SPREAD_ANGLE_EDEFAULT);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.SPOT_LIGHT__DIRECTION:
				setDirection((Tuple3d)null);
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
			case ApogyCommonTopologyAddonsPrimitivesPackage.SPOT_LIGHT__CONCENTRATION:
				return concentration != CONCENTRATION_EDEFAULT;
			case ApogyCommonTopologyAddonsPrimitivesPackage.SPOT_LIGHT__SPREAD_ANGLE:
				return spreadAngle != SPREAD_ANGLE_EDEFAULT;
			case ApogyCommonTopologyAddonsPrimitivesPackage.SPOT_LIGHT__DIRECTION:
				return direction != null;
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
		result.append(" (concentration: ");
		result.append(concentration);
		result.append(", spreadAngle: ");
		result.append(spreadAngle);
		result.append(')');
		return result.toString();
	}

} //SpotLightImpl
