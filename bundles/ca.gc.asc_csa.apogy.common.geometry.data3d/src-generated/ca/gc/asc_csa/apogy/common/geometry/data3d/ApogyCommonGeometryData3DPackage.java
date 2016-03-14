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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage;
import ca.gc.asc_csa.apogy.common.processors.ApogyCommonProcessorsPackage;

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
 * <!-- begin-model-doc -->
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
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCommonGeometryData3D' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyCommonGeometryData3D' suppressGenModelAnnotations='false' modelDirectory='/ca.gc.asc_csa.apogy.common.geometry.data3d/src-generated' editDirectory='/ca.gc.asc_csa.apogy.common.geometry.data3d.edit/src-generated' testsDirectory='/ca.gc.asc_csa.apogy.common.geometry.data3d.tests/src-generated' basePackage='ca.gc.asc_csa.apogy.common.geometry'"
 * @generated
 */
public interface ApogyCommonGeometryData3DPackage extends EPackage {
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
	String eNS_URI = "ca.gc.asc_csa.apogy.common.geometry.data3d";

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
	ApogyCommonGeometryData3DPackage eINSTANCE = ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianPolygonImpl <em>Cartesian Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianPolygonImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianPolygon()
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
	int CARTESIAN_POLYGON__VERTICES = ApogyCommonGeometryDataPackage.POLYGON__VERTICES;

	/**
	 * The feature id for the '<em><b>Surface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POLYGON__SURFACE = ApogyCommonGeometryDataPackage.POLYGON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Normal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POLYGON__NORMAL = ApogyCommonGeometryDataPackage.POLYGON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POLYGON__CENTROID = ApogyCommonGeometryDataPackage.POLYGON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cartesian Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POLYGON_FEATURE_COUNT = ApogyCommonGeometryDataPackage.POLYGON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Cartesian Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POLYGON_OPERATION_COUNT = ApogyCommonGeometryDataPackage.POLYGON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangleImpl <em>Cartesian Triangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangleImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianTriangle()
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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalPolygonImpl <em>Spherical Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalPolygonImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getSphericalPolygon()
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
	int SPHERICAL_POLYGON__VERTICES = ApogyCommonGeometryDataPackage.POLYGON__VERTICES;

	/**
	 * The number of structural features of the '<em>Spherical Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_POLYGON_FEATURE_COUNT = ApogyCommonGeometryDataPackage.POLYGON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spherical Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_POLYGON_OPERATION_COUNT = ApogyCommonGeometryDataPackage.POLYGON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalTriangleImpl <em>Spherical Triangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalTriangleImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getSphericalTriangle()
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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianPositionCoordinatesImpl <em>Cartesian Position Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianPositionCoordinatesImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianPositionCoordinates()
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
	int CARTESIAN_POSITION_COORDINATES__X = ApogyCommonGeometryDataPackage.COORDINATES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_COORDINATES__Y = ApogyCommonGeometryDataPackage.COORDINATES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_COORDINATES__Z = ApogyCommonGeometryDataPackage.COORDINATES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cartesian Position Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT = ApogyCommonGeometryDataPackage.COORDINATES_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>As Point3d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_COORDINATES___AS_POINT3D = ApogyCommonGeometryDataPackage.COORDINATES_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cartesian Position Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_COORDINATES_OPERATION_COUNT = ApogyCommonGeometryDataPackage.COORDINATES_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.RGBAColorImpl <em>RGBA Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.RGBAColorImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getRGBAColor()
	 * @generated
	 */
	int RGBA_COLOR = 5;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGBA_COLOR__ALPHA = 0;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGBA_COLOR__RED = 1;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGBA_COLOR__GREEN = 2;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGBA_COLOR__BLUE = 3;

	/**
	 * The number of structural features of the '<em>RGBA Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGBA_COLOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>RGBA Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGBA_COLOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ColoredCartesianPositionCoordinatesImpl <em>Colored Cartesian Position Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ColoredCartesianPositionCoordinatesImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getColoredCartesianPositionCoordinates()
	 * @generated
	 */
	int COLORED_CARTESIAN_POSITION_COORDINATES = 6;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_POSITION_COORDINATES__X = CARTESIAN_POSITION_COORDINATES__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_POSITION_COORDINATES__Y = CARTESIAN_POSITION_COORDINATES__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_POSITION_COORDINATES__Z = CARTESIAN_POSITION_COORDINATES__Z;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_POSITION_COORDINATES__ALPHA = CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_POSITION_COORDINATES__RED = CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_POSITION_COORDINATES__GREEN = CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_POSITION_COORDINATES__BLUE = CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Colored Cartesian Position Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT = CARTESIAN_POSITION_COORDINATES_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>As Point3d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_POSITION_COORDINATES___AS_POINT3D = CARTESIAN_POSITION_COORDINATES___AS_POINT3D;

	/**
	 * The number of operations of the '<em>Colored Cartesian Position Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_POSITION_COORDINATES_OPERATION_COUNT = CARTESIAN_POSITION_COORDINATES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangularMeshColorizerImpl <em>Cartesian Triangular Mesh Colorizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangularMeshColorizerImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianTriangularMeshColorizer()
	 * @generated
	 */
	int CARTESIAN_TRIANGULAR_MESH_COLORIZER = 8;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangularMeshColorizerBySlopeImpl <em>Cartesian Triangular Mesh Colorizer By Slope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangularMeshColorizerBySlopeImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianTriangularMeshColorizerBySlope()
	 * @generated
	 */
	int CARTESIAN_TRIANGULAR_MESH_COLORIZER_BY_SLOPE = 9;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianOrientationCoordinatesImpl <em>Cartesian Orientation Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianOrientationCoordinatesImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianOrientationCoordinates()
	 * @generated
	 */
	int CARTESIAN_ORIENTATION_COORDINATES = 10;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.AbstractCartesianCoordinatesSetImpl <em>Abstract Cartesian Coordinates Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.AbstractCartesianCoordinatesSetImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getAbstractCartesianCoordinatesSet()
	 * @generated
	 */
	int ABSTRACT_CARTESIAN_COORDINATES_SET = 11;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesSetImpl <em>Cartesian Coordinates Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesSetImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianCoordinatesSet()
	 * @generated
	 */
	int CARTESIAN_COORDINATES_SET = 12;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesSetExtentImpl <em>Cartesian Coordinates Set Extent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesSetExtentImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianCoordinatesSetExtent()
	 * @generated
	 */
	int CARTESIAN_COORDINATES_SET_EXTENT = 14;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.DigitalElevationMapImpl <em>Digital Elevation Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.DigitalElevationMapImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getDigitalElevationMap()
	 * @generated
	 */
	int DIGITAL_ELEVATION_MAP = 15;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesMeshImpl <em>Cartesian Coordinates Mesh</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesMeshImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianCoordinatesMesh()
	 * @generated
	 */
	int CARTESIAN_COORDINATES_MESH = 16;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangularMeshImpl <em>Cartesian Triangular Mesh</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangularMeshImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianTriangularMesh()
	 * @generated
	 */
	int CARTESIAN_TRIANGULAR_MESH = 17;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH__POINTS = ApogyCommonGeometryDataPackage.MESH__POINTS;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH__NORMALS = ApogyCommonGeometryDataPackage.MESH__NORMALS;

	/**
	 * The feature id for the '<em><b>Polygons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH__POLYGONS = ApogyCommonGeometryDataPackage.MESH__POLYGONS;

	/**
	 * The number of structural features of the '<em>Cartesian Triangular Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_FEATURE_COUNT = ApogyCommonGeometryDataPackage.MESH_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Polygon Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH___GET_POLYGON_NEIGHBOURS__POLYGON = ApogyCommonGeometryDataPackage.MESH___GET_POLYGON_NEIGHBOURS__POLYGON;

	/**
	 * The operation id for the '<em>Get Point Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH___GET_POINT_NEIGHBOURS__COORDINATES = ApogyCommonGeometryDataPackage.MESH___GET_POINT_NEIGHBOURS__COORDINATES;

	/**
	 * The operation id for the '<em>Get Polygons Sharing Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH___GET_POLYGONS_SHARING_POINT__COORDINATES = ApogyCommonGeometryDataPackage.MESH___GET_POLYGONS_SHARING_POINT__COORDINATES;

	/**
	 * The operation id for the '<em>Get Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH___GET_EXTENT = ApogyCommonGeometryDataPackage.MESH_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cartesian Triangular Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_OPERATION_COUNT = ApogyCommonGeometryDataPackage.MESH_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ColoredCartesianTriangularMeshImpl <em>Colored Cartesian Triangular Mesh</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ColoredCartesianTriangularMeshImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getColoredCartesianTriangularMesh()
	 * @generated
	 */
	int COLORED_CARTESIAN_TRIANGULAR_MESH = 7;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_TRIANGULAR_MESH__POINTS = CARTESIAN_TRIANGULAR_MESH__POINTS;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_TRIANGULAR_MESH__NORMALS = CARTESIAN_TRIANGULAR_MESH__NORMALS;

	/**
	 * The feature id for the '<em><b>Polygons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_TRIANGULAR_MESH__POLYGONS = CARTESIAN_TRIANGULAR_MESH__POLYGONS;

	/**
	 * The number of structural features of the '<em>Colored Cartesian Triangular Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_TRIANGULAR_MESH_FEATURE_COUNT = CARTESIAN_TRIANGULAR_MESH_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Polygon Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_TRIANGULAR_MESH___GET_POLYGON_NEIGHBOURS__POLYGON = CARTESIAN_TRIANGULAR_MESH___GET_POLYGON_NEIGHBOURS__POLYGON;

	/**
	 * The operation id for the '<em>Get Point Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_TRIANGULAR_MESH___GET_POINT_NEIGHBOURS__COORDINATES = CARTESIAN_TRIANGULAR_MESH___GET_POINT_NEIGHBOURS__COORDINATES;

	/**
	 * The operation id for the '<em>Get Polygons Sharing Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_TRIANGULAR_MESH___GET_POLYGONS_SHARING_POINT__COORDINATES = CARTESIAN_TRIANGULAR_MESH___GET_POLYGONS_SHARING_POINT__COORDINATES;

	/**
	 * The operation id for the '<em>Get Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_TRIANGULAR_MESH___GET_EXTENT = CARTESIAN_TRIANGULAR_MESH___GET_EXTENT;

	/**
	 * The number of operations of the '<em>Colored Cartesian Triangular Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_TRIANGULAR_MESH_OPERATION_COUNT = CARTESIAN_TRIANGULAR_MESH_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_COLORIZER__PROGRESS_MONITOR = ApogyCommonProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_COLORIZER__INPUT = ApogyCommonProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_COLORIZER__OUTPUT = ApogyCommonProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The number of structural features of the '<em>Cartesian Triangular Mesh Colorizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_COLORIZER_FEATURE_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_COLORIZER___PROCESS__OBJECT = ApogyCommonProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The operation id for the '<em>Compute Color</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_COLORIZER___COMPUTE_COLOR__CARTESIANTRIANGULARMESH_CARTESIANPOSITIONCOORDINATES = ApogyCommonProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cartesian Triangular Mesh Colorizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_COLORIZER_OPERATION_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_COLORIZER_BY_SLOPE__PROGRESS_MONITOR = CARTESIAN_TRIANGULAR_MESH_COLORIZER__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_COLORIZER_BY_SLOPE__INPUT = CARTESIAN_TRIANGULAR_MESH_COLORIZER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_COLORIZER_BY_SLOPE__OUTPUT = CARTESIAN_TRIANGULAR_MESH_COLORIZER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Normal Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_COLORIZER_BY_SLOPE__NORMAL_AXIS = CARTESIAN_TRIANGULAR_MESH_COLORIZER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cartesian Triangular Mesh Colorizer By Slope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_COLORIZER_BY_SLOPE_FEATURE_COUNT = CARTESIAN_TRIANGULAR_MESH_COLORIZER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_COLORIZER_BY_SLOPE___PROCESS__OBJECT = CARTESIAN_TRIANGULAR_MESH_COLORIZER___PROCESS__OBJECT;

	/**
	 * The operation id for the '<em>Compute Color</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_COLORIZER_BY_SLOPE___COMPUTE_COLOR__CARTESIANTRIANGULARMESH_CARTESIANPOSITIONCOORDINATES = CARTESIAN_TRIANGULAR_MESH_COLORIZER___COMPUTE_COLOR__CARTESIANTRIANGULARMESH_CARTESIANPOSITIONCOORDINATES;

	/**
	 * The number of operations of the '<em>Cartesian Triangular Mesh Colorizer By Slope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_COLORIZER_BY_SLOPE_OPERATION_COUNT = CARTESIAN_TRIANGULAR_MESH_COLORIZER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_ORIENTATION_COORDINATES__XROTATION = ApogyCommonGeometryDataPackage.COORDINATES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_ORIENTATION_COORDINATES__YROTATION = ApogyCommonGeometryDataPackage.COORDINATES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ZRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_ORIENTATION_COORDINATES__ZROTATION = ApogyCommonGeometryDataPackage.COORDINATES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cartesian Orientation Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_ORIENTATION_COORDINATES_FEATURE_COUNT = ApogyCommonGeometryDataPackage.COORDINATES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Cartesian Orientation Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_ORIENTATION_COORDINATES_OPERATION_COUNT = ApogyCommonGeometryDataPackage.COORDINATES_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CARTESIAN_COORDINATES_SET__POINTS = ApogyCommonGeometryDataPackage.COORDINATES_SET__POINTS;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CARTESIAN_COORDINATES_SET__NORMALS = ApogyCommonGeometryDataPackage.COORDINATES_SET__NORMALS;

	/**
	 * The number of structural features of the '<em>Abstract Cartesian Coordinates Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CARTESIAN_COORDINATES_SET_FEATURE_COUNT = ApogyCommonGeometryDataPackage.COORDINATES_SET_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CARTESIAN_COORDINATES_SET___GET_EXTENT = ApogyCommonGeometryDataPackage.COORDINATES_SET_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Cartesian Coordinates Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CARTESIAN_COORDINATES_SET_OPERATION_COUNT = ApogyCommonGeometryDataPackage.COORDINATES_SET_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET__POINTS = ABSTRACT_CARTESIAN_COORDINATES_SET__POINTS;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET__NORMALS = ABSTRACT_CARTESIAN_COORDINATES_SET__NORMALS;

	/**
	 * The number of structural features of the '<em>Cartesian Coordinates Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_FEATURE_COUNT = ABSTRACT_CARTESIAN_COORDINATES_SET_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET___GET_EXTENT = ABSTRACT_CARTESIAN_COORDINATES_SET___GET_EXTENT;

	/**
	 * The number of operations of the '<em>Cartesian Coordinates Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_OPERATION_COUNT = ABSTRACT_CARTESIAN_COORDINATES_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ColoredCartesianCoordinatesSetImpl <em>Colored Cartesian Coordinates Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ColoredCartesianCoordinatesSetImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getColoredCartesianCoordinatesSet()
	 * @generated
	 */
	int COLORED_CARTESIAN_COORDINATES_SET = 13;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET__POINTS = ABSTRACT_CARTESIAN_COORDINATES_SET__POINTS;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET__NORMALS = ABSTRACT_CARTESIAN_COORDINATES_SET__NORMALS;

