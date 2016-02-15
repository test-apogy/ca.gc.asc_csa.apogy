package ca.gc.asc_csa.apogy.common.converters;
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

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge;
import ca.gc.asc_csa.apogy.common.converters.impl.ApogyCommonConvertersFacadeImpl;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A utility class to perform a variety of common functions
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersPackage#getApogyCommonConvertersFacade()
 * @model
 * @generated
 */
public interface ApogyCommonConvertersFacade extends EObject {
	
	public static ApogyCommonConvertersFacade INSTANCE = ApogyCommonConvertersFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts an Object to an object of type targetType
	 * @param input The input object type.
	 * @param targetType The targeted output type required.
	 * @return The object of the targeted type, or null if no conversion was found.
	 * <!-- end-model-doc -->
	 * @model unique="false" inputUnique="false" targetTypeUnique="false"
	 * @generated
	 */
	Object convert(Object input, Class<?> targetType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the list of registered converters.
	 * @return The list of converters.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.apogy.common.converters.List<ca.gc.asc_csa.apogy.common.converters.IConverter>" unique="false" many="false"
	 * @generated
	 */
	List<IConverter> getAllRegisteredConverters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the SimpleDirectedWeightedGraph representing the converters.
	 * @return The SimpleDirectedWeightedGraph where vertex are input/output types and edges contain converters.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.apogy.common.converters.SimpleDirectedWeightedGraph<org.eclipse.emf.ecore.EJavaClass<?>, ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge>" unique="false"
	 * @generated
	 */
	SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> getGraph();

} // ApogyCommonConvertersFacade
