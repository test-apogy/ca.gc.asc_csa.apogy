/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core;

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Orbit Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.AbstractOrbitModel#getOrbitModelsList <em>Orbit Models List</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getAbstractOrbitModel()
 * @model abstract="true"
 * @generated
 */
public interface AbstractOrbitModel extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Orbit Models List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.OrbitModelsList#getOrbitModels <em>Orbit Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orbit Models List</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orbit Models List</em>' container reference.
	 * @see #setOrbitModelsList(OrbitModelsList)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getAbstractOrbitModel_OrbitModelsList()
	 * @see ca.gc.asc_csa.apogy.core.OrbitModelsList#getOrbitModels
	 * @model opposite="orbitModels" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	OrbitModelsList getOrbitModelsList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.AbstractOrbitModel#getOrbitModelsList <em>Orbit Models List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orbit Models List</em>' container reference.
	 * @see #getOrbitModelsList()
	 * @generated
	 */
	void setOrbitModelsList(OrbitModelsList value);

} // AbstractOrbitModel
