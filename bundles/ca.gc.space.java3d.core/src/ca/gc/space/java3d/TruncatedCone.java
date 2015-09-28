package ca.gc.space.java3d;

import java.util.ArrayList;
import java.util.List;

import javax.media.j3d.GeometryArray;
import javax.media.j3d.LineArray;
import javax.media.j3d.PointArray;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TriangleArray;
import javax.vecmath.Point3d;

import com.sun.j3d.utils.geometry.GeometryInfo;
import com.sun.j3d.utils.geometry.NormalGenerator;

/**
 * Represents a truncated cone. The cone apex is at the origin, and the cone's height is along the positive Z axis.
 * If the apex angle is equal or smaller than zero, the truncated cone is represented as a line along the positive 
 * Z axis, going from the minimum radius to the maximum radius.
 * @author pallard
 *
 */
public class TruncatedCone
{
	/**
	 * The number of division around the base of the cone used to generate the geometry.
	 */
	public static int DEFAULT_AZIMUTH_INCREMENT_NUMBER = 36;
	
	/**
	 * The default apex angle.
	 */
	public static double DEFAULT_APEX_ANGLE = Math.toRadians(45.0);
	
	/**
	 * The default minRadius.
	 */
	public static double DEFAULT_MINIMUM_RADIUS = 0.0;
	
	/**
	 * The default maxRadius.
	 */
	public static double DEFAULT_MAXIMUM_RADIUS = 1.0;
	
	private int numberOfAzimuthDivisions = DEFAULT_AZIMUTH_INCREMENT_NUMBER;
	private double minRadius;
	private double maxRadius;
	private double apexAngle;
	private Shape3D shape;			
	private GeometryArray geometryArray;
	
	/**
	 * Creates a truncated cone using the defaults.
	 */
	public TruncatedCone()
	{
		this(DEFAULT_APEX_ANGLE, DEFAULT_MINIMUM_RADIUS, DEFAULT_MAXIMUM_RADIUS, DEFAULT_AZIMUTH_INCREMENT_NUMBER);
	}
	
	/**
	 * Creates a truncated cone using the default number of division around 
	 * the base of the cone used to generate the geometry.
	 * @param apexAngle The apex angle, in radians.
	 * @param minRadius The minimum radius, from the apex.
	 * @param maxRadius The maximum radius, from the apex.
	 */
	public TruncatedCone(double apexAngle, double minRadius, double maxRadius)
	{
		this(apexAngle, minRadius, maxRadius, DEFAULT_AZIMUTH_INCREMENT_NUMBER);
	}
	
