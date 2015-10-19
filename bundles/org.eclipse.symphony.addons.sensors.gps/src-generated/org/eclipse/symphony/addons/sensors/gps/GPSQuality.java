/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.gps;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>GPS QUALITY</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.sensors.gps.GpsPackage#getGPSQuality()
 * @model
 * @generated
 */
public enum GPSQuality implements Enumerator {
	/**
	 * The '<em><b>INVALID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVALID_VALUE
	 * @generated
	 * @ordered
	 */
	INVALID(0, "INVALID", "INVALID"),

	/**
	 * The '<em><b>GPS FIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPS_FIX_VALUE
	 * @generated
	 * @ordered
	 */
	GPS_FIX(1, "GPS_FIX", "GPS_FIX"),

	/**
	 * The '<em><b>DGPS FIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DGPS_FIX_VALUE
	 * @generated
	 * @ordered
	 */
	DGPS_FIX(2, "DGPS_FIX", "DGPS_FIX"),

	/**
	 * The '<em><b>PPS FIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PPS_FIX_VALUE
	 * @generated
	 * @ordered
	 */
	PPS_FIX(3, "PPS_FIX", "PPS_FIX"),

	/**
	 * The '<em><b>RTK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTK_VALUE
	 * @generated
	 * @ordered
	 */
	RTK(4, "RTK", "RTK"),

	/**
	 * The '<em><b>FLOAT RTK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_RTK_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT_RTK(5, "FLOAT_RTK", "FLOAT_RTK"),

	/**
	 * The '<em><b>ESTIMATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESTIMATED_VALUE
	 * @generated
	 * @ordered
	 */
	ESTIMATED(6, "ESTIMATED", "ESTIMATED"),

	/**
	 * The '<em><b>MANUAL INPUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUAL_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	MANUAL_INPUT(7, "MANUAL_INPUT", "MANUAL_INPUT"),

	/**
	 * The '<em><b>SIMULATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMULATION_VALUE
	 * @generated
	 * @ordered
	 */
	SIMULATION(8, "SIMULATION", "SIMULATION");

	/**
	 * The '<em><b>INVALID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INVALID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INVALID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INVALID_VALUE = 0;

	/**
	 * The '<em><b>GPS FIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GPS FIX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GPS_FIX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GPS_FIX_VALUE = 1;

	/**
	 * The '<em><b>DGPS FIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DGPS FIX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DGPS_FIX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DGPS_FIX_VALUE = 2;

	/**
	 * The '<em><b>PPS FIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PPS FIX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PPS_FIX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PPS_FIX_VALUE = 3;

	/**
	 * The '<em><b>RTK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RTK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RTK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTK_VALUE = 4;

	/**
	 * The '<em><b>FLOAT RTK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLOAT RTK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOAT_RTK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_RTK_VALUE = 5;

	/**
	 * The '<em><b>ESTIMATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ESTIMATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESTIMATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESTIMATED_VALUE = 6;

	/**
	 * The '<em><b>MANUAL INPUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANUAL INPUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANUAL_INPUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANUAL_INPUT_VALUE = 7;

	/**
	 * The '<em><b>SIMULATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIMULATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMULATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIMULATION_VALUE = 8;

	/**
	 * An array of all the '<em><b>GPS Quality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GPSQuality[] VALUES_ARRAY =
		new GPSQuality[] {
			INVALID,
			GPS_FIX,
			DGPS_FIX,
			PPS_FIX,
			RTK,
			FLOAT_RTK,
			ESTIMATED,
			MANUAL_INPUT,
			SIMULATION,
		};

	/**
	 * A public read-only list of all the '<em><b>GPS Quality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GPSQuality> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GPS Quality</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GPSQuality get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GPSQuality result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GPS Quality</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GPSQuality getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GPSQuality result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GPS Quality</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GPSQuality get(int value) {
		switch (value) {
			case INVALID_VALUE: return INVALID;
			case GPS_FIX_VALUE: return GPS_FIX;
			case DGPS_FIX_VALUE: return DGPS_FIX;
			case PPS_FIX_VALUE: return PPS_FIX;
			case RTK_VALUE: return RTK;
			case FLOAT_RTK_VALUE: return FLOAT_RTK;
			case ESTIMATED_VALUE: return ESTIMATED;
			case MANUAL_INPUT_VALUE: return MANUAL_INPUT;
			case SIMULATION_VALUE: return SIMULATION;
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
	private GPSQuality(int value, String name, String literal) {
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
	
} //GPSQuality
