/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.fov.bindings.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.symphony.addons.sensors.fov.provider.Symphony__AddonsSensorsFOVEditPlugin;
import org.eclipse.symphony.common.emf.provider.Symphony__CommonEMFEditPlugin;
import org.eclipse.symphony.common.geometry.data.provider.Symphony__CommonGeometryDataEditPlugin;
import org.eclipse.symphony.common.geometry.data3d.provider.Symphony__CommonGeometryData3DEditPlugin;
import org.eclipse.symphony.common.math.provider.Symphony__CommonMathEditPlugin;
import org.eclipse.symphony.common.processors.provider.Symphony__CommonProcessorsEditPlugin;
import org.eclipse.symphony.common.topology.bindings.provider.Symphony__CommonTopologyBindingsEditPlugin;
import org.eclipse.symphony.common.topology.provider.Symphony__CommonTopologyEditPlugin;

/**
 * This is the central singleton for the Symphony__AddonsSensorsFOVBindings edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class Symphony__AddonsSensorsFOVBindingsEditPlugin extends EMFPlugin
{
  /**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final Symphony__AddonsSensorsFOVBindingsEditPlugin INSTANCE = new Symphony__AddonsSensorsFOVBindingsEditPlugin();

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
  public Symphony__AddonsSensorsFOVBindingsEditPlugin()
  {
		super
		  (new ResourceLocator [] {
		     Symphony__CommonTopologyBindingsEditPlugin.INSTANCE,
		     Symphony__AddonsSensorsFOVEditPlugin.INSTANCE,
		     Symphony__CommonTopologyEditPlugin.INSTANCE,
		     Symphony__CommonEMFEditPlugin.INSTANCE,
		     Symphony__CommonGeometryDataEditPlugin.INSTANCE,
		     Symphony__CommonGeometryData3DEditPlugin.INSTANCE,
		     Symphony__CommonMathEditPlugin.INSTANCE,
		     Symphony__CommonProcessorsEditPlugin.INSTANCE,
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