	/**
	 * Creates a truncated cone.
	 * @param apexAngle The apex angle, in radians.
	 * @param minRadius The minimum radius, from the apex.
	 * @param maxRadius The maximum radius, from the apex.
	 * @param numberOfAzimuthDivisions The number of division around the base of the cone used to generate the geometry.
	 */
	public TruncatedCone(double apexAngle, double minRadius, double maxRadius, int numberOfAzimuthDivisions)
	{
		this.minRadius = minRadius;
		this.maxRadius = maxRadius;
		this.apexAngle = apexAngle;
		this.numberOfAzimuthDivisions = numberOfAzimuthDivisions;
		
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
	 * Returns the current value of the apex angle.
	 * @return The apex angle, in radians.
	 */
	public double getApexAngle()
	{
		return apexAngle;
	}

	/**
	 * Sets the current value of the apex angle. The geometry is updated.
	 * @param apexAngle The apex angle, in radians.
	 */
	public void setApexAngle(double apexAngle)
	{
		this.apexAngle = apexAngle;
		updateGeometry();
	}
	
	/**
	 * Returns the current minimum radius.
	 * @return The minimum radius.
	 */
	public double getMinRadius()
	{
		return minRadius;
	}

	/**
	 * Sets the minimum radius. The geometry is updated.
	 * @param minRadius The minimum radius.
	 */
	public void setMinRadius(double minRadius)
	{
		this.minRadius = minRadius;
		updateGeometry();
	}

	/**
	 * Return the current maximum radius.
	 * @return The maximum radius.
	 */
	public double getMaxRadius()
	{
		return maxRadius;
	}

	/**
	 * Sets the maximum radius. The geometry is updated.
	 * @param maxRadius The maximum radius.
	 */
	public void setMaxRadius(double maxRadius)
	{
		this.maxRadius = maxRadius;
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
		if(this.apexAngle > 0)
		{
			// If the apex angle is larger than one, creates the geometry to represents the truncated cone.
			
			// Generate the sides.			
			double apexAngle = this.apexAngle;	
			
			List<Point3d> vertices = new ArrayList<Point3d>();
			
			double radiusNear = minRadius * Math.sin(apexAngle / 2.0);
			double radiusFar = maxRadius * Math.sin(apexAngle / 2.0);
			double zNear = minRadius * Math.cos(apexAngle / 2.0);
			double zFar = maxRadius * Math.cos(apexAngle / 2.0);
			
			double angleIncrement = (Math.toRadians(360) / numberOfAzimuthDivisions);
			for(int i = 0; i < numberOfAzimuthDivisions; i++)
			{
				double angle = i * angleIncrement;
				
				double x1Near = radiusNear * Math.cos(angle);
				double y1Near = radiusNear * Math.sin(angle);												
				double x1Far = radiusFar * Math.cos(angle);
				double y1Far = radiusFar * Math.sin(angle);		
				Point3d point1Near = new Point3d(x1Near, y1Near, zNear);
				Point3d point1Far = new Point3d(x1Far, y1Far, zFar);
				
				double x2Near = radiusNear * Math.cos(angle + angleIncrement);
				double y2Near = radiusNear * Math.sin(angle + angleIncrement);		
				double x2Far = radiusFar * Math.cos(angle + angleIncrement);
				double y2Far = radiusFar * Math.sin(angle + angleIncrement);					
				Point3d point2Near = new Point3d(x2Near,y2Near,zNear);
				Point3d point2Far = new Point3d(x2Far,y2Far,zFar);
				
				// Adds the first triangle.		
				vertices.add(point1Near);
				vertices.add(point1Far);
				vertices.add(point2Far);
				
				// Adds the second triangle.		
				vertices.add(point1Near);
				vertices.add(point2Far);
				vertices.add(point2Near);								
			}
			
			TriangleArray triangleArray = new TriangleArray(vertices.size(), TriangleArray.COORDINATES | TriangleArray.NORMALS);			
			triangleArray.setCapability(TriangleArray.ALLOW_COLOR_WRITE);
			triangleArray.setCapability(TriangleArray.ALLOW_COLOR_READ);
			int id = 0;
			for(Point3d vertex : vertices)
			{
				triangleArray.setCoordinate(id, vertex);
				id++;
			}
			
			NormalGenerator normalGenerator = new NormalGenerator();
			GeometryInfo geometryInfo = new GeometryInfo(triangleArray);
			normalGenerator.generateNormals(geometryInfo);
			GeometryArray temp = geometryInfo.getGeometryArray();
			
			// Replaces geometry.
			getShape3D().removeGeometry(geometryArray);
			getShape3D().addGeometry(temp);
			geometryArray = temp;
		}
		else
		{			
			// Apex is equal or smaller than zero, represent the cone as a line going from minRadius to maxRadius.
			LineArray lineArray = new LineArray(2, PointArray.COORDINATES);			
			Point3d from = new Point3d(minRadius, 0, 0);
			Point3d to = new Point3d(maxRadius, 0, 0);
			lineArray.setCoordinate(0, from);
			lineArray.setCoordinate(0, to);
						
			GeometryArray temp = lineArray;
			
			// Replaces geometry.
			getShape3D().removeGeometry(geometryArray);
			getShape3D().addGeometry(temp);
			geometryArray = temp;
		}
	}		
}
