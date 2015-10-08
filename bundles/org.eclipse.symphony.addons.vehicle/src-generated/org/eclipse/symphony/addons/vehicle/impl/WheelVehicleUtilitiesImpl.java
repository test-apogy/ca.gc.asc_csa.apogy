/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point2d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.addons.vehicle.Line3d;
import org.eclipse.symphony.addons.vehicle.MeshExtent2D;
import org.eclipse.symphony.addons.vehicle.Plane;
import org.eclipse.symphony.addons.vehicle.Segment2D;
import org.eclipse.symphony.addons.vehicle.SymphonyToolsVehicleFactory;
import org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage;
import org.eclipse.symphony.addons.vehicle.TerrainProfile;
import org.eclipse.symphony.addons.vehicle.WheelVehicleUtilities;

import Jama.Matrix;
import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangle;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangularMesh;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wheel Vehicle Utilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class WheelVehicleUtilitiesImpl extends MinimalEObjectImpl.Container implements WheelVehicleUtilities
{
	private static WheelVehicleUtilities instance = null;

	public static WheelVehicleUtilities getInstance() 
	{
		if (instance == null) 
		{
			instance = new WheelVehicleUtilitiesImpl();
		}
		return instance;
	}
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected WheelVehicleUtilitiesImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return SymphonyToolsVehiclePackage.Literals.WHEEL_VEHICLE_UTILITIES;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Point2d getWheelCenterPoint(double wheelRadius, double wheelCenterX, Segment2D segment)
  {
		Point2d p1 =  segment.p1;
		Point2d p2 =  segment.p2;
		
		// The wheel center point.
		Point2d pc = null;
		
		// Parameter for line going through P1 and P2. 
		double m = (p2.y - p1.y) / (p2.x - p1.x);
		double b = p2.y - (m * p2.x);
		
		// Intersection between line and vertical wheel center line.
		Point2d pi = new Point2d(wheelCenterX, m * wheelCenterX + b);
		
		// Computes the position of the point tangent to the circle on the line
		double l = wheelRadius * m;							
		double theta = Math.atan(m);		
		double dx = l * Math.cos(theta);
		double dy = l * Math.sin(theta);		
		Point2d pt = new Point2d(pi.x + dx, pi.y + dy);
				
		if(isPointOnSegment(pt, segment))
		{
			// Wheel Center
			double d = Math.sqrt(Math.pow(wheelRadius, 2.0) + Math.pow(l, 2.0));
			pc = new Point2d(wheelCenterX, pi.y + d);			
		}
		else
		{
			// Test end points.
			
			// Test P1
			Point2d pc1 = null;
			double determinant = Math.pow(wheelRadius, 2.0) - Math.pow((wheelCenterX - p1.x), 2.0);
			if(determinant >= 0)
			{
				double deltaY = Math.sqrt(determinant);
				pc1 = new Point2d(wheelCenterX, p1.y + deltaY);		
			}
			
			// Test P2
			Point2d pc2 = null;
			determinant = Math.pow(wheelRadius, 2.0) - Math.pow((wheelCenterX - p2.x), 2.0);
			if(determinant >= 0)
			{
				double deltaY = Math.sqrt(determinant);
				pc2 = new Point2d(wheelCenterX, p2.y + deltaY);		
			}
			
			if(pc1 != null)
			{
				if(pc2 != null)
				{
					if(pc1.y > pc2.y)
					{
						pc = pc1;
					}
					else
					{
						pc = pc2;
					}
				}
				else
				{
					pc = pc1;
				}
			}
			else if(pc2 != null)
			{
				pc = pc2;
			}		
		}
	
		return pc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Point2d getWheelCenterPoint(double wheelRadius, double wheelCenterX, TerrainProfile terrainProfile)
  {
	  Point2d center = null;
		
		Iterator<Segment2D> it = terrainProfile.getSegments().iterator();		
		while(it.hasNext())
		{
			// Next segment.			
			Segment2D segment = it.next();
			try
			{
				Point2d c = getWheelCenterPoint(wheelRadius, wheelCenterX, segment);
				if(c != null)
				{
					if(center == null)
					{
						center = c;
					}
					else
					{
						if(c.y > center.y)
						{
							center = c;
						}					
					}				
				}
			}
			catch(Throwable t)
			{
				t.printStackTrace();
			}
		}
		
		return center;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public TerrainProfile findTerrainProfile(CartesianTriangularMesh mesh, Plane plane)
  {
	  	TerrainProfile terrainProfile = new TerrainProfile();
		
		Matrix4d planePose = new Matrix4d();
		planePose.setIdentity();
		
		// Set pose of vector.
		planePose.set(new Vector3d(plane.point));
		
		// Sets the z rotation
		Matrix4d planeRotation = new Matrix4d();
		planeRotation.setIdentity();
		double thetaZ = Math.atan2(plane.normal.x, plane.normal.y);
		planeRotation.rotZ(thetaZ);
				
		planePose.mul(planeRotation);
		planePose.invert();
	  	
		// Test each of the triangle in the mesh.
		for(CartesianTriangle triangle : mesh.getPolygons())
		{
			List<Point3d> intersections = new ArrayList<Point3d>();
			
			Line3d edge1 = new Line3d(triangle.getVertices().get(0).asPoint3d(), triangle.getVertices().get(1).asPoint3d());
			Line3d edge2 = new Line3d(triangle.getVertices().get(1).asPoint3d(), triangle.getVertices().get(2).asPoint3d());
			Line3d edge3 = new Line3d(triangle.getVertices().get(2).asPoint3d(), triangle.getVertices().get(0).asPoint3d());
			
			// Test each triangle side for intersection.
			intersections.addAll(findIntersection(plane, edge1));
			intersections.addAll(findIntersection(plane, edge2));
			intersections.addAll(findIntersection(plane, edge3));
			
			if(intersections.size() == 2)
			{
				// Transforms pa and pb into plane reference frame.
				Point3d pa = new Point3d();
				planePose.transform(intersections.get(0), pa);
				
				Point3d pb = new Point3d();
				planePose.transform(intersections.get(1), pb);			
											
				Point2d p1 = new Point2d(pa.x, pa.z);
				Point2d p2 = new Point2d(pb.x, pb.z);
				
				if(p1.x < p2. x)
				{
					Segment2D segment = new Segment2D(p1, p2);
					terrainProfile.getSegments().add(segment);
				}
				else
				{
					Segment2D segment = new Segment2D(p2, p1);
					terrainProfile.getSegments().add(segment);
				}								
			}
		}
				
		return terrainProfile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public List<Point3d> findIntersection(Plane plane, Line3d line3d)
  {
		List<Point3d> intersections = new ArrayList<Point3d>();
		
		Point3d pointOnPlane = plane.point; 
		Vector3d planeNormal = plane.normal;
		
		
		Point3d p1 = line3d.p1;
		Point3d p2 = line3d.p2;
		
		Vector3d p0 = new Vector3d(pointOnPlane);
		Vector3d i0 = new Vector3d(p1);	
		Vector3d l = new Vector3d(p2.x - p1.x, p2.y - p1.y, p2.z - p1.z);
		l.normalize();
		
		p0.sub(i0);
		
		double numerator = p0.dot(planeNormal);
		double denominator = l.dot(planeNormal);
		
		if(denominator != 0)
		{
			if(numerator != 0)
			{
				double d = numerator / denominator;
				if(d <= p1.distance(p2))
				{
					Vector3d intersection = new Vector3d(i0);
					Vector3d dl = new Vector3d(l);
					dl.scale(d);
					
					intersection.add(dl);				
					intersections.add(new Point3d(intersection));
				}
			}
			else
			{
				// Lines is on the plane
				intersections.add(p1);
				intersections.add(p2);
			}
		}
		else
		{
			// No intersections.
		}
		
		return intersections;	  
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public boolean isPointOnSegment(Point2d p, Segment2D segment)
  {
	  Point2d p1 = segment.p1;
	  Point2d p2 = segment.p2;
	  
	  if((p1.distance(p) == 0) || (p2.distance(p) == 0))
	  {
		  return true;
	  }
	  else
	  {		
		  double epsilon = 1E-3;
		  double p1p2Distance = p2.distance(p1);		
		  double pp1Distance = p.distance(p1);
		  double pp2Distance = p.distance(p2);		
		  return(pp1Distance + pp2Distance <= (p1p2Distance + epsilon));	
	  }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public MeshExtent2D findMeshExtent2D(CartesianTriangularMesh mesh)
  {
	  MeshExtent2D meshExtent2D = SymphonyToolsVehicleFactory.eINSTANCE.createMeshExtent2D();
	  
	  if(mesh.getPoints().size() > 0)
	  {
		  double minX = Double.POSITIVE_INFINITY;
		  double minY = Double.POSITIVE_INFINITY;
		  double maxX = Double.NEGATIVE_INFINITY;
		  double maxY = Double.NEGATIVE_INFINITY;
		  
		  for(CartesianPositionCoordinates point : mesh.getPoints())
		  {
			  Point3d p = point.asPoint3d();
			 
			  if(p.x < minX) minX = p.x;
			  if(p.x > maxX) maxX = p.x;		  		  
			  if(p.y < minY) minY = p.y;
			  if(p.y > maxY) maxY = p.y;			  
		  }
	  
		  meshExtent2D.setMinimumX(minX);
		  meshExtent2D.setMinimumY(minY);
		  meshExtent2D.setMaximumX(maxX);
		  meshExtent2D.setMaximumY(maxY);
	  }
	  
	  return meshExtent2D;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public boolean isWithin(Point3d point, MeshExtent2D meshExtent)
  {
	  return ((point.x >= meshExtent.getMinimumX()) &&
			  (point.x <= meshExtent.getMaximumX()) &&
			  (point.y >= meshExtent.getMinimumY()) &&
			  (point.y <= meshExtent.getMaximumY()) );
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Vector3d findBestFitPlane(List<Point3d> points)
  {
	  if(points.size() >= 3)
	  {
		  double[][] dataArray = new double[points.size()][3];		
		  double[][] zArray = new double[points.size()][1];		
		  
		  // Fills in the arrays used for the Matrix and the Z vector.
		  for(int i = 0; i < points.size(); i++)
		  {
				Point3d p = points.get(i);
				dataArray[i][0] = p.x;
				dataArray[i][1] = p.y;
				dataArray[i][2] = 1.0;			
				zArray[i][0] = p.z;
		  }
		  
		  Jama.Matrix m = new Matrix(dataArray); 								
		  //System.out.println("Matrix\n " + toString(m));	
			
		  Jama.Matrix zVector = new Matrix(zArray);				
		  //System.out.println("zVector\n " + toString(zVector));
		  
		  Matrix mTranspose = m.transpose(); 		
		  Matrix m1 = mTranspose.times(m);
		  Matrix m1Inverse = m1.inverse();
			
		  Matrix m2 = m1Inverse.times(mTranspose);
		  Matrix a = m2.times(zVector);
			
		  Vector3d normal = new Vector3d(a.get(0, 0), a.get(1, 0), -1);
		  normal.normalize();
		  normal.negate();
		  
		  return normal;
	  }
	  else
	  {
		  return null;
	  }
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  @SuppressWarnings("unchecked")
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case SymphonyToolsVehiclePackage.WHEEL_VEHICLE_UTILITIES___GET_WHEEL_CENTER_POINT__DOUBLE_DOUBLE_SEGMENT2D:
				return getWheelCenterPoint((Double)arguments.get(0), (Double)arguments.get(1), (Segment2D)arguments.get(2));
			case SymphonyToolsVehiclePackage.WHEEL_VEHICLE_UTILITIES___GET_WHEEL_CENTER_POINT__DOUBLE_DOUBLE_TERRAINPROFILE:
				return getWheelCenterPoint((Double)arguments.get(0), (Double)arguments.get(1), (TerrainProfile)arguments.get(2));
			case SymphonyToolsVehiclePackage.WHEEL_VEHICLE_UTILITIES___FIND_TERRAIN_PROFILE__CARTESIANTRIANGULARMESH_PLANE:
				return findTerrainProfile((CartesianTriangularMesh)arguments.get(0), (Plane)arguments.get(1));
			case SymphonyToolsVehiclePackage.WHEEL_VEHICLE_UTILITIES___FIND_INTERSECTION__PLANE_LINE3D:
				return findIntersection((Plane)arguments.get(0), (Line3d)arguments.get(1));
			case SymphonyToolsVehiclePackage.WHEEL_VEHICLE_UTILITIES___IS_POINT_ON_SEGMENT__POINT2D_SEGMENT2D:
				return isPointOnSegment((Point2d)arguments.get(0), (Segment2D)arguments.get(1));
			case SymphonyToolsVehiclePackage.WHEEL_VEHICLE_UTILITIES___FIND_MESH_EXTENT2_D__CARTESIANTRIANGULARMESH:
				return findMeshExtent2D((CartesianTriangularMesh)arguments.get(0));
			case SymphonyToolsVehiclePackage.WHEEL_VEHICLE_UTILITIES___IS_WITHIN__POINT3D_MESHEXTENT2D:
				return isWithin((Point3d)arguments.get(0), (MeshExtent2D)arguments.get(1));
			case SymphonyToolsVehiclePackage.WHEEL_VEHICLE_UTILITIES___FIND_BEST_FIT_PLANE__LIST:
				return findBestFitPlane((List<Point3d>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //WheelVehicleUtilitiesImpl
