/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Positioned</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Positioned classes
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.Positioned#getPose <em>Pose</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getPositioned()
 * @model
 * @generated
 */
public interface Positioned extends EObject {
	/**
	 * Returns the value of the '<em><b>Pose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pose</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pose</em>' containment reference.
	 * @see #setPose(Matrix4x4)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getPositioned_Pose()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='Editable' propertyCategory='POSITION_INFO'"
	 * @generated
	 */
	Matrix4x4 getPose();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.Positioned#getPose <em>Pose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pose</em>' containment reference.
	 * @see #getPose()
	 * @generated
	 */
	void setPose(Matrix4x4 value);

} // Positioned