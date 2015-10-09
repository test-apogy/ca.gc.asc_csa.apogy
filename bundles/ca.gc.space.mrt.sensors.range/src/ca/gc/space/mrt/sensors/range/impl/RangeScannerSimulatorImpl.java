/**
 * <copyright>
 * </copyright>
 *
 * $Id: RangeScannerSimulatorImpl.java,v 1.6.4.3 2015/09/22 19:39:36 rlarcheveque Exp $
 */
package ca.gc.space.mrt.sensors.range.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.media.j3d.GeometryArray;
import javax.media.j3d.PickRay;
import javax.media.j3d.PointArray;
import javax.media.j3d.SceneGraphPath;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TriangleArray;
import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.sensors.SensorStatus;
import org.eclipse.symphony.common.geometry.data25d.Coordinates25D;
import org.eclipse.symphony.common.geometry.data25d.Data25dFactory;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangle;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.common.topology.ContentNode;
import org.eclipse.symphony.common.topology.TopologyFacade;

import ca.gc.space.mrt.sensors.range.Activator;
import ca.gc.space.mrt.sensors.range.RangePackage;
import ca.gc.space.mrt.sensors.range.RangeScannerSimulator;
import ca.gc.space.mrt.sensors.range.RayData;

import com.sun.j3d.utils.geometry.GeometryInfo;
import com.sun.j3d.utils.geometry.NormalGenerator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scanner Simulator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.range.impl.RangeScannerSimulatorImpl#getMeshNode <em>Mesh Node</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.range.impl.RangeScannerSimulatorImpl#isNoiseEnabled <em>Noise Enabled</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.range.impl.RangeScannerSimulatorImpl#getTimeCroppingMesh <em>Time Cropping Mesh</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.range.impl.RangeScannerSimulatorImpl#getTimeFindingIntersections <em>Time Finding Intersections</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.range.impl.RangeScannerSimulatorImpl#getTimeGettingSimulatedRays <em>Time Getting Simulated Rays</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("restriction")
public abstract class RangeScannerSimulatorImpl<InputType> extends RangeScannerImpl<InputType> implements RangeScannerSimulator<InputType> 
{			
	/**
	 * The cached value of the '{@link #getMeshNode() <em>Mesh Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeshNode()
	 * @generated
	 * @ordered
	 */
	protected ContentNode<CartesianTriangularMesh> meshNode;

