/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lander.symphony.provider;

import ca.gc.asc_csa.eclipse.emf.ecore.provider.EMFEcoreEditPlugin;
import ca.gc.asc_csa.topology.bindings.provider.TopologyBindingsEditPlugin;
import ca.gc.asc_csa.topology.dynamics.provider.Topology_dynamicsEditPlugin;
import ca.gc.space.mrt.common.processors.provider.ProcessorsEditPlugin;
import ca.gc.space.mrt.geometry.data.provider.DataEditPlugin;
import ca.gc.space.mrt.geometry.paths.provider.PathEditPlugin;
import ca.gc.space.mrt.mobility.pathplanners.provider.PathplannersEditPlugin;
import ca.gc.space.topology.provider.TopologyEditPlugin;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.symphony.addons.provider.SymphonyToolsCoreEditPlugin;
import org.eclipse.symphony.addons.vehicle.provider.SymphonyToolsVehicleEditPlugin;
import org.eclipse.symphony.common.geometry.data3d.provider.Data3dEditPlugin;
import org.eclipse.symphony.core.environment.provider.SymphonyEnvironmentEditPlugin;
import org.eclipse.symphony.core.invocator.provider.EMFEcoreInvocatorEditPlugin;
import org.eclipse.symphony.core.provider.SymphonyCoreEditPlugin;
import org.eclipse.symphony.examples.lander.provider.EMFEcoreExampleLanderEditPlugin;

/**
 * This is the central singleton for the SymphonyExampleLander edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class SymphonyExampleLanderEditPlugin extends EMFPlugin
{
  /**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final SymphonyExampleLanderEditPlugin INSTANCE = new SymphonyExampleLanderEditPlugin();

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
  public SymphonyExampleLanderEditPlugin()
  {
		super
		  (new ResourceLocator [] {
		     TopologyBindingsEditPlugin.INSTANCE,
		     PathEditPlugin.INSTANCE,
		     EMFEcoreInvocatorEditPlugin.INSTANCE,
		     org.eclipse.symphony.common.geometry.data.provider.DataEditPlugin.INSTANCE,
		     TopologyEditPlugin.INSTANCE,
		     PathplannersEditPlugin.INSTANCE,
		     EMFEcoreExampleLanderEditPlugin.INSTANCE,
		     SymphonyToolsCoreEditPlugin.INSTANCE,
		     Data3dEditPlugin.INSTANCE,
		     SymphonyCoreEditPlugin.INSTANCE,
		     Topology_dynamicsEditPlugin.INSTANCE,
		     ProcessorsEditPlugin.INSTANCE,
		     SymphonyToolsVehicleEditPlugin.INSTANCE,
		     ca.gc.space.mrt.geometry.data3d.provider.Data3dEditPlugin.INSTANCE,
		     DataEditPlugin.INSTANCE,
		     EMFEcoreEditPlugin.INSTANCE,
		     SymphonyEnvironmentEditPlugin.INSTANCE,
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
