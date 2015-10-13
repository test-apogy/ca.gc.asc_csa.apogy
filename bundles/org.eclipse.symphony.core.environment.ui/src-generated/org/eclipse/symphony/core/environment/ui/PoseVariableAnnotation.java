/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui;

import javax.vecmath.Color3f;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pose Variable Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AbstractVariableAnnotation that shows the position and orientation of a variable on a Map.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.PoseVariableAnnotation#getVectorlength <em>Vectorlength</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.PoseVariableAnnotation#getVectorColor <em>Vector Color</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.PoseVariableAnnotation#isShowPose <em>Show Pose</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getPoseVariableAnnotation()
 * @model
 * @generated
 */
public interface PoseVariableAnnotation extends AbstractVariableAnnotation
{
  /**
	 * Returns the value of the '<em><b>Vectorlength</b></em>' attribute.
	 * The default value is <code>"10.0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The length of the vector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vectorlength</em>' attribute.
	 * @see #setVectorlength(double)
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getPoseVariableAnnotation_Vectorlength()
	 * @model default="10.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='VECTOR_PROPERTIES' csa_units='m'"
	 * @generated
	 */
  double getVectorlength();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.PoseVariableAnnotation#getVectorlength <em>Vectorlength</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vectorlength</em>' attribute.
	 * @see #getVectorlength()
	 * @generated
	 */
  void setVectorlength(double value);

  /**
	 * Returns the value of the '<em><b>Vector Color</b></em>' attribute.
	 * The default value is <code>"0.0,0.0,1.0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The color of the vector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vector Color</em>' attribute.
	 * @see #setVectorColor(Color3f)
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getPoseVariableAnnotation_VectorColor()
	 * @model default="0.0,0.0,1.0" unique="false" dataType="org.eclipse.symphony.core.environment.ui.Color3f"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='VECTOR_PROPERTIES'"
	 * @generated
	 */
  Color3f getVectorColor();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.PoseVariableAnnotation#getVectorColor <em>Vector Color</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector Color</em>' attribute.
	 * @see #getVectorColor()
	 * @generated
	 */
  void setVectorColor(Color3f value);

  /**
	 * Returns the value of the '<em><b>Show Pose</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Whether to show the pose as text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Show Pose</em>' attribute.
	 * @see #setShowPose(boolean)
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getPoseVariableAnnotation_ShowPose()
	 * @model default="true" unique="false"
	 * @generated
	 */
  boolean isShowPose();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.PoseVariableAnnotation#isShowPose <em>Show Pose</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Pose</em>' attribute.
	 * @see #isShowPose()
	 * @generated
	 */
  void setShowPose(boolean value);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Method called when the position or orientation of the variable changes.
	 * @param x The x coordinates, in meters.
	 * @param y The y coordinates, in meters.
	 * @param zRotation The azimuth, in radians.
	 * <!-- end-model-doc -->
	 * @model xUnique="false"
	 *        xAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='m'" yUnique="false"
	 *        yAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='m'" zRotationUnique="false"
	 *        zRotationAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
	void updatePose(double x, double y, double zRotation);

} // PoseVariableAnnotation
