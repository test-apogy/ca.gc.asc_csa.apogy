package ca.gc.asc_csa.apogy.common.geometry.data3d;
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector2d;
import javax.vecmath.Vector3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import ca.gc.asc_csa.apogy.common.geometry.data.Coordinates;
import ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data.Mesh;
import ca.gc.asc_csa.apogy.common.geometry.data.Polygon;

/**
 * Utilities Class providing basic 3D data manipulations.
 * 
 * @author pallard
 */
public class Geometry3DUtilities
{

	/**
	 * Returns the axis that is perpendicular to the specified reference plane.
	 * 
	 * @param plane
	 *            The reference plane.
	 * @return The reference axis perpendicular to the specified plane.
	 */
	public static CartesianAxis getPerpendicularAxis(CartesianPlane plane)
	{
		CartesianAxis axis = null;

		switch (plane.getValue())
		{
		case CartesianPlane.XY_VALUE:
			axis = CartesianAxis.Z;
			break;
		case CartesianPlane.XZ_VALUE:
			axis = CartesianAxis.Y;
			break;
		case CartesianPlane.YZ_VALUE:
			axis = CartesianAxis.X;
			break;
		}

		return axis;
	}

	/**
	 * Returns the plane that is perpendicular to the specified reference axis.
	 * 
	 * @param axis
	 *            The reference axis.
	 * @return The reference plane perpendicular to the specified axis.
	 */
	public static CartesianPlane getPerpendicularPlane(CartesianAxis axis)
	{
		CartesianPlane plane = null;

		switch (axis.getValue())
		{
		case CartesianAxis.X_VALUE:
			plane = CartesianPlane.YZ;
			break;
		case CartesianAxis.Y_VALUE:
			plane = CartesianPlane.XZ;
			break;
		case CartesianAxis.Z_VALUE:
			plane = CartesianPlane.XY;
			break;
		}

		return plane;
	}

	/**
	 * Return the spherical coordinates associated with a given Cartesian
	 * position.
	 * 
	 * @param cartesianCoordinates
	 *            The Cartesian position.
	 * @return The SphericalCoordinates representing the
	 *         CartesianPositionCoordinates.
	 * @see http://en.wikipedia.org/wiki/Spherical_coordinate_system
	 */
	public static SphericalCoordinates getSphericalCoordinates(CartesianPositionCoordinates cartesianCoordinates)
	{

		double x2y2 = cartesianCoordinates.getX() * cartesianCoordinates.getX() + cartesianCoordinates.getY() * cartesianCoordinates.getY();
		double r = Math.sqrt(x2y2 + (cartesianCoordinates.getZ() * cartesianCoordinates.getZ()));
		double phi = 0.0;

		if (r != 0)
		{
			phi = Math.acos(cartesianCoordinates.getZ() / r);
		} else
		{
			phi = Math.toRadians(90.0);
		}

		double theta = Math.atan2(cartesianCoordinates.getY(), cartesianCoordinates.getX());

		return ApogyCommonGeometryData3DFacade.INSTANCE.createSphericalCoordinates(phi, theta, r);
	}

	/**
	 * Return the Cartesian coordinates associated with a given spherical
	 * position.
	 * 
	 * @param sphericalCoordinates
	 *            The spherical position
	 * @return The CartesianPositionCoordinates representing the
	 *         SphericalCoordinates.
	 * @see http://en.wikipedia.org/wiki/Spherical_coordinate_system
	 */
	public static CartesianPositionCoordinates getCartesianPositionCoordinates(SphericalCoordinates sphericalCoordinates)
	{

		double x = sphericalCoordinates.getR() * Math.sin(sphericalCoordinates.getPhi()) * Math.cos(sphericalCoordinates.getTheta());
		double y = sphericalCoordinates.getR() * Math.sin(sphericalCoordinates.getPhi()) * Math.sin(sphericalCoordinates.getTheta());
		double z = sphericalCoordinates.getR() * Math.cos(sphericalCoordinates.getPhi());

		return ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(x, y, z);
	}

	/**
	 * Returns the centroid of a list of Cartesian positions.
	 * 
	 * @param coordinates
	 *            The list of Cartesian positions.
	 * @return The Cartesian position of the centroid. Returns (0,0,0) if the
	 *         list of position is empty.
	 * @see http://en.wikipedia.org/wiki/Centroid
	 */
	public static CartesianPositionCoordinates getCentroid(List<CartesianPositionCoordinates> coordinates)
	{
		return getCentroid(coordinates, null);
	}

	/**
	 * Return the flatten position (i.e. projected onto one plane).
	 * 
	 * @param plane
	 *            The plane on which to flatten the position
	 * @param point
	 *            The Point3d coordinates
	 * @return The flattened Point3d coordinates.
	 */
	public static Point3d getFlattenCoordinate(final CartesianPlane plane, final Point3d point)
	{
		Point3d flattenPoint = null;
		switch (plane.getValue())
		{
		case CartesianPlane.XY_VALUE:
			flattenPoint = new Point3d(point.x, point.y, 0);
			break;
		case CartesianPlane.XZ_VALUE:
			flattenPoint = new Point3d(point.x, 0, point.z);
			break;
		case CartesianPlane.YZ_VALUE:
			flattenPoint = new Point3d(0, point.y, point.z);
			break;
		}
		return flattenPoint;
	}
	
	
	/**
	 * Return the flatten position (i.e. projected onto one plane).
	 * 
	 * @param plane
	 *            The plane on which to flatten the position
	 * @param point
	 *            The Cartesian coordinates
	 * @return The flattened Cartesian coordinates.
	 */
	public static CartesianPositionCoordinates getFlattenCoordinate(final CartesianPlane plane, final CartesianPositionCoordinates point)
	{
		Point3d flattenPoint = getFlattenCoordinate(plane, point.asPoint3d());
		return ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(flattenPoint.x, flattenPoint.y, flattenPoint.z);		
	}
	
	/**
	 * Return the flatten position (i.e. projected onto one plane).
	 * 
	 * @param plane
	 *            The plane on which to flatten the position,
	 * @param coordinates
	 *            The list of Cartesian positions.
	 * @return The list of flattened Cartesian positions.
	 */
	public static List<Point3d> getPoint3dFlattenCoordinates(CartesianPlane plane, List<Point3d> coordinates)
	{
		List<Point3d> flattenCoordinates = new ArrayList<Point3d>();

		Iterator<Point3d> it = coordinates.iterator();
		while (it.hasNext())
		{
			Point3d p = it.next();
			Point3d flattenP = getFlattenCoordinate(plane, p);
			flattenCoordinates.add(flattenP);
		}

		return flattenCoordinates;
	}
	
	/**
	 * Return the flatten position (i.e. projected onto one plane).
	 * 
	 * @param plane
	 *            The plane on which to flatten the position,
	 * @param coordinates
	 *            The list of Cartesian positions.
	 * @return The list of flattened Cartesian positions.
	 */
	public static List<CartesianPositionCoordinates> getFlattenCoordinates(CartesianPlane plane, List<CartesianPositionCoordinates> coordinates)
	{
		List<CartesianPositionCoordinates> flattenCoordinates = new ArrayList<CartesianPositionCoordinates>();

		Iterator<CartesianPositionCoordinates> it = coordinates.iterator();
		while (it.hasNext())
		{
			CartesianPositionCoordinates p = it.next();
			CartesianPositionCoordinates flattenP = getFlattenCoordinate(plane, p);
			flattenCoordinates.add(flattenP);
		}

		return flattenCoordinates;
	}

	/**
	 * Returns the centroid of a list of Cartesian positions.
	 * 
	 * @param coordinates
	 *            The list of Cartesian positions.
	 * @param monitor
	 *            Progress monitor to provide feedback on the operation. Can be
	 *            null.
	 * @return The Cartesian position of the centroid. Returns (0,0,0) if the
	 *         list of position is empty.
	 * @see http://en.wikipedia.org/wiki/Centroid
	 */
	public static CartesianPositionCoordinates getCentroid(List<CartesianPositionCoordinates> coordinates, final IProgressMonitor monitor)
	{

		// Gets a valid IProgressMonitor.
		IProgressMonitor internalMonitor = monitor;
		if (internalMonitor == null)
			internalMonitor = new NullProgressMonitor();

		double x = 0.0;
		double y = 0.0;
		double z = 0.0;

		try
		{
			internalMonitor.beginTask(Geometry3DUtilities.class.getSimpleName() + ".getCentroid", coordinates.size());

			Iterator<CartesianPositionCoordinates> it = coordinates.iterator();
			while (it.hasNext())
			{
				CartesianPositionCoordinates coord = it.next();
				if(coord != null)
				{
					x += coord.getX();
					y += coord.getY();
					z += coord.getZ();
				}

				internalMonitor.worked(1);
			}

			if (coordinates.size() > 0)
			{
				x = x / coordinates.size();
				y = y / coordinates.size();
				z = z / coordinates.size();
			}
		}
		finally
		{
			internalMonitor.done();
		}

		return ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(x, y, z);
	}

	/**
	 * Returns the surface of the polygon defined by a list of
	 * CartesianPositionCoordinates.
	 * 
	 * @param vertices
	 *            The list of vertices composing the polygon.
	 * @return The surface. Returns zero if the list contains less than 3
	 *         vertices.
	 */
	public static double getPolygonSurface(List<CartesianPositionCoordinates> vertices)
	{

		double area = 0.0;

		if (vertices.size() == 3)
		{
			CartesianPositionCoordinates p1 = vertices.get(0);
			CartesianPositionCoordinates p2 = vertices.get(1);
			CartesianPositionCoordinates p3 = vertices.get(2);

			// Creates a vector u (p1-p2) and a vector v (p1-p3)
			Vector3d u = new Vector3d(p2.getX() - p1.getX(), p2.getY() - p1.getY(), p2.getZ() - p1.getZ());
			Vector3d v = new Vector3d(p3.getX() - p1.getX(), p3.getY() - p1.getY(), p3.getZ() - p1.getZ());
			Vector3d normal = new Vector3d();

			// Area = ||u x v|| /2
			normal.cross(u, v);
			area += normal.length() / 2.0;
		}
		else if (vertices.size() > 3)
		{
			throw new UnsupportedOperationException("getPolygonSurface() for polygons with more that 3 vertices is not implemented yet.");
		}

		return area;
	}

	/**
	 * Return the normal of a polygon defined by a list of
	 * CartesianPositionCoordinates;
	 * 
	 * @param vertices
	 *            The list of CartesianPositionCoordinates.
	 * @return The polygon normal, null if the list less than 3 points.
	 */
	public static Vector3d getPolygonNormal(List<CartesianPositionCoordinates> vertices)
	{
		Vector3d normal = null;

		if (vertices.size() == 3)
		{
			CartesianPositionCoordinates p1 = vertices.get(0);
			CartesianPositionCoordinates p2 = vertices.get(1);
			CartesianPositionCoordinates p3 = vertices.get(2);

			Vector3d u = new Vector3d(p2.getX() - p1.getX(), p2.getY() - p1.getY(), p2.getZ() - p1.getZ());
			Vector3d v = new Vector3d(p3.getX() - p1.getX(), p3.getY() - p1.getY(), p3.getZ() - p1.getZ());
			normal = new Vector3d();
			normal.cross(u, v);
		} 
		else if (vertices.size() > 3)
		{
			throw new UnsupportedOperationException("getPolygonNormal() for polygons with more that 3 vertices is not implemented yet.");
		}

		/* Normalize the normal.*/
		normal.normalize();
		
		return normal;
	}

