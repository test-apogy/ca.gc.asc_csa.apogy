package ca.gc.space.java3d;

import java.util.ArrayList;
import java.util.List;

import javax.media.j3d.Appearance;
import javax.media.j3d.GeometryArray;
import javax.media.j3d.LineArray;
import javax.media.j3d.PointArray;
import javax.media.j3d.PolygonAttributes;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TriangleArray;
import javax.vecmath.Point3d;

import com.sun.j3d.utils.geometry.GeometryInfo;
import com.sun.j3d.utils.geometry.NormalGenerator;

/**
 * A circular sector on the XY plane, centered at the origin. Minimum and maximum angle are 
 * defined relative to the positive X axis.
 * @author pallard
 *
 */
public class CircularSector
{
	public static int DEFAULT_INCREMENT_NUMBER = 36;
	public static double DEFAULT_APEX_ANGLE = Math.toRadians(45.0);
	public static double DEFAULT_MINIMUM_RADIUS = 0.0;
	public static double DEFAULT_MAXIMUM_RADIUS = 1.0;
	
	private int numberOfDivisions = DEFAULT_INCREMENT_NUMBER;
	private double minRadius;
	private double maxRadius;
	private double minAngle;
	private double maxAngle;
	private Shape3D shape;			
	private GeometryArray geometryArray;
	
	public CircularSector(double minAngle, double maxAngle, double minRadius, double maxRadius)
	{
		this.minAngle = minAngle;
		this.maxAngle = maxAngle;
		this.minRadius = minRadius;
		this.maxRadius = maxRadius;
		
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
			
			Appearance appearance = new Appearance();
			PolygonAttributes pa = new PolygonAttributes();
			pa.setCapability(PolygonAttributes.ALLOW_MODE_WRITE);
			pa.setCapability(PolygonAttributes.ALLOW_MODE_READ);
			pa.setCullFace(PolygonAttributes.CULL_NONE);
			pa.setPolygonMode(PolygonAttributes.POLYGON_LINE);
			pa.setBackFaceNormalFlip(true);				
			appearance.setPolygonAttributes(pa);
			shape.setAppearance(appearance);
		}
		return shape;
	}	
	
	public int getNumberOfDivisions()
	{
		return numberOfDivisions;
	}

	public void setNumberOfDivisions(int numberOfDivisions)
	{
		this.numberOfDivisions = numberOfDivisions;
		updateGeometry();
	}

	public double getMinRadius()
	{
		return minRadius;
	}

	public void setMinRadius(double minRadius)
	{
		this.minRadius = minRadius;
		updateGeometry();
	}

	public double getMaxRadius()
	{
		return maxRadius;
	}

	public void setMaxRadius(double maxRadius)
	{		
		this.maxRadius = maxRadius;
		updateGeometry();
	}

	public double getMinAngle()
	{
		return minAngle;
	}

	public void setMinAngle(double minAngle)
	{
		this.minAngle = minAngle;
		updateGeometry();
	}

	public double getMaxAngle()
	{
		return maxAngle;
	}

	public void setMaxAngle(double maxAngle)
	{
		this.maxAngle = maxAngle;
		updateGeometry();
	}
	
	private void updateGeometry()
	{
		try
		{					
			double angleIncrement =  (maxAngle - minAngle) / numberOfDivisions;
			if(((maxRadius - minRadius) > 0) && (angleIncrement > 0))
			{
				// Generate the circle									
				List<Point3d> vertices = new ArrayList<Point3d>();
				
				double angle = minAngle;	
				for(int i = 0; i < numberOfDivisions; i++)	
				{			
					double x1Near = minRadius * Math.cos(angle);
					double y1Near = minRadius * Math.sin(angle);
					
					double x1Far = maxRadius * Math.cos(angle);
					double y1Far = maxRadius * Math.sin(angle);
									
					Point3d point1Near = new Point3d(x1Near,y1Near,0);
					Point3d point1Far = new Point3d(x1Far,y1Far,0);												
					
					double nextAngle = angle + angleIncrement;
					double x2Near = minRadius * Math.cos(nextAngle);
					double y2Near = minRadius * Math.sin(nextAngle);	
					double x2Far = maxRadius * Math.cos(nextAngle);
					double y2Far = maxRadius * Math.sin(nextAngle);
					
					Point3d point2Near = new Point3d(x2Near,y2Near,0);
					Point3d point2Far = new Point3d(x2Far,y2Far,0);
					
					// Adds the first triangle.		
					vertices.add(point1Near);
					vertices.add(point1Far);
					vertices.add(point2Far);
					
					// Adds the second triangle.		
					vertices.add(point1Near);
					vertices.add(point2Far);
					vertices.add(point2Near);
					
					angle += angleIncrement;								
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
				LineArray lineArray = new LineArray(2, PointArray.COORDINATES);			
				Point3d from = new Point3d(minRadius, 0, 0);
				Point3d to = new Point3d(maxRadius, 0, 0);
				lineArray.setCoordinate(0, from);
				lineArray.setCoordinate(1, to);
				
				// Replaces geometry.
				getShape3D().removeGeometry(geometryArray);
				getShape3D().addGeometry(lineArray);
				geometryArray = lineArray;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
