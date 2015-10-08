/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.Ruler3DTool;
import org.eclipse.symphony.addons.Ruler3dToolNode;
import org.eclipse.symphony.addons.SymphonyToolsCorePackage;

import ca.gc.space.topology.impl.NodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ruler3d Tool Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.impl.Ruler3dToolNodeImpl#getRuler3DTool <em>Ruler3 DTool</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Ruler3dToolNodeImpl extends NodeImpl implements Ruler3dToolNode {
	/**
	 * The cached value of the '{@link #getRuler3DTool() <em>Ruler3 DTool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuler3DTool()
	 * @generated
	 * @ordered
	 */
	protected Ruler3DTool ruler3DTool;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ruler3dToolNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyToolsCorePackage.Literals.RULER3D_TOOL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruler3DTool getRuler3DTool() {
		if (ruler3DTool != null && ruler3DTool.eIsProxy()) {
			InternalEObject oldRuler3DTool = (InternalEObject)ruler3DTool;
			ruler3DTool = (Ruler3DTool)eResolveProxy(oldRuler3DTool);
			if (ruler3DTool != oldRuler3DTool) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyToolsCorePackage.RULER3D_TOOL_NODE__RULER3_DTOOL, oldRuler3DTool, ruler3DTool));
			}
		}
		return ruler3DTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruler3DTool basicGetRuler3DTool() {
		return ruler3DTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuler3DTool(Ruler3DTool newRuler3DTool, NotificationChain msgs) {
		Ruler3DTool oldRuler3DTool = ruler3DTool;
		ruler3DTool = newRuler3DTool;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyToolsCorePackage.RULER3D_TOOL_NODE__RULER3_DTOOL, oldRuler3DTool, newRuler3DTool);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuler3DTool(Ruler3DTool newRuler3DTool) {
		if (newRuler3DTool != ruler3DTool) {
			NotificationChain msgs = null;
			if (ruler3DTool != null)
				msgs = ((InternalEObject)ruler3DTool).eInverseRemove(this, SymphonyToolsCorePackage.RULER3_DTOOL__RULER3D_TOOL_NODE, Ruler3DTool.class, msgs);
			if (newRuler3DTool != null)
				msgs = ((InternalEObject)newRuler3DTool).eInverseAdd(this, SymphonyToolsCorePackage.RULER3_DTOOL__RULER3D_TOOL_NODE, Ruler3DTool.class, msgs);
			msgs = basicSetRuler3DTool(newRuler3DTool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsCorePackage.RULER3D_TOOL_NODE__RULER3_DTOOL, newRuler3DTool, newRuler3DTool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyToolsCorePackage.RULER3D_TOOL_NODE__RULER3_DTOOL:
				if (ruler3DTool != null)
					msgs = ((InternalEObject)ruler3DTool).eInverseRemove(this, SymphonyToolsCorePackage.RULER3_DTOOL__RULER3D_TOOL_NODE, Ruler3DTool.class, msgs);
				return basicSetRuler3DTool((Ruler3DTool)otherEnd, msgs);
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
			case SymphonyToolsCorePackage.RULER3D_TOOL_NODE__RULER3_DTOOL:
				return basicSetRuler3DTool(null, msgs);
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
			case SymphonyToolsCorePackage.RULER3D_TOOL_NODE__RULER3_DTOOL:
				if (resolve) return getRuler3DTool();
				return basicGetRuler3DTool();
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
			case SymphonyToolsCorePackage.RULER3D_TOOL_NODE__RULER3_DTOOL:
				setRuler3DTool((Ruler3DTool)newValue);
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
			case SymphonyToolsCorePackage.RULER3D_TOOL_NODE__RULER3_DTOOL:
				setRuler3DTool((Ruler3DTool)null);
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
			case SymphonyToolsCorePackage.RULER3D_TOOL_NODE__RULER3_DTOOL:
				return ruler3DTool != null;
		}
		return super.eIsSet(featureID);
	}

} //Ruler3dToolNodeImpl
