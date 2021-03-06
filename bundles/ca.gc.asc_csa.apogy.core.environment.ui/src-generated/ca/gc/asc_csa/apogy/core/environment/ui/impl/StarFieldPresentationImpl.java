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
import ca.gc.asc_csa.apogy.core.environment.ui.StarFieldPresentation;
import ca.gc.asc_csa.apogy.core.environment.ui.StarFieldSceneObject;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.core.environment.ui.preferences.ApogyEnvironmentUIPreferencesConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Star Field Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.StarFieldPresentationImpl#getCutOffMagnitude <em>Cut Off Magnitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StarFieldPresentationImpl extends NodePresentationImpl implements StarFieldPresentation
{
	
  private IPropertyChangeListener iPropertyChangeListener;
	
	
  /**
	 * The default value of the '{@link #getCutOffMagnitude() <em>Cut Off Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCutOffMagnitude()
	 * @generated
	 * @ordered
	 */
  protected static final float CUT_OFF_MAGNITUDE_EDEFAULT = 6.0F;

  /**
	 * The cached value of the '{@link #getCutOffMagnitude() <em>Cut Off Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCutOffMagnitude()
	 * @generated
	 * @ordered
	 */
  protected float cutOffMagnitude = CUT_OFF_MAGNITUDE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated_NOT
	 */
  protected StarFieldPresentationImpl()
  {
		super();
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener(getIPropertyChangeListener());
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ApogyCoreEnvironmentUIPackage.Literals.STAR_FIELD_PRESENTATION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public float getCutOffMagnitude()
  {
		return cutOffMagnitude;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setCutOffMagnitude(float newCutOffMagnitude)
  {
	  	setCutOffMagnitudeGen(newCutOffMagnitude);
	  
	  	StarFieldSceneObject j3DObject = ((StarFieldSceneObject) sceneObject);	
		j3DObject.setCutOffMagnitude(newCutOffMagnitude);
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCutOffMagnitudeGen(float newCutOffMagnitude)
  {
		float oldCutOffMagnitude = cutOffMagnitude;
		cutOffMagnitude = newCutOffMagnitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentUIPackage.STAR_FIELD_PRESENTATION__CUT_OFF_MAGNITUDE, oldCutOffMagnitude, cutOffMagnitude));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case ApogyCoreEnvironmentUIPackage.STAR_FIELD_PRESENTATION__CUT_OFF_MAGNITUDE:
				return getCutOffMagnitude();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ApogyCoreEnvironmentUIPackage.STAR_FIELD_PRESENTATION__CUT_OFF_MAGNITUDE:
				setCutOffMagnitude((Float)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case ApogyCoreEnvironmentUIPackage.STAR_FIELD_PRESENTATION__CUT_OFF_MAGNITUDE:
				setCutOffMagnitude(CUT_OFF_MAGNITUDE_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case ApogyCoreEnvironmentUIPackage.STAR_FIELD_PRESENTATION__CUT_OFF_MAGNITUDE:
				return cutOffMagnitude != CUT_OFF_MAGNITUDE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cutOffMagnitude: ");
		result.append(cutOffMagnitude);
		result.append(')');
		return result.toString();
	}

  @Override
	public boolean isUseInBoundingCalculation() {
	  return false;
	}
  
  	protected IPropertyChangeListener getIPropertyChangeListener()
  	{
  		if(iPropertyChangeListener == null)
  		{
  			iPropertyChangeListener = new IPropertyChangeListener() 
  			{			  				  				  				  				
				@Override
				public void propertyChange(PropertyChangeEvent event) 
				{					
					if(event.getProperty().compareTo(ApogyEnvironmentUIPreferencesConstants.DEFAULT_STAR_MAGNITUDE_CUTOFF_ID) == 0)
					{
						System.out.println("StarFieldPresentationImpl " + event.getNewValue().getClass().getName());
						
						IPreferenceStore store = Activator.getDefault().getPreferenceStore();
						float magnitudeCutoff = (float) store.getDouble(ApogyEnvironmentUIPreferencesConstants.DEFAULT_STAR_MAGNITUDE_CUTOFF_ID);					
						setCutOffMagnitude(magnitudeCutoff);						
					}
				}
			};
  		}
  		
  		return iPropertyChangeListener;
  	}
  
} //StarFieldPresentationImpl
