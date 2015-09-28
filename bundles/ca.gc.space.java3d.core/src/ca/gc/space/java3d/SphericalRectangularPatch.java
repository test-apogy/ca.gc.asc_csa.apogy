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
 * A spherical rectangular patch. 
 * @author pallard
 *
 */
public class SphericalRectangularPatch 
{
	public static int DEFAULT_HORIZONTAL_INCREMENT_NUMBER = 10;
	public static int DEFAULT_VERTICAL_INCREMENT_NUMBER = 10;
	
	private int horizontalIncrementNumber = DEFAULT_HORIZONTAL_INCREMENT_NUMBER;
	private int verticalIncrementNumber = DEFAULT_VERTICAL_INCREMENT_NUMBER;
	
	private double radius;	
	private double minHorizontalAngle;
	private double maxHorizontalAngle;	
	private double minVerticalAngle;
	private double maxVerticalAngle;
	
	private GeometryArray geometryArray;	
	private Shape3D shape;		
	
	public SphericalRectangularPatch(double radius,double minHorizontalAngle, double maxHorizontalAngle, double minVerticalAngle, double maxVerticalAngle)	
	{
		this.radius = radius;
		this.minHorizontalAngle =  minHorizontalAngle;
		this.maxHorizontalAngle = maxHorizontalAngle;
		this.minVerticalAngle = minVerticalAngle;
		this.maxVerticalAngle = maxVerticalAngle;				
		
		updateGeometry();
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
	
	public int getHorizontalIncrementNumber()
	{
		return horizontalIncrementNumber;
	}

	public void setHorizontalIncrementNumber(int horizontalIncrementNumber)
	{
		this.horizontalIncrementNumber = horizontalIncrementNumber;
		updateGeometry();
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
		updateGeometry();
	}

	public double getMinHorizontalAngle()
	{
		return minHorizontalAngle;
	}

	public void setMinHorizontalAngle(double minHorizontalAngle)
	{
		this.minHorizontalAngle = minHorizontalAngle;
		updateGeometry();
	}

	public double getMaxHorizontalAngle()
	{
		return maxHorizontalAngle;
	}

	public void setMaxHorizontalAngle(double maxHorizontalAngle)
	{
		this.maxHorizontalAngle = maxHorizontalAngle;
		updateGeometry();
	}

	public double getMinVerticalAngle()
	{
		return minVerticalAngle;
	}

	public void setMinVerticalAngle(double minVerticalAngle)
	{
		this.minVerticalAngle = minVerticalAngle;
		updateGeometry();
	}

	public double getMaxVerticalAngle()
	{
		return maxVerticalAngle;
	}

	public void setMaxVerticalAngle(double maxVerticalAngle)
	{
		this.maxVerticalAngle = maxVerticalAngle;
		updateGeometry();
	}
	
	private void updateGeometry()
	{
		double elevationAngleIncrement = (maxVerticalAngle - minVerticalAngle) / verticalIncrementNumber;
		double azimuthAngleIncrement = (maxHorizontalAngle - minHorizontalAngle) / horizontalIncrementNumber;
			
		List<Point3d> vertices = new ArrayList<Point3d>();
		
		// Creates the front.
		double elevationAngle = minVerticalAngle;
		for(int elevation = 0; elevation < verticalIncrementNumber; elevation++)
		{			
			double azimuthAngle = minHorizontalAngle;
			for(int azimuth = 0; azimuth < horizontalIncrementNumber; azimuth++)
			{			
				double dLow = radius * Math.cos(elevationAngle);
				double dHigh = radius * Math.cos(elevationAngle + elevationAngleIncrement);				
				
				double xLowLeft = dLow * Math.sin(azimuthAngle);
				double yLowLeft = radius * Math.sin(elevationAngle);
				double zLowLeft = dLow * Math.cos(azimuthAngle);				
				Point3d LowLeft = new Point3d(xLowLeft, yLowLeft, zLowLeft);
				
				double xLowRight = dLow * Math.sin(azimuthAngle + azimuthAngleIncrement);
				double yLowRight = radius * Math.sin(elevationAngle);
				double zLowRight = dLow * Math.cos(azimuthAngle+ azimuthAngleIncrement);
				Point3d LowRight = new Point3d(xLowRight, yLowRight, zLowRight);
				
				double xHighLeft = dHigh * Math.sin(azimuthAngle);
				double yHighLeft = radius * Math.sin(elevationAngle + elevationAngleIncrement);
				double zHighLeft = dHigh * Math.cos(azimuthAngle);
				Point3d HighLeft = new Point3d(xHighLeft, yHighLeft, zHighLeft);
				
				double xHighRight = dHigh * Math.sin(azimuthAngle + azimuthAngleIncrement);
				double yHighRight = radius * Math.sin(elevationAngle + elevationAngleIncrement);
				double zHighRight = dHigh * Math.cos(azimuthAngle+ azimuthAngleIncrement);
				Point3d HighRight = new Point3d(xHighRight, yHighRight, zHighRight);
			
				// Adds the first triangle.		
				vertices.add(LowLeft);
				vertices.add(HighLeft);
				vertices.add(LowRight);
				
				// Adds the second triangle.		
				vertices.add(HighLeft);
				vertices.add(HighRight);
				vertices.add(LowRight);
				
				azimuthAngle += azimuthAngleIncrement;
			}
			elevationAngle += elevationAngleIncrement;
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
		
		getShape3D().removeGeometry(geometryArray);
		getShape3D().addGeometry(temp);
		geometryArray = temp;
	}
}
