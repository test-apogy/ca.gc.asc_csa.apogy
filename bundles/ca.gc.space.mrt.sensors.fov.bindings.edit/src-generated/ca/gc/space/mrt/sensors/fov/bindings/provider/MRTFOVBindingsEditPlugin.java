/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.space.mrt.sensors.fov.bindings.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.symphony.common.geometry.data.provider.DataEditPlugin;
import org.eclipse.symphony.common.geometry.data3d.provider.Data3dEditPlugin;
import org.eclipse.symphony.common.processors.provider.ProcessorsEditPlugin;
import org.eclipse.symphony.common.topology.bindings.provider.TopologyBindingsEditPlugin;
import org.eclipse.symphony.common.topology.provider.TopologyEditPlugin;

import ca.gc.asc_csa.eclipse.emf.ecore.provider.EMFEcoreEditPlugin;
import ca.gc.space.mrt.sensors.fov.provider.FovEditPlugin;

/**
 * This is the central singleton for the MRTFOVBindings edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class MRTFOVBindingsEditPlugin extends EMFPlugin
{
  /**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final MRTFOVBindingsEditPlugin INSTANCE = new MRTFOVBindingsEditPlugin();

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
  public MRTFOVBindingsEditPlugin()
  {
		super
		  (new ResourceLocator [] {
		     TopologyBindingsEditPlugin.INSTANCE,
		     TopologyEditPlugin.INSTANCE,
		     ProcessorsEditPlugin.INSTANCE,
		     Data3dEditPlugin.INSTANCE,
		     DataEditPlugin.INSTANCE,
		     EMFEcoreEditPlugin.INSTANCE,
		     FovEditPlugin.INSTANCE,
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
