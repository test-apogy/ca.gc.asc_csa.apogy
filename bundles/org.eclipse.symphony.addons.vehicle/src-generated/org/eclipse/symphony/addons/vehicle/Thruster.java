/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle;

import org.eclipse.symphony.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thruster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class that represents a thruster, including its plume.
 * The thrust is directed along the +Z axis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.Thruster#getMinimumThrust <em>Minimum Thrust</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.Thruster#getMaximumThrust <em>Maximum Thrust</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.Thruster#getCurrentThrust <em>Current Thrust</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.Thruster#getThrustLevel <em>Thrust Level</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.Thruster#getPlumeAngle <em>Plume Angle</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage#getThruster()
 * @model
 * @generated
 */
public interface Thruster extends Node
{
  /**
	 * Returns the value of the '<em><b>Minimum Thrust</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum thrust, in Newtons. Must be positive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Thrust</em>' attribute.
	 * @see #setMinimumThrust(double)
	 * @see org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage#getThruster_MinimumThrust()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' csa_units='N' propertyCategory='THRUST_INFO'"
	 * @generated
	 */
	double getMinimumThrust();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.Thruster#getMinimumThrust <em>Minimum Thrust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Thrust</em>' attribute.
	 * @see #getMinimumThrust()
	 * @generated
	 */
	void setMinimumThrust(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Thrust</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum thrust, in Newtons. Must be positive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Thrust</em>' attribute.
	 * @see #setMaximumThrust(double)
	 * @see org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage#getThruster_MaximumThrust()
	 * @model default="100" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' csa_units='N' propertyCategory='THRUST_INFO'"
	 * @generated
	 */
	double getMaximumThrust();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.Thruster#getMaximumThrust <em>Maximum Thrust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Thrust</em>' attribute.
	 * @see #getMaximumThrust()
	 * @generated
	 */
	void setMaximumThrust(double value);

	/**
	 * Returns the value of the '<em><b>Current Thrust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current thrust, in Newtons. Always between minimumThrust and maximumThrust.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Thrust</em>' attribute.
	 * @see #setCurrentThrust(double)
	 * @see org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage#getThruster_CurrentThrust()
	 * @model unique="false" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' csa_units='N' propertyCategory='THRUST_INFO'"
	 * @generated
	 */
	double getCurrentThrust();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.Thruster#getCurrentThrust <em>Current Thrust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Thrust</em>' attribute.
	 * @see #getCurrentThrust()
	 * @generated
	 */
	void setCurrentThrust(double value);

		/**
	 * Returns the value of the '<em><b>Plume Angle</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plume angle, in radians
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plume Angle</em>' attribute.
	 * @see #setPlumeAngle(double)
	 * @see org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage#getThruster_PlumeAngle()
	 * @model default="0.5" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  double getPlumeAngle();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.Thruster#getPlumeAngle <em>Plume Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plume Angle</em>' attribute.
	 * @see #getPlumeAngle()
	 * @generated
	 */
  void setPlumeAngle(double value);

  /**
	 * Returns the value of the '<em><b>Thrust Level</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current thrust level. Between 0.0 and 1.0
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thrust Level</em>' attribute.
	 * @see #setThrustLevel(double)
	 * @see org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage#getThruster_ThrustLevel()
	 * @model default="0.0" unique="false" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' propertyCategory='THRUST_INFO'"
	 * @generated
	 */
  double getThrustLevel();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.Thruster#getThrustLevel <em>Thrust Level</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thrust Level</em>' attribute.
	 * @see #getThrustLevel()
	 * @generated
	 */
  void setThrustLevel(double value);

} // Thruster
