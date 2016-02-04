package ca.gc.asc_csa.apogy.common.geometry.data3d;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */


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
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getDelaunayMesher()
 * @model
 * @generated
 */
public interface DelaunayMesher extends CartesianPositionCoordinatesMesher {

} // DelaunayMesher
