package ca.gc.asc_csa.apogy.addons.sensors.gps.provider;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import ca.gc.asc_csa.apogy.addons.sensors.pose.provider.ApogyAddonsSensorsPoseEditPlugin;
import ca.gc.asc_csa.apogy.addons.sensors.provider.ApogyAddonsSensorsEditPlugin;
import ca.gc.asc_csa.apogy.common.emf.provider.ApogyCommonEMFEditPlugin;
import ca.gc.asc_csa.apogy.common.geometry.data.provider.ApogyCommonGeometryDataEditPlugin;
import ca.gc.asc_csa.apogy.common.geometry.data3d.provider.ApogyCommonGeometryData3DEditPlugin;
import ca.gc.asc_csa.apogy.common.math.provider.ApogyCommonMathEditPlugin;
import ca.gc.asc_csa.apogy.common.processors.provider.ApogyCommonProcessorsEditPlugin;
import ca.gc.asc_csa.apogy.common.topology.provider.ApogyCommonTopologyEditPlugin;

/**
 * This is the central singleton for the ApogyAddonsSensorsGPS edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class ApogyAddonsSensorsGPSEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ApogyAddonsSensorsGPSEditPlugin INSTANCE = new ApogyAddonsSensorsGPSEditPlugin();

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
	public ApogyAddonsSensorsGPSEditPlugin() {
		super
		  (new ResourceLocator [] {
		     ApogyAddonsSensorsPoseEditPlugin.INSTANCE,
		     ApogyCommonEMFEditPlugin.INSTANCE,
		     ApogyCommonTopologyEditPlugin.INSTANCE,
		     ApogyAddonsSensorsEditPlugin.INSTANCE,
		     ApogyCommonGeometryData3DEditPlugin.INSTANCE,
		     ApogyCommonMathEditPlugin.INSTANCE,
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
