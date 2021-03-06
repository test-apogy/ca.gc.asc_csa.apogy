package ca.gc.asc_csa.apogy.examples.rover;
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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the rover's internal power system, which is
 * used to return the
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.PowerSystem#getBatteries <em>Batteries</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.PowerSystem#getActiveBattery <em>Active Battery</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.PowerSystem#getCurrentVoltage <em>Current Voltage</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.PowerSystem#getCurrentCurrent <em>Current Current</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage#getPowerSystem()
 * @model
 * @generated
 */
public interface PowerSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Batteries</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.examples.rover.Battery}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the array of batteries comprising the
	 * power system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Batteries</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage#getPowerSystem_Batteries()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' createChild='false'"
	 * @generated
	 */
	EList<Battery> getBatteries();

	/**
	 * Returns the value of the '<em><b>Active Battery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the currently active battery
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Battery</em>' reference.
	 * @see #setActiveBattery(Battery)
	 * @see ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage#getPowerSystem_ActiveBattery()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
	Battery getActiveBattery();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.rover.PowerSystem#getActiveBattery <em>Active Battery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Battery</em>' reference.
	 * @see #getActiveBattery()
	 * @generated
	 */
	void setActiveBattery(Battery value);

	/**
	 * Returns the value of the '<em><b>Current Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is used to get the voltage that the power system
	 * is currently outputting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Voltage</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage#getPowerSystem_CurrentVoltage()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' apogy_units='V' get='<%ca.gc.asc_csa.apogy.examples.rover.Battery%> _activeBattery = this.getActiveBattery();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_activeBattery, null));\nif (_notEquals)\n{\n\t<%ca.gc.asc_csa.apogy.examples.rover.Battery%> _activeBattery_1 = this.getActiveBattery();\n\treturn _activeBattery_1.getVoltage();\n}\nelse\n{\n\treturn 0.0;\n}'"
	 * @generated
	 */
	double getCurrentVoltage();

	/**
	 * Returns the value of the '<em><b>Current Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is used to get the current that the power system
	 * is currently outputting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Current</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage#getPowerSystem_CurrentCurrent()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' apogy_units='A' get='<%ca.gc.asc_csa.apogy.examples.rover.Battery%> _activeBattery = this.getActiveBattery();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_activeBattery, null));\nif (_notEquals)\n{\n\t<%ca.gc.asc_csa.apogy.examples.rover.Battery%> _activeBattery_1 = this.getActiveBattery();\n\treturn _activeBattery_1.getCurrent();\n}\nelse\n{\n\treturn 0.0;\n}'"
	 * @generated
	 */
	double getCurrentCurrent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is used to change the active battery to
	 * the battery located at the given index in the
	 * list (or array) of batteries.
	 * @param batteryIndex The index of the battery to change to
	 * <!-- end-model-doc -->
	 * @model batteryIndexUnique="false"
	 * @generated
	 */
	void changeActiveBatteryTo(int batteryIndex);

} // PowerSystem
