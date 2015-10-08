/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.space.mrt.geometry.data;

import java.util.List;

import javax.vecmath.Vector3d;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinates Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data.CoordinatesSet#getPoints <em>Points</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data.CoordinatesSet#getNormals <em>Normals</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data.DataPackage#getCoordinatesSet()
 * @model
 * @generated
 */
public interface CoordinatesSet<T extends Coordinates> extends EObject {
	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' containment reference list.
	 * @see ca.gc.space.mrt.geometry.data.DataPackage#getCoordinatesSet_Points()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<T> getPoints();

	/**
	 * Returns the value of the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normals</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normals</em>' attribute.
	 * @see #setNormals(List)
	 * @see ca.gc.space.mrt.geometry.data.DataPackage#getCoordinatesSet_Normals()
	 * @model unique="false" dataType="ca.gc.space.mrt.geometry.data.List<ca.gc.space.mrt.geometry.data.Vector3d>" many="false" transient="true"
	 * @generated
	 */
	List<Vector3d> getNormals();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data.CoordinatesSet#getNormals <em>Normals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normals</em>' attribute.
	 * @see #getNormals()
	 * @generated
	 */
	void setNormals(List<Vector3d> value);

} // CoordinatesSet
