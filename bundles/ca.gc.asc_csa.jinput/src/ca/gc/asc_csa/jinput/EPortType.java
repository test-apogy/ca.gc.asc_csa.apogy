/**
 * Copyrights Canadian Space Agency 2012. All rights reserved.
 */
package ca.gc.asc_csa.jinput;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EPort Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.jinput.JInputPackage#getEPortType()
 * @model
 * @generated
 */
public enum EPortType implements Enumerator {
	/**
	 * The '<em><b>GAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAME_VALUE
	 * @generated
	 * @ordered
	 */
	GAME(0, "GAME", "GAME"),

	/**
	 * The '<em><b>I8042</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I8042_VALUE
	 * @generated
	 * @ordered
	 */
	I8042(1, "I8042", "I8042"),

	/**
	 * The '<em><b>NETWORK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK(2, "NETWORK", "NETWORK"),

	/**
	 * The '<em><b>PARALLEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLEL_VALUE
	 * @generated
	 * @ordered
	 */
	PARALLEL(3, "PARALLEL", "PARALLEL"),

	/**
	 * The '<em><b>SERIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERIAL_VALUE
	 * @generated
	 * @ordered
	 */
	SERIAL(4, "SERIAL", "SERIAL"),

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(5, "UNKNOWN", "UNKNOWN"),

	/**
	 * The '<em><b>USB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USB_VALUE
	 * @generated
	 * @ordered
	 */
	USB(6, "USB", "USB");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyrights Canadian Space Agency 2012. All rights reserved.";

	/**
	 * The '<em><b>GAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GAME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GAME_VALUE = 0;

	/**
	 * The '<em><b>I8042</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>I8042</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #I8042
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int I8042_VALUE = 1;

	/**
	 * The '<em><b>NETWORK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NETWORK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NETWORK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_VALUE = 2;

	/**
	 * The '<em><b>PARALLEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PARALLEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARALLEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARALLEL_VALUE = 3;

	/**
	 * The '<em><b>SERIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SERIAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERIAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SERIAL_VALUE = 4;

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNKNOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 5;

	/**
	 * The '<em><b>USB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USB_VALUE = 6;

	/**
	 * An array of all the '<em><b>EPort Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EPortType[] VALUES_ARRAY =
		new EPortType[] {
			GAME,
			I8042,
			NETWORK,
			PARALLEL,
			SERIAL,
			UNKNOWN,
			USB,
		};

	/**
	 * A public read-only list of all the '<em><b>EPort Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EPortType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EPort Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EPortType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EPortType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EPort Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EPortType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EPortType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EPort Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EPortType get(int value) {
		switch (value) {
			case GAME_VALUE: return GAME;
			case I8042_VALUE: return I8042;
			case NETWORK_VALUE: return NETWORK;
			case PARALLEL_VALUE: return PARALLEL;
			case SERIAL_VALUE: return SERIAL;
			case UNKNOWN_VALUE: return UNKNOWN;
			case USB_VALUE: return USB;
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
	private EPortType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //EPortType
