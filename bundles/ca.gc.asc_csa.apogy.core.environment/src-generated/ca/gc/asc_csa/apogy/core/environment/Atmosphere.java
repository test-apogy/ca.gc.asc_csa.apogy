package ca.gc.asc_csa.apogy.core.environment;
/*
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atmosphere</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.Atmosphere#getWindSpeed <em>Wind Speed</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.Atmosphere#getWindDirection <em>Wind Direction</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.Atmosphere#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.Atmosphere#getSurfacePressure <em>Surface Pressure</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.Atmosphere#getSurfaceDensity <em>Surface Density</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getAtmosphere()
 * @model
 * @generated
 */
public interface Atmosphere extends EObject
{

  /**
	 * Returns the value of the '<em><b>Wind Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The wind surface speed, in m/s.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wind Speed</em>' attribute.
	 * @see #setWindSpeed(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getAtmosphere_WindSpeed()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='m/s'"
	 * @generated
	 */
  double getWindSpeed();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.Atmosphere#getWindSpeed <em>Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind Speed</em>' attribute.
	 * @see #getWindSpeed()
	 * @generated
	 */
  void setWindSpeed(double value);

  /**
	 * Returns the value of the '<em><b>Wind Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The wind direction expressed relative to true north, in radians.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wind Direction</em>' attribute.
	 * @see #setWindDirection(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getAtmosphere_WindDirection()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
  double getWindDirection();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.Atmosphere#getWindDirection <em>Wind Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind Direction</em>' attribute.
	 * @see #getWindDirection()
	 * @generated
	 */
  void setWindDirection(double value);

  /**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The atmosphere temperature, in degrees Celcius.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getAtmosphere_Temperature()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='deg'"
	 * @generated
	 */
  double getTemperature();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.Atmosphere#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
  void setTemperature(double value);

  /**
	 * Returns the value of the '<em><b>Surface Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The atmosphere pressure at the reference altitude, in Pascals.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surface Pressure</em>' attribute.
	 * @see #setSurfacePressure(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getAtmosphere_SurfacePressure()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='Pa'"
	 * @generated
	 */
  double getSurfacePressure();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.Atmosphere#getSurfacePressure <em>Surface Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface Pressure</em>' attribute.
	 * @see #getSurfacePressure()
	 * @generated
	 */
  void setSurfacePressure(double value);

  /**
	 * Returns the value of the '<em><b>Surface Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The atmosphere density at the reference altitude, in kg/m^3.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surface Density</em>' attribute.
	 * @see #setSurfaceDensity(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getAtmosphere_SurfaceDensity()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='kg/m\263'"
	 * @generated
	 */
  double getSurfaceDensity();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.Atmosphere#getSurfaceDensity <em>Surface Density</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface Density</em>' attribute.
	 * @see #getSurfaceDensity()
	 * @generated
	 */
  void setSurfaceDensity(double value);
} // Atmosphere
