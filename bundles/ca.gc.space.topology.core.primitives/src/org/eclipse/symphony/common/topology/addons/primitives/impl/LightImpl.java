/**
 * <copyright>
 * </copyright>
 *
 * $Id: LightImpl.java,v 1.3.2.2 2015/02/03 20:01:31 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.addons.primitives.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.topology.addons.primitives.Light;
import org.eclipse.symphony.common.topology.addons.primitives.PrimitivesPackage;
import org.eclipse.symphony.common.topology.impl.LeafImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Light</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.primitives.impl.LightImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.primitives.impl.LightImpl#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LightImpl extends LeafImpl implements Light {
	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d color;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrimitivesPackage.Literals.LIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimitivesPackage.LIGHT__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColor(Tuple3d newColor, NotificationChain msgs) {
		Tuple3d oldColor = color;
		color = newColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrimitivesPackage.LIGHT__COLOR, oldColor, newColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Tuple3d newColor) {
		if (newColor != color) {
			NotificationChain msgs = null;
			if (color != null)
				msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrimitivesPackage.LIGHT__COLOR, null, msgs);
			if (newColor != null)
				msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrimitivesPackage.LIGHT__COLOR, null, msgs);
			msgs = basicSetColor(newColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimitivesPackage.LIGHT__COLOR, newColor, newColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PrimitivesPackage.LIGHT__COLOR:
				return basicSetColor(null, msgs);
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
			case PrimitivesPackage.LIGHT__ENABLED:
				return isEnabled();
			case PrimitivesPackage.LIGHT__COLOR:
				return getColor();
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
			case PrimitivesPackage.LIGHT__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case PrimitivesPackage.LIGHT__COLOR:
				setColor((Tuple3d)newValue);
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
			case PrimitivesPackage.LIGHT__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case PrimitivesPackage.LIGHT__COLOR:
				setColor((Tuple3d)null);
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
			case PrimitivesPackage.LIGHT__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case PrimitivesPackage.LIGHT__COLOR:
				return color != null;
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
		result.append(" (enabled: ");
		result.append(enabled);
		result.append(')');
		return result.toString();
	}

} //LightImpl
