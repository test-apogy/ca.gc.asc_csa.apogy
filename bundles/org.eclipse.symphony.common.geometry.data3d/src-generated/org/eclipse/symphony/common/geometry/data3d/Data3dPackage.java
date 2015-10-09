/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d;

import ca.gc.space.mrt.common.processors.ProcessorsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.symphony.common.geometry.data.DataPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Data3d' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)' modelName='Data3d' operationReflection='true' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.common.geometry.data3d/src-generated' editDirectory='/org.eclipse.symphony.common.geometry.data3d.edit/src-generated' basePackage='ca.gc.space.mrt.geometry'"
 * @generated
 */
public interface Data3dPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data3d";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.symphony.common.geometry.data3d";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "data3d";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Data3dPackage eINSTANCE = org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianPolygonImpl <em>Cartesian Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianPolygonImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianPolygon()
	 * @generated
	 */
	int CARTESIAN_POLYGON = 0;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POLYGON__VERTICES = DataPackage.POLYGON__VERTICES;

	/**
	 * The feature id for the '<em><b>Surface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POLYGON__SURFACE = DataPackage.POLYGON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Normal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POLYGON__NORMAL = DataPackage.POLYGON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POLYGON__CENTROID = DataPackage.POLYGON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cartesian Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POLYGON_FEATURE_COUNT = DataPackage.POLYGON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Cartesian Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POLYGON_OPERATION_COUNT = DataPackage.POLYGON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianTriangleImpl <em>Cartesian Triangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianTriangleImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianTriangle()
	 * @generated
	 */
	int CARTESIAN_TRIANGLE = 1;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGLE__VERTICES = CARTESIAN_POLYGON__VERTICES;

	/**
	 * The feature id for the '<em><b>Surface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGLE__SURFACE = CARTESIAN_POLYGON__SURFACE;

	/**
	 * The feature id for the '<em><b>Normal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGLE__NORMAL = CARTESIAN_POLYGON__NORMAL;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGLE__CENTROID = CARTESIAN_POLYGON__CENTROID;

	/**
	 * The number of structural features of the '<em>Cartesian Triangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGLE_FEATURE_COUNT = CARTESIAN_POLYGON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cartesian Triangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGLE_OPERATION_COUNT = CARTESIAN_POLYGON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.SphericalPolygonImpl <em>Spherical Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.SphericalPolygonImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getSphericalPolygon()
	 * @generated
	 */
	int SPHERICAL_POLYGON = 2;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_POLYGON__VERTICES = DataPackage.POLYGON__VERTICES;

	/**
	 * The number of structural features of the '<em>Spherical Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_POLYGON_FEATURE_COUNT = DataPackage.POLYGON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spherical Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_POLYGON_OPERATION_COUNT = DataPackage.POLYGON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.SphericalTriangleImpl <em>Spherical Triangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.SphericalTriangleImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getSphericalTriangle()
	 * @generated
	 */
	int SPHERICAL_TRIANGLE = 3;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_TRIANGLE__VERTICES = SPHERICAL_POLYGON__VERTICES;

	/**
	 * The number of structural features of the '<em>Spherical Triangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_TRIANGLE_FEATURE_COUNT = SPHERICAL_POLYGON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spherical Triangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_TRIANGLE_OPERATION_COUNT = SPHERICAL_POLYGON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianPositionCoordinatesImpl <em>Cartesian Position Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianPositionCoordinatesImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianPositionCoordinates()
	 * @generated
	 */
	int CARTESIAN_POSITION_COORDINATES = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_COORDINATES__X = DataPackage.COORDINATES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_COORDINATES__Y = DataPackage.COORDINATES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_COORDINATES__Z = DataPackage.COORDINATES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cartesian Position Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT = DataPackage.COORDINATES_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>As Point3d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_COORDINATES___AS_POINT3D = DataPackage.COORDINATES_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cartesian Position Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_COORDINATES_OPERATION_COUNT = DataPackage.COORDINATES_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.RGBCartesianPositionCoordinatesImpl <em>RGB Cartesian Position Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.RGBCartesianPositionCoordinatesImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getRGBCartesianPositionCoordinates()
	 * @generated
	 */
	int RGB_CARTESIAN_POSITION_COORDINATES = 5;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_CARTESIAN_POSITION_COORDINATES__X = CARTESIAN_POSITION_COORDINATES__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_CARTESIAN_POSITION_COORDINATES__Y = CARTESIAN_POSITION_COORDINATES__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_CARTESIAN_POSITION_COORDINATES__Z = CARTESIAN_POSITION_COORDINATES__Z;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_CARTESIAN_POSITION_COORDINATES__RED = CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_CARTESIAN_POSITION_COORDINATES__GREEN = CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_CARTESIAN_POSITION_COORDINATES__BLUE = CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>RGB Cartesian Position Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT = CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>As Point3d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_CARTESIAN_POSITION_COORDINATES___AS_POINT3D = CARTESIAN_POSITION_COORDINATES___AS_POINT3D;

	/**
	 * The number of operations of the '<em>RGB Cartesian Position Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_CARTESIAN_POSITION_COORDINATES_OPERATION_COUNT = CARTESIAN_POSITION_COORDINATES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianOrientationCoordinatesImpl <em>Cartesian Orientation Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianOrientationCoordinatesImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianOrientationCoordinates()
	 * @generated
	 */
	int CARTESIAN_ORIENTATION_COORDINATES = 6;

	/**
	 * The feature id for the '<em><b>XRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_ORIENTATION_COORDINATES__XROTATION = DataPackage.COORDINATES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_ORIENTATION_COORDINATES__YROTATION = DataPackage.COORDINATES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ZRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_ORIENTATION_COORDINATES__ZROTATION = DataPackage.COORDINATES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cartesian Orientation Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_ORIENTATION_COORDINATES_FEATURE_COUNT = DataPackage.COORDINATES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Cartesian Orientation Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_ORIENTATION_COORDINATES_OPERATION_COUNT = DataPackage.COORDINATES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesSetImpl <em>Cartesian Coordinates Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesSetImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianCoordinatesSet()
	 * @generated
	 */
	int CARTESIAN_COORDINATES_SET = 7;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET__POINTS = DataPackage.COORDINATES_SET__POINTS;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET__NORMALS = DataPackage.COORDINATES_SET__NORMALS;

	/**
	 * The number of structural features of the '<em>Cartesian Coordinates Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_FEATURE_COUNT = DataPackage.COORDINATES_SET_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET___GET_EXTENT = DataPackage.COORDINATES_SET_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cartesian Coordinates Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_OPERATION_COUNT = DataPackage.COORDINATES_SET_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesSetExtentImpl <em>Cartesian Coordinates Set Extent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesSetExtentImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianCoordinatesSetExtent()
	 * @generated
	 */
	int CARTESIAN_COORDINATES_SET_EXTENT = 8;

	/**
	 * The feature id for the '<em><b>XMin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_EXTENT__XMIN = 0;

	/**
	 * The feature id for the '<em><b>XMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_EXTENT__XMAX = 1;

	/**
	 * The feature id for the '<em><b>YMin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_EXTENT__YMIN = 2;

	/**
	 * The feature id for the '<em><b>YMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_EXTENT__YMAX = 3;

	/**
	 * The feature id for the '<em><b>ZMin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_EXTENT__ZMIN = 4;

	/**
	 * The feature id for the '<em><b>ZMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_EXTENT__ZMAX = 5;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_EXTENT__XDIMENSION = 6;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_EXTENT__YDIMENSION = 7;

	/**
	 * The feature id for the '<em><b>ZDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_EXTENT__ZDIMENSION = 8;

	/**
	 * The number of structural features of the '<em>Cartesian Coordinates Set Extent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_EXTENT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Cartesian Coordinates Set Extent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_EXTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.DigitalElevationMapImpl <em>Digital Elevation Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.DigitalElevationMapImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getDigitalElevationMap()
	 * @generated
	 */
	int DIGITAL_ELEVATION_MAP = 9;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP__POINTS = CARTESIAN_COORDINATES_SET__POINTS;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP__NORMALS = CARTESIAN_COORDINATES_SET__NORMALS;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP__XDIMENSION = CARTESIAN_COORDINATES_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP__YDIMENSION = CARTESIAN_COORDINATES_SET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Digital Elevation Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_FEATURE_COUNT = CARTESIAN_COORDINATES_SET_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP___GET_EXTENT = CARTESIAN_COORDINATES_SET___GET_EXTENT;

	/**
	 * The number of operations of the '<em>Digital Elevation Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_OPERATION_COUNT = CARTESIAN_COORDINATES_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesMeshImpl <em>Cartesian Coordinates Mesh</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesMeshImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianCoordinatesMesh()
	 * @generated
	 */
	int CARTESIAN_COORDINATES_MESH = 10;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH__POINTS = DataPackage.MESH__POINTS;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH__NORMALS = DataPackage.MESH__NORMALS;

	/**
	 * The feature id for the '<em><b>Polygons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH__POLYGONS = DataPackage.MESH__POLYGONS;

	/**
	 * The number of structural features of the '<em>Cartesian Coordinates Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_FEATURE_COUNT = DataPackage.MESH_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Polygon Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH___GET_POLYGON_NEIGHBOURS__POLYGON = DataPackage.MESH___GET_POLYGON_NEIGHBOURS__POLYGON;

	/**
	 * The operation id for the '<em>Get Point Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH___GET_POINT_NEIGHBOURS__COORDINATES = DataPackage.MESH___GET_POINT_NEIGHBOURS__COORDINATES;

	/**
	 * The operation id for the '<em>Get Polygons Sharing Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH___GET_POLYGONS_SHARING_POINT__COORDINATES = DataPackage.MESH___GET_POLYGONS_SHARING_POINT__COORDINATES;

	/**
	 * The operation id for the '<em>Get Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH___GET_EXTENT = DataPackage.MESH_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cartesian Coordinates Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_OPERATION_COUNT = DataPackage.MESH_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianTriangularMeshImpl <em>Cartesian Triangular Mesh</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianTriangularMeshImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianTriangularMesh()
	 * @generated
	 */
	int CARTESIAN_TRIANGULAR_MESH = 11;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH__POINTS = DataPackage.MESH__POINTS;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH__NORMALS = DataPackage.MESH__NORMALS;

	/**
	 * The feature id for the '<em><b>Polygons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH__POLYGONS = DataPackage.MESH__POLYGONS;

	/**
	 * The number of structural features of the '<em>Cartesian Triangular Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_FEATURE_COUNT = DataPackage.MESH_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Polygon Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH___GET_POLYGON_NEIGHBOURS__POLYGON = DataPackage.MESH___GET_POLYGON_NEIGHBOURS__POLYGON;

	/**
	 * The operation id for the '<em>Get Point Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH___GET_POINT_NEIGHBOURS__COORDINATES = DataPackage.MESH___GET_POINT_NEIGHBOURS__COORDINATES;

	/**
	 * The operation id for the '<em>Get Polygons Sharing Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH___GET_POLYGONS_SHARING_POINT__COORDINATES = DataPackage.MESH___GET_POLYGONS_SHARING_POINT__COORDINATES;

	/**
	 * The operation id for the '<em>Get Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH___GET_EXTENT = DataPackage.MESH_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cartesian Triangular Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_OPERATION_COUNT = DataPackage.MESH_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.SphericalCoordinatesImpl <em>Spherical Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.SphericalCoordinatesImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getSphericalCoordinates()
	 * @generated
	 */
	int SPHERICAL_COORDINATES = 12;

	/**
	 * The feature id for the '<em><b>Phi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES__PHI = DataPackage.COORDINATES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Theta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES__THETA = DataPackage.COORDINATES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES__R = DataPackage.COORDINATES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Spherical Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_FEATURE_COUNT = DataPackage.COORDINATES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Spherical Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_OPERATION_COUNT = DataPackage.COORDINATES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.SphericalCoordinatesSetImpl <em>Spherical Coordinates Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.SphericalCoordinatesSetImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getSphericalCoordinatesSet()
	 * @generated
	 */
	int SPHERICAL_COORDINATES_SET = 13;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_SET__POINTS = DataPackage.COORDINATES_SET__POINTS;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_SET__NORMALS = DataPackage.COORDINATES_SET__NORMALS;

	/**
	 * The number of structural features of the '<em>Spherical Coordinates Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_SET_FEATURE_COUNT = DataPackage.COORDINATES_SET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spherical Coordinates Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_SET_OPERATION_COUNT = DataPackage.COORDINATES_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.SphericalCoordinatesMeshImpl <em>Spherical Coordinates Mesh</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.SphericalCoordinatesMeshImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getSphericalCoordinatesMesh()
	 * @generated
	 */
	int SPHERICAL_COORDINATES_MESH = 14;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_MESH__POINTS = DataPackage.MESH__POINTS;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_MESH__NORMALS = DataPackage.MESH__NORMALS;

	/**
	 * The feature id for the '<em><b>Polygons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_MESH__POLYGONS = DataPackage.MESH__POLYGONS;

	/**
	 * The number of structural features of the '<em>Spherical Coordinates Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_MESH_FEATURE_COUNT = DataPackage.MESH_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Polygon Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_MESH___GET_POLYGON_NEIGHBOURS__POLYGON = DataPackage.MESH___GET_POLYGON_NEIGHBOURS__POLYGON;

	/**
	 * The operation id for the '<em>Get Point Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_MESH___GET_POINT_NEIGHBOURS__COORDINATES = DataPackage.MESH___GET_POINT_NEIGHBOURS__COORDINATES;

	/**
	 * The operation id for the '<em>Get Polygons Sharing Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_MESH___GET_POLYGONS_SHARING_POINT__COORDINATES = DataPackage.MESH___GET_POLYGONS_SHARING_POINT__COORDINATES;

	/**
	 * The number of operations of the '<em>Spherical Coordinates Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_MESH_OPERATION_COUNT = DataPackage.MESH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.SphericalTriangularMeshImpl <em>Spherical Triangular Mesh</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.SphericalTriangularMeshImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getSphericalTriangularMesh()
	 * @generated
	 */
	int SPHERICAL_TRIANGULAR_MESH = 15;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_TRIANGULAR_MESH__POINTS = DataPackage.MESH__POINTS;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_TRIANGULAR_MESH__NORMALS = DataPackage.MESH__NORMALS;

	/**
	 * The feature id for the '<em><b>Polygons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_TRIANGULAR_MESH__POLYGONS = DataPackage.MESH__POLYGONS;

	/**
	 * The number of structural features of the '<em>Spherical Triangular Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_TRIANGULAR_MESH_FEATURE_COUNT = DataPackage.MESH_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Polygon Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_TRIANGULAR_MESH___GET_POLYGON_NEIGHBOURS__POLYGON = DataPackage.MESH___GET_POLYGON_NEIGHBOURS__POLYGON;

	/**
	 * The operation id for the '<em>Get Point Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_TRIANGULAR_MESH___GET_POINT_NEIGHBOURS__COORDINATES = DataPackage.MESH___GET_POINT_NEIGHBOURS__COORDINATES;

	/**
	 * The operation id for the '<em>Get Polygons Sharing Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_TRIANGULAR_MESH___GET_POLYGONS_SHARING_POINT__COORDINATES = DataPackage.MESH___GET_POLYGONS_SHARING_POINT__COORDINATES;

	/**
	 * The number of operations of the '<em>Spherical Triangular Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_TRIANGULAR_MESH_OPERATION_COUNT = DataPackage.MESH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.PoseImpl <em>Pose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.PoseImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getPose()
	 * @generated
	 */
	int POSE = 16;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE__X = CARTESIAN_POSITION_COORDINATES__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE__Y = CARTESIAN_POSITION_COORDINATES__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE__Z = CARTESIAN_POSITION_COORDINATES__Z;

	/**
	 * The feature id for the '<em><b>XRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE__XROTATION = CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE__YROTATION = CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ZRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE__ZROTATION = CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_FEATURE_COUNT = CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>As Point3d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE___AS_POINT3D = CARTESIAN_POSITION_COORDINATES___AS_POINT3D;

	/**
	 * The number of operations of the '<em>Pose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_OPERATION_COUNT = CARTESIAN_POSITION_COORDINATES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.SphereSamplingShapeImpl <em>Sphere Sampling Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.SphereSamplingShapeImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getSphereSamplingShape()
	 * @generated
	 */
	int SPHERE_SAMPLING_SHAPE = 17;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_SAMPLING_SHAPE__RADIUS = DataPackage.COORDINATES_SAMPLING_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Center</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_SAMPLING_SHAPE__CENTER = DataPackage.COORDINATES_SAMPLING_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Include Just Touching</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_SAMPLING_SHAPE__INCLUDE_JUST_TOUCHING = DataPackage.COORDINATES_SAMPLING_SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sphere Sampling Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_SAMPLING_SHAPE_FEATURE_COUNT = DataPackage.COORDINATES_SAMPLING_SHAPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Inside</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_SAMPLING_SHAPE___IS_INSIDE__COORDINATES = DataPackage.COORDINATES_SAMPLING_SHAPE___IS_INSIDE__COORDINATES;

	/**
	 * The operation id for the '<em>Is Polygon Inside</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_SAMPLING_SHAPE___IS_POLYGON_INSIDE__POLYGON = DataPackage.COORDINATES_SAMPLING_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sphere Sampling Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_SAMPLING_SHAPE_OPERATION_COUNT = DataPackage.COORDINATES_SAMPLING_SHAPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CubeSamplingShapeImpl <em>Cube Sampling Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.CubeSamplingShapeImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCubeSamplingShape()
	 * @generated
	 */
	int CUBE_SAMPLING_SHAPE = 18;

	/**
	 * The feature id for the '<em><b>Corner1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAMPLING_SHAPE__CORNER1 = DataPackage.COORDINATES_SAMPLING_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Corner2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAMPLING_SHAPE__CORNER2 = DataPackage.COORDINATES_SAMPLING_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Include Just Touching</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAMPLING_SHAPE__INCLUDE_JUST_TOUCHING = DataPackage.COORDINATES_SAMPLING_SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cube Sampling Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAMPLING_SHAPE_FEATURE_COUNT = DataPackage.COORDINATES_SAMPLING_SHAPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Inside</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAMPLING_SHAPE___IS_INSIDE__COORDINATES = DataPackage.COORDINATES_SAMPLING_SHAPE___IS_INSIDE__COORDINATES;

	/**
	 * The operation id for the '<em>Is Polygon Inside</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAMPLING_SHAPE___IS_POLYGON_INSIDE__POLYGON = DataPackage.COORDINATES_SAMPLING_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cube Sampling Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAMPLING_SHAPE_OPERATION_COUNT = DataPackage.COORDINATES_SAMPLING_SHAPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesSetShapeSamplerImpl <em>Cartesian Coordinates Set Shape Sampler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesSetShapeSamplerImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianCoordinatesSetShapeSampler()
	 * @generated
	 */
	int CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER = 19;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER__PROGRESS_MONITOR = DataPackage.COORDINATES_SET_SHAPES_SAMPLER__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER__INPUT = DataPackage.COORDINATES_SET_SHAPES_SAMPLER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER__OUTPUT = DataPackage.COORDINATES_SET_SHAPES_SAMPLER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Coordinates Sampling Shapes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER__COORDINATES_SAMPLING_SHAPES = DataPackage.COORDINATES_SET_SHAPES_SAMPLER__COORDINATES_SAMPLING_SHAPES;

	/**
	 * The feature id for the '<em><b>Shape Sampling Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER__SHAPE_SAMPLING_MODE = DataPackage.COORDINATES_SET_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE;

	/**
	 * The number of structural features of the '<em>Cartesian Coordinates Set Shape Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER_FEATURE_COUNT = DataPackage.COORDINATES_SET_SHAPES_SAMPLER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER___PROCESS__OBJECT = DataPackage.COORDINATES_SET_SHAPES_SAMPLER___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Cartesian Coordinates Set Shape Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER_OPERATION_COUNT = DataPackage.COORDINATES_SET_SHAPES_SAMPLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesMeshSamplerImpl <em>Cartesian Coordinates Mesh Sampler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesMeshSamplerImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianCoordinatesMeshSampler()
	 * @generated
	 */
	int CARTESIAN_COORDINATES_MESH_SAMPLER = 20;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_SAMPLER__PROGRESS_MONITOR = DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_SAMPLER__INPUT = DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_SAMPLER__OUTPUT = DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Coordinates Sampling Shapes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_SAMPLER__COORDINATES_SAMPLING_SHAPES = DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__COORDINATES_SAMPLING_SHAPES;

	/**
	 * The feature id for the '<em><b>Shape Sampling Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_SAMPLER__SHAPE_SAMPLING_MODE = DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE;

	/**
	 * The feature id for the '<em><b>Polygon Sampling Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_SAMPLER__POLYGON_SAMPLING_MODE = DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__POLYGON_SAMPLING_MODE;

	/**
	 * The number of structural features of the '<em>Cartesian Coordinates Mesh Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_SAMPLER_FEATURE_COUNT = DataPackage.MESH_COORDINATES_SHAPES_SAMPLER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_SAMPLER___PROCESS__OBJECT = DataPackage.MESH_COORDINATES_SHAPES_SAMPLER___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Cartesian Coordinates Mesh Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_SAMPLER_OPERATION_COUNT = DataPackage.MESH_COORDINATES_SHAPES_SAMPLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesMeshPolygonSamplerImpl <em>Cartesian Coordinates Mesh Polygon Sampler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesMeshPolygonSamplerImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianCoordinatesMeshPolygonSampler()
	 * @generated
	 */
	int CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER = 21;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER__PROGRESS_MONITOR = DataPackage.MESH_POLYGON_SHAPES_SAMPLER__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER__INPUT = DataPackage.MESH_POLYGON_SHAPES_SAMPLER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER__OUTPUT = DataPackage.MESH_POLYGON_SHAPES_SAMPLER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Polygon Sampling Shapes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER__POLYGON_SAMPLING_SHAPES = DataPackage.MESH_POLYGON_SHAPES_SAMPLER__POLYGON_SAMPLING_SHAPES;

	/**
	 * The feature id for the '<em><b>Shape Sampling Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER__SHAPE_SAMPLING_MODE = DataPackage.MESH_POLYGON_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE;

	/**
	 * The number of structural features of the '<em>Cartesian Coordinates Mesh Polygon Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER_FEATURE_COUNT = DataPackage.MESH_POLYGON_SHAPES_SAMPLER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER___PROCESS__OBJECT = DataPackage.MESH_POLYGON_SHAPES_SAMPLER___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Cartesian Coordinates Mesh Polygon Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER_OPERATION_COUNT = DataPackage.MESH_POLYGON_SHAPES_SAMPLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianTriangularMeshSamplerImpl <em>Cartesian Triangular Mesh Sampler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianTriangularMeshSamplerImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianTriangularMeshSampler()
	 * @generated
	 */
	int CARTESIAN_TRIANGULAR_MESH_SAMPLER = 22;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SAMPLER__PROGRESS_MONITOR = DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SAMPLER__INPUT = DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SAMPLER__OUTPUT = DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Coordinates Sampling Shapes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SAMPLER__COORDINATES_SAMPLING_SHAPES = DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__COORDINATES_SAMPLING_SHAPES;

	/**
	 * The feature id for the '<em><b>Shape Sampling Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SAMPLER__SHAPE_SAMPLING_MODE = DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE;

	/**
	 * The feature id for the '<em><b>Polygon Sampling Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SAMPLER__POLYGON_SAMPLING_MODE = DataPackage.MESH_COORDINATES_SHAPES_SAMPLER__POLYGON_SAMPLING_MODE;

	/**
	 * The number of structural features of the '<em>Cartesian Triangular Mesh Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SAMPLER_FEATURE_COUNT = DataPackage.MESH_COORDINATES_SHAPES_SAMPLER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SAMPLER___PROCESS__OBJECT = DataPackage.MESH_COORDINATES_SHAPES_SAMPLER___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Cartesian Triangular Mesh Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SAMPLER_OPERATION_COUNT = DataPackage.MESH_COORDINATES_SHAPES_SAMPLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianTriangularMeshPolygonSamplerImpl <em>Cartesian Triangular Mesh Polygon Sampler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianTriangularMeshPolygonSamplerImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianTriangularMeshPolygonSampler()
	 * @generated
	 */
	int CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER = 23;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER__PROGRESS_MONITOR = DataPackage.MESH_POLYGON_SHAPES_SAMPLER__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER__INPUT = DataPackage.MESH_POLYGON_SHAPES_SAMPLER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER__OUTPUT = DataPackage.MESH_POLYGON_SHAPES_SAMPLER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Polygon Sampling Shapes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER__POLYGON_SAMPLING_SHAPES = DataPackage.MESH_POLYGON_SHAPES_SAMPLER__POLYGON_SAMPLING_SHAPES;

	/**
	 * The feature id for the '<em><b>Shape Sampling Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER__SHAPE_SAMPLING_MODE = DataPackage.MESH_POLYGON_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE;

	/**
	 * The number of structural features of the '<em>Cartesian Triangular Mesh Polygon Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER_FEATURE_COUNT = DataPackage.MESH_POLYGON_SHAPES_SAMPLER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER___PROCESS__OBJECT = DataPackage.MESH_POLYGON_SHAPES_SAMPLER___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Cartesian Triangular Mesh Polygon Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER_OPERATION_COUNT = DataPackage.MESH_POLYGON_SHAPES_SAMPLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianPositionCoordinatesMesherImpl <em>Cartesian Position Coordinates Mesher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianPositionCoordinatesMesherImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianPositionCoordinatesMesher()
	 * @generated
	 */
	int CARTESIAN_POSITION_COORDINATES_MESHER = 24;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_COORDINATES_MESHER__PROGRESS_MONITOR = ProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_COORDINATES_MESHER__INPUT = ProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_COORDINATES_MESHER__OUTPUT = ProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The number of structural features of the '<em>Cartesian Position Coordinates Mesher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_COORDINATES_MESHER_FEATURE_COUNT = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_COORDINATES_MESHER___PROCESS__OBJECT = ProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Cartesian Position Coordinates Mesher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_COORDINATES_MESHER_OPERATION_COUNT = ProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.NormalPointCloudImpl <em>Normal Point Cloud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.NormalPointCloudImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getNormalPointCloud()
	 * @generated
	 */
	int NORMAL_POINT_CLOUD = 25;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_POINT_CLOUD__POINTS = 0;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_POINT_CLOUD__NORMALS = 1;

	/**
	 * The number of structural features of the '<em>Normal Point Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_POINT_CLOUD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Normal Point Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_POINT_CLOUD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.PointLocatorImpl <em>Point Locator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.PointLocatorImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getPointLocator()
	 * @generated
	 */
	int POINT_LOCATOR = 26;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LOCATOR__POINTS = 0;

	/**
	 * The number of structural features of the '<em>Point Locator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LOCATOR_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Closest Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LOCATOR___FIND_CLOSEST_POINT__CARTESIANPOSITIONCOORDINATES = 0;

	/**
	 * The operation id for the '<em>Find Points Within Radius</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LOCATOR___FIND_POINTS_WITHIN_RADIUS__DOUBLE_CARTESIANPOSITIONCOORDINATES = 1;

	/**
	 * The number of operations of the '<em>Point Locator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LOCATOR_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.VecmathPointLocatorImpl <em>Vecmath Point Locator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.VecmathPointLocatorImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getVecmathPointLocator()
	 * @generated
	 */
	int VECMATH_POINT_LOCATOR = 27;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECMATH_POINT_LOCATOR__POINTS = 0;

	/**
	 * The number of structural features of the '<em>Vecmath Point Locator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECMATH_POINT_LOCATOR_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Closest Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECMATH_POINT_LOCATOR___FIND_CLOSEST_POINT__POINT3D = 0;

	/**
	 * The operation id for the '<em>Find Points Within Radius</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECMATH_POINT_LOCATOR___FIND_POINTS_WITHIN_RADIUS__DOUBLE_POINT3D = 1;

	/**
	 * The operation id for the '<em>Find Closest Point Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECMATH_POINT_LOCATOR___FIND_CLOSEST_POINT_ID__POINT3D = 2;

	/**
	 * The operation id for the '<em>Find Point Ids Within Radius</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECMATH_POINT_LOCATOR___FIND_POINT_IDS_WITHIN_RADIUS__DOUBLE_POINT3D = 3;

	/**
	 * The operation id for the '<em>Find Closest NPoints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECMATH_POINT_LOCATOR___FIND_CLOSEST_NPOINTS__POINT3D_INT = 4;

	/**
	 * The operation id for the '<em>Find Closest NPoint Ids</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECMATH_POINT_LOCATOR___FIND_CLOSEST_NPOINT_IDS__POINT3D_INT = 5;

	/**
	 * The number of operations of the '<em>Vecmath Point Locator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECMATH_POINT_LOCATOR_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.VecmathKdTreePointLocatorImpl <em>Vecmath Kd Tree Point Locator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.VecmathKdTreePointLocatorImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getVecmathKdTreePointLocator()
	 * @generated
	 */
	int VECMATH_KD_TREE_POINT_LOCATOR = 28;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECMATH_KD_TREE_POINT_LOCATOR__POINTS = VECMATH_POINT_LOCATOR__POINTS;

	/**
	 * The number of structural features of the '<em>Vecmath Kd Tree Point Locator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECMATH_KD_TREE_POINT_LOCATOR_FEATURE_COUNT = VECMATH_POINT_LOCATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Find Closest Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECMATH_KD_TREE_POINT_LOCATOR___FIND_CLOSEST_POINT__POINT3D = VECMATH_POINT_LOCATOR___FIND_CLOSEST_POINT__POINT3D;

	/**
	 * The operation id for the '<em>Find Points Within Radius</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECMATH_KD_TREE_POINT_LOCATOR___FIND_POINTS_WITHIN_RADIUS__DOUBLE_POINT3D = VECMATH_POINT_LOCATOR___FIND_POINTS_WITHIN_RADIUS__DOUBLE_POINT3D;

	/**
	 * The operation id for the '<em>Find Closest Point Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECMATH_KD_TREE_POINT_LOCATOR___FIND_CLOSEST_POINT_ID__POINT3D = VECMATH_POINT_LOCATOR___FIND_CLOSEST_POINT_ID__POINT3D;

	/**
	 * The operation id for the '<em>Find Point Ids Within Radius</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECMATH_KD_TREE_POINT_LOCATOR___FIND_POINT_IDS_WITHIN_RADIUS__DOUBLE_POINT3D = VECMATH_POINT_LOCATOR___FIND_POINT_IDS_WITHIN_RADIUS__DOUBLE_POINT3D;

	/**
	 * The operation id for the '<em>Find Closest NPoints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECMATH_KD_TREE_POINT_LOCATOR___FIND_CLOSEST_NPOINTS__POINT3D_INT = VECMATH_POINT_LOCATOR___FIND_CLOSEST_NPOINTS__POINT3D_INT;

	/**
	 * The operation id for the '<em>Find Closest NPoint Ids</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECMATH_KD_TREE_POINT_LOCATOR___FIND_CLOSEST_NPOINT_IDS__POINT3D_INT = VECMATH_POINT_LOCATOR___FIND_CLOSEST_NPOINT_IDS__POINT3D_INT;

	/**
	 * The number of operations of the '<em>Vecmath Kd Tree Point Locator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECMATH_KD_TREE_POINT_LOCATOR_OPERATION_COUNT = VECMATH_POINT_LOCATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.MeshLocalizerImpl <em>Mesh Localizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.MeshLocalizerImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getMeshLocalizer()
	 * @generated
	 */
	int MESH_LOCALIZER = 29;

	/**
	 * The number of structural features of the '<em>Mesh Localizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_LOCALIZER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Localize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_LOCALIZER___LOCALIZE__CARTESIANTRIANGULARMESH_MATRIX4D_CARTESIANTRIANGULARMESH_MATRIX4D = 0;

	/**
	 * The number of operations of the '<em>Mesh Localizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_LOCALIZER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.PointNormalLocatorImpl <em>Point Normal Locator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.PointNormalLocatorImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getPointNormalLocator()
	 * @generated
	 */
	int POINT_NORMAL_LOCATOR = 30;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_NORMAL_LOCATOR__DATA_SET = 0;

	/**
	 * The number of structural features of the '<em>Point Normal Locator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_NORMAL_LOCATOR_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Closest Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_NORMAL_LOCATOR___FIND_CLOSEST_POINT__POINT3D_VECTOR3D = 0;

	/**
	 * The operation id for the '<em>Find Points Within Radius</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_NORMAL_LOCATOR___FIND_POINTS_WITHIN_RADIUS__DOUBLE_POINT3D_VECTOR3D = 1;

	/**
	 * The operation id for the '<em>Find Closest NPoints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_NORMAL_LOCATOR___FIND_CLOSEST_NPOINTS__INT_POINT3D_VECTOR3D = 2;

	/**
	 * The operation id for the '<em>Find Closest Point Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_NORMAL_LOCATOR___FIND_CLOSEST_POINT_ID__POINT3D_VECTOR3D = 3;

	/**
	 * The operation id for the '<em>Find Point Ids Within Radius</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_NORMAL_LOCATOR___FIND_POINT_IDS_WITHIN_RADIUS__DOUBLE_POINT3D_VECTOR3D = 4;

	/**
	 * The operation id for the '<em>Find Closest NPoint Ids</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_NORMAL_LOCATOR___FIND_CLOSEST_NPOINT_IDS__INT_POINT3D_VECTOR3D = 5;

	/**
	 * The number of operations of the '<em>Point Normal Locator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_NORMAL_LOCATOR_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.DelaunayMesherImpl <em>Delaunay Mesher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.DelaunayMesherImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getDelaunayMesher()
	 * @generated
	 */
	int DELAUNAY_MESHER = 31;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAUNAY_MESHER__PROGRESS_MONITOR = CARTESIAN_POSITION_COORDINATES_MESHER__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAUNAY_MESHER__INPUT = CARTESIAN_POSITION_COORDINATES_MESHER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAUNAY_MESHER__OUTPUT = CARTESIAN_POSITION_COORDINATES_MESHER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAUNAY_MESHER__TOLERANCE = CARTESIAN_POSITION_COORDINATES_MESHER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAUNAY_MESHER__ALPHA = CARTESIAN_POSITION_COORDINATES_MESHER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAUNAY_MESHER__OFFSET = CARTESIAN_POSITION_COORDINATES_MESHER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bounding Triangulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAUNAY_MESHER__BOUNDING_TRIANGULATION = CARTESIAN_POSITION_COORDINATES_MESHER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Meshing Plane</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAUNAY_MESHER__MESHING_PLANE = CARTESIAN_POSITION_COORDINATES_MESHER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Delaunay Mesher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAUNAY_MESHER_FEATURE_COUNT = CARTESIAN_POSITION_COORDINATES_MESHER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAUNAY_MESHER___PROCESS__OBJECT = CARTESIAN_POSITION_COORDINATES_MESHER___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Delaunay Mesher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAUNAY_MESHER_OPERATION_COUNT = CARTESIAN_POSITION_COORDINATES_MESHER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.DigitalElevationMapMesherImpl <em>Digital Elevation Map Mesher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.DigitalElevationMapMesherImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getDigitalElevationMapMesher()
	 * @generated
	 */
	int DIGITAL_ELEVATION_MAP_MESHER = 32;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_MESHER__PROGRESS_MONITOR = ProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_MESHER__INPUT = ProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_MESHER__OUTPUT = ProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The number of structural features of the '<em>Digital Elevation Map Mesher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_MESHER_FEATURE_COUNT = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_MESHER___PROCESS__OBJECT = ProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Digital Elevation Map Mesher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_MESHER_OPERATION_COUNT = ProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.DigitalElevationMapSamplerImpl <em>Digital Elevation Map Sampler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.DigitalElevationMapSamplerImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getDigitalElevationMapSampler()
	 * @generated
	 */
	int DIGITAL_ELEVATION_MAP_SAMPLER = 33;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_SAMPLER__PROGRESS_MONITOR = ProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_SAMPLER__INPUT = ProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_SAMPLER__OUTPUT = ProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Target Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_SAMPLER__TARGET_RESOLUTION = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Digital Elevation Map Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_SAMPLER_FEATURE_COUNT = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_SAMPLER___PROCESS__OBJECT = ProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Digital Elevation Map Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_SAMPLER_OPERATION_COUNT = ProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.TriangularMeshNormalsCalculatorImpl <em>Triangular Mesh Normals Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.TriangularMeshNormalsCalculatorImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getTriangularMeshNormalsCalculator()
	 * @generated
	 */
	int TRIANGULAR_MESH_NORMALS_CALCULATOR = 34;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_NORMALS_CALCULATOR__PROGRESS_MONITOR = ProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_NORMALS_CALCULATOR__INPUT = ProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_NORMALS_CALCULATOR__OUTPUT = ProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The number of structural features of the '<em>Triangular Mesh Normals Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_NORMALS_CALCULATOR_FEATURE_COUNT = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_NORMALS_CALCULATOR___PROCESS__OBJECT = ProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Triangular Mesh Normals Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_NORMALS_CALCULATOR_OPERATION_COUNT = ProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.TriangularMeshToNormalPointCloudImpl <em>Triangular Mesh To Normal Point Cloud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.TriangularMeshToNormalPointCloudImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getTriangularMeshToNormalPointCloud()
	 * @generated
	 */
	int TRIANGULAR_MESH_TO_NORMAL_POINT_CLOUD = 35;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_TO_NORMAL_POINT_CLOUD__PROGRESS_MONITOR = ProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_TO_NORMAL_POINT_CLOUD__INPUT = ProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_TO_NORMAL_POINT_CLOUD__OUTPUT = ProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The number of structural features of the '<em>Triangular Mesh To Normal Point Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_TO_NORMAL_POINT_CLOUD_FEATURE_COUNT = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_TO_NORMAL_POINT_CLOUD___PROCESS__OBJECT = ProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Triangular Mesh To Normal Point Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_TO_NORMAL_POINT_CLOUD_OPERATION_COUNT = ProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.PointsRangeGagerImpl <em>Points Range Gager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.PointsRangeGagerImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getPointsRangeGager()
	 * @generated
	 */
	int POINTS_RANGE_GAGER = 36;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTS_RANGE_GAGER__PROGRESS_MONITOR = ProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTS_RANGE_GAGER__INPUT = ProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTS_RANGE_GAGER__OUTPUT = ProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTS_RANGE_GAGER__MIN_X = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTS_RANGE_GAGER__MAX_X = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTS_RANGE_GAGER__MIN_Y = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTS_RANGE_GAGER__MAX_Y = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTS_RANGE_GAGER__MIN_Z = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTS_RANGE_GAGER__MAX_Z = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Points Range Gager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTS_RANGE_GAGER_FEATURE_COUNT = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTS_RANGE_GAGER___PROCESS__OBJECT = ProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Points Range Gager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTS_RANGE_GAGER_OPERATION_COUNT = ProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.UniquePointsFilterImpl <em>Unique Points Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.UniquePointsFilterImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getUniquePointsFilter()
	 * @generated
	 */
	int UNIQUE_POINTS_FILTER = 37;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_POINTS_FILTER__PROGRESS_MONITOR = ProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_POINTS_FILTER__INPUT = ProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_POINTS_FILTER__OUTPUT = ProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The number of structural features of the '<em>Unique Points Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_POINTS_FILTER_FEATURE_COUNT = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_POINTS_FILTER___PROCESS__OBJECT = ProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Unique Points Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_POINTS_FILTER_OPERATION_COUNT = ProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.TriangleEdgeLengthTriangularMeshFilterImpl <em>Triangle Edge Length Triangular Mesh Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.TriangleEdgeLengthTriangularMeshFilterImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getTriangleEdgeLengthTriangularMeshFilter()
	 * @generated
	 */
	int TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER = 38;

	/**
	 * The feature id for the '<em><b>Minimum Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MINIMUM_RANGE = 0;

	/**
	 * The feature id for the '<em><b>Maximum Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MAXIMUM_RANGE = 1;

	/**
	 * The feature id for the '<em><b>Maximum Edge Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MAXIMUM_EDGE_LENGTH = 2;

	/**
	 * The number of structural features of the '<em>Triangle Edge Length Triangular Mesh Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER___FILTER__CARTESIANTRIANGULARMESH = 0;

	/**
	 * The number of operations of the '<em>Triangle Edge Length Triangular Mesh Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.OutlierFilterImpl <em>Outlier Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.OutlierFilterImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getOutlierFilter()
	 * @generated
	 */
	int OUTLIER_FILTER = 39;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLIER_FILTER__PROGRESS_MONITOR = ProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLIER_FILTER__INPUT = ProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLIER_FILTER__OUTPUT = ProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Max Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLIER_FILTER__MAX_DISTANCE = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Outlier Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLIER_FILTER_FEATURE_COUNT = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLIER_FILTER___PROCESS__OBJECT = ProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Outlier Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLIER_FILTER_OPERATION_COUNT = ProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.RasterPointCloudImpl <em>Raster Point Cloud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.RasterPointCloudImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getRasterPointCloud()
	 * @generated
	 */
	int RASTER_POINT_CLOUD = 40;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_POINT_CLOUD__ROWS = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_POINT_CLOUD__COLUMNS = 1;

	/**
	 * The number of structural features of the '<em>Raster Point Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_POINT_CLOUD_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_POINT_CLOUD___GET_POINT__INT_INT = 0;

	/**
	 * The operation id for the '<em>Set Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_POINT_CLOUD___SET_POINT__INT_INT_CARTESIANPOSITIONCOORDINATES = 1;

	/**
	 * The number of operations of the '<em>Raster Point Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_POINT_CLOUD_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.RasterPointCloudToCartesianCoordinatesSetImpl <em>Raster Point Cloud To Cartesian Coordinates Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.RasterPointCloudToCartesianCoordinatesSetImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getRasterPointCloudToCartesianCoordinatesSet()
	 * @generated
	 */
	int RASTER_POINT_CLOUD_TO_CARTESIAN_COORDINATES_SET = 41;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_POINT_CLOUD_TO_CARTESIAN_COORDINATES_SET__PROGRESS_MONITOR = ProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_POINT_CLOUD_TO_CARTESIAN_COORDINATES_SET__INPUT = ProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_POINT_CLOUD_TO_CARTESIAN_COORDINATES_SET__OUTPUT = ProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The number of structural features of the '<em>Raster Point Cloud To Cartesian Coordinates Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_POINT_CLOUD_TO_CARTESIAN_COORDINATES_SET_FEATURE_COUNT = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_POINT_CLOUD_TO_CARTESIAN_COORDINATES_SET___PROCESS__OBJECT = ProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Raster Point Cloud To Cartesian Coordinates Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_POINT_CLOUD_TO_CARTESIAN_COORDINATES_SET_OPERATION_COUNT = ProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.MeshSmootherImpl <em>Mesh Smoother</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.MeshSmootherImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getMeshSmoother()
	 * @generated
	 */
	int MESH_SMOOTHER = 42;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_SMOOTHER__PROGRESS_MONITOR = ProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_SMOOTHER__INPUT = ProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_SMOOTHER__OUTPUT = ProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Number Of Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_SMOOTHER__NUMBER_OF_ITERATIONS = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mesh Smoother</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_SMOOTHER_FEATURE_COUNT = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_SMOOTHER___PROCESS__OBJECT = ProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Mesh Smoother</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_SMOOTHER_OPERATION_COUNT = ProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.VoxelBased3DPointCloudResamplerImpl <em>Voxel Based3 DPoint Cloud Resampler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.VoxelBased3DPointCloudResamplerImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getVoxelBased3DPointCloudResampler()
	 * @generated
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER = 43;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__PROGRESS_MONITOR = ProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__INPUT = ProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__OUTPUT = ProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Resolution X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_X = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolution Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Y = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resolution Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Z = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Minimum Number Of Point Per Voxel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__MINIMUM_NUMBER_OF_POINT_PER_VOXEL = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tile Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__TILE_RESOLUTION = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Voxel Based3 DPoint Cloud Resampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER_FEATURE_COUNT = ProcessorsPackage.PROCESSOR_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER___PROCESS__OBJECT = ProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Voxel Based3 DPoint Cloud Resampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER_OPERATION_COUNT = ProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.RigidBodyPoseTrackerImpl <em>Rigid Body Pose Tracker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.RigidBodyPoseTrackerImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getRigidBodyPoseTracker()
	 * @generated
	 */
	int RIGID_BODY_POSE_TRACKER = 44;

	/**
	 * The feature id for the '<em><b>Position Markers At Origin</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_BODY_POSE_TRACKER__POSITION_MARKERS_AT_ORIGIN = 0;

	/**
	 * The number of structural features of the '<em>Rigid Body Pose Tracker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_BODY_POSE_TRACKER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Compute Transformation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_BODY_POSE_TRACKER___COMPUTE_TRANSFORMATION__ELIST = 0;

	/**
	 * The operation id for the '<em>Compute Transformation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_BODY_POSE_TRACKER___COMPUTE_TRANSFORMATION__LIST = 1;

	/**
	 * The operation id for the '<em>Add Position Markers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_BODY_POSE_TRACKER___ADD_POSITION_MARKERS__LIST = 2;

	/**
	 * The operation id for the '<em>Remove Position Markers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_BODY_POSE_TRACKER___REMOVE_POSITION_MARKERS__LIST = 3;

	/**
	 * The number of operations of the '<em>Rigid Body Pose Tracker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_BODY_POSE_TRACKER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.PositionMarkerImpl <em>Position Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.PositionMarkerImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getPositionMarker()
	 * @generated
	 */
	int POSITION_MARKER = 45;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_MARKER__X = CARTESIAN_POSITION_COORDINATES__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_MARKER__Y = CARTESIAN_POSITION_COORDINATES__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_MARKER__Z = CARTESIAN_POSITION_COORDINATES__Z;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_MARKER__IDENTIFIER = CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Position Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_MARKER_FEATURE_COUNT = CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>As Point3d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_MARKER___AS_POINT3D = CARTESIAN_POSITION_COORDINATES___AS_POINT3D;

	/**
	 * The number of operations of the '<em>Position Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_MARKER_OPERATION_COUNT = CARTESIAN_POSITION_COORDINATES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.Data3dFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dFacadeImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getData3dFacade()
	 * @generated
	 */
	int DATA3D_FACADE = 46;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Cartesian Position Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___CREATE_CARTESIAN_POSITION_COORDINATES__DOUBLE_DOUBLE_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Create Cartesian Orientation Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___CREATE_CARTESIAN_ORIENTATION_COORDINATES__DOUBLE_DOUBLE_DOUBLE = 1;

	/**
	 * The operation id for the '<em>Create Spherical Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___CREATE_SPHERICAL_COORDINATES__DOUBLE_DOUBLE_DOUBLE = 2;

	/**
	 * The operation id for the '<em>Create Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___CREATE_POSE__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE = 3;

	/**
	 * The operation id for the '<em>Create Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___CREATE_POSE__POSE = 4;

	/**
	 * The operation id for the '<em>Create Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___CREATE_POSE__CARTESIANPOSITIONCOORDINATES_CARTESIANORIENTATIONCOORDINATES = 5;

	/**
	 * The operation id for the '<em>Create Point Normal Locator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___CREATE_POINT_NORMAL_LOCATOR__NORMALPOINTCLOUD = 6;

	/**
	 * The operation id for the '<em>Create Digital Elevation Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___CREATE_DIGITAL_ELEVATION_MAP__CARTESIANCOORDINATESSET = 7;

	/**
	 * The operation id for the '<em>Create Cartesian Polygon</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___CREATE_CARTESIAN_POLYGON__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES = 8;

	/**
	 * The operation id for the '<em>Create Cartesian Position Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___CREATE_CARTESIAN_POSITION_COORDINATES__CARTESIANPOSITIONCOORDINATES = 9;

	/**
	 * The operation id for the '<em>Create Cartesian Orientation Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___CREATE_CARTESIAN_ORIENTATION_COORDINATES__CARTESIANORIENTATIONCOORDINATES = 10;

	/**
	 * The operation id for the '<em>Create Cartesian Coordinates Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___CREATE_CARTESIAN_COORDINATES_MESH__CARTESIANCOORDINATESMESH = 11;

	/**
	 * The operation id for the '<em>Create Cartesian Triangle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___CREATE_CARTESIAN_TRIANGLE__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES = 12;

	/**
	 * The operation id for the '<em>Create Cartesian Triangle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___CREATE_CARTESIAN_TRIANGLE__CARTESIANPOLYGON = 13;

	/**
	 * The operation id for the '<em>Create Cartesian Coordinates Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___CREATE_CARTESIAN_COORDINATES_MESH__LIST = 14;

	/**
	 * The operation id for the '<em>Create Cartesian Coordinates Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___CREATE_CARTESIAN_COORDINATES_MESH__CARTESIANTRIANGULARMESH = 15;

	/**
	 * The operation id for the '<em>Create Cartesian Triangular Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___CREATE_CARTESIAN_TRIANGULAR_MESH__LIST = 16;

	/**
	 * The operation id for the '<em>Create Cartesian Triangular Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___CREATE_CARTESIAN_TRIANGULAR_MESH__CARTESIANTRIANGULARMESH = 17;

	/**
	 * The operation id for the '<em>Apply Transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___APPLY_TRANSFORM__CARTESIANCOORDINATESSET_MATRIX4D = 18;

	/**
	 * The operation id for the '<em>Apply Transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___APPLY_TRANSFORM__LIST_MATRIX4D = 19;

	/**
	 * The operation id for the '<em>Apply Transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___APPLY_TRANSFORM__CARTESIANTRIANGULARMESH_MATRIX4D = 20;

	/**
	 * The operation id for the '<em>Apply Transform Int</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___APPLY_TRANSFORM_INT__CARTESIANTRIANGULARMESH_MATRIX4D = 21;

	/**
	 * The operation id for the '<em>Apply Transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___APPLY_TRANSFORM__NORMALPOINTCLOUD_MATRIX4D = 22;

	/**
	 * The operation id for the '<em>Update Cartesian Coordinates Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___UPDATE_CARTESIAN_COORDINATES_SET__CARTESIANCOORDINATESSET_DOUBLE = 23;

	/**
	 * The operation id for the '<em>Concatenate Triangular Meshes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE___CONCATENATE_TRIANGULAR_MESHES__ELIST = 24;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3D_FACADE_OPERATION_COUNT = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.Data3DIOImpl <em>Data3 DIO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3DIOImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getData3DIO()
	 * @generated
	 */
	int DATA3_DIO = 47;

	/**
	 * The number of structural features of the '<em>Data3 DIO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DIO_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Load Triangular Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DIO___LOAD_TRIANGULAR_MESH__STRING = 0;

	/**
	 * The operation id for the '<em>Load Triangular Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DIO___LOAD_TRIANGULAR_MESH__INPUTSTREAM = 1;

	/**
	 * The operation id for the '<em>Save Triangular Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DIO___SAVE_TRIANGULAR_MESH__CARTESIANTRIANGULARMESH_STRING = 2;

	/**
	 * The operation id for the '<em>Save Triangular Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DIO___SAVE_TRIANGULAR_MESH__CARTESIANTRIANGULARMESH_OUTPUTSTREAM = 3;

	/**
	 * The operation id for the '<em>Load Triangular Mesh From ASCII As Normal Point Cloud</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DIO___LOAD_TRIANGULAR_MESH_FROM_ASCII_AS_NORMAL_POINT_CLOUD__STRING = 4;

	/**
	 * The operation id for the '<em>Load Triangular Mesh From ASCII</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DIO___LOAD_TRIANGULAR_MESH_FROM_ASCII__STRING = 5;

	/**
	 * The operation id for the '<em>Save Triangular Mesh As ASCII</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DIO___SAVE_TRIANGULAR_MESH_AS_ASCII__CARTESIANTRIANGULARMESH_STRING = 6;

	/**
	 * The operation id for the '<em>Load XYZ</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DIO___LOAD_XYZ__STRING = 7;

	/**
	 * The operation id for the '<em>Load Triangular Mesh From Tri XYZ</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DIO___LOAD_TRIANGULAR_MESH_FROM_TRI_XYZ__STRING_STRING = 8;

	/**
	 * The operation id for the '<em>Save Coordinates Set To XYZ</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DIO___SAVE_COORDINATES_SET_TO_XYZ__CARTESIANCOORDINATESSET_STRING = 9;

	/**
	 * The operation id for the '<em>Save Coordinates Set To XYZ</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DIO___SAVE_COORDINATES_SET_TO_XYZ__CARTESIANCOORDINATESSET_OUTPUTSTREAM = 10;

	/**
	 * The operation id for the '<em>Save Coordinates Set To CSV</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DIO___SAVE_COORDINATES_SET_TO_CSV__CARTESIANCOORDINATESSET_STRING = 11;

	/**
	 * The operation id for the '<em>Save Coordinates Set To CSV</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DIO___SAVE_COORDINATES_SET_TO_CSV__CARTESIANCOORDINATESSET_OUTPUTSTREAM = 12;

	/**
	 * The number of operations of the '<em>Data3 DIO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DIO_OPERATION_COUNT = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.Data3DUtilsImpl <em>Data3 DUtils</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3DUtilsImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getData3DUtils()
	 * @generated
	 */
	int DATA3_DUTILS = 48;

	/**
	 * The number of structural features of the '<em>Data3 DUtils</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DUTILS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Compute Normals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DUTILS___COMPUTE_NORMALS__CARTESIANTRIANGULARMESH = 0;

	/**
	 * The operation id for the '<em>Compute Centroid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DUTILS___COMPUTE_CENTROID__CARTESIANCOORDINATESSET = 1;

	/**
	 * The operation id for the '<em>Compute Min Max Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DUTILS___COMPUTE_MIN_MAX_VALUES__POINT3D_POINT3D_CARTESIANCOORDINATESSET = 2;

	/**
	 * The operation id for the '<em>Compute Curvature Change</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DUTILS___COMPUTE_CURVATURE_CHANGE__POINTLOCATOR_INT_DOUBLE = 3;

	/**
	 * The operation id for the '<em>Compute Curvature Change</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DUTILS___COMPUTE_CURVATURE_CHANGE__VECMATHPOINTLOCATOR_INT_DOUBLE = 4;

	/**
	 * The operation id for the '<em>Extrude</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DUTILS___EXTRUDE__LIST_CARTESIANAXIS_DOUBLE_BOOLEAN = 5;

	/**
	 * The number of operations of the '<em>Data3 DUtils</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DUTILS_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.CartesianAxis <em>Cartesian Axis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianAxis
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianAxis()
	 * @generated
	 */
	int CARTESIAN_AXIS = 49;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.CartesianPlane <em>Cartesian Plane</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianPlane
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianPlane()
	 * @generated
	 */
	int CARTESIAN_PLANE = 50;

	/**
	 * The meta object id for the '<em>Vector2d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Vector2d
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getVector2d()
	 * @generated
	 */
	int VECTOR2D = 51;

	/**
	 * The meta object id for the '<em>Vector3d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Vector3d
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getVector3d()
	 * @generated
	 */
	int VECTOR3D = 52;

	/**
	 * The meta object id for the '<em>Point3d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Point3d
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getPoint3d()
	 * @generated
	 */
	int POINT3D = 53;

	/**
	 * The meta object id for the '<em>Matrix4d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Matrix4d
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getMatrix4d()
	 * @generated
	 */
	int MATRIX4D = 54;

	/**
	 * The meta object id for the '<em>GVector</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.GVector
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getGVector()
	 * @generated
	 */
	int GVECTOR = 55;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getList()
	 * @generated
	 */
	int LIST = 56;

	/**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 57;

	/**
	 * The meta object id for the '<em>Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Set
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getSet()
	 * @generated
	 */
	int SET = 58;

	/**
	 * The meta object id for the '<em>Sorted Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.SortedSet
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getSortedSet()
	 * @generated
	 */
	int SORTED_SET = 59;

	/**
	 * The meta object id for the '<em>Collection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 60;

	/**
	 * The meta object id for the '<em>EList</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.EList
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getEList()
	 * @generated
	 */
	int ELIST = 61;

	/**
	 * The meta object id for the '<em>IProgress Monitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getIProgressMonitor()
	 * @generated
	 */
	int IPROGRESS_MONITOR = 62;

	/**
	 * The meta object id for the '<em>Output Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.OutputStream
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getOutputStream()
	 * @generated
	 */
	int OUTPUT_STREAM = 63;

	/**
	 * The meta object id for the '<em>Input Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.InputStream
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getInputStream()
	 * @generated
	 */
	int INPUT_STREAM = 64;

	/**
	 * The meta object id for the '<em>IO Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.IOException
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getIOException()
	 * @generated
	 */
	int IO_EXCEPTION = 65;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 66;

	/**
	 * The meta object id for the '<em>Illegal Argument Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.IllegalArgumentException
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getIllegalArgumentException()
	 * @generated
	 */
	int ILLEGAL_ARGUMENT_EXCEPTION = 67;

	/**
	 * The meta object id for the '<em>Double Array Of Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getDoubleArrayOfArray()
	 * @generated
	 */
	int DOUBLE_ARRAY_OF_ARRAY = 68;

	/**
	 * The meta object id for the '<em>Int Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getIntArray()
	 * @generated
	 */
	int INT_ARRAY = 69;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.CartesianPolygon <em>Cartesian Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Polygon</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianPolygon
	 * @generated
	 */
	EClass getCartesianPolygon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.CartesianPolygon#getSurface <em>Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surface</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianPolygon#getSurface()
	 * @see #getCartesianPolygon()
	 * @generated
	 */
	EAttribute getCartesianPolygon_Surface();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.CartesianPolygon#getNormal <em>Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianPolygon#getNormal()
	 * @see #getCartesianPolygon()
	 * @generated
	 */
	EAttribute getCartesianPolygon_Normal();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.geometry.data3d.CartesianPolygon#getCentroid <em>Centroid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Centroid</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianPolygon#getCentroid()
	 * @see #getCartesianPolygon()
	 * @generated
	 */
	EReference getCartesianPolygon_Centroid();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.CartesianTriangle <em>Cartesian Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangle</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianTriangle
	 * @generated
	 */
	EClass getCartesianTriangle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.SphericalPolygon <em>Spherical Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spherical Polygon</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.SphericalPolygon
	 * @generated
	 */
	EClass getSphericalPolygon();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.SphericalTriangle <em>Spherical Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spherical Triangle</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.SphericalTriangle
	 * @generated
	 */
	EClass getSphericalTriangle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates <em>Cartesian Position Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Position Coordinates</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates
	 * @generated
	 */
	EClass getCartesianPositionCoordinates();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates#getX()
	 * @see #getCartesianPositionCoordinates()
	 * @generated
	 */
	EAttribute getCartesianPositionCoordinates_X();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates#getY()
	 * @see #getCartesianPositionCoordinates()
	 * @generated
	 */
	EAttribute getCartesianPositionCoordinates_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates#getZ()
	 * @see #getCartesianPositionCoordinates()
	 * @generated
	 */
	EAttribute getCartesianPositionCoordinates_Z();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates#asPoint3d() <em>As Point3d</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Point3d</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates#asPoint3d()
	 * @generated
	 */
	EOperation getCartesianPositionCoordinates__AsPoint3d();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.RGBCartesianPositionCoordinates <em>RGB Cartesian Position Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RGB Cartesian Position Coordinates</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.RGBCartesianPositionCoordinates
	 * @generated
	 */
	EClass getRGBCartesianPositionCoordinates();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.RGBCartesianPositionCoordinates#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.RGBCartesianPositionCoordinates#getRed()
	 * @see #getRGBCartesianPositionCoordinates()
	 * @generated
	 */
	EAttribute getRGBCartesianPositionCoordinates_Red();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.RGBCartesianPositionCoordinates#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.RGBCartesianPositionCoordinates#getGreen()
	 * @see #getRGBCartesianPositionCoordinates()
	 * @generated
	 */
	EAttribute getRGBCartesianPositionCoordinates_Green();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.RGBCartesianPositionCoordinates#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.RGBCartesianPositionCoordinates#getBlue()
	 * @see #getRGBCartesianPositionCoordinates()
	 * @generated
	 */
	EAttribute getRGBCartesianPositionCoordinates_Blue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates <em>Cartesian Orientation Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Orientation Coordinates</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates
	 * @generated
	 */
	EClass getCartesianOrientationCoordinates();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates#getXRotation <em>XRotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XRotation</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates#getXRotation()
	 * @see #getCartesianOrientationCoordinates()
	 * @generated
	 */
	EAttribute getCartesianOrientationCoordinates_XRotation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates#getYRotation <em>YRotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YRotation</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates#getYRotation()
	 * @see #getCartesianOrientationCoordinates()
	 * @generated
	 */
	EAttribute getCartesianOrientationCoordinates_YRotation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates#getZRotation <em>ZRotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZRotation</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates#getZRotation()
	 * @see #getCartesianOrientationCoordinates()
	 * @generated
	 */
	EAttribute getCartesianOrientationCoordinates_ZRotation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet <em>Cartesian Coordinates Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Coordinates Set</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet
	 * @generated
	 */
	EClass getCartesianCoordinatesSet();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet#getExtent() <em>Get Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Extent</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet#getExtent()
	 * @generated
	 */
	EOperation getCartesianCoordinatesSet__GetExtent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent <em>Cartesian Coordinates Set Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Coordinates Set Extent</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent
	 * @generated
	 */
	EClass getCartesianCoordinatesSetExtent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getXMin <em>XMin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XMin</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getXMin()
	 * @see #getCartesianCoordinatesSetExtent()
	 * @generated
	 */
	EAttribute getCartesianCoordinatesSetExtent_XMin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getXMax <em>XMax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XMax</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getXMax()
	 * @see #getCartesianCoordinatesSetExtent()
	 * @generated
	 */
	EAttribute getCartesianCoordinatesSetExtent_XMax();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getYMin <em>YMin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YMin</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getYMin()
	 * @see #getCartesianCoordinatesSetExtent()
	 * @generated
	 */
	EAttribute getCartesianCoordinatesSetExtent_YMin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getYMax <em>YMax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YMax</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getYMax()
	 * @see #getCartesianCoordinatesSetExtent()
	 * @generated
	 */
	EAttribute getCartesianCoordinatesSetExtent_YMax();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getZMin <em>ZMin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZMin</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getZMin()
	 * @see #getCartesianCoordinatesSetExtent()
	 * @generated
	 */
	EAttribute getCartesianCoordinatesSetExtent_ZMin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getZMax <em>ZMax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZMax</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getZMax()
	 * @see #getCartesianCoordinatesSetExtent()
	 * @generated
	 */
	EAttribute getCartesianCoordinatesSetExtent_ZMax();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getXDimension <em>XDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDimension</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getXDimension()
	 * @see #getCartesianCoordinatesSetExtent()
	 * @generated
	 */
	EAttribute getCartesianCoordinatesSetExtent_XDimension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getYDimension <em>YDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YDimension</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getYDimension()
	 * @see #getCartesianCoordinatesSetExtent()
	 * @generated
	 */
	EAttribute getCartesianCoordinatesSetExtent_YDimension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getZDimension <em>ZDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZDimension</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getZDimension()
	 * @see #getCartesianCoordinatesSetExtent()
	 * @generated
	 */
	EAttribute getCartesianCoordinatesSetExtent_ZDimension();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.DigitalElevationMap <em>Digital Elevation Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Elevation Map</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.DigitalElevationMap
	 * @generated
	 */
	EClass getDigitalElevationMap();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.DigitalElevationMap#getXDimension <em>XDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDimension</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.DigitalElevationMap#getXDimension()
	 * @see #getDigitalElevationMap()
	 * @generated
	 */
	EAttribute getDigitalElevationMap_XDimension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.DigitalElevationMap#getYDimension <em>YDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YDimension</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.DigitalElevationMap#getYDimension()
	 * @see #getDigitalElevationMap()
	 * @generated
	 */
	EAttribute getDigitalElevationMap_YDimension();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesMesh <em>Cartesian Coordinates Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Coordinates Mesh</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesMesh
	 * @generated
	 */
	EClass getCartesianCoordinatesMesh();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh <em>Cartesian Triangular Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangular Mesh</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh
	 * @generated
	 */
	EClass getCartesianTriangularMesh();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.SphericalCoordinates <em>Spherical Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spherical Coordinates</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.SphericalCoordinates
	 * @generated
	 */
	EClass getSphericalCoordinates();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.SphericalCoordinates#getPhi <em>Phi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phi</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.SphericalCoordinates#getPhi()
	 * @see #getSphericalCoordinates()
	 * @generated
	 */
	EAttribute getSphericalCoordinates_Phi();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.SphericalCoordinates#getTheta <em>Theta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theta</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.SphericalCoordinates#getTheta()
	 * @see #getSphericalCoordinates()
	 * @generated
	 */
	EAttribute getSphericalCoordinates_Theta();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.SphericalCoordinates#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.SphericalCoordinates#getR()
	 * @see #getSphericalCoordinates()
	 * @generated
	 */
	EAttribute getSphericalCoordinates_R();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.SphericalCoordinatesSet <em>Spherical Coordinates Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spherical Coordinates Set</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.SphericalCoordinatesSet
	 * @generated
	 */
	EClass getSphericalCoordinatesSet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.SphericalCoordinatesMesh <em>Spherical Coordinates Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spherical Coordinates Mesh</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.SphericalCoordinatesMesh
	 * @generated
	 */
	EClass getSphericalCoordinatesMesh();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.SphericalTriangularMesh <em>Spherical Triangular Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spherical Triangular Mesh</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.SphericalTriangularMesh
	 * @generated
	 */
	EClass getSphericalTriangularMesh();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.Pose <em>Pose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pose</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.Pose
	 * @generated
	 */
	EClass getPose();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.SphereSamplingShape <em>Sphere Sampling Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sphere Sampling Shape</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.SphereSamplingShape
	 * @generated
	 */
	EClass getSphereSamplingShape();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.SphereSamplingShape#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.SphereSamplingShape#getRadius()
	 * @see #getSphereSamplingShape()
	 * @generated
	 */
	EAttribute getSphereSamplingShape_Radius();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.geometry.data3d.SphereSamplingShape#getCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Center</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.SphereSamplingShape#getCenter()
	 * @see #getSphereSamplingShape()
	 * @generated
	 */
	EReference getSphereSamplingShape_Center();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.SphereSamplingShape#isIncludeJustTouching <em>Include Just Touching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Just Touching</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.SphereSamplingShape#isIncludeJustTouching()
	 * @see #getSphereSamplingShape()
	 * @generated
	 */
	EAttribute getSphereSamplingShape_IncludeJustTouching();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.CubeSamplingShape <em>Cube Sampling Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cube Sampling Shape</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CubeSamplingShape
	 * @generated
	 */
	EClass getCubeSamplingShape();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.geometry.data3d.CubeSamplingShape#getCorner1 <em>Corner1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Corner1</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CubeSamplingShape#getCorner1()
	 * @see #getCubeSamplingShape()
	 * @generated
	 */
	EReference getCubeSamplingShape_Corner1();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.geometry.data3d.CubeSamplingShape#getCorner2 <em>Corner2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Corner2</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CubeSamplingShape#getCorner2()
	 * @see #getCubeSamplingShape()
	 * @generated
	 */
	EReference getCubeSamplingShape_Corner2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.CubeSamplingShape#isIncludeJustTouching <em>Include Just Touching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Just Touching</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CubeSamplingShape#isIncludeJustTouching()
	 * @see #getCubeSamplingShape()
	 * @generated
	 */
	EAttribute getCubeSamplingShape_IncludeJustTouching();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetShapeSampler <em>Cartesian Coordinates Set Shape Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Coordinates Set Shape Sampler</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetShapeSampler
	 * @generated
	 */
	EClass getCartesianCoordinatesSetShapeSampler();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesMeshSampler <em>Cartesian Coordinates Mesh Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Coordinates Mesh Sampler</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesMeshSampler
	 * @generated
	 */
	EClass getCartesianCoordinatesMeshSampler();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesMeshPolygonSampler <em>Cartesian Coordinates Mesh Polygon Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Coordinates Mesh Polygon Sampler</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesMeshPolygonSampler
	 * @generated
	 */
	EClass getCartesianCoordinatesMeshPolygonSampler();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMeshSampler <em>Cartesian Triangular Mesh Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangular Mesh Sampler</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMeshSampler
	 * @generated
	 */
	EClass getCartesianTriangularMeshSampler();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMeshPolygonSampler <em>Cartesian Triangular Mesh Polygon Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangular Mesh Polygon Sampler</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMeshPolygonSampler
	 * @generated
	 */
	EClass getCartesianTriangularMeshPolygonSampler();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinatesMesher <em>Cartesian Position Coordinates Mesher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Position Coordinates Mesher</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinatesMesher
	 * @generated
	 */
	EClass getCartesianPositionCoordinatesMesher();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.NormalPointCloud <em>Normal Point Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Point Cloud</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.NormalPointCloud
	 * @generated
	 */
	EClass getNormalPointCloud();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.NormalPointCloud#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.NormalPointCloud#getPoints()
	 * @see #getNormalPointCloud()
	 * @generated
	 */
	EAttribute getNormalPointCloud_Points();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.NormalPointCloud#getNormals <em>Normals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normals</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.NormalPointCloud#getNormals()
	 * @see #getNormalPointCloud()
	 * @generated
	 */
	EAttribute getNormalPointCloud_Normals();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.PointLocator <em>Point Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Locator</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.PointLocator
	 * @generated
	 */
	EClass getPointLocator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.PointLocator#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.PointLocator#getPoints()
	 * @see #getPointLocator()
	 * @generated
	 */
	EAttribute getPointLocator_Points();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.PointLocator#findClosestPoint(org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates) <em>Find Closest Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Closest Point</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.PointLocator#findClosestPoint(org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated
	 */
	EOperation getPointLocator__FindClosestPoint__CartesianPositionCoordinates();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.PointLocator#findPointsWithinRadius(double, org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates) <em>Find Points Within Radius</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Points Within Radius</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.PointLocator#findPointsWithinRadius(double, org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated
	 */
	EOperation getPointLocator__FindPointsWithinRadius__double_CartesianPositionCoordinates();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.VecmathPointLocator <em>Vecmath Point Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vecmath Point Locator</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.VecmathPointLocator
	 * @generated
	 */
	EClass getVecmathPointLocator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.VecmathPointLocator#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.VecmathPointLocator#getPoints()
	 * @see #getVecmathPointLocator()
	 * @generated
	 */
	EAttribute getVecmathPointLocator_Points();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.VecmathPointLocator#findClosestPoint(javax.vecmath.Point3d) <em>Find Closest Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Closest Point</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.VecmathPointLocator#findClosestPoint(javax.vecmath.Point3d)
	 * @generated
	 */
	EOperation getVecmathPointLocator__FindClosestPoint__Point3d();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.VecmathPointLocator#findPointsWithinRadius(double, javax.vecmath.Point3d) <em>Find Points Within Radius</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Points Within Radius</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.VecmathPointLocator#findPointsWithinRadius(double, javax.vecmath.Point3d)
	 * @generated
	 */
	EOperation getVecmathPointLocator__FindPointsWithinRadius__double_Point3d();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.VecmathPointLocator#findClosestPointId(javax.vecmath.Point3d) <em>Find Closest Point Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Closest Point Id</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.VecmathPointLocator#findClosestPointId(javax.vecmath.Point3d)
	 * @generated
	 */
	EOperation getVecmathPointLocator__FindClosestPointId__Point3d();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.VecmathPointLocator#findPointIdsWithinRadius(double, javax.vecmath.Point3d) <em>Find Point Ids Within Radius</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Point Ids Within Radius</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.VecmathPointLocator#findPointIdsWithinRadius(double, javax.vecmath.Point3d)
	 * @generated
	 */
	EOperation getVecmathPointLocator__FindPointIdsWithinRadius__double_Point3d();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.VecmathPointLocator#findClosestNPoints(javax.vecmath.Point3d, int) <em>Find Closest NPoints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Closest NPoints</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.VecmathPointLocator#findClosestNPoints(javax.vecmath.Point3d, int)
	 * @generated
	 */
	EOperation getVecmathPointLocator__FindClosestNPoints__Point3d_int();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.VecmathPointLocator#findClosestNPointIds(javax.vecmath.Point3d, int) <em>Find Closest NPoint Ids</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Closest NPoint Ids</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.VecmathPointLocator#findClosestNPointIds(javax.vecmath.Point3d, int)
	 * @generated
	 */
	EOperation getVecmathPointLocator__FindClosestNPointIds__Point3d_int();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.VecmathKdTreePointLocator <em>Vecmath Kd Tree Point Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vecmath Kd Tree Point Locator</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.VecmathKdTreePointLocator
	 * @generated
	 */
	EClass getVecmathKdTreePointLocator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.MeshLocalizer <em>Mesh Localizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mesh Localizer</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.MeshLocalizer
	 * @generated
	 */
	EClass getMeshLocalizer();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.MeshLocalizer#localize(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh, javax.vecmath.Matrix4d, org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh, javax.vecmath.Matrix4d) <em>Localize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Localize</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.MeshLocalizer#localize(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh, javax.vecmath.Matrix4d, org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh, javax.vecmath.Matrix4d)
	 * @generated
	 */
	EOperation getMeshLocalizer__Localize__CartesianTriangularMesh_Matrix4d_CartesianTriangularMesh_Matrix4d();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.PointNormalLocator <em>Point Normal Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Normal Locator</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.PointNormalLocator
	 * @generated
	 */
	EClass getPointNormalLocator();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.geometry.data3d.PointNormalLocator#getDataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Set</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.PointNormalLocator#getDataSet()
	 * @see #getPointNormalLocator()
	 * @generated
	 */
	EReference getPointNormalLocator_DataSet();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.PointNormalLocator#findClosestPoint(javax.vecmath.Point3d, javax.vecmath.Vector3d) <em>Find Closest Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Closest Point</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.PointNormalLocator#findClosestPoint(javax.vecmath.Point3d, javax.vecmath.Vector3d)
	 * @generated
	 */
	EOperation getPointNormalLocator__FindClosestPoint__Point3d_Vector3d();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.PointNormalLocator#findPointsWithinRadius(double, javax.vecmath.Point3d, javax.vecmath.Vector3d) <em>Find Points Within Radius</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Points Within Radius</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.PointNormalLocator#findPointsWithinRadius(double, javax.vecmath.Point3d, javax.vecmath.Vector3d)
	 * @generated
	 */
	EOperation getPointNormalLocator__FindPointsWithinRadius__double_Point3d_Vector3d();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.PointNormalLocator#findClosestNPoints(int, javax.vecmath.Point3d, javax.vecmath.Vector3d) <em>Find Closest NPoints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Closest NPoints</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.PointNormalLocator#findClosestNPoints(int, javax.vecmath.Point3d, javax.vecmath.Vector3d)
	 * @generated
	 */
	EOperation getPointNormalLocator__FindClosestNPoints__int_Point3d_Vector3d();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.PointNormalLocator#findClosestPointId(javax.vecmath.Point3d, javax.vecmath.Vector3d) <em>Find Closest Point Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Closest Point Id</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.PointNormalLocator#findClosestPointId(javax.vecmath.Point3d, javax.vecmath.Vector3d)
	 * @generated
	 */
	EOperation getPointNormalLocator__FindClosestPointId__Point3d_Vector3d();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.PointNormalLocator#findPointIdsWithinRadius(double, javax.vecmath.Point3d, javax.vecmath.Vector3d) <em>Find Point Ids Within Radius</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Point Ids Within Radius</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.PointNormalLocator#findPointIdsWithinRadius(double, javax.vecmath.Point3d, javax.vecmath.Vector3d)
	 * @generated
	 */
	EOperation getPointNormalLocator__FindPointIdsWithinRadius__double_Point3d_Vector3d();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.PointNormalLocator#findClosestNPointIds(int, javax.vecmath.Point3d, javax.vecmath.Vector3d) <em>Find Closest NPoint Ids</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Closest NPoint Ids</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.PointNormalLocator#findClosestNPointIds(int, javax.vecmath.Point3d, javax.vecmath.Vector3d)
	 * @generated
	 */
	EOperation getPointNormalLocator__FindClosestNPointIds__int_Point3d_Vector3d();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.DelaunayMesher <em>Delaunay Mesher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delaunay Mesher</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.DelaunayMesher
	 * @generated
	 */
	EClass getDelaunayMesher();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.DelaunayMesher#getTolerance <em>Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tolerance</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.DelaunayMesher#getTolerance()
	 * @see #getDelaunayMesher()
	 * @generated
	 */
	EAttribute getDelaunayMesher_Tolerance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.DelaunayMesher#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.DelaunayMesher#getAlpha()
	 * @see #getDelaunayMesher()
	 * @generated
	 */
	EAttribute getDelaunayMesher_Alpha();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.DelaunayMesher#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.DelaunayMesher#getOffset()
	 * @see #getDelaunayMesher()
	 * @generated
	 */
	EAttribute getDelaunayMesher_Offset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.DelaunayMesher#isBoundingTriangulation <em>Bounding Triangulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bounding Triangulation</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.DelaunayMesher#isBoundingTriangulation()
	 * @see #getDelaunayMesher()
	 * @generated
	 */
	EAttribute getDelaunayMesher_BoundingTriangulation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.DelaunayMesher#getMeshingPlane <em>Meshing Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meshing Plane</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.DelaunayMesher#getMeshingPlane()
	 * @see #getDelaunayMesher()
	 * @generated
	 */
	EAttribute getDelaunayMesher_MeshingPlane();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.DigitalElevationMapMesher <em>Digital Elevation Map Mesher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Elevation Map Mesher</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.DigitalElevationMapMesher
	 * @generated
	 */
	EClass getDigitalElevationMapMesher();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.DigitalElevationMapSampler <em>Digital Elevation Map Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Elevation Map Sampler</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.DigitalElevationMapSampler
	 * @generated
	 */
	EClass getDigitalElevationMapSampler();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.DigitalElevationMapSampler#getTargetResolution <em>Target Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Resolution</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.DigitalElevationMapSampler#getTargetResolution()
	 * @see #getDigitalElevationMapSampler()
	 * @generated
	 */
	EAttribute getDigitalElevationMapSampler_TargetResolution();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.TriangularMeshNormalsCalculator <em>Triangular Mesh Normals Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangular Mesh Normals Calculator</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.TriangularMeshNormalsCalculator
	 * @generated
	 */
	EClass getTriangularMeshNormalsCalculator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.TriangularMeshToNormalPointCloud <em>Triangular Mesh To Normal Point Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangular Mesh To Normal Point Cloud</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.TriangularMeshToNormalPointCloud
	 * @generated
	 */
	EClass getTriangularMeshToNormalPointCloud();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.PointsRangeGager <em>Points Range Gager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Points Range Gager</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.PointsRangeGager
	 * @generated
	 */
	EClass getPointsRangeGager();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.PointsRangeGager#getMinX <em>Min X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min X</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.PointsRangeGager#getMinX()
	 * @see #getPointsRangeGager()
	 * @generated
	 */
	EAttribute getPointsRangeGager_MinX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.PointsRangeGager#getMaxX <em>Max X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max X</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.PointsRangeGager#getMaxX()
	 * @see #getPointsRangeGager()
	 * @generated
	 */
	EAttribute getPointsRangeGager_MaxX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.PointsRangeGager#getMinY <em>Min Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Y</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.PointsRangeGager#getMinY()
	 * @see #getPointsRangeGager()
	 * @generated
	 */
	EAttribute getPointsRangeGager_MinY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.PointsRangeGager#getMaxY <em>Max Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Y</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.PointsRangeGager#getMaxY()
	 * @see #getPointsRangeGager()
	 * @generated
	 */
	EAttribute getPointsRangeGager_MaxY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.PointsRangeGager#getMinZ <em>Min Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Z</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.PointsRangeGager#getMinZ()
	 * @see #getPointsRangeGager()
	 * @generated
	 */
	EAttribute getPointsRangeGager_MinZ();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.PointsRangeGager#getMaxZ <em>Max Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Z</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.PointsRangeGager#getMaxZ()
	 * @see #getPointsRangeGager()
	 * @generated
	 */
	EAttribute getPointsRangeGager_MaxZ();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.UniquePointsFilter <em>Unique Points Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Points Filter</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.UniquePointsFilter
	 * @generated
	 */
	EClass getUniquePointsFilter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter <em>Triangle Edge Length Triangular Mesh Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangle Edge Length Triangular Mesh Filter</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter
	 * @generated
	 */
	EClass getTriangleEdgeLengthTriangularMeshFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMinimumRange <em>Minimum Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Range</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMinimumRange()
	 * @see #getTriangleEdgeLengthTriangularMeshFilter()
	 * @generated
	 */
	EAttribute getTriangleEdgeLengthTriangularMeshFilter_MinimumRange();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMaximumRange <em>Maximum Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Range</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMaximumRange()
	 * @see #getTriangleEdgeLengthTriangularMeshFilter()
	 * @generated
	 */
	EAttribute getTriangleEdgeLengthTriangularMeshFilter_MaximumRange();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMaximumEdgeLength <em>Maximum Edge Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Edge Length</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMaximumEdgeLength()
	 * @see #getTriangleEdgeLengthTriangularMeshFilter()
	 * @generated
	 */
	EAttribute getTriangleEdgeLengthTriangularMeshFilter_MaximumEdgeLength();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#filter(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh) <em>Filter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Filter</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#filter(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh)
	 * @generated
	 */
	EOperation getTriangleEdgeLengthTriangularMeshFilter__Filter__CartesianTriangularMesh();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.OutlierFilter <em>Outlier Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outlier Filter</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.OutlierFilter
	 * @generated
	 */
	EClass getOutlierFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.OutlierFilter#getMaxDistance <em>Max Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Distance</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.OutlierFilter#getMaxDistance()
	 * @see #getOutlierFilter()
	 * @generated
	 */
	EAttribute getOutlierFilter_MaxDistance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.RasterPointCloud <em>Raster Point Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raster Point Cloud</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.RasterPointCloud
	 * @generated
	 */
	EClass getRasterPointCloud();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.RasterPointCloud#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.RasterPointCloud#getRows()
	 * @see #getRasterPointCloud()
	 * @generated
	 */
	EAttribute getRasterPointCloud_Rows();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.RasterPointCloud#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.RasterPointCloud#getColumns()
	 * @see #getRasterPointCloud()
	 * @generated
	 */
	EAttribute getRasterPointCloud_Columns();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.RasterPointCloud#getPoint(int, int) <em>Get Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Point</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.RasterPointCloud#getPoint(int, int)
	 * @generated
	 */
	EOperation getRasterPointCloud__GetPoint__int_int();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.RasterPointCloud#setPoint(int, int, org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates) <em>Set Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Point</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.RasterPointCloud#setPoint(int, int, org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated
	 */
	EOperation getRasterPointCloud__SetPoint__int_int_CartesianPositionCoordinates();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.RasterPointCloudToCartesianCoordinatesSet <em>Raster Point Cloud To Cartesian Coordinates Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raster Point Cloud To Cartesian Coordinates Set</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.RasterPointCloudToCartesianCoordinatesSet
	 * @generated
	 */
	EClass getRasterPointCloudToCartesianCoordinatesSet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.MeshSmoother <em>Mesh Smoother</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mesh Smoother</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.MeshSmoother
	 * @generated
	 */
	EClass getMeshSmoother();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.MeshSmoother#getNumberOfIterations <em>Number Of Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Iterations</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.MeshSmoother#getNumberOfIterations()
	 * @see #getMeshSmoother()
	 * @generated
	 */
	EAttribute getMeshSmoother_NumberOfIterations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.VoxelBased3DPointCloudResampler <em>Voxel Based3 DPoint Cloud Resampler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voxel Based3 DPoint Cloud Resampler</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.VoxelBased3DPointCloudResampler
	 * @generated
	 */
	EClass getVoxelBased3DPointCloudResampler();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.VoxelBased3DPointCloudResampler#getResolutionX <em>Resolution X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution X</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.VoxelBased3DPointCloudResampler#getResolutionX()
	 * @see #getVoxelBased3DPointCloudResampler()
	 * @generated
	 */
	EAttribute getVoxelBased3DPointCloudResampler_ResolutionX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.VoxelBased3DPointCloudResampler#getResolutionY <em>Resolution Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution Y</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.VoxelBased3DPointCloudResampler#getResolutionY()
	 * @see #getVoxelBased3DPointCloudResampler()
	 * @generated
	 */
	EAttribute getVoxelBased3DPointCloudResampler_ResolutionY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.VoxelBased3DPointCloudResampler#getResolutionZ <em>Resolution Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution Z</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.VoxelBased3DPointCloudResampler#getResolutionZ()
	 * @see #getVoxelBased3DPointCloudResampler()
	 * @generated
	 */
	EAttribute getVoxelBased3DPointCloudResampler_ResolutionZ();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.VoxelBased3DPointCloudResampler#getMinimumNumberOfPointPerVoxel <em>Minimum Number Of Point Per Voxel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Number Of Point Per Voxel</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.VoxelBased3DPointCloudResampler#getMinimumNumberOfPointPerVoxel()
	 * @see #getVoxelBased3DPointCloudResampler()
	 * @generated
	 */
	EAttribute getVoxelBased3DPointCloudResampler_MinimumNumberOfPointPerVoxel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.VoxelBased3DPointCloudResampler#getTileResolution <em>Tile Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tile Resolution</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.VoxelBased3DPointCloudResampler#getTileResolution()
	 * @see #getVoxelBased3DPointCloudResampler()
	 * @generated
	 */
	EAttribute getVoxelBased3DPointCloudResampler_TileResolution();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker <em>Rigid Body Pose Tracker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rigid Body Pose Tracker</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker
	 * @generated
	 */
	EClass getRigidBodyPoseTracker();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#getPositionMarkersAtOrigin <em>Position Markers At Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Position Markers At Origin</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#getPositionMarkersAtOrigin()
	 * @see #getRigidBodyPoseTracker()
	 * @generated
	 */
	EReference getRigidBodyPoseTracker_PositionMarkersAtOrigin();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#computeTransformation(org.eclipse.emf.common.util.EList) <em>Compute Transformation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Transformation</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#computeTransformation(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getRigidBodyPoseTracker__ComputeTransformation__EList();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#computeTransformation(java.util.List) <em>Compute Transformation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Transformation</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#computeTransformation(java.util.List)
	 * @generated
	 */
	EOperation getRigidBodyPoseTracker__ComputeTransformation__List();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#addPositionMarkers(java.util.List) <em>Add Position Markers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Position Markers</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#addPositionMarkers(java.util.List)
	 * @generated
	 */
	EOperation getRigidBodyPoseTracker__AddPositionMarkers__List();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#removePositionMarkers(java.util.List) <em>Remove Position Markers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Position Markers</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#removePositionMarkers(java.util.List)
	 * @generated
	 */
	EOperation getRigidBodyPoseTracker__RemovePositionMarkers__List();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.PositionMarker <em>Position Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Marker</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.PositionMarker
	 * @generated
	 */
	EClass getPositionMarker();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.PositionMarker#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.PositionMarker#getIdentifier()
	 * @see #getPositionMarker()
	 * @generated
	 */
	EAttribute getPositionMarker_Identifier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade
	 * @generated
	 */
	EClass getData3dFacade();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianPositionCoordinates(double, double, double) <em>Create Cartesian Position Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Position Coordinates</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianPositionCoordinates(double, double, double)
	 * @generated
	 */
	EOperation getData3dFacade__CreateCartesianPositionCoordinates__double_double_double();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianOrientationCoordinates(double, double, double) <em>Create Cartesian Orientation Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Orientation Coordinates</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianOrientationCoordinates(double, double, double)
	 * @generated
	 */
	EOperation getData3dFacade__CreateCartesianOrientationCoordinates__double_double_double();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createSphericalCoordinates(double, double, double) <em>Create Spherical Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Spherical Coordinates</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createSphericalCoordinates(double, double, double)
	 * @generated
	 */
	EOperation getData3dFacade__CreateSphericalCoordinates__double_double_double();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createPose(double, double, double, double, double, double) <em>Create Pose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Pose</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createPose(double, double, double, double, double, double)
	 * @generated
	 */
	EOperation getData3dFacade__CreatePose__double_double_double_double_double_double();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createPose(org.eclipse.symphony.common.geometry.data3d.Pose) <em>Create Pose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Pose</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createPose(org.eclipse.symphony.common.geometry.data3d.Pose)
	 * @generated
	 */
	EOperation getData3dFacade__CreatePose__Pose();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createPose(org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates, org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates) <em>Create Pose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Pose</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createPose(org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates, org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates)
	 * @generated
	 */
	EOperation getData3dFacade__CreatePose__CartesianPositionCoordinates_CartesianOrientationCoordinates();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createPointNormalLocator(org.eclipse.symphony.common.geometry.data3d.NormalPointCloud) <em>Create Point Normal Locator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Point Normal Locator</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createPointNormalLocator(org.eclipse.symphony.common.geometry.data3d.NormalPointCloud)
	 * @generated
	 */
	EOperation getData3dFacade__CreatePointNormalLocator__NormalPointCloud();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createDigitalElevationMap(org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet) <em>Create Digital Elevation Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Digital Elevation Map</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createDigitalElevationMap(org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet)
	 * @generated
	 */
	EOperation getData3dFacade__CreateDigitalElevationMap__CartesianCoordinatesSet();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianPolygon(org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates, org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates, org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates) <em>Create Cartesian Polygon</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Polygon</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianPolygon(org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates, org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates, org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated
	 */
	EOperation getData3dFacade__CreateCartesianPolygon__CartesianPositionCoordinates_CartesianPositionCoordinates_CartesianPositionCoordinates();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianPositionCoordinates(org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates) <em>Create Cartesian Position Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Position Coordinates</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianPositionCoordinates(org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated
	 */
	EOperation getData3dFacade__CreateCartesianPositionCoordinates__CartesianPositionCoordinates();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianOrientationCoordinates(org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates) <em>Create Cartesian Orientation Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Orientation Coordinates</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianOrientationCoordinates(org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates)
	 * @generated
	 */
	EOperation getData3dFacade__CreateCartesianOrientationCoordinates__CartesianOrientationCoordinates();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianCoordinatesMesh(org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesMesh) <em>Create Cartesian Coordinates Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Coordinates Mesh</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianCoordinatesMesh(org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesMesh)
	 * @generated
	 */
	EOperation getData3dFacade__CreateCartesianCoordinatesMesh__CartesianCoordinatesMesh();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianTriangle(org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates, org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates, org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates) <em>Create Cartesian Triangle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Triangle</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianTriangle(org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates, org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates, org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated
	 */
	EOperation getData3dFacade__CreateCartesianTriangle__CartesianPositionCoordinates_CartesianPositionCoordinates_CartesianPositionCoordinates();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianTriangle(org.eclipse.symphony.common.geometry.data3d.CartesianPolygon) <em>Create Cartesian Triangle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Triangle</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianTriangle(org.eclipse.symphony.common.geometry.data3d.CartesianPolygon)
	 * @generated
	 */
	EOperation getData3dFacade__CreateCartesianTriangle__CartesianPolygon();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianCoordinatesMesh(java.util.List) <em>Create Cartesian Coordinates Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Coordinates Mesh</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianCoordinatesMesh(java.util.List)
	 * @generated
	 */
	EOperation getData3dFacade__CreateCartesianCoordinatesMesh__List();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianCoordinatesMesh(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh) <em>Create Cartesian Coordinates Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Coordinates Mesh</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianCoordinatesMesh(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh)
	 * @generated
	 */
	EOperation getData3dFacade__CreateCartesianCoordinatesMesh__CartesianTriangularMesh();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianTriangularMesh(java.util.List) <em>Create Cartesian Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Triangular Mesh</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianTriangularMesh(java.util.List)
	 * @generated
	 */
	EOperation getData3dFacade__CreateCartesianTriangularMesh__List();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianTriangularMesh(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh) <em>Create Cartesian Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Triangular Mesh</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#createCartesianTriangularMesh(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh)
	 * @generated
	 */
	EOperation getData3dFacade__CreateCartesianTriangularMesh__CartesianTriangularMesh();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#applyTransform(org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet, javax.vecmath.Matrix4d) <em>Apply Transform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Transform</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#applyTransform(org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet, javax.vecmath.Matrix4d)
	 * @generated
	 */
	EOperation getData3dFacade__ApplyTransform__CartesianCoordinatesSet_Matrix4d();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#applyTransform(java.util.List, javax.vecmath.Matrix4d) <em>Apply Transform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Transform</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#applyTransform(java.util.List, javax.vecmath.Matrix4d)
	 * @generated
	 */
	EOperation getData3dFacade__ApplyTransform__List_Matrix4d();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#applyTransform(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh, javax.vecmath.Matrix4d) <em>Apply Transform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Transform</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#applyTransform(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh, javax.vecmath.Matrix4d)
	 * @generated
	 */
	EOperation getData3dFacade__ApplyTransform__CartesianTriangularMesh_Matrix4d();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#applyTransformInt(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh, javax.vecmath.Matrix4d) <em>Apply Transform Int</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Transform Int</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#applyTransformInt(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh, javax.vecmath.Matrix4d)
	 * @generated
	 */
	EOperation getData3dFacade__ApplyTransformInt__CartesianTriangularMesh_Matrix4d();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#applyTransform(org.eclipse.symphony.common.geometry.data3d.NormalPointCloud, javax.vecmath.Matrix4d) <em>Apply Transform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Transform</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#applyTransform(org.eclipse.symphony.common.geometry.data3d.NormalPointCloud, javax.vecmath.Matrix4d)
	 * @generated
	 */
	EOperation getData3dFacade__ApplyTransform__NormalPointCloud_Matrix4d();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#updateCartesianCoordinatesSet(org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet, double[][]) <em>Update Cartesian Coordinates Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Cartesian Coordinates Set</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#updateCartesianCoordinatesSet(org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet, double[][])
	 * @generated
	 */
	EOperation getData3dFacade__UpdateCartesianCoordinatesSet__CartesianCoordinatesSet_double();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3dFacade#concatenateTriangularMeshes(org.eclipse.emf.common.util.EList) <em>Concatenate Triangular Meshes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Concatenate Triangular Meshes</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3dFacade#concatenateTriangularMeshes(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getData3dFacade__ConcatenateTriangularMeshes__EList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.Data3DIO <em>Data3 DIO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data3 DIO</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DIO
	 * @generated
	 */
	EClass getData3DIO();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DIO#loadTriangularMesh(java.lang.String) <em>Load Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Triangular Mesh</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DIO#loadTriangularMesh(java.lang.String)
	 * @generated
	 */
	EOperation getData3DIO__LoadTriangularMesh__String();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DIO#loadTriangularMesh(java.io.InputStream) <em>Load Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Triangular Mesh</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DIO#loadTriangularMesh(java.io.InputStream)
	 * @generated
	 */
	EOperation getData3DIO__LoadTriangularMesh__InputStream();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DIO#saveTriangularMesh(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh, java.lang.String) <em>Save Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Triangular Mesh</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DIO#saveTriangularMesh(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh, java.lang.String)
	 * @generated
	 */
	EOperation getData3DIO__SaveTriangularMesh__CartesianTriangularMesh_String();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DIO#saveTriangularMesh(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh, java.io.OutputStream) <em>Save Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Triangular Mesh</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DIO#saveTriangularMesh(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh, java.io.OutputStream)
	 * @generated
	 */
	EOperation getData3DIO__SaveTriangularMesh__CartesianTriangularMesh_OutputStream();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DIO#loadTriangularMeshFromASCIIAsNormalPointCloud(java.lang.String) <em>Load Triangular Mesh From ASCII As Normal Point Cloud</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Triangular Mesh From ASCII As Normal Point Cloud</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DIO#loadTriangularMeshFromASCIIAsNormalPointCloud(java.lang.String)
	 * @generated
	 */
	EOperation getData3DIO__LoadTriangularMeshFromASCIIAsNormalPointCloud__String();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DIO#loadTriangularMeshFromASCII(java.lang.String) <em>Load Triangular Mesh From ASCII</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Triangular Mesh From ASCII</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DIO#loadTriangularMeshFromASCII(java.lang.String)
	 * @generated
	 */
	EOperation getData3DIO__LoadTriangularMeshFromASCII__String();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DIO#saveTriangularMeshAsASCII(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh, java.lang.String) <em>Save Triangular Mesh As ASCII</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Triangular Mesh As ASCII</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DIO#saveTriangularMeshAsASCII(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh, java.lang.String)
	 * @generated
	 */
	EOperation getData3DIO__SaveTriangularMeshAsASCII__CartesianTriangularMesh_String();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DIO#loadXYZ(java.lang.String) <em>Load XYZ</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load XYZ</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DIO#loadXYZ(java.lang.String)
	 * @generated
	 */
	EOperation getData3DIO__LoadXYZ__String();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DIO#loadTriangularMeshFromTriXYZ(java.lang.String, java.lang.String) <em>Load Triangular Mesh From Tri XYZ</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Triangular Mesh From Tri XYZ</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DIO#loadTriangularMeshFromTriXYZ(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getData3DIO__LoadTriangularMeshFromTriXYZ__String_String();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DIO#saveCoordinatesSetToXYZ(org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet, java.lang.String) <em>Save Coordinates Set To XYZ</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Coordinates Set To XYZ</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DIO#saveCoordinatesSetToXYZ(org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet, java.lang.String)
	 * @generated
	 */
	EOperation getData3DIO__SaveCoordinatesSetToXYZ__CartesianCoordinatesSet_String();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DIO#saveCoordinatesSetToXYZ(org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet, java.io.OutputStream) <em>Save Coordinates Set To XYZ</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Coordinates Set To XYZ</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DIO#saveCoordinatesSetToXYZ(org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet, java.io.OutputStream)
	 * @generated
	 */
	EOperation getData3DIO__SaveCoordinatesSetToXYZ__CartesianCoordinatesSet_OutputStream();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DIO#saveCoordinatesSetToCSV(org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet, java.lang.String) <em>Save Coordinates Set To CSV</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Coordinates Set To CSV</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DIO#saveCoordinatesSetToCSV(org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet, java.lang.String)
	 * @generated
	 */
	EOperation getData3DIO__SaveCoordinatesSetToCSV__CartesianCoordinatesSet_String();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DIO#saveCoordinatesSetToCSV(org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet, java.io.OutputStream) <em>Save Coordinates Set To CSV</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Coordinates Set To CSV</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DIO#saveCoordinatesSetToCSV(org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet, java.io.OutputStream)
	 * @generated
	 */
	EOperation getData3DIO__SaveCoordinatesSetToCSV__CartesianCoordinatesSet_OutputStream();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.Data3DUtils <em>Data3 DUtils</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data3 DUtils</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DUtils
	 * @generated
	 */
	EClass getData3DUtils();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeNormals(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh) <em>Compute Normals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Normals</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeNormals(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh)
	 * @generated
	 */
	EOperation getData3DUtils__ComputeNormals__CartesianTriangularMesh();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeCentroid(org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet) <em>Compute Centroid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Centroid</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeCentroid(org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet)
	 * @generated
	 */
	EOperation getData3DUtils__ComputeCentroid__CartesianCoordinatesSet();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeMinMaxValues(javax.vecmath.Point3d, javax.vecmath.Point3d, org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet) <em>Compute Min Max Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Min Max Values</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeMinMaxValues(javax.vecmath.Point3d, javax.vecmath.Point3d, org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet)
	 * @generated
	 */
	EOperation getData3DUtils__ComputeMinMaxValues__Point3d_Point3d_CartesianCoordinatesSet();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeCurvatureChange(org.eclipse.symphony.common.geometry.data3d.PointLocator, int, double) <em>Compute Curvature Change</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Curvature Change</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeCurvatureChange(org.eclipse.symphony.common.geometry.data3d.PointLocator, int, double)
	 * @generated
	 */
	EOperation getData3DUtils__ComputeCurvatureChange__PointLocator_int_double();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeCurvatureChange(org.eclipse.symphony.common.geometry.data3d.VecmathPointLocator, int, double) <em>Compute Curvature Change</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Curvature Change</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeCurvatureChange(org.eclipse.symphony.common.geometry.data3d.VecmathPointLocator, int, double)
	 * @generated
	 */
	EOperation getData3DUtils__ComputeCurvatureChange__VecmathPointLocator_int_double();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DUtils#extrude(java.util.List, org.eclipse.symphony.common.geometry.data3d.CartesianAxis, double, boolean) <em>Extrude</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extrude</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DUtils#extrude(java.util.List, org.eclipse.symphony.common.geometry.data3d.CartesianAxis, double, boolean)
	 * @generated
	 */
	EOperation getData3DUtils__Extrude__List_CartesianAxis_double_boolean();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.common.geometry.data3d.CartesianAxis <em>Cartesian Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cartesian Axis</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianAxis
	 * @generated
	 */
	EEnum getCartesianAxis();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.common.geometry.data3d.CartesianPlane <em>Cartesian Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cartesian Plane</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianPlane
	 * @generated
	 */
	EEnum getCartesianPlane();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Vector2d <em>Vector2d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vector2d</em>'.
	 * @see javax.vecmath.Vector2d
	 * @model instanceClass="javax.vecmath.Vector2d"
	 * @generated
	 */
	EDataType getVector2d();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Vector3d <em>Vector3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vector3d</em>'.
	 * @see javax.vecmath.Vector3d
	 * @model instanceClass="javax.vecmath.Vector3d"
	 * @generated
	 */
	EDataType getVector3d();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Point3d <em>Point3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point3d</em>'.
	 * @see javax.vecmath.Point3d
	 * @model instanceClass="javax.vecmath.Point3d"
	 * @generated
	 */
	EDataType getPoint3d();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Matrix4d <em>Matrix4d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Matrix4d</em>'.
	 * @see javax.vecmath.Matrix4d
	 * @model instanceClass="javax.vecmath.Matrix4d"
	 * @generated
	 */
	EDataType getMatrix4d();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.GVector <em>GVector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GVector</em>'.
	 * @see javax.vecmath.GVector
	 * @model instanceClass="javax.vecmath.GVector"
	 * @generated
	 */
	EDataType getGVector();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="T"
	 * @generated
	 */
	EDataType getList();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" typeParameters="K V"
	 * @generated
	 */
	EDataType getMap();

	/**
	 * Returns the meta object for data type '{@link java.util.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Set</em>'.
	 * @see java.util.Set
	 * @model instanceClass="java.util.Set" typeParameters="T"
	 * @generated
	 */
	EDataType getSet();

	/**
	 * Returns the meta object for data type '{@link java.util.SortedSet <em>Sorted Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sorted Set</em>'.
	 * @see java.util.SortedSet
	 * @model instanceClass="java.util.SortedSet" typeParameters="T"
	 * @generated
	 */
	EDataType getSortedSet();

	/**
	 * Returns the meta object for data type '{@link java.util.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Collection</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection" typeParameters="T"
	 * @generated
	 */
	EDataType getCollection();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.EList <em>EList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EList</em>'.
	 * @see org.eclipse.emf.common.util.EList
	 * @model instanceClass="org.eclipse.emf.common.util.EList" typeParameters="T"
	 * @generated
	 */
	EDataType getEList();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.IProgressMonitor <em>IProgress Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProgress Monitor</em>'.
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @model instanceClass="org.eclipse.core.runtime.IProgressMonitor"
	 * @generated
	 */
	EDataType getIProgressMonitor();

	/**
	 * Returns the meta object for data type '{@link java.io.OutputStream <em>Output Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Output Stream</em>'.
	 * @see java.io.OutputStream
	 * @model instanceClass="java.io.OutputStream"
	 * @generated
	 */
	EDataType getOutputStream();

	/**
	 * Returns the meta object for data type '{@link java.io.InputStream <em>Input Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Input Stream</em>'.
	 * @see java.io.InputStream
	 * @model instanceClass="java.io.InputStream"
	 * @generated
	 */
	EDataType getInputStream();

	/**
	 * Returns the meta object for data type '{@link java.io.IOException <em>IO Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IO Exception</em>'.
	 * @see java.io.IOException
	 * @model instanceClass="java.io.IOException"
	 * @generated
	 */
	EDataType getIOException();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the meta object for data type '{@link java.lang.IllegalArgumentException <em>Illegal Argument Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Illegal Argument Exception</em>'.
	 * @see java.lang.IllegalArgumentException
	 * @model instanceClass="java.lang.IllegalArgumentException"
	 * @generated
	 */
	EDataType getIllegalArgumentException();

	/**
	 * Returns the meta object for data type '<em>Double Array Of Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Double Array Of Array</em>'.
	 * @model instanceClass="double[][]"
	 * @generated
	 */
	EDataType getDoubleArrayOfArray();

	/**
	 * Returns the meta object for data type '<em>Int Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Int Array</em>'.
	 * @model instanceClass="int[]"
	 * @generated
	 */
	EDataType getIntArray();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Data3dFactory getData3dFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianPolygonImpl <em>Cartesian Polygon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianPolygonImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianPolygon()
		 * @generated
		 */
		EClass CARTESIAN_POLYGON = eINSTANCE.getCartesianPolygon();

		/**
		 * The meta object literal for the '<em><b>Surface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_POLYGON__SURFACE = eINSTANCE.getCartesianPolygon_Surface();

		/**
		 * The meta object literal for the '<em><b>Normal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_POLYGON__NORMAL = eINSTANCE.getCartesianPolygon_Normal();

		/**
		 * The meta object literal for the '<em><b>Centroid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_POLYGON__CENTROID = eINSTANCE.getCartesianPolygon_Centroid();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianTriangleImpl <em>Cartesian Triangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianTriangleImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianTriangle()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGLE = eINSTANCE.getCartesianTriangle();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.SphericalPolygonImpl <em>Spherical Polygon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.SphericalPolygonImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getSphericalPolygon()
		 * @generated
		 */
		EClass SPHERICAL_POLYGON = eINSTANCE.getSphericalPolygon();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.SphericalTriangleImpl <em>Spherical Triangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.SphericalTriangleImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getSphericalTriangle()
		 * @generated
		 */
		EClass SPHERICAL_TRIANGLE = eINSTANCE.getSphericalTriangle();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianPositionCoordinatesImpl <em>Cartesian Position Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianPositionCoordinatesImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianPositionCoordinates()
		 * @generated
		 */
		EClass CARTESIAN_POSITION_COORDINATES = eINSTANCE.getCartesianPositionCoordinates();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_POSITION_COORDINATES__X = eINSTANCE.getCartesianPositionCoordinates_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_POSITION_COORDINATES__Y = eINSTANCE.getCartesianPositionCoordinates_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_POSITION_COORDINATES__Z = eINSTANCE.getCartesianPositionCoordinates_Z();

		/**
		 * The meta object literal for the '<em><b>As Point3d</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARTESIAN_POSITION_COORDINATES___AS_POINT3D = eINSTANCE.getCartesianPositionCoordinates__AsPoint3d();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.RGBCartesianPositionCoordinatesImpl <em>RGB Cartesian Position Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.RGBCartesianPositionCoordinatesImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getRGBCartesianPositionCoordinates()
		 * @generated
		 */
		EClass RGB_CARTESIAN_POSITION_COORDINATES = eINSTANCE.getRGBCartesianPositionCoordinates();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_CARTESIAN_POSITION_COORDINATES__RED = eINSTANCE.getRGBCartesianPositionCoordinates_Red();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_CARTESIAN_POSITION_COORDINATES__GREEN = eINSTANCE.getRGBCartesianPositionCoordinates_Green();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_CARTESIAN_POSITION_COORDINATES__BLUE = eINSTANCE.getRGBCartesianPositionCoordinates_Blue();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianOrientationCoordinatesImpl <em>Cartesian Orientation Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianOrientationCoordinatesImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianOrientationCoordinates()
		 * @generated
		 */
		EClass CARTESIAN_ORIENTATION_COORDINATES = eINSTANCE.getCartesianOrientationCoordinates();

		/**
		 * The meta object literal for the '<em><b>XRotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_ORIENTATION_COORDINATES__XROTATION = eINSTANCE.getCartesianOrientationCoordinates_XRotation();

		/**
		 * The meta object literal for the '<em><b>YRotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_ORIENTATION_COORDINATES__YROTATION = eINSTANCE.getCartesianOrientationCoordinates_YRotation();

		/**
		 * The meta object literal for the '<em><b>ZRotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_ORIENTATION_COORDINATES__ZROTATION = eINSTANCE.getCartesianOrientationCoordinates_ZRotation();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesSetImpl <em>Cartesian Coordinates Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesSetImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianCoordinatesSet()
		 * @generated
		 */
		EClass CARTESIAN_COORDINATES_SET = eINSTANCE.getCartesianCoordinatesSet();

		/**
		 * The meta object literal for the '<em><b>Get Extent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARTESIAN_COORDINATES_SET___GET_EXTENT = eINSTANCE.getCartesianCoordinatesSet__GetExtent();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesSetExtentImpl <em>Cartesian Coordinates Set Extent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesSetExtentImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianCoordinatesSetExtent()
		 * @generated
		 */
		EClass CARTESIAN_COORDINATES_SET_EXTENT = eINSTANCE.getCartesianCoordinatesSetExtent();

		/**
		 * The meta object literal for the '<em><b>XMin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_COORDINATES_SET_EXTENT__XMIN = eINSTANCE.getCartesianCoordinatesSetExtent_XMin();

		/**
		 * The meta object literal for the '<em><b>XMax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_COORDINATES_SET_EXTENT__XMAX = eINSTANCE.getCartesianCoordinatesSetExtent_XMax();

		/**
		 * The meta object literal for the '<em><b>YMin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_COORDINATES_SET_EXTENT__YMIN = eINSTANCE.getCartesianCoordinatesSetExtent_YMin();

		/**
		 * The meta object literal for the '<em><b>YMax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_COORDINATES_SET_EXTENT__YMAX = eINSTANCE.getCartesianCoordinatesSetExtent_YMax();

		/**
		 * The meta object literal for the '<em><b>ZMin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_COORDINATES_SET_EXTENT__ZMIN = eINSTANCE.getCartesianCoordinatesSetExtent_ZMin();

		/**
		 * The meta object literal for the '<em><b>ZMax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_COORDINATES_SET_EXTENT__ZMAX = eINSTANCE.getCartesianCoordinatesSetExtent_ZMax();

		/**
		 * The meta object literal for the '<em><b>XDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_COORDINATES_SET_EXTENT__XDIMENSION = eINSTANCE.getCartesianCoordinatesSetExtent_XDimension();

		/**
		 * The meta object literal for the '<em><b>YDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_COORDINATES_SET_EXTENT__YDIMENSION = eINSTANCE.getCartesianCoordinatesSetExtent_YDimension();

		/**
		 * The meta object literal for the '<em><b>ZDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_COORDINATES_SET_EXTENT__ZDIMENSION = eINSTANCE.getCartesianCoordinatesSetExtent_ZDimension();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.DigitalElevationMapImpl <em>Digital Elevation Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.DigitalElevationMapImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getDigitalElevationMap()
		 * @generated
		 */
		EClass DIGITAL_ELEVATION_MAP = eINSTANCE.getDigitalElevationMap();

		/**
		 * The meta object literal for the '<em><b>XDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGITAL_ELEVATION_MAP__XDIMENSION = eINSTANCE.getDigitalElevationMap_XDimension();

		/**
		 * The meta object literal for the '<em><b>YDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGITAL_ELEVATION_MAP__YDIMENSION = eINSTANCE.getDigitalElevationMap_YDimension();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesMeshImpl <em>Cartesian Coordinates Mesh</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesMeshImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianCoordinatesMesh()
		 * @generated
		 */
		EClass CARTESIAN_COORDINATES_MESH = eINSTANCE.getCartesianCoordinatesMesh();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianTriangularMeshImpl <em>Cartesian Triangular Mesh</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianTriangularMeshImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianTriangularMesh()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGULAR_MESH = eINSTANCE.getCartesianTriangularMesh();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.SphericalCoordinatesImpl <em>Spherical Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.SphericalCoordinatesImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getSphericalCoordinates()
		 * @generated
		 */
		EClass SPHERICAL_COORDINATES = eINSTANCE.getSphericalCoordinates();

		/**
		 * The meta object literal for the '<em><b>Phi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHERICAL_COORDINATES__PHI = eINSTANCE.getSphericalCoordinates_Phi();

		/**
		 * The meta object literal for the '<em><b>Theta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHERICAL_COORDINATES__THETA = eINSTANCE.getSphericalCoordinates_Theta();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHERICAL_COORDINATES__R = eINSTANCE.getSphericalCoordinates_R();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.SphericalCoordinatesSetImpl <em>Spherical Coordinates Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.SphericalCoordinatesSetImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getSphericalCoordinatesSet()
		 * @generated
		 */
		EClass SPHERICAL_COORDINATES_SET = eINSTANCE.getSphericalCoordinatesSet();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.SphericalCoordinatesMeshImpl <em>Spherical Coordinates Mesh</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.SphericalCoordinatesMeshImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getSphericalCoordinatesMesh()
		 * @generated
		 */
		EClass SPHERICAL_COORDINATES_MESH = eINSTANCE.getSphericalCoordinatesMesh();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.SphericalTriangularMeshImpl <em>Spherical Triangular Mesh</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.SphericalTriangularMeshImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getSphericalTriangularMesh()
		 * @generated
		 */
		EClass SPHERICAL_TRIANGULAR_MESH = eINSTANCE.getSphericalTriangularMesh();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.PoseImpl <em>Pose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.PoseImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getPose()
		 * @generated
		 */
		EClass POSE = eINSTANCE.getPose();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.SphereSamplingShapeImpl <em>Sphere Sampling Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.SphereSamplingShapeImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getSphereSamplingShape()
		 * @generated
		 */
		EClass SPHERE_SAMPLING_SHAPE = eINSTANCE.getSphereSamplingShape();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHERE_SAMPLING_SHAPE__RADIUS = eINSTANCE.getSphereSamplingShape_Radius();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPHERE_SAMPLING_SHAPE__CENTER = eINSTANCE.getSphereSamplingShape_Center();

		/**
		 * The meta object literal for the '<em><b>Include Just Touching</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHERE_SAMPLING_SHAPE__INCLUDE_JUST_TOUCHING = eINSTANCE.getSphereSamplingShape_IncludeJustTouching();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CubeSamplingShapeImpl <em>Cube Sampling Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.CubeSamplingShapeImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCubeSamplingShape()
		 * @generated
		 */
		EClass CUBE_SAMPLING_SHAPE = eINSTANCE.getCubeSamplingShape();

		/**
		 * The meta object literal for the '<em><b>Corner1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUBE_SAMPLING_SHAPE__CORNER1 = eINSTANCE.getCubeSamplingShape_Corner1();

		/**
		 * The meta object literal for the '<em><b>Corner2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUBE_SAMPLING_SHAPE__CORNER2 = eINSTANCE.getCubeSamplingShape_Corner2();

		/**
		 * The meta object literal for the '<em><b>Include Just Touching</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUBE_SAMPLING_SHAPE__INCLUDE_JUST_TOUCHING = eINSTANCE.getCubeSamplingShape_IncludeJustTouching();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesSetShapeSamplerImpl <em>Cartesian Coordinates Set Shape Sampler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesSetShapeSamplerImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianCoordinatesSetShapeSampler()
		 * @generated
		 */
		EClass CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER = eINSTANCE.getCartesianCoordinatesSetShapeSampler();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesMeshSamplerImpl <em>Cartesian Coordinates Mesh Sampler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesMeshSamplerImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianCoordinatesMeshSampler()
		 * @generated
		 */
		EClass CARTESIAN_COORDINATES_MESH_SAMPLER = eINSTANCE.getCartesianCoordinatesMeshSampler();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesMeshPolygonSamplerImpl <em>Cartesian Coordinates Mesh Polygon Sampler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianCoordinatesMeshPolygonSamplerImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianCoordinatesMeshPolygonSampler()
		 * @generated
		 */
		EClass CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER = eINSTANCE.getCartesianCoordinatesMeshPolygonSampler();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianTriangularMeshSamplerImpl <em>Cartesian Triangular Mesh Sampler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianTriangularMeshSamplerImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianTriangularMeshSampler()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGULAR_MESH_SAMPLER = eINSTANCE.getCartesianTriangularMeshSampler();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianTriangularMeshPolygonSamplerImpl <em>Cartesian Triangular Mesh Polygon Sampler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianTriangularMeshPolygonSamplerImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianTriangularMeshPolygonSampler()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER = eINSTANCE.getCartesianTriangularMeshPolygonSampler();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.CartesianPositionCoordinatesMesherImpl <em>Cartesian Position Coordinates Mesher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.CartesianPositionCoordinatesMesherImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianPositionCoordinatesMesher()
		 * @generated
		 */
		EClass CARTESIAN_POSITION_COORDINATES_MESHER = eINSTANCE.getCartesianPositionCoordinatesMesher();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.NormalPointCloudImpl <em>Normal Point Cloud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.NormalPointCloudImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getNormalPointCloud()
		 * @generated
		 */
		EClass NORMAL_POINT_CLOUD = eINSTANCE.getNormalPointCloud();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMAL_POINT_CLOUD__POINTS = eINSTANCE.getNormalPointCloud_Points();

		/**
		 * The meta object literal for the '<em><b>Normals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMAL_POINT_CLOUD__NORMALS = eINSTANCE.getNormalPointCloud_Normals();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.PointLocatorImpl <em>Point Locator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.PointLocatorImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getPointLocator()
		 * @generated
		 */
		EClass POINT_LOCATOR = eINSTANCE.getPointLocator();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_LOCATOR__POINTS = eINSTANCE.getPointLocator_Points();

		/**
		 * The meta object literal for the '<em><b>Find Closest Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POINT_LOCATOR___FIND_CLOSEST_POINT__CARTESIANPOSITIONCOORDINATES = eINSTANCE.getPointLocator__FindClosestPoint__CartesianPositionCoordinates();

		/**
		 * The meta object literal for the '<em><b>Find Points Within Radius</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POINT_LOCATOR___FIND_POINTS_WITHIN_RADIUS__DOUBLE_CARTESIANPOSITIONCOORDINATES = eINSTANCE.getPointLocator__FindPointsWithinRadius__double_CartesianPositionCoordinates();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.VecmathPointLocatorImpl <em>Vecmath Point Locator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.VecmathPointLocatorImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getVecmathPointLocator()
		 * @generated
		 */
		EClass VECMATH_POINT_LOCATOR = eINSTANCE.getVecmathPointLocator();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECMATH_POINT_LOCATOR__POINTS = eINSTANCE.getVecmathPointLocator_Points();

		/**
		 * The meta object literal for the '<em><b>Find Closest Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VECMATH_POINT_LOCATOR___FIND_CLOSEST_POINT__POINT3D = eINSTANCE.getVecmathPointLocator__FindClosestPoint__Point3d();

		/**
		 * The meta object literal for the '<em><b>Find Points Within Radius</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VECMATH_POINT_LOCATOR___FIND_POINTS_WITHIN_RADIUS__DOUBLE_POINT3D = eINSTANCE.getVecmathPointLocator__FindPointsWithinRadius__double_Point3d();

		/**
		 * The meta object literal for the '<em><b>Find Closest Point Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VECMATH_POINT_LOCATOR___FIND_CLOSEST_POINT_ID__POINT3D = eINSTANCE.getVecmathPointLocator__FindClosestPointId__Point3d();

		/**
		 * The meta object literal for the '<em><b>Find Point Ids Within Radius</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VECMATH_POINT_LOCATOR___FIND_POINT_IDS_WITHIN_RADIUS__DOUBLE_POINT3D = eINSTANCE.getVecmathPointLocator__FindPointIdsWithinRadius__double_Point3d();

		/**
		 * The meta object literal for the '<em><b>Find Closest NPoints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VECMATH_POINT_LOCATOR___FIND_CLOSEST_NPOINTS__POINT3D_INT = eINSTANCE.getVecmathPointLocator__FindClosestNPoints__Point3d_int();

		/**
		 * The meta object literal for the '<em><b>Find Closest NPoint Ids</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VECMATH_POINT_LOCATOR___FIND_CLOSEST_NPOINT_IDS__POINT3D_INT = eINSTANCE.getVecmathPointLocator__FindClosestNPointIds__Point3d_int();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.VecmathKdTreePointLocatorImpl <em>Vecmath Kd Tree Point Locator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.VecmathKdTreePointLocatorImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getVecmathKdTreePointLocator()
		 * @generated
		 */
		EClass VECMATH_KD_TREE_POINT_LOCATOR = eINSTANCE.getVecmathKdTreePointLocator();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.MeshLocalizerImpl <em>Mesh Localizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.MeshLocalizerImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getMeshLocalizer()
		 * @generated
		 */
		EClass MESH_LOCALIZER = eINSTANCE.getMeshLocalizer();

		/**
		 * The meta object literal for the '<em><b>Localize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESH_LOCALIZER___LOCALIZE__CARTESIANTRIANGULARMESH_MATRIX4D_CARTESIANTRIANGULARMESH_MATRIX4D = eINSTANCE.getMeshLocalizer__Localize__CartesianTriangularMesh_Matrix4d_CartesianTriangularMesh_Matrix4d();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.PointNormalLocatorImpl <em>Point Normal Locator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.PointNormalLocatorImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getPointNormalLocator()
		 * @generated
		 */
		EClass POINT_NORMAL_LOCATOR = eINSTANCE.getPointNormalLocator();

		/**
		 * The meta object literal for the '<em><b>Data Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_NORMAL_LOCATOR__DATA_SET = eINSTANCE.getPointNormalLocator_DataSet();

		/**
		 * The meta object literal for the '<em><b>Find Closest Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POINT_NORMAL_LOCATOR___FIND_CLOSEST_POINT__POINT3D_VECTOR3D = eINSTANCE.getPointNormalLocator__FindClosestPoint__Point3d_Vector3d();

		/**
		 * The meta object literal for the '<em><b>Find Points Within Radius</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POINT_NORMAL_LOCATOR___FIND_POINTS_WITHIN_RADIUS__DOUBLE_POINT3D_VECTOR3D = eINSTANCE.getPointNormalLocator__FindPointsWithinRadius__double_Point3d_Vector3d();

		/**
		 * The meta object literal for the '<em><b>Find Closest NPoints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POINT_NORMAL_LOCATOR___FIND_CLOSEST_NPOINTS__INT_POINT3D_VECTOR3D = eINSTANCE.getPointNormalLocator__FindClosestNPoints__int_Point3d_Vector3d();

		/**
		 * The meta object literal for the '<em><b>Find Closest Point Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POINT_NORMAL_LOCATOR___FIND_CLOSEST_POINT_ID__POINT3D_VECTOR3D = eINSTANCE.getPointNormalLocator__FindClosestPointId__Point3d_Vector3d();

		/**
		 * The meta object literal for the '<em><b>Find Point Ids Within Radius</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POINT_NORMAL_LOCATOR___FIND_POINT_IDS_WITHIN_RADIUS__DOUBLE_POINT3D_VECTOR3D = eINSTANCE.getPointNormalLocator__FindPointIdsWithinRadius__double_Point3d_Vector3d();

		/**
		 * The meta object literal for the '<em><b>Find Closest NPoint Ids</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POINT_NORMAL_LOCATOR___FIND_CLOSEST_NPOINT_IDS__INT_POINT3D_VECTOR3D = eINSTANCE.getPointNormalLocator__FindClosestNPointIds__int_Point3d_Vector3d();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.DelaunayMesherImpl <em>Delaunay Mesher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.DelaunayMesherImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getDelaunayMesher()
		 * @generated
		 */
		EClass DELAUNAY_MESHER = eINSTANCE.getDelaunayMesher();

		/**
		 * The meta object literal for the '<em><b>Tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAUNAY_MESHER__TOLERANCE = eINSTANCE.getDelaunayMesher_Tolerance();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAUNAY_MESHER__ALPHA = eINSTANCE.getDelaunayMesher_Alpha();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAUNAY_MESHER__OFFSET = eINSTANCE.getDelaunayMesher_Offset();

		/**
		 * The meta object literal for the '<em><b>Bounding Triangulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAUNAY_MESHER__BOUNDING_TRIANGULATION = eINSTANCE.getDelaunayMesher_BoundingTriangulation();

		/**
		 * The meta object literal for the '<em><b>Meshing Plane</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAUNAY_MESHER__MESHING_PLANE = eINSTANCE.getDelaunayMesher_MeshingPlane();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.DigitalElevationMapMesherImpl <em>Digital Elevation Map Mesher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.DigitalElevationMapMesherImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getDigitalElevationMapMesher()
		 * @generated
		 */
		EClass DIGITAL_ELEVATION_MAP_MESHER = eINSTANCE.getDigitalElevationMapMesher();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.DigitalElevationMapSamplerImpl <em>Digital Elevation Map Sampler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.DigitalElevationMapSamplerImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getDigitalElevationMapSampler()
		 * @generated
		 */
		EClass DIGITAL_ELEVATION_MAP_SAMPLER = eINSTANCE.getDigitalElevationMapSampler();

		/**
		 * The meta object literal for the '<em><b>Target Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGITAL_ELEVATION_MAP_SAMPLER__TARGET_RESOLUTION = eINSTANCE.getDigitalElevationMapSampler_TargetResolution();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.TriangularMeshNormalsCalculatorImpl <em>Triangular Mesh Normals Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.TriangularMeshNormalsCalculatorImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getTriangularMeshNormalsCalculator()
		 * @generated
		 */
		EClass TRIANGULAR_MESH_NORMALS_CALCULATOR = eINSTANCE.getTriangularMeshNormalsCalculator();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.TriangularMeshToNormalPointCloudImpl <em>Triangular Mesh To Normal Point Cloud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.TriangularMeshToNormalPointCloudImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getTriangularMeshToNormalPointCloud()
		 * @generated
		 */
		EClass TRIANGULAR_MESH_TO_NORMAL_POINT_CLOUD = eINSTANCE.getTriangularMeshToNormalPointCloud();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.PointsRangeGagerImpl <em>Points Range Gager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.PointsRangeGagerImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getPointsRangeGager()
		 * @generated
		 */
		EClass POINTS_RANGE_GAGER = eINSTANCE.getPointsRangeGager();

		/**
		 * The meta object literal for the '<em><b>Min X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINTS_RANGE_GAGER__MIN_X = eINSTANCE.getPointsRangeGager_MinX();

		/**
		 * The meta object literal for the '<em><b>Max X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINTS_RANGE_GAGER__MAX_X = eINSTANCE.getPointsRangeGager_MaxX();

		/**
		 * The meta object literal for the '<em><b>Min Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINTS_RANGE_GAGER__MIN_Y = eINSTANCE.getPointsRangeGager_MinY();

		/**
		 * The meta object literal for the '<em><b>Max Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINTS_RANGE_GAGER__MAX_Y = eINSTANCE.getPointsRangeGager_MaxY();

		/**
		 * The meta object literal for the '<em><b>Min Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINTS_RANGE_GAGER__MIN_Z = eINSTANCE.getPointsRangeGager_MinZ();

		/**
		 * The meta object literal for the '<em><b>Max Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINTS_RANGE_GAGER__MAX_Z = eINSTANCE.getPointsRangeGager_MaxZ();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.UniquePointsFilterImpl <em>Unique Points Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.UniquePointsFilterImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getUniquePointsFilter()
		 * @generated
		 */
		EClass UNIQUE_POINTS_FILTER = eINSTANCE.getUniquePointsFilter();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.TriangleEdgeLengthTriangularMeshFilterImpl <em>Triangle Edge Length Triangular Mesh Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.TriangleEdgeLengthTriangularMeshFilterImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getTriangleEdgeLengthTriangularMeshFilter()
		 * @generated
		 */
		EClass TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER = eINSTANCE.getTriangleEdgeLengthTriangularMeshFilter();

		/**
		 * The meta object literal for the '<em><b>Minimum Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MINIMUM_RANGE = eINSTANCE.getTriangleEdgeLengthTriangularMeshFilter_MinimumRange();

		/**
		 * The meta object literal for the '<em><b>Maximum Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MAXIMUM_RANGE = eINSTANCE.getTriangleEdgeLengthTriangularMeshFilter_MaximumRange();

		/**
		 * The meta object literal for the '<em><b>Maximum Edge Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MAXIMUM_EDGE_LENGTH = eINSTANCE.getTriangleEdgeLengthTriangularMeshFilter_MaximumEdgeLength();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER___FILTER__CARTESIANTRIANGULARMESH = eINSTANCE.getTriangleEdgeLengthTriangularMeshFilter__Filter__CartesianTriangularMesh();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.OutlierFilterImpl <em>Outlier Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.OutlierFilterImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getOutlierFilter()
		 * @generated
		 */
		EClass OUTLIER_FILTER = eINSTANCE.getOutlierFilter();

		/**
		 * The meta object literal for the '<em><b>Max Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLIER_FILTER__MAX_DISTANCE = eINSTANCE.getOutlierFilter_MaxDistance();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.RasterPointCloudImpl <em>Raster Point Cloud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.RasterPointCloudImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getRasterPointCloud()
		 * @generated
		 */
		EClass RASTER_POINT_CLOUD = eINSTANCE.getRasterPointCloud();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RASTER_POINT_CLOUD__ROWS = eINSTANCE.getRasterPointCloud_Rows();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RASTER_POINT_CLOUD__COLUMNS = eINSTANCE.getRasterPointCloud_Columns();

		/**
		 * The meta object literal for the '<em><b>Get Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RASTER_POINT_CLOUD___GET_POINT__INT_INT = eINSTANCE.getRasterPointCloud__GetPoint__int_int();

		/**
		 * The meta object literal for the '<em><b>Set Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RASTER_POINT_CLOUD___SET_POINT__INT_INT_CARTESIANPOSITIONCOORDINATES = eINSTANCE.getRasterPointCloud__SetPoint__int_int_CartesianPositionCoordinates();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.RasterPointCloudToCartesianCoordinatesSetImpl <em>Raster Point Cloud To Cartesian Coordinates Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.RasterPointCloudToCartesianCoordinatesSetImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getRasterPointCloudToCartesianCoordinatesSet()
		 * @generated
		 */
		EClass RASTER_POINT_CLOUD_TO_CARTESIAN_COORDINATES_SET = eINSTANCE.getRasterPointCloudToCartesianCoordinatesSet();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.MeshSmootherImpl <em>Mesh Smoother</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.MeshSmootherImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getMeshSmoother()
		 * @generated
		 */
		EClass MESH_SMOOTHER = eINSTANCE.getMeshSmoother();

		/**
		 * The meta object literal for the '<em><b>Number Of Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH_SMOOTHER__NUMBER_OF_ITERATIONS = eINSTANCE.getMeshSmoother_NumberOfIterations();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.VoxelBased3DPointCloudResamplerImpl <em>Voxel Based3 DPoint Cloud Resampler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.VoxelBased3DPointCloudResamplerImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getVoxelBased3DPointCloudResampler()
		 * @generated
		 */
		EClass VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER = eINSTANCE.getVoxelBased3DPointCloudResampler();

		/**
		 * The meta object literal for the '<em><b>Resolution X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_X = eINSTANCE.getVoxelBased3DPointCloudResampler_ResolutionX();

		/**
		 * The meta object literal for the '<em><b>Resolution Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Y = eINSTANCE.getVoxelBased3DPointCloudResampler_ResolutionY();

		/**
		 * The meta object literal for the '<em><b>Resolution Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Z = eINSTANCE.getVoxelBased3DPointCloudResampler_ResolutionZ();

		/**
		 * The meta object literal for the '<em><b>Minimum Number Of Point Per Voxel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__MINIMUM_NUMBER_OF_POINT_PER_VOXEL = eINSTANCE.getVoxelBased3DPointCloudResampler_MinimumNumberOfPointPerVoxel();

		/**
		 * The meta object literal for the '<em><b>Tile Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__TILE_RESOLUTION = eINSTANCE.getVoxelBased3DPointCloudResampler_TileResolution();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.RigidBodyPoseTrackerImpl <em>Rigid Body Pose Tracker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.RigidBodyPoseTrackerImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getRigidBodyPoseTracker()
		 * @generated
		 */
		EClass RIGID_BODY_POSE_TRACKER = eINSTANCE.getRigidBodyPoseTracker();

		/**
		 * The meta object literal for the '<em><b>Position Markers At Origin</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGID_BODY_POSE_TRACKER__POSITION_MARKERS_AT_ORIGIN = eINSTANCE.getRigidBodyPoseTracker_PositionMarkersAtOrigin();

		/**
		 * The meta object literal for the '<em><b>Compute Transformation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGID_BODY_POSE_TRACKER___COMPUTE_TRANSFORMATION__ELIST = eINSTANCE.getRigidBodyPoseTracker__ComputeTransformation__EList();

		/**
		 * The meta object literal for the '<em><b>Compute Transformation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGID_BODY_POSE_TRACKER___COMPUTE_TRANSFORMATION__LIST = eINSTANCE.getRigidBodyPoseTracker__ComputeTransformation__List();

		/**
		 * The meta object literal for the '<em><b>Add Position Markers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGID_BODY_POSE_TRACKER___ADD_POSITION_MARKERS__LIST = eINSTANCE.getRigidBodyPoseTracker__AddPositionMarkers__List();

		/**
		 * The meta object literal for the '<em><b>Remove Position Markers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIGID_BODY_POSE_TRACKER___REMOVE_POSITION_MARKERS__LIST = eINSTANCE.getRigidBodyPoseTracker__RemovePositionMarkers__List();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.PositionMarkerImpl <em>Position Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.PositionMarkerImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getPositionMarker()
		 * @generated
		 */
		EClass POSITION_MARKER = eINSTANCE.getPositionMarker();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_MARKER__IDENTIFIER = eINSTANCE.getPositionMarker_Identifier();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.Data3dFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dFacadeImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getData3dFacade()
		 * @generated
		 */
		EClass DATA3D_FACADE = eINSTANCE.getData3dFacade();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Position Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___CREATE_CARTESIAN_POSITION_COORDINATES__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getData3dFacade__CreateCartesianPositionCoordinates__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Orientation Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___CREATE_CARTESIAN_ORIENTATION_COORDINATES__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getData3dFacade__CreateCartesianOrientationCoordinates__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Spherical Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___CREATE_SPHERICAL_COORDINATES__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getData3dFacade__CreateSphericalCoordinates__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Pose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___CREATE_POSE__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getData3dFacade__CreatePose__double_double_double_double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Pose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___CREATE_POSE__POSE = eINSTANCE.getData3dFacade__CreatePose__Pose();

		/**
		 * The meta object literal for the '<em><b>Create Pose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___CREATE_POSE__CARTESIANPOSITIONCOORDINATES_CARTESIANORIENTATIONCOORDINATES = eINSTANCE.getData3dFacade__CreatePose__CartesianPositionCoordinates_CartesianOrientationCoordinates();

		/**
		 * The meta object literal for the '<em><b>Create Point Normal Locator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___CREATE_POINT_NORMAL_LOCATOR__NORMALPOINTCLOUD = eINSTANCE.getData3dFacade__CreatePointNormalLocator__NormalPointCloud();

		/**
		 * The meta object literal for the '<em><b>Create Digital Elevation Map</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___CREATE_DIGITAL_ELEVATION_MAP__CARTESIANCOORDINATESSET = eINSTANCE.getData3dFacade__CreateDigitalElevationMap__CartesianCoordinatesSet();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Polygon</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___CREATE_CARTESIAN_POLYGON__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES = eINSTANCE.getData3dFacade__CreateCartesianPolygon__CartesianPositionCoordinates_CartesianPositionCoordinates_CartesianPositionCoordinates();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Position Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___CREATE_CARTESIAN_POSITION_COORDINATES__CARTESIANPOSITIONCOORDINATES = eINSTANCE.getData3dFacade__CreateCartesianPositionCoordinates__CartesianPositionCoordinates();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Orientation Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___CREATE_CARTESIAN_ORIENTATION_COORDINATES__CARTESIANORIENTATIONCOORDINATES = eINSTANCE.getData3dFacade__CreateCartesianOrientationCoordinates__CartesianOrientationCoordinates();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Coordinates Mesh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___CREATE_CARTESIAN_COORDINATES_MESH__CARTESIANCOORDINATESMESH = eINSTANCE.getData3dFacade__CreateCartesianCoordinatesMesh__CartesianCoordinatesMesh();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Triangle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___CREATE_CARTESIAN_TRIANGLE__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES = eINSTANCE.getData3dFacade__CreateCartesianTriangle__CartesianPositionCoordinates_CartesianPositionCoordinates_CartesianPositionCoordinates();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Triangle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___CREATE_CARTESIAN_TRIANGLE__CARTESIANPOLYGON = eINSTANCE.getData3dFacade__CreateCartesianTriangle__CartesianPolygon();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Coordinates Mesh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___CREATE_CARTESIAN_COORDINATES_MESH__LIST = eINSTANCE.getData3dFacade__CreateCartesianCoordinatesMesh__List();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Coordinates Mesh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___CREATE_CARTESIAN_COORDINATES_MESH__CARTESIANTRIANGULARMESH = eINSTANCE.getData3dFacade__CreateCartesianCoordinatesMesh__CartesianTriangularMesh();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Triangular Mesh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___CREATE_CARTESIAN_TRIANGULAR_MESH__LIST = eINSTANCE.getData3dFacade__CreateCartesianTriangularMesh__List();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Triangular Mesh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___CREATE_CARTESIAN_TRIANGULAR_MESH__CARTESIANTRIANGULARMESH = eINSTANCE.getData3dFacade__CreateCartesianTriangularMesh__CartesianTriangularMesh();

		/**
		 * The meta object literal for the '<em><b>Apply Transform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___APPLY_TRANSFORM__CARTESIANCOORDINATESSET_MATRIX4D = eINSTANCE.getData3dFacade__ApplyTransform__CartesianCoordinatesSet_Matrix4d();

		/**
		 * The meta object literal for the '<em><b>Apply Transform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___APPLY_TRANSFORM__LIST_MATRIX4D = eINSTANCE.getData3dFacade__ApplyTransform__List_Matrix4d();

		/**
		 * The meta object literal for the '<em><b>Apply Transform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___APPLY_TRANSFORM__CARTESIANTRIANGULARMESH_MATRIX4D = eINSTANCE.getData3dFacade__ApplyTransform__CartesianTriangularMesh_Matrix4d();

		/**
		 * The meta object literal for the '<em><b>Apply Transform Int</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___APPLY_TRANSFORM_INT__CARTESIANTRIANGULARMESH_MATRIX4D = eINSTANCE.getData3dFacade__ApplyTransformInt__CartesianTriangularMesh_Matrix4d();

		/**
		 * The meta object literal for the '<em><b>Apply Transform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___APPLY_TRANSFORM__NORMALPOINTCLOUD_MATRIX4D = eINSTANCE.getData3dFacade__ApplyTransform__NormalPointCloud_Matrix4d();

		/**
		 * The meta object literal for the '<em><b>Update Cartesian Coordinates Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___UPDATE_CARTESIAN_COORDINATES_SET__CARTESIANCOORDINATESSET_DOUBLE = eINSTANCE.getData3dFacade__UpdateCartesianCoordinatesSet__CartesianCoordinatesSet_double();

		/**
		 * The meta object literal for the '<em><b>Concatenate Triangular Meshes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3D_FACADE___CONCATENATE_TRIANGULAR_MESHES__ELIST = eINSTANCE.getData3dFacade__ConcatenateTriangularMeshes__EList();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.Data3DIOImpl <em>Data3 DIO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3DIOImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getData3DIO()
		 * @generated
		 */
		EClass DATA3_DIO = eINSTANCE.getData3DIO();

		/**
		 * The meta object literal for the '<em><b>Load Triangular Mesh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3_DIO___LOAD_TRIANGULAR_MESH__STRING = eINSTANCE.getData3DIO__LoadTriangularMesh__String();

		/**
		 * The meta object literal for the '<em><b>Load Triangular Mesh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3_DIO___LOAD_TRIANGULAR_MESH__INPUTSTREAM = eINSTANCE.getData3DIO__LoadTriangularMesh__InputStream();

		/**
		 * The meta object literal for the '<em><b>Save Triangular Mesh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3_DIO___SAVE_TRIANGULAR_MESH__CARTESIANTRIANGULARMESH_STRING = eINSTANCE.getData3DIO__SaveTriangularMesh__CartesianTriangularMesh_String();

		/**
		 * The meta object literal for the '<em><b>Save Triangular Mesh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3_DIO___SAVE_TRIANGULAR_MESH__CARTESIANTRIANGULARMESH_OUTPUTSTREAM = eINSTANCE.getData3DIO__SaveTriangularMesh__CartesianTriangularMesh_OutputStream();

		/**
		 * The meta object literal for the '<em><b>Load Triangular Mesh From ASCII As Normal Point Cloud</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3_DIO___LOAD_TRIANGULAR_MESH_FROM_ASCII_AS_NORMAL_POINT_CLOUD__STRING = eINSTANCE.getData3DIO__LoadTriangularMeshFromASCIIAsNormalPointCloud__String();

		/**
		 * The meta object literal for the '<em><b>Load Triangular Mesh From ASCII</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3_DIO___LOAD_TRIANGULAR_MESH_FROM_ASCII__STRING = eINSTANCE.getData3DIO__LoadTriangularMeshFromASCII__String();

		/**
		 * The meta object literal for the '<em><b>Save Triangular Mesh As ASCII</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3_DIO___SAVE_TRIANGULAR_MESH_AS_ASCII__CARTESIANTRIANGULARMESH_STRING = eINSTANCE.getData3DIO__SaveTriangularMeshAsASCII__CartesianTriangularMesh_String();

		/**
		 * The meta object literal for the '<em><b>Load XYZ</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3_DIO___LOAD_XYZ__STRING = eINSTANCE.getData3DIO__LoadXYZ__String();

		/**
		 * The meta object literal for the '<em><b>Load Triangular Mesh From Tri XYZ</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3_DIO___LOAD_TRIANGULAR_MESH_FROM_TRI_XYZ__STRING_STRING = eINSTANCE.getData3DIO__LoadTriangularMeshFromTriXYZ__String_String();

		/**
		 * The meta object literal for the '<em><b>Save Coordinates Set To XYZ</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3_DIO___SAVE_COORDINATES_SET_TO_XYZ__CARTESIANCOORDINATESSET_STRING = eINSTANCE.getData3DIO__SaveCoordinatesSetToXYZ__CartesianCoordinatesSet_String();

		/**
		 * The meta object literal for the '<em><b>Save Coordinates Set To XYZ</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3_DIO___SAVE_COORDINATES_SET_TO_XYZ__CARTESIANCOORDINATESSET_OUTPUTSTREAM = eINSTANCE.getData3DIO__SaveCoordinatesSetToXYZ__CartesianCoordinatesSet_OutputStream();

		/**
		 * The meta object literal for the '<em><b>Save Coordinates Set To CSV</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3_DIO___SAVE_COORDINATES_SET_TO_CSV__CARTESIANCOORDINATESSET_STRING = eINSTANCE.getData3DIO__SaveCoordinatesSetToCSV__CartesianCoordinatesSet_String();

		/**
		 * The meta object literal for the '<em><b>Save Coordinates Set To CSV</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3_DIO___SAVE_COORDINATES_SET_TO_CSV__CARTESIANCOORDINATESSET_OUTPUTSTREAM = eINSTANCE.getData3DIO__SaveCoordinatesSetToCSV__CartesianCoordinatesSet_OutputStream();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.impl.Data3DUtilsImpl <em>Data3 DUtils</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3DUtilsImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getData3DUtils()
		 * @generated
		 */
		EClass DATA3_DUTILS = eINSTANCE.getData3DUtils();

		/**
		 * The meta object literal for the '<em><b>Compute Normals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3_DUTILS___COMPUTE_NORMALS__CARTESIANTRIANGULARMESH = eINSTANCE.getData3DUtils__ComputeNormals__CartesianTriangularMesh();

		/**
		 * The meta object literal for the '<em><b>Compute Centroid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3_DUTILS___COMPUTE_CENTROID__CARTESIANCOORDINATESSET = eINSTANCE.getData3DUtils__ComputeCentroid__CartesianCoordinatesSet();

		/**
		 * The meta object literal for the '<em><b>Compute Min Max Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3_DUTILS___COMPUTE_MIN_MAX_VALUES__POINT3D_POINT3D_CARTESIANCOORDINATESSET = eINSTANCE.getData3DUtils__ComputeMinMaxValues__Point3d_Point3d_CartesianCoordinatesSet();

		/**
		 * The meta object literal for the '<em><b>Compute Curvature Change</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3_DUTILS___COMPUTE_CURVATURE_CHANGE__POINTLOCATOR_INT_DOUBLE = eINSTANCE.getData3DUtils__ComputeCurvatureChange__PointLocator_int_double();

		/**
		 * The meta object literal for the '<em><b>Compute Curvature Change</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3_DUTILS___COMPUTE_CURVATURE_CHANGE__VECMATHPOINTLOCATOR_INT_DOUBLE = eINSTANCE.getData3DUtils__ComputeCurvatureChange__VecmathPointLocator_int_double();

		/**
		 * The meta object literal for the '<em><b>Extrude</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3_DUTILS___EXTRUDE__LIST_CARTESIANAXIS_DOUBLE_BOOLEAN = eINSTANCE.getData3DUtils__Extrude__List_CartesianAxis_double_boolean();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.CartesianAxis <em>Cartesian Axis</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.CartesianAxis
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianAxis()
		 * @generated
		 */
		EEnum CARTESIAN_AXIS = eINSTANCE.getCartesianAxis();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.CartesianPlane <em>Cartesian Plane</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.CartesianPlane
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCartesianPlane()
		 * @generated
		 */
		EEnum CARTESIAN_PLANE = eINSTANCE.getCartesianPlane();

		/**
		 * The meta object literal for the '<em>Vector2d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Vector2d
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getVector2d()
		 * @generated
		 */
		EDataType VECTOR2D = eINSTANCE.getVector2d();

		/**
		 * The meta object literal for the '<em>Vector3d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Vector3d
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getVector3d()
		 * @generated
		 */
		EDataType VECTOR3D = eINSTANCE.getVector3d();

		/**
		 * The meta object literal for the '<em>Point3d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Point3d
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getPoint3d()
		 * @generated
		 */
		EDataType POINT3D = eINSTANCE.getPoint3d();

		/**
		 * The meta object literal for the '<em>Matrix4d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Matrix4d
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getMatrix4d()
		 * @generated
		 */
		EDataType MATRIX4D = eINSTANCE.getMatrix4d();

		/**
		 * The meta object literal for the '<em>GVector</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.GVector
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getGVector()
		 * @generated
		 */
		EDataType GVECTOR = eINSTANCE.getGVector();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getMap()
		 * @generated
		 */
		EDataType MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em>Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Set
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getSet()
		 * @generated
		 */
		EDataType SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '<em>Sorted Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.SortedSet
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getSortedSet()
		 * @generated
		 */
		EDataType SORTED_SET = eINSTANCE.getSortedSet();

		/**
		 * The meta object literal for the '<em>Collection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getCollection()
		 * @generated
		 */
		EDataType COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em>EList</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.EList
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getEList()
		 * @generated
		 */
		EDataType ELIST = eINSTANCE.getEList();

		/**
		 * The meta object literal for the '<em>IProgress Monitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IProgressMonitor
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getIProgressMonitor()
		 * @generated
		 */
		EDataType IPROGRESS_MONITOR = eINSTANCE.getIProgressMonitor();

		/**
		 * The meta object literal for the '<em>Output Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.OutputStream
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getOutputStream()
		 * @generated
		 */
		EDataType OUTPUT_STREAM = eINSTANCE.getOutputStream();

		/**
		 * The meta object literal for the '<em>Input Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.InputStream
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getInputStream()
		 * @generated
		 */
		EDataType INPUT_STREAM = eINSTANCE.getInputStream();

		/**
		 * The meta object literal for the '<em>IO Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.IOException
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getIOException()
		 * @generated
		 */
		EDataType IO_EXCEPTION = eINSTANCE.getIOException();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em>Illegal Argument Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.IllegalArgumentException
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getIllegalArgumentException()
		 * @generated
		 */
		EDataType ILLEGAL_ARGUMENT_EXCEPTION = eINSTANCE.getIllegalArgumentException();

		/**
		 * The meta object literal for the '<em>Double Array Of Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getDoubleArrayOfArray()
		 * @generated
		 */
		EDataType DOUBLE_ARRAY_OF_ARRAY = eINSTANCE.getDoubleArrayOfArray();

		/**
		 * The meta object literal for the '<em>Int Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.impl.Data3dPackageImpl#getIntArray()
		 * @generated
		 */
		EDataType INT_ARRAY = eINSTANCE.getIntArray();

	}

} //Data3dPackage