	/**
	 * Returns the projection of a point onto a polygon.
	 * 
	 * @param point
	 *            The point to project.
	 * @param polygon
	 *            The polygon to project the point onto.
	 * @return The CartesianPositionCoordinates of the intersection point onto the polygon plane.
	 */
	public static CartesianPositionCoordinates getProjectionInPolygonPlane(CartesianPositionCoordinates point, CartesianPolygon polygon)
	{
		if (polygon.getVertices().size() == 3)
		{
			// Gets the projection Q' of the point Q in the plane of the polygon
			// using the following :
			// Q' = Q - rN
			// r = N dot (Q-P) where P is a point on the plane.

			// Gets the plane normal
			Vector3d N = getPolygonNormal(polygon.getVertices());
			N.normalize();

			Vector3d Q = new Vector3d(point.getX(), point.getY(), point.getZ());
			Vector3d P = new Vector3d(polygon.getVertices().get(0).getX(), polygon.getVertices().get(0).getY(), polygon.getVertices().get(0).getZ());

			Vector3d PQ = new Vector3d();
			PQ.sub(Q, P);

			double r = N.dot(PQ);
			Vector3d Qprime = new Vector3d(Q);
			N.scale(r);
			Qprime.sub(Q, N);

			CartesianPositionCoordinates projection = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(Qprime.x, Qprime.y, Qprime.z);

			return projection;
		} 
		else if (polygon.getVertices().size() > 3)
		{
			throw new UnsupportedOperationException("getProjection() for polygons with more that 3 vertices is not implemented yet.");
		} 
		else
		{
			return null;
		}
	}
	
	
	/**
	 * Returns the projection of a point onto a polygon.
	 * 
	 * @param point
	 *            The point to project.
	 * @param polygon
	 *            The polygon to project the point onto.
	 * @return The CartesianPositionCoordinates of the intersection point, null
	 *         if the projection does not fall on the polygon.
	 */
	public static CartesianPositionCoordinates getProjectionOnPolygon(CartesianPositionCoordinates point, CartesianPolygon polygon)
	{
		if (polygon.getVertices().size() == 3)
		{
			CartesianPositionCoordinates projection = getProjectionInPolygonPlane(point, polygon);

			// Finds if the projection fits inside the polygon boundaries.
			if (isInsidePolygon(projection, polygon))
			{
				return projection;
			} 
			else
			{
				return null;
			}
		} 
		else if (polygon.getVertices().size() > 3)
		{
			throw new UnsupportedOperationException("getProjection() for polygons with more that 3 vertices is not implemented yet.");
		} 
		else
		{
			return null;
		}
	}
	
	/**
	 * Returns the projection of a point on a polygon along a specified axis.
	 * @param axis The axis along which to project the point.
	 * @param point The point to project.
	 * @param polygon The polygon onto which to project.
	 * @return The point of intersection, null if the intersection point falls outside the projected polygon.
	 * @see Geometrics Tools for Computer Graphics, pp. 482-484.
	 */
	public static CartesianPositionCoordinates getProjectionAlongAxisOnToPolygon(CartesianAxis axis, Point3d point, CartesianPolygon polygon)
	{
		if (polygon.getVertices().size() == 3)
		{
			// Gets the polygon normal.
			Point3d lineOrigin = null;
			Vector3d lineDirection = null;
			
			switch(axis.getValue())
			{
				case CartesianAxis.X_VALUE:
				{
					lineOrigin = new Point3d(Float.MIN_VALUE, point.getY(), point.getZ());
					lineDirection = new Vector3d(1,0,0);
				}
				break;
				case CartesianAxis.Y_VALUE:
				{
					lineOrigin = new Point3d(point.getX(), Float.MIN_VALUE, point.getZ());
					lineDirection = new Vector3d(0, 1, 0);
				}
				break;
				case CartesianAxis.Z_VALUE:
				{
					lineOrigin = new Point3d(point.getX(), point.getY(), Float.MIN_VALUE);
					lineDirection = new Vector3d(0, 0, 1);
				}
				break;
				
			}
			
			// Extracts the plane parametrized form.
			Vector3d n = polygon.getNormal();
			n.normalize();
			double a = n.x;
			double b = n.y;
			double c = n.z;
			
			Vector3d vertex = new Vector3d(polygon.getVertices().get(0).asPoint3d());
			double d = -n.dot(vertex);
			
			// Computes the equation denominator.
			double denominator = lineDirection.dot(n);
			if(Math.abs(denominator) == 0)
			{
				return null;
			}
			
			// Computes the t parameters.
			double t = -(a * lineOrigin.x  + b * lineOrigin.y + c * lineOrigin.z + d);
			t = t / denominator;
			
			// Computes the intersection point.
			lineDirection.scale(t);	
			lineOrigin.add(lineDirection);
			
			// Check to see if the projected point falls inside the projected polygon.
			Point3d flattenedPoint = getFlattenCoordinate(getPerpendicularPlane(axis), point);
			
			List<CartesianPositionCoordinates> flattenedVertices = getFlattenCoordinates(getPerpendicularPlane(axis), polygon.getVertices());						
			
			CartesianPolygon flattenPolygon = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianPolygon();
			flattenPolygon.getVertices().addAll(flattenedVertices);
			
			if(isInsidePolygon(flattenedPoint, flattenPolygon))
			{			
				return ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(lineOrigin.x, lineOrigin.y, lineOrigin.z);
			}
			else
			{
				return null;
			}			
		} 
		else if (polygon.getVertices().size() > 3)
		{
			throw new UnsupportedOperationException("getProjection() for polygons with more that 3 vertices is not implemented yet.");
		} 
		else
		{
			return null;
		}
	}
	
	/**
	 * Returns the projection of a point on a polygon along a specified axis.
	 * @param axis The axis along which to project the point.
	 * @param point The point to project.
	 * @param polygon The polygon onto which to project.
	 * @return The point of intersection, null if the intersection point falls outside the projected polygon.
	 * @see Geometrics Tools for Computer Graphics, pp. 482-484.
	 */
	public static CartesianPositionCoordinates getProjectionAlongAxisOnToPolygon(CartesianAxis axis, CartesianPositionCoordinates point, CartesianPolygon polygon)
	{
		if (polygon.getVertices().size() == 3)
		{
			// Gets the polygon normal.
			Point3d lineOrigin = null;
			Vector3d lineDirection = null;
			
			switch(axis.getValue())
			{
				case CartesianAxis.X_VALUE:
				{
					lineOrigin = new Point3d(Float.MIN_VALUE, point.getY(), point.getZ());
					lineDirection = new Vector3d(1,0,0);
				}
				break;
				case CartesianAxis.Y_VALUE:
				{
					lineOrigin = new Point3d(point.getX(), Float.MIN_VALUE, point.getZ());
					lineDirection = new Vector3d(0, 1, 0);
				}
				break;
				case CartesianAxis.Z_VALUE:
				{
					lineOrigin = new Point3d(point.getX(), point.getY(), Float.MIN_VALUE);
					lineDirection = new Vector3d(0, 0, 1);
				}
				break;
				
			}
			
			// Extracts the plane parametrized form.
			Vector3d n = polygon.getNormal();
			n.normalize();
			double a = n.x;
			double b = n.y;
			double c = n.z;
			
			Vector3d vertex = new Vector3d(polygon.getVertices().get(0).asPoint3d());
			double d = -n.dot(vertex);
			
			// Computes the equation denominator.
			double denominator = lineDirection.dot(n);
			if(Math.abs(denominator) == 0)
			{
				return null;
			}
			
			// Computes the t parameters.
			double t = -(a * lineOrigin.x  + b * lineOrigin.y + c * lineOrigin.z + d);
			t = t / denominator;
			
			// Computes the intersection point.
			lineDirection.scale(t);	
			lineOrigin.add(lineDirection);
			
			// Check to see if the projected point falls inside the projected polygon.
			CartesianPositionCoordinates flattenedPoint = getFlattenCoordinate(getPerpendicularPlane(axis), point);
			List<CartesianPositionCoordinates> flattenedVertices = getFlattenCoordinates(getPerpendicularPlane(axis), polygon.getVertices());						
			
			CartesianPolygon flattenPolygon = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianPolygon();
			flattenPolygon.getVertices().addAll(flattenedVertices);
			
			if(isInsidePolygon(flattenedPoint, flattenPolygon))
			{			
				return ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(lineOrigin.x, lineOrigin.y, lineOrigin.z);
			}
			else
			{
				return null;
			}			
		} 
		else if (polygon.getVertices().size() > 3)
		{
			throw new UnsupportedOperationException("getProjection() for polygons with more that 3 vertices is not implemented yet.");
		} 
		else
		{
			return null;
		}
	}
	
	/**
	 * Returns the projection of a list of points on a list of polygons along a specified axis.
	 * @param axis The axis along which to project the point.
	 * @param points The list of points.
	 * @param polygons The list of polygons.
	 * @return The array containing the projection of the point. 
	 */
	public static <T extends CartesianPolygon> CartesianPositionCoordinates[] getProjectionAlongAxisOnToPolygon(CartesianAxis axis, List<CartesianPositionCoordinates> points, List<T> polygons)
	{
		// Finds the centroid of the points.
		CartesianPositionCoordinates centroid = getCentroid(points);
		
		// Sorts the polygon according to the distance to the centroid.
		SortedSet<CartesianPolygon> sortedPolygons = Geometry3DUtilities.sortCartesianPolygonByDistance(centroid, polygons);
		
		// For each of the point, tries to find a projection.
		CartesianPositionCoordinates[] intersections = new CartesianPositionCoordinates[points.size()];
		
		for(int i = 0; i < points.size(); i++)
		{
			// System.out.println("i " + i);
			CartesianPositionCoordinates point = points.get(i);

			CartesianPositionCoordinates projection = null;
			
			Iterator<CartesianPolygon> it = sortedPolygons.iterator();
			while((projection == null) && (it.hasNext()))
			{
				CartesianPolygon polygon = it.next();
				projection = Geometry3DUtilities.getProjectionAlongAxisOnToPolygon(CartesianAxis.Z, point, polygon);
			}
			intersections[i] = projection;			
		}
		
		return intersections;
	}
	
	/**
	 * Projects all of the points of a mesh on the plane defined by a polygon.
	 * @param mesh The mesh to project.
	 * @param projectionPlanePolygon The polygon defining the plane.
	 * @return A new mesh representing the projection.
	 */
	public static CartesianCoordinatesMesh getProjectedCartesianCoordinatesMeshOnPlane(CartesianCoordinatesMesh mesh, CartesianPolygon projectionPlanePolygon)
	{
		CartesianCoordinatesMesh newMesh = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianCoordinatesMesh(mesh);
		Iterator<CartesianPositionCoordinates> iterator = newMesh.getPoints().iterator();
		/* Project each points on the plane */
		while(iterator.hasNext())
		{
			CartesianPositionCoordinates vMesh = iterator.next();
			CartesianPositionCoordinates vProj = Geometry3DUtilities.getProjectionInPolygonPlane(vMesh, projectionPlanePolygon);
			vMesh.setX(vProj.getX());
			vMesh.setY(vProj.getY());
			vMesh.setZ(vProj.getZ());			
		}
		
		return newMesh;
	}

	/**
	 * Projects all of the points of a mesh on the plane defined by a polygon.
	 * @param mesh The mesh to project.
	 * @param projectionPlanePolygon  The polygon defining the plane.
	 * @return A new mesh representing the projection.
	 */
	public static CartesianTriangularMesh getProjectedCartesianTriangularMeshOnPlane(CartesianTriangularMesh mesh, CartesianPolygon projectionPlanePolygon)
	{
		CartesianTriangularMesh newMesh = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianTriangularMesh(mesh.getPolygons());
		
		Iterator<CartesianPositionCoordinates> iterator = newMesh.getPoints().iterator();
		/* Project each points on the plane */
		while(iterator.hasNext())
		{
			CartesianPositionCoordinates vMesh = iterator.next();
			CartesianPositionCoordinates vProj = Geometry3DUtilities.getProjectionInPolygonPlane(vMesh, projectionPlanePolygon);
			vMesh.setX(vProj.getX());
			vMesh.setY(vProj.getY());
			vMesh.setZ(vProj.getZ());			
		}
		
		return newMesh;
	}
	
