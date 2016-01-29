/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth Sky</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A specialization of the Sky for Earth use that adds the Moon. The position of the Moon is
 * updated, along with the Sun and stars, when the time is changed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.EarthSky#getMoon <em>Moon</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.EarthSky#getMoonHorizontalCoordinates <em>Moon Horizontal Coordinates</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getEarthSky()
 * @model
 * @generated
 */
public interface EarthSky extends Sky
{

  /**
	 * Returns the value of the '<em><b>Moon</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Moon</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Moon in the sky.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Moon</em>' reference.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getEarthSky_Moon()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='MOON'"
	 * @generated
	 */
  Moon getMoon();

  /**
	 * Returns the value of the '<em><b>Moon Horizontal Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current HorizontalCordinates of the Moon.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Moon Horizontal Coordinates</em>' reference.
	 * @see #setMoonHorizontalCoordinates(HorizontalCoordinates)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getEarthSky_MoonHorizontalCoordinates()
	 * @model transient="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='MOON'"
	 * @generated
	 */
  HorizontalCoordinates getMoonHorizontalCoordinates();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.EarthSky#getMoonHorizontalCoordinates <em>Moon Horizontal Coordinates</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moon Horizontal Coordinates</em>' reference.
	 * @see #getMoonHorizontalCoordinates()
	 * @generated
	 */
  void setMoonHorizontalCoordinates(HorizontalCoordinates value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the Moon angular diameter, in radians.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='MOON' apogy_units='rad'"
	 * @generated
	 */
  double getMoonAngularDiameter();
} // EarthSky
