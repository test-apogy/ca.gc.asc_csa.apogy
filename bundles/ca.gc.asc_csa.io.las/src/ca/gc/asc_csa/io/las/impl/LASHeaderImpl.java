/**
 * <copyright>
 * </copyright>
 *
 */
package ca.gc.asc_csa.io.las.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ca.gc.asc_csa.io.las.LASHeader;
import ca.gc.asc_csa.io.las.LasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LAS Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getFileSignature <em>File Signature</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getFileSourceID <em>File Source ID</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getGlobalEncoding <em>Global Encoding</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getProjectID_GUID_data_1 <em>Project ID GUID data 1</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getProjectID_GUID_data_2 <em>Project ID GUID data 2</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getProjectID_GUID_data_3 <em>Project ID GUID data 3</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getProjectID_GUID_data_4 <em>Project ID GUID data 4</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getVersionMajor <em>Version Major</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getVersionMinor <em>Version Minor</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getSystemIdentifier <em>System Identifier</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getGeneratingSoftware <em>Generating Software</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getFileCreationDayOfYear <em>File Creation Day Of Year</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getFileCreationYear <em>File Creation Year</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getHeaderSize <em>Header Size</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getOffsetToPointData <em>Offset To Point Data</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getNVariableLengthRecords <em>NVariable Length Records</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getPointDataFormatID <em>Point Data Format ID</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getPointDataRecordLength <em>Point Data Record Length</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getNumberOfPointRecords <em>Number Of Point Records</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getNumberOfPointsByReturn <em>Number Of Points By Return</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getXScaleFactor <em>XScale Factor</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getYScaleFactor <em>YScale Factor</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getZScaleFactor <em>ZScale Factor</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getXOffset <em>XOffset</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getYOffset <em>YOffset</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getZOffset <em>ZOffset</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getMaxX <em>Max X</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getMinX <em>Min X</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getMaxY <em>Max Y</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getMinY <em>Min Y</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getMaxZ <em>Max Z</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getMinZ <em>Min Z</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASHeaderImpl#getStartOfWaveformDataPacketRecord <em>Start Of Waveform Data Packet Record</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LASHeaderImpl extends EObjectImpl implements LASHeader {
	/**
	 * The default value of the '{@link #getFileSignature() <em>File Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileSignature() <em>File Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSignature()
	 * @generated
	 * @ordered
	 */
	protected String fileSignature = FILE_SIGNATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileSourceID() <em>File Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSourceID()
	 * @generated
	 * @ordered
	 */
	protected static final int FILE_SOURCE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFileSourceID() <em>File Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSourceID()
	 * @generated
	 * @ordered
	 */
	protected int fileSourceID = FILE_SOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlobalEncoding() <em>Global Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final int GLOBAL_ENCODING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGlobalEncoding() <em>Global Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalEncoding()
	 * @generated
	 * @ordered
	 */
	protected int globalEncoding = GLOBAL_ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectID_GUID_data_1() <em>Project ID GUID data 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectID_GUID_data_1()
	 * @generated
	 * @ordered
	 */
	protected static final long PROJECT_ID_GUID_DATA_1_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getProjectID_GUID_data_1() <em>Project ID GUID data 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectID_GUID_data_1()
	 * @generated
	 * @ordered
	 */
	protected long projectID_GUID_data_1 = PROJECT_ID_GUID_DATA_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectID_GUID_data_2() <em>Project ID GUID data 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectID_GUID_data_2()
	 * @generated
	 * @ordered
	 */
	protected static final int PROJECT_ID_GUID_DATA_2_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProjectID_GUID_data_2() <em>Project ID GUID data 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectID_GUID_data_2()
	 * @generated
	 * @ordered
	 */
	protected int projectID_GUID_data_2 = PROJECT_ID_GUID_DATA_2_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectID_GUID_data_3() <em>Project ID GUID data 3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectID_GUID_data_3()
	 * @generated
	 * @ordered
	 */
	protected static final int PROJECT_ID_GUID_DATA_3_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProjectID_GUID_data_3() <em>Project ID GUID data 3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectID_GUID_data_3()
	 * @generated
	 * @ordered
	 */
	protected int projectID_GUID_data_3 = PROJECT_ID_GUID_DATA_3_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectID_GUID_data_4() <em>Project ID GUID data 4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectID_GUID_data_4()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] PROJECT_ID_GUID_DATA_4_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectID_GUID_data_4() <em>Project ID GUID data 4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectID_GUID_data_4()
	 * @generated
	 * @ordered
	 */
	protected byte[] projectID_GUID_data_4 = PROJECT_ID_GUID_DATA_4_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionMajor() <em>Version Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionMajor()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_MAJOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersionMajor() <em>Version Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionMajor()
	 * @generated
	 * @ordered
	 */
	protected int versionMajor = VERSION_MAJOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionMinor() <em>Version Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionMinor()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_MINOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersionMinor() <em>Version Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionMinor()
	 * @generated
	 * @ordered
	 */
	protected int versionMinor = VERSION_MINOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemIdentifier() <em>System Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemIdentifier() <em>System Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String systemIdentifier = SYSTEM_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratingSoftware() <em>Generating Software</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratingSoftware()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATING_SOFTWARE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneratingSoftware() <em>Generating Software</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratingSoftware()
	 * @generated
	 * @ordered
	 */
	protected String generatingSoftware = GENERATING_SOFTWARE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileCreationDayOfYear() <em>File Creation Day Of Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileCreationDayOfYear()
	 * @generated
	 * @ordered
	 */
	protected static final int FILE_CREATION_DAY_OF_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFileCreationDayOfYear() <em>File Creation Day Of Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileCreationDayOfYear()
	 * @generated
	 * @ordered
	 */
	protected int fileCreationDayOfYear = FILE_CREATION_DAY_OF_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileCreationYear() <em>File Creation Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileCreationYear()
	 * @generated
	 * @ordered
	 */
	protected static final int FILE_CREATION_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFileCreationYear() <em>File Creation Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileCreationYear()
	 * @generated
	 * @ordered
	 */
	protected int fileCreationYear = FILE_CREATION_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeaderSize() <em>Header Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderSize()
	 * @generated
	 * @ordered
	 */
	protected static final int HEADER_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeaderSize() <em>Header Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderSize()
	 * @generated
	 * @ordered
	 */
	protected int headerSize = HEADER_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffsetToPointData() <em>Offset To Point Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetToPointData()
	 * @generated
	 * @ordered
	 */
	protected static final long OFFSET_TO_POINT_DATA_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getOffsetToPointData() <em>Offset To Point Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetToPointData()
	 * @generated
	 * @ordered
	 */
	protected long offsetToPointData = OFFSET_TO_POINT_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getNVariableLengthRecords() <em>NVariable Length Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNVariableLengthRecords()
	 * @generated
	 * @ordered
	 */
	protected static final long NVARIABLE_LENGTH_RECORDS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNVariableLengthRecords() <em>NVariable Length Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNVariableLengthRecords()
	 * @generated
	 * @ordered
	 */
	protected long nVariableLengthRecords = NVARIABLE_LENGTH_RECORDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPointDataFormatID() <em>Point Data Format ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointDataFormatID()
	 * @generated
	 * @ordered
	 */
	protected static final int POINT_DATA_FORMAT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPointDataFormatID() <em>Point Data Format ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointDataFormatID()
	 * @generated
	 * @ordered
	 */
	protected int pointDataFormatID = POINT_DATA_FORMAT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPointDataRecordLength() <em>Point Data Record Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointDataRecordLength()
	 * @generated
	 * @ordered
	 */
	protected static final int POINT_DATA_RECORD_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPointDataRecordLength() <em>Point Data Record Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointDataRecordLength()
	 * @generated
	 * @ordered
	 */
	protected int pointDataRecordLength = POINT_DATA_RECORD_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfPointRecords() <em>Number Of Point Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPointRecords()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMBER_OF_POINT_RECORDS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumberOfPointRecords() <em>Number Of Point Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPointRecords()
	 * @generated
	 * @ordered
	 */
	protected long numberOfPointRecords = NUMBER_OF_POINT_RECORDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfPointsByReturn() <em>Number Of Points By Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPointsByReturn()
	 * @generated
	 * @ordered
	 */
	protected static final long[] NUMBER_OF_POINTS_BY_RETURN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfPointsByReturn() <em>Number Of Points By Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPointsByReturn()
	 * @generated
	 * @ordered
	 */
	protected long[] numberOfPointsByReturn = NUMBER_OF_POINTS_BY_RETURN_EDEFAULT;

	/**
	 * The default value of the '{@link #getXScaleFactor() <em>XScale Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXScaleFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double XSCALE_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXScaleFactor() <em>XScale Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXScaleFactor()
	 * @generated
	 * @ordered
	 */
	protected double xScaleFactor = XSCALE_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getYScaleFactor() <em>YScale Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYScaleFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double YSCALE_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYScaleFactor() <em>YScale Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYScaleFactor()
	 * @generated
	 * @ordered
	 */
	protected double yScaleFactor = YSCALE_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getZScaleFactor() <em>ZScale Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZScaleFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double ZSCALE_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getZScaleFactor() <em>ZScale Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZScaleFactor()
	 * @generated
	 * @ordered
	 */
	protected double zScaleFactor = ZSCALE_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getXOffset() <em>XOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double XOFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXOffset() <em>XOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXOffset()
	 * @generated
	 * @ordered
	 */
	protected double xOffset = XOFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getYOffset() <em>YOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double YOFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYOffset() <em>YOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYOffset()
	 * @generated
	 * @ordered
	 */
	protected double yOffset = YOFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getZOffset() <em>ZOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double ZOFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getZOffset() <em>ZOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZOffset()
	 * @generated
	 * @ordered
	 */
	protected double zOffset = ZOFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxX() <em>Max X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxX()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxX() <em>Max X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxX()
	 * @generated
	 * @ordered
	 */
	protected double maxX = MAX_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinX() <em>Min X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinX()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinX() <em>Min X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinX()
	 * @generated
	 * @ordered
	 */
	protected double minX = MIN_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxY() <em>Max Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxY()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxY() <em>Max Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxY()
	 * @generated
	 * @ordered
	 */
	protected double maxY = MAX_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinY() <em>Min Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinY()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinY() <em>Min Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinY()
	 * @generated
	 * @ordered
	 */
	protected double minY = MIN_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxZ() <em>Max Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxZ()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxZ() <em>Max Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxZ()
	 * @generated
	 * @ordered
	 */
	protected double maxZ = MAX_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinZ() <em>Min Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinZ()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinZ() <em>Min Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinZ()
	 * @generated
	 * @ordered
	 */
	protected double minZ = MIN_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartOfWaveformDataPacketRecord() <em>Start Of Waveform Data Packet Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOfWaveformDataPacketRecord()
	 * @generated
	 * @ordered
	 */
	protected static final long START_OF_WAVEFORM_DATA_PACKET_RECORD_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStartOfWaveformDataPacketRecord() <em>Start Of Waveform Data Packet Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOfWaveformDataPacketRecord()
	 * @generated
	 * @ordered
	 */
	protected long startOfWaveformDataPacketRecord = START_OF_WAVEFORM_DATA_PACKET_RECORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LASHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LasPackage.Literals.LAS_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileSignature() {
		return fileSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileSignature(String newFileSignature) {
		String oldFileSignature = fileSignature;
		fileSignature = newFileSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__FILE_SIGNATURE, oldFileSignature, fileSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFileSourceID() {
		return fileSourceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileSourceID(int newFileSourceID) {
		int oldFileSourceID = fileSourceID;
		fileSourceID = newFileSourceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__FILE_SOURCE_ID, oldFileSourceID, fileSourceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGlobalEncoding() {
		return globalEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalEncoding(int newGlobalEncoding) {
		int oldGlobalEncoding = globalEncoding;
		globalEncoding = newGlobalEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__GLOBAL_ENCODING, oldGlobalEncoding, globalEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getProjectID_GUID_data_1() {
		return projectID_GUID_data_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectID_GUID_data_1(long newProjectID_GUID_data_1) {
		long oldProjectID_GUID_data_1 = projectID_GUID_data_1;
		projectID_GUID_data_1 = newProjectID_GUID_data_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_1, oldProjectID_GUID_data_1, projectID_GUID_data_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProjectID_GUID_data_2() {
		return projectID_GUID_data_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectID_GUID_data_2(int newProjectID_GUID_data_2) {
		int oldProjectID_GUID_data_2 = projectID_GUID_data_2;
		projectID_GUID_data_2 = newProjectID_GUID_data_2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_2, oldProjectID_GUID_data_2, projectID_GUID_data_2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProjectID_GUID_data_3() {
		return projectID_GUID_data_3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectID_GUID_data_3(int newProjectID_GUID_data_3) {
		int oldProjectID_GUID_data_3 = projectID_GUID_data_3;
		projectID_GUID_data_3 = newProjectID_GUID_data_3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_3, oldProjectID_GUID_data_3, projectID_GUID_data_3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getProjectID_GUID_data_4() {
		return projectID_GUID_data_4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectID_GUID_data_4(byte[] newProjectID_GUID_data_4) {
		byte[] oldProjectID_GUID_data_4 = projectID_GUID_data_4;
		projectID_GUID_data_4 = newProjectID_GUID_data_4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_4, oldProjectID_GUID_data_4, projectID_GUID_data_4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersionMajor() {
		return versionMajor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionMajor(int newVersionMajor) {
		int oldVersionMajor = versionMajor;
		versionMajor = newVersionMajor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__VERSION_MAJOR, oldVersionMajor, versionMajor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersionMinor() {
		return versionMinor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionMinor(int newVersionMinor) {
		int oldVersionMinor = versionMinor;
		versionMinor = newVersionMinor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__VERSION_MINOR, oldVersionMinor, versionMinor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemIdentifier() {
		return systemIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemIdentifier(String newSystemIdentifier) {
		String oldSystemIdentifier = systemIdentifier;
		systemIdentifier = newSystemIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__SYSTEM_IDENTIFIER, oldSystemIdentifier, systemIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneratingSoftware() {
		return generatingSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratingSoftware(String newGeneratingSoftware) {
		String oldGeneratingSoftware = generatingSoftware;
		generatingSoftware = newGeneratingSoftware;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__GENERATING_SOFTWARE, oldGeneratingSoftware, generatingSoftware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFileCreationDayOfYear() {
		return fileCreationDayOfYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileCreationDayOfYear(int newFileCreationDayOfYear) {
		int oldFileCreationDayOfYear = fileCreationDayOfYear;
		fileCreationDayOfYear = newFileCreationDayOfYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__FILE_CREATION_DAY_OF_YEAR, oldFileCreationDayOfYear, fileCreationDayOfYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFileCreationYear() {
		return fileCreationYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileCreationYear(int newFileCreationYear) {
		int oldFileCreationYear = fileCreationYear;
		fileCreationYear = newFileCreationYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__FILE_CREATION_YEAR, oldFileCreationYear, fileCreationYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeaderSize() {
		return headerSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderSize(int newHeaderSize) {
		int oldHeaderSize = headerSize;
		headerSize = newHeaderSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__HEADER_SIZE, oldHeaderSize, headerSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getOffsetToPointData() {
		return offsetToPointData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsetToPointData(long newOffsetToPointData) {
		long oldOffsetToPointData = offsetToPointData;
		offsetToPointData = newOffsetToPointData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__OFFSET_TO_POINT_DATA, oldOffsetToPointData, offsetToPointData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNVariableLengthRecords() {
		return nVariableLengthRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNVariableLengthRecords(long newNVariableLengthRecords) {
		long oldNVariableLengthRecords = nVariableLengthRecords;
		nVariableLengthRecords = newNVariableLengthRecords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__NVARIABLE_LENGTH_RECORDS, oldNVariableLengthRecords, nVariableLengthRecords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPointDataFormatID() {
		return pointDataFormatID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointDataFormatID(int newPointDataFormatID) {
		int oldPointDataFormatID = pointDataFormatID;
		pointDataFormatID = newPointDataFormatID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__POINT_DATA_FORMAT_ID, oldPointDataFormatID, pointDataFormatID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPointDataRecordLength() {
		return pointDataRecordLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointDataRecordLength(int newPointDataRecordLength) {
		int oldPointDataRecordLength = pointDataRecordLength;
		pointDataRecordLength = newPointDataRecordLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__POINT_DATA_RECORD_LENGTH, oldPointDataRecordLength, pointDataRecordLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumberOfPointRecords() {
		return numberOfPointRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfPointRecords(long newNumberOfPointRecords) {
		long oldNumberOfPointRecords = numberOfPointRecords;
		numberOfPointRecords = newNumberOfPointRecords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__NUMBER_OF_POINT_RECORDS, oldNumberOfPointRecords, numberOfPointRecords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long[] getNumberOfPointsByReturn() {
		return numberOfPointsByReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfPointsByReturn(long[] newNumberOfPointsByReturn) {
		long[] oldNumberOfPointsByReturn = numberOfPointsByReturn;
		numberOfPointsByReturn = newNumberOfPointsByReturn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__NUMBER_OF_POINTS_BY_RETURN, oldNumberOfPointsByReturn, numberOfPointsByReturn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXScaleFactor() {
		return xScaleFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXScaleFactor(double newXScaleFactor) {
		double oldXScaleFactor = xScaleFactor;
		xScaleFactor = newXScaleFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__XSCALE_FACTOR, oldXScaleFactor, xScaleFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYScaleFactor() {
		return yScaleFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYScaleFactor(double newYScaleFactor) {
		double oldYScaleFactor = yScaleFactor;
		yScaleFactor = newYScaleFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__YSCALE_FACTOR, oldYScaleFactor, yScaleFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getZScaleFactor() {
		return zScaleFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZScaleFactor(double newZScaleFactor) {
		double oldZScaleFactor = zScaleFactor;
		zScaleFactor = newZScaleFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__ZSCALE_FACTOR, oldZScaleFactor, zScaleFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXOffset() {
		return xOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXOffset(double newXOffset) {
		double oldXOffset = xOffset;
		xOffset = newXOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__XOFFSET, oldXOffset, xOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYOffset() {
		return yOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYOffset(double newYOffset) {
		double oldYOffset = yOffset;
		yOffset = newYOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__YOFFSET, oldYOffset, yOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getZOffset() {
		return zOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZOffset(double newZOffset) {
		double oldZOffset = zOffset;
		zOffset = newZOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__ZOFFSET, oldZOffset, zOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxX() {
		return maxX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxX(double newMaxX) {
		double oldMaxX = maxX;
		maxX = newMaxX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__MAX_X, oldMaxX, maxX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinX() {
		return minX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinX(double newMinX) {
		double oldMinX = minX;
		minX = newMinX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__MIN_X, oldMinX, minX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxY() {
		return maxY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxY(double newMaxY) {
		double oldMaxY = maxY;
		maxY = newMaxY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__MAX_Y, oldMaxY, maxY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinY() {
		return minY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinY(double newMinY) {
		double oldMinY = minY;
		minY = newMinY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__MIN_Y, oldMinY, minY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxZ() {
		return maxZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxZ(double newMaxZ) {
		double oldMaxZ = maxZ;
		maxZ = newMaxZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__MAX_Z, oldMaxZ, maxZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinZ() {
		return minZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinZ(double newMinZ) {
		double oldMinZ = minZ;
		minZ = newMinZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__MIN_Z, oldMinZ, minZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStartOfWaveformDataPacketRecord() {
		return startOfWaveformDataPacketRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartOfWaveformDataPacketRecord(long newStartOfWaveformDataPacketRecord) {
		long oldStartOfWaveformDataPacketRecord = startOfWaveformDataPacketRecord;
		startOfWaveformDataPacketRecord = newStartOfWaveformDataPacketRecord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_HEADER__START_OF_WAVEFORM_DATA_PACKET_RECORD, oldStartOfWaveformDataPacketRecord, startOfWaveformDataPacketRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LasPackage.LAS_HEADER__FILE_SIGNATURE:
				return getFileSignature();
			case LasPackage.LAS_HEADER__FILE_SOURCE_ID:
				return getFileSourceID();
			case LasPackage.LAS_HEADER__GLOBAL_ENCODING:
				return getGlobalEncoding();
			case LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_1:
				return getProjectID_GUID_data_1();
			case LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_2:
				return getProjectID_GUID_data_2();
			case LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_3:
				return getProjectID_GUID_data_3();
			case LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_4:
				return getProjectID_GUID_data_4();
			case LasPackage.LAS_HEADER__VERSION_MAJOR:
				return getVersionMajor();
			case LasPackage.LAS_HEADER__VERSION_MINOR:
				return getVersionMinor();
			case LasPackage.LAS_HEADER__SYSTEM_IDENTIFIER:
				return getSystemIdentifier();
			case LasPackage.LAS_HEADER__GENERATING_SOFTWARE:
				return getGeneratingSoftware();
			case LasPackage.LAS_HEADER__FILE_CREATION_DAY_OF_YEAR:
				return getFileCreationDayOfYear();
			case LasPackage.LAS_HEADER__FILE_CREATION_YEAR:
				return getFileCreationYear();
			case LasPackage.LAS_HEADER__HEADER_SIZE:
				return getHeaderSize();
			case LasPackage.LAS_HEADER__OFFSET_TO_POINT_DATA:
				return getOffsetToPointData();
			case LasPackage.LAS_HEADER__NVARIABLE_LENGTH_RECORDS:
				return getNVariableLengthRecords();
			case LasPackage.LAS_HEADER__POINT_DATA_FORMAT_ID:
				return getPointDataFormatID();
			case LasPackage.LAS_HEADER__POINT_DATA_RECORD_LENGTH:
				return getPointDataRecordLength();
			case LasPackage.LAS_HEADER__NUMBER_OF_POINT_RECORDS:
				return getNumberOfPointRecords();
			case LasPackage.LAS_HEADER__NUMBER_OF_POINTS_BY_RETURN:
				return getNumberOfPointsByReturn();
			case LasPackage.LAS_HEADER__XSCALE_FACTOR:
				return getXScaleFactor();
			case LasPackage.LAS_HEADER__YSCALE_FACTOR:
				return getYScaleFactor();
			case LasPackage.LAS_HEADER__ZSCALE_FACTOR:
				return getZScaleFactor();
			case LasPackage.LAS_HEADER__XOFFSET:
				return getXOffset();
			case LasPackage.LAS_HEADER__YOFFSET:
				return getYOffset();
			case LasPackage.LAS_HEADER__ZOFFSET:
				return getZOffset();
			case LasPackage.LAS_HEADER__MAX_X:
				return getMaxX();
			case LasPackage.LAS_HEADER__MIN_X:
				return getMinX();
			case LasPackage.LAS_HEADER__MAX_Y:
				return getMaxY();
			case LasPackage.LAS_HEADER__MIN_Y:
				return getMinY();
			case LasPackage.LAS_HEADER__MAX_Z:
				return getMaxZ();
			case LasPackage.LAS_HEADER__MIN_Z:
				return getMinZ();
			case LasPackage.LAS_HEADER__START_OF_WAVEFORM_DATA_PACKET_RECORD:
				return getStartOfWaveformDataPacketRecord();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LasPackage.LAS_HEADER__FILE_SIGNATURE:
				setFileSignature((String)newValue);
				return;
			case LasPackage.LAS_HEADER__FILE_SOURCE_ID:
				setFileSourceID((Integer)newValue);
				return;
			case LasPackage.LAS_HEADER__GLOBAL_ENCODING:
				setGlobalEncoding((Integer)newValue);
				return;
			case LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_1:
				setProjectID_GUID_data_1((Long)newValue);
				return;
			case LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_2:
				setProjectID_GUID_data_2((Integer)newValue);
				return;
			case LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_3:
				setProjectID_GUID_data_3((Integer)newValue);
				return;
			case LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_4:
				setProjectID_GUID_data_4((byte[])newValue);
				return;
			case LasPackage.LAS_HEADER__VERSION_MAJOR:
				setVersionMajor((Integer)newValue);
				return;
			case LasPackage.LAS_HEADER__VERSION_MINOR:
				setVersionMinor((Integer)newValue);
				return;
			case LasPackage.LAS_HEADER__SYSTEM_IDENTIFIER:
				setSystemIdentifier((String)newValue);
				return;
			case LasPackage.LAS_HEADER__GENERATING_SOFTWARE:
				setGeneratingSoftware((String)newValue);
				return;
			case LasPackage.LAS_HEADER__FILE_CREATION_DAY_OF_YEAR:
				setFileCreationDayOfYear((Integer)newValue);
				return;
			case LasPackage.LAS_HEADER__FILE_CREATION_YEAR:
				setFileCreationYear((Integer)newValue);
				return;
			case LasPackage.LAS_HEADER__HEADER_SIZE:
				setHeaderSize((Integer)newValue);
				return;
			case LasPackage.LAS_HEADER__OFFSET_TO_POINT_DATA:
				setOffsetToPointData((Long)newValue);
				return;
			case LasPackage.LAS_HEADER__NVARIABLE_LENGTH_RECORDS:
				setNVariableLengthRecords((Long)newValue);
				return;
			case LasPackage.LAS_HEADER__POINT_DATA_FORMAT_ID:
				setPointDataFormatID((Integer)newValue);
				return;
			case LasPackage.LAS_HEADER__POINT_DATA_RECORD_LENGTH:
				setPointDataRecordLength((Integer)newValue);
				return;
			case LasPackage.LAS_HEADER__NUMBER_OF_POINT_RECORDS:
				setNumberOfPointRecords((Long)newValue);
				return;
			case LasPackage.LAS_HEADER__NUMBER_OF_POINTS_BY_RETURN:
				setNumberOfPointsByReturn((long[])newValue);
				return;
			case LasPackage.LAS_HEADER__XSCALE_FACTOR:
				setXScaleFactor((Double)newValue);
				return;
			case LasPackage.LAS_HEADER__YSCALE_FACTOR:
				setYScaleFactor((Double)newValue);
				return;
			case LasPackage.LAS_HEADER__ZSCALE_FACTOR:
				setZScaleFactor((Double)newValue);
				return;
			case LasPackage.LAS_HEADER__XOFFSET:
				setXOffset((Double)newValue);
				return;
			case LasPackage.LAS_HEADER__YOFFSET:
				setYOffset((Double)newValue);
				return;
			case LasPackage.LAS_HEADER__ZOFFSET:
				setZOffset((Double)newValue);
				return;
			case LasPackage.LAS_HEADER__MAX_X:
				setMaxX((Double)newValue);
				return;
			case LasPackage.LAS_HEADER__MIN_X:
				setMinX((Double)newValue);
				return;
			case LasPackage.LAS_HEADER__MAX_Y:
				setMaxY((Double)newValue);
				return;
			case LasPackage.LAS_HEADER__MIN_Y:
				setMinY((Double)newValue);
				return;
			case LasPackage.LAS_HEADER__MAX_Z:
				setMaxZ((Double)newValue);
				return;
			case LasPackage.LAS_HEADER__MIN_Z:
				setMinZ((Double)newValue);
				return;
			case LasPackage.LAS_HEADER__START_OF_WAVEFORM_DATA_PACKET_RECORD:
				setStartOfWaveformDataPacketRecord((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LasPackage.LAS_HEADER__FILE_SIGNATURE:
				setFileSignature(FILE_SIGNATURE_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__FILE_SOURCE_ID:
				setFileSourceID(FILE_SOURCE_ID_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__GLOBAL_ENCODING:
				setGlobalEncoding(GLOBAL_ENCODING_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_1:
				setProjectID_GUID_data_1(PROJECT_ID_GUID_DATA_1_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_2:
				setProjectID_GUID_data_2(PROJECT_ID_GUID_DATA_2_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_3:
				setProjectID_GUID_data_3(PROJECT_ID_GUID_DATA_3_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_4:
				setProjectID_GUID_data_4(PROJECT_ID_GUID_DATA_4_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__VERSION_MAJOR:
				setVersionMajor(VERSION_MAJOR_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__VERSION_MINOR:
				setVersionMinor(VERSION_MINOR_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__SYSTEM_IDENTIFIER:
				setSystemIdentifier(SYSTEM_IDENTIFIER_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__GENERATING_SOFTWARE:
				setGeneratingSoftware(GENERATING_SOFTWARE_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__FILE_CREATION_DAY_OF_YEAR:
				setFileCreationDayOfYear(FILE_CREATION_DAY_OF_YEAR_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__FILE_CREATION_YEAR:
				setFileCreationYear(FILE_CREATION_YEAR_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__HEADER_SIZE:
				setHeaderSize(HEADER_SIZE_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__OFFSET_TO_POINT_DATA:
				setOffsetToPointData(OFFSET_TO_POINT_DATA_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__NVARIABLE_LENGTH_RECORDS:
				setNVariableLengthRecords(NVARIABLE_LENGTH_RECORDS_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__POINT_DATA_FORMAT_ID:
				setPointDataFormatID(POINT_DATA_FORMAT_ID_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__POINT_DATA_RECORD_LENGTH:
				setPointDataRecordLength(POINT_DATA_RECORD_LENGTH_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__NUMBER_OF_POINT_RECORDS:
				setNumberOfPointRecords(NUMBER_OF_POINT_RECORDS_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__NUMBER_OF_POINTS_BY_RETURN:
				setNumberOfPointsByReturn(NUMBER_OF_POINTS_BY_RETURN_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__XSCALE_FACTOR:
				setXScaleFactor(XSCALE_FACTOR_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__YSCALE_FACTOR:
				setYScaleFactor(YSCALE_FACTOR_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__ZSCALE_FACTOR:
				setZScaleFactor(ZSCALE_FACTOR_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__XOFFSET:
				setXOffset(XOFFSET_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__YOFFSET:
				setYOffset(YOFFSET_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__ZOFFSET:
				setZOffset(ZOFFSET_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__MAX_X:
				setMaxX(MAX_X_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__MIN_X:
				setMinX(MIN_X_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__MAX_Y:
				setMaxY(MAX_Y_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__MIN_Y:
				setMinY(MIN_Y_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__MAX_Z:
				setMaxZ(MAX_Z_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__MIN_Z:
				setMinZ(MIN_Z_EDEFAULT);
				return;
			case LasPackage.LAS_HEADER__START_OF_WAVEFORM_DATA_PACKET_RECORD:
				setStartOfWaveformDataPacketRecord(START_OF_WAVEFORM_DATA_PACKET_RECORD_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LasPackage.LAS_HEADER__FILE_SIGNATURE:
				return FILE_SIGNATURE_EDEFAULT == null ? fileSignature != null : !FILE_SIGNATURE_EDEFAULT.equals(fileSignature);
			case LasPackage.LAS_HEADER__FILE_SOURCE_ID:
				return fileSourceID != FILE_SOURCE_ID_EDEFAULT;
			case LasPackage.LAS_HEADER__GLOBAL_ENCODING:
				return globalEncoding != GLOBAL_ENCODING_EDEFAULT;
			case LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_1:
				return projectID_GUID_data_1 != PROJECT_ID_GUID_DATA_1_EDEFAULT;
			case LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_2:
				return projectID_GUID_data_2 != PROJECT_ID_GUID_DATA_2_EDEFAULT;
			case LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_3:
				return projectID_GUID_data_3 != PROJECT_ID_GUID_DATA_3_EDEFAULT;
			case LasPackage.LAS_HEADER__PROJECT_ID_GUID_DATA_4:
				return PROJECT_ID_GUID_DATA_4_EDEFAULT == null ? projectID_GUID_data_4 != null : !PROJECT_ID_GUID_DATA_4_EDEFAULT.equals(projectID_GUID_data_4);
			case LasPackage.LAS_HEADER__VERSION_MAJOR:
				return versionMajor != VERSION_MAJOR_EDEFAULT;
			case LasPackage.LAS_HEADER__VERSION_MINOR:
				return versionMinor != VERSION_MINOR_EDEFAULT;
			case LasPackage.LAS_HEADER__SYSTEM_IDENTIFIER:
				return SYSTEM_IDENTIFIER_EDEFAULT == null ? systemIdentifier != null : !SYSTEM_IDENTIFIER_EDEFAULT.equals(systemIdentifier);
			case LasPackage.LAS_HEADER__GENERATING_SOFTWARE:
				return GENERATING_SOFTWARE_EDEFAULT == null ? generatingSoftware != null : !GENERATING_SOFTWARE_EDEFAULT.equals(generatingSoftware);
			case LasPackage.LAS_HEADER__FILE_CREATION_DAY_OF_YEAR:
				return fileCreationDayOfYear != FILE_CREATION_DAY_OF_YEAR_EDEFAULT;
			case LasPackage.LAS_HEADER__FILE_CREATION_YEAR:
				return fileCreationYear != FILE_CREATION_YEAR_EDEFAULT;
			case LasPackage.LAS_HEADER__HEADER_SIZE:
				return headerSize != HEADER_SIZE_EDEFAULT;
			case LasPackage.LAS_HEADER__OFFSET_TO_POINT_DATA:
				return offsetToPointData != OFFSET_TO_POINT_DATA_EDEFAULT;
			case LasPackage.LAS_HEADER__NVARIABLE_LENGTH_RECORDS:
				return nVariableLengthRecords != NVARIABLE_LENGTH_RECORDS_EDEFAULT;
			case LasPackage.LAS_HEADER__POINT_DATA_FORMAT_ID:
				return pointDataFormatID != POINT_DATA_FORMAT_ID_EDEFAULT;
			case LasPackage.LAS_HEADER__POINT_DATA_RECORD_LENGTH:
				return pointDataRecordLength != POINT_DATA_RECORD_LENGTH_EDEFAULT;
			case LasPackage.LAS_HEADER__NUMBER_OF_POINT_RECORDS:
				return numberOfPointRecords != NUMBER_OF_POINT_RECORDS_EDEFAULT;
			case LasPackage.LAS_HEADER__NUMBER_OF_POINTS_BY_RETURN:
				return NUMBER_OF_POINTS_BY_RETURN_EDEFAULT == null ? numberOfPointsByReturn != null : !NUMBER_OF_POINTS_BY_RETURN_EDEFAULT.equals(numberOfPointsByReturn);
			case LasPackage.LAS_HEADER__XSCALE_FACTOR:
				return xScaleFactor != XSCALE_FACTOR_EDEFAULT;
			case LasPackage.LAS_HEADER__YSCALE_FACTOR:
				return yScaleFactor != YSCALE_FACTOR_EDEFAULT;
			case LasPackage.LAS_HEADER__ZSCALE_FACTOR:
				return zScaleFactor != ZSCALE_FACTOR_EDEFAULT;
			case LasPackage.LAS_HEADER__XOFFSET:
				return xOffset != XOFFSET_EDEFAULT;
			case LasPackage.LAS_HEADER__YOFFSET:
				return yOffset != YOFFSET_EDEFAULT;
			case LasPackage.LAS_HEADER__ZOFFSET:
				return zOffset != ZOFFSET_EDEFAULT;
			case LasPackage.LAS_HEADER__MAX_X:
				return maxX != MAX_X_EDEFAULT;
			case LasPackage.LAS_HEADER__MIN_X:
				return minX != MIN_X_EDEFAULT;
			case LasPackage.LAS_HEADER__MAX_Y:
				return maxY != MAX_Y_EDEFAULT;
			case LasPackage.LAS_HEADER__MIN_Y:
				return minY != MIN_Y_EDEFAULT;
			case LasPackage.LAS_HEADER__MAX_Z:
				return maxZ != MAX_Z_EDEFAULT;
			case LasPackage.LAS_HEADER__MIN_Z:
				return minZ != MIN_Z_EDEFAULT;
			case LasPackage.LAS_HEADER__START_OF_WAVEFORM_DATA_PACKET_RECORD:
				return startOfWaveformDataPacketRecord != START_OF_WAVEFORM_DATA_PACKET_RECORD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fileSignature: ");
		result.append(fileSignature);
		result.append(", fileSourceID: ");
		result.append(fileSourceID);
		result.append(", globalEncoding: ");
		result.append(globalEncoding);
		result.append(", projectID_GUID_data_1: ");
		result.append(projectID_GUID_data_1);
		result.append(", projectID_GUID_data_2: ");
		result.append(projectID_GUID_data_2);
		result.append(", projectID_GUID_data_3: ");
		result.append(projectID_GUID_data_3);
		result.append(", projectID_GUID_data_4: ");
		result.append(projectID_GUID_data_4);
		result.append(", versionMajor: ");
		result.append(versionMajor);
		result.append(", versionMinor: ");
		result.append(versionMinor);
		result.append(", systemIdentifier: ");
		result.append(systemIdentifier);
		result.append(", generatingSoftware: ");
		result.append(generatingSoftware);
		result.append(", fileCreationDayOfYear: ");
		result.append(fileCreationDayOfYear);
		result.append(", fileCreationYear: ");
		result.append(fileCreationYear);
		result.append(", headerSize: ");
		result.append(headerSize);
		result.append(", offsetToPointData: ");
		result.append(offsetToPointData);
		result.append(", nVariableLengthRecords: ");
		result.append(nVariableLengthRecords);
		result.append(", pointDataFormatID: ");
		result.append(pointDataFormatID);
		result.append(", pointDataRecordLength: ");
		result.append(pointDataRecordLength);
		result.append(", numberOfPointRecords: ");
		result.append(numberOfPointRecords);
		result.append(", numberOfPointsByReturn: ");
		result.append(numberOfPointsByReturn);
		result.append(", xScaleFactor: ");
		result.append(xScaleFactor);
		result.append(", yScaleFactor: ");
		result.append(yScaleFactor);
		result.append(", zScaleFactor: ");
		result.append(zScaleFactor);
		result.append(", xOffset: ");
		result.append(xOffset);
		result.append(", yOffset: ");
		result.append(yOffset);
		result.append(", zOffset: ");
		result.append(zOffset);
		result.append(", maxX: ");
		result.append(maxX);
		result.append(", minX: ");
		result.append(minX);
		result.append(", maxY: ");
		result.append(maxY);
		result.append(", minY: ");
		result.append(minY);
		result.append(", maxZ: ");
		result.append(maxZ);
		result.append(", minZ: ");
		result.append(minZ);
		result.append(", startOfWaveformDataPacketRecord: ");
		result.append(startOfWaveformDataPacketRecord);
		result.append(')');
		return result.toString();
	}

} //LASHeaderImpl
