/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit;

import org.eclipse.symphony.core.AbstractOrbitModel;
import org.eclipse.symphony.core.environment.Worksite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orbit Worksite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.OrbitWorksite#getActiveOrbitModel <em>Active Orbit Model</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.orbit.SymphonyOrbitEnvironmentPackage#getOrbitWorksite()
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
	 * @see org.eclipse.symphony.core.environment.orbit.SymphonyOrbitEnvironmentPackage#getOrbitWorksite_ActiveOrbitModel()
	 * @model
	 * @generated
	 */
	AbstractOrbitModel getActiveOrbitModel();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.OrbitWorksite#getActiveOrbitModel <em>Active Orbit Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Orbit Model</em>' reference.
	 * @see #getActiveOrbitModel()
	 * @generated
	 */
	void setActiveOrbitModel(AbstractOrbitModel value);
} // OrbitWorksite
