/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.topology.ui;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mesh Presentation Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.gc.space.topology.ui.TopologyUIPackage#getMeshPresentationMode()
 * @model
 * @generated
 */
public enum MeshPresentationMode implements Enumerator {
	/**
	 * The '<em><b>POINTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POINTS_VALUE
	 * @generated
	 * @ordered
	 */
	POINTS(0, "POINTS", "POINTS"),

	/**
	 * The '<em><b>SURFACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURFACE_VALUE
	 * @generated
	 * @ordered
	 */
	SURFACE(1, "SURFACE", "SURFACE"),

	/**
	 * The '<em><b>WIREFRAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIREFRAME_VALUE
	 * @generated
	 * @ordered
	 */
	WIREFRAME(2, "WIREFRAME", "WIREFRAME");

	/**
	 * The '<em><b>POINTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POINTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POINTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POINTS_VALUE = 0;

	/**
	 * The '<em><b>SURFACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SURFACE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SURFACE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SURFACE_VALUE = 1;

	/**
	 * The '<em><b>WIREFRAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WIREFRAME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIREFRAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIREFRAME_VALUE = 2;

	/**
	 * An array of all the '<em><b>Mesh Presentation Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MeshPresentationMode[] VALUES_ARRAY =
		new MeshPresentationMode[] {
			POINTS,
			SURFACE,
			WIREFRAME,
		};

	/**
	 * A public read-only list of all the '<em><b>Mesh Presentation Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MeshPresentationMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mesh Presentation Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeshPresentationMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeshPresentationMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mesh Presentation Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeshPresentationMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeshPresentationMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mesh Presentation Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeshPresentationMode get(int value) {
		switch (value) {
			case POINTS_VALUE: return POINTS;
			case SURFACE_VALUE: return SURFACE;
			case WIREFRAME_VALUE: return WIREFRAME;
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
	private MeshPresentationMode(int value, String name, String literal) {
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
	
} //MeshPresentationMode
