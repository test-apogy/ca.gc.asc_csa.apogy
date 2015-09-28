/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arguments List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ArgumentsList#getOperationCall <em>Operation Call</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ArgumentsList#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getArgumentsList()
 * @model
 * @generated
 */
public interface ArgumentsList extends EObject
{
  /**
	 * Returns the value of the '<em><b>Operation Call</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall#getArgumentsList <em>Arguments List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation Call</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Call</em>' container reference.
	 * @see #setOperationCall(OperationCall)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getArgumentsList_OperationCall()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall#getArgumentsList
	 * @model opposite="argumentsList" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly'"
	 * @generated
	 */
  OperationCall getOperationCall();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ArgumentsList#getOperationCall <em>Operation Call</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Call</em>' container reference.
	 * @see #getOperationCall()
	 * @generated
	 */
  void setOperationCall(OperationCall value);

  /**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Argument}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Argument#getArgumentsList <em>Arguments List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getArgumentsList_Arguments()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.Argument#getArgumentsList
	 * @model opposite="argumentsList" containment="true"
	 * @generated
	 */
  EList<Argument> getArguments();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.eclipse.emf.ecore.List<?>" unique="false" many="false"
	 * @generated
	 */
  List<?> getArgumentValues();

} // ArgumentsList
