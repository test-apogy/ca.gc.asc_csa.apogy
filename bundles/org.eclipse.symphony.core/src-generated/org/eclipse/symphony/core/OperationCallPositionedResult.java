/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core;

import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.core.invocator.OperationCallResult;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Call Positioned Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.OperationCallPositionedResult#getRelativePose <em>Relative Pose</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.Symphony__CorePackage#getOperationCallPositionedResult()
 * @model
 * @generated
 */
public interface OperationCallPositionedResult extends OperationCallResult, PositionedResult {
	/**
	 * Returns the value of the '<em><b>Relative Pose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pose relative to the system that produced the result.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Pose</em>' containment reference.
	 * @see #setRelativePose(Matrix4x4)
	 * @see org.eclipse.symphony.core.Symphony__CorePackage#getOperationCallPositionedResult_RelativePose()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='Readonly' propertyCategory='POSITION_INFO'"
	 * @generated
	 */
	Matrix4x4 getRelativePose();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.OperationCallPositionedResult#getRelativePose <em>Relative Pose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Pose</em>' containment reference.
	 * @see #getRelativePose()
	 * @generated
	 */
	void setRelativePose(Matrix4x4 value);

} // OperationCallPositionedResult
