/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * Player
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractPlayer#getRecordingToolsContainer <em>Recording Tools Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getAbstractPlayer()
 * @model abstract="true"
 * @generated
 */
public interface AbstractPlayer extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Recording Tools Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.RecordingToolsContainer#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recording Tools Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recording Tools Container</em>' container reference.
	 * @see #setRecordingToolsContainer(RecordingToolsContainer)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getAbstractPlayer_RecordingToolsContainer()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.RecordingToolsContainer#getPlayer
	 * @model opposite="player" transient="false"
	 * @generated
	 */
	RecordingToolsContainer getRecordingToolsContainer();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractPlayer#getRecordingToolsContainer <em>Recording Tools Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recording Tools Container</em>' container reference.
	 * @see #getRecordingToolsContainer()
	 * @generated
	 */
	void setRecordingToolsContainer(RecordingToolsContainer value);

} // AbstractPlayer
