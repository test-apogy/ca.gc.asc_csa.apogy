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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ApogyCommonGeometryData3DASCFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCommonGeometryData3DASC' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='ApogyCommonGeometryData3DASC' complianceLevel='6.0' suppressGenModelAnnotations='false' modelDirectory='/ca.gc.asc_csa.apogy.common.geometry.data3d.asc/src-generated' editDirectory='/ca.gc.asc_csa.apogy.common.geometry.data3d.asc.edit/src-generated' testsDirectory='/ca.gc.asc_csa.apogy.common.geometry.data3d.asc.tests/src-generated' basePackage='ca.gc.asc_csa.apogy.common.geometry.data3d'"
 * @generated
 */
public interface ApogyCommonGeometryData3DASCPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "asc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.common.geometry.data3d.asc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "asc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonGeometryData3DASCPackage eINSTANCE = ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.ApogyCommonGeometryData3DASCPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.ASC3DIOImpl <em>ASC3DIO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.ASC3DIOImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.ApogyCommonGeometryData3DASCPackageImpl#getASC3DIO()
	 * @generated
	 */
	int ASC3DIO = 0;

	/**
	 * The number of structural features of the '<em>ASC3DIO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC3DIO_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Load Digital Elevation Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC3DIO___LOAD_DIGITAL_ELEVATION_MAP__STRING_ALTITUDEMODE = 0;

	/**
	 * The operation id for the '<em>Load Digital Elevation Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC3DIO___LOAD_DIGITAL_ELEVATION_MAP__STRING_ALTITUDEMODE_DOUBLE = 1;

	/**
	 * The operation id for the '<em>Load Digital Elevation Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC3DIO___LOAD_DIGITAL_ELEVATION_MAP__STRING_ALTITUDEMODE_COORDINATES2D_COORDINATES2D = 2;

	/**
	 * The operation id for the '<em>Load Digital Elevation Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC3DIO___LOAD_DIGITAL_ELEVATION_MAP__STRING_ALTITUDEMODE_COORDINATES2D_COORDINATES2D_DOUBLE = 3;

	/**
	 * The operation id for the '<em>Load Triangular Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC3DIO___LOAD_TRIANGULAR_MESH__STRING_ALTITUDEMODE = 4;

	/**
	 * The operation id for the '<em>Load Triangular Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC3DIO___LOAD_TRIANGULAR_MESH__STRING_ALTITUDEMODE_DOUBLE = 5;

	/**
	 * The operation id for the '<em>Load Triangular Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC3DIO___LOAD_TRIANGULAR_MESH__STRING_ALTITUDEMODE_COORDINATES2D_COORDINATES2D = 6;

	/**
	 * The operation id for the '<em>Load Triangular Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC3DIO___LOAD_TRIANGULAR_MESH__STRING_ALTITUDEMODE_COORDINATES2D_COORDINATES2D_DOUBLE = 7;

	/**
	 * The number of operations of the '<em>ASC3DIO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC3DIO_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.ASCHeaderDataImpl <em>ASC Header Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.ASCHeaderDataImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.ApogyCommonGeometryData3DASCPackageImpl#getASCHeaderData()
	 * @generated
	 */
	int ASC_HEADER_DATA = 1;

	/**
	 * The feature id for the '<em><b>Number Of Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC_HEADER_DATA__NUMBER_OF_ROW = 0;

	/**
	 * The feature id for the '<em><b>Number Of Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC_HEADER_DATA__NUMBER_OF_COLUMNS = 1;

	/**
	 * The feature id for the '<em><b>Xll Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC_HEADER_DATA__XLL_CENTER = 2;

	/**
	 * The feature id for the '<em><b>Yll Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC_HEADER_DATA__YLL_CENTER = 3;

	/**
	 * The feature id for the '<em><b>Cell Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC_HEADER_DATA__CELL_SIZE = 4;

	/**
	 * The feature id for the '<em><b>No Data Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC_HEADER_DATA__NO_DATA_VALUE = 5;

	/**
	 * The number of structural features of the '<em>ASC Header Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC_HEADER_DATA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>ASC Header Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC_HEADER_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.Coordinates2DImpl <em>Coordinates2 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.Coordinates2DImpl
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.ApogyCommonGeometryData3DASCPackageImpl#getCoordinates2D()
	 * @generated
	 */
	int COORDINATES2_D = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES2_D__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES2_D__Y = 1;

	/**
	 * The number of structural features of the '<em>Coordinates2 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES2_D_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Coordinates2 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES2_D_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode <em>Altitude Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.ApogyCommonGeometryData3DASCPackageImpl#getAltitudeMode()
	 * @generated
	 */
	int ALTITUDE_MODE = 3;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.ApogyCommonGeometryData3DASCPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 4;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO <em>ASC3DIO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ASC3DIO</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO
	 * @generated
	 */
	EClass getASC3DIO();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode) <em>Load Digital Elevation Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Digital Elevation Map</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode)
	 * @generated
	 */
	EOperation getASC3DIO__LoadDigitalElevationMap__String_AltitudeMode();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, double) <em>Load Digital Elevation Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Digital Elevation Map</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, double)
	 * @generated
	 */
	EOperation getASC3DIO__LoadDigitalElevationMap__String_AltitudeMode_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D) <em>Load Digital Elevation Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Digital Elevation Map</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D)
	 * @generated
	 */
	EOperation getASC3DIO__LoadDigitalElevationMap__String_AltitudeMode_Coordinates2D_Coordinates2D();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, double) <em>Load Digital Elevation Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Digital Elevation Map</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, double)
	 * @generated
	 */
	EOperation getASC3DIO__LoadDigitalElevationMap__String_AltitudeMode_Coordinates2D_Coordinates2D_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode) <em>Load Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Triangular Mesh</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode)
	 * @generated
	 */
	EOperation getASC3DIO__LoadTriangularMesh__String_AltitudeMode();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, double) <em>Load Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Triangular Mesh</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, double)
	 * @generated
	 */
	EOperation getASC3DIO__LoadTriangularMesh__String_AltitudeMode_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D) <em>Load Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Triangular Mesh</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D)
	 * @generated
	 */
	EOperation getASC3DIO__LoadTriangularMesh__String_AltitudeMode_Coordinates2D_Coordinates2D();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, double) <em>Load Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Triangular Mesh</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, double)
	 * @generated
	 */
	EOperation getASC3DIO__LoadTriangularMesh__String_AltitudeMode_Coordinates2D_Coordinates2D_double();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASCHeaderData <em>ASC Header Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ASC Header Data</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASCHeaderData
	 * @generated
	 */
	EClass getASCHeaderData();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASCHeaderData#getNumberOfRow <em>Number Of Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Row</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASCHeaderData#getNumberOfRow()
	 * @see #getASCHeaderData()
	 * @generated
	 */
	EAttribute getASCHeaderData_NumberOfRow();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASCHeaderData#getNumberOfColumns <em>Number Of Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Columns</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASCHeaderData#getNumberOfColumns()
	 * @see #getASCHeaderData()
	 * @generated
	 */
	EAttribute getASCHeaderData_NumberOfColumns();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASCHeaderData#getXllCenter <em>Xll Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xll Center</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASCHeaderData#getXllCenter()
	 * @see #getASCHeaderData()
	 * @generated
	 */
	EAttribute getASCHeaderData_XllCenter();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASCHeaderData#getYllCenter <em>Yll Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yll Center</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASCHeaderData#getYllCenter()
	 * @see #getASCHeaderData()
	 * @generated
	 */
	EAttribute getASCHeaderData_YllCenter();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASCHeaderData#getCellSize <em>Cell Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Size</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASCHeaderData#getCellSize()
	 * @see #getASCHeaderData()
	 * @generated
	 */
	EAttribute getASCHeaderData_CellSize();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASCHeaderData#getNoDataValue <em>No Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Data Value</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASCHeaderData#getNoDataValue()
	 * @see #getASCHeaderData()
	 * @generated
	 */
	EAttribute getASCHeaderData_NoDataValue();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D <em>Coordinates2 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinates2 D</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D
	 * @generated
	 */
	EClass getCoordinates2D();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D#getX()
	 * @see #getCoordinates2D()
	 * @generated
	 */
	EAttribute getCoordinates2D_X();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D#getY()
	 * @see #getCoordinates2D()
	 * @generated
	 */
	EAttribute getCoordinates2D_Y();

	/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode <em>Altitude Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Altitude Mode</em>'.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode
	 * @generated
	 */
	EEnum getAltitudeMode();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCommonGeometryData3DASCFactory getApogyCommonGeometryData3DASCFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.ASC3DIOImpl <em>ASC3DIO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.ASC3DIOImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.ApogyCommonGeometryData3DASCPackageImpl#getASC3DIO()
		 * @generated
		 */
		EClass ASC3DIO = eINSTANCE.getASC3DIO();

		/**
		 * The meta object literal for the '<em><b>Load Digital Elevation Map</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASC3DIO___LOAD_DIGITAL_ELEVATION_MAP__STRING_ALTITUDEMODE = eINSTANCE.getASC3DIO__LoadDigitalElevationMap__String_AltitudeMode();

		/**
		 * The meta object literal for the '<em><b>Load Digital Elevation Map</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASC3DIO___LOAD_DIGITAL_ELEVATION_MAP__STRING_ALTITUDEMODE_DOUBLE = eINSTANCE.getASC3DIO__LoadDigitalElevationMap__String_AltitudeMode_double();

		/**
		 * The meta object literal for the '<em><b>Load Digital Elevation Map</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASC3DIO___LOAD_DIGITAL_ELEVATION_MAP__STRING_ALTITUDEMODE_COORDINATES2D_COORDINATES2D = eINSTANCE.getASC3DIO__LoadDigitalElevationMap__String_AltitudeMode_Coordinates2D_Coordinates2D();

		/**
		 * The meta object literal for the '<em><b>Load Digital Elevation Map</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASC3DIO___LOAD_DIGITAL_ELEVATION_MAP__STRING_ALTITUDEMODE_COORDINATES2D_COORDINATES2D_DOUBLE = eINSTANCE.getASC3DIO__LoadDigitalElevationMap__String_AltitudeMode_Coordinates2D_Coordinates2D_double();

		/**
		 * The meta object literal for the '<em><b>Load Triangular Mesh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASC3DIO___LOAD_TRIANGULAR_MESH__STRING_ALTITUDEMODE = eINSTANCE.getASC3DIO__LoadTriangularMesh__String_AltitudeMode();

		/**
		 * The meta object literal for the '<em><b>Load Triangular Mesh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASC3DIO___LOAD_TRIANGULAR_MESH__STRING_ALTITUDEMODE_DOUBLE = eINSTANCE.getASC3DIO__LoadTriangularMesh__String_AltitudeMode_double();

		/**
		 * The meta object literal for the '<em><b>Load Triangular Mesh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASC3DIO___LOAD_TRIANGULAR_MESH__STRING_ALTITUDEMODE_COORDINATES2D_COORDINATES2D = eINSTANCE.getASC3DIO__LoadTriangularMesh__String_AltitudeMode_Coordinates2D_Coordinates2D();

		/**
		 * The meta object literal for the '<em><b>Load Triangular Mesh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASC3DIO___LOAD_TRIANGULAR_MESH__STRING_ALTITUDEMODE_COORDINATES2D_COORDINATES2D_DOUBLE = eINSTANCE.getASC3DIO__LoadTriangularMesh__String_AltitudeMode_Coordinates2D_Coordinates2D_double();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.ASCHeaderDataImpl <em>ASC Header Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.ASCHeaderDataImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.ApogyCommonGeometryData3DASCPackageImpl#getASCHeaderData()
		 * @generated
		 */
		EClass ASC_HEADER_DATA = eINSTANCE.getASCHeaderData();

		/**
		 * The meta object literal for the '<em><b>Number Of Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASC_HEADER_DATA__NUMBER_OF_ROW = eINSTANCE.getASCHeaderData_NumberOfRow();

		/**
		 * The meta object literal for the '<em><b>Number Of Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASC_HEADER_DATA__NUMBER_OF_COLUMNS = eINSTANCE.getASCHeaderData_NumberOfColumns();

		/**
		 * The meta object literal for the '<em><b>Xll Center</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASC_HEADER_DATA__XLL_CENTER = eINSTANCE.getASCHeaderData_XllCenter();

		/**
		 * The meta object literal for the '<em><b>Yll Center</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASC_HEADER_DATA__YLL_CENTER = eINSTANCE.getASCHeaderData_YllCenter();

		/**
		 * The meta object literal for the '<em><b>Cell Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASC_HEADER_DATA__CELL_SIZE = eINSTANCE.getASCHeaderData_CellSize();

		/**
		 * The meta object literal for the '<em><b>No Data Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASC_HEADER_DATA__NO_DATA_VALUE = eINSTANCE.getASCHeaderData_NoDataValue();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.Coordinates2DImpl <em>Coordinates2 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.Coordinates2DImpl
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.ApogyCommonGeometryData3DASCPackageImpl#getCoordinates2D()
		 * @generated
		 */
		EClass COORDINATES2_D = eINSTANCE.getCoordinates2D();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES2_D__X = eINSTANCE.getCoordinates2D_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES2_D__Y = eINSTANCE.getCoordinates2D_Y();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode <em>Altitude Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.ApogyCommonGeometryData3DASCPackageImpl#getAltitudeMode()
		 * @generated
		 */
		EEnum ALTITUDE_MODE = eINSTANCE.getAltitudeMode();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.ApogyCommonGeometryData3DASCPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

	}

} //ApogyCommonGeometryData3DASCPackage
