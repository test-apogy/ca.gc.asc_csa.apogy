package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph;
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
import java.util.Iterator;
import java.util.List;

import javax.vecmath.Vector2d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsFactory;
import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath;
import ca.gc.asc_csa.apogy.common.geometry.data.Mesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPlane;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Geometry3DUtilities;
import org.jgrapht.EdgeFactory;
import org.jgrapht.Graph;
import org.jgrapht.alg.DijkstraShortestPath;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

public class GraphUtilities
{	
	/**
	 * Create a SimpleDirectedWeightedGraph that represents the connectivity of a CartesianCoordinatesMesh.
	 * This method can be overiden to creates the graph differently.	 
	 * @return The SimpleDirectedWeightedGraph representing the polygon connectivity.	 
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
	public static SimpleDirectedWeightedGraph createGraph(Mesh cartesianMesh, EdgeFactory edgeFactory, IProgressMonitor monitor)
	{
		IProgressMonitor internalMonitor = monitor;
		if(internalMonitor == null) internalMonitor = new NullProgressMonitor();
		
		// Creates a instance of SimpleDirectedWeightedGraph with the getEdgeWeight method overloaded.
		SimpleDirectedWeightedGraph simpleDirectedWeightedGraph = new SimpleDirectedWeightedGraph(edgeFactory)
		{
			@Override
			public double getEdgeWeight(Object e) 
			{
				if(e instanceof MobilityEdge)
				{
					return ((MobilityEdge) e).getWeight();
				}
				
				return 1;
			}
		};			
		
		// Creates a vertex for each polygon in the mesh.
		internalMonitor.subTask("Creating <" + cartesianMesh.getPolygons().size() + "> Vertices...");
		Iterator <? extends CartesianPolygon> polygonIt = cartesianMesh.getPolygons().iterator();
		while(polygonIt.hasNext())
		{
			CartesianPolygon polygon = polygonIt.next();	
			
			if(polygon.getVertices().size() >= 3)
			{			
				simpleDirectedWeightedGraph.addVertex(polygon);
			}
			internalMonitor.worked(1);
		}					
		
		// Creates the polygon neighbours connectivity.
		internalMonitor.subTask("Creating Edges...");
		Iterator vertexIt = simpleDirectedWeightedGraph.vertexSet().iterator();	
		while(vertexIt.hasNext())
		{
			CartesianPolygon polygon = (CartesianPolygon) vertexIt.next();
									
			// Finds the list of edge neighbours of the current polygon.			
			List<CartesianPolygon> neighbours = cartesianMesh.getPolygonNeighbours(polygon);
			List<CartesianPolygon> edgeNeighbours = new ArrayList<CartesianPolygon>();
			for(CartesianPolygon  neighbour : neighbours)	
			{
				if(Geometry3DUtilities.getSharedVertices(polygon, neighbour).size() > 1)
				{
					edgeNeighbours.add(neighbour);
				}
			}
						
			// Creates the edges between the current polygon and its neighbours.
			Iterator <CartesianPolygon> neighborsIt = edgeNeighbours.iterator();
			while(neighborsIt.hasNext())
			{
				CartesianPolygon neighbor = neighborsIt.next();														
				simpleDirectedWeightedGraph.addEdge(polygon, neighbor);
			}
			internalMonitor.worked(1);			
		}	
		
		internalMonitor.done();
		
		return simpleDirectedWeightedGraph;
	}		
	
	/**
	 * Return the WayPointPath that represent a path passing through the centroid of each polygon in a list.
	 * @param polygons The list of polygon.
	 * @return The WayPointPath.
	 */
	public static WayPointPath getPathThroughPolygonsCentroid(List <CartesianPolygon> polygons)
	{
		WayPointPath path = ApogyAddonsGeometryPathsFactory.eINSTANCE.createWayPointPath();
		
		Iterator <CartesianPolygon> it = polygons.iterator();
		while(it.hasNext())
		{
			CartesianPolygon polygon = it.next();
			CartesianPositionCoordinates centroid = Geometry3DUtilities.getCentroid(polygon.getVertices());
			path.getPoints().add(centroid);
		}
		
		return path;
	}
	
