/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.earth;

import ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ore Kit Backed Spacecraft State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A SpacecraftState that is backed by an OreKit SpacecraftState.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedSpacecraftState#getOreKitSpacecraftState <em>Ore Kit Spacecraft State</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getOreKitBackedSpacecraftState()
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
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getOreKitBackedSpacecraftState_OreKitSpacecraftState()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitSpacecraftState" transient="true"
	 * @generated
	 */
	org.orekit.propagation.SpacecraftState getOreKitSpacecraftState();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedSpacecraftState#getOreKitSpacecraftState <em>Ore Kit Spacecraft State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ore Kit Spacecraft State</em>' attribute.
	 * @see #getOreKitSpacecraftState()
	 * @generated
	 */
	void setOreKitSpacecraftState(org.orekit.propagation.SpacecraftState value);

} // OreKitBackedSpacecraftState