	/**
	 * Returns whether or not a point falls within the boundary of a polygon.
	 * 
	 * @param point
	 *            The point.
	 * @param polygon
	 *            The polygon
	 * @return True if the point falls inside the polygon, false otherwise.
	 */
	public static boolean isInsidePolygon(Point3d point, CartesianPolygon polygon)
	{
		boolean isInside = true;
		
		// For each of the edges of the polygon check on which side of the edge the point fall.				
		CartesianPositionCoordinates[] vertices = new CartesianPositionCoordinates[polygon.getVertices().size()+1];
		polygon.getVertices().toArray(vertices);
		
		int i = 0;
		int vertexCount = vertices.length -1;
		
		/* Add the first point of the polygon at the end of the array in order to test the last polygon segment */
		vertices[vertexCount]=vertices[0];
		
		Vector3d polygonNormal = getPolygonNormal(polygon.getVertices());
		
		Point3d c = new Point3d(point.x, point.y, point.z);
		while((i < vertexCount) && isInside)
		{
			Point3d a = new Point3d(vertices[i].getX(), vertices[i].getY(), vertices[i].getZ());
			Point3d b = new Point3d(vertices[i+1].getX(), vertices[i+1].getY(), vertices[i+1].getZ());
			
			if(getSide(a,b,c, polygonNormal) < 0)	
			{
				isInside = false;
			}	
			i++;
		}
		
		return isInside;
	}
	
	/**
	 * Returns whether or not a point falls within the boundary of a polygon.
	 * 
	 * @param point
	 *            The point.
	 * @param polygon
	 *            The polygon
	 * @return True if the point falls inside the polygon, false otherwise.
	 */
	public static boolean isInsidePolygon(CartesianPositionCoordinates point, CartesianPolygon polygon)
	{
		return isInsidePolygon(point.asPoint3d(), polygon);
	}

	/**
	 * Returns whether a sphere intersects with a polygon.
	 * @param center The center of the sphere.
	 * @param radius The radius of the sphere.
	 * @param includeZeroOverlap Enable to consider zero-overlap (just touching) to be considered.
	 * @param polygon The polygon.
	 * @return True if the sphere touches the polygon, false otherwise.
	 */
	public static <T extends CartesianPolygon> boolean isSphereIntersectsPolygon(final CartesianPositionCoordinates center, double radius, final boolean includeZeroOverlap, final T polygon)
	{
		boolean isInside = false;
		
		// First checks if the center point falls inside the polygon.
		if(isInsidePolygon(center, polygon))
		{
			isInside = true;			
		}
		
		// Check to see if at least on of the polygon vertex falls inside the sphere.
		if(!isInside)
		{
			int i = 0;
			while(i < polygon.getVertices().size() && !isInside)
			{
				CartesianPositionCoordinates point =  polygon.getVertices().get(i);
				Vector3d tmp = new Vector3d();
				tmp.sub(point.asPoint3d(), center.asPoint3d());
				double length = tmp.length();
				if(length <= radius)
				{
					if(includeZeroOverlap)
					{
						isInside = true;
					}
					else if(length < radius)
					{
						isInside = true;
					}				
				}
				i++;
			}
		}
		
		// Checks if part of the polygon lies inside.
		if(!isInside)
		{		
			// Gets the list of polygon edges.		
			CartesianPositionCoordinates[] vertices = new CartesianPositionCoordinates[polygon.getVertices().size()+1];
			polygon.getVertices().toArray(vertices);
			
			int i = 0;
			int vertexCount = vertices.length -1;
			
			/* Add the first point of the polygon at the end of the array in order to test the last polygon segment */
			vertices[vertexCount]=vertices[0];
					
			Vector3d c = new Vector3d(center.getX(), center.getY(), center.getZ());
			while((i < vertexCount) && (!isInside))
			{
				Vector3d a = new Vector3d(vertices[i].getX(), vertices[i].getY(), vertices[i].getZ());
				Vector3d b = new Vector3d(vertices[i+1].getX(), vertices[i+1].getY(), vertices[i+1].getZ());				
				Vector3d centerProjectionOnEdge = getProjectionOfPointOntoLineSegment(c, a, b);
				
				if(centerProjectionOnEdge != null)
				{
					Vector3d tmp = new Vector3d(c);
					tmp.sub(centerProjectionOnEdge);

					if(tmp.length() <= radius)
					{
						if(includeZeroOverlap)
						{
							isInside = true;
						}
						else if(tmp.length() < radius)
						{
							isInside = true;
						}					
					}								
				}			
				i++;
			}								
		}
		return isInside;
	}
	
	/**
	 * Gets the distance between a point and a infinite line.
	 * @param point The point.
	 * @param p1 The first point defining the infinite line.
	 * @param p2 The second point defining the infinite line.
	 * @return The distance between the point and the infinite line. Note that 
	 * the line extends beyond the points used to define it.
	 */
	public static double getPointToLineDistance(final CartesianPositionCoordinates point, final CartesianPositionCoordinates p1, final CartesianPositionCoordinates p2)
	{
		return getPointToLineDistance(new Vector3d(point.asPoint3d()), new Vector3d(p1.asPoint3d()), new Vector3d(p2.asPoint3d()));
	}	
	
	/**
	 * Gets the distance between a point and an infinite line.
	 * @param point The point.
	 * @param p1 The first point defining the infinite line.
	 * @param p2 The second point defining the infinite line.
	 * @return The distance between the point and the line. Note that 
	 * the line extends beyond the points used to define it.
	 * @see "Geometric Tools for Computer Graphics", pp.366-367.
	 */
	public static double getPointToLineDistance(final Vector3d point, final Vector3d p1, final Vector3d p2)
	{
		Vector3d projectionOntoLine = getProjectionOfPointOntoLine(point, p1,p2);
		projectionOntoLine.sub(point);	
		return projectionOntoLine.length();
	}
	
	/**
	 * Returns the projection of a point onto an infinite line.
	 * @param point The point.
	 * @param p1 The first point defining the infinite line.
	 * @param p2 The second point defining the infinite line.
	 * @return The projection of the point onto the infinite line.
	 * @see "Geometric Tools for Computer Graphics", pp.366-367.
	 */
	public static CartesianPositionCoordinates getProjectionOfPointOntoLine(final CartesianPositionCoordinates point, final CartesianPositionCoordinates p1, final CartesianPositionCoordinates p2 )
	{
		Vector3d q = getProjectionOfPointOntoLine(new Vector3d(point.asPoint3d()), new Vector3d(p1.asPoint3d()), new Vector3d(p2.asPoint3d()));
		return ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(q.x, q.y, q.z);
	}
	
	/**
	 * Returns the projection of a point onto an infinite line.
	 * @param point The point.
	 * @param p1 The first point defining the infinite line.
	 * @param p2 The second point defining the infinite line.
	 * @return The projection of the point onto the infinite line.
	 * @see "Geometric Tools for Computer Graphics", pp.366-367.
	 */
	public static Vector3d getProjectionOfPointOntoLine(final Vector3d point, final Vector3d p1, final Vector3d p2)
	{
		Vector3d direction = new Vector3d();
		direction.sub(p2, p1);
		
		Vector3d qp = new Vector3d();
		qp.sub(point, p1);
		
		double t = direction.dot(qp);
		
		Vector3d qPrime = new Vector3d();
		
		direction.scale(t);
		qPrime.add(p1, direction);
		
		return qPrime;		
	}
	
	/**
	 * Returns the projection of a point onto an line segment.
	 * @param point The point.
	 * @param p1 The first point defining the line segment.
	 * @param p2 The first point defining the line segment.
	 * @return The projection of the point onto the line segment, null if the projection of the point does not
	 * fall onto the line segment.
	 * @see "Geometric Tools for Computer Graphics", pp.366-368.
	 */
	public static CartesianPositionCoordinates getProjectionOfPointOntoLineSegment(final CartesianPositionCoordinates point, final CartesianPositionCoordinates p1, final CartesianPositionCoordinates p2 )
	{
		Vector3d q = getProjectionOfPointOntoLine(new Vector3d(point.asPoint3d()), new Vector3d(p1.asPoint3d()), new Vector3d(p2.asPoint3d()));
		return ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(q.x, q.y, q.z);
	}
	
	/**
	 * Returns the projection of a point onto an line segment.
	 * @param point The point.
	 * @param p1 The first point defining the line segment.
	 * @param p2 The first point defining the line segment.
	 * @return The projection of the point onto the line segment, null if the projection of the point does not
	 * fall onto the line segment.
	 * @see "Geometric Tools for Computer Graphics", pp.366-368.
	 */
	public static Vector3d getProjectionOfPointOntoLineSegment(final Vector3d point, final Vector3d p1, final Vector3d p2)
	{
		Vector3d direction = new Vector3d();
		direction.sub(p2, p1);
		
		Vector3d qp = new Vector3d();
		qp.sub(point, p1);
		
		double t = direction.dot(qp);				
		
		// If the projection falls onto the segment.
		if( (0 <= t) && (t <= 1) )
		{
			Vector3d qPrime = new Vector3d();			
			direction.scale(t);
			qPrime.add(p1, direction);
			
			return qPrime;		
		}
		else
		{
			return null;
		}
	}
	
	/**
	 * Tells whether or not a line intersect with all the polygons.
	 * @param <T>
	 * @param plane The plane onto which to project both line and polygons.
	 * @param p1 The first point defining the line.
	 * @param p2 The second point defining the line.
	 * @param polygons The list of polygon.
	 * @return True if the line intersect ALL polygon, false othwerwise;
	 */
	public static <T extends CartesianPolygon> boolean isLineIntersectsAllPolygons(final CartesianPlane plane, final CartesianPositionCoordinates p1, final CartesianPositionCoordinates p2, final List<T> polygons)
	{		
		boolean intersect = true;
		int i = 0;
		while(intersect && (i < polygons.size()))
		{
			T polygon = polygons.get(i);
			
			if(!isLineIntersectsPolygon(plane, p1, p2, polygon)) 
			{				
				intersect = false;
			}
			else
			{				
			}
			i++;
		}
		
		return intersect;
	}
	
	/**
	 * Tells whether or not a line intersect a polygon.
	 * @param <T>
	 * @param plane The plane onto which to project both line and polygon.	
	 * @param p1 The first point defining the line.
	 * @param p2 The second point defining the line.
	 * @param polygon The polygon.
	 * @return True if the line intersect at least one of the polygon edge, false otherwise. 
	 */
	public static <T extends CartesianPolygon> boolean isLineIntersectsPolygon(final CartesianPlane plane, final CartesianPositionCoordinates p1, final CartesianPositionCoordinates p2, final T polygon)
	{
		if(polygon.getVertices().size() > 2)
		{
			Vector2d u1 = getVector2D(plane, p1);
			Vector2d u2 = getVector2D(plane, p2);
				
			// Check to see if the line intersect at least one edge of the polygon.
			int i = 0;			
			while(i < polygon.getVertices().size())
			{								
				CartesianPositionCoordinates e1 = null;
				CartesianPositionCoordinates e2 = null;
				
				// Test all edges.
				if(i <  (polygon.getVertices().size() -1))
				{
					e1 = polygon.getVertices().get(i);
					e2 = polygon.getVertices().get(i+1);
				}
				else
				{
					e1 = polygon.getVertices().get( polygon.getVertices().size() -1);
					e2 = polygon.getVertices().get(0);
				}
												
				Vector2d v1 = getVector2D(plane, e1);
				Vector2d v2 = getVector2D(plane, e2);
				
				// Find the intersection point between the line and the edge.
				Vector2d intersect = getLineIntersectionPoint(u1,u2,v1,v2);
				
				// Checks is the intersection point falls on the edge segment and the line segment.
				if(intersect != null)
				{
					double edgeLength = getDistance(v1,v2);
					double lineLength = getDistance(u1,u2);										
					
					
					if((getDistance(intersect,v1) < edgeLength) && 
						(getDistance(intersect,v1) > 0) && 
						(getDistance(intersect,v2) < edgeLength) &&
						(getDistance(intersect,v2) > 0) && 
						(getDistance(intersect,u1) < lineLength) &&
						(getDistance(intersect,u1) > 0) && 
						(getDistance(intersect,u2) < lineLength) &&
						(getDistance(intersect,u2) > 0)) return true;
				}				
				i++;
			}			
		}
		
		return false;
	}	
	
