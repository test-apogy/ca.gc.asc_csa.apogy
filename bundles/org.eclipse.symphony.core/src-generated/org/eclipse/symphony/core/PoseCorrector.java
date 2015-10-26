/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.math.Matrix4x4;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pose Corrector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class that provides pose correction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.PoseCorrector#getSymphonySystemApiAdapter <em>Symphony System Api Adapter</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.PoseCorrector#isEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.SymphonyCorePackage#getPoseCorrector()
 * @model abstract="true"
 * @generated
 */
public interface PoseCorrector extends EObject
{
  /**
	 * Returns the value of the '<em><b>Symphony System Api Adapter</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.SymphonySystemApiAdapter#getPoseCorrector <em>Pose Corrector</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symphony System Api Adapter</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Symphony System Api Adapter</em>' container reference.
	 * @see #setSymphonySystemApiAdapter(SymphonySystemApiAdapter)
	 * @see org.eclipse.symphony.core.SymphonyCorePackage#getPoseCorrector_SymphonySystemApiAdapter()
	 * @see org.eclipse.symphony.core.SymphonySystemApiAdapter#getPoseCorrector
	 * @model opposite="poseCorrector" transient="false"
	 * @generated
	 */
  SymphonySystemApiAdapter getSymphonySystemApiAdapter();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.PoseCorrector#getSymphonySystemApiAdapter <em>Symphony System Api Adapter</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symphony System Api Adapter</em>' container reference.
	 * @see #getSymphonySystemApiAdapter()
	 * @generated
	 */
  void setSymphonySystemApiAdapter(SymphonySystemApiAdapter value);

  /**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Whether the Pose Predictor is enabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.eclipse.symphony.core.SymphonyCorePackage#getPoseCorrector_Enabled()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='SETTINGS_INFO'"
	 * @generated
	 */
  boolean isEnabled();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.PoseCorrector#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
  void setEnabled(boolean value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" originalPoseUnique="false"
	 * @generated
	 */
  Matrix4x4 applyCorrection(Matrix4x4 originalPose);

} // PoseCorrector
