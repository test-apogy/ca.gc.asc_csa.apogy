/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.converters.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.common.converters.*;

import org.jgrapht.graph.SimpleDirectedWeightedGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonConvertersFactoryImpl extends EFactoryImpl implements ApogyCommonConvertersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCommonConvertersFactory init() {
		try {
			ApogyCommonConvertersFactory theApogyCommonConvertersFactory = (ApogyCommonConvertersFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonConvertersPackage.eNS_URI);
			if (theApogyCommonConvertersFactory != null) {
				return theApogyCommonConvertersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonConvertersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonConvertersFactoryImpl() {
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
			case ApogyCommonConvertersPackage.APOGY_COMMON_CONVERTERS_FACADE: return createApogyCommonConvertersFacade();
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
			case ApogyCommonConvertersPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case ApogyCommonConvertersPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH:
				return createSimpleDirectedWeightedGraphFromString(eDataType, initialValue);
			case ApogyCommonConvertersPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case ApogyCommonConvertersPackage.ICONVERTER:
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
			case ApogyCommonConvertersPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case ApogyCommonConvertersPackage.SIMPLE_DIRECTED_WEIGHTED_GRAPH:
				return convertSimpleDirectedWeightedGraphToString(eDataType, instanceValue);
			case ApogyCommonConvertersPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case ApogyCommonConvertersPackage.ICONVERTER:
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
	public ApogyCommonConvertersFacade createApogyCommonConvertersFacade() {
		ApogyCommonConvertersFacadeImpl apogy__CommonConvertersFacade = new ApogyCommonConvertersFacadeImpl();
		return apogy__CommonConvertersFacade;
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
	public ApogyCommonConvertersPackage getApogyCommonConvertersPackage() {
		return (ApogyCommonConvertersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCommonConvertersPackage getPackage() {
		return ApogyCommonConvertersPackage.eINSTANCE;
	}

} //ApogyCommonConvertersFactoryImpl
