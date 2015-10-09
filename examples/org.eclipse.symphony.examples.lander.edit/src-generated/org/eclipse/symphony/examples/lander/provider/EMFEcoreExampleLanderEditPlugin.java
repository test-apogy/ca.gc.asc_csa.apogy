/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lander.provider;

import ca.gc.asc_csa.eclipse.emf.ecore.provider.EMFEcoreEditPlugin;
import ca.gc.asc_csa.topology.bindings.provider.TopologyBindingsEditPlugin;
import ca.gc.asc_csa.topology.dynamics.provider.Topology_dynamicsEditPlugin;
import ca.gc.space.mrt.geometry.data.provider.DataEditPlugin;
import ca.gc.space.mrt.mobility.pathplanners.provider.PathplannersEditPlugin;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.symphony.addons.geometry.paths.provider.PathEditPlugin;
import org.eclipse.symphony.addons.provider.SymphonyToolsCoreEditPlugin;
import org.eclipse.symphony.addons.vehicle.provider.SymphonyToolsVehicleEditPlugin;
import org.eclipse.symphony.common.geometry.data3d.provider.Data3dEditPlugin;
import org.eclipse.symphony.common.processors.provider.ProcessorsEditPlugin;
import org.eclipse.symphony.common.topology.provider.TopologyEditPlugin;
import org.eclipse.symphony.core.environment.provider.SymphonyEnvironmentEditPlugin;
import org.eclipse.symphony.core.invocator.provider.EMFEcoreInvocatorEditPlugin;
import org.eclipse.symphony.core.provider.SymphonyCoreEditPlugin;

/**
 * This is the central singleton for the EMFEcoreExampleLander edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class EMFEcoreExampleLanderEditPlugin extends EMFPlugin
{
  /**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final EMFEcoreExampleLanderEditPlugin INSTANCE = new EMFEcoreExampleLanderEditPlugin();

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
  public EMFEcoreExampleLanderEditPlugin()
  {
		super
		  (new ResourceLocator [] {
		     Data3dEditPlugin.INSTANCE,
		     EMFEcoreEditPlugin.INSTANCE,
		     PathEditPlugin.INSTANCE,
		     PathplannersEditPlugin.INSTANCE,
		     ProcessorsEditPlugin.INSTANCE,
		     TopologyEditPlugin.INSTANCE,
		     SymphonyToolsVehicleEditPlugin.INSTANCE,
		     DataEditPlugin.INSTANCE,
		     SymphonyCoreEditPlugin.INSTANCE,
		     TopologyBindingsEditPlugin.INSTANCE,
		     SymphonyToolsCoreEditPlugin.INSTANCE,
		     org.eclipse.symphony.common.geometry.data.provider.DataEditPlugin.INSTANCE,
		     EMFEcoreInvocatorEditPlugin.INSTANCE,
		     ca.gc.space.mrt.geometry.data3d.provider.Data3dEditPlugin.INSTANCE,
		     Topology_dynamicsEditPlugin.INSTANCE,
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
