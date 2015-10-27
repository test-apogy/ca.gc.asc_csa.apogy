/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.core.OperationCallPositionedResult;
import org.eclipse.symphony.core.Positioned;
import org.eclipse.symphony.core.PositionedResult;
import org.eclipse.symphony.core.Symphony__CorePackage;
import org.eclipse.symphony.core.invocator.impl.OperationCallResultImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Call Positioned Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.impl.OperationCallPositionedResultImpl#getPose <em>Pose</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.impl.OperationCallPositionedResultImpl#getRelativePose <em>Relative Pose</em>}</li>
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
		return Symphony__CorePackage.Literals.OPERATION_CALL_POSITIONED_RESULT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT__POSE, oldPose, newPose);
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
				msgs = ((InternalEObject)pose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT__POSE, null, msgs);
			if (newPose != null)
				msgs = ((InternalEObject)newPose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT__POSE, null, msgs);
			msgs = basicSetPose(newPose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT__POSE, newPose, newPose));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE, oldRelativePose, newRelativePose);
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
				msgs = ((InternalEObject)relativePose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE, null, msgs);
			if (newRelativePose != null)
				msgs = ((InternalEObject)newRelativePose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE, null, msgs);
			msgs = basicSetRelativePose(newRelativePose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE, newRelativePose, newRelativePose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT__POSE:
				return basicSetPose(null, msgs);
			case Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE:
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
			case Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT__POSE:
				return getPose();
			case Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE:
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
			case Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT__POSE:
				setPose((Matrix4x4)newValue);
				return;
			case Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE:
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
			case Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT__POSE:
				setPose((Matrix4x4)null);
				return;
			case Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE:
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
			case Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT__POSE:
				return pose != null;
			case Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE:
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
				case Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT__POSE: return Symphony__CorePackage.POSITIONED__POSE;
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
				case Symphony__CorePackage.POSITIONED__POSE: return Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT__POSE;
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
