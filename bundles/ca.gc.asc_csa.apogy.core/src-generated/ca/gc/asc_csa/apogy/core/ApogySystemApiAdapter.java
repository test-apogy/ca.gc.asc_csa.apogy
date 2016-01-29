/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core;

import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apogy System Api Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter#getPoseCorrector <em>Pose Corrector</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter#getApogySystem <em>Apogy System</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getApogySystemApiAdapter()
 * @model
 * @generated
 */
public interface ApogySystemApiAdapter extends TypeApiAdapter, PoseProvider
{

  /**
	 * Returns the value of the '<em><b>Pose Corrector</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.PoseCorrector#getApogySystemApiAdapter <em>Apogy System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pose Corrector</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Pose Corrector</em>' containment reference.
	 * @see #setPoseCorrector(PoseCorrector)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getApogySystemApiAdapter_PoseCorrector()
	 * @see ca.gc.asc_csa.apogy.core.PoseCorrector#getApogySystemApiAdapter
	 * @model opposite="apogySystemApiAdapter" containment="true"
	 * @generated
	 */
  PoseCorrector getPoseCorrector();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter#getPoseCorrector <em>Pose Corrector</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pose Corrector</em>' containment reference.
	 * @see #getPoseCorrector()
	 * @generated
	 */
  void setPoseCorrector(PoseCorrector value);

  /**
	 * Returns the value of the '<em><b>Apogy System</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Apogy System</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Apogy System</em>' reference.
	 * @see #setApogySystem(ApogySystem)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getApogySystemApiAdapter_ApogySystem()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' createChild='false'"
	 * @generated
	 */
  ApogySystem getApogySystem();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter#getApogySystem <em>Apogy System</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apogy System</em>' reference.
	 * @see #getApogySystem()
	 * @generated
	 */
  void setApogySystem(ApogySystem value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" operationCallUnique="false"
	 * @generated
	 */
  Matrix4x4 createResultMatrix(OperationCall operationCall);
} // ApogySystemApiAdapter
