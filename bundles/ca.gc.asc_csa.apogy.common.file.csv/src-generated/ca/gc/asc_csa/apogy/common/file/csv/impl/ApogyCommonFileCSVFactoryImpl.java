/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.file.csv.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.common.file.csv.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonFileCSVFactoryImpl extends EFactoryImpl implements Symphony__CommonFileCSVFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__CommonFileCSVFactory init() {
		try {
			Symphony__CommonFileCSVFactory theMRTCsvFactory = (Symphony__CommonFileCSVFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CommonFileCSVPackage.eNS_URI);
			if (theMRTCsvFactory != null) {
				return theMRTCsvFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CommonFileCSVFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonFileCSVFactoryImpl() {
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
			case Symphony__CommonFileCSVPackage.CSV_COLUMN_VALUES_MAP: return (EObject)createCsvColumnValuesMap();
			case Symphony__CommonFileCSVPackage.CSV_COLUMN: return createCsvColumn();
			case Symphony__CommonFileCSVPackage.CSV_COLUMNS_SET: return createCsvColumnsSet();
			case Symphony__CommonFileCSVPackage.CSV_VALUE_PROVIDER: return createCsvValueProvider();
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
			case Symphony__CommonFileCSVPackage.CSV_COLUMN_MAP:
				return createCsvColumnMapFromString(eDataType, initialValue);
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
			case Symphony__CommonFileCSVPackage.CSV_COLUMN_MAP:
				return convertCsvColumnMapToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Integer, Object> createCsvColumnValuesMap() {
		CsvColumnValuesMapImpl csvColumnValuesMap = new CsvColumnValuesMapImpl();
		return csvColumnValuesMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsvColumn createCsvColumn() {
		CsvColumnImpl csvColumn = new CsvColumnImpl();
		return csvColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsvColumnsSet createCsvColumnsSet() {
		CsvColumnsSetImpl csvColumnsSet = new CsvColumnsSetImpl();
		return csvColumnsSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsvValueProvider createCsvValueProvider() {
		CsvValueProviderImpl csvValueProvider = new CsvValueProviderImpl();
		return csvValueProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Map<String, CsvColumn> createCsvColumnMapFromString(EDataType eDataType, String initialValue) {
		return (Map<String, CsvColumn>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCsvColumnMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonFileCSVPackage getMRTCsvPackage() {
		return (Symphony__CommonFileCSVPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__CommonFileCSVPackage getPackage() {
		return Symphony__CommonFileCSVPackage.eINSTANCE;
	}

} //Symphony__CommonFileCSVFactoryImpl
