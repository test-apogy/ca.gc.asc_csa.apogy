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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth Surface Worksite Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EarthSurfaceWorksitePresentationImpl extends AbstractSurfaceWorksitePresentationImpl implements EarthSurfaceWorksitePresentation 
{
	protected IPropertyChangeListener surfaceUIPreferencesListener = null;
	 
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected EarthSurfaceWorksitePresentationImpl() {
		super();
		
		// Initializes values from preferences
		applyPreferences();	
		
		// Register a listener to the Environment UI Preference store
		ca.gc.asc_csa.apogy.core.environment.surface.ui.Activator.getDefault().getPreferenceStore().addPropertyChangeListener(getSurfaceUIPreferencesListener());
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
				// Nothing yet.
			
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
    	
  		// Nothing yet.
  		
  		// DEBUG
  		earthSurfaceWorksiteSceneObject.setPlaneVisible(true);
  		earthSurfaceWorksiteSceneObject.setPlaneParameters(1, 100);
  		
  		
  		super.initialSceneObject();
  	}
  	
  
  	@Override
	protected void applyPreferences() 
  	{ 		
  		IPreferenceStore surfaceUIPreferenceStore = ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.Activator.getDefault().getPreferenceStore();
  		
  		// Nothing yet.
  		
		super.applyPreferences();
	}
  	
	private IPropertyChangeListener getSurfaceUIPreferencesListener()
	{
		if(surfaceUIPreferencesListener == null)
		{
			surfaceUIPreferencesListener = new IPropertyChangeListener() 
			{
				public void propertyChange(PropertyChangeEvent event) 
				{	
					applyPreferences();		
				}	
			};
		}
		
		return surfaceUIPreferencesListener;
	}

} //EarthSurfaceWorksitePresentationImpl
