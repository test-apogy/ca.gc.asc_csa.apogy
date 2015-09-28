/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator;

import org.eclipse.emf.common.util.EList;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Watches List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * WatchesList
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.WatchesList#getWatchesListsContainer <em>Watches Lists Container</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.WatchesList#getWatches <em>Watches</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getWatchesList()
 * @model
 * @generated
 */
public interface WatchesList extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Watches Lists Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.WatchesListsContainer#getWatches <em>Watches</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Watches Lists Container</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Watches Lists Container</em>' container reference.
	 * @see #setWatchesListsContainer(WatchesListsContainer)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getWatchesList_WatchesListsContainer()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.WatchesListsContainer#getWatches
	 * @model opposite="watches" transient="false"
	 * @generated
	 */
  WatchesListsContainer getWatchesListsContainer();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.WatchesList#getWatchesListsContainer <em>Watches Lists Container</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Watches Lists Container</em>' container reference.
	 * @see #getWatchesListsContainer()
	 * @generated
	 */
  void setWatchesListsContainer(WatchesListsContainer value);

  /**
	 * Returns the value of the '<em><b>Watches</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Watch}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Watch#getWatchesList <em>Watches List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Watches</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Watches</em>' containment reference list.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getWatchesList_Watches()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.Watch#getWatchesList
	 * @model opposite="watchesList" containment="true"
	 * @generated
	 */
  EList<Watch> getWatches();

} // WatchesList