	/**
	 * Returns a WayPointPath based on a list of CartesianPolygon found by a traverse algorithm together with the start and destination location. 
	 * The initial position and destination position are also included.
	 * A filter is applied to include in the path the minimum number of way points required to ensure that the path always threads on the polygons in the polygons path.
	 * @param cartesianPlane The plane on which to project the trajectory.
	 * @param start The start location. 
	 * @param destination Then destination location.
	 * @param polygons The list of polygons that represents the safe path.
	 * @param robotWidth The width of the robot.
	 * @return The WayPointPath.
	 */
	public static <T extends CartesianPolygon> WayPointPath getSimplifiedPathThroughPolygonsCentroid(final CartesianPlane cartesianPlane, final CartesianPositionCoordinates start, final CartesianPositionCoordinates destination, final List <T> polygons, final double robotWidth)
	{
		if(cartesianPlane != CartesianPlane.XY)
		{
			throw new UnsupportedOperationException("getSimplifiedPathThroughPolygonsCentroid only supported for XY plane !");
		}
		
		WayPointPath path = ApogyAddonsGeometryPathsFactory.eINSTANCE.createWayPointPath();
	
		// Always add the start of the path to the path.
		path.getPoints().add(ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(start));
				
		// Simplify only if there are enough polygons to work with.
		if(polygons.size() >= 2)
		{
			Iterator<T> it = polygons.iterator();
			T p0 = it.next();								
			T p1 = it.next();
			
			List<T> polygonsSubPath = new ArrayList<T>();
			polygonsSubPath.add(p0);
			polygonsSubPath.add(p1);
			
			// Initialize the segment start and end points.						
			CartesianPositionCoordinates segmentStart = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(start);
			CartesianPositionCoordinates segmentEnd = p1.getCentroid();				
				
			while(it.hasNext())
			{								
				// If we can go from the segmentStart to segmentEnd and remain on the polygon path.
				if(isReacheable(cartesianPlane, segmentStart, segmentEnd, polygonsSubPath))		
				{		
					// Adds P1 to the back end of the polygonsSubPath.
					polygonsSubPath.add(p1);
				}				
				else
				{
					// We cannot go from the segmentStart to segmentEnd and remain on the polygon path.
					// Thus the last safe point was the centre of p0, update the segment start to it.
					segmentStart = p0.getCentroid();
					
					// Adds this point to the trajectory.
					path.getPoints().add(segmentStart);	
					
					// Resets the polygonsSubPath.
					polygonsSubPath.clear();
					polygonsSubPath.add(p0);
				}
				
				// Move the polygon by one position.
				p0 = p1;
				p1 = it.next();	
				
				segmentEnd = p1.getCentroid();
			}	
		}
		
		// Always adds the destination of the path to the path.
		path.getPoints().add(ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(destination));
		
		return path;
	}
	
	/**
	 * Returns the intersection point between two lines.
	 * @param u1 First point defining the first line.
	 * @param u2 Second point defining the first line.
	 * @param v1 First point defining the second line.
	 * @param v2 Second point defining the second line.
	 * @return The intersection, null if lines are parallel or the same.
	 * @see http://www.ahristov.com/tutorial/geometry-games/intersection-lines.html
	 */
	public static Vector2d intersection(Vector2d u1, Vector2d u2, Vector2d v1, Vector2d v2) 
	{		
		double d = (u1.x-u2.x)*(v1.y-v2.y) - (u1.y-u2.y)*(v1.x-v2.x);
		
		if (d == 0.0) return null;
		
		double xi = ((v1.x-v2.x) * (u1.x * u2.y- u1.y * u2.x) -(u1.x-u2.x) * (v1.x * v2.y - v1.y * v2.x))/d;
		double yi = ((v1.y-v2.y) * (u1.x * u2.y -u1.y * u2.x) -(u1.y-u2.y) * (v1.x * v2.y - v1.y * v2.x))/d;
		
		return new Vector2d(xi,yi);
	}
		
	/**
	 * Test wether or not the straight line path going from segmentStart to segmentEnd
	 * threads on all polygons.
	 * @param <T>
	 * @param cartesianPlane The plane on which to project the trajectory.
	 * @param segmentStart The first point defining a straight line trajectory.
	 * @param segmentEnd The second point defining a straight line trajectory.
	 * @param polygons The list of polygons to thread onto.
	 * @return True if the line threads on all polygons, false otherwise.
	 */
	private static <T extends CartesianPolygon> boolean isReacheable(CartesianPlane cartesianPlane, CartesianPositionCoordinates segmentStart, CartesianPositionCoordinates segmentEnd, List<T> polygons)
	{
		return Geometry3DUtilities.isLineIntersectsAllPolygons(cartesianPlane, segmentStart, segmentEnd, polygons);
	}
	
	/**
	 * Find the list of MobilityEdges connecting the from and to polygon using DijkstraShortestPath algorithm.
	 * @param graph The graph on which to do the search. This graph needs to contain MobilityEdges.
	 * @param from The start polygon.
	 * @param to The destination polygon.
	 * @return The list of MobilityEdge making up the shortest path.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List <MobilityEdge> getDijkstraShortestPath(Graph graph, CartesianPolygon from, CartesianPolygon to)
	{
		List <MobilityEdge> edgeList = new ArrayList<MobilityEdge>();
		
		List temp = DijkstraShortestPath.findPathBetween(graph, from, to);
		
		Iterator it = temp.iterator();
		while(it.hasNext())
		{
			MobilityEdge edge = (MobilityEdge) it.next();
			edgeList.add(edge);
		}
		
		return edgeList;
	}
	
	/**
	 * Create the list of connected CartesianPolygon based on a list of MobilityEdges.
	 * @param edges The list of MobilityEdges.
	 * @return The list of CartesianPolygon.
	 */
	public static List <CartesianPolygon> getPolygonPath(List <MobilityEdge> edges)
	{
		List <CartesianPolygon> polygonPath = new ArrayList<CartesianPolygon>();
		
		if(edges.size() > 0)
		{					
			// Adds the from polygon of the first edge.
			polygonPath.add(edges.get(0).getFrom());
			
			// Goes through the list and adds the to polygon of each.
			Iterator <MobilityEdge> it = edges.iterator();
			while(it.hasNext())
			{
				MobilityEdge edge = it.next();
				polygonPath.add(edge.getTo());
			}
		}
		
		return polygonPath;
	}
	
	/**
	 * Returns the total cost (or weight) of a given list of Edges.
	 * @param edgeList List of Edges.
	 * @return The total cost.
	 */
	public static double getPathCost(List <MobilityEdge> edges)
	{
		double cost = 0.0;
		
		Iterator <MobilityEdge> it = edges.iterator();
		while(it.hasNext() && (cost != Double.POSITIVE_INFINITY))
		{
			cost += it.next().getWeight();
		}
		
		return cost;
	}
}
