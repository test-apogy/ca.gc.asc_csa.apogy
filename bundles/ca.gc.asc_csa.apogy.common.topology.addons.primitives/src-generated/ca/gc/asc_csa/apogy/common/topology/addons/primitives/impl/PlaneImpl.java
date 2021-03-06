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
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.Plane;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesPackage;
import ca.gc.asc_csa.apogy.common.topology.impl.NodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.PlaneImpl#getV0 <em>V0</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.PlaneImpl#getV1 <em>V1</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.PlaneImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.PlaneImpl#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaneImpl extends NodeImpl implements Plane {
	/**
	 * The cached value of the '{@link #getV0() <em>V0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV0()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d v0;

	/**
	 * The cached value of the '{@link #getV1() <em>V1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV1()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d v1;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyAddonsPrimitivesPackage.Literals.PLANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getV0() {
		return v0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetV0(Tuple3d newV0, NotificationChain msgs) {
		Tuple3d oldV0 = v0;
		v0 = newV0;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__V0, oldV0, newV0);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV0(Tuple3d newV0) {
		if (newV0 != v0) {
			NotificationChain msgs = null;
			if (v0 != null)
				msgs = ((InternalEObject)v0).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__V0, null, msgs);
			if (newV0 != null)
				msgs = ((InternalEObject)newV0).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__V0, null, msgs);
			msgs = basicSetV0(newV0, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__V0, newV0, newV0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getV1() {
		return v1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetV1(Tuple3d newV1, NotificationChain msgs) {
		Tuple3d oldV1 = v1;
		v1 = newV1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__V1, oldV1, newV1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV1(Tuple3d newV1) {
		if (newV1 != v1) {
			NotificationChain msgs = null;
			if (v1 != null)
				msgs = ((InternalEObject)v1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__V1, null, msgs);
			if (newV1 != null)
				msgs = ((InternalEObject)newV1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__V1, null, msgs);
			msgs = basicSetV1(newV1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__V1, newV1, newV1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(double newHeight) {
		double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__V0:
				return basicSetV0(null, msgs);
			case ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__V1:
				return basicSetV1(null, msgs);
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
			case ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__V0:
				return getV0();
			case ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__V1:
				return getV1();
			case ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__WIDTH:
				return getWidth();
			case ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__HEIGHT:
				return getHeight();
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
			case ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__V0:
				setV0((Tuple3d)newValue);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__V1:
				setV1((Tuple3d)newValue);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__WIDTH:
				setWidth((Double)newValue);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__HEIGHT:
				setHeight((Double)newValue);
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
			case ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__V0:
				setV0((Tuple3d)null);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__V1:
				setV1((Tuple3d)null);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
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
			case ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__V0:
				return v0 != null;
			case ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__V1:
				return v1 != null;
			case ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case ApogyCommonTopologyAddonsPrimitivesPackage.PLANE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
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
		result.append(" (width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //PlaneImpl
