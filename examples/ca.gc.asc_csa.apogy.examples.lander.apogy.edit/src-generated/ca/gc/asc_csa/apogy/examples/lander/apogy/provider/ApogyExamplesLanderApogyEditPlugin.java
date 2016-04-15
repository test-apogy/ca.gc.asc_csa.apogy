package ca.gc.asc_csa.apogy.examples.lander.apogy.provider;
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

import ca.gc.asc_csa.apogy.addons.geometry.paths.provider.ApogyAddonsGeometryPathsEditPlugin;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.provider.ApogyAddonsMobilityPathplannersEditPlugin;
import ca.gc.asc_csa.apogy.addons.provider.ApogyAddonsEditPlugin;
import ca.gc.asc_csa.apogy.addons.vehicle.provider.ApogyAddonsVehicleEditPlugin;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import ca.gc.asc_csa.apogy.common.emf.provider.ApogyCommonEMFEditPlugin;
import ca.gc.asc_csa.apogy.common.geometry.data.provider.ApogyCommonGeometryDataEditPlugin;
import ca.gc.asc_csa.apogy.common.geometry.data3d.provider.ApogyCommonGeometryData3DEditPlugin;
import ca.gc.asc_csa.apogy.common.images.provider.ApogyCommonImagesEditPlugin;
import ca.gc.asc_csa.apogy.common.math.provider.ApogyCommonMathEditPlugin;
import ca.gc.asc_csa.apogy.common.processors.provider.ApogyCommonProcessorsEditPlugin;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.provider.ApogyCommonTopologyAddonsDynamicsEditPlugin;
import ca.gc.asc_csa.apogy.common.topology.bindings.provider.ApogyCommonTopologyBindingsEditPlugin;
import ca.gc.asc_csa.apogy.common.topology.provider.ApogyCommonTopologyEditPlugin;
import ca.gc.asc_csa.apogy.core.environment.provider.ApogyCoreEnvironmentEditPlugin;
import ca.gc.asc_csa.apogy.core.invocator.provider.ApogyCoreInvocatorEditPlugin;
import ca.gc.asc_csa.apogy.core.provider.ApogyCoreEditPlugin;
import ca.gc.asc_csa.apogy.examples.lander.provider.ApogyExamplesLanderEditPlugin;

/**
 * This is the central singleton for the ApogyExamplesLanderApogy edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class ApogyExamplesLanderApogyEditPlugin extends EMFPlugin
{
  /**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final ApogyExamplesLanderApogyEditPlugin INSTANCE = new ApogyExamplesLanderApogyEditPlugin();

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
  public ApogyExamplesLanderApogyEditPlugin()
  {
		super
		  (new ResourceLocator [] {
		     ApogyCoreEditPlugin.INSTANCE,
		     ApogyCoreInvocatorEditPlugin.INSTANCE,
		     ApogyExamplesLanderEditPlugin.INSTANCE,
		     ApogyCommonMathEditPlugin.INSTANCE,
		     ApogyCommonEMFEditPlugin.INSTANCE,
		     ApogyCommonTopologyEditPlugin.INSTANCE,
		     ApogyCommonTopologyBindingsEditPlugin.INSTANCE,
		     ApogyAddonsVehicleEditPlugin.INSTANCE,
		     ApogyCommonGeometryData3DEditPlugin.INSTANCE,
		     ApogyCommonTopologyAddonsDynamicsEditPlugin.INSTANCE,
		     ApogyAddonsEditPlugin.INSTANCE,
		     ApogyCoreEnvironmentEditPlugin.INSTANCE,
		     ApogyAddonsMobilityPathplannersEditPlugin.INSTANCE,
		     ApogyAddonsGeometryPathsEditPlugin.INSTANCE,
		     ApogyCommonGeometryDataEditPlugin.INSTANCE,
		     ApogyCommonProcessorsEditPlugin.INSTANCE,
		     ApogyCommonImagesEditPlugin.INSTANCE,
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
