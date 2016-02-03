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

import javax.vecmath.Point2d;

public class Segment2D implements Comparable<Segment2D>
{
	public Point2d p1 = null;
	public Point2d p2 = null;
	
	public Segment2D(Point2d p1, Point2d p2)
	{
		this.p1 = p1;
		this.p2 = p2;
	}

	@Override
	public int compareTo(Segment2D o) 
	{	
		double delta = this.p1.x - o.p1.x;
		
		if(delta < 0)
		{
			return -1;
		}
		else if(delta > 0)
		{
			return 1;
		}
		else return 0;
	}
}