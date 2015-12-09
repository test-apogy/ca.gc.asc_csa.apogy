package org.eclipse.symphony.addons.geometry.paths;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.media.j3d.Transform3D;
import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.symphony.common.geometry.data3d.CartesianAxis;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFacade;
import org.eclipse.symphony.common.geometry.data3d.Geometry3DUtilities;

public class PathUtilities
{	
	/**
	 * Appends two paths to form one.
	 * @param path1 The first path. 
	 * @param path2 The second path.
	 * @return
	 */
	public static WayPointPath append(WayPointPath path1, WayPointPath path2, boolean removeDuplicateAtEnds)
	{
		List<WayPointPath> paths = new ArrayList<WayPointPath>();
		
		// Creates a list of WayPointPath.
		paths.add(path1);
		paths.add(path2);
		
		// Appends the paths.
		return append(paths, removeDuplicateAtEnds);
	}
	
	/**
	 * Appends a list of WayPointPath to create a single WayPointPath.
	 * @param paths The list of paths to append together.
	 * @param removeDuplicateAtEnds True removes duplicates point at the end points of paths appended, false does not.
	 * @return The appended WayPointPath.
	 */
	public static WayPointPath append(List<WayPointPath> paths, boolean removeDuplicateAtEnds)
	{
		WayPointPath path = Symphony__AddonsGeometryPathsFactory.eINSTANCE.createWayPointPath();
		
		Iterator <WayPointPath> pathsIt = paths.iterator();
		while(pathsIt.hasNext())
		{
			WayPointPath currentPath = pathsIt.next();
			
			// Appends the description.
			String newDescription = path.getDescription() + "\n\n" + currentPath.getDescription();
			path.setDescription(newDescription);
			
			// Appends the way points.			
			for(int i =0; i < currentPath.getPoints().size(); i++)
			{								
				CartesianPositionCoordinates currentWayPoint = currentPath.getPoints().get(i);
				
				// Check if the first point of the next WayPointPath is equal to the current tail of the path.
				if(removeDuplicateAtEnds && (i == 0) && (path.getPoints().size() > 0))
				{
					CartesianPositionCoordinates currentEndPoint = path.getPoints().get(path.getPoints().size() -1);
					if(!currentWayPoint.equals(currentEndPoint))
					{
						path.getPoints().add(Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(currentWayPoint));
					}
				}
				else
				{				
					path.getPoints().add(Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(currentWayPoint));
				}
			}			
		}
		
		return path;		
	}
	
	/**
	 * Returns the sum of the absolute angular deltas of the path about a specified axis.
	 * @param axis The axis around which to sum the angular motion.
	 * @param wayPointPath The WayPointPath.
	 * @return The sum of the absolute angular deltas of the path about the specified axis, in radians.
	 */
	public static double getAngularMotion(CartesianAxis axis, WayPointPath wayPointPath)
	{
		double angularMotion = 0.0;
		
		if(wayPointPath.getPoints().size() > 2)
		{
			Vector3d u = null;
			Vector3d v = null;
			
			// Gets the flatten coordinates on the plane perpendicular to the specified axis.
			List<CartesianPositionCoordinates> flattenCoord = 
				Geometry3DUtilities.getFlattenCoordinates(Geometry3DUtilities.getPerpendicularPlane(axis), 
						wayPointPath.getPoints());
			
			for(int i = 0; i < flattenCoord.size() - 2; i++)
			{
				CartesianPositionCoordinates p1 = flattenCoord.get(i);
				CartesianPositionCoordinates p2 = flattenCoord.get(i+1);
				CartesianPositionCoordinates p3 = flattenCoord.get(i+2);
				
				u = new Vector3d(p2.getX() - p1.getX(),p2.getY() - p1.getY(), p2.getZ() - p1.getZ());
				v = new Vector3d(p3.getX() - p2.getX(),p3.getY() - p2.getY(), p3.getZ() - p2.getZ());				
				
				// Adds angular motion only if the vector are non-zero length.
				if(u.length() > 0 && v.length() > 0)
				{				
					angularMotion += u.angle(v);
				}
			}
		}
		
		return angularMotion;
	}		
	
