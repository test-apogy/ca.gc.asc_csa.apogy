/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.symphony.addons.sensors.fov.provider.FovEditPlugin;
import org.eclipse.symphony.addons.sensors.provider.SensorsEditPlugin;
import org.eclipse.symphony.common.geometry.data.provider.DataEditPlugin;
import org.eclipse.symphony.common.geometry.data3d.provider.Data3dEditPlugin;
import org.eclipse.symphony.common.processors.provider.ProcessorsEditPlugin;
import org.eclipse.symphony.common.topology.provider.TopologyEditPlugin;

import ca.gc.asc_csa.eclipse.emf.ecore.provider.EMFEcoreEditPlugin;

/**
 * This is the central singleton for the MRTSensorsImaging edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class MRTSensorsImagingEditPlugin extends EMFPlugin
{
  /**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final MRTSensorsImagingEditPlugin INSTANCE = new MRTSensorsImagingEditPlugin();

  /**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static Implementation plugin;

  /**
	 * Create the instance.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MRTSensorsImagingEditPlugin()
  {
		super
		  (new ResourceLocator [] {
		     Data3dEditPlugin.INSTANCE,
		     SensorsEditPlugin.INSTANCE,
		     EMFEcoreEditPlugin.INSTANCE,
		     DataEditPlugin.INSTANCE,
		     FovEditPlugin.INSTANCE,
		     ProcessorsEditPlugin.INSTANCE,
		     TopologyEditPlugin.INSTANCE,
		   });
	}

  /**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
  @Override
  public ResourceLocator getPluginResourceLocator()
  {
		return plugin;
	}

  /**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
  public static Implementation getPlugin()
  {
		return plugin;
	}

  /**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static class Implementation extends EclipsePlugin
  {
    /**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    public Implementation()
    {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
  }

}