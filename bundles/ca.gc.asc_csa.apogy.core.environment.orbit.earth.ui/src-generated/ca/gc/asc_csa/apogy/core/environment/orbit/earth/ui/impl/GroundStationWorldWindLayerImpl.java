package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.awt.Color;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ConicalFieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.fov.DistanceRange;
import ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.earth.EarthSurfaceLocation;
import ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ConstantElevationMask;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GroundStationWorldWindLayer;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.utils.MultiEObjectsAdapter;
import gov.nasa.worldwind.avlist.AVKey;
import gov.nasa.worldwind.geom.Angle;
import gov.nasa.worldwind.geom.Position;
import gov.nasa.worldwind.globes.Earth;
import gov.nasa.worldwind.layers.RenderableLayer;
import gov.nasa.worldwind.render.BasicShapeAttributes;
import gov.nasa.worldwind.render.Material;
import gov.nasa.worldwind.render.SurfaceCircle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ground Station World Wind Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.impl.GroundStationWorldWindLayerImpl#getGroundStation <em>Ground Station</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.impl.GroundStationWorldWindLayerImpl#getReferenceAltitude <em>Reference Altitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroundStationWorldWindLayerImpl extends EarthSurfaceLocationWorldWindLayerImpl implements GroundStationWorldWindLayer 
{
	private MultiEObjectsAdapter groundStationAdapter = null;
	
	/**
	 * The cached value of the '{@link #getGroundStation() <em>Ground Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundStation()
	 * @generated
	 * @ordered
	 */
	protected GroundStation groundStation;

	/**
	 * The default value of the '{@link #getReferenceAltitude() <em>Reference Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceAltitude()
	 * @generated
	 * @ordered
	 */
	protected static final double REFERENCE_ALTITUDE_EDEFAULT = 500.0;

	/**
	 * The cached value of the '{@link #getReferenceAltitude() <em>Reference Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceAltitude()
	 * @generated
	 * @ordered
	 */
	protected double referenceAltitude = REFERENCE_ALTITUDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroundStationWorldWindLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitEarthUIPackage.Literals.GROUND_STATION_WORLD_WIND_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundStation getGroundStation() {
		if (groundStation != null && groundStation.eIsProxy()) {
			InternalEObject oldGroundStation = (InternalEObject)groundStation;
			groundStation = (GroundStation)eResolveProxy(oldGroundStation);
			if (groundStation != oldGroundStation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreEnvironmentOrbitEarthUIPackage.GROUND_STATION_WORLD_WIND_LAYER__GROUND_STATION, oldGroundStation, groundStation));
			}
		}
		return groundStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundStation basicGetGroundStation() {
		return groundStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setGroundStation(GroundStation newGroundStation) 
	{
		// Unregister from previous objects.
		getGroundStationAdapter().unregisterFromAllObjects();
		
		setGroundStationGen(newGroundStation);
		
		if(newGroundStation != null)
		{
			getGroundStationAdapter().registerToEObject(newGroundStation);			
		}
		
		if(isAutoUpdateEnabled()) update();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroundStationGen(GroundStation newGroundStation) {
		GroundStation oldGroundStation = groundStation;
		groundStation = newGroundStation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthUIPackage.GROUND_STATION_WORLD_WIND_LAYER__GROUND_STATION, oldGroundStation, groundStation));
	}	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReferenceAltitude() {
		return referenceAltitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setReferenceAltitude(double newReferenceAltitude) {
		setReferenceAltitudeGen(newReferenceAltitude);
		
		if(isAutoUpdateEnabled()) update();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceAltitudeGen(double newReferenceAltitude) {
		double oldReferenceAltitude = referenceAltitude;
		referenceAltitude = newReferenceAltitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthUIPackage.GROUND_STATION_WORLD_WIND_LAYER__REFERENCE_ALTITUDE, oldReferenceAltitude, referenceAltitude));
	}

	@Override
	public boolean getDefaultAutoUpdateEnabled() 
	{
		return true;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GROUND_STATION_WORLD_WIND_LAYER__GROUND_STATION:
				if (resolve) return getGroundStation();
				return basicGetGroundStation();
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GROUND_STATION_WORLD_WIND_LAYER__REFERENCE_ALTITUDE:
				return getReferenceAltitude();
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
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GROUND_STATION_WORLD_WIND_LAYER__GROUND_STATION:
				setGroundStation((GroundStation)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GROUND_STATION_WORLD_WIND_LAYER__REFERENCE_ALTITUDE:
				setReferenceAltitude((Double)newValue);
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
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GROUND_STATION_WORLD_WIND_LAYER__GROUND_STATION:
				setGroundStation((GroundStation)null);
				return;
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GROUND_STATION_WORLD_WIND_LAYER__REFERENCE_ALTITUDE:
				setReferenceAltitude(REFERENCE_ALTITUDE_EDEFAULT);
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
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GROUND_STATION_WORLD_WIND_LAYER__GROUND_STATION:
				return groundStation != null;
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GROUND_STATION_WORLD_WIND_LAYER__REFERENCE_ALTITUDE:
				return referenceAltitude != REFERENCE_ALTITUDE_EDEFAULT;
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
		result.append(" (referenceAltitude: ");
		result.append(referenceAltitude);
		result.append(')');
		return result.toString();
	}

	@Override
	public EarthSurfaceLocation getEarthSurfaceLocation() 
	{
		return getGroundStation();
	}
	
	@Override
	public void dispose() 
	{		
		setGroundStation(null);				
		super.dispose();
	}
	
	@Override
	protected void updateRenderableLayer() 
	{
		if(!isUpdating())
		{
			setUpdating(true);
			
			RenderableLayer layer = getRenderableLayer();
			layer.removeAllRenderables();
			
			// Adds renderable from super;
			super.addRenderable(layer);
			
			Job job = new Job("GroundStationWorldWindLayer updateRenderableLayer")
			{
				protected IStatus run(IProgressMonitor monitor) 
				{
					monitor.beginTask("Update", 1);
					
					if(isVisible() && getGroundStation()!= null)
					{
						GeographicCoordinates coord = getGroundStation();
						
						Angle latitude = Angle.fromRadiansLatitude(coord.getLatitude());
				        Angle longitude = Angle.fromRadiansLongitude(coord.getLongitude());
				        double elevation = coord.getElevation();
				        Position position = new Position(latitude, longitude, elevation);
				        
				        // Adds the FOV.
				        if(getGroundStation().getElevationMask() instanceof ConstantElevationMask)
				        {	        	
				        	ConstantElevationMask cFOV = (ConstantElevationMask) getGroundStation().getElevationMask();
			        		
			        		// Gets the outer circle radius.
				        	double refAltitude =getReferenceAltitude()*1000.0;
			        		double radius = computeGroundCircle(cFOV, refAltitude);
			        		
			        		BasicShapeAttributes fovAttributes = new BasicShapeAttributes();
			        		fovAttributes.setDrawInterior(true);
			     	        
			     	        Material interiorMat = new Material(new Color(1f, 0, 0, 0.1f));
			     	        fovAttributes.setInteriorMaterial(interiorMat);
			     	        fovAttributes.setDrawInterior(true);
			     	        fovAttributes.setInteriorOpacity(0.1f);
			     	        
			     	        Material outlineMat = new Material(new Color(1f, 0, 0, 1f));
			     	        fovAttributes.setOutlineMaterial(outlineMat);
			     	        
			     	        SurfaceCircle visibilityCircle = new SurfaceCircle(fovAttributes, position, radius, 36);	    
			     	        visibilityCircle.setVisible(true);	   	     	        
			     	        
			     	        layer.addRenderable(visibilityCircle);	     	        	        			        			        	
				        }
					}
					
					// Force layer to update.
					getRenderableLayer().firePropertyChange(AVKey.LAYER, null, this);
					setUpdating(false);
					return Status.OK_STATUS;
				}
			};
			job.schedule();
		}
	}
	
	protected double computeGroundCircle(ConstantElevationMask constantElevationMask, double range)
	{
		double radius = 0;
		
		double A = (Math.PI/2.0) + constantElevationMask.getConstantElevation();
		double a = Earth.WGS84_EQUATORIAL_RADIUS + range;
		double b = Earth.WGS84_EQUATORIAL_RADIUS;		
		double B = Math.asin(b / a * Math.sin(A));		
		double C = Math.PI - A - B;
		radius = C * Earth.WGS84_EQUATORIAL_RADIUS;		
						
		return radius;
	}

	protected MultiEObjectsAdapter getGroundStationAdapter() 
	{
		if(groundStationAdapter == null)
		{
			groundStationAdapter = new MultiEObjectsAdapter()
			{
				@Override
				public void registerToEObject(EObject eObject) 
				{
					if(eObject instanceof GroundStation)
					{
						GroundStation newGroundStation = (GroundStation) eObject;
						super.registerToEObject(newGroundStation);
						if(newGroundStation.getElevationMask() != null)
						{
							newGroundStation.getElevationMask().eAdapters().add(this);																		
						}
					}
					else
					{
						eObject.eAdapters().add(this);
					}
				}
				
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof GroundStation)
					{
						int featureId = msg.getFeatureID(GroundStation.class);
						switch (featureId) 
						{
							case ApogyCoreEnvironmentOrbitEarthPackage.GROUND_STATION__NAME:
								if(isAutoUpdateEnabled()) update();
							break;

							case ApogyCoreEnvironmentOrbitEarthPackage.GROUND_STATION__ELEVATION_MASK:
								
								if(msg.getOldValue() instanceof ElevationMask)
								{								
									((ElevationMask) msg.getOldValue()).eAdapters().remove(this);
								}
								
								if(msg.getNewValue() instanceof ElevationMask)
								{
									((ElevationMask) msg.getNewValue()).eAdapters().add(this);									
								}
								if(isAutoUpdateEnabled()) update();
							break;
							
							case ApogyEarthEnvironmentPackage.EARTH_SURFACE_LOCATION__ELEVATION:
							case ApogyEarthEnvironmentPackage.EARTH_SURFACE_LOCATION__LATITUDE:
							case ApogyEarthEnvironmentPackage.EARTH_SURFACE_LOCATION__LONGITUDE:								
								if(isAutoUpdateEnabled()) update();
							break;
							
							default:
							break;
						}
					}
					else if(msg.getNotifier() instanceof ElevationMask)
					{
						if(isAutoUpdateEnabled()) update();
					}
					else if(msg.getNotifier() instanceof GeographicCoordinates)
					{
						if(isAutoUpdateEnabled()) update();
					}
					else if(msg.getNotifier() instanceof DistanceRange)
					{
						if(isAutoUpdateEnabled()) update();
					}
					else if(msg.getNotifier() instanceof ConicalFieldOfView)
					{
						int featureId = msg.getFeatureID(ConicalFieldOfView.class);
						
						switch (featureId) 
						{
							case ApogyAddonsSensorsFOVPackage.CONICAL_FIELD_OF_VIEW__RANGE:							
								if(msg.getOldValue() instanceof DistanceRange)
								{
									getGroundStationAdapter().unregisterFromEObject((DistanceRange) msg.getOldValue());
								}
								
								if(msg.getNewValue() instanceof DistanceRange)
								{
									getGroundStationAdapter().registerToEObject((DistanceRange) msg.getNewValue());
								}
								
								if(isAutoUpdateEnabled()) update();
								
							break;

							default:
								if(isAutoUpdateEnabled()) update();
							break;
						}
					}
					else
					{
						if(isAutoUpdateEnabled()) update();
					}
				}
			};
		}
		return groundStationAdapter;
	}
	
} //GroundStationWorldWindLayerImpl
