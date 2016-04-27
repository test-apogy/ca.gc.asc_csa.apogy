package ca.gc.asc_csa.apogy.core.environment.ui.impl;
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;

import ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl;
import ca.gc.asc_csa.apogy.core.environment.ui.Activator;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.core.environment.ui.EarthSkyPresentation;
import ca.gc.asc_csa.apogy.core.environment.ui.EarthSkySceneObject;
import ca.gc.asc_csa.apogy.core.environment.ui.EarthSurfaceWorksitePresentation;
import ca.gc.asc_csa.apogy.core.environment.ui.preferences.ApogyEnvironmentUIPreferencesConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth Sky Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.EarthSkyPresentationImpl#isHorizonVisible <em>Horizon Visible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EarthSkyPresentationImpl extends NodePresentationImpl implements EarthSkyPresentation
{
	/**
	 * The default value of the '{@link #isHorizonVisible() <em>Horizon Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHorizonVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HORIZON_VISIBLE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isHorizonVisible() <em>Horizon Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHorizonVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean horizonVisible = HORIZON_VISIBLE_EDEFAULT;
	protected IPropertyChangeListener preferencesListener = null;
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated_NOT
	 */
  protected EarthSkyPresentationImpl()
  {
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
  protected EClass eStaticClass()
  {
		return ApogyCoreEnvironmentUIPackage.Literals.EARTH_SKY_PRESENTATION;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHorizonVisible() {
		return horizonVisible;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizonVisible(boolean newHorizonVisible) {
		boolean oldHorizonVisible = horizonVisible;
		horizonVisible = newHorizonVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentUIPackage.EARTH_SKY_PRESENTATION__HORIZON_VISIBLE, oldHorizonVisible, horizonVisible));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreEnvironmentUIPackage.EARTH_SKY_PRESENTATION__HORIZON_VISIBLE:
				return isHorizonVisible();
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
			case ApogyCoreEnvironmentUIPackage.EARTH_SKY_PRESENTATION__HORIZON_VISIBLE:
				setHorizonVisible((Boolean)newValue);
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
			case ApogyCoreEnvironmentUIPackage.EARTH_SKY_PRESENTATION__HORIZON_VISIBLE:
				setHorizonVisible(HORIZON_VISIBLE_EDEFAULT);
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
			case ApogyCoreEnvironmentUIPackage.EARTH_SKY_PRESENTATION__HORIZON_VISIBLE:
				return horizonVisible != HORIZON_VISIBLE_EDEFAULT;
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
		result.append(" (horizonVisible: ");
		result.append(horizonVisible);
		result.append(')');
		return result.toString();
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
			EarthSkySceneObject earthSkySceneObject = (EarthSkySceneObject) sceneObject;
			
			int featureID = notification.getFeatureID(EarthSurfaceWorksitePresentation.class);
			
			switch (featureID) 
			{
				// TODO
				case ApogyCoreEnvironmentUIPackage.EARTH_SURFACE_WORKSITE_PRESENTATION__AXIS_VISIBLE:
					earthSkySceneObject.setHorizonVisible(notification.getNewBooleanValue());
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
  		EarthSkySceneObject earthSkySceneObject = (EarthSkySceneObject) sceneObject;
    		
  		// Horizon
  		earthSkySceneObject.setHorizonVisible(isHorizonVisible());  		
  		
  		super.initialSceneObject();
  	}
  	
  
  	@Override
	protected void applyPreferences() 
  	{
  		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
  		
  		// Set the axis visibility and length.
  		setHorizonVisible(store.getBoolean(ApogyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SKY_HORIZON_VISIBLE_ID));
  		
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
} //EarthSkyPresentationImpl
