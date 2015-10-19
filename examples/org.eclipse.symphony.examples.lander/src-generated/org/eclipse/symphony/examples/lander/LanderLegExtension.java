/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lander;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Lander Leg Extension</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This enumeration is used to define the possible levels
 * of extension that the lander's legs can have.
 * <!-- end-model-doc -->
 * @see org.eclipse.symphony.examples.lander.EMFEcoreExampleLanderPackage#getLanderLegExtension()
 * @model
 * @generated
 */
public enum LanderLegExtension implements Enumerator
{
  /**
	 * The '<em><b>Leg Position1</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #LEG_POSITION1_VALUE
	 * @generated
	 * @ordered
	 */
  LEG_POSITION1(0, "LegPosition1", "Position 1"),

  /**
	 * The '<em><b>Leg Position2</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #LEG_POSITION2_VALUE
	 * @generated
	 * @ordered
	 */
  LEG_POSITION2(100, "LegPosition2", "Position 2"),

  /**
	 * The '<em><b>Leg Position3</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #LEG_POSITION3_VALUE
	 * @generated
	 * @ordered
	 */
  LEG_POSITION3(200, "LegPosition3", "Position 3"),

  /**
	 * The '<em><b>Leg Position4</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #LEG_POSITION4_VALUE
	 * @generated
	 * @ordered
	 */
  LEG_POSITION4(300, "LegPosition4", "Position 4");

  /**
	 * The '<em><b>Leg Position1</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Leg Position1</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines a lander leg position in which the
	 * leg is not extended at all.
	 * @see #LegPosition2
	 * @see #LegPosition3
	 * @see #LegPosition4
	 * <!-- end-model-doc -->
	 * @see #LEG_POSITION1
	 * @model name="LegPosition1" literal="Position 1"
	 * @generated
	 * @ordered
	 */
  public static final int LEG_POSITION1_VALUE = 0;

  /**
	 * The '<em><b>Leg Position2</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Leg Position2</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines a lander leg position in which the
	 * leg is extended a third of a full possible extension.
	 * @see #LegPosition1
	 * @see #LegPosition3
	 * @see #LegPosition4
	 * <!-- end-model-doc -->
	 * @see #LEG_POSITION2
	 * @model name="LegPosition2" literal="Position 2"
	 * @generated
	 * @ordered
	 */
  public static final int LEG_POSITION2_VALUE = 100;

  /**
	 * The '<em><b>Leg Position3</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Leg Position3</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines a lander leg position in which the
	 * leg is extended two-thirds of a full possible extension.
	 * @see #LegPosition1
	 * @see #LegPosition2
	 * @see #LegPosition4
	 * <!-- end-model-doc -->
	 * @see #LEG_POSITION3
	 * @model name="LegPosition3" literal="Position 3"
	 * @generated
	 * @ordered
	 */
  public static final int LEG_POSITION3_VALUE = 200;

  /**
	 * The '<em><b>Leg Position4</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Leg Position4</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines a lander leg position in which the
	 * leg is completely extended.
	 * @see #LegPosition1
	 * @see #LegPosition2
	 * @see #LegPosition3
	 * <!-- end-model-doc -->
	 * @see #LEG_POSITION4
	 * @model name="LegPosition4" literal="Position 4"
	 * @generated
	 * @ordered
	 */
  public static final int LEG_POSITION4_VALUE = 300;

  /**
	 * An array of all the '<em><b>Lander Leg Extension</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final LanderLegExtension[] VALUES_ARRAY =
    new LanderLegExtension[] {
			LEG_POSITION1,
			LEG_POSITION2,
			LEG_POSITION3,
			LEG_POSITION4,
		};

  /**
	 * A public read-only list of all the '<em><b>Lander Leg Extension</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<LanderLegExtension> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Lander Leg Extension</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static LanderLegExtension get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LanderLegExtension result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Lander Leg Extension</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static LanderLegExtension getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LanderLegExtension result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Lander Leg Extension</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static LanderLegExtension get(int value)
  {
		switch (value) {
			case LEG_POSITION1_VALUE: return LEG_POSITION1;
			case LEG_POSITION2_VALUE: return LEG_POSITION2;
			case LEG_POSITION3_VALUE: return LEG_POSITION3;
			case LEG_POSITION4_VALUE: return LEG_POSITION4;
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
  private LanderLegExtension(int value, String name, String literal)
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
  
} //LanderLegExtension
