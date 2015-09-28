/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator;

import org.eclipse.emf.common.util.EList;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Results List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * Operation Call Results
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ResultsList#getResults <em>Results</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getResultsList()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ResultsList extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult#getResultsList <em>Results List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Results</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getResultsList_Results()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult#getResultsList
	 * @model opposite="resultsList" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' createChild='false'"
	 * @generated
	 */
  EList<AbstractResult> getResults();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	InvocatorSession getInvocatorSession();

} // ResultsList
