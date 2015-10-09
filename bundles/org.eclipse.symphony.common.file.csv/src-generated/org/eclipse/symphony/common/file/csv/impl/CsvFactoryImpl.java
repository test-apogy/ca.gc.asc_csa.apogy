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
public class CsvFactoryImpl extends EFactoryImpl implements CsvFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CsvFactory init() {
		try {
			CsvFactory theMRTCsvFactory = (CsvFactory)EPackage.Registry.INSTANCE.getEFactory(CsvPackage.eNS_URI);
			if (theMRTCsvFactory != null) {
				return theMRTCsvFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CsvFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsvFactoryImpl() {
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
			case CsvPackage.CSV_COLUMN_VALUES_MAP: return (EObject)createCsvColumnValuesMap();
			case CsvPackage.CSV_COLUMN: return createCsvColumn();
			case CsvPackage.CSV_COLUMNS_SET: return createCsvColumnsSet();
			case CsvPackage.CSV_VALUE_PROVIDER: return createCsvValueProvider();
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
			case CsvPackage.CSV_COLUMN_MAP:
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
			case CsvPackage.CSV_COLUMN_MAP:
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
	public CsvPackage getMRTCsvPackage() {
		return (CsvPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CsvPackage getPackage() {
		return CsvPackage.eINSTANCE;
	}

} //CsvFactoryImpl
