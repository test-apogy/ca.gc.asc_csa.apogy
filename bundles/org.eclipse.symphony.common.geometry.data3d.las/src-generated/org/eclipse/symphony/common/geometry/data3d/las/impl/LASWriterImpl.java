/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.symphony.common.geometry.data3d.las.impl;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Collection;
import javax.vecmath.Point3d;
import javax.vecmath.Tuple3d;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.geometry.data3d.las.LASHeader;
import org.eclipse.symphony.common.geometry.data3d.las.LASPoint;
import org.eclipse.symphony.common.geometry.data3d.las.LASWriter;
import org.eclipse.symphony.common.geometry.data3d.las.LasFactory;
import org.eclipse.symphony.common.geometry.data3d.las.LasPackage;
import org.eclipse.symphony.common.lang.java.io.LittleEndianDataOutputStream;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>LAS Writer</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.impl.LASWriterImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.impl.LASWriterImpl#getProgressMonitor <em>Progress Monitor</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.impl.LASWriterImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.impl.LASWriterImpl#getScaleX <em>Scale X</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.impl.LASWriterImpl#getScaleY <em>Scale Y</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.impl.LASWriterImpl#getScaleZ <em>Scale Z</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.impl.LASWriterImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.impl.LASWriterImpl#getXOffset <em>XOffset</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.impl.LASWriterImpl#getYOffset <em>YOffset</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.impl.LASWriterImpl#getZOffset <em>ZOffset</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.impl.LASWriterImpl#getOutputStream <em>Output Stream</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LASWriterImpl extends MinimalEObjectImpl.Container implements LASWriter {

	public static final int HEADER_SIZE = 235;

	// Point format 3 being used: 34 bytes
	public static final int POINT_RECORD_LENGTH = 34;

	// 32kb
	private static final int WRITE_BUFFER_SIZE = 32 * 1024;

	private Tuple3d min;
	private Tuple3d max;

	private LittleEndianDataOutputStream output;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<LASPoint> points;

	/**
	 * The default value of the '{@link #getScaleX() <em>Scale X</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getScaleX()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE_X_EDEFAULT = 0.01;

	/**
	 * The cached value of the '{@link #getScaleX() <em>Scale X</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getScaleX()
	 * @generated
	 * @ordered
	 */
	protected double scaleX = SCALE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleY() <em>Scale Y</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getScaleY()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE_Y_EDEFAULT = 0.01;

	/**
	 * The cached value of the '{@link #getScaleY() <em>Scale Y</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getScaleY()
	 * @generated
	 * @ordered
	 */
	protected double scaleY = SCALE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleZ() <em>Scale Z</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getScaleZ()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE_Z_EDEFAULT = 0.01;

	/**
	 * The cached value of the '{@link #getScaleZ() <em>Scale Z</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getScaleZ()
	 * @generated
	 * @ordered
	 */
	protected double scaleZ = SCALE_Z_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected LASHeader header;

	/**
	 * The default value of the '{@link #getXOffset() <em>XOffset</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getXOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double XOFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXOffset() <em>XOffset</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getXOffset()
	 * @generated
	 * @ordered
	 */
	protected double xOffset = XOFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getYOffset() <em>YOffset</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getYOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double YOFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYOffset() <em>YOffset</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getYOffset()
	 * @generated
	 * @ordered
	 */
	protected double yOffset = YOFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getZOffset() <em>ZOffset</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getZOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double ZOFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getZOffset() <em>ZOffset</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getZOffset()
	 * @generated
	 * @ordered
	 */
	protected double zOffset = ZOFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputStream() <em>Output Stream</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getOutputStream()
	 * @generated
	 * @ordered
	 */
	protected static final OutputStream OUTPUT_STREAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputStream() <em>Output Stream</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getOutputStream()
	 * @generated
	 * @ordered
	 */
	protected OutputStream outputStream = OUTPUT_STREAM_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected LASWriterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LasPackage.Literals.LAS_WRITER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_WRITER__FILE_NAME, oldFileName, fileName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_WRITER__PROGRESS_MONITOR, oldProgressMonitor, progressMonitor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EList<LASPoint> getPoints() {
		if (points == null) {
			// points = new EObjectResolvingEList<LASPoint>(LASPoint.class,
			// this,
			// LasPackage.LAS_WRITER__POINTS) {
			// protected boolean isUnique() {
			// return false;
			// }
			// };
			points = new BasicEList<LASPoint>();
		}
		return points;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getScaleX() {
		return scaleX;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleX(double newScaleX) {
		double oldScaleX = scaleX;
		scaleX = newScaleX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_WRITER__SCALE_X, oldScaleX, scaleX));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getScaleY() {
		return scaleY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleY(double newScaleY) {
		double oldScaleY = scaleY;
		scaleY = newScaleY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_WRITER__SCALE_Y, oldScaleY, scaleY));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getScaleZ() {
		return scaleZ;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleZ(double newScaleZ) {
		double oldScaleZ = scaleZ;
		scaleZ = newScaleZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_WRITER__SCALE_Z, oldScaleZ, scaleZ));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LasPackage.LAS_WRITER__HEADER, oldHeader, header));
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
	public double getXOffset() {
		return xOffset;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setXOffset(double newXOffset) {
		double oldXOffset = xOffset;
		xOffset = newXOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_WRITER__XOFFSET, oldXOffset, xOffset));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getYOffset() {
		return yOffset;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setYOffset(double newYOffset) {
		double oldYOffset = yOffset;
		yOffset = newYOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_WRITER__YOFFSET, oldYOffset, yOffset));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getZOffset() {
		return zOffset;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setZOffset(double newZOffset) {
		double oldZOffset = zOffset;
		zOffset = newZOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_WRITER__ZOFFSET, oldZOffset, zOffset));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OutputStream getOutputStream() {
		return outputStream;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputStream(OutputStream newOutputStream) {
		OutputStream oldOutputStream = outputStream;
		outputStream = newOutputStream;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_WRITER__OUTPUT_STREAM, oldOutputStream, outputStream));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void write() throws IOException {

		// We write the header.
		buildHeader();

		// We open the data stream
		openDataStream();

		// We write the header.
		writeHeader();

		// No variable record for the moment.

		// We write the point data.
		for (LASPoint point : getPoints()) {
			writePoint(point);
		}

		// We close the stream.
		output.flush();
		output.close();
	}

	private void writePoint(LASPoint point) throws IOException {
		output.writeInt((int) point.getX());
		output.writeInt((int) point.getY());
		output.writeInt((int) point.getZ());
		output.writeShort(point.getIntensity());

		byte returnNumber = point.getReturnNumber();
		byte nReturns = point.getNumberOfReturns();
		byte scanDir = (byte) point.getScanDirection().getValue();
		byte edgeOfFlightLine = (byte) point.getEdgeOfFlightLine().getValue();

		// We encode
		byte value = (byte) ((returnNumber) | (nReturns << 3) | (scanDir << 6) | edgeOfFlightLine << 7);		
		output.writeByte(value);

		output.writeByte(point.getClassification());
		output.writeByte(point.getScanAngleRank());
		output.writeByte(point.getUserData());
		output.writeShort(point.getPointSourceId());
		output.writeDouble(point.getGpsTime());
		output.writeShort(point.getRed());
		output.writeShort(point.getGreen());
		output.writeShort(point.getBlue());
	}

	/**
	 * 
	 * <dl>
	 * <dt>Name:</dt>
	 * <dd>openDataStream</dd>
	 * <dt>Description:</dt>
	 * <dd>Opens the data stream. If {@link #getFileName()} is not
	 * <code>null</code>, the output stream is written to that file. If
	 * {@link #getFileName()} == <code>null</code> and
	 * {@link #getOutputStream()} != null, the output writes to that stream,
	 * allowing the possibility to send the data to any stream, for instance,
	 * via network or serial port.</dd>
	 * <dt>Pre-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>{@link #getFileName()} != null</li>
	 * <li>OR</li>
	 * <li>{@link #getOutputStream()} != null</li>
	 * </ul>
	 * </dd>
	 * <dt>Post-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>{@link #output} != null</li>
	 * </ul>
	 * </dd>
	 * </dl>
	 * 
	 * @throws IllegalArgumentException
	 *             if the pre-condition is not met.
	 */
	private void openDataStream() throws IOException {
		if (getFileName() == null && getOutputStream() == null) {
			throw new IllegalArgumentException();
		}

		BufferedOutputStream bos = null;

		if (getFileName() != null) {
			FileOutputStream fos = new FileOutputStream(getFileName());
			bos = new BufferedOutputStream(fos, WRITE_BUFFER_SIZE);
		} else { // getOutputStream() != null
			bos = new BufferedOutputStream(getOutputStream(), WRITE_BUFFER_SIZE);
		}

		output = new LittleEndianDataOutputStream(bos);

	}

	/**
	 * 
	 * <dl>
	 * <dt>Name:</dt>
	 * <dd>writeHeader</dd>
	 * <dt>Description:</dt>
	 * <dd>writes the header</dd>
	 * <dt>Pre-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>{@link #header} != null</li>
	 * <li>{@link #output} != null</li>
	 * </ul>
	 * </dd>
	 * <dt>Post-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>header has been written to {@link #output}</li>
	 * </ul>
	 * </dd>
	 * </dl>
	 * 
	 * @throws IOException
	 */
	private void writeHeader() throws IOException {
		output.write(header.getFileSignature().getBytes());
		output.writeShort(header.getFileSourceID());
		output.writeShort(header.getGlobalEncoding());
		output.writeInt((int) header.getProjectID_GUID_data_1());
		output.writeShort((int) header.getProjectID_GUID_data_2());
		output.writeShort((int) header.getProjectID_GUID_data_3());
		output.write(header.getProjectID_GUID_data_4());
		output.writeByte(header.getVersionMajor());
		output.writeByte(header.getVersionMinor());

		// System id is 32 bytes
		byte[] systemIdBytes = new byte[32];
		byte[] systemId = header.getSystemIdentifier().getBytes();

		// We fill systemIdBytes
		for (int i = 0; i < systemId.length; i++) {
			if (i < systemIdBytes.length) {
				systemIdBytes[i] = systemId[i];
			}
		}
		output.write(systemIdBytes);

		// Generating software is 32 bytes
		byte[] genSoftwareBytes = new byte[32];
		byte[] genSoftware = header.getGeneratingSoftware().getBytes();

		// We fill systemIdBytes
		for (int i = 0; i < genSoftware.length; i++) {
			if (i < genSoftwareBytes.length) {
				genSoftwareBytes[i] = genSoftware[i];
			}
		}
		output.write(genSoftwareBytes);

		output.writeShort(header.getFileCreationDayOfYear());
		output.writeShort(header.getFileCreationYear());
		output.writeShort(header.getHeaderSize());
		output.writeInt((int) header.getOffsetToPointData());
		output.writeInt((int) header.getNVariableLengthRecords());
		output.writeByte(header.getPointDataFormatID());
		output.writeShort(header.getPointDataRecordLength());
		output.writeInt((int) header.getNumberOfPointRecords());
		long[] nOfPointsByReturn = header.getNumberOfPointsByReturn();

		for (int i = 0; i < nOfPointsByReturn.length; i++) {
			output.writeInt((int) nOfPointsByReturn[i]);
		}

		output.writeDouble(header.getXScaleFactor());
		output.writeDouble(header.getYScaleFactor());
		output.writeDouble(header.getZScaleFactor());

		output.writeDouble(header.getXOffset());
		output.writeDouble(header.getYOffset());
		output.writeDouble(header.getZOffset());

		output.writeDouble(header.getMaxX());
		output.writeDouble(header.getMinX());

		output.writeDouble(header.getMaxY());
		output.writeDouble(header.getMinY());

		output.writeDouble(header.getMaxZ());
		output.writeDouble(header.getMinZ());

		output.writeLong(header.getStartOfWaveformDataPacketRecord());
	}

	/**
	 * 
	 * <dl>
	 * <dt>Name:</dt>
	 * <dd>buildHeader</dd>
	 * <dt>Description:</dt>
	 * <dd>builds the header according to the current {@link #getPoints()}
	 * points.</dd>
	 * <dt>Pre-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>{@link #getScaleX()} > 0</li>
	 * <li>{@link #getScaleY()} > 0</li>
	 * <li>{@link #getScaleZ()} > 0</li>
	 * </ul>
	 * </dd>
	 * <dt>Post-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>{@link #getHeader()} != null</li>
	 * </ul>
	 * </dd>
	 * </dl>
	 * 
	 * @throws IllegalArgumentException
	 *             if one of the pre-conditions is not met.
	 */
	private void buildHeader() {

		if (!(getScaleX() > 0)) {
			throw new IllegalArgumentException();
		}

		if (!(getScaleY() > 0)) {
			throw new IllegalArgumentException();
		}

		if (!(getScaleZ() > 0)) {
			throw new IllegalArgumentException();
		}

		header = LasFactory.eINSTANCE.createLASHeader();

		header.setFileSignature("LASF");

		// Value between [1..65 535], 0 means that no id has been assigned.
		// Source can be considered as the original flight light.
		header.setFileSourceID(0);

		header.setGlobalEncoding(0);

		header.setProjectID_GUID_data_4(new byte[8]);

		// Version 1.3
		header.setVersionMajor(1);
		header.setVersionMinor(3);

		// System identifier, ASC-CSA
		header.setSystemIdentifier("ASC-CSA");

		// Generating software, ASC-CSA
		header.setGeneratingSoftware("ASC-CSA");

		// We fill the header with basic information.
		int dayOfYear = Calendar.getInstance().get(Calendar.DAY_OF_YEAR);
		header.setFileCreationDayOfYear(dayOfYear);

		int year = Calendar.getInstance().get(Calendar.YEAR);
		header.setFileCreationYear(year);

		// Header size
		header.setHeaderSize(HEADER_SIZE);

		// Offset to point data, in the current implementation, no variable
		// length records are being written, meaning that the offset if
		// HEADER_SIZE.
		header.setOffsetToPointData(HEADER_SIZE);

		// Number of variable length records, in this case, 0
		header.setNumberOfPointRecords(0);

		// Point format, point format 3
		header.setPointDataFormatID(3);

		// Data record length
		header.setPointDataRecordLength(POINT_RECORD_LENGTH);

		// Number of point records.
		header.setNumberOfPointRecords(getPoints().size());

		// Number of points by return, all zeros.
		header.setNumberOfPointsByReturn(new long[] { 0, 0, 0, 0, 0 });

		// x,y,z scale factor
		header.setXScaleFactor(getScaleX());
		header.setYScaleFactor(getScaleY());
		header.setZScaleFactor(getScaleZ());

		// x,y,z offset
		header.setXOffset(getXOffset());
		header.setYOffset(getYOffset());
		header.setZOffset(getZOffset());

		// Min/max x,y,z
		// We find min/max x,y,z
		findExtrema();

		header.setMaxX(max.x);
		header.setMinX(min.x);

		header.setMaxY(max.y);
		header.setMinY(min.y);

		header.setMaxZ(max.z);
		header.setMinZ(min.z);

		// Start of waveform data packet record, 0, no waveform record
		header.setStartOfWaveformDataPacketRecord(0);

	}

	/**
	 * 
	 * <dl>
	 * <dt>Name:</dt>
	 * <dd>findExtremas</dd>
	 * <dt>Description:</dt>
	 * <dd>finds, among the las points {@link #getPoints()}, the max/min x,y,z
	 * and put them into attributes {@link #max} and {@link #min}</dd>
	 * <dt>Pre-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>See {@link #buildHeader()}'s pre-conditions</li>
	 * </ul>
	 * </dd>
	 * <dt>Post-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>{@link min} != null</li>
	 * <li>{@link max} != null</li>
	 * </ul>
	 * </dd>
	 * </dl>
	 */
	private void findExtrema() {
		min = new Point3d(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
		max = new Point3d(-Double.MAX_VALUE, -Double.MAX_VALUE,
				-Double.MAX_VALUE);

		for (LASPoint point : getPoints()) {
			double x = (double) point.getX() * getScaleX() + getXOffset();
			double y = (double) point.getY() * getScaleY() + getYOffset();
			double z = (double) point.getZ() * getScaleZ() + getZOffset();

			if (x > max.x) {
				max.x = x;
			}

			if (x < min.x) {
				min.x = x;
			}

			if (y > max.y) {
				max.y = y;
			}

			if (y < min.y) {
				min.y = y;
			}

			if (z > max.z) {
				max.z = z;
			}

			if (z < min.z) {
				min.z = z;
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LasPackage.LAS_WRITER__FILE_NAME:
				return getFileName();
			case LasPackage.LAS_WRITER__PROGRESS_MONITOR:
				return getProgressMonitor();
			case LasPackage.LAS_WRITER__POINTS:
				return getPoints();
			case LasPackage.LAS_WRITER__SCALE_X:
				return getScaleX();
			case LasPackage.LAS_WRITER__SCALE_Y:
				return getScaleY();
			case LasPackage.LAS_WRITER__SCALE_Z:
				return getScaleZ();
			case LasPackage.LAS_WRITER__HEADER:
				if (resolve) return getHeader();
				return basicGetHeader();
			case LasPackage.LAS_WRITER__XOFFSET:
				return getXOffset();
			case LasPackage.LAS_WRITER__YOFFSET:
				return getYOffset();
			case LasPackage.LAS_WRITER__ZOFFSET:
				return getZOffset();
			case LasPackage.LAS_WRITER__OUTPUT_STREAM:
				return getOutputStream();
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
			case LasPackage.LAS_WRITER__FILE_NAME:
				setFileName((String)newValue);
				return;
			case LasPackage.LAS_WRITER__PROGRESS_MONITOR:
				setProgressMonitor((IProgressMonitor)newValue);
				return;
			case LasPackage.LAS_WRITER__POINTS:
				getPoints().clear();
				getPoints().addAll((Collection<? extends LASPoint>)newValue);
				return;
			case LasPackage.LAS_WRITER__SCALE_X:
				setScaleX((Double)newValue);
				return;
			case LasPackage.LAS_WRITER__SCALE_Y:
				setScaleY((Double)newValue);
				return;
			case LasPackage.LAS_WRITER__SCALE_Z:
				setScaleZ((Double)newValue);
				return;
			case LasPackage.LAS_WRITER__XOFFSET:
				setXOffset((Double)newValue);
				return;
			case LasPackage.LAS_WRITER__YOFFSET:
				setYOffset((Double)newValue);
				return;
			case LasPackage.LAS_WRITER__ZOFFSET:
				setZOffset((Double)newValue);
				return;
			case LasPackage.LAS_WRITER__OUTPUT_STREAM:
				setOutputStream((OutputStream)newValue);
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
			case LasPackage.LAS_WRITER__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case LasPackage.LAS_WRITER__PROGRESS_MONITOR:
				setProgressMonitor(PROGRESS_MONITOR_EDEFAULT);
				return;
			case LasPackage.LAS_WRITER__POINTS:
				getPoints().clear();
				return;
			case LasPackage.LAS_WRITER__SCALE_X:
				setScaleX(SCALE_X_EDEFAULT);
				return;
			case LasPackage.LAS_WRITER__SCALE_Y:
				setScaleY(SCALE_Y_EDEFAULT);
				return;
			case LasPackage.LAS_WRITER__SCALE_Z:
				setScaleZ(SCALE_Z_EDEFAULT);
				return;
			case LasPackage.LAS_WRITER__XOFFSET:
				setXOffset(XOFFSET_EDEFAULT);
				return;
			case LasPackage.LAS_WRITER__YOFFSET:
				setYOffset(YOFFSET_EDEFAULT);
				return;
			case LasPackage.LAS_WRITER__ZOFFSET:
				setZOffset(ZOFFSET_EDEFAULT);
				return;
			case LasPackage.LAS_WRITER__OUTPUT_STREAM:
				setOutputStream(OUTPUT_STREAM_EDEFAULT);
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
			case LasPackage.LAS_WRITER__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case LasPackage.LAS_WRITER__PROGRESS_MONITOR:
				return PROGRESS_MONITOR_EDEFAULT == null ? progressMonitor != null : !PROGRESS_MONITOR_EDEFAULT.equals(progressMonitor);
			case LasPackage.LAS_WRITER__POINTS:
				return points != null && !points.isEmpty();
			case LasPackage.LAS_WRITER__SCALE_X:
				return scaleX != SCALE_X_EDEFAULT;
			case LasPackage.LAS_WRITER__SCALE_Y:
				return scaleY != SCALE_Y_EDEFAULT;
			case LasPackage.LAS_WRITER__SCALE_Z:
				return scaleZ != SCALE_Z_EDEFAULT;
			case LasPackage.LAS_WRITER__HEADER:
				return header != null;
			case LasPackage.LAS_WRITER__XOFFSET:
				return xOffset != XOFFSET_EDEFAULT;
			case LasPackage.LAS_WRITER__YOFFSET:
				return yOffset != YOFFSET_EDEFAULT;
			case LasPackage.LAS_WRITER__ZOFFSET:
				return zOffset != ZOFFSET_EDEFAULT;
			case LasPackage.LAS_WRITER__OUTPUT_STREAM:
				return OUTPUT_STREAM_EDEFAULT == null ? outputStream != null : !OUTPUT_STREAM_EDEFAULT.equals(outputStream);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LasPackage.LAS_WRITER___WRITE:
				try {
					write();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fileName: ");
		result.append(fileName);
		result.append(", progressMonitor: ");
		result.append(progressMonitor);
		result.append(", scaleX: ");
		result.append(scaleX);
		result.append(", scaleY: ");
		result.append(scaleY);
		result.append(", scaleZ: ");
		result.append(scaleZ);
		result.append(", xOffset: ");
		result.append(xOffset);
		result.append(", yOffset: ");
		result.append(yOffset);
		result.append(", zOffset: ");
		result.append(zOffset);
		result.append(", outputStream: ");
		result.append(outputStream);
		result.append(')');
		return result.toString();
	}

} // LASWriterImpl
