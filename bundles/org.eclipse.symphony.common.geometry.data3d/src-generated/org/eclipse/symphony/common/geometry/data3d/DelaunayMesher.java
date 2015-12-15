/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delaunay Mesher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Mesher that uses the Quick Hull method to create a mesh from a point cloud. The algorithm is a three dimensional implementation of Quickhull by John E. Lloyd, as
 * described in Barber, Dobkin, and Huhdanpaa, <ahref=http://citeseer.ist.psu.edu/barber96quickhull.html> ``The Quickhull Algorithm for Convex Hulls''</a> (ACM Transactions on Mathematical Software, Vol. 22, No. 4, December 1996)
 * This implementation assumes that the meshing plane is XY.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getDelaunayMesher()
 * @model
 * @generated
 */
public interface DelaunayMesher extends CartesianPositionCoordinatesMesher {

} // DelaunayMesher
