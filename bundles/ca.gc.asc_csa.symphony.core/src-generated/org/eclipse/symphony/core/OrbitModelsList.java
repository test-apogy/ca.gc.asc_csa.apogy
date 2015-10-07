/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orbit Models List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Orbits classes
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.OrbitModelsList#getOrbitModels <em>Orbit Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.SymphonyCorePackage#getOrbitModelsList()
 * @model
 * @generated
 */
public interface OrbitModelsList extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Orbit Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.AbstractOrbitModel}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.AbstractOrbitModel#getOrbitModelsList <em>Orbit Models List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orbit Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orbit Models</em>' containment reference list.
	 * @see org.eclipse.symphony.core.SymphonyCorePackage#getOrbitModelsList_OrbitModels()
	 * @see org.eclipse.symphony.core.AbstractOrbitModel#getOrbitModelsList
	 * @model opposite="orbitModelsList" containment="true"
	 * @generated
	 */
	EList<AbstractOrbitModel> getOrbitModels();

} // OrbitModelsList
