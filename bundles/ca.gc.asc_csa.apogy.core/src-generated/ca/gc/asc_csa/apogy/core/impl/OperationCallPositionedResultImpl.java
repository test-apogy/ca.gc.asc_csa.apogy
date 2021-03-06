package ca.gc.asc_csa.apogy.core.impl;
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
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.core.OperationCallPositionedResult;
import ca.gc.asc_csa.apogy.core.Positioned;
import ca.gc.asc_csa.apogy.core.PositionedResult;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallResultImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Call Positioned Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.OperationCallPositionedResultImpl#getPose <em>Pose</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.OperationCallPositionedResultImpl#getRelativePose <em>Relative Pose</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationCallPositionedResultImpl extends OperationCallResultImpl implements OperationCallPositionedResult {
	/**
	 * The cached value of the '{@link #getPose() <em>Pose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPose()
	 * @generated
	 * @ordered
	 */
	protected Matrix4x4 pose;

	/**
	 * The cached value of the '{@link #getRelativePose() <em>Relative Pose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePose()
	 * @generated
	 * @ordered
	 */
	protected Matrix4x4 relativePose;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationCallPositionedResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCorePackage.Literals.OPERATION_CALL_POSITIONED_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix4x4 getPose() {
		return pose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPose(Matrix4x4 newPose, NotificationChain msgs) {
		Matrix4x4 oldPose = pose;
		pose = newPose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCorePackage.OPERATION_CALL_POSITIONED_RESULT__POSE, oldPose, newPose);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPose(Matrix4x4 newPose) {
		if (newPose != pose) {
			NotificationChain msgs = null;
			if (pose != null)
				msgs = ((InternalEObject)pose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCorePackage.OPERATION_CALL_POSITIONED_RESULT__POSE, null, msgs);
			if (newPose != null)
				msgs = ((InternalEObject)newPose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCorePackage.OPERATION_CALL_POSITIONED_RESULT__POSE, null, msgs);
			msgs = basicSetPose(newPose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.OPERATION_CALL_POSITIONED_RESULT__POSE, newPose, newPose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix4x4 getRelativePose() {
		return relativePose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelativePose(Matrix4x4 newRelativePose, NotificationChain msgs) {
		Matrix4x4 oldRelativePose = relativePose;
		relativePose = newRelativePose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCorePackage.OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE, oldRelativePose, newRelativePose);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativePose(Matrix4x4 newRelativePose) {
		if (newRelativePose != relativePose) {
			NotificationChain msgs = null;
			if (relativePose != null)
				msgs = ((InternalEObject)relativePose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCorePackage.OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE, null, msgs);
			if (newRelativePose != null)
				msgs = ((InternalEObject)newRelativePose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCorePackage.OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE, null, msgs);
			msgs = basicSetRelativePose(newRelativePose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE, newRelativePose, newRelativePose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCorePackage.OPERATION_CALL_POSITIONED_RESULT__POSE:
				return basicSetPose(null, msgs);
			case ApogyCorePackage.OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE:
				return basicSetRelativePose(null, msgs);
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
			case ApogyCorePackage.OPERATION_CALL_POSITIONED_RESULT__POSE:
				return getPose();
			case ApogyCorePackage.OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE:
				return getRelativePose();
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
			case ApogyCorePackage.OPERATION_CALL_POSITIONED_RESULT__POSE:
				setPose((Matrix4x4)newValue);
				return;
			case ApogyCorePackage.OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE:
				setRelativePose((Matrix4x4)newValue);
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
			case ApogyCorePackage.OPERATION_CALL_POSITIONED_RESULT__POSE:
				setPose((Matrix4x4)null);
				return;
			case ApogyCorePackage.OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE:
				setRelativePose((Matrix4x4)null);
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
			case ApogyCorePackage.OPERATION_CALL_POSITIONED_RESULT__POSE:
				return pose != null;
			case ApogyCorePackage.OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE:
				return relativePose != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Positioned.class) {
			switch (derivedFeatureID) {
				case ApogyCorePackage.OPERATION_CALL_POSITIONED_RESULT__POSE: return ApogyCorePackage.POSITIONED__POSE;
				default: return -1;
			}
		}
		if (baseClass == PositionedResult.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Positioned.class) {
			switch (baseFeatureID) {
				case ApogyCorePackage.POSITIONED__POSE: return ApogyCorePackage.OPERATION_CALL_POSITIONED_RESULT__POSE;
				default: return -1;
			}
		}
		if (baseClass == PositionedResult.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OperationCallPositionedResultImpl
