/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.file.csv.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.file.csv.ApogyCommonFileCSVPackage;
import ca.gc.asc_csa.apogy.common.file.csv.CsvValueProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Csv Value Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CsvValueProviderImpl extends MinimalEObjectImpl.Container implements CsvValueProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CsvValueProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonFileCSVPackage.Literals.CSV_VALUE_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStringValue(Object obj) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonFileCSVPackage.CSV_VALUE_PROVIDER___GET_STRING_VALUE__OBJECT:
				return getStringValue(arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CsvValueProviderImpl
