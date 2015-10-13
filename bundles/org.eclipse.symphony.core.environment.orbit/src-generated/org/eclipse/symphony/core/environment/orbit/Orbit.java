/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit;

import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;
import org.eclipse.symphony.common.emf.Timed;


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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.Orbit#getReferenceFrame <em>Reference Frame</em>}</li>
 * </ul>
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
