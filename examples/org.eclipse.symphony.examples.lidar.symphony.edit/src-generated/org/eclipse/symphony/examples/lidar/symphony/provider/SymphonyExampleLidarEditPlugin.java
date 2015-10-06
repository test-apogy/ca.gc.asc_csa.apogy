/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lidar.symphony.provider;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.provider.EMFEcoreInvocatorEditPlugin;
import ca.gc.asc_csa.eclipse.emf.ecore.provider.EMFEcoreEditPlugin;
import ca.gc.asc_csa.symphony.core.provider.SymphonyCoreEditPlugin;
import ca.gc.asc_csa.topology.bindings.provider.TopologyBindingsEditPlugin;
import ca.gc.space.mrt.common.processors.provider.ProcessorsEditPlugin;
import ca.gc.space.mrt.geometry.data.provider.GeometrydataEditPlugin;
import ca.gc.space.mrt.geometry.data3d.provider.Data3dEditPlugin;
import ca.gc.space.mrt.sensors.fov.provider.FovEditPlugin;
import ca.gc.space.topology.provider.TopologyEditPlugin;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the SymphonyExampleLidar edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class SymphonyExampleLidarEditPlugin extends EMFPlugin
{
  /**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final SymphonyExampleLidarEditPlugin INSTANCE = new SymphonyExampleLidarEditPlugin();

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
  public SymphonyExampleLidarEditPlugin()
  {
		super
		  (new ResourceLocator [] {
<<<<<<< HEAD
		     TopologyEditPlugin.INSTANCE,
		     SymphonyCoreEditPlugin.INSTANCE,
		     EMFEcoreInvocatorEditPlugin.INSTANCE,
		     FovEditPlugin.INSTANCE,
		     ProcessorsEditPlugin.INSTANCE,
		     Data3dEditPlugin.INSTANCE,
		     EMFEcoreEditPlugin.INSTANCE,
		     TopologyBindingsEditPlugin.INSTANCE,
		     GeometrydataEditPlugin.INSTANCE,
=======
		     GeometrydataEditPlugin.INSTANCE,
		     TopologyEditPlugin.INSTANCE,
		     Data3dEditPlugin.INSTANCE,
		     EMFEcoreEditPlugin.INSTANCE,
		     SymphonyCoreEditPlugin.INSTANCE,
		     FovEditPlugin.INSTANCE,
		     ProcessorsEditPlugin.INSTANCE,
		     EMFEcoreInvocatorEditPlugin.INSTANCE,
		     TopologyBindingsEditPlugin.INSTANCE,
>>>>>>> refs/heads/RenamePackages
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