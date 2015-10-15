/**
 * <copyright>
 * </copyright>
 *
 * $Id: ControllersEditPlugin.java,v 1.4.4.2 2015/05/21 15:50:54 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility.controllers.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.symphony.addons.geometry.paths.provider.PathsEditPlugin;
import org.eclipse.symphony.addons.mobility.provider.MobilityEditPlugin;
import org.eclipse.symphony.addons.sensors.pose.provider.PoseEditPlugin;
import org.eclipse.symphony.addons.sensors.provider.SensorsEditPlugin;
import org.eclipse.symphony.common.geometry.data.provider.DataEditPlugin;
import org.eclipse.symphony.common.geometry.data3d.provider.Data3dEditPlugin;
import org.eclipse.symphony.common.processors.provider.ProcessorsEditPlugin;
import org.eclipse.symphony.common.topology.provider.TopologyEditPlugin;

/**
 * This is the central singleton for the Controllers edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class ControllersEditPlugin extends EMFPlugin
{
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ControllersEditPlugin INSTANCE = new ControllersEditPlugin();

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
	public ControllersEditPlugin()
	{
		super
		  (new ResourceLocator [] {
		     PathsEditPlugin.INSTANCE,
		     DataEditPlugin.INSTANCE,
		     ProcessorsEditPlugin.INSTANCE,
		     TopologyEditPlugin.INSTANCE,
		     MobilityEditPlugin.INSTANCE,
		     PoseEditPlugin.INSTANCE,
		     Data3dEditPlugin.INSTANCE,
		     SensorsEditPlugin.INSTANCE,
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
