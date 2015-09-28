/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.impl.InitializationDataImpl;
import ca.gc.asc_csa.symphony.core.SymphonyCorePackage;
import ca.gc.asc_csa.symphony.core.SymphonyInitializationData;
import ca.gc.space.math.Matrix4x4;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Symphony Initialization Data</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.core.impl.SymphonyInitializationDataImpl#getInitialPoseTransform <em>Initial Pose Transform</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SymphonyInitializationDataImpl extends
		InitializationDataImpl implements SymphonyInitializationData {
	/**
	 * The cached value of the '{@link #getInitialPoseTransform()
	 * <em>Initial Pose Transform</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInitialPoseTransform()
	 * @generated
	 * @ordered
	 */
	protected Matrix4x4 initialPoseTransform;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SymphonyInitializationDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyCorePackage.Literals.SYMPHONY_INITIALIZATION_DATA;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix4x4 getInitialPoseTransform() {
		return initialPoseTransform;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialPoseTransform(
			Matrix4x4 newInitialPoseTransform, NotificationChain msgs) {
		Matrix4x4 oldInitialPoseTransform = initialPoseTransform;
		initialPoseTransform = newInitialPoseTransform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM, oldInitialPoseTransform, newInitialPoseTransform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialPoseTransform(Matrix4x4 newInitialPoseTransform) {
		if (newInitialPoseTransform != initialPoseTransform) {
			NotificationChain msgs = null;
			if (initialPoseTransform != null)
				msgs = ((InternalEObject)initialPoseTransform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM, null, msgs);
			if (newInitialPoseTransform != null)
				msgs = ((InternalEObject)newInitialPoseTransform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM, null, msgs);
			msgs = basicSetInitialPoseTransform(newInitialPoseTransform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM, newInitialPoseTransform, newInitialPoseTransform));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM:
				return basicSetInitialPoseTransform(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM:
				return getInitialPoseTransform();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM:
				setInitialPoseTransform((Matrix4x4)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM:
				setInitialPoseTransform((Matrix4x4)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM:
				return initialPoseTransform != null;
		}
		return super.eIsSet(featureID);
	}

} // SymphonyInitializationDataImpl
