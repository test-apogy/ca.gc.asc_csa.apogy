package ca.gc.asc_csa.apogy.addons.geometry.paths.impl;
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

import javax.vecmath.Point3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsFactory;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsPackage;
import ca.gc.asc_csa.apogy.addons.geometry.paths.SegmentWayPointPathInterpolator;
import ca.gc.asc_csa.apogy.addons.geometry.paths.UniformDistanceWayPointPathInterpolator;
import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uniform Distance Way Point Path Interpolator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.geometry.paths.impl.UniformDistanceWayPointPathInterpolatorImpl#getDistanceInterval <em>Distance Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniformDistanceWayPointPathInterpolatorImpl extends WayPointPathFilterImpl implements UniformDistanceWayPointPathInterpolator
{
	/**
	 * The default value of the '{@link #getDistanceInterval() <em>Distance Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceInterval()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_INTERVAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistanceInterval() <em>Distance Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceInterval()
	 * @generated
	 * @ordered
	 */
	protected double distanceInterval = DISTANCE_INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniformDistanceWayPointPathInterpolatorImpl()
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
		return ApogyAddonsGeometryPathsPackage.Literals.UNIFORM_DISTANCE_WAY_POINT_PATH_INTERPOLATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDistanceInterval()
	{
		return distanceInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceInterval(double newDistanceInterval)
	{
		double oldDistanceInterval = distanceInterval;
		distanceInterval = newDistanceInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsGeometryPathsPackage.UNIFORM_DISTANCE_WAY_POINT_PATH_INTERPOLATOR__DISTANCE_INTERVAL, oldDistanceInterval, distanceInterval));
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
			case ApogyAddonsGeometryPathsPackage.UNIFORM_DISTANCE_WAY_POINT_PATH_INTERPOLATOR__DISTANCE_INTERVAL:
				return getDistanceInterval();
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
			case ApogyAddonsGeometryPathsPackage.UNIFORM_DISTANCE_WAY_POINT_PATH_INTERPOLATOR__DISTANCE_INTERVAL:
				setDistanceInterval((Double)newValue);
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
			case ApogyAddonsGeometryPathsPackage.UNIFORM_DISTANCE_WAY_POINT_PATH_INTERPOLATOR__DISTANCE_INTERVAL:
				setDistanceInterval(DISTANCE_INTERVAL_EDEFAULT);
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
			case ApogyAddonsGeometryPathsPackage.UNIFORM_DISTANCE_WAY_POINT_PATH_INTERPOLATOR__DISTANCE_INTERVAL:
				return distanceInterval != DISTANCE_INTERVAL_EDEFAULT;
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
		result.append(" (distanceInterval: ");
		result.append(distanceInterval);
		result.append(')');
		return result.toString();
	}

	private double getHighResolutionMaximumDistanceInterval()
	{
		return getDistanceInterval() * 0.01;
	}
	
	private WayPointPath getHighResolutionWayPointPath(WayPointPath path) throws Exception
	{	
		SegmentWayPointPathInterpolator interpolator = ApogyAddonsGeometryPathsFactory.eINSTANCE.createSegmentWayPointPathInterpolator();			
		interpolator.setMaximumDistanceInterval(getHighResolutionMaximumDistanceInterval());		
		return interpolator.process(path);				
	}
	
	private double computeAverage(double[] values, int startIndex, int endIndex)
	{
		double average = 0.0;		
		for(int i = startIndex; i < endIndex; i++)
		{
			average += values[i];
		}		
		average = average / (endIndex - startIndex);		
		return average;
	}
	
	private WayPointPath filterPath(WayPointPath path) throws Exception
	{
		WayPointPath result = ApogyAddonsGeometryPathsFactory.eINSTANCE.createWayPointPath();
		
		int n = Math.round( (float) Math.ceil(getDistanceInterval() / getHighResolutionMaximumDistanceInterval())); 
		int nlPath = (int) Math.round((float) path.getLength() / getDistanceInterval());
		
		// System.out.println("n = " + n);
		// // System.out.println("nlPath = " + nlPath);
		
		// Computes the slopes and store them in a vector.
		double[][] slopes = new double[3][path.getPoints().size()];
		for(int i =1; i < path.getPoints().size(); i++)
		{
			Point3d p0 = path.getPoints().get(i-1).asPoint3d();
			Point3d p1 = path.getPoints().get(i).asPoint3d();
						
			slopes[0][i] = p1.x - p0.x;
			slopes[1][i] = p1.y - p0.y;
			slopes[2][i] = p1.z - p0.z;
						
			// System.out.println("slopes[1]["+i+"]" + slopes[1][i]);
		}
		
		// Adds the first point into the resulting path.
		result.getPoints().add(ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(path.getPoints().get(0)));
		
		// Interpolate the trajectory.
		int ihpath = 0;
		for(int j = 1; j < nlPath; j++)
		{
			// System.out.println("ihpath = " + ihpath + " ihpath + n = " + (ihpath + n));
			
			// Computes the slopes average for the segment.
			double ux = computeAverage(slopes[0], ihpath, ihpath + n); 				
			double uy = computeAverage(slopes[1], ihpath, ihpath + n); 
			double uz = computeAverage(slopes[2], ihpath, ihpath + n); 
			
			// Normalises u.
			double norm = Math.sqrt( (ux*ux) + (uy*uy) + (uz*uz));
			ux = ux / norm;
			uy = uy / norm;
			uz = uz / norm;
			
			// System.out.println("ux = " + ux);
			// System.out.println("uy = " + uy);
			// System.out.println("uz = " + uz);
			
			ihpath = ihpath + n;
			Point3d lastPoint = result.getEndPoint().asPoint3d();
			CartesianPositionCoordinates newPoint = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates( lastPoint.x + ux * getDistanceInterval(),
										   							  lastPoint.y + uy * getDistanceInterval(), 
										   							  lastPoint.z + uz * getDistanceInterval());
			
			// System.out.println("newPoint = " + newPoint.toString());
			
			// Adds the point just interpolated.
			result.getPoints().add(newPoint);			
		}
		
		// Checks if the last point created is closer to the high resolution end point than the distance interval
		if(result.getEndPoint().asPoint3d().distance(path.getEndPoint().asPoint3d()) <= getDistanceInterval())
		{
			// Last point is close to the last point of the hight resolution trajectory, no need to add an extra point, just
			// move the last point to match.
			result.getEndPoint().setX(path.getEndPoint().getX());
			result.getEndPoint().setY(path.getEndPoint().getY());
			result.getEndPoint().setZ(path.getEndPoint().getZ());
		}
		else
		{
			// Last point is far from the last point of the hight resolution trajectory, need to add an extra point.
			result.getPoints().add(ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(path.getEndPoint()));
		}
		
		return result;
	}
	
	@Override
	public WayPointPath process(WayPointPath input) throws Exception
	{
		setInput(input);
		
		if(getProgressMonitor() != null) getProgressMonitor().beginTask("Interpolating WayPointPath.", 2);
		
		WayPointPath result = ApogyAddonsGeometryPathsFactory.eINSTANCE.createWayPointPath();
		setOutput(result);	
				
		// First, interpolate the path at high resolution.
		WayPointPath highResolutionPath = getHighResolutionWayPointPath(input);
		if(getProgressMonitor() != null) getProgressMonitor().worked(1);
		
		// Filters the resulting path.
		result.getPoints().addAll(filterPath(highResolutionPath).getPoints());
		if(getProgressMonitor() != null) getProgressMonitor().worked(1);
		
		if(getProgressMonitor() != null) getProgressMonitor().done();
		
		return result;
	}
} //UniformDistanceWayPointPathInterpolatorImpl
