package ca.gc.asc_csa.apogy.addons.vehicle.ui.impl;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.Activator;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.PhysicalWheelPresentation;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.ApogyAddonsVehicleUIPackage;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.preferences.VehicleUIPreferencesConstants;
import ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Wheel Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PhysicalWheelPresentationImpl extends NodePresentationImpl implements PhysicalWheelPresentation
{
   protected IPropertyChangeListener preferencesListener = null;
	
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected PhysicalWheelPresentationImpl()
  {
    super();
    
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
		return ApogyAddonsVehicleUIPackage.Literals.PHYSICAL_WHEEL_PRESENTATION;
	}

  @Override
  protected void applyPreferences() 
  {		  
	  IPreferenceStore store = Activator.getDefault().getPreferenceStore();
	  
	  // Change color.
	  RGB rgb = PreferenceConverter.getColor(store, VehicleUIPreferencesConstants.DEFAULT_PHYSICAL_WHEEL_COLOR_ID);
	  if(rgb != null) setColor(rgb);		
	  
	  // Visibility
	  setVisible(store.getBoolean(VehicleUIPreferencesConstants.DEFAULT_PHYSICAL_WHEEL_VISIBILITY_ID));
	  
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
  
  @Override
  protected void finalize() throws Throwable 
  {
	  Activator.getDefault().getPreferenceStore().removePropertyChangeListener(getPreferencesListener());
	  super.finalize();
  }
} //PhysicalWheelPresentationImpl
