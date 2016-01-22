/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015-2016
 */
package org.eclipse.symphony.examples.satellite.symphony.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.symphony.common.emf.provider.Symphony__CommonEMFEditPlugin;

import org.eclipse.symphony.common.geometry.data.provider.Symphony__CommonGeometryDataEditPlugin;

import org.eclipse.symphony.common.geometry.data3d.provider.Symphony__CommonGeometryData3DEditPlugin;

import org.eclipse.symphony.common.images.provider.Symphony__CommonImagesEditPlugin;

import org.eclipse.symphony.common.math.provider.Symphony__CommonMathEditPlugin;

import org.eclipse.symphony.common.processors.provider.Symphony__CommonProcessorsEditPlugin;

import org.eclipse.symphony.common.topology.bindings.provider.Symphony__CommonTopologyBindingsEditPlugin;

import org.eclipse.symphony.common.topology.provider.Symphony__CommonTopologyEditPlugin;

import org.eclipse.symphony.core.environment.orbit.earth.provider.Symphony__CoreEnvironmentOrbitEarthEditPlugin;

import org.eclipse.symphony.core.environment.orbit.provider.Symphony__CoreEnvironmentOrbitEditPlugin;

import org.eclipse.symphony.core.environment.provider.Symphony__CoreEnvironmentEditPlugin;

import org.eclipse.symphony.core.invocator.provider.Symphony__CoreInvocatorEditPlugin;

import org.eclipse.symphony.core.provider.Symphony__CoreEditPlugin;
import org.eclipse.symphony.examples.satellite.provider.Symphony__ExamplesSatelliteEditPlugin;

/**
 * This is the central singleton for the Symphony__ExamplesSatelliteSymphony edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class Symphony__ExamplesSatelliteSymphonyEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Symphony__ExamplesSatelliteSymphonyEditPlugin INSTANCE = new Symphony__ExamplesSatelliteSymphonyEditPlugin();

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
	public Symphony__ExamplesSatelliteSymphonyEditPlugin() {
		super
		  (new ResourceLocator [] {
		     Symphony__CoreEditPlugin.INSTANCE,
		     Symphony__CoreInvocatorEditPlugin.INSTANCE,
		     Symphony__ExamplesSatelliteEditPlugin.INSTANCE,
		     Symphony__CoreEnvironmentOrbitEarthEditPlugin.INSTANCE,
		     Symphony__CommonMathEditPlugin.INSTANCE,
		     Symphony__CommonEMFEditPlugin.INSTANCE,
		     Symphony__CommonTopologyEditPlugin.INSTANCE,
		     Symphony__CommonTopologyBindingsEditPlugin.INSTANCE,
		     Symphony__CoreEnvironmentEditPlugin.INSTANCE,
		     Symphony__CoreEnvironmentOrbitEditPlugin.INSTANCE,
		     Symphony__CommonImagesEditPlugin.INSTANCE,
		     Symphony__CommonGeometryData3DEditPlugin.INSTANCE,
		     Symphony__CommonGeometryDataEditPlugin.INSTANCE,
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