/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.fov.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.symphony.common.geometry.data.provider.DataEditPlugin;

import org.eclipse.symphony.common.geometry.data3d.provider.Data3dEditPlugin;

import org.eclipse.symphony.common.math.provider.MathEditPlugin;
import org.eclipse.symphony.common.processors.provider.ProcessorsEditPlugin;

import org.eclipse.symphony.common.topology.provider.TopologyEditPlugin;

/**
 * This is the central singleton for the Symphony__AddonsSensorsFOV edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class Symphony__AddonsSensorsFOVEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Symphony__AddonsSensorsFOVEditPlugin INSTANCE = new Symphony__AddonsSensorsFOVEditPlugin();

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
	public Symphony__AddonsSensorsFOVEditPlugin() {
		super
		  (new ResourceLocator [] {
		     TopologyEditPlugin.INSTANCE,
		     DataEditPlugin.INSTANCE,
		     Data3dEditPlugin.INSTANCE,
		     MathEditPlugin.INSTANCE,
		     ProcessorsEditPlugin.INSTANCE,
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
