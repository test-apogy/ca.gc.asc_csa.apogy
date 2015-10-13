/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;

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
 *   <li>{@link org.eclipse.symphony.core.invocator.ResultsList#getResults <em>Results</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getResultsList()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ResultsList extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.invocator.AbstractResult}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.AbstractResult#getResultsList <em>Results List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Results</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getResultsList_Results()
	 * @see org.eclipse.symphony.core.invocator.AbstractResult#getResultsList
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
