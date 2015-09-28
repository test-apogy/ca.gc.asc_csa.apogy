/**
 * Canadian Space Agency 2007
 *
 * $Id: ProcessorsChain.java,v 1.2.4.2 2015/05/21 15:51:13 pallard Exp $
 */
package ca.gc.space.mrt.common.processors;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a chain of Processors that are applied in sequence on an input to get an ouptut.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.common.processors.ProcessorsChain#getIntermediateResult <em>Intermediate Result</em>}</li>
 *   <li>{@link ca.gc.space.mrt.common.processors.ProcessorsChain#getProcessors <em>Processors</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.common.processors.ProcessorsPackage#getProcessorsChain()
 * @model
 * @generated
 */
public interface ProcessorsChain extends Processor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007";

	/**
	 * Returns the value of the '<em><b>Intermediate Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Result</em>' attribute.
	 * @see #setIntermediateResult(Object)
	 * @see ca.gc.space.mrt.common.processors.ProcessorsPackage#getProcessorsChain_IntermediateResult()
	 * @model
	 * @generated
	 */
	Object getIntermediateResult();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.common.processors.ProcessorsChain#getIntermediateResult <em>Intermediate Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intermediate Result</em>' attribute.
	 * @see #getIntermediateResult()
	 * @generated
	 */
	void setIntermediateResult(Object value);

	/**
	 * Returns the value of the '<em><b>Processors</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.space.mrt.common.processors.Processor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processors</em>' reference list.
	 * @see ca.gc.space.mrt.common.processors.ProcessorsPackage#getProcessorsChain_Processors()
	 * @model
	 * @generated
	 */
	EList<Processor> getProcessors();

} // ProcessorsChain
