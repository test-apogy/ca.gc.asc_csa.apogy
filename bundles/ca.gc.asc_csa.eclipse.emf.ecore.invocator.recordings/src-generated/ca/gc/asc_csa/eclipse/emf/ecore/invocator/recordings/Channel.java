/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings;

import ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureNode;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractChannel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Channel
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Channel#getRecordingPolicy <em>Recording Policy</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Channel#getFixedPeriodValues <em>Fixed Period Values</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Channel#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.EMFEcoreInvocatorRecordingsPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends AbstractChannel
{
  /**
	 * Returns the value of the '<em><b>Recording Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The recording policy being used for this channel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recording Policy</em>' attribute.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingPolicy
	 * @see #setRecordingPolicy(RecordingPolicy)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.EMFEcoreInvocatorRecordingsPackage#getChannel_RecordingPolicy()
	 * @model unique="false"
	 * @generated
	 */
	RecordingPolicy getRecordingPolicy();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Channel#getRecordingPolicy <em>Recording Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recording Policy</em>' attribute.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingPolicy
	 * @see #getRecordingPolicy()
	 * @generated
	 */
	void setRecordingPolicy(RecordingPolicy value);

	/**
	 * Returns the value of the '<em><b>Fixed Period Values</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.FixedPeriodValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The recording period to be used if using FixedPeriod as RecordingPolicy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Period Values</em>' attribute.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.FixedPeriodValues
	 * @see #setFixedPeriodValues(FixedPeriodValues)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.EMFEcoreInvocatorRecordingsPackage#getChannel_FixedPeriodValues()
	 * @model unique="false"
	 * @generated
	 */
	FixedPeriodValues getFixedPeriodValues();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Channel#getFixedPeriodValues <em>Fixed Period Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Period Values</em>' attribute.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.FixedPeriodValues
	 * @see #getFixedPeriodValues()
	 * @generated
	 */
	void setFixedPeriodValues(FixedPeriodValues value);

		/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The feature being recorded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(AbstractFeatureNode)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.EMFEcoreInvocatorRecordingsPackage#getChannel_Feature()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
  AbstractFeatureNode getFeature();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Channel#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
  void setFeature(AbstractFeatureNode value);

} // Channel
