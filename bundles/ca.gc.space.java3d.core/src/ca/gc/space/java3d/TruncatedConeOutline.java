package ca.gc.space.java3d;

import java.util.ArrayList;
import java.util.List;

import javax.media.j3d.Shape3D;
import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;

public class TruncatedConeOutline
{
	/**
	 * The number of division around the base of the cone used to generate the geometry.
	 */
	public static int DEFAULT_AZIMUTH_INCREMENT_NUMBER = 36;
	
	/**
	 * The number of division on the sides of the cone.
	 */
	public static int DEFAULT_SIDE_INCREMENT_NUMBER = 4;
	
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
	private int numberOfSidesDivisions = DEFAULT_SIDE_INCREMENT_NUMBER;

	private double minRadius;
	private double maxRadius;
	private double apexAngle;
	
	private DynamicLineArray frontCircle = null;
	private List<DynamicLineArray> frontHemisphereLines = null;
	
	private DynamicLineArray backCircle = null;
	private List<DynamicLineArray> backHemisphereLines = null;
	
	private DynamicLineArray sides = null;
	
	private Shape3D shape;	
	
	public TruncatedConeOutline()
	{
		this(DEFAULT_APEX_ANGLE, DEFAULT_MINIMUM_RADIUS, DEFAULT_MAXIMUM_RADIUS, DEFAULT_AZIMUTH_INCREMENT_NUMBER, DEFAULT_SIDE_INCREMENT_NUMBER);
	}
	
	/**
	 * Creates a truncated cone using the default number of division around 
	 * the base of the cone used to generate the geometry.
	 * @param apexAngle The apex angle, in radians.
	 * @param minRadius The minimum radius, from the apex.
	 * @param maxRadius The maximum radius, from the apex.
	 */
	public TruncatedConeOutline(double apexAngle, double minRadius, double maxRadius)
	{		
		this(apexAngle, minRadius, maxRadius, DEFAULT_AZIMUTH_INCREMENT_NUMBER, DEFAULT_SIDE_INCREMENT_NUMBER);
	}
	
	/**
	 * Creates a truncated cone.
	 * @param apexAngle The apex angle, in radians.
	 * @param minRadius The minimum radius, from the apex.
	 * @param maxRadius The maximum radius, from the apex.
	 * @param numberOfAzimuthDivisions The number of division around the base of the cone used to generate the geometry.
	 */
	public TruncatedConeOutline(double apexAngle, double minRadius, double maxRadius, int numberOfAzimuthDivisions)
	{
		this(apexAngle, minRadius, maxRadius, numberOfAzimuthDivisions, DEFAULT_SIDE_INCREMENT_NUMBER);
	}
	
