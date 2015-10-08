/**
 * Copyrights Canadian Space Agency 2012. All rights reserved.
 */
package org.eclipse.symphony.common.io.jinput;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EController Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.io.jinput.JInputPackage#getEControllerType()
 * @model
 * @generated
 */
public enum EControllerType implements Enumerator {
	/**
	 * The '<em><b>FINGERSTICK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINGERSTICK_VALUE
	 * @generated
	 * @ordered
	 */
	FINGERSTICK(0, "FINGERSTICK", "FINGERSTICK"),

	/**
	 * The '<em><b>GAMEPAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAMEPAD_VALUE
	 * @generated
	 * @ordered
	 */
	GAMEPAD(1, "GAMEPAD", "GAMEPAD"),

	/**
	 * The '<em><b>HEADTRACKER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADTRACKER_VALUE
	 * @generated
	 * @ordered
	 */
	HEADTRACKER(2, "HEADTRACKER", "HEADTRACKER"),

	/**
	 * The '<em><b>KEYBOARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYBOARD_VALUE
	 * @generated
	 * @ordered
	 */
	KEYBOARD(3, "KEYBOARD", "KEYBOARD"),

	/**
	 * The '<em><b>MOUSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOUSE_VALUE
	 * @generated
	 * @ordered
	 */
	MOUSE(4, "MOUSE", "MOUSE"),

	/**
	 * The '<em><b>RUDDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUDDER_VALUE
	 * @generated
	 * @ordered
	 */
	RUDDER(5, "RUDDER", "RUDDER"),

	/**
	 * The '<em><b>STICK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STICK_VALUE
	 * @generated
	 * @ordered
	 */
	STICK(6, "STICK", "STICK"),

	/**
	 * The '<em><b>TRACKBALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRACKBALL_VALUE
	 * @generated
	 * @ordered
	 */
	TRACKBALL(7, "TRACKBALL", "TRACKBALL"),

	/**
	 * The '<em><b>TRACKPAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRACKPAD_VALUE
	 * @generated
	 * @ordered
	 */
	TRACKPAD(8, "TRACKPAD", "TRACKPAD"),

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(9, "UNKNOWN", "UNKNOWN"),

	/**
	 * The '<em><b>WHEEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHEEL_VALUE
	 * @generated
	 * @ordered
	 */
	WHEEL(10, "WHEEL", "WHEEL");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyrights Canadian Space Agency 2012. All rights reserved.";

	/**
	 * The '<em><b>FINGERSTICK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FINGERSTICK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINGERSTICK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FINGERSTICK_VALUE = 0;

	/**
	 * The '<em><b>GAMEPAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GAMEPAD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAMEPAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GAMEPAD_VALUE = 1;

	/**
	 * The '<em><b>HEADTRACKER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HEADTRACKER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEADTRACKER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEADTRACKER_VALUE = 2;

	/**
	 * The '<em><b>KEYBOARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYBOARD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYBOARD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYBOARD_VALUE = 3;

	/**
	 * The '<em><b>MOUSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOUSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOUSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOUSE_VALUE = 4;

	/**
	 * The '<em><b>RUDDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RUDDER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RUDDER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RUDDER_VALUE = 5;

	/**
	 * The '<em><b>STICK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STICK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STICK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STICK_VALUE = 6;

	/**
	 * The '<em><b>TRACKBALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRACKBALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRACKBALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRACKBALL_VALUE = 7;

	/**
	 * The '<em><b>TRACKPAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRACKPAD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRACKPAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRACKPAD_VALUE = 8;

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
	public static final int UNKNOWN_VALUE = 9;

	/**
	 * The '<em><b>WHEEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WHEEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHEEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WHEEL_VALUE = 10;

	/**
	 * An array of all the '<em><b>EController Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EControllerType[] VALUES_ARRAY =
		new EControllerType[] {
			FINGERSTICK,
			GAMEPAD,
			HEADTRACKER,
			KEYBOARD,
			MOUSE,
			RUDDER,
			STICK,
			TRACKBALL,
			TRACKPAD,
			UNKNOWN,
			WHEEL,
		};

	/**
	 * A public read-only list of all the '<em><b>EController Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EControllerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EController Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EControllerType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EControllerType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EController Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EControllerType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EControllerType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EController Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EControllerType get(int value) {
		switch (value) {
			case FINGERSTICK_VALUE: return FINGERSTICK;
			case GAMEPAD_VALUE: return GAMEPAD;
			case HEADTRACKER_VALUE: return HEADTRACKER;
			case KEYBOARD_VALUE: return KEYBOARD;
			case MOUSE_VALUE: return MOUSE;
			case RUDDER_VALUE: return RUDDER;
			case STICK_VALUE: return STICK;
			case TRACKBALL_VALUE: return TRACKBALL;
			case TRACKPAD_VALUE: return TRACKPAD;
			case UNKNOWN_VALUE: return UNKNOWN;
			case WHEEL_VALUE: return WHEEL;
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
	private EControllerType(int value, String name, String literal) {
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
	
} //EControllerType
