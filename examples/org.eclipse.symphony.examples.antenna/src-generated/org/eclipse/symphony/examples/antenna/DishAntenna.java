/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.antenna;

import org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dish Antenna</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an abstract dish-based variety of antenna,
 * which has a particular conical field of view (FOV).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.antenna.DishAntenna#getFov <em>Fov</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.examples.antenna.EMFEcoreExampleAntennaPackage#getDishAntenna()
 * @model abstract="true"
 * @generated
 */
public interface DishAntenna extends Antenna
{
  /**
	 * Returns the value of the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fov</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the (conical) field of view that all dish-based antennas possess
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fov</em>' containment reference.
	 * @see #setFov(ConicalFieldOfView)
	 * @see org.eclipse.symphony.examples.antenna.EMFEcoreExampleAntennaPackage#getDishAntenna_Fov()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='Readonly' propertyCategory='Field Of View'"
	 * @generated
	 */
  ConicalFieldOfView getFov();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.antenna.DishAntenna#getFov <em>Fov</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fov</em>' containment reference.
	 * @see #getFov()
	 * @generated
	 */
  void setFov(ConicalFieldOfView value);

} // DishAntenna
