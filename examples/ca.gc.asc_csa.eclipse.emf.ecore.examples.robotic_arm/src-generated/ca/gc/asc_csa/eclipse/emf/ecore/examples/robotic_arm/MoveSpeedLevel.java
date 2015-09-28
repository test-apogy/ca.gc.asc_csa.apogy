/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.eclipse.emf.ecore.examples.robotic_arm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Move Speed Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This enumeration is used to indicate the overall possible
 * levels of speed that a robotic arm can move at; as
 * expected, this used by RoboticArm (and its subclasses) when
 * moveTo() is called.
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.robotic_arm.EMFEcoreExampleRoboticArmPackage#getMoveSpeedLevel()
 * @model
 * @generated
 */
public enum MoveSpeedLevel implements Enumerator {
	/**
	 * The '<em><b>SLOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLOW_VALUE
	 * @generated
	 * @ordered
	 */
	SLOW(0, "SLOW", "SLOW"),

	/**
	 * The '<em><b>MEDIUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUM_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIUM(1, "MEDIUM", "MEDIUM"),

	/**
	 * The '<em><b>FAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAST_VALUE
	 * @generated
	 * @ordered
	 */
	FAST(2, "FAST", "FAST");

	/**
	 * The '<em><b>SLOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SLOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This indicates that the robotic arm should move at a slower
	 * speed, when compared to the other move speed levels.
	 * <!-- end-model-doc -->
	 * @see #SLOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SLOW_VALUE = 0;

	/**
	 * The '<em><b>MEDIUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MEDIUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This indicates that the robotic arm should move at an average
	 * speed, when compared to the other move speed levels.
	 * <!-- end-model-doc -->
	 * @see #MEDIUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM_VALUE = 1;

	/**
	 * The '<em><b>FAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FAST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This indicates that the robotic arm should move at a faster
	 * speed, when compared to the other move speed levels.
	 * <!-- end-model-doc -->
	 * @see #FAST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FAST_VALUE = 2;

	/**
	 * An array of all the '<em><b>Move Speed Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MoveSpeedLevel[] VALUES_ARRAY =
		new MoveSpeedLevel[] {
			SLOW,
			MEDIUM,
			FAST,
		};

	/**
	 * A public read-only list of all the '<em><b>Move Speed Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MoveSpeedLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Move Speed Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MoveSpeedLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MoveSpeedLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Move Speed Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MoveSpeedLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MoveSpeedLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Move Speed Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MoveSpeedLevel get(int value) {
		switch (value) {
			case SLOW_VALUE: return SLOW;
			case MEDIUM_VALUE: return MEDIUM;
			case FAST_VALUE: return FAST;
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
	private MoveSpeedLevel(int value, String name, String literal) {
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
	
} //MoveSpeedLevel
