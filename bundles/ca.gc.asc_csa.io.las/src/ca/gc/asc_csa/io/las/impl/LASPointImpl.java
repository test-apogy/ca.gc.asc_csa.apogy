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

import ca.gc.asc_csa.io.las.EdgeOfFlightLine;
import ca.gc.asc_csa.io.las.LASPoint;
import ca.gc.asc_csa.io.las.LasPackage;
import ca.gc.asc_csa.io.las.ScanDirection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LAS Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASPointImpl#getX <em>X</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASPointImpl#getY <em>Y</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASPointImpl#getZ <em>Z</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASPointImpl#getIntensity <em>Intensity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASPointImpl#getReturnNumber <em>Return Number</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASPointImpl#getNumberOfReturns <em>Number Of Returns</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASPointImpl#getScanDirection <em>Scan Direction</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASPointImpl#getEdgeOfFlightLine <em>Edge Of Flight Line</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASPointImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASPointImpl#getScanAngleRank <em>Scan Angle Rank</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASPointImpl#getUserData <em>User Data</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASPointImpl#getPointSourceId <em>Point Source Id</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASPointImpl#getGpsTime <em>Gps Time</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASPointImpl#getRed <em>Red</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASPointImpl#getGreen <em>Green</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.impl.LASPointImpl#getBlue <em>Blue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LASPointImpl extends EObjectImpl implements LASPoint {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final long X_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected long x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final long Y_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected long y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected static final long Z_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected long z = Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntensity() <em>Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensity()
	 * @generated
	 * @ordered
	 */
	protected static final int INTENSITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIntensity() <em>Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensity()
	 * @generated
	 * @ordered
	 */
	protected int intensity = INTENSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnNumber() <em>Return Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnNumber()
	 * @generated
	 * @ordered
	 */
	protected static final byte RETURN_NUMBER_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getReturnNumber() <em>Return Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnNumber()
	 * @generated
	 * @ordered
	 */
	protected byte returnNumber = RETURN_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfReturns() <em>Number Of Returns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfReturns()
	 * @generated
	 * @ordered
	 */
	protected static final byte NUMBER_OF_RETURNS_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getNumberOfReturns() <em>Number Of Returns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfReturns()
	 * @generated
	 * @ordered
	 */
	protected byte numberOfReturns = NUMBER_OF_RETURNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getScanDirection() <em>Scan Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanDirection()
	 * @generated
	 * @ordered
	 */
	protected static final ScanDirection SCAN_DIRECTION_EDEFAULT = ScanDirection.NEGATIVE;

	/**
	 * The cached value of the '{@link #getScanDirection() <em>Scan Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanDirection()
	 * @generated
	 * @ordered
	 */
	protected ScanDirection scanDirection = SCAN_DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEdgeOfFlightLine() <em>Edge Of Flight Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeOfFlightLine()
	 * @generated
	 * @ordered
	 */
	protected static final EdgeOfFlightLine EDGE_OF_FLIGHT_LINE_EDEFAULT = EdgeOfFlightLine.END;

	/**
	 * The cached value of the '{@link #getEdgeOfFlightLine() <em>Edge Of Flight Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeOfFlightLine()
	 * @generated
	 * @ordered
	 */
	protected EdgeOfFlightLine edgeOfFlightLine = EDGE_OF_FLIGHT_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected static final short CLASSIFICATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected short classification = CLASSIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getScanAngleRank() <em>Scan Angle Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanAngleRank()
	 * @generated
	 * @ordered
	 */
	protected static final byte SCAN_ANGLE_RANK_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getScanAngleRank() <em>Scan Angle Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanAngleRank()
	 * @generated
	 * @ordered
	 */
	protected byte scanAngleRank = SCAN_ANGLE_RANK_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserData() <em>User Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserData()
	 * @generated
	 * @ordered
	 */
	protected static final short USER_DATA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUserData() <em>User Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserData()
	 * @generated
	 * @ordered
	 */
	protected short userData = USER_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getPointSourceId() <em>Point Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointSourceId()
	 * @generated
	 * @ordered
	 */
	protected static final int POINT_SOURCE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPointSourceId() <em>Point Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointSourceId()
	 * @generated
	 * @ordered
	 */
	protected int pointSourceId = POINT_SOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGpsTime() <em>Gps Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpsTime()
	 * @generated
	 * @ordered
	 */
	protected static final double GPS_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getGpsTime() <em>Gps Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpsTime()
	 * @generated
	 * @ordered
	 */
	protected double gpsTime = GPS_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected static final int RED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected int red = RED_EDEFAULT;

	/**
	 * The default value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected static final int GREEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected int green = GREEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected static final int BLUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected int blue = BLUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LASPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LasPackage.Literals.LAS_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(long newX) {
		long oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_POINT__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(long newY) {
		long oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_POINT__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ(long newZ) {
		long oldZ = z;
		z = newZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_POINT__Z, oldZ, z));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIntensity() {
		return intensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntensity(int newIntensity) {
		int oldIntensity = intensity;
		intensity = newIntensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_POINT__INTENSITY, oldIntensity, intensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getReturnNumber() {
		return returnNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnNumber(byte newReturnNumber) {
		byte oldReturnNumber = returnNumber;
		returnNumber = newReturnNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_POINT__RETURN_NUMBER, oldReturnNumber, returnNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getNumberOfReturns() {
		return numberOfReturns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfReturns(byte newNumberOfReturns) {
		byte oldNumberOfReturns = numberOfReturns;
		numberOfReturns = newNumberOfReturns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_POINT__NUMBER_OF_RETURNS, oldNumberOfReturns, numberOfReturns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScanDirection getScanDirection() {
		return scanDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScanDirection(ScanDirection newScanDirection) {
		ScanDirection oldScanDirection = scanDirection;
		scanDirection = newScanDirection == null ? SCAN_DIRECTION_EDEFAULT : newScanDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_POINT__SCAN_DIRECTION, oldScanDirection, scanDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeOfFlightLine getEdgeOfFlightLine() {
		return edgeOfFlightLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeOfFlightLine(EdgeOfFlightLine newEdgeOfFlightLine) {
		EdgeOfFlightLine oldEdgeOfFlightLine = edgeOfFlightLine;
		edgeOfFlightLine = newEdgeOfFlightLine == null ? EDGE_OF_FLIGHT_LINE_EDEFAULT : newEdgeOfFlightLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_POINT__EDGE_OF_FLIGHT_LINE, oldEdgeOfFlightLine, edgeOfFlightLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassification(short newClassification) {
		short oldClassification = classification;
		classification = newClassification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_POINT__CLASSIFICATION, oldClassification, classification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getScanAngleRank() {
		return scanAngleRank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScanAngleRank(byte newScanAngleRank) {
		byte oldScanAngleRank = scanAngleRank;
		scanAngleRank = newScanAngleRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_POINT__SCAN_ANGLE_RANK, oldScanAngleRank, scanAngleRank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getUserData() {
		return userData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserData(short newUserData) {
		short oldUserData = userData;
		userData = newUserData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_POINT__USER_DATA, oldUserData, userData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPointSourceId() {
		return pointSourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointSourceId(int newPointSourceId) {
		int oldPointSourceId = pointSourceId;
		pointSourceId = newPointSourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_POINT__POINT_SOURCE_ID, oldPointSourceId, pointSourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGpsTime() {
		return gpsTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGpsTime(double newGpsTime) {
		double oldGpsTime = gpsTime;
		gpsTime = newGpsTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_POINT__GPS_TIME, oldGpsTime, gpsTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRed() {
		return red;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRed(int newRed) {
		int oldRed = red;
		red = newRed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_POINT__RED, oldRed, red));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGreen() {
		return green;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreen(int newGreen) {
		int oldGreen = green;
		green = newGreen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_POINT__GREEN, oldGreen, green));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBlue() {
		return blue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlue(int newBlue) {
		int oldBlue = blue;
		blue = newBlue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LasPackage.LAS_POINT__BLUE, oldBlue, blue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LasPackage.LAS_POINT__X:
				return getX();
			case LasPackage.LAS_POINT__Y:
				return getY();
			case LasPackage.LAS_POINT__Z:
				return getZ();
			case LasPackage.LAS_POINT__INTENSITY:
				return getIntensity();
			case LasPackage.LAS_POINT__RETURN_NUMBER:
				return getReturnNumber();
			case LasPackage.LAS_POINT__NUMBER_OF_RETURNS:
				return getNumberOfReturns();
			case LasPackage.LAS_POINT__SCAN_DIRECTION:
				return getScanDirection();
			case LasPackage.LAS_POINT__EDGE_OF_FLIGHT_LINE:
				return getEdgeOfFlightLine();
			case LasPackage.LAS_POINT__CLASSIFICATION:
				return getClassification();
			case LasPackage.LAS_POINT__SCAN_ANGLE_RANK:
				return getScanAngleRank();
			case LasPackage.LAS_POINT__USER_DATA:
				return getUserData();
			case LasPackage.LAS_POINT__POINT_SOURCE_ID:
				return getPointSourceId();
			case LasPackage.LAS_POINT__GPS_TIME:
				return getGpsTime();
			case LasPackage.LAS_POINT__RED:
				return getRed();
			case LasPackage.LAS_POINT__GREEN:
				return getGreen();
			case LasPackage.LAS_POINT__BLUE:
				return getBlue();
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
			case LasPackage.LAS_POINT__X:
				setX((Long)newValue);
				return;
			case LasPackage.LAS_POINT__Y:
				setY((Long)newValue);
				return;
			case LasPackage.LAS_POINT__Z:
				setZ((Long)newValue);
				return;
			case LasPackage.LAS_POINT__INTENSITY:
				setIntensity((Integer)newValue);
				return;
			case LasPackage.LAS_POINT__RETURN_NUMBER:
				setReturnNumber((Byte)newValue);
				return;
			case LasPackage.LAS_POINT__NUMBER_OF_RETURNS:
				setNumberOfReturns((Byte)newValue);
				return;
			case LasPackage.LAS_POINT__SCAN_DIRECTION:
				setScanDirection((ScanDirection)newValue);
				return;
			case LasPackage.LAS_POINT__EDGE_OF_FLIGHT_LINE:
				setEdgeOfFlightLine((EdgeOfFlightLine)newValue);
				return;
			case LasPackage.LAS_POINT__CLASSIFICATION:
				setClassification((Short)newValue);
				return;
			case LasPackage.LAS_POINT__SCAN_ANGLE_RANK:
				setScanAngleRank((Byte)newValue);
				return;
			case LasPackage.LAS_POINT__USER_DATA:
				setUserData((Short)newValue);
				return;
			case LasPackage.LAS_POINT__POINT_SOURCE_ID:
				setPointSourceId((Integer)newValue);
				return;
			case LasPackage.LAS_POINT__GPS_TIME:
				setGpsTime((Double)newValue);
				return;
			case LasPackage.LAS_POINT__RED:
				setRed((Integer)newValue);
				return;
			case LasPackage.LAS_POINT__GREEN:
				setGreen((Integer)newValue);
				return;
			case LasPackage.LAS_POINT__BLUE:
				setBlue((Integer)newValue);
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
			case LasPackage.LAS_POINT__X:
				setX(X_EDEFAULT);
				return;
			case LasPackage.LAS_POINT__Y:
				setY(Y_EDEFAULT);
				return;
			case LasPackage.LAS_POINT__Z:
				setZ(Z_EDEFAULT);
				return;
			case LasPackage.LAS_POINT__INTENSITY:
				setIntensity(INTENSITY_EDEFAULT);
				return;
			case LasPackage.LAS_POINT__RETURN_NUMBER:
				setReturnNumber(RETURN_NUMBER_EDEFAULT);
				return;
			case LasPackage.LAS_POINT__NUMBER_OF_RETURNS:
				setNumberOfReturns(NUMBER_OF_RETURNS_EDEFAULT);
				return;
			case LasPackage.LAS_POINT__SCAN_DIRECTION:
				setScanDirection(SCAN_DIRECTION_EDEFAULT);
				return;
			case LasPackage.LAS_POINT__EDGE_OF_FLIGHT_LINE:
				setEdgeOfFlightLine(EDGE_OF_FLIGHT_LINE_EDEFAULT);
				return;
			case LasPackage.LAS_POINT__CLASSIFICATION:
				setClassification(CLASSIFICATION_EDEFAULT);
				return;
			case LasPackage.LAS_POINT__SCAN_ANGLE_RANK:
				setScanAngleRank(SCAN_ANGLE_RANK_EDEFAULT);
				return;
			case LasPackage.LAS_POINT__USER_DATA:
				setUserData(USER_DATA_EDEFAULT);
				return;
			case LasPackage.LAS_POINT__POINT_SOURCE_ID:
				setPointSourceId(POINT_SOURCE_ID_EDEFAULT);
				return;
			case LasPackage.LAS_POINT__GPS_TIME:
				setGpsTime(GPS_TIME_EDEFAULT);
				return;
			case LasPackage.LAS_POINT__RED:
				setRed(RED_EDEFAULT);
				return;
			case LasPackage.LAS_POINT__GREEN:
				setGreen(GREEN_EDEFAULT);
				return;
			case LasPackage.LAS_POINT__BLUE:
				setBlue(BLUE_EDEFAULT);
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
			case LasPackage.LAS_POINT__X:
				return x != X_EDEFAULT;
			case LasPackage.LAS_POINT__Y:
				return y != Y_EDEFAULT;
			case LasPackage.LAS_POINT__Z:
				return z != Z_EDEFAULT;
			case LasPackage.LAS_POINT__INTENSITY:
				return intensity != INTENSITY_EDEFAULT;
			case LasPackage.LAS_POINT__RETURN_NUMBER:
				return returnNumber != RETURN_NUMBER_EDEFAULT;
			case LasPackage.LAS_POINT__NUMBER_OF_RETURNS:
				return numberOfReturns != NUMBER_OF_RETURNS_EDEFAULT;
			case LasPackage.LAS_POINT__SCAN_DIRECTION:
				return scanDirection != SCAN_DIRECTION_EDEFAULT;
			case LasPackage.LAS_POINT__EDGE_OF_FLIGHT_LINE:
				return edgeOfFlightLine != EDGE_OF_FLIGHT_LINE_EDEFAULT;
			case LasPackage.LAS_POINT__CLASSIFICATION:
				return classification != CLASSIFICATION_EDEFAULT;
			case LasPackage.LAS_POINT__SCAN_ANGLE_RANK:
				return scanAngleRank != SCAN_ANGLE_RANK_EDEFAULT;
			case LasPackage.LAS_POINT__USER_DATA:
				return userData != USER_DATA_EDEFAULT;
			case LasPackage.LAS_POINT__POINT_SOURCE_ID:
				return pointSourceId != POINT_SOURCE_ID_EDEFAULT;
			case LasPackage.LAS_POINT__GPS_TIME:
				return gpsTime != GPS_TIME_EDEFAULT;
			case LasPackage.LAS_POINT__RED:
				return red != RED_EDEFAULT;
			case LasPackage.LAS_POINT__GREEN:
				return green != GREEN_EDEFAULT;
			case LasPackage.LAS_POINT__BLUE:
				return blue != BLUE_EDEFAULT;
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
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", z: ");
		result.append(z);
		result.append(", intensity: ");
		result.append(intensity);
		result.append(", returnNumber: ");
		result.append(returnNumber);
		result.append(", numberOfReturns: ");
		result.append(numberOfReturns);
		result.append(", scanDirection: ");
		result.append(scanDirection);
		result.append(", edgeOfFlightLine: ");
		result.append(edgeOfFlightLine);
		result.append(", classification: ");
		result.append(classification);
		result.append(", scanAngleRank: ");
		result.append(scanAngleRank);
		result.append(", userData: ");
		result.append(userData);
		result.append(", pointSourceId: ");
		result.append(pointSourceId);
		result.append(", gpsTime: ");
		result.append(gpsTime);
		result.append(", red: ");
		result.append(red);
		result.append(", green: ");
		result.append(green);
		result.append(", blue: ");
		result.append(blue);
		result.append(')');
		return result.toString();
	}

} //LASPointImpl
