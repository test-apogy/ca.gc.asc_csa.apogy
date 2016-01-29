/**
 */
package ca.gc.asc_csa.apogy.common.emf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ranges</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * *
 * Ranges Definition
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getRanges()
 * @model
 * @generated
 */
public enum Ranges implements Enumerator
{
  /**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
  UNKNOWN(0, "UNKNOWN", "UNKNOWN"),

  /**
	 * The '<em><b>NOMINAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #NOMINAL_VALUE
	 * @generated
	 * @ordered
	 */
  NOMINAL(1, "NOMINAL", "NOMINAL"),

  /**
	 * The '<em><b>WARNING</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #WARNING_VALUE
	 * @generated
	 * @ordered
	 */
  WARNING(2, "WARNING", "WARNING"),

  /**
	 * The '<em><b>ALARM</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #ALARM_VALUE
	 * @generated
	 * @ordered
	 */
  ALARM(3, "ALARM", "ALARM"),

  /**
	 * The '<em><b>OUT OF RANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #OUT_OF_RANGE_VALUE
	 * @generated
	 * @ordered
	 */
  OUT_OF_RANGE(4, "OUT_OF_RANGE", "OUT_OF_RANGE");

  /**
	 * The '<em><b>UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UNKNOWN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int UNKNOWN_VALUE = 0;

  /**
	 * The '<em><b>NOMINAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NOMINAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #NOMINAL
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int NOMINAL_VALUE = 1;

  /**
	 * The '<em><b>WARNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WARNING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #WARNING
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int WARNING_VALUE = 2;

  /**
	 * The '<em><b>ALARM</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ALARM</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #ALARM
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int ALARM_VALUE = 3;

  /**
	 * The '<em><b>OUT OF RANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>OUT OF RANGE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #OUT_OF_RANGE
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int OUT_OF_RANGE_VALUE = 4;

  /**
	 * An array of all the '<em><b>Ranges</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final Ranges[] VALUES_ARRAY =
    new Ranges[] {
			UNKNOWN,
			NOMINAL,
			WARNING,
			ALARM,
			OUT_OF_RANGE,
		};

  /**
	 * A public read-only list of all the '<em><b>Ranges</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<Ranges> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Ranges</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static Ranges get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Ranges result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Ranges</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static Ranges getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Ranges result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Ranges</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static Ranges get(int value)
  {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case NOMINAL_VALUE: return NOMINAL;
			case WARNING_VALUE: return WARNING;
			case ALARM_VALUE: return ALARM;
			case OUT_OF_RANGE_VALUE: return OUT_OF_RANGE;
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
  private Ranges(int value, String name, String literal)
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
  
} //Ranges
