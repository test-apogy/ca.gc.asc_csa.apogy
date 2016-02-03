package ca.gc.asc_csa.apogy.common.geometry.data;
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
 * @see ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCommonGeometryData' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)' modelName='ApogyCommonGeometryData' suppressGenModelAnnotations='false' modelDirectory='/ca.gc.asc_csa.apogy.common.geometry.data/src-generated' editDirectory='/ca.gc.asc_csa.apogy.common.geometry.data.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.common.geometry'"
 * @generated
 */
public interface ApogyCommonGeometryDataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.common.geometry.data";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonGeometryDataPackage eINSTANCE = ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.impl.CoordinatesImpl <em>Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.CoordinatesImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getCoordinates()
	 * @generated
	 */
	int COORDINATES = 0;

	/**
	 * The number of structural features of the '<em>Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.impl.CoordinatesSetImpl <em>Coordinates Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.CoordinatesSetImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getCoordinatesSet()
	 * @generated
	 */
	int COORDINATES_SET = 1;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET__POINTS = 0;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET__NORMALS = 1;

	/**
	 * The number of structural features of the '<em>Coordinates Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Coordinates Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.impl.PolygonImpl <em>Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.PolygonImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getPolygon()
	 * @generated
	 */
	int POLYGON = 2;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__VERTICES = 0;

	/**
	 * The number of structural features of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.impl.MeshImpl <em>Mesh</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.MeshImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getMesh()
	 * @generated
	 */
	int MESH = 3;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH__POINTS = COORDINATES_SET__POINTS;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH__NORMALS = COORDINATES_SET__NORMALS;

	/**
	 * The feature id for the '<em><b>Polygons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH__POLYGONS = COORDINATES_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_FEATURE_COUNT = COORDINATES_SET_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Polygon Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH___GET_POLYGON_NEIGHBOURS__POLYGON = COORDINATES_SET_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Point Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH___GET_POINT_NEIGHBOURS__COORDINATES = COORDINATES_SET_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Polygons Sharing Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH___GET_POLYGONS_SHARING_POINT__COORDINATES = COORDINATES_SET_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_OPERATION_COUNT = COORDINATES_SET_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.SamplingShape <em>Sampling Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.SamplingShape
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getSamplingShape()
	 * @generated
	 */
	int SAMPLING_SHAPE = 4;

	/**
	 * The number of structural features of the '<em>Sampling Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_SHAPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Sampling Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_SHAPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSamplingShape <em>Coordinates Sampling Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSamplingShape
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getCoordinatesSamplingShape()
	 * @generated
	 */
	int COORDINATES_SAMPLING_SHAPE = 5;

	/**
	 * The number of structural features of the '<em>Coordinates Sampling Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SAMPLING_SHAPE_FEATURE_COUNT = SAMPLING_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Inside</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SAMPLING_SHAPE___IS_INSIDE__COORDINATES = SAMPLING_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Coordinates Sampling Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SAMPLING_SHAPE_OPERATION_COUNT = SAMPLING_SHAPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingShape <em>Polygon Sampling Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingShape
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getPolygonSamplingShape()
	 * @generated
	 */
	int POLYGON_SAMPLING_SHAPE = 6;

	/**
	 * The number of structural features of the '<em>Polygon Sampling Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SAMPLING_SHAPE_FEATURE_COUNT = SAMPLING_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Polygon Inside</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SAMPLING_SHAPE___IS_POLYGON_INSIDE__POLYGON = SAMPLING_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Polygon Sampling Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SAMPLING_SHAPE_OPERATION_COUNT = SAMPLING_SHAPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.impl.CoordinatesSetShapesSamplerImpl <em>Coordinates Set Shapes Sampler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.CoordinatesSetShapesSamplerImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getCoordinatesSetShapesSampler()
	 * @generated
	 */
	int COORDINATES_SET_SHAPES_SAMPLER = 7;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET_SHAPES_SAMPLER__PROGRESS_MONITOR = ApogyCommonProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET_SHAPES_SAMPLER__INPUT = ApogyCommonProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET_SHAPES_SAMPLER__OUTPUT = ApogyCommonProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Coordinates Sampling Shapes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET_SHAPES_SAMPLER__COORDINATES_SAMPLING_SHAPES = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shape Sampling Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coordinates Set Shapes Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET_SHAPES_SAMPLER_FEATURE_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET_SHAPES_SAMPLER___PROCESS__OBJECT = ApogyCommonProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Coordinates Set Shapes Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET_SHAPES_SAMPLER_OPERATION_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.impl.MeshCoordinatesShapesSamplerImpl <em>Mesh Coordinates Shapes Sampler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.MeshCoordinatesShapesSamplerImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getMeshCoordinatesShapesSampler()
	 * @generated
	 */
	int MESH_COORDINATES_SHAPES_SAMPLER = 8;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_COORDINATES_SHAPES_SAMPLER__PROGRESS_MONITOR = ApogyCommonProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_COORDINATES_SHAPES_SAMPLER__INPUT = ApogyCommonProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_COORDINATES_SHAPES_SAMPLER__OUTPUT = ApogyCommonProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Coordinates Sampling Shapes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_COORDINATES_SHAPES_SAMPLER__COORDINATES_SAMPLING_SHAPES = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shape Sampling Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_COORDINATES_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Polygon Sampling Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_COORDINATES_SHAPES_SAMPLER__POLYGON_SAMPLING_MODE = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mesh Coordinates Shapes Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_COORDINATES_SHAPES_SAMPLER_FEATURE_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_COORDINATES_SHAPES_SAMPLER___PROCESS__OBJECT = ApogyCommonProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Mesh Coordinates Shapes Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_COORDINATES_SHAPES_SAMPLER_OPERATION_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.impl.MeshPolygonShapesSamplerImpl <em>Mesh Polygon Shapes Sampler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.MeshPolygonShapesSamplerImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getMeshPolygonShapesSampler()
	 * @generated
	 */
	int MESH_POLYGON_SHAPES_SAMPLER = 9;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_POLYGON_SHAPES_SAMPLER__PROGRESS_MONITOR = ApogyCommonProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_POLYGON_SHAPES_SAMPLER__INPUT = ApogyCommonProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_POLYGON_SHAPES_SAMPLER__OUTPUT = ApogyCommonProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Polygon Sampling Shapes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_POLYGON_SHAPES_SAMPLER__POLYGON_SAMPLING_SHAPES = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shape Sampling Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_POLYGON_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mesh Polygon Shapes Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_POLYGON_SHAPES_SAMPLER_FEATURE_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_POLYGON_SHAPES_SAMPLER___PROCESS__OBJECT = ApogyCommonProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Mesh Polygon Shapes Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_POLYGON_SHAPES_SAMPLER_OPERATION_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.ShapeSamplingMode <em>Shape Sampling Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.ShapeSamplingMode
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getShapeSamplingMode()
	 * @generated
	 */
	int SHAPE_SAMPLING_MODE = 10;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingMode <em>Polygon Sampling Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingMode
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getPolygonSamplingMode()
	 * @generated
	 */
	int POLYGON_SAMPLING_MODE = 11;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getList()
	 * @generated
	 */
	int LIST = 12;

	/**
	 * The meta object id for the '<em>Vector3d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Vector3d
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getVector3d()
	 * @generated
	 */
	int VECTOR3D = 13;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data.Coordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.Coordinates
	 * @generated
	 */
	EClass getCoordinates();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSet <em>Coordinates Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinates Set</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSet
	 * @generated
	 */
	EClass getCoordinatesSet();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSet#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSet#getPoints()
	 * @see #getCoordinatesSet()
	 * @generated
	 */
	EReference getCoordinatesSet_Points();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSet#getNormals <em>Normals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normals</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSet#getNormals()
	 * @see #getCoordinatesSet()
	 * @generated
	 */
	EAttribute getCoordinatesSet_Normals();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.Polygon
	 * @generated
	 */
	EClass getPolygon();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.common.geometry.data.Polygon#getVertices <em>Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vertices</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.Polygon#getVertices()
	 * @see #getPolygon()
	 * @generated
	 */
	EReference getPolygon_Vertices();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data.Mesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mesh</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.Mesh
	 * @generated
	 */
	EClass getMesh();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.common.geometry.data.Mesh#getPolygons <em>Polygons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polygons</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.Mesh#getPolygons()
	 * @see #getMesh()
	 * @generated
	 */
	EReference getMesh_Polygons();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.Mesh#getPolygonNeighbours(ca.gc.asc_csa.apogy.common.geometry.data.Polygon) <em>Get Polygon Neighbours</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Polygon Neighbours</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.Mesh#getPolygonNeighbours(ca.gc.asc_csa.apogy.common.geometry.data.Polygon)
	 * @generated
	 */
	EOperation getMesh__GetPolygonNeighbours__Polygon();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.Mesh#getPointNeighbours(ca.gc.asc_csa.apogy.common.geometry.data.Coordinates) <em>Get Point Neighbours</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Point Neighbours</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.Mesh#getPointNeighbours(ca.gc.asc_csa.apogy.common.geometry.data.Coordinates)
	 * @generated
	 */
	EOperation getMesh__GetPointNeighbours__Coordinates();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.Mesh#getPolygonsSharingPoint(ca.gc.asc_csa.apogy.common.geometry.data.Coordinates) <em>Get Polygons Sharing Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Polygons Sharing Point</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.Mesh#getPolygonsSharingPoint(ca.gc.asc_csa.apogy.common.geometry.data.Coordinates)
	 * @generated
	 */
	EOperation getMesh__GetPolygonsSharingPoint__Coordinates();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data.SamplingShape <em>Sampling Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sampling Shape</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.SamplingShape
	 * @generated
	 */
	EClass getSamplingShape();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSamplingShape <em>Coordinates Sampling Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinates Sampling Shape</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSamplingShape
	 * @generated
	 */
	EClass getCoordinatesSamplingShape();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSamplingShape#isInside(ca.gc.asc_csa.apogy.common.geometry.data.Coordinates) <em>Is Inside</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Inside</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSamplingShape#isInside(ca.gc.asc_csa.apogy.common.geometry.data.Coordinates)
	 * @generated
	 */
	EOperation getCoordinatesSamplingShape__IsInside__Coordinates();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingShape <em>Polygon Sampling Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon Sampling Shape</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingShape
	 * @generated
	 */
	EClass getPolygonSamplingShape();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingShape#isPolygonInside(ca.gc.asc_csa.apogy.common.geometry.data.Polygon) <em>Is Polygon Inside</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Polygon Inside</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingShape#isPolygonInside(ca.gc.asc_csa.apogy.common.geometry.data.Polygon)
	 * @generated
	 */
	EOperation getPolygonSamplingShape__IsPolygonInside__Polygon();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSetShapesSampler <em>Coordinates Set Shapes Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinates Set Shapes Sampler</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSetShapesSampler
	 * @generated
	 */
	EClass getCoordinatesSetShapesSampler();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSetShapesSampler#getCoordinatesSamplingShapes <em>Coordinates Sampling Shapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coordinates Sampling Shapes</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSetShapesSampler#getCoordinatesSamplingShapes()
	 * @see #getCoordinatesSetShapesSampler()
	 * @generated
	 */
	EReference getCoordinatesSetShapesSampler_CoordinatesSamplingShapes();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSetShapesSampler#getShapeSamplingMode <em>Shape Sampling Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape Sampling Mode</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSetShapesSampler#getShapeSamplingMode()
	 * @see #getCoordinatesSetShapesSampler()
	 * @generated
	 */
	EAttribute getCoordinatesSetShapesSampler_ShapeSamplingMode();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data.MeshCoordinatesShapesSampler <em>Mesh Coordinates Shapes Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mesh Coordinates Shapes Sampler</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.MeshCoordinatesShapesSampler
	 * @generated
	 */
	EClass getMeshCoordinatesShapesSampler();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.common.geometry.data.MeshCoordinatesShapesSampler#getCoordinatesSamplingShapes <em>Coordinates Sampling Shapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coordinates Sampling Shapes</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.MeshCoordinatesShapesSampler#getCoordinatesSamplingShapes()
	 * @see #getMeshCoordinatesShapesSampler()
	 * @generated
	 */
	EReference getMeshCoordinatesShapesSampler_CoordinatesSamplingShapes();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data.MeshCoordinatesShapesSampler#getShapeSamplingMode <em>Shape Sampling Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape Sampling Mode</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.MeshCoordinatesShapesSampler#getShapeSamplingMode()
	 * @see #getMeshCoordinatesShapesSampler()
	 * @generated
	 */
	EAttribute getMeshCoordinatesShapesSampler_ShapeSamplingMode();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data.MeshCoordinatesShapesSampler#getPolygonSamplingMode <em>Polygon Sampling Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polygon Sampling Mode</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.MeshCoordinatesShapesSampler#getPolygonSamplingMode()
	 * @see #getMeshCoordinatesShapesSampler()
	 * @generated
	 */
	EAttribute getMeshCoordinatesShapesSampler_PolygonSamplingMode();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data.MeshPolygonShapesSampler <em>Mesh Polygon Shapes Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mesh Polygon Shapes Sampler</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.MeshPolygonShapesSampler
	 * @generated
	 */
	EClass getMeshPolygonShapesSampler();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.common.geometry.data.MeshPolygonShapesSampler#getPolygonSamplingShapes <em>Polygon Sampling Shapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polygon Sampling Shapes</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.MeshPolygonShapesSampler#getPolygonSamplingShapes()
	 * @see #getMeshPolygonShapesSampler()
	 * @generated
	 */
	EReference getMeshPolygonShapesSampler_PolygonSamplingShapes();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data.MeshPolygonShapesSampler#getShapeSamplingMode <em>Shape Sampling Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape Sampling Mode</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.MeshPolygonShapesSampler#getShapeSamplingMode()
	 * @see #getMeshPolygonShapesSampler()
	 * @generated
	 */
	EAttribute getMeshPolygonShapesSampler_ShapeSamplingMode();

	/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.common.geometry.data.ShapeSamplingMode <em>Shape Sampling Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shape Sampling Mode</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.ShapeSamplingMode
	 * @generated
	 */
	EEnum getShapeSamplingMode();

	/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingMode <em>Polygon Sampling Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Polygon Sampling Mode</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingMode
	 * @generated
	 */
	EEnum getPolygonSamplingMode();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCommonGeometryDataFactory getApogyCommonGeometryDataFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.impl.CoordinatesImpl <em>Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.CoordinatesImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getCoordinates()
		 * @generated
		 */
		EClass COORDINATES = eINSTANCE.getCoordinates();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.impl.CoordinatesSetImpl <em>Coordinates Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.CoordinatesSetImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getCoordinatesSet()
		 * @generated
		 */
		EClass COORDINATES_SET = eINSTANCE.getCoordinatesSet();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATES_SET__POINTS = eINSTANCE.getCoordinatesSet_Points();

		/**
		 * The meta object literal for the '<em><b>Normals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES_SET__NORMALS = eINSTANCE.getCoordinatesSet_Normals();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.impl.PolygonImpl <em>Polygon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.PolygonImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getPolygon()
		 * @generated
		 */
		EClass POLYGON = eINSTANCE.getPolygon();

		/**
		 * The meta object literal for the '<em><b>Vertices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYGON__VERTICES = eINSTANCE.getPolygon_Vertices();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.impl.MeshImpl <em>Mesh</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.MeshImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getMesh()
		 * @generated
		 */
		EClass MESH = eINSTANCE.getMesh();

		/**
		 * The meta object literal for the '<em><b>Polygons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESH__POLYGONS = eINSTANCE.getMesh_Polygons();

		/**
		 * The meta object literal for the '<em><b>Get Polygon Neighbours</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESH___GET_POLYGON_NEIGHBOURS__POLYGON = eINSTANCE.getMesh__GetPolygonNeighbours__Polygon();

		/**
		 * The meta object literal for the '<em><b>Get Point Neighbours</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESH___GET_POINT_NEIGHBOURS__COORDINATES = eINSTANCE.getMesh__GetPointNeighbours__Coordinates();

		/**
		 * The meta object literal for the '<em><b>Get Polygons Sharing Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESH___GET_POLYGONS_SHARING_POINT__COORDINATES = eINSTANCE.getMesh__GetPolygonsSharingPoint__Coordinates();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.SamplingShape <em>Sampling Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.SamplingShape
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getSamplingShape()
		 * @generated
		 */
		EClass SAMPLING_SHAPE = eINSTANCE.getSamplingShape();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSamplingShape <em>Coordinates Sampling Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSamplingShape
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getCoordinatesSamplingShape()
		 * @generated
		 */
		EClass COORDINATES_SAMPLING_SHAPE = eINSTANCE.getCoordinatesSamplingShape();

		/**
		 * The meta object literal for the '<em><b>Is Inside</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COORDINATES_SAMPLING_SHAPE___IS_INSIDE__COORDINATES = eINSTANCE.getCoordinatesSamplingShape__IsInside__Coordinates();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingShape <em>Polygon Sampling Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingShape
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getPolygonSamplingShape()
		 * @generated
		 */
		EClass POLYGON_SAMPLING_SHAPE = eINSTANCE.getPolygonSamplingShape();

		/**
		 * The meta object literal for the '<em><b>Is Polygon Inside</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLYGON_SAMPLING_SHAPE___IS_POLYGON_INSIDE__POLYGON = eINSTANCE.getPolygonSamplingShape__IsPolygonInside__Polygon();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.impl.CoordinatesSetShapesSamplerImpl <em>Coordinates Set Shapes Sampler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.CoordinatesSetShapesSamplerImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getCoordinatesSetShapesSampler()
		 * @generated
		 */
		EClass COORDINATES_SET_SHAPES_SAMPLER = eINSTANCE.getCoordinatesSetShapesSampler();

		/**
		 * The meta object literal for the '<em><b>Coordinates Sampling Shapes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATES_SET_SHAPES_SAMPLER__COORDINATES_SAMPLING_SHAPES = eINSTANCE.getCoordinatesSetShapesSampler_CoordinatesSamplingShapes();

		/**
		 * The meta object literal for the '<em><b>Shape Sampling Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES_SET_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE = eINSTANCE.getCoordinatesSetShapesSampler_ShapeSamplingMode();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.impl.MeshCoordinatesShapesSamplerImpl <em>Mesh Coordinates Shapes Sampler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.MeshCoordinatesShapesSamplerImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getMeshCoordinatesShapesSampler()
		 * @generated
		 */
		EClass MESH_COORDINATES_SHAPES_SAMPLER = eINSTANCE.getMeshCoordinatesShapesSampler();

		/**
		 * The meta object literal for the '<em><b>Coordinates Sampling Shapes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESH_COORDINATES_SHAPES_SAMPLER__COORDINATES_SAMPLING_SHAPES = eINSTANCE.getMeshCoordinatesShapesSampler_CoordinatesSamplingShapes();

		/**
		 * The meta object literal for the '<em><b>Shape Sampling Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH_COORDINATES_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE = eINSTANCE.getMeshCoordinatesShapesSampler_ShapeSamplingMode();

		/**
		 * The meta object literal for the '<em><b>Polygon Sampling Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH_COORDINATES_SHAPES_SAMPLER__POLYGON_SAMPLING_MODE = eINSTANCE.getMeshCoordinatesShapesSampler_PolygonSamplingMode();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.impl.MeshPolygonShapesSamplerImpl <em>Mesh Polygon Shapes Sampler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.MeshPolygonShapesSamplerImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getMeshPolygonShapesSampler()
		 * @generated
		 */
		EClass MESH_POLYGON_SHAPES_SAMPLER = eINSTANCE.getMeshPolygonShapesSampler();

		/**
		 * The meta object literal for the '<em><b>Polygon Sampling Shapes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESH_POLYGON_SHAPES_SAMPLER__POLYGON_SAMPLING_SHAPES = eINSTANCE.getMeshPolygonShapesSampler_PolygonSamplingShapes();

		/**
		 * The meta object literal for the '<em><b>Shape Sampling Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH_POLYGON_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE = eINSTANCE.getMeshPolygonShapesSampler_ShapeSamplingMode();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.ShapeSamplingMode <em>Shape Sampling Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.ShapeSamplingMode
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getShapeSamplingMode()
		 * @generated
		 */
		EEnum SHAPE_SAMPLING_MODE = eINSTANCE.getShapeSamplingMode();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingMode <em>Polygon Sampling Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingMode
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getPolygonSamplingMode()
		 * @generated
		 */
		EEnum POLYGON_SAMPLING_MODE = eINSTANCE.getPolygonSamplingMode();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>Vector3d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Vector3d
		 * @see ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataPackageImpl#getVector3d()
		 * @generated
		 */
		EDataType VECTOR3D = eINSTANCE.getVector3d();

	}

} //ApogyCommonGeometryDataPackage
