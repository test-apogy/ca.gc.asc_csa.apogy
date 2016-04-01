package ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl;
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
import org.orekit.propagation.Propagator;
import org.orekit.time.AbsoluteDate;
import org.orekit.time.TimeScale;
import org.orekit.time.TimeScalesFactory;
import org.orekit.utils.Constants;
import org.orekit.utils.IERSConventions;
import org.orekit.utils.PVCoordinates;

import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFactory;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visibility Pass Spacecraft Position History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionHistoryImpl#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionHistoryImpl#getVisibilityPass <em>Visibility Pass</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionHistoryImpl#getPositions <em>Positions</em>}</li>
 * </ul>
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
		return ApogyCoreEnvironmentOrbitEarthPackage.Literals.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__TIME_INTERVAL, oldTimeInterval, timeInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityPass getVisibilityPass() {
		if (eContainerFeatureID() != ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS) return null;
		return (VisibilityPass)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityPass basicGetVisibilityPass() {
		if (eContainerFeatureID() != ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS) return null;
		return (VisibilityPass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisibilityPass(VisibilityPass newVisibilityPass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVisibilityPass, ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibilityPass(VisibilityPass newVisibilityPass) {
		if (newVisibilityPass != eInternalContainer() || (eContainerFeatureID() != ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS && newVisibilityPass != null)) {
			if (EcoreUtil.isAncestor(this, newVisibilityPass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVisibilityPass != null)
				msgs = ((InternalEObject)newVisibilityPass).eInverseAdd(this, ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__POSITION_HISTORY, VisibilityPass.class, msgs);
			msgs = basicSetVisibilityPass(newVisibilityPass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS, newVisibilityPass, newVisibilityPass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VisibilityPassSpacecraftPosition> getPositions() {
		if (positions == null) {
			positions = new EObjectContainmentEList<VisibilityPassSpacecraftPosition>(VisibilityPassSpacecraftPosition.class, this, ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__POSITIONS);
		}
		return positions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public VisibilityPassSpacecraftPosition getClosestRangePosition() 
	{
		VisibilityPassSpacecraftPosition smallestRangePosition = null;
		
		if(!getPositions().isEmpty())
		{
			// Finds the position with the highest elevation.
			double closestRange = Double.POSITIVE_INFINITY;				
			Iterator<VisibilityPassSpacecraftPosition> it = getPositions().iterator();
			while(it.hasNext())
			{
				VisibilityPassSpacecraftPosition p = it.next();
				if(p.getRange() < closestRange)
				{
					closestRange = p.getRange();
					smallestRangePosition = p;
				}
			}						
		}	
		
		return smallestRangePosition;
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
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS:
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
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS:
				return basicSetVisibilityPass(null, msgs);
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__POSITIONS:
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
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS:
				return eInternalContainer().eInverseRemove(this, ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__POSITION_HISTORY, VisibilityPass.class, msgs);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__TIME_INTERVAL:
				return getTimeInterval();
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS:
				if (resolve) return getVisibilityPass();
				return basicGetVisibilityPass();
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__POSITIONS:
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
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__TIME_INTERVAL:
				setTimeInterval((Double)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS:
				setVisibilityPass((VisibilityPass)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__POSITIONS:
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
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__TIME_INTERVAL:
				setTimeInterval(TIME_INTERVAL_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS:
				setVisibilityPass((VisibilityPass)null);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__POSITIONS:
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
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__TIME_INTERVAL:
				return timeInterval != TIME_INTERVAL_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS:
				return basicGetVisibilityPass() != null;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__POSITIONS:
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
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY___GET_CLOSEST_RANGE_POSITION:
				return getClosestRangePosition();
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY___GET_HIGHEST_ELEVATION_POSITION:
				return getHighestElevationPosition();
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY___GET_SMALLEST_SPACECRAFT_CROSS_TRACK_ANGLE_POSITION:
				return getSmallestSpacecraftCrossTrackAnglePosition();
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY___UPDATE_HISTORY:
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
			Propagator propagator = pass.getOrbitModel().getOreKitPropagator();
			Frame inertialFrame = FramesFactory.getEME2000();
			LocalOrbitalFrame lof = new LocalOrbitalFrame(inertialFrame, LOFType.QSW, propagator, "QSW");
			GeographicCoordinates coord = pass.getSurfaceLocation();
			GeodeticPoint location = new GeodeticPoint(coord.getLatitude(), coord.getLongitude(), coord.getElevation());
			Frame earthFrame = FramesFactory.getITRF(IERSConventions.IERS_2010, true);
			BodyShape earth = new OneAxisEllipsoid(Constants.WGS84_EARTH_EQUATORIAL_RADIUS, Constants.WGS84_EARTH_FLATTENING, earthFrame);
			TopocentricFrame loc = new TopocentricFrame(earth, location, "location");
			
			TimeScale utc = TimeScalesFactory.getUTC();
			AbsoluteDate startAbsoluteDate = ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createAbsoluteDate(pass.getStartTime());
			AbsoluteDate endAbsoluteDate = new AbsoluteDate(startAbsoluteDate, pass.getDuration());
			AbsoluteDate extrapDate = startAbsoluteDate;
			
			while (extrapDate.compareTo(endAbsoluteDate) <= 0)  
			{
			    // We can simply get the position and velocity of spacecraft in LOC frame at any time
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
			    			    			    			    
			    PVCoordinates sc    = lof.getTransformTo(earth.getBodyFrame(), extrapDate).transformPVCoordinates(PVCoordinates.ZERO);			    
			    PVCoordinates tgt = loc.getTransformTo(earth.getBodyFrame(), extrapDate).transformPVCoordinates(PVCoordinates.ZERO);
			    			    
			    // Spacecraft position vector
			    Vector3D      p     = sc.getPosition();
			    			    			    
			    // Spacecraft velocity vector
                Vector3D      v     = sc.getVelocity();
                
                // Spacecraft cross track vector.
                Vector3D crossTrack = p.crossProduct(v);
                                
                // Target position vector.
                Vector3D  target        = tgt.getPosition();
                
                // Spacecraft to target vector.
                Vector3D  scToTarget    = p.subtract(target);         
                
                // Projection of scToTarget onto the orbital plane.
                Vector3D scToTargetOntoOrbitalPlane = projectOntoPlane(scToTarget, crossTrack.normalize());
                
                // Projection of scToTarget onto the crosstrack plane.
                Vector3D scToTargetOntoCrossTrackPlane = projectOntoPlane(scToTarget, v.normalize());
                                			    
			    //double scAlongTrackAngle = getAngle(p, scToTargetOntoOrbitalPlane);
			    double scAlongTrackAngle = getAlongTrackAngle(p, scToTargetOntoOrbitalPlane, crossTrack);
			    
			    //double scCrossTrackAngle = getAngle(p, scToTargetOntoCrossTrackPlane);
			    double scCrossTrackAngle = getCrossTrackAngle(p, scToTargetOntoCrossTrackPlane, v);
			    
			    VisibilityPassSpacecraftPosition position = ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createVisibilityPassSpacecraftPosition();
			    position.setTime(ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createDate(extrapDate));
			    position.setRange(range);
			    position.setRangeRate(rangeRate);
			    position.setAzimuth(azimuth);
			    position.setElevation(elevation);
			    position.setSpacecraftCrossTrackAngle(scCrossTrackAngle);
			    position.setSpacecraftAlongTrackAngle(scAlongTrackAngle);
			    
			    // Computes the position of the spacecraft.						    
		        GeodeticPoint scCoords  = earth.transform(sc.getPosition(), earth.getBodyFrame(), extrapDate);
		        		        
		        GeographicCoordinates geo = ApogyCoreEnvironmentFactory.eINSTANCE.createGeographicCoordinates();
		        geo.setElevation(scCoords.getAltitude());
		        geo.setLatitude(scCoords.getLatitude());
		        geo.setLongitude(scCoords.getLongitude());
		        
			    position.setSpacecraftCoordinates(geo);
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
	
	/**
	 * Computes the along track angle.
	 * @param p The position of the S/C.
	 * @param scToTargetOntoOrbitalPlane he position of the target projected onto the orbital plane.
	 * @param crossTrackVector The cross track vector.
	 * @return The along track angle.
	 */
	private double getAlongTrackAngle(Vector3D p, Vector3D scToTargetOntoOrbitalPlane, Vector3D crossTrackVector)
	{	
		// Finds the angle between the spacecraft position and the target position on the orbital plane.
		double angle = getAngle(p,scToTargetOntoOrbitalPlane);
		
		// Figures out the sign of the angle.
		Vector3D rotation = p.crossProduct(scToTargetOntoOrbitalPlane).normalize();		
		double dotProduct = rotation.dotProduct(crossTrackVector.normalize());				
		if(dotProduct < 0)
		{
			angle = -angle;
		}
				
		return angle;
	}
	
	/**
	 * Computes the cross track angle.
	 * @param p The position of the S/C.
	 * @param scToTargetOntoCrossTrackPlane The position of the target projected onto the plane perpendicular to the orbital plane.
	 * @param alongTrackVector The along track vector.
	 * @return The cross track angle.
	 */
	private double getCrossTrackAngle(Vector3D p, Vector3D scToTargetOntoCrossTrackPlane, Vector3D alongTrackVector)
	{	
		// Finds the angle between the spacecraft position and the target position on the plane perpendicular to the orbital plane.
		double angle = getAngle(p,scToTargetOntoCrossTrackPlane);
		
		// Figures out the sign of the angle.
		Vector3D rotation = p.crossProduct(scToTargetOntoCrossTrackPlane).normalize();		
		double dotProduct = rotation.dotProduct(alongTrackVector.normalize());				
		if(dotProduct > 0)
		{
			angle = -angle;
		}
				
		return angle;
	}
		
	private double getAngle(Vector3D v1, Vector3D v2)
	{
		double dotProduct = v1.dotProduct(v2);
		return Math.acos(dotProduct / (v1.getNorm() * v2.getNorm()));
	}
	
	private Vector3D projectOntoPlane(Vector3D u, Vector3D planeNormal)
	{
		double projUOnNormalLenght = u.dotProduct(planeNormal) / (planeNormal.getNormSq()); 
		Vector3D projUOnNormal = planeNormal.scalarMultiply(projUOnNormalLenght);		
		return u.subtract(projUOnNormal);
	}

} //VisibilityPassSpacecraftPositionHistoryImpl
