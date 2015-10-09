/**
 * Canadian Space Agency 2007.
 *
 * $Id: PoseEditPlugin.java,v 1.3.4.3 2015/09/22 20:02:14 rlarcheveque Exp $
 */
package ca.gc.space.mrt.sensors.pose.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.eclipse.symphony.addons.sensors.provider.SensorsEditPlugin;
import org.eclipse.symphony.common.geometry.data.provider.DataEditPlugin;
import org.eclipse.symphony.common.geometry.data3d.provider.Data3dEditPlugin;
import org.eclipse.symphony.common.math.provider.MathEditPlugin;
import org.eclipse.symphony.common.processors.provider.ProcessorsEditPlugin;
import org.eclipse.symphony.common.topology.provider.TopologyEditPlugin;

/**
 * This is the central singleton for the Pose edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class PoseEditPlugin extends EMFPlugin
{
	public static final String ID = "ca.gc.space.mrt.sensors.pose.provider";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PoseEditPlugin INSTANCE = new PoseEditPlugin();

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
	public PoseEditPlugin()
	{
		super
		  (new ResourceLocator [] {
		     Data3dEditPlugin.INSTANCE,
		     EcoreEditPlugin.INSTANCE,
		     MathEditPlugin.INSTANCE,
		     ProcessorsEditPlugin.INSTANCE,
		     SensorsEditPlugin.INSTANCE,
		     TopologyEditPlugin.INSTANCE,
		     DataEditPlugin.INSTANCE,
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
