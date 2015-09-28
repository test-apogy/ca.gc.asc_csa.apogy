/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.core;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InitializationData;
import ca.gc.space.math.Matrix4x4;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Symphony Initialization Data</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.core.SymphonyInitializationData#getInitialPoseTransform <em>Initial Pose Transform</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getSymphonyInitializationData()
 * @model
 * @generated
 */
public interface SymphonyInitializationData extends InitializationData {

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
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getSymphonyInitializationData_InitialPoseTransform()
	 * @model containment="true"
	 * @generated
	 */
	Matrix4x4 getInitialPoseTransform();

	/**
	 * Sets the value of the '
	 * {@link ca.gc.asc_csa.symphony.core.SymphonyInitializationData#getInitialPoseTransform
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
} // SymphonyInitializationData
