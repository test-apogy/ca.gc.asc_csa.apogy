/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.eclipse.emf.ecore.examples.rover.provider;

import ca.gc.asc_csa.eclipse.emf.ecore.examples.mobile_platform.provider.EMFEcoreExampleMobilePlatformEditPlugin;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.robotic_arm.provider.EMFEcoreExampleRoboticArmEditPlugin;
import ca.gc.asc_csa.eclipse.emf.ecore.provider.EMFEcoreEditPlugin;
import ca.gc.space.math.provider.MathEditPlugin;
import ca.gc.space.mrt.actuators.provider.MRTActuatorsEditPlugin;
import ca.gc.space.mrt.common.processors.provider.ProcessorsEditPlugin;
import ca.gc.space.mrt.geometry.data.provider.GeometrydataEditPlugin;
import ca.gc.space.mrt.geometry.data3d.provider.Data3dEditPlugin;
import ca.gc.space.mrt.sensors.fov.provider.FovEditPlugin;
import ca.gc.space.mrt.sensors.imaging.provider.MRTSensorsImagingEditPlugin;
import ca.gc.space.mrt.sensors.sensors.provider.SensorsEditPlugin;
import ca.gc.space.topology.provider.TopologyEditPlugin;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.symphony.examples.camera.provider.EMFEcoreExampleCameraEditPlugin;

/**
 * This is the central singleton for the EMFEcoreExampleRover edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class EMFEcoreExampleRoverEditPlugin extends EMFPlugin
{
  /**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final EMFEcoreExampleRoverEditPlugin INSTANCE = new EMFEcoreExampleRoverEditPlugin();

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
  public EMFEcoreExampleRoverEditPlugin()
  {
		super
		  (new ResourceLocator [] {
		     SensorsEditPlugin.INSTANCE,
		     MRTSensorsImagingEditPlugin.INSTANCE,
		     MRTActuatorsEditPlugin.INSTANCE,
		     TopologyEditPlugin.INSTANCE,
		     ProcessorsEditPlugin.INSTANCE,
		     GeometrydataEditPlugin.INSTANCE,
		     MathEditPlugin.INSTANCE,
		     EMFEcoreExampleMobilePlatformEditPlugin.INSTANCE,
		     EMFEcoreExampleRoboticArmEditPlugin.INSTANCE,
		     EMFEcoreEditPlugin.INSTANCE,
		     EMFEcoreExampleCameraEditPlugin.INSTANCE,
		     Data3dEditPlugin.INSTANCE,
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
