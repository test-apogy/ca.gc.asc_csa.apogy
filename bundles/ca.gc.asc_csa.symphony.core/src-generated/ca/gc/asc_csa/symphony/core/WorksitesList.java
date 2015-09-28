/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.core;

import org.eclipse.emf.common.util.EList;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Worksites List</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Worksites.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.core.WorksitesList#getWorksites <em>Worksites</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.core.WorksitesList#getOrbitsModels <em>Orbits Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getWorksitesList()
 * @model
 * @generated
 */
public interface WorksitesList extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Worksites</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.symphony.core.AbstractWorksite}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.symphony.core.AbstractWorksite#getWorksitesList <em>Worksites List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worksites</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worksites</em>' containment reference list.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getWorksitesList_Worksites()
	 * @see ca.gc.asc_csa.symphony.core.AbstractWorksite#getWorksitesList
	 * @model opposite="worksitesList" containment="true"
	 * @generated
	 */
	EList<AbstractWorksite> getWorksites();

	/**
	 * Returns the value of the '<em><b>Orbits Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orbits Models</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orbits Models</em>' containment reference.
	 * @see #setOrbitsModels(OrbitModelsList)
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getWorksitesList_OrbitsModels()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='Editable'"
	 * @generated
	 */
	OrbitModelsList getOrbitsModels();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.core.WorksitesList#getOrbitsModels <em>Orbits Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orbits Models</em>' containment reference.
	 * @see #getOrbitsModels()
	 * @generated
	 */
	void setOrbitsModels(OrbitModelsList value);

} // WorksitesList
