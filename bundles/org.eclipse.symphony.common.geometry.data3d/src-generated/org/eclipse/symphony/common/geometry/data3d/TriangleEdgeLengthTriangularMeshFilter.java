/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triangle Edge Length Triangular Mesh Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMinimumRange <em>Minimum Range</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMaximumRange <em>Maximum Range</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMaximumEdgeLength <em>Maximum Edge Length</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getTriangleEdgeLengthTriangularMeshFilter()
 * @model
 * @generated
 */
public interface TriangleEdgeLengthTriangularMeshFilter extends EObject {
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
	 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getTriangleEdgeLengthTriangularMeshFilter_MinimumRange()
	 * @model unique="false"
	 * @generated
	 */
	double getMinimumRange();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMinimumRange <em>Minimum Range</em>}' attribute.
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
	 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getTriangleEdgeLengthTriangularMeshFilter_MaximumRange()
	 * @model unique="false"
	 * @generated
	 */
	double getMaximumRange();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMaximumRange <em>Maximum Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Range</em>' attribute.
	 * @see #getMaximumRange()
	 * @generated
	 */
	void setMaximumRange(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Edge Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Edge Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Edge Length</em>' attribute.
	 * @see #setMaximumEdgeLength(double)
	 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getTriangleEdgeLengthTriangularMeshFilter_MaximumEdgeLength()
	 * @model unique="false"
	 * @generated
	 */
	double getMaximumEdgeLength();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMaximumEdgeLength <em>Maximum Edge Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Edge Length</em>' attribute.
	 * @see #getMaximumEdgeLength()
	 * @generated
	 */
	void setMaximumEdgeLength(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" inputUnique="false"
	 * @generated
	 */
	CartesianTriangularMesh filter(CartesianTriangularMesh input);

} // TriangleEdgeLengthTriangularMeshFilter
