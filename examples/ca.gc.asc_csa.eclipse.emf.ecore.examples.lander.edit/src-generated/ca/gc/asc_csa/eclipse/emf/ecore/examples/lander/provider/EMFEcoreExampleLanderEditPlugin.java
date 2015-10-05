/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.provider;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.provider.EMFEcoreInvocatorEditPlugin;
import ca.gc.asc_csa.eclipse.emf.ecore.provider.EMFEcoreEditPlugin;
import ca.gc.asc_csa.eclipse.images.core.provider.Ca_gc_asc_csa_eclipse_imagesEditPlugin;
import ca.gc.asc_csa.symphony.core.provider.SymphonyCoreEditPlugin;
import ca.gc.asc_csa.symphony.environment.provider.SymphonyEnvironmentEditPlugin;
import ca.gc.asc_csa.symphony.tools.core.provider.SymphonyToolsCoreEditPlugin;
import ca.gc.asc_csa.symphony.tools.vehicle.provider.SymphonyToolsVehicleEditPlugin;
import ca.gc.asc_csa.topology.bindings.provider.TopologyBindingsEditPlugin;
import ca.gc.asc_csa.topology.dynamics.provider.Topology_dynamicsEditPlugin;
import ca.gc.space.math.provider.MathEditPlugin;
import ca.gc.space.mrt.common.processors.provider.ProcessorsEditPlugin;
import ca.gc.space.mrt.geometry.data.provider.GeometrydataEditPlugin;
import ca.gc.space.mrt.geometry.data3d.provider.Data3dEditPlugin;
import ca.gc.space.mrt.geometry.paths.provider.PathEditPlugin;
import ca.gc.space.mrt.mobility.pathplanners.provider.PathplannersEditPlugin;
import ca.gc.space.topology.provider.TopologyEditPlugin;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

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
		     PathplannersEditPlugin.INSTANCE,
		     TopologyBindingsEditPlugin.INSTANCE,
		     EMFEcoreInvocatorEditPlugin.INSTANCE,
		     PathEditPlugin.INSTANCE,
		     GeometrydataEditPlugin.INSTANCE,
		     Topology_dynamicsEditPlugin.INSTANCE,
		     TopologyEditPlugin.INSTANCE,
		     SymphonyCoreEditPlugin.INSTANCE,
		     SymphonyEnvironmentEditPlugin.INSTANCE,
		     EMFEcoreEditPlugin.INSTANCE,
		     SymphonyToolsVehicleEditPlugin.INSTANCE,
		     Data3dEditPlugin.INSTANCE,
		     MathEditPlugin.INSTANCE,
		     ProcessorsEditPlugin.INSTANCE,
		     Ca_gc_asc_csa_eclipse_imagesEditPlugin.INSTANCE,
		     SymphonyToolsCoreEditPlugin.INSTANCE,
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