	/**
	 * Creates a truncated cone.
	 * @param apexAngle The apex angle, in radians.
	 * @param minRadius The minimum radius, from the apex.
	 * @param maxRadius The maximum radius, from the apex.
	 * @param numberOfAzimuthDivisions The number of division around the base of the cone used to generate the geometry.
	 * @param numberOfSideDivisions The number of lines defining the sides of the cone.
	 */
	public TruncatedConeOutline(double apexAngle, double minRadius, double maxRadius, int numberOfAzimuthDivisions, int numberOfSideDivisions)
	{
		this.minRadius = minRadius;
		this.maxRadius = maxRadius;
		this.apexAngle = apexAngle;
		this.numberOfAzimuthDivisions = numberOfAzimuthDivisions;
		this.numberOfSidesDivisions = numberOfSideDivisions;
		
		frontCircle = new DynamicLineArray();	
		frontHemisphereLines = new ArrayList<DynamicLineArray>();
		
		backCircle = new DynamicLineArray();	
		backHemisphereLines = new ArrayList<DynamicLineArray>();
		sides = new DynamicLineArray();
		sides.setDuplicateVertices(false);
		
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
	
	public int getNumberOfSidesDivisions()
	{
		return numberOfSidesDivisions;
	}

	public void setNumberOfSidesDivisions(int numberOfSidesDivisions)
	{
		this.numberOfSidesDivisions = numberOfSidesDivisions;
		updateGeometry();
	}
	
	/**
	 * Updates the geometry representing the truncated cone.
	 */
	private void updateGeometry()
	{		
		getShape3D().removeAllGeometries();
		
		// Update the front circle.									
		double frontZ = maxRadius * Math.cos(apexAngle / 2.0);
		double frontRadius = maxRadius * Math.sin(apexAngle / 2.0);
		createCircle(frontCircle, frontZ, frontRadius );
		getShape3D().addGeometry(frontCircle.getShape3D().getGeometry());
		
		// Update the front hemisphere.		
		createHemisphere(frontHemisphereLines, maxRadius);
		for(DynamicLineArray line : frontHemisphereLines)
		{
			getShape3D().addGeometry(line.getShape3D().getGeometry());
		}
		
		// Update the back circle
		double backZ = minRadius * Math.cos(apexAngle / 2.0);
		double backRadius = minRadius * Math.sin(apexAngle / 2.0);
		createCircle(backCircle, backZ, backRadius );	
		getShape3D().addGeometry(backCircle.getShape3D().getGeometry());
		
		// Update the back hemisphere.		
		createHemisphere(backHemisphereLines, minRadius);
		for(DynamicLineArray line : backHemisphereLines)
		{
			getShape3D().addGeometry(line.getShape3D().getGeometry());
		}		
		
		// Adds the sides.
		createSides(sides);	
		getShape3D().addGeometry(sides.getShape3D().getGeometry());
	}
	
	private void createSides(DynamicLineArray dynamicLineArray)
	{
		List<Point3d> tempPoints = new ArrayList<Point3d>();
		
		if(apexAngle > 0)
		{
			double azimuthIncrement = Math.toRadians((360.0 / numberOfSidesDivisions));
			double azimuth = 0.0;	
			for(int i = 0; i <= numberOfSidesDivisions; i++)
			{		
				double nearRadius = minRadius * Math.sin(apexAngle / 2.0);
				double farRadius = maxRadius * Math.sin(apexAngle / 2.0);
				
				double xNear = nearRadius * Math.cos(azimuth);
				double xFar = farRadius * Math.cos(azimuth);
			
				double yNear = nearRadius * Math.sin(azimuth);
				double yFar = farRadius * Math.sin(azimuth);
							
				double zNear = minRadius * Math.cos(apexAngle / 2.0);
				double zFar = maxRadius * Math.cos(apexAngle / 2.0);
				
				Point3d pointNear = new Point3d(xNear, yNear, zNear);
				tempPoints.add(pointNear);
				
				Point3d pointFar = new Point3d(xFar, yFar, zFar);
				tempPoints.add(pointFar);
				
				azimuth += azimuthIncrement;
			}
		}
		else
		{
			double zNear = minRadius * Math.sin(apexAngle / 2.0);
			Point3d pointNear = new Point3d(0, 0, zNear);
			tempPoints.add(pointNear);
			
			double zFar = maxRadius * Math.cos(apexAngle / 2.0);
			Point3d pointFar = new Point3d(0, 0, zFar);
			tempPoints.add(pointFar);
		}
		
		dynamicLineArray.clear();
		dynamicLineArray.addAll(tempPoints);
	}
	
	private void createCircle(DynamicLineArray dynamicLineArray, double z, double radius)
	{
		double thetaIncrement = Math.toRadians((360.0 / numberOfAzimuthDivisions));
		double theta = 0.0;		
		List<Point3d> tempPoints = new ArrayList<Point3d>();
		if(radius > 0)
		{
			for(int i = 0; i <= numberOfAzimuthDivisions; i++)
			{			
				double x = radius * Math.cos(theta);
				double y = radius * Math.sin(theta);
				Point3d point = new Point3d(x, y, z);
				tempPoints.add(point);
				theta += thetaIncrement;
			}
		}
		else
		{
			tempPoints.add(new Point3d(0, 0, z));
		}
		dynamicLineArray.clear();
		dynamicLineArray.addAll(tempPoints);
	}
	
	private void createHemisphere(List<DynamicLineArray> dynamicLineArrays, double radius)
	{
		for(DynamicLineArray lineArray : dynamicLineArrays)
		{
			lineArray.clear();
		}
		
		// Ensure the correct number of DynamicLineArray is there.
		int listSizeDifference = dynamicLineArrays.size() - numberOfAzimuthDivisions;
		System.out.println("TruncatedConeOutline.createHemisphere() listSizeDifference : " + listSizeDifference);
		if(listSizeDifference < 0)
		{
			System.out.println(" Here 1");
			for(int i = 0; i < Math.abs(listSizeDifference); i++)
			{				
				dynamicLineArrays.add(new DynamicLineArray());
			}
		}
		else if (listSizeDifference > 0)
		{
			System.out.println(" Here 2");
			for(int i =0; i < Math.abs(listSizeDifference); i++)
			{
				dynamicLineArrays.remove(i);
			}
		}
		
		System.out.println("dynamicLineArrays.size() : " + dynamicLineArrays.size() );
		
		if(radius > 0)
		{		
			// Generate on arc going from center to edge along on the xZ plane
			List<Point3d> arcPoints = new ArrayList<Point3d>();
			double elevationIncrement = ((apexAngle / 2.0) / numberOfAzimuthDivisions);
			double elevation = 0.0;		
			for(int j = 0; j <= numberOfAzimuthDivisions; j++)
			{
				double x = radius * Math.sin(elevation);				
				double z = radius * Math.cos(elevation);
				
				Point3d point = new Point3d(x,0,z);		
				arcPoints.add(point);
				elevation += elevationIncrement;
			}
			
			// Generate rotated copies to fit the numberOfSidesDivisions						
			double azimuthIncrement = Math.toRadians((360.0 / numberOfSidesDivisions));
			double azimuth = 0.0;		
			for(int i = 0; i <= numberOfSidesDivisions; i++)			
			{							
				Matrix4d rMatrix = new Matrix4d();
				rMatrix.rotZ(azimuth);
				
				List<Point3d> points = new ArrayList<Point3d>();
				for(Point3d point : arcPoints)
				{
					Point3d newPoint = new Point3d(point);
					rMatrix.transform(newPoint);
					points.add(newPoint);						
				}
				// Update the array with the point.		
				dynamicLineArrays.get(i).addAll(points);
				azimuth += azimuthIncrement;
			}
		}
		else
		{
			dynamicLineArrays.get(0).add(new Point3d(0, 0, radius));
		}
	}
}
