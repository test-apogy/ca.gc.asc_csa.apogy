/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.common.emf.TimeSource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Sources List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.TimeSourcesList#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.TimeSourcesList#getTimeSources <em>Time Sources</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getTimeSourcesList()
 * @model
 * @generated
 */
public interface TimeSourcesList extends EObject {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.ApogyEnvironment#getTimeSourcesList <em>Time Sources List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' container reference.
	 * @see #setEnvironment(ApogyEnvironment)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getTimeSourcesList_Environment()
	 * @see ca.gc.asc_csa.apogy.core.ApogyEnvironment#getTimeSourcesList
	 * @model opposite="timeSourcesList" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	ApogyEnvironment getEnvironment();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.TimeSourcesList#getEnvironment <em>Environment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' container reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(ApogyEnvironment value);

	/**
	 * Returns the value of the '<em><b>Time Sources</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.common.emf.TimeSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Sources</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getTimeSourcesList_TimeSources()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeSource> getTimeSources();

} // TimeSourcesList
