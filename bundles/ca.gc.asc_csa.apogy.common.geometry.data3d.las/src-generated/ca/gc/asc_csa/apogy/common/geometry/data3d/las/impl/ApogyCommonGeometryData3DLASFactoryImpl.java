package ca.gc.asc_csa.apogy.common.geometry.data3d.las.impl;
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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.asc_csa.apogy.common.geometry.data3d.las.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonGeometryData3DLASFactoryImpl extends EFactoryImpl implements ApogyCommonGeometryData3DLASFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCommonGeometryData3DLASFactory init() {
		try {
			ApogyCommonGeometryData3DLASFactory theApogyCommonGeometryData3DLASFactory = (ApogyCommonGeometryData3DLASFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonGeometryData3DLASPackage.eNS_URI);
			if (theApogyCommonGeometryData3DLASFactory != null) {
				return theApogyCommonGeometryData3DLASFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonGeometryData3DLASFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonGeometryData3DLASFactoryImpl() {
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
			case ApogyCommonGeometryData3DLASPackage.LAS_HEADER: return createLASHeader();
			case ApogyCommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD: return createVariableLengthRecord();
			case ApogyCommonGeometryData3DLASPackage.LAS_READER: return createLASReader();
			case ApogyCommonGeometryData3DLASPackage.LAS_POINT: return createLASPoint();
			case ApogyCommonGeometryData3DLASPackage.APOGY_COMMON_GEOMETRY_DATA3_DLAS_FACADE: return createApogyCommonGeometryData3DLASFacade();
			case ApogyCommonGeometryData3DLASPackage.LAS_WRITER: return createLASWriter();
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
			case ApogyCommonGeometryData3DLASPackage.SCAN_DIRECTION:
				return createScanDirectionFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DLASPackage.EDGE_OF_FLIGHT_LINE:
				return createEdgeOfFlightLineFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DLASPackage.IPROGRESS_MONITOR:
				return createIProgressMonitorFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DLASPackage.CHAR_ARRAY:
				return createCharArrayFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DLASPackage.LONG_ARRAY:
				return createLongArrayFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DLASPackage.INPUT_STREAM:
				return createInputStreamFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DLASPackage.IO_EXCEPTION:
				return createIOExceptionFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DLASPackage.OUTPUT_STREAM:
				return createOutputStreamFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DLASPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
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
			case ApogyCommonGeometryData3DLASPackage.SCAN_DIRECTION:
				return convertScanDirectionToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DLASPackage.EDGE_OF_FLIGHT_LINE:
				return convertEdgeOfFlightLineToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DLASPackage.IPROGRESS_MONITOR:
				return convertIProgressMonitorToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DLASPackage.CHAR_ARRAY:
				return convertCharArrayToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DLASPackage.LONG_ARRAY:
				return convertLongArrayToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DLASPackage.INPUT_STREAM:
				return convertInputStreamToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DLASPackage.IO_EXCEPTION:
				return convertIOExceptionToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DLASPackage.OUTPUT_STREAM:
				return convertOutputStreamToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DLASPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LASHeader createLASHeader() {
		LASHeaderImpl lasHeader = new LASHeaderImpl();
		return lasHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableLengthRecord createVariableLengthRecord() {
		VariableLengthRecordImpl variableLengthRecord = new VariableLengthRecordImpl();
		return variableLengthRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LASReader createLASReader() {
		LASReaderImpl lasReader = new LASReaderImpl();
		return lasReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LASPoint createLASPoint() {
		LASPointImpl lasPoint = new LASPointImpl();
		return lasPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonGeometryData3DLASFacade createApogyCommonGeometryData3DLASFacade() {
		ApogyCommonGeometryData3DLASFacadeImpl apogyCommonGeometryData3DLASFacade = new ApogyCommonGeometryData3DLASFacadeImpl();
		return apogyCommonGeometryData3DLASFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LASWriter createLASWriter() {
		LASWriterImpl lasWriter = new LASWriterImpl();
		return lasWriter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScanDirection createScanDirectionFromString(EDataType eDataType, String initialValue) {
		ScanDirection result = ScanDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScanDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeOfFlightLine createEdgeOfFlightLineFromString(EDataType eDataType, String initialValue) {
		EdgeOfFlightLine result = EdgeOfFlightLine.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEdgeOfFlightLineToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProgressMonitor createIProgressMonitorFromString(EDataType eDataType, String initialValue) {
		return (IProgressMonitor)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIProgressMonitorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char[] createCharArrayFromString(EDataType eDataType, String initialValue) {
		return (char[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long[] createLongArrayFromString(EDataType eDataType, String initialValue) {
		return (long[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLongArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputStream createInputStreamFromString(EDataType eDataType, String initialValue) {
		return (InputStream)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputStreamToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOException createIOExceptionFromString(EDataType eDataType, String initialValue) {
		return (IOException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIOExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputStream createOutputStreamFromString(EDataType eDataType, String initialValue) {
		return (OutputStream)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutputStreamToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
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
	public ApogyCommonGeometryData3DLASPackage getApogyCommonGeometryData3DLASPackage() {
		return (ApogyCommonGeometryData3DLASPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCommonGeometryData3DLASPackage getPackage() {
		return ApogyCommonGeometryData3DLASPackage.eINSTANCE;
	}

} //ApogyCommonGeometryData3DLASFactoryImpl
