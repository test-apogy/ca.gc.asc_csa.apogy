/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.converters.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.common.converters.*;

import org.jgrapht.graph.SimpleDirectedWeightedGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonConvertersFactoryImpl extends EFactoryImpl implements Symphony__CommonConvertersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__CommonConvertersFactory init() {
		try {
			Symphony__CommonConvertersFactory theSymphony__CommonConvertersFactory = (Symphony__CommonConvertersFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CommonConvertersPackage.eNS_URI);
			if (theSymphony__CommonConvertersFactory != null) {
				return theSymphony__CommonConvertersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CommonConvertersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonConvertersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Symphony__CommonConvertersPackage.SYMPHONY_COMMON_CONVERTERS_FACADE: return createSymphony__CommonConvertersFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Symphony__CommonConvertersPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case Symphony__CommonConvertersPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH:
				return createSimpleDirectedWeightedGraphFromString(eDataType, initialValue);
			case Symphony__CommonConvertersPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case Symphony__CommonConvertersPackage.ICONVERTER:
				return createIConverterFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Symphony__CommonConvertersPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case Symphony__CommonConvertersPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH:
				return convertSimpleDirectedWeightedGraphToString(eDataType, instanceValue);
			case Symphony__CommonConvertersPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case Symphony__CommonConvertersPackage.ICONVERTER:
				return convertIConverterToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonConvertersFacade createSymphony__CommonConvertersFacade() {
		Symphony__CommonConvertersFacadeImpl symphony__CommonConvertersFacade = new Symphony__CommonConvertersFacadeImpl();
		return symphony__CommonConvertersFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<?> createListFromString(EDataType eDataType, String initialValue) {
		return (List<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleDirectedWeightedGraph<?, ?> createSimpleDirectedWeightedGraphFromString(EDataType eDataType, String initialValue) {
		return (SimpleDirectedWeightedGraph<?, ?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleDirectedWeightedGraphToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exception createExceptionFromString(EDataType eDataType, String initialValue) {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IConverter createIConverterFromString(EDataType eDataType, String initialValue) {
		return (IConverter)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIConverterToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonConvertersPackage getSymphony__CommonConvertersPackage() {
		return (Symphony__CommonConvertersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__CommonConvertersPackage getPackage() {
		return Symphony__CommonConvertersPackage.eINSTANCE;
	}

} //Symphony__CommonConvertersFactoryImpl
