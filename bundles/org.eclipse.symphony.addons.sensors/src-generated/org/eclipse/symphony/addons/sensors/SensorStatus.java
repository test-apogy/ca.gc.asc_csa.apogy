/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sensor Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Represents the various states that a sensor could be in.
 *  * Typical status transitions :
 *  * Power up (nominal) : OFF -> BUSY (initialization) -> READY
 * Power up (off-nominal) : OFF -> BUSY (initialization) -> FAILED
 *  * Data acquition (nominal): READY -> BUSY (Acquisition) -> READY
 * Data acquition (off-nominal): READY -> BUSY (Acquisition) -> FAILED
 * <!-- end-model-doc -->
 * @see org.eclipse.symphony.addons.sensors.SensorsPackage#getSensorStatus()
 * @model
 * @generated
 */
public enum SensorStatus implements Enumerator {
	/**
	 * The '<em><b>OFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFF_VALUE
	 * @generated
	 * @ordered
	 */
	OFF(0, "OFF", "OFF"),

	/**
	 * The '<em><b>READY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READY_VALUE
	 * @generated
	 * @ordered
	 */
	READY(1, "READY", "READY"),

	/**
	 * The '<em><b>BUSY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSY_VALUE
	 * @generated
	 * @ordered
	 */
	BUSY(2, "BUSY", "BUSY"),

	/**
	 * The '<em><b>FAILED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	FAILED(3, "FAILED", "FAILED");

	/**
	 * The '<em><b>OFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OFF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OFF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OFF_VALUE = 0;

	/**
	 * The '<em><b>READY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>READY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int READY_VALUE = 1;

	/**
	 * The '<em><b>BUSY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUSY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUSY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUSY_VALUE = 2;

	/**
	 * The '<em><b>FAILED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FAILED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAILED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FAILED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Sensor Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SensorStatus[] VALUES_ARRAY =
		new SensorStatus[] {
			OFF,
			READY,
			BUSY,
			FAILED,
		};

	/**
	 * A public read-only list of all the '<em><b>Sensor Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SensorStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sensor Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensorStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensorStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensorStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensorStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensorStatus get(int value) {
		switch (value) {
			case OFF_VALUE: return OFF;
			case READY_VALUE: return READY;
			case BUSY_VALUE: return BUSY;
			case FAILED_VALUE: return FAILED;
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
	private SensorStatus(int value, String name, String literal) {
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
	
} //SensorStatus
