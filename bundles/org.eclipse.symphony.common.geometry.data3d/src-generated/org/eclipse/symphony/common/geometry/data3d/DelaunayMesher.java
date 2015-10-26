/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delaunay Mesher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.DelaunayMesher#getTolerance <em>Tolerance</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.DelaunayMesher#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.DelaunayMesher#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.DelaunayMesher#isBoundingTriangulation <em>Bounding Triangulation</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.DelaunayMesher#getMeshingPlane <em>Meshing Plane</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getDelaunayMesher()
 * @model
 * @generated
 */
public interface DelaunayMesher extends CartesianPositionCoordinatesMesher {
	/**
	 * Returns the value of the '<em><b>Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tolerance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tolerance</em>' attribute.
	 * @see #setTolerance(double)
	 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getDelaunayMesher_Tolerance()
	 * @model unique="false"
	 * @generated
	 */
	double getTolerance();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.DelaunayMesher#getTolerance <em>Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tolerance</em>' attribute.
	 * @see #getTolerance()
	 * @generated
	 */
	void setTolerance(double value);

	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' attribute.
	 * @see #setAlpha(double)
	 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getDelaunayMesher_Alpha()
	 * @model unique="false"
	 * @generated
	 */
	double getAlpha();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.DelaunayMesher#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(double value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * The default value is <code>"0.75"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(double)
	 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getDelaunayMesher_Offset()
	 * @model default="0.75" unique="false"
	 * @generated
	 */
	double getOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.DelaunayMesher#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(double value);

	/**
	 * Returns the value of the '<em><b>Bounding Triangulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounding Triangulation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounding Triangulation</em>' attribute.
	 * @see #setBoundingTriangulation(boolean)
	 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getDelaunayMesher_BoundingTriangulation()
	 * @model unique="false"
	 * @generated
	 */
	boolean isBoundingTriangulation();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.DelaunayMesher#isBoundingTriangulation <em>Bounding Triangulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounding Triangulation</em>' attribute.
	 * @see #isBoundingTriangulation()
	 * @generated
	 */
	void setBoundingTriangulation(boolean value);

	/**
	 * Returns the value of the '<em><b>Meshing Plane</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.symphony.common.geometry.data3d.CartesianPlane}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meshing Plane</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meshing Plane</em>' attribute.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianPlane
	 * @see #setMeshingPlane(CartesianPlane)
	 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getDelaunayMesher_MeshingPlane()
	 * @model unique="false"
	 * @generated
	 */
	CartesianPlane getMeshingPlane();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.DelaunayMesher#getMeshingPlane <em>Meshing Plane</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meshing Plane</em>' attribute.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianPlane
	 * @see #getMeshingPlane()
	 * @generated
	 */
	void setMeshingPlane(CartesianPlane value);

} // DelaunayMesher
