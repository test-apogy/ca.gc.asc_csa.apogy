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

import javax.vecmath.Vector3d;

class Vertex {
	/**
	 * Spatial point associated with this vertex.
	 */
	Vector3d pnt;

	/**
	 * Back index into an array.
	 */
	int index;

	/**
	 * List forward link.
	 */
	Vertex prev;

	/**
	 * List backward link.
	 */
	Vertex next;

	/**
	 * Current face that this vertex is outside of.
	 */
	Face face;

	/**
	 * Constructs a vertex and sets its coordinates to 0.
	 */
	public Vertex() {
		pnt = new Vector3d();
	}

	/**
	 * Constructs a vertex with the specified coordinates and index.
	 */
	public Vertex(double x, double y, double z, int idx) {
		pnt = new Vector3d(x, y, z);
		index = idx;
	}

}
