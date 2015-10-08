/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.vehicle.provider;

import ca.gc.asc_csa.eclipse.emf.ecore.provider.EMFEcoreEditPlugin;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.symphony.core.environment.provider.SymphonyEnvironmentEditPlugin;
import org.eclipse.symphony.core.invocator.provider.EMFEcoreInvocatorEditPlugin;
import org.eclipse.symphony.core.provider.SymphonyCoreEditPlugin;

import ca.gc.asc_csa.symphony.tools.core.provider.SymphonyToolsCoreEditPlugin;
import ca.gc.asc_csa.topology.bindings.provider.TopologyBindingsEditPlugin;
import ca.gc.asc_csa.topology.dynamics.provider.Topology_dynamicsEditPlugin;
import ca.gc.space.mrt.common.processors.provider.ProcessorsEditPlugin;
import ca.gc.space.mrt.geometry.data.provider.GeometrydataEditPlugin;
import ca.gc.space.mrt.geometry.data3d.provider.Data3dEditPlugin;
import ca.gc.space.mrt.geometry.paths.provider.PathEditPlugin;
import ca.gc.space.mrt.mobility.pathplanners.provider.PathplannersEditPlugin;
import ca.gc.space.topology.provider.TopologyEditPlugin;

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
		     PathplannersEditPlugin.INSTANCE,
		     SymphonyToolsCoreEditPlugin.INSTANCE,
		     PathEditPlugin.INSTANCE,
		     ProcessorsEditPlugin.INSTANCE,
		     EMFEcoreEditPlugin.INSTANCE,
		     TopologyEditPlugin.INSTANCE,
		     TopologyBindingsEditPlugin.INSTANCE,
		     Topology_dynamicsEditPlugin.INSTANCE,
		     SymphonyCoreEditPlugin.INSTANCE,
		     Data3dEditPlugin.INSTANCE,
		     SymphonyEnvironmentEditPlugin.INSTANCE,
		     EMFEcoreInvocatorEditPlugin.INSTANCE,
		     GeometrydataEditPlugin.INSTANCE,
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
