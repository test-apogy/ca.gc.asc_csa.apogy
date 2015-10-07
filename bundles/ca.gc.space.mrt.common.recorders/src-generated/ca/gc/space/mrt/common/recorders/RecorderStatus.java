/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.space.mrt.common.recorders;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Recorder Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.common.recorders.RecordersPackage#getRecorderStatus()
 * @model
 * @generated
 */
public enum RecorderStatus implements Enumerator {
	/**
	 * The '<em><b>INITIALIZING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIALIZING_VALUE
	 * @generated
	 * @ordered
	 */
	INITIALIZING(0, "INITIALIZING", "INITIALIZING"),

	/**
	 * The '<em><b>RECORDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECORDING_VALUE
	 * @generated
	 * @ordered
	 */
	RECORDING(1, "RECORDING", "RECORDING"),

	/**
	 * The '<em><b>PAUSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAUSED_VALUE
	 * @generated
	 * @ordered
	 */
	PAUSED(2, "PAUSED", "PAUSED"),

	/**
	 * The '<em><b>TERMINATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERMINATED_VALUE
	 * @generated
	 * @ordered
	 */
	TERMINATED(3, "TERMINATED", "TERMINATED");

	/**
	 * The '<em><b>INITIALIZING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INITIALIZING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INITIALIZING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INITIALIZING_VALUE = 0;

	/**
	 * The '<em><b>RECORDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RECORDING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECORDING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RECORDING_VALUE = 1;

	/**
	 * The '<em><b>PAUSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAUSED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAUSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAUSED_VALUE = 2;

	/**
	 * The '<em><b>TERMINATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TERMINATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TERMINATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TERMINATED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Recorder Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RecorderStatus[] VALUES_ARRAY =
		new RecorderStatus[] {
			INITIALIZING,
			RECORDING,
			PAUSED,
			TERMINATED,
		};

	/**
	 * A public read-only list of all the '<em><b>Recorder Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RecorderStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Recorder Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RecorderStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RecorderStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Recorder Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RecorderStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RecorderStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Recorder Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RecorderStatus get(int value) {
		switch (value) {
			case INITIALIZING_VALUE: return INITIALIZING;
			case RECORDING_VALUE: return RECORDING;
			case PAUSED_VALUE: return PAUSED;
			case TERMINATED_VALUE: return TERMINATED;
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
	private RecorderStatus(int value, String name, String literal) {
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
	
} //RecorderStatus
