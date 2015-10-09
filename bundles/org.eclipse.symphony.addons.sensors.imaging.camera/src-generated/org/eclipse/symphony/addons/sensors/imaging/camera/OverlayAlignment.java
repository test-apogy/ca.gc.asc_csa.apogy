/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Overlay Alignment</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage#getOverlayAlignment()
 * @model
 * @generated
 */
public enum OverlayAlignment implements Enumerator
{
  /**
	 * The '<em><b>CENTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #CENTER_VALUE
	 * @generated
	 * @ordered
	 */
  CENTER(1, "CENTER", "Center"),

  /**
	 * The '<em><b>LOWER LEFT CORNER</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #LOWER_LEFT_CORNER_VALUE
	 * @generated
	 * @ordered
	 */
  LOWER_LEFT_CORNER(2, "LOWER_LEFT_CORNER", "Lower Left"),

  /**
	 * The '<em><b>UPPER LEFT CORNER</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #UPPER_LEFT_CORNER_VALUE
	 * @generated
	 * @ordered
	 */
  UPPER_LEFT_CORNER(3, "UPPER_LEFT_CORNER", "Upper Left"),

  /**
	 * The '<em><b>LOWER RIGHT CORNER</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #LOWER_RIGHT_CORNER_VALUE
	 * @generated
	 * @ordered
	 */
  LOWER_RIGHT_CORNER(4, "LOWER_RIGHT_CORNER", "Lower Right"),

  /**
	 * The '<em><b>UPPER RIGHT CORNER</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #UPPER_RIGHT_CORNER_VALUE
	 * @generated
	 * @ordered
	 */
  UPPER_RIGHT_CORNER(5, "UPPER_RIGHT_CORNER", "Upper Right");

  /**
	 * The '<em><b>CENTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CENTER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #CENTER
	 * @model literal="Center"
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
	 * @model literal="Lower Left"
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
	 * @model literal="Upper Left"
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
	 * @model literal="Lower Right"
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
	 * @model literal="Upper Right"
	 * @generated
	 * @ordered
	 */
  public static final int UPPER_RIGHT_CORNER_VALUE = 5;

  /**
	 * An array of all the '<em><b>Overlay Alignment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final OverlayAlignment[] VALUES_ARRAY =
    new OverlayAlignment[] {
			CENTER,
			LOWER_LEFT_CORNER,
			UPPER_LEFT_CORNER,
			LOWER_RIGHT_CORNER,
			UPPER_RIGHT_CORNER,
		};

  /**
	 * A public read-only list of all the '<em><b>Overlay Alignment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<OverlayAlignment> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Overlay Alignment</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static OverlayAlignment get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OverlayAlignment result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Overlay Alignment</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static OverlayAlignment getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OverlayAlignment result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Overlay Alignment</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static OverlayAlignment get(int value)
  {
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
  private OverlayAlignment(int value, String name, String literal)
  {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getValue()
  {
	  return value;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
	  return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getLiteral()
  {
	  return literal;
	}

  /**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		return literal;
	}
  
} //OverlayAlignment
