/**
 * Canadian Space Agency 2007.
 *
 * $Id: CsvPackage.java,v 1.3.4.2 2015/05/21 15:49:54 pallard Exp $
 */
package ca.gc.space.mrt.common.csv;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.common.csv.CsvFactory
 * @model kind="package"
 * @generated
 */
public interface CsvPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

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
	String eNS_URI = "http:///ca/gc/space/mrt/common/csv/model/csv.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ca.gc.space.mrt.common";

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
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_COLUMN_VALUES_MAP__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_COLUMN_VALUES_MAP__KEY = 1;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_COLUMN__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_COLUMN__NAME = 2;

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
	 * The meta object id for the '{@link ca.gc.space.mrt.common.csv.impl.CsvColumsSetImpl <em>Colums Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.common.csv.impl.CsvColumsSetImpl
	 * @see ca.gc.space.mrt.common.csv.impl.CsvPackageImpl#getCsvColumsSet()
	 * @generated
	 */
	int CSV_COLUMS_SET = 2;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_COLUMS_SET__COLUMNS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_COLUMS_SET__NAME = 1;

	/**
	 * The number of structural features of the '<em>Colums Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_COLUMS_SET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Colums Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_COLUMS_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.common.csv.CsvValueProvider <em>Value Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.common.csv.CsvValueProvider
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
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Column Values Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Values Map</em>'.
	 * @see java.util.Map.Entry
	 * @model features="value key" 
	 *        valueDataType="org.eclipse.emf.ecore.EJavaObject" valueRequired="true"
	 *        keyDataType="org.eclipse.emf.ecore.EInt" keyRequired="true"
	 * @generated
	 */
	EClass getCsvColumnValuesMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getCsvColumnValuesMap()
	 * @generated
	 */
	EAttribute getCsvColumnValuesMap_Value();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
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
	 * Returns the meta object for class '{@link ca.gc.space.mrt.common.csv.CsvColumsSet <em>Colums Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colums Set</em>'.
	 * @see ca.gc.space.mrt.common.csv.CsvColumsSet
	 * @generated
	 */
	EClass getCsvColumsSet();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.common.csv.CsvColumsSet#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see ca.gc.space.mrt.common.csv.CsvColumsSet#getColumns()
	 * @see #getCsvColumsSet()
	 * @generated
	 */
	EAttribute getCsvColumsSet_Columns();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.common.csv.CsvColumsSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.gc.space.mrt.common.csv.CsvColumsSet#getName()
	 * @see #getCsvColumsSet()
	 * @generated
	 */
	EAttribute getCsvColumsSet_Name();

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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_COLUMN__DESCRIPTION = eINSTANCE.getCsvColumn_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_COLUMN__NAME = eINSTANCE.getCsvColumn_Name();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.common.csv.impl.CsvColumsSetImpl <em>Colums Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.common.csv.impl.CsvColumsSetImpl
		 * @see ca.gc.space.mrt.common.csv.impl.CsvPackageImpl#getCsvColumsSet()
		 * @generated
		 */
		EClass CSV_COLUMS_SET = eINSTANCE.getCsvColumsSet();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_COLUMS_SET__COLUMNS = eINSTANCE.getCsvColumsSet_Columns();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_COLUMS_SET__NAME = eINSTANCE.getCsvColumsSet_Name();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.common.csv.CsvValueProvider <em>Value Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.common.csv.CsvValueProvider
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

	}

} //CsvPackage
