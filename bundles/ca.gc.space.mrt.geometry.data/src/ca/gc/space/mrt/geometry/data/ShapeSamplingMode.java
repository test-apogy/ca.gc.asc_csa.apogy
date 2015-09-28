/**
 * Canadian Space Agency 2008
 *
 * $Id: ShapeSamplingMode.java,v 1.5.4.2 2015/05/21 15:50:05 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Shape Sampling Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.geometry.data.DataPackage#getShapeSamplingMode()
 * @model
 * @generated
 */
public enum ShapeSamplingMode implements Enumerator
{
	/**
	 * The '<em><b>UNION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNION_VALUE
	 * @generated
	 * @ordered
	 */
	UNION(0, "UNION", "UNION"),

	/**
	 * The '<em><b>INTERSECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERSECTION_VALUE
	 * @generated
	 * @ordered
	 */
	INTERSECTION(1, "INTERSECTION", "INTERSECTION");

	/**
	 * The '<em><b>UNION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNION_VALUE = 0;

	/**
	 * The '<em><b>INTERSECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERSECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERSECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERSECTION_VALUE = 1;

	/**
	 * An array of all the '<em><b>Shape Sampling Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ShapeSamplingMode[] VALUES_ARRAY =
		new ShapeSamplingMode[] {
			UNION,
			INTERSECTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Shape Sampling Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ShapeSamplingMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Shape Sampling Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShapeSamplingMode get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ShapeSamplingMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Shape Sampling Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShapeSamplingMode getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ShapeSamplingMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Shape Sampling Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShapeSamplingMode get(int value)
	{
		switch (value) {
			case UNION_VALUE: return UNION;
			case INTERSECTION_VALUE: return INTERSECTION;
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
	private ShapeSamplingMode(int value, String name, String literal)
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
	
} //ShapeSamplingMode
