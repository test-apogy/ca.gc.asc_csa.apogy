/**
 * Canadian Space Agency 2007.
 *
 * $Id: CsvFactoryImpl.java,v 1.2.4.2 2015/05/21 15:49:55 pallard Exp $
 */
package ca.gc.space.mrt.common.csv.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.space.mrt.common.csv.CsvColumn;
import ca.gc.space.mrt.common.csv.CsvColumsSet;
import ca.gc.space.mrt.common.csv.CsvFactory;
import ca.gc.space.mrt.common.csv.CsvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CsvFactoryImpl extends EFactoryImpl implements CsvFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CsvFactory init() {
		try {
			CsvFactory theCsvFactory = (CsvFactory)EPackage.Registry.INSTANCE.getEFactory("http:///ca/gc/space/mrt/common/csv/model/csv.ecore"); 
			if (theCsvFactory != null) {
				return theCsvFactory;
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
			case CsvPackage.CSV_COLUMS_SET: return createCsvColumsSet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public CsvColumsSet createCsvColumsSet() {
		CsvColumsSetImpl csvColumsSet = new CsvColumsSetImpl();
		return csvColumsSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsvPackage getCsvPackage() {
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
