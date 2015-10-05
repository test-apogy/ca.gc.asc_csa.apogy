/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.math.Matrix4x4;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Defines a Region.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.Region#getTransformation <em>Transformation</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getRegion()
 * @model abstract="true"
 * @generated
 */
public interface Region extends EObject
{

  /**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Transform that expresses the origin of the region relative to the worksite.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference.
	 * @see #setTransformation(Matrix4x4)
	 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getRegion_Transformation()
	 * @model containment="true"
	 * @generated
	 */
  Matrix4x4 getTransformation();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.Region#getTransformation <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' containment reference.
	 * @see #getTransformation()
	 * @generated
	 */
  void setTransformation(Matrix4x4 value);
} // Region
