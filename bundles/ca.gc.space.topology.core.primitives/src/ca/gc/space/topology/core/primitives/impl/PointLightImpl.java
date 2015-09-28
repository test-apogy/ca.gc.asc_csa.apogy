/**
 * <copyright>
 * </copyright>
 *
 * $Id: PointLightImpl.java,v 1.3.2.2 2015/02/03 20:01:31 rlarcheveque Exp $
 */
package ca.gc.space.topology.core.primitives.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.space.math.Tuple3d;
import ca.gc.space.topology.core.primitives.PointLight;
import ca.gc.space.topology.core.primitives.PrimitivesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Light</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.topology.core.primitives.impl.PointLightImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link ca.gc.space.topology.core.primitives.impl.PointLightImpl#getAttenuation <em>Attenuation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointLightImpl extends LightImpl implements PointLight {
	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d position;

	/**
	 * The cached value of the '{@link #getAttenuation() <em>Attenuation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttenuation()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d attenuation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointLightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrimitivesPackage.Literals.POINT_LIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Tuple3d newPosition, NotificationChain msgs) {
		Tuple3d oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrimitivesPackage.POINT_LIGHT__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Tuple3d newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrimitivesPackage.POINT_LIGHT__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrimitivesPackage.POINT_LIGHT__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimitivesPackage.POINT_LIGHT__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getAttenuation() {
		return attenuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttenuation(Tuple3d newAttenuation, NotificationChain msgs) {
		Tuple3d oldAttenuation = attenuation;
		attenuation = newAttenuation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrimitivesPackage.POINT_LIGHT__ATTENUATION, oldAttenuation, newAttenuation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttenuation(Tuple3d newAttenuation) {
		if (newAttenuation != attenuation) {
			NotificationChain msgs = null;
			if (attenuation != null)
				msgs = ((InternalEObject)attenuation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrimitivesPackage.POINT_LIGHT__ATTENUATION, null, msgs);
			if (newAttenuation != null)
				msgs = ((InternalEObject)newAttenuation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrimitivesPackage.POINT_LIGHT__ATTENUATION, null, msgs);
			msgs = basicSetAttenuation(newAttenuation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimitivesPackage.POINT_LIGHT__ATTENUATION, newAttenuation, newAttenuation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PrimitivesPackage.POINT_LIGHT__POSITION:
				return basicSetPosition(null, msgs);
			case PrimitivesPackage.POINT_LIGHT__ATTENUATION:
				return basicSetAttenuation(null, msgs);
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
			case PrimitivesPackage.POINT_LIGHT__POSITION:
				return getPosition();
			case PrimitivesPackage.POINT_LIGHT__ATTENUATION:
				return getAttenuation();
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
			case PrimitivesPackage.POINT_LIGHT__POSITION:
				setPosition((Tuple3d)newValue);
				return;
			case PrimitivesPackage.POINT_LIGHT__ATTENUATION:
				setAttenuation((Tuple3d)newValue);
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
			case PrimitivesPackage.POINT_LIGHT__POSITION:
				setPosition((Tuple3d)null);
				return;
			case PrimitivesPackage.POINT_LIGHT__ATTENUATION:
				setAttenuation((Tuple3d)null);
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
			case PrimitivesPackage.POINT_LIGHT__POSITION:
				return position != null;
			case PrimitivesPackage.POINT_LIGHT__ATTENUATION:
				return attenuation != null;
		}
		return super.eIsSet(featureID);
	}

} //PointLightImpl
