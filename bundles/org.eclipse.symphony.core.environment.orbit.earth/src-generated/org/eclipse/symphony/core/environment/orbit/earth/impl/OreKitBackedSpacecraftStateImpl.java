/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.core.environment.orbit.earth.OreKitBackedSpacecraftState;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage;
import org.eclipse.symphony.core.environment.orbit.impl.SpacecraftStateImpl;
import org.orekit.propagation.SpacecraftState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ore Kit Backed Spacecraft State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.OreKitBackedSpacecraftStateImpl#getOreKitSpacecraftState <em>Ore Kit Spacecraft State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OreKitBackedSpacecraftStateImpl extends SpacecraftStateImpl implements OreKitBackedSpacecraftState {
	/**
	 * The default value of the '{@link #getOreKitSpacecraftState() <em>Ore Kit Spacecraft State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOreKitSpacecraftState()
	 * @generated
	 * @ordered
	 */
	protected static final SpacecraftState ORE_KIT_SPACECRAFT_STATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOreKitSpacecraftState() <em>Ore Kit Spacecraft State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOreKitSpacecraftState()
	 * @generated
	 * @ordered
	 */
	protected SpacecraftState oreKitSpacecraftState = ORE_KIT_SPACECRAFT_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OreKitBackedSpacecraftStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEarthOrbitEnvironmentPackage.Literals.ORE_KIT_BACKED_SPACECRAFT_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftState getOreKitSpacecraftState() {
		return oreKitSpacecraftState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOreKitSpacecraftState(SpacecraftState newOreKitSpacecraftState) {
		SpacecraftState oldOreKitSpacecraftState = oreKitSpacecraftState;
		oreKitSpacecraftState = newOreKitSpacecraftState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_BACKED_SPACECRAFT_STATE__ORE_KIT_SPACECRAFT_STATE, oldOreKitSpacecraftState, oreKitSpacecraftState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_BACKED_SPACECRAFT_STATE__ORE_KIT_SPACECRAFT_STATE:
				return getOreKitSpacecraftState();
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
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_BACKED_SPACECRAFT_STATE__ORE_KIT_SPACECRAFT_STATE:
				setOreKitSpacecraftState((SpacecraftState)newValue);
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
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_BACKED_SPACECRAFT_STATE__ORE_KIT_SPACECRAFT_STATE:
				setOreKitSpacecraftState(ORE_KIT_SPACECRAFT_STATE_EDEFAULT);
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
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_BACKED_SPACECRAFT_STATE__ORE_KIT_SPACECRAFT_STATE:
				return ORE_KIT_SPACECRAFT_STATE_EDEFAULT == null ? oreKitSpacecraftState != null : !ORE_KIT_SPACECRAFT_STATE_EDEFAULT.equals(oreKitSpacecraftState);
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
		result.append(" (oreKitSpacecraftState: ");
		result.append(oreKitSpacecraftState);
		result.append(')');
		return result.toString();
	}

} //OreKitBackedSpacecraftStateImpl
