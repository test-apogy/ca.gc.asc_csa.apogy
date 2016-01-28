package ca.gc.asc_csa.apogy.addons.vehicle;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

public class Plane 
{
	public Point3d point = null;
	public Vector3d normal = null;
	
	public Plane(Point3d point, Vector3d normal)
	{
		this.point = point;
		this.normal = normal;
	}
}
