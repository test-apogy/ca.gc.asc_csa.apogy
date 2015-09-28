/**
 * Canadian Space Agency 2011
 */
package ca.gc.asc_csa.eclipse.images.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Image Alignment</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.eclipse.images.core.ImagesCorePackage#getImageAlignment()
 * @model
 * @generated
 */
public enum ImageAlignment implements Enumerator {
	/**
	 * The '<em><b>CENTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	CENTER(1, "CENTER", "CENTER"),

	/**
	 * The '<em><b>LOWER LEFT CORNER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWER_LEFT_CORNER_VALUE
	 * @generated
	 * @ordered
	 */
	LOWER_LEFT_CORNER(2, "LOWER_LEFT_CORNER", "LOWER_LEFT_CORNER"),

	/**
	 * The '<em><b>UPPER LEFT CORNER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPER_LEFT_CORNER_VALUE
	 * @generated
	 * @ordered
	 */
	UPPER_LEFT_CORNER(3, "UPPER_LEFT_CORNER", "UPPER_LEFT_CORNER"),

	/**
	 * The '<em><b>LOWER RIGHT CORNER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWER_RIGHT_CORNER_VALUE
	 * @generated
	 * @ordered
	 */
	LOWER_RIGHT_CORNER(4, "LOWER_RIGHT_CORNER", "LOWER_RIGHT_CORNER"),

	/**
	 * The '<em><b>UPPER RIGHT CORNER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPER_RIGHT_CORNER_VALUE
	 * @generated
	 * @ordered
	 */
	UPPER_RIGHT_CORNER(5, "UPPER_RIGHT_CORNER", "UPPER_RIGHT_CORNER");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2011";

	/**
	 * The '<em><b>CENTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CENTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CENTER_VALUE = 1;

	/**
	 * The '<em><b>LOWER LEFT CORNER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOWER LEFT CORNER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWER_LEFT_CORNER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOWER_LEFT_CORNER_VALUE = 2;

	/**
	 * The '<em><b>UPPER LEFT CORNER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UPPER LEFT CORNER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPPER_LEFT_CORNER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UPPER_LEFT_CORNER_VALUE = 3;

	/**
	 * The '<em><b>LOWER RIGHT CORNER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOWER RIGHT CORNER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWER_RIGHT_CORNER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOWER_RIGHT_CORNER_VALUE = 4;

	/**
	 * The '<em><b>UPPER RIGHT CORNER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UPPER RIGHT CORNER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPPER_RIGHT_CORNER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UPPER_RIGHT_CORNER_VALUE = 5;

	/**
	 * An array of all the '<em><b>Image Alignment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImageAlignment[] VALUES_ARRAY =
		new ImageAlignment[] {
			CENTER,
			LOWER_LEFT_CORNER,
			UPPER_LEFT_CORNER,
			LOWER_RIGHT_CORNER,
			UPPER_RIGHT_CORNER,
		};

	/**
	 * A public read-only list of all the '<em><b>Image Alignment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImageAlignment> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Image Alignment</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImageAlignment get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImageAlignment result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Image Alignment</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImageAlignment getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImageAlignment result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Image Alignment</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImageAlignment get(int value) {
		switch (value) {
			case CENTER_VALUE: return CENTER;
			case LOWER_LEFT_CORNER_VALUE: return LOWER_LEFT_CORNER;
			case UPPER_LEFT_CORNER_VALUE: return UPPER_LEFT_CORNER;
			case LOWER_RIGHT_CORNER_VALUE: return LOWER_RIGHT_CORNER;
			case UPPER_RIGHT_CORNER_VALUE: return UPPER_RIGHT_CORNER;
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
	private ImageAlignment(int value, String name, String literal) {
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
	
} //ImageAlignment
