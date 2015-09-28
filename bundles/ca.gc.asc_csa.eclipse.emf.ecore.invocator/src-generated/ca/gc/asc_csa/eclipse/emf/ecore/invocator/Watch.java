/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;
import ca.gc.asc_csa.eclipse.emf.ecore.TreeRootNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Watch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * Watch
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Watch#getWatchesList <em>Watches List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Watch#getVariable <em>Variable</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Watch#getTypeMemberReferenceTreeElement <em>Type Member Reference Tree Element</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Watch#getTreeRootNode <em>Tree Root Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getWatch()
 * @model
 * @generated
 */
public interface Watch extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Watches List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.WatchesList#getWatches <em>Watches</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Watches List</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Watches List</em>' container reference.
	 * @see #setWatchesList(WatchesList)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getWatch_WatchesList()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.WatchesList#getWatches
	 * @model opposite="watches" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  WatchesList getWatchesList();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Watch#getWatchesList <em>Watches List</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Watches List</em>' container reference.
	 * @see #getWatchesList()
	 * @generated
	 */
  void setWatchesList(WatchesList value);

  /**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getWatch_Variable()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
  Variable getVariable();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Watch#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
  void setVariable(Variable value);

  /**
	 * Returns the value of the '<em><b>Type Member Reference Tree Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Member Reference Tree Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Member Reference Tree Element</em>' containment reference.
	 * @see #setTypeMemberReferenceTreeElement(TypeMemberReferenceTreeElement)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getWatch_TypeMemberReferenceTreeElement()
	 * @model containment="true"
	 * @generated
	 */
  TypeMemberReferenceTreeElement getTypeMemberReferenceTreeElement();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Watch#getTypeMemberReferenceTreeElement <em>Type Member Reference Tree Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Member Reference Tree Element</em>' containment reference.
	 * @see #getTypeMemberReferenceTreeElement()
	 * @generated
	 */
  void setTypeMemberReferenceTreeElement(TypeMemberReferenceTreeElement value);

  /**
	 * Returns the value of the '<em><b>Tree Root Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tree Root Node</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Tree Root Node</em>' containment reference.
	 * @see #setTreeRootNode(TreeRootNode)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getWatch_TreeRootNode()
	 * @model containment="true"
	 * @generated
	 */
  TreeRootNode getTreeRootNode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Watch#getTreeRootNode <em>Tree Root Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tree Root Node</em>' containment reference.
	 * @see #getTreeRootNode()
	 * @generated
	 */
  void setTreeRootNode(TreeRootNode value);

} // Watch
