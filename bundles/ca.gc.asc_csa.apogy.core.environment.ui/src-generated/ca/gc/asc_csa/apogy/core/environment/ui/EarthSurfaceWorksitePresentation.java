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

import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth Surface Worksite Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.EarthSurfaceWorksitePresentation#isAxisVisible <em>Axis Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.EarthSurfaceWorksitePresentation#getAxisLength <em>Axis Length</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.EarthSurfaceWorksitePresentation#isAzimuthVisible <em>Azimuth Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.EarthSurfaceWorksitePresentation#isElevationLinesVisible <em>Elevation Lines Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.EarthSurfaceWorksitePresentation#isAzimuthLinesVisible <em>Azimuth Lines Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.EarthSurfaceWorksitePresentation#isPlaneVisible <em>Plane Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.EarthSurfaceWorksitePresentation#getPlaneGridSize <em>Plane Grid Size</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.EarthSurfaceWorksitePresentation#getPlaneSize <em>Plane Size</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getEarthSurfaceWorksitePresentation()
 * @model
 * @generated
 */
public interface EarthSurfaceWorksitePresentation extends NodePresentation
{
  /**
	 * Returns the value of the '<em><b>Axis Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Axis Visible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Visible</em>' attribute.
	 * @see #setAxisVisible(boolean)
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getEarthSurfaceWorksitePresentation_AxisVisible()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='AXIS'"
	 * @generated
	 */
  boolean isAxisVisible();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ui.EarthSurfaceWorksitePresentation#isAxisVisible <em>Axis Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Visible</em>' attribute.
	 * @see #isAxisVisible()
	 * @generated
	 */
  void setAxisVisible(boolean value);

  /**
	 * Returns the value of the '<em><b>Axis Length</b></em>' attribute.
	 * The default value is <code>"10.0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Axis Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Length</em>' attribute.
	 * @see #setAxisLength(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getEarthSurfaceWorksitePresentation_AxisLength()
	 * @model default="10.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='AXIS' apogy_units='m'"
	 * @generated
	 */
  double getAxisLength();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ui.EarthSurfaceWorksitePresentation#getAxisLength <em>Axis Length</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Length</em>' attribute.
	 * @see #getAxisLength()
	 * @generated
	 */
  void setAxisLength(double value);

  /**
	 * Returns the value of the '<em><b>Azimuth Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Azimuth Visible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Azimuth Visible</em>' attribute.
	 * @see #setAzimuthVisible(boolean)
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getEarthSurfaceWorksitePresentation_AzimuthVisible()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='SKY'"
	 * @generated
	 */
  boolean isAzimuthVisible();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ui.EarthSurfaceWorksitePresentation#isAzimuthVisible <em>Azimuth Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azimuth Visible</em>' attribute.
	 * @see #isAzimuthVisible()
	 * @generated
	 */
  void setAzimuthVisible(boolean value);

  /**
	 * Returns the value of the '<em><b>Elevation Lines Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elevation Lines Visible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation Lines Visible</em>' attribute.
	 * @see #setElevationLinesVisible(boolean)
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getEarthSurfaceWorksitePresentation_ElevationLinesVisible()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='SKY'"
	 * @generated
	 */
  boolean isElevationLinesVisible();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ui.EarthSurfaceWorksitePresentation#isElevationLinesVisible <em>Elevation Lines Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation Lines Visible</em>' attribute.
	 * @see #isElevationLinesVisible()
	 * @generated
	 */
  void setElevationLinesVisible(boolean value);

  /**
	 * Returns the value of the '<em><b>Azimuth Lines Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Azimuth Lines Visible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Azimuth Lines Visible</em>' attribute.
	 * @see #setAzimuthLinesVisible(boolean)
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getEarthSurfaceWorksitePresentation_AzimuthLinesVisible()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='SKY'"
	 * @generated
	 */
  boolean isAzimuthLinesVisible();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ui.EarthSurfaceWorksitePresentation#isAzimuthLinesVisible <em>Azimuth Lines Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azimuth Lines Visible</em>' attribute.
	 * @see #isAzimuthLinesVisible()
	 * @generated
	 */
  void setAzimuthLinesVisible(boolean value);

  /**
	 * Returns the value of the '<em><b>Plane Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plane Visible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Plane Visible</em>' attribute.
	 * @see #setPlaneVisible(boolean)
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getEarthSurfaceWorksitePresentation_PlaneVisible()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='PLANE'"
	 * @generated
	 */
  boolean isPlaneVisible();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ui.EarthSurfaceWorksitePresentation#isPlaneVisible <em>Plane Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plane Visible</em>' attribute.
	 * @see #isPlaneVisible()
	 * @generated
	 */
  void setPlaneVisible(boolean value);

  /**
	 * Returns the value of the '<em><b>Plane Grid Size</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plane Grid Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Plane Grid Size</em>' attribute.
	 * @see #setPlaneGridSize(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getEarthSurfaceWorksitePresentation_PlaneGridSize()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='PLANE' apogy_units='m'"
	 * @generated
	 */
  double getPlaneGridSize();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ui.EarthSurfaceWorksitePresentation#getPlaneGridSize <em>Plane Grid Size</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plane Grid Size</em>' attribute.
	 * @see #getPlaneGridSize()
	 * @generated
	 */
  void setPlaneGridSize(double value);

  /**
	 * Returns the value of the '<em><b>Plane Size</b></em>' attribute.
	 * The default value is <code>"10.0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plane Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Plane Size</em>' attribute.
	 * @see #setPlaneSize(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getEarthSurfaceWorksitePresentation_PlaneSize()
	 * @model default="10.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='PLANE' apogy_units='m'"
	 * @generated
	 */
  double getPlaneSize();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ui.EarthSurfaceWorksitePresentation#getPlaneSize <em>Plane Size</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plane Size</em>' attribute.
	 * @see #getPlaneSize()
	 * @generated
	 */
  void setPlaneSize(double value);

} // EarthSurfaceWorksitePresentation
