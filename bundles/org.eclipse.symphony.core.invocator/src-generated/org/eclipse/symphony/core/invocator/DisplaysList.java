/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Displays List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * DisplaysList
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.DisplaysList#getDisplaysListsContainer <em>Displays Lists Container</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.DisplaysList#getDisplays <em>Displays</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getDisplaysList()
 * @model
 * @generated
 */
public interface DisplaysList extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Displays Lists Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.DisplaysListsContainer#getDisplays <em>Displays</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Displays Lists Container</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Displays Lists Container</em>' container reference.
	 * @see #setDisplaysListsContainer(DisplaysListsContainer)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getDisplaysList_DisplaysListsContainer()
	 * @see org.eclipse.symphony.core.invocator.DisplaysListsContainer#getDisplays
	 * @model opposite="displays" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  DisplaysListsContainer getDisplaysListsContainer();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.DisplaysList#getDisplaysListsContainer <em>Displays Lists Container</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displays Lists Container</em>' container reference.
	 * @see #getDisplaysListsContainer()
	 * @generated
	 */
  void setDisplaysListsContainer(DisplaysListsContainer value);

  /**
	 * Returns the value of the '<em><b>Displays</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.invocator.AbstractDisplay}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.AbstractDisplay#getDisplaysList <em>Displays List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Displays</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Displays</em>' containment reference list.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getDisplaysList_Displays()
	 * @see org.eclipse.symphony.core.invocator.AbstractDisplay#getDisplaysList
	 * @model opposite="displaysList" containment="true"
	 * @generated
	 */
  EList<AbstractDisplay> getDisplays();

} // DisplaysList
