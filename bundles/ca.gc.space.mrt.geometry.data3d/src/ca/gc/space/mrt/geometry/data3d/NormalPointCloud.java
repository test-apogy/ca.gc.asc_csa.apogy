/**
 * Canadian Space Agency 2008.
 *
 * $Id: NormalPointCloud.java,v 1.3.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d;

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
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.NormalPointCloud#getPoints <em>Points</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.NormalPointCloud#getNormals <em>Normals</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getNormalPointCloud()
 * @model
 * @generated
 */
public interface NormalPointCloud extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

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
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getNormalPointCloud_Points()
	 * @model dataType="ca.gc.space.mrt.geometry.data.List<ca.gc.space.mrt.geometry.data3d.Point3d>" many="false"
	 * @generated
	 */
	List<Point3d> getPoints();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.NormalPointCloud#getPoints <em>Points</em>}' attribute.
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
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getNormalPointCloud_Normals()
	 * @model dataType="ca.gc.space.mrt.geometry.data.List<ca.gc.space.mrt.geometry.data.Vector3d>" many="false"
	 * @generated
	 */
	List<Vector3d> getNormals();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.NormalPointCloud#getNormals <em>Normals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normals</em>' attribute.
	 * @see #getNormals()
	 * @generated
	 */
	void setNormals(List<Vector3d> value);

} // NormalPointCloud
