/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.invocator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Watchs List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * WatchsList
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.WatchsList#getWatches <em>Watches</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getWatchsList()
 * @model
 * @generated
 */
public interface WatchsList extends EObject
{
  /**
   * Returns the value of the '<em><b>Watches</b></em>' containment reference list.
   * The list contents are of type {@link ca.gc.asc_csa.apogy.core.invocator.Watch}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Watches</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Watches</em>' containment reference list.
   * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getWatchsList_Watches()
   * @model containment="true"
   * @generated
   */
  EList<Watch> getWatches();

} // WatchsList
