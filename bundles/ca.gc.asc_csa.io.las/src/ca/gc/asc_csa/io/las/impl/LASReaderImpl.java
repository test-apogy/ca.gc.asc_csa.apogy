/**
 * <copyright>
 * </copyright>
 *
 */
package ca.gc.asc_csa.io.las.impl;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ca.gc.asc_csa.io.las.EdgeOfFlightLine;
import ca.gc.asc_csa.io.las.LASHeader;
import ca.gc.asc_csa.io.las.LASPoint;
import ca.gc.asc_csa.io.las.LASReader;
import ca.gc.asc_csa.io.las.LasFactory;
import ca.gc.asc_csa.io.las.LasPackage;
import ca.gc.asc_csa.io.las.ScanDirection;
import ca.gc.asc_csa.io.las.VariableLengthRecord;
import ca.gc.space.java.utils.io.LittleEndianDataInputStream;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>LAS Reader</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASReaderImpl#getFile <em>File</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASReaderImpl#getInputStream <em>Input Stream</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASReaderImpl#getVlrs <em>Vlrs</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASReaderImpl#getProgressMonitor <em>Progress Monitor</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASReaderImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASReaderImpl#getPoints <em>Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LASReaderImpl extends EObjectImpl implements LASReader {

	// Data is little endian.
	private LittleEndianDataInputStream dataInputStream;

	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected String file = FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputStream() <em>Input Stream</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInputStream()
	 * @generated
	 * @ordered
	 */
	protected static final InputStream INPUT_STREAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputStream() <em>Input Stream</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInputStream()
	 * @generated
	 * @ordered
	 */
	protected InputStream inputStream = INPUT_STREAM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVlrs() <em>Vlrs</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVlrs()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableLengthRecord> vlrs;

	/**
	 * The default value of the '{@link #getProgressMonitor() <em>Progress Monitor</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getProgressMonitor()
	 * @generated
	 * @ordered
	 */
	protected static final IProgressMonitor PROGRESS_MONITOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgressMonitor() <em>Progress Monitor</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getProgressMonitor()
	 * @generated
	 * @ordered
	 */
	protected IProgressMonitor progressMonitor = PROGRESS_MONITOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected LASHeader header;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<LASPoint> points;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected LASReaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LasPackage.Literals.LAS_READER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(String newFile) {
		String oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_READER__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public InputStream getInputStream() {
		return inputStream;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputStream(InputStream newInputStream) {
		InputStream oldInputStream = inputStream;
		inputStream = newInputStream;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_READER__INPUT_STREAM, oldInputStream, inputStream));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public List<VariableLengthRecord> getVlrs() {
		if (vlrs == null) {
			vlrs = new EObjectResolvingEList<VariableLengthRecord>(VariableLengthRecord.class, this, LasPackage.LAS_READER__VLRS);
		}
		return vlrs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IProgressMonitor getProgressMonitor() {
		return progressMonitor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgressMonitor(IProgressMonitor newProgressMonitor) {
		IProgressMonitor oldProgressMonitor = progressMonitor;
		progressMonitor = newProgressMonitor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_READER__PROGRESS_MONITOR, oldProgressMonitor, progressMonitor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LASHeader getHeader() {
		if (header != null && header.eIsProxy()) {
			InternalEObject oldHeader = (InternalEObject)header;
			header = (LASHeader)eResolveProxy(oldHeader);
			if (header != oldHeader) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LasPackage.LAS_READER__HEADER, oldHeader, header));
			}
		}
		return header;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LASHeader basicGetHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(LASHeader newHeader) {
		LASHeader oldHeader = header;
		header = newHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_READER__HEADER, oldHeader, header));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public List<LASPoint> getPoints() {
		if (points == null) {
			points = new EObjectResolvingEList<LASPoint>(LASPoint.class, this,
					LasPackage.LAS_READER__POINTS) {
				/**
						 * 
						 */
				private static final long serialVersionUID = 1L;

				protected boolean isUnique() {
					return false;
				}
			};
		}
		return points;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void read() throws IOException {
		// We put a marker here
		getLittleEndianInputStream().mark(0);
		readHeader();
		readVariableLengthRecords();
		readPoints();
	}

	private void readPoints() throws FileNotFoundException, IOException {

		getLittleEndianInputStream().reset();

		// We skip the point data.
		long offsetToPointData = header.getOffsetToPointData();
		getLittleEndianInputStream().skip(offsetToPointData);

		// We read chunks of data
		long nPts = header.getNumberOfPointRecords();

		// Work increment for 1/100 of the total work
		long increment = (long) Math.ceil((double) header
				.getNumberOfPointRecords() / 100.0);
		System.out.println("LASReaderImpl.readPoints() number of points: "
				+ nPts);

		int formatId = header.getPointDataFormatID();

		for (long i = 0; i < nPts; i++) {

			LASPoint point = createPoint(formatId);

			if (getProgressMonitor() != null) {
				if ((i + 1) % increment == 0) {
					getProgressMonitor().worked(1);
				}
			}

			getPoints().add(point);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LasPackage.LAS_READER__FILE:
				return getFile();
			case LasPackage.LAS_READER__INPUT_STREAM:
				return getInputStream();
			case LasPackage.LAS_READER__VLRS:
				return getVlrs();
			case LasPackage.LAS_READER__PROGRESS_MONITOR:
				return getProgressMonitor();
			case LasPackage.LAS_READER__HEADER:
				if (resolve) return getHeader();
				return basicGetHeader();
			case LasPackage.LAS_READER__POINTS:
				return getPoints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LasPackage.LAS_READER__FILE:
				setFile((String)newValue);
				return;
			case LasPackage.LAS_READER__INPUT_STREAM:
				setInputStream((InputStream)newValue);
				return;
			case LasPackage.LAS_READER__VLRS:
				getVlrs().clear();
				getVlrs().addAll((Collection<? extends VariableLengthRecord>)newValue);
				return;
			case LasPackage.LAS_READER__PROGRESS_MONITOR:
				setProgressMonitor((IProgressMonitor)newValue);
				return;
			case LasPackage.LAS_READER__HEADER:
				setHeader((LASHeader)newValue);
				return;
			case LasPackage.LAS_READER__POINTS:
				getPoints().clear();
				getPoints().addAll((Collection<? extends LASPoint>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LasPackage.LAS_READER__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case LasPackage.LAS_READER__INPUT_STREAM:
				setInputStream(INPUT_STREAM_EDEFAULT);
				return;
			case LasPackage.LAS_READER__VLRS:
				getVlrs().clear();
				return;
			case LasPackage.LAS_READER__PROGRESS_MONITOR:
				setProgressMonitor(PROGRESS_MONITOR_EDEFAULT);
				return;
			case LasPackage.LAS_READER__HEADER:
				setHeader((LASHeader)null);
				return;
			case LasPackage.LAS_READER__POINTS:
				getPoints().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LasPackage.LAS_READER__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
			case LasPackage.LAS_READER__INPUT_STREAM:
				return INPUT_STREAM_EDEFAULT == null ? inputStream != null : !INPUT_STREAM_EDEFAULT.equals(inputStream);
			case LasPackage.LAS_READER__VLRS:
				return vlrs != null && !vlrs.isEmpty();
			case LasPackage.LAS_READER__PROGRESS_MONITOR:
				return PROGRESS_MONITOR_EDEFAULT == null ? progressMonitor != null : !PROGRESS_MONITOR_EDEFAULT.equals(progressMonitor);
			case LasPackage.LAS_READER__HEADER:
				return header != null;
			case LasPackage.LAS_READER__POINTS:
				return points != null && !points.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (file: ");
		result.append(file);
		result.append(", inputStream: ");
		result.append(inputStream);
		result.append(", progressMonitor: ");
		result.append(progressMonitor);
		result.append(')');
		return result.toString();
	}

	private void readHeader() throws IOException {

		header = LasFactory.eINSTANCE.createLASHeader();

		// Following data type size expected:
		// char (1 byte)
		// unsigned char (1 byte)
		// short (2 bytes)
		// unsigned short (2 bytes)
		// long (4 bytes)
		// unsigned long (4 bytes)
		// unsigned long long (4 bytes)

		// File signature ("LASF"), char[4]
		byte[] fileSignatureData = new byte[4];
		getLittleEndianInputStream().read(fileSignatureData);

		header.setFileSignature(new String(fileSignatureData));

		// File source ID, unsigned short
		int sourceId = getLittleEndianInputStream().readUnsignedShort();
		header.setFileSourceID(sourceId);

		// Global encoding, unsigned short
		int encoding = getLittleEndianInputStream().readUnsignedShort();
		header.setGlobalEncoding(encoding);

		// Project ID, GUID data 1, unsigned long
		int guidData1 = getLittleEndianInputStream().readInt();
		header.setProjectID_GUID_data_1(guidData1);

		// Project ID, GUID data 2, unsigned short
		int guidData2 = getLittleEndianInputStream().readUnsignedShort();
		header.setProjectID_GUID_data_2(guidData2);

		// Project ID, GUID data 3, unsigned short
		int guidData3 = getLittleEndianInputStream().readUnsignedShort();
		header.setProjectID_GUID_data_3(guidData3);

		// Project ID, GUID data 4, 8 bytes
		byte[] guidData4 = new byte[8];
		getLittleEndianInputStream().read(guidData4);
		// TODO ignored for now

		// Version major, unsigned char
		int major = getLittleEndianInputStream().read();
		header.setVersionMajor(major);

		// Version minor, unsigned char
		int minor = getLittleEndianInputStream().read();
		header.setVersionMinor(minor);

		// System identifier, char[32]
		byte[] systemIdData = new byte[32];
		getLittleEndianInputStream().read(systemIdData);
		header.setSystemIdentifier(new String(systemIdData));

		// Generating software, char[32]
		byte[] generatingSoftwareData = new byte[32];
		getLittleEndianInputStream().read(generatingSoftwareData);
		header.setGeneratingSoftware(new String(generatingSoftwareData));

		// File creation day of year, unsigned short
		int fileCreationDayOfYear = getLittleEndianInputStream()
				.readUnsignedShort();
		header.setFileCreationDayOfYear(fileCreationDayOfYear);

		// File creation year, 2 bytes
		int fileCreationYear = getLittleEndianInputStream().readUnsignedShort();
		header.setFileCreationYear(fileCreationYear);

		// Header size, unsigned short
		int headerSize = getLittleEndianInputStream().readUnsignedShort();
		header.setHeaderSize(headerSize);

		// Offset to point data, unsigned long (4 bytes)
		long offsetToPointData = readUnsignedInt();
		header.setOffsetToPointData(offsetToPointData);

		// Number of variable lenght records, unsigned long (4 bytes)
		long nVariableLenghtRecords = readUnsignedInt();
		header.setNVariableLengthRecords(nVariableLenghtRecords);

		// Point data format, unsigned char
		int pointDataFormat = getLittleEndianInputStream().readUnsignedByte();

		if (pointDataFormat >= 4) { // We don't support point format with
									// waveform
			throw new IllegalArgumentException("Waveform data is not supported");
		}

		header.setPointDataFormatID(pointDataFormat);

		// Point data record length, unsigned short
		int pointDataRecordLength = getLittleEndianInputStream()
				.readUnsignedShort();
		header.setPointDataRecordLength(pointDataRecordLength);

		// Number of point records (unsigned long)
		long nPointRecords = readUnsignedInt();
		header.setNumberOfPointRecords(nPointRecords);

		// Number of points by return, unsigned long[5]
		long[] nPointsByReturn = new long[5];

		for (int i = 0; i < nPointsByReturn.length; i++) {
			long value = readUnsignedInt();
			nPointsByReturn[i] = value;
		}

		header.setNumberOfPointsByReturn(nPointsByReturn);

		// X scale factor, double
		double xScaleFactor = getLittleEndianInputStream().readDouble();
		header.setXScaleFactor(xScaleFactor);

		// Y scale factor, double
		double yScaleFactor = getLittleEndianInputStream().readDouble();
		header.setYScaleFactor(yScaleFactor);

		// Z scale factor, double
		double zScaleFactor = getLittleEndianInputStream().readDouble();
		header.setZScaleFactor(zScaleFactor);

		// X offset, double
		double xOffset = getLittleEndianInputStream().readDouble();
		header.setXOffset(xOffset);

		// Y offset, double
		double yOffset = getLittleEndianInputStream().readDouble();
		header.setYOffset(yOffset);

		// Z offset, double
		double zOffset = getLittleEndianInputStream().readDouble();
		header.setZOffset(zOffset);

		// Max X
		double maxX = getLittleEndianInputStream().readDouble();
		header.setMaxX(maxX);

		// Min X
		double minX = getLittleEndianInputStream().readDouble();
		header.setMinX(minX);

		// Max Y
		double maxY = getLittleEndianInputStream().readDouble();
		header.setMaxY(maxY);

		// Min Y
		double minY = getLittleEndianInputStream().readDouble();
		header.setMinY(minY);

		// Max Z
		double maxZ = getLittleEndianInputStream().readDouble();
		header.setMaxZ(maxZ);

		// Min Z
		double minZ = getLittleEndianInputStream().readDouble();
		header.setMinZ(minZ);

		// If format 1.3, read the extra 8 bytes
		if (major == 1 && minor == 3) {
			// // Start of waveform data packet record (8 bytes)
			long startOfWaveformDataPacketRecord = getLittleEndianInputStream()
					.readLong();
			header.setStartOfWaveformDataPacketRecord(startOfWaveformDataPacketRecord);
		}

	}

	private long readUnsignedInt() throws IOException {
		byte[] buf = new byte[4];
		getLittleEndianInputStream().readFully(buf, 0, 4);
		return (buf[3]) << 24 | (buf[2] & 0xff) << 16 | (buf[1] & 0xff) << 8
				| (buf[0] & 0xff);
	}

	private LittleEndianDataInputStream getLittleEndianInputStream()
			throws FileNotFoundException {
		if (dataInputStream == null) {

			// Using a buffered input stream to support mark / reset
			InputStream markInputStream = null;

			if (getFile() == null && getInputStream() == null) {
				throw new IllegalArgumentException();
			}

			if (getFile() != null) {
				markInputStream = new BufferedInputStream(new FileInputStream(
						getFile()));
			} else { // getInputStream() != null
				if (!getInputStream().markSupported()) {
					markInputStream = new BufferedInputStream(getInputStream());
				} else {
					markInputStream = getInputStream();
				}
			}

			dataInputStream = new LittleEndianDataInputStream(markInputStream);

		}

		return dataInputStream;
	}

	private List<VariableLengthRecord> readVariableLengthRecords()
			throws IOException {

		List<VariableLengthRecord> list = new ArrayList<VariableLengthRecord>();

		for (int i = 0; i < header.getNVariableLengthRecords(); i++) {
			VariableLengthRecord vlr = readNextVLR();
			list.add(vlr);
		}

		return list;
	}

	private VariableLengthRecord readNextVLR() throws IOException {

		// First unsigned short is reserved.
		int recordSig = getLittleEndianInputStream().readUnsignedShort();

		// UserID, char[16]
		byte[] userIdData = new byte[16];
		getLittleEndianInputStream().read(userIdData);

		String userID = new String(userIdData);

		// Record ID, unsigned short
		int recordID = getLittleEndianInputStream().readUnsignedShort();

		// Record length after header, unsigned short
		int rlah = getLittleEndianInputStream().readUnsignedShort();

		String description = null;

		// Description, char[32]
		byte[] descriptionData = new byte[32];
		getLittleEndianInputStream().read(descriptionData);

		description = new String(descriptionData);

		byte[] data = new byte[rlah];

		getLittleEndianInputStream().read(data);

		VariableLengthRecord vlr = LasFactory.eINSTANCE
				.createVariableLengthRecord();
		vlr.setReserved(recordSig);
		vlr.setDescription(description);
		vlr.setUserID(userID);
		vlr.setRecordID(recordID);
		vlr.setRecordLenghtAfterHeader(rlah);

		return vlr;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @throws IOException
	 * 
	 * @generated_NOT
	 */
	public LASPoint createPoint(int formatID) throws IOException {

		if (formatID >= 4) {
			throw new IllegalArgumentException("Invalid point format");
		}

		LASPoint point = LasFactory.eINSTANCE.createLASPoint();

		// Every point format has at least the 0 format

		// x, 4 bytes
		int x = getLittleEndianInputStream().readInt();
		point.setX(x);

		// y, 4 bytes
		int y = getLittleEndianInputStream().readInt();
		point.setY(y);

		// z, 4 bytes
		int z = getLittleEndianInputStream().readInt();
		point.setZ(z);

		// intensity, 2 bytes
		int intensity = getLittleEndianInputStream().readUnsignedShort();
		point.setIntensity(intensity);

		// next byte contains return number (3 bits), number of returns (3
		// bits), scan direction flag (1 bit), edge of flight line (1 bit).
		byte b = getLittleEndianInputStream().readByte();

		// Return number mask.
		byte returnNumberMask = (byte) 0xE0;
		byte returnNumber = (byte) ((b & returnNumberMask) >> 5);

		// Number of returns
		byte nReturnsMask = (byte) 0x1C;
		byte nReturns = (byte) ((b & nReturnsMask) >> 2);

		// Scan direction
		byte scanDirFlag = (byte) 0x2;
		int scanDir = (b & scanDirFlag) >> 1;

		// Edge of flight line
		byte eflMask = (byte) 0x1;
		int efl = (b & eflMask);

		point.setReturnNumber(returnNumber);
		point.setNumberOfReturns(nReturns);
		point.setScanDirection(ScanDirection.get(scanDir));
		point.setEdgeOfFlightLine(EdgeOfFlightLine.get(efl));

		// Classification, unsigned char, 1 byte
		int classification = getLittleEndianInputStream().readUnsignedByte();
		point.setClassification((short) classification);

		// Scan angle rank, 1 byte
		byte scanAngle = getLittleEndianInputStream().readByte();
		point.setScanAngleRank(scanAngle);

		// User data, unsigned char, 1 byte
		int userData = getLittleEndianInputStream().readUnsignedByte();
		point.setUserData((short) userData);

		// Point source id, unsigned short, 2 bytes
		int pointSourceId = getLittleEndianInputStream().readUnsignedShort();
		point.setPointSourceId(pointSourceId);

		// if format 1, an extra GPS time is added
		if (formatID == 1 || formatID == 3) {
			double gpsTime = getLittleEndianInputStream().readDouble();
			point.setGpsTime(gpsTime);
		}

		if (formatID == 2) { // if format 2, an extra red, green, blue value is
								// added.
			// red, unsigned short, 2 bytes
			int red = getLittleEndianInputStream().readUnsignedShort();
			point.setRed(red);

			// green, unsigned short, 2 bytes
			int green = getLittleEndianInputStream().readUnsignedShort();
			point.setGreen(green);

			// blue, unsigned short, 2 bytes
			int blue = getLittleEndianInputStream().readUnsignedShort();
			point.setBlue(blue);
		}

		return point;
	}

} // LASReaderImpl
