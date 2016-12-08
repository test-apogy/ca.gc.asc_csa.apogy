/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.core.environment.surface.ui;


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
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.DefaultVariableTrajectoryProvider#getDistanceThreshold <em>Distance Threshold</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.DefaultVariableTrajectoryProvider#getAzimuthThreshold <em>Azimuth Threshold</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage#getDefaultVariableTrajectoryProvider()
 * @model
 * @generated
 */
public interface DefaultVariableTrajectoryProvider extends VariableTrajectoryProvider {
	/**
	 * Returns the value of the '<em><b>Distance Threshold</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Minimum distance to keep between points added to the XYSeries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distance Threshold</em>' attribute.
	 * @see #setDistanceThreshold(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage#getDefaultVariableTrajectoryProvider_DistanceThreshold()
	 * @model default="0.5" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='THRESHOLDS' apogy_units='m'"
	 * @generated
	 */
	double getDistanceThreshold();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.DefaultVariableTrajectoryProvider#getDistanceThreshold <em>Distance Threshold</em>}' attribute.
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
	 *  Minimum azimuth change that will trigger an azimuthAngle change.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Azimuth Threshold</em>' attribute.
	 * @see #setAzimuthThreshold(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage#getDefaultVariableTrajectoryProvider_AzimuthThreshold()
	 * @model default="0.017" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='THRESHOLDS' apogy_units='rad'"
	 * @generated
	 */
	double getAzimuthThreshold();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.DefaultVariableTrajectoryProvider#getAzimuthThreshold <em>Azimuth Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azimuth Threshold</em>' attribute.
	 * @see #getAzimuthThreshold()
	 * @generated
	 */
	void setAzimuthThreshold(double value);

} // DefaultVariableTrajectoryProvider
