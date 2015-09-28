/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Call Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallContainer#getOperationCalls <em>Operation Calls</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getOperationCallContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface OperationCallContainer extends EObject
{
  /**
	 * Returns the value of the '<em><b>Operation Calls</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall#getOperationCallContainer <em>Operation Call Container</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation Calls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Calls</em>' containment reference list.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getOperationCallContainer_OperationCalls()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall#getOperationCallContainer
	 * @model opposite="operationCallContainer" containment="true"
	 * @generated
	 */
  EList<OperationCall> getOperationCalls();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
  InvocatorSession getInvocatorSession();

} // OperationCallContainer
