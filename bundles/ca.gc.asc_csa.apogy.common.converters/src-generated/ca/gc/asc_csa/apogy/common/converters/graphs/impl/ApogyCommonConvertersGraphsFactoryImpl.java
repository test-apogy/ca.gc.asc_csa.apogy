/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.converters.graphs.impl;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.common.converters.ChainedConverter;
import ca.gc.asc_csa.apogy.common.converters.graphs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonConvertersGraphsFactoryImpl extends EFactoryImpl implements ApogyCommonConvertersGraphsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCommonConvertersGraphsFactory init() {
		try {
			ApogyCommonConvertersGraphsFactory theApogyCommonConvertersGraphsFactory = (ApogyCommonConvertersGraphsFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonConvertersGraphsPackage.eNS_URI);
			if (theApogyCommonConvertersGraphsFactory != null) {
				return theApogyCommonConvertersGraphsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonConvertersGraphsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonConvertersGraphsFactoryImpl() {
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
			case ApogyCommonConvertersGraphsPackage.APOGY_COMMON_CONVERTERS_GRAPHS_FACADE: return createApogyCommonConvertersGraphsFacade();
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
			case ApogyCommonConvertersGraphsPackage.SORTED_SET:
				return createSortedSetFromString(eDataType, initialValue);
			case ApogyCommonConvertersGraphsPackage.SET:
				return createSetFromString(eDataType, initialValue);
			case ApogyCommonConvertersGraphsPackage.COMPARATOR:
				return createComparatorFromString(eDataType, initialValue);
			case ApogyCommonConvertersGraphsPackage.MAP:
				return createMapFromString(eDataType, initialValue);
			case ApogyCommonConvertersGraphsPackage.CONVERTER_EDGE:
				return createConverterEdgeFromString(eDataType, initialValue);
			case ApogyCommonConvertersGraphsPackage.CHAINED_CONVERTER:
				return createChainedConverterFromString(eDataType, initialValue);
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
			case ApogyCommonConvertersGraphsPackage.SORTED_SET:
				return convertSortedSetToString(eDataType, instanceValue);
			case ApogyCommonConvertersGraphsPackage.SET:
				return convertSetToString(eDataType, instanceValue);
			case ApogyCommonConvertersGraphsPackage.COMPARATOR:
				return convertComparatorToString(eDataType, instanceValue);
			case ApogyCommonConvertersGraphsPackage.MAP:
				return convertMapToString(eDataType, instanceValue);
			case ApogyCommonConvertersGraphsPackage.CONVERTER_EDGE:
				return convertConverterEdgeToString(eDataType, instanceValue);
			case ApogyCommonConvertersGraphsPackage.CHAINED_CONVERTER:
				return convertChainedConverterToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonConvertersGraphsFacade createApogyCommonConvertersGraphsFacade() {
		ApogyCommonConvertersGraphsFacadeImpl apogy__CommonConvertersGraphsFacade = new ApogyCommonConvertersGraphsFacadeImpl();
		return apogy__CommonConvertersGraphsFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortedSet<?> createSortedSetFromString(EDataType eDataType, String initialValue) {
		return (SortedSet<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortedSetToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<?> createSetFromString(EDataType eDataType, String initialValue) {
		return (Set<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSetToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparator<?> createComparatorFromString(EDataType eDataType, String initialValue) {
		return (Comparator<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparatorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<?, ?> createMapFromString(EDataType eDataType, String initialValue) {
		return (Map<?, ?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConverterEdge createConverterEdgeFromString(EDataType eDataType, String initialValue) {
		return (ConverterEdge)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConverterEdgeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainedConverter createChainedConverterFromString(EDataType eDataType, String initialValue) {
		return (ChainedConverter)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChainedConverterToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonConvertersGraphsPackage getApogyCommonConvertersGraphsPackage() {
		return (ApogyCommonConvertersGraphsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCommonConvertersGraphsPackage getPackage() {
		return ApogyCommonConvertersGraphsPackage.eINSTANCE;
	}

} //ApogyCommonConvertersGraphsFactoryImpl
