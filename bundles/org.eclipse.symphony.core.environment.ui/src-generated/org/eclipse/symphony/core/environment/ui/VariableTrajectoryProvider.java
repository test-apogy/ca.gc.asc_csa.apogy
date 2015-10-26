/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui;

import org.eclipse.symphony.core.PoseProvider;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Trajectory Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for TrajectoryProvider that are providing trajectory based on a VariableTrajectoryAnnotation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.VariableTrajectoryProvider#getVariableAnnotation <em>Variable Annotation</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.VariableTrajectoryProvider#getPoseProvider <em>Pose Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getVariableTrajectoryProvider()
 * @model abstract="true"
 * @generated
 */
public interface VariableTrajectoryProvider extends TrajectoryProvider
{
  /**
	 * Returns the value of the '<em><b>Variable Annotation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.environment.ui.VariableTrajectoryAnnotation#getTrajectoryProvider <em>Trajectory Provider</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Annotation</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Annotation</em>' container reference.
	 * @see #setVariableAnnotation(VariableTrajectoryAnnotation)
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getVariableTrajectoryProvider_VariableAnnotation()
	 * @see org.eclipse.symphony.core.environment.ui.VariableTrajectoryAnnotation#getTrajectoryProvider
	 * @model opposite="trajectoryProvider" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  VariableTrajectoryAnnotation getVariableAnnotation();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.VariableTrajectoryProvider#getVariableAnnotation <em>Variable Annotation</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Annotation</em>' container reference.
	 * @see #getVariableAnnotation()
	 * @generated
	 */
  void setVariableAnnotation(VariableTrajectoryAnnotation value);

  /**
	 * Returns the value of the '<em><b>Pose Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The Symphony System being displayed. This is automatically updated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pose Provider</em>' reference.
	 * @see #setPoseProvider(PoseProvider)
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getVariableTrajectoryProvider_PoseProvider()
	 * @model required="true" transient="true"
	 * @generated
	 */
  PoseProvider getPoseProvider();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.VariableTrajectoryProvider#getPoseProvider <em>Pose Provider</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pose Provider</em>' reference.
	 * @see #getPoseProvider()
	 * @generated
	 */
  void setPoseProvider(PoseProvider value);

} // VariableTrajectoryProvider
