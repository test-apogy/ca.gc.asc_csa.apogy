/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator;

import org.eclipse.emf.common.util.EList;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Products Lists Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * DataProducts.
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.DataProductsListsContainer#getInvocatorSession <em>Invocator Session</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.DataProductsListsContainer#getDataProductsList <em>Data Products List</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getDataProductsListsContainer()
 * @model
 * @generated
 */
public interface DataProductsListsContainer extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Invocator Session</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession#getDataProductsListContainer <em>Data Products List Container</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invocator Session</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocator Session</em>' container reference.
	 * @see #setInvocatorSession(InvocatorSession)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getDataProductsListsContainer_InvocatorSession()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession#getDataProductsListContainer
	 * @model opposite="dataProductsListContainer" transient="false"
	 * @generated
	 */
  InvocatorSession getInvocatorSession();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.DataProductsListsContainer#getInvocatorSession <em>Invocator Session</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invocator Session</em>' container reference.
	 * @see #getInvocatorSession()
	 * @generated
	 */
  void setInvocatorSession(InvocatorSession value);

  /**
	 * Returns the value of the '<em><b>Data Products List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.DataProductsList}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.DataProductsList#getDataProductsListsContainer <em>Data Products Lists Container</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Products List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Products List</em>' containment reference list.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getDataProductsListsContainer_DataProductsList()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.DataProductsList#getDataProductsListsContainer
	 * @model opposite="dataProductsListsContainer" containment="true"
	 * @generated
	 */
  EList<DataProductsList> getDataProductsList();

} // DataProductsListsContainer
