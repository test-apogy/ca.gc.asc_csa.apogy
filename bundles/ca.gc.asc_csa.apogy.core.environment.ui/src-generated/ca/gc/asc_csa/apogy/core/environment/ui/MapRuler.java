package ca.gc.asc_csa.apogy.core.environment.ui;
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

import javax.vecmath.Color3f;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Ruler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Tool that shows the distance between two point on the map. The use needs to
 * selects two positions on the map by clicking using the left button on the mouse.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.MapRuler#getRulerColor <em>Ruler Color</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getMapRuler()
 * @model
 * @generated
 */
public interface MapRuler extends MapTool
{

  /**
	 * Returns the value of the '<em><b>Ruler Color</b></em>' attribute.
	 * The default value is <code>"0.0,1.0,0.0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The color of the ruler.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruler Color</em>' attribute.
	 * @see #setRulerColor(Color3f)
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getMapRuler_RulerColor()
	 * @model default="0.0,1.0,0.0" unique="false" dataType="ca.gc.asc_csa.apogy.core.environment.ui.Color3f"
	 * @generated
	 */
  Color3f getRulerColor();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ui.MapRuler#getRulerColor <em>Ruler Color</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruler Color</em>' attribute.
	 * @see #getRulerColor()
	 * @generated
	 */
  void setRulerColor(Color3f value);
} // MapRuler
