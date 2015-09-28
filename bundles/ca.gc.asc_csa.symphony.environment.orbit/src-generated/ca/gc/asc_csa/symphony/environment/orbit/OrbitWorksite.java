/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit;

import ca.gc.asc_csa.symphony.core.AbstractOrbitModel;
import ca.gc.asc_csa.symphony.environment.Worksite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orbit Worksite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.OrbitWorksite#getActiveOrbitModel <em>Active Orbit Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.environment.orbit.SymphonyOrbitEnvironmentPackage#getOrbitWorksite()
 * @model abstract="true"
 * @generated
 */
public interface OrbitWorksite extends Worksite {

	/**
	 * Returns the value of the '<em><b>Active Orbit Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Orbit Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The active OrbitModel to use to update the orbit worksite.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Orbit Model</em>' reference.
	 * @see #setActiveOrbitModel(AbstractOrbitModel)
	 * @see ca.gc.asc_csa.symphony.environment.orbit.SymphonyOrbitEnvironmentPackage#getOrbitWorksite_ActiveOrbitModel()
	 * @model
	 * @generated
	 */
	AbstractOrbitModel getActiveOrbitModel();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.orbit.OrbitWorksite#getActiveOrbitModel <em>Active Orbit Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Orbit Model</em>' reference.
	 * @see #getActiveOrbitModel()
	 * @generated
	 */
	void setActiveOrbitModel(AbstractOrbitModel value);
} // OrbitWorksite
