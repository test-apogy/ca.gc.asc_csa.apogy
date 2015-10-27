/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.core.Positioned;
import org.eclipse.symphony.core.Symphony__CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Positioned</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.impl.PositionedImpl#getPose <em>Pose</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionedImpl extends MinimalEObjectImpl.Container implements Positioned {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CorePackage.Literals.POSITIONED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Matrix4x4 getPose() 
	{
		Matrix4x4 tmp = getPoseGen();
		
		if(tmp == null)
		{
			tmp = MathFacade.INSTANCE.createIdentityMatrix4x4();
			setPose(tmp);
		}
		
		return tmp;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix4x4 getPoseGen() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__CorePackage.POSITIONED__POSE, oldPose, newPose);
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
				msgs = ((InternalEObject)pose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__CorePackage.POSITIONED__POSE, null, msgs);
			if (newPose != null)
				msgs = ((InternalEObject)newPose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Symphony__CorePackage.POSITIONED__POSE, null, msgs);
			msgs = basicSetPose(newPose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CorePackage.POSITIONED__POSE, newPose, newPose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__CorePackage.POSITIONED__POSE:
				return basicSetPose(null, msgs);
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
			case Symphony__CorePackage.POSITIONED__POSE:
				return getPose();
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
			case Symphony__CorePackage.POSITIONED__POSE:
				setPose((Matrix4x4)newValue);
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
			case Symphony__CorePackage.POSITIONED__POSE:
				setPose((Matrix4x4)null);
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
			case Symphony__CorePackage.POSITIONED__POSE:
				return pose != null;
		}
		return super.eIsSet(featureID);
	}

} //PositionedImpl
