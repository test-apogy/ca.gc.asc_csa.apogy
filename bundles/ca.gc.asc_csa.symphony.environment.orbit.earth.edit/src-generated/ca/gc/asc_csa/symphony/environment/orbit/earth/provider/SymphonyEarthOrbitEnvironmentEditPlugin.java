/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.earth.provider;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.provider.EMFEcoreInvocatorEditPlugin;
import ca.gc.asc_csa.eclipse.emf.ecore.provider.EMFEcoreEditPlugin;
import ca.gc.asc_csa.symphony.core.provider.SymphonyCoreEditPlugin;
import ca.gc.asc_csa.symphony.environment.orbit.provider.SymphonyOrbitEnvironmentEditPlugin;
import ca.gc.asc_csa.symphony.environment.provider.SymphonyEnvironmentEditPlugin;
import ca.gc.asc_csa.topology.bindings.provider.TopologyBindingsEditPlugin;
import ca.gc.space.mrt.common.processors.provider.ProcessorsEditPlugin;
import ca.gc.space.mrt.geometry.data.provider.GeometrydataEditPlugin;
import ca.gc.space.mrt.geometry.data3d.provider.Data3dEditPlugin;
import ca.gc.space.topology.provider.TopologyEditPlugin;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.symphony.common.math.provider.MathEditPlugin;

/**
 * This is the central singleton for the SymphonyEarthOrbitEnvironment edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class SymphonyEarthOrbitEnvironmentEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SymphonyEarthOrbitEnvironmentEditPlugin INSTANCE = new SymphonyEarthOrbitEnvironmentEditPlugin();

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
	public SymphonyEarthOrbitEnvironmentEditPlugin() {
		super
		  (new ResourceLocator [] {
		     SymphonyCoreEditPlugin.INSTANCE,
		     SymphonyEnvironmentEditPlugin.INSTANCE,
		     TopologyBindingsEditPlugin.INSTANCE,
		     TopologyEditPlugin.INSTANCE,
		     ProcessorsEditPlugin.INSTANCE,
		     Data3dEditPlugin.INSTANCE,
		     EMFEcoreEditPlugin.INSTANCE,
		     GeometrydataEditPlugin.INSTANCE,
		     MathEditPlugin.INSTANCE,
		     SymphonyOrbitEnvironmentEditPlugin.INSTANCE,
		     EMFEcoreInvocatorEditPlugin.INSTANCE,
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