	/**
	 * Computes the Euclidian distance separating two Vector2d.
	 * @param v1 The first Vector2d.
	 * @param v2 The second Vector2d.
	 * @return The distance.
	 */
	public static double getDistance(Vector2d v1, Vector2d v2)
	{
		return Math.sqrt((v1.x-v2.x)*(v1.x-v2.x) + (v1.y - v2.y)*(v1.y - v2.y));
	}
	
	/**
	 * Converts a CartesianPositionCoordinates to a Vector2d by flattening it on a specified plane.
	 * @param plane The plane to flatten onto.
	 * @param point The CartesianPositionCoordinates to convert.
	 * @return The vector2d. 
	 */
	private static Vector2d getVector2D(final CartesianPlane plane, CartesianPositionCoordinates point)
	{
		Vector2d vector2d = null;
		
		switch(plane.getValue())
		{
			case CartesianPlane.XY_VALUE:
			{
				vector2d = new Vector2d(point.getX(), point.getY());
				break;
			}
			case CartesianPlane.XZ_VALUE:
			{
				vector2d = new Vector2d(point.getX(), point.getZ());
				break;
			}
			case CartesianPlane.YZ_VALUE:
			{
				vector2d = new Vector2d(point.getY(), point.getZ());
				break;
			}
		}
		
		return vector2d;
	}
	
	/**
	 * Return the point of intersection between a line and a polygon.
	 * @param u The first point (origin) defining the line.
	 * @param v The second point defining the line.
	 * @param polygon The polygon
	 * @return The intersection point, null if none is found.
	 * @see http://en.wikipedia.org/wiki/Line-plane_intersection
	 */
	public static Point3d getLineAndPolygonIntersectionPoint(final Vector3d u, final Vector3d v, final CartesianPolygon polygon)
	{
		// First, find the normal of the polygon.
		Vector3d n = polygon.getNormal();
		n.normalize();
		
		// Define a point p0 that lies on the plane.
		Point3d p0 = polygon.getVertices().get(0).asPoint3d();
		
		// Define point l0 as being the origin of the line.
		Vector3d l0 = new Vector3d(u);
		
		// Defines l as a vector in the direction of the line.
		Vector3d l = new Vector3d(v);
		l.sub(u);		
		
		// Defines l dot n as the numerator
		Vector3d lDotn = new Vector3d(l);
		double numerator = lDotn.dot(n);
					
		// Defines the denominator
		Vector3d p0l0 = new Vector3d(p0);
		p0l0.sub(l0);
		double denominator = p0l0.dot(n);
		
		if(numerator == 0)
		{
			// Both numerator and denominator are 0 -> line lies in the plane.
			if(denominator == 0)
			{
				return new Point3d(u);
			}
			else
			{
				// Numerator only is zero -> no intersection. 
				return null;
			}
		}
				
		// Defines the distance d along the line where the line intersects the plane.
		double d = denominator / numerator;
		
		// If the distance falls within the line boundary
		if((d >= 0.0) && (d <= 1.0))
		{			
			// Finds the intersection by moving by distance d along the line.
			Vector3d line = new Vector3d(l);
			// line.normalize();
			line.scale(d);
			line.add(u);
			Point3d intersection = new Point3d(line);
					
			// Checks that the line projection falls within the polygon.
			CartesianPositionCoordinates p = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(intersection.x, intersection.y, intersection.z);
			if(isInsidePolygon(p, polygon))
			{
				return intersection;
			}						
		}
		return null;
	}
	
	/**
	 * Returns the intersection point between two lines defines by points.
	 * @param u1 The first point defining the first line.
	 * @param u2 The second point defining the first line.
	 * @param v1 The first point defining the second line.
	 * @param v2 The second point defining the second line.
	 * @return The intersection, null if lines are parallel or the same.
	 * @see http://www.ahristov.com/tutorial/geometry-games/intersection-lines.html
	 */
	public static Vector2d getLineIntersectionPoint(Vector2d u1, Vector2d u2, Vector2d v1, Vector2d v2) 
	{		
		double d = (u1.x-u2.x)*(v1.y-v2.y) - (u1.y-u2.y)*(v1.x-v2.x);
		
		if (d == 0.0) return null;
		
		double xi = ((v1.x-v2.x) * (u1.x * u2.y- u1.y * u2.x) -(u1.x-u2.x) * (v1.x * v2.y - v1.y * v2.x))/d;
		double yi = ((v1.y-v2.y) * (u1.x * u2.y -u1.y * u2.x) -(u1.y-u2.y) * (v1.x * v2.y - v1.y * v2.x))/d;
		
		return new Vector2d(xi,yi);
	}
	
	/**
	 * Computes on which side of an edge defined by two points a specified point
	 * falls.
	 * 
	 * @param a
	 *            First point defining the edge.
	 * @param b
	 *            Second point defining the edge.
	 * @param point
	 *            The specified point.
	 * @param polygonNormal
	 *            The normal of the polygon.
	 * @return -1 if c is on the right of a-b, 0 if c is on a-b or -1 if c is
	 *         left of a-c
	 */
	private static int getSide(Point3d a, Point3d b, Point3d point, Vector3d polygonNormal)
	{
		int result = 0;

		Vector3d ab = new Vector3d();
		ab.sub(b, a);

		Vector3d ac = new Vector3d();
		ac.sub(point, a);

		// Finds the cross product of a->b and a->point
		Vector3d normal = new Vector3d();
		normal.cross(ab, ac);

		// Find the angle between the normal computed and the one from the
		// polygon.
		double angle = normal.angle(polygonNormal);
		if (angle == 0.0)
		{
			result = 0;
		} else if (angle < Math.toRadians(90))
		{
			result = 1;
		} else if (angle > Math.toRadians(90))
		{
			result = -1;
		}

		return result;
	}

	/**
	 * Sorts a list of CartesianPositionCoordinates by order of proximity to a
	 * given CartesianPositionCoordinates.
	 * 
	 * @param centerPoint
	 *            The point to sort relative to.
	 * @param points
	 *            List of CartesianPositionCoordinates to be sorted.
	 * @return Sorted set of points, closest point first.
	 */
	public static SortedSet<CartesianPositionCoordinates> sortCartesianPositionCoordinatesByDistance(CartesianPositionCoordinates centerPoint, List<CartesianPositionCoordinates> points)
	{

		TreeSet<CartesianPositionCoordinates> sortedPoints = new TreeSet<CartesianPositionCoordinates>(new CartesianPositionCoordinatesDistanceComparator(centerPoint));
		sortedPoints.addAll(points);

		return sortedPoints;
	}

	/**
	 * Returns the list of polygons sorted by their distance to a specified
	 * point. The centroid of the polygon is used to compute the distance.
	 * 
	 * @param centerPoint
	 *            The center point.
	 * @param polygons
	 *            The list of polygons.
	 * @return The list of polygons, sorted by distance.
	 */
	public static SortedSet<CartesianPolygon> sortCartesianPolygonByDistance(CartesianPositionCoordinates centerPoint, Collection<? extends CartesianPolygon> polygons)
	{
		TreeSet<CartesianPolygon> sortedPolygons = new TreeSet<CartesianPolygon>(new CartesianPolygonCoordinatesDistanceComparator(centerPoint));
		sortedPolygons.addAll(polygons);

		return sortedPolygons;
	}

	/**
	 * Computes the average normal of a set of polygons weighted by the polygon area.
	 * @param <T> 
	 * @param polygons The list of polygons.
	 * @return The average normal.
	 */
	public static <T extends CartesianPolygon> Vector3d getAverageNormal(Collection<T> polygons)
	{
		Vector3d averageNormal = new Vector3d(0.0, 0.0, 0.0);
		
		Iterator <T> it = polygons.iterator();
		while(it.hasNext())
		{
			T polygon = it.next();	
			Vector3d polygonNormal = polygon.getNormal();
			double polygonArea = polygon.getSurface();
			averageNormal.set(averageNormal.x + polygonArea * polygonNormal.x,
					 		  averageNormal.y + polygonArea * polygonNormal.y, 
					 		  averageNormal.z + polygonArea * polygonNormal.z); 
		}			
		
		return averageNormal;
	}
	
	/**
	 * Computes a roughness index for a set of polygons.
	 * @param <T>
	 * @param polygons The list of polygons.
	 * @param averageNormal
	 * @param polygon The polygon around which the computation is based.
	 * @param radius The radius of the footprint to test.
	 * @return A double giving an indication of the roughness terrain in the list of polygon based on the 
	 * dot product of the neighbouring polygon.
	 */
	public static <T extends CartesianPolygon> double getSurfaceRoughnessIndex(Collection<T> polygons, Vector3d averageNormal, T polygon, double radius)
	{
		Point3d centre = polygon.getCentroid().asPoint3d();
		double maxRoughnessIndex = 0.0;
		double roughnessIndex = 0.0;
		Vector3d toVertex = new Vector3d();
		Iterator <T> it = polygons.iterator();
		
		// For each vertex compute the distance from the plane defined by the
		// centre of the polygon and the average normal.
		while(it.hasNext())
		{
			T currentPolygon = it.next();
			Point3d currentVertex = currentPolygon.getCentroid().asPoint3d();
			
			// Check that the vertex is within the radius of the footprint
			// It could belong to a polygon touching the footprint, yet be outside of it.
			if(currentVertex.distance(centre) <= radius)
			{
				toVertex.set(currentVertex.x-centre.x, currentVertex.y-centre.y, currentVertex.z-centre.z);
				roughnessIndex = Math.abs(toVertex.dot(averageNormal));
				
				// If the value is larger than the maximum roughness found so far, keep this value.
				// If this value is smaller than the minimum found so far, assign it to the minimum.
				if (roughnessIndex > maxRoughnessIndex) {
					maxRoughnessIndex = roughnessIndex;
				}								
			}			
		}	
				
		return maxRoughnessIndex;
	}
	
	/**
	 * Returns the Euclidean distance separating two
	 * CartesianPositionCoordinates.
	 * 
	 * @param from
	 *            First CartesianPositionCoordinates.
	 * @param to
	 *            Second CartesianPositionCoordinates.
	 * @return The Euclidean distance between the two position.
	 */
	public static double getDistance(CartesianPositionCoordinates from, CartesianPositionCoordinates to)
	{
		Point3d p1 = new Point3d(from.getX(), from.getY(), from.getZ());
		Point3d p2 = new Point3d(to.getX(), to.getY(), to.getZ());

		return p1.distance(p2);
	}

	/**
	 * Returns the distance between a point and a line defined by two points.
	 * 
	 * @param point
	 *            The point.
	 * @param u1
	 *            The first point defining the line.
	 * @param u2
	 *            The second point defining the line.
	 * @return The distance between the point and the specified line.
	 */
	public static double getDistance(CartesianPositionCoordinates point, CartesianPositionCoordinates u1, CartesianPositionCoordinates u2)
	{
		CartesianPositionCoordinates projectedPoint = getProjection(point, u1, u2);
		return getDistance(projectedPoint, point);
	}

	/**
	 * Returns the projection of a point on a line defined by two points.
	 * 
	 * @param point
	 *            The point.
	 * @param u1
	 *            The first point defining the line.
	 * @param u2
	 *            The second point defining the line.
	 * @return The projection of the point onto the line.
	 */
	public static CartesianPositionCoordinates getProjection(CartesianPositionCoordinates point, CartesianPositionCoordinates u1, CartesianPositionCoordinates u2)
	{
		// Defines the vectors.
		Vector3d u1point = new Vector3d(point.getX() - u1.getX(), point.getY() - u1.getY(), point.getZ() - u1.getZ());
		Vector3d u1u2 = new Vector3d(u2.getX() - u1.getX(), u2.getY() - u1.getY(), u2.getZ() - u1.getZ());

		// Computes the projection of u1->point on u1->u2
		double scale = (u1point.dot(u1u2)) / u1u2.lengthSquared();
		Vector3d projOnu1u2 = new Vector3d(u1u2);
		projOnu1u2.scale(scale);

		Vector3d u1Vector = new Vector3d(u1.getX(), u1.getY(), u1.getZ());
		projOnu1u2.add(u1Vector);

		return ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(projOnu1u2.x, projOnu1u2.y, projOnu1u2.z);
	}

