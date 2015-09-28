/**
 * Canadian Space Agency 2007.
 *
 * $Id: Processor.java,v 1.4.4.3 2015/06/01 17:21:48 pallard Exp $
 */
package ca.gc.space.mrt.common.processors;


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
 * <ul>
 *   <li>{@link ca.gc.space.mrt.common.processors.Processor#getInput <em>Input</em>}</li>
 *   <li>{@link ca.gc.space.mrt.common.processors.Processor#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.common.processors.ProcessorsPackage#getProcessor()
 * @model abstract="true"
 * @generated
 */
public interface Processor <I,O> extends Monitorable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

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
	 * @see ca.gc.space.mrt.common.processors.ProcessorsPackage#getProcessor_Input()
	 * @model unique="false" transient="true"
	 * @generated
	 */
	I getInput();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.common.processors.Processor#getInput <em>Input</em>}' attribute.
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
	 * @see ca.gc.space.mrt.common.processors.ProcessorsPackage#getProcessor_Output()
	 * @model unique="false" transient="true"
	 * @generated
	 */
	O getOutput();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.common.processors.Processor#getOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(O value);

	/**
	 * Method that implements the process itself.
	 * @param input The input to the processor
	 * @return The output result of processor.
	 * @throws Exception If an error occurs during processsing.
	 */
	public O process(I input) throws Exception;
} // Processor
