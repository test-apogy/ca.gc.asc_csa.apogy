package ca.gc.space.java3d;

import java.util.ArrayList;
import java.util.List;

import javax.media.j3d.GeometryArray;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TriangleArray;
import javax.vecmath.Point3d;

import com.sun.j3d.utils.geometry.GeometryInfo;
import com.sun.j3d.utils.geometry.NormalGenerator;

public class Hemisphere
{
	public static double DEFAULT_RADIUS = 1.0;
	public static double DEFAULT_MINIMUM_ELEVATION_ANGLE = Math.toRadians(0.0);
	public static double DEFAULT_MAXIMUM_ELEVATION_ANGLE = Math.toRadians(45.0);
	public static int DEFAULT_NUMBER_AZIMUTH_DIVISION = 36;
	public static int DEFAULT_INCREMENT_ELEVATION_NUMBER = 9;
	
	private int numberOfAzimuthDivisions;
	private int numberOfElevationDivisions;	
	private double radius;
	private double minElevationAngle; 
	private double maxElevationAngle; 
	
	private Shape3D shape;			
	private GeometryArray geometryArray;
	
	public Hemisphere()
	{		
		this(DEFAULT_RADIUS, DEFAULT_MINIMUM_ELEVATION_ANGLE, DEFAULT_MAXIMUM_ELEVATION_ANGLE, DEFAULT_NUMBER_AZIMUTH_DIVISION, DEFAULT_INCREMENT_ELEVATION_NUMBER);
	}	
	
	public Hemisphere(double radius, double minElevationAngle, double maxElevationAngle)
	{		
		this(radius, minElevationAngle, maxElevationAngle, DEFAULT_NUMBER_AZIMUTH_DIVISION, DEFAULT_INCREMENT_ELEVATION_NUMBER);
	}

	public Hemisphere(double radius, double minElevationAngle, double maxElevationAngle, int numberOfAzimuthDivisions, int numberOfElevationDivisions)
	{		
		this.radius = radius;
		this.minElevationAngle = minElevationAngle;
		this.maxElevationAngle = maxElevationAngle;
		this.numberOfAzimuthDivisions = numberOfAzimuthDivisions;
		this.numberOfElevationDivisions = numberOfElevationDivisions;	
		
		try
		{
			updateGeometry();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
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

	public double getRadius()
	{
		return radius;
	}

	public double getMinElevationAngle()
	{
		return minElevationAngle;
	}

	public void setMinElevationAngle(double minElevationAngle)
	{
		this.minElevationAngle = minElevationAngle;
		updateGeometry();
	}
	
	public double getMaxElevationAngle()
	{
		return maxElevationAngle;
	}

	public void setMaxElevationAngle(double maxElevationAngle)
	{
		this.maxElevationAngle = maxElevationAngle;
		updateGeometry();
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
		updateGeometry();
	}
		
	private void updateGeometry()
	{		
		if((maxElevationAngle - minElevationAngle) > 0)
		{		
			List<Point3d> vertices = new ArrayList<Point3d>();
									
			double apexAngle = minElevationAngle;
			double elevationIncrement = (maxElevationAngle - minElevationAngle) / numberOfElevationDivisions;
			
			for(int j =0; j < numberOfElevationDivisions; j++)
			{				
				double radiusNear = radius * Math.cos(apexAngle);
				double radiusFar = radius * Math.cos(apexAngle + elevationIncrement);
				double zNear = radius * Math.sin(apexAngle);
				double zFar = radius* Math.sin(apexAngle + elevationIncrement);
				
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
				
				// Increment angle.
				apexAngle += elevationIncrement;				
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
			getShape3D().removeGeometry(geometryArray);
		}
	}
}