	/**
	 * The number of structural features of the '<em>Colored Cartesian Coordinates Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET_FEATURE_COUNT = ABSTRACT_CARTESIAN_COORDINATES_SET_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET___GET_EXTENT = ABSTRACT_CARTESIAN_COORDINATES_SET___GET_EXTENT;

	/**
	 * The number of operations of the '<em>Colored Cartesian Coordinates Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET_OPERATION_COUNT = ABSTRACT_CARTESIAN_COORDINATES_SET_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH__POINTS = ApogyCommonGeometryDataPackage.MESH__POINTS;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH__NORMALS = ApogyCommonGeometryDataPackage.MESH__NORMALS;

	/**
	 * The feature id for the '<em><b>Polygons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH__POLYGONS = ApogyCommonGeometryDataPackage.MESH__POLYGONS;

	/**
	 * The number of structural features of the '<em>Cartesian Coordinates Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_FEATURE_COUNT = ApogyCommonGeometryDataPackage.MESH_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Polygon Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH___GET_POLYGON_NEIGHBOURS__POLYGON = ApogyCommonGeometryDataPackage.MESH___GET_POLYGON_NEIGHBOURS__POLYGON;

	/**
	 * The operation id for the '<em>Get Point Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH___GET_POINT_NEIGHBOURS__COORDINATES = ApogyCommonGeometryDataPackage.MESH___GET_POINT_NEIGHBOURS__COORDINATES;

	/**
	 * The operation id for the '<em>Get Polygons Sharing Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH___GET_POLYGONS_SHARING_POINT__COORDINATES = ApogyCommonGeometryDataPackage.MESH___GET_POLYGONS_SHARING_POINT__COORDINATES;

	/**
	 * The operation id for the '<em>Get Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH___GET_EXTENT = ApogyCommonGeometryDataPackage.MESH_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cartesian Coordinates Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_OPERATION_COUNT = ApogyCommonGeometryDataPackage.MESH_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalCoordinatesImpl <em>Spherical Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalCoordinatesImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getSphericalCoordinates()
	 * @generated
	 */
	int SPHERICAL_COORDINATES = 18;

	/**
	 * The feature id for the '<em><b>Phi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES__PHI = ApogyCommonGeometryDataPackage.COORDINATES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Theta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES__THETA = ApogyCommonGeometryDataPackage.COORDINATES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES__R = ApogyCommonGeometryDataPackage.COORDINATES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Spherical Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_FEATURE_COUNT = ApogyCommonGeometryDataPackage.COORDINATES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Spherical Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_OPERATION_COUNT = ApogyCommonGeometryDataPackage.COORDINATES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalCoordinatesSetImpl <em>Spherical Coordinates Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalCoordinatesSetImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getSphericalCoordinatesSet()
	 * @generated
	 */
	int SPHERICAL_COORDINATES_SET = 19;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_SET__POINTS = ApogyCommonGeometryDataPackage.COORDINATES_SET__POINTS;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_SET__NORMALS = ApogyCommonGeometryDataPackage.COORDINATES_SET__NORMALS;

	/**
	 * The number of structural features of the '<em>Spherical Coordinates Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_SET_FEATURE_COUNT = ApogyCommonGeometryDataPackage.COORDINATES_SET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spherical Coordinates Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_SET_OPERATION_COUNT = ApogyCommonGeometryDataPackage.COORDINATES_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalCoordinatesMeshImpl <em>Spherical Coordinates Mesh</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalCoordinatesMeshImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getSphericalCoordinatesMesh()
	 * @generated
	 */
	int SPHERICAL_COORDINATES_MESH = 20;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_MESH__POINTS = ApogyCommonGeometryDataPackage.MESH__POINTS;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_MESH__NORMALS = ApogyCommonGeometryDataPackage.MESH__NORMALS;

	/**
	 * The feature id for the '<em><b>Polygons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_MESH__POLYGONS = ApogyCommonGeometryDataPackage.MESH__POLYGONS;

	/**
	 * The number of structural features of the '<em>Spherical Coordinates Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_MESH_FEATURE_COUNT = ApogyCommonGeometryDataPackage.MESH_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Polygon Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_MESH___GET_POLYGON_NEIGHBOURS__POLYGON = ApogyCommonGeometryDataPackage.MESH___GET_POLYGON_NEIGHBOURS__POLYGON;

	/**
	 * The operation id for the '<em>Get Point Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_MESH___GET_POINT_NEIGHBOURS__COORDINATES = ApogyCommonGeometryDataPackage.MESH___GET_POINT_NEIGHBOURS__COORDINATES;

	/**
	 * The operation id for the '<em>Get Polygons Sharing Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_MESH___GET_POLYGONS_SHARING_POINT__COORDINATES = ApogyCommonGeometryDataPackage.MESH___GET_POLYGONS_SHARING_POINT__COORDINATES;

	/**
	 * The number of operations of the '<em>Spherical Coordinates Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_COORDINATES_MESH_OPERATION_COUNT = ApogyCommonGeometryDataPackage.MESH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalTriangularMeshImpl <em>Spherical Triangular Mesh</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalTriangularMeshImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getSphericalTriangularMesh()
	 * @generated
	 */
	int SPHERICAL_TRIANGULAR_MESH = 21;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_TRIANGULAR_MESH__POINTS = ApogyCommonGeometryDataPackage.MESH__POINTS;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_TRIANGULAR_MESH__NORMALS = ApogyCommonGeometryDataPackage.MESH__NORMALS;

	/**
	 * The feature id for the '<em><b>Polygons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_TRIANGULAR_MESH__POLYGONS = ApogyCommonGeometryDataPackage.MESH__POLYGONS;

	/**
	 * The number of structural features of the '<em>Spherical Triangular Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_TRIANGULAR_MESH_FEATURE_COUNT = ApogyCommonGeometryDataPackage.MESH_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Polygon Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_TRIANGULAR_MESH___GET_POLYGON_NEIGHBOURS__POLYGON = ApogyCommonGeometryDataPackage.MESH___GET_POLYGON_NEIGHBOURS__POLYGON;

	/**
	 * The operation id for the '<em>Get Point Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_TRIANGULAR_MESH___GET_POINT_NEIGHBOURS__COORDINATES = ApogyCommonGeometryDataPackage.MESH___GET_POINT_NEIGHBOURS__COORDINATES;

	/**
	 * The operation id for the '<em>Get Polygons Sharing Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_TRIANGULAR_MESH___GET_POLYGONS_SHARING_POINT__COORDINATES = ApogyCommonGeometryDataPackage.MESH___GET_POLYGONS_SHARING_POINT__COORDINATES;

	/**
	 * The number of operations of the '<em>Spherical Triangular Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERICAL_TRIANGULAR_MESH_OPERATION_COUNT = ApogyCommonGeometryDataPackage.MESH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.PoseImpl <em>Pose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.PoseImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getPose()
	 * @generated
	 */
	int POSE = 22;

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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphereSamplingShapeImpl <em>Sphere Sampling Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphereSamplingShapeImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getSphereSamplingShape()
	 * @generated
	 */
	int SPHERE_SAMPLING_SHAPE = 23;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_SAMPLING_SHAPE__RADIUS = ApogyCommonGeometryDataPackage.COORDINATES_SAMPLING_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Center</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_SAMPLING_SHAPE__CENTER = ApogyCommonGeometryDataPackage.COORDINATES_SAMPLING_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Include Just Touching</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_SAMPLING_SHAPE__INCLUDE_JUST_TOUCHING = ApogyCommonGeometryDataPackage.COORDINATES_SAMPLING_SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sphere Sampling Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_SAMPLING_SHAPE_FEATURE_COUNT = ApogyCommonGeometryDataPackage.COORDINATES_SAMPLING_SHAPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Inside</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_SAMPLING_SHAPE___IS_INSIDE__COORDINATES = ApogyCommonGeometryDataPackage.COORDINATES_SAMPLING_SHAPE___IS_INSIDE__COORDINATES;

	/**
	 * The operation id for the '<em>Is Polygon Inside</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_SAMPLING_SHAPE___IS_POLYGON_INSIDE__POLYGON = ApogyCommonGeometryDataPackage.COORDINATES_SAMPLING_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sphere Sampling Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_SAMPLING_SHAPE_OPERATION_COUNT = ApogyCommonGeometryDataPackage.COORDINATES_SAMPLING_SHAPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CubeSamplingShapeImpl <em>Cube Sampling Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CubeSamplingShapeImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCubeSamplingShape()
	 * @generated
	 */
	int CUBE_SAMPLING_SHAPE = 24;

	/**
	 * The feature id for the '<em><b>Corner1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAMPLING_SHAPE__CORNER1 = ApogyCommonGeometryDataPackage.COORDINATES_SAMPLING_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Corner2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAMPLING_SHAPE__CORNER2 = ApogyCommonGeometryDataPackage.COORDINATES_SAMPLING_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Include Just Touching</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAMPLING_SHAPE__INCLUDE_JUST_TOUCHING = ApogyCommonGeometryDataPackage.COORDINATES_SAMPLING_SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cube Sampling Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAMPLING_SHAPE_FEATURE_COUNT = ApogyCommonGeometryDataPackage.COORDINATES_SAMPLING_SHAPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Inside</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAMPLING_SHAPE___IS_INSIDE__COORDINATES = ApogyCommonGeometryDataPackage.COORDINATES_SAMPLING_SHAPE___IS_INSIDE__COORDINATES;

	/**
	 * The operation id for the '<em>Is Polygon Inside</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAMPLING_SHAPE___IS_POLYGON_INSIDE__POLYGON = ApogyCommonGeometryDataPackage.COORDINATES_SAMPLING_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cube Sampling Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAMPLING_SHAPE_OPERATION_COUNT = ApogyCommonGeometryDataPackage.COORDINATES_SAMPLING_SHAPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesSetShapeSamplerImpl <em>Cartesian Coordinates Set Shape Sampler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesSetShapeSamplerImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianCoordinatesSetShapeSampler()
	 * @generated
	 */
	int CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER = 25;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER__PROGRESS_MONITOR = ApogyCommonGeometryDataPackage.COORDINATES_SET_SHAPES_SAMPLER__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER__INPUT = ApogyCommonGeometryDataPackage.COORDINATES_SET_SHAPES_SAMPLER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER__OUTPUT = ApogyCommonGeometryDataPackage.COORDINATES_SET_SHAPES_SAMPLER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Coordinates Sampling Shapes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER__COORDINATES_SAMPLING_SHAPES = ApogyCommonGeometryDataPackage.COORDINATES_SET_SHAPES_SAMPLER__COORDINATES_SAMPLING_SHAPES;

	/**
	 * The feature id for the '<em><b>Shape Sampling Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER__SHAPE_SAMPLING_MODE = ApogyCommonGeometryDataPackage.COORDINATES_SET_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE;

	/**
	 * The number of structural features of the '<em>Cartesian Coordinates Set Shape Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER_FEATURE_COUNT = ApogyCommonGeometryDataPackage.COORDINATES_SET_SHAPES_SAMPLER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER___PROCESS__OBJECT = ApogyCommonGeometryDataPackage.COORDINATES_SET_SHAPES_SAMPLER___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Cartesian Coordinates Set Shape Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER_OPERATION_COUNT = ApogyCommonGeometryDataPackage.COORDINATES_SET_SHAPES_SAMPLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesMeshSamplerImpl <em>Cartesian Coordinates Mesh Sampler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesMeshSamplerImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianCoordinatesMeshSampler()
	 * @generated
	 */
	int CARTESIAN_COORDINATES_MESH_SAMPLER = 26;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_SAMPLER__PROGRESS_MONITOR = ApogyCommonGeometryDataPackage.MESH_COORDINATES_SHAPES_SAMPLER__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_SAMPLER__INPUT = ApogyCommonGeometryDataPackage.MESH_COORDINATES_SHAPES_SAMPLER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_SAMPLER__OUTPUT = ApogyCommonGeometryDataPackage.MESH_COORDINATES_SHAPES_SAMPLER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Coordinates Sampling Shapes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_SAMPLER__COORDINATES_SAMPLING_SHAPES = ApogyCommonGeometryDataPackage.MESH_COORDINATES_SHAPES_SAMPLER__COORDINATES_SAMPLING_SHAPES;

	/**
	 * The feature id for the '<em><b>Shape Sampling Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_SAMPLER__SHAPE_SAMPLING_MODE = ApogyCommonGeometryDataPackage.MESH_COORDINATES_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE;

	/**
	 * The feature id for the '<em><b>Polygon Sampling Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_SAMPLER__POLYGON_SAMPLING_MODE = ApogyCommonGeometryDataPackage.MESH_COORDINATES_SHAPES_SAMPLER__POLYGON_SAMPLING_MODE;

	/**
	 * The number of structural features of the '<em>Cartesian Coordinates Mesh Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_SAMPLER_FEATURE_COUNT = ApogyCommonGeometryDataPackage.MESH_COORDINATES_SHAPES_SAMPLER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_SAMPLER___PROCESS__OBJECT = ApogyCommonGeometryDataPackage.MESH_COORDINATES_SHAPES_SAMPLER___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Cartesian Coordinates Mesh Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_SAMPLER_OPERATION_COUNT = ApogyCommonGeometryDataPackage.MESH_COORDINATES_SHAPES_SAMPLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesMeshPolygonSamplerImpl <em>Cartesian Coordinates Mesh Polygon Sampler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesMeshPolygonSamplerImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianCoordinatesMeshPolygonSampler()
	 * @generated
	 */
	int CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER = 27;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER__PROGRESS_MONITOR = ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER__INPUT = ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER__OUTPUT = ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Polygon Sampling Shapes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER__POLYGON_SAMPLING_SHAPES = ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER__POLYGON_SAMPLING_SHAPES;

