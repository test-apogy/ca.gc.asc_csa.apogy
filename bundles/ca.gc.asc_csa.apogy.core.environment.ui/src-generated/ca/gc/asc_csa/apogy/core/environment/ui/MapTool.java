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

import org.jfree.chart.JFreeChart;
import org.jfree.experimental.chart.swt.ChartComposite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class of all map tools.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.MapTool#isActive <em>Active</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getMapTool()
 * @model abstract="true"
 * @generated
 */
public interface MapTool extends MapAnnotation
{
  /**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the tool is active.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getMapTool_Active()
	 * @model default="true" unique="false"
	 * @generated
	 */
  boolean isActive();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ui.MapTool#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
  void setActive(boolean value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that is called to give access to the underlying ChartComposite and JFreeChart used to display the map.
	 * @param parentComposite The ChartComposite used to display the map.
	 * @param chart The JFreeChart used to display the map.
	 * <!-- end-model-doc -->
	 * @model compositeDataType="ca.gc.asc_csa.apogy.core.environment.ui.ChartComposite" compositeUnique="false" chartDataType="ca.gc.asc_csa.apogy.core.environment.ui.JFreeChart" chartUnique="false"
	 * @generated
	 */
  void initialize(ChartComposite composite, JFreeChart chart);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that is called to dispose of the tool.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
  void dispose();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method called when the user clicks on the map with the mouse.
	 * @param mouseButton The mouse button clicked
	 * @param x The absolute position x coordinates of the point selected.
	 * @param y The absolute position y coordinates of the point selected.
	 * <!-- end-model-doc -->
	 * @model mouseButtonUnique="false" xUnique="false" yUnique="false"
	 * @generated
	 */
  void positionSelected(int mouseButton, double x, double y);

} // MapTool
