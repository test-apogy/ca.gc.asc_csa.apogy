/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.programs;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Variable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * The program runtimes must use this to interact with the EMF invocator Singleton.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.programs.ProgramFacade#getSession <em>Session</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.programs.ProgramFacade#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.programs.InvocatorProgramsPackage#getProgramFacade()
 * @model
 * @generated
 */
public interface ProgramFacade extends EObject {
	/**
	 * Returns the value of the '<em><b>Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session</em>' reference.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.programs.InvocatorProgramsPackage#getProgramFacade_Session()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	InvocatorSession getSession();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' reference list.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.programs.InvocatorProgramsPackage#getProgramFacade_Variables()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.eclipse.emf.ecore.Exception" operationCallUnique="false"
	 * @generated
	 */
	Object exec(OperationCall operationCall) throws Exception;

} // ProgramFacade
