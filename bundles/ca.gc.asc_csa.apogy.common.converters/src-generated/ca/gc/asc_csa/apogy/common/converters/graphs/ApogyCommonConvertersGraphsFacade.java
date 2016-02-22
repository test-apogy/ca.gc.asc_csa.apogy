package ca.gc.asc_csa.apogy.common.converters.graphs;
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

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

import org.eclipse.emf.ecore.EObject;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;
import ca.gc.asc_csa.apogy.common.converters.ChainedConverter;
import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.common.converters.graphs.impl.ApogyCommonConvertersGraphsFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A utility class used to perform a variety of functions
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsPackage#getApogyCommonConvertersGraphsFacade()
 * @model
 * @generated
 */
public interface ApogyCommonConvertersGraphsFacade extends EObject {
	
	public static ApogyCommonConvertersGraphsFacade INSTANCE = ApogyCommonConvertersGraphsFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a converter graph where the vertex are the input and output types and the edges contains the converters.
	 * @param converters The list of converter to include in the graph.
	 * @return The converter graph.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.converters.SimpleDirectedWeightedGraph<org.eclipse.emf.ecore.EJavaClass<?>, ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge>" unique="false" convertersDataType="ca.gc.asc_csa.apogy.common.converters.List<ca.gc.asc_csa.apogy.common.converters.IConverter>" convertersUnique="false" convertersMany="false"
	 * @generated
	 */
	SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> createGraph(List<IConverter> converters);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adds a list of IConverter to an existing graph.
	 * @param graph The graph to which converters will be added.
	 * @param converters The list of IConverter to be added to the graph.
	 * <!-- end-model-doc -->
	 * @model graphDataType="ca.gc.asc_csa.apogy.common.converters.SimpleDirectedWeightedGraph<org.eclipse.emf.ecore.EJavaClass<?>, ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge>" graphUnique="false" convertersDataType="ca.gc.asc_csa.apogy.common.converters.List<ca.gc.asc_csa.apogy.common.converters.IConverter>" convertersUnique="false" convertersMany="false"
	 * @generated
	 */
	void addConverters(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph, List<IConverter> converters);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generate the list of IConverter between types that can bes type casted and that do not have yet a converter.
	 * @param graph The graph of the conversion.
	 * @return A list of IConverter that converts types that are compatible.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.converters.List<ca.gc.asc_csa.apogy.common.converters.IConverter>" unique="false" many="false" graphDataType="ca.gc.asc_csa.apogy.common.converters.SimpleDirectedWeightedGraph<org.eclipse.emf.ecore.EJavaClass<?>, ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge>" graphUnique="false"
	 * @generated
	 */
	List<IConverter> generateTypeCastConverters(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts the input object to an object of the specified outputType.
	 * @param graph The graph containing the converters.
	 * @param input The input object.
	 * @param outputType The output type.
	 * @return The result of the conversion, null if no conversion was found.
	 * <!-- end-model-doc -->
	 * @model unique="false" graphDataType="ca.gc.asc_csa.apogy.common.converters.SimpleDirectedWeightedGraph<org.eclipse.emf.ecore.EJavaClass<?>, ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge>" graphUnique="false" inputUnique="false" outputTypeUnique="false"
	 * @generated
	 */
	Object convert(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph, Object input, Class<?> outputType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the list of ChainedConverter that could convert from a source to a destination type.
	 * @param graph The graph containing the converters.
	 * @param inputType The input type.
	 * @param outputType The output type.
	 * @return The list of ChainedConverter. Never null, but can be empty.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.converters.graphs.SortedSet<ca.gc.asc_csa.apogy.common.converters.graphs.ChainedConverter>" unique="false" graphDataType="ca.gc.asc_csa.apogy.common.converters.SimpleDirectedWeightedGraph<org.eclipse.emf.ecore.EJavaClass<?>, ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge>" graphUnique="false" inputTypeUnique="false" outputTypeUnique="false"
	 * @generated
	 */
	SortedSet<ChainedConverter> findAllConvertersBetweenVertices(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph, Class<?> inputType, Class<?> outputType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tries to find a converter between two types by searching a converter graph.
	 * @param graph The converter graph.
	 * @param inputType The input type.
	 * @param outputType The output type.
	 * @return The Chained converter that convert inputType to outputType, null if none was found.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.converters.graphs.ChainedConverter" unique="false" graphDataType="ca.gc.asc_csa.apogy.common.converters.SimpleDirectedWeightedGraph<org.eclipse.emf.ecore.EJavaClass<?>, ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge>" graphUnique="false" inputTypeUnique="false" outputTypeUnique="false"
	 * @generated
	 */
	ChainedConverter findConverter(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph, Class<?> inputType, Class<?> outputType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Given a graph, returns the list of all types that can be converted FROM (i.e. types with at least one outgoing converter).
	 * @param graph The provided graph.
	 * @return The list of all input types.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.converters.graphs.Set<org.eclipse.emf.ecore.EJavaClass<?>>" unique="false" graphDataType="ca.gc.asc_csa.apogy.common.converters.SimpleDirectedWeightedGraph<org.eclipse.emf.ecore.EJavaClass<?>, ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge>" graphUnique="false"
	 * @generated
	 */
	Set<Class<?>> getAllInputTypes(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Given a graph, returns the list of all types that can be converted TO (i.e. types with at least one ingoing converter).
	 * @param graph The provided graph.
	 * @return The list of all output types.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.converters.graphs.Set<org.eclipse.emf.ecore.EJavaClass<?>>" unique="false" graphDataType="ca.gc.asc_csa.apogy.common.converters.SimpleDirectedWeightedGraph<org.eclipse.emf.ecore.EJavaClass<?>, ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge>" graphUnique="false"
	 * @generated
	 */
	Set<Class<?>> getAllOutputTypes(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return a sorted list (from most specific to least specific) of potential source vertex for a specified input type.
	 * @param graph The graph of converters.
	 * @param inputType The input type.
	 * @return A sorted set of vertex.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.converters.List<org.eclipse.emf.ecore.EJavaClass<?>>" unique="false" many="false" graphDataType="ca.gc.asc_csa.apogy.common.converters.SimpleDirectedWeightedGraph<org.eclipse.emf.ecore.EJavaClass<?>, ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge>" graphUnique="false" inputTypeUnique="false"
	 * @generated
	 */
	List<Class<?>> getSourceVertex(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph, Class<?> inputType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return a sorted list (from most specific to least specific) of potential destination vertex for a specified input type.
	 * @param graph The graph of converters.
	 * @param inputType The output type.
	 * @return A sorted set of vertex.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.converters.List<org.eclipse.emf.ecore.EJavaClass<?>>" unique="false" many="false" graphDataType="ca.gc.asc_csa.apogy.common.converters.SimpleDirectedWeightedGraph<org.eclipse.emf.ecore.EJavaClass<?>, ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge>" graphUnique="false" outputTypeUnique="false"
	 * @generated
	 */
	List<Class<?>> getDestinationVertex(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph, Class<?> outputType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the class from a list that is closest to a specified type.
	 * @param classes The list of class to search.
	 * @param targetType The specified type.
	 * @return The closest type, null if none was found.
	 * <!-- end-model-doc -->
	 * @model unique="false" classesDataType="ca.gc.asc_csa.apogy.common.converters.List<org.eclipse.emf.ecore.EJavaClass<?>>" classesUnique="false" classesMany="false" targetTypeUnique="false"
	 * @generated
	 */
	Class<?> findClosestSuperType(List<Class<?>> classes, Class<?> targetType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the class from a list that is closest to a specified type.
	 * @param classes The list of class to search.
	 * @param targetType The specified type.
	 * @return The closest type, null if none was found.
	 * <!-- end-model-doc -->
	 * @model unique="false" classesDataType="ca.gc.asc_csa.apogy.common.converters.List<org.eclipse.emf.ecore.EJavaClass<?>>" classesUnique="false" classesMany="false" targetTypeUnique="false"
	 * @generated
	 */
	Class<?> findClosestSubType(List<Class<?>> classes, Class<?> targetType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the list of all converters, including type cast ones, contained in a given graph.
	 * @param graph The graph.
	 * @return The list of converters.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.converters.List<ca.gc.asc_csa.apogy.common.converters.IConverter>" unique="false" many="false" graphDataType="ca.gc.asc_csa.apogy.common.converters.SimpleDirectedWeightedGraph<org.eclipse.emf.ecore.EJavaClass<?>, ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge>" graphUnique="false"
	 * @generated
	 */
	List<IConverter> getAllConverters(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the list of all converters, EXCLUDING type cast ones, contained in a given graph.
	 * @param graph The graph.
	 * @return The list of converters.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.converters.List<ca.gc.asc_csa.apogy.common.converters.IConverter>" unique="false" many="false" graphDataType="ca.gc.asc_csa.apogy.common.converters.SimpleDirectedWeightedGraph<org.eclipse.emf.ecore.EJavaClass<?>, ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge>" graphUnique="false"
	 * @generated
	 */
	List<IConverter> getAllNonTypeCastConverters(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a map that maps input types to available destination types.
	 * @param graph The specified graph.
	 * @return A map mapping input types to available destination types.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.converters.graphs.Map<org.eclipse.emf.ecore.EJavaClass<?>, ca.gc.asc_csa.apogy.common.converters.List<org.eclipse.emf.ecore.EJavaClass<?>>>" unique="false" graphDataType="ca.gc.asc_csa.apogy.common.converters.SimpleDirectedWeightedGraph<org.eclipse.emf.ecore.EJavaClass<?>, ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge>" graphUnique="false"
	 * @generated
	 */
	Map<Class<?>, List<Class<?>>> getAvailableDestinationTypeMap(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a Comparator of ChainedConverter.
	 * @return The Comparator.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.converters.graphs.Comparator<ca.gc.asc_csa.apogy.common.converters.graphs.ChainedConverter>" unique="false"
	 * @generated
	 */
	Comparator<ChainedConverter> createComparator();

} // ApogyCommonConvertersGraphsFacade
