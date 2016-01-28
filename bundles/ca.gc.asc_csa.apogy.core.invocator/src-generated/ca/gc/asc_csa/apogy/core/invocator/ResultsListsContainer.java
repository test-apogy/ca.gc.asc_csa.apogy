/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.invocator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Results Lists Container</b></em>'.
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
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ResultsListsContainer#getDataProductsList <em>Data Products List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ResultsListsContainer#getResultsList <em>Results List</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getResultsListsContainer()
 * @model
 * @generated
 */
public interface ResultsListsContainer extends EObject
{
  /**
   * Returns the value of the '<em><b>Data Products List</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.DataProductsList#getResultsListsContainer <em>Results Lists Container</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Products List</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Products List</em>' container reference.
   * @see #setDataProductsList(DataProductsList)
   * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getResultsListsContainer_DataProductsList()
   * @see ca.gc.asc_csa.apogy.core.invocator.DataProductsList#getResultsListsContainer
   * @model opposite="resultsListsContainer" transient="false"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
   * @generated
   */
  DataProductsList getDataProductsList();

  /**
   * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.ResultsListsContainer#getDataProductsList <em>Data Products List</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Products List</em>' container reference.
   * @see #getDataProductsList()
   * @generated
   */
  void setDataProductsList(DataProductsList value);

  /**
   * Returns the value of the '<em><b>Results List</b></em>' containment reference list.
   * The list contents are of type {@link ca.gc.asc_csa.apogy.core.invocator.ResultsList}.
   * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.ResultsList#getResultsListsContainer <em>Results Lists Container</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Results List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Results List</em>' containment reference list.
   * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getResultsListsContainer_ResultsList()
   * @see ca.gc.asc_csa.apogy.core.invocator.ResultsList#getResultsListsContainer
   * @model opposite="resultsListsContainer" containment="true"
   * @generated
   */
  EList<ResultsList> getResultsList();

} // ResultsListsContainer