	/**
	 * The default value of the '{@link #isNoiseEnabled() <em>Noise Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoiseEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOISE_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoiseEnabled() <em>Noise Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoiseEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean noiseEnabled = NOISE_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeCroppingMesh() <em>Time Cropping Mesh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeCroppingMesh()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_CROPPING_MESH_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimeCroppingMesh() <em>Time Cropping Mesh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeCroppingMesh()
	 * @generated
	 * @ordered
	 */
	protected long timeCroppingMesh = TIME_CROPPING_MESH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeFindingIntersections() <em>Time Finding Intersections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFindingIntersections()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_FINDING_INTERSECTIONS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimeFindingIntersections() <em>Time Finding Intersections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFindingIntersections()
	 * @generated
	 * @ordered
	 */
	protected long timeFindingIntersections = TIME_FINDING_INTERSECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeGettingSimulatedRays() <em>Time Getting Simulated Rays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeGettingSimulatedRays()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_GETTING_SIMULATED_RAYS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimeGettingSimulatedRays() <em>Time Getting Simulated Rays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeGettingSimulatedRays()
	 * @generated
	 * @ordered
	 */
	protected long timeGettingSimulatedRays = TIME_GETTING_SIMULATED_RAYS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeScannerSimulatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RangePackage.Literals.RANGE_SCANNER_SIMULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public ContentNode<CartesianTriangularMesh> getMeshNode() {
		if (meshNode != null && meshNode.eIsProxy()) {
			InternalEObject oldMeshNode = (InternalEObject)meshNode;
			meshNode = (ContentNode<CartesianTriangularMesh>)eResolveProxy(oldMeshNode);
			if (meshNode != oldMeshNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RangePackage.RANGE_SCANNER_SIMULATOR__MESH_NODE, oldMeshNode, meshNode));
			}
		}
		return meshNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentNode<CartesianTriangularMesh> basicGetMeshNode() {
		return meshNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeshNode(ContentNode<CartesianTriangularMesh> newMeshNode) {
		ContentNode<CartesianTriangularMesh> oldMeshNode = meshNode;
		meshNode = newMeshNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RangePackage.RANGE_SCANNER_SIMULATOR__MESH_NODE, oldMeshNode, meshNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoiseEnabled() {
		return noiseEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoiseEnabled(boolean newNoiseEnabled) {
		boolean oldNoiseEnabled = noiseEnabled;
		noiseEnabled = newNoiseEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RangePackage.RANGE_SCANNER_SIMULATOR__NOISE_ENABLED, oldNoiseEnabled, noiseEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimeCroppingMesh() {
		return timeCroppingMesh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeCroppingMesh(long newTimeCroppingMesh) {
		long oldTimeCroppingMesh = timeCroppingMesh;
		timeCroppingMesh = newTimeCroppingMesh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RangePackage.RANGE_SCANNER_SIMULATOR__TIME_CROPPING_MESH, oldTimeCroppingMesh, timeCroppingMesh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimeFindingIntersections() {
		return timeFindingIntersections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeFindingIntersections(long newTimeFindingIntersections) {
		long oldTimeFindingIntersections = timeFindingIntersections;
		timeFindingIntersections = newTimeFindingIntersections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RangePackage.RANGE_SCANNER_SIMULATOR__TIME_FINDING_INTERSECTIONS, oldTimeFindingIntersections, timeFindingIntersections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimeGettingSimulatedRays() {
		return timeGettingSimulatedRays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeGettingSimulatedRays(long newTimeGettingSimulatedRays) {
		long oldTimeGettingSimulatedRays = timeGettingSimulatedRays;
		timeGettingSimulatedRays = newTimeGettingSimulatedRays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RangePackage.RANGE_SCANNER_SIMULATOR__TIME_GETTING_SIMULATED_RAYS, oldTimeGettingSimulatedRays, timeGettingSimulatedRays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public abstract CartesianTriangularMesh getCroppedMesh();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public abstract List<RayData> getSimulatedRays();

	@Override
	public org.eclipse.symphony.common.geometry.data25d.VolumetricCoordinatesSet25D process(InputType input) throws Exception 
	{
		// Initialize the output if required
		if(getOutput() == null)
		{
			setOutput(Data25dFactory.eINSTANCE.createVolumetricCoordinatesSet25D());
		}
		
		// If the sensor is ready, initiate acquisition.
		if(getStatus() == SensorStatus.READY)
		{			
			// Updates the scan settings.
			setInput(input);
										
			// Clears the previous scan data.
			getOutput().getPoints().clear();
			
			try
			{
				// Acquire data.								
				acquireData();		
				return getOutput();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}		
		}
		
		return null;		
	};
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void acquireData() throws Exception 
	{
		if(getMeshNode() == null)
		{
			throw new Exception("The mesh node is not set !");
		}
		
		// Computes the transform between the scanner and the mesh.
		Matrix4d scannerToMeshTransform = TopologyFacade.INSTANCE.expressInFrame(this, getMeshNode());	
		
		// Gets the cropped terrain.
		Date start = new Date();
		CartesianTriangularMesh croppedMesh = getCroppedMesh();		
		Date end = new Date();				
		setTimeCroppingMesh(end.getTime() - start.getTime());
		
		Logger.INSTANCE.log(Activator.ID, this, "Cropped mesh contains " + croppedMesh.getPolygons().size() + " polygons and was created in " + (getTimeCroppingMesh() / 1000.0) + " seconds.", EventSeverity.INFO);
		
		// Gets a Shape3D representing the cropped terrain.
		Shape3D meshShape3D = getShape3D(croppedMesh);
		
		if(meshShape3D != null)
		{
			// Gets the list of RayData.
			start = new Date();
			List<RayData> rays = getSimulatedRays();
			end = new Date();
			setTimeGettingSimulatedRays(end.getTime() - start.getTime());
			
			Logger.INSTANCE.log(Activator.ID, this, "Simulated rays contain " + rays.size() + " entries and were generated in " + (getTimeGettingSimulatedRays() / 1000.0) + " seconds.", EventSeverity.INFO);
				
			// Gets the simulated returns.
			start = new Date();
			List<Coordinates25D> returns = getSimulatedReturns(meshShape3D, scannerToMeshTransform, rays);
			end = new Date();
			setTimeFindingIntersections(end.getTime() - start.getTime());
			
			// Adds the returns to the data.
			getOutput().getPoints().addAll(returns);
		}
		else
		{
			getOutput().getPoints().clear();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public abstract RayData applyOrientationNoise(RayData rayData);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public abstract double applyRangeNoise(double range, RayData cleanRayData, RayData noisyRayData);


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public abstract Coordinates25D createCoordinates25D(RayData rayData, double range); 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RangePackage.RANGE_SCANNER_SIMULATOR__MESH_NODE:
				if (resolve) return getMeshNode();
				return basicGetMeshNode();
			case RangePackage.RANGE_SCANNER_SIMULATOR__NOISE_ENABLED:
				return isNoiseEnabled();
			case RangePackage.RANGE_SCANNER_SIMULATOR__TIME_CROPPING_MESH:
				return getTimeCroppingMesh();
			case RangePackage.RANGE_SCANNER_SIMULATOR__TIME_FINDING_INTERSECTIONS:
				return getTimeFindingIntersections();
			case RangePackage.RANGE_SCANNER_SIMULATOR__TIME_GETTING_SIMULATED_RAYS:
				return getTimeGettingSimulatedRays();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RangePackage.RANGE_SCANNER_SIMULATOR__MESH_NODE:
				setMeshNode((ContentNode<CartesianTriangularMesh>)newValue);
				return;
			case RangePackage.RANGE_SCANNER_SIMULATOR__NOISE_ENABLED:
				setNoiseEnabled((Boolean)newValue);
				return;
			case RangePackage.RANGE_SCANNER_SIMULATOR__TIME_CROPPING_MESH:
				setTimeCroppingMesh((Long)newValue);
				return;
			case RangePackage.RANGE_SCANNER_SIMULATOR__TIME_FINDING_INTERSECTIONS:
				setTimeFindingIntersections((Long)newValue);
				return;
			case RangePackage.RANGE_SCANNER_SIMULATOR__TIME_GETTING_SIMULATED_RAYS:
				setTimeGettingSimulatedRays((Long)newValue);
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
			case RangePackage.RANGE_SCANNER_SIMULATOR__MESH_NODE:
				setMeshNode((ContentNode<CartesianTriangularMesh>)null);
				return;
			case RangePackage.RANGE_SCANNER_SIMULATOR__NOISE_ENABLED:
				setNoiseEnabled(NOISE_ENABLED_EDEFAULT);
				return;
			case RangePackage.RANGE_SCANNER_SIMULATOR__TIME_CROPPING_MESH:
				setTimeCroppingMesh(TIME_CROPPING_MESH_EDEFAULT);
				return;
			case RangePackage.RANGE_SCANNER_SIMULATOR__TIME_FINDING_INTERSECTIONS:
				setTimeFindingIntersections(TIME_FINDING_INTERSECTIONS_EDEFAULT);
				return;
			case RangePackage.RANGE_SCANNER_SIMULATOR__TIME_GETTING_SIMULATED_RAYS:
				setTimeGettingSimulatedRays(TIME_GETTING_SIMULATED_RAYS_EDEFAULT);
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
			case RangePackage.RANGE_SCANNER_SIMULATOR__MESH_NODE:
				return meshNode != null;
			case RangePackage.RANGE_SCANNER_SIMULATOR__NOISE_ENABLED:
				return noiseEnabled != NOISE_ENABLED_EDEFAULT;
			case RangePackage.RANGE_SCANNER_SIMULATOR__TIME_CROPPING_MESH:
				return timeCroppingMesh != TIME_CROPPING_MESH_EDEFAULT;
			case RangePackage.RANGE_SCANNER_SIMULATOR__TIME_FINDING_INTERSECTIONS:
				return timeFindingIntersections != TIME_FINDING_INTERSECTIONS_EDEFAULT;
			case RangePackage.RANGE_SCANNER_SIMULATOR__TIME_GETTING_SIMULATED_RAYS:
				return timeGettingSimulatedRays != TIME_GETTING_SIMULATED_RAYS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RangePackage.RANGE_SCANNER_SIMULATOR___GET_CROPPED_MESH:
				return getCroppedMesh();
			case RangePackage.RANGE_SCANNER_SIMULATOR___GET_SIMULATED_RAYS:
				return getSimulatedRays();
			case RangePackage.RANGE_SCANNER_SIMULATOR___ACQUIRE_DATA:
				try {
					acquireData();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case RangePackage.RANGE_SCANNER_SIMULATOR___APPLY_ORIENTATION_NOISE__RAYDATA:
				return applyOrientationNoise((RayData)arguments.get(0));
			case RangePackage.RANGE_SCANNER_SIMULATOR___APPLY_RANGE_NOISE__DOUBLE_RAYDATA_RAYDATA:
				return applyRangeNoise((Double)arguments.get(0), (RayData)arguments.get(1), (RayData)arguments.get(2));
			case RangePackage.RANGE_SCANNER_SIMULATOR___CREATE_COORDINATES25_D__RAYDATA_DOUBLE:
				return createCoordinates25D((RayData)arguments.get(0), (Double)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (noiseEnabled: ");
		result.append(noiseEnabled);
		result.append(", timeCroppingMesh: ");
		result.append(timeCroppingMesh);
		result.append(", timeFindingIntersections: ");
		result.append(timeFindingIntersections);
		result.append(", timeGettingSimulatedRays: ");
		result.append(timeGettingSimulatedRays);
		result.append(')');
		return result.toString();
	}	
	
	/**
	 * Converts a mesh to a Shape3D.
	 * @param mesh The mesh.
	 * @return The Shape3D.
	 */
	protected Shape3D getShape3D(final CartesianTriangularMesh mesh)
	{
		if(mesh.getPoints().size() > 0)
		{
			// The switch that allows to switch the visibility on and off.
			GeometryArray meshData = null;
			
			// No polygons, it's a point array.
			if (mesh.getPolygons().size() == 0)
			{
				meshData = new PointArray(mesh.getPoints().size(), PointArray.COORDINATES);
	
				int pointId = 0;
				for (CartesianPositionCoordinates point : mesh.getPoints())
				{
					Point3d coordinates = point.asPoint3d();
	
					meshData.setCoordinate(pointId, coordinates);
	
					pointId++;
				}
			} 
			else
			{
				// We build the triangles.
				meshData = new TriangleArray(mesh.getPolygons().size() * 3, TriangleArray.COORDINATES | TriangleArray.NORMALS);
	
				int triangleId = 0;
	
				for (CartesianTriangle triangle : mesh.getPolygons())
				{
					for (int i = 0; i < 3; i++)
					{
						Point3d point = triangle.getVertices().get(i).asPoint3d();
						meshData.setCoordinate(triangleId, point);
						triangleId++;
					}
				}
	
				NormalGenerator normalGenerator = new NormalGenerator();
				GeometryInfo geometryInfo = new GeometryInfo(meshData);
				normalGenerator.generateNormals(geometryInfo);
	
				meshData = geometryInfo.getGeometryArray();
	
			}		
			
			return new Shape3D(meshData);
		}
		return null;
	}
	
	protected List<Coordinates25D> getSimulatedReturns(final Shape3D meshShape3D, final Matrix4d scannerToMeshTransform, final List<RayData> rays)
	{
		List<Coordinates25D> returns = new ArrayList<Coordinates25D>();
			
		// Create the PickRay use to compute the distance.
		PickRay pickRay = new PickRay();

		// Creates an empty scene.
		SceneGraphPath sceneGraphPath = new SceneGraphPath();
		
		// Creates the array used to store distance.
		double[] distance = new double[1];
		
		// Goes through the list of RayData and computes the intersection.
		for(RayData rayData : rays)
		{						
			RayData noisyRayData = null;
			
			// Applies orientation noise if applicable.
			if(isNoiseEnabled())
			{
				// Updates the position and direction of the pick ray.
				noisyRayData = applyOrientationNoise(rayData);
				pickRay.set(noisyRayData.getOrigin(), noisyRayData.getDirection());
				
				// Applies the transform onto the pick ray.
				Point3d origin = new Point3d(noisyRayData.getOrigin());
				scannerToMeshTransform.transform(origin);
				
				Vector3d direction = new Vector3d(noisyRayData.getDirection());
				scannerToMeshTransform.transform(direction);
				
				// Updates the position and direction of the pick ray.
				pickRay.set(origin, direction);				
			}
			else
			{				
				// Applies the transform onto the pick ray.
				Point3d origin = new Point3d(rayData.getOrigin());
				scannerToMeshTransform.transform(origin);
				
				Vector3d direction = new Vector3d(rayData.getDirection());
				scannerToMeshTransform.transform(direction);
				
				// Updates the position and direction of the pick ray.
				pickRay.set(origin, direction);				
			}		
												 			
			// Finds the intersection.
			boolean intersects = meshShape3D.intersect(sceneGraphPath, pickRay, distance);
			if(!intersects)
			{
				distance[0] = Double.NaN;
			}
			else
			{
				// Applies range noise if applicable.
				if(isNoiseEnabled())
				{
					distance[0] = applyRangeNoise(distance[0], rayData, noisyRayData); 						
				}
			}
						
			// Creates and adds the coordinates of the intersection to the returns. 
			// The coordinates contains the clean ray data with the noisy range.
			Coordinates25D coords = createCoordinates25D(rayData, distance[0]);
			if(coords != null) returns.add(createCoordinates25D(rayData, distance[0]));
		}
		
		return returns;
	}
} //RangeScannerSimulatorImpl