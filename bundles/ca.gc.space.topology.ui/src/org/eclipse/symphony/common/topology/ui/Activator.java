package org.eclipse.symphony.common.topology.ui;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.osgi.framework.log.FrameworkLog;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.GraphicsContext;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.TopologyPresentationRegistry;
import org.eclipse.symphony.common.topology.ui.TopologyPresentationSet;
import org.eclipse.symphony.common.topology.ui.TopologyUIFactory;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String ID = "org.eclipse.symphony.common.topology.ui";

	public static final String PRESENTATION_EXTENSION_POINT_ID = "org.eclipse.symphony.common.topology.ui.presentation";

	public static final String JAVA3D_EXTENSION_POINT_ID = "org.eclipse.symphony.common.topology.ui.java3d";

	public static final String GRAPHICS_CONTEXT_POINT_ID = "org.eclipse.symphony.common.topology.ui.graphicsContextAdapter";

	private static final String PRESENTATION_EXTENSION_POINT_ID_CLASS = "Class";

	public static final String GRAPHICS_CONTEXT_POINT_ID_CLASS = "Class";

	// The shared instance
	private static Activator plugin;
		
	private static BundleContext bundleContext;	

	private AdapterFactory<NodePresentationAdapter, NodePresentation, Node, Object> nodePresentationAdapterFactory;

	private AdapterFactory<GraphicsContextAdapter, GraphicsContext, Object, Object> graphicsContextProvidersFactory;

	private Map<IFile, WeakReference<TopologyPresentationSet>> fileToPresentationTopologyMap;

	
	private static TopologyPresentationRegistry topologyPresentationRegistry = null;
	
	
	/**
	 * The constructor
	 */
	public Activator() {
	}


	
	public static BundleContext getContext() 
	{
		return bundleContext;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception 
	{
		super.start(context);
		bundleContext = context;
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception 
	{
		plugin = null;
		bundleContext = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() 
	{
		return plugin;
	}
	
	public AdapterFactory<NodePresentationAdapter, NodePresentation, Node, Object> getNodePresentationAdapterFactory() 
	{
		if (nodePresentationAdapterFactory == null) 
		{
			List<NodePresentationAdapter> adapters = getRegisteredNodePresentationAdapters();
			nodePresentationAdapterFactory = new AdapterFactory<NodePresentationAdapter, NodePresentation, Node, Object>(adapters);
		}
		return nodePresentationAdapterFactory;
	}

	public AdapterFactory<GraphicsContextAdapter, GraphicsContext, Object, Object> getGraphicsContextProvidersFactory() 
	{
		if (graphicsContextProvidersFactory == null) 
		{
			List<GraphicsContextAdapter> adapters = getRegisteredGraphicsContextAdapters();
			graphicsContextProvidersFactory = new AdapterFactory<GraphicsContextAdapter, GraphicsContext, Object, Object>(adapters);
		}
		return graphicsContextProvidersFactory;
	}

	public List<GraphicsContextAdapter> getRegisteredGraphicsContextAdapters() 
	{
		List<GraphicsContextAdapter> adapters = new ArrayList<GraphicsContextAdapter>();
		IExtensionPoint nodePresentationExtPoint = Platform.getExtensionRegistry().getExtensionPoint(GRAPHICS_CONTEXT_POINT_ID);
		IConfigurationElement[] contributors = nodePresentationExtPoint.getConfigurationElements();

		for (int i = 0; i < contributors.length; i++) 
		{
			IConfigurationElement contributor = contributors[i];

			try 
			{
				GraphicsContextAdapter adapter = (GraphicsContextAdapter) contributor.createExecutableExtension(GRAPHICS_CONTEXT_POINT_ID_CLASS);				
				adapters.add(adapter);			
			} 
			catch (CoreException e) 
			{
				e.printStackTrace();
			}
		}

		return adapters;
	}

	/**
	 * Returns the node adapter factory based on the content of the extension
	 * point org.eclipse.symphony.common.topology.ui.presentation.
	 */
	public List<NodePresentationAdapter> getRegisteredNodePresentationAdapters() 
	{
		List<NodePresentationAdapter> adapters = new ArrayList<NodePresentationAdapter>();

		IExtensionPoint nodePresentationExtPoint = Platform.getExtensionRegistry().getExtensionPoint(PRESENTATION_EXTENSION_POINT_ID);

		IConfigurationElement[] contributors = nodePresentationExtPoint.getConfigurationElements();

		for (int i = 0; i < contributors.length; i++) 
		{
			IConfigurationElement contributor = contributors[i];
			try 
			{
				NodePresentationAdapter adapter = (NodePresentationAdapter) contributor
						.createExecutableExtension(PRESENTATION_EXTENSION_POINT_ID_CLASS);
				adapters.add(adapter);
			} 
			catch (CoreException e) 
			{
				e.printStackTrace();
			}
		}

		return adapters;
	}

	public TopologyPresentationSet getPresentationTopology(IFile file) 
	{
		TopologyPresentationSet presTopo = null;

		if (getFileToPresentationTopologyMap().containsKey(file)) 
		{
			// We verify that the weak reference is still pointing to a
			// presentation topology.

			// The weak reference points to a null reference, we remove it from
			// the hashmap.
			if (getFileToPresentationTopologyMap().get(file).get() == null) 
			{
				getFileToPresentationTopologyMap().remove(file);
			} 
			else 
			{
				presTopo = getFileToPresentationTopologyMap().get(file).get();
			}
		}
		return presTopo;
	}

	public void registerPresentationTopology(IFile file,TopologyPresentationSet presTopo) 
	{
		getFileToPresentationTopologyMap().put(file, new WeakReference<TopologyPresentationSet>(presTopo));
	}

	public static TopologyPresentationRegistry getTopologyPresentationRegistry()
	{
		if(topologyPresentationRegistry == null)
		{
			topologyPresentationRegistry = TopologyUIFactory.eINSTANCE.createTopologyPresentationRegistry();
		}		
		return topologyPresentationRegistry;
	}
	
	/**
	 * Return the FrameworkLog that is used to log messages within Symphony.
	 * @return The FrameworkLog used to log messages.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static FrameworkLog getFrameworkLog()
	{
		if(getContext() != null)
		{
			ServiceReference logService = getContext().getServiceReference("org.eclipse.osgi.framework.log.FrameworkLog");				
			FrameworkLog log = (FrameworkLog) getContext().getService(logService);		
			return log;
		}
		else
		{
			return null;
		}
	}
		
	private Map<IFile, WeakReference<TopologyPresentationSet>> getFileToPresentationTopologyMap() 
	{
		if (fileToPresentationTopologyMap == null) 
		{
			fileToPresentationTopologyMap = new LinkedHashMap<IFile, WeakReference<TopologyPresentationSet>>();
		}
		return fileToPresentationTopologyMap;
	}
}