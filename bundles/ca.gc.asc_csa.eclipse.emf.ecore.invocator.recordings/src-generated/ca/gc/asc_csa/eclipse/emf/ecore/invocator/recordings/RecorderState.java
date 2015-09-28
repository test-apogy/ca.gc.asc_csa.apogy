/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Recorder State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.EMFEcoreInvocatorRecordingsPackage#getRecorderState()
 * @model
 * @generated
 */
public enum RecorderState implements Enumerator
{
  /**
	 * The '<em><b>STOPPED</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #STOPPED_VALUE
	 * @generated
	 * @ordered
	 */
  STOPPED(0, "STOPPED", "Stopped"),

  /**
	 * The '<em><b>RECORDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #RECORDING_VALUE
	 * @generated
	 * @ordered
	 */
  RECORDING(1, "RECORDING", "Recording"), /**
	 * The '<em><b>PAUSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #PAUSED_VALUE
	 * @generated
	 * @ordered
	 */
  PAUSED(2, "PAUSED", "Paused");

  /**
	 * The '<em><b>STOPPED</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STOPPED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #STOPPED
	 * @model literal="Stopped"
	 * @generated
	 * @ordered
	 */
  public static final int STOPPED_VALUE = 0;

  /**
	 * The '<em><b>RECORDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RECORDING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #RECORDING
	 * @model literal="Recording"
	 * @generated
	 * @ordered
	 */
  public static final int RECORDING_VALUE = 1;

  /**
	 * The '<em><b>PAUSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PAUSED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #PAUSED
	 * @model literal="Paused"
	 * @generated
	 * @ordered
	 */
  public static final int PAUSED_VALUE = 2;

  /**
	 * An array of all the '<em><b>Recorder State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final RecorderState[] VALUES_ARRAY =
    new RecorderState[] {
			STOPPED,
			RECORDING,
			PAUSED,
		};

  /**
	 * A public read-only list of all the '<em><b>Recorder State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<RecorderState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Recorder State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static RecorderState get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RecorderState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Recorder State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static RecorderState getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RecorderState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Recorder State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static RecorderState get(int value)
  {
		switch (value) {
			case STOPPED_VALUE: return STOPPED;
			case RECORDING_VALUE: return RECORDING;
			case PAUSED_VALUE: return PAUSED;
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
  private RecorderState(int value, String name, String literal)
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
  
} //RecorderState
