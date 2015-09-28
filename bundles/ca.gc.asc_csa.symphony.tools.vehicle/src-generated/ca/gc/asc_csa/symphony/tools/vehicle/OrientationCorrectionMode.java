/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.vehicle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Orientation Correction Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Enumeration of available methods use to compute the orientation correction.
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.symphony.tools.vehicle.SymphonyToolsVehiclePackage#getOrientationCorrectionMode()
 * @model
 * @generated
 */
public enum OrientationCorrectionMode implements Enumerator
{
  /**
	 * The '<em><b>Least Square Plane Correction</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #LEAST_SQUARE_PLANE_CORRECTION_VALUE
	 * @generated
	 * @ordered
	 */
  LEAST_SQUARE_PLANE_CORRECTION(0, "LeastSquarePlaneCorrection", "Least Square Plane"), /**
	 * The '<em><b>No Orientation Correction</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #NO_ORIENTATION_CORRECTION_VALUE
	 * @generated
	 * @ordered
	 */
  NO_ORIENTATION_CORRECTION(1, "NoOrientationCorrection", "No Correction");

  /**
	 * The '<em><b>Least Square Plane Correction</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Least Square Plane Correction</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #LEAST_SQUARE_PLANE_CORRECTION
	 * @model name="LeastSquarePlaneCorrection" literal="Least Square Plane"
	 * @generated
	 * @ordered
	 */
  public static final int LEAST_SQUARE_PLANE_CORRECTION_VALUE = 0;

  /**
	 * The '<em><b>No Orientation Correction</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>No Orientation Correction</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #NO_ORIENTATION_CORRECTION
	 * @model name="NoOrientationCorrection" literal="No Correction"
	 * @generated
	 * @ordered
	 */
  public static final int NO_ORIENTATION_CORRECTION_VALUE = 1;

  /**
	 * An array of all the '<em><b>Orientation Correction Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final OrientationCorrectionMode[] VALUES_ARRAY =
    new OrientationCorrectionMode[] {
			LEAST_SQUARE_PLANE_CORRECTION,
			NO_ORIENTATION_CORRECTION,
		};

  /**
	 * A public read-only list of all the '<em><b>Orientation Correction Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<OrientationCorrectionMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Orientation Correction Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static OrientationCorrectionMode get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrientationCorrectionMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Orientation Correction Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static OrientationCorrectionMode getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrientationCorrectionMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Orientation Correction Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static OrientationCorrectionMode get(int value)
  {
		switch (value) {
			case LEAST_SQUARE_PLANE_CORRECTION_VALUE: return LEAST_SQUARE_PLANE_CORRECTION;
			case NO_ORIENTATION_CORRECTION_VALUE: return NO_ORIENTATION_CORRECTION;
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
  private OrientationCorrectionMode(int value, String name, String literal)
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
  
} //OrientationCorrectionMode
