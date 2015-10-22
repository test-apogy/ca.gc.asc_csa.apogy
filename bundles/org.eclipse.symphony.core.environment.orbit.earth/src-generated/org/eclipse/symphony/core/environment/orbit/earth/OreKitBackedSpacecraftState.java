/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth;

import org.eclipse.symphony.core.environment.orbit.SpacecraftState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ore Kit Backed Spacecraft State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A SpacecraftState that is backed by an OreKit SpacecraftState.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.OreKitBackedSpacecraftState#getOreKitSpacecraftState <em>Ore Kit Spacecraft State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getOreKitBackedSpacecraftState()
 * @model
 * @generated
 */
public interface OreKitBackedSpacecraftState extends SpacecraftState {
	/**
	 * Returns the value of the '<em><b>Ore Kit Spacecraft State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ore Kit Spacecraft State</em>' attribute.
	 * @see #setOreKitSpacecraftState(org.orekit.propagation.SpacecraftState)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getOreKitBackedSpacecraftState_OreKitSpacecraftState()
	 * @model unique="false" dataType="org.eclipse.symphony.core.environment.orbit.earth.OreKitSpacecraftState" transient="true"
	 * @generated
	 */
	org.orekit.propagation.SpacecraftState getOreKitSpacecraftState();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.OreKitBackedSpacecraftState#getOreKitSpacecraftState <em>Ore Kit Spacecraft State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ore Kit Spacecraft State</em>' attribute.
	 * @see #getOreKitSpacecraftState()
	 * @generated
	 */
	void setOreKitSpacecraftState(org.orekit.propagation.SpacecraftState value);

} // OreKitBackedSpacecraftState
