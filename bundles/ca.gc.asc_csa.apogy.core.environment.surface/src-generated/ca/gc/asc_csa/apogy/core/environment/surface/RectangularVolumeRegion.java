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
package ca.gc.asc_csa.apogy.core.environment.surface;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangular Volume Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a 3D rectangular volume.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularVolumeRegion#getZMin <em>ZMin</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularVolumeRegion#getZMax <em>ZMax</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularVolumeRegion#getZDimension <em>ZDimension</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getRectangularVolumeRegion()
 * @model
 * @generated
 */
public interface RectangularVolumeRegion extends RectangularRegion {
	/**
	 * Returns the value of the '<em><b>ZMin</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum Z coordinate on the Z axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZMin</em>' attribute.
	 * @see #setZMin(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getRectangularVolumeRegion_ZMin()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='EXTENT_COORDINATES' apogy_units='m'"
	 * @generated
	 */
	double getZMin();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularVolumeRegion#getZMin <em>ZMin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZMin</em>' attribute.
	 * @see #getZMin()
	 * @generated
	 */
	void setZMin(double value);

	/**
	 * Returns the value of the '<em><b>ZMax</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum Z coordinate on the Z axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZMax</em>' attribute.
	 * @see #setZMax(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getRectangularVolumeRegion_ZMax()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='EXTENT_COORDINATES' apogy_units='m'"
	 * @generated
	 */
	double getZMax();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularVolumeRegion#getZMax <em>ZMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZMax</em>' attribute.
	 * @see #getZMax()
	 * @generated
	 */
	void setZMax(double value);

	/**
	 * Returns the value of the '<em><b>ZDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dimension along the Z axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZDimension</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getRectangularVolumeRegion_ZDimension()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='EXTENT_SIZES' apogy_units='m'"
	 * @generated
	 */
	double getZDimension();

} // RectangularVolumeRegion
