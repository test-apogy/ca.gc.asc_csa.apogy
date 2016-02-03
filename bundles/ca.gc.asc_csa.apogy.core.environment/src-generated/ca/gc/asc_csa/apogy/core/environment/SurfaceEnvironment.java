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

import ca.gc.asc_csa.apogy.common.math.Tuple3d;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surface Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.SurfaceEnvironment#getAtmosphere <em>Atmosphere</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.SurfaceEnvironment#getGravity <em>Gravity</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getSurfaceEnvironment()
 * @model
 * @generated
 */
public interface SurfaceEnvironment extends Environment
{

  /**
	 * Returns the value of the '<em><b>Atmosphere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atmosphere</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Atmosphere</em>' containment reference.
	 * @see #setAtmosphere(Atmosphere)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getSurfaceEnvironment_Atmosphere()
	 * @model containment="true"
	 * @generated
	 */
  Atmosphere getAtmosphere();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.SurfaceEnvironment#getAtmosphere <em>Atmosphere</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atmosphere</em>' containment reference.
	 * @see #getAtmosphere()
	 * @generated
	 */
  void setAtmosphere(Atmosphere value);

  /**
	 * Returns the value of the '<em><b>Gravity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gravity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Gravity</em>' containment reference.
	 * @see #setGravity(Tuple3d)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getSurfaceEnvironment_Gravity()
	 * @model containment="true"
	 * @generated
	 */
  Tuple3d getGravity();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.SurfaceEnvironment#getGravity <em>Gravity</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gravity</em>' containment reference.
	 * @see #getGravity()
	 * @generated
	 */
  void setGravity(Tuple3d value);
} // SurfaceEnvironment
