/**
 * Canadian Space Agency 2008.
 *
 * $Id: DelaunayMesher.java,v 1.2.4.2 2015/05/21 15:50:48 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delaunay Mesher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.DelaunayMesher#getTolerance <em>Tolerance</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.DelaunayMesher#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.DelaunayMesher#getOffset <em>Offset</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.DelaunayMesher#isBoundingTriangulation <em>Bounding Triangulation</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.DelaunayMesher#getMeshingPlane <em>Meshing Plane</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getDelaunayMesher()
 * @model
 * @generated
 */
public interface DelaunayMesher extends CartesianPositionCoordinatesMesher {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

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
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getDelaunayMesher_Tolerance()
	 * @model
	 * @generated
	 */
	double getTolerance();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.DelaunayMesher#getTolerance <em>Tolerance</em>}' attribute.
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
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getDelaunayMesher_Alpha()
	 * @model
	 * @generated
	 */
	double getAlpha();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.DelaunayMesher#getAlpha <em>Alpha</em>}' attribute.
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
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getDelaunayMesher_Offset()
	 * @model default="0.75"
	 * @generated
	 */
	double getOffset();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.DelaunayMesher#getOffset <em>Offset</em>}' attribute.
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
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getDelaunayMesher_BoundingTriangulation()
	 * @model
	 * @generated
	 */
	boolean isBoundingTriangulation();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.DelaunayMesher#isBoundingTriangulation <em>Bounding Triangulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounding Triangulation</em>' attribute.
	 * @see #isBoundingTriangulation()
	 * @generated
	 */
	void setBoundingTriangulation(boolean value);

	/**
	 * Returns the value of the '<em><b>Meshing Plane</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.space.mrt.geometry.data3d.MESHING_PLANE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meshing Plane</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meshing Plane</em>' attribute.
	 * @see ca.gc.space.mrt.geometry.data3d.MESHING_PLANE
	 * @see #setMeshingPlane(MESHING_PLANE)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getDelaunayMesher_MeshingPlane()
	 * @model
	 * @generated
	 */
	MESHING_PLANE getMeshingPlane();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.DelaunayMesher#getMeshingPlane <em>Meshing Plane</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meshing Plane</em>' attribute.
	 * @see ca.gc.space.mrt.geometry.data3d.MESHING_PLANE
	 * @see #getMeshingPlane()
	 * @generated
	 */
	void setMeshingPlane(MESHING_PLANE value);

} // DelaunayMesher
