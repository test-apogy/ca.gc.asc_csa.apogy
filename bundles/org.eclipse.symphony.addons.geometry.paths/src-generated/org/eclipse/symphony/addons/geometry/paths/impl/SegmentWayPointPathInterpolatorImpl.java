/**
 * Canadian Space Agency 2007.
 *
 * $Id: SegmentWayPointPathInterpolatorImpl.java,v 1.2.4.2 2015/05/21 15:50:36 pallard Exp $
 */
package org.eclipse.symphony.addons.geometry.paths.impl;

import java.util.ArrayList;
import java.util.List;

import javax.vecmath.Point3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsFactory;
import org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsPackage;
import org.eclipse.symphony.addons.geometry.paths.SegmentWayPointPathInterpolator;
import org.eclipse.symphony.addons.geometry.paths.WayPointPath;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Data3dFacade;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Segment Way Point Path Interpolator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.geometry.paths.impl.SegmentWayPointPathInterpolatorImpl#getMaximumDistanceInterval <em>Maximum Distance Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SegmentWayPointPathInterpolatorImpl extends WayPointPathInterpolatorImpl implements SegmentWayPointPathInterpolator
{
	/**
	 * The default value of the '{@link #getMaximumDistanceInterval() <em>Maximum Distance Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumDistanceInterval()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_DISTANCE_INTERVAL_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getMaximumDistanceInterval() <em>Maximum Distance Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumDistanceInterval()
	 * @generated
	 * @ordered
	 */
	protected double maximumDistanceInterval = MAXIMUM_DISTANCE_INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SegmentWayPointPathInterpolatorImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return Symphony__AddonsGeometryPathsPackage.Literals.SEGMENT_WAY_POINT_PATH_INTERPOLATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumDistanceInterval()
	{
		return maximumDistanceInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumDistanceInterval(double newMaximumDistanceInterval)
	{
		double oldMaximumDistanceInterval = maximumDistanceInterval;
		maximumDistanceInterval = newMaximumDistanceInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsGeometryPathsPackage.SEGMENT_WAY_POINT_PATH_INTERPOLATOR__MAXIMUM_DISTANCE_INTERVAL, oldMaximumDistanceInterval, maximumDistanceInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case Symphony__AddonsGeometryPathsPackage.SEGMENT_WAY_POINT_PATH_INTERPOLATOR__MAXIMUM_DISTANCE_INTERVAL:
				return getMaximumDistanceInterval();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case Symphony__AddonsGeometryPathsPackage.SEGMENT_WAY_POINT_PATH_INTERPOLATOR__MAXIMUM_DISTANCE_INTERVAL:
				setMaximumDistanceInterval((Double)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case Symphony__AddonsGeometryPathsPackage.SEGMENT_WAY_POINT_PATH_INTERPOLATOR__MAXIMUM_DISTANCE_INTERVAL:
				setMaximumDistanceInterval(MAXIMUM_DISTANCE_INTERVAL_EDEFAULT);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case Symphony__AddonsGeometryPathsPackage.SEGMENT_WAY_POINT_PATH_INTERPOLATOR__MAXIMUM_DISTANCE_INTERVAL:
				return maximumDistanceInterval != MAXIMUM_DISTANCE_INTERVAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maximumDistanceInterval: ");
		result.append(maximumDistanceInterval);
		result.append(')');
		return result.toString();
	}

	/**
	 * Interpolates the segment p0-p1 using the current maximumDistanceInterval.
	 * @param p0 The first point defining the segment.
	 * @param p1 The second point defining the segment.
	 * @return The list of interpolated point, excluding p1.
	 */
	protected List<CartesianPositionCoordinates> interpolateSegment(CartesianPositionCoordinates p0, CartesianPositionCoordinates p1)
	{
		List<CartesianPositionCoordinates> points = new ArrayList<CartesianPositionCoordinates>();
	
		Point3d point0 = p0.asPoint3d();
		Point3d point1 = p1.asPoint3d();
		
		// Check if the point are further apart than maximumDistanceInterval
		double distance = point0.distance(point1);
		if(distance > getMaximumDistanceInterval())
		{
			double deltaX = point1.x - point0.x;
			double deltaY = point1.y - point0.y;
			double deltaZ = point1.z - point0.z;
			
			double deltaT = getMaximumDistanceInterval() / distance;
			double t = 0.0;
			while(t < 1.0)
			{
				double x = point0.x + (t * deltaX);
				double y = point0.y + (t * deltaY);
				double z = point0.z + (t * deltaZ);
				
				CartesianPositionCoordinates point = Data3dFacade.INSTANCE.createCartesianPositionCoordinates(x, y, z);
				points.add(point);
				
				t += deltaT;
			}			
		}
		else
		{
			// Not far enough, just add p0.
			points.add(p0);
		}
		
		return points;
	}
	
	@Override
	public WayPointPath process(WayPointPath input) throws Exception
	{
		setInput(input);
		
		if(getProgressMonitor() != null) getProgressMonitor().beginTask("Interpolating WayPointPath.", input.getPoints().size());
		
		WayPointPath result = Symphony__AddonsGeometryPathsFactory.eINSTANCE.createWayPointPath();
		setOutput(result);		
		
		if(input.getPoints().size() > 1)
		{
			// Goes through each segment and interpolate it.
			for(int i =0; i < input.getPoints().size() -1; i++)
			{
				CartesianPositionCoordinates p0 = input.getPoints().get(i);
				CartesianPositionCoordinates p1 = input.getPoints().get(i+1);
				
				result.getPoints().addAll(interpolateSegment(p0,p1));
				
				if(getProgressMonitor() != null) getProgressMonitor().worked(1);
			}
			// Adds the last point.
			CartesianPositionCoordinates lastPoint = Data3dFacade.INSTANCE.createCartesianPositionCoordinates(input.getEndPoint());			
			
			result.getPoints().add(lastPoint);
		}		
		else if(input.getPoints().size() == 1)
		{
			CartesianPositionCoordinates point = Data3dFacade.INSTANCE.createCartesianPositionCoordinates(input.getStartPoint());
			result.getPoints().add(point);
		}
		if(getProgressMonitor() != null) getProgressMonitor().done();
		
		
		return result;
	}
} //SegmentWayPointPathInterpolatorImpl
