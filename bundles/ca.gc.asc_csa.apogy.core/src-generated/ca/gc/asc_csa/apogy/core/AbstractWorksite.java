/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core;

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.emf.Timed;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Abstract Worksite</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.AbstractWorksite#getWorksitesList <em>Worksites List</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getAbstractWorksite()
 * @model abstract="true"
 * @generated
 */
public interface AbstractWorksite extends Named, Described, Timed {
	/**
	 * Returns the value of the '<em><b>Worksites List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.WorksitesList#getWorksites <em>Worksites</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worksites List</em>' container reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worksites List</em>' container reference.
	 * @see #setWorksitesList(WorksitesList)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getAbstractWorksite_WorksitesList()
	 * @see ca.gc.asc_csa.apogy.core.WorksitesList#getWorksites
	 * @model opposite="worksites" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	WorksitesList getWorksitesList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.AbstractWorksite#getWorksitesList <em>Worksites List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worksites List</em>' container reference.
	 * @see #getWorksitesList()
	 * @generated
	 */
	void setWorksitesList(WorksitesList value);

} // AbstractWorksite