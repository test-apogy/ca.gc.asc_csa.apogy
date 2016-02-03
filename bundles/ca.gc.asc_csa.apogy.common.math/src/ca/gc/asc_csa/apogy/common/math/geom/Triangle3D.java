package ca.gc.asc_csa.apogy.common.math.geom;
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


public class Triangle3D {

	public Point3d p0;
	public Point3d p1;
	public Point3d p2;

	public Triangle3D(Point3d p0, Point3d p1, Point3d p2) {
		this.p0 = p0;
		this.p1 = p1;
		this.p2 = p2;
	}

}
