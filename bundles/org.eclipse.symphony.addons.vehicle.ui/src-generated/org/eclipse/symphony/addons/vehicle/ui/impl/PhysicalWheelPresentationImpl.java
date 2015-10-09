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
import org.eclipse.symphony.addons.vehicle.ui.PhysicalWheelPresentation;
import org.eclipse.symphony.addons.vehicle.ui.SymphonyToolsVehicleUIPackage;
import org.eclipse.symphony.addons.vehicle.ui.preferences.VehicleUIPreferencesConstants;
import org.eclipse.symphony.common.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Wheel Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
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
		return SymphonyToolsVehicleUIPackage.Literals.PHYSICAL_WHEEL_PRESENTATION;
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
