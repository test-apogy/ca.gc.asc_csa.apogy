/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Image Size Policy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getImageSizePolicy()
 * @model
 * @generated
 */
public enum ImageSizePolicy implements Enumerator {
	/**
	 * The '<em><b>FIXED SIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	FIXED_SIZE(1, "FIXED_SIZE", "Fixed Size"),

	/**
	 * The '<em><b>ALLOW RESIZE VERTICAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLOW_RESIZE_VERTICAL_VALUE
	 * @generated
	 * @ordered
	 */
	ALLOW_RESIZE_VERTICAL(2, "ALLOW_RESIZE_VERTICAL", "Allow Resize Vertical"), /**
	 * The '<em><b>ALLOW RESIZE HORIZONTAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLOW_RESIZE_HORIZONTAL_VALUE
	 * @generated
	 * @ordered
	 */
	ALLOW_RESIZE_HORIZONTAL(3, "ALLOW_RESIZE_HORIZONTAL", "Allow Resize Horizontal"), /**
	 * The '<em><b>ALLOW RESIZE BOTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLOW_RESIZE_BOTH_VALUE
	 * @generated
	 * @ordered
	 */
	ALLOW_RESIZE_BOTH(4, "ALLOW_RESIZE_BOTH", "Allow Resize Both");

	/**
	 * The '<em><b>FIXED SIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIXED SIZE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIXED_SIZE
	 * @model literal="Fixed Size"
	 * @generated
	 * @ordered
	 */
	public static final int FIXED_SIZE_VALUE = 1;

	/**
	 * The '<em><b>ALLOW RESIZE VERTICAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALLOW RESIZE VERTICAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALLOW_RESIZE_VERTICAL
	 * @model literal="Allow Resize Vertical"
	 * @generated
	 * @ordered
	 */
	public static final int ALLOW_RESIZE_VERTICAL_VALUE = 2;

	/**
	 * The '<em><b>ALLOW RESIZE HORIZONTAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALLOW RESIZE HORIZONTAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALLOW_RESIZE_HORIZONTAL
	 * @model literal="Allow Resize Horizontal"
	 * @generated
	 * @ordered
	 */
	public static final int ALLOW_RESIZE_HORIZONTAL_VALUE = 3;

	/**
	 * The '<em><b>ALLOW RESIZE BOTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALLOW RESIZE BOTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALLOW_RESIZE_BOTH
	 * @model literal="Allow Resize Both"
	 * @generated
	 * @ordered
	 */
	public static final int ALLOW_RESIZE_BOTH_VALUE = 4;

	/**
	 * An array of all the '<em><b>Image Size Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImageSizePolicy[] VALUES_ARRAY =
		new ImageSizePolicy[] {
			FIXED_SIZE,
			ALLOW_RESIZE_VERTICAL,
			ALLOW_RESIZE_HORIZONTAL,
			ALLOW_RESIZE_BOTH,
		};

	/**
	 * A public read-only list of all the '<em><b>Image Size Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImageSizePolicy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Image Size Policy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImageSizePolicy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImageSizePolicy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Image Size Policy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImageSizePolicy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImageSizePolicy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Image Size Policy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImageSizePolicy get(int value) {
		switch (value) {
			case FIXED_SIZE_VALUE: return FIXED_SIZE;
			case ALLOW_RESIZE_VERTICAL_VALUE: return ALLOW_RESIZE_VERTICAL;
			case ALLOW_RESIZE_HORIZONTAL_VALUE: return ALLOW_RESIZE_HORIZONTAL;
			case ALLOW_RESIZE_BOTH_VALUE: return ALLOW_RESIZE_BOTH;
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
	private ImageSizePolicy(int value, String name, String literal) {
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
	
} //ImageSizePolicy
