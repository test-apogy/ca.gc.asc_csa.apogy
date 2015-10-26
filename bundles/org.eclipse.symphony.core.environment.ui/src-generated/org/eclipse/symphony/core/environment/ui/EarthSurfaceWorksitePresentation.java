/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui;

import org.eclipse.symphony.common.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth Surface Worksite Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#isAxisVisible <em>Axis Visible</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#getAxisLength <em>Axis Length</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#isAzimuthVisible <em>Azimuth Visible</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#isElevationLinesVisible <em>Elevation Lines Visible</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#isAzimuthLinesVisible <em>Azimuth Lines Visible</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#isPlaneVisible <em>Plane Visible</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#getPlaneGridSize <em>Plane Grid Size</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#getPlaneSize <em>Plane Size</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getEarthSurfaceWorksitePresentation()
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
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getEarthSurfaceWorksitePresentation_AxisVisible()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='AXIS'"
	 * @generated
	 */
  boolean isAxisVisible();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#isAxisVisible <em>Axis Visible</em>}' attribute.
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
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getEarthSurfaceWorksitePresentation_AxisLength()
	 * @model default="10.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='AXIS' csa_units='m'"
	 * @generated
	 */
  double getAxisLength();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#getAxisLength <em>Axis Length</em>}' attribute.
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
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getEarthSurfaceWorksitePresentation_AzimuthVisible()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='SKY'"
	 * @generated
	 */
  boolean isAzimuthVisible();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#isAzimuthVisible <em>Azimuth Visible</em>}' attribute.
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
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getEarthSurfaceWorksitePresentation_ElevationLinesVisible()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='SKY'"
	 * @generated
	 */
  boolean isElevationLinesVisible();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#isElevationLinesVisible <em>Elevation Lines Visible</em>}' attribute.
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
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getEarthSurfaceWorksitePresentation_AzimuthLinesVisible()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='SKY'"
	 * @generated
	 */
  boolean isAzimuthLinesVisible();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#isAzimuthLinesVisible <em>Azimuth Lines Visible</em>}' attribute.
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
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getEarthSurfaceWorksitePresentation_PlaneVisible()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='PLANE'"
	 * @generated
	 */
  boolean isPlaneVisible();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#isPlaneVisible <em>Plane Visible</em>}' attribute.
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
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getEarthSurfaceWorksitePresentation_PlaneGridSize()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='PLANE' csa_units='m'"
	 * @generated
	 */
  double getPlaneGridSize();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#getPlaneGridSize <em>Plane Grid Size</em>}' attribute.
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
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getEarthSurfaceWorksitePresentation_PlaneSize()
	 * @model default="10.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='PLANE' csa_units='m'"
	 * @generated
	 */
  double getPlaneSize();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#getPlaneSize <em>Plane Size</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plane Size</em>' attribute.
	 * @see #getPlaneSize()
	 * @generated
	 */
  void setPlaneSize(double value);

} // EarthSurfaceWorksitePresentation
