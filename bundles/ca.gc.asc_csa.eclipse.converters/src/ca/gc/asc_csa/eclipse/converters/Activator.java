package ca.gc.asc_csa.eclipse.converters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import ca.gc.asc_csa.eclipse.converters.graphs.ConverterEdge;
import ca.gc.asc_csa.eclipse.converters.graphs.ConverterGraphUtilities;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator implements BundleActivator {

	public static final String CONVERTER_EXTENSION_POINT_ID = "ca.gc.asc_csa.eclipse.converters";
	private static final String CONVERTER_EXTENSION_POINT_ID_CLASS = "Class";
		
	private static List<IConverter> converters = null;
	private static SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph = null;
	
	// The plug-in ID
	public static final String PLUGIN_ID = "ca.gc.asc_csa.eclipse.converters"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	private static BundleContext context;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}
	
	static BundleContext getContext() {
		return context;
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext _context) throws Exception {
		context = _context;
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;		
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
	
	/**
	 * Converts an ISelection to an object of type targetType
	 * @param selection The ISelection.
	 * @param targetOutputType The class of the targeted type.
	 * @return A list of objects of the targeted type, can be empty.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public synchronized static List convert(ISelection selection, Class targetType)
	{
		List results = new ArrayList();
						 
		if(selection != null && targetType != null)
		{
			// First, tries to convert the selection directly.
			Object result = null;
			try
			{
				result = convert((Object)selection, targetType);
			}
			catch(Exception e)
			{
			}
			
			if(result != null)
			{
				results.add(result);
			}
			else
			{						
				if(selection instanceof IStructuredSelection)
				{
					IStructuredSelection structuredSelection = (IStructuredSelection) selection;
					
					// If the selection is not empty.
					if(!structuredSelection.isEmpty())				
					{					
						Iterator<?> it = structuredSelection.toList().iterator();
						while(it.hasNext())
						{
							Object element = it.next();
							
							try
							{
								// If the selection content is already of the required type, just return it.
								if(targetType.isAssignableFrom(element.getClass()))				
								{
									results.add(element);
								}
								else
								{
									// Tries to convert the element.
									Object output = convert(element, targetType);
									
									/* If no direct conversion from ISelection exist, tries to convert the first element of the selection if applicable.*/
									if((output != null))
									{
										results.add(output);
									}											
								}	
							}
							catch(Throwable t)
							{
								// Do nothing
							}
						}
					}
				}
			}
		}
		
		return results;
	}
	
	/**
	 *  Converts an Object to an object of type targetType
	 * @param input The input object type.
	 * @param outputType The targeted output type required.
	 * @return The object of the targeted type, or null if no conversion was found. 
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public synchronized static Object convert(Object input, Class outputType)
	{		
		// Check to see if the input is already of the requested type.
		if(outputType.isAssignableFrom(input.getClass()))
		{
			return input;
		}
				
		// If no direct converter has been found, try to find one that is chained.
		return ConverterGraphUtilities.convert(getGraph(), input, outputType);				
	}
	
	/**
	 * Return the list of registered converters.
	 * @return The list of converters.
	 */
	public synchronized static List<IConverter> getAllRegisteredConverters()
	{
		// Gets all the converters defined in the extensions.
		if(converters == null)
		{
			converters = new ArrayList<IConverter>();
				
			IExtensionPoint nodePresentationExtPoint = Platform.getExtensionRegistry().getExtensionPoint(CONVERTER_EXTENSION_POINT_ID);
	
			IConfigurationElement[] contributors = nodePresentationExtPoint.getConfigurationElements();
	
			for (int i = 0; i < contributors.length; i++) 
			{
				IConfigurationElement contributor = contributors[i];
	
				try 
				{
					IConverter converter = (IConverter) contributor.createExecutableExtension(CONVERTER_EXTENSION_POINT_ID_CLASS);
						
					if(converter != null)
					{
						if(converter.getInputType() != null)
						{
							if(converter.getOutputType() != null)
							{
								// Converter is OK, add it to the list.
								converters.add(converter);
							}
							else
							{
								// Report that the converter output type is null.
								String message = "Converter <" +  converter.getClass().getName() + "> contributed by <" + contributor.getContributor().getName() +"> has NULL output type !";
								Logger.INSTANCE.log(PLUGIN_ID, message, EventSeverity.ERROR);								
							}
						}
						else
						{
							// Report that the converter input type is null.
							String message = "Converter <" +  converter.getClass().getName() + "> contributed by <" + contributor.getContributor().getName() + "> has NULL input type !";
							Logger.INSTANCE.log(PLUGIN_ID, message, EventSeverity.ERROR);
						}						
					}
					else
					{
						// Report that the converter is null.
						String message = "A NULL converter contributed by <" + contributor.getContributor().getName() + "> !";
						Logger.INSTANCE.log(PLUGIN_ID, message, EventSeverity.ERROR);
					}
				} 
				catch (CoreException e) 
				{
					e.printStackTrace();
				}
			}					
		}
			
		return converters;
	}
	
	/**
	 * Returns the SimpleDirectedWeightedGraph representing the converters.
	 * @return The SimpleDirectedWeightedGraph where vertex are input/output types and edges contain converters.
	 */
	public synchronized static SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> getGraph()
	{		
		if(graph == null)
		{
			graph = ConverterGraphUtilities.createGraph(getAllRegisteredConverters());
				
			// Creates and add the TypeCastConverters.
			List<IConverter> castConverters = ConverterGraphUtilities.generateTypeCastConverters(graph);
			ConverterGraphUtilities.addConverters(graph, castConverters);
	
		}
		
		return graph;
	}
}
