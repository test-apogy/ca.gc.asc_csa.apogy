/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.addons.mobility.controllers.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.symphony.addons.geometry.paths.provider.Symphony__AddonsGeometryPathsEditPlugin;

import org.eclipse.symphony.addons.mobility.provider.Symphony__AddonsMobilityEditPlugin;

import org.eclipse.symphony.addons.sensors.pose.provider.Symphony__AddonsSensorsPoseEditPlugin;

import org.eclipse.symphony.addons.sensors.provider.Symphony__AddonsSensorsEditPlugin;

import org.eclipse.symphony.common.geometry.data.provider.Symphony__CommonGeometryDataEditPlugin;

import org.eclipse.symphony.common.geometry.data3d.provider.Symphony__CommonGeometryData3DEditPlugin;

import org.eclipse.symphony.common.processors.provider.Symphony__CommonProcessorsEditPlugin;

import org.eclipse.symphony.common.topology.provider.Symphony__CommonTopologyEditPlugin;

/**
 * This is the central singleton for the MobilityControllers edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class MobilityControllersEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MobilityControllersEditPlugin INSTANCE = new MobilityControllersEditPlugin();

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
	public MobilityControllersEditPlugin() {
		super
		  (new ResourceLocator [] {
		     Symphony__AddonsSensorsPoseEditPlugin.INSTANCE,
		     Symphony__CommonProcessorsEditPlugin.INSTANCE,
		     Symphony__AddonsSensorsEditPlugin.INSTANCE,
		     Symphony__AddonsGeometryPathsEditPlugin.INSTANCE,
		     Symphony__CommonTopologyEditPlugin.INSTANCE,
		     Symphony__AddonsMobilityEditPlugin.INSTANCE,
		     Symphony__CommonGeometryData3DEditPlugin.INSTANCE,
		     Symphony__CommonGeometryDataEditPlugin.INSTANCE,
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
