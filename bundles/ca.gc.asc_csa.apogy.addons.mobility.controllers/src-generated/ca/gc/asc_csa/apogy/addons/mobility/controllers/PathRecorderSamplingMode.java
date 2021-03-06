package ca.gc.asc_csa.apogy.addons.mobility.controllers;
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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Path Recorder Sampling Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.ApogyAddonsMobilityControllersPackage#getPathRecorderSamplingMode()
 * @model
 * @generated
 */
public enum PathRecorderSamplingMode implements Enumerator {
	/**
	 * The '<em><b>ON DISTANCE DELTA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_DISTANCE_DELTA_VALUE
	 * @generated
	 * @ordered
	 */
	ON_DISTANCE_DELTA(0, "ON_DISTANCE_DELTA", "ON_DISTANCE_DELTA"),

	/**
	 * The '<em><b>ON TIME DELTA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_TIME_DELTA_VALUE
	 * @generated
	 * @ordered
	 */
	ON_TIME_DELTA(1, "ON_TIME_DELTA", "ON_TIME_DELTA"),

	/**
	 * The '<em><b>ON TIME OR DISTANCE DELTA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_TIME_OR_DISTANCE_DELTA_VALUE
	 * @generated
	 * @ordered
	 */
	ON_TIME_OR_DISTANCE_DELTA(2, "ON_TIME_OR_DISTANCE_DELTA", "ON_TIME_OR_DISTANCE_DELTA");

	/**
	 * The '<em><b>ON DISTANCE DELTA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ON DISTANCE DELTA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_DISTANCE_DELTA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ON_DISTANCE_DELTA_VALUE = 0;

	/**
	 * The '<em><b>ON TIME DELTA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ON TIME DELTA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_TIME_DELTA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ON_TIME_DELTA_VALUE = 1;

	/**
	 * The '<em><b>ON TIME OR DISTANCE DELTA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ON TIME OR DISTANCE DELTA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_TIME_OR_DISTANCE_DELTA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ON_TIME_OR_DISTANCE_DELTA_VALUE = 2;

	/**
	 * An array of all the '<em><b>Path Recorder Sampling Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PathRecorderSamplingMode[] VALUES_ARRAY =
		new PathRecorderSamplingMode[] {
			ON_DISTANCE_DELTA,
			ON_TIME_DELTA,
			ON_TIME_OR_DISTANCE_DELTA,
		};

	/**
	 * A public read-only list of all the '<em><b>Path Recorder Sampling Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PathRecorderSamplingMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Path Recorder Sampling Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PathRecorderSamplingMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PathRecorderSamplingMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Path Recorder Sampling Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PathRecorderSamplingMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PathRecorderSamplingMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Path Recorder Sampling Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PathRecorderSamplingMode get(int value) {
		switch (value) {
			case ON_DISTANCE_DELTA_VALUE: return ON_DISTANCE_DELTA;
			case ON_TIME_DELTA_VALUE: return ON_TIME_DELTA;
			case ON_TIME_OR_DISTANCE_DELTA_VALUE: return ON_TIME_OR_DISTANCE_DELTA;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PathRecorderSamplingMode(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PathRecorderSamplingMode
