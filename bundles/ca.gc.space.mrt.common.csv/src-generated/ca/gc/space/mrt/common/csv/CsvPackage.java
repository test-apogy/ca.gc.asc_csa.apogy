/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.space.mrt.common.csv;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see ca.gc.space.mrt.common.csv.CsvFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Csv' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)' modelName='Csv' suppressGenModelAnnotations='false' modelDirectory='/ca.gc.space.mrt.common.csv/src-generated' editDirectory='/ca.gc.space.mrt.common.csv.edit/src-generated' basePackage='ca.gc.space.mrt.common'"
 * @generated
 */
public interface CsvPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "csv";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.space.mrt.common.csv";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "csv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CsvPackage eINSTANCE = ca.gc.space.mrt.common.csv.impl.CsvPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.common.csv.impl.CsvColumnValuesMapImpl <em>Column Values Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.common.csv.impl.CsvColumnValuesMapImpl
	 * @see ca.gc.space.mrt.common.csv.impl.CsvPackageImpl#getCsvColumnValuesMap()
	 * @generated
	 */
	int CSV_COLUMN_VALUES_MAP = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_COLUMN_VALUES_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_COLUMN_VALUES_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Column Values Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_COLUMN_VALUES_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Column Values Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_COLUMN_VALUES_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.common.csv.impl.CsvColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.common.csv.impl.CsvColumnImpl
	 * @see ca.gc.space.mrt.common.csv.impl.CsvPackageImpl#getCsvColumn()
	 * @generated
	 */
	int CSV_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_COLUMN__VALUES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_COLUMN__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_COLUMN__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_COLUMN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.common.csv.impl.CsvColumnsSetImpl <em>Columns Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.common.csv.impl.CsvColumnsSetImpl
	 * @see ca.gc.space.mrt.common.csv.impl.CsvPackageImpl#getCsvColumnsSet()
	 * @generated
	 */
	int CSV_COLUMNS_SET = 2;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_COLUMNS_SET__COLUMNS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_COLUMNS_SET__NAME = 1;

	/**
	 * The number of structural features of the '<em>Columns Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_COLUMNS_SET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Columns Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_COLUMNS_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.common.csv.impl.CsvValueProviderImpl <em>Value Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.common.csv.impl.CsvValueProviderImpl
	 * @see ca.gc.space.mrt.common.csv.impl.CsvPackageImpl#getCsvValueProvider()
	 * @generated
	 */
	int CSV_VALUE_PROVIDER = 3;

	/**
	 * The number of structural features of the '<em>Value Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_VALUE_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get String Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_VALUE_PROVIDER___GET_STRING_VALUE__OBJECT = 0;

	/**
	 * The number of operations of the '<em>Value Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_VALUE_PROVIDER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '<em>Column Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see ca.gc.space.mrt.common.csv.impl.CsvPackageImpl#getCsvColumnMap()
	 * @generated
	 */
	int CSV_COLUMN_MAP = 4;


	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry<java.lang.Integer, java.lang.Object> <em>Column Values Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Values Map</em>'.
	 * @see java.util.Map.Entry<java.lang.Integer, java.lang.Object>
	 * @model keyUnique="false" keyDataType="org.eclipse.emf.ecore.EIntegerObject"
	 *        valueUnique="false" valueDataType="org.eclipse.emf.ecore.EJavaObject"
	 * @generated
	 */
	EClass getCsvColumnValuesMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry<java.lang.Integer, java.lang.Object> <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry<java.lang.Integer, java.lang.Object>
	 * @see #getCsvColumnValuesMap()
	 * @generated
	 */
	EAttribute getCsvColumnValuesMap_Value();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry<java.lang.Integer, java.lang.Object> <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry<java.lang.Integer, java.lang.Object>
	 * @see #getCsvColumnValuesMap()
	 * @generated
	 */
	EAttribute getCsvColumnValuesMap_Key();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.common.csv.CsvColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see ca.gc.space.mrt.common.csv.CsvColumn
	 * @generated
	 */
	EClass getCsvColumn();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.space.mrt.common.csv.CsvColumn#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Values</em>'.
	 * @see ca.gc.space.mrt.common.csv.CsvColumn#getValues()
	 * @see #getCsvColumn()
	 * @generated
	 */
	EReference getCsvColumn_Values();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.common.csv.CsvColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.gc.space.mrt.common.csv.CsvColumn#getName()
	 * @see #getCsvColumn()
	 * @generated
	 */
	EAttribute getCsvColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.common.csv.CsvColumn#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ca.gc.space.mrt.common.csv.CsvColumn#getDescription()
	 * @see #getCsvColumn()
	 * @generated
	 */
	EAttribute getCsvColumn_Description();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.common.csv.CsvColumnsSet <em>Columns Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Columns Set</em>'.
	 * @see ca.gc.space.mrt.common.csv.CsvColumnsSet
	 * @generated
	 */
	EClass getCsvColumnsSet();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.common.csv.CsvColumnsSet#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see ca.gc.space.mrt.common.csv.CsvColumnsSet#getColumns()
	 * @see #getCsvColumnsSet()
	 * @generated
	 */
	EAttribute getCsvColumnsSet_Columns();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.common.csv.CsvColumnsSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.gc.space.mrt.common.csv.CsvColumnsSet#getName()
	 * @see #getCsvColumnsSet()
	 * @generated
	 */
	EAttribute getCsvColumnsSet_Name();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.common.csv.CsvValueProvider <em>Value Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Provider</em>'.
	 * @see ca.gc.space.mrt.common.csv.CsvValueProvider
	 * @generated
	 */
	EClass getCsvValueProvider();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.common.csv.CsvValueProvider#getStringValue(java.lang.Object) <em>Get String Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get String Value</em>' operation.
	 * @see ca.gc.space.mrt.common.csv.CsvValueProvider#getStringValue(java.lang.Object)
	 * @generated
	 */
	EOperation getCsvValueProvider__GetStringValue__Object();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Column Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Column Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map<java.lang.String, ca.gc.space.mrt.common.csv.CsvColumn>"
	 * @generated
	 */
	EDataType getCsvColumnMap();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CsvFactory getCsvFactory();

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
		 * The meta object literal for the '{@link ca.gc.space.mrt.common.csv.impl.CsvColumnValuesMapImpl <em>Column Values Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.common.csv.impl.CsvColumnValuesMapImpl
		 * @see ca.gc.space.mrt.common.csv.impl.CsvPackageImpl#getCsvColumnValuesMap()
		 * @generated
		 */
		EClass CSV_COLUMN_VALUES_MAP = eINSTANCE.getCsvColumnValuesMap();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_COLUMN_VALUES_MAP__VALUE = eINSTANCE.getCsvColumnValuesMap_Value();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_COLUMN_VALUES_MAP__KEY = eINSTANCE.getCsvColumnValuesMap_Key();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.common.csv.impl.CsvColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.common.csv.impl.CsvColumnImpl
		 * @see ca.gc.space.mrt.common.csv.impl.CsvPackageImpl#getCsvColumn()
		 * @generated
		 */
		EClass CSV_COLUMN = eINSTANCE.getCsvColumn();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSV_COLUMN__VALUES = eINSTANCE.getCsvColumn_Values();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_COLUMN__NAME = eINSTANCE.getCsvColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_COLUMN__DESCRIPTION = eINSTANCE.getCsvColumn_Description();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.common.csv.impl.CsvColumnsSetImpl <em>Columns Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.common.csv.impl.CsvColumnsSetImpl
		 * @see ca.gc.space.mrt.common.csv.impl.CsvPackageImpl#getCsvColumnsSet()
		 * @generated
		 */
		EClass CSV_COLUMNS_SET = eINSTANCE.getCsvColumnsSet();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_COLUMNS_SET__COLUMNS = eINSTANCE.getCsvColumnsSet_Columns();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_COLUMNS_SET__NAME = eINSTANCE.getCsvColumnsSet_Name();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.common.csv.impl.CsvValueProviderImpl <em>Value Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.common.csv.impl.CsvValueProviderImpl
		 * @see ca.gc.space.mrt.common.csv.impl.CsvPackageImpl#getCsvValueProvider()
		 * @generated
		 */
		EClass CSV_VALUE_PROVIDER = eINSTANCE.getCsvValueProvider();

		/**
		 * The meta object literal for the '<em><b>Get String Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CSV_VALUE_PROVIDER___GET_STRING_VALUE__OBJECT = eINSTANCE.getCsvValueProvider__GetStringValue__Object();

		/**
		 * The meta object literal for the '<em>Column Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see ca.gc.space.mrt.common.csv.impl.CsvPackageImpl#getCsvColumnMap()
		 * @generated
		 */
		EDataType CSV_COLUMN_MAP = eINSTANCE.getCsvColumnMap();

	}

} //CsvPackage
