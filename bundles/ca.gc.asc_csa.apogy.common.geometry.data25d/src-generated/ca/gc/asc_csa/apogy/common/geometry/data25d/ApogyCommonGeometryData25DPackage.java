package ca.gc.asc_csa.apogy.common.geometry.data25d;
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
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
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
 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCommonGeometryData25D' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyCommonGeometryData25D' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates' modelDirectory='/ca.gc.asc_csa.apogy.common.geometry.data25d/src-generated' editDirectory='/ca.gc.asc_csa.apogy.common.geometry.data25d.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.common.geometry'"
 * @generated
 */
public interface ApogyCommonGeometryData25DPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data25d";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.common.geometry.data25d";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "data25d";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonGeometryData25DPackage eINSTANCE = ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.impl.Coordinates25DImpl <em>Coordinates25 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.Coordinates25DImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DPackageImpl#getCoordinates25D()
	 * @generated
	 */
	int COORDINATES25_D = 0;

	/**
	 * The feature id for the '<em><b>U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES25_D__U = ApogyCommonGeometryDataPackage.COORDINATES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES25_D__V = ApogyCommonGeometryDataPackage.COORDINATES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES25_D__W = ApogyCommonGeometryDataPackage.COORDINATES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Coordinates25 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES25_D_FEATURE_COUNT = ApogyCommonGeometryDataPackage.COORDINATES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Coordinates25 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES25_D_OPERATION_COUNT = ApogyCommonGeometryDataPackage.COORDINATES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.impl.CoordinatesSet25DImpl <em>Coordinates Set25 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.CoordinatesSet25DImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DPackageImpl#getCoordinatesSet25D()
	 * @generated
	 */
	int COORDINATES_SET25_D = 1;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET25_D__POINTS = ApogyCommonGeometryDataPackage.COORDINATES_SET__POINTS;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET25_D__NORMALS = ApogyCommonGeometryDataPackage.COORDINATES_SET__NORMALS;

	/**
	 * The feature id for the '<em><b>Enforce Uniqueness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET25_D__ENFORCE_UNIQUENESS = ApogyCommonGeometryDataPackage.COORDINATES_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Coordinates Set25 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET25_D_FEATURE_COUNT = ApogyCommonGeometryDataPackage.COORDINATES_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Coordinates Set25 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET25_D_OPERATION_COUNT = ApogyCommonGeometryDataPackage.COORDINATES_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.impl.VolumetricCoordinatesSet25DImpl <em>Volumetric Coordinates Set25 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.VolumetricCoordinatesSet25DImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DPackageImpl#getVolumetricCoordinatesSet25D()
	 * @generated
	 */
	int VOLUMETRIC_COORDINATES_SET25_D = 2;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_COORDINATES_SET25_D__POINTS = COORDINATES_SET25_D__POINTS;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_COORDINATES_SET25_D__NORMALS = COORDINATES_SET25_D__NORMALS;

	/**
	 * The feature id for the '<em><b>Enforce Uniqueness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_COORDINATES_SET25_D__ENFORCE_UNIQUENESS = COORDINATES_SET25_D__ENFORCE_UNIQUENESS;

	/**
	 * The number of structural features of the '<em>Volumetric Coordinates Set25 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_COORDINATES_SET25_D_FEATURE_COUNT = COORDINATES_SET25_D_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Cartesian Position Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_COORDINATES_SET25_D___GET_CARTESIAN_POSITION_COORDINATES__COORDINATES25D = COORDINATES_SET25_D_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Volumetric Coordinates Set25 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_COORDINATES_SET25_D_OPERATION_COUNT = COORDINATES_SET25_D_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.impl.Polygon25DImpl <em>Polygon25 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.Polygon25DImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DPackageImpl#getPolygon25D()
	 * @generated
	 */
	int POLYGON25_D = 3;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON25_D__VERTICES = ApogyCommonGeometryDataPackage.POLYGON__VERTICES;

	/**
	 * The number of structural features of the '<em>Polygon25 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON25_D_FEATURE_COUNT = ApogyCommonGeometryDataPackage.POLYGON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Polygon25 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON25_D_OPERATION_COUNT = ApogyCommonGeometryDataPackage.POLYGON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.impl.Mesh25DImpl <em>Mesh25 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.Mesh25DImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DPackageImpl#getMesh25D()
	 * @generated
	 */
	int MESH25_D = 4;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH25_D__POINTS = ApogyCommonGeometryDataPackage.MESH__POINTS;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH25_D__NORMALS = ApogyCommonGeometryDataPackage.MESH__NORMALS;

	/**
	 * The feature id for the '<em><b>Polygons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH25_D__POLYGONS = ApogyCommonGeometryDataPackage.MESH__POLYGONS;

	/**
	 * The number of structural features of the '<em>Mesh25 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH25_D_FEATURE_COUNT = ApogyCommonGeometryDataPackage.MESH_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Polygon Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH25_D___GET_POLYGON_NEIGHBOURS__POLYGON = ApogyCommonGeometryDataPackage.MESH___GET_POLYGON_NEIGHBOURS__POLYGON;

	/**
	 * The operation id for the '<em>Get Point Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH25_D___GET_POINT_NEIGHBOURS__COORDINATES = ApogyCommonGeometryDataPackage.MESH___GET_POINT_NEIGHBOURS__COORDINATES;

	/**
	 * The operation id for the '<em>Get Polygons Sharing Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH25_D___GET_POLYGONS_SHARING_POINT__COORDINATES = ApogyCommonGeometryDataPackage.MESH___GET_POLYGONS_SHARING_POINT__COORDINATES;

	/**
	 * The number of operations of the '<em>Mesh25 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH25_D_OPERATION_COUNT = ApogyCommonGeometryDataPackage.MESH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.impl.VolumetricMesh25DImpl <em>Volumetric Mesh25 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.VolumetricMesh25DImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DPackageImpl#getVolumetricMesh25D()
	 * @generated
	 */
	int VOLUMETRIC_MESH25_D = 5;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_MESH25_D__POINTS = MESH25_D__POINTS;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_MESH25_D__NORMALS = MESH25_D__NORMALS;

	/**
	 * The feature id for the '<em><b>Polygons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_MESH25_D__POLYGONS = MESH25_D__POLYGONS;

	/**
	 * The number of structural features of the '<em>Volumetric Mesh25 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_MESH25_D_FEATURE_COUNT = MESH25_D_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Polygon Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_MESH25_D___GET_POLYGON_NEIGHBOURS__POLYGON = MESH25_D___GET_POLYGON_NEIGHBOURS__POLYGON;

	/**
	 * The operation id for the '<em>Get Point Neighbours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_MESH25_D___GET_POINT_NEIGHBOURS__COORDINATES = MESH25_D___GET_POINT_NEIGHBOURS__COORDINATES;

	/**
	 * The operation id for the '<em>Get Polygons Sharing Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_MESH25_D___GET_POLYGONS_SHARING_POINT__COORDINATES = MESH25_D___GET_POLYGONS_SHARING_POINT__COORDINATES;

	/**
	 * The number of operations of the '<em>Volumetric Mesh25 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_MESH25_D_OPERATION_COUNT = MESH25_D_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.impl.CoordinatesSet25DFilterImpl <em>Coordinates Set25 DFilter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.CoordinatesSet25DFilterImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DPackageImpl#getCoordinatesSet25DFilter()
	 * @generated
	 */
	int COORDINATES_SET25_DFILTER = 6;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET25_DFILTER__PROGRESS_MONITOR = ApogyCommonProcessorsPackage.PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET25_DFILTER__INPUT = ApogyCommonProcessorsPackage.PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET25_DFILTER__OUTPUT = ApogyCommonProcessorsPackage.PROCESSOR__OUTPUT;

	/**
	 * The number of structural features of the '<em>Coordinates Set25 DFilter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET25_DFILTER_FEATURE_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET25_DFILTER___PROCESS__OBJECT = ApogyCommonProcessorsPackage.PROCESSOR___PROCESS__OBJECT;

	/**
	 * The operation id for the '<em>Create Coordinates Set25 D</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET25_DFILTER___CREATE_COORDINATES_SET25_D = ApogyCommonProcessorsPackage.PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Coordinates Set25 DFilter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_SET25_DFILTER_OPERATION_COUNT = ApogyCommonProcessorsPackage.PROCESSOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DFacadeImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DPackageImpl#getApogyCommonGeometryData25DFacade()
	 * @generated
	 */
	int APOGY_COMMON_GEOMETRY_DATA25_DFACADE = 7;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA25_DFACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Coordinates25 D</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA25_DFACADE___CREATE_COORDINATES25_D__COORDINATES25D = 0;

	/**
	 * The operation id for the '<em>Create Coordinates25 D</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA25_DFACADE___CREATE_COORDINATES25_D__DOUBLE_DOUBLE_DOUBLE = 1;

	/**
	 * The operation id for the '<em>Create Cartesian Coordinates Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA25_DFACADE___CREATE_CARTESIAN_COORDINATES_SET__VOLUMETRICCOORDINATESSET25D = 2;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_GEOMETRY_DATA25_DFACADE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.impl.Data25DIOImpl <em>Data25 DIO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.Data25DIOImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DPackageImpl#getData25DIO()
	 * @generated
	 */
	int DATA25_DIO = 8;

	/**
	 * The number of structural features of the '<em>Data25 DIO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA25_DIO_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Save XYZ</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA25_DIO___SAVE_XYZ__VOLUMETRICCOORDINATESSET25D_STRING = 0;

	/**
	 * The operation id for the '<em>Load XYZ</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA25_DIO___LOAD_XYZ__STRING = 1;

	/**
	 * The number of operations of the '<em>Data25 DIO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA25_DIO_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '<em>IO Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.IOException
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DPackageImpl#getIOException()
	 * @generated
	 */
	int IO_EXCEPTION = 9;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D <em>Coordinates25 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinates25 D</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D
	 * @generated
	 */
	EClass getCoordinates25D();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>U</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D#getU()
	 * @see #getCoordinates25D()
	 * @generated
	 */
	EAttribute getCoordinates25D_U();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D#getV <em>V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D#getV()
	 * @see #getCoordinates25D()
	 * @generated
	 */
	EAttribute getCoordinates25D_V();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>W</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D#getW()
	 * @see #getCoordinates25D()
	 * @generated
	 */
	EAttribute getCoordinates25D_W();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.CoordinatesSet25D <em>Coordinates Set25 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinates Set25 D</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.CoordinatesSet25D
	 * @generated
	 */
	EClass getCoordinatesSet25D();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.CoordinatesSet25D#isEnforceUniqueness <em>Enforce Uniqueness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enforce Uniqueness</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.CoordinatesSet25D#isEnforceUniqueness()
	 * @see #getCoordinatesSet25D()
	 * @generated
	 */
	EAttribute getCoordinatesSet25D_EnforceUniqueness();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.VolumetricCoordinatesSet25D <em>Volumetric Coordinates Set25 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volumetric Coordinates Set25 D</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.VolumetricCoordinatesSet25D
	 * @generated
	 */
	EClass getVolumetricCoordinatesSet25D();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.VolumetricCoordinatesSet25D#getCartesianPositionCoordinates(ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D) <em>Get Cartesian Position Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cartesian Position Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.VolumetricCoordinatesSet25D#getCartesianPositionCoordinates(ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D)
	 * @generated
	 */
	EOperation getVolumetricCoordinatesSet25D__GetCartesianPositionCoordinates__Coordinates25D();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.Polygon25D <em>Polygon25 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon25 D</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.Polygon25D
	 * @generated
	 */
	EClass getPolygon25D();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.Mesh25D <em>Mesh25 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mesh25 D</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.Mesh25D
	 * @generated
	 */
	EClass getMesh25D();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.VolumetricMesh25D <em>Volumetric Mesh25 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volumetric Mesh25 D</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.VolumetricMesh25D
	 * @generated
	 */
	EClass getVolumetricMesh25D();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.CoordinatesSet25DFilter <em>Coordinates Set25 DFilter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinates Set25 DFilter</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.CoordinatesSet25DFilter
	 * @generated
	 */
	EClass getCoordinatesSet25DFilter();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.CoordinatesSet25DFilter#createCoordinatesSet25D() <em>Create Coordinates Set25 D</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Coordinates Set25 D</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.CoordinatesSet25DFilter#createCoordinatesSet25D()
	 * @generated
	 */
	EOperation getCoordinatesSet25DFilter__CreateCoordinatesSet25D();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DFacade
	 * @generated
	 */
	EClass getApogyCommonGeometryData25DFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DFacade#createCoordinates25D(ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D) <em>Create Coordinates25 D</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Coordinates25 D</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DFacade#createCoordinates25D(ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData25DFacade__CreateCoordinates25D__Coordinates25D();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DFacade#createCoordinates25D(double, double, double) <em>Create Coordinates25 D</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Coordinates25 D</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DFacade#createCoordinates25D(double, double, double)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData25DFacade__CreateCoordinates25D__double_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DFacade#createCartesianCoordinatesSet(ca.gc.asc_csa.apogy.common.geometry.data25d.VolumetricCoordinatesSet25D) <em>Create Cartesian Coordinates Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Coordinates Set</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DFacade#createCartesianCoordinatesSet(ca.gc.asc_csa.apogy.common.geometry.data25d.VolumetricCoordinatesSet25D)
	 * @generated
	 */
	EOperation getApogyCommonGeometryData25DFacade__CreateCartesianCoordinatesSet__VolumetricCoordinatesSet25D();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.Data25DIO <em>Data25 DIO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data25 DIO</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.Data25DIO
	 * @generated
	 */
	EClass getData25DIO();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.Data25DIO#saveXYZ(ca.gc.asc_csa.apogy.common.geometry.data25d.VolumetricCoordinatesSet25D, java.lang.String) <em>Save XYZ</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save XYZ</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.Data25DIO#saveXYZ(ca.gc.asc_csa.apogy.common.geometry.data25d.VolumetricCoordinatesSet25D, java.lang.String)
	 * @generated
	 */
	EOperation getData25DIO__SaveXYZ__VolumetricCoordinatesSet25D_String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.Data25DIO#loadXYZ(java.lang.String) <em>Load XYZ</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load XYZ</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.Data25DIO#loadXYZ(java.lang.String)
	 * @generated
	 */
	EOperation getData25DIO__LoadXYZ__String();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCommonGeometryData25DFactory getApogyCommonGeometryData25DFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.impl.Coordinates25DImpl <em>Coordinates25 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.Coordinates25DImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DPackageImpl#getCoordinates25D()
		 * @generated
		 */
		EClass COORDINATES25_D = eINSTANCE.getCoordinates25D();

		/**
		 * The meta object literal for the '<em><b>U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES25_D__U = eINSTANCE.getCoordinates25D_U();

		/**
		 * The meta object literal for the '<em><b>V</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES25_D__V = eINSTANCE.getCoordinates25D_V();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES25_D__W = eINSTANCE.getCoordinates25D_W();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.impl.CoordinatesSet25DImpl <em>Coordinates Set25 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.CoordinatesSet25DImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DPackageImpl#getCoordinatesSet25D()
		 * @generated
		 */
		EClass COORDINATES_SET25_D = eINSTANCE.getCoordinatesSet25D();

		/**
		 * The meta object literal for the '<em><b>Enforce Uniqueness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES_SET25_D__ENFORCE_UNIQUENESS = eINSTANCE.getCoordinatesSet25D_EnforceUniqueness();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.impl.VolumetricCoordinatesSet25DImpl <em>Volumetric Coordinates Set25 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.VolumetricCoordinatesSet25DImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DPackageImpl#getVolumetricCoordinatesSet25D()
		 * @generated
		 */
		EClass VOLUMETRIC_COORDINATES_SET25_D = eINSTANCE.getVolumetricCoordinatesSet25D();

		/**
		 * The meta object literal for the '<em><b>Get Cartesian Position Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VOLUMETRIC_COORDINATES_SET25_D___GET_CARTESIAN_POSITION_COORDINATES__COORDINATES25D = eINSTANCE.getVolumetricCoordinatesSet25D__GetCartesianPositionCoordinates__Coordinates25D();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.impl.Polygon25DImpl <em>Polygon25 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.Polygon25DImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DPackageImpl#getPolygon25D()
		 * @generated
		 */
		EClass POLYGON25_D = eINSTANCE.getPolygon25D();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.impl.Mesh25DImpl <em>Mesh25 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.Mesh25DImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DPackageImpl#getMesh25D()
		 * @generated
		 */
		EClass MESH25_D = eINSTANCE.getMesh25D();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.impl.VolumetricMesh25DImpl <em>Volumetric Mesh25 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.VolumetricMesh25DImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DPackageImpl#getVolumetricMesh25D()
		 * @generated
		 */
		EClass VOLUMETRIC_MESH25_D = eINSTANCE.getVolumetricMesh25D();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.impl.CoordinatesSet25DFilterImpl <em>Coordinates Set25 DFilter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.CoordinatesSet25DFilterImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DPackageImpl#getCoordinatesSet25DFilter()
		 * @generated
		 */
		EClass COORDINATES_SET25_DFILTER = eINSTANCE.getCoordinatesSet25DFilter();

		/**
		 * The meta object literal for the '<em><b>Create Coordinates Set25 D</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COORDINATES_SET25_DFILTER___CREATE_COORDINATES_SET25_D = eINSTANCE.getCoordinatesSet25DFilter__CreateCoordinatesSet25D();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DFacadeImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DPackageImpl#getApogyCommonGeometryData25DFacade()
		 * @generated
		 */
		EClass APOGY_COMMON_GEOMETRY_DATA25_DFACADE = eINSTANCE.getApogyCommonGeometryData25DFacade();

		/**
		 * The meta object literal for the '<em><b>Create Coordinates25 D</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA25_DFACADE___CREATE_COORDINATES25_D__COORDINATES25D = eINSTANCE.getApogyCommonGeometryData25DFacade__CreateCoordinates25D__Coordinates25D();

		/**
		 * The meta object literal for the '<em><b>Create Coordinates25 D</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA25_DFACADE___CREATE_COORDINATES25_D__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getApogyCommonGeometryData25DFacade__CreateCoordinates25D__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Coordinates Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_GEOMETRY_DATA25_DFACADE___CREATE_CARTESIAN_COORDINATES_SET__VOLUMETRICCOORDINATESSET25D = eINSTANCE.getApogyCommonGeometryData25DFacade__CreateCartesianCoordinatesSet__VolumetricCoordinatesSet25D();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.impl.Data25DIOImpl <em>Data25 DIO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.Data25DIOImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DPackageImpl#getData25DIO()
		 * @generated
		 */
		EClass DATA25_DIO = eINSTANCE.getData25DIO();

		/**
		 * The meta object literal for the '<em><b>Save XYZ</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA25_DIO___SAVE_XYZ__VOLUMETRICCOORDINATESSET25D_STRING = eINSTANCE.getData25DIO__SaveXYZ__VolumetricCoordinatesSet25D_String();

		/**
		 * The meta object literal for the '<em><b>Load XYZ</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA25_DIO___LOAD_XYZ__STRING = eINSTANCE.getData25DIO__LoadXYZ__String();

		/**
		 * The meta object literal for the '<em>IO Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.IOException
		 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DPackageImpl#getIOException()
		 * @generated
		 */
		EDataType IO_EXCEPTION = eINSTANCE.getIOException();

	}

} //ApogyCommonGeometryData25DPackage
