/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.vehicle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Wheel Contact Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Enumeration of available model of wheel to Mesh contact.
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getWheelContactMode()
 * @model
 * @generated
 */
public enum WheelContactMode implements Enumerator
{
  /**
	 * The '<em><b>Point Wheel Contact</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #POINT_WHEEL_CONTACT_VALUE
	 * @generated
	 * @ordered
	 */
  POINT_WHEEL_CONTACT(0, "PointWheelContact", "Point Wheel"),

  /**
	 * The '<em><b>Cylindrical Wheel Contact</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #CYLINDRICAL_WHEEL_CONTACT_VALUE
	 * @generated
	 * @ordered
	 */
  CYLINDRICAL_WHEEL_CONTACT(1, "CylindricalWheelContact", "Cylindrical Wheel");

  /**
	 * The '<em><b>Point Wheel Contact</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Point Wheel Contact</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #POINT_WHEEL_CONTACT
	 * @model name="PointWheelContact" literal="Point Wheel"
	 * @generated
	 * @ordered
	 */
  public static final int POINT_WHEEL_CONTACT_VALUE = 0;

  /**
	 * The '<em><b>Cylindrical Wheel Contact</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Cylindrical Wheel Contact</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #CYLINDRICAL_WHEEL_CONTACT
	 * @model name="CylindricalWheelContact" literal="Cylindrical Wheel"
	 * @generated
	 * @ordered
	 */
  public static final int CYLINDRICAL_WHEEL_CONTACT_VALUE = 1;

  /**
	 * An array of all the '<em><b>Wheel Contact Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final WheelContactMode[] VALUES_ARRAY =
    new WheelContactMode[] {
			POINT_WHEEL_CONTACT,
			CYLINDRICAL_WHEEL_CONTACT,
		};

  /**
	 * A public read-only list of all the '<em><b>Wheel Contact Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<WheelContactMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Wheel Contact Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static WheelContactMode get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WheelContactMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Wheel Contact Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static WheelContactMode getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WheelContactMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Wheel Contact Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static WheelContactMode get(int value)
  {
		switch (value) {
			case POINT_WHEEL_CONTACT_VALUE: return POINT_WHEEL_CONTACT;
			case CYLINDRICAL_WHEEL_CONTACT_VALUE: return CYLINDRICAL_WHEEL_CONTACT;
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
  private WheelContactMode(int value, String name, String literal)
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
  
} //WheelContactMode
