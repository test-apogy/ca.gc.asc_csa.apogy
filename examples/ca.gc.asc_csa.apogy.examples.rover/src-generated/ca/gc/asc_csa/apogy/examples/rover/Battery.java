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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Battery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.Battery#isActive <em>Active</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.Battery#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.Battery#getCurrent <em>Current</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage#getBattery()
 * @model
 * @generated
 */
public interface Battery extends EObject {
	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is whether or not the battery is active
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage#getBattery_Active()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' property='Readonly'"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.rover.Battery#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Voltage</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the voltage output by the battery,
	 * as measured in volts; initially, zero
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Voltage</em>' attribute.
	 * @see #setVoltage(double)
	 * @see ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage#getBattery_Voltage()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' apogy_units='V' property='Readonly'"
	 * @generated
	 */
	double getVoltage();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.rover.Battery#getVoltage <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage</em>' attribute.
	 * @see #getVoltage()
	 * @generated
	 */
	void setVoltage(double value);

	/**
	 * Returns the value of the '<em><b>Current</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the current output by the battery,
	 * as measured in amps; initially, zero
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current</em>' attribute.
	 * @see #setCurrent(double)
	 * @see ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage#getBattery_Current()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' apogy_units='A' property='Readonly'"
	 * @generated
	 */
	double getCurrent();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.rover.Battery#getCurrent <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' attribute.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is used to activate this battery, changing
	 * the voltage and current that it outputs from zero.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void activate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is used to deactivate this battery, changing
	 * the voltage and current that it outputs to zero.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void deactivate();

} // Battery
