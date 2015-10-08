/**
 * Canadian Space Agency 2008.
 *
 * $Id: DigitalElevationMapSamplerImpl.java,v 1.2.4.7 2015/09/23 12:45:14 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.vecmath.Point3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.IJobManager;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

import ca.gc.space.mrt.common.processors.impl.ProcessorImpl;
import ca.gc.space.mrt.geometry.data3d.Activator;
import ca.gc.space.mrt.geometry.data3d.CartesianAxis;
import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSetExtent;
import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangle;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangularMesh;
import ca.gc.space.mrt.geometry.data3d.Data3dFacade;
import ca.gc.space.mrt.geometry.data3d.Data3dFactory;
import ca.gc.space.mrt.geometry.data3d.Data3dPackage;
import ca.gc.space.mrt.geometry.data3d.DigitalElevationMap;
import ca.gc.space.mrt.geometry.data3d.DigitalElevationMapMesher;
import ca.gc.space.mrt.geometry.data3d.DigitalElevationMapSampler;
import ca.gc.space.mrt.geometry.data3d.Geometry3dUtilities;
import edu.wlu.cs.levy.CG.KDTree;
import edu.wlu.cs.levy.CG.KeySizeException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Digital Elevation Map Sampler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.DigitalElevationMapSamplerImpl#getTargetResolution <em>Target Resolution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DigitalElevationMapSamplerImpl extends ProcessorImpl<DigitalElevationMap, DigitalElevationMap> implements DigitalElevationMapSampler 
{
	private double[] queryBuffer1;
	private double[] queryBuffer2;
	
	/**
	 * The default value of the '{@link #getTargetResolution() <em>Target Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetResolution()
	 * @generated
	 * @ordered
	 */
	protected static final double TARGET_RESOLUTION_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getTargetResolution() <em>Target Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetResolution()
	 * @generated
	 * @ordered
	 */
	protected double targetResolution = TARGET_RESOLUTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitalElevationMapSamplerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data3dPackage.Literals.DIGITAL_ELEVATION_MAP_SAMPLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setInput(DigitalElevationMap newInput) {
		super.setInput(newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setOutput(DigitalElevationMap newOutput) {
		super.setOutput(newOutput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTargetResolution() {
		return targetResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetResolution(double newTargetResolution) {
		double oldTargetResolution = targetResolution;
		targetResolution = newTargetResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.DIGITAL_ELEVATION_MAP_SAMPLER__TARGET_RESOLUTION, oldTargetResolution, targetResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Data3dPackage.DIGITAL_ELEVATION_MAP_SAMPLER__TARGET_RESOLUTION:
				return getTargetResolution();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Data3dPackage.DIGITAL_ELEVATION_MAP_SAMPLER__TARGET_RESOLUTION:
				setTargetResolution((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Data3dPackage.DIGITAL_ELEVATION_MAP_SAMPLER__TARGET_RESOLUTION:
				setTargetResolution(TARGET_RESOLUTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Data3dPackage.DIGITAL_ELEVATION_MAP_SAMPLER__TARGET_RESOLUTION:
				return targetResolution != TARGET_RESOLUTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (targetResolution: ");
		result.append(targetResolution);
		result.append(')');
		return result.toString();
	}

	@Override
	public DigitalElevationMap process(DigitalElevationMap input) throws Exception 
	{
		setInput(input);		
					
		// Meshes the original DEM.
		DigitalElevationMapMesher mesher = Data3dFactory.eINSTANCE.createDigitalElevationMapMesher();
		CartesianTriangularMesh mesh = mesher.process(getInput());		
		
		List<CartesianPositionCoordinates> gridPoints = createSamplingGrid(getInput(), getTargetResolution());
		setOutput(sample(mesh, gridPoints));
		
		return getOutput();
	}	
	
	private List<CartesianPositionCoordinates> createSamplingGrid(DigitalElevationMap dem, double resolution)
	{
		List<CartesianPositionCoordinates> result = new ArrayList<CartesianPositionCoordinates>();
		
		int xDim = getTargetDEMXDimension();
		int yDim = getTargetDEMYDimension();
						
		double minX = getMinX();
		double minY = getMinY();		
		double x = getMinX();
		double y = minY;
		for(int i = 0; i < xDim; i++)
		{	
			x = minX + i * getTargetResolution();			
			for(int j = 0; j < yDim; j++)
			{
				y = minY + j * getTargetResolution();
				result.add(Data3dFacade.INSTANCE.createCartesianPositionCoordinates(x, y, 0));
			}			
		}				
		
		return result;
	}

	private DigitalElevationMap sample(CartesianTriangularMesh mesh, List<CartesianPositionCoordinates> samplingGrid)
	{				
		DigitalElevationMap result = Data3dFactory.eINSTANCE.createDigitalElevationMap();		
		
		SubMonitor subMonitor = SubMonitor.convert(progressMonitor, 4);
		
		// First, generate the sampling grid.
		Point3d[][] pixelsLocation = getPixelsLocation(mesh, getTargetResolution(), subMonitor.newChild(1));
		
		// Create KD Tree.		
		KDTree kdTree = createTriangleKDTree(mesh, subMonitor.newChild(1));

		// Finds the intersection points.
		Point3d[][] pixelsIntersectionPoints = getPixelsIntersectionPoints(pixelsLocation, mesh, kdTree, getTargetResolution(), subMonitor.newChild(1));
		
		// Populates the DEM
		int numberPixelAlongX = pixelsLocation.length;
		int numberPixelAlongY = pixelsLocation[0].length;
		for(int i=0; i< numberPixelAlongX; i++)
		{
			for(int j=0; j< numberPixelAlongY; j++)
			{
				Point3d point = pixelsIntersectionPoints[i][j];						
				if(point != null)
				{							
					CartesianPositionCoordinates p = Data3dFacade.INSTANCE.createCartesianPositionCoordinates(point.x, point.y, point.z);
					result.getPoints().add(p);
				}
			}	
		}
		
		result.setXDimension(numberPixelAlongX);
		result.setYDimension(numberPixelAlongY);
		
		return result;
	}
	
//	private DigitalElevationMap sample(CartesianTriangularMesh mesh, List<CartesianPositionCoordinates> samplingGrid)
//	{
//		DigitalElevationMap result = Data3dFactory.eINSTANCE.createDigitalElevationMap();
//		
//		System.out.println("Getting projections....");
//		CartesianPositionCoordinates[] projections = Geometry3dUtilities.getProjectionAlongAxisOnToPolygon(CartesianAxis.Z, samplingGrid, mesh.getPolygons());
//		System.out.println("Getting projections : Done.");
//		
//		List<CartesianPositionCoordinates> points = new ArrayList<CartesianPositionCoordinates>();
//		for(int i = 0; i < samplingGrid.size(); i++)
//		{
//			double x = samplingGrid.get(i).getX();
//			double y = samplingGrid.get(i).getY();;
//			double z = 0.0;
//			
//			if(projections[i] != null)
//			{
//				z = projections[i].getZ();
//			}
//			else
//			{
//				System.err.println("(projections[" +  i + "] is null ! " + x + " " + y );
//			}
//			points.add(Data3dFacade.INSTANCE.createCartesianPositionCoordinates(x, y, z));					
//		}
//		result.getPoints().addAll(points);
//		result.setXDimension(getTargetDEMXDimension());
//		result.setYDimension(getTargetDEMYDimension());
//		
//		return result;
//	}
	
	private double getMaxX()
	{
		double max = Double.NEGATIVE_INFINITY;
		for(CartesianPositionCoordinates p : getInput().getPoints())
		{
			if(p.getX() > max) max = p.getX();
		}
		
		return max;
	}
	
	private double getMaxY()
	{
		double max = Double.NEGATIVE_INFINITY;
		for(CartesianPositionCoordinates p : getInput().getPoints())
		{
			if(p.getY() > max) max = p.getY();
		}
		
		return max;
	}
	
	private double getMinX()
	{
		double min = Double.POSITIVE_INFINITY;
		for(CartesianPositionCoordinates p : getInput().getPoints())
		{
			if(p.getX() < min) min = p.getX();
		}
		
		return min;
	}
	
	private double getMinY()
	{
		double min = Double.POSITIVE_INFINITY;
		for(CartesianPositionCoordinates p : getInput().getPoints())
		{
			if(p.getY() < min) min = p.getY();
		}
		
		return min;
	}
	
	private int getTargetDEMXDimension()
	{
		double min = getMinX();
		double max = getMaxX();				
		
		return ((int) Math.floor((max -min) / getTargetResolution()) + 1); 
	}
	
	private int getTargetDEMYDimension()
	{
		double min = getMinY();
		double max = getMaxY();
		
		return ((int) Math.floor((max -min) / getTargetResolution()) + 1);
	}
	
	
	@SuppressWarnings("unchecked")
	protected List<CartesianTriangle> findClosestTriangles(KDTree kdTree, Point3d centerPoint)
	{
		List<CartesianTriangle> closestTriangle = new ArrayList<CartesianTriangle>();
		
		double key[] = new double[] {centerPoint.getX(), centerPoint.getY()};
		try 
		{
			// TODO Object[] range = kdTree.nearest(key, 6);
			Object[] range = kdTree.nearest(key, 6);
			
			for(int i =0; i < range.length; i++)
			{
				if(range[i] instanceof List)
				{
					closestTriangle.addAll((List<CartesianTriangle> ) range[i]);
				}
			}
		} 
		catch (IllegalArgumentException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (KeySizeException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}						
		
		return closestTriangle;
	}
	
	private double[]getQueryBuffer1()
	{	
		if (queryBuffer1 == null) {
			queryBuffer1 = new double[2];
		}
		return queryBuffer1;
	}

	private double[] getQueryBuffer2() 
	{
		if (queryBuffer2 == null) {
			queryBuffer2 = new double[2];
		}
		return queryBuffer2;
	}

	
	@SuppressWarnings("unchecked")
	protected List<CartesianTriangle> findTrianglesWithinRadius(KDTree kdTree, double radius, Point3d centerPoint)
	{
		List<CartesianTriangle> trianglesWithinRadius = new ArrayList<CartesianTriangle>();
		
		// The lower bound.
		getQueryBuffer1()[0] = centerPoint.getX() - Math.abs(radius);
		getQueryBuffer1()[1] = centerPoint.getY() - Math.abs(radius);		

		// The upper bound.
		getQueryBuffer2()[0] = centerPoint.getX() + Math.abs(radius);
		getQueryBuffer2()[1] = centerPoint.getY() + Math.abs(radius);

		try
		{
			Object[] range = kdTree.range(getQueryBuffer1(), getQueryBuffer2());
			for(int i =0; i < range.length; i++)
			{
				if(range[i] instanceof List)
				{
					trianglesWithinRadius.addAll((List<CartesianTriangle> ) range[i]);
				}
			}
		}
		catch (KeySizeException e) 
		{			
			e.printStackTrace();
		}
		
		return trianglesWithinRadius;
	}
	
	protected int getNumberOfProcessorToUse()
	{
		int cores = Runtime.getRuntime().availableProcessors();
		if(cores > 1)
		{
			// Leave one cores free.
			cores = cores - 1;
		}
		
		return cores;		
	}
	
	protected KDTree createTriangleKDTree(CartesianTriangularMesh mesh, IProgressMonitor progressMonitor)
	{
		CreateKDTreeJob job = new CreateKDTreeJob("Create KD Tree", "KDTreeCreation", mesh);
		
		try 
		{
			job.setProgressGroup(progressMonitor, job.getNumberOfTicks());
			job.schedule();
			job.join();
			return job.getOutput();
		} 
		catch (InterruptedException e) 
		{			
			e.printStackTrace();
			return null;
		}
	}
	
	protected class CreateKDTreeJob extends CustomJob<KDTree>
	{
		protected CartesianTriangularMesh mesh = null;
		protected KDTree kdTree;
		
		public CreateKDTreeJob(String name, String family, CartesianTriangularMesh mesh)
		{
			super(name, family);
			this.mesh = mesh;
			numberOfTicks = mesh.getPolygons().size();
		}
		
		@Override
		protected IStatus run(IProgressMonitor monitor) 
		{
			monitor.beginTask("Create KD Tree", numberOfTicks);
			Logger.INSTANCE.log(Activator.ID, this, "KDTree building starts...", EventSeverity.INFO);
			
			long startTime = System.currentTimeMillis();
			kdTree = new KDTree(2);
			
			long keyCount = 0;
			for(CartesianTriangle triangle : mesh.getPolygons())
			{						
				for(CartesianPositionCoordinates vertex : triangle.getVertices())
				{				
					// Finds all the triangles sharing the vertex.
					List<CartesianTriangle> triangles = mesh.getPolygonsSharingPoint(vertex);
					triangles.add(triangle);
					
					CartesianPositionCoordinates center = triangle.getCentroid();
					double key[] = new double[] {center.getX(), center.getY()};
					try 
					{
						kdTree.insert(key, triangles);
						keyCount++;
					} 
					catch (Exception e) 
					{							
					} 				
				}		
				
				monitor.worked(1);
			}
			long endTime = System.currentTimeMillis();
			double duration = (endTime - startTime) * 0.001;
			
			Logger.INSTANCE.log(Activator.ID, this, "KDTree built completed. KDTree contains <" + keyCount + "> keys and was built in <" + duration + "> seconds.", EventSeverity.OK);
			
			
			return Status.OK_STATUS;
		}
		
		@Override
		public KDTree getOutput() 
		{		
			return kdTree;
		}
	}
	
	/**
	 * Return the array of location (on the XT plane) of the center of each of the pixel to be
	 * generated in the image.
	 * @param mesh The mesh to generate the pixel position for.
	 * @return The array of pixel position in the XY plane.
	 */
	protected Point3d[][] getPixelsLocation(CartesianTriangularMesh mesh, double resolution, IProgressMonitor progressMonitor)
	{				
		CreatePixelLocationJob job = new CreatePixelLocationJob("Get Pixel Locations", "GetPixelLocation", mesh, resolution);		
		SubMonitor subMonitor = SubMonitor.convert(progressMonitor, job.getNumberOfTicks());
		try 
		{
			job.setProgressGroup(subMonitor, job.getNumberOfTicks());
			job.schedule();
			job.join();
			return job.getOutput();
		} 
		catch (InterruptedException e) 
		{			
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Base class of the custom job used to generate images.
	 * @author pallard
	 */
	protected abstract class CustomJob<T> extends Job
	{
		protected String name;
		protected String family;
		protected int numberOfTicks = 0;
		
		/**
		 * Job constructor
		 * @param name The name of the Job.
		 * @param family The family to which this job belongs.
		 */
		public CustomJob(String name, String family)
		{
			super(name);
			this.name = name;
			this.family = family;
		}
		
		@Override
		public boolean belongsTo(Object family) 
		{		
			return this.family.equals(family);
		}	
		
		public int getNumberOfTicks()
		{
			return numberOfTicks;
		}				
		
		/**
		 * Return the result of this job processing.
		 * @return
		 */
		public abstract T getOutput();
	}
	
	
	/**
	 * Base class for Custom Job which process are using the pixel position array as their basis.
	 * @author pallard
	 *
	 */
	protected abstract class ProcessArrayJob<T> extends CustomJob<T>
	{	
		protected int xStartIndex = 0;
		protected int xEndIndex = 0;
		protected Point3d[][] pixelsLocation;		
		protected CartesianTriangularMesh mesh;
		
		/**
		 * 
		 * @param name
		 * @param family
		 * @param xStartIndex
		 * @param xEndIndex
		 * @param mesh
		 * @param directedGraph
		 */
		public ProcessArrayJob(String name, String family, int xStartIndex, int xEndIndex, CartesianTriangularMesh mesh, Point3d[][] pixelsLocation) 
		{
			super(name, family);		
			this.xStartIndex = xStartIndex;
			this.xEndIndex = xEndIndex;
			this.mesh = mesh;	
			this.pixelsLocation = pixelsLocation;
		}			
	}
	
	/**
	 * Job that generate the array of location (on the XT plane) of the center of each of the pixel to be generated in the image.	 * 
	 */
	protected class CreatePixelLocationJob extends CustomJob<Point3d[][]>
	{
		protected CartesianTriangularMesh mesh = null;
		protected CartesianCoordinatesSetExtent extent = null;
		protected double resolution = 1;
		
		protected Point3d[][] points;
		
		protected int numberPointsAlongX = 0;
		protected int numberPointsAlongY = 0;
		
		
		/**
		 * Job constructor.
		 * @param name The name of the job.
		 * @param family The job familly.
		 * @param mesh The mesh for which to generate the pixel location.
		 */
		public CreatePixelLocationJob(String name, String family, CartesianTriangularMesh mesh, double resolution)
		{
			super(name, family);
			this.mesh = mesh;					
			this.extent = mesh.getExtent();
			this.resolution = resolution;
			
			// Update the number of pixel along X and Y and the number of tick.
			numberPointsAlongX = (int) Math.round(extent.getXDimension() / resolution);
			numberPointsAlongY = (int) Math.round(extent.getYDimension() / resolution);
			numberOfTicks = numberPointsAlongX * numberPointsAlongY;	
		}
		
		@Override
		protected IStatus run(IProgressMonitor monitor) 
		{										
			monitor.beginTask("Create Pixel Location", numberOfTicks);
			points = new Point3d[numberPointsAlongX][numberPointsAlongY];
			
			double xIncrement = resolution;
			double yIncrement = resolution;
			
			double x = extent.getXMin() + (xIncrement / 2.0);	
			for(int i = 0; i < numberPointsAlongX; i++)
			{								
				if(monitor.isCanceled()) return Status.CANCEL_STATUS;
				
				double y = extent.getYMin() + (yIncrement / 2.0);
				for(int j = 0; j < numberPointsAlongY; j++)
				{
					Point3d point = new Point3d(x, y, 0);
					points[i][j] = point;
					
					// Increment y
					y += yIncrement;
				}
				
				monitor.worked(numberPointsAlongY);
				
				// Increment x
				x += xIncrement;						
			}
			
			return Status.OK_STATUS;
		}
				
		
		@Override
		public Point3d[][] getOutput() 
		{
			return points;
		}					
	}
	
	/**
	 * Return the array of the intersection points on the mesh for a given array of pixel position in the XY plane. 
	 * @param pixelsLocation The array of pixel position in the XY plane.
	 * @param mesh The mesh to generate the intersection position for. 
	 * @return The array of intersection position on the mesh. For case where no intersection is found, null will be put into the array.
	 */
	protected Point3d[][] getPixelsIntersectionPoints(Point3d[][] pixelsLocation, CartesianTriangularMesh mesh, KDTree kdTree, double averagingRadius, IProgressMonitor progressMonitor)
	{		
		progressMonitor.subTask("Finding pixel intersection with mesh.");
		
		int numberPixelAlongX = pixelsLocation.length;
		int numberPixelAlongY = pixelsLocation[0].length;
		
		final Point3d[][] intersectionPoints = new Point3d[numberPixelAlongX][numberPixelAlongY];						
		
		int numberOfJobs = getNumberOfProcessorToUse();		
		int xIndexSlotSize = Math.floorDiv(numberPixelAlongX, numberOfJobs);

		int xStartIndex = 0;
		int xEndIndex = xIndexSlotSize;				
		String family = "GetPixelsIntersectionPoints";
		
		for(int jobNumber = 0; jobNumber < numberOfJobs; jobNumber++)
		{						
			String jobName = "GetPixel Intersection (" + Integer.toString(jobNumber + 1) + " of " +  numberOfJobs + ") [" + xStartIndex + " ," + xEndIndex + "]";
			new GetPixelsIntersectionPointsJob(jobName, "GetPixelsIntersectionPoints", xStartIndex, xEndIndex, mesh, pixelsLocation, intersectionPoints, kdTree, averagingRadius).schedule();
			
			// Increment the indices.
			xStartIndex += xIndexSlotSize + 1 ;
			xEndIndex = xStartIndex + xIndexSlotSize;
			if(xEndIndex >= numberPixelAlongX) xEndIndex = numberPixelAlongX - 1;
		}
		
		try 
		{
			IJobManager manager = Job.getJobManager();
			manager.join(family, progressMonitor);
		} 
		catch (Exception e) 
		{			
		}
		progressMonitor.done();
		
		Logger.INSTANCE.log(Activator.ID, this, "getPixelsIntersectionPoints() completed.", EventSeverity.OK);
		
		return intersectionPoints;
	}
	
	/**
	 * Job that finds the intersection point on the mesh for each of the pixel location.
	 * @author pallard
	 *
	 */
	protected class GetPixelsIntersectionPointsJob extends ProcessArrayJob<Point3d[][]>
	{
		protected KDTree kdTree;		
		protected Point3d[][] intersectionPoints;
		protected double averagingRadius = 0;
		
		public GetPixelsIntersectionPointsJob(String name, String family, int xStartIndex, int xEndIndex, CartesianTriangularMesh mesh, Point3d[][] pixelsLocation, Point3d[][] intersectionPoints, KDTree kdTree, double averagingRadius) 
		{
			super(name, family, xStartIndex, xEndIndex,mesh, pixelsLocation);
			this.kdTree = kdTree;			
			this.intersectionPoints = intersectionPoints;
			this.averagingRadius = averagingRadius;
			
			numberOfTicks = xEndIndex - xStartIndex;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) 
		{	
			SubMonitor subMonitor = SubMonitor.convert(monitor, getNumberOfTicks());			
			subMonitor.beginTask("Get Pixel Intersections", numberOfTicks);
			int numberPixelAlongY = pixelsLocation[0].length;
									
			for(int i = xStartIndex; i <= xEndIndex; i++)
			{	
				// Bail out if cancel is requested.
				if(monitor.isCanceled()) return Status.CANCEL_STATUS;

				for(int j = 0; j < numberPixelAlongY; j++)
				{
					// Bail out if cancel is requested.
					if(monitor.isCanceled()) return Status.CANCEL_STATUS;

					Point3d point = pixelsLocation[i][j];
					
					// Finds the list of triangle closest to the pixel.
					// List<CartesianTriangle> triangles = findTrianglesWithinRadius(kdTree, averagingRadius, point);
					List<CartesianTriangle> triangles = findClosestTriangles(kdTree, point);
					
					Iterator<CartesianTriangle> it = triangles.iterator();
					
					CartesianPositionCoordinates projection = null;
					while(it.hasNext() && projection == null)
					{						
						projection = Geometry3dUtilities.getProjectionAlongAxisOnToPolygon(CartesianAxis.Z, point, it.next());
						if(projection != null)
						{
							intersectionPoints[i][j] = projection.asPoint3d();
						}
					}										
				}
				
				subMonitor.worked(1);
			}
			return Status.OK_STATUS;
		}
				
		@Override
		public Point3d[][] getOutput() 
		{		
			return intersectionPoints;
		}
		
		
		protected Point3d getAveragedHeight(KDTree kdTree, CartesianPositionCoordinates projection, double averagingRadius)
		{
			if(averagingRadius > 0)
			{
				List<CartesianTriangle> triangles = findTrianglesWithinRadius(kdTree, averagingRadius, projection.asPoint3d());
				
				// Finds the weighted (by surface area) height average.
				double averagedHeight = 0;
				double totalSurface = 0;
				for(CartesianTriangle triangle : triangles)
				{
					totalSurface += triangle.getSurface();
					averagedHeight += totalSurface * triangle.getCentroid().getZ();		
				}
				
				averagedHeight = averagedHeight / totalSurface;				
				return new Point3d(projection.getX(), projection.getY(), averagedHeight);
			}
			else
			{
				return projection.asPoint3d();
			}						
		}
	}
	
	protected class GetPixelsIntersectionTrianglesJob extends ProcessArrayJob<CartesianTriangle[][]>
	{
		protected KDTree kdTree;	
		protected CartesianTriangle[][] intersectionTriangles;
		protected double averagingRadius = 0;
		
		public GetPixelsIntersectionTrianglesJob(String name, String family, int xStartIndex, int xEndIndex, CartesianTriangularMesh mesh, Point3d[][] pixelsLocation, CartesianTriangle[][] intersectionTriangles, KDTree kdTree, double averagingRadius)
		{
			super(name, family, xStartIndex, xEndIndex,mesh, pixelsLocation);
			this.kdTree = kdTree;
			this.averagingRadius = averagingRadius;
			this.intersectionTriangles = intersectionTriangles;
			
			numberOfTicks = xEndIndex - xStartIndex;
		}
		
		@Override
		protected IStatus run(IProgressMonitor monitor) 
		{
			SubMonitor subMonitor = SubMonitor.convert(monitor, getNumberOfTicks());			
			subMonitor.beginTask("Get Pixel Intersections Triangles", numberOfTicks);
			int numberPixelAlongY = pixelsLocation[0].length;
									
			for(int i = xStartIndex; i <= xEndIndex; i++)
			{	
				// Bail out if cancel is requested.
				if(monitor.isCanceled()) return Status.CANCEL_STATUS;
				
				for(int j = 0; j < numberPixelAlongY; j++)
				{
					// Bail out if cancel is requested.
					if(monitor.isCanceled()) return Status.CANCEL_STATUS;
					
					Point3d point = pixelsLocation[i][j];
					
					// Finds the list of triangle closest to the pixel.				
					List<CartesianTriangle> triangles = findClosestTriangles(kdTree, point);
					
					Iterator<CartesianTriangle> it = triangles.iterator();
					
					// Goes through the list of closest triangle to fin the one that intersects with the pixel location.
					CartesianPositionCoordinates projection = null;
					while(it.hasNext() && projection == null)
					{			
						// Bail out if cancel is requested.
						if(monitor.isCanceled()) return Status.CANCEL_STATUS;
						
						CartesianTriangle triangle = it.next();
						projection = Geometry3dUtilities.getProjectionAlongAxisOnToPolygon(CartesianAxis.Z, point, triangle);
						if(projection != null)
						{
							intersectionTriangles[i][j] = triangle;
						}
					}										
				}
				
				subMonitor.worked(1);
			}
			subMonitor.done();
			return Status.OK_STATUS;
		}
		
		@Override
		public CartesianTriangle[][] getOutput() 
		{			
			return intersectionTriangles;
		}
	}
} //DigitalElevationMapSamplerImpl
