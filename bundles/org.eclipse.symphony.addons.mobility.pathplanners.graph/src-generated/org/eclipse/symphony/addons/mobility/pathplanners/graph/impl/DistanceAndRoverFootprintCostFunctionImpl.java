/**
 * Canadian Space Agency 2008.
 *
 * $Id: DistanceAndRoverFootprintCostFunctionImpl.java,v 1.2.4.2 2015/05/21 15:50:20 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility.pathplanners.graph.impl;

import java.util.HashMap;
import java.util.Set;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.mobility.pathplanners.graph.DistanceAndRoverFootprintCostFunction;
import org.eclipse.symphony.addons.mobility.pathplanners.graph.Symphony__AddonsMobilityPathplannersGraphPackage;
import org.eclipse.symphony.common.geometry.data.Mesh;
import org.eclipse.symphony.common.geometry.data3d.CartesianAxis;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Geometry3dUtilities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance And Rover Footprint Cost Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.pathplanners.graph.impl.DistanceAndRoverFootprintCostFunctionImpl#getRoverFootPrintRadius <em>Rover Foot Print Radius</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.pathplanners.graph.impl.DistanceAndRoverFootprintCostFunctionImpl#getMaximumRoughness <em>Maximum Roughness</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.pathplanners.graph.impl.DistanceAndRoverFootprintCostFunctionImpl#getMaximumCrossSlope <em>Maximum Cross Slope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DistanceAndRoverFootprintCostFunctionImpl extends DistanceAndSlopesCostFunctionImpl implements DistanceAndRoverFootprintCostFunction
{
	/**
	 * The default value of the '{@link #getRoverFootPrintRadius() <em>Rover Foot Print Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoverFootPrintRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double ROVER_FOOT_PRINT_RADIUS_EDEFAULT = 0.5;

	/**
	 * The cached value of the '{@link #getRoverFootPrintRadius() <em>Rover Foot Print Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoverFootPrintRadius()
	 * @generated
	 * @ordered
	 */
	protected double roverFootPrintRadius = ROVER_FOOT_PRINT_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumRoughness() <em>Maximum Roughness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRoughness()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_ROUGHNESS_EDEFAULT = 0.1;

	/**
	 * The cached value of the '{@link #getMaximumRoughness() <em>Maximum Roughness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRoughness()
	 * @generated
	 * @ordered
	 */
	protected double maximumRoughness = MAXIMUM_ROUGHNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumCrossSlope() <em>Maximum Cross Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumCrossSlope()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_CROSS_SLOPE_EDEFAULT = 0.488;

	/**
	 * The cached value of the '{@link #getMaximumCrossSlope() <em>Maximum Cross Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumCrossSlope()
	 * @generated
	 * @ordered
	 */
	protected double maximumCrossSlope = MAXIMUM_CROSS_SLOPE_EDEFAULT;

	private static HashMap<CartesianPolygon, Set<CartesianPolygon>> polygonToNeibours = new HashMap<CartesianPolygon, Set<CartesianPolygon>>();
	private static HashMap<CartesianPolygon, Vector3d> polygonToAverageNormal = new HashMap<CartesianPolygon, Vector3d>();

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistanceAndRoverFootprintCostFunctionImpl()
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
		return Symphony__AddonsMobilityPathplannersGraphPackage.Literals.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRoverFootPrintRadius()
	{
		return roverFootPrintRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoverFootPrintRadius(double newRoverFootPrintRadius)
	{
		double oldRoverFootPrintRadius = roverFootPrintRadius;
		roverFootPrintRadius = newRoverFootPrintRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsMobilityPathplannersGraphPackage.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__ROVER_FOOT_PRINT_RADIUS, oldRoverFootPrintRadius, roverFootPrintRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumRoughness()
	{
		return maximumRoughness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumRoughness(double newMaximumRoughness)
	{
		double oldMaximumRoughness = maximumRoughness;
		maximumRoughness = newMaximumRoughness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsMobilityPathplannersGraphPackage.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__MAXIMUM_ROUGHNESS, oldMaximumRoughness, maximumRoughness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumCrossSlope()
	{
		return maximumCrossSlope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumCrossSlope(double newMaximumCrossSlope)
	{
		double oldMaximumCrossSlope = maximumCrossSlope;
		maximumCrossSlope = newMaximumCrossSlope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsMobilityPathplannersGraphPackage.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__MAXIMUM_CROSS_SLOPE, oldMaximumCrossSlope, maximumCrossSlope));
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
			case Symphony__AddonsMobilityPathplannersGraphPackage.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__ROVER_FOOT_PRINT_RADIUS:
				return getRoverFootPrintRadius();
			case Symphony__AddonsMobilityPathplannersGraphPackage.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__MAXIMUM_ROUGHNESS:
				return getMaximumRoughness();
			case Symphony__AddonsMobilityPathplannersGraphPackage.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__MAXIMUM_CROSS_SLOPE:
				return getMaximumCrossSlope();
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
			case Symphony__AddonsMobilityPathplannersGraphPackage.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__ROVER_FOOT_PRINT_RADIUS:
				setRoverFootPrintRadius((Double)newValue);
				return;
			case Symphony__AddonsMobilityPathplannersGraphPackage.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__MAXIMUM_ROUGHNESS:
				setMaximumRoughness((Double)newValue);
				return;
			case Symphony__AddonsMobilityPathplannersGraphPackage.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__MAXIMUM_CROSS_SLOPE:
				setMaximumCrossSlope((Double)newValue);
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
			case Symphony__AddonsMobilityPathplannersGraphPackage.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__ROVER_FOOT_PRINT_RADIUS:
				setRoverFootPrintRadius(ROVER_FOOT_PRINT_RADIUS_EDEFAULT);
				return;
			case Symphony__AddonsMobilityPathplannersGraphPackage.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__MAXIMUM_ROUGHNESS:
				setMaximumRoughness(MAXIMUM_ROUGHNESS_EDEFAULT);
				return;
			case Symphony__AddonsMobilityPathplannersGraphPackage.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__MAXIMUM_CROSS_SLOPE:
				setMaximumCrossSlope(MAXIMUM_CROSS_SLOPE_EDEFAULT);
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
			case Symphony__AddonsMobilityPathplannersGraphPackage.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__ROVER_FOOT_PRINT_RADIUS:
				return roverFootPrintRadius != ROVER_FOOT_PRINT_RADIUS_EDEFAULT;
			case Symphony__AddonsMobilityPathplannersGraphPackage.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__MAXIMUM_ROUGHNESS:
				return maximumRoughness != MAXIMUM_ROUGHNESS_EDEFAULT;
			case Symphony__AddonsMobilityPathplannersGraphPackage.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__MAXIMUM_CROSS_SLOPE:
				return maximumCrossSlope != MAXIMUM_CROSS_SLOPE_EDEFAULT;
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
		result.append(" (roverFootPrintRadius: ");
		result.append(roverFootPrintRadius);
		result.append(", maximumRoughness: ");
		result.append(maximumRoughness);
		result.append(", maximumCrossSlope: ");
		result.append(maximumCrossSlope);
		result.append(')');
		return result.toString();
	}

	private Set<CartesianPolygon> getPolygonsWithinRadius(Mesh<CartesianPositionCoordinates, CartesianPolygon> mesh, CartesianPolygon center)
	{
		Set<CartesianPolygon> polygons = polygonToNeibours.get(center);
		if(polygons == null)
		{
			polygons = Geometry3dUtilities.getCartesianPolygonsPartiallyWithinRadius(center, getRoverFootPrintRadius(), mesh);
			polygonToNeibours.put(center, polygons);			
		}		
		else
		{
		}
		return polygons;				
	}
	
	private Vector3d getAverageNormal(Mesh<CartesianPositionCoordinates, CartesianPolygon> mesh, CartesianPolygon polygon)
	{
		Vector3d normal = polygonToAverageNormal.get(polygon);
		if(normal == null)
		{
			normal = Geometry3dUtilities.getAverageNormal(getPolygonsWithinRadius(mesh, polygon));
			polygonToAverageNormal.put(polygon, normal);			
		}
		else
		{			
		}
		
		return normal;
	}
	
	@Override
	public double getCost(CartesianPolygon from, CartesianPolygon to)
	{
		double cost = 0.0;		
		Vector3d averageNormal = new Vector3d();
							
		// Generate the list of cells in the rover's footprint
		Set<CartesianPolygon> polygonsWithinRadius = getPolygonsWithinRadius(getPlanner().getMesh(), to);				
		
		// Compute the slope of the footprint.
		averageNormal = getAverageNormal(getPlanner().getMesh(), to);	
				
		// Compute the cost based on the Euclidian distance between from and to,
		// the average normal and the roughness index
		cost = computeSegmentCost(from, to, averageNormal, polygonsWithinRadius);		
		if(cost == Double.POSITIVE_INFINITY)
		{
			// No need to go further, return the cost.
			return cost;
		}
		
		// Compute a heuristic cost to turn Dijkstra into A*
		cost += 2.0 * getHeuristicCost(to.getCentroid());		

		// Apply a penalty for crossing narrow edges. The width of the edge is
		// estimated as the sum of the areas of the two cells divided by the 
		// distance from centre to centre. The penalty is the exponential of
		// one over the width of the common edge. It tends to one as the 
		// edge gets wider and to infinity as the edge width tends to zero.
		// TODO verify that it works fine
		// For now, it is commented out since it leads to trajectories that 
		// are too complicated when the path must go to an area with small
		// triangles.
		// TODO cost *= Math.exp(p1.distance(p2)/(Geometry.area(mesh, fromCell)+Geometry.area(mesh, toCell)));

		return cost;
	}
	
	/**
	 * Computes the cost associated with a line segment based on distance and
	 * slope.
	 * 
	 * @param distance
	 *            The distance to travel.
	 * @param averageNormal
	 *            The slope, in radians, of the segment.
	 * @return The cost associated with moving on the segment.
	 */
	
	private double computeSegmentCost(CartesianPolygon from, CartesianPolygon to, Vector3d normal, Set<CartesianPolygon> polygonsWithinRadius) 
	{			
		Vector3d crossTrack = new Vector3d();
		Vector3d alongTrack = new Vector3d();

		Point3d p1 = from.getCentroid().asPoint3d();
		Point3d p2 = to.getCentroid().asPoint3d();
						
		double cost = 0.0;
		double distance = p1.distance(p2);
		Vector3d pathDirection = new Vector3d(p2.x - p1.x, p2.y - p1.y, p2.z - p1.z);		
		
		crossTrack.cross(normal, pathDirection);
		alongTrack.cross(crossTrack, normal);

		// Compute slopes along track and cross track.
		double alongSlopeAngle = computeSlopeAngle(alongTrack);
		double crossSlopeAngle = computeSlopeAngle(crossTrack);
				
		// Checks for maximum up slope violation
		if (alongSlopeAngle >= 0.0) 
		{			
			if (alongSlopeAngle <  Math.abs(getMaximumUpSlope()))
			{
				double slopeCost = Math.abs(getUpSlopeCostFactor() * (alongSlopeAngle / getMaximumUpSlope()));
				cost = distance * (1 + slopeCost);
			} 
			else 
			{
				cost = Double.POSITIVE_INFINITY;					
				// No need to go further, return the cost.
				return cost;
			}
		} 
		else 
		{
			// Checks for maximum down slope violation
			if (Math.abs(alongSlopeAngle) < Math.abs(getMaximumDownSlope())) 
			{
				cost = distance;
			} 
			else 
			{
				cost = Double.POSITIVE_INFINITY;				
				// No need to go further, return the cost.
				return cost;
			}
		}
		
		// Checks cross slope.
		if (Math.abs(crossSlopeAngle) > Math.abs(getMaximumCrossSlope())) 
		{
			cost = Double.POSITIVE_INFINITY;			
			// No need to go further, return the cost.
			return cost;
		}

		// Compute the roughness of the footprint 		
		double roughnessIndex = Geometry3dUtilities.getSurfaceRoughnessIndex(polygonsWithinRadius, normal, to, getRoverFootPrintRadius());
		if (roughnessIndex > getMaximumRoughness()) 
		{
			cost = Double.POSITIVE_INFINITY;
		} 
		
		return cost;
	}

	/**
	 * Compute the slope of a vector relative to the gravity vector.
	 * @param vector The vector
	 * @return The slope, in radians.
	 */
	private double computeSlopeAngle(Vector3d vector)
	{
		double elevationChange = 0.0;
		double distance = 0.0;
		switch(getGravityAxis().getValue())
		{
			case CartesianAxis.X_VALUE:
			{
				elevationChange = vector.x;
				distance = Math.sqrt(vector.y * vector.y + vector.z * vector.z);
				break;
			}
			case CartesianAxis.Y_VALUE:
			{
				elevationChange = vector.y;
				distance = Math.sqrt(vector.x * vector.x + vector.z * vector.z);	
				break;
			}
			case CartesianAxis.Z_VALUE:
			{
				elevationChange = vector.z;
				distance = Math.sqrt(vector.x * vector.x + vector.y * vector.y);
				break;
			}
		}				
		return Math.atan2(elevationChange, distance);
	}
	
	/**
	 * 
	 * Computes a heuristic cost to be added to the cost function. The
	 * heuristic is the distance to the final destination. This turns 
	 * the Dijkstra graph search into A*
	 * 
	 * @param p2: The center point of the destination polygon.
	 * @return: distance from destination polygon to final destination.
	 */
	
	private double getHeuristicCost(CartesianPositionCoordinates to)
	{
		Point3d destination = getPlanner().getCurrentDestination().asPoint3d();
		double distanceToGoal = 0.0;				
		distanceToGoal = to.asPoint3d().distance(destination);						
		return distanceToGoal;
	}
} //DistanceAndRoverFootprintCostFunctionImpl
