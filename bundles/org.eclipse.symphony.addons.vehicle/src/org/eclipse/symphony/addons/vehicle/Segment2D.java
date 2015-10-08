package org.eclipse.symphony.addons.vehicle;

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