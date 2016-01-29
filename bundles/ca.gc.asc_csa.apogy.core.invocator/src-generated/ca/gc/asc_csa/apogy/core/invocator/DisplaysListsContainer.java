/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.invocator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Displays Lists Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * DisplaysListsContainer
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.DisplaysListsContainer#getDisplays <em>Displays</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getDisplaysListsContainer()
 * @model
 * @generated
 */
public interface DisplaysListsContainer extends AbstractToolsListContainer
{
  /**
	 * Returns the value of the '<em><b>Displays</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.invocator.DisplaysList}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.DisplaysList#getDisplaysListsContainer <em>Displays Lists Container</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Displays</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Displays</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getDisplaysListsContainer_Displays()
	 * @see ca.gc.asc_csa.apogy.core.invocator.DisplaysList#getDisplaysListsContainer
	 * @model opposite="displaysListsContainer" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  EList<DisplaysList> getDisplays();

} // DisplaysListsContainer