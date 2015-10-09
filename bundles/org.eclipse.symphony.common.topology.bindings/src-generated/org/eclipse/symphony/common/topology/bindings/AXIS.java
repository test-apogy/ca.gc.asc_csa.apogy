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
 * A representation of the literals of the enumeration '<em><b>AXIS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * *
 * Cartesian Axis enumeration.
 * <!-- end-model-doc -->
 * @see org.eclipse.symphony.common.topology.bindings.TopologyBindingsPackage#getAXIS()
 * @model
 * @generated
 */
public enum AXIS implements Enumerator
{
  /**
	 * The '<em><b>XAXIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #XAXIS_VALUE
	 * @generated
	 * @ordered
	 */
  XAXIS(0, "X_AXIS", "X_AXIS"),

  /**
	 * The '<em><b>YAXIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #YAXIS_VALUE
	 * @generated
	 * @ordered
	 */
  YAXIS(1, "Y_AXIS", "Y_AXIS"),

  /**
	 * The '<em><b>ZAXIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #ZAXIS_VALUE
	 * @generated
	 * @ordered
	 */
  ZAXIS(2, "Z_AXIS", "Z_AXIS"), /**
	 * The '<em><b>MINUS XAXIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #MINUS_XAXIS_VALUE
	 * @generated
	 * @ordered
	 */
  MINUS_XAXIS(3, "MINUS_X_AXIS", "MINUS_X_AXIS"), /**
	 * The '<em><b>MINUS YAXIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #MINUS_YAXIS_VALUE
	 * @generated
	 * @ordered
	 */
  MINUS_YAXIS(4, "MINUS_Y_AXIS", "MINUS_Y_AXIS"), /**
	 * The '<em><b>MINUS ZAXIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #MINUS_ZAXIS_VALUE
	 * @generated
	 * @ordered
	 */
  MINUS_ZAXIS(5, "MINUS_Z_AXIS", "MINUS_Z_AXIS");

  /**
	 * The '<em><b>XAXIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>XAXIS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #XAXIS
	 * @model name="X_AXIS"
	 * @generated
	 * @ordered
	 */
  public static final int XAXIS_VALUE = 0;

  /**
	 * The '<em><b>YAXIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>YAXIS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #YAXIS
	 * @model name="Y_AXIS"
	 * @generated
	 * @ordered
	 */
  public static final int YAXIS_VALUE = 1;

  /**
	 * The '<em><b>ZAXIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ZAXIS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #ZAXIS
	 * @model name="Z_AXIS"
	 * @generated
	 * @ordered
	 */
  public static final int ZAXIS_VALUE = 2;

  /**
	 * The '<em><b>MINUS XAXIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MINUS XAXIS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #MINUS_XAXIS
	 * @model name="MINUS_X_AXIS"
	 * @generated
	 * @ordered
	 */
  public static final int MINUS_XAXIS_VALUE = 3;

  /**
	 * The '<em><b>MINUS YAXIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MINUS YAXIS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #MINUS_YAXIS
	 * @model name="MINUS_Y_AXIS"
	 * @generated
	 * @ordered
	 */
  public static final int MINUS_YAXIS_VALUE = 4;

  /**
	 * The '<em><b>MINUS ZAXIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MINUS ZAXIS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #MINUS_ZAXIS
	 * @model name="MINUS_Z_AXIS"
	 * @generated
	 * @ordered
	 */
  public static final int MINUS_ZAXIS_VALUE = 5;

  /**
	 * An array of all the '<em><b>AXIS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final AXIS[] VALUES_ARRAY =
    new AXIS[] {
			XAXIS,
			YAXIS,
			ZAXIS,
			MINUS_XAXIS,
			MINUS_YAXIS,
			MINUS_ZAXIS,
		};

  /**
	 * A public read-only list of all the '<em><b>AXIS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<AXIS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>AXIS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static AXIS get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AXIS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>AXIS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static AXIS getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AXIS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>AXIS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static AXIS get(int value)
  {
		switch (value) {
			case XAXIS_VALUE: return XAXIS;
			case YAXIS_VALUE: return YAXIS;
			case ZAXIS_VALUE: return ZAXIS;
			case MINUS_XAXIS_VALUE: return MINUS_XAXIS;
			case MINUS_YAXIS_VALUE: return MINUS_YAXIS;
			case MINUS_ZAXIS_VALUE: return MINUS_ZAXIS;
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
  private AXIS(int value, String name, String literal)
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
  
} //AXIS