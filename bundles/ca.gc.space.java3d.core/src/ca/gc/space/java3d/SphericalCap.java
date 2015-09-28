package ca.gc.space.java3d;

import java.util.ArrayList;
import java.util.List;

import javax.media.j3d.Appearance;
import javax.media.j3d.GeometryArray;
import javax.media.j3d.PolygonAttributes;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TriangleArray;
import javax.vecmath.Point3d;

import com.sun.j3d.utils.geometry.GeometryInfo;
import com.sun.j3d.utils.geometry.NormalGenerator;

/**
 * Represents an spherical cap. The cap is centred on the positive Z axis, with the origin of its radius 
 * at the origin. The elevation angles are defined relative to the XY plane.
 * @author pallard
 * @see http://en.wikipedia.org/wiki/Spherical_cap
 *
 */
public class SphericalCap
{
	/**
	 * The default radius.
	 */
	public static double DEFAULT_RADIUS = 1.0;
	
	/**
	 * The default minimum elevation angle, in radians.
	 */
	public static double DEFAULT_MINIMUM_ELEVATION_ANGLE = Math.toRadians(0.0);
	
	/**
	 * The default maximum elevation angle, in radians.
	 */
	public static double DEFAULT_MAXIMUM_ELEVATION_ANGLE = Math.toRadians(90.0);
	
	/**
	 * The default number of division in azimuth.
	 */
	public static int DEFAULT_NUMBER_AZIMUTH_DIVISION = 36;
	
	/**
	 * The default number of division in elevation. 
	 */
	public static int DEFAULT_INCREMENT_ELEVATION_NUMBER = 9;
	
	private int numberOfAzimuthDivisions;
	private int numberOfElevationDivisions;	
	private double radius;
	private double minElevationAngle; 
	private double maxElevationAngle; 
	
	private Shape3D shape;			
	private GeometryArray geometryArray;
	
	/**
	 * Default constructor. Creates a spherical cap with the default values, which is a hemisphere.
	 */
	public SphericalCap()
	{		
		this(DEFAULT_RADIUS, DEFAULT_MINIMUM_ELEVATION_ANGLE, DEFAULT_MAXIMUM_ELEVATION_ANGLE, DEFAULT_NUMBER_AZIMUTH_DIVISION, DEFAULT_INCREMENT_ELEVATION_NUMBER);
	}	
	
	/**
	 * Creates a spherical cap with the specified radius, minimum and maximum elevation angle.
	 * @param radius The radius.
	 * @param minElevationAngle The minimum elevation angle, in radians.
	 * @param maxElevationAngle The maximum elevation angle, in radians.
	 */
	public SphericalCap(double radius, double minElevationAngle, double maxElevationAngle)
	{		
		this(radius, minElevationAngle, maxElevationAngle, DEFAULT_NUMBER_AZIMUTH_DIVISION, DEFAULT_INCREMENT_ELEVATION_NUMBER);
	}

	/**
	 * Creates a spherical cap with the specified radius, minimum and maximum elevation angle 
	 * and the number of divisions to be used to generate the geometry.
	 * @param radius The radius.
	 * @param minElevationAngle The minimum elevation angle.
	 * @param maxElevationAngle The maximum elevation angle.
	 * @param numberOfAzimuthDivisions The number of division in azimuth to be used to generate the geometry.
	 * @param numberOfElevationDivisions The number of division in elevation to be used to generate the geometry.
	 */
	public SphericalCap(double radius, double minElevationAngle, double maxElevationAngle, int numberOfAzimuthDivisions, int numberOfElevationDivisions)
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
			shape.setCapability(Shape3D.ALLOW_APPEARANCE_READ);
			shape.setCapability(Shape3D.ALLOW_APPEARANCE_WRITE);
			
			Appearance appearance = new Appearance();
			PolygonAttributes pa = new PolygonAttributes();
			pa.setCapability(PolygonAttributes.ALLOW_MODE_WRITE);
			pa.setCapability(PolygonAttributes.ALLOW_MODE_READ);
			pa.setCullFace(PolygonAttributes.CULL_NONE);
			pa.setPolygonMode(PolygonAttributes.POLYGON_FILL);
			pa.setBackFaceNormalFlip(true);				
			appearance.setPolygonAttributes(pa);
			shape.setAppearance(appearance);
		}
		return shape;
	}

	/**
	 * Return the radius of the spherical cap.
	 * @return The radius.
	 */
	public double getRadius()
	{
		return radius;
	}
	
	/**
	 * Sets the radius of the spherical cap. The geometry is updated.
	 * @return The radius.
	 */
	public void setRadius(double radius)
	{
		this.radius = radius;
		updateGeometry();
	}

	/**
	 * Returns the minimum elevation angle.
	 * @return The minimum elevation angle, in radians.
	 */
	public double getMinElevationAngle()
	{
		return minElevationAngle;
	}

	/**
	 * Sets the minimum elevation angle. The geometry is updated.
	 * @param minElevationAngle The minimum elevation angle, in radians.
	 */
	public void setMinElevationAngle(double minElevationAngle)
	{
		this.minElevationAngle = minElevationAngle;
		updateGeometry();
	}
	
	/**
	 * Returns the maximum elevation angle.
	 * @return The maximum elevation angle, in radians.
	 */
	public double getMaxElevationAngle()
	{
		return maxElevationAngle;
	}

	/**
	 * Sets the maximum elevation angle. The geometry is updated.
	 * @param maxElevationAngle The maximum elevation angle, in radians.
	 */
	public void setMaxElevationAngle(double maxElevationAngle)
	{
		this.maxElevationAngle = maxElevationAngle;
		updateGeometry();
	}
		
	/**
	 * Returns the number of division in azimuth to be used to generate the geometry.
	 * @return The number of division.
	 */
	public int getNumberOfAzimuthDivisions()
	{
		return numberOfAzimuthDivisions;
	}

	/**
	 * Sets the number of division in azimuth to be used to generate the geometry. The geometry is updated.
	 * @param numberOfAzimuthDivisions The number of division.
	 */
	public void setNumberOfAzimuthDivisions(int numberOfAzimuthDivisions)
	{
		this.numberOfAzimuthDivisions = numberOfAzimuthDivisions;
		updateGeometry();
	}

	/**
	 * Returns the number of division in elevation to be used to generate the geometry.
	 * @return The number of division.
	 */
	public int getNumberOfElevationDivisions()
	{
		return numberOfElevationDivisions;
	}

	/**
	 * Sets the number of division in elevation to be used to generate the geometry. The geometry is updated.
	 * @param numberOfElevationDivisions The number of division.
	 */
	public void setNumberOfElevationDivisions(int numberOfElevationDivisions)
	{
		this.numberOfElevationDivisions = numberOfElevationDivisions;
		updateGeometry();
	}
	
	/**
	 * Updates the geometry representing the spherical cap.
	 */
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
