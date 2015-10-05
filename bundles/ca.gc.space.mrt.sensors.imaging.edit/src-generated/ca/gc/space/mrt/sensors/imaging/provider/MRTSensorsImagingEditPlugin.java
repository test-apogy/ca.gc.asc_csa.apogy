/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.space.mrt.sensors.imaging.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

import ca.gc.asc_csa.eclipse.emf.ecore.provider.EMFEcoreEditPlugin;
import ca.gc.asc_csa.eclipse.images.core.provider.Ca_gc_asc_csa_eclipse_imagesEditPlugin;
import ca.gc.space.math.provider.MathEditPlugin;
import ca.gc.space.mrt.common.processors.provider.ProcessorsEditPlugin;
import ca.gc.space.mrt.geometry.data.provider.GeometrydataEditPlugin;
import ca.gc.space.mrt.geometry.data3d.provider.Data3dEditPlugin;
import ca.gc.space.mrt.sensors.fov.provider.FovEditPlugin;
import ca.gc.space.mrt.sensors.sensors.provider.SensorsEditPlugin;
import ca.gc.space.topology.provider.TopologyEditPlugin;

/**
 * This is the central singleton for the MRTSensorsImaging edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class MRTSensorsImagingEditPlugin extends EMFPlugin
{
  /**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final MRTSensorsImagingEditPlugin INSTANCE = new MRTSensorsImagingEditPlugin();

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
  public MRTSensorsImagingEditPlugin()
  {
		super
		  (new ResourceLocator [] {
		     Data3dEditPlugin.INSTANCE,
		     EMFEcoreEditPlugin.INSTANCE,
		     Ca_gc_asc_csa_eclipse_imagesEditPlugin.INSTANCE,
		     FovEditPlugin.INSTANCE,
		     MathEditPlugin.INSTANCE,
		     ProcessorsEditPlugin.INSTANCE,
		     SensorsEditPlugin.INSTANCE,
		     TopologyEditPlugin.INSTANCE,
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
