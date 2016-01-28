/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core;

import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.core.invocator.InitializationData;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Apogy Initialization Data</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ApogyInitializationData#getInitialPoseTransform <em>Initial Pose Transform</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getApogyInitializationData()
 * @model
 * @generated
 */
public interface ApogyInitializationData extends InitializationData {

	/**
	 * Returns the value of the '<em><b>Initial Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Pose Transform</em>' containment
	 * reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Pose Transform</em>' containment reference.
	 * @see #setInitialPoseTransform(Matrix4x4)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getApogyInitializationData_InitialPoseTransform()
	 * @model containment="true"
	 * @generated
	 */
	Matrix4x4 getInitialPoseTransform();

	/**
	 * Sets the value of the '
	 * {@link ca.gc.asc_csa.apogy.core.ApogyInitializationData#getInitialPoseTransform
	 * <em>Initial Pose Transform</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Initial Pose Transform</em>'
	 *            containment reference.
	 * @see #getInitialPoseTransform()
	 * @generated
	 */
	void setInitialPoseTransform(Matrix4x4 value);
} // ApogyInitializationData
