/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import ca.gc.asc_csa.apogy.common.emf.provider.ApogyCommonEMFEditPlugin;
import ca.gc.asc_csa.apogy.common.geometry.data.provider.ApogyCommonGeometryDataEditPlugin;
import ca.gc.asc_csa.apogy.common.geometry.data3d.provider.ApogyCommonGeometryData3DEditPlugin;
import ca.gc.asc_csa.apogy.common.images.provider.ApogyCommonImagesEditPlugin;
import ca.gc.asc_csa.apogy.common.math.provider.ApogyCommonMathEditPlugin;
import ca.gc.asc_csa.apogy.common.processors.provider.ApogyCommonProcessorsEditPlugin;
import ca.gc.asc_csa.apogy.common.topology.bindings.provider.ApogyCommonTopologyBindingsEditPlugin;
import ca.gc.asc_csa.apogy.common.topology.provider.ApogyCommonTopologyEditPlugin;
import ca.gc.asc_csa.apogy.core.environment.provider.ApogyCoreEnvironmentEditPlugin;
import ca.gc.asc_csa.apogy.core.invocator.provider.ApogyCoreInvocatorEditPlugin;
import ca.gc.asc_csa.apogy.core.provider.ApogyCoreEditPlugin;

/**
 * This is the central singleton for the ApogyCoreEnvironmentOrbit edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class ApogyCoreEnvironmentOrbitEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ApogyCoreEnvironmentOrbitEditPlugin INSTANCE = new ApogyCoreEnvironmentOrbitEditPlugin();

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
	public ApogyCoreEnvironmentOrbitEditPlugin() {
		super
		  (new ResourceLocator [] {
		     ApogyCoreEnvironmentEditPlugin.INSTANCE,
		     ApogyCommonEMFEditPlugin.INSTANCE,
		     ApogyCoreEditPlugin.INSTANCE,
		     ApogyCommonMathEditPlugin.INSTANCE,
		     ApogyCommonTopologyEditPlugin.INSTANCE,
		     ApogyCoreInvocatorEditPlugin.INSTANCE,
		     ApogyCommonImagesEditPlugin.INSTANCE,
		     ApogyCommonGeometryData3DEditPlugin.INSTANCE,
		     ApogyCommonTopologyBindingsEditPlugin.INSTANCE,
		     ApogyCommonGeometryDataEditPlugin.INSTANCE,
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