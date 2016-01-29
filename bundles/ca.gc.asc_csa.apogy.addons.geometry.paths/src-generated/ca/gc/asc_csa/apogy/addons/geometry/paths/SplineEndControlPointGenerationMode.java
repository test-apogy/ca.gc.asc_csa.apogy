/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.geometry.paths;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Spline End Control Point Generation Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsPackage#getSplineEndControlPointGenerationMode()
 * @model
 * @generated
 */
public enum SplineEndControlPointGenerationMode implements Enumerator {
	/**
	 * The '<em><b>AUTO CTRL POINTS NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_CTRL_POINTS_NONE_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO_CTRL_POINTS_NONE(0, "AUTO_CTRL_POINTS_NONE", "AUTO_CTRL_POINTS_NONE"),

	/**
	 * The '<em><b>AUTO CTRL POINTS DUPLICATE ENDNODES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_CTRL_POINTS_DUPLICATE_ENDNODES_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO_CTRL_POINTS_DUPLICATE_ENDNODES(1, "AUTO_CTRL_POINTS_DUPLICATE_ENDNODES", "AUTO_CTRL_POINTS_DUPLICATE_ENDNODES"),

	/**
	 * The '<em><b>AUTO CTRL POINTS REFLECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_CTRL_POINTS_REFLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO_CTRL_POINTS_REFLECTION(2, "AUTO_CTRL_POINTS_REFLECTION", "AUTO_CTRL_POINTS_REFLECTION"),

	/**
	 * The '<em><b>AUTO CTRL POINTS CLOSE LOOPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_CTRL_POINTS_CLOSE_LOOPS_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO_CTRL_POINTS_CLOSE_LOOPS(3, "AUTO_CTRL_POINTS_CLOSE_LOOPS", "AUTO_CTRL_POINTS_CLOSE_LOOPS");

	/**
	 * The '<em><b>AUTO CTRL POINTS NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUTO CTRL POINTS NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTO_CTRL_POINTS_NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_CTRL_POINTS_NONE_VALUE = 0;

	/**
	 * The '<em><b>AUTO CTRL POINTS DUPLICATE ENDNODES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUTO CTRL POINTS DUPLICATE ENDNODES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTO_CTRL_POINTS_DUPLICATE_ENDNODES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_CTRL_POINTS_DUPLICATE_ENDNODES_VALUE = 1;

	/**
	 * The '<em><b>AUTO CTRL POINTS REFLECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUTO CTRL POINTS REFLECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTO_CTRL_POINTS_REFLECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_CTRL_POINTS_REFLECTION_VALUE = 2;

	/**
	 * The '<em><b>AUTO CTRL POINTS CLOSE LOOPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUTO CTRL POINTS CLOSE LOOPS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTO_CTRL_POINTS_CLOSE_LOOPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_CTRL_POINTS_CLOSE_LOOPS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Spline End Control Point Generation Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SplineEndControlPointGenerationMode[] VALUES_ARRAY =
		new SplineEndControlPointGenerationMode[] {
			AUTO_CTRL_POINTS_NONE,
			AUTO_CTRL_POINTS_DUPLICATE_ENDNODES,
			AUTO_CTRL_POINTS_REFLECTION,
			AUTO_CTRL_POINTS_CLOSE_LOOPS,
		};

	/**
	 * A public read-only list of all the '<em><b>Spline End Control Point Generation Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SplineEndControlPointGenerationMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Spline End Control Point Generation Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SplineEndControlPointGenerationMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SplineEndControlPointGenerationMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Spline End Control Point Generation Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SplineEndControlPointGenerationMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SplineEndControlPointGenerationMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Spline End Control Point Generation Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SplineEndControlPointGenerationMode get(int value) {
		switch (value) {
			case AUTO_CTRL_POINTS_NONE_VALUE: return AUTO_CTRL_POINTS_NONE;
			case AUTO_CTRL_POINTS_DUPLICATE_ENDNODES_VALUE: return AUTO_CTRL_POINTS_DUPLICATE_ENDNODES;
			case AUTO_CTRL_POINTS_REFLECTION_VALUE: return AUTO_CTRL_POINTS_REFLECTION;
			case AUTO_CTRL_POINTS_CLOSE_LOOPS_VALUE: return AUTO_CTRL_POINTS_CLOSE_LOOPS;
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
	private SplineEndControlPointGenerationMode(int value, String name, String literal) {
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
	
} //SplineEndControlPointGenerationMode
