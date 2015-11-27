/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;

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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.DataProductsListsContainer#getInvocatorSession <em>Invocator Session</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.DataProductsListsContainer#getDataProductsList <em>Data Products List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getDataProductsListsContainer()
 * @model
 * @generated
 */
public interface DataProductsListsContainer extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Invocator Session</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.InvocatorSession#getDataProductsListContainer <em>Data Products List Container</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invocator Session</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocator Session</em>' container reference.
	 * @see #setInvocatorSession(InvocatorSession)
	 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getDataProductsListsContainer_InvocatorSession()
	 * @see org.eclipse.symphony.core.invocator.InvocatorSession#getDataProductsListContainer
	 * @model opposite="dataProductsListContainer" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  InvocatorSession getInvocatorSession();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.DataProductsListsContainer#getInvocatorSession <em>Invocator Session</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invocator Session</em>' container reference.
	 * @see #getInvocatorSession()
	 * @generated
	 */
  void setInvocatorSession(InvocatorSession value);

  /**
	 * Returns the value of the '<em><b>Data Products List</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.invocator.DataProductsList}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.DataProductsList#getDataProductsListsContainer <em>Data Products Lists Container</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Products List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Products List</em>' containment reference list.
	 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getDataProductsListsContainer_DataProductsList()
	 * @see org.eclipse.symphony.core.invocator.DataProductsList#getDataProductsListsContainer
	 * @model opposite="dataProductsListsContainer" containment="true"
	 * @generated
	 */
  EList<DataProductsList> getDataProductsList();

} // DataProductsListsContainer
