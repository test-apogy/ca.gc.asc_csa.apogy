/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Vehicle Variable Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specialization of PoseVariableAnnotation that also draws the shape of the vehicle on the map.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.VehicleVariableAnnotation#getVehicleLength <em>Vehicle Length</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.VehicleVariableAnnotation#getVehicleWidth <em>Vehicle Width</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getVehicleVariableAnnotation()
 * @model
 * @generated
 */
public interface VehicleVariableAnnotation extends PoseVariableAnnotation
{
  /**
	 * Returns the value of the '<em><b>Vehicle Length</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The length of the vehicle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Length</em>' attribute.
	 * @see #setVehicleLength(double)
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getVehicleVariableAnnotation_VehicleLength()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='VEHICLE_DIMENSIONS' csa_units='m'"
	 * @generated
	 */
  double getVehicleLength();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.VehicleVariableAnnotation#getVehicleLength <em>Vehicle Length</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Length</em>' attribute.
	 * @see #getVehicleLength()
	 * @generated
	 */
  void setVehicleLength(double value);

  /**
	 * Returns the value of the '<em><b>Vehicle Width</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The width of the vehicle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Width</em>' attribute.
	 * @see #setVehicleWidth(double)
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getVehicleVariableAnnotation_VehicleWidth()
	 * @model default="0.5" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='VEHICLE_DIMENSIONS' csa_units='m'"
	 * @generated
	 */
  double getVehicleWidth();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.VehicleVariableAnnotation#getVehicleWidth <em>Vehicle Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Width</em>' attribute.
	 * @see #getVehicleWidth()
	 * @generated
	 */
  void setVehicleWidth(double value);

} // DefaultVehicleVariableAnnotation
