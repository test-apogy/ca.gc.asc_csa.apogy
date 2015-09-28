/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.core;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;
import ca.gc.asc_csa.eclipse.emf.ecore.Timed;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Abstract Worksite</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.core.AbstractWorksite#getWorksitesList <em>Worksites List</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getAbstractWorksite()
 * @model abstract="true"
 * @generated
 */
public interface AbstractWorksite extends Named, Described, Timed {
	/**
	 * Returns the value of the '<em><b>Worksites List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.symphony.core.WorksitesList#getWorksites <em>Worksites</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worksites List</em>' container reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worksites List</em>' container reference.
	 * @see #setWorksitesList(WorksitesList)
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getAbstractWorksite_WorksitesList()
	 * @see ca.gc.asc_csa.symphony.core.WorksitesList#getWorksites
	 * @model opposite="worksites" transient="false"
	 * @generated
	 */
	WorksitesList getWorksitesList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.core.AbstractWorksite#getWorksitesList <em>Worksites List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worksites List</em>' container reference.
	 * @see #getWorksitesList()
	 * @generated
	 */
	void setWorksitesList(WorksitesList value);

} // AbstractWorksite
