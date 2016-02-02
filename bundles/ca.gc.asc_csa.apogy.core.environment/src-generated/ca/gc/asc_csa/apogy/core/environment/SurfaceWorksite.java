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



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surface Worksite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.SurfaceWorksite#getSky <em>Sky</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.SurfaceWorksite#getMapsList <em>Maps List</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getSurfaceWorksite()
 * @model abstract="true"
 * @generated
 */
public interface SurfaceWorksite extends Worksite
{

  /**
	 * Returns the value of the '<em><b>Sky</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.environment.Sky#getSurfaceWorksite <em>Surface Worksite</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sky</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Sky</em>' containment reference.
	 * @see #setSky(Sky)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getSurfaceWorksite_Sky()
	 * @see ca.gc.asc_csa.apogy.core.environment.Sky#getSurfaceWorksite
	 * @model opposite="surfaceWorksite" containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='None'"
	 * @generated
	 */
  Sky getSky();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.SurfaceWorksite#getSky <em>Sky</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sky</em>' containment reference.
	 * @see #getSky()
	 * @generated
	 */
  void setSky(Sky value);

  /**
	 * Returns the value of the '<em><b>Maps List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maps List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps List</em>' containment reference.
	 * @see #setMapsList(MapsList)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getSurfaceWorksite_MapsList()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='None'"
	 * @generated
	 */
  MapsList getMapsList();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.SurfaceWorksite#getMapsList <em>Maps List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maps List</em>' containment reference.
	 * @see #getMapsList()
	 * @generated
	 */
  void setMapsList(MapsList value);
} // SurfaceWorksite
