/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Polygon Sampling Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.geometry.data.DataPackage#getPolygonSamplingMode()
 * @model
 * @generated
 */
public enum PolygonSamplingMode implements Enumerator {
	/**
	 * The '<em><b>ALL VERTEX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_VERTEX_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_VERTEX(0, "ALL_VERTEX", "ALL_VERTEX"),

	/**
	 * The '<em><b>AT LEAST ONE VERTEX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_LEAST_ONE_VERTEX_VALUE
	 * @generated
	 * @ordered
	 */
	AT_LEAST_ONE_VERTEX(1, "AT_LEAST_ONE_VERTEX", "AT_LEAST_ONE_VERTEX");

	/**
	 * The '<em><b>ALL VERTEX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALL VERTEX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL_VERTEX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALL_VERTEX_VALUE = 0;

	/**
	 * The '<em><b>AT LEAST ONE VERTEX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AT LEAST ONE VERTEX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AT_LEAST_ONE_VERTEX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AT_LEAST_ONE_VERTEX_VALUE = 1;

	/**
	 * An array of all the '<em><b>Polygon Sampling Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PolygonSamplingMode[] VALUES_ARRAY =
		new PolygonSamplingMode[] {
			ALL_VERTEX,
			AT_LEAST_ONE_VERTEX,
		};

	/**
	 * A public read-only list of all the '<em><b>Polygon Sampling Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PolygonSamplingMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Polygon Sampling Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PolygonSamplingMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PolygonSamplingMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Polygon Sampling Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PolygonSamplingMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PolygonSamplingMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Polygon Sampling Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PolygonSamplingMode get(int value) {
		switch (value) {
			case ALL_VERTEX_VALUE: return ALL_VERTEX;
			case AT_LEAST_ONE_VERTEX_VALUE: return AT_LEAST_ONE_VERTEX;
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
	private PolygonSamplingMode(int value, String name, String literal) {
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
	
} //PolygonSamplingMode
