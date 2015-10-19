/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d;

import java.util.List;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Point Cloud</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.NormalPointCloud#getPoints <em>Points</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.NormalPointCloud#getNormals <em>Normals</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.geometry.data3d.Data3dPackage#getNormalPointCloud()
 * @model
 * @generated
 */
public interface NormalPointCloud extends EObject {
	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(List)
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dPackage#getNormalPointCloud_Points()
	 * @model unique="false" dataType="org.eclipse.symphony.common.geometry.data3d.List<org.eclipse.symphony.common.geometry.data3d.Point3d>" many="false"
	 * @generated
	 */
	List<Point3d> getPoints();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.NormalPointCloud#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(List<Point3d> value);

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
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dPackage#getNormalPointCloud_Normals()
	 * @model unique="false" dataType="org.eclipse.symphony.common.geometry.data3d.List<org.eclipse.symphony.common.geometry.data3d.Vector3d>" many="false"
	 * @generated
	 */
	List<Vector3d> getNormals();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.NormalPointCloud#getNormals <em>Normals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normals</em>' attribute.
	 * @see #getNormals()
	 * @generated
	 */
	void setNormals(List<Vector3d> value);

} // NormalPointCloud
