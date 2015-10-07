/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;
import ca.gc.asc_csa.eclipse.emf.ecore.Timed;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orbit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Defines an Orbit. An orbit defines the orbital parameter at a given point in time (orbital parameters can change with time.)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.Orbit#getReferenceFrame <em>Reference Frame</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.orbit.SymphonyOrbitEnvironmentPackage#getOrbit()
 * @model abstract="true"
 * @generated
 */
public interface Orbit extends Named, Described, Timed {

	/**
	 * Returns the value of the '<em><b>Reference Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The inertial frame used to represent this orbit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Frame</em>' containment reference.
	 * @see #setReferenceFrame(AbstractFrame)
	 * @see org.eclipse.symphony.core.environment.orbit.SymphonyOrbitEnvironmentPackage#getOrbit_ReferenceFrame()
	 * @model containment="true"
	 * @generated
	 */
	AbstractFrame getReferenceFrame();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.Orbit#getReferenceFrame <em>Reference Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Frame</em>' containment reference.
	 * @see #getReferenceFrame()
	 * @generated
	 */
	void setReferenceFrame(AbstractFrame value);
} // Orbit