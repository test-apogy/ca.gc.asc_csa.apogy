/**
 * <copyright>
 * </copyright>
 *
 * $Id: RangeEditPlugin.java,v 1.3.4.2 2015/05/21 15:49:57 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.range.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.eclipse.symphony.addons.sensors.provider.SensorsEditPlugin;
import org.eclipse.symphony.common.geometry.data.provider.DataEditPlugin;
import org.eclipse.symphony.common.geometry.data25d.provider.Data25dEditPlugin;
import org.eclipse.symphony.common.geometry.data3d.provider.Data3dEditPlugin;
import org.eclipse.symphony.common.math.provider.MathEditPlugin;
import org.eclipse.symphony.common.processors.provider.ProcessorsEditPlugin;
import org.eclipse.symphony.common.topology.provider.TopologyEditPlugin;

import ca.gc.space.mrt.common.provider.CommonEditPlugin;
import ca.gc.space.mrt.sensors.fov.provider.FovEditPlugin;

/**
 * This is the central singleton for the Range edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class RangeEditPlugin extends EMFPlugin
{
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RangeEditPlugin INSTANCE = new RangeEditPlugin();

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
	public RangeEditPlugin()
	{
		super
		  (new ResourceLocator [] {
		     Data25dEditPlugin.INSTANCE,
		     Data3dEditPlugin.INSTANCE,
		     EcoreEditPlugin.INSTANCE,
		     FovEditPlugin.INSTANCE,
		     DataEditPlugin.INSTANCE,
		     MathEditPlugin.INSTANCE,
		     CommonEditPlugin.INSTANCE,
		     ProcessorsEditPlugin.INSTANCE,
		     SensorsEditPlugin.INSTANCE,
		     TopologyEditPlugin.INSTANCE,
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