	/**
	 * The feature id for the '<em><b>Shape Sampling Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER__SHAPE_SAMPLING_MODE = ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE;

	/**
	 * The number of structural features of the '<em>Cartesian Coordinates Mesh Polygon Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER_FEATURE_COUNT = ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER___PROCESS__OBJECT = ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Cartesian Coordinates Mesh Polygon Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER_OPERATION_COUNT = ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangularMeshSamplerImpl <em>Cartesian Triangular Mesh Sampler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangularMeshSamplerImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianTriangularMeshSampler()
	 * @generated
	 */
	int CARTESIAN_TRIANGULAR_MESH_SAMPLER = 28;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SAMPLER__PROGRESS_MONITOR = ApogyCommonGeometryDataPackage.MESH_COORDINATES_SHAPES_SAMPLER__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SAMPLER__INPUT = ApogyCommonGeometryDataPackage.MESH_COORDINATES_SHAPES_SAMPLER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SAMPLER__OUTPUT = ApogyCommonGeometryDataPackage.MESH_COORDINATES_SHAPES_SAMPLER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Coordinates Sampling Shapes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SAMPLER__COORDINATES_SAMPLING_SHAPES = ApogyCommonGeometryDataPackage.MESH_COORDINATES_SHAPES_SAMPLER__COORDINATES_SAMPLING_SHAPES;

	/**
	 * The feature id for the '<em><b>Shape Sampling Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SAMPLER__SHAPE_SAMPLING_MODE = ApogyCommonGeometryDataPackage.MESH_COORDINATES_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE;

	/**
	 * The feature id for the '<em><b>Polygon Sampling Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SAMPLER__POLYGON_SAMPLING_MODE = ApogyCommonGeometryDataPackage.MESH_COORDINATES_SHAPES_SAMPLER__POLYGON_SAMPLING_MODE;

	/**
	 * The number of structural features of the '<em>Cartesian Triangular Mesh Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SAMPLER_FEATURE_COUNT = ApogyCommonGeometryDataPackage.MESH_COORDINATES_SHAPES_SAMPLER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SAMPLER___PROCESS__OBJECT = ApogyCommonGeometryDataPackage.MESH_COORDINATES_SHAPES_SAMPLER___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Cartesian Triangular Mesh Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SAMPLER_OPERATION_COUNT = ApogyCommonGeometryDataPackage.MESH_COORDINATES_SHAPES_SAMPLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangularMeshPolygonSamplerImpl <em>Cartesian Triangular Mesh Polygon Sampler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangularMeshPolygonSamplerImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianTriangularMeshPolygonSampler()
	 * @generated
	 */
	int CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER = 29;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER__PROGRESS_MONITOR = ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER__INPUT = ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER__OUTPUT = ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Polygon Sampling Shapes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER__POLYGON_SAMPLING_SHAPES = ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER__POLYGON_SAMPLING_SHAPES;

	/**
	 * The feature id for the '<em><b>Shape Sampling Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER__SHAPE_SAMPLING_MODE = ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE;

	/**
	 * The number of structural features of the '<em>Cartesian Triangular Mesh Polygon Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER_FEATURE_COUNT = ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER___PROCESS__OBJECT = ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Cartesian Triangular Mesh Polygon Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER_OPERATION_COUNT = ApogyCommonGeometryDataPackage.MESH_POLYGON_SHAPES_SAMPLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianPositionCoordinatesMesherImpl <em>Cartesian Position Coordinates Mesher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianPositionCoordinatesMesherImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianPositionCoordinatesMesher()
	 * @generated
	 */
	int CARTESIAN_POSITION_COORDINATES_MESHER = 30;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_COORDINATES_MESHER__PROGRESS_MONITOR = ApogyCommonProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_COORDINATES_MESHER__INPUT = ApogyCommonProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_COORDINATES_MESHER__OUTPUT = ApogyCommonProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The number of structural features of the '<em>Cartesian Position Coordinates Mesher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_COORDINATES_MESHER_FEATURE_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_COORDINATES_MESHER___PROCESS__OBJECT = ApogyCommonProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Cartesian Position Coordinates Mesher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_COORDINATES_MESHER_OPERATION_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.NormalPointCloudImpl <em>Normal Point Cloud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.NormalPointCloudImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getNormalPointCloud()
	 * @generated
	 */
	int NORMAL_POINT_CLOUD = 31;

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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.PointLocatorImpl <em>Point Locator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.PointLocatorImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getPointLocator()
	 * @generated
	 */
	int POINT_LOCATOR = 32;

	/**
	 * The number of structural features of the '<em>Point Locator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LOCATOR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LOCATOR___GET_POINTS = 0;

	/**
	 * The operation id for the '<em>Add Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LOCATOR___ADD_POINT__CARTESIANPOSITIONCOORDINATES = 1;

	/**
	 * The operation id for the '<em>Add Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LOCATOR___ADD_POINTS__LIST = 2;

	/**
	 * The operation id for the '<em>Remove Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LOCATOR___REMOVE_POINT__CARTESIANPOSITIONCOORDINATES = 3;

	/**
	 * The operation id for the '<em>Remove Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LOCATOR___REMOVE_POINTS__LIST = 4;

	/**
	 * The operation id for the '<em>Clear Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LOCATOR___CLEAR_POINTS = 5;

	/**
	 * The operation id for the '<em>Find Closest Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LOCATOR___FIND_CLOSEST_POINT__CARTESIANPOSITIONCOORDINATES = 6;

	/**
	 * The operation id for the '<em>Find Closest Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LOCATOR___FIND_CLOSEST_POINTS__CARTESIANPOSITIONCOORDINATES_INT = 7;

	/**
	 * The operation id for the '<em>Find Points Within Radius</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LOCATOR___FIND_POINTS_WITHIN_RADIUS__CARTESIANPOSITIONCOORDINATES_DOUBLE = 8;

	/**
	 * The number of operations of the '<em>Point Locator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LOCATOR_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.KDTreeBasedPointLocatorImpl <em>KD Tree Based Point Locator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.KDTreeBasedPointLocatorImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getKDTreeBasedPointLocator()
	 * @generated
	 */
	int KD_TREE_BASED_POINT_LOCATOR = 33;

	/**
	 * The number of structural features of the '<em>KD Tree Based Point Locator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KD_TREE_BASED_POINT_LOCATOR_FEATURE_COUNT = POINT_LOCATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KD_TREE_BASED_POINT_LOCATOR___GET_POINTS = POINT_LOCATOR___GET_POINTS;

	/**
	 * The operation id for the '<em>Add Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KD_TREE_BASED_POINT_LOCATOR___ADD_POINT__CARTESIANPOSITIONCOORDINATES = POINT_LOCATOR___ADD_POINT__CARTESIANPOSITIONCOORDINATES;

	/**
	 * The operation id for the '<em>Add Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KD_TREE_BASED_POINT_LOCATOR___ADD_POINTS__LIST = POINT_LOCATOR___ADD_POINTS__LIST;

	/**
	 * The operation id for the '<em>Remove Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KD_TREE_BASED_POINT_LOCATOR___REMOVE_POINT__CARTESIANPOSITIONCOORDINATES = POINT_LOCATOR___REMOVE_POINT__CARTESIANPOSITIONCOORDINATES;

	/**
	 * The operation id for the '<em>Remove Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KD_TREE_BASED_POINT_LOCATOR___REMOVE_POINTS__LIST = POINT_LOCATOR___REMOVE_POINTS__LIST;

	/**
	 * The operation id for the '<em>Clear Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KD_TREE_BASED_POINT_LOCATOR___CLEAR_POINTS = POINT_LOCATOR___CLEAR_POINTS;

	/**
	 * The operation id for the '<em>Find Closest Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KD_TREE_BASED_POINT_LOCATOR___FIND_CLOSEST_POINT__CARTESIANPOSITIONCOORDINATES = POINT_LOCATOR___FIND_CLOSEST_POINT__CARTESIANPOSITIONCOORDINATES;

	/**
	 * The operation id for the '<em>Find Closest Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KD_TREE_BASED_POINT_LOCATOR___FIND_CLOSEST_POINTS__CARTESIANPOSITIONCOORDINATES_INT = POINT_LOCATOR___FIND_CLOSEST_POINTS__CARTESIANPOSITIONCOORDINATES_INT;

	/**
	 * The operation id for the '<em>Find Points Within Radius</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KD_TREE_BASED_POINT_LOCATOR___FIND_POINTS_WITHIN_RADIUS__CARTESIANPOSITIONCOORDINATES_DOUBLE = POINT_LOCATOR___FIND_POINTS_WITHIN_RADIUS__CARTESIANPOSITIONCOORDINATES_DOUBLE;

	/**
	 * The number of operations of the '<em>KD Tree Based Point Locator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KD_TREE_BASED_POINT_LOCATOR_OPERATION_COUNT = POINT_LOCATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.MeshLocalizerImpl <em>Mesh Localizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.MeshLocalizerImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getMeshLocalizer()
	 * @generated
	 */
	int MESH_LOCALIZER = 34;

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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.DelaunayMesherImpl <em>Delaunay Mesher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.DelaunayMesherImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getDelaunayMesher()
	 * @generated
	 */
	int DELAUNAY_MESHER = 35;

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
	 * The number of structural features of the '<em>Delaunay Mesher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAUNAY_MESHER_FEATURE_COUNT = CARTESIAN_POSITION_COORDINATES_MESHER_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.DigitalElevationMapMesherImpl <em>Digital Elevation Map Mesher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.DigitalElevationMapMesherImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getDigitalElevationMapMesher()
	 * @generated
	 */
	int DIGITAL_ELEVATION_MAP_MESHER = 36;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_MESHER__PROGRESS_MONITOR = ApogyCommonProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_MESHER__INPUT = ApogyCommonProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_MESHER__OUTPUT = ApogyCommonProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The number of structural features of the '<em>Digital Elevation Map Mesher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_MESHER_FEATURE_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_MESHER___PROCESS__OBJECT = ApogyCommonProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Digital Elevation Map Mesher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_MESHER_OPERATION_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.DigitalElevationMapSamplerImpl <em>Digital Elevation Map Sampler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.DigitalElevationMapSamplerImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getDigitalElevationMapSampler()
	 * @generated
	 */
	int DIGITAL_ELEVATION_MAP_SAMPLER = 37;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_SAMPLER__PROGRESS_MONITOR = ApogyCommonProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_SAMPLER__INPUT = ApogyCommonProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_SAMPLER__OUTPUT = ApogyCommonProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Target Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_SAMPLER__TARGET_RESOLUTION = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Digital Elevation Map Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_SAMPLER_FEATURE_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_SAMPLER___PROCESS__OBJECT = ApogyCommonProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Digital Elevation Map Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ELEVATION_MAP_SAMPLER_OPERATION_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.TriangularMeshNormalsCalculatorImpl <em>Triangular Mesh Normals Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.TriangularMeshNormalsCalculatorImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getTriangularMeshNormalsCalculator()
	 * @generated
	 */
	int TRIANGULAR_MESH_NORMALS_CALCULATOR = 38;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_NORMALS_CALCULATOR__PROGRESS_MONITOR = ApogyCommonProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_NORMALS_CALCULATOR__INPUT = ApogyCommonProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_NORMALS_CALCULATOR__OUTPUT = ApogyCommonProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The number of structural features of the '<em>Triangular Mesh Normals Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_NORMALS_CALCULATOR_FEATURE_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_NORMALS_CALCULATOR___PROCESS__OBJECT = ApogyCommonProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Triangular Mesh Normals Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_NORMALS_CALCULATOR_OPERATION_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.TriangularMeshToNormalPointCloudImpl <em>Triangular Mesh To Normal Point Cloud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.TriangularMeshToNormalPointCloudImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getTriangularMeshToNormalPointCloud()
	 * @generated
	 */
	int TRIANGULAR_MESH_TO_NORMAL_POINT_CLOUD = 39;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_TO_NORMAL_POINT_CLOUD__PROGRESS_MONITOR = ApogyCommonProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_TO_NORMAL_POINT_CLOUD__INPUT = ApogyCommonProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_TO_NORMAL_POINT_CLOUD__OUTPUT = ApogyCommonProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The number of structural features of the '<em>Triangular Mesh To Normal Point Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_TO_NORMAL_POINT_CLOUD_FEATURE_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_TO_NORMAL_POINT_CLOUD___PROCESS__OBJECT = ApogyCommonProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Triangular Mesh To Normal Point Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_TO_NORMAL_POINT_CLOUD_OPERATION_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.UniquePointsFilterImpl <em>Unique Points Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.UniquePointsFilterImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getUniquePointsFilter()
	 * @generated
	 */
	int UNIQUE_POINTS_FILTER = 40;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_POINTS_FILTER__PROGRESS_MONITOR = ApogyCommonProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_POINTS_FILTER__INPUT = ApogyCommonProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_POINTS_FILTER__OUTPUT = ApogyCommonProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The number of structural features of the '<em>Unique Points Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_POINTS_FILTER_FEATURE_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_POINTS_FILTER___PROCESS__OBJECT = ApogyCommonProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Unique Points Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_POINTS_FILTER_OPERATION_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.TriangleEdgeLengthTriangularMeshFilterImpl <em>Triangle Edge Length Triangular Mesh Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.TriangleEdgeLengthTriangularMeshFilterImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getTriangleEdgeLengthTriangularMeshFilter()
	 * @generated
	 */
	int TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER = 41;

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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.OutlierFilterImpl <em>Outlier Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.OutlierFilterImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getOutlierFilter()
	 * @generated
	 */
	int OUTLIER_FILTER = 42;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLIER_FILTER__PROGRESS_MONITOR = ApogyCommonProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLIER_FILTER__INPUT = ApogyCommonProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLIER_FILTER__OUTPUT = ApogyCommonProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Max Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLIER_FILTER__MAX_DISTANCE = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Outlier Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLIER_FILTER_FEATURE_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLIER_FILTER___PROCESS__OBJECT = ApogyCommonProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Outlier Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLIER_FILTER_OPERATION_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.MeshSmootherImpl <em>Mesh Smoother</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.MeshSmootherImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getMeshSmoother()
	 * @generated
	 */
	int MESH_SMOOTHER = 43;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_SMOOTHER__PROGRESS_MONITOR = ApogyCommonProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_SMOOTHER__INPUT = ApogyCommonProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_SMOOTHER__OUTPUT = ApogyCommonProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Number Of Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_SMOOTHER__NUMBER_OF_ITERATIONS = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mesh Smoother</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_SMOOTHER_FEATURE_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_SMOOTHER___PROCESS__OBJECT = ApogyCommonProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Mesh Smoother</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_SMOOTHER_OPERATION_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.VoxelBased3DPointCloudResamplerImpl <em>Voxel Based3 DPoint Cloud Resampler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.VoxelBased3DPointCloudResamplerImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getVoxelBased3DPointCloudResampler()
	 * @generated
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER = 44;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__PROGRESS_MONITOR = ApogyCommonProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__INPUT = ApogyCommonProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__OUTPUT = ApogyCommonProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Resolution X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_X = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolution Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Y = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resolution Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Z = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Minimum Number Of Point Per Voxel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__MINIMUM_NUMBER_OF_POINT_PER_VOXEL = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tile Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__TILE_RESOLUTION = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Voxel Based3 DPoint Cloud Resampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER_FEATURE_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER___PROCESS__OBJECT = ApogyCommonProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Voxel Based3 DPoint Cloud Resampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER_OPERATION_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.RigidBodyPoseTrackerImpl <em>Rigid Body Pose Tracker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.RigidBodyPoseTrackerImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getRigidBodyPoseTracker()
	 * @generated
	 */
	int RIGID_BODY_POSE_TRACKER = 46;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.PositionMarkerImpl <em>Position Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.PositionMarkerImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getPositionMarker()
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
	 * The operation id for the '<em>Add Position Markers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_BODY_POSE_TRACKER___ADD_POSITION_MARKERS__LIST = 0;

