/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.symphony.addons.vehicle.ui.Activator;
import org.eclipse.symphony.addons.vehicle.ui.LanderSphericalFootPresentation;
import org.eclipse.symphony.addons.vehicle.ui.SymphonyToolsVehicleUIPackage;
import org.eclipse.symphony.addons.vehicle.ui.preferences.VehicleUIPreferencesConstants;

import ca.gc.space.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lander Spherical Foot Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LanderSphericalFootPresentationImpl extends NodePresentationImpl implements LanderSphericalFootPresentation
{
	protected IPropertyChangeListener preferencesListener = null;
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated_NOT
	 */
  protected LanderSphericalFootPresentationImpl()
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
		return SymphonyToolsVehicleUIPackage.Literals.LANDER_SPHERICAL_FOOT_PRESENTATION;
	}

  @Override
  protected void applyPreferences() 
  {
	  // Applies preferences.
	  IPreferenceStore store = Activator.getDefault().getPreferenceStore();
	  
	  // Change color.
	  RGB rgb = PreferenceConverter.getColor(store, VehicleUIPreferencesConstants.DEFAULT_LANDER_SPHERICAL_FOOT_COLOR_ID);
	  if(rgb != null) setColor(rgb);		

	  // Visibility
	  setVisible(store.getBoolean(VehicleUIPreferencesConstants.DEFAULT_LANDER_SPHERICAL_FOOT_VISIBILITY_ID));
	  
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
} //LanderSphericalFootPresentationImpl
