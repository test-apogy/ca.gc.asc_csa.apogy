/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.rover.symphony.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.symphony.common.emf.provider.Symphony__CommonEMFEditPlugin;

import org.eclipse.symphony.common.math.provider.Symphony__CommonMathEditPlugin;
import org.eclipse.symphony.common.topology.bindings.provider.Symphony__CommonTopologyBindingsEditPlugin;

import org.eclipse.symphony.common.topology.provider.Symphony__CommonTopologyEditPlugin;

import org.eclipse.symphony.core.invocator.provider.Symphony__CoreInvocatorEditPlugin;

import org.eclipse.symphony.core.provider.Symphony__CoreEditPlugin;

/**
 * This is the central singleton for the Symphony__ExamplesRoverSymphony edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class Symphony__ExamplesRoverSymphonyEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Symphony__ExamplesRoverSymphonyEditPlugin INSTANCE = new Symphony__ExamplesRoverSymphonyEditPlugin();

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
	public Symphony__ExamplesRoverSymphonyEditPlugin() {
		super
		  (new ResourceLocator [] {
		     Symphony__CoreEditPlugin.INSTANCE,
		     Symphony__CoreInvocatorEditPlugin.INSTANCE,
		     Symphony__CommonMathEditPlugin.INSTANCE,
		     Symphony__CommonEMFEditPlugin.INSTANCE,
		     Symphony__CommonTopologyEditPlugin.INSTANCE,
		     Symphony__CommonTopologyBindingsEditPlugin.INSTANCE,
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
