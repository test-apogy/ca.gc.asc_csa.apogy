/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.processors;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines an object that can process an input to get an output.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.processors.Processor#getInput <em>Input</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.processors.Processor#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.processors.Symphony__CommonProcessorsPackage#getProcessor()
 * @model abstract="true"
 * @generated
 */
public interface Processor<I, O> extends Monitorable {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(Object)
	 * @see org.eclipse.symphony.common.processors.Symphony__CommonProcessorsPackage#getProcessor_Input()
	 * @model unique="false" transient="true"
	 * @generated
	 */
	I getInput();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.processors.Processor#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(I value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see #setOutput(Object)
	 * @see org.eclipse.symphony.common.processors.Symphony__CommonProcessorsPackage#getProcessor_Output()
	 * @model unique="false" transient="true"
	 * @generated
	 */
	O getOutput();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.processors.Processor#getOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(O value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exceptions="org.eclipse.symphony.common.processors.Exception" inputUnique="false"
	 * @generated
	 */
	O process(I input) throws Exception;

} // Processor
