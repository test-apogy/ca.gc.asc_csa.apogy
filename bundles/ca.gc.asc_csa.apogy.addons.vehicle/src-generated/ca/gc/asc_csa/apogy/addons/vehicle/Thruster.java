package ca.gc.asc_csa.apogy.addons.vehicle;
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

import ca.gc.asc_csa.apogy.common.topology.Node;

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
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.Thruster#getMinimumThrust <em>Minimum Thrust</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.Thruster#getMaximumThrust <em>Maximum Thrust</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.Thruster#getCurrentThrust <em>Current Thrust</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.Thruster#getThrustLevel <em>Thrust Level</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.Thruster#getPlumeAngle <em>Plume Angle</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getThruster()
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
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getThruster_MinimumThrust()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' apogy_units='N' propertyCategory='THRUST_INFO'"
	 * @generated
	 */
	double getMinimumThrust();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.Thruster#getMinimumThrust <em>Minimum Thrust</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getThruster_MaximumThrust()
	 * @model default="100" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' apogy_units='N' propertyCategory='THRUST_INFO'"
	 * @generated
	 */
	double getMaximumThrust();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.Thruster#getMaximumThrust <em>Maximum Thrust</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getThruster_CurrentThrust()
	 * @model unique="false" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' apogy_units='N' propertyCategory='THRUST_INFO'"
	 * @generated
	 */
	double getCurrentThrust();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.Thruster#getCurrentThrust <em>Current Thrust</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getThruster_PlumeAngle()
	 * @model default="0.5" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
  double getPlumeAngle();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.Thruster#getPlumeAngle <em>Plume Angle</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getThruster_ThrustLevel()
	 * @model default="0.0" unique="false" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' propertyCategory='THRUST_INFO'"
	 * @generated
	 */
  double getThrustLevel();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.Thruster#getThrustLevel <em>Thrust Level</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thrust Level</em>' attribute.
	 * @see #getThrustLevel()
	 * @generated
	 */
  void setThrustLevel(double value);

} // Thruster
