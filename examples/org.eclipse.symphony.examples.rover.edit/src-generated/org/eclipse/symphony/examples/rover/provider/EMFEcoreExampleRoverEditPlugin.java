/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.rover.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.symphony.addons.actuators.provider.MRTActuatorsEditPlugin;

import org.eclipse.symphony.addons.sensors.fov.provider.FovEditPlugin;
import org.eclipse.symphony.addons.sensors.imaging.provider.MRTSensorsImagingEditPlugin;
import org.eclipse.symphony.addons.sensors.provider.SensorsEditPlugin;
import org.eclipse.symphony.common.emf.provider.EMFEcoreEditPlugin;

import org.eclipse.symphony.common.geometry.data.provider.DataEditPlugin;
import org.eclipse.symphony.common.geometry.data3d.provider.Data3dEditPlugin;
import org.eclipse.symphony.common.images.provider.ImagesCoreEditPlugin;
import org.eclipse.symphony.common.processors.provider.ProcessorsEditPlugin;
import org.eclipse.symphony.common.topology.provider.TopologyEditPlugin;

import org.eclipse.symphony.examples.camera.provider.EMFEcoreExampleCameraEditPlugin;

import org.eclipse.symphony.examples.mobile_platform.provider.EMFEcoreExampleMobilePlatformEditPlugin;

import org.eclipse.symphony.examples.robotic_arm.provider.EMFEcoreExampleRoboticArmEditPlugin;

/**
 * This is the central singleton for the EMFEcoreExampleRover edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class EMFEcoreExampleRoverEditPlugin extends EMFPlugin {
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
	public EMFEcoreExampleRoverEditPlugin() {
		super
		  (new ResourceLocator [] {
		     EMFEcoreExampleCameraEditPlugin.INSTANCE,
		     DataEditPlugin.INSTANCE,
		     MRTActuatorsEditPlugin.INSTANCE,
		     EMFEcoreEditPlugin.INSTANCE,
		     FovEditPlugin.INSTANCE,
		     EMFEcoreExampleRoboticArmEditPlugin.INSTANCE,
		     Data3dEditPlugin.INSTANCE,
		     MRTSensorsImagingEditPlugin.INSTANCE,
		     SensorsEditPlugin.INSTANCE,
		     ProcessorsEditPlugin.INSTANCE,
		     EMFEcoreExampleMobilePlatformEditPlugin.INSTANCE,
		     TopologyEditPlugin.INSTANCE,
		     ImagesCoreEditPlugin.INSTANCE,
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
