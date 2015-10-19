/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.las;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.symphony.common.geometry.data3d.las.LasFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Las' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)' modelName='Las' operationReflection='true' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.common.geometry.data3d.las/src-generated' editDirectory='/org.eclipse.symphony.common.geometry.data3d.las.edit/src-generated' basePackage='org.eclipse.symphony.common.geometry.data3d'"
 * @generated
 */
public interface LasPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "las";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.symphony.common.geometry.data3d.las";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "las";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LasPackage eINSTANCE = org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.las.impl.LASHeaderImpl <em>LAS Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LASHeaderImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getLASHeader()
	 * @generated
	 */
	int LAS_HEADER = 0;

	/**
	 * The feature id for the '<em><b>File Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__FILE_SIGNATURE = 0;

	/**
	 * The feature id for the '<em><b>File Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__FILE_SOURCE_ID = 1;

	/**
	 * The feature id for the '<em><b>Global Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__GLOBAL_ENCODING = 2;

	/**
	 * The feature id for the '<em><b>Project ID GUID data 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__PROJECT_ID_GUID_DATA_1 = 3;

	/**
	 * The feature id for the '<em><b>Project ID GUID data 2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__PROJECT_ID_GUID_DATA_2 = 4;

	/**
	 * The feature id for the '<em><b>Project ID GUID data 3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__PROJECT_ID_GUID_DATA_3 = 5;

	/**
	 * The feature id for the '<em><b>Project ID GUID data 4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__PROJECT_ID_GUID_DATA_4 = 6;

	/**
	 * The feature id for the '<em><b>Version Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__VERSION_MAJOR = 7;

	/**
	 * The feature id for the '<em><b>Version Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__VERSION_MINOR = 8;

	/**
	 * The feature id for the '<em><b>System Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__SYSTEM_IDENTIFIER = 9;

	/**
	 * The feature id for the '<em><b>Generating Software</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__GENERATING_SOFTWARE = 10;

	/**
	 * The feature id for the '<em><b>File Creation Day Of Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__FILE_CREATION_DAY_OF_YEAR = 11;

	/**
	 * The feature id for the '<em><b>File Creation Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__FILE_CREATION_YEAR = 12;

	/**
	 * The feature id for the '<em><b>Header Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__HEADER_SIZE = 13;

	/**
	 * The feature id for the '<em><b>Offset To Point Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__OFFSET_TO_POINT_DATA = 14;

	/**
	 * The feature id for the '<em><b>NVariable Length Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__NVARIABLE_LENGTH_RECORDS = 15;

	/**
	 * The feature id for the '<em><b>Point Data Format ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__POINT_DATA_FORMAT_ID = 16;

	/**
	 * The feature id for the '<em><b>Point Data Record Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__POINT_DATA_RECORD_LENGTH = 17;

	/**
	 * The feature id for the '<em><b>Number Of Point Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__NUMBER_OF_POINT_RECORDS = 18;

	/**
	 * The feature id for the '<em><b>Number Of Points By Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__NUMBER_OF_POINTS_BY_RETURN = 19;

	/**
	 * The feature id for the '<em><b>XScale Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__XSCALE_FACTOR = 20;

	/**
	 * The feature id for the '<em><b>YScale Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__YSCALE_FACTOR = 21;

	/**
	 * The feature id for the '<em><b>ZScale Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__ZSCALE_FACTOR = 22;

	/**
	 * The feature id for the '<em><b>XOffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__XOFFSET = 23;

	/**
	 * The feature id for the '<em><b>YOffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__YOFFSET = 24;

	/**
	 * The feature id for the '<em><b>ZOffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__ZOFFSET = 25;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__MAX_X = 26;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__MIN_X = 27;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__MAX_Y = 28;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__MIN_Y = 29;

	/**
	 * The feature id for the '<em><b>Max Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__MAX_Z = 30;

	/**
	 * The feature id for the '<em><b>Min Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__MIN_Z = 31;

	/**
	 * The feature id for the '<em><b>Start Of Waveform Data Packet Record</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER__START_OF_WAVEFORM_DATA_PACKET_RECORD = 32;

	/**
	 * The number of structural features of the '<em>LAS Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER_FEATURE_COUNT = 33;

	/**
	 * The number of operations of the '<em>LAS Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.las.impl.VariableLengthRecordImpl <em>Variable Length Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.VariableLengthRecordImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getVariableLengthRecord()
	 * @generated
	 */
	int VARIABLE_LENGTH_RECORD = 1;

	/**
	 * The feature id for the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_LENGTH_RECORD__RESERVED = 0;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_LENGTH_RECORD__USER_ID = 1;

	/**
	 * The feature id for the '<em><b>Record ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_LENGTH_RECORD__RECORD_ID = 2;

	/**
	 * The feature id for the '<em><b>Record Lenght After Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_LENGTH_RECORD__RECORD_LENGHT_AFTER_HEADER = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_LENGTH_RECORD__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Variable Length Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_LENGTH_RECORD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Variable Length Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_LENGTH_RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.las.impl.LASReaderImpl <em>LAS Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LASReaderImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getLASReader()
	 * @generated
	 */
	int LAS_READER = 2;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_READER__FILE = 0;

	/**
	 * The feature id for the '<em><b>Input Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_READER__INPUT_STREAM = 1;

	/**
	 * The feature id for the '<em><b>Vlrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_READER__VLRS = 2;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_READER__PROGRESS_MONITOR = 3;

	/**
	 * The feature id for the '<em><b>Header</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_READER__HEADER = 4;

	/**
	 * The feature id for the '<em><b>Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_READER__POINTS = 5;

	/**
	 * The number of structural features of the '<em>LAS Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_READER_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Read</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_READER___READ = 0;

	/**
	 * The number of operations of the '<em>LAS Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_READER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.las.impl.LASPointImpl <em>LAS Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LASPointImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getLASPoint()
	 * @generated
	 */
	int LAS_POINT = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_POINT__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_POINT__Z = 2;

	/**
	 * The feature id for the '<em><b>Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_POINT__INTENSITY = 3;

	/**
	 * The feature id for the '<em><b>Return Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_POINT__RETURN_NUMBER = 4;

	/**
	 * The feature id for the '<em><b>Number Of Returns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_POINT__NUMBER_OF_RETURNS = 5;

	/**
	 * The feature id for the '<em><b>Scan Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_POINT__SCAN_DIRECTION = 6;

	/**
	 * The feature id for the '<em><b>Edge Of Flight Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_POINT__EDGE_OF_FLIGHT_LINE = 7;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_POINT__CLASSIFICATION = 8;

	/**
	 * The feature id for the '<em><b>Scan Angle Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_POINT__SCAN_ANGLE_RANK = 9;

	/**
	 * The feature id for the '<em><b>User Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_POINT__USER_DATA = 10;

	/**
	 * The feature id for the '<em><b>Point Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_POINT__POINT_SOURCE_ID = 11;

	/**
	 * The feature id for the '<em><b>Gps Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_POINT__GPS_TIME = 12;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_POINT__RED = 13;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_POINT__GREEN = 14;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_POINT__BLUE = 15;

	/**
	 * The number of structural features of the '<em>LAS Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_POINT_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>LAS Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.las.impl.LASFacadeImpl <em>LAS Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LASFacadeImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getLASFacade()
	 * @generated
	 */
	int LAS_FACADE = 4;

	/**
	 * The number of structural features of the '<em>LAS Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_FACADE___CREATE_POINT__INT_BYTE = 0;

	/**
	 * The number of operations of the '<em>LAS Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_FACADE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.las.impl.LASWriterImpl <em>LAS Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LASWriterImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getLASWriter()
	 * @generated
	 */
	int LAS_WRITER = 5;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_WRITER__FILE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_WRITER__PROGRESS_MONITOR = 1;

	/**
	 * The feature id for the '<em><b>Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_WRITER__POINTS = 2;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_WRITER__SCALE_X = 3;

	/**
	 * The feature id for the '<em><b>Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_WRITER__SCALE_Y = 4;

	/**
	 * The feature id for the '<em><b>Scale Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_WRITER__SCALE_Z = 5;

	/**
	 * The feature id for the '<em><b>Header</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_WRITER__HEADER = 6;

	/**
	 * The feature id for the '<em><b>XOffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_WRITER__XOFFSET = 7;

	/**
	 * The feature id for the '<em><b>YOffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_WRITER__YOFFSET = 8;

	/**
	 * The feature id for the '<em><b>ZOffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_WRITER__ZOFFSET = 9;

	/**
	 * The feature id for the '<em><b>Output Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_WRITER__OUTPUT_STREAM = 10;

	/**
	 * The number of structural features of the '<em>LAS Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_WRITER_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Write</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_WRITER___WRITE = 0;

	/**
	 * The number of operations of the '<em>LAS Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAS_WRITER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.las.ScanDirection <em>Scan Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.las.ScanDirection
	 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getScanDirection()
	 * @generated
	 */
	int SCAN_DIRECTION = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.las.EdgeOfFlightLine <em>Edge Of Flight Line</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.las.EdgeOfFlightLine
	 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getEdgeOfFlightLine()
	 * @generated
	 */
	int EDGE_OF_FLIGHT_LINE = 7;

	/**
	 * The meta object id for the '<em>IProgress Monitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getIProgressMonitor()
	 * @generated
	 */
	int IPROGRESS_MONITOR = 8;

	/**
	 * The meta object id for the '<em>Char Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getCharArray()
	 * @generated
	 */
	int CHAR_ARRAY = 9;

	/**
	 * The meta object id for the '<em>Long Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getLongArray()
	 * @generated
	 */
	int LONG_ARRAY = 10;

	/**
	 * The meta object id for the '<em>Input Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.InputStream
	 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getInputStream()
	 * @generated
	 */
	int INPUT_STREAM = 11;

	/**
	 * The meta object id for the '<em>IO Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.IOException
	 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getIOException()
	 * @generated
	 */
	int IO_EXCEPTION = 12;

	/**
	 * The meta object id for the '<em>Output Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.OutputStream
	 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getOutputStream()
	 * @generated
	 */
	int OUTPUT_STREAM = 13;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 14;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader <em>LAS Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LAS Header</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader
	 * @generated
	 */
	EClass getLASHeader();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getFileSignature <em>File Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Signature</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getFileSignature()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_FileSignature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getFileSourceID <em>File Source ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Source ID</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getFileSourceID()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_FileSourceID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getGlobalEncoding <em>Global Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Encoding</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getGlobalEncoding()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_GlobalEncoding();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getProjectID_GUID_data_1 <em>Project ID GUID data 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project ID GUID data 1</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getProjectID_GUID_data_1()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_ProjectID_GUID_data_1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getProjectID_GUID_data_2 <em>Project ID GUID data 2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project ID GUID data 2</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getProjectID_GUID_data_2()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_ProjectID_GUID_data_2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getProjectID_GUID_data_3 <em>Project ID GUID data 3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project ID GUID data 3</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getProjectID_GUID_data_3()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_ProjectID_GUID_data_3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getProjectID_GUID_data_4 <em>Project ID GUID data 4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project ID GUID data 4</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getProjectID_GUID_data_4()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_ProjectID_GUID_data_4();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getVersionMajor <em>Version Major</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Major</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getVersionMajor()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_VersionMajor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getVersionMinor <em>Version Minor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Minor</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getVersionMinor()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_VersionMinor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getSystemIdentifier <em>System Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Identifier</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getSystemIdentifier()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_SystemIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getGeneratingSoftware <em>Generating Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generating Software</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getGeneratingSoftware()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_GeneratingSoftware();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getFileCreationDayOfYear <em>File Creation Day Of Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Creation Day Of Year</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getFileCreationDayOfYear()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_FileCreationDayOfYear();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getFileCreationYear <em>File Creation Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Creation Year</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getFileCreationYear()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_FileCreationYear();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getHeaderSize <em>Header Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Size</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getHeaderSize()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_HeaderSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getOffsetToPointData <em>Offset To Point Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset To Point Data</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getOffsetToPointData()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_OffsetToPointData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getNVariableLengthRecords <em>NVariable Length Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NVariable Length Records</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getNVariableLengthRecords()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_NVariableLengthRecords();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getPointDataFormatID <em>Point Data Format ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point Data Format ID</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getPointDataFormatID()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_PointDataFormatID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getPointDataRecordLength <em>Point Data Record Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point Data Record Length</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getPointDataRecordLength()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_PointDataRecordLength();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getNumberOfPointRecords <em>Number Of Point Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Point Records</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getNumberOfPointRecords()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_NumberOfPointRecords();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getNumberOfPointsByReturn <em>Number Of Points By Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Points By Return</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getNumberOfPointsByReturn()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_NumberOfPointsByReturn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getXScaleFactor <em>XScale Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XScale Factor</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getXScaleFactor()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_XScaleFactor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getYScaleFactor <em>YScale Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YScale Factor</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getYScaleFactor()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_YScaleFactor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getZScaleFactor <em>ZScale Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZScale Factor</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getZScaleFactor()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_ZScaleFactor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getXOffset <em>XOffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XOffset</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getXOffset()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_XOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getYOffset <em>YOffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YOffset</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getYOffset()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_YOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getZOffset <em>ZOffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZOffset</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getZOffset()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_ZOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMaxX <em>Max X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max X</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMaxX()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_MaxX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMinX <em>Min X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min X</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMinX()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_MinX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMaxY <em>Max Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Y</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMaxY()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_MaxY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMinY <em>Min Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Y</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMinY()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_MinY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMaxZ <em>Max Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Z</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMaxZ()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_MaxZ();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMinZ <em>Min Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Z</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMinZ()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_MinZ();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getStartOfWaveformDataPacketRecord <em>Start Of Waveform Data Packet Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Of Waveform Data Packet Record</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getStartOfWaveformDataPacketRecord()
	 * @see #getLASHeader()
	 * @generated
	 */
	EAttribute getLASHeader_StartOfWaveformDataPacketRecord();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord <em>Variable Length Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Length Record</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord
	 * @generated
	 */
	EClass getVariableLengthRecord();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord#getReserved <em>Reserved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord#getReserved()
	 * @see #getVariableLengthRecord()
	 * @generated
	 */
	EAttribute getVariableLengthRecord_Reserved();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord#getUserID()
	 * @see #getVariableLengthRecord()
	 * @generated
	 */
	EAttribute getVariableLengthRecord_UserID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord#getRecordID <em>Record ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Record ID</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord#getRecordID()
	 * @see #getVariableLengthRecord()
	 * @generated
	 */
	EAttribute getVariableLengthRecord_RecordID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord#getRecordLenghtAfterHeader <em>Record Lenght After Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Record Lenght After Header</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord#getRecordLenghtAfterHeader()
	 * @see #getVariableLengthRecord()
	 * @generated
	 */
	EAttribute getVariableLengthRecord_RecordLenghtAfterHeader();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord#getDescription()
	 * @see #getVariableLengthRecord()
	 * @generated
	 */
	EAttribute getVariableLengthRecord_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.las.LASReader <em>LAS Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LAS Reader</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASReader
	 * @generated
	 */
	EClass getLASReader();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASReader#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASReader#getFile()
	 * @see #getLASReader()
	 * @generated
	 */
	EAttribute getLASReader_File();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASReader#getInputStream <em>Input Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Stream</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASReader#getInputStream()
	 * @see #getLASReader()
	 * @generated
	 */
	EAttribute getLASReader_InputStream();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.symphony.common.geometry.data3d.las.LASReader#getVlrs <em>Vlrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vlrs</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASReader#getVlrs()
	 * @see #getLASReader()
	 * @generated
	 */
	EReference getLASReader_Vlrs();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASReader#getProgressMonitor <em>Progress Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Progress Monitor</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASReader#getProgressMonitor()
	 * @see #getLASReader()
	 * @generated
	 */
	EAttribute getLASReader_ProgressMonitor();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.geometry.data3d.las.LASReader#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Header</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASReader#getHeader()
	 * @see #getLASReader()
	 * @generated
	 */
	EReference getLASReader_Header();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.symphony.common.geometry.data3d.las.LASReader#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Points</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASReader#getPoints()
	 * @see #getLASReader()
	 * @generated
	 */
	EReference getLASReader_Points();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASReader#read() <em>Read</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASReader#read()
	 * @generated
	 */
	EOperation getLASReader__Read();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.las.LASPoint <em>LAS Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LAS Point</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASPoint
	 * @generated
	 */
	EClass getLASPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getX()
	 * @see #getLASPoint()
	 * @generated
	 */
	EAttribute getLASPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getY()
	 * @see #getLASPoint()
	 * @generated
	 */
	EAttribute getLASPoint_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getZ()
	 * @see #getLASPoint()
	 * @generated
	 */
	EAttribute getLASPoint_Z();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getIntensity <em>Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intensity</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getIntensity()
	 * @see #getLASPoint()
	 * @generated
	 */
	EAttribute getLASPoint_Intensity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getReturnNumber <em>Return Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Number</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getReturnNumber()
	 * @see #getLASPoint()
	 * @generated
	 */
	EAttribute getLASPoint_ReturnNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getNumberOfReturns <em>Number Of Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Returns</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getNumberOfReturns()
	 * @see #getLASPoint()
	 * @generated
	 */
	EAttribute getLASPoint_NumberOfReturns();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getScanDirection <em>Scan Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scan Direction</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getScanDirection()
	 * @see #getLASPoint()
	 * @generated
	 */
	EAttribute getLASPoint_ScanDirection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getEdgeOfFlightLine <em>Edge Of Flight Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge Of Flight Line</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getEdgeOfFlightLine()
	 * @see #getLASPoint()
	 * @generated
	 */
	EAttribute getLASPoint_EdgeOfFlightLine();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getClassification()
	 * @see #getLASPoint()
	 * @generated
	 */
	EAttribute getLASPoint_Classification();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getScanAngleRank <em>Scan Angle Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scan Angle Rank</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getScanAngleRank()
	 * @see #getLASPoint()
	 * @generated
	 */
	EAttribute getLASPoint_ScanAngleRank();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getUserData <em>User Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Data</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getUserData()
	 * @see #getLASPoint()
	 * @generated
	 */
	EAttribute getLASPoint_UserData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getPointSourceId <em>Point Source Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point Source Id</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getPointSourceId()
	 * @see #getLASPoint()
	 * @generated
	 */
	EAttribute getLASPoint_PointSourceId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getGpsTime <em>Gps Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gps Time</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getGpsTime()
	 * @see #getLASPoint()
	 * @generated
	 */
	EAttribute getLASPoint_GpsTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getRed()
	 * @see #getLASPoint()
	 * @generated
	 */
	EAttribute getLASPoint_Red();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getGreen()
	 * @see #getLASPoint()
	 * @generated
	 */
	EAttribute getLASPoint_Green();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASPoint#getBlue()
	 * @see #getLASPoint()
	 * @generated
	 */
	EAttribute getLASPoint_Blue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.las.LASFacade <em>LAS Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LAS Facade</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASFacade
	 * @generated
	 */
	EClass getLASFacade();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASFacade#createPoint(int, byte[]) <em>Create Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Point</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASFacade#createPoint(int, byte[])
	 * @generated
	 */
	EOperation getLASFacade__CreatePoint__int_byte();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.las.LASWriter <em>LAS Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LAS Writer</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASWriter
	 * @generated
	 */
	EClass getLASWriter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASWriter#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASWriter#getFileName()
	 * @see #getLASWriter()
	 * @generated
	 */
	EAttribute getLASWriter_FileName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASWriter#getProgressMonitor <em>Progress Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Progress Monitor</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASWriter#getProgressMonitor()
	 * @see #getLASWriter()
	 * @generated
	 */
	EAttribute getLASWriter_ProgressMonitor();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.symphony.common.geometry.data3d.las.LASWriter#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Points</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASWriter#getPoints()
	 * @see #getLASWriter()
	 * @generated
	 */
	EReference getLASWriter_Points();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASWriter#getScaleX <em>Scale X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale X</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASWriter#getScaleX()
	 * @see #getLASWriter()
	 * @generated
	 */
	EAttribute getLASWriter_ScaleX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASWriter#getScaleY <em>Scale Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Y</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASWriter#getScaleY()
	 * @see #getLASWriter()
	 * @generated
	 */
	EAttribute getLASWriter_ScaleY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASWriter#getScaleZ <em>Scale Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Z</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASWriter#getScaleZ()
	 * @see #getLASWriter()
	 * @generated
	 */
	EAttribute getLASWriter_ScaleZ();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.geometry.data3d.las.LASWriter#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Header</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASWriter#getHeader()
	 * @see #getLASWriter()
	 * @generated
	 */
	EReference getLASWriter_Header();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASWriter#getXOffset <em>XOffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XOffset</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASWriter#getXOffset()
	 * @see #getLASWriter()
	 * @generated
	 */
	EAttribute getLASWriter_XOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASWriter#getYOffset <em>YOffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YOffset</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASWriter#getYOffset()
	 * @see #getLASWriter()
	 * @generated
	 */
	EAttribute getLASWriter_YOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASWriter#getZOffset <em>ZOffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZOffset</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASWriter#getZOffset()
	 * @see #getLASWriter()
	 * @generated
	 */
	EAttribute getLASWriter_ZOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.las.LASWriter#getOutputStream <em>Output Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Stream</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASWriter#getOutputStream()
	 * @see #getLASWriter()
	 * @generated
	 */
	EAttribute getLASWriter_OutputStream();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASWriter#write() <em>Write</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write</em>' operation.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LASWriter#write()
	 * @generated
	 */
	EOperation getLASWriter__Write();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.common.geometry.data3d.las.ScanDirection <em>Scan Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scan Direction</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.ScanDirection
	 * @generated
	 */
	EEnum getScanDirection();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.common.geometry.data3d.las.EdgeOfFlightLine <em>Edge Of Flight Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Edge Of Flight Line</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.EdgeOfFlightLine
	 * @generated
	 */
	EEnum getEdgeOfFlightLine();

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
	 * Returns the meta object for data type '<em>Char Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Char Array</em>'.
	 * @model instanceClass="char[]"
	 * @generated
	 */
	EDataType getCharArray();

	/**
	 * Returns the meta object for data type '<em>Long Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Long Array</em>'.
	 * @model instanceClass="long[]"
	 * @generated
	 */
	EDataType getLongArray();

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
	LasFactory getLasFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.las.impl.LASHeaderImpl <em>LAS Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LASHeaderImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getLASHeader()
		 * @generated
		 */
		EClass LAS_HEADER = eINSTANCE.getLASHeader();

		/**
		 * The meta object literal for the '<em><b>File Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__FILE_SIGNATURE = eINSTANCE.getLASHeader_FileSignature();

		/**
		 * The meta object literal for the '<em><b>File Source ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__FILE_SOURCE_ID = eINSTANCE.getLASHeader_FileSourceID();

		/**
		 * The meta object literal for the '<em><b>Global Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__GLOBAL_ENCODING = eINSTANCE.getLASHeader_GlobalEncoding();

		/**
		 * The meta object literal for the '<em><b>Project ID GUID data 1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__PROJECT_ID_GUID_DATA_1 = eINSTANCE.getLASHeader_ProjectID_GUID_data_1();

		/**
		 * The meta object literal for the '<em><b>Project ID GUID data 2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__PROJECT_ID_GUID_DATA_2 = eINSTANCE.getLASHeader_ProjectID_GUID_data_2();

		/**
		 * The meta object literal for the '<em><b>Project ID GUID data 3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__PROJECT_ID_GUID_DATA_3 = eINSTANCE.getLASHeader_ProjectID_GUID_data_3();

		/**
		 * The meta object literal for the '<em><b>Project ID GUID data 4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__PROJECT_ID_GUID_DATA_4 = eINSTANCE.getLASHeader_ProjectID_GUID_data_4();

		/**
		 * The meta object literal for the '<em><b>Version Major</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__VERSION_MAJOR = eINSTANCE.getLASHeader_VersionMajor();

		/**
		 * The meta object literal for the '<em><b>Version Minor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__VERSION_MINOR = eINSTANCE.getLASHeader_VersionMinor();

		/**
		 * The meta object literal for the '<em><b>System Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__SYSTEM_IDENTIFIER = eINSTANCE.getLASHeader_SystemIdentifier();

		/**
		 * The meta object literal for the '<em><b>Generating Software</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__GENERATING_SOFTWARE = eINSTANCE.getLASHeader_GeneratingSoftware();

		/**
		 * The meta object literal for the '<em><b>File Creation Day Of Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__FILE_CREATION_DAY_OF_YEAR = eINSTANCE.getLASHeader_FileCreationDayOfYear();

		/**
		 * The meta object literal for the '<em><b>File Creation Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__FILE_CREATION_YEAR = eINSTANCE.getLASHeader_FileCreationYear();

		/**
		 * The meta object literal for the '<em><b>Header Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__HEADER_SIZE = eINSTANCE.getLASHeader_HeaderSize();

		/**
		 * The meta object literal for the '<em><b>Offset To Point Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__OFFSET_TO_POINT_DATA = eINSTANCE.getLASHeader_OffsetToPointData();

		/**
		 * The meta object literal for the '<em><b>NVariable Length Records</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__NVARIABLE_LENGTH_RECORDS = eINSTANCE.getLASHeader_NVariableLengthRecords();

		/**
		 * The meta object literal for the '<em><b>Point Data Format ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__POINT_DATA_FORMAT_ID = eINSTANCE.getLASHeader_PointDataFormatID();

		/**
		 * The meta object literal for the '<em><b>Point Data Record Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__POINT_DATA_RECORD_LENGTH = eINSTANCE.getLASHeader_PointDataRecordLength();

		/**
		 * The meta object literal for the '<em><b>Number Of Point Records</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__NUMBER_OF_POINT_RECORDS = eINSTANCE.getLASHeader_NumberOfPointRecords();

		/**
		 * The meta object literal for the '<em><b>Number Of Points By Return</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__NUMBER_OF_POINTS_BY_RETURN = eINSTANCE.getLASHeader_NumberOfPointsByReturn();

		/**
		 * The meta object literal for the '<em><b>XScale Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__XSCALE_FACTOR = eINSTANCE.getLASHeader_XScaleFactor();

		/**
		 * The meta object literal for the '<em><b>YScale Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__YSCALE_FACTOR = eINSTANCE.getLASHeader_YScaleFactor();

		/**
		 * The meta object literal for the '<em><b>ZScale Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__ZSCALE_FACTOR = eINSTANCE.getLASHeader_ZScaleFactor();

		/**
		 * The meta object literal for the '<em><b>XOffset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__XOFFSET = eINSTANCE.getLASHeader_XOffset();

		/**
		 * The meta object literal for the '<em><b>YOffset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__YOFFSET = eINSTANCE.getLASHeader_YOffset();

		/**
		 * The meta object literal for the '<em><b>ZOffset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__ZOFFSET = eINSTANCE.getLASHeader_ZOffset();

		/**
		 * The meta object literal for the '<em><b>Max X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__MAX_X = eINSTANCE.getLASHeader_MaxX();

		/**
		 * The meta object literal for the '<em><b>Min X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__MIN_X = eINSTANCE.getLASHeader_MinX();

		/**
		 * The meta object literal for the '<em><b>Max Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__MAX_Y = eINSTANCE.getLASHeader_MaxY();

		/**
		 * The meta object literal for the '<em><b>Min Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__MIN_Y = eINSTANCE.getLASHeader_MinY();

		/**
		 * The meta object literal for the '<em><b>Max Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__MAX_Z = eINSTANCE.getLASHeader_MaxZ();

		/**
		 * The meta object literal for the '<em><b>Min Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__MIN_Z = eINSTANCE.getLASHeader_MinZ();

		/**
		 * The meta object literal for the '<em><b>Start Of Waveform Data Packet Record</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_HEADER__START_OF_WAVEFORM_DATA_PACKET_RECORD = eINSTANCE.getLASHeader_StartOfWaveformDataPacketRecord();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.las.impl.VariableLengthRecordImpl <em>Variable Length Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.VariableLengthRecordImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getVariableLengthRecord()
		 * @generated
		 */
		EClass VARIABLE_LENGTH_RECORD = eINSTANCE.getVariableLengthRecord();

		/**
		 * The meta object literal for the '<em><b>Reserved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_LENGTH_RECORD__RESERVED = eINSTANCE.getVariableLengthRecord_Reserved();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_LENGTH_RECORD__USER_ID = eINSTANCE.getVariableLengthRecord_UserID();

		/**
		 * The meta object literal for the '<em><b>Record ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_LENGTH_RECORD__RECORD_ID = eINSTANCE.getVariableLengthRecord_RecordID();

		/**
		 * The meta object literal for the '<em><b>Record Lenght After Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_LENGTH_RECORD__RECORD_LENGHT_AFTER_HEADER = eINSTANCE.getVariableLengthRecord_RecordLenghtAfterHeader();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_LENGTH_RECORD__DESCRIPTION = eINSTANCE.getVariableLengthRecord_Description();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.las.impl.LASReaderImpl <em>LAS Reader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LASReaderImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getLASReader()
		 * @generated
		 */
		EClass LAS_READER = eINSTANCE.getLASReader();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_READER__FILE = eINSTANCE.getLASReader_File();

		/**
		 * The meta object literal for the '<em><b>Input Stream</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_READER__INPUT_STREAM = eINSTANCE.getLASReader_InputStream();

		/**
		 * The meta object literal for the '<em><b>Vlrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAS_READER__VLRS = eINSTANCE.getLASReader_Vlrs();

		/**
		 * The meta object literal for the '<em><b>Progress Monitor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_READER__PROGRESS_MONITOR = eINSTANCE.getLASReader_ProgressMonitor();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAS_READER__HEADER = eINSTANCE.getLASReader_Header();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAS_READER__POINTS = eINSTANCE.getLASReader_Points();

		/**
		 * The meta object literal for the '<em><b>Read</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LAS_READER___READ = eINSTANCE.getLASReader__Read();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.las.impl.LASPointImpl <em>LAS Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LASPointImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getLASPoint()
		 * @generated
		 */
		EClass LAS_POINT = eINSTANCE.getLASPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_POINT__X = eINSTANCE.getLASPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_POINT__Y = eINSTANCE.getLASPoint_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_POINT__Z = eINSTANCE.getLASPoint_Z();

		/**
		 * The meta object literal for the '<em><b>Intensity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_POINT__INTENSITY = eINSTANCE.getLASPoint_Intensity();

		/**
		 * The meta object literal for the '<em><b>Return Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_POINT__RETURN_NUMBER = eINSTANCE.getLASPoint_ReturnNumber();

		/**
		 * The meta object literal for the '<em><b>Number Of Returns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_POINT__NUMBER_OF_RETURNS = eINSTANCE.getLASPoint_NumberOfReturns();

		/**
		 * The meta object literal for the '<em><b>Scan Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_POINT__SCAN_DIRECTION = eINSTANCE.getLASPoint_ScanDirection();

		/**
		 * The meta object literal for the '<em><b>Edge Of Flight Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_POINT__EDGE_OF_FLIGHT_LINE = eINSTANCE.getLASPoint_EdgeOfFlightLine();

		/**
		 * The meta object literal for the '<em><b>Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_POINT__CLASSIFICATION = eINSTANCE.getLASPoint_Classification();

		/**
		 * The meta object literal for the '<em><b>Scan Angle Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_POINT__SCAN_ANGLE_RANK = eINSTANCE.getLASPoint_ScanAngleRank();

		/**
		 * The meta object literal for the '<em><b>User Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_POINT__USER_DATA = eINSTANCE.getLASPoint_UserData();

		/**
		 * The meta object literal for the '<em><b>Point Source Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_POINT__POINT_SOURCE_ID = eINSTANCE.getLASPoint_PointSourceId();

		/**
		 * The meta object literal for the '<em><b>Gps Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_POINT__GPS_TIME = eINSTANCE.getLASPoint_GpsTime();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_POINT__RED = eINSTANCE.getLASPoint_Red();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_POINT__GREEN = eINSTANCE.getLASPoint_Green();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_POINT__BLUE = eINSTANCE.getLASPoint_Blue();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.las.impl.LASFacadeImpl <em>LAS Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LASFacadeImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getLASFacade()
		 * @generated
		 */
		EClass LAS_FACADE = eINSTANCE.getLASFacade();

		/**
		 * The meta object literal for the '<em><b>Create Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LAS_FACADE___CREATE_POINT__INT_BYTE = eINSTANCE.getLASFacade__CreatePoint__int_byte();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.las.impl.LASWriterImpl <em>LAS Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LASWriterImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getLASWriter()
		 * @generated
		 */
		EClass LAS_WRITER = eINSTANCE.getLASWriter();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_WRITER__FILE_NAME = eINSTANCE.getLASWriter_FileName();

		/**
		 * The meta object literal for the '<em><b>Progress Monitor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_WRITER__PROGRESS_MONITOR = eINSTANCE.getLASWriter_ProgressMonitor();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAS_WRITER__POINTS = eINSTANCE.getLASWriter_Points();

		/**
		 * The meta object literal for the '<em><b>Scale X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_WRITER__SCALE_X = eINSTANCE.getLASWriter_ScaleX();

		/**
		 * The meta object literal for the '<em><b>Scale Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_WRITER__SCALE_Y = eINSTANCE.getLASWriter_ScaleY();

		/**
		 * The meta object literal for the '<em><b>Scale Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_WRITER__SCALE_Z = eINSTANCE.getLASWriter_ScaleZ();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAS_WRITER__HEADER = eINSTANCE.getLASWriter_Header();

		/**
		 * The meta object literal for the '<em><b>XOffset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_WRITER__XOFFSET = eINSTANCE.getLASWriter_XOffset();

		/**
		 * The meta object literal for the '<em><b>YOffset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_WRITER__YOFFSET = eINSTANCE.getLASWriter_YOffset();

		/**
		 * The meta object literal for the '<em><b>ZOffset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_WRITER__ZOFFSET = eINSTANCE.getLASWriter_ZOffset();

		/**
		 * The meta object literal for the '<em><b>Output Stream</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAS_WRITER__OUTPUT_STREAM = eINSTANCE.getLASWriter_OutputStream();

		/**
		 * The meta object literal for the '<em><b>Write</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LAS_WRITER___WRITE = eINSTANCE.getLASWriter__Write();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.las.ScanDirection <em>Scan Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.las.ScanDirection
		 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getScanDirection()
		 * @generated
		 */
		EEnum SCAN_DIRECTION = eINSTANCE.getScanDirection();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.las.EdgeOfFlightLine <em>Edge Of Flight Line</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.las.EdgeOfFlightLine
		 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getEdgeOfFlightLine()
		 * @generated
		 */
		EEnum EDGE_OF_FLIGHT_LINE = eINSTANCE.getEdgeOfFlightLine();

		/**
		 * The meta object literal for the '<em>IProgress Monitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IProgressMonitor
		 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getIProgressMonitor()
		 * @generated
		 */
		EDataType IPROGRESS_MONITOR = eINSTANCE.getIProgressMonitor();

		/**
		 * The meta object literal for the '<em>Char Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getCharArray()
		 * @generated
		 */
		EDataType CHAR_ARRAY = eINSTANCE.getCharArray();

		/**
		 * The meta object literal for the '<em>Long Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getLongArray()
		 * @generated
		 */
		EDataType LONG_ARRAY = eINSTANCE.getLongArray();

		/**
		 * The meta object literal for the '<em>Input Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.InputStream
		 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getInputStream()
		 * @generated
		 */
		EDataType INPUT_STREAM = eINSTANCE.getInputStream();

		/**
		 * The meta object literal for the '<em>IO Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.IOException
		 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getIOException()
		 * @generated
		 */
		EDataType IO_EXCEPTION = eINSTANCE.getIOException();

		/**
		 * The meta object literal for the '<em>Output Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.OutputStream
		 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getOutputStream()
		 * @generated
		 */
		EDataType OUTPUT_STREAM = eINSTANCE.getOutputStream();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.eclipse.symphony.common.geometry.data3d.las.impl.LasPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

	}

} //LasPackage
