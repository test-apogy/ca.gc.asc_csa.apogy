/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleRasterScanRangeScannerSimulatorImpl.java,v 1.8.4.2 2015/05/21 15:50:21 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.range.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.addons.sensors.fov.Symphony__AddonsSensorsFOVFactory;
import org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape;
import org.eclipse.symphony.addons.sensors.range.Symphony__AddonsSensorsRangeFactory;
import org.eclipse.symphony.addons.sensors.range.Symphony__AddonsSensorsRangePackage;
import org.eclipse.symphony.addons.sensors.range.RasterScanRangeSensor;
import org.eclipse.symphony.addons.sensors.range.RasterScanSettings;
import org.eclipse.symphony.addons.sensors.range.RayData;
import org.eclipse.symphony.addons.sensors.range.SensorsRangeFacade;
import org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScanner;
import org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator;
import org.eclipse.symphony.common.geometry.data25d.Coordinates25D;
import org.eclipse.symphony.common.geometry.data25d.DataFacade;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangle;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMeshPolygonSampler;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFactory;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.TopologyFacade;
import org.eclipse.symphony.common.topology.TransformNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Raster Scan Range Scanner Simulator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.impl.SimpleRasterScanRangeScannerSimulatorImpl#getRangeNoiseAmplitude <em>Range Noise Amplitude</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.impl.SimpleRasterScanRangeScannerSimulatorImpl#getAzimuthNoiseAmplitude <em>Azimuth Noise Amplitude</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.impl.SimpleRasterScanRangeScannerSimulatorImpl#getElevationNoiseAmplitude <em>Elevation Noise Amplitude</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.impl.SimpleRasterScanRangeScannerSimulatorImpl#isHorizonDetectionEnabled <em>Horizon Detection Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleRasterScanRangeScannerSimulatorImpl extends RangeScannerSimulatorImpl<RasterScanSettings> implements SimpleRasterScanRangeScannerSimulator {
	/**
	 * The default value of the '{@link #getRangeNoiseAmplitude() <em>Range Noise Amplitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeNoiseAmplitude()
	 * @generated
	 * @ordered
	 */
	protected static final double RANGE_NOISE_AMPLITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRangeNoiseAmplitude() <em>Range Noise Amplitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeNoiseAmplitude()
	 * @generated
	 * @ordered
	 */
	protected double rangeNoiseAmplitude = RANGE_NOISE_AMPLITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAzimuthNoiseAmplitude() <em>Azimuth Noise Amplitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzimuthNoiseAmplitude()
	 * @generated
	 * @ordered
	 */
	protected static final double AZIMUTH_NOISE_AMPLITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAzimuthNoiseAmplitude() <em>Azimuth Noise Amplitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzimuthNoiseAmplitude()
	 * @generated
	 * @ordered
	 */
	protected double azimuthNoiseAmplitude = AZIMUTH_NOISE_AMPLITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getElevationNoiseAmplitude() <em>Elevation Noise Amplitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationNoiseAmplitude()
	 * @generated
	 * @ordered
	 */
	protected static final double ELEVATION_NOISE_AMPLITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getElevationNoiseAmplitude() <em>Elevation Noise Amplitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationNoiseAmplitude()
	 * @generated
	 * @ordered
	 */
	protected double elevationNoiseAmplitude = ELEVATION_NOISE_AMPLITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #isHorizonDetectionEnabled() <em>Horizon Detection Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHorizonDetectionEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HORIZON_DETECTION_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHorizonDetectionEnabled() <em>Horizon Detection Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHorizonDetectionEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean horizonDetectionEnabled = HORIZON_DETECTION_ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleRasterScanRangeScannerSimulatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__AddonsSensorsRangePackage.Literals.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRangeNoiseAmplitude() {
		return rangeNoiseAmplitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeNoiseAmplitude(double newRangeNoiseAmplitude) {
		double oldRangeNoiseAmplitude = rangeNoiseAmplitude;
		rangeNoiseAmplitude = newRangeNoiseAmplitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__RANGE_NOISE_AMPLITUDE, oldRangeNoiseAmplitude, rangeNoiseAmplitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAzimuthNoiseAmplitude() {
		return azimuthNoiseAmplitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzimuthNoiseAmplitude(double newAzimuthNoiseAmplitude) {
		double oldAzimuthNoiseAmplitude = azimuthNoiseAmplitude;
		azimuthNoiseAmplitude = newAzimuthNoiseAmplitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__AZIMUTH_NOISE_AMPLITUDE, oldAzimuthNoiseAmplitude, azimuthNoiseAmplitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getElevationNoiseAmplitude() {
		return elevationNoiseAmplitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevationNoiseAmplitude(double newElevationNoiseAmplitude) {
		double oldElevationNoiseAmplitude = elevationNoiseAmplitude;
		elevationNoiseAmplitude = newElevationNoiseAmplitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__ELEVATION_NOISE_AMPLITUDE, oldElevationNoiseAmplitude, elevationNoiseAmplitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHorizonDetectionEnabled() {
		return horizonDetectionEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizonDetectionEnabled(boolean newHorizonDetectionEnabled) {
		boolean oldHorizonDetectionEnabled = horizonDetectionEnabled;
		horizonDetectionEnabled = newHorizonDetectionEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__HORIZON_DETECTION_ENABLED, oldHorizonDetectionEnabled, horizonDetectionEnabled));
	}

	public synchronized RasterScanSettings getScanSettings() 
	{
		RasterScanSettings rasterScanSettings = getInput();
		
		if(rasterScanSettings == null)
		{
			// Search the list of children of the RasterScanRangeSensor to find a RasterScanSettings.
			EList<Node> children = getChildren();
	    	for(Node node : children)
	    	{
	    		if(node instanceof RasterScanSettings)
	    		{
	    			rasterScanSettings = (RasterScanSettings) node;	
	    		}
	    		else if(node instanceof GroupNode)
	    		{
	    			GroupNode groupNode = (GroupNode) node;
	    			EList<Node> groupChildren = groupNode.getChildren();
	    			for(Node n : groupChildren)
	    			{
	    				if(n instanceof RasterScanSettings)
	    	    		{
	    	    			rasterScanSettings = (RasterScanSettings) n;	
	    	    		}
	    			}
	    		}
	    			
	    	}
	    	
	    	// If no RasterScanSettings is found, creates one.
	    	if(rasterScanSettings == null)
	    	{
	    		// Creates a transform node to position and orient the fov.	    		
	    		TransformNode transformNode = TopologyFacade.INSTANCE.createTransformNodeXYZ(0, 0, 0, 0, 0, 0);
	    		transformNode.setDescription("Field Of View Transform");
	    		getChildren().add(transformNode);
	    		
	    		// Adds the rasterscan to the transform.
	    		rasterScanSettings = SensorsRangeFacade.INSTANCE.createRasterScanSettings(0, 100.0, Math.toRadians(90), Math.toRadians(45), 100, 100);
	    		transformNode.getChildren().add(rasterScanSettings);
	    	}
		}
		
		return rasterScanSettings;
	}
	
	@Override
	public void setInput(RasterScanSettings newInput) 
	{
		RasterScanSettings currentScanSettings = getScanSettings();
		currentScanSettings.setDescription(newInput.getDescription());
		currentScanSettings.setHorizontalFieldOfViewAngle(newInput.getHorizontalFieldOfViewAngle());
		currentScanSettings.setHorizontalResolution(newInput.getHorizontalResolution());
		currentScanSettings.setRange(EcoreUtil.copy(newInput.getRange()));
		currentScanSettings.setVerticalFieldOfViewAngle(newInput.getVerticalFieldOfViewAngle());
		currentScanSettings.setVerticalResolution(newInput.getVerticalResolution());		
		super.setInput(newInput);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__RANGE_NOISE_AMPLITUDE:
				return getRangeNoiseAmplitude();
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__AZIMUTH_NOISE_AMPLITUDE:
				return getAzimuthNoiseAmplitude();
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__ELEVATION_NOISE_AMPLITUDE:
				return getElevationNoiseAmplitude();
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__HORIZON_DETECTION_ENABLED:
				return isHorizonDetectionEnabled();
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
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__RANGE_NOISE_AMPLITUDE:
				setRangeNoiseAmplitude((Double)newValue);
				return;
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__AZIMUTH_NOISE_AMPLITUDE:
				setAzimuthNoiseAmplitude((Double)newValue);
				return;
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__ELEVATION_NOISE_AMPLITUDE:
				setElevationNoiseAmplitude((Double)newValue);
				return;
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__HORIZON_DETECTION_ENABLED:
				setHorizonDetectionEnabled((Boolean)newValue);
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
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__RANGE_NOISE_AMPLITUDE:
				setRangeNoiseAmplitude(RANGE_NOISE_AMPLITUDE_EDEFAULT);
				return;
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__AZIMUTH_NOISE_AMPLITUDE:
				setAzimuthNoiseAmplitude(AZIMUTH_NOISE_AMPLITUDE_EDEFAULT);
				return;
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__ELEVATION_NOISE_AMPLITUDE:
				setElevationNoiseAmplitude(ELEVATION_NOISE_AMPLITUDE_EDEFAULT);
				return;
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__HORIZON_DETECTION_ENABLED:
				setHorizonDetectionEnabled(HORIZON_DETECTION_ENABLED_EDEFAULT);
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
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__RANGE_NOISE_AMPLITUDE:
				return rangeNoiseAmplitude != RANGE_NOISE_AMPLITUDE_EDEFAULT;
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__AZIMUTH_NOISE_AMPLITUDE:
				return azimuthNoiseAmplitude != AZIMUTH_NOISE_AMPLITUDE_EDEFAULT;
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__ELEVATION_NOISE_AMPLITUDE:
				return elevationNoiseAmplitude != ELEVATION_NOISE_AMPLITUDE_EDEFAULT;
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__HORIZON_DETECTION_ENABLED:
				return horizonDetectionEnabled != HORIZON_DETECTION_ENABLED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == RasterScanRangeSensor.class) {
			switch (baseOperationID) {
				case Symphony__AddonsSensorsRangePackage.RASTER_SCAN_RANGE_SENSOR___GET_SCAN_SETTINGS: return Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR___GET_SCAN_SETTINGS;
				default: return -1;
			}
		}
		if (baseClass == SimpleRasterScanRangeScanner.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR___GET_SCAN_SETTINGS:
				return getScanSettings();
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
		result.append(" (rangeNoiseAmplitude: ");
		result.append(rangeNoiseAmplitude);
		result.append(", azimuthNoiseAmplitude: ");
		result.append(azimuthNoiseAmplitude);
		result.append(", elevationNoiseAmplitude: ");
		result.append(elevationNoiseAmplitude);
		result.append(", horizonDetectionEnabled: ");
		result.append(horizonDetectionEnabled);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public CartesianTriangularMesh getCroppedMesh() 
	{
		CartesianTriangularMesh croppedMesh = null;
		
		// Gets the position on the lidar with respect to the meshNode.
		Matrix4d laserToMesh = TopologyFacade.INSTANCE.expressInFrame(this, getMeshNode());	
				
		// Sample the terrain to retain only polygon that are partially or fully within the maximum range.
		CartesianTriangularMeshPolygonSampler meshSampler = Symphony__CommonGeometryData3DFactory.eINSTANCE.createCartesianTriangularMeshPolygonSampler();				
		
		// Setup the sampling shape.
		RectangularFrustrumFieldOfViewSamplingShape<CartesianTriangle> samplingShape = Symphony__AddonsSensorsFOVFactory.eINSTANCE.createRectangularFrustrumFieldOfViewSamplingShape();
		samplingShape.setRectangularFrustrumFieldOfView(getScanSettings());
		samplingShape.setTransform(MathFacade.INSTANCE.createMatrix4x4(laserToMesh));
		
		meshSampler.getPolygonSamplingShapes().add(samplingShape);
						
		try
		{
			croppedMesh = (CartesianTriangularMesh) meshSampler.process(meshNode.getContent());
		} 
		catch (Exception e)
		{			
			e.printStackTrace();
		}
																		
		return croppedMesh;
	}

	@Override
	public List<RayData> getSimulatedRays() 
	{
		List<RayData> rays = new ArrayList<RayData>();
		
		double startAzimuth = -(getScanSettings().getHorizontalFieldOfViewAngle() / 2.0);				
		double startElevation = -(getScanSettings().getVerticalFieldOfViewAngle() / 2.0);		
		double azimuth = startAzimuth;
		double azimuthIncrement = getScanSettings().getHorizontalFieldOfViewAngle() / (getScanSettings().getHorizontalResolution() - 1);
		double elevation = startElevation;
		double elevetationIncrement = getScanSettings().getVerticalFieldOfViewAngle() / (getScanSettings().getVerticalResolution() - 1);

		int horizontalResolution = getScanSettings().getHorizontalResolution();
		int verticalResolution = getScanSettings().getVerticalResolution();
		
		for(int azimuthIndex = 0; azimuthIndex < horizontalResolution; azimuthIndex++)
		{			
			elevation = startElevation;
			for(int elevationIndex = 0; elevationIndex < verticalResolution; elevationIndex++)
			{
				RayData rayData = Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRayData();
				rayData.setOrigin(new Point3d());
				
				Vector3d v = new Vector3d(-Math.sin(elevation), Math.cos(elevation) * Math.sin(azimuth), Math.cos(elevation) * Math.cos(azimuth));
				v.normalize();
				rayData.setDirection(v);
				
				rays.add(rayData);				
				elevation += elevetationIncrement;				
			}
			
			azimuth += azimuthIncrement;
		}
				
		return rays;
	}

	@Override
	public double applyRangeNoise(double range, RayData cleanRayData, RayData noisyRayData) 
	{
		if(isNoiseEnabled())
		{
			double noisyRange = range + (-0.5 + Math.random()) * getRangeNoiseAmplitude();			
			return noisyRange;
		}
		else
		{
			return range;
		}
	}

	@Override
	public Coordinates25D createCoordinates25D(RayData rayData, double range) 
	{				
		if((range != Double.NaN) &&  (getScanSettings().getRange().isWithinRange(range)))
		{
			Vector3d v = rayData.getDirection();
			v.normalize();
			v.scale(range);
			v.add(rayData.getOrigin());
			
			return DataFacade.INSTANCE.createCoordinates25D(v.x, v.y, v.z);
		}
		else
		{
			return null;
		}
	}

	@Override
	public RayData applyOrientationNoise(RayData rayData) 
	{
		// TODO : Implements noise !
		RayData noisyOrientation = EcoreUtil.copy(rayData);
		return noisyOrientation;
	}

} //SimpleRasterScanRangeScannerSimulatorImpl
