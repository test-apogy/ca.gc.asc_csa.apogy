package ca.gc.asc_csa.apogy.common.math.quickhull3d;
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

class VertexList
{
	private Vertex head;
	private Vertex tail;

	/**
	 * Clears this list.
	 */
	public void clear()
	 {
	   head = tail = null; 
	 }

	/**
	 * Adds a vertex to the end of this list.
	 */
	public void add (Vertex vtx)
	 { 
	   if (head == null)
	    { head = vtx;
	    }
	   else
	    { tail.next = vtx; 
	    }
	   vtx.prev = tail;
	   vtx.next = null;
	   tail = vtx;
	 }

	/**
	 * Adds a chain of vertices to the end of this list.
	 */
	public void addAll (Vertex vtx)
	 { 
	   if (head == null)
	    { head = vtx;
	    }
	   else
	    { tail.next = vtx; 
	    }
	   vtx.prev = tail;
	   while (vtx.next != null)
	    { vtx = vtx.next;
	    }
	   tail = vtx;
	 }

	/**
	 * Deletes a vertex from this list.
	 */
	public void delete (Vertex vtx)
	 {
	   if (vtx.prev == null)
	    { head = vtx.next;
	    }
	   else
	    { vtx.prev.next = vtx.next; 
	    }
	   if (vtx.next == null)
	    { tail = vtx.prev; 
	    }
	   else
	    { vtx.next.prev = vtx.prev; 
	    }
	 }

	/**
	 * Deletes a chain of vertices from this list.
	 */
	public void delete (Vertex vtx1, Vertex vtx2)
	 {
	   if (vtx1.prev == null)
	    { head = vtx2.next;
	    }
	   else
	    { vtx1.prev.next = vtx2.next; 
	    }
	   if (vtx2.next == null)
	    { tail = vtx1.prev; 
	    }
	   else
	    { vtx2.next.prev = vtx1.prev; 
	    }
	 }

	/**
	 * Inserts a vertex into this list before another
	 * specificed vertex.
	 */
	public void insertBefore (Vertex vtx, Vertex next)
	 {
	   vtx.prev = next.prev;
	   if (next.prev == null)
	    { head = vtx;
	    }
	   else
	    { next.prev.next = vtx; 
	    }
	   vtx.next = next;
	   next.prev = vtx;
	 }

	/**
	 * Returns the first element in this list.
	 */
	public Vertex first()
	 {
	   return head;
	 }

	/**
	 * Returns true if this list is empty.
	 */
	public boolean isEmpty()
	 {
	   return head == null;
	 }
}
