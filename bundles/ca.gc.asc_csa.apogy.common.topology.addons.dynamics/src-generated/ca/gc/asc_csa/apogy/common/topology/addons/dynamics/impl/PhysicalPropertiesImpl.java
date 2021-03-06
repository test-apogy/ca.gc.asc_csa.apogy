package ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl;
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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.math.Matrix3x3;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalProperties;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PhysicalPropertiesImpl#getMass <em>Mass</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PhysicalPropertiesImpl#getInertiaMatrix <em>Inertia Matrix</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PhysicalPropertiesImpl#getCenterOfMassLocation <em>Center Of Mass Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalPropertiesImpl extends MinimalEObjectImpl.Container implements PhysicalProperties {
	/**
	 * The default value of the '{@link #getMass() <em>Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass()
	 * @generated
	 * @ordered
	 */
	protected static final double MASS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMass() <em>Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass()
	 * @generated
	 * @ordered
	 */
	protected double mass = MASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInertiaMatrix() <em>Inertia Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInertiaMatrix()
	 * @generated
	 * @ordered
	 */
	protected Matrix3x3 inertiaMatrix;

	/**
	 * The cached value of the '{@link #getCenterOfMassLocation() <em>Center Of Mass Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterOfMassLocation()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d centerOfMassLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyAddonsDynamicsPackage.Literals.PHYSICAL_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMass() {
		return mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setMass(double newMass) {		
		setMassGen(newMass);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMassGen(double newMass) {
		double oldMass = mass;
		mass = newMass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES__MASS, oldMass, mass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix3x3 getInertiaMatrix() {
		return inertiaMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInertiaMatrix(Matrix3x3 newInertiaMatrix, NotificationChain msgs) {
		Matrix3x3 oldInertiaMatrix = inertiaMatrix;
		inertiaMatrix = newInertiaMatrix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES__INERTIA_MATRIX, oldInertiaMatrix, newInertiaMatrix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInertiaMatrix(Matrix3x3 newInertiaMatrix) {
		if (newInertiaMatrix != inertiaMatrix) {
			NotificationChain msgs = null;
			if (inertiaMatrix != null)
				msgs = ((InternalEObject)inertiaMatrix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES__INERTIA_MATRIX, null, msgs);
			if (newInertiaMatrix != null)
				msgs = ((InternalEObject)newInertiaMatrix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES__INERTIA_MATRIX, null, msgs);
			msgs = basicSetInertiaMatrix(newInertiaMatrix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES__INERTIA_MATRIX, newInertiaMatrix, newInertiaMatrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getCenterOfMassLocation() {
		return centerOfMassLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCenterOfMassLocation(Tuple3d newCenterOfMassLocation, NotificationChain msgs) {
		Tuple3d oldCenterOfMassLocation = centerOfMassLocation;
		centerOfMassLocation = newCenterOfMassLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES__CENTER_OF_MASS_LOCATION, oldCenterOfMassLocation, newCenterOfMassLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenterOfMassLocation(Tuple3d newCenterOfMassLocation) {
		if (newCenterOfMassLocation != centerOfMassLocation) {
			NotificationChain msgs = null;
			if (centerOfMassLocation != null)
				msgs = ((InternalEObject)centerOfMassLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES__CENTER_OF_MASS_LOCATION, null, msgs);
			if (newCenterOfMassLocation != null)
				msgs = ((InternalEObject)newCenterOfMassLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES__CENTER_OF_MASS_LOCATION, null, msgs);
			msgs = basicSetCenterOfMassLocation(newCenterOfMassLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES__CENTER_OF_MASS_LOCATION, newCenterOfMassLocation, newCenterOfMassLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES__INERTIA_MATRIX:
				return basicSetInertiaMatrix(null, msgs);
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES__CENTER_OF_MASS_LOCATION:
				return basicSetCenterOfMassLocation(null, msgs);
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
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES__MASS:
				return getMass();
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES__INERTIA_MATRIX:
				return getInertiaMatrix();
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES__CENTER_OF_MASS_LOCATION:
				return getCenterOfMassLocation();
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
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES__MASS:
				setMass((Double)newValue);
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES__INERTIA_MATRIX:
				setInertiaMatrix((Matrix3x3)newValue);
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES__CENTER_OF_MASS_LOCATION:
				setCenterOfMassLocation((Tuple3d)newValue);
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
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES__MASS:
				setMass(MASS_EDEFAULT);
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES__INERTIA_MATRIX:
				setInertiaMatrix((Matrix3x3)null);
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES__CENTER_OF_MASS_LOCATION:
				setCenterOfMassLocation((Tuple3d)null);
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
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES__MASS:
				return mass != MASS_EDEFAULT;
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES__INERTIA_MATRIX:
				return inertiaMatrix != null;
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_PROPERTIES__CENTER_OF_MASS_LOCATION:
				return centerOfMassLocation != null;
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
		result.append(" (mass: ");
		result.append(mass);
		result.append(')');
		return result.toString();
	}

} //PhysicalPropertiesImpl
