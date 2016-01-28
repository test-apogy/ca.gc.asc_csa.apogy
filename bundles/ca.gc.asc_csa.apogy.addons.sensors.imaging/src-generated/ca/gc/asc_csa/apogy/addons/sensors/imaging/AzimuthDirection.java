/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.imaging;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Azimuth Direction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ApogyAddonsSensorsImagingPackage#getAzimuthDirection()
 * @model
 * @generated
 */
public enum AzimuthDirection implements Enumerator {
	/**
	 * The '<em><b>POSITIVE TOWARD LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITIVE_TOWARD_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	POSITIVE_TOWARD_LEFT(1, "POSITIVE_TOWARD_LEFT", "Positive Toward Left"),

	/**
	 * The '<em><b>POSITIVE TOWARD RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITIVE_TOWARD_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	POSITIVE_TOWARD_RIGHT(2, "POSITIVE_TOWARD_RIGHT", "Positive Toward Right");

	/**
	 * The '<em><b>POSITIVE TOWARD LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POSITIVE TOWARD LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSITIVE_TOWARD_LEFT
	 * @model literal="Positive Toward Left"
	 * @generated
	 * @ordered
	 */
	public static final int POSITIVE_TOWARD_LEFT_VALUE = 1;

	/**
	 * The '<em><b>POSITIVE TOWARD RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POSITIVE TOWARD RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSITIVE_TOWARD_RIGHT
	 * @model literal="Positive Toward Right"
	 * @generated
	 * @ordered
	 */
	public static final int POSITIVE_TOWARD_RIGHT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Azimuth Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AzimuthDirection[] VALUES_ARRAY =
		new AzimuthDirection[] {
			POSITIVE_TOWARD_LEFT,
			POSITIVE_TOWARD_RIGHT,
		};

	/**
	 * A public read-only list of all the '<em><b>Azimuth Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AzimuthDirection> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Azimuth Direction</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AzimuthDirection get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AzimuthDirection result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Azimuth Direction</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AzimuthDirection getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AzimuthDirection result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Azimuth Direction</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AzimuthDirection get(int value) {
		switch (value) {
			case POSITIVE_TOWARD_LEFT_VALUE: return POSITIVE_TOWARD_LEFT;
			case POSITIVE_TOWARD_RIGHT_VALUE: return POSITIVE_TOWARD_RIGHT;
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
	private AzimuthDirection(int value, String name, String literal) {
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
	
} //AzimuthDirection
