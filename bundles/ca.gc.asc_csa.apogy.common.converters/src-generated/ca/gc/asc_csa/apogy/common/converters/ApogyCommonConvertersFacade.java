/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.converters;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.converters.graphs.ConverterEdge;
import org.eclipse.symphony.common.converters.impl.Symphony__CommonConvertersFacadeImpl;
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
 * @see org.eclipse.symphony.common.converters.Symphony__CommonConvertersPackage#getSymphony__CommonConvertersFacade()
 * @model
 * @generated
 */
public interface Symphony__CommonConvertersFacade extends EObject {
	
	public static Symphony__CommonConvertersFacade INSTANCE = Symphony__CommonConvertersFacadeImpl.getInstance();
	
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
	 * @model kind="operation" dataType="org.eclipse.symphony.common.converters.List<org.eclipse.symphony.common.converters.IConverter>" unique="false" many="false"
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
	 * @model kind="operation" dataType="org.eclipse.symphony.common.converters.SimpleDirectedWeightedGraph<org.eclipse.emf.ecore.EJavaClass<?>, org.eclipse.symphony.common.converters.graphs.ConverterEdge>" unique="false"
	 * @generated
	 */
	SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> getGraph();

} // Symphony__CommonConvertersFacade
