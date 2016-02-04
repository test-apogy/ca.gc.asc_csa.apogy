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
 * A representation of the model object '<em><b>URL Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ImageMapLayer that refers to an image at a URL
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.URLImageMapLayer#getLegendURL <em>Legend URL</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getURLImageMapLayer()
 * @model
 * @generated
 */
public interface URLImageMapLayer extends ImageMapLayer, URLMapLayer
{

  /**
	 * Returns the value of the '<em><b>Legend URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL to the Image Map Layer legend.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legend URL</em>' attribute.
	 * @see #setLegendURL(String)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getURLImageMapLayer_LegendURL()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='URL'"
	 * @generated
	 */
  String getLegendURL();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.URLImageMapLayer#getLegendURL <em>Legend URL</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend URL</em>' attribute.
	 * @see #getLegendURL()
	 * @generated
	 */
  void setLegendURL(String value);
} // URLImageMapLayer
