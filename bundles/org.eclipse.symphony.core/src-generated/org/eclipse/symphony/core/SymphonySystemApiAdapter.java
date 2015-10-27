/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core;

import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.core.invocator.OperationCall;
import org.eclipse.symphony.core.invocator.TypeApiAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symphony System Api Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.SymphonySystemApiAdapter#getPoseCorrector <em>Pose Corrector</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.SymphonySystemApiAdapter#getSymphonySystem <em>Symphony System</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.Symphony__CorePackage#getSymphonySystemApiAdapter()
 * @model
 * @generated
 */
public interface SymphonySystemApiAdapter extends TypeApiAdapter, PoseProvider
{

  /**
	 * Returns the value of the '<em><b>Pose Corrector</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.PoseCorrector#getSymphonySystemApiAdapter <em>Symphony System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pose Corrector</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Pose Corrector</em>' containment reference.
	 * @see #setPoseCorrector(PoseCorrector)
	 * @see org.eclipse.symphony.core.Symphony__CorePackage#getSymphonySystemApiAdapter_PoseCorrector()
	 * @see org.eclipse.symphony.core.PoseCorrector#getSymphonySystemApiAdapter
	 * @model opposite="symphonySystemApiAdapter" containment="true"
	 * @generated
	 */
  PoseCorrector getPoseCorrector();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.SymphonySystemApiAdapter#getPoseCorrector <em>Pose Corrector</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pose Corrector</em>' containment reference.
	 * @see #getPoseCorrector()
	 * @generated
	 */
  void setPoseCorrector(PoseCorrector value);

  /**
	 * Returns the value of the '<em><b>Symphony System</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symphony System</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Symphony System</em>' reference.
	 * @see #setSymphonySystem(SymphonySystem)
	 * @see org.eclipse.symphony.core.Symphony__CorePackage#getSymphonySystemApiAdapter_SymphonySystem()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' createChild='false'"
	 * @generated
	 */
  SymphonySystem getSymphonySystem();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.SymphonySystemApiAdapter#getSymphonySystem <em>Symphony System</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symphony System</em>' reference.
	 * @see #getSymphonySystem()
	 * @generated
	 */
  void setSymphonySystem(SymphonySystem value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" operationCallUnique="false"
	 * @generated
	 */
  Matrix4x4 createResultMatrix(OperationCall operationCall);
} // SymphonySystemApiAdapter
