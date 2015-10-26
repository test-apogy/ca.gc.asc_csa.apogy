/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.bindings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ANGLE UNITS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * *
 * Angle Units Enumeration.
 * <!-- end-model-doc -->
 * @see org.eclipse.symphony.common.topology.bindings.TopologyBindingsPackage#getANGLE_UNITS()
 * @model
 * @generated
 */
public enum ANGLE_UNITS implements Enumerator
{
  /**
	 * The '<em><b>RADIANS</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #RADIANS_VALUE
	 * @generated
	 * @ordered
	 */
  RADIANS(0, "RADIANS", "RADIANS"),

  /**
	 * The '<em><b>DEGREES</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #DEGREES_VALUE
	 * @generated
	 * @ordered
	 */
  DEGREES(1, "DEGREES", "DEGREES");

  /**
	 * The '<em><b>RADIANS</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RADIANS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #RADIANS
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int RADIANS_VALUE = 0;

  /**
	 * The '<em><b>DEGREES</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DEGREES</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #DEGREES
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int DEGREES_VALUE = 1;

  /**
	 * An array of all the '<em><b>ANGLE UNITS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final ANGLE_UNITS[] VALUES_ARRAY =
    new ANGLE_UNITS[] {
			RADIANS,
			DEGREES,
		};

  /**
	 * A public read-only list of all the '<em><b>ANGLE UNITS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<ANGLE_UNITS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>ANGLE UNITS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static ANGLE_UNITS get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ANGLE_UNITS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>ANGLE UNITS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static ANGLE_UNITS getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ANGLE_UNITS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>ANGLE UNITS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static ANGLE_UNITS get(int value)
  {
		switch (value) {
			case RADIANS_VALUE: return RADIANS;
			case DEGREES_VALUE: return DEGREES;
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
  private ANGLE_UNITS(int value, String name, String literal)
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
  
} //ANGLE_UNITS
