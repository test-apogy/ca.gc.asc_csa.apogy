package ca.gc.asc_csa.apogy.addons.vehicle;
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
import java.util.List;
import java.util.Set;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangle;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import org.jgrapht.DirectedGraph;
import org.jgrapht.alg.ConnectivityInspector;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.traverse.BreadthFirstIterator;

public class ClosestNeighbourIteratorProvider 
{
	private CartesianTriangularMesh mesh = null;		
	private DirectedGraph<CartesianTriangle, DefaultEdge> graph = null;
	
	public ClosestNeighbourIteratorProvider(CartesianTriangularMesh mesh)
	{
		this.mesh = mesh;				
	}
	
	public BreadthFirstIterator<CartesianTriangle, DefaultEdge> createBreadthFirstIterator(CartesianTriangle startTriangle)
	{
		if(startTriangle != null)
		{
			return new BreadthFirstIterator<CartesianTriangle, DefaultEdge>(getGraph(), startTriangle);
		}
		else
		{
			return new BreadthFirstIterator<CartesianTriangle, DefaultEdge>(getGraph());
		}
	}		
	
	private DirectedGraph<CartesianTriangle, DefaultEdge> getGraph()
	{
		if(graph == null)
		{
			graph = new DefaultDirectedGraph<CartesianTriangle, DefaultEdge>(DefaultEdge.class);
			
			// Adds all triangles to the graph
			for(CartesianTriangle triangle : mesh.getPolygons())
			{
				graph.addVertex(triangle);	

			}

			// Adds edges between triangles representing neighbours relationships.
			for(CartesianTriangle triangle : mesh.getPolygons())
			{
				List<CartesianTriangle> neighbours = mesh.getPolygonNeighbours(triangle);
				for(CartesianTriangle neighbour : neighbours)
				{
					if(!graph.containsEdge(triangle, neighbour))
					{
						graph.addEdge(triangle, neighbour);
					}
					
					if(!graph.containsEdge(neighbour, triangle))
					{
						graph.addEdge(neighbour, triangle);						
					}
				}		
			}	
			
			// TODO Connects isolated group of triangle in a better way !			
			ConnectivityInspector<CartesianTriangle, DefaultEdge> ci = new ConnectivityInspector<CartesianTriangle, DefaultEdge>(graph);						
			List<Set<CartesianTriangle>> connectedSets = ci.connectedSets();			
			for(Set<CartesianTriangle> set : connectedSets)
			{
				if(set.size() > 0)
				{
					// Creates a connection between this sets and the others.
					List<CartesianTriangle> setTriangles = new ArrayList<CartesianTriangle>(set);
					CartesianTriangle sourceTriangle = setTriangles.get(0);
					
					for(Set<CartesianTriangle> otherSet : connectedSets)
					{												
						if(otherSet != set && otherSet.size() > 0)
						{
						List<CartesianTriangle> othersetTriangles = new ArrayList<CartesianTriangle>(otherSet);
							CartesianTriangle destinationTriangle = othersetTriangles.get(0);
							
							if(!graph.containsEdge(sourceTriangle, destinationTriangle))
							{
								graph.addEdge(sourceTriangle, destinationTriangle);
							}
							
							if(!graph.containsEdge(destinationTriangle, sourceTriangle))
							{
								graph.addEdge(destinationTriangle, sourceTriangle);
							}
						}
					}					
				}				
			}
		}
		return graph;
	}
}
