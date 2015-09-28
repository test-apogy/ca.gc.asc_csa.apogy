/**
 * <copyright>
 * </copyright>
 *
 */
package ca.gc.asc_csa.io.las.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.gc.asc_csa.io.las.EdgeOfFlightLine;
import ca.gc.asc_csa.io.las.LASFacade;
import ca.gc.asc_csa.io.las.LASHeader;
import ca.gc.asc_csa.io.las.LASPoint;
import ca.gc.asc_csa.io.las.LASReader;
import ca.gc.asc_csa.io.las.LASWriter;
import ca.gc.asc_csa.io.las.LasFactory;
import ca.gc.asc_csa.io.las.LasPackage;
import ca.gc.asc_csa.io.las.ScanDirection;
import ca.gc.asc_csa.io.las.VariableLengthRecord;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class LasPackageImpl extends EPackageImpl implements LasPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lasHeaderEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableLengthRecordEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lasReaderEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lasPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lasFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lasWriterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scanDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum edgeOfFlightLineEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType longArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ioExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType outputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iProgressMonitorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType charArrayEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ca.gc.asc_csa.io.las.LasPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LasPackageImpl() {
		super(eNS_URI, LasFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link LasPackage#eINSTANCE} when that
	 * field is accessed. Clients should not invoke it directly. Instead, they
	 * should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LasPackage init() {
		if (isInited) return (LasPackage)EPackage.Registry.INSTANCE.getEPackage(LasPackage.eNS_URI);

		// Obtain or create and register package
		LasPackageImpl theLasPackage = (LasPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LasPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LasPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLasPackage.createPackageContents();

		// Initialize created meta-data
		theLasPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLasPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LasPackage.eNS_URI, theLasPackage);
		return theLasPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLASHeader() {
		return lasHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_FileSignature() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_FileSourceID() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_GlobalEncoding() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_ProjectID_GUID_data_1() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_ProjectID_GUID_data_2() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_ProjectID_GUID_data_3() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_ProjectID_GUID_data_4() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_VersionMajor() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_VersionMinor() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_SystemIdentifier() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_GeneratingSoftware() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_FileCreationDayOfYear() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_FileCreationYear() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_HeaderSize() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_OffsetToPointData() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_NVariableLengthRecords() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_PointDataFormatID() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_PointDataRecordLength() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_NumberOfPointRecords() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_NumberOfPointsByReturn() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_XScaleFactor() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_YScaleFactor() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_ZScaleFactor() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_XOffset() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_YOffset() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_ZOffset() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_MaxX() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_MinX() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_MaxY() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_MinY() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_MaxZ() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_MinZ() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASHeader_StartOfWaveformDataPacketRecord() {
		return (EAttribute)lasHeaderEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableLengthRecord() {
		return variableLengthRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableLengthRecord_Reserved() {
		return (EAttribute)variableLengthRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableLengthRecord_UserID() {
		return (EAttribute)variableLengthRecordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableLengthRecord_RecordID() {
		return (EAttribute)variableLengthRecordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableLengthRecord_RecordLenghtAfterHeader() {
		return (EAttribute)variableLengthRecordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableLengthRecord_Description() {
		return (EAttribute)variableLengthRecordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLASReader() {
		return lasReaderEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASReader_File() {
		return (EAttribute)lasReaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASReader_InputStream() {
		return (EAttribute)lasReaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLASReader_Vlrs() {
		return (EReference)lasReaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASReader_ProgressMonitor() {
		return (EAttribute)lasReaderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLASReader_Header() {
		return (EReference)lasReaderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLASReader_Points() {
		return (EReference)lasReaderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLASPoint() {
		return lasPointEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASPoint_X() {
		return (EAttribute)lasPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASPoint_Y() {
		return (EAttribute)lasPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASPoint_Z() {
		return (EAttribute)lasPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASPoint_Intensity() {
		return (EAttribute)lasPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASPoint_ReturnNumber() {
		return (EAttribute)lasPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASPoint_NumberOfReturns() {
		return (EAttribute)lasPointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASPoint_ScanDirection() {
		return (EAttribute)lasPointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASPoint_EdgeOfFlightLine() {
		return (EAttribute)lasPointEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASPoint_Classification() {
		return (EAttribute)lasPointEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASPoint_ScanAngleRank() {
		return (EAttribute)lasPointEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASPoint_UserData() {
		return (EAttribute)lasPointEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASPoint_PointSourceId() {
		return (EAttribute)lasPointEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASPoint_GpsTime() {
		return (EAttribute)lasPointEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASPoint_Red() {
		return (EAttribute)lasPointEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASPoint_Green() {
		return (EAttribute)lasPointEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASPoint_Blue() {
		return (EAttribute)lasPointEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLASFacade() {
		return lasFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLASWriter() {
		return lasWriterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASWriter_FileName() {
		return (EAttribute)lasWriterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASWriter_ProgressMonitor() {
		return (EAttribute)lasWriterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLASWriter_Points() {
		return (EReference)lasWriterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASWriter_ScaleX() {
		return (EAttribute)lasWriterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASWriter_ScaleY() {
		return (EAttribute)lasWriterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASWriter_ScaleZ() {
		return (EAttribute)lasWriterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLASWriter_Header() {
		return (EReference)lasWriterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASWriter_XOffset() {
		return (EAttribute)lasWriterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASWriter_YOffset() {
		return (EAttribute)lasWriterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASWriter_ZOffset() {
		return (EAttribute)lasWriterEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLASWriter_OutputStream() {
		return (EAttribute)lasWriterEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScanDirection() {
		return scanDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEdgeOfFlightLine() {
		return edgeOfFlightLineEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLongArray() {
		return longArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInputStream() {
		return inputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIOException() {
		return ioExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOutputStream() {
		return outputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIProgressMonitor() {
		return iProgressMonitorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCharArray() {
		return charArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LasFactory getLasFactory() {
		return (LasFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		lasHeaderEClass = createEClass(LAS_HEADER);
		createEAttribute(lasHeaderEClass, LAS_HEADER__FILE_SIGNATURE);
		createEAttribute(lasHeaderEClass, LAS_HEADER__FILE_SOURCE_ID);
		createEAttribute(lasHeaderEClass, LAS_HEADER__GLOBAL_ENCODING);
		createEAttribute(lasHeaderEClass, LAS_HEADER__PROJECT_ID_GUID_DATA_1);
		createEAttribute(lasHeaderEClass, LAS_HEADER__PROJECT_ID_GUID_DATA_2);
		createEAttribute(lasHeaderEClass, LAS_HEADER__PROJECT_ID_GUID_DATA_3);
		createEAttribute(lasHeaderEClass, LAS_HEADER__PROJECT_ID_GUID_DATA_4);
		createEAttribute(lasHeaderEClass, LAS_HEADER__VERSION_MAJOR);
		createEAttribute(lasHeaderEClass, LAS_HEADER__VERSION_MINOR);
		createEAttribute(lasHeaderEClass, LAS_HEADER__SYSTEM_IDENTIFIER);
		createEAttribute(lasHeaderEClass, LAS_HEADER__GENERATING_SOFTWARE);
		createEAttribute(lasHeaderEClass, LAS_HEADER__FILE_CREATION_DAY_OF_YEAR);
		createEAttribute(lasHeaderEClass, LAS_HEADER__FILE_CREATION_YEAR);
		createEAttribute(lasHeaderEClass, LAS_HEADER__HEADER_SIZE);
		createEAttribute(lasHeaderEClass, LAS_HEADER__OFFSET_TO_POINT_DATA);
		createEAttribute(lasHeaderEClass, LAS_HEADER__NVARIABLE_LENGTH_RECORDS);
		createEAttribute(lasHeaderEClass, LAS_HEADER__POINT_DATA_FORMAT_ID);
		createEAttribute(lasHeaderEClass, LAS_HEADER__POINT_DATA_RECORD_LENGTH);
		createEAttribute(lasHeaderEClass, LAS_HEADER__NUMBER_OF_POINT_RECORDS);
		createEAttribute(lasHeaderEClass, LAS_HEADER__NUMBER_OF_POINTS_BY_RETURN);
		createEAttribute(lasHeaderEClass, LAS_HEADER__XSCALE_FACTOR);
		createEAttribute(lasHeaderEClass, LAS_HEADER__YSCALE_FACTOR);
		createEAttribute(lasHeaderEClass, LAS_HEADER__ZSCALE_FACTOR);
		createEAttribute(lasHeaderEClass, LAS_HEADER__XOFFSET);
		createEAttribute(lasHeaderEClass, LAS_HEADER__YOFFSET);
		createEAttribute(lasHeaderEClass, LAS_HEADER__ZOFFSET);
		createEAttribute(lasHeaderEClass, LAS_HEADER__MAX_X);
		createEAttribute(lasHeaderEClass, LAS_HEADER__MIN_X);
		createEAttribute(lasHeaderEClass, LAS_HEADER__MAX_Y);
		createEAttribute(lasHeaderEClass, LAS_HEADER__MIN_Y);
		createEAttribute(lasHeaderEClass, LAS_HEADER__MAX_Z);
		createEAttribute(lasHeaderEClass, LAS_HEADER__MIN_Z);
		createEAttribute(lasHeaderEClass, LAS_HEADER__START_OF_WAVEFORM_DATA_PACKET_RECORD);

		variableLengthRecordEClass = createEClass(VARIABLE_LENGTH_RECORD);
		createEAttribute(variableLengthRecordEClass, VARIABLE_LENGTH_RECORD__RESERVED);
		createEAttribute(variableLengthRecordEClass, VARIABLE_LENGTH_RECORD__USER_ID);
		createEAttribute(variableLengthRecordEClass, VARIABLE_LENGTH_RECORD__RECORD_ID);
		createEAttribute(variableLengthRecordEClass, VARIABLE_LENGTH_RECORD__RECORD_LENGHT_AFTER_HEADER);
		createEAttribute(variableLengthRecordEClass, VARIABLE_LENGTH_RECORD__DESCRIPTION);

		lasReaderEClass = createEClass(LAS_READER);
		createEAttribute(lasReaderEClass, LAS_READER__FILE);
		createEAttribute(lasReaderEClass, LAS_READER__INPUT_STREAM);
		createEReference(lasReaderEClass, LAS_READER__VLRS);
		createEAttribute(lasReaderEClass, LAS_READER__PROGRESS_MONITOR);
		createEReference(lasReaderEClass, LAS_READER__HEADER);
		createEReference(lasReaderEClass, LAS_READER__POINTS);

		lasPointEClass = createEClass(LAS_POINT);
		createEAttribute(lasPointEClass, LAS_POINT__X);
		createEAttribute(lasPointEClass, LAS_POINT__Y);
		createEAttribute(lasPointEClass, LAS_POINT__Z);
		createEAttribute(lasPointEClass, LAS_POINT__INTENSITY);
		createEAttribute(lasPointEClass, LAS_POINT__RETURN_NUMBER);
		createEAttribute(lasPointEClass, LAS_POINT__NUMBER_OF_RETURNS);
		createEAttribute(lasPointEClass, LAS_POINT__SCAN_DIRECTION);
		createEAttribute(lasPointEClass, LAS_POINT__EDGE_OF_FLIGHT_LINE);
		createEAttribute(lasPointEClass, LAS_POINT__CLASSIFICATION);
		createEAttribute(lasPointEClass, LAS_POINT__SCAN_ANGLE_RANK);
		createEAttribute(lasPointEClass, LAS_POINT__USER_DATA);
		createEAttribute(lasPointEClass, LAS_POINT__POINT_SOURCE_ID);
		createEAttribute(lasPointEClass, LAS_POINT__GPS_TIME);
		createEAttribute(lasPointEClass, LAS_POINT__RED);
		createEAttribute(lasPointEClass, LAS_POINT__GREEN);
		createEAttribute(lasPointEClass, LAS_POINT__BLUE);

		lasFacadeEClass = createEClass(LAS_FACADE);

		lasWriterEClass = createEClass(LAS_WRITER);
		createEAttribute(lasWriterEClass, LAS_WRITER__FILE_NAME);
		createEAttribute(lasWriterEClass, LAS_WRITER__PROGRESS_MONITOR);
		createEReference(lasWriterEClass, LAS_WRITER__POINTS);
		createEAttribute(lasWriterEClass, LAS_WRITER__SCALE_X);
		createEAttribute(lasWriterEClass, LAS_WRITER__SCALE_Y);
		createEAttribute(lasWriterEClass, LAS_WRITER__SCALE_Z);
		createEReference(lasWriterEClass, LAS_WRITER__HEADER);
		createEAttribute(lasWriterEClass, LAS_WRITER__XOFFSET);
		createEAttribute(lasWriterEClass, LAS_WRITER__YOFFSET);
		createEAttribute(lasWriterEClass, LAS_WRITER__ZOFFSET);
		createEAttribute(lasWriterEClass, LAS_WRITER__OUTPUT_STREAM);

		// Create enums
		scanDirectionEEnum = createEEnum(SCAN_DIRECTION);
		edgeOfFlightLineEEnum = createEEnum(EDGE_OF_FLIGHT_LINE);

		// Create data types
		iProgressMonitorEDataType = createEDataType(IPROGRESS_MONITOR);
		charArrayEDataType = createEDataType(CHAR_ARRAY);
		longArrayEDataType = createEDataType(LONG_ARRAY);
		inputStreamEDataType = createEDataType(INPUT_STREAM);
		ioExceptionEDataType = createEDataType(IO_EXCEPTION);
		outputStreamEDataType = createEDataType(OUTPUT_STREAM);
		exceptionEDataType = createEDataType(EXCEPTION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(lasHeaderEClass, LASHeader.class, "LASHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLASHeader_FileSignature(), ecorePackage.getEString(), "fileSignature", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_FileSourceID(), ecorePackage.getEInt(), "fileSourceID", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_GlobalEncoding(), ecorePackage.getEInt(), "globalEncoding", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_ProjectID_GUID_data_1(), ecorePackage.getELong(), "projectID_GUID_data_1", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_ProjectID_GUID_data_2(), ecorePackage.getEInt(), "projectID_GUID_data_2", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_ProjectID_GUID_data_3(), ecorePackage.getEInt(), "projectID_GUID_data_3", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_ProjectID_GUID_data_4(), ecorePackage.getEByteArray(), "projectID_GUID_data_4", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_VersionMajor(), ecorePackage.getEInt(), "versionMajor", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_VersionMinor(), ecorePackage.getEInt(), "versionMinor", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_SystemIdentifier(), ecorePackage.getEString(), "systemIdentifier", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_GeneratingSoftware(), ecorePackage.getEString(), "generatingSoftware", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_FileCreationDayOfYear(), ecorePackage.getEInt(), "fileCreationDayOfYear", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_FileCreationYear(), ecorePackage.getEInt(), "fileCreationYear", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_HeaderSize(), ecorePackage.getEInt(), "headerSize", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_OffsetToPointData(), ecorePackage.getELong(), "offsetToPointData", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_NVariableLengthRecords(), ecorePackage.getELong(), "nVariableLengthRecords", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_PointDataFormatID(), ecorePackage.getEInt(), "pointDataFormatID", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_PointDataRecordLength(), ecorePackage.getEInt(), "pointDataRecordLength", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_NumberOfPointRecords(), ecorePackage.getELong(), "numberOfPointRecords", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_NumberOfPointsByReturn(), this.getLongArray(), "numberOfPointsByReturn", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_XScaleFactor(), ecorePackage.getEDouble(), "xScaleFactor", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_YScaleFactor(), ecorePackage.getEDouble(), "yScaleFactor", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_ZScaleFactor(), ecorePackage.getEDouble(), "zScaleFactor", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_XOffset(), ecorePackage.getEDouble(), "xOffset", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_YOffset(), ecorePackage.getEDouble(), "yOffset", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_ZOffset(), ecorePackage.getEDouble(), "zOffset", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_MaxX(), ecorePackage.getEDouble(), "maxX", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_MinX(), ecorePackage.getEDouble(), "minX", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_MaxY(), ecorePackage.getEDouble(), "maxY", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_MinY(), ecorePackage.getEDouble(), "minY", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_MaxZ(), ecorePackage.getEDouble(), "maxZ", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_MinZ(), ecorePackage.getEDouble(), "minZ", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASHeader_StartOfWaveformDataPacketRecord(), ecorePackage.getELong(), "startOfWaveformDataPacketRecord", null, 0, 1, LASHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableLengthRecordEClass, VariableLengthRecord.class, "VariableLengthRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableLengthRecord_Reserved(), ecorePackage.getEInt(), "reserved", null, 0, 1, VariableLengthRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableLengthRecord_UserID(), ecorePackage.getEString(), "userID", null, 0, 1, VariableLengthRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableLengthRecord_RecordID(), ecorePackage.getEInt(), "recordID", null, 0, 1, VariableLengthRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableLengthRecord_RecordLenghtAfterHeader(), ecorePackage.getEInt(), "recordLenghtAfterHeader", null, 0, 1, VariableLengthRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableLengthRecord_Description(), ecorePackage.getEString(), "description", null, 0, 1, VariableLengthRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lasReaderEClass, LASReader.class, "LASReader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLASReader_File(), ecorePackage.getEString(), "file", null, 0, 1, LASReader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASReader_InputStream(), this.getInputStream(), "inputStream", null, 0, 1, LASReader.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLASReader_Vlrs(), this.getVariableLengthRecord(), null, "vlrs", null, 0, -1, LASReader.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASReader_ProgressMonitor(), this.getIProgressMonitor(), "progressMonitor", null, 0, 1, LASReader.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLASReader_Header(), this.getLASHeader(), null, "header", null, 0, 1, LASReader.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLASReader_Points(), this.getLASPoint(), null, "points", null, 0, -1, LASReader.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(lasReaderEClass, null, "read", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		initEClass(lasPointEClass, LASPoint.class, "LASPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLASPoint_X(), ecorePackage.getELong(), "x", null, 0, 1, LASPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASPoint_Y(), ecorePackage.getELong(), "y", null, 0, 1, LASPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASPoint_Z(), ecorePackage.getELong(), "z", null, 0, 1, LASPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASPoint_Intensity(), ecorePackage.getEInt(), "intensity", null, 0, 1, LASPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASPoint_ReturnNumber(), ecorePackage.getEByte(), "returnNumber", null, 0, 1, LASPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASPoint_NumberOfReturns(), ecorePackage.getEByte(), "numberOfReturns", null, 0, 1, LASPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASPoint_ScanDirection(), this.getScanDirection(), "scanDirection", null, 0, 1, LASPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASPoint_EdgeOfFlightLine(), this.getEdgeOfFlightLine(), "edgeOfFlightLine", null, 0, 1, LASPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASPoint_Classification(), ecorePackage.getEShort(), "classification", null, 0, 1, LASPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASPoint_ScanAngleRank(), ecorePackage.getEByte(), "scanAngleRank", null, 0, 1, LASPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASPoint_UserData(), ecorePackage.getEShort(), "userData", null, 0, 1, LASPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASPoint_PointSourceId(), ecorePackage.getEInt(), "pointSourceId", null, 0, 1, LASPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASPoint_GpsTime(), ecorePackage.getEDouble(), "gpsTime", null, 0, 1, LASPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASPoint_Red(), ecorePackage.getEInt(), "red", null, 0, 1, LASPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASPoint_Green(), ecorePackage.getEInt(), "green", null, 0, 1, LASPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASPoint_Blue(), ecorePackage.getEInt(), "blue", null, 0, 1, LASPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lasFacadeEClass, LASFacade.class, "LASFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(lasFacadeEClass, this.getLASPoint(), "createPoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "formatID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "data", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		initEClass(lasWriterEClass, LASWriter.class, "LASWriter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLASWriter_FileName(), ecorePackage.getEString(), "fileName", null, 0, 1, LASWriter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASWriter_ProgressMonitor(), this.getIProgressMonitor(), "progressMonitor", null, 0, 1, LASWriter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLASWriter_Points(), this.getLASPoint(), null, "points", null, 0, -1, LASWriter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLASWriter_ScaleX(), ecorePackage.getEDouble(), "scaleX", "0.01", 0, 1, LASWriter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASWriter_ScaleY(), ecorePackage.getEDouble(), "scaleY", "0.01", 0, 1, LASWriter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASWriter_ScaleZ(), ecorePackage.getEDouble(), "scaleZ", "0.01", 0, 1, LASWriter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLASWriter_Header(), this.getLASHeader(), null, "header", null, 0, 1, LASWriter.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASWriter_XOffset(), ecorePackage.getEDouble(), "xOffset", "0.0", 0, 1, LASWriter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASWriter_YOffset(), ecorePackage.getEDouble(), "yOffset", "0.0", 0, 1, LASWriter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASWriter_ZOffset(), ecorePackage.getEDouble(), "zOffset", "0.0", 0, 1, LASWriter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLASWriter_OutputStream(), this.getOutputStream(), "outputStream", null, 0, 1, LASWriter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(lasWriterEClass, null, "write", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		// Initialize enums and add enum literals
		initEEnum(scanDirectionEEnum, ScanDirection.class, "ScanDirection");
		addEEnumLiteral(scanDirectionEEnum, ScanDirection.NEGATIVE);
		addEEnumLiteral(scanDirectionEEnum, ScanDirection.POSITIVE);

		initEEnum(edgeOfFlightLineEEnum, EdgeOfFlightLine.class, "EdgeOfFlightLine");
		addEEnumLiteral(edgeOfFlightLineEEnum, EdgeOfFlightLine.END);
		addEEnumLiteral(edgeOfFlightLineEEnum, EdgeOfFlightLine.NOT_END);

		// Initialize data types
		initEDataType(iProgressMonitorEDataType, IProgressMonitor.class, "IProgressMonitor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(charArrayEDataType, char[].class, "CharArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(longArrayEDataType, long[].class, "LongArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(inputStreamEDataType, InputStream.class, "InputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ioExceptionEDataType, IOException.class, "IOException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(outputStreamEDataType, OutputStream.class, "OutputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // LasPackageImpl
