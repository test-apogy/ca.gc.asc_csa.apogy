/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.converters.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.converters.Activator;
import org.eclipse.symphony.common.converters.IConverter;
import org.eclipse.symphony.common.converters.Symphony__CommonConvertersFacade;
import org.eclipse.symphony.common.converters.Symphony__CommonConvertersPackage;

import org.eclipse.symphony.common.converters.graphs.ConverterEdge;
import org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Symphony__CommonConvertersFacadeImpl extends MinimalEObjectImpl.Container implements Symphony__CommonConvertersFacade
{
	private static Symphony__CommonConvertersFacade instance = null;
	
	public static Symphony__CommonConvertersFacade getInstance()
	{
		if (instance == null)
		{
			instance = new Symphony__CommonConvertersFacadeImpl();
		}
		
		return instance;
	}
	
	public static final String CONVERTER_EXTENSION_POINT_ID = "org.eclipse.symphony.common.converters";
	private static final String CONVERTER_EXTENSION_POINT_ID_CLASS = "Class";
	
	private List<IConverter> converters = null;
	private SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Symphony__CommonConvertersFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CommonConvertersPackage.Literals.SYMPHONY_COMMON_CONVERTERS_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public synchronized Object convert(Object input, Class<?> targetType)
	{
		// Check to see if the input is already of the requested type.
		if(targetType.isAssignableFrom(input.getClass()))
		{
			return input;
		}
					
		// If no direct converter has been found, try to find one that is chained.
		return Symphony__CommonConvertersGraphsFacade.INSTANCE.convert(getGraph(), input, targetType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public synchronized List<IConverter> getAllRegisteredConverters()
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
								Logger.INSTANCE.log(Activator.ID, message, EventSeverity.ERROR);								
							}
						}
						else
						{
							// Report that the converter input type is null.
							String message = "Converter <" +  converter.getClass().getName() + "> contributed by <" + contributor.getContributor().getName() + "> has NULL input type !";
							Logger.INSTANCE.log(Activator.ID, message, EventSeverity.ERROR);
						}						
					}
					else
					{
						// Report that the converter is null.
						String message = "A NULL converter contributed by <" + contributor.getContributor().getName() + "> !";
						Logger.INSTANCE.log(Activator.ID, message, EventSeverity.ERROR);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public synchronized SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> getGraph()
	{
		if(graph == null)
		{
			graph = Symphony__CommonConvertersGraphsFacade.INSTANCE.createGraph(getAllRegisteredConverters());
				
			// Creates and add the TypeCastConverters.
			List<IConverter> castConverters = Symphony__CommonConvertersGraphsFacade.INSTANCE.generateTypeCastConverters(graph);
			Symphony__CommonConvertersGraphsFacade.INSTANCE.addConverters(graph, castConverters);
		}
		
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__CommonConvertersPackage.SYMPHONY_COMMON_CONVERTERS_FACADE___CONVERT__OBJECT_CLASS:
				return convert(arguments.get(0), (Class<?>)arguments.get(1));
			case Symphony__CommonConvertersPackage.SYMPHONY_COMMON_CONVERTERS_FACADE___GET_ALL_REGISTERED_CONVERTERS:
				return getAllRegisteredConverters();
			case Symphony__CommonConvertersPackage.SYMPHONY_COMMON_CONVERTERS_FACADE___GET_GRAPH:
				return getGraph();
		}
		return super.eInvoke(operationID, arguments);
	}

} //Symphony__CommonConvertersFacadeImpl
