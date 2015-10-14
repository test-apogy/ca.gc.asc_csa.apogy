/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.symphony.addons.geometry.paths.provider.PathsEditPlugin;
import org.eclipse.symphony.addons.mobility.pathplanners.provider.PathplannersEditPlugin;
import org.eclipse.symphony.addons.provider.SymphonyToolsCoreEditPlugin;
import org.eclipse.symphony.common.emf.provider.EMFEcoreEditPlugin;
import org.eclipse.symphony.common.geometry.data.provider.DataEditPlugin;
import org.eclipse.symphony.common.geometry.data3d.provider.Data3dEditPlugin;
import org.eclipse.symphony.common.processors.provider.ProcessorsEditPlugin;
import org.eclipse.symphony.common.topology.bindings.provider.TopologyBindingsEditPlugin;
import org.eclipse.symphony.common.topology.provider.TopologyEditPlugin;
import org.eclipse.symphony.core.environment.provider.SymphonyEnvironmentEditPlugin;
import org.eclipse.symphony.core.invocator.provider.EMFEcoreInvocatorEditPlugin;
import org.eclipse.symphony.core.provider.SymphonyCoreEditPlugin;

/**
 * This is the central singleton for the SymphonyToolsVehicle edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class SymphonyToolsVehicleEditPlugin extends EMFPlugin
{
  /**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final SymphonyToolsVehicleEditPlugin INSTANCE = new SymphonyToolsVehicleEditPlugin();

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
  public SymphonyToolsVehicleEditPlugin()
  {
		super
		  (new ResourceLocator [] {
		     org.eclipse.symphony.common.geometry.data.provider.DataEditPlugin.INSTANCE,
		     PathsEditPlugin.INSTANCE,
		     Data3dEditPlugin.INSTANCE,
		     TopologyBindingsEditPlugin.INSTANCE,
		     EMFEcoreEditPlugin.INSTANCE,
		     ProcessorsEditPlugin.INSTANCE,
		     SymphonyEnvironmentEditPlugin.INSTANCE,
		     EMFEcoreInvocatorEditPlugin.INSTANCE,
		     SymphonyToolsCoreEditPlugin.INSTANCE,
		     TopologyEditPlugin.INSTANCE,
		     Topology_dynamicsEditPlugin.INSTANCE,
		     SymphonyCoreEditPlugin.INSTANCE,
		     PathplannersEditPlugin.INSTANCE,
		     DataEditPlugin.INSTANCE,
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
