package ca.gc.asc_csa.apogy.common.geometry.data3d.asc;
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

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ASC3DIO</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ApogyCommonGeometryData3DASCPackage#getASC3DIO()
 * @model
 * @generated
 */
public interface ASC3DIO extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that loads the entire DigitalElevationMap from a .asc file.
	 * @param file The file path.
	 * @param altitudeMode The Altitude mode to use to offset the altitude values.
	 * @return The DigitalElevationMap. The x axis is along the west-east direction, positive toward the west. The y axis
	 * is along the north-south axis, positive toward north.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Exception" fileUnique="false" altitudeModeUnique="false"
	 * @generated
	 */
	DigitalElevationMap loadDigitalElevationMap(String file, AltitudeMode altitudeMode) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that loads the entire DigitalElevationMap from a .asc file.
	 * @param file The file path.
	 * @param altitudeMode The Altitude mode to use to offset the altitude values.
	 * @param targetResolution The grid output resolution required (in meters)
	 * @return The DigitalElevationMap. The x axis is along the west-east direction, positive toward the west. The y axis
	 * is along the north-south axis, positive toward north.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Exception" fileUnique="false" altitudeModeUnique="false" targetResolutionUnique="false"
	 * @generated
	 */
	DigitalElevationMap loadDigitalElevationMap(String file, AltitudeMode altitudeMode, double targetResolution) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Loads a sub-area DigitalElevationMap from a .asc file.
	 * @param file The file path.
	 * @param altitudeMode The Altitude mode to use to offset the altitude values.
	 * @param southWestCorner The coordinates of the south-west corner of the sub-area relative to the south-west corner of the tile.
	 * @param northEastCorner The coordinates of the north-east corner of the sub-area relative to the south-west corner of the tile.
	 * @return The DigitalElevationMap. The x axis is along the west-east direction, positive toward the west. The y axis
	 * is along the north-south axis, positive toward north.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Exception" fileUnique="false" altitudeModeUnique="false" southWestCornerUnique="false" northEastCornerUnique="false"
	 * @generated
	 */
	DigitalElevationMap loadDigitalElevationMap(String file, AltitudeMode altitudeMode, Coordinates2D southWestCorner, Coordinates2D northEastCorner) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Loads a sub-area DigitalElevationMap from a .asc file.
	 * @param file The file path.
	 * @param altitudeMode The Altitude mode to use to offset the altitude values.
	 * @param southWestCorner The coordinates of the south-west corner of the sub-area relative to the south-west corner of the tile.
	 * @param northEastCorner The coordinates of the north-east corner of the sub-area relative to the south-west corner of the tile.
	 * @param targetResolution The grid output resolution required (in meters)
	 * @return The DigitalElevationMap. The x axis is along the west-east direction, positive toward the west. The y axis
	 * is along the north-south axis, positive toward north.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Exception" fileUnique="false" altitudeModeUnique="false" southWestCornerUnique="false" northEastCornerUnique="false" targetResolutionUnique="false"
	 * @generated
	 */
	DigitalElevationMap loadDigitalElevationMap(String file, AltitudeMode altitudeMode, Coordinates2D southWestCorner, Coordinates2D northEastCorner, double targetResolution) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that loads the entire .asc file and meshes is.
	 * @param file The file path.
	 * @param altitudeMode The Altitude mode to use to offset the altitude values.
	 * @return The CartesianTriangularMesh. The x axis is along the west-east direction, positive toward the west. The y axis
	 * is along the north-south axis, positive toward north.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Exception" fileUnique="false" altitudeModeUnique="false"
	 * @generated
	 */
	CartesianTriangularMesh loadTriangularMesh(String file, AltitudeMode altitudeMode) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that loads the entire .asc file and meshes is.
	 * @param file The file path.
	 * @param altitudeMode The Altitude mode to use to offset the altitude values.
	 * @param targetResolution The grid output resolution required (in meters)
	 * @return The CartesianTriangularMesh. The x axis is along the west-east direction, positive toward the west. The y axis
	 * is along the north-south axis, positive toward north.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Exception" fileUnique="false" altitudeModeUnique="false" targetResolutionUnique="false"
	 * @generated
	 */
	CartesianTriangularMesh loadTriangularMesh(String file, AltitudeMode altitudeMode, double targetResolution) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that loads a sub-area from an .asc file and meshes is.
	 * @param file The file path.
	 * @param altitudeMode The Altitude mode to use to offset the altitude values.
	 * @param southWestCorner The coordinates of the south-west corner of the sub-area relative to the south-west corner of the tile.
	 * @param northEastCorner The coordinates of the north-east corner of the sub-area relative to the south-west corner of the tile.
	 * @return The CartesianTriangularMesh. The x axis is along the west-east direction, positive toward the west. The y axis
	 * is along the north-south axis, positive toward north.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Exception" fileUnique="false" altitudeModeUnique="false" southWestCornerUnique="false" northEastCornerUnique="false"
	 * @generated
	 */
	CartesianTriangularMesh loadTriangularMesh(String file, AltitudeMode altitudeMode, Coordinates2D southWestCorner, Coordinates2D northEastCorner) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that loads a sub-area from an .asc file and meshes is.
	 * @param file The file path.
	 * @param altitudeMode The Altitude mode to use to offset the altitude values.
	 * @param southWestCorner The coordinates of the south-west corner of the sub-area relative to the south-west corner of the tile.
	 * @param northEastCorner The coordinates of the north-east corner of the sub-area relative to the south-west corner of the tile.
	 * @return The CartesianTriangularMesh. The x axis is along the west-east direction, positive toward the west. The y axis
	 * is along the north-south axis, positive toward north.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Exception" fileUnique="false" altitudeModeUnique="false" southWestCornerUnique="false" northEastCornerUnique="false" targetResolutionUnique="false"
	 * @generated
	 */
	CartesianTriangularMesh loadTriangularMesh(String file, AltitudeMode altitudeMode, Coordinates2D southWestCorner, Coordinates2D northEastCorner, double targetResolution) throws Exception;

} // ASC3DIO
