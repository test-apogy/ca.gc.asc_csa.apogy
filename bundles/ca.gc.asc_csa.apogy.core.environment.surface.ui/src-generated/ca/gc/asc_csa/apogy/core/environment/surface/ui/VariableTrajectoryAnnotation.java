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
 * A representation of the model object '<em><b>Variable Trajectory Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AbstractVariableAnnotation that draws the trajectory of a variable on a map.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.VariableTrajectoryAnnotation#getTrajectoryProvider <em>Trajectory Provider</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage#getVariableTrajectoryAnnotation()
 * @model
 * @generated
 */
public interface VariableTrajectoryAnnotation extends AbstractVariableAnnotation, TrajectoryProvider {
	/**
	 * Returns the value of the '<em><b>Trajectory Provider</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.VariableTrajectoryProvider#getVariableAnnotation <em>Variable Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The trajectory provider.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trajectory Provider</em>' containment reference.
	 * @see #setTrajectoryProvider(VariableTrajectoryProvider)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage#getVariableTrajectoryAnnotation_TrajectoryProvider()
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.VariableTrajectoryProvider#getVariableAnnotation
	 * @model opposite="variableAnnotation" containment="true" required="true"
	 * @generated
	 */
	VariableTrajectoryProvider getTrajectoryProvider();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.VariableTrajectoryAnnotation#getTrajectoryProvider <em>Trajectory Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trajectory Provider</em>' containment reference.
	 * @see #getTrajectoryProvider()
	 * @generated
	 */
	void setTrajectoryProvider(VariableTrajectoryProvider value);

} // VariableTrajectoryAnnotation
