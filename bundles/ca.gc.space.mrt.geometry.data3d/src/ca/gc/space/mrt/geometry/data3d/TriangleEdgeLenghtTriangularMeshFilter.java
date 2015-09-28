/**
 * Canadian Space Agency 2008.
 */
package ca.gc.space.mrt.geometry.data3d;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triangle Edge Lenght Triangular Mesh Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.TriangleEdgeLenghtTriangularMeshFilter#getMinimumRange <em>Minimum Range</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.TriangleEdgeLenghtTriangularMeshFilter#getMaximumRange <em>Maximum Range</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.TriangleEdgeLenghtTriangularMeshFilter#getMaximumEdgeLenght <em>Maximum Edge Lenght</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getTriangleEdgeLenghtTriangularMeshFilter()
 * @model
 * @generated
 */
public interface TriangleEdgeLenghtTriangularMeshFilter extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

	/**
	 * Returns the value of the '<em><b>Minimum Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Range</em>' attribute.
	 * @see #setMinimumRange(double)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getTriangleEdgeLenghtTriangularMeshFilter_MinimumRange()
	 * @model
	 * @generated
	 */
	double getMinimumRange();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.TriangleEdgeLenghtTriangularMeshFilter#getMinimumRange <em>Minimum Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Range</em>' attribute.
	 * @see #getMinimumRange()
	 * @generated
	 */
	void setMinimumRange(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Range</em>' attribute.
	 * @see #setMaximumRange(double)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getTriangleEdgeLenghtTriangularMeshFilter_MaximumRange()
	 * @model
	 * @generated
	 */
	double getMaximumRange();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.TriangleEdgeLenghtTriangularMeshFilter#getMaximumRange <em>Maximum Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Range</em>' attribute.
	 * @see #getMaximumRange()
	 * @generated
	 */
	void setMaximumRange(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Edge Lenght</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Edge Lenght</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Edge Lenght</em>' attribute.
	 * @see #setMaximumEdgeLenght(double)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getTriangleEdgeLenghtTriangularMeshFilter_MaximumEdgeLenght()
	 * @model
	 * @generated
	 */
	double getMaximumEdgeLenght();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.TriangleEdgeLenghtTriangularMeshFilter#getMaximumEdgeLenght <em>Maximum Edge Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Edge Lenght</em>' attribute.
	 * @see #getMaximumEdgeLenght()
	 * @generated
	 */
	void setMaximumEdgeLenght(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CartesianTriangularMesh filter(CartesianTriangularMesh input);

} // TriangleEdgeLenghtTriangularMeshFilter
