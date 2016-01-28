/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.converters;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.converters.Symphony__CommonConvertersFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__CommonConverters' childCreationExtenders='true' extensibleProviderFactory='true' operationReflection='true' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='Symphony__CommonConverters' modelDirectory='/org.eclipse.symphony.common.converters/src-generated' basePackage='org.eclipse.symphony.common'"
 * @generated
 */
public interface Symphony__CommonConvertersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "converters";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.symphony.common.converters";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "converters";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__CommonConvertersPackage eINSTANCE = org.eclipse.symphony.common.converters.impl.Symphony__CommonConvertersPackageImpl.init();

	/**
	 * The meta object id for the '<em>IConverter</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.converters.IConverter
	 * @see org.eclipse.symphony.common.converters.impl.Symphony__CommonConvertersPackageImpl#getIConverter()
	 * @generated
	 */
	int ICONVERTER = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.converters.impl.Symphony__CommonConvertersFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.converters.impl.Symphony__CommonConvertersFacadeImpl
	 * @see org.eclipse.symphony.common.converters.impl.Symphony__CommonConvertersPackageImpl#getSymphony__CommonConvertersFacade()
	 * @generated
	 */
	int SYMPHONY_COMMON_CONVERTERS_FACADE = 0;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_CONVERTERS_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Convert</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_CONVERTERS_FACADE___CONVERT__OBJECT_CLASS = 0;

	/**
	 * The operation id for the '<em>Get All Registered Converters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_CONVERTERS_FACADE___GET_ALL_REGISTERED_CONVERTERS = 1;

	/**
	 * The operation id for the '<em>Get Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_CONVERTERS_FACADE___GET_GRAPH = 2;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_CONVERTERS_FACADE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.symphony.common.converters.impl.Symphony__CommonConvertersPackageImpl#getList()
	 * @generated
	 */
	int LIST = 1;

	/**
	 * The meta object id for the '<em>Simple Directed Weighted Graph</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jgrapht.graph.SimpleDirectedWeightedGraph
	 * @see org.eclipse.symphony.common.converters.impl.Symphony__CommonConvertersPackageImpl#getSimpleDirectedWeightedGraph()
	 * @generated
	 */
	int SIMPLE_DIRECTED_WEIGHTED_GRAPH = 2;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.eclipse.symphony.common.converters.impl.Symphony__CommonConvertersPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 3;


	/**
	 * Returns the meta object for data type '{@link org.eclipse.symphony.common.converters.IConverter <em>IConverter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IConverter</em>'.
	 * @see org.eclipse.symphony.common.converters.IConverter
	 * @model instanceClass="org.eclipse.symphony.common.converters.IConverter"
	 * @generated
	 */
	EDataType getIConverter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.converters.Symphony__CommonConvertersFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see org.eclipse.symphony.common.converters.Symphony__CommonConvertersFacade
	 * @generated
	 */
	EClass getSymphony__CommonConvertersFacade();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.converters.Symphony__CommonConvertersFacade#convert(java.lang.Object, java.lang.Class) <em>Convert</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert</em>' operation.
	 * @see org.eclipse.symphony.common.converters.Symphony__CommonConvertersFacade#convert(java.lang.Object, java.lang.Class)
	 * @generated
	 */
	EOperation getSymphony__CommonConvertersFacade__Convert__Object_Class();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.converters.Symphony__CommonConvertersFacade#getAllRegisteredConverters() <em>Get All Registered Converters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Registered Converters</em>' operation.
	 * @see org.eclipse.symphony.common.converters.Symphony__CommonConvertersFacade#getAllRegisteredConverters()
	 * @generated
	 */
	EOperation getSymphony__CommonConvertersFacade__GetAllRegisteredConverters();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.converters.Symphony__CommonConvertersFacade#getGraph() <em>Get Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Graph</em>' operation.
	 * @see org.eclipse.symphony.common.converters.Symphony__CommonConvertersFacade#getGraph()
	 * @generated
	 */
	EOperation getSymphony__CommonConvertersFacade__GetGraph();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="E"
	 * @generated
	 */
	EDataType getList();

	/**
	 * Returns the meta object for data type '{@link org.jgrapht.graph.SimpleDirectedWeightedGraph <em>Simple Directed Weighted Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Simple Directed Weighted Graph</em>'.
	 * @see org.jgrapht.graph.SimpleDirectedWeightedGraph
	 * @model instanceClass="org.jgrapht.graph.SimpleDirectedWeightedGraph" typeParameters="V E"
	 * @generated
	 */
	EDataType getSimpleDirectedWeightedGraph();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Symphony__CommonConvertersFactory getSymphony__CommonConvertersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '<em>IConverter</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.converters.IConverter
		 * @see org.eclipse.symphony.common.converters.impl.Symphony__CommonConvertersPackageImpl#getIConverter()
		 * @generated
		 */
		EDataType ICONVERTER = eINSTANCE.getIConverter();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.converters.impl.Symphony__CommonConvertersFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.converters.impl.Symphony__CommonConvertersFacadeImpl
		 * @see org.eclipse.symphony.common.converters.impl.Symphony__CommonConvertersPackageImpl#getSymphony__CommonConvertersFacade()
		 * @generated
		 */
		EClass SYMPHONY_COMMON_CONVERTERS_FACADE = eINSTANCE.getSymphony__CommonConvertersFacade();

		/**
		 * The meta object literal for the '<em><b>Convert</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_CONVERTERS_FACADE___CONVERT__OBJECT_CLASS = eINSTANCE.getSymphony__CommonConvertersFacade__Convert__Object_Class();

		/**
		 * The meta object literal for the '<em><b>Get All Registered Converters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_CONVERTERS_FACADE___GET_ALL_REGISTERED_CONVERTERS = eINSTANCE.getSymphony__CommonConvertersFacade__GetAllRegisteredConverters();

		/**
		 * The meta object literal for the '<em><b>Get Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_CONVERTERS_FACADE___GET_GRAPH = eINSTANCE.getSymphony__CommonConvertersFacade__GetGraph();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.symphony.common.converters.impl.Symphony__CommonConvertersPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>Simple Directed Weighted Graph</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jgrapht.graph.SimpleDirectedWeightedGraph
		 * @see org.eclipse.symphony.common.converters.impl.Symphony__CommonConvertersPackageImpl#getSimpleDirectedWeightedGraph()
		 * @generated
		 */
		EDataType SIMPLE_DIRECTED_WEIGHTED_GRAPH = eINSTANCE.getSimpleDirectedWeightedGraph();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.eclipse.symphony.common.converters.impl.Symphony__CommonConvertersPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

	}

} //Symphony__CommonConvertersPackage