	/**
	 * The operation id for the '<em>Remove Position Markers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_BODY_POSE_TRACKER___REMOVE_POSITION_MARKERS__LIST = 1;

	/**
	 * The operation id for the '<em>Compute Transformation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_BODY_POSE_TRACKER___COMPUTE_TRANSFORMATION__ELIST = 2;

	/**
	 * The operation id for the '<em>Compute Transformation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_BODY_POSE_TRACKER___COMPUTE_TRANSFORMATION__LIST = 3;

	/**
	 * The number of operations of the '<em>Rigid Body Pose Tracker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGID_BODY_POSE_TRACKER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DFacadeImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getApogyCommonGeometryData3DFacade()
	 * @generated
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE = 47;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Cartesian Position Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_POSITION_COORDINATES__DOUBLE_DOUBLE_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Create Colored Cartesian Position Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_COLORED_CARTESIAN_POSITION_COORDINATES__DOUBLE_DOUBLE_DOUBLE_SHORT_SHORT_SHORT = 1;

	/**
	 * The operation id for the '<em>Create Colored Cartesian Position Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_COLORED_CARTESIAN_POSITION_COORDINATES__DOUBLE_DOUBLE_DOUBLE_SHORT_SHORT_SHORT_SHORT = 2;

	/**
	 * The operation id for the '<em>Create RGBA Color</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_RGBA_COLOR__SHORT_SHORT_SHORT_SHORT = 3;

	/**
	 * The operation id for the '<em>Create Cartesian Orientation Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_ORIENTATION_COORDINATES__DOUBLE_DOUBLE_DOUBLE = 4;

	/**
	 * The operation id for the '<em>Create Spherical Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_SPHERICAL_COORDINATES__DOUBLE_DOUBLE_DOUBLE = 5;

	/**
	 * The operation id for the '<em>Create Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_POSE__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE = 6;

	/**
	 * The operation id for the '<em>Create Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_POSE__POSE = 7;

	/**
	 * The operation id for the '<em>Create Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_POSE__CARTESIANPOSITIONCOORDINATES_CARTESIANORIENTATIONCOORDINATES = 8;

	/**
	 * The operation id for the '<em>Create Digital Elevation Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_DIGITAL_ELEVATION_MAP__CARTESIANCOORDINATESSET = 9;

	/**
	 * The operation id for the '<em>Create Cartesian Polygon</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_POLYGON__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES = 10;

	/**
	 * The operation id for the '<em>Create Cartesian Position Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_POSITION_COORDINATES__CARTESIANPOSITIONCOORDINATES = 11;

	/**
	 * The operation id for the '<em>Create Cartesian Orientation Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_ORIENTATION_COORDINATES__CARTESIANORIENTATIONCOORDINATES = 12;

	/**
	 * The operation id for the '<em>Create Cartesian Coordinates Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_COORDINATES_MESH__CARTESIANCOORDINATESMESH = 13;

	/**
	 * The operation id for the '<em>Create Cartesian Triangle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_TRIANGLE__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES = 14;

	/**
	 * The operation id for the '<em>Create Cartesian Triangle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_TRIANGLE__CARTESIANPOLYGON = 15;

	/**
	 * The operation id for the '<em>Create Cartesian Coordinates Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_COORDINATES_MESH__LIST = 16;

	/**
	 * The operation id for the '<em>Create Cartesian Coordinates Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_COORDINATES_MESH__CARTESIANTRIANGULARMESH = 17;

	/**
	 * The operation id for the '<em>Create Cartesian Triangular Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_TRIANGULAR_MESH__LIST = 18;

	/**
	 * The operation id for the '<em>Create Cartesian Triangular Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_TRIANGULAR_MESH__CARTESIANTRIANGULARMESH = 19;

	/**
	 * The operation id for the '<em>Apply Transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___APPLY_TRANSFORM__CARTESIANCOORDINATESSET_MATRIX4D = 20;

	/**
	 * The operation id for the '<em>Apply Transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___APPLY_TRANSFORM__LIST_MATRIX4D = 21;

	/**
	 * The operation id for the '<em>Create Transformed Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_TRANSFORMED_MESH__CARTESIANTRIANGULARMESH_MATRIX4D = 22;

	/**
	 * The operation id for the '<em>Apply Transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___APPLY_TRANSFORM__CARTESIANTRIANGULARMESH_MATRIX4D = 23;

	/**
	 * The operation id for the '<em>Apply Transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___APPLY_TRANSFORM__NORMALPOINTCLOUD_MATRIX4D = 24;

	/**
	 * The operation id for the '<em>Update Cartesian Coordinates Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___UPDATE_CARTESIAN_COORDINATES_SET__CARTESIANCOORDINATESSET_DOUBLE = 25;

	/**
	 * The operation id for the '<em>Concatenate Triangular Meshes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CONCATENATE_TRIANGULAR_MESHES__LIST = 26;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA3_DFACADE_OPERATION_COUNT = 27;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.Data3DIOImpl <em>Data3 DIO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.Data3DIOImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getData3DIO()
	 * @generated
	 */
	int DATA3_DIO = 48;

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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.Data3DUtilsImpl <em>Data3 DUtils</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.Data3DUtilsImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getData3DUtils()
	 * @generated
	 */
	int DATA3_DUTILS = 49;

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
	 * The operation id for the '<em>Compute Normal At Vertex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DUTILS___COMPUTE_NORMAL_AT_VERTEX__CARTESIANTRIANGULARMESH_CARTESIANPOSITIONCOORDINATES = 1;

	/**
	 * The operation id for the '<em>Compute Centroid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DUTILS___COMPUTE_CENTROID__LIST = 2;

	/**
	 * The operation id for the '<em>Compute Centroid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DUTILS___COMPUTE_CENTROID__CARTESIANCOORDINATESSET = 3;

	/**
	 * The operation id for the '<em>Compute Min Max Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DUTILS___COMPUTE_MIN_MAX_VALUES__POINT3D_POINT3D_CARTESIANCOORDINATESSET = 4;

	/**
	 * The operation id for the '<em>Compute Curvature Change</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DUTILS___COMPUTE_CURVATURE_CHANGE__POINTLOCATOR_INT_DOUBLE = 5;

	/**
	 * The operation id for the '<em>Extrude</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DUTILS___EXTRUDE__LIST_CARTESIANAXIS_DOUBLE_BOOLEAN = 6;

	/**
	 * The number of operations of the '<em>Data3 DUtils</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA3_DUTILS_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianAxis <em>Cartesian Axis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianAxis
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianAxis()
	 * @generated
	 */
	int CARTESIAN_AXIS = 50;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPlane <em>Cartesian Plane</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPlane
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianPlane()
	 * @generated
	 */
	int CARTESIAN_PLANE = 51;

	/**
	 * The meta object id for the '<em>Vector2d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Vector2d
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getVector2d()
	 * @generated
	 */
	int VECTOR2D = 52;

	/**
	 * The meta object id for the '<em>Vector3d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Vector3d
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getVector3d()
	 * @generated
	 */
	int VECTOR3D = 53;

	/**
	 * The meta object id for the '<em>Point3d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Point3d
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getPoint3d()
	 * @generated
	 */
	int POINT3D = 54;

	/**
	 * The meta object id for the '<em>Matrix4d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Matrix4d
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getMatrix4d()
	 * @generated
	 */
	int MATRIX4D = 55;

	/**
	 * The meta object id for the '<em>GVector</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.GVector
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getGVector()
	 * @generated
	 */
	int GVECTOR = 56;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getList()
	 * @generated
	 */
	int LIST = 57;

	/**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 58;

	/**
	 * The meta object id for the '<em>Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Set
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getSet()
	 * @generated
	 */
	int SET = 59;

	/**
	 * The meta object id for the '<em>Sorted Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.SortedSet
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getSortedSet()
	 * @generated
	 */
	int SORTED_SET = 60;

	/**
	 * The meta object id for the '<em>Collection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 61;

	/**
	 * The meta object id for the '<em>EList</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.EList
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getEList()
	 * @generated
	 */
	int ELIST = 62;

	/**
	 * The meta object id for the '<em>IProgress Monitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getIProgressMonitor()
	 * @generated
	 */
	int IPROGRESS_MONITOR = 63;

	/**
	 * The meta object id for the '<em>Output Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.OutputStream
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getOutputStream()
	 * @generated
	 */
	int OUTPUT_STREAM = 64;

	/**
	 * The meta object id for the '<em>Input Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.InputStream
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getInputStream()
	 * @generated
	 */
	int INPUT_STREAM = 65;

	/**
	 * The meta object id for the '<em>IO Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.IOException
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getIOException()
	 * @generated
	 */
	int IO_EXCEPTION = 66;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 67;

	/**
	 * The meta object id for the '<em>Illegal Argument Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.IllegalArgumentException
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getIllegalArgumentException()
	 * @generated
	 */
	int ILLEGAL_ARGUMENT_EXCEPTION = 68;

	/**
	 * The meta object id for the '<em>Double Array Of Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getDoubleArrayOfArray()
	 * @generated
	 */
	int DOUBLE_ARRAY_OF_ARRAY = 69;

