package ca.gc.asc_csa.apogy.addons.telecoms;
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
 * A representation of the literals of the enumeration '<em><b>Telecom Node Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getTelecomNodeStatus()
 * @model
 * @generated
 */
public enum TelecomNodeStatus implements Enumerator {
	/**
	 * The '<em><b>NOT STARTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_STARTED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_STARTED(0, "NOT_STARTED", "Not Started"),

	/**
	 * The '<em><b>NOT ENABLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_ENABLED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_ENABLED(1, "NOT_ENABLED", "Not Enabled"),

	/**
	 * The '<em><b>UNREACHABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNREACHABLE_VALUE
	 * @generated
	 * @ordered
	 */
	UNREACHABLE(2, "UNREACHABLE", "Unreachable"),

	/**
	 * The '<em><b>NORMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL(3, "NORMAL", "Normal"),

	/**
	 * The '<em><b>PACKET LOSS WARNING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKET_LOSS_WARNING_VALUE
	 * @generated
	 * @ordered
	 */
	PACKET_LOSS_WARNING(4, "PACKET_LOSS_WARNING", "Warning: High Packet Loss"),

	/**
	 * The '<em><b>PACKET LOSS ALARM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKET_LOSS_ALARM_VALUE
	 * @generated
	 * @ordered
	 */
	PACKET_LOSS_ALARM(5, "PACKET_LOSS_ALARM", "Alarm: Packet Loss Out Of Valid Range"),

	/**
	 * The '<em><b>LATENCY WARNING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATENCY_WARNING_VALUE
	 * @generated
	 * @ordered
	 */
	LATENCY_WARNING(6, "LATENCY_WARNING", "Warning: High Latency"),

	/**
	 * The '<em><b>LATENCY ALARM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATENCY_ALARM_VALUE
	 * @generated
	 * @ordered
	 */
	LATENCY_ALARM(7, "LATENCY_ALARM", "Alarm: Latency Out Of Valid Range"),

	/**
	 * The '<em><b>BOTH WARNING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTH_WARNING_VALUE
	 * @generated
	 * @ordered
	 */
	BOTH_WARNING(8, "BOTH_WARNING", "Warning: High Latency & Packet Loss"),

	/**
	 * The '<em><b>BOTH ALARM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTH_ALARM_VALUE
	 * @generated
	 * @ordered
	 */
	BOTH_ALARM(9, "BOTH_ALARM", "Alarm: Latency & Packet Loss Out Of Valid Range");

	/**
	 * The '<em><b>NOT STARTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT STARTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_STARTED
	 * @model literal="Not Started"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_STARTED_VALUE = 0;

	/**
	 * The '<em><b>NOT ENABLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT ENABLED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_ENABLED
	 * @model literal="Not Enabled"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_ENABLED_VALUE = 1;

	/**
	 * The '<em><b>UNREACHABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNREACHABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNREACHABLE
	 * @model literal="Unreachable"
	 * @generated
	 * @ordered
	 */
	public static final int UNREACHABLE_VALUE = 2;

	/**
	 * The '<em><b>NORMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORMAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORMAL
	 * @model literal="Normal"
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_VALUE = 3;

	/**
	 * The '<em><b>PACKET LOSS WARNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PACKET LOSS WARNING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PACKET_LOSS_WARNING
	 * @model literal="Warning: High Packet Loss"
	 * @generated
	 * @ordered
	 */
	public static final int PACKET_LOSS_WARNING_VALUE = 4;

	/**
	 * The '<em><b>PACKET LOSS ALARM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PACKET LOSS ALARM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PACKET_LOSS_ALARM
	 * @model literal="Alarm: Packet Loss Out Of Valid Range"
	 * @generated
	 * @ordered
	 */
	public static final int PACKET_LOSS_ALARM_VALUE = 5;

	/**
	 * The '<em><b>LATENCY WARNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LATENCY WARNING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LATENCY_WARNING
	 * @model literal="Warning: High Latency"
	 * @generated
	 * @ordered
	 */
	public static final int LATENCY_WARNING_VALUE = 6;

	/**
	 * The '<em><b>LATENCY ALARM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LATENCY ALARM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LATENCY_ALARM
	 * @model literal="Alarm: Latency Out Of Valid Range"
	 * @generated
	 * @ordered
	 */
	public static final int LATENCY_ALARM_VALUE = 7;

	/**
	 * The '<em><b>BOTH WARNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOTH WARNING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTH_WARNING
	 * @model literal="Warning: High Latency & Packet Loss"
	 * @generated
	 * @ordered
	 */
	public static final int BOTH_WARNING_VALUE = 8;

	/**
	 * The '<em><b>BOTH ALARM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOTH ALARM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTH_ALARM
	 * @model literal="Alarm: Latency & Packet Loss Out Of Valid Range"
	 * @generated
	 * @ordered
	 */
	public static final int BOTH_ALARM_VALUE = 9;

	/**
	 * An array of all the '<em><b>Telecom Node Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TelecomNodeStatus[] VALUES_ARRAY =
		new TelecomNodeStatus[] {
			NOT_STARTED,
			NOT_ENABLED,
			UNREACHABLE,
			NORMAL,
			PACKET_LOSS_WARNING,
			PACKET_LOSS_ALARM,
			LATENCY_WARNING,
			LATENCY_ALARM,
			BOTH_WARNING,
			BOTH_ALARM,
		};

	/**
	 * A public read-only list of all the '<em><b>Telecom Node Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TelecomNodeStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Telecom Node Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TelecomNodeStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TelecomNodeStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Telecom Node Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TelecomNodeStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TelecomNodeStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Telecom Node Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TelecomNodeStatus get(int value) {
		switch (value) {
			case NOT_STARTED_VALUE: return NOT_STARTED;
			case NOT_ENABLED_VALUE: return NOT_ENABLED;
			case UNREACHABLE_VALUE: return UNREACHABLE;
			case NORMAL_VALUE: return NORMAL;
			case PACKET_LOSS_WARNING_VALUE: return PACKET_LOSS_WARNING;
			case PACKET_LOSS_ALARM_VALUE: return PACKET_LOSS_ALARM;
			case LATENCY_WARNING_VALUE: return LATENCY_WARNING;
			case LATENCY_ALARM_VALUE: return LATENCY_ALARM;
			case BOTH_WARNING_VALUE: return BOTH_WARNING;
			case BOTH_ALARM_VALUE: return BOTH_ALARM;
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
	private TelecomNodeStatus(int value, String name, String literal) {
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
	
} //TelecomNodeStatus
