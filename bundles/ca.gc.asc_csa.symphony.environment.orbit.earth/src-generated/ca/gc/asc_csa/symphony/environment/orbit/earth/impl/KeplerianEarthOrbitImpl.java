/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.earth.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.orekit.frames.Frame;
import org.orekit.frames.FramesFactory;
import org.orekit.orbits.KeplerianOrbit;
import org.orekit.orbits.Orbit;
import org.orekit.orbits.PositionAngle;
import org.orekit.time.AbsoluteDate;

import ca.gc.asc_csa.symphony.environment.orbit.earth.EarthOrbitFacade;
import ca.gc.asc_csa.symphony.environment.orbit.earth.KeplerianEarthOrbit;
import ca.gc.asc_csa.symphony.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Keplerian Earth Orbit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.impl.KeplerianEarthOrbitImpl#getSemiMajorAxis <em>Semi Major Axis</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.impl.KeplerianEarthOrbitImpl#getEccentricity <em>Eccentricity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.impl.KeplerianEarthOrbitImpl#getInclination <em>Inclination</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.impl.KeplerianEarthOrbitImpl#getPerigeeArgument <em>Perigee Argument</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.impl.KeplerianEarthOrbitImpl#getRightAscentionOfAscendingNode <em>Right Ascention Of Ascending Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.impl.KeplerianEarthOrbitImpl#getMeanAnomaly <em>Mean Anomaly</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.impl.KeplerianEarthOrbitImpl#getTrueAnomaly <em>True Anomaly</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeplerianEarthOrbitImpl extends EarthOrbitImpl implements KeplerianEarthOrbit {
	/**
	 * The default value of the '{@link #getSemiMajorAxis() <em>Semi Major Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemiMajorAxis()
	 * @generated
	 * @ordered
	 */
	protected static final double SEMI_MAJOR_AXIS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSemiMajorAxis() <em>Semi Major Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemiMajorAxis()
	 * @generated
	 * @ordered
	 */
	protected double semiMajorAxis = SEMI_MAJOR_AXIS_EDEFAULT;

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
	 * The default value of the '{@link #getPerigeeArgument() <em>Perigee Argument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerigeeArgument()
	 * @generated
	 * @ordered
	 */
	protected static final double PERIGEE_ARGUMENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPerigeeArgument() <em>Perigee Argument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerigeeArgument()
	 * @generated
	 * @ordered
	 */
	protected double perigeeArgument = PERIGEE_ARGUMENT_EDEFAULT;

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
	 * The default value of the '{@link #getTrueAnomaly() <em>True Anomaly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueAnomaly()
	 * @generated
	 * @ordered
	 */
	protected static final double TRUE_ANOMALY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTrueAnomaly() <em>True Anomaly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueAnomaly()
	 * @generated
	 * @ordered
	 */
	protected double trueAnomaly = TRUE_ANOMALY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeplerianEarthOrbitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEarthOrbitEnvironmentPackage.Literals.KEPLERIAN_EARTH_ORBIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSemiMajorAxis() {
		return semiMajorAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemiMajorAxis(double newSemiMajorAxis) {
		double oldSemiMajorAxis = semiMajorAxis;
		semiMajorAxis = newSemiMajorAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__SEMI_MAJOR_AXIS, oldSemiMajorAxis, semiMajorAxis));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__ECCENTRICITY, oldEccentricity, eccentricity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__INCLINATION, oldInclination, inclination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPerigeeArgument() {
		return perigeeArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerigeeArgument(double newPerigeeArgument) {
		double oldPerigeeArgument = perigeeArgument;
		perigeeArgument = newPerigeeArgument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__PERIGEE_ARGUMENT, oldPerigeeArgument, perigeeArgument));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__RIGHT_ASCENTION_OF_ASCENDING_NODE, oldRightAscentionOfAscendingNode, rightAscentionOfAscendingNode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__MEAN_ANOMALY, oldMeanAnomaly, meanAnomaly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTrueAnomaly() {
		return trueAnomaly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrueAnomaly(double newTrueAnomaly) {
		double oldTrueAnomaly = trueAnomaly;
		trueAnomaly = newTrueAnomaly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__TRUE_ANOMALY, oldTrueAnomaly, trueAnomaly));
	}

	@Override
	public Orbit getOreKitOrbit() 
	{		
		return getOreKitKeplerianOrbit();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public KeplerianOrbit getOreKitKeplerianOrbit() 
	{
		AbsoluteDate initialDate = EarthOrbitFacade.INSTANCE.createAbsoluteDate(getTime());
		Frame inertialFrame = FramesFactory.getEME2000();
		double mu = 3.986004415e+14;
		
		KeplerianOrbit keplerianOrbit = new KeplerianOrbit(getSemiMajorAxis(), 
				getEccentricity(), 
				getInclination(), 
				getPerigeeArgument(), 
				getRightAscentionOfAscendingNode(), 
				getMeanAnomaly(), 
				PositionAngle.MEAN,
				inertialFrame, 
				initialDate, 
				mu);
		
		return keplerianOrbit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__SEMI_MAJOR_AXIS:
				return getSemiMajorAxis();
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__ECCENTRICITY:
				return getEccentricity();
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__INCLINATION:
				return getInclination();
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__PERIGEE_ARGUMENT:
				return getPerigeeArgument();
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__RIGHT_ASCENTION_OF_ASCENDING_NODE:
				return getRightAscentionOfAscendingNode();
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__MEAN_ANOMALY:
				return getMeanAnomaly();
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__TRUE_ANOMALY:
				return getTrueAnomaly();
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
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__SEMI_MAJOR_AXIS:
				setSemiMajorAxis((Double)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__ECCENTRICITY:
				setEccentricity((Double)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__INCLINATION:
				setInclination((Double)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__PERIGEE_ARGUMENT:
				setPerigeeArgument((Double)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__RIGHT_ASCENTION_OF_ASCENDING_NODE:
				setRightAscentionOfAscendingNode((Double)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__MEAN_ANOMALY:
				setMeanAnomaly((Double)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__TRUE_ANOMALY:
				setTrueAnomaly((Double)newValue);
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
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__SEMI_MAJOR_AXIS:
				setSemiMajorAxis(SEMI_MAJOR_AXIS_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__ECCENTRICITY:
				setEccentricity(ECCENTRICITY_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__INCLINATION:
				setInclination(INCLINATION_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__PERIGEE_ARGUMENT:
				setPerigeeArgument(PERIGEE_ARGUMENT_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__RIGHT_ASCENTION_OF_ASCENDING_NODE:
				setRightAscentionOfAscendingNode(RIGHT_ASCENTION_OF_ASCENDING_NODE_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__MEAN_ANOMALY:
				setMeanAnomaly(MEAN_ANOMALY_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__TRUE_ANOMALY:
				setTrueAnomaly(TRUE_ANOMALY_EDEFAULT);
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
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__SEMI_MAJOR_AXIS:
				return semiMajorAxis != SEMI_MAJOR_AXIS_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__ECCENTRICITY:
				return eccentricity != ECCENTRICITY_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__INCLINATION:
				return inclination != INCLINATION_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__PERIGEE_ARGUMENT:
				return perigeeArgument != PERIGEE_ARGUMENT_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__RIGHT_ASCENTION_OF_ASCENDING_NODE:
				return rightAscentionOfAscendingNode != RIGHT_ASCENTION_OF_ASCENDING_NODE_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__MEAN_ANOMALY:
				return meanAnomaly != MEAN_ANOMALY_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT__TRUE_ANOMALY:
				return trueAnomaly != TRUE_ANOMALY_EDEFAULT;
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
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT___GET_ORE_KIT_KEPLERIAN_ORBIT:
				return getOreKitKeplerianOrbit();
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
		result.append(" (semiMajorAxis: ");
		result.append(semiMajorAxis);
		result.append(", eccentricity: ");
		result.append(eccentricity);
		result.append(", inclination: ");
		result.append(inclination);
		result.append(", perigeeArgument: ");
		result.append(perigeeArgument);
		result.append(", rightAscentionOfAscendingNode: ");
		result.append(rightAscentionOfAscendingNode);
		result.append(", meanAnomaly: ");
		result.append(meanAnomaly);
		result.append(", trueAnomaly: ");
		result.append(trueAnomaly);
		result.append(')');
		return result.toString();
	}

} //KeplerianEarthOrbitImpl
