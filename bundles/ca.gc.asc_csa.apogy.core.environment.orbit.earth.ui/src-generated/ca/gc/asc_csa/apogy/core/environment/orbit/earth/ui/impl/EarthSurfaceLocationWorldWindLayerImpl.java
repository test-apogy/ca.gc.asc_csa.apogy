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
import java.awt.Font;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.earth.EarthSurfaceLocation;
import ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.utils.MultiEObjectsAdapter;
import gov.nasa.worldwind.avlist.AVKey;
import gov.nasa.worldwind.geom.Angle;
import gov.nasa.worldwind.geom.Position;
import gov.nasa.worldwind.layers.RenderableLayer;
import gov.nasa.worldwind.render.AnnotationAttributes;
import gov.nasa.worldwind.render.BasicShapeAttributes;
import gov.nasa.worldwind.render.GlobeAnnotation;
import gov.nasa.worldwind.render.Material;
import gov.nasa.worldwind.render.SurfaceCircle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth Surface Location World Wind Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.impl.EarthSurfaceLocationWorldWindLayerImpl#getEarthSurfaceLocation <em>Earth Surface Location</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.impl.EarthSurfaceLocationWorldWindLayerImpl#getTargetRadius <em>Target Radius</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EarthSurfaceLocationWorldWindLayerImpl extends AbstractWorldWindLayerImpl implements EarthSurfaceLocationWorldWindLayer 
{
	private MultiEObjectsAdapter earthSurfaceLocationAdapter= null;
	
	/**
	 * The cached value of the '{@link #getEarthSurfaceLocation() <em>Earth Surface Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarthSurfaceLocation()
	 * @generated
	 * @ordered
	 */
	protected EarthSurfaceLocation earthSurfaceLocation;

	/**
	 * The default value of the '{@link #getTargetRadius() <em>Target Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double TARGET_RADIUS_EDEFAULT = 50.0;
	/**
	 * The cached value of the '{@link #getTargetRadius() <em>Target Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRadius()
	 * @generated
	 * @ordered
	 */
	protected double targetRadius = TARGET_RADIUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthSurfaceLocationWorldWindLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitEarthUIPackage.Literals.EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSurfaceLocation getEarthSurfaceLocation() {
		if (earthSurfaceLocation != null && earthSurfaceLocation.eIsProxy()) {
			InternalEObject oldEarthSurfaceLocation = (InternalEObject)earthSurfaceLocation;
			earthSurfaceLocation = (EarthSurfaceLocation)eResolveProxy(oldEarthSurfaceLocation);
			if (earthSurfaceLocation != oldEarthSurfaceLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__EARTH_SURFACE_LOCATION, oldEarthSurfaceLocation, earthSurfaceLocation));
			}
		}
		return earthSurfaceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSurfaceLocation basicGetEarthSurfaceLocation() {
		return earthSurfaceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setEarthSurfaceLocation(EarthSurfaceLocation newEarthSurfaceLocation)
	{
		getEarthSurfaceLocationAdapter().unregisterFromAllObjects();
		
		setEarthSurfaceLocationGen(newEarthSurfaceLocation);
		updateRenderableLayer();		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setEarthSurfaceLocationGen(EarthSurfaceLocation newEarthSurfaceLocation) {
		EarthSurfaceLocation oldEarthSurfaceLocation = earthSurfaceLocation;
		earthSurfaceLocation = newEarthSurfaceLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__EARTH_SURFACE_LOCATION, oldEarthSurfaceLocation, earthSurfaceLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTargetRadius() {
		return targetRadius;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setTargetRadius(double newTargetRadius)
	{		
		setTargetRadiusGen(newTargetRadius);
		
		if(isAutoUpdateEnabled()) update();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRadiusGen(double newTargetRadius) {
		double oldTargetRadius = targetRadius;
		targetRadius = newTargetRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__TARGET_RADIUS, oldTargetRadius, targetRadius));
	}

	@Override
	public boolean getDefaultAutoUpdateEnabled() {
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
			case ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__EARTH_SURFACE_LOCATION:
				if (resolve) return getEarthSurfaceLocation();
				return basicGetEarthSurfaceLocation();
			case ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__TARGET_RADIUS:
				return getTargetRadius();
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
			case ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__EARTH_SURFACE_LOCATION:
				setEarthSurfaceLocation((EarthSurfaceLocation)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__TARGET_RADIUS:
				setTargetRadius((Double)newValue);
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
			case ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__EARTH_SURFACE_LOCATION:
				setEarthSurfaceLocation((EarthSurfaceLocation)null);
				return;
			case ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__TARGET_RADIUS:
				setTargetRadius(TARGET_RADIUS_EDEFAULT);
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
			case ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__EARTH_SURFACE_LOCATION:
				return earthSurfaceLocation != null;
			case ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__TARGET_RADIUS:
				return targetRadius != TARGET_RADIUS_EDEFAULT;
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
		result.append(" (targetRadius: ");
		result.append(targetRadius);
		result.append(')');
		return result.toString();
	}

	@Override
	public void dispose() 
	{
		setEarthSurfaceLocation(null);				
		
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
			
			addRenderable(layer);
			
			getRenderableLayer().firePropertyChange(AVKey.LAYER, null, this);
		}
	}

	protected void addRenderable(RenderableLayer layer)
	{
		if(getEarthSurfaceLocation() != null)
		{
			GeographicCoordinates coord = getEarthSurfaceLocation();
			
			Angle latitude = Angle.fromRadiansLatitude(coord.getLatitude());
	        Angle longitude = Angle.fromRadiansLongitude(coord.getLongitude());
	        double elevation = coord.getElevation();
	        Position position = new Position(latitude, longitude, elevation);
	        
	        BasicShapeAttributes attributes = new BasicShapeAttributes();
	        attributes.setDrawInterior(true);
	        
	        Material mat = new Material(Color.CYAN);
	        attributes.setInteriorMaterial(mat);
	        SurfaceCircle surfaceCircle = new SurfaceCircle(attributes, position, getTargetRadius() * 1000.0, 24);	    
	        surfaceCircle.setVisible(true);
	        layer.addRenderable(surfaceCircle);
	        
	        // Adds the name as text
	        if(getEarthSurfaceLocation().getName() != null)
	        {
	        	// Creates an annotation.
	            GlobeAnnotation annotation = new GlobeAnnotation(getEarthSurfaceLocation().getName(), position);
	            
	            AnnotationAttributes annotationAttributes = new AnnotationAttributes();
	            annotationAttributes.setCornerRadius(0);
	            annotationAttributes.setVisible(true);
	            
	            Font font = annotationAttributes.getFont();	               
	            font = font.deriveFont(Font.BOLD, 16.0f);
	            annotationAttributes.setFont(font);
	            
	            Color transparent = new Color(0, 0f, 1f, 0.3f);
	            annotationAttributes.setBackgroundColor(transparent);
	            annotationAttributes.setTextColor(Color.YELLOW);		            
	            
	            annotation.setAttributes(annotationAttributes);
	            layer.addRenderable(annotation);
	        }
		}		
	}
	
	protected MultiEObjectsAdapter getEarthSurfaceLocationAdapter() 
	{
		if(earthSurfaceLocationAdapter == null)
		{
			earthSurfaceLocationAdapter = new MultiEObjectsAdapter()
			{
				@Override
				public void registerToEObject(EObject eObject) 
				{
					if(eObject instanceof EarthSurfaceLocation)
					{
						EarthSurfaceLocation newEarthSurfaceLocation = (EarthSurfaceLocation) eObject;
						newEarthSurfaceLocation.eAdapters().add(getEarthSurfaceLocationAdapter());						
					}
					else
					{
						super.registerToEObject(eObject);
					}
				}
				
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof EarthSurfaceLocation)
					{
						int featureId = msg.getFeatureID(EarthSurfaceLocation.class);
						switch (featureId) 
						{
							case ApogyEarthEnvironmentPackage.EARTH_SURFACE_LOCATION__NAME:
								if(isAutoUpdateEnabled()) updateRenderableLayer();
							break;
							case ApogyEarthEnvironmentPackage.EARTH_SURFACE_LOCATION__ELEVATION:
							case ApogyEarthEnvironmentPackage.EARTH_SURFACE_LOCATION__LATITUDE:
							case ApogyEarthEnvironmentPackage.EARTH_SURFACE_LOCATION__LONGITUDE:								
								if(isAutoUpdateEnabled()) updateRenderableLayer();								
							break;

							default:
							break;
						}
					}
					else if(msg.getNotifier() instanceof GeographicCoordinates)
					{
						if(isAutoUpdateEnabled()) updateRenderableLayer();
					}
				}				
			};
		}
		return earthSurfaceLocationAdapter;
	}

} //EarthSurfaceLocationWorldWindLayerImpl
