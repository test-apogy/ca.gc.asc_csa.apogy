/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.ui.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.symphony.common.emf.provider.Symphony__CommonEMFEditPlugin;
import org.eclipse.symphony.common.math.provider.Symphony__CommonMathEditPlugin;
import org.eclipse.symphony.common.topology.bindings.provider.Symphony__CommonTopologyBindingsEditPlugin;
import org.eclipse.symphony.common.topology.provider.Symphony__CommonTopologyEditPlugin;
import org.eclipse.symphony.common.topology.ui.provider.Symphony__CommonTopologyUIEditPlugin;
import org.eclipse.symphony.core.invocator.provider.Symphony__CoreInvocatorEditPlugin;
import org.eclipse.symphony.core.provider.Symphony__CoreEditPlugin;

/**
 * This is the central singleton for the Symphony__CoreUI edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class Symphony__CoreUIEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Symphony__CoreUIEditPlugin INSTANCE = new Symphony__CoreUIEditPlugin();

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
	public Symphony__CoreUIEditPlugin() {
		super
		  (new ResourceLocator [] {
		     Symphony__CoreInvocatorEditPlugin.INSTANCE,
		     Symphony__CommonEMFEditPlugin.INSTANCE,
		     Symphony__CoreEditPlugin.INSTANCE,
		     Symphony__CommonTopologyUIEditPlugin.INSTANCE,
		     Symphony__CommonMathEditPlugin.INSTANCE,
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
