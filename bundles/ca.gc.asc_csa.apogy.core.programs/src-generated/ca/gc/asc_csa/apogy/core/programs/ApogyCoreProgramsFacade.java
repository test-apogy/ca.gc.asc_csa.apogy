/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.programs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The program runtimes must use this to interact with the EMF invocator Singleton.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.ApogyCoreProgramsFacade#getSession <em>Session</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.ApogyCoreProgramsFacade#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.programs.ApogyCoreProgramsPackage#getApogyCoreProgramsFacade()
 * @model
 * @generated
 */
public interface ApogyCoreProgramsFacade extends EObject {
	/**
	 * Returns the value of the '<em><b>Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session</em>' reference.
	 * @see ca.gc.asc_csa.apogy.core.programs.ApogyCoreProgramsPackage#getApogyCoreProgramsFacade_Session()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	InvocatorSession getSession();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.invocator.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.core.programs.ApogyCoreProgramsPackage#getApogyCoreProgramsFacade_Variables()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.emf.Exception" operationCallUnique="false"
	 * @generated
	 */
	Object exec(OperationCall operationCall) throws Exception;

} // ApogyCoreProgramsFacade