/**
 * Canadian Space Agency / Agence spatiale canadienne 2016 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.programs.javascript;

import ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer;
import ca.gc.asc_csa.apogy.core.invocator.Program;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Script Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A JavaScriptProgram is an entity that invokes Operation Calls on Variables through a JavaScript program file.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.javascript.JavaScriptProgram#getScriptPath <em>Script Path</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.programs.javascript.ApogyCoreJavaScriptProgramsPackage#getJavaScriptProgram()
 * @model
 * @generated
 */
public interface JavaScriptProgram extends Program, OperationCallContainer {
	/**
	 * Returns the value of the '<em><b>Script Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Path</em>' attribute.
	 * @see #setScriptPath(String)
	 * @see ca.gc.asc_csa.apogy.core.programs.javascript.ApogyCoreJavaScriptProgramsPackage#getJavaScriptProgram_ScriptPath()
	 * @model unique="false"
	 * @generated
	 */
	String getScriptPath();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.programs.javascript.JavaScriptProgram#getScriptPath <em>Script Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Path</em>' attribute.
	 * @see #getScriptPath()
	 * @generated
	 */
	void setScriptPath(String value);

} // JavaScriptProgram
