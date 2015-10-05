/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.core;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.math.Matrix4x4;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pose Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Symphony System API.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.core.PoseProvider#getPoseTransform <em>Pose Transform</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getPoseProvider()
 * @model
 * @generated
 */
public interface PoseProvider extends EObject
{
  /**
	 * Returns the value of the '<em><b>Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pose Transform</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Pose Transform</em>' containment reference.
	 * @see #setPoseTransform(Matrix4x4)
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getPoseProvider_PoseTransform()
	 * @model containment="true"
	 * @generated
	 */
  Matrix4x4 getPoseTransform();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.core.PoseProvider#getPoseTransform <em>Pose Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pose Transform</em>' containment reference.
	 * @see #getPoseTransform()
	 * @generated
	 */
  void setPoseTransform(Matrix4x4 value);

} // PoseProvider
