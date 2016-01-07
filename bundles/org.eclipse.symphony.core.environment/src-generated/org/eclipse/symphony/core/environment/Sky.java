/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

import org.eclipse.symphony.common.emf.Timed;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sky</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The base class defining a the Sky above a SurfaceWorksite. This basic sky includes the sun and
 * stars. The Sky is Timed, which in this context means that the position of both the Sun and the
 * stars should be updated when the time is changed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.Sky#getSurfaceWorksite <em>Surface Worksite</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Sky#getSkyNode <em>Sky Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Sky#getSun <em>Sun</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Sky#getSunHorizontalCoordinates <em>Sun Horizontal Coordinates</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Sky#getStarField <em>Star Field</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getSky()
 * @model
 * @generated
 */
public interface Sky extends Timed
{

  /**
	 * Returns the value of the '<em><b>Surface Worksite</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.environment.SurfaceWorksite#getSky <em>Sky</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Surface Worksite</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The worksite to which the sky is associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surface Worksite</em>' container reference.
	 * @see #setSurfaceWorksite(SurfaceWorksite)
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getSky_SurfaceWorksite()
	 * @see org.eclipse.symphony.core.environment.SurfaceWorksite#getSky
	 * @model opposite="sky" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  SurfaceWorksite getSurfaceWorksite();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.Sky#getSurfaceWorksite <em>Surface Worksite</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface Worksite</em>' container reference.
	 * @see #getSurfaceWorksite()
	 * @generated
	 */
  void setSurfaceWorksite(SurfaceWorksite value);

  /**
	 * Returns the value of the '<em><b>Sky Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sky Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Sky Node</em>' reference.
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getSky_SkyNode()
	 * @model required="true" transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='None'"
	 * @generated
	 */
  SkyNode getSkyNode();

  /**
	 * Returns the value of the '<em><b>Sun</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sun</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Sun in the sky.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sun</em>' reference.
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getSky_Sun()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='SUN'"
	 * @generated
	 */
  Sun getSun();

  /**
	 * Returns the value of the '<em><b>Sun Horizontal Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sun Horizontal Coordinates</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current HorizontalCordinates of the Sun.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sun Horizontal Coordinates</em>' reference.
	 * @see #setSunHorizontalCoordinates(HorizontalCoordinates)
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getSky_SunHorizontalCoordinates()
	 * @model transient="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='SUN'"
	 * @generated
	 */
  HorizontalCoordinates getSunHorizontalCoordinates();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.Sky#getSunHorizontalCoordinates <em>Sun Horizontal Coordinates</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sun Horizontal Coordinates</em>' reference.
	 * @see #getSunHorizontalCoordinates()
	 * @generated
	 */
  void setSunHorizontalCoordinates(HorizontalCoordinates value);

  /**
	 * Returns the value of the '<em><b>Star Field</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Star Field</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The stars in the sky.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Star Field</em>' reference.
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getSky_StarField()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='STARS'"
	 * @generated
	 */
  StarField getStarField();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the Sun angular diameter, in radians.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='SUN' symphony_units='rad'"
	 * @generated
	 */
  double getSunAngularDiameter();
} // Sky
