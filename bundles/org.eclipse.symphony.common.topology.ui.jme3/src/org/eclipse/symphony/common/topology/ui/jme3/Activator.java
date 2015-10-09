package org.eclipse.symphony.common.topology.ui.jme3;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.symphony.common.topology.ui.jme3.JME3Adapter;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.AdapterFactory;

public class Activator implements BundleActivator {

	public static final String ID = "org.eclipse.symphony.common.topology.ui.jme3";
	
	public static final String JME3_EXTENSION_POINT_ID = "org.eclipse.symphony.common.topology.ui.jme3.JME3Adapter";
	private static final String JME3_EXTENSION_POINT_ID_CLASS = "Class";

	private static BundleContext context;

	private static Activator plugin;

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
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
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
}