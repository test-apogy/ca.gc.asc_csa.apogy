/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.converters.graphs.impl;

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
import org.eclipse.symphony.common.converters.ChainedConverter;
import org.eclipse.symphony.common.converters.graphs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonConvertersGraphsFactoryImpl extends EFactoryImpl implements Symphony__CommonConvertersGraphsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__CommonConvertersGraphsFactory init() {
		try {
			Symphony__CommonConvertersGraphsFactory theSymphony__CommonConvertersGraphsFactory = (Symphony__CommonConvertersGraphsFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CommonConvertersGraphsPackage.eNS_URI);
			if (theSymphony__CommonConvertersGraphsFactory != null) {
				return theSymphony__CommonConvertersGraphsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CommonConvertersGraphsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonConvertersGraphsFactoryImpl() {
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
			case Symphony__CommonConvertersGraphsPackage.SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE: return createSymphony__CommonConvertersGraphsFacade();
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
			case Symphony__CommonConvertersGraphsPackage.SORTED_SET:
				return createSortedSetFromString(eDataType, initialValue);
			case Symphony__CommonConvertersGraphsPackage.SET:
				return createSetFromString(eDataType, initialValue);
			case Symphony__CommonConvertersGraphsPackage.COMPARATOR:
				return createComparatorFromString(eDataType, initialValue);
			case Symphony__CommonConvertersGraphsPackage.MAP:
				return createMapFromString(eDataType, initialValue);
			case Symphony__CommonConvertersGraphsPackage.CONVERTER_EDGE:
				return createConverterEdgeFromString(eDataType, initialValue);
			case Symphony__CommonConvertersGraphsPackage.CHAINED_CONVERTER:
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
			case Symphony__CommonConvertersGraphsPackage.SORTED_SET:
				return convertSortedSetToString(eDataType, instanceValue);
			case Symphony__CommonConvertersGraphsPackage.SET:
				return convertSetToString(eDataType, instanceValue);
			case Symphony__CommonConvertersGraphsPackage.COMPARATOR:
				return convertComparatorToString(eDataType, instanceValue);
			case Symphony__CommonConvertersGraphsPackage.MAP:
				return convertMapToString(eDataType, instanceValue);
			case Symphony__CommonConvertersGraphsPackage.CONVERTER_EDGE:
				return convertConverterEdgeToString(eDataType, instanceValue);
			case Symphony__CommonConvertersGraphsPackage.CHAINED_CONVERTER:
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
	public Symphony__CommonConvertersGraphsFacade createSymphony__CommonConvertersGraphsFacade() {
		Symphony__CommonConvertersGraphsFacadeImpl symphony__CommonConvertersGraphsFacade = new Symphony__CommonConvertersGraphsFacadeImpl();
		return symphony__CommonConvertersGraphsFacade;
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
	public Symphony__CommonConvertersGraphsPackage getSymphony__CommonConvertersGraphsPackage() {
		return (Symphony__CommonConvertersGraphsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__CommonConvertersGraphsPackage getPackage() {
		return Symphony__CommonConvertersGraphsPackage.eINSTANCE;
	}

} //Symphony__CommonConvertersGraphsFactoryImpl
