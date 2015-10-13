/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.recordings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recording Policy</b></em>'.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * RecordingPolicy
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getRecordingPolicy()
 * @model
 * @generated
 */
public enum RecordingPolicy implements Enumerator
{
  /**
	 * The '<em><b>On Change</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #ON_CHANGE_VALUE
	 * @generated
	 * @ordered
	 */
  ON_CHANGE(0, "OnChange", "On Change"),
  /**
	 * The '<em><b>Fixed Period</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #FIXED_PERIOD_VALUE
	 * @generated
	 * @ordered
	 */
  FIXED_PERIOD(1, "FixedPeriod", "Fixed Period");
  /**
	 * The '<em><b>On Change</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>On Change</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Record value when it changes.
	 * <!-- end-model-doc -->
	 * @see #ON_CHANGE
	 * @model name="OnChange" literal="On Change"
	 * @generated
	 * @ordered
	 */
  public static final int ON_CHANGE_VALUE = 0;

  /**
	 * The '<em><b>Fixed Period</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Fixed Period</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Record value at fixed intervals.
	 * <!-- end-model-doc -->
	 * @see #FIXED_PERIOD
	 * @model name="FixedPeriod" literal="Fixed Period"
	 * @generated
	 * @ordered
	 */
  public static final int FIXED_PERIOD_VALUE = 1;

  /**
	 * An array of all the '<em><b>Recording Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final RecordingPolicy[] VALUES_ARRAY =
    new RecordingPolicy[] {
			ON_CHANGE,
			FIXED_PERIOD,
		};

  /**
	 * A public read-only list of all the '<em><b>Recording Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<RecordingPolicy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Recording Policy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static RecordingPolicy get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RecordingPolicy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Recording Policy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static RecordingPolicy getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RecordingPolicy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Recording Policy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static RecordingPolicy get(int value)
  {
		switch (value) {
			case ON_CHANGE_VALUE: return ON_CHANGE;
			case FIXED_PERIOD_VALUE: return FIXED_PERIOD;
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
  private RecordingPolicy(int value, String name, String literal)
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
}
