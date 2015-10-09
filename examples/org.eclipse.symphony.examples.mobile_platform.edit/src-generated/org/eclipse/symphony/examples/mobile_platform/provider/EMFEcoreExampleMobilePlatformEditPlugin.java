/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.mobile_platform.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.symphony.common.emf.provider.EMFEcoreEditPlugin;

/**
 * This is the central singleton for the EMFEcoreExampleMobilePlatform edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class EMFEcoreExampleMobilePlatformEditPlugin extends EMFPlugin
{
  /**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final EMFEcoreExampleMobilePlatformEditPlugin INSTANCE = new EMFEcoreExampleMobilePlatformEditPlugin();

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
  public EMFEcoreExampleMobilePlatformEditPlugin()
  {
		super
		  (new ResourceLocator [] {
		     EMFEcoreEditPlugin.INSTANCE,
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
