/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.processors;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processors Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.processors.ProcessorsChain#getIntermediateResult <em>Intermediate Result</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.processors.ProcessorsChain#getRunningProcessor <em>Running Processor</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.processors.ProcessorsChain#getProcessors <em>Processors</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.processors.ProcessorsPackage#getProcessorsChain()
 * @model
 * @generated
 */
public interface ProcessorsChain<I, O> extends Processor<I, O> {
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
	 * @see org.eclipse.symphony.common.processors.ProcessorsPackage#getProcessorsChain_IntermediateResult()
	 * @model unique="false"
	 * @generated
	 */
	Object getIntermediateResult();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.processors.ProcessorsChain#getIntermediateResult <em>Intermediate Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intermediate Result</em>' attribute.
	 * @see #getIntermediateResult()
	 * @generated
	 */
	void setIntermediateResult(Object value);

	/**
	 * Returns the value of the '<em><b>Running Processor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running Processor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running Processor</em>' reference.
	 * @see #setRunningProcessor(Processor)
	 * @see org.eclipse.symphony.common.processors.ProcessorsPackage#getProcessorsChain_RunningProcessor()
	 * @model required="true"
	 * @generated
	 */
	Processor<?, ?> getRunningProcessor();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.processors.ProcessorsChain#getRunningProcessor <em>Running Processor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running Processor</em>' reference.
	 * @see #getRunningProcessor()
	 * @generated
	 */
	void setRunningProcessor(Processor<?, ?> value);

	/**
	 * Returns the value of the '<em><b>Processors</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.common.processors.Processor}&lt;?, ?>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processors</em>' reference list.
	 * @see org.eclipse.symphony.common.processors.ProcessorsPackage#getProcessorsChain_Processors()
	 * @model
	 * @generated
	 */
	EList<Processor<?, ?>> getProcessors();

} // ProcessorsChain
