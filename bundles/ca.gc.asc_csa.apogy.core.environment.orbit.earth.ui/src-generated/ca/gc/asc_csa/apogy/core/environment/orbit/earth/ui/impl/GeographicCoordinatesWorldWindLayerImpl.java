/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.impl;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.jface.viewers.ISelection;

import ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFacade;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GeographicCoordinatesWorldWindLayer;
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
 * An implementation of the model object '<em><b>Geographic Coordinates World Wind Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.impl.GeographicCoordinatesWorldWindLayerImpl#getGeographicCoordinatesList <em>Geographic Coordinates List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.impl.GeographicCoordinatesWorldWindLayerImpl#isLockSelection <em>Lock Selection</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.impl.GeographicCoordinatesWorldWindLayerImpl#isDisplayLocation <em>Display Location</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.impl.GeographicCoordinatesWorldWindLayerImpl#getDisplayedRadius <em>Displayed Radius</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeographicCoordinatesWorldWindLayerImpl extends AbstractWorldWindLayerImpl implements GeographicCoordinatesWorldWindLayer 
{
	public static final String DEGREE_STRING = "\u00b0";
	
	private MultiEObjectsAdapter geographicCoordinatesAdapter= null;
	
	private DecimalFormat latLongFormat = new DecimalFormat("0.000");
	private DecimalFormat altitudeFormat = new DecimalFormat("0.0");
	
	
	/**
	 * The cached value of the '{@link #getGeographicCoordinatesList() <em>Geographic Coordinates List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeographicCoordinatesList()
	 * @generated
	 * @ordered
	 */
	protected EList<GeographicCoordinates> geographicCoordinatesList;

	/**
	 * The default value of the '{@link #isLockSelection() <em>Lock Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLockSelection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCK_SELECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLockSelection() <em>Lock Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLockSelection()
	 * @generated
	 * @ordered
	 */
	protected boolean lockSelection = LOCK_SELECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisplayLocation() <em>Display Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplayLocation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPLAY_LOCATION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDisplayLocation() <em>Display Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplayLocation()
	 * @generated
	 * @ordered
	 */
	protected boolean displayLocation = DISPLAY_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayedRadius() <em>Displayed Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayedRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double DISPLAYED_RADIUS_EDEFAULT = 50.0;

	/**
	 * The cached value of the '{@link #getDisplayedRadius() <em>Displayed Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayedRadius()
	 * @generated
	 * @ordered
	 */
	protected double displayedRadius = DISPLAYED_RADIUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeographicCoordinatesWorldWindLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitEarthUIPackage.Literals.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeographicCoordinates> getGeographicCoordinatesList() {
		if (geographicCoordinatesList == null) {
			geographicCoordinatesList = new EObjectResolvingEList<GeographicCoordinates>(GeographicCoordinates.class, this, ApogyCoreEnvironmentOrbitEarthUIPackage.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__GEOGRAPHIC_COORDINATES_LIST);
		}
		return geographicCoordinatesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLockSelection() {
		return lockSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLockSelection(boolean newLockSelection) {
		boolean oldLockSelection = lockSelection;
		lockSelection = newLockSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthUIPackage.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__LOCK_SELECTION, oldLockSelection, lockSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisplayLocation() {
		return displayLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayLocation(boolean newDisplayLocation) {
		boolean oldDisplayLocation = displayLocation;
		displayLocation = newDisplayLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthUIPackage.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__DISPLAY_LOCATION, oldDisplayLocation, displayLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDisplayedRadius() {
		return displayedRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setDisplayedRadius(double newDisplayedRadius) 
	{
		setDisplayedRadiusGen(newDisplayedRadius);
		
		if(isAutoUpdateEnabled()) update();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayedRadiusGen(double newDisplayedRadius) {
		double oldDisplayedRadius = displayedRadius;
		displayedRadius = newDisplayedRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthUIPackage.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__DISPLAYED_RADIUS, oldDisplayedRadius, displayedRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__GEOGRAPHIC_COORDINATES_LIST:
				return getGeographicCoordinatesList();
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__LOCK_SELECTION:
				return isLockSelection();
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__DISPLAY_LOCATION:
				return isDisplayLocation();
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__DISPLAYED_RADIUS:
				return getDisplayedRadius();
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
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__LOCK_SELECTION:
				setLockSelection((Boolean)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__DISPLAY_LOCATION:
				setDisplayLocation((Boolean)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__DISPLAYED_RADIUS:
				setDisplayedRadius((Double)newValue);
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
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__LOCK_SELECTION:
				setLockSelection(LOCK_SELECTION_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__DISPLAY_LOCATION:
				setDisplayLocation(DISPLAY_LOCATION_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__DISPLAYED_RADIUS:
				setDisplayedRadius(DISPLAYED_RADIUS_EDEFAULT);
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
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__GEOGRAPHIC_COORDINATES_LIST:
				return geographicCoordinatesList != null && !geographicCoordinatesList.isEmpty();
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__LOCK_SELECTION:
				return lockSelection != LOCK_SELECTION_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__DISPLAY_LOCATION:
				return displayLocation != DISPLAY_LOCATION_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__DISPLAYED_RADIUS:
				return displayedRadius != DISPLAYED_RADIUS_EDEFAULT;
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
		result.append(" (lockSelection: ");
		result.append(lockSelection);
		result.append(", displayLocation: ");
		result.append(displayLocation);
		result.append(", displayedRadius: ");
		result.append(displayedRadius);
		result.append(')');
		return result.toString();
	}

	@Override
	protected void updateRenderableLayer() 
	{		
		if(!isUpdating())
		{
			setUpdating(true);
			RenderableLayer layer = getRenderableLayer();
			layer.removeAllRenderables();	
			
			if(isVisible())
			{
				addRenderable(layer);			
				getRenderableLayer().firePropertyChange(AVKey.LAYER, null, this);
			}
			setUpdating(false);
		}
	}

	@Override
	public void selectionChanged(ISelection selection) 
	{
		if(!isLockSelection())
		{
			List<Object> geographicCoordinatesList = ApogyCommonConvertersUIFacade.INSTANCE.convert(selection, GeographicCoordinates.class);
			
			if(!geographicCoordinatesList.isEmpty())
			{
				// Clears the list of GeographicCoordinates.
				getGeographicCoordinatesList().clear();
				getGeographicCoordinatesAdapter().unregisterFromAllObjects();
				
				for(Object obj : geographicCoordinatesList) 
				{
					if(obj instanceof GeographicCoordinates)
					{
						GeographicCoordinates geographicCoordinates = (GeographicCoordinates) obj;
						getGeographicCoordinatesAdapter().registerToEObject(geographicCoordinates);
						getGeographicCoordinatesList().add(geographicCoordinates);
					}
				}
				
				updateRenderableLayer();
			}		
		}
	}
	
	
	protected void addRenderable(RenderableLayer layer)
	{
		if(!getGeographicCoordinatesList().isEmpty())
		{
			// Adds a marquer for each coordinates.
			for(GeographicCoordinates coord : getGeographicCoordinatesList())
			{			
				Angle latitude = Angle.fromRadiansLatitude(coord.getLatitude());
		        Angle longitude = Angle.fromRadiansLongitude(coord.getLongitude());
		        double elevation = coord.getElevation();
		        Position position = new Position(latitude, longitude, elevation);
		        
		        BasicShapeAttributes attributes = new BasicShapeAttributes();
		        attributes.setDrawInterior(true);
		        
		        Material mat = new Material(Color.CYAN);
		        attributes.setInteriorMaterial(mat);
		        SurfaceCircle surfaceCircle = new SurfaceCircle(attributes, position, getDisplayedRadius() * 1000.0, 24);	    
		        surfaceCircle.setVisible(true);
		        layer.addRenderable(surfaceCircle);
		        
		        // Adds the name as text
		        String text = getDisplayedText(coord);
		        if(text != null)
		        {
		        	// Creates an annotation.
		            GlobeAnnotation annotation = new GlobeAnnotation(text, position);
		            
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
	}
	
	protected String getDisplayedText(GeographicCoordinates coord)
	{
		String text = null;
		
		 if(coord instanceof Named)
	     {
			Named named = (Named) coord;	
	        String name = named.getName();
		    if(name != null && name.length() > 0)
		    {
		        text = name;
		    }
	     }

		 if(isDisplayLocation())
		 {
			 // Initialze text is none has been created yet.
			 if(text == null)
			 {
				 text = new String();
			 }
			 else
			 {
				 text += "\n";
			 }
			 
			 text += latLongFormat.format(Math.toDegrees(coord.getLatitude())) + DEGREE_STRING + " lat, ";
			 text += latLongFormat.format(Math.toDegrees(coord.getLongitude())) + DEGREE_STRING + " lon, ";
			 text += altitudeFormat.format(coord.getElevation()) + " m alt";
		 }
		
		return text;
	}
	
	
	protected MultiEObjectsAdapter getGeographicCoordinatesAdapter() 
	{
		if(geographicCoordinatesAdapter == null)
		{
			geographicCoordinatesAdapter = new MultiEObjectsAdapter()
			{
				@Override
				public void registerToEObject(EObject eObject) 
				{
					if(eObject instanceof GeographicCoordinates)
					{
						GeographicCoordinates newGeographicCoordinates = (GeographicCoordinates) eObject;
						newGeographicCoordinates.eAdapters().add(getGeographicCoordinatesAdapter());						
					}
					else
					{
						super.registerToEObject(eObject);
					}
				}
				
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof GeographicCoordinates)
					{
						int featureId = msg.getFeatureID(GeographicCoordinates.class);
						switch (featureId) 
						{							
							case ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES__ELEVATION:
							case ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES__LATITUDE:
							case ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES__LONGITUDE:								
								if(isAutoUpdateEnabled()) updateRenderableLayer();								
							break;

							default:
							break;
						}
					}
					
					if(msg.getNotifier() instanceof Named)
					{						
						if(isAutoUpdateEnabled()) updateRenderableLayer();
					}
				}				
			};
		}
		return geographicCoordinatesAdapter;
	}
} //GeographicCoordinatesWorldWindLayerImpl
