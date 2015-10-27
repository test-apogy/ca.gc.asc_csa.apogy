/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.antenna;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PTU Dish Antenna</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an abstract dish-based antenna,
 * which is mounted upon a pan-tilt unit (PTU).  Naturally,
 * the pan and tilt angles are kept track of and can be changed
 * accordingly.  In addition, there is an option for the
 * antenna to track the position of the sun in the sky.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.antenna.PTUDishAntenna#getPanAngle <em>Pan Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.antenna.PTUDishAntenna#getTiltAngle <em>Tilt Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.antenna.PTUDishAntenna#isTrackingSun <em>Tracking Sun</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.examples.antenna.Symphony__ExamplesAntennaPackage#getPTUDishAntenna()
 * @model abstract="true"
 * @generated
 */
public interface PTUDishAntenna extends DishAntenna
{
  /**
	 * Returns the value of the '<em><b>Pan Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the current pan angle (given in radians) of the
	 * PTU, that the antenna is attached to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pan Angle</em>' attribute.
	 * @see #setPanAngle(double)
	 * @see org.eclipse.symphony.examples.antenna.Symphony__ExamplesAntennaPackage#getPTUDishAntenna_PanAngle()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' csa_units='rad' property='Readonly' propertyCategory='PTU Angles'"
	 * @generated
	 */
  double getPanAngle();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.antenna.PTUDishAntenna#getPanAngle <em>Pan Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pan Angle</em>' attribute.
	 * @see #getPanAngle()
	 * @generated
	 */
  void setPanAngle(double value);

  /**
	 * Returns the value of the '<em><b>Tilt Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the current tilt angle (given in radians) of the PTU
	 * that the antenna is attached to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tilt Angle</em>' attribute.
	 * @see #setTiltAngle(double)
	 * @see org.eclipse.symphony.examples.antenna.Symphony__ExamplesAntennaPackage#getPTUDishAntenna_TiltAngle()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' csa_units='rad' property='Readonly' propertyCategory='PTU Angles'"
	 * @generated
	 */
  double getTiltAngle();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.antenna.PTUDishAntenna#getTiltAngle <em>Tilt Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tilt Angle</em>' attribute.
	 * @see #getTiltAngle()
	 * @generated
	 */
  void setTiltAngle(double value);

  /**
	 * Returns the value of the '<em><b>Tracking Sun</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is whether or not the PTU antenna should be tracking
	 * the sun.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tracking Sun</em>' attribute.
	 * @see #setTrackingSun(boolean)
	 * @see org.eclipse.symphony.examples.antenna.Symphony__ExamplesAntennaPackage#getPTUDishAntenna_TrackingSun()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Tracking'"
	 * @generated
	 */
	boolean isTrackingSun();

		/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.antenna.PTUDishAntenna#isTrackingSun <em>Tracking Sun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracking Sun</em>' attribute.
	 * @see #isTrackingSun()
	 * @generated
	 */
	void setTrackingSun(boolean value);

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Command the PTU (and implicitly the antenna) to move to the
	 * specified pan and tilt angles.
	 * 
	 * @param panAngle The target pan angle for the PTU (given in radians.)
	 * @param tiltAngle The target tilt angle for the PTU (given in radians.)
	 * <!-- end-model-doc -->
	 * @model panAngleUnique="false"
	 *        panAngleAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'" tiltAngleUnique="false"
	 *        tiltAngleAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  void moveTo(double panAngle, double tiltAngle);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is used to toggle whether the PTU (and implicitly the
	 * antenna mounted on it) should be following the sun.  If
	 * true, then the antenna will continue tracking the sun until
	 * it is told otherwise.
	 * 	 * @param track Whether or not the PTU antenna should be following the sun.
	 * <!-- end-model-doc -->
	 * @model trackUnique="false"
	 * @generated
	 */
	void trackSun(boolean track);

} // PTUDishAntenna
