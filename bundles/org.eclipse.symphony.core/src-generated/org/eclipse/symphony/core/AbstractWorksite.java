/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core;

import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;
import org.eclipse.symphony.common.emf.Timed;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Abstract Worksite</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.AbstractWorksite#getWorksitesList <em>Worksites List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.Symphony__CorePackage#getAbstractWorksite()
 * @model abstract="true"
 * @generated
 */
public interface AbstractWorksite extends Named, Described, Timed {
	/**
	 * Returns the value of the '<em><b>Worksites List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.WorksitesList#getWorksites <em>Worksites</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worksites List</em>' container reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worksites List</em>' container reference.
	 * @see #setWorksitesList(WorksitesList)
	 * @see org.eclipse.symphony.core.Symphony__CorePackage#getAbstractWorksite_WorksitesList()
	 * @see org.eclipse.symphony.core.WorksitesList#getWorksites
	 * @model opposite="worksites" transient="false"
	 * @generated
	 */
	WorksitesList getWorksitesList();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.AbstractWorksite#getWorksitesList <em>Worksites List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worksites List</em>' container reference.
	 * @see #getWorksitesList()
	 * @generated
	 */
	void setWorksitesList(WorksitesList value);

} // AbstractWorksite
