package ca.gc.asc_csa.apogy.common.geometry.data3d.ui;
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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;

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
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCommonGeometryData3DUI' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyCommonGeometryData3DUI' complianceLevel='6.0' modelDirectory='/ca.gc.asc_csa.apogy.common.geometry.data3d.ui/src-generated' editDirectory='/ca.gc.asc_csa.apogy.common.geometry.data3d.ui.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.common.geometry.data3d'"
 * @generated
 */
public interface ApogyCommonGeometryData3DUIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.common.geometry.data3d.ui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonGeometryData3DUIPackage eINSTANCE = ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.ApogyCommonGeometryData3DUIPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.CartesianCoordinatesSetPresentationImpl <em>Cartesian Coordinates Set Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.CartesianCoordinatesSetPresentationImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.ApogyCommonGeometryData3DUIPackageImpl#getCartesianCoordinatesSetPresentation()
	 * @generated
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__TOPOLOGY_PRESENTATION_SET = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__NODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__COLOR = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__VISIBLE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__SHADOW_MODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__USE_IN_BOUNDING_CALCULATION = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__CENTROID = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__MIN = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__MAX = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__XRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__YRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__ZRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__SCENE_OBJECT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Point Cloud</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_CLOUD = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Point Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_SIZE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Of Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__NUMBER_OF_POINTS = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cartesian Coordinates Set Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION_FEATURE_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Cartesian Coordinates Set Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION_OPERATION_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.ColoredCartesianCoordinatesSetPresentationImpl <em>Colored Cartesian Coordinates Set Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.ColoredCartesianCoordinatesSetPresentationImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.ApogyCommonGeometryData3DUIPackageImpl#getColoredCartesianCoordinatesSetPresentation()
	 * @generated
	 */
	int COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION = 1;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__TOPOLOGY_PRESENTATION_SET = CARTESIAN_COORDINATES_SET_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__NODE = CARTESIAN_COORDINATES_SET_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__COLOR = CARTESIAN_COORDINATES_SET_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__VISIBLE = CARTESIAN_COORDINATES_SET_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__SHADOW_MODE = CARTESIAN_COORDINATES_SET_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__USE_IN_BOUNDING_CALCULATION = CARTESIAN_COORDINATES_SET_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__CENTROID = CARTESIAN_COORDINATES_SET_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__MIN = CARTESIAN_COORDINATES_SET_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__MAX = CARTESIAN_COORDINATES_SET_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__XRANGE = CARTESIAN_COORDINATES_SET_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__YRANGE = CARTESIAN_COORDINATES_SET_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__ZRANGE = CARTESIAN_COORDINATES_SET_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__SCENE_OBJECT = CARTESIAN_COORDINATES_SET_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Point Cloud</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_CLOUD = CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_CLOUD;

	/**
	 * The feature id for the '<em><b>Point Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_SIZE = CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_SIZE;

	/**
	 * The feature id for the '<em><b>Number Of Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__NUMBER_OF_POINTS = CARTESIAN_COORDINATES_SET_PRESENTATION__NUMBER_OF_POINTS;

	/**
	 * The feature id for the '<em><b>Override Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__OVERRIDE_COLOR = CARTESIAN_COORDINATES_SET_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Colored Point Cloud</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__COLORED_POINT_CLOUD = CARTESIAN_COORDINATES_SET_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Colored Cartesian Coordinates Set Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION_FEATURE_COUNT = CARTESIAN_COORDINATES_SET_PRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Colored Cartesian Coordinates Set Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION_OPERATION_COUNT = CARTESIAN_COORDINATES_SET_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.CartesianTriangularMeshPresentationImpl <em>Cartesian Triangular Mesh Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.CartesianTriangularMeshPresentationImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.ApogyCommonGeometryData3DUIPackageImpl#getCartesianTriangularMeshPresentation()
	 * @generated
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION = 2;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION__TOPOLOGY_PRESENTATION_SET = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION__NODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION__COLOR = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION__VISIBLE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION__SHADOW_MODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION__USE_IN_BOUNDING_CALCULATION = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION__CENTROID = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION__MIN = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION__MAX = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION__XRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION__YRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION__ZRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION__SCENE_OBJECT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION__MESH = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Point Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION__POINT_SIZE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Of Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POINTS = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Number Of Polygons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POLYGONS = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Presentation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION__PRESENTATION_MODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION__TRANSPARENCY = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Use Shading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION__USE_SHADING = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Texture Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION__TEXTURE_IMAGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Cartesian Triangular Mesh Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION_FEATURE_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Cartesian Triangular Mesh Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_PRESENTATION_OPERATION_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.ColoredTriangularMeshPresentationImpl <em>Colored Triangular Mesh Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.ColoredTriangularMeshPresentationImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.ApogyCommonGeometryData3DUIPackageImpl#getColoredTriangularMeshPresentation()
	 * @generated
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION = 3;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION__TOPOLOGY_PRESENTATION_SET = CARTESIAN_TRIANGULAR_MESH_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION__NODE = CARTESIAN_TRIANGULAR_MESH_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION__COLOR = CARTESIAN_TRIANGULAR_MESH_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION__VISIBLE = CARTESIAN_TRIANGULAR_MESH_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION__SHADOW_MODE = CARTESIAN_TRIANGULAR_MESH_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION__USE_IN_BOUNDING_CALCULATION = CARTESIAN_TRIANGULAR_MESH_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION__CENTROID = CARTESIAN_TRIANGULAR_MESH_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION__MIN = CARTESIAN_TRIANGULAR_MESH_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION__MAX = CARTESIAN_TRIANGULAR_MESH_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION__XRANGE = CARTESIAN_TRIANGULAR_MESH_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION__YRANGE = CARTESIAN_TRIANGULAR_MESH_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION__ZRANGE = CARTESIAN_TRIANGULAR_MESH_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION__SCENE_OBJECT = CARTESIAN_TRIANGULAR_MESH_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION__MESH = CARTESIAN_TRIANGULAR_MESH_PRESENTATION__MESH;

	/**
	 * The feature id for the '<em><b>Point Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION__POINT_SIZE = CARTESIAN_TRIANGULAR_MESH_PRESENTATION__POINT_SIZE;

	/**
	 * The feature id for the '<em><b>Number Of Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POINTS = CARTESIAN_TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POINTS;

	/**
	 * The feature id for the '<em><b>Number Of Polygons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POLYGONS = CARTESIAN_TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POLYGONS;

	/**
	 * The feature id for the '<em><b>Presentation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION__PRESENTATION_MODE = CARTESIAN_TRIANGULAR_MESH_PRESENTATION__PRESENTATION_MODE;

	/**
	 * The feature id for the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION__TRANSPARENCY = CARTESIAN_TRIANGULAR_MESH_PRESENTATION__TRANSPARENCY;

	/**
	 * The feature id for the '<em><b>Use Shading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION__USE_SHADING = CARTESIAN_TRIANGULAR_MESH_PRESENTATION__USE_SHADING;

	/**
	 * The feature id for the '<em><b>Texture Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION__TEXTURE_IMAGE = CARTESIAN_TRIANGULAR_MESH_PRESENTATION__TEXTURE_IMAGE;

	/**
	 * The feature id for the '<em><b>Override Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION__OVERRIDE_COLOR = CARTESIAN_TRIANGULAR_MESH_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Colored Triangular Mesh Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION_FEATURE_COUNT = CARTESIAN_TRIANGULAR_MESH_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Colored Triangular Mesh Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_TRIANGULAR_MESH_PRESENTATION_OPERATION_COUNT = CARTESIAN_TRIANGULAR_MESH_PRESENTATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation <em>Cartesian Coordinates Set Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Coordinates Set Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation
	 * @generated
	 */
	EClass getCartesianCoordinatesSetPresentation();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation#getPointCloud <em>Point Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Point Cloud</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation#getPointCloud()
	 * @see #getCartesianCoordinatesSetPresentation()
	 * @generated
	 */
	EReference getCartesianCoordinatesSetPresentation_PointCloud();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation#getPointSize <em>Point Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point Size</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation#getPointSize()
	 * @see #getCartesianCoordinatesSetPresentation()
	 * @generated
	 */
	EAttribute getCartesianCoordinatesSetPresentation_PointSize();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation#getNumberOfPoints <em>Number Of Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Points</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation#getNumberOfPoints()
	 * @see #getCartesianCoordinatesSetPresentation()
	 * @generated
	 */
	EAttribute getCartesianCoordinatesSetPresentation_NumberOfPoints();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ColoredCartesianCoordinatesSetPresentation <em>Colored Cartesian Coordinates Set Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colored Cartesian Coordinates Set Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ColoredCartesianCoordinatesSetPresentation
	 * @generated
	 */
	EClass getColoredCartesianCoordinatesSetPresentation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ColoredCartesianCoordinatesSetPresentation#isOverrideColor <em>Override Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Override Color</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ColoredCartesianCoordinatesSetPresentation#isOverrideColor()
	 * @see #getColoredCartesianCoordinatesSetPresentation()
	 * @generated
	 */
	EAttribute getColoredCartesianCoordinatesSetPresentation_OverrideColor();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ColoredCartesianCoordinatesSetPresentation#getColoredPointCloud <em>Colored Point Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Colored Point Cloud</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ColoredCartesianCoordinatesSetPresentation#getColoredPointCloud()
	 * @see #getColoredCartesianCoordinatesSetPresentation()
	 * @generated
	 */
	EReference getColoredCartesianCoordinatesSetPresentation_ColoredPointCloud();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianTriangularMeshPresentation <em>Cartesian Triangular Mesh Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangular Mesh Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianTriangularMeshPresentation
	 * @generated
	 */
	EClass getCartesianTriangularMeshPresentation();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianTriangularMeshPresentation#getMesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mesh</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianTriangularMeshPresentation#getMesh()
	 * @see #getCartesianTriangularMeshPresentation()
	 * @generated
	 */
	EReference getCartesianTriangularMeshPresentation_Mesh();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianTriangularMeshPresentation#getPointSize <em>Point Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point Size</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianTriangularMeshPresentation#getPointSize()
	 * @see #getCartesianTriangularMeshPresentation()
	 * @generated
	 */
	EAttribute getCartesianTriangularMeshPresentation_PointSize();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianTriangularMeshPresentation#getNumberOfPoints <em>Number Of Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Points</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianTriangularMeshPresentation#getNumberOfPoints()
	 * @see #getCartesianTriangularMeshPresentation()
	 * @generated
	 */
	EAttribute getCartesianTriangularMeshPresentation_NumberOfPoints();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianTriangularMeshPresentation#getNumberOfPolygons <em>Number Of Polygons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Polygons</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianTriangularMeshPresentation#getNumberOfPolygons()
	 * @see #getCartesianTriangularMeshPresentation()
	 * @generated
	 */
	EAttribute getCartesianTriangularMeshPresentation_NumberOfPolygons();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianTriangularMeshPresentation#getPresentationMode <em>Presentation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation Mode</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianTriangularMeshPresentation#getPresentationMode()
	 * @see #getCartesianTriangularMeshPresentation()
	 * @generated
	 */
	EAttribute getCartesianTriangularMeshPresentation_PresentationMode();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianTriangularMeshPresentation#getTransparency <em>Transparency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transparency</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianTriangularMeshPresentation#getTransparency()
	 * @see #getCartesianTriangularMeshPresentation()
	 * @generated
	 */
	EAttribute getCartesianTriangularMeshPresentation_Transparency();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianTriangularMeshPresentation#isUseShading <em>Use Shading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Shading</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianTriangularMeshPresentation#isUseShading()
	 * @see #getCartesianTriangularMeshPresentation()
	 * @generated
	 */
	EAttribute getCartesianTriangularMeshPresentation_UseShading();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianTriangularMeshPresentation#getTextureImage <em>Texture Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Texture Image</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianTriangularMeshPresentation#getTextureImage()
	 * @see #getCartesianTriangularMeshPresentation()
	 * @generated
	 */
	EReference getCartesianTriangularMeshPresentation_TextureImage();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ColoredTriangularMeshPresentation <em>Colored Triangular Mesh Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colored Triangular Mesh Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ColoredTriangularMeshPresentation
	 * @generated
	 */
	EClass getColoredTriangularMeshPresentation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ColoredTriangularMeshPresentation#isOverrideColor <em>Override Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Override Color</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ColoredTriangularMeshPresentation#isOverrideColor()
	 * @see #getColoredTriangularMeshPresentation()
	 * @generated
	 */
	EAttribute getColoredTriangularMeshPresentation_OverrideColor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCommonGeometryData3DUIFactory getApogyCommonGeometryData3DUIFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.CartesianCoordinatesSetPresentationImpl <em>Cartesian Coordinates Set Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.CartesianCoordinatesSetPresentationImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.ApogyCommonGeometryData3DUIPackageImpl#getCartesianCoordinatesSetPresentation()
		 * @generated
		 */
		EClass CARTESIAN_COORDINATES_SET_PRESENTATION = eINSTANCE.getCartesianCoordinatesSetPresentation();

		/**
		 * The meta object literal for the '<em><b>Point Cloud</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_CLOUD = eINSTANCE.getCartesianCoordinatesSetPresentation_PointCloud();

		/**
		 * The meta object literal for the '<em><b>Point Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_SIZE = eINSTANCE.getCartesianCoordinatesSetPresentation_PointSize();

		/**
		 * The meta object literal for the '<em><b>Number Of Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_COORDINATES_SET_PRESENTATION__NUMBER_OF_POINTS = eINSTANCE.getCartesianCoordinatesSetPresentation_NumberOfPoints();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.ColoredCartesianCoordinatesSetPresentationImpl <em>Colored Cartesian Coordinates Set Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.ColoredCartesianCoordinatesSetPresentationImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.ApogyCommonGeometryData3DUIPackageImpl#getColoredCartesianCoordinatesSetPresentation()
		 * @generated
		 */
		EClass COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION = eINSTANCE.getColoredCartesianCoordinatesSetPresentation();

		/**
		 * The meta object literal for the '<em><b>Override Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__OVERRIDE_COLOR = eINSTANCE.getColoredCartesianCoordinatesSetPresentation_OverrideColor();

		/**
		 * The meta object literal for the '<em><b>Colored Point Cloud</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION__COLORED_POINT_CLOUD = eINSTANCE.getColoredCartesianCoordinatesSetPresentation_ColoredPointCloud();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.CartesianTriangularMeshPresentationImpl <em>Cartesian Triangular Mesh Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.CartesianTriangularMeshPresentationImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.ApogyCommonGeometryData3DUIPackageImpl#getCartesianTriangularMeshPresentation()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGULAR_MESH_PRESENTATION = eINSTANCE.getCartesianTriangularMeshPresentation();

		/**
		 * The meta object literal for the '<em><b>Mesh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_TRIANGULAR_MESH_PRESENTATION__MESH = eINSTANCE.getCartesianTriangularMeshPresentation_Mesh();

		/**
		 * The meta object literal for the '<em><b>Point Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_TRIANGULAR_MESH_PRESENTATION__POINT_SIZE = eINSTANCE.getCartesianTriangularMeshPresentation_PointSize();

		/**
		 * The meta object literal for the '<em><b>Number Of Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POINTS = eINSTANCE.getCartesianTriangularMeshPresentation_NumberOfPoints();

		/**
		 * The meta object literal for the '<em><b>Number Of Polygons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POLYGONS = eINSTANCE.getCartesianTriangularMeshPresentation_NumberOfPolygons();

		/**
		 * The meta object literal for the '<em><b>Presentation Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_TRIANGULAR_MESH_PRESENTATION__PRESENTATION_MODE = eINSTANCE.getCartesianTriangularMeshPresentation_PresentationMode();

		/**
		 * The meta object literal for the '<em><b>Transparency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_TRIANGULAR_MESH_PRESENTATION__TRANSPARENCY = eINSTANCE.getCartesianTriangularMeshPresentation_Transparency();

		/**
		 * The meta object literal for the '<em><b>Use Shading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_TRIANGULAR_MESH_PRESENTATION__USE_SHADING = eINSTANCE.getCartesianTriangularMeshPresentation_UseShading();

		/**
		 * The meta object literal for the '<em><b>Texture Image</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_TRIANGULAR_MESH_PRESENTATION__TEXTURE_IMAGE = eINSTANCE.getCartesianTriangularMeshPresentation_TextureImage();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.ColoredTriangularMeshPresentationImpl <em>Colored Triangular Mesh Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.ColoredTriangularMeshPresentationImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.ApogyCommonGeometryData3DUIPackageImpl#getColoredTriangularMeshPresentation()
		 * @generated
		 */
		EClass COLORED_TRIANGULAR_MESH_PRESENTATION = eINSTANCE.getColoredTriangularMeshPresentation();

		/**
		 * The meta object literal for the '<em><b>Override Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLORED_TRIANGULAR_MESH_PRESENTATION__OVERRIDE_COLOR = eINSTANCE.getColoredTriangularMeshPresentation_OverrideColor();

	}

} //ApogyCommonGeometryData3DUIPackage
