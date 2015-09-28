/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.mrt.geometry.paths.ui;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Path Presentation Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.geometry.paths.ui.PathsUIPackage#getPathPresentationMode()
 * @model
 * @generated
 */
public enum PathPresentationMode implements Enumerator {
	/**
	 * The '<em><b>POINTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POINTS_VALUE
	 * @generated
	 * @ordered
	 */
	POINTS(0, "POINTS", "Points"),

	/**
	 * The '<em><b>LINES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINES_VALUE
	 * @generated
	 * @ordered
	 */
	LINES(1, "LINES", "Lines"),

	/**
	 * The '<em><b>POINTS LINES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POINTS_LINES_VALUE
	 * @generated
	 * @ordered
	 */
	POINTS_LINES(2, "POINTS_LINES", "Points Lines");

	/**
	 * The '<em><b>POINTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POINTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POINTS
	 * @model literal="Points"
	 * @generated
	 * @ordered
	 */
	public static final int POINTS_VALUE = 0;

	/**
	 * The '<em><b>LINES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINES
	 * @model literal="Lines"
	 * @generated
	 * @ordered
	 */
	public static final int LINES_VALUE = 1;

	/**
	 * The '<em><b>POINTS LINES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POINTS LINES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POINTS_LINES
	 * @model literal="Points Lines"
	 * @generated
	 * @ordered
	 */
	public static final int POINTS_LINES_VALUE = 2;

	/**
	 * An array of all the '<em><b>Path Presentation Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PathPresentationMode[] VALUES_ARRAY =
		new PathPresentationMode[] {
			POINTS,
			LINES,
			POINTS_LINES,
		};

	/**
	 * A public read-only list of all the '<em><b>Path Presentation Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PathPresentationMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Path Presentation Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PathPresentationMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PathPresentationMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Path Presentation Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PathPresentationMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PathPresentationMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Path Presentation Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PathPresentationMode get(int value) {
		switch (value) {
			case POINTS_VALUE: return POINTS;
			case LINES_VALUE: return LINES;
			case POINTS_LINES_VALUE: return POINTS_LINES;
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
	private PathPresentationMode(int value, String name, String literal) {
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
	
} //PathPresentationMode
