/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ZCorrection Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Enumeration of available methods use to compute the correction along the Z axis.
 * <!-- end-model-doc -->
 * @see org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage#getZCorrectionMode()
 * @model
 * @generated
 */
public enum ZCorrectionMode implements Enumerator
{
  /**
	 * The '<em><b>Average Contact</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #AVERAGE_CONTACT_VALUE
	 * @generated
	 * @ordered
	 */
  AVERAGE_CONTACT(0, "AverageContact", "AverageContact"), /**
	 * The '<em><b>Highest Contact</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #HIGHEST_CONTACT_VALUE
	 * @generated
	 * @ordered
	 */
  HIGHEST_CONTACT(1, "HighestContact", "HighestContact"), /**
	 * The '<em><b>Lowest Contact</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #LOWEST_CONTACT_VALUE
	 * @generated
	 * @ordered
	 */
  LOWEST_CONTACT(2, "LowestContact", "LowestContact"), /**
	 * The '<em><b>No ZCorrection</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #NO_ZCORRECTION_VALUE
	 * @generated
	 * @ordered
	 */
  NO_ZCORRECTION(3, "NoZCorrection", "No Correction");

  /**
	 * The '<em><b>Average Contact</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Average Contact</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #AVERAGE_CONTACT
	 * @model name="AverageContact"
	 * @generated
	 * @ordered
	 */
  public static final int AVERAGE_CONTACT_VALUE = 0;

  /**
	 * The '<em><b>Highest Contact</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Highest Contact</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #HIGHEST_CONTACT
	 * @model name="HighestContact"
	 * @generated
	 * @ordered
	 */
  public static final int HIGHEST_CONTACT_VALUE = 1;

  /**
	 * The '<em><b>Lowest Contact</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Lowest Contact</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #LOWEST_CONTACT
	 * @model name="LowestContact"
	 * @generated
	 * @ordered
	 */
  public static final int LOWEST_CONTACT_VALUE = 2;

  /**
	 * The '<em><b>No ZCorrection</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>No ZCorrection</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #NO_ZCORRECTION
	 * @model name="NoZCorrection" literal="No Correction"
	 * @generated
	 * @ordered
	 */
  public static final int NO_ZCORRECTION_VALUE = 3;

  /**
	 * An array of all the '<em><b>ZCorrection Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final ZCorrectionMode[] VALUES_ARRAY =
    new ZCorrectionMode[] {
			AVERAGE_CONTACT,
			HIGHEST_CONTACT,
			LOWEST_CONTACT,
			NO_ZCORRECTION,
		};

  /**
	 * A public read-only list of all the '<em><b>ZCorrection Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<ZCorrectionMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>ZCorrection Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static ZCorrectionMode get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ZCorrectionMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>ZCorrection Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static ZCorrectionMode getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ZCorrectionMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>ZCorrection Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static ZCorrectionMode get(int value)
  {
		switch (value) {
			case AVERAGE_CONTACT_VALUE: return AVERAGE_CONTACT;
			case HIGHEST_CONTACT_VALUE: return HIGHEST_CONTACT;
			case LOWEST_CONTACT_VALUE: return LOWEST_CONTACT;
			case NO_ZCORRECTION_VALUE: return NO_ZCORRECTION;
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
  private ZCorrectionMode(int value, String name, String literal)
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
  
} //ZCorrectionMode
