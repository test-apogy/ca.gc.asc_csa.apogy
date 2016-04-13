package ca.gc.asc_csa.apogy.common.converters.impl;
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
import ca.gc.asc_csa.apogy.common.converters.Activator;
import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade;
import ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersPackage;

import ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge;
import ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyCommonConvertersFacadeImpl extends MinimalEObjectImpl.Container implements ApogyCommonConvertersFacade
{
	private static ApogyCommonConvertersFacade instance = null;
	
	public static ApogyCommonConvertersFacade getInstance()
	{
		if (instance == null)
		{
			instance = new ApogyCommonConvertersFacadeImpl();
		}
		
		return instance;
	}
	
	public static final String CONVERTER_EXTENSION_POINT_ID = "ca.gc.asc_csa.apogy.common.converters";
	private static final String CONVERTER_EXTENSION_POINT_ID_CLASS = "Class";
	
	private List<IConverter> converters = null;
	private SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCommonConvertersFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonConvertersPackage.Literals.APOGY_COMMON_CONVERTERS_FACADE;
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
		return ApogyCommonConvertersGraphsFacade.INSTANCE.convert(getGraph(), input, targetType);
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
			graph = ApogyCommonConvertersGraphsFacade.INSTANCE.createGraph(getAllRegisteredConverters());
				
			// Creates and add the TypeCastConverters.
			List<IConverter> castConverters = ApogyCommonConvertersGraphsFacade.INSTANCE.generateTypeCastConverters(graph);
			ApogyCommonConvertersGraphsFacade.INSTANCE.addConverters(graph, castConverters);
		}
		
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonConvertersPackage.APOGY_COMMON_CONVERTERS_FACADE___CONVERT__OBJECT_CLASS:
				return convert(arguments.get(0), (Class<?>)arguments.get(1));
			case ApogyCommonConvertersPackage.APOGY_COMMON_CONVERTERS_FACADE___GET_ALL_REGISTERED_CONVERTERS:
				return getAllRegisteredConverters();
			case ApogyCommonConvertersPackage.APOGY_COMMON_CONVERTERS_FACADE___GET_GRAPH:
				return getGraph();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApogyCommonConvertersFacadeImpl
