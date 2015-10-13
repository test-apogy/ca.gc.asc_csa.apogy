/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.programs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.invocator.OperationCall;
import org.eclipse.symphony.core.invocator.Variable;

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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.programs.ProgramFacade#getSession <em>Session</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.programs.ProgramFacade#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.programs.InvocatorProgramsPackage#getProgramFacade()
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
	 * @see org.eclipse.symphony.core.programs.InvocatorProgramsPackage#getProgramFacade_Session()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	InvocatorSession getSession();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.invocator.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' reference list.
	 * @see org.eclipse.symphony.core.programs.InvocatorProgramsPackage#getProgramFacade_Variables()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exceptions="org.eclipse.symphony.common.emf.Exception" operationCallUnique="false"
	 * @generated
	 */
	Object exec(OperationCall operationCall) throws Exception;

} // ProgramFacade
