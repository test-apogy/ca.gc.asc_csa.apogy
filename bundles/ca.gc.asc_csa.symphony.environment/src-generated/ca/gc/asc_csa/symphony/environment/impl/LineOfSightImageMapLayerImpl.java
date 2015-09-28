/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.impl;

import java.util.Iterator;

import javax.vecmath.Color3f;
import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.IJobManager;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.eclipse.images.core.AbstractEImage;
import ca.gc.asc_csa.eclipse.utils.log.EventSeverity;
import ca.gc.asc_csa.eclipse.utils.log.Logger;
import ca.gc.asc_csa.symphony.environment.Activator;
import ca.gc.asc_csa.symphony.environment.LineOfSightImageMapLayer;
import ca.gc.asc_csa.symphony.environment.RectangularVolumeRegion;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentFactory;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;
import ca.gc.space.math.Matrix4x4;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangle;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangularMesh;
import ca.gc.space.mrt.geometry.data3d.Geometry3dUtilities;
import edu.wlu.cs.levy.CG.KDTree;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Of Sight Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.LineOfSightImageMapLayerImpl#getLineOfSightAvailableColor <em>Line Of Sight Available Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.LineOfSightImageMapLayerImpl#getLineOfSightNotAvailableColor <em>Line Of Sight Not Available Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.LineOfSightImageMapLayerImpl#getObserverPose <em>Observer Pose</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.LineOfSightImageMapLayerImpl#getTargetHeightAboveGround <em>Target Height Above Ground</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.LineOfSightImageMapLayerImpl#isUseHeightPerpendicularToGround <em>Use Height Perpendicular To Ground</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineOfSightImageMapLayerImpl extends CartesianTriangularMeshDerivedImageMapLayerImpl implements LineOfSightImageMapLayer 
{
	public static final short NO_MESH_PROJECTION = 0;
	public static final short NO_LINE_OF_SIGHT = 1;
	public static final short LINE_OF_SIGHT = 2;
	
	protected Point3d[][] pixelsIntersectionPoints;
	protected Vector3d[][] pixelNormals;
	protected short[][] lineOfSights;
	
	/**
	 * The default value of the '{@link #getLineOfSightAvailableColor() <em>Line Of Sight Available Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineOfSightAvailableColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color3f LINE_OF_SIGHT_AVAILABLE_COLOR_EDEFAULT = (Color3f)SymphonyEnvironmentFactory.eINSTANCE.createFromString(SymphonyEnvironmentPackage.eINSTANCE.getColor3f(), "0.0,1.0,0.0");

	/**
	 * The cached value of the '{@link #getLineOfSightAvailableColor() <em>Line Of Sight Available Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineOfSightAvailableColor()
	 * @generated
	 * @ordered
	 */
	protected Color3f lineOfSightAvailableColor = LINE_OF_SIGHT_AVAILABLE_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineOfSightNotAvailableColor() <em>Line Of Sight Not Available Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineOfSightNotAvailableColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color3f LINE_OF_SIGHT_NOT_AVAILABLE_COLOR_EDEFAULT = (Color3f)SymphonyEnvironmentFactory.eINSTANCE.createFromString(SymphonyEnvironmentPackage.eINSTANCE.getColor3f(), "1.0,0.0,0.0");

	/**
	 * The cached value of the '{@link #getLineOfSightNotAvailableColor() <em>Line Of Sight Not Available Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineOfSightNotAvailableColor()
	 * @generated
	 * @ordered
	 */
	protected Color3f lineOfSightNotAvailableColor = LINE_OF_SIGHT_NOT_AVAILABLE_COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObserverPose() <em>Observer Pose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObserverPose()
	 * @generated
	 * @ordered
	 */
	protected Matrix4x4 observerPose;
	/**
	 * The default value of the '{@link #getTargetHeightAboveGround() <em>Target Height Above Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetHeightAboveGround()
	 * @generated
	 * @ordered
	 */
	protected static final double TARGET_HEIGHT_ABOVE_GROUND_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getTargetHeightAboveGround() <em>Target Height Above Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetHeightAboveGround()
	 * @generated
	 * @ordered
	 */
	protected double targetHeightAboveGround = TARGET_HEIGHT_ABOVE_GROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseHeightPerpendicularToGround() <em>Use Height Perpendicular To Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseHeightPerpendicularToGround()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_HEIGHT_PERPENDICULAR_TO_GROUND_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isUseHeightPerpendicularToGround() <em>Use Height Perpendicular To Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseHeightPerpendicularToGround()
	 * @generated
	 * @ordered
	 */
	protected boolean useHeightPerpendicularToGround = USE_HEIGHT_PERPENDICULAR_TO_GROUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineOfSightImageMapLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEnvironmentPackage.Literals.LINE_OF_SIGHT_IMAGE_MAP_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color3f getLineOfSightAvailableColor() {
		return lineOfSightAvailableColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineOfSightAvailableColor(Color3f newLineOfSightAvailableColor) {
		Color3f oldLineOfSightAvailableColor = lineOfSightAvailableColor;
		lineOfSightAvailableColor = newLineOfSightAvailableColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_AVAILABLE_COLOR, oldLineOfSightAvailableColor, lineOfSightAvailableColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color3f getLineOfSightNotAvailableColor() {
		return lineOfSightNotAvailableColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineOfSightNotAvailableColor(Color3f newLineOfSightNotAvailableColor) {
		Color3f oldLineOfSightNotAvailableColor = lineOfSightNotAvailableColor;
		lineOfSightNotAvailableColor = newLineOfSightNotAvailableColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_NOT_AVAILABLE_COLOR, oldLineOfSightNotAvailableColor, lineOfSightNotAvailableColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix4x4 getObserverPose() {
		return observerPose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObserverPose(Matrix4x4 newObserverPose, NotificationChain msgs) {
		Matrix4x4 oldObserverPose = observerPose;
		observerPose = newObserverPose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__OBSERVER_POSE, oldObserverPose, newObserverPose);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObserverPose(Matrix4x4 newObserverPose) {
		if (newObserverPose != observerPose) {
			NotificationChain msgs = null;
			if (observerPose != null)
				msgs = ((InternalEObject)observerPose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__OBSERVER_POSE, null, msgs);
			if (newObserverPose != null)
				msgs = ((InternalEObject)newObserverPose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__OBSERVER_POSE, null, msgs);
			msgs = basicSetObserverPose(newObserverPose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__OBSERVER_POSE, newObserverPose, newObserverPose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTargetHeightAboveGround() {
		return targetHeightAboveGround;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetHeightAboveGround(double newTargetHeightAboveGround) {
		double oldTargetHeightAboveGround = targetHeightAboveGround;
		targetHeightAboveGround = newTargetHeightAboveGround;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__TARGET_HEIGHT_ABOVE_GROUND, oldTargetHeightAboveGround, targetHeightAboveGround));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseHeightPerpendicularToGround() {
		return useHeightPerpendicularToGround;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseHeightPerpendicularToGround(boolean newUseHeightPerpendicularToGround) {
		boolean oldUseHeightPerpendicularToGround = useHeightPerpendicularToGround;
		useHeightPerpendicularToGround = newUseHeightPerpendicularToGround;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__USE_HEIGHT_PERPENDICULAR_TO_GROUND, oldUseHeightPerpendicularToGround, useHeightPerpendicularToGround));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__OBSERVER_POSE:
				return basicSetObserverPose(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_AVAILABLE_COLOR:
				return getLineOfSightAvailableColor();
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_NOT_AVAILABLE_COLOR:
				return getLineOfSightNotAvailableColor();
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__OBSERVER_POSE:
				return getObserverPose();
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__TARGET_HEIGHT_ABOVE_GROUND:
				return getTargetHeightAboveGround();
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__USE_HEIGHT_PERPENDICULAR_TO_GROUND:
				return isUseHeightPerpendicularToGround();
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
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_AVAILABLE_COLOR:
				setLineOfSightAvailableColor((Color3f)newValue);
				return;
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_NOT_AVAILABLE_COLOR:
				setLineOfSightNotAvailableColor((Color3f)newValue);
				return;
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__OBSERVER_POSE:
				setObserverPose((Matrix4x4)newValue);
				return;
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__TARGET_HEIGHT_ABOVE_GROUND:
				setTargetHeightAboveGround((Double)newValue);
				return;
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__USE_HEIGHT_PERPENDICULAR_TO_GROUND:
				setUseHeightPerpendicularToGround((Boolean)newValue);
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
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_AVAILABLE_COLOR:
				setLineOfSightAvailableColor(LINE_OF_SIGHT_AVAILABLE_COLOR_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_NOT_AVAILABLE_COLOR:
				setLineOfSightNotAvailableColor(LINE_OF_SIGHT_NOT_AVAILABLE_COLOR_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__OBSERVER_POSE:
				setObserverPose((Matrix4x4)null);
				return;
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__TARGET_HEIGHT_ABOVE_GROUND:
				setTargetHeightAboveGround(TARGET_HEIGHT_ABOVE_GROUND_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__USE_HEIGHT_PERPENDICULAR_TO_GROUND:
				setUseHeightPerpendicularToGround(USE_HEIGHT_PERPENDICULAR_TO_GROUND_EDEFAULT);
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
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_AVAILABLE_COLOR:
				return LINE_OF_SIGHT_AVAILABLE_COLOR_EDEFAULT == null ? lineOfSightAvailableColor != null : !LINE_OF_SIGHT_AVAILABLE_COLOR_EDEFAULT.equals(lineOfSightAvailableColor);
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_NOT_AVAILABLE_COLOR:
				return LINE_OF_SIGHT_NOT_AVAILABLE_COLOR_EDEFAULT == null ? lineOfSightNotAvailableColor != null : !LINE_OF_SIGHT_NOT_AVAILABLE_COLOR_EDEFAULT.equals(lineOfSightNotAvailableColor);
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__OBSERVER_POSE:
				return observerPose != null;
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__TARGET_HEIGHT_ABOVE_GROUND:
				return targetHeightAboveGround != TARGET_HEIGHT_ABOVE_GROUND_EDEFAULT;
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__USE_HEIGHT_PERPENDICULAR_TO_GROUND:
				return useHeightPerpendicularToGround != USE_HEIGHT_PERPENDICULAR_TO_GROUND_EDEFAULT;
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
		result.append(" (lineOfSightAvailableColor: ");
		result.append(lineOfSightAvailableColor);
		result.append(", lineOfSightNotAvailableColor: ");
		result.append(lineOfSightNotAvailableColor);
		result.append(", targetHeightAboveGround: ");
		result.append(targetHeightAboveGround);
		result.append(", useHeightPerpendicularToGround: ");
		result.append(useHeightPerpendicularToGround);
		result.append(')');
		return result.toString();
	}

	@Override
	public void updateImage(IProgressMonitor progressMonitor) 
	{
		if(getCartesianTriangularMeshMapLayer() != null)
		{
			CartesianTriangularMesh mesh = getCartesianTriangularMeshMapLayer().getCurrentMesh();
			
			if(mesh != null)
			{				
				SubMonitor subMonitor = null;
				if(isUseHeightPerpendicularToGround())
				{
					subMonitor = SubMonitor.convert(progressMonitor, 6);
				}
				else
				{
					subMonitor = SubMonitor.convert(progressMonitor, 4);
				}				
				
				long startTime = System.currentTimeMillis();												
				
				// Updates the mesh volume
				RectangularVolumeRegion meshRegion = getRectangularVolumeRegion();				
			
				if(meshRegion.getXDimension() > 0 && meshRegion.getYDimension() > 0)
				{
					// Generate the pixel locations.
					progressMonitor.subTask("Generating pixel locations");										
					Point3d[][] pixelsLocation = getPixelsLocation(getCartesianTriangularMeshMapLayer().getCurrentMesh(), subMonitor.newChild(1));	
					progressMonitor.worked(1);							
										
					int numberPixelAlongX = pixelsLocation.length;
					int numberPixelAlongY = pixelsLocation[0].length;
								
					double xIncrement = meshRegion.getXDimension() / numberPixelAlongX;
					double yIncrement = meshRegion.getYDimension() / numberPixelAlongY;
					double averagingRadius = Math.sqrt(xIncrement*xIncrement + yIncrement*yIncrement);
					
					// Create KD Tree.		
					progressMonitor.subTask("Create KD tree");
					KDTree kdTree = createTriangleKDTree(mesh, subMonitor.newChild(1));
					subMonitor.worked(1);		
					
					// Find intersections.
					// Bail out if cancel is requested.
					if(progressMonitor.isCanceled()) return;
					
					progressMonitor.subTask("Find pixel intersection");
					pixelsIntersectionPoints = getPixelsIntersectionPoints(pixelsLocation, mesh, kdTree, averagingRadius, subMonitor.newChild(1));
					subMonitor.worked(1);
						
					// Bail out if cancel is requested.
					if(progressMonitor.isCanceled()) return;
					
					lineOfSights = null;
					if(isUseHeightPerpendicularToGround())
					{
						// We need to computes the pixel triangle.
						CartesianTriangle[][] pixelsIntersectionTriangles = getPixelsIntersectionTriangle(pixelsLocation, mesh, kdTree, averagingRadius, progressMonitor);
						subMonitor.worked(1);
						
						// Bail out if cancel is requested.
						if(progressMonitor.isCanceled()) return;
						
						// We need to compute the normals.						
						pixelNormals = getNormals(pixelsLocation, pixelsIntersectionTriangles, mesh, kdTree, averagingRadius, progressMonitor);
						subMonitor.worked(1);
						
						// Bail out if cancel is requested.
						if(progressMonitor.isCanceled()) return;
						
						lineOfSights = getLineOfSights(pixelsIntersectionPoints, pixelNormals, mesh, getObserverPose(), targetHeightAboveGround, progressMonitor);					
						progressMonitor.worked(1);
					}
					else
					{
						progressMonitor.subTask("Find line of sight");
						lineOfSights = getLineOfSights(pixelsIntersectionPoints, mesh, getObserverPose(), getTargetHeightAboveGround(), progressMonitor);					
						progressMonitor.worked(1);
					}
					
					
					// Generate the color
					// Bail out if cancel is requested.
					if(progressMonitor.isCanceled()) return;
					
					int[][] pixelColors = getPixelsColor(lineOfSights);
					
					// Generate the image.				
					// Bail out if cancel is requested.
					if(progressMonitor.isCanceled()) return;
					
					AbstractEImage image = convertToImage(pixelColors, subMonitor.newChild(1));
					
					long endTime = System.currentTimeMillis();
					double duration =  (endTime - startTime) * 0.001;
					Logger.INSTANCE.log(Activator.ID, this, "Updated image in <" + duration + "> seconds.", EventSeverity.INFO);
					
					setImage(image);					
				}
			}
		}
	}
	
	protected short[][] getLineOfSights(Point3d[][] pixelsIntersectionPoints, CartesianTriangularMesh mesh, Matrix4x4 observerPose, double targetHeightAboveGround, IProgressMonitor progressMonitor)
	{
		progressMonitor.subTask("Finding line of sights.");
		
		int numberPixelAlongX = pixelsIntersectionPoints.length;
		int numberPixelAlongY = pixelsIntersectionPoints[0].length;
		
		short[][] lineOfSights = new short[numberPixelAlongX][numberPixelAlongY];
		
		int numberOfJobs = getNumberOfProcessorToUse();		
		int xIndexSlotSize = Math.floorDiv(numberPixelAlongX, numberOfJobs);

		int xStartIndex = 0;
		int xEndIndex = xIndexSlotSize;
		String family = "GetLineOfSight";
		
		for(int jobNumber = 0; jobNumber < numberOfJobs; jobNumber++)
		{						
			String jobName = "Get Line Of Sight (" + Integer.toString(jobNumber + 1) + " of " +  numberOfJobs + ") [" + xStartIndex + " ," + xEndIndex + "]";
			new GetLineOfSightsJob(jobName, family, xStartIndex, xEndIndex, pixelsIntersectionPoints, mesh, lineOfSights).schedule();
			
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
		
		Logger.INSTANCE.log(Activator.ID, this, "getLineOfSights() completed.", EventSeverity.OK);
		
		
		return lineOfSights;
	}		
	
	protected short[][] getLineOfSights(Point3d[][] pixelsIntersectionPoints, Vector3d[][] pixelsNormals, CartesianTriangularMesh mesh, Matrix4x4 observerPose, double targetHeightAboveGround, IProgressMonitor progressMonitor)
	{
		progressMonitor.subTask("Finding line of sights.");
		
		int numberPixelAlongX = pixelsNormals.length;
		int numberPixelAlongY = pixelsNormals[0].length;
		
		short[][] lineOfSights = new short[numberPixelAlongX][numberPixelAlongY];
		
		int numberOfJobs = getNumberOfProcessorToUse();		
		int xIndexSlotSize = Math.floorDiv(numberPixelAlongX, numberOfJobs);

		int xStartIndex = 0;
		int xEndIndex = xIndexSlotSize;
		String family = "GetLineOfSightJob";
		
		for(int jobNumber = 0; jobNumber < numberOfJobs; jobNumber++)
		{						
			String jobName = "Get Line Of Sight (" + Integer.toString(jobNumber + 1) + " of " +  numberOfJobs + ") [" + xStartIndex + " ," + xEndIndex + "]";
			new GetLineOfSightsPerpendicularToGroundJob(jobName, family, xStartIndex, xEndIndex, pixelsIntersectionPoints, pixelsNormals, mesh, lineOfSights).schedule();
						
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
		
		Logger.INSTANCE.log(Activator.ID, this, "getLineOfSights() completed.", EventSeverity.OK);
		
		
		return lineOfSights;
	}
	
	protected int[][] getPixelsColor(short[][] lineOfSights)
	{
		int numberPixelAlongX = lineOfSights.length;
		int numberPixelAlongY = lineOfSights[0].length;
				
		int lineOfSightRGB = getLineOfSightColor();				
		int noLineOfSightRGB = noLineOfSightColor();
		
		int[][] pixelColors = new int[numberPixelAlongX][numberPixelAlongY];					
		for(int i=0; i< numberPixelAlongX; i++)
		{
			for(int j=0; j< numberPixelAlongY; j++)
			{
				short data = lineOfSights[i][j];
				switch (data) 
				{
					case LINE_OF_SIGHT:
						pixelColors[i][j] = lineOfSightRGB;
					break;
					case NO_LINE_OF_SIGHT:
						pixelColors[i][j] = noLineOfSightRGB;
					break;	
					case NO_MESH_PROJECTION:
						pixelColors[i][j] = TRANSPARENT_COLOR;
					break;
				}
			}	
		}	
		
		return pixelColors;
	}
		
	protected int getLineOfSightColor()
	{
		return convertColor(getLineOfSightAvailableColor());		
	}
	
	protected int noLineOfSightColor()
	{
		return convertColor(getLineOfSightNotAvailableColor());		
	}
	
	protected class GetLineOfSightsJob extends ProcessPixelArrayJob<short[][]>
	{
		protected Point3d[][] pixelsIntersectionPoints;
		protected short[][] lineOfSights;
		
		
		public GetLineOfSightsJob(String name, String family, int xStartIndex, int xEndIndex, Point3d[][] pixelsIntersectionPoints, CartesianTriangularMesh mesh, short[][] lineOfSights)
		{
			super(name, family, xStartIndex, xEndIndex,mesh, null);	
			this.pixelsIntersectionPoints = pixelsIntersectionPoints;
			this.lineOfSights = lineOfSights;
			numberOfTicks = xEndIndex - xStartIndex; 
		}
		
		@Override
		protected IStatus run(IProgressMonitor monitor) 
		{
			SubMonitor subMonitor = SubMonitor.convert(monitor, getNumberOfTicks());			
			subMonitor.beginTask("Get Line Of Sight", numberOfTicks);
			int numberPixelAlongY = pixelsIntersectionPoints[0].length;
			
			Matrix4d observerMatrix = getObserverPose().asMatrix4d(); 
			Vector3d observerPosition = new Vector3d();
			observerMatrix.get(observerPosition);
			
			double heightAboveGround = getTargetHeightAboveGround();
			
			for(int i = xStartIndex; i <= xEndIndex; i++)
			{	
				// Bail out if cancel is requested.
				if(monitor.isCanceled()) return Status.CANCEL_STATUS;

				for(int j = 0; j < numberPixelAlongY; j++)
				{
					// Bail out if cancel is requested.
					if(monitor.isCanceled()) return Status.CANCEL_STATUS;
					
					Point3d positionOnSurface = pixelsIntersectionPoints[i][j];
					if(positionOnSurface != null)
					{
						// Creates a vector between the observer and the location above ground.
						Vector3d target = new Vector3d(positionOnSurface.x, positionOnSurface.y, positionOnSurface.z + heightAboveGround);
						
						Point3d intersection = null;
						Iterator<CartesianTriangle> it = mesh.getPolygons().iterator();
						while(intersection == null && it.hasNext())
						{
							CartesianTriangle triangle = it.next();
							intersection = Geometry3dUtilities.getLineAndPolygonIntersectionPoint(observerPosition, target, triangle);														
						}
						
						if(intersection == null)
						{
							// No intersection, we have line of sight.
							lineOfSights[i][j] = LINE_OF_SIGHT;
						}
						else
						{
							// One Intersection, we have NO line of sight.
							lineOfSights[i][j] = NO_LINE_OF_SIGHT;							
						}
					}
					else
					{						
						lineOfSights[i][j] = NO_MESH_PROJECTION;
					}
				}
				
				subMonitor.worked(1);
			}			
			
			return Status.OK_STATUS;
		}
		
		@Override
		public short[][] getOutput() 
		{		
			return lineOfSights;
		}
	}
	
	protected class GetLineOfSightsPerpendicularToGroundJob extends ProcessPixelArrayJob<short[][]>
	{
		protected Point3d[][] pixelsIntersectionPoints;
		protected Vector3d[][] pixelsNormals;
		protected short[][] lineOfSights;
		
		
		public GetLineOfSightsPerpendicularToGroundJob(String name, String family, int xStartIndex, int xEndIndex, Point3d[][] pixelsIntersectionPoints, Vector3d[][] pixelsNormals, CartesianTriangularMesh mesh, short[][] lineOfSights)
		{
			super(name, family, xStartIndex, xEndIndex,mesh, null);	
			this.pixelsIntersectionPoints = pixelsIntersectionPoints;
			this.pixelsNormals = pixelsNormals;
			this.lineOfSights = lineOfSights;
			numberOfTicks = xEndIndex - xStartIndex; 
		}
		
		@Override
		protected IStatus run(IProgressMonitor monitor) 
		{
			SubMonitor subMonitor = SubMonitor.convert(monitor, getNumberOfTicks());			
			subMonitor.beginTask("Get Line Of Sight Perpendicular To Ground", numberOfTicks);
			int numberPixelAlongY = pixelsIntersectionPoints[0].length;
			
			Matrix4d observerMatrix = getObserverPose().asMatrix4d(); 
			Vector3d observerPosition = new Vector3d();
			observerMatrix.get(observerPosition);
			
			double heightAboveGround = getTargetHeightAboveGround();
			
			for(int i = xStartIndex; i <= xEndIndex; i++)
			{	
				// Bail out if cancel is requested.
				if(monitor.isCanceled()) return Status.CANCEL_STATUS;

				for(int j = 0; j < numberPixelAlongY; j++)
				{
					// Bail out if cancel is requested.
					if(monitor.isCanceled()) return Status.CANCEL_STATUS;
					
					Point3d positionOnSurface = pixelsIntersectionPoints[i][j];
					if(positionOnSurface != null)
					{
						// Creates a vector between the observer and the location above ground.						
						Vector3d target = new Vector3d(positionOnSurface.x, positionOnSurface.y, positionOnSurface.z + heightAboveGround);
						Vector3d antennaPosition = new Vector3d(pixelsNormals[i][j]);
						antennaPosition.scale(heightAboveGround);
						target.add(antennaPosition);
						
						
						Point3d intersection = null;
						Iterator<CartesianTriangle> it = mesh.getPolygons().iterator();
						while(intersection == null && it.hasNext())
						{
							CartesianTriangle triangle = it.next();
							intersection = Geometry3dUtilities.getLineAndPolygonIntersectionPoint(observerPosition, target, triangle);														
						}
						
						if(intersection == null)
						{
							// No intersection, we have line of sight.
							lineOfSights[i][j] = LINE_OF_SIGHT;
						}
						else
						{
							// One Intersection, we have NO line of sight.
							lineOfSights[i][j] = NO_LINE_OF_SIGHT;
							System.out.println(pixelsIntersectionPoints[i][j].x + "," + pixelsIntersectionPoints[i][j].y);
						}
					}
					else
					{
						System.err.println("NO MESH at " + pixelsIntersectionPoints[i][j]);
						lineOfSights[i][j] = NO_MESH_PROJECTION;
					}
				}
				
				subMonitor.worked(1);
			}			
			
			return Status.OK_STATUS;
		}
		
		@Override
		public short[][] getOutput() 
		{		
			return lineOfSights;
		}
	}
	
} //LineOfSightImageMapLayerImpl