	/**
	 * Returns the CartesianPositionCoordinates from a list that has the maximum
	 * coordinate along a specified axis.
	 * 
	 * @param axis
	 *            The specified axis.
	 * @param points
	 *            The list of CartesianPositionCoordinates.
	 * @return The CartesianPositionCoordinates. Returns (0,0,0) if the list is
	 *         empty.
	 */
	public static CartesianPositionCoordinates getMaximumPosition(CartesianAxis axis, List<CartesianPositionCoordinates> points)
	{
		return getMaximumPosition(axis, points, null);
	}

	/**
	 * Returns the CartesianPositionCoordinates from a list that has the maximum
	 * coordinate along a specified axis.
	 * 
	 * @param axis
	 *            The specified axis.
	 * @param points
	 *            The list of CartesianPositionCoordinates.
	 * @param monitor
	 *            Progress monitor to provide feedback on the operation. Can be
	 *            null.
	 * @return The CartesianPositionCoordinates. Returns (0,0,0) if the list is
	 *         empty.
	 */
	public static CartesianPositionCoordinates getMaximumPosition(CartesianAxis axis, List<CartesianPositionCoordinates> points, final IProgressMonitor monitor)
	{
		// Gets a valid IProgressMonitor.
		IProgressMonitor internalMonitor = monitor;
		if (internalMonitor == null)
			internalMonitor = new NullProgressMonitor();

		CartesianPositionCoordinates coord = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 0, 0);
		double max = Double.NEGATIVE_INFINITY;

		try
		{
			internalMonitor.beginTask(Geometry3DUtilities.class.getSimpleName() + ".getMaximumPosition", points.size());

			Iterator<CartesianPositionCoordinates> it = points.iterator();
			while (it.hasNext())
			{
				CartesianPositionCoordinates p = it.next();

				double value = 0.0;
				switch (axis.getValue())
				{
				case CartesianAxis.X_VALUE:
					value = p.getX();
					break;
				case CartesianAxis.Y_VALUE:
					value = p.getY();
					break;
				case CartesianAxis.Z_VALUE:
					value = p.getZ();
					break;
				}

				if (value > max)
				{
					max = value;
					coord = p;
				}

				internalMonitor.worked(1);
			}
		} finally
		{
			internalMonitor.done();
		}

