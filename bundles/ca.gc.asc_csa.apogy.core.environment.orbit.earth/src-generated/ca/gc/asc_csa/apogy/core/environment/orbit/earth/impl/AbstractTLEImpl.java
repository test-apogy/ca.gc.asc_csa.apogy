/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl;

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.AbstractTLE;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EphemerisType;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.orekit.propagation.analytical.tle.TLE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract TLE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.AbstractTLEImpl#getBStar <em>BStar</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.AbstractTLEImpl#getEpoch <em>Epoch</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.AbstractTLEImpl#getEccentricity <em>Eccentricity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.AbstractTLEImpl#getElementNumber <em>Element Number</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.AbstractTLEImpl#getEphemerisType <em>Ephemeris Type</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.AbstractTLEImpl#getInclination <em>Inclination</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.AbstractTLEImpl#getMeanAnomaly <em>Mean Anomaly</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.AbstractTLEImpl#getMeanMotion <em>Mean Motion</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.AbstractTLEImpl#getRevolutionPerDay <em>Revolution Per Day</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.AbstractTLEImpl#getMeanMotionFirstDerivative <em>Mean Motion First Derivative</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.AbstractTLEImpl#getMeanMotionSecondDerivative <em>Mean Motion Second Derivative</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.AbstractTLEImpl#getArgumentOfPerigee <em>Argument Of Perigee</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.AbstractTLEImpl#getRightAscentionOfAscendingNode <em>Right Ascention Of Ascending Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.AbstractTLEImpl#getRevolutionNumberAtEpoch <em>Revolution Number At Epoch</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.AbstractTLEImpl#getSatelliteNumber <em>Satellite Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractTLEImpl extends MinimalEObjectImpl.Container implements AbstractTLE {
	/**
	 * The default value of the '{@link #getBStar() <em>BStar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBStar()
	 * @generated
	 * @ordered
	 */
	protected static final double BSTAR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBStar() <em>BStar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBStar()
	 * @generated
	 * @ordered
	 */
	protected double bStar = BSTAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEpoch() <em>Epoch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpoch()
	 * @generated
	 * @ordered
	 */
	protected static final Date EPOCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEpoch() <em>Epoch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpoch()
	 * @generated
	 * @ordered
	 */
	protected Date epoch = EPOCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEccentricity() <em>Eccentricity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEccentricity()
	 * @generated
	 * @ordered
	 */
	protected static final double ECCENTRICITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEccentricity() <em>Eccentricity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEccentricity()
	 * @generated
	 * @ordered
	 */
	protected double eccentricity = ECCENTRICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementNumber() <em>Element Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ELEMENT_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getElementNumber() <em>Element Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementNumber()
	 * @generated
	 * @ordered
	 */
	protected int elementNumber = ELEMENT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEphemerisType() <em>Ephemeris Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEphemerisType()
	 * @generated
	 * @ordered
	 */
	protected static final EphemerisType EPHEMERIS_TYPE_EDEFAULT = EphemerisType.DEFAULT;

	/**
	 * The cached value of the '{@link #getEphemerisType() <em>Ephemeris Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEphemerisType()
	 * @generated
	 * @ordered
	 */
	protected EphemerisType ephemerisType = EPHEMERIS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInclination() <em>Inclination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclination()
	 * @generated
	 * @ordered
	 */
	protected static final double INCLINATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInclination() <em>Inclination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclination()
	 * @generated
	 * @ordered
	 */
	protected double inclination = INCLINATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeanAnomaly() <em>Mean Anomaly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanAnomaly()
	 * @generated
	 * @ordered
	 */
	protected static final double MEAN_ANOMALY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMeanAnomaly() <em>Mean Anomaly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanAnomaly()
	 * @generated
	 * @ordered
	 */
	protected double meanAnomaly = MEAN_ANOMALY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeanMotion() <em>Mean Motion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanMotion()
	 * @generated
	 * @ordered
	 */
	protected static final double MEAN_MOTION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMeanMotion() <em>Mean Motion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanMotion()
	 * @generated
	 * @ordered
	 */
	protected double meanMotion = MEAN_MOTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevolutionPerDay() <em>Revolution Per Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevolutionPerDay()
	 * @generated
	 * @ordered
	 */
	protected static final double REVOLUTION_PER_DAY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRevolutionPerDay() <em>Revolution Per Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevolutionPerDay()
	 * @generated
	 * @ordered
	 */
	protected double revolutionPerDay = REVOLUTION_PER_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeanMotionFirstDerivative() <em>Mean Motion First Derivative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanMotionFirstDerivative()
	 * @generated
	 * @ordered
	 */
	protected static final double MEAN_MOTION_FIRST_DERIVATIVE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMeanMotionFirstDerivative() <em>Mean Motion First Derivative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanMotionFirstDerivative()
	 * @generated
	 * @ordered
	 */
	protected double meanMotionFirstDerivative = MEAN_MOTION_FIRST_DERIVATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeanMotionSecondDerivative() <em>Mean Motion Second Derivative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanMotionSecondDerivative()
	 * @generated
	 * @ordered
	 */
	protected static final double MEAN_MOTION_SECOND_DERIVATIVE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMeanMotionSecondDerivative() <em>Mean Motion Second Derivative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanMotionSecondDerivative()
	 * @generated
	 * @ordered
	 */
	protected double meanMotionSecondDerivative = MEAN_MOTION_SECOND_DERIVATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getArgumentOfPerigee() <em>Argument Of Perigee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentOfPerigee()
	 * @generated
	 * @ordered
	 */
	protected static final double ARGUMENT_OF_PERIGEE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getArgumentOfPerigee() <em>Argument Of Perigee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentOfPerigee()
	 * @generated
	 * @ordered
	 */
	protected double argumentOfPerigee = ARGUMENT_OF_PERIGEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRightAscentionOfAscendingNode() <em>Right Ascention Of Ascending Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightAscentionOfAscendingNode()
	 * @generated
	 * @ordered
	 */
	protected static final double RIGHT_ASCENTION_OF_ASCENDING_NODE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRightAscentionOfAscendingNode() <em>Right Ascention Of Ascending Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightAscentionOfAscendingNode()
	 * @generated
	 * @ordered
	 */
	protected double rightAscentionOfAscendingNode = RIGHT_ASCENTION_OF_ASCENDING_NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevolutionNumberAtEpoch() <em>Revolution Number At Epoch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevolutionNumberAtEpoch()
	 * @generated
	 * @ordered
	 */
	protected static final int REVOLUTION_NUMBER_AT_EPOCH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRevolutionNumberAtEpoch() <em>Revolution Number At Epoch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevolutionNumberAtEpoch()
	 * @generated
	 * @ordered
	 */
	protected int revolutionNumberAtEpoch = REVOLUTION_NUMBER_AT_EPOCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSatelliteNumber() <em>Satellite Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatelliteNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SATELLITE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSatelliteNumber() <em>Satellite Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatelliteNumber()
	 * @generated
	 * @ordered
	 */
	protected int satelliteNumber = SATELLITE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTLEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitEarthPackage.Literals.ABSTRACT_TLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBStar() {
		return bStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBStar(double newBStar) {
		double oldBStar = bStar;
		bStar = newBStar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__BSTAR, oldBStar, bStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEpoch() {
		return epoch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpoch(Date newEpoch) {
		Date oldEpoch = epoch;
		epoch = newEpoch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__EPOCH, oldEpoch, epoch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEccentricity() {
		return eccentricity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEccentricity(double newEccentricity) {
		double oldEccentricity = eccentricity;
		eccentricity = newEccentricity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__ECCENTRICITY, oldEccentricity, eccentricity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getElementNumber() {
		return elementNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementNumber(int newElementNumber) {
		int oldElementNumber = elementNumber;
		elementNumber = newElementNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__ELEMENT_NUMBER, oldElementNumber, elementNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EphemerisType getEphemerisType() {
		return ephemerisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEphemerisType(EphemerisType newEphemerisType) {
		EphemerisType oldEphemerisType = ephemerisType;
		ephemerisType = newEphemerisType == null ? EPHEMERIS_TYPE_EDEFAULT : newEphemerisType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__EPHEMERIS_TYPE, oldEphemerisType, ephemerisType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInclination() {
		return inclination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclination(double newInclination) {
		double oldInclination = inclination;
		inclination = newInclination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__INCLINATION, oldInclination, inclination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMeanAnomaly() {
		return meanAnomaly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeanAnomaly(double newMeanAnomaly) {
		double oldMeanAnomaly = meanAnomaly;
		meanAnomaly = newMeanAnomaly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_ANOMALY, oldMeanAnomaly, meanAnomaly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMeanMotion() {
		return meanMotion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeanMotion(double newMeanMotion) {
		double oldMeanMotion = meanMotion;
		meanMotion = newMeanMotion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_MOTION, oldMeanMotion, meanMotion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRevolutionPerDay() {
		return revolutionPerDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevolutionPerDay(double newRevolutionPerDay) {
		double oldRevolutionPerDay = revolutionPerDay;
		revolutionPerDay = newRevolutionPerDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__REVOLUTION_PER_DAY, oldRevolutionPerDay, revolutionPerDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMeanMotionFirstDerivative() {
		return meanMotionFirstDerivative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeanMotionFirstDerivative(double newMeanMotionFirstDerivative) {
		double oldMeanMotionFirstDerivative = meanMotionFirstDerivative;
		meanMotionFirstDerivative = newMeanMotionFirstDerivative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_MOTION_FIRST_DERIVATIVE, oldMeanMotionFirstDerivative, meanMotionFirstDerivative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMeanMotionSecondDerivative() {
		return meanMotionSecondDerivative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeanMotionSecondDerivative(double newMeanMotionSecondDerivative) {
		double oldMeanMotionSecondDerivative = meanMotionSecondDerivative;
		meanMotionSecondDerivative = newMeanMotionSecondDerivative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_MOTION_SECOND_DERIVATIVE, oldMeanMotionSecondDerivative, meanMotionSecondDerivative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getArgumentOfPerigee() {
		return argumentOfPerigee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgumentOfPerigee(double newArgumentOfPerigee) {
		double oldArgumentOfPerigee = argumentOfPerigee;
		argumentOfPerigee = newArgumentOfPerigee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__ARGUMENT_OF_PERIGEE, oldArgumentOfPerigee, argumentOfPerigee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRightAscentionOfAscendingNode() {
		return rightAscentionOfAscendingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightAscentionOfAscendingNode(double newRightAscentionOfAscendingNode) {
		double oldRightAscentionOfAscendingNode = rightAscentionOfAscendingNode;
		rightAscentionOfAscendingNode = newRightAscentionOfAscendingNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__RIGHT_ASCENTION_OF_ASCENDING_NODE, oldRightAscentionOfAscendingNode, rightAscentionOfAscendingNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRevolutionNumberAtEpoch() {
		return revolutionNumberAtEpoch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevolutionNumberAtEpoch(int newRevolutionNumberAtEpoch) {
		int oldRevolutionNumberAtEpoch = revolutionNumberAtEpoch;
		revolutionNumberAtEpoch = newRevolutionNumberAtEpoch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__REVOLUTION_NUMBER_AT_EPOCH, oldRevolutionNumberAtEpoch, revolutionNumberAtEpoch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSatelliteNumber() {
		return satelliteNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatelliteNumber(int newSatelliteNumber) {
		int oldSatelliteNumber = satelliteNumber;
		satelliteNumber = newSatelliteNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__SATELLITE_NUMBER, oldSatelliteNumber, satelliteNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public TLE getOreKitTLE() throws Exception 
	{
		org.orekit.propagation.analytical.tle.TLE tle = new org.orekit.propagation.analytical.tle.TLE(getLine1(), getLine2());
		return tle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLine1() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLine2() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__BSTAR:
				return getBStar();
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__EPOCH:
				return getEpoch();
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__ECCENTRICITY:
				return getEccentricity();
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__ELEMENT_NUMBER:
				return getElementNumber();
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__EPHEMERIS_TYPE:
				return getEphemerisType();
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__INCLINATION:
				return getInclination();
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_ANOMALY:
				return getMeanAnomaly();
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_MOTION:
				return getMeanMotion();
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__REVOLUTION_PER_DAY:
				return getRevolutionPerDay();
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_MOTION_FIRST_DERIVATIVE:
				return getMeanMotionFirstDerivative();
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_MOTION_SECOND_DERIVATIVE:
				return getMeanMotionSecondDerivative();
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__ARGUMENT_OF_PERIGEE:
				return getArgumentOfPerigee();
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__RIGHT_ASCENTION_OF_ASCENDING_NODE:
				return getRightAscentionOfAscendingNode();
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__REVOLUTION_NUMBER_AT_EPOCH:
				return getRevolutionNumberAtEpoch();
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__SATELLITE_NUMBER:
				return getSatelliteNumber();
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
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__BSTAR:
				setBStar((Double)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__EPOCH:
				setEpoch((Date)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__ECCENTRICITY:
				setEccentricity((Double)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__ELEMENT_NUMBER:
				setElementNumber((Integer)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__EPHEMERIS_TYPE:
				setEphemerisType((EphemerisType)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__INCLINATION:
				setInclination((Double)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_ANOMALY:
				setMeanAnomaly((Double)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_MOTION:
				setMeanMotion((Double)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__REVOLUTION_PER_DAY:
				setRevolutionPerDay((Double)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_MOTION_FIRST_DERIVATIVE:
				setMeanMotionFirstDerivative((Double)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_MOTION_SECOND_DERIVATIVE:
				setMeanMotionSecondDerivative((Double)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__ARGUMENT_OF_PERIGEE:
				setArgumentOfPerigee((Double)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__RIGHT_ASCENTION_OF_ASCENDING_NODE:
				setRightAscentionOfAscendingNode((Double)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__REVOLUTION_NUMBER_AT_EPOCH:
				setRevolutionNumberAtEpoch((Integer)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__SATELLITE_NUMBER:
				setSatelliteNumber((Integer)newValue);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__BSTAR:
				setBStar(BSTAR_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__EPOCH:
				setEpoch(EPOCH_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__ECCENTRICITY:
				setEccentricity(ECCENTRICITY_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__ELEMENT_NUMBER:
				setElementNumber(ELEMENT_NUMBER_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__EPHEMERIS_TYPE:
				setEphemerisType(EPHEMERIS_TYPE_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__INCLINATION:
				setInclination(INCLINATION_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_ANOMALY:
				setMeanAnomaly(MEAN_ANOMALY_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_MOTION:
				setMeanMotion(MEAN_MOTION_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__REVOLUTION_PER_DAY:
				setRevolutionPerDay(REVOLUTION_PER_DAY_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_MOTION_FIRST_DERIVATIVE:
				setMeanMotionFirstDerivative(MEAN_MOTION_FIRST_DERIVATIVE_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_MOTION_SECOND_DERIVATIVE:
				setMeanMotionSecondDerivative(MEAN_MOTION_SECOND_DERIVATIVE_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__ARGUMENT_OF_PERIGEE:
				setArgumentOfPerigee(ARGUMENT_OF_PERIGEE_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__RIGHT_ASCENTION_OF_ASCENDING_NODE:
				setRightAscentionOfAscendingNode(RIGHT_ASCENTION_OF_ASCENDING_NODE_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__REVOLUTION_NUMBER_AT_EPOCH:
				setRevolutionNumberAtEpoch(REVOLUTION_NUMBER_AT_EPOCH_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__SATELLITE_NUMBER:
				setSatelliteNumber(SATELLITE_NUMBER_EDEFAULT);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__BSTAR:
				return bStar != BSTAR_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__EPOCH:
				return EPOCH_EDEFAULT == null ? epoch != null : !EPOCH_EDEFAULT.equals(epoch);
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__ECCENTRICITY:
				return eccentricity != ECCENTRICITY_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__ELEMENT_NUMBER:
				return elementNumber != ELEMENT_NUMBER_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__EPHEMERIS_TYPE:
				return ephemerisType != EPHEMERIS_TYPE_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__INCLINATION:
				return inclination != INCLINATION_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_ANOMALY:
				return meanAnomaly != MEAN_ANOMALY_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_MOTION:
				return meanMotion != MEAN_MOTION_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__REVOLUTION_PER_DAY:
				return revolutionPerDay != REVOLUTION_PER_DAY_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_MOTION_FIRST_DERIVATIVE:
				return meanMotionFirstDerivative != MEAN_MOTION_FIRST_DERIVATIVE_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__MEAN_MOTION_SECOND_DERIVATIVE:
				return meanMotionSecondDerivative != MEAN_MOTION_SECOND_DERIVATIVE_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__ARGUMENT_OF_PERIGEE:
				return argumentOfPerigee != ARGUMENT_OF_PERIGEE_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__RIGHT_ASCENTION_OF_ASCENDING_NODE:
				return rightAscentionOfAscendingNode != RIGHT_ASCENTION_OF_ASCENDING_NODE_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__REVOLUTION_NUMBER_AT_EPOCH:
				return revolutionNumberAtEpoch != REVOLUTION_NUMBER_AT_EPOCH_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE__SATELLITE_NUMBER:
				return satelliteNumber != SATELLITE_NUMBER_EDEFAULT;
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
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE___GET_ORE_KIT_TLE:
				try {
					return getOreKitTLE();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE___GET_LINE1:
				return getLine1();
			case ApogyCoreEnvironmentOrbitEarthPackage.ABSTRACT_TLE___GET_LINE2:
				return getLine2();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (bStar: ");
		result.append(bStar);
		result.append(", epoch: ");
		result.append(epoch);
		result.append(", eccentricity: ");
		result.append(eccentricity);
		result.append(", elementNumber: ");
		result.append(elementNumber);
		result.append(", ephemerisType: ");
		result.append(ephemerisType);
		result.append(", inclination: ");
		result.append(inclination);
		result.append(", meanAnomaly: ");
		result.append(meanAnomaly);
		result.append(", meanMotion: ");
		result.append(meanMotion);
		result.append(", revolutionPerDay: ");
		result.append(revolutionPerDay);
		result.append(", meanMotionFirstDerivative: ");
		result.append(meanMotionFirstDerivative);
		result.append(", meanMotionSecondDerivative: ");
		result.append(meanMotionSecondDerivative);
		result.append(", argumentOfPerigee: ");
		result.append(argumentOfPerigee);
		result.append(", rightAscentionOfAscendingNode: ");
		result.append(rightAscentionOfAscendingNode);
		result.append(", revolutionNumberAtEpoch: ");
		result.append(revolutionNumberAtEpoch);
		result.append(", satelliteNumber: ");
		result.append(satelliteNumber);
		result.append(')');
		return result.toString();
	}

} //AbstractTLEImpl
