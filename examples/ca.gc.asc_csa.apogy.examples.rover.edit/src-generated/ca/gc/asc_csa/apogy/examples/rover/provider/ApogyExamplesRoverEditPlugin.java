/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.rover.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;
import ca.gc.asc_csa.apogy.addons.actuators.provider.ApogyAddonsActuatorsEditPlugin;
import ca.gc.asc_csa.apogy.addons.sensors.fov.provider.ApogyAddonsSensorsFOVEditPlugin;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.provider.ApogyAddonsSensorsImagingEditPlugin;
import ca.gc.asc_csa.apogy.addons.sensors.provider.ApogyAddonsSensorsEditPlugin;
import ca.gc.asc_csa.apogy.common.emf.provider.ApogyCommonEMFEditPlugin;
import ca.gc.asc_csa.apogy.common.geometry.data.provider.ApogyCommonGeometryDataEditPlugin;
import ca.gc.asc_csa.apogy.common.geometry.data3d.provider.ApogyCommonGeometryData3DEditPlugin;
import ca.gc.asc_csa.apogy.common.images.provider.ApogyCommonImagesEditPlugin;
import ca.gc.asc_csa.apogy.common.math.provider.ApogyCommonMathEditPlugin;
import ca.gc.asc_csa.apogy.common.processors.provider.ApogyCommonProcessorsEditPlugin;
import ca.gc.asc_csa.apogy.common.topology.provider.ApogyCommonTopologyEditPlugin;
import ca.gc.asc_csa.apogy.examples.camera.provider.ApogyExamplesCameraEditPlugin;

import ca.gc.asc_csa.apogy.examples.mobile_platform.provider.ApogyExamplesMobilePlatformEditPlugin;

import ca.gc.asc_csa.apogy.examples.robotic_arm.provider.ApogyExamplesRoboticArmEditPlugin;

/**
 * This is the central singleton for the ApogyExamplesRover edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class ApogyExamplesRoverEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ApogyExamplesRoverEditPlugin INSTANCE = new ApogyExamplesRoverEditPlugin();

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
	public ApogyExamplesRoverEditPlugin() {
		super
		  (new ResourceLocator [] {
		     ApogyCommonEMFEditPlugin.INSTANCE,
		     ApogyExamplesRoboticArmEditPlugin.INSTANCE,
		     ApogyExamplesMobilePlatformEditPlugin.INSTANCE,
		     ApogyExamplesCameraEditPlugin.INSTANCE,
		     ApogyAddonsSensorsImagingEditPlugin.INSTANCE,
		     ApogyCommonTopologyEditPlugin.INSTANCE,
		     ApogyAddonsSensorsEditPlugin.INSTANCE,
		     ApogyAddonsSensorsFOVEditPlugin.INSTANCE,
		     ApogyAddonsActuatorsEditPlugin.INSTANCE,
		     ApogyCommonImagesEditPlugin.INSTANCE,
		     ApogyCommonMathEditPlugin.INSTANCE,
		     ApogyCommonGeometryDataEditPlugin.INSTANCE,
		     ApogyCommonGeometryData3DEditPlugin.INSTANCE,
		     ApogyCommonProcessorsEditPlugin.INSTANCE,
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
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}