/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.earth;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Eclipse Event Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Eclipse Event Type.
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getEclipseEventType()
 * @model
 * @generated
 */
public enum EclipseEventType implements Enumerator {
	/**
	 * The '<em><b>PENUMBRA ENTRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENUMBRA_ENTRY_VALUE
	 * @generated
	 * @ordered
	 */
	PENUMBRA_ENTRY(0, "PENUMBRA_ENTRY", "Penumbra Entry"),

	/**
	 * The '<em><b>PENUMBRA EXIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENUMBRA_EXIT_VALUE
	 * @generated
	 * @ordered
	 */
	PENUMBRA_EXIT(1, "PENUMBRA_EXIT", "Penumbra Exit"),

	/**
	 * The '<em><b>UMBRA ENTRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UMBRA_ENTRY_VALUE
	 * @generated
	 * @ordered
	 */
	UMBRA_ENTRY(2, "UMBRA_ENTRY", "Umbra Entry"),

	/**
	 * The '<em><b>UMBRA EXIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UMBRA_EXIT_VALUE
	 * @generated
	 * @ordered
	 */
	UMBRA_EXIT(3, "UMBRA_EXIT", "Umbra Exit");

	/**
	 * The '<em><b>PENUMBRA ENTRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PENUMBRA ENTRY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PENUMBRA_ENTRY
	 * @model literal="Penumbra Entry"
	 * @generated
	 * @ordered
	 */
	public static final int PENUMBRA_ENTRY_VALUE = 0;

	/**
	 * The '<em><b>PENUMBRA EXIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PENUMBRA EXIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PENUMBRA_EXIT
	 * @model literal="Penumbra Exit"
	 * @generated
	 * @ordered
	 */
	public static final int PENUMBRA_EXIT_VALUE = 1;

	/**
	 * The '<em><b>UMBRA ENTRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UMBRA ENTRY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UMBRA_ENTRY
	 * @model literal="Umbra Entry"
	 * @generated
	 * @ordered
	 */
	public static final int UMBRA_ENTRY_VALUE = 2;

	/**
	 * The '<em><b>UMBRA EXIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UMBRA EXIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UMBRA_EXIT
	 * @model literal="Umbra Exit"
	 * @generated
	 * @ordered
	 */
	public static final int UMBRA_EXIT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Eclipse Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EclipseEventType[] VALUES_ARRAY =
		new EclipseEventType[] {
			PENUMBRA_ENTRY,
			PENUMBRA_EXIT,
			UMBRA_ENTRY,
			UMBRA_EXIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Eclipse Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EclipseEventType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Eclipse Event Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EclipseEventType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EclipseEventType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eclipse Event Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EclipseEventType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EclipseEventType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eclipse Event Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EclipseEventType get(int value) {
		switch (value) {
			case PENUMBRA_ENTRY_VALUE: return PENUMBRA_ENTRY;
			case PENUMBRA_EXIT_VALUE: return PENUMBRA_EXIT;
			case UMBRA_ENTRY_VALUE: return UMBRA_ENTRY;
			case UMBRA_EXIT_VALUE: return UMBRA_EXIT;
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
	private EclipseEventType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EclipseEventType
