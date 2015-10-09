/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.SunVector3DTool;
import org.eclipse.symphony.addons.SunVector3DToolNode;
import org.eclipse.symphony.addons.SymphonyToolsCorePackage;
import org.eclipse.symphony.common.topology.impl.NodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sun Vector3 DTool Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.impl.SunVector3DToolNodeImpl#getSunVector3DTool <em>Sun Vector3 DTool</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SunVector3DToolNodeImpl extends NodeImpl implements SunVector3DToolNode {
	/**
	 * The cached value of the '{@link #getSunVector3DTool() <em>Sun Vector3 DTool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSunVector3DTool()
	 * @generated
	 * @ordered
	 */
	protected SunVector3DTool sunVector3DTool;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SunVector3DToolNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyToolsCorePackage.Literals.SUN_VECTOR3_DTOOL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SunVector3DTool getSunVector3DTool() {
		if (sunVector3DTool != null && sunVector3DTool.eIsProxy()) {
			InternalEObject oldSunVector3DTool = (InternalEObject)sunVector3DTool;
			sunVector3DTool = (SunVector3DTool)eResolveProxy(oldSunVector3DTool);
			if (sunVector3DTool != oldSunVector3DTool) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyToolsCorePackage.SUN_VECTOR3_DTOOL_NODE__SUN_VECTOR3_DTOOL, oldSunVector3DTool, sunVector3DTool));
			}
		}
		return sunVector3DTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SunVector3DTool basicGetSunVector3DTool() {
		return sunVector3DTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSunVector3DTool(SunVector3DTool newSunVector3DTool, NotificationChain msgs) {
		SunVector3DTool oldSunVector3DTool = sunVector3DTool;
		sunVector3DTool = newSunVector3DTool;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyToolsCorePackage.SUN_VECTOR3_DTOOL_NODE__SUN_VECTOR3_DTOOL, oldSunVector3DTool, newSunVector3DTool);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSunVector3DTool(SunVector3DTool newSunVector3DTool) {
		if (newSunVector3DTool != sunVector3DTool) {
			NotificationChain msgs = null;
			if (sunVector3DTool != null)
				msgs = ((InternalEObject)sunVector3DTool).eInverseRemove(this, SymphonyToolsCorePackage.SUN_VECTOR3_DTOOL__SUN_VECTOR3_DTOOL_NODE, SunVector3DTool.class, msgs);
			if (newSunVector3DTool != null)
				msgs = ((InternalEObject)newSunVector3DTool).eInverseAdd(this, SymphonyToolsCorePackage.SUN_VECTOR3_DTOOL__SUN_VECTOR3_DTOOL_NODE, SunVector3DTool.class, msgs);
			msgs = basicSetSunVector3DTool(newSunVector3DTool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsCorePackage.SUN_VECTOR3_DTOOL_NODE__SUN_VECTOR3_DTOOL, newSunVector3DTool, newSunVector3DTool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyToolsCorePackage.SUN_VECTOR3_DTOOL_NODE__SUN_VECTOR3_DTOOL:
				if (sunVector3DTool != null)
					msgs = ((InternalEObject)sunVector3DTool).eInverseRemove(this, SymphonyToolsCorePackage.SUN_VECTOR3_DTOOL__SUN_VECTOR3_DTOOL_NODE, SunVector3DTool.class, msgs);
				return basicSetSunVector3DTool((SunVector3DTool)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyToolsCorePackage.SUN_VECTOR3_DTOOL_NODE__SUN_VECTOR3_DTOOL:
				return basicSetSunVector3DTool(null, msgs);
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
			case SymphonyToolsCorePackage.SUN_VECTOR3_DTOOL_NODE__SUN_VECTOR3_DTOOL:
				if (resolve) return getSunVector3DTool();
				return basicGetSunVector3DTool();
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
			case SymphonyToolsCorePackage.SUN_VECTOR3_DTOOL_NODE__SUN_VECTOR3_DTOOL:
				setSunVector3DTool((SunVector3DTool)newValue);
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
			case SymphonyToolsCorePackage.SUN_VECTOR3_DTOOL_NODE__SUN_VECTOR3_DTOOL:
				setSunVector3DTool((SunVector3DTool)null);
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
			case SymphonyToolsCorePackage.SUN_VECTOR3_DTOOL_NODE__SUN_VECTOR3_DTOOL:
				return sunVector3DTool != null;
		}
		return super.eIsSet(featureID);
	}

} //SunVector3DToolNodeImpl