	/**
	 * The meta object id for the '<em>Int Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getIntArray()
	 * @generated
	 */
	int INT_ARRAY = 70;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon <em>Cartesian Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Polygon</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon
	 * @generated
	 */
	EClass getCartesianPolygon();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon#getSurface <em>Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surface</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon#getSurface()
	 * @see #getCartesianPolygon()
	 * @generated
	 */
	EAttribute getCartesianPolygon_Surface();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon#getNormal <em>Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon#getNormal()
	 * @see #getCartesianPolygon()
	 * @generated
	 */
	EAttribute getCartesianPolygon_Normal();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon#getCentroid <em>Centroid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Centroid</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon#getCentroid()
	 * @see #getCartesianPolygon()
	 * @generated
	 */
	EReference getCartesianPolygon_Centroid();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangle <em>Cartesian Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangle</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangle
	 * @generated
	 */
	EClass getCartesianTriangle();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalPolygon <em>Spherical Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spherical Polygon</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalPolygon
	 * @generated
	 */
	EClass getSphericalPolygon();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalTriangle <em>Spherical Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spherical Triangle</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalTriangle
	 * @generated
	 */
	EClass getSphericalTriangle();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates <em>Cartesian Position Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Position Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates
	 * @generated
	 */
	EClass getCartesianPositionCoordinates();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates#getX()
	 * @see #getCartesianPositionCoordinates()
	 * @generated
	 */
	EAttribute getCartesianPositionCoordinates_X();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates#getY()
	 * @see #getCartesianPositionCoordinates()
	 * @generated
	 */
	EAttribute getCartesianPositionCoordinates_Y();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates#getZ()
	 * @see #getCartesianPositionCoordinates()
	 * @generated
	 */
	EAttribute getCartesianPositionCoordinates_Z();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates#asPoint3d() <em>As Point3d</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Point3d</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates#asPoint3d()
	 * @generated
	 */
	EOperation getCartesianPositionCoordinates__AsPoint3d();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.RGBAColor <em>RGBA Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RGBA Color</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.RGBAColor
	 * @generated
	 */
	EClass getRGBAColor();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.RGBAColor#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.RGBAColor#getAlpha()
	 * @see #getRGBAColor()
	 * @generated
	 */
	EAttribute getRGBAColor_Alpha();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.RGBAColor#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.RGBAColor#getRed()
	 * @see #getRGBAColor()
	 * @generated
	 */
	EAttribute getRGBAColor_Red();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.RGBAColor#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.RGBAColor#getGreen()
	 * @see #getRGBAColor()
	 * @generated
	 */
	EAttribute getRGBAColor_Green();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.RGBAColor#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.RGBAColor#getBlue()
	 * @see #getRGBAColor()
	 * @generated
	 */
	EAttribute getRGBAColor_Blue();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCartesianPositionCoordinates <em>Colored Cartesian Position Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colored Cartesian Position Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCartesianPositionCoordinates
	 * @generated
	 */
	EClass getColoredCartesianPositionCoordinates();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCartesianTriangularMesh <em>Colored Cartesian Triangular Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colored Cartesian Triangular Mesh</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCartesianTriangularMesh
	 * @generated
	 */
	EClass getColoredCartesianTriangularMesh();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMeshColorizer <em>Cartesian Triangular Mesh Colorizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangular Mesh Colorizer</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMeshColorizer
	 * @generated
	 */
	EClass getCartesianTriangularMeshColorizer();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMeshColorizer#computeColor(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates) <em>Compute Color</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Color</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMeshColorizer#computeColor(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated
	 */
	EOperation getCartesianTriangularMeshColorizer__ComputeColor__CartesianTriangularMesh_CartesianPositionCoordinates();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMeshColorizerBySlope <em>Cartesian Triangular Mesh Colorizer By Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangular Mesh Colorizer By Slope</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMeshColorizerBySlope
	 * @generated
	 */
	EClass getCartesianTriangularMeshColorizerBySlope();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMeshColorizerBySlope#getNormalAxis <em>Normal Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Axis</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMeshColorizerBySlope#getNormalAxis()
	 * @see #getCartesianTriangularMeshColorizerBySlope()
	 * @generated
	 */
	EAttribute getCartesianTriangularMeshColorizerBySlope_NormalAxis();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates <em>Cartesian Orientation Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Orientation Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates
	 * @generated
	 */
	EClass getCartesianOrientationCoordinates();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates#getXRotation <em>XRotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XRotation</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates#getXRotation()
	 * @see #getCartesianOrientationCoordinates()
	 * @generated
	 */
	EAttribute getCartesianOrientationCoordinates_XRotation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates#getYRotation <em>YRotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YRotation</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates#getYRotation()
	 * @see #getCartesianOrientationCoordinates()
	 * @generated
	 */
	EAttribute getCartesianOrientationCoordinates_YRotation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates#getZRotation <em>ZRotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZRotation</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates#getZRotation()
	 * @see #getCartesianOrientationCoordinates()
	 * @generated
	 */
	EAttribute getCartesianOrientationCoordinates_ZRotation();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.AbstractCartesianCoordinatesSet <em>Abstract Cartesian Coordinates Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Cartesian Coordinates Set</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.AbstractCartesianCoordinatesSet
	 * @generated
	 */
	EClass getAbstractCartesianCoordinatesSet();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.AbstractCartesianCoordinatesSet#getExtent() <em>Get Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Extent</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.AbstractCartesianCoordinatesSet#getExtent()
	 * @generated
	 */
	EOperation getAbstractCartesianCoordinatesSet__GetExtent();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet <em>Cartesian Coordinates Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Coordinates Set</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet
	 * @generated
	 */
	EClass getCartesianCoordinatesSet();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCartesianCoordinatesSet <em>Colored Cartesian Coordinates Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colored Cartesian Coordinates Set</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCartesianCoordinatesSet
	 * @generated
	 */
	EClass getColoredCartesianCoordinatesSet();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent <em>Cartesian Coordinates Set Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Coordinates Set Extent</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent
	 * @generated
	 */
	EClass getCartesianCoordinatesSetExtent();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent#getXMin <em>XMin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XMin</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent#getXMin()
	 * @see #getCartesianCoordinatesSetExtent()
	 * @generated
	 */
	EAttribute getCartesianCoordinatesSetExtent_XMin();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent#getXMax <em>XMax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XMax</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent#getXMax()
	 * @see #getCartesianCoordinatesSetExtent()
	 * @generated
	 */
	EAttribute getCartesianCoordinatesSetExtent_XMax();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent#getYMin <em>YMin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YMin</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent#getYMin()
	 * @see #getCartesianCoordinatesSetExtent()
	 * @generated
	 */
	EAttribute getCartesianCoordinatesSetExtent_YMin();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent#getYMax <em>YMax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YMax</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent#getYMax()
	 * @see #getCartesianCoordinatesSetExtent()
	 * @generated
	 */
	EAttribute getCartesianCoordinatesSetExtent_YMax();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent#getZMin <em>ZMin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZMin</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent#getZMin()
	 * @see #getCartesianCoordinatesSetExtent()
	 * @generated
	 */
	EAttribute getCartesianCoordinatesSetExtent_ZMin();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent#getZMax <em>ZMax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZMax</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent#getZMax()
	 * @see #getCartesianCoordinatesSetExtent()
	 * @generated
	 */
	EAttribute getCartesianCoordinatesSetExtent_ZMax();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent#getXDimension <em>XDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDimension</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent#getXDimension()
	 * @see #getCartesianCoordinatesSetExtent()
	 * @generated
	 */
	EAttribute getCartesianCoordinatesSetExtent_XDimension();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent#getYDimension <em>YDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YDimension</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent#getYDimension()
	 * @see #getCartesianCoordinatesSetExtent()
	 * @generated
	 */
	EAttribute getCartesianCoordinatesSetExtent_YDimension();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent#getZDimension <em>ZDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZDimension</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent#getZDimension()
	 * @see #getCartesianCoordinatesSetExtent()
	 * @generated
	 */
	EAttribute getCartesianCoordinatesSetExtent_ZDimension();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMap <em>Digital Elevation Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Elevation Map</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMap
	 * @generated
	 */
	EClass getDigitalElevationMap();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMap#getXDimension <em>XDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDimension</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMap#getXDimension()
	 * @see #getDigitalElevationMap()
	 * @generated
	 */
	EAttribute getDigitalElevationMap_XDimension();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMap#getYDimension <em>YDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YDimension</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMap#getYDimension()
	 * @see #getDigitalElevationMap()
	 * @generated
	 */
	EAttribute getDigitalElevationMap_YDimension();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesMesh <em>Cartesian Coordinates Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Coordinates Mesh</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesMesh
	 * @generated
	 */
	EClass getCartesianCoordinatesMesh();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh <em>Cartesian Triangular Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangular Mesh</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh
	 * @generated
	 */
	EClass getCartesianTriangularMesh();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinates <em>Spherical Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spherical Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinates
	 * @generated
	 */
	EClass getSphericalCoordinates();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinates#getPhi <em>Phi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phi</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinates#getPhi()
	 * @see #getSphericalCoordinates()
	 * @generated
	 */
	EAttribute getSphericalCoordinates_Phi();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinates#getTheta <em>Theta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theta</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinates#getTheta()
	 * @see #getSphericalCoordinates()
	 * @generated
	 */
	EAttribute getSphericalCoordinates_Theta();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinates#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinates#getR()
	 * @see #getSphericalCoordinates()
	 * @generated
	 */
	EAttribute getSphericalCoordinates_R();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinatesSet <em>Spherical Coordinates Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spherical Coordinates Set</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinatesSet
	 * @generated
	 */
	EClass getSphericalCoordinatesSet();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinatesMesh <em>Spherical Coordinates Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spherical Coordinates Mesh</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinatesMesh
	 * @generated
	 */
	EClass getSphericalCoordinatesMesh();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalTriangularMesh <em>Spherical Triangular Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spherical Triangular Mesh</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalTriangularMesh
	 * @generated
	 */
	EClass getSphericalTriangularMesh();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Pose <em>Pose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pose</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Pose
	 * @generated
	 */
	EClass getPose();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.SphereSamplingShape <em>Sphere Sampling Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sphere Sampling Shape</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.SphereSamplingShape
	 * @generated
	 */
	EClass getSphereSamplingShape();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.SphereSamplingShape#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.SphereSamplingShape#getRadius()
	 * @see #getSphereSamplingShape()
	 * @generated
	 */
	EAttribute getSphereSamplingShape_Radius();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.SphereSamplingShape#getCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Center</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.SphereSamplingShape#getCenter()
	 * @see #getSphereSamplingShape()
	 * @generated
	 */
	EReference getSphereSamplingShape_Center();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.SphereSamplingShape#isIncludeJustTouching <em>Include Just Touching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Just Touching</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.SphereSamplingShape#isIncludeJustTouching()
	 * @see #getSphereSamplingShape()
	 * @generated
	 */
	EAttribute getSphereSamplingShape_IncludeJustTouching();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CubeSamplingShape <em>Cube Sampling Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cube Sampling Shape</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CubeSamplingShape
	 * @generated
	 */
	EClass getCubeSamplingShape();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CubeSamplingShape#getCorner1 <em>Corner1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Corner1</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CubeSamplingShape#getCorner1()
	 * @see #getCubeSamplingShape()
	 * @generated
	 */
	EReference getCubeSamplingShape_Corner1();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CubeSamplingShape#getCorner2 <em>Corner2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Corner2</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CubeSamplingShape#getCorner2()
	 * @see #getCubeSamplingShape()
	 * @generated
	 */
	EReference getCubeSamplingShape_Corner2();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CubeSamplingShape#isIncludeJustTouching <em>Include Just Touching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Just Touching</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CubeSamplingShape#isIncludeJustTouching()
	 * @see #getCubeSamplingShape()
	 * @generated
	 */
	EAttribute getCubeSamplingShape_IncludeJustTouching();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetShapeSampler <em>Cartesian Coordinates Set Shape Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Coordinates Set Shape Sampler</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetShapeSampler
	 * @generated
	 */
	EClass getCartesianCoordinatesSetShapeSampler();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesMeshSampler <em>Cartesian Coordinates Mesh Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Coordinates Mesh Sampler</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesMeshSampler
	 * @generated
	 */
	EClass getCartesianCoordinatesMeshSampler();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesMeshPolygonSampler <em>Cartesian Coordinates Mesh Polygon Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Coordinates Mesh Polygon Sampler</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesMeshPolygonSampler
	 * @generated
	 */
	EClass getCartesianCoordinatesMeshPolygonSampler();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMeshSampler <em>Cartesian Triangular Mesh Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangular Mesh Sampler</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMeshSampler
	 * @generated
	 */
	EClass getCartesianTriangularMeshSampler();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMeshPolygonSampler <em>Cartesian Triangular Mesh Polygon Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangular Mesh Polygon Sampler</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMeshPolygonSampler
	 * @generated
	 */
	EClass getCartesianTriangularMeshPolygonSampler();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinatesMesher <em>Cartesian Position Coordinates Mesher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Position Coordinates Mesher</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinatesMesher
	 * @generated
	 */
	EClass getCartesianPositionCoordinatesMesher();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.NormalPointCloud <em>Normal Point Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Point Cloud</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.NormalPointCloud
	 * @generated
	 */
	EClass getNormalPointCloud();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.NormalPointCloud#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.NormalPointCloud#getPoints()
	 * @see #getNormalPointCloud()
	 * @generated
	 */
	EAttribute getNormalPointCloud_Points();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.NormalPointCloud#getNormals <em>Normals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normals</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.NormalPointCloud#getNormals()
	 * @see #getNormalPointCloud()
	 * @generated
	 */
	EAttribute getNormalPointCloud_Normals();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator <em>Point Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Locator</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator
	 * @generated
	 */
	EClass getPointLocator();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator#getPoints() <em>Get Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Points</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator#getPoints()
	 * @generated
	 */
	EOperation getPointLocator__GetPoints();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator#addPoint(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates) <em>Add Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Point</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator#addPoint(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated
	 */
	EOperation getPointLocator__AddPoint__CartesianPositionCoordinates();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator#addPoints(java.util.List) <em>Add Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Points</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator#addPoints(java.util.List)
	 * @generated
	 */
	EOperation getPointLocator__AddPoints__List();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator#removePoint(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates) <em>Remove Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Point</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator#removePoint(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated
	 */
	EOperation getPointLocator__RemovePoint__CartesianPositionCoordinates();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator#removePoints(java.util.List) <em>Remove Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Points</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator#removePoints(java.util.List)
	 * @generated
	 */
	EOperation getPointLocator__RemovePoints__List();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator#clearPoints() <em>Clear Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Points</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator#clearPoints()
	 * @generated
	 */
	EOperation getPointLocator__ClearPoints();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator#findClosestPoint(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates) <em>Find Closest Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Closest Point</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator#findClosestPoint(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated
	 */
	EOperation getPointLocator__FindClosestPoint__CartesianPositionCoordinates();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator#findClosestPoints(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, int) <em>Find Closest Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Closest Points</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator#findClosestPoints(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, int)
	 * @generated
	 */
	EOperation getPointLocator__FindClosestPoints__CartesianPositionCoordinates_int();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator#findPointsWithinRadius(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, double) <em>Find Points Within Radius</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Points Within Radius</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator#findPointsWithinRadius(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, double)
	 * @generated
	 */
	EOperation getPointLocator__FindPointsWithinRadius__CartesianPositionCoordinates_double();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.KDTreeBasedPointLocator <em>KD Tree Based Point Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KD Tree Based Point Locator</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.KDTreeBasedPointLocator
	 * @generated
	 */
	EClass getKDTreeBasedPointLocator();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.MeshLocalizer <em>Mesh Localizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mesh Localizer</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.MeshLocalizer
	 * @generated
	 */
	EClass getMeshLocalizer();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.MeshLocalizer#localize(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, javax.vecmath.Matrix4d, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, javax.vecmath.Matrix4d) <em>Localize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Localize</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.MeshLocalizer#localize(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, javax.vecmath.Matrix4d, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, javax.vecmath.Matrix4d)
	 * @generated
	 */
	EOperation getMeshLocalizer__Localize__CartesianTriangularMesh_Matrix4d_CartesianTriangularMesh_Matrix4d();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.DelaunayMesher <em>Delaunay Mesher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delaunay Mesher</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.DelaunayMesher
	 * @generated
	 */
	EClass getDelaunayMesher();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMapMesher <em>Digital Elevation Map Mesher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Elevation Map Mesher</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMapMesher
	 * @generated
	 */
	EClass getDigitalElevationMapMesher();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMapSampler <em>Digital Elevation Map Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Elevation Map Sampler</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMapSampler
	 * @generated
	 */
	EClass getDigitalElevationMapSampler();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMapSampler#getTargetResolution <em>Target Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Resolution</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMapSampler#getTargetResolution()
	 * @see #getDigitalElevationMapSampler()
	 * @generated
	 */
	EAttribute getDigitalElevationMapSampler_TargetResolution();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.TriangularMeshNormalsCalculator <em>Triangular Mesh Normals Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangular Mesh Normals Calculator</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.TriangularMeshNormalsCalculator
	 * @generated
	 */
	EClass getTriangularMeshNormalsCalculator();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.TriangularMeshToNormalPointCloud <em>Triangular Mesh To Normal Point Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangular Mesh To Normal Point Cloud</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.TriangularMeshToNormalPointCloud
	 * @generated
	 */
	EClass getTriangularMeshToNormalPointCloud();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.UniquePointsFilter <em>Unique Points Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Points Filter</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.UniquePointsFilter
	 * @generated
	 */
	EClass getUniquePointsFilter();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter <em>Triangle Edge Length Triangular Mesh Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangle Edge Length Triangular Mesh Filter</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter
	 * @generated
	 */
	EClass getTriangleEdgeLengthTriangularMeshFilter();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMinimumRange <em>Minimum Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Range</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMinimumRange()
	 * @see #getTriangleEdgeLengthTriangularMeshFilter()
	 * @generated
	 */
	EAttribute getTriangleEdgeLengthTriangularMeshFilter_MinimumRange();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMaximumRange <em>Maximum Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Range</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMaximumRange()
	 * @see #getTriangleEdgeLengthTriangularMeshFilter()
	 * @generated
	 */
	EAttribute getTriangleEdgeLengthTriangularMeshFilter_MaximumRange();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMaximumEdgeLength <em>Maximum Edge Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Edge Length</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#getMaximumEdgeLength()
	 * @see #getTriangleEdgeLengthTriangularMeshFilter()
	 * @generated
	 */
	EAttribute getTriangleEdgeLengthTriangularMeshFilter_MaximumEdgeLength();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#filter(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh) <em>Filter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Filter</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter#filter(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh)
	 * @generated
	 */
	EOperation getTriangleEdgeLengthTriangularMeshFilter__Filter__CartesianTriangularMesh();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.OutlierFilter <em>Outlier Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outlier Filter</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.OutlierFilter
	 * @generated
	 */
	EClass getOutlierFilter();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.OutlierFilter#getMaxDistance <em>Max Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Distance</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.OutlierFilter#getMaxDistance()
	 * @see #getOutlierFilter()
	 * @generated
	 */
	EAttribute getOutlierFilter_MaxDistance();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.MeshSmoother <em>Mesh Smoother</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mesh Smoother</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.MeshSmoother
	 * @generated
	 */
	EClass getMeshSmoother();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.MeshSmoother#getNumberOfIterations <em>Number Of Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Iterations</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.MeshSmoother#getNumberOfIterations()
	 * @see #getMeshSmoother()
	 * @generated
	 */
	EAttribute getMeshSmoother_NumberOfIterations();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler <em>Voxel Based3 DPoint Cloud Resampler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voxel Based3 DPoint Cloud Resampler</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler
	 * @generated
	 */
	EClass getVoxelBased3DPointCloudResampler();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler#getResolutionX <em>Resolution X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution X</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler#getResolutionX()
	 * @see #getVoxelBased3DPointCloudResampler()
	 * @generated
	 */
	EAttribute getVoxelBased3DPointCloudResampler_ResolutionX();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler#getResolutionY <em>Resolution Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution Y</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler#getResolutionY()
	 * @see #getVoxelBased3DPointCloudResampler()
	 * @generated
	 */
	EAttribute getVoxelBased3DPointCloudResampler_ResolutionY();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler#getResolutionZ <em>Resolution Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution Z</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler#getResolutionZ()
	 * @see #getVoxelBased3DPointCloudResampler()
	 * @generated
	 */
	EAttribute getVoxelBased3DPointCloudResampler_ResolutionZ();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler#getMinimumNumberOfPointPerVoxel <em>Minimum Number Of Point Per Voxel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Number Of Point Per Voxel</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler#getMinimumNumberOfPointPerVoxel()
	 * @see #getVoxelBased3DPointCloudResampler()
	 * @generated
	 */
	EAttribute getVoxelBased3DPointCloudResampler_MinimumNumberOfPointPerVoxel();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler#getTileResolution <em>Tile Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tile Resolution</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler#getTileResolution()
	 * @see #getVoxelBased3DPointCloudResampler()
	 * @generated
	 */
	EAttribute getVoxelBased3DPointCloudResampler_TileResolution();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.RigidBodyPoseTracker <em>Rigid Body Pose Tracker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rigid Body Pose Tracker</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.RigidBodyPoseTracker
	 * @generated
	 */
	EClass getRigidBodyPoseTracker();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.RigidBodyPoseTracker#getPositionMarkersAtOrigin <em>Position Markers At Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Position Markers At Origin</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.RigidBodyPoseTracker#getPositionMarkersAtOrigin()
	 * @see #getRigidBodyPoseTracker()
	 * @generated
	 */
	EReference getRigidBodyPoseTracker_PositionMarkersAtOrigin();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.RigidBodyPoseTracker#computeTransformation(org.eclipse.emf.common.util.EList) <em>Compute Transformation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Transformation</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.RigidBodyPoseTracker#computeTransformation(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getRigidBodyPoseTracker__ComputeTransformation__EList();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.RigidBodyPoseTracker#computeTransformation(java.util.List) <em>Compute Transformation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Transformation</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.RigidBodyPoseTracker#computeTransformation(java.util.List)
	 * @generated
	 */
	EOperation getRigidBodyPoseTracker__ComputeTransformation__List();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.RigidBodyPoseTracker#addPositionMarkers(java.util.List) <em>Add Position Markers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Position Markers</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.RigidBodyPoseTracker#addPositionMarkers(java.util.List)
	 * @generated
	 */
	EOperation getRigidBodyPoseTracker__AddPositionMarkers__List();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.RigidBodyPoseTracker#removePositionMarkers(java.util.List) <em>Remove Position Markers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Position Markers</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.RigidBodyPoseTracker#removePositionMarkers(java.util.List)
	 * @generated
	 */
	EOperation getRigidBodyPoseTracker__RemovePositionMarkers__List();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.PositionMarker <em>Position Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Marker</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.PositionMarker
	 * @generated
	 */
	EClass getPositionMarker();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.PositionMarker#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.PositionMarker#getIdentifier()
	 * @see #getPositionMarker()
	 * @generated
	 */
	EAttribute getPositionMarker_Identifier();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade
	 * @generated
	 */
	EClass getApogyCommonGeometryData3DFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianPositionCoordinates(double, double, double) <em>Create Cartesian Position Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Position Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianPositionCoordinates(double, double, double)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__CreateCartesianPositionCoordinates__double_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createColoredCartesianPositionCoordinates(double, double, double, short, short, short) <em>Create Colored Cartesian Position Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Colored Cartesian Position Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createColoredCartesianPositionCoordinates(double, double, double, short, short, short)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__CreateColoredCartesianPositionCoordinates__double_double_double_short_short_short();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createColoredCartesianPositionCoordinates(double, double, double, short, short, short, short) <em>Create Colored Cartesian Position Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Colored Cartesian Position Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createColoredCartesianPositionCoordinates(double, double, double, short, short, short, short)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__CreateColoredCartesianPositionCoordinates__double_double_double_short_short_short_short();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createRGBAColor(short, short, short, short) <em>Create RGBA Color</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create RGBA Color</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createRGBAColor(short, short, short, short)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__CreateRGBAColor__short_short_short_short();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianOrientationCoordinates(double, double, double) <em>Create Cartesian Orientation Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Orientation Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianOrientationCoordinates(double, double, double)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__CreateCartesianOrientationCoordinates__double_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createSphericalCoordinates(double, double, double) <em>Create Spherical Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Spherical Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createSphericalCoordinates(double, double, double)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__CreateSphericalCoordinates__double_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createPose(double, double, double, double, double, double) <em>Create Pose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Pose</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createPose(double, double, double, double, double, double)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__CreatePose__double_double_double_double_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createPose(ca.gc.asc_csa.apogy.common.geometry.data3d.Pose) <em>Create Pose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Pose</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createPose(ca.gc.asc_csa.apogy.common.geometry.data3d.Pose)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__CreatePose__Pose();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createPose(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates) <em>Create Pose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Pose</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createPose(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__CreatePose__CartesianPositionCoordinates_CartesianOrientationCoordinates();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createDigitalElevationMap(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet) <em>Create Digital Elevation Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Digital Elevation Map</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createDigitalElevationMap(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__CreateDigitalElevationMap__CartesianCoordinatesSet();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianPolygon(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates) <em>Create Cartesian Polygon</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Polygon</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianPolygon(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__CreateCartesianPolygon__CartesianPositionCoordinates_CartesianPositionCoordinates_CartesianPositionCoordinates();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianPositionCoordinates(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates) <em>Create Cartesian Position Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Position Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianPositionCoordinates(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__CreateCartesianPositionCoordinates__CartesianPositionCoordinates();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianOrientationCoordinates(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates) <em>Create Cartesian Orientation Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Orientation Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianOrientationCoordinates(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__CreateCartesianOrientationCoordinates__CartesianOrientationCoordinates();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianCoordinatesMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesMesh) <em>Create Cartesian Coordinates Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Coordinates Mesh</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianCoordinatesMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesMesh)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__CreateCartesianCoordinatesMesh__CartesianCoordinatesMesh();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianTriangle(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates) <em>Create Cartesian Triangle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Triangle</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianTriangle(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__CreateCartesianTriangle__CartesianPositionCoordinates_CartesianPositionCoordinates_CartesianPositionCoordinates();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianTriangle(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon) <em>Create Cartesian Triangle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Triangle</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianTriangle(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__CreateCartesianTriangle__CartesianPolygon();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianCoordinatesMesh(java.util.List) <em>Create Cartesian Coordinates Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Coordinates Mesh</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianCoordinatesMesh(java.util.List)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__CreateCartesianCoordinatesMesh__List();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianCoordinatesMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh) <em>Create Cartesian Coordinates Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Coordinates Mesh</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianCoordinatesMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__CreateCartesianCoordinatesMesh__CartesianTriangularMesh();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianTriangularMesh(java.util.List) <em>Create Cartesian Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Triangular Mesh</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianTriangularMesh(java.util.List)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__CreateCartesianTriangularMesh__List();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianTriangularMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh) <em>Create Cartesian Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Triangular Mesh</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianTriangularMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__CreateCartesianTriangularMesh__CartesianTriangularMesh();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#applyTransform(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, javax.vecmath.Matrix4d) <em>Apply Transform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Transform</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#applyTransform(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, javax.vecmath.Matrix4d)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__ApplyTransform__CartesianCoordinatesSet_Matrix4d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#applyTransform(java.util.List, javax.vecmath.Matrix4d) <em>Apply Transform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Transform</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#applyTransform(java.util.List, javax.vecmath.Matrix4d)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__ApplyTransform__List_Matrix4d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createTransformedMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, javax.vecmath.Matrix4d) <em>Create Transformed Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Transformed Mesh</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createTransformedMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, javax.vecmath.Matrix4d)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__CreateTransformedMesh__CartesianTriangularMesh_Matrix4d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#applyTransform(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, javax.vecmath.Matrix4d) <em>Apply Transform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Transform</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#applyTransform(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, javax.vecmath.Matrix4d)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__ApplyTransform__CartesianTriangularMesh_Matrix4d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#applyTransform(ca.gc.asc_csa.apogy.common.geometry.data3d.NormalPointCloud, javax.vecmath.Matrix4d) <em>Apply Transform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Transform</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#applyTransform(ca.gc.asc_csa.apogy.common.geometry.data3d.NormalPointCloud, javax.vecmath.Matrix4d)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__ApplyTransform__NormalPointCloud_Matrix4d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#updateCartesianCoordinatesSet(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, double[][]) <em>Update Cartesian Coordinates Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Cartesian Coordinates Set</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#updateCartesianCoordinatesSet(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, double[][])
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__UpdateCartesianCoordinatesSet__CartesianCoordinatesSet_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#concatenateTriangularMeshes(java.util.List) <em>Concatenate Triangular Meshes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Concatenate Triangular Meshes</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#concatenateTriangularMeshes(java.util.List)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData3DFacade__ConcatenateTriangularMeshes__List();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO <em>Data3 DIO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data3 DIO</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO
	 * @generated
	 */
	EClass getData3DIO();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMesh(java.lang.String) <em>Load Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Triangular Mesh</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMesh(java.lang.String)
	 * @generated
	 */
	EOperation getData3DIO__LoadTriangularMesh__String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMesh(java.io.InputStream) <em>Load Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Triangular Mesh</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMesh(java.io.InputStream)
	 * @generated
	 */
	EOperation getData3DIO__LoadTriangularMesh__InputStream();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveTriangularMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, java.lang.String) <em>Save Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Triangular Mesh</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveTriangularMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, java.lang.String)
	 * @generated
	 */
	EOperation getData3DIO__SaveTriangularMesh__CartesianTriangularMesh_String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveTriangularMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, java.io.OutputStream) <em>Save Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Triangular Mesh</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveTriangularMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, java.io.OutputStream)
	 * @generated
	 */
	EOperation getData3DIO__SaveTriangularMesh__CartesianTriangularMesh_OutputStream();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMeshFromASCIIAsNormalPointCloud(java.lang.String) <em>Load Triangular Mesh From ASCII As Normal Point Cloud</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Triangular Mesh From ASCII As Normal Point Cloud</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMeshFromASCIIAsNormalPointCloud(java.lang.String)
	 * @generated
	 */
	EOperation getData3DIO__LoadTriangularMeshFromASCIIAsNormalPointCloud__String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMeshFromASCII(java.lang.String) <em>Load Triangular Mesh From ASCII</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Triangular Mesh From ASCII</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMeshFromASCII(java.lang.String)
	 * @generated
	 */
	EOperation getData3DIO__LoadTriangularMeshFromASCII__String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveTriangularMeshAsASCII(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, java.lang.String) <em>Save Triangular Mesh As ASCII</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Triangular Mesh As ASCII</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveTriangularMeshAsASCII(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, java.lang.String)
	 * @generated
	 */
	EOperation getData3DIO__SaveTriangularMeshAsASCII__CartesianTriangularMesh_String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadXYZ(java.lang.String) <em>Load XYZ</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load XYZ</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadXYZ(java.lang.String)
	 * @generated
	 */
	EOperation getData3DIO__LoadXYZ__String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMeshFromTriXYZ(java.lang.String, java.lang.String) <em>Load Triangular Mesh From Tri XYZ</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Triangular Mesh From Tri XYZ</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMeshFromTriXYZ(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getData3DIO__LoadTriangularMeshFromTriXYZ__String_String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveCoordinatesSetToXYZ(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, java.lang.String) <em>Save Coordinates Set To XYZ</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Coordinates Set To XYZ</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveCoordinatesSetToXYZ(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, java.lang.String)
	 * @generated
	 */
	EOperation getData3DIO__SaveCoordinatesSetToXYZ__CartesianCoordinatesSet_String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveCoordinatesSetToXYZ(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, java.io.OutputStream) <em>Save Coordinates Set To XYZ</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Coordinates Set To XYZ</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveCoordinatesSetToXYZ(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, java.io.OutputStream)
	 * @generated
	 */
	EOperation getData3DIO__SaveCoordinatesSetToXYZ__CartesianCoordinatesSet_OutputStream();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveCoordinatesSetToCSV(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, java.lang.String) <em>Save Coordinates Set To CSV</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Coordinates Set To CSV</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveCoordinatesSetToCSV(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, java.lang.String)
	 * @generated
	 */
	EOperation getData3DIO__SaveCoordinatesSetToCSV__CartesianCoordinatesSet_String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveCoordinatesSetToCSV(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, java.io.OutputStream) <em>Save Coordinates Set To CSV</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Coordinates Set To CSV</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveCoordinatesSetToCSV(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, java.io.OutputStream)
	 * @generated
	 */
	EOperation getData3DIO__SaveCoordinatesSetToCSV__CartesianCoordinatesSet_OutputStream();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DUtils <em>Data3 DUtils</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data3 DUtils</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DUtils
	 * @generated
	 */
	EClass getData3DUtils();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DUtils#computeNormals(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh) <em>Compute Normals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Normals</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DUtils#computeNormals(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh)
	 * @generated
	 */
	EOperation getData3DUtils__ComputeNormals__CartesianTriangularMesh();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DUtils#computeNormalAtVertex(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates) <em>Compute Normal At Vertex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Normal At Vertex</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DUtils#computeNormalAtVertex(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated
	 */
	EOperation getData3DUtils__ComputeNormalAtVertex__CartesianTriangularMesh_CartesianPositionCoordinates();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DUtils#computeCentroid(java.util.List) <em>Compute Centroid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Centroid</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DUtils#computeCentroid(java.util.List)
	 * @generated
	 */
	EOperation getData3DUtils__ComputeCentroid__List();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DUtils#computeCentroid(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet) <em>Compute Centroid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Centroid</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DUtils#computeCentroid(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet)
	 * @generated
	 */
	EOperation getData3DUtils__ComputeCentroid__CartesianCoordinatesSet();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DUtils#computeMinMaxValues(javax.vecmath.Point3d, javax.vecmath.Point3d, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet) <em>Compute Min Max Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Min Max Values</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DUtils#computeMinMaxValues(javax.vecmath.Point3d, javax.vecmath.Point3d, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet)
	 * @generated
	 */
	EOperation getData3DUtils__ComputeMinMaxValues__Point3d_Point3d_CartesianCoordinatesSet();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DUtils#computeCurvatureChange(ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator, int, double) <em>Compute Curvature Change</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Curvature Change</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DUtils#computeCurvatureChange(ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator, int, double)
	 * @generated
	 */
	EOperation getData3DUtils__ComputeCurvatureChange__PointLocator_int_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DUtils#extrude(java.util.List, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianAxis, double, boolean) <em>Extrude</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extrude</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DUtils#extrude(java.util.List, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianAxis, double, boolean)
	 * @generated
	 */
	EOperation getData3DUtils__Extrude__List_CartesianAxis_double_boolean();

	/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianAxis <em>Cartesian Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cartesian Axis</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianAxis
	 * @generated
	 */
	EEnum getCartesianAxis();

	/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPlane <em>Cartesian Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cartesian Plane</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPlane
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
	ApogyCommonGeometryData3DFactory getApogyCommonGeometryData3DFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianPolygonImpl <em>Cartesian Polygon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianPolygonImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianPolygon()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangleImpl <em>Cartesian Triangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangleImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianTriangle()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGLE = eINSTANCE.getCartesianTriangle();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalPolygonImpl <em>Spherical Polygon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalPolygonImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getSphericalPolygon()
		 * @generated
		 */
		EClass SPHERICAL_POLYGON = eINSTANCE.getSphericalPolygon();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalTriangleImpl <em>Spherical Triangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalTriangleImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getSphericalTriangle()
		 * @generated
		 */
		EClass SPHERICAL_TRIANGLE = eINSTANCE.getSphericalTriangle();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianPositionCoordinatesImpl <em>Cartesian Position Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianPositionCoordinatesImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianPositionCoordinates()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.RGBAColorImpl <em>RGBA Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.RGBAColorImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getRGBAColor()
		 * @generated
		 */
		EClass RGBA_COLOR = eINSTANCE.getRGBAColor();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGBA_COLOR__ALPHA = eINSTANCE.getRGBAColor_Alpha();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGBA_COLOR__RED = eINSTANCE.getRGBAColor_Red();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGBA_COLOR__GREEN = eINSTANCE.getRGBAColor_Green();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGBA_COLOR__BLUE = eINSTANCE.getRGBAColor_Blue();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ColoredCartesianPositionCoordinatesImpl <em>Colored Cartesian Position Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ColoredCartesianPositionCoordinatesImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getColoredCartesianPositionCoordinates()
		 * @generated
		 */
		EClass COLORED_CARTESIAN_POSITION_COORDINATES = eINSTANCE.getColoredCartesianPositionCoordinates();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ColoredCartesianTriangularMeshImpl <em>Colored Cartesian Triangular Mesh</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ColoredCartesianTriangularMeshImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getColoredCartesianTriangularMesh()
		 * @generated
		 */
		EClass COLORED_CARTESIAN_TRIANGULAR_MESH = eINSTANCE.getColoredCartesianTriangularMesh();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangularMeshColorizerImpl <em>Cartesian Triangular Mesh Colorizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangularMeshColorizerImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianTriangularMeshColorizer()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGULAR_MESH_COLORIZER = eINSTANCE.getCartesianTriangularMeshColorizer();

		/**
		 * The meta object literal for the '<em><b>Compute Color</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARTESIAN_TRIANGULAR_MESH_COLORIZER___COMPUTE_COLOR__CARTESIANTRIANGULARMESH_CARTESIANPOSITIONCOORDINATES = eINSTANCE.getCartesianTriangularMeshColorizer__ComputeColor__CartesianTriangularMesh_CartesianPositionCoordinates();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangularMeshColorizerBySlopeImpl <em>Cartesian Triangular Mesh Colorizer By Slope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangularMeshColorizerBySlopeImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianTriangularMeshColorizerBySlope()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGULAR_MESH_COLORIZER_BY_SLOPE = eINSTANCE.getCartesianTriangularMeshColorizerBySlope();

		/**
		 * The meta object literal for the '<em><b>Normal Axis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_TRIANGULAR_MESH_COLORIZER_BY_SLOPE__NORMAL_AXIS = eINSTANCE.getCartesianTriangularMeshColorizerBySlope_NormalAxis();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianOrientationCoordinatesImpl <em>Cartesian Orientation Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianOrientationCoordinatesImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianOrientationCoordinates()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.AbstractCartesianCoordinatesSetImpl <em>Abstract Cartesian Coordinates Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.AbstractCartesianCoordinatesSetImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getAbstractCartesianCoordinatesSet()
		 * @generated
		 */
		EClass ABSTRACT_CARTESIAN_COORDINATES_SET = eINSTANCE.getAbstractCartesianCoordinatesSet();

		/**
		 * The meta object literal for the '<em><b>Get Extent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CARTESIAN_COORDINATES_SET___GET_EXTENT = eINSTANCE.getAbstractCartesianCoordinatesSet__GetExtent();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesSetImpl <em>Cartesian Coordinates Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesSetImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianCoordinatesSet()
		 * @generated
		 */
		EClass CARTESIAN_COORDINATES_SET = eINSTANCE.getCartesianCoordinatesSet();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ColoredCartesianCoordinatesSetImpl <em>Colored Cartesian Coordinates Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ColoredCartesianCoordinatesSetImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getColoredCartesianCoordinatesSet()
		 * @generated
		 */
		EClass COLORED_CARTESIAN_COORDINATES_SET = eINSTANCE.getColoredCartesianCoordinatesSet();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesSetExtentImpl <em>Cartesian Coordinates Set Extent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesSetExtentImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianCoordinatesSetExtent()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.DigitalElevationMapImpl <em>Digital Elevation Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.DigitalElevationMapImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getDigitalElevationMap()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesMeshImpl <em>Cartesian Coordinates Mesh</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesMeshImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianCoordinatesMesh()
		 * @generated
		 */
		EClass CARTESIAN_COORDINATES_MESH = eINSTANCE.getCartesianCoordinatesMesh();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangularMeshImpl <em>Cartesian Triangular Mesh</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangularMeshImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianTriangularMesh()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGULAR_MESH = eINSTANCE.getCartesianTriangularMesh();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalCoordinatesImpl <em>Spherical Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalCoordinatesImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getSphericalCoordinates()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalCoordinatesSetImpl <em>Spherical Coordinates Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalCoordinatesSetImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getSphericalCoordinatesSet()
		 * @generated
		 */
		EClass SPHERICAL_COORDINATES_SET = eINSTANCE.getSphericalCoordinatesSet();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalCoordinatesMeshImpl <em>Spherical Coordinates Mesh</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalCoordinatesMeshImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getSphericalCoordinatesMesh()
		 * @generated
		 */
		EClass SPHERICAL_COORDINATES_MESH = eINSTANCE.getSphericalCoordinatesMesh();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalTriangularMeshImpl <em>Spherical Triangular Mesh</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphericalTriangularMeshImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getSphericalTriangularMesh()
		 * @generated
		 */
		EClass SPHERICAL_TRIANGULAR_MESH = eINSTANCE.getSphericalTriangularMesh();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.PoseImpl <em>Pose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.PoseImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getPose()
		 * @generated
		 */
		EClass POSE = eINSTANCE.getPose();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphereSamplingShapeImpl <em>Sphere Sampling Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.SphereSamplingShapeImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getSphereSamplingShape()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CubeSamplingShapeImpl <em>Cube Sampling Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CubeSamplingShapeImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCubeSamplingShape()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesSetShapeSamplerImpl <em>Cartesian Coordinates Set Shape Sampler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesSetShapeSamplerImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianCoordinatesSetShapeSampler()
		 * @generated
		 */
		EClass CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER = eINSTANCE.getCartesianCoordinatesSetShapeSampler();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesMeshSamplerImpl <em>Cartesian Coordinates Mesh Sampler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesMeshSamplerImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianCoordinatesMeshSampler()
		 * @generated
		 */
		EClass CARTESIAN_COORDINATES_MESH_SAMPLER = eINSTANCE.getCartesianCoordinatesMeshSampler();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesMeshPolygonSamplerImpl <em>Cartesian Coordinates Mesh Polygon Sampler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianCoordinatesMeshPolygonSamplerImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianCoordinatesMeshPolygonSampler()
		 * @generated
		 */
		EClass CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER = eINSTANCE.getCartesianCoordinatesMeshPolygonSampler();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangularMeshSamplerImpl <em>Cartesian Triangular Mesh Sampler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangularMeshSamplerImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianTriangularMeshSampler()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGULAR_MESH_SAMPLER = eINSTANCE.getCartesianTriangularMeshSampler();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangularMeshPolygonSamplerImpl <em>Cartesian Triangular Mesh Polygon Sampler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianTriangularMeshPolygonSamplerImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianTriangularMeshPolygonSampler()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER = eINSTANCE.getCartesianTriangularMeshPolygonSampler();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianPositionCoordinatesMesherImpl <em>Cartesian Position Coordinates Mesher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianPositionCoordinatesMesherImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianPositionCoordinatesMesher()
		 * @generated
		 */
		EClass CARTESIAN_POSITION_COORDINATES_MESHER = eINSTANCE.getCartesianPositionCoordinatesMesher();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.NormalPointCloudImpl <em>Normal Point Cloud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.NormalPointCloudImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getNormalPointCloud()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.PointLocatorImpl <em>Point Locator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.PointLocatorImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getPointLocator()
		 * @generated
		 */
		EClass POINT_LOCATOR = eINSTANCE.getPointLocator();

		/**
		 * The meta object literal for the '<em><b>Get Points</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POINT_LOCATOR___GET_POINTS = eINSTANCE.getPointLocator__GetPoints();

		/**
		 * The meta object literal for the '<em><b>Add Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POINT_LOCATOR___ADD_POINT__CARTESIANPOSITIONCOORDINATES = eINSTANCE.getPointLocator__AddPoint__CartesianPositionCoordinates();

		/**
		 * The meta object literal for the '<em><b>Add Points</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POINT_LOCATOR___ADD_POINTS__LIST = eINSTANCE.getPointLocator__AddPoints__List();

		/**
		 * The meta object literal for the '<em><b>Remove Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POINT_LOCATOR___REMOVE_POINT__CARTESIANPOSITIONCOORDINATES = eINSTANCE.getPointLocator__RemovePoint__CartesianPositionCoordinates();

		/**
		 * The meta object literal for the '<em><b>Remove Points</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POINT_LOCATOR___REMOVE_POINTS__LIST = eINSTANCE.getPointLocator__RemovePoints__List();

		/**
		 * The meta object literal for the '<em><b>Clear Points</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POINT_LOCATOR___CLEAR_POINTS = eINSTANCE.getPointLocator__ClearPoints();

		/**
		 * The meta object literal for the '<em><b>Find Closest Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POINT_LOCATOR___FIND_CLOSEST_POINT__CARTESIANPOSITIONCOORDINATES = eINSTANCE.getPointLocator__FindClosestPoint__CartesianPositionCoordinates();

		/**
		 * The meta object literal for the '<em><b>Find Closest Points</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POINT_LOCATOR___FIND_CLOSEST_POINTS__CARTESIANPOSITIONCOORDINATES_INT = eINSTANCE.getPointLocator__FindClosestPoints__CartesianPositionCoordinates_int();

		/**
		 * The meta object literal for the '<em><b>Find Points Within Radius</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POINT_LOCATOR___FIND_POINTS_WITHIN_RADIUS__CARTESIANPOSITIONCOORDINATES_DOUBLE = eINSTANCE.getPointLocator__FindPointsWithinRadius__CartesianPositionCoordinates_double();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.KDTreeBasedPointLocatorImpl <em>KD Tree Based Point Locator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.KDTreeBasedPointLocatorImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getKDTreeBasedPointLocator()
		 * @generated
		 */
		EClass KD_TREE_BASED_POINT_LOCATOR = eINSTANCE.getKDTreeBasedPointLocator();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.MeshLocalizerImpl <em>Mesh Localizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.MeshLocalizerImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getMeshLocalizer()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.DelaunayMesherImpl <em>Delaunay Mesher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.DelaunayMesherImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getDelaunayMesher()
		 * @generated
		 */
		EClass DELAUNAY_MESHER = eINSTANCE.getDelaunayMesher();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.DigitalElevationMapMesherImpl <em>Digital Elevation Map Mesher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.DigitalElevationMapMesherImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getDigitalElevationMapMesher()
		 * @generated
		 */
		EClass DIGITAL_ELEVATION_MAP_MESHER = eINSTANCE.getDigitalElevationMapMesher();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.DigitalElevationMapSamplerImpl <em>Digital Elevation Map Sampler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.DigitalElevationMapSamplerImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getDigitalElevationMapSampler()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.TriangularMeshNormalsCalculatorImpl <em>Triangular Mesh Normals Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.TriangularMeshNormalsCalculatorImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getTriangularMeshNormalsCalculator()
		 * @generated
		 */
		EClass TRIANGULAR_MESH_NORMALS_CALCULATOR = eINSTANCE.getTriangularMeshNormalsCalculator();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.TriangularMeshToNormalPointCloudImpl <em>Triangular Mesh To Normal Point Cloud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.TriangularMeshToNormalPointCloudImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getTriangularMeshToNormalPointCloud()
		 * @generated
		 */
		EClass TRIANGULAR_MESH_TO_NORMAL_POINT_CLOUD = eINSTANCE.getTriangularMeshToNormalPointCloud();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.UniquePointsFilterImpl <em>Unique Points Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.UniquePointsFilterImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getUniquePointsFilter()
		 * @generated
		 */
		EClass UNIQUE_POINTS_FILTER = eINSTANCE.getUniquePointsFilter();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.TriangleEdgeLengthTriangularMeshFilterImpl <em>Triangle Edge Length Triangular Mesh Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.TriangleEdgeLengthTriangularMeshFilterImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getTriangleEdgeLengthTriangularMeshFilter()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.OutlierFilterImpl <em>Outlier Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.OutlierFilterImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getOutlierFilter()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.MeshSmootherImpl <em>Mesh Smoother</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.MeshSmootherImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getMeshSmoother()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.VoxelBased3DPointCloudResamplerImpl <em>Voxel Based3 DPoint Cloud Resampler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.VoxelBased3DPointCloudResamplerImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getVoxelBased3DPointCloudResampler()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.RigidBodyPoseTrackerImpl <em>Rigid Body Pose Tracker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.RigidBodyPoseTrackerImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getRigidBodyPoseTracker()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.PositionMarkerImpl <em>Position Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.PositionMarkerImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getPositionMarker()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DFacadeImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getApogyCommonGeometryData3DFacade()
		 * @generated
		 */
		EClass APOGY_COMMON_GEOMETRY_DATA3_DFACADE = eINSTANCE.getApogyCommonGeometryData3DFacade();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Position Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_POSITION_COORDINATES__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getApogyCommonGeometryData3DFacade__CreateCartesianPositionCoordinates__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Colored Cartesian Position Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_COLORED_CARTESIAN_POSITION_COORDINATES__DOUBLE_DOUBLE_DOUBLE_SHORT_SHORT_SHORT = eINSTANCE.getApogyCommonGeometryData3DFacade__CreateColoredCartesianPositionCoordinates__double_double_double_short_short_short();

		/**
		 * The meta object literal for the '<em><b>Create Colored Cartesian Position Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_COLORED_CARTESIAN_POSITION_COORDINATES__DOUBLE_DOUBLE_DOUBLE_SHORT_SHORT_SHORT_SHORT = eINSTANCE.getApogyCommonGeometryData3DFacade__CreateColoredCartesianPositionCoordinates__double_double_double_short_short_short_short();

		/**
		 * The meta object literal for the '<em><b>Create RGBA Color</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_RGBA_COLOR__SHORT_SHORT_SHORT_SHORT = eINSTANCE.getApogyCommonGeometryData3DFacade__CreateRGBAColor__short_short_short_short();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Orientation Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_ORIENTATION_COORDINATES__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getApogyCommonGeometryData3DFacade__CreateCartesianOrientationCoordinates__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Spherical Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_SPHERICAL_COORDINATES__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getApogyCommonGeometryData3DFacade__CreateSphericalCoordinates__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Pose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_POSE__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getApogyCommonGeometryData3DFacade__CreatePose__double_double_double_double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Pose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_POSE__POSE = eINSTANCE.getApogyCommonGeometryData3DFacade__CreatePose__Pose();

		/**
		 * The meta object literal for the '<em><b>Create Pose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_POSE__CARTESIANPOSITIONCOORDINATES_CARTESIANORIENTATIONCOORDINATES = eINSTANCE.getApogyCommonGeometryData3DFacade__CreatePose__CartesianPositionCoordinates_CartesianOrientationCoordinates();

		/**
		 * The meta object literal for the '<em><b>Create Digital Elevation Map</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_DIGITAL_ELEVATION_MAP__CARTESIANCOORDINATESSET = eINSTANCE.getApogyCommonGeometryData3DFacade__CreateDigitalElevationMap__CartesianCoordinatesSet();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Polygon</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_POLYGON__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES = eINSTANCE.getApogyCommonGeometryData3DFacade__CreateCartesianPolygon__CartesianPositionCoordinates_CartesianPositionCoordinates_CartesianPositionCoordinates();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Position Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_POSITION_COORDINATES__CARTESIANPOSITIONCOORDINATES = eINSTANCE.getApogyCommonGeometryData3DFacade__CreateCartesianPositionCoordinates__CartesianPositionCoordinates();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Orientation Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_ORIENTATION_COORDINATES__CARTESIANORIENTATIONCOORDINATES = eINSTANCE.getApogyCommonGeometryData3DFacade__CreateCartesianOrientationCoordinates__CartesianOrientationCoordinates();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Coordinates Mesh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_COORDINATES_MESH__CARTESIANCOORDINATESMESH = eINSTANCE.getApogyCommonGeometryData3DFacade__CreateCartesianCoordinatesMesh__CartesianCoordinatesMesh();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Triangle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_TRIANGLE__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES = eINSTANCE.getApogyCommonGeometryData3DFacade__CreateCartesianTriangle__CartesianPositionCoordinates_CartesianPositionCoordinates_CartesianPositionCoordinates();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Triangle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_TRIANGLE__CARTESIANPOLYGON = eINSTANCE.getApogyCommonGeometryData3DFacade__CreateCartesianTriangle__CartesianPolygon();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Coordinates Mesh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_COORDINATES_MESH__LIST = eINSTANCE.getApogyCommonGeometryData3DFacade__CreateCartesianCoordinatesMesh__List();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Coordinates Mesh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_COORDINATES_MESH__CARTESIANTRIANGULARMESH = eINSTANCE.getApogyCommonGeometryData3DFacade__CreateCartesianCoordinatesMesh__CartesianTriangularMesh();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Triangular Mesh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_TRIANGULAR_MESH__LIST = eINSTANCE.getApogyCommonGeometryData3DFacade__CreateCartesianTriangularMesh__List();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Triangular Mesh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_TRIANGULAR_MESH__CARTESIANTRIANGULARMESH = eINSTANCE.getApogyCommonGeometryData3DFacade__CreateCartesianTriangularMesh__CartesianTriangularMesh();

		/**
		 * The meta object literal for the '<em><b>Apply Transform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___APPLY_TRANSFORM__CARTESIANCOORDINATESSET_MATRIX4D = eINSTANCE.getApogyCommonGeometryData3DFacade__ApplyTransform__CartesianCoordinatesSet_Matrix4d();

		/**
		 * The meta object literal for the '<em><b>Apply Transform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___APPLY_TRANSFORM__LIST_MATRIX4D = eINSTANCE.getApogyCommonGeometryData3DFacade__ApplyTransform__List_Matrix4d();

		/**
		 * The meta object literal for the '<em><b>Create Transformed Mesh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_TRANSFORMED_MESH__CARTESIANTRIANGULARMESH_MATRIX4D = eINSTANCE.getApogyCommonGeometryData3DFacade__CreateTransformedMesh__CartesianTriangularMesh_Matrix4d();

		/**
		 * The meta object literal for the '<em><b>Apply Transform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___APPLY_TRANSFORM__CARTESIANTRIANGULARMESH_MATRIX4D = eINSTANCE.getApogyCommonGeometryData3DFacade__ApplyTransform__CartesianTriangularMesh_Matrix4d();

		/**
		 * The meta object literal for the '<em><b>Apply Transform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___APPLY_TRANSFORM__NORMALPOINTCLOUD_MATRIX4D = eINSTANCE.getApogyCommonGeometryData3DFacade__ApplyTransform__NormalPointCloud_Matrix4d();

		/**
		 * The meta object literal for the '<em><b>Update Cartesian Coordinates Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___UPDATE_CARTESIAN_COORDINATES_SET__CARTESIANCOORDINATESSET_DOUBLE = eINSTANCE.getApogyCommonGeometryData3DFacade__UpdateCartesianCoordinatesSet__CartesianCoordinatesSet_double();

		/**
		 * The meta object literal for the '<em><b>Concatenate Triangular Meshes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CONCATENATE_TRIANGULAR_MESHES__LIST = eINSTANCE.getApogyCommonGeometryData3DFacade__ConcatenateTriangularMeshes__List();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.Data3DIOImpl <em>Data3 DIO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.Data3DIOImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getData3DIO()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.Data3DUtilsImpl <em>Data3 DUtils</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.Data3DUtilsImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getData3DUtils()
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
		 * The meta object literal for the '<em><b>Compute Normal At Vertex</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3_DUTILS___COMPUTE_NORMAL_AT_VERTEX__CARTESIANTRIANGULARMESH_CARTESIANPOSITIONCOORDINATES = eINSTANCE.getData3DUtils__ComputeNormalAtVertex__CartesianTriangularMesh_CartesianPositionCoordinates();

		/**
		 * The meta object literal for the '<em><b>Compute Centroid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3_DUTILS___COMPUTE_CENTROID__LIST = eINSTANCE.getData3DUtils__ComputeCentroid__List();

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
		 * The meta object literal for the '<em><b>Extrude</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA3_DUTILS___EXTRUDE__LIST_CARTESIANAXIS_DOUBLE_BOOLEAN = eINSTANCE.getData3DUtils__Extrude__List_CartesianAxis_double_boolean();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianAxis <em>Cartesian Axis</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianAxis
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianAxis()
		 * @generated
		 */
		EEnum CARTESIAN_AXIS = eINSTANCE.getCartesianAxis();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPlane <em>Cartesian Plane</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPlane
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCartesianPlane()
		 * @generated
		 */
		EEnum CARTESIAN_PLANE = eINSTANCE.getCartesianPlane();

		/**
		 * The meta object literal for the '<em>Vector2d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Vector2d
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getVector2d()
		 * @generated
		 */
		EDataType VECTOR2D = eINSTANCE.getVector2d();

		/**
		 * The meta object literal for the '<em>Vector3d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Vector3d
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getVector3d()
		 * @generated
		 */
		EDataType VECTOR3D = eINSTANCE.getVector3d();

		/**
		 * The meta object literal for the '<em>Point3d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Point3d
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getPoint3d()
		 * @generated
		 */
		EDataType POINT3D = eINSTANCE.getPoint3d();

		/**
		 * The meta object literal for the '<em>Matrix4d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Matrix4d
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getMatrix4d()
		 * @generated
		 */
		EDataType MATRIX4D = eINSTANCE.getMatrix4d();

		/**
		 * The meta object literal for the '<em>GVector</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.GVector
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getGVector()
		 * @generated
		 */
		EDataType GVECTOR = eINSTANCE.getGVector();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getMap()
		 * @generated
		 */
		EDataType MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em>Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Set
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getSet()
		 * @generated
		 */
		EDataType SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '<em>Sorted Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.SortedSet
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getSortedSet()
		 * @generated
		 */
		EDataType SORTED_SET = eINSTANCE.getSortedSet();

		/**
		 * The meta object literal for the '<em>Collection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getCollection()
		 * @generated
		 */
		EDataType COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em>EList</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.EList
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getEList()
		 * @generated
		 */
		EDataType ELIST = eINSTANCE.getEList();

		/**
		 * The meta object literal for the '<em>IProgress Monitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IProgressMonitor
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getIProgressMonitor()
		 * @generated
		 */
		EDataType IPROGRESS_MONITOR = eINSTANCE.getIProgressMonitor();

		/**
		 * The meta object literal for the '<em>Output Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.OutputStream
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getOutputStream()
		 * @generated
		 */
		EDataType OUTPUT_STREAM = eINSTANCE.getOutputStream();

		/**
		 * The meta object literal for the '<em>Input Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.InputStream
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getInputStream()
		 * @generated
		 */
		EDataType INPUT_STREAM = eINSTANCE.getInputStream();

		/**
		 * The meta object literal for the '<em>IO Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.IOException
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getIOException()
		 * @generated
		 */
		EDataType IO_EXCEPTION = eINSTANCE.getIOException();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em>Illegal Argument Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.IllegalArgumentException
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getIllegalArgumentException()
		 * @generated
		 */
		EDataType ILLEGAL_ARGUMENT_EXCEPTION = eINSTANCE.getIllegalArgumentException();

		/**
		 * The meta object literal for the '<em>Double Array Of Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getDoubleArrayOfArray()
		 * @generated
		 */
		EDataType DOUBLE_ARRAY_OF_ARRAY = eINSTANCE.getDoubleArrayOfArray();

		/**
		 * The meta object literal for the '<em>Int Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.impl.ApogyCommonGeometryData3DPackageImpl#getIntArray()
		 * @generated
		 */
		EDataType INT_ARRAY = eINSTANCE.getIntArray();

	}

} //ApogyCommonGeometryData3DPackage
