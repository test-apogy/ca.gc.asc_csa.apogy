/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.asc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Altitude Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Represents the various mode that can be used to generate the elevation in the DigitalElevationMap from the .asc file.
 * <!-- end-model-doc -->
 * @see org.eclipse.symphony.common.geometry.data3d.asc.Data3DASCPackage#getAltitudeMode()
 * @model
 * @generated
 */
public enum AltitudeMode implements Enumerator {
	/**
	 * The '<em><b>ABSOLUTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSOLUTE_VALUE
	 * @generated
	 * @ordered
	 */
	ABSOLUTE(0, "ABSOLUTE", "Absolute"),

	/**
	 * The '<em><b>RELATIVE TO AVERAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIVE_TO_AVERAGE_VALUE
	 * @generated
	 * @ordered
	 */
	RELATIVE_TO_AVERAGE(1, "RELATIVE_TO_AVERAGE", "Relative To Average"),

	/**
	 * The '<em><b>RELATIVE TO CENTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIVE_TO_CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	RELATIVE_TO_CENTER(2, "RELATIVE_TO_CENTER", "Relative to Center"),

	/**
	 * The '<em><b>RELATIVE TO SOUTH WEST CORNER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIVE_TO_SOUTH_WEST_CORNER_VALUE
	 * @generated
	 * @ordered
	 */
	RELATIVE_TO_SOUTH_WEST_CORNER(3, "RELATIVE_TO_SOUTH_WEST_CORNER", "Relative to South-West Corner"),

	/**
	 * The '<em><b>RELATIVE TO NORTH EAST CORNER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIVE_TO_NORTH_EAST_CORNER_VALUE
	 * @generated
	 * @ordered
	 */
	RELATIVE_TO_NORTH_EAST_CORNER(4, "RELATIVE_TO_NORTH_EAST_CORNER", "Relative to North-East Corner");

	/**
	 * The '<em><b>ABSOLUTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Use the absolute altitude as is.
	 * <!-- end-model-doc -->
	 * @see #ABSOLUTE
	 * @model literal="Absolute"
	 * @generated
	 * @ordered
	 */
	public static final int ABSOLUTE_VALUE = 0;

	/**
	 * The '<em><b>RELATIVE TO AVERAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Refers the altitude to the map average altitude.
	 * <!-- end-model-doc -->
	 * @see #RELATIVE_TO_AVERAGE
	 * @model literal="Relative To Average"
	 * @generated
	 * @ordered
	 */
	public static final int RELATIVE_TO_AVERAGE_VALUE = 1;

	/**
	 * The '<em><b>RELATIVE TO CENTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Refers the altitude relative to the altitude of the center of the map.
	 * <!-- end-model-doc -->
	 * @see #RELATIVE_TO_CENTER
	 * @model literal="Relative to Center"
	 * @generated
	 * @ordered
	 */
	public static final int RELATIVE_TO_CENTER_VALUE = 2;

	/**
	 * The '<em><b>RELATIVE TO SOUTH WEST CORNER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Refers the altitude relative to the altitude of the South-West corner of the map.
	 * <!-- end-model-doc -->
	 * @see #RELATIVE_TO_SOUTH_WEST_CORNER
	 * @model literal="Relative to South-West Corner"
	 * @generated
	 * @ordered
	 */
	public static final int RELATIVE_TO_SOUTH_WEST_CORNER_VALUE = 3;

	/**
	 * The '<em><b>RELATIVE TO NORTH EAST CORNER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Refers the altitude relative to the altitude of the North-East corner of the map.
	 * <!-- end-model-doc -->
	 * @see #RELATIVE_TO_NORTH_EAST_CORNER
	 * @model literal="Relative to North-East Corner"
	 * @generated
	 * @ordered
	 */
	public static final int RELATIVE_TO_NORTH_EAST_CORNER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Altitude Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AltitudeMode[] VALUES_ARRAY =
		new AltitudeMode[] {
			ABSOLUTE,
			RELATIVE_TO_AVERAGE,
			RELATIVE_TO_CENTER,
			RELATIVE_TO_SOUTH_WEST_CORNER,
			RELATIVE_TO_NORTH_EAST_CORNER,
		};

	/**
	 * A public read-only list of all the '<em><b>Altitude Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AltitudeMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Altitude Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AltitudeMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AltitudeMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Altitude Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AltitudeMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AltitudeMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Altitude Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AltitudeMode get(int value) {
		switch (value) {
			case ABSOLUTE_VALUE: return ABSOLUTE;
			case RELATIVE_TO_AVERAGE_VALUE: return RELATIVE_TO_AVERAGE;
			case RELATIVE_TO_CENTER_VALUE: return RELATIVE_TO_CENTER;
			case RELATIVE_TO_SOUTH_WEST_CORNER_VALUE: return RELATIVE_TO_SOUTH_WEST_CORNER;
			case RELATIVE_TO_NORTH_EAST_CORNER_VALUE: return RELATIVE_TO_NORTH_EAST_CORNER;
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
	private AltitudeMode(int value, String name, String literal) {
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
	
} //AltitudeMode
