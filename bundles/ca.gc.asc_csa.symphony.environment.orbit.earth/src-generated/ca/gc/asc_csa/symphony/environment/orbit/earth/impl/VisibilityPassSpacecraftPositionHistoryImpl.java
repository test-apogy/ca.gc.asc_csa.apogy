/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.earth.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.orekit.bodies.BodyShape;
import org.orekit.bodies.GeodeticPoint;
import org.orekit.bodies.OneAxisEllipsoid;
import org.orekit.frames.Frame;
import org.orekit.frames.FramesFactory;
import org.orekit.frames.LOFType;
import org.orekit.frames.LocalOrbitalFrame;
import org.orekit.frames.TopocentricFrame;
import org.orekit.frames.Transform;
import org.orekit.propagation.Propagator;
import org.orekit.time.AbsoluteDate;
import org.orekit.time.TimeScale;
import org.orekit.time.TimeScalesFactory;
import org.orekit.utils.Constants;
import org.orekit.utils.IERSConventions;
import org.orekit.utils.PVCoordinates;

import ca.gc.asc_csa.symphony.environment.GeographicCoordinates;
import ca.gc.asc_csa.symphony.environment.orbit.earth.EarthOrbitFacade;
import ca.gc.asc_csa.symphony.environment.orbit.earth.EarthOrbitPropagator;
import ca.gc.asc_csa.symphony.environment.orbit.earth.SymphonyEarthOrbitEnvironmentFactory;
import ca.gc.asc_csa.symphony.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage;
import ca.gc.asc_csa.symphony.environment.orbit.earth.VisibilityPass;
import ca.gc.asc_csa.symphony.environment.orbit.earth.VisibilityPassSpacecraftPosition;
import ca.gc.asc_csa.symphony.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visibility Pass Spacecraft Position History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionHistoryImpl#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionHistoryImpl#getVisibilityPass <em>Visibility Pass</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionHistoryImpl#getPositions <em>Positions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisibilityPassSpacecraftPositionHistoryImpl extends MinimalEObjectImpl.Container implements VisibilityPassSpacecraftPositionHistory {
	/**
	 * The default value of the '{@link #getTimeInterval() <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected static final double TIME_INTERVAL_EDEFAULT = 30.0;
	/**
	 * The cached value of the '{@link #getTimeInterval() <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected double timeInterval = TIME_INTERVAL_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPositions() <em>Positions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositions()
	 * @generated
	 * @ordered
	 */
	protected EList<VisibilityPassSpacecraftPosition> positions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisibilityPassSpacecraftPositionHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEarthOrbitEnvironmentPackage.Literals.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTimeInterval() {
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeInterval(double newTimeInterval) {
		double oldTimeInterval = timeInterval;
		timeInterval = newTimeInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__TIME_INTERVAL, oldTimeInterval, timeInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityPass getVisibilityPass() {
		if (eContainerFeatureID() != SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS) return null;
		return (VisibilityPass)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityPass basicGetVisibilityPass() {
		if (eContainerFeatureID() != SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS) return null;
		return (VisibilityPass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisibilityPass(VisibilityPass newVisibilityPass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVisibilityPass, SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibilityPass(VisibilityPass newVisibilityPass) {
		if (newVisibilityPass != eInternalContainer() || (eContainerFeatureID() != SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS && newVisibilityPass != null)) {
			if (EcoreUtil.isAncestor(this, newVisibilityPass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVisibilityPass != null)
				msgs = ((InternalEObject)newVisibilityPass).eInverseAdd(this, SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS__POSITION_HISTORY, VisibilityPass.class, msgs);
			msgs = basicSetVisibilityPass(newVisibilityPass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS, newVisibilityPass, newVisibilityPass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VisibilityPassSpacecraftPosition> getPositions() {
		if (positions == null) {
			positions = new EObjectContainmentEList<VisibilityPassSpacecraftPosition>(VisibilityPassSpacecraftPosition.class, this, SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__POSITIONS);
		}
		return positions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public VisibilityPassSpacecraftPosition getHighestElevationPosition() 
	{
		VisibilityPassSpacecraftPosition higestElevationPosition = null;
		
		if(!getPositions().isEmpty())
		{
			// Finds the position with the highest elevation.
			double highestElevation = Double.NEGATIVE_INFINITY;				
			Iterator<VisibilityPassSpacecraftPosition> it = getPositions().iterator();
			while(it.hasNext())
			{
				VisibilityPassSpacecraftPosition p = it.next();
				if(p.getElevation() > highestElevation)
				{
					highestElevation = p.getElevation();
					higestElevationPosition = p;
				}
			}						
		}		
		
		return higestElevationPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public VisibilityPassSpacecraftPosition getSmallestSpacecraftCrossTrackAnglePosition() 
	{
		VisibilityPassSpacecraftPosition smallestSpacecraftCrossTrackAnglePosition = null;
		
		if(!getPositions().isEmpty())
		{
			// Finds the position with the smallest cross-track angle.
			double smallestCrossTrackAngle = Double.MAX_VALUE;				
			Iterator<VisibilityPassSpacecraftPosition> it = getPositions().iterator();
			while(it.hasNext())
			{
				VisibilityPassSpacecraftPosition p = it.next();
				double crossTrackAngle = Math.abs(p.getSpacecraftCrossTrackAngle()); 
				if(crossTrackAngle < smallestCrossTrackAngle)
				{
					smallestCrossTrackAngle = crossTrackAngle;
					smallestSpacecraftCrossTrackAnglePosition = p;
				}
			}						
		}		
		
		return smallestSpacecraftCrossTrackAnglePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void updateHistory() 
	{
		getPositions().clear();
		
		// Computes the pass history
		List<VisibilityPassSpacecraftPosition> pos = getVisibilityPassPositionHistory(getVisibilityPass(), getTimeInterval());
		
		getPositions().addAll(pos);		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVisibilityPass((VisibilityPass)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS:
				return basicSetVisibilityPass(null, msgs);
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__POSITIONS:
				return ((InternalEList<?>)getPositions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS:
				return eInternalContainer().eInverseRemove(this, SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS__POSITION_HISTORY, VisibilityPass.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__TIME_INTERVAL:
				return getTimeInterval();
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS:
				if (resolve) return getVisibilityPass();
				return basicGetVisibilityPass();
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__POSITIONS:
				return getPositions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__TIME_INTERVAL:
				setTimeInterval((Double)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS:
				setVisibilityPass((VisibilityPass)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__POSITIONS:
				getPositions().clear();
				getPositions().addAll((Collection<? extends VisibilityPassSpacecraftPosition>)newValue);
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
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__TIME_INTERVAL:
				setTimeInterval(TIME_INTERVAL_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS:
				setVisibilityPass((VisibilityPass)null);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__POSITIONS:
				getPositions().clear();
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
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__TIME_INTERVAL:
				return timeInterval != TIME_INTERVAL_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS:
				return basicGetVisibilityPass() != null;
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__POSITIONS:
				return positions != null && !positions.isEmpty();
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
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY___GET_HIGHEST_ELEVATION_POSITION:
				return getHighestElevationPosition();
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY___GET_SMALLEST_SPACECRAFT_CROSS_TRACK_ANGLE_POSITION:
				return getSmallestSpacecraftCrossTrackAnglePosition();
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY___UPDATE_HISTORY:
				updateHistory();
				return null;
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
		result.append(" (timeInterval: ");
		result.append(timeInterval);
		result.append(')');
		return result.toString();
	}

	protected List<VisibilityPassSpacecraftPosition> getVisibilityPassPositionHistory(VisibilityPass pass, double timeInterval)
	{		
		List<VisibilityPassSpacecraftPosition> positions = new ArrayList<VisibilityPassSpacecraftPosition>();
		
		try
		{
			Propagator propagator = ((EarthOrbitPropagator) pass.getOrbitModel().getPropagator()).getOreKitPropagator();
			Frame inertialFrame = FramesFactory.getEME2000();
			LocalOrbitalFrame lof = new LocalOrbitalFrame(inertialFrame, LOFType.QSW, propagator, "QSW");
			GeographicCoordinates coord = pass.getSurfaceLocation().getGeographicalCoordinates();
			GeodeticPoint location = new GeodeticPoint(coord.getLatitude(), coord.getLongitude(), coord.getElevation());
			Frame earthFrame = FramesFactory.getITRF(IERSConventions.IERS_2010, true);
			BodyShape earth = new OneAxisEllipsoid(Constants.WGS84_EARTH_EQUATORIAL_RADIUS, Constants.WGS84_EARTH_FLATTENING, earthFrame);
			TopocentricFrame loc = new TopocentricFrame(earth, location, "location");
			
			TimeScale utc = TimeScalesFactory.getUTC();
			AbsoluteDate startAbsoluteDate = EarthOrbitFacade.INSTANCE.createAbsoluteDate(pass.getStartTime());
			AbsoluteDate endAbsoluteDate = new AbsoluteDate(startAbsoluteDate, pass.getDuration());
			AbsoluteDate extrapDate = startAbsoluteDate;
			while (extrapDate.compareTo(endAbsoluteDate) <= 0)  
			{
			    // We can simply get the position and velocity of station in LOF frame at any time
			    PVCoordinates pv = lof.getTransformTo(loc, extrapDate).transformPVCoordinates(PVCoordinates.ZERO);
			    			    
			    // Calculate the range.
			    double range = pv.getPosition().getNorm();
			    
			    // Calculate the range rate.
			    double rangeRate = Vector3D.dotProduct(pv.getPosition(), pv.getVelocity()) / pv.getPosition().getNorm();			    			    

			    // Calculate the azimuth.
			    double azimuth = Math.atan2(pv.getPosition().getX(), pv.getPosition().getY());
			    
			    // Calculate the elevation.
			    double l = Math.sqrt((pv.getPosition().getX() * pv.getPosition().getX() +  pv.getPosition().getY() *  pv.getPosition().getY()));
			    double elevation = Math.atan2(pv.getPosition().getZ(), l);
			    			    
			    // Calculate the spacecraft nadir angle to the surface location.
			    // TODO : Confirm these calculations !
			    PVCoordinates sc    = lof.getTransformTo(earth.getBodyFrame(), extrapDate).transformPVCoordinates(PVCoordinates.ZERO);
			    Transform scToEarth = lof.getTransformTo(earth.getBodyFrame(), extrapDate);
			    Vector3D      p     = scToEarth.transformPosition(sc.getPosition());
                Vector3D      v     = scToEarth.transformVector(sc.getVelocity());
                Vector3D      nadir = p.normalize().negate();
                Vector3D      crossTrack = p.crossProduct(v).normalize();
			    
                Transform targetToEarth = loc.getTransformTo(earth.getBodyFrame(), extrapDate);
                Vector3D  target        = targetToEarth.transformPosition(Vector3D.ZERO);
                Vector3D  scToTarget    = p.subtract(1.0, target).normalize();                                
                                                
                double scToTargetProjectionOntoCrossTrack = Vector3D.dotProduct(crossTrack, scToTarget);
                double scToTargetProjectionOntoNadir = Vector3D.dotProduct(nadir, scToTarget);                
			    double scCrossTrackAngle = Math.atan(scToTargetProjectionOntoCrossTrack / scToTargetProjectionOntoNadir);
			    
			    VisibilityPassSpacecraftPosition position = SymphonyEarthOrbitEnvironmentFactory.eINSTANCE.createVisibilityPassSpacecraftPosition();
			    position.setTime(EarthOrbitFacade.INSTANCE.createDate(extrapDate));
			    position.setRange(range);
			    position.setRangeRate(rangeRate);
			    position.setAzimuth(azimuth);
			    position.setElevation(elevation);
			    position.setSpacecraftCrossTrackAngle(scCrossTrackAngle);
			    
			    positions.add(position);
			    
			    extrapDate = new AbsoluteDate(extrapDate, timeInterval, utc);
			}
							
			// Start orbit propagation.
			propagator.propagate(new AbsoluteDate(startAbsoluteDate, pass.getDuration()));
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}		
		
		return positions;
	}

} //VisibilityPassSpacecraftPositionHistoryImpl
