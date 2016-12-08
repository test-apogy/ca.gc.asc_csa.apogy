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
 * A representation of the model object '<em><b>Vehicle Variable Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specialization of PoseVariableAnnotation that also draws the shape of the vehicle on the map.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.VehicleVariableAnnotation#getVehicleLength <em>Vehicle Length</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.VehicleVariableAnnotation#getVehicleWidth <em>Vehicle Width</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage#getVehicleVariableAnnotation()
 * @model
 * @generated
 */
public interface VehicleVariableAnnotation extends PoseVariableAnnotation {
	/**
	 * Returns the value of the '<em><b>Vehicle Length</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The length of the vehicle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Length</em>' attribute.
	 * @see #setVehicleLength(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage#getVehicleVariableAnnotation_VehicleLength()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='VEHICLE_DIMENSIONS' apogy_units='m'"
	 * @generated
	 */
	double getVehicleLength();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.VehicleVariableAnnotation#getVehicleLength <em>Vehicle Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Length</em>' attribute.
	 * @see #getVehicleLength()
	 * @generated
	 */
	void setVehicleLength(double value);

	/**
	 * Returns the value of the '<em><b>Vehicle Width</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The width of the vehicle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Width</em>' attribute.
	 * @see #setVehicleWidth(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage#getVehicleVariableAnnotation_VehicleWidth()
	 * @model default="0.5" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='VEHICLE_DIMENSIONS' apogy_units='m'"
	 * @generated
	 */
	double getVehicleWidth();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.VehicleVariableAnnotation#getVehicleWidth <em>Vehicle Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Width</em>' attribute.
	 * @see #getVehicleWidth()
	 * @generated
	 */
	void setVehicleWidth(double value);

} // VehicleVariableAnnotation
