/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Variable Trajectory Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Default implementation of VariableTrajectoryProvider. This implementation makes use of thresholds
 * to limits the number of position update of the trajectory to improve performance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.DefaultVariableTrajectoryProvider#getDistanceThreshold <em>Distance Threshold</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.DefaultVariableTrajectoryProvider#getAzimuthThreshold <em>Azimuth Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getDefaultVariableTrajectoryProvider()
 * @model
 * @generated
 */
public interface DefaultVariableTrajectoryProvider extends VariableTrajectoryProvider
{
  /**
	 * Returns the value of the '<em><b>Distance Threshold</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Minimum distance to keep between points added to the XYSeries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distance Threshold</em>' attribute.
	 * @see #setDistanceThreshold(double)
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getDefaultVariableTrajectoryProvider_DistanceThreshold()
	 * @model default="0.5" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='THRESHOLDS' csa_units='m'"
	 * @generated
	 */
  double getDistanceThreshold();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.DefaultVariableTrajectoryProvider#getDistanceThreshold <em>Distance Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Threshold</em>' attribute.
	 * @see #getDistanceThreshold()
	 * @generated
	 */
  void setDistanceThreshold(double value);

  /**
	 * Returns the value of the '<em><b>Azimuth Threshold</b></em>' attribute.
	 * The default value is <code>"0.017"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Minimum azimuth change that will trigger an azimuthAngle change.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Azimuth Threshold</em>' attribute.
	 * @see #setAzimuthThreshold(double)
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getDefaultVariableTrajectoryProvider_AzimuthThreshold()
	 * @model default="0.017" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='THRESHOLDS' csa_units='rad'"
	 * @generated
	 */
  double getAzimuthThreshold();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.DefaultVariableTrajectoryProvider#getAzimuthThreshold <em>Azimuth Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azimuth Threshold</em>' attribute.
	 * @see #getAzimuthThreshold()
	 * @generated
	 */
  void setAzimuthThreshold(double value);

} // DefaultVariableTrajectoryProvider