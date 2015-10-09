/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.asc;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.geometry.data3d.DigitalElevationMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ASC3DIO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * This class is used to load DEM from .asc files found on the Utah DEM Repository. Each file covers a large area (20 km X 20 km)
 * and the name of the file is a U.S. National Grid (USNG) identifier. The location of the south-west corner of the tile can be
 * found from  the identifier (see USGN to Geodetic). The data in the file is define however from the north-west corner. Each
 * row in the file is order west to east, and the row are ordered north to south.
 * @see Utah DEM Repository http://mapserv.utah.gov/raster/?cat=5%20Meter%20{DEM}
 * @see USGN to Geodetic http://www.ngs.noaa.gov/cgi-bin/usng_getgp.prl
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.symphony.common.geometry.data3d.asc.Data3DASCPackage#getASC3DIO()
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
	 * @model unique="false" exceptions="org.eclipse.symphony.common.geometry.data3d.asc.Exception" fileUnique="false" altitudeModeUnique="false"
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
	 * @model unique="false" exceptions="org.eclipse.symphony.common.geometry.data3d.asc.Exception" fileUnique="false" altitudeModeUnique="false" targetResolutionUnique="false"
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
	 * @model unique="false" exceptions="org.eclipse.symphony.common.geometry.data3d.asc.Exception" fileUnique="false" altitudeModeUnique="false" southWestCornerUnique="false" northEastCornerUnique="false"
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
	 * @model unique="false" exceptions="org.eclipse.symphony.common.geometry.data3d.asc.Exception" fileUnique="false" altitudeModeUnique="false" southWestCornerUnique="false" northEastCornerUnique="false" targetResolutionUnique="false"
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
	 * @model unique="false" exceptions="org.eclipse.symphony.common.geometry.data3d.asc.Exception" fileUnique="false" altitudeModeUnique="false"
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
	 * @model unique="false" exceptions="org.eclipse.symphony.common.geometry.data3d.asc.Exception" fileUnique="false" altitudeModeUnique="false" targetResolutionUnique="false"
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
	 * @model unique="false" exceptions="org.eclipse.symphony.common.geometry.data3d.asc.Exception" fileUnique="false" altitudeModeUnique="false" southWestCornerUnique="false" northEastCornerUnique="false"
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
	 * @model unique="false" exceptions="org.eclipse.symphony.common.geometry.data3d.asc.Exception" fileUnique="false" altitudeModeUnique="false" southWestCornerUnique="false" northEastCornerUnique="false" targetResolutionUnique="false"
	 * @generated
	 */
	CartesianTriangularMesh loadTriangularMesh(String file, AltitudeMode altitudeMode, Coordinates2D southWestCorner, Coordinates2D northEastCorner, double targetResolution) throws Exception;

} // ASC3DIO
