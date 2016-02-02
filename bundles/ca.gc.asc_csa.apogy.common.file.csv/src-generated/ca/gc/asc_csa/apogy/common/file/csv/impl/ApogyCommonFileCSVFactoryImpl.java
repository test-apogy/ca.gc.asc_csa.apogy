package ca.gc.asc_csa.apogy.common.file.csv.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.common.file.csv.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonFileCSVFactoryImpl extends EFactoryImpl implements ApogyCommonFileCSVFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCommonFileCSVFactory init() {
		try {
			ApogyCommonFileCSVFactory theMRTCsvFactory = (ApogyCommonFileCSVFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonFileCSVPackage.eNS_URI);
			if (theMRTCsvFactory != null) {
				return theMRTCsvFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonFileCSVFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonFileCSVFactoryImpl() {
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
			case ApogyCommonFileCSVPackage.CSV_COLUMN_VALUES_MAP: return (EObject)createCsvColumnValuesMap();
			case ApogyCommonFileCSVPackage.CSV_COLUMN: return createCsvColumn();
			case ApogyCommonFileCSVPackage.CSV_COLUMNS_SET: return createCsvColumnsSet();
			case ApogyCommonFileCSVPackage.CSV_VALUE_PROVIDER: return createCsvValueProvider();
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
			case ApogyCommonFileCSVPackage.CSV_COLUMN_MAP:
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
			case ApogyCommonFileCSVPackage.CSV_COLUMN_MAP:
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
	public ApogyCommonFileCSVPackage getMRTCsvPackage() {
		return (ApogyCommonFileCSVPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCommonFileCSVPackage getPackage() {
		return ApogyCommonFileCSVPackage.eINSTANCE;
	}

} //ApogyCommonFileCSVFactoryImpl
