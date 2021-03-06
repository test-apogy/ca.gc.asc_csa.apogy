package ca.gc.asc_csa.apogy.common.topology.ui.jme3;
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

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.AdapterFactory;

public class Activator implements BundleActivator {

	public static final String ID = "ca.gc.asc_csa.apogy.common.topology.ui.jme3";
	
	public static final String JME3_EXTENSION_POINT_ID = "ca.gc.asc_csa.apogy.common.topology.ui.jme3.jme3Adapter";
	private static final String JME3_EXTENSION_POINT_ID_CLASS = "Class";

	private static final String MAIN_JME_LOGGER_NAME = "com.jme3";
	private static final Level MAIN_JME_LOGGER_LEVEL = Level.WARNING;
	
	private static final String OBJ_LOADER_JME_LOGGER_NAME = "com.jme3.scene.plugins.OBJLoader";
	private static final Level OBJ_LOADER_JME_LOGGER_LEVEL = Level.SEVERE;
	
	private static BundleContext context;

	private static Activator plugin;

	private static Level origMainLogLevel;
	private static Level origObjLoaderLogLevel;
	
	private AdapterFactory<JME3Adapter, JME3SceneObject, Node, Object> jme3AdapterFactory;

	public static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		Activator.plugin = this;
		
		changeLoggerLevels();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		
		restoreLoggerLevels();
	}

	public AdapterFactory<JME3Adapter, JME3SceneObject, Node, Object> getJME3AdapterFactory() {
		if (jme3AdapterFactory == null) {
			List<JME3Adapter> adapters = getRegisteredJME3Adapters();

			jme3AdapterFactory = new AdapterFactory<JME3Adapter, JME3SceneObject, Node, Object>(
					adapters);
		}

		return jme3AdapterFactory;
	}

	public List<JME3Adapter> getRegisteredJME3Adapters() {
		List<JME3Adapter> adapters = new ArrayList<JME3Adapter>();

		IExtensionPoint nodePresentationExtPoint = Platform
				.getExtensionRegistry().getExtensionPoint(
						JME3_EXTENSION_POINT_ID);				

		IConfigurationElement[] contributors = nodePresentationExtPoint
				.getConfigurationElements();

		for (int i = 0; i < contributors.length; i++) {
			IConfigurationElement contributor = contributors[i];

			try {
				JME3Adapter adapter = (JME3Adapter) contributor
						.createExecutableExtension(JME3_EXTENSION_POINT_ID_CLASS);
				adapters.add(adapter);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

		return adapters;
	}

	public static Activator getDefault() {
		return plugin;
	}
	
	private static void changeLoggerLevels()
	{
		Logger mainLogger = Logger.getLogger(MAIN_JME_LOGGER_NAME);
		origMainLogLevel = mainLogger.getLevel();
		mainLogger.setLevel(MAIN_JME_LOGGER_LEVEL);
		
		Logger objLoaderLogger = Logger.getLogger(OBJ_LOADER_JME_LOGGER_NAME);
		origObjLoaderLogLevel = objLoaderLogger.getLevel();
		objLoaderLogger.setLevel(OBJ_LOADER_JME_LOGGER_LEVEL);
	}
	
	private static void restoreLoggerLevels()
	{
		Logger.getLogger(MAIN_JME_LOGGER_NAME).setLevel(origMainLogLevel);
		Logger.getLogger(OBJ_LOADER_JME_LOGGER_NAME).setLevel(origObjLoaderLogLevel);
	}
}