	/**
	 * Returns the two CartesianPositionCoordinates that defines the longest segment in a specified WayPointPath.
	 * @param wayPointPath The WayPointPath.
	 * @return A list containing the two CartesianPositionCoordinates that defines the longest segment, or empty if the WayPointPath contains 
	 * less than 2 points. If many segments have the same maximum length, the last one is returned. 
	 */
	public static List<CartesianPositionCoordinates> getLongestSegment(WayPointPath wayPointPath)
	{
		List<CartesianPositionCoordinates> longestSegment = new ArrayList<CartesianPositionCoordinates>();
		
		double maxLength = 0;
		
		if(wayPointPath.getPoints().size() > 1)
		{
			for(int i = 0; i < wayPointPath.getPoints().size() - 1; i++)
			{
				CartesianPositionCoordinates p1 = wayPointPath.getPoints().get(i);
				CartesianPositionCoordinates p2 = wayPointPath.getPoints().get(i+1);
				
				double segmentLength = Geometry3DUtilities.getDistance(p1, p2);				
				if(segmentLength >= maxLength)
				{
					maxLength = segmentLength;
					longestSegment.clear();
					longestSegment.add(p1);
					longestSegment.add(p2);
				}
			}
		}
		
		return longestSegment;
	}	
	
	/**
	 * Returns the length of the longest segment of a specified WayPointPath.
	 * @param wayPointPath The WayPointPath.
	 * @return The length of the longest segment, zero if the WayPointPath contains less than 2 points.
	 */
	public static double getLongestSegmentLength(WayPointPath wayPointPath)
	{
		double maximumLength = 0.0;
		
		List<CartesianPositionCoordinates> longestSegment = getLongestSegment(wayPointPath);
		if(longestSegment.size() == 2)
		{
			maximumLength = Geometry3DUtilities.getDistance(longestSegment.get(0), longestSegment.get(1));
		}
		
		return maximumLength;
	}
	
	/**
	 * Returns the two CartesianPositionCoordinates that defines the shortest segment in a specified WayPointPath.
	 * @param wayPointPath The WayPointPath.
	 * @return A list containing the two CartesianPositionCoordinates that defines the shortest segment, or empty if the WayPointPath contains 
	 * less than 2 points. If many segments have the same minimum length, the last one is returned. 
	 */
	public static List<CartesianPositionCoordinates> getShortestSegment(WayPointPath wayPointPath)
	{
		List<CartesianPositionCoordinates> shortestSegment = new ArrayList<CartesianPositionCoordinates>();
		
		double minLength = Double.POSITIVE_INFINITY;
		
		if(wayPointPath.getPoints().size() > 1)
		{
			for(int i = 0; i < wayPointPath.getPoints().size() - 1; i++)
			{
				CartesianPositionCoordinates p1 = wayPointPath.getPoints().get(i);
				CartesianPositionCoordinates p2 = wayPointPath.getPoints().get(i+1);
				
				double segmentLength = Geometry3DUtilities.getDistance(p1, p2);				
				if(segmentLength <= minLength)
				{
					minLength = segmentLength;
					shortestSegment.clear();
					shortestSegment.add(p1);
					shortestSegment.add(p2);
				}
			}
		}
		
		return shortestSegment;
	}	
	
	/**
	 * Returns the length of the shortest segment of a specified WayPointPath.
	 * @param wayPointPath The WayPointPath.
	 * @return The length of the shortest segment, zero if the WayPointPath contains less than 2 points.
	 */
	public static double getShortestSegmentLength(WayPointPath wayPointPath)
	{
		double minimumLength = 0.0;
		
		List<CartesianPositionCoordinates> shortestSegment = getShortestSegment(wayPointPath);
		if(shortestSegment.size() == 2)
		{
			minimumLength = Geometry3DUtilities.getDistance(shortestSegment.get(0), shortestSegment.get(1));
		}
		
		return minimumLength;
	}
	
	/**
	 * Applies a transformation to a path.
	 * @param path The original path
	 * @param transform The transform to apply
	 * @return A new WayPointPath with each point transformed.
	 */
	public static WayPointPath applyTransform(final WayPointPath path, final Matrix4d transform)
	{
		WayPointPath transformedPath = Symphony__AddonsGeometryPathsFactory.eINSTANCE.createWayPointPath();
		Transform3D transform3d = new Transform3D(transform);
		
		List<CartesianPositionCoordinates> points = new ArrayList<CartesianPositionCoordinates>();
		for(CartesianPositionCoordinates point : path.getPoints())
		{
			Point3d p = new Point3d(point.getX(), point.getY(), point.getZ());
			transform3d.transform(p);
			
			CartesianPositionCoordinates newPoint = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(p.x, p.y, p.z);
			points.add(newPoint);
		}
		transformedPath.getPoints().addAll(points);
		
		return transformedPath;
	}
}
