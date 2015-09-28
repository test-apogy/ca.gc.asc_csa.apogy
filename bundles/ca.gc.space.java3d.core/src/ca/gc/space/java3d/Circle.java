package ca.gc.space.java3d;

import java.util.ArrayList;
import java.util.List;

import javax.media.j3d.Shape3D;
import javax.vecmath.Point3d;

public class Circle
{
	/**
	 * The number of division around the base of the cone used to generate the geometry.
	 */
	public static int DEFAULT_AZIMUTH_INCREMENT_NUMBER = 36;
	
	/**
	 * The default radius.
	 */
	public static double DEFAULT_RADIUS = 1.0;
	
	private double radius = DEFAULT_RADIUS;
	private int numberOfAzimuthDivisions = DEFAULT_AZIMUTH_INCREMENT_NUMBER;
	private Shape3D shape;		
	private DynamicLineArray circleLineArray = null;
	
	public Circle()
	{
		this(DEFAULT_RADIUS, DEFAULT_AZIMUTH_INCREMENT_NUMBER);
	}
	
	public Circle(double radius)
	{
		this(radius, DEFAULT_AZIMUTH_INCREMENT_NUMBER);
	}
	
	public Circle(double radius, int numberOfAzimuthDivisions)
	{
		this.radius = radius;
		this.numberOfAzimuthDivisions = numberOfAzimuthDivisions;
		this.circleLineArray = new DynamicLineArray();		
		
		try
		{
			updateGeometry();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Returns the Shape3D that contains the geometry of the cone.
	 * @return The Shape3D containing the cone geometry.
	 */
	public Shape3D getShape3D()
	{
		if(shape == null)
		{
			shape = new Shape3D();
			shape.setCapability(Shape3D.ALLOW_GEOMETRY_READ);		
			shape.setCapability(Shape3D.ALLOW_GEOMETRY_WRITE);
			shape.setCapability(Shape3D.ALLOW_APPEARANCE_WRITE);
		}
		return shape;
	}
	
	/**
	 * Return the radius of the circle.
	 * @return The radius.
	 */
	public double getRadius()
	{
		return radius;
	}

	/**
	 * Sets the radius of the circle.
	 * @param radius The radius, equal or greater than zero.
	 */
	public void setRadius(double radius)
	{
		this.radius = radius;
		updateGeometry();
	}
	
	/**
	 * Returns the number of division around the base of the cone used to generate the geometry.
	 * @return The number of division.
	 */
	public int getNumberOfAzimuthDivisions()
	{
		return numberOfAzimuthDivisions;
	}

	/**
	 * Sets the number of division around the base of the cone used to generate the geometry.
	 * @param numberOfAzimuthDivisions The number of division.
	 */
	public void setNumberOfAzimuthDivisions(int numberOfAzimuthDivisions)
	{
		this.numberOfAzimuthDivisions = numberOfAzimuthDivisions;
		updateGeometry();
	}
	
	/**
	 * Updates the geometry representing the truncated cone.
	 */
	private void updateGeometry()
	{		
		getShape3D().removeAllGeometries();
		
		double thetaIncrement = Math.toRadians((360.0 / numberOfAzimuthDivisions));
		double theta = 0.0;		
		List<Point3d> tempPoints = new ArrayList<Point3d>();
		if(radius > 0)
		{
			for(int i = 0; i <= numberOfAzimuthDivisions; i++)
			{			
				double x = radius * Math.cos(theta);
				double y = radius * Math.sin(theta);
				Point3d point = new Point3d(x, y, 0);
				tempPoints.add(point);
				theta += thetaIncrement;
			}
		}
		else
		{
			tempPoints.add(new Point3d(0, 0, 0));
		}
				
		circleLineArray.clear();
		circleLineArray.addAll(tempPoints);
		
		getShape3D().removeAllGeometries();
		getShape3D().addGeometry(circleLineArray.getShape3D().getGeometry());
	}
}