		return coord;
	}

	/**
	 * Returns the CartesianPositionCoordinates from a list that has the maximum
	 * coordinate along a specified axis.
	 * 
	 * @param axis
	 *            The specified axis.
	 * @param points
	 *            The list of CartesianPositionCoordinates.
	 * @return The CartesianPositionCoordinates. Returns (0,0,0) if the list is
	 *         empty.
	 */
	public static CartesianPositionCoordinates getMinimumPosition(CartesianAxis axis, List<CartesianPositionCoordinates> points)
	{
		return getMinimumPosition(axis, points, null);
	}

	/**
	 * Returns the CartesianPositionCoordinates from a list that has the maximum
	 * coordinate along a specified axis.
	 * 
	 * @param axis
	 *            The specified axis.
	 * @param points
	 *            The list of CartesianPositionCoordinates.
	 * @param monitor
	 *            Progress monitor to provide feedback on the operation. Can be
	 *            null.
	 * @return The CartesianPositionCoordinates. Returns (0,0,0) if the list is
	 *         empty.
	 */
	public static CartesianPositionCoordinates getMinimumPosition(CartesianAxis axis, List<CartesianPositionCoordinates> points, final IProgressMonitor monitor)
	{
		// Gets a valid IProgressMonitor.
		IProgressMonitor internalMonitor = monitor;
		if (internalMonitor == null)
			internalMonitor = new NullProgressMonitor();

		CartesianPositionCoordinates coord = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 0, 0);
		double min = Double.POSITIVE_INFINITY;

		try
		{
			internalMonitor.beginTask(Geometry3DUtilities.class.getSimpleName() + ".getMinimumPosition", points.size());

			Iterator<CartesianPositionCoordinates> it = points.iterator();
			while (it.hasNext())
			{
				CartesianPositionCoordinates p = it.next();

				double value = 0.0;
				switch (axis.getValue())
				{
				case CartesianAxis.X_VALUE:
					value = p.getX();
					break;
				case CartesianAxis.Y_VALUE:
					value = p.getY();
					break;
				case CartesianAxis.Z_VALUE:
					value = p.getZ();
					break;
				}

				if (value < min)
				{
					min = value;
					coord = p;
				}

				internalMonitor.worked(1);
			}
		} finally
		{
			internalMonitor.done();
		}
		return coord;
	}

	/**
	 * Returns the angle of the normal of a polygon defined by a list of
	 * CartesianPositionCoordinates with respect to a specified axis.
	 * 
	 * @param axis
	 *            The specified axis.
	 * @param vertices
	 *            The list of of CartesianPositionCoordinates defining the
	 *            polygon.
	 * @return The angle, between 0 and PI/2. Zero if points contains less than
	 *         3 points.
	 */
	public static double getAngle(CartesianAxis axis, List<CartesianPositionCoordinates> vertices)
	{
		double slope = 0.0;

		if (vertices.size() > 2)
		{
			// Vector used to represent the axis.
			Vector3d axisVector = null;

			switch (axis.getValue())
			{
			case CartesianAxis.X_VALUE:
				axisVector = new Vector3d(1, 0, 0);
				break;
			case CartesianAxis.Y_VALUE:
				axisVector = new Vector3d(0, 1, 0);
				break;
			case CartesianAxis.Z_VALUE:
				axisVector = new Vector3d(0, 0, 1);
				break;
			}

			Vector3d normal = getPolygonNormal(vertices);
			slope = normal.angle(axisVector);

			if (slope > Math.PI / 2)
			{
				slope = slope - Math.PI / 2;
			}
		}

		return slope;
	}

	/**
	 * Returns the angle between a vector (specified by two points) and a
	 * specified cartesian plane.
	 * 
	 * @param plane
	 *            The cartesian plane.
	 * @param v1
	 *            The starts point of the vector.
	 * @param v2
	 *            The end point of the vector.
	 * @return The angle, between -PI/2 and PI/2. Zero if the vector is
	 *         zero-length.
	 */
	public static double getAngle(CartesianPlane plane, CartesianPositionCoordinates v1, CartesianPositionCoordinates v2)
	{
		double angle = 0.0;
		if (getDistance(v1, v2) != 0.0)
		{
			Vector3d axisVector = null;
			switch (plane.getValue())
			{
			case CartesianPlane.XY_VALUE:
				axisVector = new Vector3d(0, 0, 1);
				break;
			case CartesianPlane.XZ_VALUE:
				axisVector = new Vector3d(0, 1, 0);
				break;
			case CartesianPlane.YZ_VALUE:
				axisVector = new Vector3d(1, 0, 0);
				break;
			}

			Vector3d v = new Vector3d(v2.getX() - v1.getX(), v2.getY() - v1.getY(), v2.getZ() - v1.getZ());

			angle = Math.PI / 2 - v.angle(axisVector);
		}
		return angle;
	}

	/**
	 * Returns the list of CartesianPositionCoordinates that are within a
	 * specified radius of a center point.
	 * 
	 * @param centerPoint
	 *            The center point.
	 * @param radius
	 *            The radius.
	 * @param points
	 *            The list of points.
	 * @return The list of CartesianPositionCoordinates that at a distance equal
	 *         or smaller than the specified radius.
	 */
	public static List<CartesianPositionCoordinates> getCartesianCoordinatesWithinRadius(CartesianPositionCoordinates centerPoint, double radius, List<CartesianPositionCoordinates> points)
	{
		List<CartesianPositionCoordinates> pointsWithinRadius = new ArrayList<CartesianPositionCoordinates>();

		if (points.size() > 0)
		{
			// First creates a sorted set of the point by distance to the center
			// point.
			SortedSet<CartesianPositionCoordinates> sortedPoints = sortCartesianPositionCoordinatesByDistance(centerPoint, points);

			// Finds where a point exactly at r from the center would be
			// inserted.
			CartesianPositionCoordinates pointOnSurface = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(centerPoint.getX() + radius, centerPoint.getY(), centerPoint.getZ());
			pointsWithinRadius.addAll(sortedPoints.headSet(pointOnSurface));

			// If pointOnSurface is already in the list of point, we need to add
			// it since the headSet(pointOnSurface) excludes pointOnSurface.
			if (sortedPoints.contains(pointOnSurface))
			{
				pointsWithinRadius.add(sortedPoints.tailSet(pointOnSurface).first());
			}
		}

		return pointsWithinRadius;
	}

	/**
	 * Returns all the polygons that are at least partially within a specified radius from the center
	 * of a specified polygon.
	 * @param <T>
	 * @param centerPolygon The specified polygon.
	 * @param radius The radius.
	 * @param mesh The mesh to search.
	 * @return The list of polygons, including centerPolygon (if radius > 0).
	 */
	public static <T extends CartesianPolygon> Set<T> getCartesianPolygonsPartiallyWithinRadius(T centerPolygon, double radius, Mesh<CartesianPositionCoordinates,T> mesh)
	{
		Set<T> polys = new HashSet<T>();
		
		// Include center polygon if the radius is non-zero.
		if(radius > 0)
		{
			polys.add(centerPolygon);
		}
		
		List<T> neighbours = mesh.getPolygonNeighbours(centerPolygon);
		recursiveGetCartesianPolygonsPartiallyWithinRadius(polys, centerPolygon.getCentroid(), radius, mesh, neighbours);		
				
		return polys;
	}
	
	private static <T extends CartesianPolygon> void recursiveGetCartesianPolygonsPartiallyWithinRadius(Set<T> polygonsFound, CartesianPositionCoordinates center, double radius, Mesh<CartesianPositionCoordinates,T> mesh, List<T> polygons)
	{
		// Checks all of the polygon in the list.		
		for(int i = 0; i < polygons.size(); i++)
		{
			T polygon = polygons.get(i);
			if(!polygonsFound.contains(polygon) && isPolygonPartiallyWithinRadius(center, radius, polygon))
			{				
				polygonsFound.add(polygon);				
				List<T> neighbours = mesh.getPolygonNeighbours(polygon);				
				recursiveGetCartesianPolygonsPartiallyWithinRadius(polygonsFound, center, radius, mesh, neighbours);
			}
		}		
	}
	
	public static <T extends CartesianPolygon> boolean isPolygonPartiallyWithinRadius(CartesianPositionCoordinates centerPoint, double radius, T polygon)	
	{
		// First check if at least one of the polygon vertex falls within the specified radius.
		// This test is done first as it is simpler to perform.
		Point3d center = centerPoint.asPoint3d();		
		for(int i=0; i < polygon.getVertices().size(); i++)
		{
			if(polygon.getVertices().get(i).asPoint3d().distance(center) < radius)
			{
				return true;
			}			
		}
				
		// If the polygon contains at least one edge, checks for intersecting edges.
		if(polygon.getVertices().size() > 1)
		{			
			// Goes through each edge of the polygon and checks if its projection
			// is at a distance shorter than radius.
			for(int i = 0; i < polygon.getVertices().size(); i++)
			{												
				CartesianPositionCoordinates p1 = null;
				CartesianPositionCoordinates p2 = null;
				
				// Ensure we go all around the edges.
				if(i < (polygon.getVertices().size() -1))
				{
					p1 =  polygon.getVertices().get(i);
					p2 =  polygon.getVertices().get(i+1);
				}
				else
				{
					p1 = polygon.getVertices().get(i);
					p2 = polygon.getVertices().get(0);
				}
									
				// Checks if the line defined by the edge intersects the edge.
				Point3d pIntersection = getProjection(centerPoint, p1, p2).asPoint3d();
				if(pIntersection.distance(centerPoint.asPoint3d()) <= radius)
				{					
					Point3d p1Point =  p1.asPoint3d();
					Point3d p2Point =  p2.asPoint3d();
					
					double p1p2Distance = p1Point.distance(p2Point);
					double p1pIntersectionDistance = p1Point.distance(pIntersection);
					double p2pIntersectionDistance = p2Point.distance(pIntersection);
								
					// If the Edge line intersects with the radius, we need to check if the intersection point
					// is on the polygon edge itself (i.e. between p1 and p2).
					if((p1pIntersectionDistance <  p1p2Distance) && (p2pIntersectionDistance < p1p2Distance))
					{					
						return true;
					}
				}				
			}
		}
		return false;
	}
	
	/**
	 * Tells wheter or not all the vertex of a polygon falls within the specified 
	 * radius from a specified center point.
	 * @param <T>
	 * @param centerPoint The center point.
	 * @param radius The radius.
	 * @param polygon The polygon.
	 * @return True if all the vertex fall within the radius, false otherwise.
	 */
	public static <T extends CartesianPolygon> boolean isPolygonWithinRadius(CartesianPositionCoordinates centerPoint, double radius, T polygon)
	{
		boolean isInside = true;
		
		Point3d center = centerPoint.asPoint3d();
		int i =0;
		while(i < polygon.getVertices().size() && isInside)
		{
			CartesianPositionCoordinates vertex = polygon.getVertices().get(i);
			if(center.distance(vertex.asPoint3d()) > radius)
			{
				isInside = false;
			}
			else
			{
				i++;
			}
		}
		
		return isInside;
	}
	
	/**
	 * Creates a Map that map vertex to list of polygon that contain them.
	 * 
	 * @param mesh
	 *            The mesh to use.
	 * @param monitor
	 *            Progress monitor to provide feedback on the operation. Can be
	 *            null.
	 * @return The Map that map vertex to list of polygons.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T1 extends Coordinates, T2 extends Polygon> Map<T1, List<T2>> getVertexToPolygonMapping(List<T2> polygons, final IProgressMonitor monitor)
	{
		// Gets a valid IProgressMonitor.
		IProgressMonitor internalMonitor = monitor;
		if (internalMonitor == null)
			internalMonitor = new NullProgressMonitor();

		HashMap<T1, List<T2>> vertexToPolygonMap = new HashMap<T1, List<T2>>();

		try
		{
			// Goes through the list of polygons and adds the vertices in the map.
			internalMonitor.beginTask(Geometry3DUtilities.class.getSimpleName() + ".getVertexToPolygonMapping", polygons.size());

			Iterator<T2> polygonIt = polygons.iterator();
			while (polygonIt.hasNext())
			{
				T2 polygon = polygonIt.next();

				// Go through the list of vertices of the polygon.
				Iterator<T1> verticeIt = polygon.getVertices().iterator();
				
				while (verticeIt.hasNext())
				{										
					T1 vertex = verticeIt.next();

					// If no key exist yet for the specified vertex, creates it.
					if (!vertexToPolygonMap.containsKey(vertex))
					{
						vertexToPolygonMap.put(vertex, new ArrayList<T2>());
					}

					// Adds the polygon to the list if it is not already there.
					if (!vertexToPolygonMap.get(vertex).contains(polygon))
					{
						vertexToPolygonMap.get(vertex).add(polygon);
					}
				}
				internalMonitor.worked(1);
			}
		} 
		finally
		{
			internalMonitor.done();
		}

		return vertexToPolygonMap;
	}

	/**
	 * Returns the set of CartesianPositionCoordinates that are shared by a list
	 * of CartesianPolygons.
	 * 
	 * @param polygons
	 *            The list of polygons.
	 * @return The set of shared CartesianPositionCoordinates.
	 */
	public static Set<CartesianPositionCoordinates> getSharedVertices(List<CartesianPolygon> polygons)
	{		
		Set<CartesianPositionCoordinates> sharedVertices = new HashSet<CartesianPositionCoordinates>();

		TreeMap<CartesianPositionCoordinates, Integer> vertexToPolygonCount = new TreeMap<CartesianPositionCoordinates, Integer>(new CartesianPositionCoordinatesDistanceComparator());

		// Goes through the list of all the vertex from all polygons and builds
		// a map of vertex -> polygon count.
		Iterator<CartesianPolygon> polygonIt = polygons.iterator();
		while (polygonIt.hasNext())
		{
			CartesianPolygon polygon = polygonIt.next();
			Iterator<CartesianPositionCoordinates> verticesIt = polygon.getVertices().iterator();
			while (verticesIt.hasNext())
			{
				CartesianPositionCoordinates vertex = verticesIt.next();
				if (vertexToPolygonCount.get(vertex) == null)
				{
					vertexToPolygonCount.put(vertex, 0);
				}

				Integer count = new Integer(vertexToPolygonCount.get(vertex).intValue() + 1);
				vertexToPolygonCount.put(vertex, count);
			}
		}

		// Retains only the vertex that have a count equal to the number of
		// polygons specified.
		Iterator<CartesianPositionCoordinates> keyIt = vertexToPolygonCount.keySet().iterator();
		while (keyIt.hasNext())
		{
			CartesianPositionCoordinates vertex = keyIt.next();
			Integer count = vertexToPolygonCount.get(vertex);			
			
			if (count == polygons.size())
			{
				sharedVertices.add(vertex);
			}
		}

		return sharedVertices;
	}

	/**
	 * Returns the set of CartesianPositionCoordinates that are shared by two
	 * CartesianPolygons.
	 * 
	 * @param p1
	 *            First CartesianPolygon.
	 * @param p2
	 *            Second CartesianPolygon.
	 * @return The set of shared CartesianPositionCoordinates.
	 */
	public static Set<CartesianPositionCoordinates> getSharedVertices(CartesianPolygon p1, CartesianPolygon p2)
	{
		List<CartesianPolygon> polygons = new ArrayList<CartesianPolygon>();

		polygons.add(p1);
		polygons.add(p2);

		return getSharedVertices(polygons);
	}

	/**
	 * Returns a list of list of point duplicates found in a list of
	 * CartesianPositionCoordinates. For example, if the list of coordinates is
	 * (v1, v2, v3, v4, v5, v6, v7) where v1 = v3, v4 =v5 =v6, the result will
	 * be a list of the following list : (v1, v3), (v4,v5,v6).
	 * 
	 * @param coordinates
	 *            The list of CartesianPositionCoordinates.
	 * @return The list of list of duplicates.
	 * TODO : Faster implementation required.
	 */
	public static List<List<CartesianPositionCoordinates>> getDuplicateCartesianCoordinates(List<CartesianPositionCoordinates> coordinates)
	{
		List<List<CartesianPositionCoordinates>> duplicates = new ArrayList<List<CartesianPositionCoordinates>>();
		Map<CartesianPositionCoordinates, List<CartesianPositionCoordinates>> pointToEquivalent = new HashMap<CartesianPositionCoordinates, List<CartesianPositionCoordinates>>();

		// Goes through the list of vertices.
		Iterator<CartesianPositionCoordinates> pointsIt = coordinates.iterator();
		while (pointsIt.hasNext())
		{
			CartesianPositionCoordinates point = pointsIt.next();

			boolean duplicateDetected = false;
			int i = 0;
			CartesianPositionCoordinates key = null;
			
			// Looks to see if a equivalent point is already in the map as a key.
			while ((!duplicateDetected) && (i < pointToEquivalent.keySet().size()))
			{
				key = (CartesianPositionCoordinates) (pointToEquivalent.keySet().toArray()[i]);
				if (getDistance(point, key) == 0.0) 
				{
					duplicateDetected = true;
				}
				i++;
			}

			if (duplicateDetected)
			{
				// Point is a duplicate, add it the to equivalent.
				pointToEquivalent.get(key).add(point);
			} 
			else
			{
				// Point has no equivalent in the map, add it as a key.
				List<CartesianPositionCoordinates> list = new ArrayList<CartesianPositionCoordinates>();
				list.add(point);
				pointToEquivalent.put(point, list);
			}
		}

		// Creates the list of duplicates.
		Iterator<List<CartesianPositionCoordinates>> duplicateListIt = pointToEquivalent.values().iterator();
		while (duplicateListIt.hasNext())
		{
			List<CartesianPositionCoordinates> duplicatesList = duplicateListIt.next();			
			if (duplicatesList.size() > 1)
			{
				duplicates.add(duplicatesList);
			}
		}

		return duplicates;
	}


	/**
	 * Removes from a mesh vertices that are at the exact same position.
	 * Polygons vertex lists are also updated.
	 * 
	 * @param mesh
	 *            The mesh.
	 * @return A new mesh where CartesianPositionCoordinates duplicate have been
	 *         removed.
	 */
	public static CartesianCoordinatesMesh removeDuplicateVertex(final CartesianCoordinatesMesh mesh)
	{
		CartesianCoordinatesMesh newMesh = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianCoordinatesMesh(mesh);

		Map<CartesianPositionCoordinates, List<CartesianPolygon>> vertexToPolygonMap = Geometry3DUtilities.getVertexToPolygonMapping(newMesh.getPolygons(), null);
		
		// Gets a list of duplicate list.
		List<List<CartesianPositionCoordinates>> duplicatesVertex = getDuplicateCartesianCoordinates(newMesh.getPoints());		
		
		Iterator<List<CartesianPositionCoordinates>> itDuplicateLists = duplicatesVertex.iterator();
		while (itDuplicateLists.hasNext())
		{
			List<CartesianPositionCoordinates> duplicates = itDuplicateLists.next();

			// For each of the duplicate, keep only the first "incarnation".
			CartesianPositionCoordinates goodIncarnation = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(duplicates.get(0));
			newMesh.getPoints().add(goodIncarnation);

			// Updates all polygon reference to point to the good incarnation.
			Iterator<CartesianPositionCoordinates> duplicatesIt = duplicates.iterator();
			while (duplicatesIt.hasNext())
			{
				CartesianPositionCoordinates badPoint = duplicatesIt.next();

				// Gets the list of polygons that refer to the bad point.
				List<CartesianPolygon> polygons = vertexToPolygonMap.get(badPoint);

				if(polygons != null)
				{
					for (int i = 0; i < polygons.size(); i++)
					{
						// Remove the bad point, replace it with the good one.
						CartesianPolygon polygon = polygons.get(i);																		
						int indexBadPoint = polygon.getVertices().indexOf(badPoint);
						polygon.getVertices().add(indexBadPoint, goodIncarnation);
						polygon.getVertices().remove(badPoint);
						
						// Remove and add the polygon to force update of the mesh mapping of points->polygon.
						newMesh.getPolygons().remove(polygon);
						newMesh.getPolygons().add(polygon);
					}
				}				
			}

			// Delete the bad points
			Iterator<CartesianPositionCoordinates> badIt = duplicates.iterator();
			while (badIt.hasNext())
			{
				newMesh.getPoints().remove(badIt.next());
			}
		}

		return newMesh;
	}
	
	/**
	 * Returns the list of immediate neighbors polygons (i.e. polygon that share
	 * at least one vertex) for a specified polygon in a mesh.
	 * 
	 * @param polygon
	 *            The specified polygon.
	 * @param vertexToPolygonMap
	 *            The Map that map vertex to list of polygons.
	 * @return The list of polygon sharing at least a vertex with the specified
	 *         polygon.
	 */
	public static Set<CartesianPolygon> getPolygonVertexNeighbors(CartesianPolygon polygon, Map<CartesianPositionCoordinates, List<CartesianPolygon>> vertexToPolygonMap)
	{
		Set<CartesianPolygon> neighbours = new HashSet<CartesianPolygon>();

		// Explores the list of vertices of the polygon.
		Iterator<CartesianPositionCoordinates> verticeIt = polygon.getVertices().iterator();
		while (verticeIt.hasNext())
		{
			CartesianPositionCoordinates vertex = verticeIt.next();

			// Adds the polygon that share that vertex.
			neighbours.addAll(vertexToPolygonMap.get(vertex));
		}

		// Remove the specified polygon from the list
		neighbours.remove(polygon);

		return neighbours;
	}

	/**
	 * Returns the list of polygons connected directly or indirectly by at least
	 * on vertex to specified polygon.
	 * 
	 * @param polygon
	 *            The specified polygon.
	 * @param vertexToPolygonMap
	 *            The Map that maps vertex to list of polygons.
	 * @return The list of polygon connected directly or indirectly by at least
	 *         on vertex to the specified polygon.
	 */
	public static Set<CartesianPolygon> getPolygonVertexExtendedNeighbors(CartesianPolygon polygon, Map<CartesianPositionCoordinates, List<CartesianPolygon>> vertexToPolygonMap)
	{
		Set<CartesianPolygon> neighbours = new HashSet<CartesianPolygon>();
		Set<CartesianPolygon> processedPolygons = new HashSet<CartesianPolygon>();

		neighbours = recursiveGetPolygonVertexExtendedNeighbors(processedPolygons, polygon, vertexToPolygonMap);
		neighbours.remove(polygon);

		return neighbours;
	}

	private static Set<CartesianPolygon> recursiveGetPolygonVertexExtendedNeighbors(Set<CartesianPolygon> processedPolygons, CartesianPolygon polygon, Map<CartesianPositionCoordinates, List<CartesianPolygon>> vertexToPolygonMap)
	{
		Set<CartesianPolygon> neighbours = new HashSet<CartesianPolygon>();

		// Gets the polygon's vertex neighbors.
		Set<CartesianPolygon> immediateNeighbors = getPolygonVertexNeighbors(polygon, vertexToPolygonMap);
		neighbours.addAll(immediateNeighbors);

		// Adds the specified polygon to the list of processed polygon.
		processedPolygons.add(polygon);

		Iterator<CartesianPolygon> it = immediateNeighbors.iterator();
		while (it.hasNext())
		{
			CartesianPolygon p = it.next();
			if (!processedPolygons.contains(p))
			{
				processedPolygons.add(p);
				neighbours.addAll(recursiveGetPolygonVertexExtendedNeighbors(processedPolygons, p, vertexToPolygonMap));
			}
		}

		return neighbours;
	}

	/**
	 * Returns the list of immediate neighbors polygons (i.e. polygon that share
	 * at least an edge) for a specified polygon.
	 * 
	 * @param polygon
	 *            The specified polygon.
	 * @param vertexToPolygonMap
	 *            The Map that maps vertex to list of polygons.
	 * @return The list of polygon sharing at least an edge with the specified
	 *         polygon.
	 */
	public static Set<CartesianPolygon> getPolygonEdgeNeighbors(CartesianPolygon polygon, Map<CartesianPositionCoordinates, List<CartesianPolygon>> vertexToPolygonMap)
	{
		Set<CartesianPolygon> neighbours = new HashSet<CartesianPolygon>();

		// Explores the list of vertices of the polygon.
		Iterator<CartesianPositionCoordinates> verticeIt = polygon.getVertices().iterator();
		while (verticeIt.hasNext())
		{
			CartesianPositionCoordinates vertex = verticeIt.next();

			// Gets the list of polygon that share that vertex.
			List<CartesianPolygon> potentialNeighbors = vertexToPolygonMap.get(vertex);

			// Check each of the potentialNeighbors to see if they contain two
			// or more vertex of the specified polygon.
			Iterator<CartesianPolygon> polygonIt = potentialNeighbors.iterator();
			while (polygonIt.hasNext())
			{
				CartesianPolygon potentialNeighbor = polygonIt.next();

				// Verifies the potential neighbor is not the polygon itself.
				if (potentialNeighbor != polygon)
				{
					// Verifies if polygons shared more than one vertex.
					if (getSharedVertices(polygon, potentialNeighbor).size() > 1)
					{
						neighbours.add(potentialNeighbor);
					}
				}
			}
		}

		return neighbours;
	}

	/**
	 * Returns the list of polygons connected directly or indirectly by at least
	 * one edge to specified polygon.
	 * 
	 * @param polygon
	 *            The specified polygon.
	 * @param vertexToPolygonMap
	 *            The Map that maps vertex to list of polygons.
	 * @return The list of polygon connected directly or indirectly by at least
	 *         on edge to the specified polygon.
	 */
	public static Set<CartesianPolygon> getPolygonEdgeExtendedNeighbors(CartesianPolygon polygon, Map<CartesianPositionCoordinates, List<CartesianPolygon>> vertexToPolygonMap)
	{
		Set<CartesianPolygon> neighbours = new HashSet<CartesianPolygon>();
		Set<CartesianPolygon> processedPolygons = new HashSet<CartesianPolygon>();

		neighbours = recursiveGetPolygonEdgeExtendedNeighbors(processedPolygons, polygon, vertexToPolygonMap);
		neighbours.remove(polygon);

		return neighbours;
	}

	private static Set<CartesianPolygon> recursiveGetPolygonEdgeExtendedNeighbors(Set<CartesianPolygon> processedPolygons, CartesianPolygon polygon, Map<CartesianPositionCoordinates, List<CartesianPolygon>> vertexToPolygonMap)
	{
		Set<CartesianPolygon> neighbours = new HashSet<CartesianPolygon>();

		// Gets the polygon's edge neighbors.
		Set<CartesianPolygon> immediateNeighbors = getPolygonEdgeNeighbors(polygon, vertexToPolygonMap);
		neighbours.addAll(immediateNeighbors);

		// Adds the specified polygon to the list of processed polygon.
		processedPolygons.add(polygon);

		Iterator<CartesianPolygon> it = immediateNeighbors.iterator();
		while (it.hasNext())
		{
			CartesianPolygon p = it.next();
			if (!processedPolygons.contains(p))
			{
				processedPolygons.add(p);
				neighbours.addAll(recursiveGetPolygonEdgeExtendedNeighbors(processedPolygons, p, vertexToPolygonMap));
			}
		}

		return neighbours;
	}

	/**
	 * Returns the list of groups of polygons connected by at least one vertex.
	 * 
	 * @param polygons
	 *            List of polygons.
	 * @param monitor
	 *            Progress monitor to provide feedback on the operation. Can be
	 *            null.
	 * @return The list of group of polygons.
	 */
	public static Set<Set<CartesianPolygon>> getCartesianPolygonGroupConnectedByVertex(List<CartesianPolygon> polygons, IProgressMonitor monitor)
	{
		// Gets a valid IProgressMonitor.
		IProgressMonitor internalMonitor = monitor;
		if (internalMonitor == null)
			internalMonitor = new NullProgressMonitor();

		Set<Set<CartesianPolygon>> groups = new HashSet<Set<CartesianPolygon>>();

		try
		{
			internalMonitor.beginTask(Geometry3DUtilities.class.getSimpleName() + ".getCartesianPolygonGroupConnectedByVertex", polygons.size());
			Map<CartesianPositionCoordinates, List<CartesianPolygon>> map = getVertexToPolygonMapping(polygons, monitor);

			Iterator<CartesianPolygon> polygonIt = polygons.iterator();
			while (polygonIt.hasNext())
			{
				CartesianPolygon polygon = polygonIt.next();

				// If the polygon is not already part of a group.
				if (getPolygonGroupForPolygon(groups, polygon) == null)
				{
					// Creates a new group.
					Set<CartesianPolygon> group = new HashSet<CartesianPolygon>();

					// Adds the polygon's vertex Neighbors
					group.addAll(getPolygonVertexExtendedNeighbors(polygon, map));

					// Adds the polygon itself to the group.
					group.add(polygon);

					// Adds the group to the set of groups.
					groups.add(group);
				}

				internalMonitor.worked(1);
			}
		} finally
		{
			internalMonitor.done();
		}

		return groups;
	}

	/**
	 * Returns the list of groups of polygon connected by at least one edge.
	 * 
	 * @param polygons
	 *            List of polygons.
	 * @param monitor
	 *            Progress monitor to provide feedback on the operation. Can be
	 *            null.
	 * @return The list of group of polygons.
	 */
	public static Set<Set<CartesianPolygon>> getCartesianPolygonGroupsConnectedByEdge(List<CartesianPolygon> polygons, IProgressMonitor monitor)
	{
		// Gets a valid IProgressMonitor.
		IProgressMonitor internalMonitor = monitor;
		if (internalMonitor == null)
			internalMonitor = new NullProgressMonitor();

		Set<Set<CartesianPolygon>> groups = new HashSet<Set<CartesianPolygon>>();

		try
		{
			internalMonitor.beginTask(Geometry3DUtilities.class.getSimpleName() + ".getCartesianPolygonGroupConnectedByEdge", polygons.size());
			Map<CartesianPositionCoordinates, List<CartesianPolygon>> map = getVertexToPolygonMapping(polygons, monitor);

			Iterator<CartesianPolygon> polygonIt = polygons.iterator();
			while (polygonIt.hasNext())
			{
				CartesianPolygon polygon = polygonIt.next();

				// If the polygon is not already part of a group.
				if (getPolygonGroupForPolygon(groups, polygon) == null)
				{
					// Creates a new group.
					Set<CartesianPolygon> group = new HashSet<CartesianPolygon>();

					// Adds the polygon's edge Neighbors
					group.addAll(getPolygonEdgeExtendedNeighbors(polygon, map));

					// Adds the polygon itself to the group.
					group.add(polygon);

					// Adds the group to the set of groups.
					groups.add(group);
				}

				internalMonitor.worked(1);
			}
		} finally
		{
			internalMonitor.done();
		}

		return groups;
	}

	/**
	 * Returns the group in which a specified polygon is found.
	 * 
	 * @param groups
	 *            The list of polygon group.
	 * @param polygon
	 *            The specified polygon.
	 * @return The group containing the polygon, null if none is found.
	 */
	public static Set<CartesianPolygon> getPolygonGroupForPolygon(Set<Set<CartesianPolygon>> groups, CartesianPolygon polygon)
	{
		Set<CartesianPolygon> group = null;

		Iterator<Set<CartesianPolygon>> groupIt = groups.iterator();
		while (groupIt.hasNext() && (group == null))
		{
			Set<CartesianPolygon> g = groupIt.next();
			if (g.contains(polygon))
			{
				group = g;
			}
		}

		return group;
	}

	/**
	 * Converts a list of CartesianPositionCoordinates into a list of Point3d.
	 * 
	 * @param points
	 *            list of CartesianPositionCoordinates.
	 * @return The list of Point3d.
	 */
	public static List<Point3d> getPoint3dList(List<CartesianPositionCoordinates> points)
	{
		List<Point3d> pointList = new ArrayList<Point3d>();

		Iterator<CartesianPositionCoordinates> it = points.iterator();
		while (it.hasNext())
		{
			CartesianPositionCoordinates p = it.next();
			Point3d point = new Point3d(p.getX(), p.getY(), p.getZ());
			pointList.add(point);
		}

		return pointList;
	}

	/**
	 * Converts a list of Point3d into a list of CartesianPositionCoordinates.
	 * 
	 * @param points
	 *            list of Point3d.
	 * @return The list of CartesianPositionCoordinates.
	 */
	public static List<CartesianPositionCoordinates> getCartesianPositionCoordinates(List<Point3d> points)
	{
		List<CartesianPositionCoordinates> pointList = new ArrayList<CartesianPositionCoordinates>();

		Iterator<Point3d> it = points.iterator();
		while (it.hasNext())
		{
			Point3d p = it.next();
			CartesianPositionCoordinates point = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(p.x, p.y, p.z);
			pointList.add(point);
		}

		return pointList;
	}

    /**
     * Returns a transformed CartesianPolygon Poly(b) = T(ba) * Poly(a).
     * @param transformationMatrix The transformation matrix to be applied.
     * @param polygon The CartesianPolygon to be transformed. 
     * @return The transformed CartesianPolygon.
     */
    public static CartesianPolygon createTransformedPolygon(Matrix4d transformationMatrix, CartesianPolygon polygon)
    {
    	/* Create an empty polygon */
    	CartesianPolygon transformedData = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianPolygon();
    	
    	/* Create a copy of the CartesianPositionCoordinates as a Point3d list */
    	List<Point3d> points = getPoint3dList(polygon.getVertices());
    	
    	/* Apply the transformation on the Point3d list */
    	applyTransformation(transformationMatrix, points);
    	
    	/* Create a List of CartesianPositionCoordinates using the transformed points */
    	transformedData.getVertices().addAll(getCartesianPositionCoordinates(points));
    	
    	return transformedData;
    }

    /**
     * Returns a transformed CartesianCoordinatesMesh Mesh(b) = T(ba) * Mesh(a).
     * @param transformationMatrix The transformation matrix to be applied.
     * @param mesh The CartesianCoordinatesMesh to be transformed. 
     * @return The transformed CartesianCoordinatesMesh.
     */
    public static CartesianCoordinatesMesh createTransformedCartesianCoordinateMesh(Matrix4d transformationMatrix, CartesianCoordinatesMesh mesh)
    {
    	/* Create a copy of the mesh */
    	CartesianCoordinatesMesh transformedMesh = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianCoordinatesMesh(mesh);
    	
    	/* Create a copy of the CartesianPositionCoordinates as a Point3d list */
    	List<Point3d> points = getPoint3dList(mesh.getPoints());
    	
    	/* Apply the transformation on the Point3d list */
    	applyTransformation(transformationMatrix, points);
    	
    	/* Modify the CartesianPositionCoordinates of the copied mesh to reflect the transformation */
    	CartesianPositionCoordinates pos = null;
    	Point3d point = null;
    	int NP = points.size();
    	for (int i = 0; i<NP; i++)
    	{
    		pos =  transformedMesh.getPoints().get(i);
    		point = points.get(i);
    		pos.setX(point.x);
    		pos.setY(point.y);
    		pos.setZ(point.z);
    	}

    	return transformedMesh;
    }
    
    public static CartesianCoordinatesSet createTransformedCartesianCoordinatesSet(Matrix4d transformationMatrix, CartesianCoordinatesSet cartesianCoordinatesSet)
    {
    	CartesianCoordinatesSet result = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSet();
    	
    	// Creates a list of point on which the transformation will be applied.
		List<Point3d> points = Geometry3DUtilities.getPoint3dList(cartesianCoordinatesSet.getPoints());
		
		// Applies the transformation.
		Geometry3DUtilities.applyTransformation(transformationMatrix, points);
		
		// Filld the result with the transformed points.
		for(Point3d point : points)
		{
			CartesianPositionCoordinates coord = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(point.x, point.y, point.z);
			result.getPoints().add(coord);
		}			
		
		return result;
    }
    
    /**
     * Returns a transformed CartesianCoordinatesMesh Mesh(b) = T(ba) * Mesh(a).
     * @param transformationMatrix The transformation matrix to be applied.
     * @param mesh The CartesianCoordinatesMesh to be transformed. 
     * @return The transformed CartesianCoordinatesMesh.
     */
    public static CartesianTriangularMesh createTransformedCartesianTriangularMesh(Matrix4d transformationMatrix, CartesianTriangularMesh mesh)
    {
    	/* Create a copy of the mesh */
    	CartesianTriangularMesh transformedMesh = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianTriangularMesh(mesh);
    	
    	/* Create a copy of the CartesianPositionCoordinates as a Point3d list */
    	List<Point3d> points = getPoint3dList(mesh.getPoints());
    	
    	/* Apply the transformation on the Point3d list */
    	applyTransformation(transformationMatrix, points);
    	
    	/* Modify the CartesianPositionCoordinates of the copied mesh to reflect the transformation */
    	CartesianPositionCoordinates pos = null;
    	Point3d point = null;
    	int NP = points.size();
    	for (int i = 0; i<NP; i++)
    	{
    		pos =  transformedMesh.getPoints().get(i);
    		point = points.get(i);
    		pos.setX(point.x);
    		pos.setY(point.y);
    		pos.setZ(point.z);
    	}

    	return transformedMesh;
    }
    
    /**
     * Returns a transformed CartesianPositionCoordinates Coord(b) = T(ba) * Coord(a).
     * @param transformationMatrix The transformation matrix to be applied.
     * @param coord The CartesianPositionCoordinates to be transformed.
     * @return The transformed CartesianPositionCoordinates. 
     */
    public static CartesianPositionCoordinates createTransformedCartesianPositionCoordinates(Matrix4d transformationMatrix, CartesianPositionCoordinates coord)
    {	
    	Point3d point = new Point3d(coord.getX(), coord.getY(), coord.getZ()); 
    	transformationMatrix.transform(point);
    	return ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(point.x, point.y, point.z);
    }
    
    /**
     * Modify the Point3d listed elements by applying to them the provided transformation such that Point(b) = T(ba) * Point(a). 
     * @param transformationMatrix The transformation matrix to be applied.
     * @param points The list of Point3d to be modified by the transformation. 
     */
    public static void applyTransformation(Matrix4d transformationMatrix, List<Point3d> points)
    {    	
    	Iterator<Point3d> iterator = points.iterator();
    	
    	Point3d point=null;
    	while(iterator.hasNext()){
    		point = iterator.next();
        	transformationMatrix.transform(point);
    	}
    
    	return;
    }	
	
    /**
     * Creates a polygon (a triangle) that lays on the specified cartesian plane.
     * @param plane The cartesian plane.
     * @return The polygon.
     */
    public static CartesianPolygon createNormalizedPolygonOfPlane(CartesianPlane plane)
    {
		CartesianAxis axis = Geometry3DUtilities.getPerpendicularAxis(plane);
		
		CartesianPositionCoordinates vO = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 0, 0);
		CartesianPositionCoordinates vX = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1, 0, 0);
		CartesianPositionCoordinates vY = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 1, 0);
		CartesianPositionCoordinates vZ = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 0, 1);
		
		CartesianPolygon polygon = null;
		
		switch (axis) 
		{
			case X: polygon=ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPolygon(vO, vY, vZ); break;
			case Y: polygon=ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPolygon(vO, vZ, vX); break;	
			case Z: polygon=ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPolygon(vO, vX, vY); break;
			default: break;
		}
		
		return polygon; 
    }
     
    /**
     * Return the extent of a list of points.
     * @param points The list of points
     * @return The CartesianCoordinatesSetExtent of the list of points.
     */
    public static CartesianCoordinatesSetExtent getCartesianCoordinatesSetExtent(List<CartesianPositionCoordinates> points)
    {
    	double xMin = Double.POSITIVE_INFINITY;
		double xMax = Double.NEGATIVE_INFINITY;
		double yMin = Double.POSITIVE_INFINITY;
		double yMax = Double.NEGATIVE_INFINITY;
		double zMin = Double.POSITIVE_INFINITY;
		double zMax = Double.NEGATIVE_INFINITY;
		
		for(CartesianPositionCoordinates p : points)
		{
			if(p.getX() < xMin) xMin = p.getX();
			if(p.getX() > xMax) xMax = p.getX();
			
			if(p.getY() < yMin) yMin = p.getY();
			if(p.getY() > yMax) yMax = p.getY();

			if(p.getZ() < zMin) zMin = p.getZ();
			if(p.getZ() > zMax) zMax = p.getZ();
		}
		
		CartesianCoordinatesSetExtent extent = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSetExtent();
		extent.setXMin(xMin);
		extent.setXMax(xMax);
		extent.setYMin(yMin);
		extent.setYMax(yMax);
		extent.setZMin(zMin);
		extent.setZMax(zMax);
		
		return extent;
    }
    
    /**
     * Return an area weighted average normal of a list of triangles.
     * @param triangles The list of triangles.
     * @return The average normal (normalized).
     */
    public static Vector3d getAreaWeightedAverageNormal(List<CartesianTriangle> triangles)
    {
    	Vector3d normal = new Vector3d();
    	for(CartesianTriangle triangle : triangles)
		{
    		Vector3d triangleEffectiveNormal = triangle.getNormal();
    		triangleEffectiveNormal.scale(triangle.getSurface());
    		normal.add(triangleEffectiveNormal);
		}
    	normal.normalize();
    	
    	return normal;
    }
    
	/**
	 * Creates a map that associates a point to a point identifier for the list
	 * of points contained in a CoordinatesSet.
	 * 
	 * @param coordinateSet
	 *            The coordinates set.
	 * @return The map.
	 */	
	public static <T extends Coordinates> Map<T, Integer> createPointIdMap(final CoordinatesSet<T> coordinateSet)
	{
		Map<T, Integer> map = new HashMap<T, Integer>();

		for (int i = 0; i < coordinateSet.getPoints().size(); i++)
		{
			map.put(coordinateSet.getPoints().get(i), new Integer(i));
		}

		return map;
	}

	public static class CartesianPositionCoordinatesDistanceComparator implements Comparator<CartesianPositionCoordinates>
	{
		private CartesianPositionCoordinates centerPoint = null;
		private CoordinatesComparator coordinatesComparator = new CoordinatesComparator();

		public CartesianPositionCoordinatesDistanceComparator()
		{
			this(ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianPositionCoordinates());
		}
		
		public CartesianPositionCoordinatesDistanceComparator(CartesianPositionCoordinates centerPoint)
		{
			this.centerPoint = centerPoint;
		}

		/**
		 * Compares two CartesianPositionCoordinates based on smallest distance
		 * to a center point.
		 */
		public int compare(CartesianPositionCoordinates o1, CartesianPositionCoordinates o2)
		{
			double d1 = getDistance(o1, centerPoint);
			double d2 = getDistance(o2, centerPoint);

			if (d1 > d2)
			{
				return 1;
			} else if (d1 < d2)
			{
				return -1;
			} else
			{
				// If distance is the same, return order by coordinates.
				return coordinatesComparator.compare(o1, o2);
			}
		}
	}

	public static class CartesianPolygonCoordinatesDistanceComparator implements Comparator<CartesianPolygon>
	{
		private CartesianPositionCoordinates centerPoint = null;
		private CoordinatesComparator coordinatesComparator = new CoordinatesComparator();

		public CartesianPolygonCoordinatesDistanceComparator(CartesianPositionCoordinates centerPoint)
		{
			this.centerPoint = centerPoint;
		}

		public int compare(CartesianPolygon o1, CartesianPolygon o2)
		{
			CartesianPositionCoordinates c1 = getCentroid(o1.getVertices());
			double d1 = getDistance(c1, centerPoint);

			CartesianPositionCoordinates c2 = getCentroid(o2.getVertices());
			double d2 = getDistance(c2, centerPoint);

			if (d1 > d2)
			{
				return 1;
			} else if (d1 < d2)
			{
				return -1;
			} else
			{
				// If distance is the same, return order by coordinates.
				return coordinatesComparator.compare(c1, c2);
			}
		}
	}

	/**
	 * Comparator that compares two position based on their x, than y, than z
	 * coordinates.
	 * 
	 * @author pallard
	 * 
	 */
	private static class CoordinatesComparator implements Comparator<CartesianPositionCoordinates>
	{
		public int compare(CartesianPositionCoordinates o1, CartesianPositionCoordinates o2)
		{
			double deltax = o1.getX() - o2.getX();
			if (deltax > 0)
			{
				return 1;
			} else if (deltax < 0)
			{
				return -1;
			} else
			{
				double deltay = o1.getY() - o2.getY();
				if (deltay > 0)
				{
					return 1;
				} else if (deltay < 0)
				{
					return -1;
				} else
				{
					double deltaz = o1.getZ() - o2.getZ();
					if (deltaz > 0)
					{
						return 1;
					} else if (deltaz < 0)
					{
						return -1;
					} else
					{
						return 0;
					}
				}
			}
		}
	}
} // Geometry3DUtilities
