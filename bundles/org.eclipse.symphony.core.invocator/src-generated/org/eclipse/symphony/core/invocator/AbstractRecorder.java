/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Recorder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * Recorder
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.AbstractRecorder#getRecordingToolsContainer <em>Recording Tools Container</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getAbstractRecorder()
 * @model abstract="true"
 * @generated
 */
public interface AbstractRecorder extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Recording Tools Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.RecordingToolsContainer#getRecorder <em>Recorder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recording Tools Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recording Tools Container</em>' container reference.
	 * @see #setRecordingToolsContainer(RecordingToolsContainer)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getAbstractRecorder_RecordingToolsContainer()
	 * @see org.eclipse.symphony.core.invocator.RecordingToolsContainer#getRecorder
	 * @model opposite="recorder" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	RecordingToolsContainer getRecordingToolsContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.AbstractRecorder#getRecordingToolsContainer <em>Recording Tools Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recording Tools Container</em>' container reference.
	 * @see #getRecordingToolsContainer()
	 * @generated
	 */
	void setRecordingToolsContainer(RecordingToolsContainer value);

} // AbstractRecorder
