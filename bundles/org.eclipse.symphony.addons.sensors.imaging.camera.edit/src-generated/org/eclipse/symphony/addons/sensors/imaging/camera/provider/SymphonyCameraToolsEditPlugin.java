/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.symphony.addons.geometry.paths.provider.PathsEditPlugin;
import org.eclipse.symphony.addons.provider.SymphonyToolsCoreEditPlugin;
import org.eclipse.symphony.addons.sensors.fov.provider.FovEditPlugin;
import org.eclipse.symphony.addons.sensors.imaging.provider.MRTSensorsImagingEditPlugin;
import org.eclipse.symphony.addons.sensors.provider.SensorsEditPlugin;
import org.eclipse.symphony.common.emf.provider.EMFEcoreEditPlugin;
import org.eclipse.symphony.common.geometry.data.provider.DataEditPlugin;
import org.eclipse.symphony.common.geometry.data3d.provider.Data3dEditPlugin;
import org.eclipse.symphony.common.processors.provider.ProcessorsEditPlugin;
import org.eclipse.symphony.common.topology.bindings.provider.TopologyBindingsEditPlugin;
import org.eclipse.symphony.common.topology.provider.TopologyEditPlugin;
import org.eclipse.symphony.core.invocator.provider.EMFEcoreInvocatorEditPlugin;
import org.eclipse.symphony.core.provider.SymphonyCoreEditPlugin;

/**
 * This is the central singleton for the SymphonyCameraTools edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class SymphonyCameraToolsEditPlugin extends EMFPlugin
{
  /**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final SymphonyCameraToolsEditPlugin INSTANCE = new SymphonyCameraToolsEditPlugin();

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
  public SymphonyCameraToolsEditPlugin()
  {
		super
		  (new ResourceLocator [] {
		     EMFEcoreInvocatorEditPlugin.INSTANCE,
<<<<<<< HEAD
		     SymphonyToolsCoreEditPlugin.INSTANCE,
		     EMFEcoreEditPlugin.INSTANCE,
		     MRTSensorsImagingEditPlugin.INSTANCE,
=======
		     MRTSensorsImagingEditPlugin.INSTANCE,
		     PathsEditPlugin.INSTANCE,
		     FovEditPlugin.INSTANCE,
		     SensorsEditPlugin.INSTANCE,
>>>>>>> branch 'master' of https://RJSchimpel@bitbucket.org/Symphony2Eclipse/org.eclipse.symphony.git
		     SymphonyCoreEditPlugin.INSTANCE,
<<<<<<< HEAD
		     FovEditPlugin.INSTANCE,
		     TopologyEditPlugin.INSTANCE,
		     PathsEditPlugin.INSTANCE,
		     SensorsEditPlugin.INSTANCE,
=======
		     SymphonyToolsCoreEditPlugin.INSTANCE,
		     ProcessorsEditPlugin.INSTANCE,
		     TopologyEditPlugin.INSTANCE,
		     DataEditPlugin.INSTANCE,
		     Data3dEditPlugin.INSTANCE,
>>>>>>> branch 'master' of https://RJSchimpel@bitbucket.org/Symphony2Eclipse/org.eclipse.symphony.git
		     TopologyBindingsEditPlugin.INSTANCE,
<<<<<<< HEAD
		     DataEditPlugin.INSTANCE,
		     Data3dEditPlugin.INSTANCE,
		     ProcessorsEditPlugin.INSTANCE,
=======
		     EMFEcoreEditPlugin.INSTANCE,
>>>>>>> branch 'master' of https://RJSchimpel@bitbucket.org/Symphony2Eclipse/org.eclipse.symphony.git
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
