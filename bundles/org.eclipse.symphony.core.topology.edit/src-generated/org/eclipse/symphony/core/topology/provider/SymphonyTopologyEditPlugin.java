/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.topology.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.symphony.core.environment.provider.SymphonyEnvironmentEditPlugin;
import org.eclipse.symphony.core.invocator.provider.EMFEcoreInvocatorEditPlugin;
import org.eclipse.symphony.core.provider.SymphonyCoreEditPlugin;

import ca.gc.asc_csa.eclipse.emf.ecore.provider.EMFEcoreEditPlugin;
import ca.gc.asc_csa.topology.bindings.provider.TopologyBindingsEditPlugin;
import ca.gc.space.mrt.common.processors.provider.ProcessorsEditPlugin;
import ca.gc.space.mrt.geometry.data.provider.GeometrydataEditPlugin;
import ca.gc.space.mrt.geometry.data3d.provider.Data3dEditPlugin;
import ca.gc.space.topology.provider.TopologyEditPlugin;

/**
 * This is the central singleton for the SymphonyTopology edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class SymphonyTopologyEditPlugin extends EMFPlugin
{
  /**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final SymphonyTopologyEditPlugin INSTANCE = new SymphonyTopologyEditPlugin();

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
  public SymphonyTopologyEditPlugin()
  {
		super
		  (new ResourceLocator [] {
		     TopologyBindingsEditPlugin.INSTANCE,
		     Data3dEditPlugin.INSTANCE,
		     EMFEcoreInvocatorEditPlugin.INSTANCE,
		     GeometrydataEditPlugin.INSTANCE,
		     SymphonyEnvironmentEditPlugin.INSTANCE,
		     TopologyEditPlugin.INSTANCE,
		     ProcessorsEditPlugin.INSTANCE,
		     SymphonyCoreEditPlugin.INSTANCE,
		     EMFEcoreEditPlugin.INSTANCE,
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
