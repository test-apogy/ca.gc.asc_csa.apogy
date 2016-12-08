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
package ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;

import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.Activator;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.ApogyCoreEnvironmentSurfaceEarthUIPackage;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSurfaceWorksitePresentation;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.scene_objects.EarthSurfaceWorksiteSceneObject;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractSurfaceWorksitePresentationImpl;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.preferences.ApogyEnvironmentSurfaceUIPreferencesConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth Surface Worksite Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EarthSurfaceWorksitePresentationImpl extends AbstractSurfaceWorksitePresentationImpl implements EarthSurfaceWorksitePresentation 
{
	protected IPropertyChangeListener preferencesListener = null;
	 
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected EarthSurfaceWorksitePresentationImpl() {
		super();
		
		// Initializes values from preferences
		applyPreferences();	
		
		// Register a listener to the preference store
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener(getPreferencesListener());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentSurfaceEarthUIPackage.Literals.EARTH_SURFACE_WORKSITE_PRESENTATION;
	}

	@Override
	public boolean isUseInBoundingCalculation() 
  	{
	  return false;
	}  	   	
  	
  	@Override
  	protected void updateSceneObject(Notification notification) 
  	{
		if (sceneObject != null) 
		{
			EarthSurfaceWorksiteSceneObject earthSurfaceWorksiteSceneObject = (EarthSurfaceWorksiteSceneObject) sceneObject;
			
			int featureID = notification.getFeatureID(EarthSurfaceWorksitePresentation.class);
			
			switch (featureID) 
			{
				case ApogyCoreEnvironmentSurfaceEarthUIPackage.EARTH_SURFACE_WORKSITE_PRESENTATION__AXIS_VISIBLE:
					earthSurfaceWorksiteSceneObject.setAxisVisible(notification.getNewBooleanValue());
				break;
				
				case ApogyCoreEnvironmentSurfaceEarthUIPackage.EARTH_SURFACE_WORKSITE_PRESENTATION__AXIS_LENGTH:
					earthSurfaceWorksiteSceneObject.setAxisLength(notification.getNewDoubleValue());
				break;
				
				case ApogyCoreEnvironmentSurfaceEarthUIPackage.EARTH_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_VISIBLE:
					earthSurfaceWorksiteSceneObject.setAzimuthVisible(notification.getNewBooleanValue());
				break;
				
				case ApogyCoreEnvironmentSurfaceEarthUIPackage.EARTH_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_LINES_VISIBLE:
					earthSurfaceWorksiteSceneObject.setAzimuthLinesVisible(notification.getNewBooleanValue());
				break;
				
				case ApogyCoreEnvironmentSurfaceEarthUIPackage.EARTH_SURFACE_WORKSITE_PRESENTATION__ELEVATION_LINES_VISIBLE:
					earthSurfaceWorksiteSceneObject.setElevationLinesVisible(notification.getNewBooleanValue());
				break;
				
				case ApogyCoreEnvironmentSurfaceEarthUIPackage.EARTH_SURFACE_WORKSITE_PRESENTATION__PLANE_VISIBLE:
					earthSurfaceWorksiteSceneObject.setPlaneVisible(notification.getNewBooleanValue());
				break;
				
				case ApogyCoreEnvironmentSurfaceEarthUIPackage.EARTH_SURFACE_WORKSITE_PRESENTATION__PLANE_SIZE:
					earthSurfaceWorksiteSceneObject.setPlaneParameters(getPlaneGridSize(), notification.getNewDoubleValue());
				break;
				
				case ApogyCoreEnvironmentSurfaceEarthUIPackage.EARTH_SURFACE_WORKSITE_PRESENTATION__PLANE_GRID_SIZE:
					earthSurfaceWorksiteSceneObject.setPlaneParameters(notification.getNewDoubleValue(), getPlaneSize());
				break;
				
				default:
				break;
			}
		}
		
		super.updateSceneObject(notification);
	}
  	
  	@Override
  	protected void initialSceneObject() 
  	{
  		EarthSurfaceWorksiteSceneObject earthSurfaceWorksiteSceneObject = (EarthSurfaceWorksiteSceneObject) sceneObject;
    		
  		// Axis
  		earthSurfaceWorksiteSceneObject.setAxisVisible(isAxisVisible());
  		earthSurfaceWorksiteSceneObject.setAxisLength(getAxisLength());
  		
  		// Plane
  		earthSurfaceWorksiteSceneObject.setPlaneVisible(isPlaneVisible());
  		earthSurfaceWorksiteSceneObject.setPlaneParameters(getPlaneGridSize(), getPlaneSize());
  		
  		// Azimuth
  		earthSurfaceWorksiteSceneObject.setAzimuthVisible(isAzimuthVisible());
  		earthSurfaceWorksiteSceneObject.setAzimuthLinesVisible(isAzimuthLinesVisible());
  		
  		// Elevation
  		earthSurfaceWorksiteSceneObject.setElevationLinesVisible(isElevationLinesVisible());
  		
  		super.initialSceneObject();
  	}
  	
  
  	@Override
	protected void applyPreferences() 
  	{
  		IPreferenceStore surfaceUIPreferenceStore = ca.gc.asc_csa.apogy.core.environment.surface.ui.Activator.getDefault().getPreferenceStore();
  		
  		// Set the axis visibility and length.
  		setAxisVisible(surfaceUIPreferenceStore.getBoolean(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_AXIS_VISIBLE_ID));
  		setAxisLength(surfaceUIPreferenceStore.getDouble(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_AXIS_LENGTH_ID));
  		
  		// Set Azimuth and Azimuth Lines visibility.
  		setAzimuthVisible(surfaceUIPreferenceStore.getBoolean(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_AZIMUTH_VISIBLE_ID));
  		setAzimuthLinesVisible(surfaceUIPreferenceStore.getBoolean(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_AZIMUTH_LINES_VISIBLE_ID));
  		
  		// Set Elevation Line visibility.
  		setElevationLinesVisible(surfaceUIPreferenceStore.getBoolean(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_ELEVATION_LINES_VISIBLE_ID));
  		
  		// Set plane settings.
  		setPlaneVisible(surfaceUIPreferenceStore.getBoolean(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_PLANE_VISIBLE_ID));  		  
  		setPlaneSize(surfaceUIPreferenceStore.getDouble(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_PLANE_SIZE_ID));
  		setPlaneGridSize(surfaceUIPreferenceStore.getDouble(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_PLANE_GRID_SIZE_ID));
  		
		super.applyPreferences();
	}
  	
	private IPropertyChangeListener getPreferencesListener()
	{
		if(preferencesListener == null)
		{
			preferencesListener = new IPropertyChangeListener() 
			{
				public void propertyChange(PropertyChangeEvent event) 
				{	
					applyPreferences();		
				}	
			};
		}
		
		return preferencesListener;
	}

} //EarthSurfaceWorksitePresentationImpl
