/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.impl;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.IJobManager;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.traverse.BreadthFirstIterator;

import ca.gc.asc_csa.eclipse.images.core.AbstractEImage;
import ca.gc.asc_csa.eclipse.images.core.EImage;
import ca.gc.asc_csa.eclipse.images.core.EImagesUtilities;
import ca.gc.asc_csa.eclipse.images.core.ImagesCoreFactory;
import ca.gc.asc_csa.eclipse.utils.log.EventSeverity;
import ca.gc.asc_csa.eclipse.utils.log.Logger;
import ca.gc.asc_csa.symphony.environment.Activator;
import ca.gc.asc_csa.symphony.environment.CartesianTriangularMeshDerivedImageMapLayer;
import ca.gc.asc_csa.symphony.environment.CartesianTriangularMeshMapLayer;
import ca.gc.asc_csa.symphony.environment.EnvironmentFacade;
import ca.gc.asc_csa.symphony.environment.RectangularRegion;
import ca.gc.asc_csa.symphony.environment.RectangularVolumeRegion;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;
import ca.gc.space.mrt.geometry.data3d.CartesianAxis;
import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangle;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangularMesh;
import ca.gc.space.mrt.geometry.data3d.Geometry3dUtilities;
import edu.wlu.cs.levy.CG.KDTree;
import edu.wlu.cs.levy.CG.KeySizeException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Triangular Mesh Derived Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.CartesianTriangularMeshDerivedImageMapLayerImpl#getRequiredResolution <em>Required Resolution</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.CartesianTriangularMeshDerivedImageMapLayerImpl#getCartesianTriangularMeshMapLayer <em>Cartesian Triangular Mesh Map Layer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CartesianTriangularMeshDerivedImageMapLayerImpl extends ImageMapLayerImpl implements CartesianTriangularMeshDerivedImageMapLayer 
{
	public static final int TRANSPARENT_COLOR = -1;
	private double[] queryBuffer1;
	private double[] queryBuffer2;
	
	/**
	 * The default value of the '{@link #getRequiredResolution() <em>Required Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredResolution()
	 * @generated
	 * @ordered
	 */
	protected static final double REQUIRED_RESOLUTION_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getRequiredResolution() <em>Required Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredResolution()
	 * @generated
	 * @ordered
	 */
	protected double requiredResolution = REQUIRED_RESOLUTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCartesianTriangularMeshMapLayer() <em>Cartesian Triangular Mesh Map Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartesianTriangularMeshMapLayer()
	 * @generated
	 * @ordered
	 */
	protected CartesianTriangularMeshMapLayer cartesianTriangularMeshMapLayer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianTriangularMeshDerivedImageMapLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEnvironmentPackage.Literals.CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRequiredResolution() {
		return requiredResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredResolution(double newRequiredResolution) {
		double oldRequiredResolution = requiredResolution;
		requiredResolution = newRequiredResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION, oldRequiredResolution, requiredResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshMapLayer getCartesianTriangularMeshMapLayer() {
		if (cartesianTriangularMeshMapLayer != null && cartesianTriangularMeshMapLayer.eIsProxy()) {
			InternalEObject oldCartesianTriangularMeshMapLayer = (InternalEObject)cartesianTriangularMeshMapLayer;
			cartesianTriangularMeshMapLayer = (CartesianTriangularMeshMapLayer)eResolveProxy(oldCartesianTriangularMeshMapLayer);
			if (cartesianTriangularMeshMapLayer != oldCartesianTriangularMeshMapLayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER, oldCartesianTriangularMeshMapLayer, cartesianTriangularMeshMapLayer));
			}
		}
		return cartesianTriangularMeshMapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshMapLayer basicGetCartesianTriangularMeshMapLayer() {
		return cartesianTriangularMeshMapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCartesianTriangularMeshMapLayer(CartesianTriangularMeshMapLayer newCartesianTriangularMeshMapLayer) {
		CartesianTriangularMeshMapLayer oldCartesianTriangularMeshMapLayer = cartesianTriangularMeshMapLayer;
		cartesianTriangularMeshMapLayer = newCartesianTriangularMeshMapLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER, oldCartesianTriangularMeshMapLayer, cartesianTriangularMeshMapLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION:
				return getRequiredResolution();
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER:
				if (resolve) return getCartesianTriangularMeshMapLayer();
				return basicGetCartesianTriangularMeshMapLayer();
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
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION:
				setRequiredResolution((Double)newValue);
				return;
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER:
				setCartesianTriangularMeshMapLayer((CartesianTriangularMeshMapLayer)newValue);
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
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION:
				setRequiredResolution(REQUIRED_RESOLUTION_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER:
				setCartesianTriangularMeshMapLayer((CartesianTriangularMeshMapLayer)null);
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
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION:
				return requiredResolution != REQUIRED_RESOLUTION_EDEFAULT;
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER:
				return cartesianTriangularMeshMapLayer != null;
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
		result.append(" (requiredResolution: ");
		result.append(requiredResolution);
		result.append(')');
		return result.toString();
	}

	@Override
	public RectangularRegion getRegion() 
	{
		return getRectangularVolumeRegion();
	}
	
	@Override
	public double getWidth() 
	{
		return getRegion().getXDimension();
	}
	
	@Override
	public double getHeight() 
	{
		return getRegion().getYDimension();
	}
		
	protected RectangularVolumeRegion getRectangularVolumeRegion()
	{		
		if(getCartesianTriangularMeshMapLayer() != null && getCartesianTriangularMeshMapLayer().getCurrentMesh() != null)
		{
			return EnvironmentFacade.INSTANCE.getRectangularVolumeRegion(getCartesianTriangularMeshMapLayer().getCurrentMesh());
		}
		else
		{
			return null;
		}
	}
	
	protected String getJobFamilyName()
	{
		return "UpdateImage";
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
	
	/**
	 * Returns the number of pixel that will be generated when creating the image.
	 * @param mesh The mesh to generate an image for.
	 * @return The number of pixel that will be generated.
	 */
	protected int getNumberOfPixels(CartesianTriangularMesh mesh)
	{
		RectangularRegion meshRegion = EcoreUtil.copy(getRegion());
				
		int numberPixelAlongX = (int) Math.round(meshRegion.getXDimension() / getRequiredResolution());
		int numberPixelAlongY = (int) Math.round(meshRegion.getYDimension() / getRequiredResolution());
		
		return numberPixelAlongX * numberPixelAlongY;
	}
	
	/**
	 * Return the array of location (on the XT plane) of the center of each of the pixel to be
	 * generated in the image.
	 * @param mesh The mesh to generate the pixel position for.
	 * @return The array of pixel position in the XY plane.
	 */
	protected Point3d[][] getPixelsLocation(CartesianTriangularMesh mesh, IProgressMonitor progressMonitor)
	{				
		CreatePixelLocationJob job = new CreatePixelLocationJob("Get Pixel Locations", "GetPixelLocation", mesh);		
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
	 * Return the array of the intersection triangles on the mesh for a given array of pixel position in the XY plane. 
	 * @param pixelsLocation The array of pixel position in the XY plane.
	 * @param mesh The mesh to generate the intersection position for. 
	 * @return The array of triangles on the mesh. For case where no intersection is found, null will be put into the array.
	 */
	protected CartesianTriangle[][] getPixelsIntersectionTriangle(Point3d[][] pixelsLocation, CartesianTriangularMesh mesh, KDTree kdTree, double averagingRadius, IProgressMonitor progressMonitor)
	{
		progressMonitor.subTask("Finding pixel intersection with mesh.");
		
		int numberPixelAlongX = pixelsLocation.length;
		int numberPixelAlongY = pixelsLocation[0].length;
		
		Logger.INSTANCE.log(Activator.ID, this, "getPixelsIntersectionTriangle() starts .", EventSeverity.OK);
		
		final CartesianTriangle[][] intersectionTriangles = new CartesianTriangle[numberPixelAlongX][numberPixelAlongY];						
		
		int numberOfJobs = getNumberOfProcessorToUse();		
		int xIndexSlotSize = Math.floorDiv(numberPixelAlongX, numberOfJobs);

		int xStartIndex = 0;
		int xEndIndex = xIndexSlotSize;
		String family = "GetPixelsIntersectionTriangle";
		
		long startTime = System.currentTimeMillis();
		for(int jobNumber = 0; jobNumber < numberOfJobs; jobNumber++)
		{						
			String jobName = "GetPixel Intersection Triangle(" + Integer.toString(jobNumber + 1) + " of " +  numberOfJobs + ") [" + xStartIndex + " ," + xEndIndex + "]";
			new GetPixelsIntersectionTrianglesJob(jobName, family, xStartIndex, xEndIndex, mesh, pixelsLocation, intersectionTriangles, kdTree, averagingRadius).schedule();
			
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
		
		long endTime = System.currentTimeMillis();
		double duration = (endTime - startTime) * 0.001;
		Logger.INSTANCE.log(Activator.ID, this, "getPixelsIntersectionTriangle() completed in <" + duration + "> seconds.", EventSeverity.OK);
		
		return intersectionTriangles;
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
	 * Return the array of normal associated with the pixel position.
	 * @param pixelsLocation The array of pixel location.
	 * @param pixelsIntersectionTriangles The array of pixel triangles.
	 * @param mesh The mesh.
	 * @param kdTree The KdTree of triangles.
	 * @param averagingRadius The radius of averaging used to compute the normals (NOT USED).
	 * @param progressMonitor The progress monitor used to report progress.
	 * @return The array of normals.
	 */
	protected Vector3d[][] getNormals(Point3d[][] pixelsLocation, CartesianTriangle[][] pixelsIntersectionTriangles, CartesianTriangularMesh mesh, KDTree kdTree, double averagingRadius, IProgressMonitor progressMonitor)
	{
		int numberPixelAlongX = pixelsLocation.length;
		int numberPixelAlongY = pixelsLocation[0].length;
		
		Vector3d[][] normalArray = new Vector3d[numberPixelAlongX][numberPixelAlongY];
		
		int numberOfJobs = getNumberOfProcessorToUse();		
		int xIndexSlotSize = Math.floorDiv(numberPixelAlongX, numberOfJobs);

		int xStartIndex = 0;
		int xEndIndex = xIndexSlotSize;
		String family = "GetNormals";
		
		for(int jobNumber = 0; jobNumber < numberOfJobs; jobNumber++)
		{						
			String jobName = "GetNormals (" + Integer.toString(jobNumber + 1) + " of " +  numberOfJobs + ") [" + xStartIndex + " ," + xEndIndex + "]";
			new GetNormalsJob(jobName, family, xStartIndex,  xEndIndex, normalArray, pixelsLocation, pixelsIntersectionTriangles, mesh,  kdTree, averagingRadius, progressMonitor).schedule();
			
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
		
		return normalArray;
	}
	
	/**
	 * Creates a directed graph connecting the mesh triangles.
	 * @param mesh The mesh to generate the triangle graph for.  
	 * @return The directed graph of the triangles.
	 */
	protected DirectedGraph<CartesianTriangle, DefaultEdge> createMeshGraph(CartesianTriangularMesh mesh, IProgressMonitor progressMonitor)
	{
		DirectedGraph<CartesianTriangle, DefaultEdge> directedGraph = new DefaultDirectedGraph<CartesianTriangle, DefaultEdge>(DefaultEdge.class);		
		
		// Adds all triangles to the graph
		for(CartesianTriangle triangle : mesh.getPolygons())
		{
			directedGraph.addVertex(triangle);	
		}

		// Adds edges between triangles representing neighbors relationships.
		for(CartesianTriangle triangle : mesh.getPolygons())
		{
			List<CartesianTriangle> neighbours = mesh.getPolygonNeighbours(triangle);
			for(CartesianTriangle neighbour : neighbours)
			{
				if(!directedGraph.containsEdge(triangle, neighbour))
				{
					directedGraph.addEdge(triangle, neighbour);
				}
				
				if(!directedGraph.containsEdge(neighbour, triangle))
				{
					directedGraph.addEdge(neighbour, triangle);						
				}
			}		
		}
		
		progressMonitor.done();
		
		return directedGraph;
	}
	
	/**
	 * Create a BreadthFirstIterator from a given directedGraph and start triangle.
	 * @param directedGraph The directed graph of the triangles.
	 * @param startTriangle The start triangle, can be null.
	 * @return the BreadthFirstIterator.
	 */
	protected BreadthFirstIterator<CartesianTriangle, DefaultEdge> createBreadthFirstIterator(DirectedGraph<CartesianTriangle, DefaultEdge> directedGraph, CartesianTriangle startTriangle)
	{
		if(startTriangle != null)
		{
			return new BreadthFirstIterator<CartesianTriangle, DefaultEdge>(directedGraph, startTriangle);
		}
		else
		{
			return new BreadthFirstIterator<CartesianTriangle, DefaultEdge>(directedGraph);
		}
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

	
	protected AbstractEImage convertToImage(int[][] pixelColors,  IProgressMonitor progressMonitor)
	{
		int width = pixelColors.length;
		int height = pixelColors[0].length;
		
		BufferedImage bufferedImage = EImagesUtilities.INSTANCE.createTransparentImage(width, height).asBufferedImage();
		
		for(int x=0; x< width; x++)
		{
			for(int y= 0; y < height; y++)
			{
				int rgb = pixelColors[x][y];
				
				if(rgb != TRANSPARENT_COLOR)
				{			
					bufferedImage.setRGB(x, height -1 - y, rgb);
				}
			}	
			
			progressMonitor.worked(height);
		}
		
		EImage eImage = ImagesCoreFactory.eINSTANCE.createEImage();
		eImage.setImageContent(bufferedImage);
		
		return eImage;
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
		 * Retruen the result of this job processing.
		 * @return
		 */
		public abstract T getOutput();
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
	 * Job that generate the array of location (on the XT plane) of the center of each of the pixel to be generated in the image.	 * 
	 */
	protected class CreatePixelLocationJob extends CustomJob<Point3d[][]>
	{
		protected CartesianTriangularMesh mesh = null;
		protected Point3d[][] points;
		
		protected int numberPixelAlongX = 0;
		protected int numberPixelAlongY = 0;
		protected RectangularRegion meshRegion;
		
		/**
		 * Job constructor.
		 * @param name The name of the job.
		 * @param family The job familly.
		 * @param mesh The mesh for whic to generate the pixel location.
		 */
		public CreatePixelLocationJob(String name, String family, CartesianTriangularMesh mesh)
		{
			super(name, family);
			this.mesh = mesh;
			
			// Gets the RectangularRegion covered by the mesh.
			meshRegion = EcoreUtil.copy(getRegion());
				
			// Update the number of pixel along X and Y and the number of tick.
			numberPixelAlongX = (int) Math.round(meshRegion.getXDimension() / getRequiredResolution());
			numberPixelAlongY = (int) Math.round(meshRegion.getYDimension() / getRequiredResolution());
			numberOfTicks = numberPixelAlongX * numberPixelAlongY;	
		}
		
		@Override
		protected IStatus run(IProgressMonitor monitor) 
		{										
			monitor.beginTask("Create Pixel Location", numberOfTicks);
			points = new Point3d[numberPixelAlongX][numberPixelAlongY];
			
			double xIncrement = meshRegion.getXDimension() / numberPixelAlongX;
			double yIncrement = meshRegion.getYDimension() / numberPixelAlongY;
			
			double x = meshRegion.getXMin() + (xIncrement / 2.0);	
			for(int i = 0; i < numberPixelAlongX; i++)
			{								
				if(monitor.isCanceled()) return Status.CANCEL_STATUS;
				
				double y = meshRegion.getYMin() + (yIncrement / 2.0);
				for(int j = 0; j < numberPixelAlongY; j++)
				{
					Point3d point = new Point3d(x, y, 0);
					points[i][j] = point;
					
					// Increment y
					y += yIncrement;
				}
				
				monitor.worked(numberPixelAlongY);
				
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
	 * Base class for Custom Job which process are using the pixel position array as their basis.
	 * @author pallard
	 *
	 */
	protected abstract class ProcessPixelArrayJob<T> extends CustomJob<T>
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
		public ProcessPixelArrayJob(String name, String family, int xStartIndex, int xEndIndex, CartesianTriangularMesh mesh, Point3d[][] pixelsLocation) 
		{
			super(name, family);		
			this.xStartIndex = xStartIndex;
			this.xEndIndex = xEndIndex;
			this.mesh = mesh;	
			this.pixelsLocation = pixelsLocation;
		}			
	}
	
	/**
	 * Job that finds the intersection point on the mesh for each of the pixel location.
	 * @author pallard
	 *
	 */
	protected class GetPixelsIntersectionPointsJob extends ProcessPixelArrayJob<Point3d[][]>
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
	
	protected class GetPixelsIntersectionTrianglesJob extends ProcessPixelArrayJob<CartesianTriangle[][]>
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
	
	protected class GetNormalsJob extends ProcessPixelArrayJob<Vector3d[][]>
	{
		protected Vector3d[][] normalsArray;
		protected CartesianTriangle[][] pixelsIntersectionTriangles;
		protected KDTree kdTree;
		protected double averagingRadius;
		
		public GetNormalsJob(String name, String family, int xStartIndex, int xEndIndex, Vector3d[][] normalsArray, Point3d[][] pixelsLocation, CartesianTriangle[][] pixelsIntersectionTriangles, CartesianTriangularMesh mesh, KDTree kdTree, double averagingRadius, IProgressMonitor progressMonitor)
		{
			super(name, family, xStartIndex, xEndIndex,mesh, pixelsLocation);
			this.pixelsIntersectionTriangles = pixelsIntersectionTriangles;
			this.normalsArray = normalsArray;
			this.kdTree = kdTree;
			this.averagingRadius = averagingRadius;
			
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
					
					CartesianTriangle triangle = pixelsIntersectionTriangles[i][j];
					if(triangle != null)
					{
						normalsArray[i][j] =  computeAverageNormal(mesh, pixelsLocation[i][j], triangle, averagingRadius);
					}
				}
				
				subMonitor.worked(1);
			}
			
			subMonitor.done();
			
			return Status.OK_STATUS;
		}
		
		@Override
		public Vector3d[][] getOutput() 
		{		
			return normalsArray;
		}
	}
	
	/**
	 * Computes the average normal from a triangle point of view.
	 * @param mesh The mesh containing the triangle.
	 * @param pixelLocation The pixel location.
	 * @param triangle The triangle onto which the pixel location falls. Must not be null. 
	 * @param averagingRadius The average radius.
	 * @return The averaged normal.
	 */
	protected Vector3d computeAverageNormal(CartesianTriangularMesh mesh, Point3d pixelLocation, CartesianTriangle triangle, double averagingRadius)
	{				
		// First, gets the list of neighbors.		
		List<CartesianTriangle> triangles = mesh.getPolygonNeighbours(triangle);
		
		// Computes a area weighted average of the slope.
		Vector3d normal = Geometry3dUtilities.getAreaWeightedAverageNormal(triangles);
		
		return normal;
	}
	
	/**
	 * Converts a Color3f to a int representing the color.
	 * @param color The Color3f.
	 * @return The color3f as int or -1 if the Color3f is transparent (i.e. at least one color component is -1.0)
	 */
	protected int convertColor(Color3f color)
	{
		if(color == null)
		{
			return TRANSPARENT_COLOR;
		}
		else if(color.x == -1 || color.y == -1 || color.z == -1)
		{
			return TRANSPARENT_COLOR;
		}
		else
		{
			Color tmpColor = new Color(color.x, color.y, color.z);
			return tmpColor.getRGB();
		}
	}
	
	// file:///home/pallard/workspace/WORKSITES/test.tri
	
	//platform:/plugin/ca.gc.asc_csa.excore.deployments.worksites.utah/data/Utah-Site-1-2014-DEM-100cm-final-product.tri

	//platform:/plugin/ca.gc.asc_csa.excore.deployments.worksites.csa_analog_terrain/data/CSAMarsYardDEM25cm.tri

	
} //CartesianTriangularMeshDerivedImageMapLayerImpl
